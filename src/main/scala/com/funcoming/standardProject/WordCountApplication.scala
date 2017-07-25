package com.funcoming.standardProject

import java.util.Properties

object WordCountApplication {
  def main(args: Array[String]): Unit = {
    val config: Properties = {
      val p = new Properties()
      //      p.put(StreamsConfig.APPLICATION_ID_CONFIG, "wordcount-application")
      //      p.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka-broker1:9092")
      //      p.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass)
      //      p.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass)
      p
    }


    val value = new KafkaStreams()
  }

}
