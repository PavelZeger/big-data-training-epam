package com.epam.lab03

import Registry._
/**
 * @author Pavel Zeger
 */
object AppLab03 {

  def main(args: Array[String]): Unit = {
    val email: String = "gabberoid@gmail.com"
    val check: Boolean = email.isEmail
    println(check)

  }

}
