package com.example.JobsManager.service;

import com.example.JobsManager.model.Jobs;
import com.example.JobsManager.model.Type;
import com.example.JobsManager.repository.IJobsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobsService {

    @Autowired
    IJobsRepo iJobsRepo;

    public String addJob(Jobs jobs) {
        iJobsRepo.save(jobs);
        return "added";
    }

    public Iterable<Jobs> getAllJobs() {
        return iJobsRepo.findAll();
    }

    public Jobs getJobsById(Long id) {
        Optional<Jobs> job =iJobsRepo.findById(id);
        return job.get();
    }

    public String deleteJobById(Long id) {
        iJobsRepo.deleteById(id);
        return "deleted";
    }

    public List<Jobs> getJobsByJobType(Type type) {
        return iJobsRepo.getJobsByJobType(type);
    }

    public List<Jobs> getJobsByJobTypeAndLocation(Type type, String location) {
        return iJobsRepo.getJobsByJobTypeAndLocation(type,location);
    }

    public List<Jobs> getJobsBySalary(Double salary) {
        return iJobsRepo.getJobsBySalary(salary);
    }
}
