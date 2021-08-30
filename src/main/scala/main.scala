object App extends App {
  def x[A: <:<[_, Int]](a: A): (Option[_])[Int] = Some(a)
  println(x(5: 5))
}
