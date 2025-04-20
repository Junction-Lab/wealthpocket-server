package dev.junction.lab.model.expenses

import java.time.ZonedDateTime

object ExpenseData:
  
  val all: List[ExpenseEntry] = List(
    ExpenseEntry(amount = 10.0, timestamp = ZonedDateTime.now().minusDays(1)),
    ExpenseEntry(amount = 225.95, timestamp = ZonedDateTime.now(), category = Some("Tech"))
  )

end ExpenseData

