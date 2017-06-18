package com.github.alien11689.taskmanger.domain.process;

import com.github.alien11689.taskmanger.domain.ports.dto.task.TaskId;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CannotCompleteNotAssignedTask extends RuntimeException {
    private final TaskId taskId;
}
