package org.analysis

import org.junit.Test

class DataAnalyisisAppTest {

  @Test
  def buildCarsDataFrame(): Unit = {
    val dataFrame = DataAnalyisisApp.buildCarsDataFrame
    val firstRow = dataFrame.first().getString(0)
    assert(null != firstRow)
  }

}
