package se.henkir.luncher

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec

@RunWith(classOf[JUnitRunner])
class PageReaderTest extends FlatSpec {

  it should "read something" in {
    val pr = new PageReader
    assert(pr.read("file:build.gradle").length > 0)
  }
  
}