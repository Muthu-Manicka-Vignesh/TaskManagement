package com.myprogramming.SpringApp.Manager;

import com.myprogramming.SpringApp.Model.Task;
import com.myprogramming.SpringApp.Records.Records;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskManagement {
    @Autowired
    private Records records;

    @PostMapping("saveTask")
    public Task addTask(@RequestBody Task task){
        return records.save(task);
    }

    @GetMapping("allTasks")
    public List<Task> getAllTasks(){
        return records.findAll();
    }

    @GetMapping("getTask/{id}")
    public Optional<Task> getTaskById(@PathVariable int id){
        return records.findById(id);
    }

    @GetMapping("deleteTask/{id}")
    public String deleteTaskById(@PathVariable int id){
        String result;
        try{
            records.deleteById(id);
            result="deletec"
        }catch (Exception e){
            result="error"
        }
        return result
    }
}
