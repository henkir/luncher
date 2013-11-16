package se.henkir.luncher

import scala.io.Codec
import java.net.URI

class PageReader {
  
  def read(url: String, enc: Codec = Codec.UTF8): String =
    io.Source.fromURL(url)(enc).mkString
  
}