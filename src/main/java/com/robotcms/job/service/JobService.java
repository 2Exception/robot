package com.robotcms.job.service;

import org.quartz.SchedulerException;

import com.robotcms.common.base.CoreService;
import com.robotcms.job.domain.TaskDO;


/**
 * <pre>
 * 定时任务
 * </pre>
 *
 */
public interface JobService extends CoreService<TaskDO> {
	
	void initSchedule() throws SchedulerException;

	void changeStatus(Long jobId, String cmd) throws SchedulerException;

	void updateCron(Long jobId) throws SchedulerException;
}
