package dev.junction.lab

import com.typesafe.config.ConfigFactory
import dev.junction.lab.controllers.TransactionController
import jakarta.servlet.*
import org.scalatra.*

class WealthPocketBootstrap extends LifeCycle:

  override def init(context: ServletContext): Unit =
    val config = ConfigFactory.load()
    val port = config.getString("server.port")

    context.setInitParameter(ScalatraBase.PortKey, port)
    context.mount(new TransactionController, "/transactions/*")
  end init

end WealthPocketBootstrap

