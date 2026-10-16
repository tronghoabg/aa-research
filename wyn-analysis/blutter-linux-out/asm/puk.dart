// lib: , url: PUk

// class id: 1050385, size: 0x8
class :: {

  static late CMa VYh; // offset: 0x14e4
  static late final fWa _UYh; // offset: 0x14e0

  [closure] static Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xad60a4, size: 0x68
    // 0xad60a4: EnterFrame
    //     0xad60a4: stp             fp, lr, [SP, #-0x10]!
    //     0xad60a8: mov             fp, SP
    // 0xad60ac: AllocStack(0x18)
    //     0xad60ac: sub             SP, SP, #0x18
    // 0xad60b0: SetupParameters(dynamic _ /* r1 */)
    //     0xad60b0: stur            NULL, [fp, #-8]
    //     0xad60b4: movz            x0, #0
    //     0xad60b8: add             x1, fp, w0, sxtw #2
    //     0xad60bc: ldr             x1, [x1, #0x10]
    //     0xad60c0: ldur            w2, [x1, #0x17]
    //     0xad60c4: add             x2, x2, HEAP, lsl #32
    //     0xad60c8: stur            x2, [fp, #-0x10]
    // 0xad60cc: CheckStackOverflow
    //     0xad60cc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad60d0: cmp             SP, x16
    //     0xad60d4: b.ls            #0xad6104
    // 0xad60d8: InitAsync() -> Future<Null?>
    //     0xad60d8: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xad60dc: bl              #0xa75e10  ; InitAsyncStub
    // 0xad60e0: ldur            x0, [fp, #-0x10]
    // 0xad60e4: LoadField: r1 = r0->field_f
    //     0xad60e4: ldur            w1, [x0, #0xf]
    // 0xad60e8: DecompressPointer r1
    //     0xad60e8: add             x1, x1, HEAP, lsl #32
    // 0xad60ec: r0 = __unknown_function__()
    //     0xad60ec: bl              #0xad610c  ; [] ::__unknown_function__
    // 0xad60f0: mov             x1, x0
    // 0xad60f4: stur            x1, [fp, #-0x18]
    // 0xad60f8: r0 = Await()
    //     0xad60f8: bl              #0xa75a20  ; AwaitStub
    // 0xad60fc: r0 = Null
    //     0xad60fc: mov             x0, NULL
    // 0xad6100: r0 = ReturnAsyncNotFuture()
    //     0xad6100: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad6104: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad6104: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad6108: b               #0xad60d8
  }
  [closure] static Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xad6214, size: 0x74
    // 0xad6214: EnterFrame
    //     0xad6214: stp             fp, lr, [SP, #-0x10]!
    //     0xad6218: mov             fp, SP
    // 0xad621c: AllocStack(0x10)
    //     0xad621c: sub             SP, SP, #0x10
    // 0xad6220: SetupParameters(dynamic _ /* r1 */)
    //     0xad6220: stur            NULL, [fp, #-8]
    //     0xad6224: movz            x0, #0
    //     0xad6228: add             x1, fp, w0, sxtw #2
    //     0xad622c: ldr             x1, [x1, #0x10]
    //     0xad6230: ldur            w2, [x1, #0x17]
    //     0xad6234: add             x2, x2, HEAP, lsl #32
    //     0xad6238: stur            x2, [fp, #-0x10]
    // 0xad623c: CheckStackOverflow
    //     0xad623c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad6240: cmp             SP, x16
    //     0xad6244: b.ls            #0xad6280
    // 0xad6248: InitAsync() -> Future<Null?>
    //     0xad6248: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xad624c: bl              #0xa75e10  ; InitAsyncStub
    // 0xad6250: r0 = InitLateStaticField(0x14e4) // [PUk] ::VYh
    //     0xad6250: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xad6254: ldr             x0, [x0, #0x29c8]
    //     0xad6258: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xad625c: cmp             w0, w16
    //     0xad6260: b.ne            #0xad6270
    //     0xad6264: add             x2, PP, #0x16, lsl #12  ; [pp+0x16210] Field <::.VYh>: static late (offset: 0x14e4)
    //     0xad6268: ldr             x2, [x2, #0x210]
    //     0xad626c: bl              #0xb27d24  ; InitLateStaticFieldStub
    // 0xad6270: mov             x1, x0
    // 0xad6274: r0 = __unknown_function__()
    //     0xad6274: bl              #0xad6288  ; [] ::__unknown_function__
    // 0xad6278: r0 = Null
    //     0xad6278: mov             x0, NULL
    // 0xad627c: r0 = ReturnAsyncNotFuture()
    //     0xad627c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad6280: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad6280: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad6284: b               #0xad6248
  }
  [closure] static Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xad69ec, size: 0x80
    // 0xad69ec: EnterFrame
    //     0xad69ec: stp             fp, lr, [SP, #-0x10]!
    //     0xad69f0: mov             fp, SP
    // 0xad69f4: AllocStack(0x18)
    //     0xad69f4: sub             SP, SP, #0x18
    // 0xad69f8: SetupParameters(dynamic _ /* r1 */)
    //     0xad69f8: stur            NULL, [fp, #-8]
    //     0xad69fc: movz            x0, #0
    //     0xad6a00: add             x1, fp, w0, sxtw #2
    //     0xad6a04: ldr             x1, [x1, #0x10]
    //     0xad6a08: ldur            w2, [x1, #0x17]
    //     0xad6a0c: add             x2, x2, HEAP, lsl #32
    //     0xad6a10: stur            x2, [fp, #-0x10]
    // 0xad6a14: CheckStackOverflow
    //     0xad6a14: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad6a18: cmp             SP, x16
    //     0xad6a1c: b.ls            #0xad6a64
    // 0xad6a20: InitAsync() -> Future<Null?>
    //     0xad6a20: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xad6a24: bl              #0xa75e10  ; InitAsyncStub
    // 0xad6a28: r0 = InitLateStaticField(0x14e4) // [PUk] ::VYh
    //     0xad6a28: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xad6a2c: ldr             x0, [x0, #0x29c8]
    //     0xad6a30: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xad6a34: cmp             w0, w16
    //     0xad6a38: b.ne            #0xad6a48
    //     0xad6a3c: add             x2, PP, #0x16, lsl #12  ; [pp+0x16210] Field <::.VYh>: static late (offset: 0x14e4)
    //     0xad6a40: ldr             x2, [x2, #0x210]
    //     0xad6a44: bl              #0xb27d24  ; InitLateStaticFieldStub
    // 0xad6a48: mov             x1, x0
    // 0xad6a4c: r0 = __unknown_function__()
    //     0xad6a4c: bl              #0xad6288  ; [] ::__unknown_function__
    // 0xad6a50: mov             x1, x0
    // 0xad6a54: stur            x1, [fp, #-0x18]
    // 0xad6a58: r0 = Await()
    //     0xad6a58: bl              #0xa75a20  ; AwaitStub
    // 0xad6a5c: r0 = Null
    //     0xad6a5c: mov             x0, NULL
    // 0xad6a60: r0 = ReturnAsyncNotFuture()
    //     0xad6a60: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad6a64: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad6a64: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad6a68: b               #0xad6a20
  }
  [closure] static Null <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x7494c0, size: -0x1
  }
}

// class id: 246, size: 0x40, field offset: 0x8
class wkb extends Object {

  static late final wkb _Fyc; // offset: 0x14dc
  late Eb<void> _kYh; // offset: 0x14

  [closure] Future<Null> <anonymous closure>(dynamic, void) async {
    // ** addr: 0xaf74f8, size: 0xd0
    // 0xaf74f8: EnterFrame
    //     0xaf74f8: stp             fp, lr, [SP, #-0x10]!
    //     0xaf74fc: mov             fp, SP
    // 0xaf7500: AllocStack(0x20)
    //     0xaf7500: sub             SP, SP, #0x20
    // 0xaf7504: SetupParameters(wkb this /* r1 */)
    //     0xaf7504: stur            NULL, [fp, #-8]
    //     0xaf7508: movz            x0, #0
    //     0xaf750c: add             x1, fp, w0, sxtw #2
    //     0xaf7510: ldr             x1, [x1, #0x18]
    //     0xaf7514: ldur            w2, [x1, #0x17]
    //     0xaf7518: add             x2, x2, HEAP, lsl #32
    //     0xaf751c: stur            x2, [fp, #-0x10]
    // 0xaf7520: CheckStackOverflow
    //     0xaf7520: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf7524: cmp             SP, x16
    //     0xaf7528: b.ls            #0xaf75c0
    // 0xaf752c: InitAsync() -> Future<Null?>
    //     0xaf752c: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xaf7530: bl              #0xa75e10  ; InitAsyncStub
    // 0xaf7534: ldur            x0, [fp, #-0x10]
    // 0xaf7538: LoadField: r1 = r0->field_f
    //     0xaf7538: ldur            w1, [x0, #0xf]
    // 0xaf753c: DecompressPointer r1
    //     0xaf753c: add             x1, x1, HEAP, lsl #32
    // 0xaf7540: stur            x1, [fp, #-0x18]
    // 0xaf7544: r0 = InitLateStaticField(0x107c) // [package:flutter_soloud/src/soloud.dart] lMa::Kpc
    //     0xaf7544: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaf7548: ldr             x0, [x0, #0x20f8]
    //     0xaf754c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaf7550: cmp             w0, w16
    //     0xaf7554: b.ne            #0xaf7564
    //     0xaf7558: add             x2, PP, #0x16, lsl #12  ; [pp+0x16d90] Field <lMa.Kpc>: static late final (offset: 0x107c)
    //     0xaf755c: ldr             x2, [x2, #0xd90]
    //     0xaf7560: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaf7564: mov             x1, x0
    // 0xaf7568: r0 = __unknown_function__()
    //     0xaf7568: bl              #0xaf75c8  ; [] ::__unknown_function__
    // 0xaf756c: mov             x1, x0
    // 0xaf7570: stur            x1, [fp, #-0x20]
    // 0xaf7574: r0 = Await()
    //     0xaf7574: bl              #0xa75a20  ; AwaitStub
    // 0xaf7578: ldur            x1, [fp, #-0x18]
    // 0xaf757c: StoreField: r1->field_2f = r0
    //     0xaf757c: stur            w0, [x1, #0x2f]
    //     0xaf7580: ldurb           w16, [x1, #-1]
    //     0xaf7584: ldurb           w17, [x0, #-1]
    //     0xaf7588: and             x16, x17, x16, lsr #2
    //     0xaf758c: tst             x16, HEAP, lsr #32
    //     0xaf7590: b.eq            #0xaf7598
    //     0xaf7594: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xaf7598: ldur            x0, [fp, #-0x10]
    // 0xaf759c: LoadField: r1 = r0->field_f
    //     0xaf759c: ldur            w1, [x0, #0xf]
    // 0xaf75a0: DecompressPointer r1
    //     0xaf75a0: add             x1, x1, HEAP, lsl #32
    // 0xaf75a4: LoadField: r0 = r1->field_2b
    //     0xaf75a4: ldur            w0, [x1, #0x2b]
    // 0xaf75a8: DecompressPointer r0
    //     0xaf75a8: add             x0, x0, HEAP, lsl #32
    // 0xaf75ac: mov             x1, x0
    // 0xaf75b0: r4 = const [0, 0x1, 0, 0x1, null]
    //     0xaf75b0: ldr             x4, [PP, #0x68]  ; [pp+0x68] List(5) [0, 0x1, 0, 0x1, Null]
    // 0xaf75b4: r0 = call 0x9ebb8c
    //     0xaf75b4: bl              #0x9ebb8c
    // 0xaf75b8: r0 = Null
    //     0xaf75b8: mov             x0, NULL
    // 0xaf75bc: r0 = ReturnAsyncNotFuture()
    //     0xaf75bc: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaf75c0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf75c0: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf75c4: b               #0xaf752c
  }
  [closure] void _uYh(dynamic) {
    // ** addr: 0x7ec370, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x80772c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, jWa) {
    // ** addr: 0x80766c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x807580, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x8074e4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x807490, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x807624, size: -0x1
  }
}

// class id: 247, size: 0x24, field offset: 0x8
//   const constructor, 
class vkb extends Object {

  _Mint field_c;
  ukb field_14;
  bool field_18;
  _OneByteString field_20;
}

// class id: 5790, size: 0x14, field offset: 0x14
enum ukb extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
