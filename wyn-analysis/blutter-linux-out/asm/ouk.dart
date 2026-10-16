// lib: , url: OUk

// class id: 1050384, size: 0x8
class :: {
}

// class id: 248, size: 0xdc, field offset: 0x8
class tkb extends Object {

  static late final tkb _Fyc; // offset: 0x14a8
  static late final int _uQh; // offset: 0x14b4
  static late final int _zQh; // offset: 0x14bc

  [closure] Future<void> <anonymous closure>(dynamic, S) async {
    // ** addr: 0xae5fd8, size: 0x154
    // 0xae5fd8: EnterFrame
    //     0xae5fd8: stp             fp, lr, [SP, #-0x10]!
    //     0xae5fdc: mov             fp, SP
    // 0xae5fe0: AllocStack(0x18)
    //     0xae5fe0: sub             SP, SP, #0x18
    // 0xae5fe4: SetupParameters(tkb this /* r1 */)
    //     0xae5fe4: stur            NULL, [fp, #-8]
    //     0xae5fe8: movz            x0, #0
    //     0xae5fec: add             x1, fp, w0, sxtw #2
    //     0xae5ff0: ldr             x1, [x1, #0x18]
    //     0xae5ff4: ldur            w2, [x1, #0x17]
    //     0xae5ff8: add             x2, x2, HEAP, lsl #32
    //     0xae5ffc: stur            x2, [fp, #-0x10]
    // 0xae6000: CheckStackOverflow
    //     0xae6000: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae6004: cmp             SP, x16
    //     0xae6008: b.ls            #0xae6120
    // 0xae600c: InitAsync() -> Future<void?>
    //     0xae600c: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xae6010: bl              #0xa75e10  ; InitAsyncStub
    // 0xae6014: ldur            x2, [fp, #-0x10]
    // 0xae6018: LoadField: r3 = r2->field_f
    //     0xae6018: ldur            w3, [x2, #0xf]
    // 0xae601c: DecompressPointer r3
    //     0xae601c: add             x3, x3, HEAP, lsl #32
    // 0xae6020: stur            x3, [fp, #-0x18]
    // 0xae6024: LoadField: r0 = r3->field_6f
    //     0xae6024: ldur            w0, [x3, #0x6f]
    // 0xae6028: DecompressPointer r0
    //     0xae6028: add             x0, x0, HEAP, lsl #32
    // 0xae602c: LoadField: r4 = r0->field_7
    //     0xae602c: ldur            w4, [x0, #7]
    // 0xae6030: DecompressPointer r4
    //     0xae6030: add             x4, x4, HEAP, lsl #32
    // 0xae6034: LoadField: r0 = r4->field_13
    //     0xae6034: ldur            w0, [x4, #0x13]
    // 0xae6038: r1 = LoadInt32Instr(r0)
    //     0xae6038: sbfx            x1, x0, #1, #0x1f
    // 0xae603c: mov             x0, x1
    // 0xae6040: r1 = 1
    //     0xae6040: movz            x1, #0x1
    // 0xae6044: cmp             x1, x0
    // 0xae6048: b.hs            #0xae6128
    // 0xae604c: LoadField: d0 = r4->field_1f
    //     0xae604c: ldur            d0, [x4, #0x1f]
    // 0xae6050: fmul            d1, d0, d0
    // 0xae6054: ArrayLoad: d0 = r4[0]  ; List_8
    //     0xae6054: ldur            d0, [x4, #0x17]
    // 0xae6058: fmul            d2, d0, d0
    // 0xae605c: fadd            d0, d1, d2
    // 0xae6060: fsqrt           d1, d0
    // 0xae6064: d0 = 0.300000
    //     0xae6064: add             x17, PP, #0xc, lsl #12  ; [pp+0xce60] IMM: double(0.3) from 0x3fd3333333333333
    //     0xae6068: ldr             d0, [x17, #0xe60]
    // 0xae606c: fcmp            d1, d0
    // 0xae6070: b.le            #0xae60dc
    // 0xae6074: r0 = InitLateStaticField(0x14b4) // [OUk] tkb::_uQh
    //     0xae6074: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xae6078: ldr             x0, [x0, #0x2968]
    //     0xae607c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xae6080: cmp             w0, w16
    //     0xae6084: b.ne            #0xae6094
    //     0xae6088: add             x2, PP, #0x19, lsl #12  ; [pp+0x19f38] Field <tkb._uQh@1813513639>: static late final (offset: 0x14b4)
    //     0xae608c: ldr             x2, [x2, #0xf38]
    //     0xae6090: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xae6094: r1 = LoadInt32Instr(r0)
    //     0xae6094: sbfx            x1, x0, #1, #0x1f
    //     0xae6098: tbz             w0, #0, #0xae60a0
    //     0xae609c: ldur            x1, [x0, #7]
    // 0xae60a0: ldur            x0, [fp, #-0x18]
    // 0xae60a4: StoreField: r0->field_67 = r1
    //     0xae60a4: stur            x1, [x0, #0x67]
    // 0xae60a8: ldur            x0, [fp, #-0x10]
    // 0xae60ac: LoadField: r1 = r0->field_f
    //     0xae60ac: ldur            w1, [x0, #0xf]
    // 0xae60b0: DecompressPointer r1
    //     0xae60b0: add             x1, x1, HEAP, lsl #32
    // 0xae60b4: LoadField: r0 = r1->field_33
    //     0xae60b4: ldur            w0, [x1, #0x33]
    // 0xae60b8: DecompressPointer r0
    //     0xae60b8: add             x0, x0, HEAP, lsl #32
    // 0xae60bc: tbnz            w0, #4, #0xae6118
    // 0xae60c0: r2 = false
    //     0xae60c0: add             x2, NULL, #0x30  ; false
    // 0xae60c4: StoreField: r1->field_33 = r2
    //     0xae60c4: stur            w2, [x1, #0x33]
    // 0xae60c8: LoadField: r0 = r1->field_43
    //     0xae60c8: ldur            w0, [x1, #0x43]
    // 0xae60cc: DecompressPointer r0
    //     0xae60cc: add             x0, x0, HEAP, lsl #32
    // 0xae60d0: mov             x1, x0
    // 0xae60d4: r0 = call 0x96f500
    //     0xae60d4: bl              #0x96f500
    // 0xae60d8: b               #0xae6118
    // 0xae60dc: mov             x0, x3
    // 0xae60e0: LoadField: r1 = r0->field_67
    //     0xae60e0: ldur            x1, [x0, #0x67]
    // 0xae60e4: cmp             x1, #0
    // 0xae60e8: b.le            #0xae60f8
    // 0xae60ec: sub             x2, x1, #1
    // 0xae60f0: StoreField: r0->field_67 = r2
    //     0xae60f0: stur            x2, [x0, #0x67]
    // 0xae60f4: b               #0xae6118
    // 0xae60f8: LoadField: r1 = r0->field_33
    //     0xae60f8: ldur            w1, [x0, #0x33]
    // 0xae60fc: DecompressPointer r1
    //     0xae60fc: add             x1, x1, HEAP, lsl #32
    // 0xae6100: tbz             w1, #4, #0xae6118
    // 0xae6104: r2 = true
    //     0xae6104: add             x2, NULL, #0x20  ; true
    // 0xae6108: StoreField: r0->field_33 = r2
    //     0xae6108: stur            w2, [x0, #0x33]
    // 0xae610c: LoadField: r1 = r0->field_43
    //     0xae610c: ldur            w1, [x0, #0x43]
    // 0xae6110: DecompressPointer r1
    //     0xae6110: add             x1, x1, HEAP, lsl #32
    // 0xae6114: r0 = call 0x96f500
    //     0xae6114: bl              #0x96f500
    // 0xae6118: r0 = Null
    //     0xae6118: mov             x0, NULL
    // 0xae611c: r0 = ReturnAsyncNotFuture()
    //     0xae611c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae6120: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae6120: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae6124: b               #0xae600c
    // 0xae6128: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xae6128: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] Future<Null> <anonymous closure>(dynamic, bool) async {
    // ** addr: 0xae612c, size: 0x148
    // 0xae612c: EnterFrame
    //     0xae612c: stp             fp, lr, [SP, #-0x10]!
    //     0xae6130: mov             fp, SP
    // 0xae6134: AllocStack(0x20)
    //     0xae6134: sub             SP, SP, #0x20
    // 0xae6138: SetupParameters(tkb this /* r1 */, dynamic _ /* r3, fp-0x18 */)
    //     0xae6138: stur            NULL, [fp, #-8]
    //     0xae613c: movz            x0, #0
    //     0xae6140: add             x1, fp, w0, sxtw #2
    //     0xae6144: ldr             x1, [x1, #0x18]
    //     0xae6148: add             x3, fp, w0, sxtw #2
    //     0xae614c: ldr             x3, [x3, #0x10]
    //     0xae6150: stur            x3, [fp, #-0x18]
    //     0xae6154: ldur            w2, [x1, #0x17]
    //     0xae6158: add             x2, x2, HEAP, lsl #32
    //     0xae615c: stur            x2, [fp, #-0x10]
    // 0xae6160: CheckStackOverflow
    //     0xae6160: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae6164: cmp             SP, x16
    //     0xae6168: b.ls            #0xae626c
    // 0xae616c: InitAsync() -> Future<Null?>
    //     0xae616c: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xae6170: bl              #0xa75e10  ; InitAsyncStub
    // 0xae6174: ldur            x0, [fp, #-0x10]
    // 0xae6178: LoadField: r1 = r0->field_f
    //     0xae6178: ldur            w1, [x0, #0xf]
    // 0xae617c: DecompressPointer r1
    //     0xae617c: add             x1, x1, HEAP, lsl #32
    // 0xae6180: ldur            x3, [fp, #-0x18]
    // 0xae6184: StoreField: r1->field_27 = r3
    //     0xae6184: stur            w3, [x1, #0x27]
    // 0xae6188: r0 = call 0x345420
    //     0xae6188: bl              #0x345420
    // 0xae618c: mov             x1, x0
    // 0xae6190: ldur            x3, [fp, #-0x18]
    // 0xae6194: r2 = "sensor.absolute_orientation"
    //     0xae6194: add             x2, PP, #0x19, lsl #12  ; [pp+0x19f80] "sensor.absolute_orientation"
    //     0xae6198: ldr             x2, [x2, #0xf80]
    // 0xae619c: r0 = __unknown_function__()
    //     0xae619c: bl              #0xa78db4  ; [] ::__unknown_function__
    // 0xae61a0: ldur            x0, [fp, #-0x18]
    // 0xae61a4: tbnz            w0, #4, #0xae6264
    // 0xae61a8: r0 = InitLateStaticField(0x1294) // [HNk] ::ohh
    //     0xae61a8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xae61ac: ldr             x0, [x0, #0x2528]
    //     0xae61b0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xae61b4: cmp             w0, w16
    //     0xae61b8: b.ne            #0xae61c8
    //     0xae61bc: add             x2, PP, #0x19, lsl #12  ; [pp+0x19ee8] Field <::.ohh>: static late final (offset: 0x1294)
    //     0xae61c0: ldr             x2, [x2, #0xee8]
    //     0xae61c4: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xae61c8: mov             x1, x0
    // 0xae61cc: stur            x0, [fp, #-0x18]
    // 0xae61d0: r0 = call 0x7dbfc0
    //     0xae61d0: bl              #0x7dbfc0
    // 0xae61d4: mov             x1, x0
    // 0xae61d8: stur            x1, [fp, #-0x20]
    // 0xae61dc: r0 = Await()
    //     0xae61dc: bl              #0xa75a20  ; AwaitStub
    // 0xae61e0: r16 = true
    //     0xae61e0: add             x16, NULL, #0x20  ; true
    // 0xae61e4: cmp             w0, w16
    // 0xae61e8: b.ne            #0xae6228
    // 0xae61ec: ldur            x0, [fp, #-0x10]
    // 0xae61f0: ldur            x1, [fp, #-0x18]
    // 0xae61f4: r0 = call 0x7dbe84
    //     0xae61f4: bl              #0x7dbe84
    // 0xae61f8: mov             x3, x0
    // 0xae61fc: ldur            x0, [fp, #-0x10]
    // 0xae6200: stur            x3, [fp, #-0x20]
    // 0xae6204: LoadField: r2 = r0->field_f
    //     0xae6204: ldur            w2, [x0, #0xf]
    // 0xae6208: DecompressPointer r2
    //     0xae6208: add             x2, x2, HEAP, lsl #32
    // 0xae620c: r1 = Function 'WQh':.
    //     0xae620c: add             x1, PP, #0x19, lsl #12  ; [pp+0x19f88] AnonymousClosure: (0x7dc25c), of [OUk] tkb
    //     0xae6210: ldr             x1, [x1, #0xf88]
    // 0xae6214: r0 = AllocateClosure()
    //     0xae6214: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xae6218: ldur            x1, [fp, #-0x20]
    // 0xae621c: mov             x2, x0
    // 0xae6220: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xae6220: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xae6224: r0 = call 0x998970
    //     0xae6224: bl              #0x998970
    // 0xae6228: ldur            x0, [fp, #-0x10]
    // 0xae622c: ldur            x1, [fp, #-0x18]
    // 0xae6230: r0 = call 0x7dbc28
    //     0xae6230: bl              #0x7dbc28
    // 0xae6234: mov             x3, x0
    // 0xae6238: ldur            x0, [fp, #-0x10]
    // 0xae623c: stur            x3, [fp, #-0x18]
    // 0xae6240: LoadField: r2 = r0->field_f
    //     0xae6240: ldur            w2, [x0, #0xf]
    // 0xae6244: DecompressPointer r2
    //     0xae6244: add             x2, x2, HEAP, lsl #32
    // 0xae6248: r1 = Function 'XQh':.
    //     0xae6248: add             x1, PP, #0x19, lsl #12  ; [pp+0x19f90] AnonymousClosure: (0x7dbff0), of [OUk] tkb
    //     0xae624c: ldr             x1, [x1, #0xf90]
    // 0xae6250: r0 = AllocateClosure()
    //     0xae6250: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xae6254: ldur            x1, [fp, #-0x18]
    // 0xae6258: mov             x2, x0
    // 0xae625c: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xae625c: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xae6260: r0 = call 0x998970
    //     0xae6260: bl              #0x998970
    // 0xae6264: r0 = Null
    //     0xae6264: mov             x0, NULL
    // 0xae6268: r0 = ReturnAsyncNotFuture()
    //     0xae6268: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae626c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae626c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae6270: b               #0xae616c
  }
  [closure] void <anonymous closure>(dynamic, ZYa) {
    // ** addr: 0x7dd508, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, bool) {
    // ** addr: 0x7db3e4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, XYa) {
    // ** addr: 0x7db700, size: -0x1
  }
  [closure] void WQh(dynamic, WYa) {
    // ** addr: 0x7dc25c, size: -0x1
  }
  [closure] void XQh(dynamic, YYa) {
    // ** addr: 0x7dbff0, size: -0x1
  }
}

// class id: 249, size: 0x30, field offset: 0x8
class skb extends Object {

  late final double fRh; // offset: 0x8
  late final double gRh; // offset: 0xc
}

// class id: 250, size: 0x8, field offset: 0x8
abstract class rkb extends Object {
}

// class id: 251, size: 0x2c, field offset: 0x8
class qkb extends Object {
}

// class id: 2729, size: 0x48, field offset: 0x24
class pkb extends mJ {

  [closure] void <anonymous closure>(dynamic, double) {
    // ** addr: 0x7da0a0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, bool) {
    // ** addr: 0x7da050, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, bool) {
    // ** addr: 0x7da000, size: -0x1
  }
}
