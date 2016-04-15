/**
 * 
 */
package com.naren.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.naren.tasklet.TaskAction;

/**
 * @author nstanwar
 *
 */
public class JobAction extends QuartzJobBean {
	private TaskAction runMeTask;
	/**
	 * 
	 */
	public JobAction() {
	}

	public void setRunMeTask(TaskAction runMeTask){
		this.runMeTask=runMeTask;
	}
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		runMeTask.callMe();
	}

}
