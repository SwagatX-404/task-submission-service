package com.swg.task_submission_service.service;

import com.swg.task_submission_service.model.Submission;
import com.swg.task_submission_service.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SubmissionServiceImpl implements SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;


    @Override
    public Submission submitTask(Long taskId, String githubLink, Long userId) throws Exception {
        return null;
    }

    @Override
    public Submission getTaskSubmissionById(Long submissionId) throws Exception {
        return null;
    }

    @Override
    public List<Submission> getAllTaskSubmissions() {
        return List.of();
    }

    @Override
    public List<Submission> getTaskSubmissionByTaskId(Long taskId) {
        return List.of();
    }

    @Override
    public Submission acceptDeclineSubmission(Long id, String status) throws Exception {
        return null;
    }
}
