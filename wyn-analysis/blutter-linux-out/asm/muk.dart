// lib: , url: MUk

// class id: 1050382, size: 0x8
class :: {
}

// class id: 253, size: 0x18, field offset: 0x8
class nkb extends Object {

  [closure] void <anonymous closure>(dynamic, lob?) {
    // ** addr: 0x7f3150, size: -0x1
  }
}

// class id: 254, size: 0xfc, field offset: 0x8
class lkb extends Object {

  static late final lkb _Fyc; // offset: 0x1498
  static late final oYa ko; // offset: 0x149c
  static late final Qjb _eOh; // offset: 0x1490
  static late final wkb _fOh; // offset: 0x1494
  late final nkb SOh; // offset: 0xa8
  late final nkb VOh; // offset: 0xb4
  late final nkb WOh; // offset: 0xb8
  late final nkb XOh; // offset: 0xbc
  late final nkb YOh; // offset: 0xc0
  late final nkb ZOh; // offset: 0xc4
  late final nkb aPh; // offset: 0xc8
  late final nkb bPh; // offset: 0xcc
  late final nkb TOh; // offset: 0xac
  late final nkb UOh; // offset: 0xb0

  [closure] Future<void> <anonymous closure>(dynamic, XMa) async {
    // ** addr: 0xaecd90, size: 0x144
    // 0xaecd90: EnterFrame
    //     0xaecd90: stp             fp, lr, [SP, #-0x10]!
    //     0xaecd94: mov             fp, SP
    // 0xaecd98: AllocStack(0x38)
    //     0xaecd98: sub             SP, SP, #0x38
    // 0xaecd9c: SetupParameters(lkb this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xaecd9c: stur            NULL, [fp, #-8]
    //     0xaecda0: movz            x0, #0
    //     0xaecda4: add             x1, fp, w0, sxtw #2
    //     0xaecda8: ldr             x1, [x1, #0x18]
    //     0xaecdac: add             x2, fp, w0, sxtw #2
    //     0xaecdb0: ldr             x2, [x2, #0x10]
    //     0xaecdb4: stur            x2, [fp, #-0x18]
    //     0xaecdb8: ldur            w3, [x1, #0x17]
    //     0xaecdbc: add             x3, x3, HEAP, lsl #32
    //     0xaecdc0: stur            x3, [fp, #-0x10]
    // 0xaecdc4: CheckStackOverflow
    //     0xaecdc4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaecdc8: cmp             SP, x16
    //     0xaecdcc: b.ls            #0xaececc
    // 0xaecdd0: InitAsync() -> Future<void?>
    //     0xaecdd0: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xaecdd4: bl              #0xa75e10  ; InitAsyncStub
    // 0xaecdd8: r0 = Ka()
    //     0xaecdd8: bl              #0xa6f7bc  ; AllocateKaStub -> Ka (size=0x14)
    // 0xaecddc: stur            x0, [fp, #-0x20]
    // 0xaecde0: StoreField: r0->field_7 = rZR
    //     0xaecde0: stur            xzr, [x0, #7]
    // 0xaecde4: StoreField: r0->field_f = rZR
    //     0xaecde4: stur            wzr, [x0, #0xf]
    // 0xaecde8: r0 = InitLateStaticField(0x37c) // [dart:core] Ka::_FEb
    //     0xaecde8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaecdec: ldr             x0, [x0, #0x6f8]
    //     0xaecdf0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaecdf4: cmp             w0, w16
    //     0xaecdf8: b.ne            #0xaece04
    //     0xaecdfc: ldr             x2, [PP, #0x1530]  ; [pp+0x1530] Field <Ka._FEb@0150898>: static late final (offset: 0x37c)
    //     0xaece00: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaece04: ldur            x1, [fp, #-0x20]
    // 0xaece08: r0 = call 0x2f04ac
    //     0xaece08: bl              #0x2f04ac
    // 0xaece0c: ldur            x0, [fp, #-0x10]
    // 0xaece10: LoadField: r1 = r0->field_f
    //     0xaece10: ldur            w1, [x0, #0xf]
    // 0xaece14: DecompressPointer r1
    //     0xaece14: add             x1, x1, HEAP, lsl #32
    // 0xaece18: ldur            x2, [fp, #-0x18]
    // 0xaece1c: r0 = __unknown_function__()
    //     0xaece1c: bl              #0xaeced4  ; [] ::__unknown_function__
    // 0xaece20: mov             x1, x0
    // 0xaece24: stur            x1, [fp, #-0x18]
    // 0xaece28: r0 = Await()
    //     0xaece28: bl              #0xa75a20  ; AwaitStub
    // 0xaece2c: ldur            x1, [fp, #-0x20]
    // 0xaece30: r0 = call 0x304360
    //     0xaece30: bl              #0x304360
    // 0xaece34: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xaece34: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaece38: ldr             x0, [x0, #0x28a8]
    //     0xaece3c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaece40: cmp             w0, w16
    //     0xaece44: b.ne            #0xaece54
    //     0xaece48: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xaece4c: ldr             x2, [x2, #0xc90]
    //     0xaece50: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaece54: stur            x0, [fp, #-0x10]
    // 0xaece58: r16 = <Zjb>
    //     0xaece58: add             x16, PP, #0x11, lsl #12  ; [pp+0x117f8] TypeArguments: <Zjb>
    //     0xaece5c: ldr             x16, [x16, #0x7f8]
    // 0xaece60: stp             x0, x16, [SP]
    // 0xaece64: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xaece64: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xaece68: r0 = call 0x346fb4
    //     0xaece68: bl              #0x346fb4
    // 0xaece6c: stur            x0, [fp, #-0x18]
    // 0xaece70: r16 = <Zjb>
    //     0xaece70: add             x16, PP, #0x11, lsl #12  ; [pp+0x117f8] TypeArguments: <Zjb>
    //     0xaece74: ldr             x16, [x16, #0x7f8]
    // 0xaece78: ldur            lr, [fp, #-0x10]
    // 0xaece7c: stp             lr, x16, [SP]
    // 0xaece80: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xaece80: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xaece84: r0 = call 0x346fb4
    //     0xaece84: bl              #0x346fb4
    // 0xaece88: LoadField: d0 = r0->field_57
    //     0xaece88: ldur            d0, [x0, #0x57]
    // 0xaece8c: d1 = 0.800000
    //     0xaece8c: add             x17, PP, #0xc, lsl #12  ; [pp+0xcd98] IMM: double(0.8) from 0x3fe999999999999a
    //     0xaece90: ldr             d1, [x17, #0xd98]
    // 0xaece94: fmul            d2, d0, d1
    // 0xaece98: ldur            x1, [fp, #-0x20]
    // 0xaece9c: stur            d2, [fp, #-0x28]
    // 0xaecea0: r0 = call 0x30440c
    //     0xaecea0: bl              #0x30440c
    // 0xaecea4: scvtf           d0, x0
    // 0xaecea8: d1 = 0.200000
    //     0xaecea8: add             x17, PP, #0x14, lsl #12  ; [pp+0x14e58] IMM: double(0.19999999999999996) from 0x3fc9999999999998
    //     0xaeceac: ldr             d1, [x17, #0xe58]
    // 0xaeceb0: fmul            d2, d0, d1
    // 0xaeceb4: ldur            d0, [fp, #-0x28]
    // 0xaeceb8: fadd            d1, d0, d2
    // 0xaecebc: ldur            x1, [fp, #-0x18]
    // 0xaecec0: StoreField: r1->field_57 = d1
    //     0xaecec0: stur            d1, [x1, #0x57]
    // 0xaecec4: r0 = Null
    //     0xaecec4: mov             x0, NULL
    // 0xaecec8: r0 = ReturnAsyncNotFuture()
    //     0xaecec8: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaececc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaececc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaeced0: b               #0xaecdd0
  }
  [closure] void <anonymous closure>(dynamic, Dnb) {
    // ** addr: 0xaf07ac, size: 0x170
    // 0xaf07ac: EnterFrame
    //     0xaf07ac: stp             fp, lr, [SP, #-0x10]!
    //     0xaf07b0: mov             fp, SP
    // 0xaf07b4: AllocStack(0x60)
    //     0xaf07b4: sub             SP, SP, #0x60
    // 0xaf07b8: SetupParameters([dynamic _ /* r0 */])
    //     0xaf07b8: ldr             x0, [fp, #0x18]
    //     0xaf07bc: ldur            w1, [x0, #0x17]
    //     0xaf07c0: add             x1, x1, HEAP, lsl #32
    //     0xaf07c4: stur            x1, [fp, #-0x48]
    // 0xaf07c8: CheckStackOverflow
    //     0xaf07c8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf07cc: cmp             SP, x16
    //     0xaf07d0: b.ls            #0xaf0910
    // 0xaf07d4: ldr             x0, [fp, #0x10]
    // 0xaf07d8: r0 = InitLateStaticField(0x1464) // [KUk] ::nCh
    //     0xaf07d8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaf07dc: ldr             x0, [x0, #0x28c8]
    //     0xaf07e0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaf07e4: cmp             w0, w16
    //     0xaf07e8: b.ne            #0xaf07f8
    //     0xaf07ec: add             x2, PP, #0x17, lsl #12  ; [pp+0x175e0] Field <::.nCh>: static late final (offset: 0x1464)
    //     0xaf07f0: ldr             x2, [x2, #0x5e0]
    //     0xaf07f4: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaf07f8: mov             x4, x0
    // 0xaf07fc: ldr             x3, [fp, #0x10]
    // 0xaf0800: stur            x4, [fp, #-0x50]
    // 0xaf0804: LoadField: r2 = r3->field_f
    //     0xaf0804: ldur            x2, [x3, #0xf]
    // 0xaf0808: r0 = BoxInt64Instr(r2)
    //     0xaf0808: sbfiz           x0, x2, #1, #0x1f
    //     0xaf080c: cmp             x2, x0, asr #1
    //     0xaf0810: b.eq            #0xaf081c
    //     0xaf0814: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xaf0818: stur            x2, [x0, #7]
    // 0xaf081c: mov             x1, x4
    // 0xaf0820: mov             x2, x0
    // 0xaf0824: r0 = call 0xa53cf4
    //     0xaf0824: bl              #0xa53cf4
    // 0xaf0828: mov             x1, x0
    // 0xaf082c: ldur            x0, [fp, #-0x50]
    // 0xaf0830: LoadField: r2 = r0->field_f
    //     0xaf0830: ldur            w2, [x0, #0xf]
    // 0xaf0834: DecompressPointer r2
    //     0xaf0834: add             x2, x2, HEAP, lsl #32
    // 0xaf0838: cmp             w2, w1
    // 0xaf083c: b.ne            #0xaf0848
    // 0xaf0840: r2 = Null
    //     0xaf0840: mov             x2, NULL
    // 0xaf0844: b               #0xaf084c
    // 0xaf0848: mov             x2, x1
    // 0xaf084c: stur            x2, [fp, #-0x50]
    // 0xaf0850: cmp             w2, NULL
    // 0xaf0854: b.eq            #0xaf0918
    // 0xaf0858: r16 = Instance_lYa
    //     0xaf0858: add             x16, PP, #9, lsl #12  ; [pp+0x9fc8] Obj!lYa@571eb1
    //     0xaf085c: ldr             x16, [x16, #0xfc8]
    // 0xaf0860: cmp             w2, w16
    // 0xaf0864: b.ne            #0xaf0878
    // 0xaf0868: r0 = Null
    //     0xaf0868: mov             x0, NULL
    // 0xaf086c: LeaveFrame
    //     0xaf086c: mov             SP, fp
    //     0xaf0870: ldp             fp, lr, [SP], #0x10
    // 0xaf0874: ret
    //     0xaf0874: ret             
    // 0xaf0878: ldr             x0, [fp, #0x10]
    // 0xaf087c: r0 = InitLateStaticField(0x149c) // [MUk] lkb::ko
    //     0xaf087c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaf0880: ldr             x0, [x0, #0x2938]
    //     0xaf0884: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaf0888: cmp             w0, w16
    //     0xaf088c: b.ne            #0xaf089c
    //     0xaf0890: add             x2, PP, #0x14, lsl #12  ; [pp+0x14e60] Field <lkb.ko>: static late final (offset: 0x149c)
    //     0xaf0894: ldr             x2, [x2, #0xe60]
    //     0xaf0898: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaf089c: r1 = Null
    //     0xaf089c: mov             x1, NULL
    // 0xaf08a0: r2 = 8
    //     0xaf08a0: movz            x2, #0x8
    // 0xaf08a4: stur            x0, [fp, #-0x58]
    // 0xaf08a8: r0 = AllocateArray()
    //     0xaf08a8: bl              #0xb29b38  ; AllocateArrayStub
    // 0xaf08ac: r16 = "["
    //     0xaf08ac: ldr             x16, [PP, #0x1c88]  ; [pp+0x1c88] "["
    // 0xaf08b0: StoreField: r0->field_f = r16
    //     0xaf08b0: stur            w16, [x0, #0xf]
    // 0xaf08b4: ldr             x1, [fp, #0x10]
    // 0xaf08b8: ArrayLoad: r2 = r1[0]  ; List_4
    //     0xaf08b8: ldur            w2, [x1, #0x17]
    // 0xaf08bc: DecompressPointer r2
    //     0xaf08bc: add             x2, x2, HEAP, lsl #32
    // 0xaf08c0: StoreField: r0->field_13 = r2
    //     0xaf08c0: stur            w2, [x0, #0x13]
    // 0xaf08c4: r16 = "]:"
    //     0xaf08c4: add             x16, PP, #0x17, lsl #12  ; [pp+0x175e8] "]:"
    //     0xaf08c8: ldr             x16, [x16, #0x5e8]
    // 0xaf08cc: ArrayStore: r0[0] = r16  ; List_4
    //     0xaf08cc: stur            w16, [x0, #0x17]
    // 0xaf08d0: LoadField: r2 = r1->field_1b
    //     0xaf08d0: ldur            w2, [x1, #0x1b]
    // 0xaf08d4: DecompressPointer r2
    //     0xaf08d4: add             x2, x2, HEAP, lsl #32
    // 0xaf08d8: StoreField: r0->field_1b = r2
    //     0xaf08d8: stur            w2, [x0, #0x1b]
    // 0xaf08dc: str             x0, [SP]
    // 0xaf08e0: r0 = _interpolate()
    //     0xaf08e0: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xaf08e4: ldur            x1, [fp, #-0x58]
    // 0xaf08e8: ldur            x2, [fp, #-0x50]
    // 0xaf08ec: mov             x3, x0
    // 0xaf08f0: r4 = const [0, 0x3, 0, 0x3, null]
    //     0xaf08f0: ldr             x4, [PP, #0x9f8]  ; [pp+0x9f8] List(5) [0, 0x3, 0, 0x3, Null]
    // 0xaf08f4: r0 = __unknown_function__()
    //     0xaf08f4: bl              #0xa766a4  ; [] ::__unknown_function__
    // 0xaf08f8: b               #0xaf0900
    // 0xaf08fc: sub             SP, fp, #0x60
    // 0xaf0900: r0 = Null
    //     0xaf0900: mov             x0, NULL
    // 0xaf0904: LeaveFrame
    //     0xaf0904: mov             SP, fp
    //     0xaf0908: ldp             fp, lr, [SP], #0x10
    // 0xaf090c: ret
    //     0xaf090c: ret             
    // 0xaf0910: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf0910: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf0914: b               #0xaf07d4
    // 0xaf0918: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xaf0918: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] bool <anonymous closure>(dynamic, lob) {
    // ** addr: 0x7f5e60, size: -0x1
  }
  [closure] int <anonymous closure>(dynamic, lob, lob) {
    // ** addr: 0x7f5d2c, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, lob?) {
    // ** addr: 0x7f5f40, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, lob) {
    // ** addr: 0x7f6028, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, int) {
    // ** addr: 0x7e4a4c, size: -0x1
  }
  nkb SOh(lkb) {
    // ** addr: 0x7f5f88, size: -0x1
  }
}

// class id: 255, size: 0x8, field offset: 0x8
abstract class kkb extends Object {

  static late final oYa _log; // offset: 0x14a4
}

// class id: 256, size: 0x78, field offset: 0x8
class jkb extends Object {

  dynamic qdc(jkb) {
    // ** addr: 0xa7aa78, size: 0x48
    // 0xa7aa78: EnterFrame
    //     0xa7aa78: stp             fp, lr, [SP, #-0x10]!
    //     0xa7aa7c: mov             fp, SP
    // 0xa7aa80: CheckStackOverflow
    //     0xa7aa80: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa7aa84: cmp             SP, x16
    //     0xa7aa88: b.ls            #0xa7aaa0
    // 0xa7aa8c: ldr             x1, [fp, #0x10]
    // 0xa7aa90: r0 = call 0x3476a8
    //     0xa7aa90: bl              #0x3476a8
    // 0xa7aa94: LeaveFrame
    //     0xa7aa94: mov             SP, fp
    //     0xa7aa98: ldp             fp, lr, [SP], #0x10
    // 0xa7aa9c: ret
    //     0xa7aa9c: ret             
    // 0xa7aaa0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa7aaa0: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa7aaa4: b               #0xa7aa8c
  }
}

// class id: 5791, size: 0x1c, field offset: 0x14
enum mkb extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
  _Mint field_14;

  [closure] static bool <anonymous closure>(dynamic, mkb) {
    // ** addr: 0x67fa78, size: -0x1
  }
}
