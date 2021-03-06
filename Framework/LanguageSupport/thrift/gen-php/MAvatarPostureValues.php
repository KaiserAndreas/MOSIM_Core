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

class MAvatarPostureValues
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'AvatarID',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'PostureData',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::DOUBLE,
            'elem' => array(
                'type' => TType::DOUBLE,
                ),
        ),
        3 => array(
            'var' => 'PartialJointList',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
    );

    /**
     * @var string
     */
    public $AvatarID = null;
    /**
     * @var double[]
     */
    public $PostureData = null;
    /**
     * @var int[]
     */
    public $PartialJointList = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['AvatarID'])) {
                $this->AvatarID = $vals['AvatarID'];
            }
            if (isset($vals['PostureData'])) {
                $this->PostureData = $vals['PostureData'];
            }
            if (isset($vals['PartialJointList'])) {
                $this->PartialJointList = $vals['PartialJointList'];
            }
        }
    }

    public function getName()
    {
        return 'MAvatarPostureValues';
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
                        $xfer += $input->readString($this->AvatarID);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->PostureData = array();
                        $_size0 = 0;
                        $_etype3 = 0;
                        $xfer += $input->readListBegin($_etype3, $_size0);
                        for ($_i4 = 0; $_i4 < $_size0; ++$_i4) {
                            $elem5 = null;
                            $xfer += $input->readDouble($elem5);
                            $this->PostureData []= $elem5;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->PartialJointList = array();
                        $_size6 = 0;
                        $_etype9 = 0;
                        $xfer += $input->readListBegin($_etype9, $_size6);
                        for ($_i10 = 0; $_i10 < $_size6; ++$_i10) {
                            $elem11 = null;
                            $xfer += $input->readI32($elem11);
                            $this->PartialJointList []= $elem11;
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
        $xfer += $output->writeStructBegin('MAvatarPostureValues');
        if ($this->AvatarID !== null) {
            $xfer += $output->writeFieldBegin('AvatarID', TType::STRING, 1);
            $xfer += $output->writeString($this->AvatarID);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->PostureData !== null) {
            if (!is_array($this->PostureData)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('PostureData', TType::LST, 2);
            $output->writeListBegin(TType::DOUBLE, count($this->PostureData));
            foreach ($this->PostureData as $iter12) {
                $xfer += $output->writeDouble($iter12);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->PartialJointList !== null) {
            if (!is_array($this->PartialJointList)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('PartialJointList', TType::LST, 3);
            $output->writeListBegin(TType::I32, count($this->PartialJointList));
            foreach ($this->PartialJointList as $iter13) {
                $xfer += $output->writeI32($iter13);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
