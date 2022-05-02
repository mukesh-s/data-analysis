package org.init

import org.apache.spark.sql.SparkSession
import org.init.Constants.{APP_NAME, LOCAL_ENVIRONMENT}

object SparkUtil {

  def getSparkSession(): SparkSession = {
    SparkSession.builder().appName(APP_NAME).getOrCreate();
  }

  def getLocalSparkSession(): SparkSession = {
    SparkSession.builder().master(LOCAL_ENVIRONMENT).appName(APP_NAME).getOrCreate();
  }

}
