import java.util.concurrent.TimeUnit

import com.github.phisgr.gatling.grpc.Predef._
import com.github.phisgr.gatling.grpc.protocol.GrpcProtocol
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.grpc.ManagedChannelBuilder
import movie.movie.{Movie, MovieGenre, MoviePerson, MovieServiceGrpc}

import scala.concurrent.duration.FiniteDuration

class GrpcSimulation extends Simulation {

  val grpcConfig: GrpcProtocol = grpc(ManagedChannelBuilder
    .forAddress("localhost", 50051)
    .usePlaintext())

  val sec30: FiniteDuration = FiniteDuration(30, TimeUnit.SECONDS)
  val sec15: FiniteDuration = FiniteDuration(15, TimeUnit.SECONDS)

  val moviePerson: MoviePerson = MoviePerson.of(
    "Hello",
    "Hello"
  )

  val grpcMovie: Movie = Movie.of(
    "d0b16651-1139-4abc-aa20-9cb1fc4c1793",
    "Hello",
    Seq(MovieGenre.ACTION),
    Seq(moviePerson, moviePerson, moviePerson),
    Seq(moviePerson, moviePerson, moviePerson),
    Seq(moviePerson, moviePerson, moviePerson, moviePerson, moviePerson, moviePerson),
    10,
    10
  )

  val scn1: ScenarioBuilder = scenario("gRPC call - 1 user repeated 100 times")
    .repeat(100) {
      exec(
        grpc("gRPC request with Movie message")
          .rpc(MovieServiceGrpc.METHOD_ADD_MOVIE)
          .payload(grpcMovie)
      )
    }

  val scn2: ScenarioBuilder = scenario("gRPC call - 50 users repeated 100 times")
    .repeat(100) {
      exec(
        grpc("gRPC request with Movie message")
          .rpc(MovieServiceGrpc.METHOD_ADD_MOVIE)
          .payload(grpcMovie)
      )
    }

  // ~ 333 users/s
  val scn3: ScenarioBuilder = scenario("gRPC call - 10.000 users over 30s")
    .exec(
      grpc("gRPC request with Movie message")
        .rpc(MovieServiceGrpc.METHOD_ADD_MOVIE)
        .payload(grpcMovie)
    )

  // ~ 667 users/s
  val scn4: ScenarioBuilder = scenario("gRPC call - 10.000 users over 15s")
    .exec(
      grpc("gRPC request with Movie message")
        .rpc(MovieServiceGrpc.METHOD_ADD_MOVIE)
        .payload(grpcMovie)
    )


  setUp(scn1.inject(atOnceUsers(1)).protocols(grpcConfig))

  //setUp(scn2.inject(atOnceUsers(50)).protocols(grpcConfig))

  //setUp(scn3.inject(rampUsers(10000) during(sec30)).protocols(grpcConfig))

  //setUp(scn4.inject(rampUsers(10000) during(sec15)).protocols(grpcConfig))
}
