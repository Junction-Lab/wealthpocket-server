package dev.junction.lab.models.expenses

import java.time.ZonedDateTime

case class ExpenseEntry(amount: BigDecimal, timestamp: ZonedDateTime, category: Option[String] = None)
