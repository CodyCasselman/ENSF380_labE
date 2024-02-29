package edu.ucalgary.oop;

public interface IToDoList {
    public void addTask(Task task);
    public void deleteTask(Task task);
    public void completeTask(Task task);
    public void editTask(Task task);
    public void undo(Task task);
}
