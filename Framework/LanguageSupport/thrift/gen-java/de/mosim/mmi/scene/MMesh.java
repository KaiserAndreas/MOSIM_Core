/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.mosim.mmi.scene;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-10-20")
public class MMesh implements org.apache.thrift.TBase<MMesh, MMesh._Fields>, java.io.Serializable, Cloneable, Comparable<MMesh> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MMesh");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERTICES_FIELD_DESC = new org.apache.thrift.protocol.TField("Vertices", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TRIANGLES_FIELD_DESC = new org.apache.thrift.protocol.TField("Triangles", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField UVCOORDINATES_FIELD_DESC = new org.apache.thrift.protocol.TField("UVCoordinates", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("Properties", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MMeshStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MMeshTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String ID; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<de.mosim.mmi.math.MVector3> Vertices; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> Triangles; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<de.mosim.mmi.math.MVector2> UVCoordinates; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> Properties; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "ID"),
    VERTICES((short)2, "Vertices"),
    TRIANGLES((short)3, "Triangles"),
    UVCOORDINATES((short)4, "UVCoordinates"),
    PROPERTIES((short)5, "Properties");

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
        case 1: // ID
          return ID;
        case 2: // VERTICES
          return VERTICES;
        case 3: // TRIANGLES
          return TRIANGLES;
        case 4: // UVCOORDINATES
          return UVCOORDINATES;
        case 5: // PROPERTIES
          return PROPERTIES;
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
  private static final _Fields optionals[] = {_Fields.UVCOORDINATES,_Fields.PROPERTIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("ID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERTICES, new org.apache.thrift.meta_data.FieldMetaData("Vertices", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, de.mosim.mmi.math.MVector3.class))));
    tmpMap.put(_Fields.TRIANGLES, new org.apache.thrift.meta_data.FieldMetaData("Triangles", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.UVCOORDINATES, new org.apache.thrift.meta_data.FieldMetaData("UVCoordinates", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, de.mosim.mmi.math.MVector2.class))));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("Properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MMesh.class, metaDataMap);
  }

  public MMesh() {
  }

  public MMesh(
    java.lang.String ID,
    java.util.List<de.mosim.mmi.math.MVector3> Vertices,
    java.util.List<java.lang.Integer> Triangles)
  {
    this();
    this.ID = ID;
    this.Vertices = Vertices;
    this.Triangles = Triangles;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MMesh(MMesh other) {
    if (other.isSetID()) {
      this.ID = other.ID;
    }
    if (other.isSetVertices()) {
      java.util.List<de.mosim.mmi.math.MVector3> __this__Vertices = new java.util.ArrayList<de.mosim.mmi.math.MVector3>(other.Vertices.size());
      for (de.mosim.mmi.math.MVector3 other_element : other.Vertices) {
        __this__Vertices.add(new de.mosim.mmi.math.MVector3(other_element));
      }
      this.Vertices = __this__Vertices;
    }
    if (other.isSetTriangles()) {
      java.util.List<java.lang.Integer> __this__Triangles = new java.util.ArrayList<java.lang.Integer>(other.Triangles);
      this.Triangles = __this__Triangles;
    }
    if (other.isSetUVCoordinates()) {
      java.util.List<de.mosim.mmi.math.MVector2> __this__UVCoordinates = new java.util.ArrayList<de.mosim.mmi.math.MVector2>(other.UVCoordinates.size());
      for (de.mosim.mmi.math.MVector2 other_element : other.UVCoordinates) {
        __this__UVCoordinates.add(new de.mosim.mmi.math.MVector2(other_element));
      }
      this.UVCoordinates = __this__UVCoordinates;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__Properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.Properties);
      this.Properties = __this__Properties;
    }
  }

  public MMesh deepCopy() {
    return new MMesh(this);
  }

  @Override
  public void clear() {
    this.ID = null;
    this.Vertices = null;
    this.Triangles = null;
    this.UVCoordinates = null;
    this.Properties = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getID() {
    return this.ID;
  }

  public MMesh setID(@org.apache.thrift.annotation.Nullable java.lang.String ID) {
    this.ID = ID;
    return this;
  }

  public void unsetID() {
    this.ID = null;
  }

  /** Returns true if field ID is set (has been assigned a value) and false otherwise */
  public boolean isSetID() {
    return this.ID != null;
  }

  public void setIDIsSet(boolean value) {
    if (!value) {
      this.ID = null;
    }
  }

  public int getVerticesSize() {
    return (this.Vertices == null) ? 0 : this.Vertices.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<de.mosim.mmi.math.MVector3> getVerticesIterator() {
    return (this.Vertices == null) ? null : this.Vertices.iterator();
  }

  public void addToVertices(de.mosim.mmi.math.MVector3 elem) {
    if (this.Vertices == null) {
      this.Vertices = new java.util.ArrayList<de.mosim.mmi.math.MVector3>();
    }
    this.Vertices.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<de.mosim.mmi.math.MVector3> getVertices() {
    return this.Vertices;
  }

  public MMesh setVertices(@org.apache.thrift.annotation.Nullable java.util.List<de.mosim.mmi.math.MVector3> Vertices) {
    this.Vertices = Vertices;
    return this;
  }

  public void unsetVertices() {
    this.Vertices = null;
  }

  /** Returns true if field Vertices is set (has been assigned a value) and false otherwise */
  public boolean isSetVertices() {
    return this.Vertices != null;
  }

  public void setVerticesIsSet(boolean value) {
    if (!value) {
      this.Vertices = null;
    }
  }

  public int getTrianglesSize() {
    return (this.Triangles == null) ? 0 : this.Triangles.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getTrianglesIterator() {
    return (this.Triangles == null) ? null : this.Triangles.iterator();
  }

  public void addToTriangles(int elem) {
    if (this.Triangles == null) {
      this.Triangles = new java.util.ArrayList<java.lang.Integer>();
    }
    this.Triangles.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getTriangles() {
    return this.Triangles;
  }

  public MMesh setTriangles(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> Triangles) {
    this.Triangles = Triangles;
    return this;
  }

  public void unsetTriangles() {
    this.Triangles = null;
  }

  /** Returns true if field Triangles is set (has been assigned a value) and false otherwise */
  public boolean isSetTriangles() {
    return this.Triangles != null;
  }

  public void setTrianglesIsSet(boolean value) {
    if (!value) {
      this.Triangles = null;
    }
  }

  public int getUVCoordinatesSize() {
    return (this.UVCoordinates == null) ? 0 : this.UVCoordinates.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<de.mosim.mmi.math.MVector2> getUVCoordinatesIterator() {
    return (this.UVCoordinates == null) ? null : this.UVCoordinates.iterator();
  }

  public void addToUVCoordinates(de.mosim.mmi.math.MVector2 elem) {
    if (this.UVCoordinates == null) {
      this.UVCoordinates = new java.util.ArrayList<de.mosim.mmi.math.MVector2>();
    }
    this.UVCoordinates.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<de.mosim.mmi.math.MVector2> getUVCoordinates() {
    return this.UVCoordinates;
  }

  public MMesh setUVCoordinates(@org.apache.thrift.annotation.Nullable java.util.List<de.mosim.mmi.math.MVector2> UVCoordinates) {
    this.UVCoordinates = UVCoordinates;
    return this;
  }

  public void unsetUVCoordinates() {
    this.UVCoordinates = null;
  }

  /** Returns true if field UVCoordinates is set (has been assigned a value) and false otherwise */
  public boolean isSetUVCoordinates() {
    return this.UVCoordinates != null;
  }

  public void setUVCoordinatesIsSet(boolean value) {
    if (!value) {
      this.UVCoordinates = null;
    }
  }

  public int getPropertiesSize() {
    return (this.Properties == null) ? 0 : this.Properties.size();
  }

  public void putToProperties(java.lang.String key, java.lang.String val) {
    if (this.Properties == null) {
      this.Properties = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.Properties.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getProperties() {
    return this.Properties;
  }

  public MMesh setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> Properties) {
    this.Properties = Properties;
    return this;
  }

  public void unsetProperties() {
    this.Properties = null;
  }

  /** Returns true if field Properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.Properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.Properties = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetID();
      } else {
        setID((java.lang.String)value);
      }
      break;

    case VERTICES:
      if (value == null) {
        unsetVertices();
      } else {
        setVertices((java.util.List<de.mosim.mmi.math.MVector3>)value);
      }
      break;

    case TRIANGLES:
      if (value == null) {
        unsetTriangles();
      } else {
        setTriangles((java.util.List<java.lang.Integer>)value);
      }
      break;

    case UVCOORDINATES:
      if (value == null) {
        unsetUVCoordinates();
      } else {
        setUVCoordinates((java.util.List<de.mosim.mmi.math.MVector2>)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getID();

    case VERTICES:
      return getVertices();

    case TRIANGLES:
      return getTriangles();

    case UVCOORDINATES:
      return getUVCoordinates();

    case PROPERTIES:
      return getProperties();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetID();
    case VERTICES:
      return isSetVertices();
    case TRIANGLES:
      return isSetTriangles();
    case UVCOORDINATES:
      return isSetUVCoordinates();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MMesh)
      return this.equals((MMesh)that);
    return false;
  }

  public boolean equals(MMesh that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ID = true && this.isSetID();
    boolean that_present_ID = true && that.isSetID();
    if (this_present_ID || that_present_ID) {
      if (!(this_present_ID && that_present_ID))
        return false;
      if (!this.ID.equals(that.ID))
        return false;
    }

    boolean this_present_Vertices = true && this.isSetVertices();
    boolean that_present_Vertices = true && that.isSetVertices();
    if (this_present_Vertices || that_present_Vertices) {
      if (!(this_present_Vertices && that_present_Vertices))
        return false;
      if (!this.Vertices.equals(that.Vertices))
        return false;
    }

    boolean this_present_Triangles = true && this.isSetTriangles();
    boolean that_present_Triangles = true && that.isSetTriangles();
    if (this_present_Triangles || that_present_Triangles) {
      if (!(this_present_Triangles && that_present_Triangles))
        return false;
      if (!this.Triangles.equals(that.Triangles))
        return false;
    }

    boolean this_present_UVCoordinates = true && this.isSetUVCoordinates();
    boolean that_present_UVCoordinates = true && that.isSetUVCoordinates();
    if (this_present_UVCoordinates || that_present_UVCoordinates) {
      if (!(this_present_UVCoordinates && that_present_UVCoordinates))
        return false;
      if (!this.UVCoordinates.equals(that.UVCoordinates))
        return false;
    }

    boolean this_present_Properties = true && this.isSetProperties();
    boolean that_present_Properties = true && that.isSetProperties();
    if (this_present_Properties || that_present_Properties) {
      if (!(this_present_Properties && that_present_Properties))
        return false;
      if (!this.Properties.equals(that.Properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetID()) ? 131071 : 524287);
    if (isSetID())
      hashCode = hashCode * 8191 + ID.hashCode();

    hashCode = hashCode * 8191 + ((isSetVertices()) ? 131071 : 524287);
    if (isSetVertices())
      hashCode = hashCode * 8191 + Vertices.hashCode();

    hashCode = hashCode * 8191 + ((isSetTriangles()) ? 131071 : 524287);
    if (isSetTriangles())
      hashCode = hashCode * 8191 + Triangles.hashCode();

    hashCode = hashCode * 8191 + ((isSetUVCoordinates()) ? 131071 : 524287);
    if (isSetUVCoordinates())
      hashCode = hashCode * 8191 + UVCoordinates.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + Properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MMesh other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetID()).compareTo(other.isSetID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ID, other.ID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVertices()).compareTo(other.isSetVertices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVertices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Vertices, other.Vertices);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTriangles()).compareTo(other.isSetTriangles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTriangles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Triangles, other.Triangles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUVCoordinates()).compareTo(other.isSetUVCoordinates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUVCoordinates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.UVCoordinates, other.UVCoordinates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProperties()).compareTo(other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Properties, other.Properties);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MMesh(");
    boolean first = true;

    sb.append("ID:");
    if (this.ID == null) {
      sb.append("null");
    } else {
      sb.append(this.ID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Vertices:");
    if (this.Vertices == null) {
      sb.append("null");
    } else {
      sb.append(this.Vertices);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Triangles:");
    if (this.Triangles == null) {
      sb.append("null");
    } else {
      sb.append(this.Triangles);
    }
    first = false;
    if (isSetUVCoordinates()) {
      if (!first) sb.append(", ");
      sb.append("UVCoordinates:");
      if (this.UVCoordinates == null) {
        sb.append("null");
      } else {
        sb.append(this.UVCoordinates);
      }
      first = false;
    }
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("Properties:");
      if (this.Properties == null) {
        sb.append("null");
      } else {
        sb.append(this.Properties);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ID == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ID' was not present! Struct: " + toString());
    }
    if (Vertices == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Vertices' was not present! Struct: " + toString());
    }
    if (Triangles == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Triangles' was not present! Struct: " + toString());
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

  private static class MMeshStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MMeshStandardScheme getScheme() {
      return new MMeshStandardScheme();
    }
  }

  private static class MMeshStandardScheme extends org.apache.thrift.scheme.StandardScheme<MMesh> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MMesh struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ID = iprot.readString();
              struct.setIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERTICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.Vertices = new java.util.ArrayList<de.mosim.mmi.math.MVector3>(_list80.size);
                @org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MVector3 _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = new de.mosim.mmi.math.MVector3();
                  _elem81.read(iprot);
                  struct.Vertices.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setVerticesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRIANGLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list83 = iprot.readListBegin();
                struct.Triangles = new java.util.ArrayList<java.lang.Integer>(_list83.size);
                int _elem84;
                for (int _i85 = 0; _i85 < _list83.size; ++_i85)
                {
                  _elem84 = iprot.readI32();
                  struct.Triangles.add(_elem84);
                }
                iprot.readListEnd();
              }
              struct.setTrianglesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UVCOORDINATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list86 = iprot.readListBegin();
                struct.UVCoordinates = new java.util.ArrayList<de.mosim.mmi.math.MVector2>(_list86.size);
                @org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MVector2 _elem87;
                for (int _i88 = 0; _i88 < _list86.size; ++_i88)
                {
                  _elem87 = new de.mosim.mmi.math.MVector2();
                  _elem87.read(iprot);
                  struct.UVCoordinates.add(_elem87);
                }
                iprot.readListEnd();
              }
              struct.setUVCoordinatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map89 = iprot.readMapBegin();
                struct.Properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map89.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key90;
                @org.apache.thrift.annotation.Nullable java.lang.String _val91;
                for (int _i92 = 0; _i92 < _map89.size; ++_i92)
                {
                  _key90 = iprot.readString();
                  _val91 = iprot.readString();
                  struct.Properties.put(_key90, _val91);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MMesh struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ID != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.ID);
        oprot.writeFieldEnd();
      }
      if (struct.Vertices != null) {
        oprot.writeFieldBegin(VERTICES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.Vertices.size()));
          for (de.mosim.mmi.math.MVector3 _iter93 : struct.Vertices)
          {
            _iter93.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.Triangles != null) {
        oprot.writeFieldBegin(TRIANGLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.Triangles.size()));
          for (int _iter94 : struct.Triangles)
          {
            oprot.writeI32(_iter94);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.UVCoordinates != null) {
        if (struct.isSetUVCoordinates()) {
          oprot.writeFieldBegin(UVCOORDINATES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.UVCoordinates.size()));
            for (de.mosim.mmi.math.MVector2 _iter95 : struct.UVCoordinates)
            {
              _iter95.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.Properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.Properties.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter96 : struct.Properties.entrySet())
            {
              oprot.writeString(_iter96.getKey());
              oprot.writeString(_iter96.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MMeshTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MMeshTupleScheme getScheme() {
      return new MMeshTupleScheme();
    }
  }

  private static class MMeshTupleScheme extends org.apache.thrift.scheme.TupleScheme<MMesh> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MMesh struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.ID);
      {
        oprot.writeI32(struct.Vertices.size());
        for (de.mosim.mmi.math.MVector3 _iter97 : struct.Vertices)
        {
          _iter97.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.Triangles.size());
        for (int _iter98 : struct.Triangles)
        {
          oprot.writeI32(_iter98);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUVCoordinates()) {
        optionals.set(0);
      }
      if (struct.isSetProperties()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUVCoordinates()) {
        {
          oprot.writeI32(struct.UVCoordinates.size());
          for (de.mosim.mmi.math.MVector2 _iter99 : struct.UVCoordinates)
          {
            _iter99.write(oprot);
          }
        }
      }
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.Properties.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter100 : struct.Properties.entrySet())
          {
            oprot.writeString(_iter100.getKey());
            oprot.writeString(_iter100.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MMesh struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.ID = iprot.readString();
      struct.setIDIsSet(true);
      {
        org.apache.thrift.protocol.TList _list101 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.Vertices = new java.util.ArrayList<de.mosim.mmi.math.MVector3>(_list101.size);
        @org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MVector3 _elem102;
        for (int _i103 = 0; _i103 < _list101.size; ++_i103)
        {
          _elem102 = new de.mosim.mmi.math.MVector3();
          _elem102.read(iprot);
          struct.Vertices.add(_elem102);
        }
      }
      struct.setVerticesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list104 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.Triangles = new java.util.ArrayList<java.lang.Integer>(_list104.size);
        int _elem105;
        for (int _i106 = 0; _i106 < _list104.size; ++_i106)
        {
          _elem105 = iprot.readI32();
          struct.Triangles.add(_elem105);
        }
      }
      struct.setTrianglesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list107 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.UVCoordinates = new java.util.ArrayList<de.mosim.mmi.math.MVector2>(_list107.size);
          @org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MVector2 _elem108;
          for (int _i109 = 0; _i109 < _list107.size; ++_i109)
          {
            _elem108 = new de.mosim.mmi.math.MVector2();
            _elem108.read(iprot);
            struct.UVCoordinates.add(_elem108);
          }
        }
        struct.setUVCoordinatesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map110 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.Properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map110.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key111;
          @org.apache.thrift.annotation.Nullable java.lang.String _val112;
          for (int _i113 = 0; _i113 < _map110.size; ++_i113)
          {
            _key111 = iprot.readString();
            _val112 = iprot.readString();
            struct.Properties.put(_key111, _val112);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
