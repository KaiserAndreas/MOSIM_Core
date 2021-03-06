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

final class MDrawingCallType
{
    const DrawLine2D = 0;

    const DrawLine3D = 1;

    const DrawPoint2D = 2;

    const DrawPoint3D = 3;

    const DrawText = 4;

    const Custom = 5;

    static public $__names = array(
        0 => 'DrawLine2D',
        1 => 'DrawLine3D',
        2 => 'DrawPoint2D',
        3 => 'DrawPoint3D',
        4 => 'DrawText',
        5 => 'Custom',
    );
}

