package dev.junction.lab

import com.typesafe.config.ConfigFactory
import dev.junction.lab.controllers.ExpenseController
import jakarta.servlet.*
import org.scalatra.*

class WealthPocketBootstrap extends LifeCycle:

  override def init(context: ServletContext): Unit =
    val config = ConfigFactory.load()
    val port = config.getString("server.port")

    context.setInitParameter(ScalatraBase.PortKey, port)
    context.mount(new ExpenseController, "/expenses/*")
  end init

end WealthPocketBootstrap

