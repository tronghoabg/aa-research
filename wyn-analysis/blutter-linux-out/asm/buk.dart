// lib: , url: bUk

// class id: 1050345, size: 0x8
class :: {
}

// class id: 308, size: 0x50, field offset: 0x8
//   const constructor, 
class gib extends Object {

  ka field_8;
  ka field_c;
  Yhb field_10;
  ka field_14;
  _ImmutableList<aib> field_18;
  bool field_1c;
  bool field_20;
  bool field_24;
  _Double field_28;
  _Double field_30;
  bool field_3c;
  Og field_40;
  _Mint field_44;
  bool field_4c;
}

// class id: 1857, size: 0x10, field offset: 0x8
class _iib extends _yla {
}

// class id: 2801, size: 0x6c, field offset: 0x2c
class hib extends vw<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic, S) async {
    // ** addr: 0xa81774, size: 0xa4
    // 0xa81774: EnterFrame
    //     0xa81774: stp             fp, lr, [SP, #-0x10]!
    //     0xa81778: mov             fp, SP
    // 0xa8177c: AllocStack(0x18)
    //     0xa8177c: sub             SP, SP, #0x18
    // 0xa81780: SetupParameters(hib this /* r1 */)
    //     0xa81780: stur            NULL, [fp, #-8]
    //     0xa81784: movz            x0, #0
    //     0xa81788: add             x1, fp, w0, sxtw #2
    //     0xa8178c: ldr             x1, [x1, #0x18]
    //     0xa81790: ldur            w2, [x1, #0x17]
    //     0xa81794: add             x2, x2, HEAP, lsl #32
    //     0xa81798: stur            x2, [fp, #-0x10]
    // 0xa8179c: CheckStackOverflow
    //     0xa8179c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa817a0: cmp             SP, x16
    //     0xa817a4: b.ls            #0xa81810
    // 0xa817a8: InitAsync() -> Future<void?>
    //     0xa817a8: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xa817ac: bl              #0xa75e10  ; InitAsyncStub
    // 0xa817b0: ldur            x0, [fp, #-0x10]
    // 0xa817b4: LoadField: r1 = r0->field_f
    //     0xa817b4: ldur            w1, [x0, #0xf]
    // 0xa817b8: DecompressPointer r1
    //     0xa817b8: add             x1, x1, HEAP, lsl #32
    // 0xa817bc: LoadField: r2 = r1->field_53
    //     0xa817bc: ldur            w2, [x1, #0x53]
    // 0xa817c0: DecompressPointer r2
    //     0xa817c0: add             x2, x2, HEAP, lsl #32
    // 0xa817c4: tbnz            w2, #4, #0xa817d0
    // 0xa817c8: r0 = Null
    //     0xa817c8: mov             x0, NULL
    // 0xa817cc: r0 = ReturnAsyncNotFuture()
    //     0xa817cc: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa817d0: r0 = __unknown_function__()
    //     0xa817d0: bl              #0xa81818  ; [] ::__unknown_function__
    // 0xa817d4: mov             x1, x0
    // 0xa817d8: stur            x1, [fp, #-0x18]
    // 0xa817dc: r0 = Await()
    //     0xa817dc: bl              #0xa75a20  ; AwaitStub
    // 0xa817e0: cmp             w0, NULL
    // 0xa817e4: b.ne            #0xa817f0
    // 0xa817e8: r0 = Null
    //     0xa817e8: mov             x0, NULL
    // 0xa817ec: r0 = ReturnAsyncNotFuture()
    //     0xa817ec: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa817f0: ldur            x1, [fp, #-0x10]
    // 0xa817f4: LoadField: r2 = r1->field_f
    //     0xa817f4: ldur            w2, [x1, #0xf]
    // 0xa817f8: DecompressPointer r2
    //     0xa817f8: add             x2, x2, HEAP, lsl #32
    // 0xa817fc: mov             x1, x2
    // 0xa81800: mov             x2, x0
    // 0xa81804: r0 = call 0x367ddc
    //     0xa81804: bl              #0x367ddc
    // 0xa81808: r0 = Null
    //     0xa81808: mov             x0, NULL
    // 0xa8180c: r0 = ReturnAsyncNotFuture()
    //     0xa8180c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa81810: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa81810: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa81814: b               #0xa817a8
  }
  void KEc(hib, (dynamic) => void) {
    // ** addr: 0xa818d8, size: 0x6c
    // 0xa818d8: EnterFrame
    //     0xa818d8: stp             fp, lr, [SP, #-0x10]!
    //     0xa818dc: mov             fp, SP
    // 0xa818e0: CheckStackOverflow
    //     0xa818e0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa818e4: cmp             SP, x16
    //     0xa818e8: b.ls            #0xa81924
    // 0xa818ec: ldr             x0, [fp, #0x10]
    // 0xa818f0: r2 = Null
    //     0xa818f0: mov             x2, NULL
    // 0xa818f4: r1 = Null
    //     0xa818f4: mov             x1, NULL
    // 0xa818f8: r8 = (dynamic this) => void?
    //     0xa818f8: add             x8, PP, #0x24, lsl #12  ; [pp+0x24c18] FunctionType: (dynamic this) => void?
    //     0xa818fc: ldr             x8, [x8, #0xc18]
    // 0xa81900: r3 = Null
    //     0xa81900: add             x3, PP, #0x37, lsl #12  ; [pp+0x37690] Null
    //     0xa81904: ldr             x3, [x3, #0x690]
    // 0xa81908: r0 = DefaultTypeTest()
    //     0xa81908: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa8190c: ldr             x1, [fp, #0x18]
    // 0xa81910: ldr             x2, [fp, #0x10]
    // 0xa81914: r0 = call 0x41ae08
    //     0xa81914: bl              #0x41ae08
    // 0xa81918: LeaveFrame
    //     0xa81918: mov             SP, fp
    //     0xa8191c: ldp             fp, lr, [SP], #0x10
    // 0xa81920: ret
    //     0xa81920: ret             
    // 0xa81924: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa81924: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa81928: b               #0xa818ec
  }
  [closure] void myj(dynamic, Cib) {
    // ** addr: 0x6fb63c, size: -0x1
  }
  [closure] void Fwf(dynamic, Object) {
    // ** addr: 0x6fb4d4, size: -0x1
  }
  [closure] Future<void> <anonymous closure>(dynamic, void) {
    // ** addr: 0x6fb9a4, size: -0x1
  }
}

// class id: 3321, size: 0x18, field offset: 0x14
class _kib extends Nu<dynamic> {

  late int _PAh; // offset: 0x14

  [closure] void _WAh(dynamic) {
    // ** addr: 0x7d4404, size: -0x1
  }
}

// class id: 3878, size: 0x18, field offset: 0xc
//   const constructor, 
class _lib extends iw {
}

// class id: 4102, size: 0x10, field offset: 0xc
//   const constructor, 
class jib extends Ku {
}
