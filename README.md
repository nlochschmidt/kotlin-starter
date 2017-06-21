[![Build Status](https://travis-ci.org/jooby-project/kotlin-starter.svg?branch=master)](https://travis-ci.org/jooby-project/kotlin-starter)
# kotlin

Starter kit for [Kotlin](http://kotlinlang.org/).

## quick preview

This project contains a simple `Hello World` application.

[App.kt](https://github.com/jooby-project/kotlin-starter/blob/master/src/main/kotlin/starter/kotlin/App.kt):

```kotlin
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

```

## run

    ./gradlew joobyRun

## help

* Read the [module documentation](http://jooby.org/doc/lang-kotlin)
* Join the [channel](https://gitter.im/jooby-project/jooby)
* Join the [group](https://groups.google.com/forum/#!forum/jooby-project)
