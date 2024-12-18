package com.nystromweb.model;

import java.util.List;
import java.util.UUID;

public record Level(UUID id, String name, List<Task> tasks) {
    public record Task(UUID id, String name, String description, Integer points) {
    }
}
