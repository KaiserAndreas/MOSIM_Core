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

class MVelocityConstraint
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'ParentObjectID',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'ParentToConstraint',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\MTransform',
        ),
        3 => array(
            'var' => 'TranslationalVelocity',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\MVector3',
        ),
        4 => array(
            'var' => 'RotationalVelocity',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\MVector3',
        ),
        5 => array(
            'var' => 'WeightingFactor',
            'isRequired' => false,
            'type' => TType::DOUBLE,
        ),
    );

    /**
     * @var string
     */
    public $ParentObjectID = null;
    /**
     * @var \MTransform
     */
    public $ParentToConstraint = null;
    /**
     * @var \MVector3
     */
    public $TranslationalVelocity = null;
    /**
     * @var \MVector3
     */
    public $RotationalVelocity = null;
    /**
     * @var double
     */
    public $WeightingFactor = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['ParentObjectID'])) {
                $this->ParentObjectID = $vals['ParentObjectID'];
            }
            if (isset($vals['ParentToConstraint'])) {
                $this->ParentToConstraint = $vals['ParentToConstraint'];
            }
            if (isset($vals['TranslationalVelocity'])) {
                $this->TranslationalVelocity = $vals['TranslationalVelocity'];
            }
            if (isset($vals['RotationalVelocity'])) {
                $this->RotationalVelocity = $vals['RotationalVelocity'];
            }
            if (isset($vals['WeightingFactor'])) {
                $this->WeightingFactor = $vals['WeightingFactor'];
            }
        }
    }

    public function getName()
    {
        return 'MVelocityConstraint';
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
                        $xfer += $input->readString($this->ParentObjectID);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->ParentToConstraint = new \MTransform();
                        $xfer += $this->ParentToConstraint->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->TranslationalVelocity = new \MVector3();
                        $xfer += $this->TranslationalVelocity->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->RotationalVelocity = new \MVector3();
                        $xfer += $this->RotationalVelocity->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::DOUBLE) {
                        $xfer += $input->readDouble($this->WeightingFactor);
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
        $xfer += $output->writeStructBegin('MVelocityConstraint');
        if ($this->ParentObjectID !== null) {
            $xfer += $output->writeFieldBegin('ParentObjectID', TType::STRING, 1);
            $xfer += $output->writeString($this->ParentObjectID);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ParentToConstraint !== null) {
            if (!is_object($this->ParentToConstraint)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('ParentToConstraint', TType::STRUCT, 2);
            $xfer += $this->ParentToConstraint->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->TranslationalVelocity !== null) {
            if (!is_object($this->TranslationalVelocity)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('TranslationalVelocity', TType::STRUCT, 3);
            $xfer += $this->TranslationalVelocity->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->RotationalVelocity !== null) {
            if (!is_object($this->RotationalVelocity)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('RotationalVelocity', TType::STRUCT, 4);
            $xfer += $this->RotationalVelocity->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->WeightingFactor !== null) {
            $xfer += $output->writeFieldBegin('WeightingFactor', TType::DOUBLE, 5);
            $xfer += $output->writeDouble($this->WeightingFactor);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
