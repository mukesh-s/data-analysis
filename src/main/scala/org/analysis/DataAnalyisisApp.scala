package org.analysis

import org.apache.spark.sql.DataFrame
import org.init.SparkInit
import org.util.CarsUtil

/**
 * Hello world!
 *
 */
object DataAnalyisisApp extends App {
  execute()

  def execute() = {
    val carsDataFrame: DataFrame = buildCarsDataFrame
    CarsUtil.getFastestCars(carsDataFrame)
    CarsUtil.getMostExpensiveCarsInUK(carsDataFrame)
  }

  def buildCarsDataFrame = {
    val dataLocation = "src/main/resources/data/Cheapestelectriccars-EVDatabase.csv"
    val carsDataFrame = SparkInit.getSparkSession(true).read.option("header", "true").csv(dataLocation)
    carsDataFrame
  }

}
