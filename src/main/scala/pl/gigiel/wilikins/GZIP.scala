package pl.gigiel.wilikins

import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream

import resource.managed
import org.apache.commons.io.IOUtils
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.util.Base64

object GZIP {
  def zip(string: String): String = {
    val bytes = zip(string.getBytes(StandardCharsets.UTF_8))
    Base64.getEncoder.encodeToString(bytes)
  }

  def unzip(string: String): String = {
    val bytes = Base64.getDecoder.decode(string)
    new String(unzip(bytes), StandardCharsets.UTF_8)
  }

  def zip(bytes: Array[Byte]): Array[Byte] = {
    val os = new ByteArrayOutputStream
    for (gos <- managed(new GZIPOutputStream(os))) {
      gos.write(bytes)
    }
    os.toByteArray
  }

  def unzip(bytes: Array[Byte]): Array[Byte] = {
    val is = managed(new GZIPInputStream(new ByteArrayInputStream(bytes)))
    is.map(IOUtils.toByteArray).opt.get
  }
}
