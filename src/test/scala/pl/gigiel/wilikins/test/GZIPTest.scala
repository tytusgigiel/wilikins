package pl.gigiel.wilikins.test

import org.scalatest.FunSuite

import pl.gigiel.wilikins.StringUtils
import scala.io.Source
import pl.gigiel.wilikins.GZIP

class GZIPTest extends FunSuite {
  test("zip string") {
    val before = "Wystarczajaco dlugi napis, by stwierdzic zysk na kompresji." * 2
    val zipped = GZIP.zip(before)
    assert(before.size > zipped.size)
  }

  test("unzip string") {
    val before = "ala ma kota"
    val zipped = GZIP.zip(before)
    val unzipped = GZIP.unzip(zipped)
    assert(before.equals(unzipped))
  }

  test("zip bytes") {
    val before = Array.fill[Byte](100)(1)
    val zipped = GZIP.zip(before)
    assert(before.size > zipped.size)
  }

  test("unzip bytes") {
    val before = Array.fill[Byte](10)(1)
    val zipped = GZIP.zip(before)
    val unzipped = GZIP.unzip(zipped)
    assert(before.sameElements(unzipped))
  }
}
