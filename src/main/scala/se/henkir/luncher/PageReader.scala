package se.henkir.luncher

import java.net.URI
import scala.io.Codec

class PageReader {

  def read(url: String, enc: Codec = Codec.UTF8): String =
    io.Source.fromURL(url)(enc).mkString

}