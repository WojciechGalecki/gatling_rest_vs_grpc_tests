package movie.movie

object MovieServiceGrpc {
  val METHOD_ADD_MOVIE: _root_.io.grpc.MethodDescriptor[_root_.movie.movie.Movie, _root_.movie.movie.AddMovieResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("movie.MovieService", "AddMovie"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.movie.movie.Movie])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.movie.movie.AddMovieResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(movie.movie.MovieProto.javaDescriptor.getServices.get(0).getMethods.get(0)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("movie.MovieService")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(movie.movie.MovieProto.javaDescriptor))
      .addMethod(METHOD_ADD_MOVIE)
      .build()
  
  trait MovieService extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = MovieService
    /** unary API
      */
    def addMovie(request: _root_.movie.movie.Movie): scala.concurrent.Future[_root_.movie.movie.AddMovieResponse]
  }
  
  object MovieService extends _root_.scalapb.grpc.ServiceCompanion[MovieService] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[MovieService] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = movie.movie.MovieProto.javaDescriptor.getServices().get(0)
    // TODO fix imports
    //def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = MovieProto.scalaDescriptor.services(0)
  }
  
  trait MovieServiceBlockingClient {
    def serviceCompanion = MovieService
    /** unary API
      */
    def addMovie(request: _root_.movie.movie.Movie): _root_.movie.movie.AddMovieResponse
  }
  
  class MovieServiceBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[MovieServiceBlockingStub](channel, options) with MovieServiceBlockingClient {
    /** unary API
      */
    override def addMovie(request: _root_.movie.movie.Movie): _root_.movie.movie.AddMovieResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_ADD_MOVIE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): MovieServiceBlockingStub = new MovieServiceBlockingStub(channel, options)
  }
  
  class MovieServiceStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[MovieServiceStub](channel, options) with MovieService {
    /** unary API
      */
    override def addMovie(request: _root_.movie.movie.Movie): scala.concurrent.Future[_root_.movie.movie.AddMovieResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_ADD_MOVIE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): MovieServiceStub = new MovieServiceStub(channel, options)
  }
  
  def bindService(serviceImpl: MovieService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_ADD_MOVIE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.movie.movie.Movie, _root_.movie.movie.AddMovieResponse] {
        override def invoke(request: _root_.movie.movie.Movie, observer: _root_.io.grpc.stub.StreamObserver[_root_.movie.movie.AddMovieResponse]): Unit =
          serviceImpl.addMovie(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): MovieServiceBlockingStub = new MovieServiceBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): MovieServiceStub = new MovieServiceStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = movie.movie.MovieProto.javaDescriptor.getServices().get(0)
  
}
