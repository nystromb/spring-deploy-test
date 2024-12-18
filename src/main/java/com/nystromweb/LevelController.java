package com.nystromweb;

import com.nystromweb.model.Level;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class LevelController {

    @RequestMapping("/levels")
    List<Level> levels() {
        return List.of(
                new Level(UUID.randomUUID(), "White", List.of(
                        new Level.Task(UUID.randomUUID(), "Push to git using the CLI 5 times", "",1),
                        new Level.Task(UUID.randomUUID(), "Fix a merge conflict",  "",2),
                        new Level.Task(UUID.randomUUID(), "Read a book",  "",1)
                )),
                new Level(UUID.randomUUID(), "Yellow", List.of(
                        new Level.Task(UUID.randomUUID(), "Build a tic tac toe app using the command line", "",3),
                        new Level.Task(UUID.randomUUID(), "Do a code kata in under 5 minutes",  "",2),
                        new Level.Task(UUID.randomUUID(), "Write a blog",  "",1)
                )),
                new Level(UUID.randomUUID(), "Orange", List.of(
                        new Level.Task(UUID.randomUUID(), "Build a tic tac toe web app", "",5),
                        new Level.Task(UUID.randomUUID(), "Perform a code kata in 5 minutes",  "",2),
                        new Level.Task(UUID.randomUUID(), "Write 2 blogs",  "",1)
                )),
                new Level(UUID.randomUUID(), "Green", List.of(
                        new Level.Task(UUID.randomUUID(), "Build and Deploy a tic tac toe web app in a new language", "",5),
                        new Level.Task(UUID.randomUUID(), "Implement metrics and service monitor",  "",2),
                        new Level.Task(UUID.randomUUID(), "Write 3 blog posts",  "",1)
                )),
                new Level(UUID.randomUUID(), "Purple", List.of(
                        new Level.Task(UUID.randomUUID(), "Build your own HTTP server", "",4),
                        new Level.Task(UUID.randomUUID(), "Build an automated CI/CD pipeline",  "",2),
                        new Level.Task(UUID.randomUUID(), "Complete 1 code kata and 3 blogs",  "",1)
                )),
                new Level(UUID.randomUUID(), "Blue", List.of(
                        new Level.Task(UUID.randomUUID(), "Work on a successful client project for 4 weeks", "",5)
                ))
        );
    }
}
