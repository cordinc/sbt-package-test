package com.cordinc

import com.jarrahtechnology.logic.*

object HelloWorld {
  def main(args: Array[String]) = {
    println("Hello, World! "+HornClause.fact(Atom("f")).isFact)
  }
}