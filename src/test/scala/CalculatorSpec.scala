import org.scalatest._

class CalculatorSpec extends WordSpec with Matchers {
  "Calculator" should {
    "add numbers" in {
      Calculator.add(1, 2) shouldBe 3
    }
  }
}