package com.example.jobtracker.controller;

import com.example.jobtracker.model.Job;
import com.example.jobtracker.service.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/jobs/active")
    public List<Job> getActiveJobs() {
        return jobService.getActiveJobs();
    }
}
