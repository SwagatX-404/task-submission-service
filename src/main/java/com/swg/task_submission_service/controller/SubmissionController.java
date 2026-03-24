package com.swg.task_submission_service.controller;


import com.swg.task_submission_service.model.Submission;
import com.swg.task_submission_service.model.UserDto;
import com.swg.task_submission_service.service.SubmissionService;
import com.swg.task_submission_service.service.TaskService;
import com.swg.task_submission_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @Autowired
    private UserService userService;

    @Autowired
    private TaskService taskService;

    @PostMapping()
    public ResponseEntity<Submission> submitTask(

            @RequestParam Long taskId,
            @RequestParam String github_link,
            @RequestHeader ("Authorization") String jwt
    ) throws  Exception{
        UserDto user = userService.getUserProfile(jwt);
        Submission submission = submissionService.submitTask(taskId, github_link, user.getId(), jwt);
        return new ResponseEntity<>(submission, HttpStatus.CREATED);
    }

    @GetMapping( "/{id}")
    public ResponseEntity<Submission> getSubmissionById (
            @PathVariable Long id,
             @RequestHeader ("Authorization") String jwt

    ) throws  Exception{
        UserDto user = userService.getUserProfile(jwt);
        Submission submission = submissionService.getTaskSubmissionById(id);
        return new ResponseEntity<>(submission, HttpStatus.CREATED);
    }

    @GetMapping( "/{id}")
    public ResponseEntity<List<Submission>> getAllSubmissions (

            @RequestHeader ("Authorization") String jwt

    ) throws  Exception{
        UserDto user = userService.getUserProfile(jwt);
        List<Submission> submission = submissionService.getAllTaskSubmissions();
        return new ResponseEntity<>(submission, HttpStatus.CREATED);
    }

    @GetMapping( "/task/{taskId}")
    public ResponseEntity<List<Submission>> getAllSubmissions (
            @RequestHeader Long taskId,
            @RequestHeader ("Authorization") String jwt

    ) throws  Exception{
        UserDto user = userService.getUserProfile(jwt);
        List<Submission> submission = submissionService.getTaskSubmissionsByTaskId(taskId);
        return new ResponseEntity<>(submission, HttpStatus.CREATED);
    }


}
