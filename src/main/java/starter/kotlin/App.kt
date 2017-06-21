package starter.kotlin

import org.jooby.*

/**
 * Hello World
 */
fun main(args: Array<String>) {
  run(*args) {
    get {
      val name = param("name").value("Kotlin")
      "Hello $name!"
    }
  }
}
