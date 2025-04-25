package dev.junction.lab.models.users

import java.util.UUID


case class User(id: UUID, name: String, username: String, hashedPassword: String)
