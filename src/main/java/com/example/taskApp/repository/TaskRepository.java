package com.example.taskApp.repository;

import com.example.taskApp.model.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface TaskRepository {
    @Insert("INSERT INTO tasks(name, description, start_date) VALUES (#{name}, #{description}, #{startDate})")
    void insertTask(Task task);

    @Select("SELECT id, name, description, start_date AS startDate FROM tasks")
    List<Task> findAllTasks();
}
