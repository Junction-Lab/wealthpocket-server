package dev.junction.lab
package config

import java.time.Duration

final case class AppConfiguration(version: String,
                                  environment: String,
                                  fullName: String)

final case class ServerConfiguration(host: String,
                                     port: Int,
                                     timeout: Duration,
                                     sslEnabled: Boolean)

final case class DatabaseConfiguration(`type`: String,
                                       host: String,
                                       port: Int,
                                       dbName: String,
                                       poolSize: Int,
                                       user: String,
                                       password: String,
                                       connectionTimeout: Duration)

final case class LoggingConfiguration(level: String,
                                      file: FileLoggingConfiguration,
                                      console: ConsoleLoggingConfiguration)

final case class FileLoggingConfiguration(enabled: Boolean,
                                          path: String,
                                          maxSize: Int,
                                          maxHistory: Int)

private final case class ConsoleLoggingConfiguration(enabled: Boolean)
