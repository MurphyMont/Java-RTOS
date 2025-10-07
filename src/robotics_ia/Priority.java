package robotics_ia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.Timer;

public class Priority {
    // Static nested class representing a process
    static class Process {
        private String name;
        private int runtime;
        private int priority;
        private LocalTime startTime;

        // Constructor
        public Process(String name, int runtime, int priority) {
            this.name = name;
            this.runtime = runtime;
            this.priority = priority;
            this.startTime = LocalTime.now();
        }

        // Getter for process name
        public String getName() {
            return name;
        }

        // Getter for runtime
        public int getRuntime() {
            return runtime;
        }

        // Getter for priority
        public int getPriority() {
            return priority;
        }

        // Getter for start time
        public LocalTime getStartTime() {
            return startTime;
        }

        // Method to check if the process is completed or elapsed over 30 seconds
        public boolean isCompletedOrElapsed() {
            Duration duration = Duration.between(startTime, LocalTime.now());
            long seconds = duration.getSeconds();
            return seconds >= runtime || seconds > 30;
        }
    }

    // Method to create Process objects from ArrayLists and add them to a new List<Process>
    public static List<Process> createProcesses(List<String> processNameList, List<String> runtimeList, List<String> priorityList) {
        List<Process> processes = new ArrayList<>();

        // Iterate through the ArrayLists and create Process objects
        for (int i = 0; i < processNameList.size(); i++) {
            String name = processNameList.get(i);
            int runtime = Integer.parseInt(runtimeList.get(i)); // Convert String to int
            int priority = Integer.parseInt(priorityList.get(i)); // Convert String to int

            // Create a new Process object and add it to the list
            Process process = new Process(name, runtime, priority);
            processes.add(process);
        }

        return processes;
    }

    // Method to schedule processes based on priority and display them on a JTable
    public static void scheduleProcesses(List<Process> processes, JTable activeTable, JTable historyTable, JButton removeTaskButton) {
        // Sorting processes by priority (ascending order)
        Collections.sort(processes, (p1, p2) -> p1.getPriority() - p2.getPriority());

        DefaultTableModel activeModel = (DefaultTableModel) activeTable.getModel();
        DefaultTableModel historyModel = (DefaultTableModel) historyTable.getModel();

        // Add processes to the active table and start a timer for each process
        for (Process process : processes) {
            Object[] row = {process.getName(), process.getRuntime(), process.getPriority(), "00:00:00"};
            activeModel.addRow(row);

            // Start a timer for this process
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Find the index of this process in the list
                    int index = processes.indexOf(process);
                    // Update the fourth column with the elapsed time since the start of the process
                    Duration duration = Duration.between(process.getStartTime(), LocalTime.now());
                    long seconds = duration.getSeconds();
                    String elapsedTime = String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, (seconds % 60));
                    activeModel.setValueAt(elapsedTime, index, 3);

                    // Check if the process is completed or elapsed over 30 seconds
                    if (process.isCompletedOrElapsed()) {
                        // Add the process to the history table
                        Object[] historyRow = {
                            process.getName(),
                            process.getRuntime(),
                            process.getPriority(),
                            seconds >= process.getRuntime() ? "Completed" : "Terminated For Elapsing Over 30s",
                            LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
                        };
                        historyModel.addRow(historyRow);
                        
                        // Remove the process from the active table
                        activeModel.removeRow(index);
                        processes.remove(process);
                        // Stop the timer if the process is completed or elapsed over 30 seconds
                        ((Timer) e.getSource()).stop();
                    }
                }
            });
            timer.start();
        }

        // Add ActionListener to RemoveTaskButton
removeTaskButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the selected row index
        int selectedRow = activeTable.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
            // Get the process details from the selected row
            String name = (String) activeModel.getValueAt(selectedRow, 0);
            int runtime = (int) activeModel.getValueAt(selectedRow, 1);
            int priority = (int) activeModel.getValueAt(selectedRow, 2);

            // Find the process to remove from the processes list
            Process processToRemove = null;
            for (Process process : processes) {
                if (process.getName().equals(name) && process.getRuntime() == runtime && process.getPriority() == priority) {
                    processToRemove = process;
                    break;
                }
            }

            if (processToRemove != null) {
                // Remove the process from the active table
                activeModel.removeRow(selectedRow);
                // Remove the process from the processes list
                processes.remove(processToRemove);
                
                // Add the process to the history table with action "Terminated by User"
                Object[] historyRow = {name, runtime, priority, "Terminated by User", LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))};
                historyModel.addRow(historyRow);
            }
        }
    }
});

    }
}
