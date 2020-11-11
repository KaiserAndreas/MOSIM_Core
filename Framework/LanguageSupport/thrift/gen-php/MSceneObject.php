<?php
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class MSceneObject
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'ID',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'Name',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'Transform',
            'isRequired' => true,
            'type' => TType::STRUCT,
            'class' => '\MTransform',
        ),
        4 => array(
            'var' => 'Collider',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\MCollider',
        ),
        5 => array(
            'var' => 'Mesh',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\MMesh',
        ),
        6 => array(
            'var' => 'PhysicsProperties',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\MPhysicsProperties',
        ),
        8 => array(
            'var' => 'Properties',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
        9 => array(
            'var' => 'Attachments',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MAttachment',
                ),
        ),
        10 => array(
            'var' => 'Constraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MConstraint',
                ),
        ),
    );

    /**
     * @var string
     */
    public $ID = null;
    /**
     * @var string
     */
    public $Name = null;
    /**
     * @var \MTransform
     */
    public $Transform = null;
    /**
     * @var \MCollider
     */
    public $Collider = null;
    /**
     * @var \MMesh
     */
    public $Mesh = null;
    /**
     * @var \MPhysicsProperties
     */
    public $PhysicsProperties = null;
    /**
     * @var array
     */
    public $Properties = null;
    /**
     * @var \MAttachment[]
     */
    public $Attachments = null;
    /**
     * @var \MConstraint[]
     */
    public $Constraints = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['ID'])) {
                $this->ID = $vals['ID'];
            }
            if (isset($vals['Name'])) {
                $this->Name = $vals['Name'];
            }
            if (isset($vals['Transform'])) {
                $this->Transform = $vals['Transform'];
            }
            if (isset($vals['Collider'])) {
                $this->Collider = $vals['Collider'];
            }
            if (isset($vals['Mesh'])) {
                $this->Mesh = $vals['Mesh'];
            }
            if (isset($vals['PhysicsProperties'])) {
                $this->PhysicsProperties = $vals['PhysicsProperties'];
            }
            if (isset($vals['Properties'])) {
                $this->Properties = $vals['Properties'];
            }
            if (isset($vals['Attachments'])) {
                $this->Attachments = $vals['Attachments'];
            }
            if (isset($vals['Constraints'])) {
                $this->Constraints = $vals['Constraints'];
            }
        }
    }

    public function getName()
    {
        return 'MSceneObject';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->ID);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->Transform = new \MTransform();
                        $xfer += $this->Transform->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->Collider = new \MCollider();
                        $xfer += $this->Collider->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRUCT) {
                        $this->Mesh = new \MMesh();
                        $xfer += $this->Mesh->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRUCT) {
                        $this->PhysicsProperties = new \MPhysicsProperties();
                        $xfer += $this->PhysicsProperties->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::MAP) {
                        $this->Properties = array();
                        $_size199 = 0;
                        $_ktype200 = 0;
                        $_vtype201 = 0;
                        $xfer += $input->readMapBegin($_ktype200, $_vtype201, $_size199);
                        for ($_i203 = 0; $_i203 < $_size199; ++$_i203) {
                            $key204 = '';
                            $val205 = '';
                            $xfer += $input->readString($key204);
                            $xfer += $input->readString($val205);
                            $this->Properties[$key204] = $val205;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::LST) {
                        $this->Attachments = array();
                        $_size206 = 0;
                        $_etype209 = 0;
                        $xfer += $input->readListBegin($_etype209, $_size206);
                        for ($_i210 = 0; $_i210 < $_size206; ++$_i210) {
                            $elem211 = null;
                            $elem211 = new \MAttachment();
                            $xfer += $elem211->read($input);
                            $this->Attachments []= $elem211;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::LST) {
                        $this->Constraints = array();
                        $_size212 = 0;
                        $_etype215 = 0;
                        $xfer += $input->readListBegin($_etype215, $_size212);
                        for ($_i216 = 0; $_i216 < $_size212; ++$_i216) {
                            $elem217 = null;
                            $elem217 = new \MConstraint();
                            $xfer += $elem217->read($input);
                            $this->Constraints []= $elem217;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('MSceneObject');
        if ($this->ID !== null) {
            $xfer += $output->writeFieldBegin('ID', TType::STRING, 1);
            $xfer += $output->writeString($this->ID);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Name !== null) {
            $xfer += $output->writeFieldBegin('Name', TType::STRING, 2);
            $xfer += $output->writeString($this->Name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Transform !== null) {
            if (!is_object($this->Transform)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Transform', TType::STRUCT, 3);
            $xfer += $this->Transform->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Collider !== null) {
            if (!is_object($this->Collider)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Collider', TType::STRUCT, 4);
            $xfer += $this->Collider->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Mesh !== null) {
            if (!is_object($this->Mesh)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Mesh', TType::STRUCT, 5);
            $xfer += $this->Mesh->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->PhysicsProperties !== null) {
            if (!is_object($this->PhysicsProperties)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('PhysicsProperties', TType::STRUCT, 6);
            $xfer += $this->PhysicsProperties->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Properties !== null) {
            if (!is_array($this->Properties)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Properties', TType::MAP, 8);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->Properties));
            foreach ($this->Properties as $kiter218 => $viter219) {
                $xfer += $output->writeString($kiter218);
                $xfer += $output->writeString($viter219);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Attachments !== null) {
            if (!is_array($this->Attachments)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Attachments', TType::LST, 9);
            $output->writeListBegin(TType::STRUCT, count($this->Attachments));
            foreach ($this->Attachments as $iter220) {
                $xfer += $iter220->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Constraints !== null) {
            if (!is_array($this->Constraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Constraints', TType::LST, 10);
            $output->writeListBegin(TType::STRUCT, count($this->Constraints));
            foreach ($this->Constraints as $iter221) {
                $xfer += $iter221->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}