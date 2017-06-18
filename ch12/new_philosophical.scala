class Animal
class Frog extends Animal with Philosophical{
  override def toString = "green"
  override def philosophical() = {
    println("It ain't easy being " + toString + "!")
  }
}
