package dev.junction.lab.http

import org.scalatra._
import dev.junction.lab.model.expenses.{ExpenseEntry, ExpenseData}

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

  get("/expenses") {
    ExpenseData.all
  }

end ExpenseController
