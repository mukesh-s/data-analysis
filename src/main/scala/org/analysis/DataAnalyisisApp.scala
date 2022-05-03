package org.analysis

import org.init.SparkUtil
import org.util.CarsUtil

/**
 * Hello world!
 *
 */
object DataAnalyisisApp extends App {
  println( "Hello World!" )
  execute()

  def execute()={
    val dataLocation = "src/main/resources/data/Cheapestelectriccars-EVDatabase.csv"
    val carsDataFrame = SparkUtil.getLocalSparkSession().read.option("header", "true").csv(dataLocation)

    CarsUtil.getFastestCars(carsDataFrame)
    CarsUtil.getMostExpensiveCarsInUK(carsDataFrame)

  }

}
