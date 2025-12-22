package org.example;

import java.util.ArrayList;
public class JobService {


    ArrayList<Job> jobs = new ArrayList<>();
    public void addJob(Job job){
        jobs.add(job);
    }

    public ArrayList<Job> getAllJobs(){
        return jobs;
    }

    public ArrayList<Job> getActiveJobs() {
        ArrayList<Job> activeJobs = new ArrayList<>();
        for (Job job : jobs) {
            if (!job.status.equals("Rejected")) {
                activeJobs.add(job);
            }
        }
        return activeJobs;
    }


}