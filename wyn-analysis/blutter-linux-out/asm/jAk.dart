// lib: , url: JAk

// class id: 1049370, size: 0x8
class :: {
}

// class id: 2138, size: 0x54, field offset: 0x50
class _xca extends rI {
}

// class id: 2144, size: 0x64, field offset: 0x54
//   transformed mixin,
abstract class _Cca extends _PV
     with OY<X0 bound Zba, X1 bound jca> {
}

// class id: 2145, size: 0x64, field offset: 0x64
//   transformed mixin,
abstract class _vca extends _Cca
     with Eca {
}

// class id: 2146, size: 0x15c, field offset: 0x64
class uca extends _vca
    implements wca {

  late fs _NQe; // offset: 0x130
  late final _Aca _iQe; // offset: 0x74
  late hN _tNd; // offset: 0x11c
  late uM _JQe; // offset: 0x120
  late pu _FQe; // offset: 0x104

  [closure] fs <anonymous closure>(dynamic, fs?, nu) {
    // ** addr: 0x3587a0, size: -0x1
  }
  [closure] nu <anonymous closure>(dynamic, nu) {
    // ** addr: 0x3534bc, size: -0x1
  }
  [closure] void thd(dynamic) {
    // ** addr: 0x3c87a8, size: -0x1
  }
  [closure] void _mRe(dynamic) {
    // ** addr: 0x3c8770, size: -0x1
  }
  [closure] double egd(dynamic, double) {
    // ** addr: 0x390d24, size: -0x1
  }
  [closure] double dgd(dynamic, double) {
    // ** addr: 0x3a7a38, size: -0x1
  }
  [closure] double cgd(dynamic, double) {
    // ** addr: 0x38bf48, size: -0x1
  }
  [closure] double bgd(dynamic, double) {
    // ** addr: 0x39e73c, size: -0x1
  }
  [closure] void _lSe(dynamic, uda, es) {
    // ** addr: 0x4113f8, size: -0x1
  }
  [closure] void _kpd(dynamic, NM) {
    // ** addr: 0x3c86f8, size: -0x1
  }
  [closure] void _lpd(dynamic) {
    // ** addr: 0x3c863c, size: -0x1
  }
  [closure] void _UXd(dynamic) {
    // ** addr: 0x3b5a44, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3f9f90, size: -0x1
  }
  [closure] void _uRe(dynamic, Tja) {
    // ** addr: 0x3f25bc, size: -0x1
  }
  [closure] void _sRe(dynamic, String) {
    // ** addr: 0x3f2580, size: -0x1
  }
  [closure] void _zRe(dynamic, bool) {
    // ** addr: 0x3f2544, size: -0x1
  }
  [closure] void _xRe(dynamic, bool) {
    // ** addr: 0x3f2508, size: -0x1
  }
  [closure] void _yRe(dynamic, bool) {
    // ** addr: 0x3f24cc, size: -0x1
  }
  [closure] void _vRe(dynamic, bool) {
    // ** addr: 0x3f2490, size: -0x1
  }
}

// class id: 2260, size: 0x28, field offset: 0x8
class tca extends Object
    implements xa<X0> {
}

// class id: 2261, size: 0x10, field offset: 0x8
//   const constructor, 
class sca extends Object {
}

// class id: 2784, size: 0x24, field offset: 0x24
abstract class yca extends mJ {
}

// class id: 2785, size: 0x28, field offset: 0x24
class _Bca extends yca {

  void KEc(_Bca, (dynamic) => void) {
    // ** addr: 0xaa778c, size: 0x6c
    // 0xaa778c: EnterFrame
    //     0xaa778c: stp             fp, lr, [SP, #-0x10]!
    //     0xaa7790: mov             fp, SP
    // 0xaa7794: CheckStackOverflow
    //     0xaa7794: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa7798: cmp             SP, x16
    //     0xaa779c: b.ls            #0xaa77d8
    // 0xaa77a0: ldr             x0, [fp, #0x10]
    // 0xaa77a4: r2 = Null
    //     0xaa77a4: mov             x2, NULL
    // 0xaa77a8: r1 = Null
    //     0xaa77a8: mov             x1, NULL
    // 0xaa77ac: r8 = (dynamic this) => void?
    //     0xaa77ac: add             x8, PP, #0x24, lsl #12  ; [pp+0x24c18] FunctionType: (dynamic this) => void?
    //     0xaa77b0: ldr             x8, [x8, #0xc18]
    // 0xaa77b4: r3 = Null
    //     0xaa77b4: add             x3, PP, #0x59, lsl #12  ; [pp+0x59b50] Null
    //     0xaa77b8: ldr             x3, [x3, #0xb50]
    // 0xaa77bc: r0 = DefaultTypeTest()
    //     0xaa77bc: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xaa77c0: ldr             x1, [fp, #0x18]
    // 0xaa77c4: ldr             x2, [fp, #0x10]
    // 0xaa77c8: r0 = call 0x41ae44
    //     0xaa77c8: bl              #0x41ae44
    // 0xaa77cc: LeaveFrame
    //     0xaa77cc: mov             SP, fp
    //     0xaa77d0: ldp             fp, lr, [SP], #0x10
    // 0xaa77d4: ret
    //     0xaa77d4: ret             
    // 0xaa77d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa77d8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa77dc: b               #0xaa77a0
  }
}

// class id: 2786, size: 0x48, field offset: 0x24
class _Aca extends yca {

  late final Paint BSe; // offset: 0x30
}

// class id: 2787, size: 0x38, field offset: 0x24
class _zca extends yca {
}
