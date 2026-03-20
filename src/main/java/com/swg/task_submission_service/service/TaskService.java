package com.swg.task_submission_service.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "SUBMISSION-SERVICE", url = "http://localhost:5003/")
public interface TaskService {
}
