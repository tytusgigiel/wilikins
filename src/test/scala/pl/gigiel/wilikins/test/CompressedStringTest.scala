package pl.gigiel.wilikins.test

import org.github.jamm.MemoryMeter
import org.scalatest.FunSuite

import pl.gigiel.wilikins.CompressedString

class CompressedStringTest extends FunSuite {
  test("equals") {
    val before = "Zażółć gęślą jaźń."
    val cs = CompressedString(before)
    assert(before.equals(cs.string))
  }

  test("compressed") {
    val meter = new MemoryMeter()

    val before = "Wystarczajaco dlugi napis, by stwierdzic zysk na kompresji." * 20
    val cs = CompressedString(before)
    println(meter.measureDeep(before))
    println(meter.measureDeep(cs))
    assert(meter.measureDeep(before) > meter.measureDeep(cs))
  }
}
