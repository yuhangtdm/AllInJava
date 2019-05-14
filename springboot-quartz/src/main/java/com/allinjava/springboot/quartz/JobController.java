package com.allinjava.springboot.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    @Autowired
    private JobUtil jobUtil;    
    /*@Autowired
    private AppQuartzService appQuartzService;*/
    
    
    //添加一个job
    @RequestMapping(value="/addJob",method= RequestMethod.POST)
    public String addjob(@RequestBody AppQuartz appQuartz) throws Exception {
//        appQuartzService.insertAppQuartzSer(appQuartz);
        return jobUtil.addJob(appQuartz);
    }
    
    //暂停job    
    @RequestMapping(value="/pauseJob",method=RequestMethod.POST)
    public String pausejob(@RequestBody Integer[]quartzIds) throws Exception {
        AppQuartz appQuartz=null;            
        if(quartzIds.length>0){
            for(Integer quartzId:quartzIds) {
//                appQuartz=appQuartzService.selectAppQuartzByIdSer(quartzId).get(0);
                jobUtil.pauseJob(appQuartz.getJobName(), appQuartz.getJobGroup());                        
            }
            return "success pauseJob";
        }else {
            return "fail pauseJob";
        }                                                                
    }
    
    //恢复job
    @RequestMapping(value="/resumeJob",method=RequestMethod.POST)
    public String resumejob(@RequestBody Integer[]quartzIds) throws Exception {
        AppQuartz appQuartz=null;
        if(quartzIds.length>0) {
            for(Integer quartzId:quartzIds) {
//                appQuartz=appQuartzService.selectAppQuartzByIdSer(quartzId).get(0);
                jobUtil.resumeJob(appQuartz.getJobName(), appQuartz.getJobGroup());                
            }
            return "success resumeJob";
        }else {
            return "fail resumeJob";
        }
    } 
        
    
    //删除job
    @RequestMapping(value="/deletJob",method=RequestMethod.POST)
    public String deletjob(@RequestBody  AppQuartz appQuartz) throws Exception {
        /*AppQuartz appQuartz=null;
        for(Integer quartzId:quartzIds) {
//            appQuartz=appQuartzService.selectAppQuartzByIdSer(quartzId).get(0);
            String ret=jobUtil.deleteJob(appQuartz);
            if("success".equals(ret)) {
//                appQuartzService.deleteAppQuartzByIdSer(quartzId);
            }
        }*/
        jobUtil.deleteJob(appQuartz);
        return "success deleteJob";
    }
        
    //修改
    @RequestMapping(value="/updateJob",method=RequestMethod.POST)
    public String  modifyJob(@RequestBody AppQuartz appQuartz) throws Exception {
        String ret= jobUtil.modifyJob(appQuartz);            
        if("success".equals(ret)) {            
//            appQuartzService.updateAppQuartzSer(appQuartz);
            return"success updateJob";
        }else {
            return "fail updateJob";
        }                
    }
    
    //暂停所有
    @RequestMapping(value="/pauseAll",method=RequestMethod.GET)
    public String pauseAllJob() throws Exception {
        jobUtil.pauseAllJob();
        return "success pauseAll";
    }
    
    //恢复所有
    @RequestMapping(value="/repauseAll",method=RequestMethod.GET)
    public String repauseAllJob() throws Exception {
        jobUtil.resumeAllJob();
        return "success repauseAll";
    }    
    
}