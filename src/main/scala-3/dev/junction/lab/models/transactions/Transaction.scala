package dev.junction.lab.models.transactions

import java.util.UUID
import java.time.LocalDate

case class Transaction(id: UUID,
                       userId: UUID,
                       amount: BigDecimal,
                       transactionType: TransactionType,
                       date: LocalDate,
                       categoryId: Option[UUID] = None)
