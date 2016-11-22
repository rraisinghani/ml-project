package org.trade.ml

/**
  * Created by raviraisinghani on 11/20/16.
  */
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
object WordCount {
  def main(args: Array[String]){
    val sparkConf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("Test Spark")
      .set("spark.executor.memory","2g")

    val sc = new SparkContext(sparkConf)

    println("sc >>" + sc);


  }
}




