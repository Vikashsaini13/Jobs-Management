package com.example.JobsManager.repository;

import com.example.JobsManager.model.Jobs;
import com.example.JobsManager.model.Type;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface IJobsRepo extends CrudRepository<Jobs,Long> {
    List<Jobs> getJobsByJobType(Type type);

    List<Jobs> getJobsByJobTypeAndLocation(Type type, String location);


    @Query(value = "select * from jobs where  salary= :salary ", nativeQuery = true)
    List<Jobs> getJobsBySalary(Double salary);
}
