object App extends App {
  def x[A: <:<[_, Int]](a: A): Int = a
  println(x(5: 5))
}
