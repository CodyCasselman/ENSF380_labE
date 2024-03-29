package edu.ucalgary.oop;

import java.util.*;

public class ToDoList implements IToDoList{
    private List<Task> tasks = new ArrayList<Task>();
    private Stack<List<Task>> history = new Stack<List<Task>>();

    private void pushHistory()
    {
        List<Task> temp = new ArrayList<Task>();
        for (Task task : tasks) {
            temp.add(task.copy());
        }
        history.push(temp);
    }

    @Override
    public void editTask(String taskId, String title, boolean isCompleted) {
        pushHistory();
        for (Task task : tasks) {
            if(task.getId().equals(taskId))
            {
                task.setId(taskId);
                task.setTitle(title);
                task.setIsCompleted(isCompleted);
            }
        }

    }

    @Override
    public void addTask(Task task){
        pushHistory();
        this.tasks.add(task);
    }

    @Override
    public void completeTask(String index){
        pushHistory();
        for (Task task : tasks){
            if (index.equals(task.getId())){
                task.setIsCompleted(true);
            }
        }
    }

    @Override
    public void deleteTask(String id){
        pushHistory();
        for(int i = 0; i < tasks.size(); i++)
        {
            if(tasks.get(i).getId().equals(id))
            {
                tasks.remove(i);
            }
        }
    }

    @Override
    public List<Task> listTasks() {
        return tasks;
    }

    @Override
    public void undo()
    {
        tasks = history.pop();
    }

}
