package app

import org.scalatra._
import javax.servlet.http.HttpServletRequest
import collection.mutable

trait $controller_name$ extends ScalatraServlet {

  get("/") {
    _root_.html.index("Hello world!");
  }

}
