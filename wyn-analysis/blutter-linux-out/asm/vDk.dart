// lib: , url: VDk

// class id: 1049540, size: 0x8
class :: {

  static late final Set<hia> _IIe; // offset: 0x9ec
  static late final Set<hia> _JIe; // offset: 0x9f0
  static late final Set<hia> _KIe; // offset: 0x9f4
  static late final Set<hia> _LIe; // offset: 0x9f8
}

// class id: 1701, size: 0x24, field offset: 0x8
//   transformed mixin,
abstract class _rxa extends Object
     with mJ {

  void KEc(_rxa, (dynamic) => void) {
    // ** addr: 0xafec5c, size: 0x6c
    // 0xafec5c: EnterFrame
    //     0xafec5c: stp             fp, lr, [SP, #-0x10]!
    //     0xafec60: mov             fp, SP
    // 0xafec64: CheckStackOverflow
    //     0xafec64: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xafec68: cmp             SP, x16
    //     0xafec6c: b.ls            #0xafeca8
    // 0xafec70: ldr             x0, [fp, #0x10]
    // 0xafec74: r2 = Null
    //     0xafec74: mov             x2, NULL
    // 0xafec78: r1 = Null
    //     0xafec78: mov             x1, NULL
    // 0xafec7c: r8 = (dynamic this) => void?
    //     0xafec7c: add             x8, PP, #0x24, lsl #12  ; [pp+0x24c18] FunctionType: (dynamic this) => void?
    //     0xafec80: ldr             x8, [x8, #0xc18]
    // 0xafec84: r3 = Null
    //     0xafec84: add             x3, PP, #0x28, lsl #12  ; [pp+0x287b8] Null
    //     0xafec88: ldr             x3, [x3, #0x7b8]
    // 0xafec8c: r0 = DefaultTypeTest()
    //     0xafec8c: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xafec90: ldr             x1, [fp, #0x18]
    // 0xafec94: ldr             x2, [fp, #0x10]
    // 0xafec98: r0 = call 0x41e2f8
    //     0xafec98: bl              #0x41e2f8
    // 0xafec9c: LeaveFrame
    //     0xafec9c: mov             SP, fp
    //     0xafeca0: ldp             fp, lr, [SP], #0x10
    // 0xafeca4: ret
    //     0xafeca4: ret             
    // 0xafeca8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xafeca8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xafecac: b               #0xafec70
  }
}

// class id: 1702, size: 0x28, field offset: 0x24
class qxa extends _rxa {
}

// class id: 1703, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class pxa extends Object {
}

// class id: 1750, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class Ota extends Object {
}

// class id: 2925, size: 0x24, field offset: 0x8
//   transformed mixin,
abstract class _mxa extends _jF
     with mJ {

  void KEc(_mxa, (dynamic) => void) {
    // ** addr: 0xaab7c0, size: 0x6c
    // 0xaab7c0: EnterFrame
    //     0xaab7c0: stp             fp, lr, [SP, #-0x10]!
    //     0xaab7c4: mov             fp, SP
    // 0xaab7c8: CheckStackOverflow
    //     0xaab7c8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaab7cc: cmp             SP, x16
    //     0xaab7d0: b.ls            #0xaab80c
    // 0xaab7d4: ldr             x0, [fp, #0x10]
    // 0xaab7d8: r2 = Null
    //     0xaab7d8: mov             x2, NULL
    // 0xaab7dc: r1 = Null
    //     0xaab7dc: mov             x1, NULL
    // 0xaab7e0: r8 = (dynamic this) => void?
    //     0xaab7e0: add             x8, PP, #0x24, lsl #12  ; [pp+0x24c18] FunctionType: (dynamic this) => void?
    //     0xaab7e4: ldr             x8, [x8, #0xc18]
    // 0xaab7e8: r3 = Null
    //     0xaab7e8: add             x3, PP, #0x28, lsl #12  ; [pp+0x28768] Null
    //     0xaab7ec: ldr             x3, [x3, #0x768]
    // 0xaab7f0: r0 = DefaultTypeTest()
    //     0xaab7f0: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xaab7f4: ldr             x1, [fp, #0x18]
    // 0xaab7f8: ldr             x2, [fp, #0x10]
    // 0xaab7fc: r0 = call 0x41a89c
    //     0xaab7fc: bl              #0x41a89c
    // 0xaab800: LeaveFrame
    //     0xaab800: mov             SP, fp
    //     0xaab804: ldp             fp, lr, [SP], #0x10
    // 0xaab808: ret
    //     0xaab808: ret             
    // 0xaab80c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaab80c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaab810: b               #0xaab7d4
  }
  [closure] List<MI> <anonymous closure>(dynamic) {
    // ** addr: 0x79c848, size: -0x1
  }
}

// class id: 2926, size: 0x30, field offset: 0x24
class lxa extends _mxa {

  [closure] QW? qkj(dynamic) {
    // ** addr: 0x6ce54c, size: -0x1
  }
  [closure] aqa? rkj(dynamic) {
    // ** addr: 0x6ce4e4, size: -0x1
  }
  [closure] Ika<QW>? skj(dynamic) {
    // ** addr: 0x6ce090, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic, Ota, QW) {
    // ** addr: 0x6cdf34, size: -0x1
  }
  [closure] static List<_kxa> <anonymous closure>(dynamic) {
    // ** addr: 0x6ce058, size: -0x1
  }
}

// class id: 2927, size: 0x10, field offset: 0x8
//   const constructor, 
class _kxa extends _jF {
}

// class id: 2928, size: 0x8, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _jxa extends _jF
     with Nta {
}

// class id: 2929, size: 0x24, field offset: 0x8
//   const constructor, 
class ixa extends _jxa
    implements Ota {

  hia field_8;
  bool field_c;
  bool field_10;
  bool field_14;
  bool field_18;
  gxa field_1c;
  bool field_20;
}

// class id: 3358, size: 0x1c, field offset: 0x14
class _txa extends Nu<dynamic> {

  [closure] void _wIe(dynamic) {
    // ** addr: 0x79cbf8, size: -0x1
  }
}

// class id: 3359, size: 0x18, field offset: 0x14
class _oxa extends Nu<dynamic> {

  [closure] Zoa _HIe(dynamic, dpa, kia) {
    // ** addr: 0x6ccb2c, size: -0x1
  }
}

// class id: 3638, size: 0x14, field offset: 0x10
//   const constructor, 
class _uxa extends kH {
}

// class id: 4127, size: 0x10, field offset: 0xc
//   const constructor, 
class sxa extends Ku {
}

// class id: 4128, size: 0x1c, field offset: 0xc
//   const constructor, 
class nxa extends Ku {
}

// class id: 5943, size: 0x14, field offset: 0x14
enum gxa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
