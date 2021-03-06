/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace MMIStandard
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class MConstraint : TBase
  {
    private MGeometryConstraint _GeometryConstraint;
    private MVelocityConstraint _VelocityConstraint;
    private MAccelerationConstraint _AccelerationConstraint;
    private MPathConstraint _PathConstraint;
    private MJointPathConstraint _JointPathConstraint;
    private MPostureConstraint _PostureConstraint;
    private MJointConstraint _JointConstraint;
    private Dictionary<string, string> _Properties;

    public string ID { get; set; }

    public MGeometryConstraint GeometryConstraint
    {
      get
      {
        return _GeometryConstraint;
      }
      set
      {
        __isset.GeometryConstraint = true;
        this._GeometryConstraint = value;
      }
    }

    public MVelocityConstraint VelocityConstraint
    {
      get
      {
        return _VelocityConstraint;
      }
      set
      {
        __isset.VelocityConstraint = true;
        this._VelocityConstraint = value;
      }
    }

    public MAccelerationConstraint AccelerationConstraint
    {
      get
      {
        return _AccelerationConstraint;
      }
      set
      {
        __isset.AccelerationConstraint = true;
        this._AccelerationConstraint = value;
      }
    }

    public MPathConstraint PathConstraint
    {
      get
      {
        return _PathConstraint;
      }
      set
      {
        __isset.PathConstraint = true;
        this._PathConstraint = value;
      }
    }

    public MJointPathConstraint JointPathConstraint
    {
      get
      {
        return _JointPathConstraint;
      }
      set
      {
        __isset.JointPathConstraint = true;
        this._JointPathConstraint = value;
      }
    }

    public MPostureConstraint PostureConstraint
    {
      get
      {
        return _PostureConstraint;
      }
      set
      {
        __isset.PostureConstraint = true;
        this._PostureConstraint = value;
      }
    }

    public MJointConstraint JointConstraint
    {
      get
      {
        return _JointConstraint;
      }
      set
      {
        __isset.JointConstraint = true;
        this._JointConstraint = value;
      }
    }

    public Dictionary<string, string> Properties
    {
      get
      {
        return _Properties;
      }
      set
      {
        __isset.Properties = true;
        this._Properties = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool GeometryConstraint;
      public bool VelocityConstraint;
      public bool AccelerationConstraint;
      public bool PathConstraint;
      public bool JointPathConstraint;
      public bool PostureConstraint;
      public bool JointConstraint;
      public bool Properties;
    }

    public MConstraint() {
    }

    public MConstraint(string ID) : this() {
      this.ID = ID;
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        bool isset_ID = false;
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.String) {
                ID = iprot.ReadString();
                isset_ID = true;
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Struct) {
                GeometryConstraint = new MGeometryConstraint();
                GeometryConstraint.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Struct) {
                VelocityConstraint = new MVelocityConstraint();
                VelocityConstraint.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Struct) {
                AccelerationConstraint = new MAccelerationConstraint();
                AccelerationConstraint.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.Struct) {
                PathConstraint = new MPathConstraint();
                PathConstraint.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.Struct) {
                JointPathConstraint = new MJointPathConstraint();
                JointPathConstraint.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 7:
              if (field.Type == TType.Struct) {
                PostureConstraint = new MPostureConstraint();
                PostureConstraint.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 8:
              if (field.Type == TType.Struct) {
                JointConstraint = new MJointConstraint();
                JointConstraint.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 9:
              if (field.Type == TType.Map) {
                {
                  Properties = new Dictionary<string, string>();
                  TMap _map0 = iprot.ReadMapBegin();
                  for( int _i1 = 0; _i1 < _map0.Count; ++_i1)
                  {
                    string _key2;
                    string _val3;
                    _key2 = iprot.ReadString();
                    _val3 = iprot.ReadString();
                    Properties[_key2] = _val3;
                  }
                  iprot.ReadMapEnd();
                }
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
        if (!isset_ID)
          throw new TProtocolException(TProtocolException.INVALID_DATA, "required field ID not set");
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("MConstraint");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (ID == null)
          throw new TProtocolException(TProtocolException.INVALID_DATA, "required field ID not set");
        field.Name = "ID";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ID);
        oprot.WriteFieldEnd();
        if (GeometryConstraint != null && __isset.GeometryConstraint) {
          field.Name = "GeometryConstraint";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          GeometryConstraint.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (VelocityConstraint != null && __isset.VelocityConstraint) {
          field.Name = "VelocityConstraint";
          field.Type = TType.Struct;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          VelocityConstraint.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (AccelerationConstraint != null && __isset.AccelerationConstraint) {
          field.Name = "AccelerationConstraint";
          field.Type = TType.Struct;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          AccelerationConstraint.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (PathConstraint != null && __isset.PathConstraint) {
          field.Name = "PathConstraint";
          field.Type = TType.Struct;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          PathConstraint.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (JointPathConstraint != null && __isset.JointPathConstraint) {
          field.Name = "JointPathConstraint";
          field.Type = TType.Struct;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          JointPathConstraint.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (PostureConstraint != null && __isset.PostureConstraint) {
          field.Name = "PostureConstraint";
          field.Type = TType.Struct;
          field.ID = 7;
          oprot.WriteFieldBegin(field);
          PostureConstraint.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (JointConstraint != null && __isset.JointConstraint) {
          field.Name = "JointConstraint";
          field.Type = TType.Struct;
          field.ID = 8;
          oprot.WriteFieldBegin(field);
          JointConstraint.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (Properties != null && __isset.Properties) {
          field.Name = "Properties";
          field.Type = TType.Map;
          field.ID = 9;
          oprot.WriteFieldBegin(field);
          {
            oprot.WriteMapBegin(new TMap(TType.String, TType.String, Properties.Count));
            foreach (string _iter4 in Properties.Keys)
            {
              oprot.WriteString(_iter4);
              oprot.WriteString(Properties[_iter4]);
            }
            oprot.WriteMapEnd();
          }
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("MConstraint(");
      __sb.Append(", ID: ");
      __sb.Append(ID);
      if (GeometryConstraint != null && __isset.GeometryConstraint) {
        __sb.Append(", GeometryConstraint: ");
        __sb.Append(GeometryConstraint);
      }
      if (VelocityConstraint != null && __isset.VelocityConstraint) {
        __sb.Append(", VelocityConstraint: ");
        __sb.Append(VelocityConstraint);
      }
      if (AccelerationConstraint != null && __isset.AccelerationConstraint) {
        __sb.Append(", AccelerationConstraint: ");
        __sb.Append(AccelerationConstraint);
      }
      if (PathConstraint != null && __isset.PathConstraint) {
        __sb.Append(", PathConstraint: ");
        __sb.Append(PathConstraint);
      }
      if (JointPathConstraint != null && __isset.JointPathConstraint) {
        __sb.Append(", JointPathConstraint: ");
        __sb.Append(JointPathConstraint);
      }
      if (PostureConstraint != null && __isset.PostureConstraint) {
        __sb.Append(", PostureConstraint: ");
        __sb.Append(PostureConstraint);
      }
      if (JointConstraint != null && __isset.JointConstraint) {
        __sb.Append(", JointConstraint: ");
        __sb.Append(JointConstraint);
      }
      if (Properties != null && __isset.Properties) {
        __sb.Append(", Properties: ");
        __sb.Append(Properties);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
