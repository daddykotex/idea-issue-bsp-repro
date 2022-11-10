import mill._, mill.scalalib._

object `java-service` extends JavaModule {
  override def ivyDeps = Agg(
    ivy"software.amazon.smithy:smithy-model:1.26.2"
  )
}

object `scala-service` extends ScalaModule {
  def scalaVersion = "2.13.9"
  override def ivyDeps = Agg(
    ivy"software.amazon.smithy:smithy-model:1.26.2"
  )
}
