package pl.gigiel.wilikins

import scala.io.Source

object StringUtils {
  val unixNewLine = "\r\n"

  def replaceIllegalCharactersInFilename(text: String): String = {
    text.replaceAll("[^a-zA-Z0-9.-]", "_")
  }

  def getWordsLowerCase(content: Source): List[String] = {
    content.getLines().map(_.split("[^a-zA-Z-]")).flatten.filterNot(_.isEmpty).map(_.toLowerCase).toSet.toList
  }

  def getWordsLowerCase(content: String): List[String] = {
    content.split("[^a-zA-Z-]").filterNot(_.isEmpty).map(_.toLowerCase).toSet.toList
  }

  def getLinesLowerCase(content: String): List[String] = {
    content.split("\n").filterNot(_.isEmpty).map(_.replaceAll("\r", "")).map(_.toLowerCase).toSet.toList
  }
}
