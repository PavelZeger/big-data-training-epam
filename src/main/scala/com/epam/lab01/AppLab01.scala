package com.epam.lab01

/**
 * @author Pavel Zeger
 */
object AppLab01 {

  def main(args : Array[String]) {

    val login1 = NewLogin("admin", "password", "password")
    val login2 = NewLogin("username", "zpassword", "zpassword")
    val login3 = NewLogin("username", "username", "username")
    val login4 = NewLogin("username", "1234567890", "1234567890")
    val login5 = NewLogin("username", "password11", "password12")
    val login6 = NewLogin("username", "password11", "password11")

    val logins = List(login1, login2, login3, login4, login5, login6)

    for (login:NewLogin <- logins) {
      Validator.validate(login)
    }

  }

}
