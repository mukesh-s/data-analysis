package org.init

import org.apache.spark.sql.SparkSession
import org.init.Constants.{APP_NAME, LOCAL_ENVIRONMENT}

object SparkInit {

  def getSparkSession(isLcoalExecutionEnvironement: Boolean): SparkSession = {
    if (isLcoalExecutionEnvironement)
      SparkSession.builder().master(LOCAL_ENVIRONMENT).appName(APP_NAME).getOrCreate()
    SparkSession.builder().appName(APP_NAME).getOrCreate()
  }
}
