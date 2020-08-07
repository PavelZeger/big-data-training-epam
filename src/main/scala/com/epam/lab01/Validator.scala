package com.epam.lab01

/**
 * @author Pavel Zeger
 */
object Validator {

  def validate(login: NewLogin): Unit = {
    login match {
      case NewLogin(username, _, _) if username == "admin" =>
        println(s"The username can't be 'admin'! Your username: $username")
      case NewLogin(_, password, _) if password.startsWith("z") =>
        println(s"The password cannot start with 'z'! Your password: $password")
      case NewLogin(username, password, _) if username.equals(password) =>
        println(s"The password cannot be equals to username! " +
          s"Your username is: $username. " +
          s"Your password is: $password")
      case NewLogin(_, password, _) if password.contains("[0-9]") =>
        println(s"The password cannot contain digits only! Your password is: $password")
      case NewLogin(_, password, confirmPassword) if !password.equals(confirmPassword) =>
        println("The password and the confirmed password must be equals!" +
          s"Your password is: $password. " +
          s"Your confirmed password is: $confirmPassword")
      case other =>
        println("Accepted")
    }
  }
}
