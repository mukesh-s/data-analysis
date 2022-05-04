package org.util

import org.analysis.DataAnalyisisApp
import org.apache.spark.sql.DataFrame
import org.junit.Assert.assertEquals
import org.junit.Test

class CarsUtilTest {

  def fixture: Object {val carsDataFrame: DataFrame} =
    new {
      val carsDataFrame: DataFrame = DataAnalyisisApp.buildCarsDataFrame
    }

  @Test
  def mostExpensiveCar(): Unit = {
    val expensiveCar = "Mercedes EQS 450+"
    val fix = fixture
    val firstCar = CarsUtil.getMostExpensiveCarsInUK(fix.carsDataFrame).first()
    assertEquals(expensiveCar, firstCar.getString(0))
  }

  @Test
  def fastestCar(): Unit = {
    val expensiveCar = "Tesla Roadster"
    val fix = fixture
    val firstCar = CarsUtil.getFastestCars(fix.carsDataFrame).first()
    assertEquals(expensiveCar, firstCar.getString(0).trim)
  }

}
