package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite


class SquareTest extends AnyFunSuite {

  val result = new Square
  val list = List(5,4,9,6)

  test("elements get squared") {
   assert(result.squareList(list)==List(25,16,81,36))
  }

  test("its get failed") {
    assert(result.squareList(list) == List(24, 16, 88, 36))
  }

  test("elements get squared by map"){
    assert(result.squareListMap(list)==List(25,16,81,36))
  }
}
