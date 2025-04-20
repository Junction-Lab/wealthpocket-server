package dev.junction.lab.model.expenses

import java.time.ZonedDateTime

case class ExpenseEntry(amount: BigDecimal, timestamp: ZonedDateTime, category: Option[String] = None)
