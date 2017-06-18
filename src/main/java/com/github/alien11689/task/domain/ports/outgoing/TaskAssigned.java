package com.github.alien11689.task.domain.ports.outgoing;

import com.github.alien11689.task.domain.ports.dto.task.TaskId;
import com.github.alien11689.task.domain.ports.dto.user.UserId;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@Builder
public class TaskAssigned {
    TaskId taskId;
    UserId assignee;
    LocalDateTime assignedAt;
}
