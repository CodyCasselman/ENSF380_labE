package edu.ucalgary.oop;

import java.util.List;
import java.util.Stack;
import java.util.*;

public class ToDoList implements IToDoList{
    private List<Task> tasks = new ArrayList<Task>();
    private Stack<List<Task>> history;

    @Override
    public void editTask(Task task) {
        
    }
}
