package com.tomaoto

import com.tomaoto.http.Protocol.Account

import spray.httpx.SprayJsonSupport.sprayJsonUnmarshaller
import spray.routing.Directive.pimpApply
import spray.routing.HttpServiceActor

class HttpServer extends HttpServiceActor {
  def receive = runRoute {
    path("account") {
      post {
        entity(as[Account]) { account =>
          ctx =>
            
        }
      }
    }
  }
}
