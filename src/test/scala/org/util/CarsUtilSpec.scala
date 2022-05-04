package org.util

import org.analysis.DataAnalyisisApp
import org.apache.spark.sql.DataFrame
import org.scalatest.flatspec.AnyFlatSpec

class CarsUtilSpec extends AnyFlatSpec {

  behavior of "Cars Utility"

  def fixture: Object {val carsDataFrame: DataFrame} =
    new {
      val carsDataFrame: DataFrame = DataAnalyisisApp.buildCarsDataFrame
    }


  it should "fetch most expensive cars" in {
    val fix = fixture
    val expensiveCar = "Mercedes EQS 450+"
    val firstCar = CarsUtil.getMostExpensiveCarsInUK(fix.carsDataFrame).first()
    assert(expensiveCar === firstCar.getString(0))
  }

}
