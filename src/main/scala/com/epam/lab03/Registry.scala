package com.epam.lab03

/**
 * @author Pavel Zeger
 */
object Registry {

  implicit class Extension(string: String) {
    def isEmail: Boolean = string.contains("@")
  }

}
