/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package MMIStandard;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-02")
public class MVector3 implements org.apache.thrift.TBase<MVector3, MVector3._Fields>, java.io.Serializable, Cloneable, Comparable<MVector3> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MVector3");

  private static final org.apache.thrift.protocol.TField X_FIELD_DESC = new org.apache.thrift.protocol.TField("X", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField Y_FIELD_DESC = new org.apache.thrift.protocol.TField("Y", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField Z_FIELD_DESC = new org.apache.thrift.protocol.TField("Z", org.apache.thrift.protocol.TType.DOUBLE, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MVector3StandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MVector3TupleSchemeFactory();

  public double X; // required
  public double Y; // required
  public double Z; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    X((short)1, "X"),
    Y((short)2, "Y"),
    Z((short)3, "Z");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // X
          return X;
        case 2: // Y
          return Y;
        case 3: // Z
          return Z;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __X_ISSET_ID = 0;
  private static final int __Y_ISSET_ID = 1;
  private static final int __Z_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.X, new org.apache.thrift.meta_data.FieldMetaData("X", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Y, new org.apache.thrift.meta_data.FieldMetaData("Y", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Z, new org.apache.thrift.meta_data.FieldMetaData("Z", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MVector3.class, metaDataMap);
  }

  public MVector3() {
  }

  public MVector3(
    double X,
    double Y,
    double Z)
  {
    this();
    this.X = X;
    setXIsSet(true);
    this.Y = Y;
    setYIsSet(true);
    this.Z = Z;
    setZIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MVector3(MVector3 other) {
    __isset_bitfield = other.__isset_bitfield;
    this.X = other.X;
    this.Y = other.Y;
    this.Z = other.Z;
  }

  public MVector3 deepCopy() {
    return new MVector3(this);
  }

  @Override
  public void clear() {
    setXIsSet(false);
    this.X = 0.0;
    setYIsSet(false);
    this.Y = 0.0;
    setZIsSet(false);
    this.Z = 0.0;
  }

  public double getX() {
    return this.X;
  }

  public MVector3 setX(double X) {
    this.X = X;
    setXIsSet(true);
    return this;
  }

  public void unsetX() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __X_ISSET_ID);
  }

  /** Returns true if field X is set (has been assigned a value) and false otherwise */
  public boolean isSetX() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __X_ISSET_ID);
  }

  public void setXIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __X_ISSET_ID, value);
  }

  public double getY() {
    return this.Y;
  }

  public MVector3 setY(double Y) {
    this.Y = Y;
    setYIsSet(true);
    return this;
  }

  public void unsetY() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Y_ISSET_ID);
  }

  /** Returns true if field Y is set (has been assigned a value) and false otherwise */
  public boolean isSetY() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Y_ISSET_ID);
  }

  public void setYIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Y_ISSET_ID, value);
  }

  public double getZ() {
    return this.Z;
  }

  public MVector3 setZ(double Z) {
    this.Z = Z;
    setZIsSet(true);
    return this;
  }

  public void unsetZ() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Z_ISSET_ID);
  }

  /** Returns true if field Z is set (has been assigned a value) and false otherwise */
  public boolean isSetZ() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Z_ISSET_ID);
  }

  public void setZIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Z_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case X:
      if (value == null) {
        unsetX();
      } else {
        setX((java.lang.Double)value);
      }
      break;

    case Y:
      if (value == null) {
        unsetY();
      } else {
        setY((java.lang.Double)value);
      }
      break;

    case Z:
      if (value == null) {
        unsetZ();
      } else {
        setZ((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case X:
      return getX();

    case Y:
      return getY();

    case Z:
      return getZ();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case X:
      return isSetX();
    case Y:
      return isSetY();
    case Z:
      return isSetZ();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MVector3)
      return this.equals((MVector3)that);
    return false;
  }

  public boolean equals(MVector3 that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_X = true;
    boolean that_present_X = true;
    if (this_present_X || that_present_X) {
      if (!(this_present_X && that_present_X))
        return false;
      if (this.X != that.X)
        return false;
    }

    boolean this_present_Y = true;
    boolean that_present_Y = true;
    if (this_present_Y || that_present_Y) {
      if (!(this_present_Y && that_present_Y))
        return false;
      if (this.Y != that.Y)
        return false;
    }

    boolean this_present_Z = true;
    boolean that_present_Z = true;
    if (this_present_Z || that_present_Z) {
      if (!(this_present_Z && that_present_Z))
        return false;
      if (this.Z != that.Z)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(X);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(Y);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(Z);

    return hashCode;
  }

  @Override
  public int compareTo(MVector3 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetX()).compareTo(other.isSetX());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.X, other.X);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetY()).compareTo(other.isSetY());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Y, other.Y);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetZ()).compareTo(other.isSetZ());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetZ()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Z, other.Z);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MVector3(");
    boolean first = true;

    sb.append("X:");
    sb.append(this.X);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Y:");
    sb.append(this.Y);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Z:");
    sb.append(this.Z);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'X' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'Y' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'Z' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MVector3StandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MVector3StandardScheme getScheme() {
      return new MVector3StandardScheme();
    }
  }

  private static class MVector3StandardScheme extends org.apache.thrift.scheme.StandardScheme<MVector3> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MVector3 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // X
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.X = iprot.readDouble();
              struct.setXIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // Y
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.Y = iprot.readDouble();
              struct.setYIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // Z
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.Z = iprot.readDouble();
              struct.setZIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetX()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'X' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetY()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Y' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetZ()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Z' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MVector3 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(X_FIELD_DESC);
      oprot.writeDouble(struct.X);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y_FIELD_DESC);
      oprot.writeDouble(struct.Y);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Z_FIELD_DESC);
      oprot.writeDouble(struct.Z);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MVector3TupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MVector3TupleScheme getScheme() {
      return new MVector3TupleScheme();
    }
  }

  private static class MVector3TupleScheme extends org.apache.thrift.scheme.TupleScheme<MVector3> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MVector3 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeDouble(struct.X);
      oprot.writeDouble(struct.Y);
      oprot.writeDouble(struct.Z);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MVector3 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.X = iprot.readDouble();
      struct.setXIsSet(true);
      struct.Y = iprot.readDouble();
      struct.setYIsSet(true);
      struct.Z = iprot.readDouble();
      struct.setZIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
