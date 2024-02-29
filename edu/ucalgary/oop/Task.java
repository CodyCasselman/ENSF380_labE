package edu.ucalgary.oop;

import java.util.Objects;

public class Task {
     
    // class attributes 
    private String id;
    private String title;
    private boolean isCompleted;

    // parametrized constructor
    public Task (String id, String title, boolean isCompleted ){
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }
  // setters and getters 
  public String getId () {
    return id;
    }
  public void setId (String id){
    this.id = id;
    }
  public String getTitle () {
    return title;
    }
  public void setTitle (String title){
    this.title = title;
    }
  public boolean getIsCompleted () {
    return isCompleted;
    }
  public void setIsCompleted (boolean isCompleted) {
    this.isCompleted = isCompleted;
    }

    // defualt constructor
    public Task ()
    {

    }

    //copy method - deep copying task objects
    // deep copy ensures independence between original object and new object
    public Task copy () {
        Task copiedTask = new Task (this.id, this.title, this.isCompleted); // this keyword refers to current object instance
        return copiedTask; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(id, task.id) &&
               Objects.equals(title, task.title) &&
               isCompleted == task.isCompleted; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isCompleted);
    }
}
