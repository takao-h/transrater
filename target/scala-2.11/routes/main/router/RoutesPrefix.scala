
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ruth/Dev/transrater/conf/routes
// @DATE:Sat Jun 23 22:08:11 JST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
