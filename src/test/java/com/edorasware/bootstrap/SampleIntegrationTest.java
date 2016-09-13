package com.edorasware.bootstrap;

import com.edorasware.cloud.core.AbstractBaseTest;
import com.edorasware.gear.core.task.Task;
import com.edorasware.gear.core.task.TaskId;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Sample integration test which uses an in memory H2 database and the same application context as edoras one is using for its tests.
 */
public class SampleIntegrationTest extends AbstractBaseTest {

    @Test
    public void addCase() {
        final String taskName = "taskName";
        TaskId taskId = this.taskService.addTask(Task.builder().name(taskName).build(), "Add a task");
        Task task = this.taskService.findTaskById(taskId);
        assertEquals("The task name must be equal", taskName, task.getName());
    }

}
