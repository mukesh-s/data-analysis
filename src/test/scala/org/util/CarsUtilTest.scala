package org.util

import org.init.SparkUtil
import org.junit.Test
import org.junit.Assert.assertEquals

class CarsUtilTest {

  @Test
  def emptyCars(): Unit = {
    val expensiveCar = "Mercedes EQS 450+"
    val dataLocation = "src/main/resources/data/Cheapestelectriccars-EVDatabase.csv"
    val carsDataFrame = SparkUtil.getLocalSparkSession().read.option("header", "true").csv(dataLocation)
    val firstCar = CarsUtil.getMostExpensiveCarsInUK(carsDataFrame).first()
    assertEquals(expensiveCar, firstCar.getString(0))
  }

}
