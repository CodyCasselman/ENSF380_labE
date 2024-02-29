package edu.ucalgary.oop;

import java.util.*;

public interface IToDoList {
    public void addTask(Task task);
    public void deleteTask(String id);
    public void completeTask(String id);
    public void editTask(String taskId, String title, boolean isCompleted);
    public void undo();
    public List<Task> listTasks();
}
