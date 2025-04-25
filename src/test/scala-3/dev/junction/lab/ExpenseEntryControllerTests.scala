package dev.junction.lab

import dev.junction.lab.controllers.TransactionController
import org.scalatra.test.scalatest.*

class ExpenseEntryControllerTests extends ScalatraFunSuite:

  addServlet(classOf[TransactionController], "/expenses")

  test("GET / on WealthPocket should return status 200") {
    get("/") {
      status should equal (200)
    }
  }
  
end ExpenseEntryControllerTests
