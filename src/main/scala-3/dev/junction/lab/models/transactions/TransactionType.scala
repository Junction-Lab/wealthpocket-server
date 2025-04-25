package dev.junction.lab.models.transactions

enum TransactionType(val typeId: Int):
  case Income extends TransactionType(1)
  case Expense extends TransactionType(2)
end TransactionType

object TransactionType:
  def apply(typeId: Int): Option[TransactionType] = typeId match
    case 1 => Some(Income)
    case 2 => Some(Expense)
    case _ => None
end TransactionType
