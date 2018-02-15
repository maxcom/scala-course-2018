import org.specs2.mutable.Specification

class SorterTest extends Specification {
  "sort function" should {
    "preserve vector length" in {
      val vector = Vector(5, 10, 343, 43, 1)

      Sorter.sort(vector) must have size vector.length
    }
  }
}
