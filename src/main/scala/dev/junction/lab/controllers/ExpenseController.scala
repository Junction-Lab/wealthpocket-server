package dev.junction.lab.controllers

import com.typesafe.config.ConfigFactory
import org.scalatra.*
import dev.junction.lab.models.expenses.{ExpenseData, ExpenseEntry}

// JSON-related libraries
import org.json4s.{DefaultFormats, Formats}

// JSON handling support from Scalatra
import org.scalatra.json._

class ExpenseController extends ScalatraServlet with JacksonJsonSupport:

  // Sets up automatic case class to JSON output serialization, required by
  // the JValueResult trait.
  protected implicit lazy val jsonFormats: Formats = DefaultFormats.withBigDecimal

  before() {
    contentType = formats("json")
  }
  
  get("/") {
    ExpenseData.all
  }

end ExpenseController
