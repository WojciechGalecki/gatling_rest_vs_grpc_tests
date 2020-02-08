import java.util.concurrent.TimeUnit

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

import scala.concurrent.duration.FiniteDuration

class RestSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://localhost:3000")

  val bodyPath: String = "bodies/movie.json"

  val sec30: FiniteDuration = FiniteDuration(30, TimeUnit.SECONDS)

  val scn1: ScenarioBuilder = scenario("REST call - 1 user repeated 100 times")
    .repeat(100) {
      exec(
        http("POST request with Movie JSON body")
          .post("/")
          .body(RawFileBody(bodyPath)).asJson
      )
    }

  val scn2: ScenarioBuilder = scenario("REST call - 50 users repeated 100 times")
    .repeat(100) {
      exec(
        http("POST request with Movie JSON body")
          .post("/")
          .body(RawFileBody(bodyPath)).asJson
      )
    }

  // ~ 333 users/s
  val scn3: ScenarioBuilder = scenario("REST call - 10.000 users over 30s")
    .exec(
      http("POST request with Movie JSON body")
        .post("/")
        .body(RawFileBody(bodyPath)).asJson
    )

  setUp(scn1.inject(atOnceUsers(1)).protocols(httpProtocol))

  //setUp(scn2.inject(atOnceUsers(50)).protocols(httpProtocol))

  //setUp(scn3.inject(rampUsers(10000) during(sec30)).protocols(httpProtocol))
}
