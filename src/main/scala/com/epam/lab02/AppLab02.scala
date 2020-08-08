package com.epam.lab02



/**
 * @author Pavel Zeger
 */
object AppLab02 {

  def main(args: Array[String]): Unit = {

    val words: List[String] = List(
      "word",
      "world",
      "world",
      "word",
      "word",
      "word",
      "app",
      "app",
      "main",
      "scala",
      "java",
      "java"
    )

    val reducedWords = words.sorted.groupBy(word => word).mapValues(_.length)
    println(reducedWords)
  }

}
