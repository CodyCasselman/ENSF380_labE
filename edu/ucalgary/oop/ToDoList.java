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
    public void editTask(String taskId, String title, Boolean isCompleted) {
        for (Task task : tasks) {
            if(task.getId() == taskId)
            {
                task.setId(taskId);
                task.setTitle(title);
                task.setCompleted(isCompleted);
            }
        }

        pushHistory();
    }

    @Override
    public void addTask(Task task){
        this.tasks.add(task);
        pushHistory();
    }

    @Override
    public void completeTask(String id){

    }

    @Override
    public void deleteTask(String id){
        for(Task task : tasks){
            if(task.getId().equals(id)) {
                tasks.remove(task);
            }
        }
        pushHistory();
    }

    @Override
    public List<Task> listTasks() {
        return tasks;
    }

}
