package com.example.JobsManager.controller;

import com.example.JobsManager.model.Jobs;
import com.example.JobsManager.model.Type;
import com.example.JobsManager.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobsController {

    @Autowired
    JobsService jobsService;

    //add single job
    @PostMapping("job")
    public String addJob(@RequestBody Jobs jobs){
        return jobsService.addJob(jobs);
    }

    //Get all jobs
    @GetMapping("jobs")
    public Iterable<Jobs> getAllJobs(){
        return jobsService.getAllJobs();
    }

    //get jobs by id
    @GetMapping("job/{id}")
    public Jobs getJobsById(@PathVariable Long id){
        return jobsService.getJobsById(id);
    }

    // delete job by id
    @DeleteMapping("job/{id}")
    public String deleteJobById(@PathVariable Long id){
        return jobsService.deleteJobById(id);
    }

    //get all jobs by jobs type : using Custom finders
    @GetMapping ("jobs/type/{type}")
    public List<Jobs> getJobsByJobType(@PathVariable Type type){
        return jobsService.getJobsByJobType(type);
    }

    //get all jobs in a particular location and a particular job : custom finders
    @GetMapping("jobs/type/{type}/location/{location}")
    public List<Jobs> getJobsByJobTypeAndLocation(@PathVariable Type type, @PathVariable String location){
        return jobsService.getJobsByJobTypeAndLocation(type,location);
    }

    //get all job in a particular salary : by custom query
    @GetMapping("jobs/{salary}")
    public List<Jobs> getJobsBySalary(@PathVariable Double salary){
        return jobsService.getJobsBySalary(salary);
    }



}
