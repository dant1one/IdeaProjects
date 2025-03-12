import java.util.*;

class Task implements Comparable<Task> {
    private String taskName;
    private int priority;
    private int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public String getTaskName() {
        return taskName;
    }
    public int getPriority() {
        return priority;
    }
    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Task o) {
        int priorityComparison = Integer.compare(o.priority, this.priority);
        if (priorityComparison == 0) {
            return Integer.compare(this.duration, o.duration);
        }
        return priorityComparison;
    }

    @Override
    public String toString() {
        return "Task{name='" + taskName + "', priority=" + priority + ", duration=" + duration + "}";
    }
}

public class TaskManager {
    private PriorityQueue<Task> taskQueue;
    private Queue<Task> pendingQueue;

    public TaskManager() {
        this.taskQueue = new PriorityQueue<>();
        this.pendingQueue = new LinkedList<>();
    }

    public void addTask(String name, int priority, int duration) {
        Task task = new Task(name, priority, duration);
        taskQueue.add(task);
        System.out.println(task + " Task successfully added.");
    }

    public void processNextTask() {
        if (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing task: " + task);
        } else {
            System.out.println("No tasks in process.");
        }
    }

    public void moveTaskToPending() {
        if (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            pendingQueue.add(task);
            System.out.println(task + "Task successfully moved to pending.");
        } else {
            System.out.println("No tasks to move to pending.");
        }
    }

    public void processPendingTask() {
        if (taskQueue.isEmpty() && !pendingQueue.isEmpty()) {
            Task task = pendingQueue.poll();
            System.out.println("Processing pending task: " + task);
        } else {
            System.out.println("No pending tasks to process or high-priority tasks are still available.");
        }
    }

    public void displayTasks() {
        if (taskQueue.isEmpty() && pendingQueue.isEmpty()) {
            System.out.println("No scheduled or pending tasks.");
            return;
        }
        System.out.println("\nScheduled Tasks:");
        for (Task task : taskQueue) {
            System.out.println(task);
        }

        System.out.println("\nPending Tasks:");
        for (Task task : pendingQueue) {
            System.out.println(task);
        }
    }
}

class Main {
    public static void main(String[] args) {
        TaskManager schedule = new TaskManager();
        schedule.addTask("1", 4, 60);
        schedule.addTask("2", 3, 30);
        schedule.addTask("3", 2, 15);
        schedule.addTask("4", 1, 5);
        schedule.displayTasks();
        schedule.processNextTask();
        schedule.processNextTask();
        schedule.moveTaskToPending();
        schedule.processPendingTask();
        schedule.displayTasks();
    }
}
