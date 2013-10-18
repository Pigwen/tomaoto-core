package com.tomaoto.http

import spray.json.DefaultJsonProtocol

object Protocol {
  case class Account(uid: String, email: String, pwd: String)

  //----------------------------------------------
  // JSON
  //----------------------------------------------
  object Account extends DefaultJsonProtocol {
    implicit val format = jsonFormat3(Account.apply)
  }
}