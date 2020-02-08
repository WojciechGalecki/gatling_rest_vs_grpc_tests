// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package movie.movie

@SerialVersionUID(0L)
final case class Movie(
    id: _root_.scala.Predef.String = "",
    title: _root_.scala.Predef.String = "",
    genres: _root_.scala.Seq[movie.movie.MovieGenre] = _root_.scala.Seq.empty,
    directors: _root_.scala.Seq[movie.movie.MoviePerson] = _root_.scala.Seq.empty,
    writers: _root_.scala.Seq[movie.movie.MoviePerson] = _root_.scala.Seq.empty,
    stars: _root_.scala.Seq[movie.movie.MoviePerson] = _root_.scala.Seq.empty,
    yearOfProduction: _root_.scala.Int = 0,
    durationMinutes: _root_.scala.Int = 0
    ) extends scalapb.GeneratedMessage with scalapb.Message[Movie] with scalapb.lenses.Updatable[Movie] {
    private[this] def genresSerializedSize = {
      if (__genresSerializedSizeField == 0) __genresSerializedSizeField = {
        var __s: _root_.scala.Int = 0
        genres.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(__i.value))
        __s
      }
      __genresSerializedSizeField
    }
    @transient private[this] var __genresSerializedSizeField: _root_.scala.Int = 0
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = id
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = title
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      if(genres.nonEmpty) {
        val __localsize = genresSerializedSize
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
      }
      directors.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      writers.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      stars.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = yearOfProduction
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(7, __value)
        }
      };
      
      {
        val __value = durationMinutes
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(8, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = id
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = title
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      if (genres.nonEmpty) {
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(genresSerializedSize)
        genres.foreach((_output__.writeEnumNoTag _).compose((_: movie.movie.MovieGenre).value))
      };
      directors.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      writers.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      stars.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = yearOfProduction
        if (__v != 0) {
          _output__.writeInt32(7, __v)
        }
      };
      {
        val __v = durationMinutes
        if (__v != 0) {
          _output__.writeInt32(8, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): movie.movie.Movie = {
      var __id = this.id
      var __title = this.title
      val __genres = (_root_.scala.collection.immutable.Vector.newBuilder[movie.movie.MovieGenre] ++= this.genres)
      val __directors = (_root_.scala.collection.immutable.Vector.newBuilder[movie.movie.MoviePerson] ++= this.directors)
      val __writers = (_root_.scala.collection.immutable.Vector.newBuilder[movie.movie.MoviePerson] ++= this.writers)
      val __stars = (_root_.scala.collection.immutable.Vector.newBuilder[movie.movie.MoviePerson] ++= this.stars)
      var __yearOfProduction = this.yearOfProduction
      var __durationMinutes = this.durationMinutes
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __id = _input__.readString()
          case 18 =>
            __title = _input__.readString()
          case 24 =>
            __genres += movie.movie.MovieGenre.fromValue(_input__.readEnum())
          case 26 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __genres += movie.movie.MovieGenre.fromValue(_input__.readEnum)
            }
            _input__.popLimit(oldLimit)
          }
          case 34 =>
            __directors += _root_.scalapb.LiteParser.readMessage(_input__, movie.movie.MoviePerson.defaultInstance)
          case 42 =>
            __writers += _root_.scalapb.LiteParser.readMessage(_input__, movie.movie.MoviePerson.defaultInstance)
          case 50 =>
            __stars += _root_.scalapb.LiteParser.readMessage(_input__, movie.movie.MoviePerson.defaultInstance)
          case 56 =>
            __yearOfProduction = _input__.readInt32()
          case 64 =>
            __durationMinutes = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      movie.movie.Movie(
          id = __id,
          title = __title,
          genres = __genres.result(),
          directors = __directors.result(),
          writers = __writers.result(),
          stars = __stars.result(),
          yearOfProduction = __yearOfProduction,
          durationMinutes = __durationMinutes
      )
    }
    def withId(__v: _root_.scala.Predef.String): Movie = copy(id = __v)
    def withTitle(__v: _root_.scala.Predef.String): Movie = copy(title = __v)
    def clearGenres = copy(genres = _root_.scala.Seq.empty)
    def addGenres(__vs: movie.movie.MovieGenre*): Movie = addAllGenres(__vs)
    def addAllGenres(__vs: Iterable[movie.movie.MovieGenre]): Movie = copy(genres = genres ++ __vs)
    def withGenres(__v: _root_.scala.Seq[movie.movie.MovieGenre]): Movie = copy(genres = __v)
    def clearDirectors = copy(directors = _root_.scala.Seq.empty)
    def addDirectors(__vs: movie.movie.MoviePerson*): Movie = addAllDirectors(__vs)
    def addAllDirectors(__vs: Iterable[movie.movie.MoviePerson]): Movie = copy(directors = directors ++ __vs)
    def withDirectors(__v: _root_.scala.Seq[movie.movie.MoviePerson]): Movie = copy(directors = __v)
    def clearWriters = copy(writers = _root_.scala.Seq.empty)
    def addWriters(__vs: movie.movie.MoviePerson*): Movie = addAllWriters(__vs)
    def addAllWriters(__vs: Iterable[movie.movie.MoviePerson]): Movie = copy(writers = writers ++ __vs)
    def withWriters(__v: _root_.scala.Seq[movie.movie.MoviePerson]): Movie = copy(writers = __v)
    def clearStars = copy(stars = _root_.scala.Seq.empty)
    def addStars(__vs: movie.movie.MoviePerson*): Movie = addAllStars(__vs)
    def addAllStars(__vs: Iterable[movie.movie.MoviePerson]): Movie = copy(stars = stars ++ __vs)
    def withStars(__v: _root_.scala.Seq[movie.movie.MoviePerson]): Movie = copy(stars = __v)
    def withYearOfProduction(__v: _root_.scala.Int): Movie = copy(yearOfProduction = __v)
    def withDurationMinutes(__v: _root_.scala.Int): Movie = copy(durationMinutes = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = id
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = title
          if (__t != "") __t else null
        }
        case 3 => genres.iterator.map(_.javaValueDescriptor).toSeq
        case 4 => directors
        case 5 => writers
        case 6 => stars
        case 7 => {
          val __t = yearOfProduction
          if (__t != 0) __t else null
        }
        case 8 => {
          val __t = durationMinutes
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(id)
        case 2 => _root_.scalapb.descriptors.PString(title)
        case 3 => _root_.scalapb.descriptors.PRepeated(genres.iterator.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).toVector)
        case 4 => _root_.scalapb.descriptors.PRepeated(directors.iterator.map(_.toPMessage).toVector)
        case 5 => _root_.scalapb.descriptors.PRepeated(writers.iterator.map(_.toPMessage).toVector)
        case 6 => _root_.scalapb.descriptors.PRepeated(stars.iterator.map(_.toPMessage).toVector)
        case 7 => _root_.scalapb.descriptors.PInt(yearOfProduction)
        case 8 => _root_.scalapb.descriptors.PInt(durationMinutes)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = movie.movie.Movie
}

object Movie extends scalapb.GeneratedMessageCompanion[movie.movie.Movie] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[movie.movie.Movie] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): movie.movie.Movie = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    movie.movie.Movie(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].iterator.map(__e => movie.movie.MovieGenre.fromValue(__e.getNumber)).toSeq,
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.Seq[movie.movie.MoviePerson]],
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[_root_.scala.Seq[movie.movie.MoviePerson]],
      __fieldsMap.getOrElse(__fields.get(5), Nil).asInstanceOf[_root_.scala.Seq[movie.movie.MoviePerson]],
      __fieldsMap.getOrElse(__fields.get(6), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(7), 0).asInstanceOf[_root_.scala.Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[movie.movie.Movie] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      movie.movie.Movie(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scalapb.descriptors.EnumValueDescriptor]]).getOrElse(_root_.scala.Seq.empty).iterator.map(__e => movie.movie.MovieGenre.fromValue(__e.number)).toSeq,
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Seq[movie.movie.MoviePerson]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[movie.movie.MoviePerson]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[movie.movie.MoviePerson]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MovieProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MovieProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 4 => __out = movie.movie.MoviePerson
      case 5 => __out = movie.movie.MoviePerson
      case 6 => __out = movie.movie.MoviePerson
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 3 => movie.movie.MovieGenre
    }
  }
  lazy val defaultInstance = movie.movie.Movie(
    id = "",
    title = "",
    genres = _root_.scala.Seq.empty,
    directors = _root_.scala.Seq.empty,
    writers = _root_.scala.Seq.empty,
    stars = _root_.scala.Seq.empty,
    yearOfProduction = 0,
    durationMinutes = 0
  )
  implicit class MovieLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, movie.movie.Movie]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, movie.movie.Movie](_l) {
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def title: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.title)((c_, f_) => c_.copy(title = f_))
    def genres: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[movie.movie.MovieGenre]] = field(_.genres)((c_, f_) => c_.copy(genres = f_))
    def directors: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[movie.movie.MoviePerson]] = field(_.directors)((c_, f_) => c_.copy(directors = f_))
    def writers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[movie.movie.MoviePerson]] = field(_.writers)((c_, f_) => c_.copy(writers = f_))
    def stars: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[movie.movie.MoviePerson]] = field(_.stars)((c_, f_) => c_.copy(stars = f_))
    def yearOfProduction: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.yearOfProduction)((c_, f_) => c_.copy(yearOfProduction = f_))
    def durationMinutes: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.durationMinutes)((c_, f_) => c_.copy(durationMinutes = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val TITLE_FIELD_NUMBER = 2
  final val GENRES_FIELD_NUMBER = 3
  final val DIRECTORS_FIELD_NUMBER = 4
  final val WRITERS_FIELD_NUMBER = 5
  final val STARS_FIELD_NUMBER = 6
  final val YEAR_OF_PRODUCTION_FIELD_NUMBER = 7
  final val DURATION_MINUTES_FIELD_NUMBER = 8
  def of(
    id: _root_.scala.Predef.String,
    title: _root_.scala.Predef.String,
    genres: _root_.scala.Seq[movie.movie.MovieGenre],
    directors: _root_.scala.Seq[movie.movie.MoviePerson],
    writers: _root_.scala.Seq[movie.movie.MoviePerson],
    stars: _root_.scala.Seq[movie.movie.MoviePerson],
    yearOfProduction: _root_.scala.Int,
    durationMinutes: _root_.scala.Int
  ): _root_.movie.movie.Movie = _root_.movie.movie.Movie(
    id,
    title,
    genres,
    directors,
    writers,
    stars,
    yearOfProduction,
    durationMinutes
  )
}