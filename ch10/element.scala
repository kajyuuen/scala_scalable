import Element.elem

// 抽象クラス
abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)
  def beside(that: Element): Element =
    elem(
      for(
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  override def toString = content mkString "\n"
}

// extends: 非公開メンバー以外を継承
class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}

class LineElement(s: String) extends Elemen {
  val content = Array(s)
  override def width = s.length
  override def height = 1
}

class UniformElement(
  ch: Char,
  override val width: Int,
  override val height: Int
) extends Element{
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}
