package dev.junction.lab.controllers

import java.util.UUID
import org.scalatra.*

// JSON-related libraries
import org.json4s.{DefaultFormats, Formats}

// JSON handling support from Scalatra
import org.scalatra.json.*
import java.math.MathContext
import java.time.LocalDate
import dev.junction.lab.models.transactions.Transaction
import dev.junction.lab.models.transactions.TransactionType

class TransactionController extends ScalatraServlet with JacksonJsonSupport:

  // Sets up automatic case class to JSON output serialization, required by
  // the JValueResult trait.
  protected implicit lazy val jsonFormats: Formats = DefaultFormats.withBigDecimal

  before() {
    contentType = formats("json")
  }
  
  get("/") {
    Seq(
      Transaction(
        id=UUID.randomUUID(),
        userId=UUID.randomUUID(), 
        amount=BigDecimal("2102.50"), 
        date=LocalDate.now(), 
        transactionType=TransactionType.Income
      ),
      Transaction(
        id=UUID.randomUUID(),
        userId=UUID.randomUUID(), 
        amount=BigDecimal("17.83"), 
        date=LocalDate.now(), 
        transactionType=TransactionType.Expense
      )
    )
  }

end TransactionController
