package org.init

import org.scalatest.flatspec.AnyFlatSpec

class SparkInitSpec extends AnyFlatSpec {

  behavior of "Spark Initialization"

  it should "create a spark session for local environment" in {
    val session = SparkInit.getSparkSession(true)
    assert(session != null)
  }

}
