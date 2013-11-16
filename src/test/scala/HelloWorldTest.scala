import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class HelloWorldTest extends FunSuite {

  test("return World") {
    assert((new HelloWorld).returnWorld == "World")
  }
  
}
