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

interface MRetargetingServiceIf extends \MMIServiceBaseIf
{
    /**
     * @param \MAvatarPosture $globalTarget
     * @return \MAvatarDescription
     */
    public function SetupRetargeting(\MAvatarPosture $globalTarget);
    /**
     * @param \MAvatarPosture $globalTarget
     * @return \MAvatarPostureValues
     */
    public function RetargetToIntermediate(\MAvatarPosture $globalTarget);
    /**
     * @param \MAvatarPostureValues $intermediatePostureValues
     * @return \MAvatarPosture
     */
    public function RetargetToTarget(\MAvatarPostureValues $intermediatePostureValues);
}