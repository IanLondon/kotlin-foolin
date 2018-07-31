package com.github.IanLondon.demo

import java.io.File
import java.io.BufferedReader

fun main (args: Array<String>) {
    val envVar = System.getenv("TEST_VAR")
    println("""
        |Heyyy your args are "${args.joinToString(separator = ", ")}"
        |And your TEST_VAR is "$envVar"
        |
    """.trimMargin())

    val fileToRead = System.getenv("TEST_FILE")
    if (fileToRead != null) {
        val relativePath = File(System.getProperty("user.dir"))
        val file = relativePath.resolve(fileToRead)
        println("Reading file from path $file\n\n*****\n")

        file.useLines { println(it.joinToString("\n")) }

    } else {
        println("TEST_FILE not specified!")
    }

}