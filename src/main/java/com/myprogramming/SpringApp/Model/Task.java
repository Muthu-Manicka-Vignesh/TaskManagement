package com.myprogramming.SpringApp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
    @Id
    private int taskId;
    private String taskHolderName;
    private Date date;
    private String taskName;
    private String taskStatus;

    public Task(int taskId, String taskHolderName, Date date, String taskName, String taskStatus) {
        this.taskId = taskId;
        this.taskHolderName = taskHolderName;
        this.date = date;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public Task() {
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskHolderName() {
        return taskHolderName;
    }

    public void setTaskHolderName(String taskHolderName) {
        this.taskHolderName = taskHolderName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
