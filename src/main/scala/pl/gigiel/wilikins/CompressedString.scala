package pl.gigiel.wilikins

class CompressedString private (s: String) {
  val zipped: String = GZIP.zip(s)
  def string = GZIP.unzip(zipped)
}

object CompressedString {
  def apply(string: String): CompressedString = { new CompressedString(string) }
}
