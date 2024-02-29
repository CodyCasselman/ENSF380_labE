package edu.ucalgary.oop;

import java.util.List;
import java.util.Stack;
import java.util.*;

public class ToDoList implements IToDoList{
    private List<Task> tasks = new ArrayList<Task>();
    private Stack<List<Task>> history;

    public void pushHistory()
    {
        history.push(tasks);
    }

    public void popHistory()
    {
        history.pop();
    }

    @Override
    public void editTask(String taskId, String taskName, Boolean isCompleted) {
        
    }
    @Override
    public void addTask(Task task){

    }

    @Override
    public void completeTask(Task task){

    }
    public void deleteTask(Task task){

    }

}
