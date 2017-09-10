package pl.gigiel.wilikins.test

import org.scalatest.FunSuite

import pl.gigiel.wilikins.StringUtils
import scala.io.Source

class StringUtilsTest extends FunSuite {
  test("replaceIllegalCharactersInFilename no changes") {
    assert("abc" == StringUtils.replaceIllegalCharactersInFilename("abc"))
    assert("abc-01" == StringUtils.replaceIllegalCharactersInFilename("abc-01"))
    assert("abc.01" == StringUtils.replaceIllegalCharactersInFilename("abc.01"))
    assert("abc_01" == StringUtils.replaceIllegalCharactersInFilename("abc_01"))
  }

  test("replaceIllegalCharactersInFilename changed") {
    assert("abc_01" == StringUtils.replaceIllegalCharactersInFilename("abc 01"))
    assert("abc_01" == StringUtils.replaceIllegalCharactersInFilename("abc,01"))
    assert("abc_01" == StringUtils.replaceIllegalCharactersInFilename("abc'01"))
  }

  test("getWordsLowerCase by Source") {
    val content = Source.fromResource("""text-01.txt""")
    val words = StringUtils.getWordsLowerCase(content).sorted.toArray;
    val words_ok = Array(
      "are",
      "at",
      "conversations",
      "day",
      "dill",
      "gone",
      "have",
      "lean",
      "market",
      "may",
      "me",
      "mill",
      "mr",
      "on",
      "really",
      "stall",
      "such",
      "the",
      "through",
      "vegetable",
      "way",
      "you")

    assert(words_ok.sameElements(words))
  }

  test("getWordsLowerCase by String") {
    val content = Source.fromResource("""text-01.txt""").mkString
    val words = StringUtils.getWordsLowerCase(content).sorted.toArray;
    val words_ok = Array(
      "are",
      "at",
      "conversations",
      "day",
      "dill",
      "gone",
      "have",
      "lean",
      "market",
      "may",
      "me",
      "mill",
      "mr",
      "on",
      "really",
      "stall",
      "such",
      "the",
      "through",
      "vegetable",
      "way",
      "you")

    assert(words_ok.sameElements(words))
  }

  test("getLinesLowerCase") {
    val content = Source.fromResource("""text-02.txt""").mkString
    assert(content.toLowerCase == StringUtils.getLinesLowerCase(content).mkString(StringUtils.unixNewLine))
  }
}
