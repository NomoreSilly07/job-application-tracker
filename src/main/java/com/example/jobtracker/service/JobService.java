package com.example.jobtracker.service;

import com.example.jobtracker.model.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    private List<Job> jobs = new ArrayList<>();

    public JobService() {
        Job j1 = new Job();
        j1.company = "Google";
        j1.position = "Backend Developer";
        j1.status = "Applied";

        Job j2 = new Job();
        j2.company = "Amazon";
        j2.position = "Java Developer";
        j2.status = "Rejected";

        jobs.add(j1);
        jobs.add(j2);
    }

    public List<Job> getAllJobs() {
        return jobs;
    }

    public List<Job> getActiveJobs() {
        List<Job> activeJobs = new ArrayList<>();

        for (Job job : jobs) {
            if (!job.status.equals("Rejected")) {
                activeJobs.add(job);
            }
        }
        return activeJobs;
    }
}
