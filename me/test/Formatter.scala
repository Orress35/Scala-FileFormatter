package me.test

import java.io.{BufferedReader, FileReader, FileWriter, PrintWriter}

class Scala {
  var prefix = ""
  var suffix = ""

  def format(x: String, prefix: String, suffix: String): String = {
    val result = prefix + x + suffix
    result
  }

  def main(file: String, prefix: String, suffix: String, start: String, end: String, mode: String): Unit = {
    if (mode.equals("char")) {
      val result = new StringBuilder
      val reader = new BufferedReader(new FileReader(file))
      var next = reader.read()
      result.append(start).append("\n")
      while (next != -1) {
        if (next > 45) {
          val char = next.asInstanceOf[Char]
          println(format(char.toString, prefix, suffix))
          result.append(format(char.toString, prefix, suffix))
        } else {
          val char = next.asInstanceOf[Char]
          result.append(char.toString)
        }
        next = reader.read()
      }
      result.append("\n").append(end)
      reader.close()
      val writer = new PrintWriter(new FileWriter(file))
      writer.print(result.toString())
      writer.close()
    } else {
      val result = new StringBuilder
      val reader = new BufferedReader(new FileReader(file))
      var line = reader.readLine()
      result.append(start).append("\n")
      while (line != null) {
        println(line)
        result.append(format(line, prefix, suffix)).append("\n")
        line = reader.readLine()
      }
      result.append("\n").append(end)
      reader.close()
      val writer = new PrintWriter(new FileWriter(file))
      writer.print(result.toString())
      writer.close()
    }
  }
}
