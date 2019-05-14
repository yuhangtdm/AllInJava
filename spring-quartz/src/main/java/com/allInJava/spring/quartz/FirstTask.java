package com.allInJava.spring.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstTask extends QuartzJobBean {
 
    private FirstService firstService;
 
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        firstService.service();
    }
 
    public void setFirstService(FirstService firstService) {
        this.firstService = firstService;
    }
}