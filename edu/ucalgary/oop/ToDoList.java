package edu.ucalgary.oop;

import java.util.*;

public class ToDoList implements IToDoList{
    private List<Task> tasks = new ArrayList<Task>();
    private Stack<List<Task>> history;

    private void pushHistory()
    {
        history.push(tasks);
    }

    private void popHistory()
    {
        history.pop();
    }

    @Override
    public void editTask(String taskId, String title, boolean isCompleted) {
        for (Task task : tasks) {
            if(task.getId().equals(taskId))
            {
                task.setId(taskId);
                task.setTitle(title);
                task.setIsCompleted(isCompleted);
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
    public void completeTask(String index){
        for (Task task : tasks){
            if (index.equals(task.getId())){
                task.setIsCompleted(true);
            }
        }
        pushHistory();
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

    @Override
    public void undo()
    {
        popHistory();
        tasks = history.peek();
    }

}
