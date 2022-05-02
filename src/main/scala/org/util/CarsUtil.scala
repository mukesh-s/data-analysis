package org.util

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col

object CarsUtil {

  def getMostExpensiveCarsInUK(dataFrame: DataFrame): DataFrame = {
    val sortedByPriceinUK = dataFrame.sort(col("PriceinUK").desc).select("Name")
    sortedByPriceinUK.show(5,false)
    sortedByPriceinUK
  }

  def getFastestCars(dataFrame: DataFrame): DataFrame = {
    val sortedBySpeed = dataFrame.sort(col("TopSpeed").desc).select("Name")
    sortedBySpeed.show(5,false)
    sortedBySpeed
  }

}
