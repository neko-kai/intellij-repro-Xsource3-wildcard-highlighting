import distage.DIKey
import izumi.distage.testkit.TestConfig.PriorAxisDIKeys

object App extends App {
  val x = PriorAxisDIKeys.fromSet(Set.empty[DIKey])
  println(x)
}
