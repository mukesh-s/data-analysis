package common

import org.init.SparkInitSpec
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.util.CarsUtilSpec

@RunWith(classOf[Suite])
@Suite.SuiteClasses(Array(
  classOf[CarsUtilSpec],
  classOf[SparkInitSpec]
))
class DataAnalysisTestSuite {}
