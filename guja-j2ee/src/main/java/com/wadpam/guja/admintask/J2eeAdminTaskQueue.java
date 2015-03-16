package com.wadpam.guja.admintask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * GAE implementation of admin task queue based on task queues.
 *
 * @author sopheakboth83
 */
public class J2eeAdminTaskQueue implements AdminTaskQueue {
  private static final Logger LOGGER = LoggerFactory.getLogger(J2eeAdminTaskQueue.class);

  public static final String PATH_ADMIN_TASK = "/_adm/task/%s";


  @Override
  public void enqueueTask(String taskName, Map<String, String[]> paramMap) {
      throw new IllegalStateException("Not implemented for J2EE");
  }

}
