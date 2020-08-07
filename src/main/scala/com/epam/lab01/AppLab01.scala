package com.epam.lab01

/**
 * @author Pavel Zeger
 */
object AppLab01 {

  def main(args : Array[String]) {

    val logins = List(
      NewLogin("admin", "password", "password"),
      NewLogin("username", "zpassword", "zpassword"),
      NewLogin("username", "username", "username"),
      NewLogin("username", "1234567890", "1234567890"),
      NewLogin("username", "password11", "password12"),
      NewLogin("username", "password11", "password11"))

    for (login:NewLogin <- logins) {
      Validator.validate(login)
    }

  }

}
