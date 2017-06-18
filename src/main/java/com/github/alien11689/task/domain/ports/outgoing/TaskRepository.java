package com.github.alien11689.task.domain.ports.outgoing;

import com.github.alien11689.task.domain.ports.dto.task.Task;
import com.github.alien11689.task.domain.ports.dto.task.TaskId;
import com.github.alien11689.task.domain.ports.dto.task.TaskStatus;
import com.github.alien11689.task.domain.ports.dto.user.UserId;

import java.time.LocalDateTime;

public interface TaskRepository {
    void save(Task task);
    Task getTask(TaskId taskId);
    void changeAssignee(TaskId taskId, UserId userId);
    void changeStatus(TaskId taskId, TaskStatus taskStatus, LocalDateTime when);
}
