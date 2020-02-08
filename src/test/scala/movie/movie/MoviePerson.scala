// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package movie.movie

@SerialVersionUID(0L)
final case class MoviePerson(
    firstName: _root_.scala.Predef.String = "",
    lastName: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[MoviePerson] with scalapb.lenses.Updatable[MoviePerson] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = firstName
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = lastName
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
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
        val __v = firstName
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = lastName
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): movie.movie.MoviePerson = {
      var __firstName = this.firstName
      var __lastName = this.lastName
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __firstName = _input__.readString()
          case 18 =>
            __lastName = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      movie.movie.MoviePerson(
          firstName = __firstName,
          lastName = __lastName
      )
    }
    def withFirstName(__v: _root_.scala.Predef.String): MoviePerson = copy(firstName = __v)
    def withLastName(__v: _root_.scala.Predef.String): MoviePerson = copy(lastName = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = firstName
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = lastName
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(firstName)
        case 2 => _root_.scalapb.descriptors.PString(lastName)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = movie.movie.MoviePerson
}

object MoviePerson extends scalapb.GeneratedMessageCompanion[movie.movie.MoviePerson] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[movie.movie.MoviePerson] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): movie.movie.MoviePerson = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    movie.movie.MoviePerson(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[movie.movie.MoviePerson] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      movie.movie.MoviePerson(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MovieProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MovieProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = movie.movie.MoviePerson(
    firstName = "",
    lastName = ""
  )
  implicit class MoviePersonLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, movie.movie.MoviePerson]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, movie.movie.MoviePerson](_l) {
    def firstName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.firstName)((c_, f_) => c_.copy(firstName = f_))
    def lastName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.lastName)((c_, f_) => c_.copy(lastName = f_))
  }
  final val FIRST_NAME_FIELD_NUMBER = 1
  final val LAST_NAME_FIELD_NUMBER = 2
  def of(
    firstName: _root_.scala.Predef.String,
    lastName: _root_.scala.Predef.String
  ): _root_.movie.movie.MoviePerson = _root_.movie.movie.MoviePerson(
    firstName,
    lastName
  )
}