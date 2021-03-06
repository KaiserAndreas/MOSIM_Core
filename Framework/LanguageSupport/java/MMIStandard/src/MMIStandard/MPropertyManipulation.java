/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package MMIStandard;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-02")
public class MPropertyManipulation implements org.apache.thrift.TBase<MPropertyManipulation, MPropertyManipulation._Fields>, java.io.Serializable, Cloneable, Comparable<MPropertyManipulation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MPropertyManipulation");

  private static final org.apache.thrift.protocol.TField TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("Target", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("Key", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("Value", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MPropertyManipulationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MPropertyManipulationTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String Target; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String Key; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String Value; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TARGET((short)1, "Target"),
    KEY((short)2, "Key"),
    VALUE((short)3, "Value");

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
        case 1: // TARGET
          return TARGET;
        case 2: // KEY
          return KEY;
        case 3: // VALUE
          return VALUE;
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
  private static final _Fields optionals[] = {_Fields.VALUE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TARGET, new org.apache.thrift.meta_data.FieldMetaData("Target", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("Key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("Value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MPropertyManipulation.class, metaDataMap);
  }

  public MPropertyManipulation() {
  }

  public MPropertyManipulation(
    java.lang.String Target,
    java.lang.String Key)
  {
    this();
    this.Target = Target;
    this.Key = Key;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MPropertyManipulation(MPropertyManipulation other) {
    if (other.isSetTarget()) {
      this.Target = other.Target;
    }
    if (other.isSetKey()) {
      this.Key = other.Key;
    }
    if (other.isSetValue()) {
      this.Value = other.Value;
    }
  }

  public MPropertyManipulation deepCopy() {
    return new MPropertyManipulation(this);
  }

  @Override
  public void clear() {
    this.Target = null;
    this.Key = null;
    this.Value = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTarget() {
    return this.Target;
  }

  public MPropertyManipulation setTarget(@org.apache.thrift.annotation.Nullable java.lang.String Target) {
    this.Target = Target;
    return this;
  }

  public void unsetTarget() {
    this.Target = null;
  }

  /** Returns true if field Target is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget() {
    return this.Target != null;
  }

  public void setTargetIsSet(boolean value) {
    if (!value) {
      this.Target = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getKey() {
    return this.Key;
  }

  public MPropertyManipulation setKey(@org.apache.thrift.annotation.Nullable java.lang.String Key) {
    this.Key = Key;
    return this;
  }

  public void unsetKey() {
    this.Key = null;
  }

  /** Returns true if field Key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.Key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.Key = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValue() {
    return this.Value;
  }

  public MPropertyManipulation setValue(@org.apache.thrift.annotation.Nullable java.lang.String Value) {
    this.Value = Value;
    return this;
  }

  public void unsetValue() {
    this.Value = null;
  }

  /** Returns true if field Value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.Value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.Value = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TARGET:
      if (value == null) {
        unsetTarget();
      } else {
        setTarget((java.lang.String)value);
      }
      break;

    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((java.lang.String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TARGET:
      return getTarget();

    case KEY:
      return getKey();

    case VALUE:
      return getValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TARGET:
      return isSetTarget();
    case KEY:
      return isSetKey();
    case VALUE:
      return isSetValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MPropertyManipulation)
      return this.equals((MPropertyManipulation)that);
    return false;
  }

  public boolean equals(MPropertyManipulation that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Target = true && this.isSetTarget();
    boolean that_present_Target = true && that.isSetTarget();
    if (this_present_Target || that_present_Target) {
      if (!(this_present_Target && that_present_Target))
        return false;
      if (!this.Target.equals(that.Target))
        return false;
    }

    boolean this_present_Key = true && this.isSetKey();
    boolean that_present_Key = true && that.isSetKey();
    if (this_present_Key || that_present_Key) {
      if (!(this_present_Key && that_present_Key))
        return false;
      if (!this.Key.equals(that.Key))
        return false;
    }

    boolean this_present_Value = true && this.isSetValue();
    boolean that_present_Value = true && that.isSetValue();
    if (this_present_Value || that_present_Value) {
      if (!(this_present_Value && that_present_Value))
        return false;
      if (!this.Value.equals(that.Value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTarget()) ? 131071 : 524287);
    if (isSetTarget())
      hashCode = hashCode * 8191 + Target.hashCode();

    hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
    if (isSetKey())
      hashCode = hashCode * 8191 + Key.hashCode();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + Value.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MPropertyManipulation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTarget()).compareTo(other.isSetTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Target, other.Target);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Key, other.Key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Value, other.Value);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MPropertyManipulation(");
    boolean first = true;

    sb.append("Target:");
    if (this.Target == null) {
      sb.append("null");
    } else {
      sb.append(this.Target);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Key:");
    if (this.Key == null) {
      sb.append("null");
    } else {
      sb.append(this.Key);
    }
    first = false;
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("Value:");
      if (this.Value == null) {
        sb.append("null");
      } else {
        sb.append(this.Value);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Target == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Target' was not present! Struct: " + toString());
    }
    if (Key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Key' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MPropertyManipulationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MPropertyManipulationStandardScheme getScheme() {
      return new MPropertyManipulationStandardScheme();
    }
  }

  private static class MPropertyManipulationStandardScheme extends org.apache.thrift.scheme.StandardScheme<MPropertyManipulation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MPropertyManipulation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Target = iprot.readString();
              struct.setTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Value = iprot.readString();
              struct.setValueIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MPropertyManipulation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Target != null) {
        oprot.writeFieldBegin(TARGET_FIELD_DESC);
        oprot.writeString(struct.Target);
        oprot.writeFieldEnd();
      }
      if (struct.Key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeString(struct.Key);
        oprot.writeFieldEnd();
      }
      if (struct.Value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeString(struct.Value);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MPropertyManipulationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MPropertyManipulationTupleScheme getScheme() {
      return new MPropertyManipulationTupleScheme();
    }
  }

  private static class MPropertyManipulationTupleScheme extends org.apache.thrift.scheme.TupleScheme<MPropertyManipulation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MPropertyManipulation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.Target);
      oprot.writeString(struct.Key);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetValue()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetValue()) {
        oprot.writeString(struct.Value);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MPropertyManipulation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.Target = iprot.readString();
      struct.setTargetIsSet(true);
      struct.Key = iprot.readString();
      struct.setKeyIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.Value = iprot.readString();
        struct.setValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

