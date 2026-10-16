// lib: , url: MVk

// class id: 1050423, size: 0x8
class :: {
}

// class id: 3277, size: 0x1c, field offset: 0x14
class _wmb extends Nu<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic, PBa<String>, WAa<String>) async {
    // ** addr: 0xad5818, size: 0xf4
    // 0xad5818: EnterFrame
    //     0xad5818: stp             fp, lr, [SP, #-0x10]!
    //     0xad581c: mov             fp, SP
    // 0xad5820: AllocStack(0x30)
    //     0xad5820: sub             SP, SP, #0x30
    // 0xad5824: SetupParameters(_wmb this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xad5824: stur            NULL, [fp, #-8]
    //     0xad5828: movz            x0, #0
    //     0xad582c: add             x1, fp, w0, sxtw #2
    //     0xad5830: ldr             x1, [x1, #0x20]
    //     0xad5834: add             x2, fp, w0, sxtw #2
    //     0xad5838: ldr             x2, [x2, #0x10]
    //     0xad583c: stur            x2, [fp, #-0x18]
    //     0xad5840: ldur            w3, [x1, #0x17]
    //     0xad5844: add             x3, x3, HEAP, lsl #32
    //     0xad5848: stur            x3, [fp, #-0x10]
    // 0xad584c: CheckStackOverflow
    //     0xad584c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad5850: cmp             SP, x16
    //     0xad5854: b.ls            #0xad5904
    // 0xad5858: InitAsync() -> Future<void?>
    //     0xad5858: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xad585c: bl              #0xa75e10  ; InitAsyncStub
    // 0xad5860: ldur            x1, [fp, #-0x10]
    // 0xad5864: LoadField: r0 = r1->field_f
    //     0xad5864: ldur            w0, [x1, #0xf]
    // 0xad5868: DecompressPointer r0
    //     0xad5868: add             x0, x0, HEAP, lsl #32
    // 0xad586c: ArrayLoad: r2 = r0[0]  ; List_4
    //     0xad586c: ldur            w2, [x0, #0x17]
    // 0xad5870: DecompressPointer r2
    //     0xad5870: add             x2, x2, HEAP, lsl #32
    // 0xad5874: cmp             w2, NULL
    // 0xad5878: b.eq            #0xad589c
    // 0xad587c: str             x2, [SP]
    // 0xad5880: mov             x0, x2
    // 0xad5884: ClosureCall
    //     0xad5884: ldr             x4, [PP, #0xe40]  ; [pp+0xe40] List(5) [0, 0x1, 0x1, 0x1, Null]
    //     0xad5888: ldur            x2, [x0, #0x1f]
    //     0xad588c: blr             x2
    // 0xad5890: mov             x1, x0
    // 0xad5894: stur            x1, [fp, #-0x20]
    // 0xad5898: r0 = Await()
    //     0xad5898: bl              #0xa75a20  ; AwaitStub
    // 0xad589c: ldur            x1, [fp, #-0x18]
    // 0xad58a0: ldur            x0, [fp, #-0x10]
    // 0xad58a4: LoadField: r2 = r0->field_f
    //     0xad58a4: ldur            w2, [x0, #0xf]
    // 0xad58a8: DecompressPointer r2
    //     0xad58a8: add             x2, x2, HEAP, lsl #32
    // 0xad58ac: stur            x2, [fp, #-0x20]
    // 0xad58b0: LoadField: r3 = r2->field_13
    //     0xad58b0: ldur            w3, [x2, #0x13]
    // 0xad58b4: DecompressPointer r3
    //     0xad58b4: add             x3, x3, HEAP, lsl #32
    // 0xad58b8: LoadField: r4 = r1->field_b
    //     0xad58b8: ldur            w4, [x1, #0xb]
    // 0xad58bc: DecompressPointer r4
    //     0xad58bc: add             x4, x4, HEAP, lsl #32
    // 0xad58c0: stp             x4, x3, [SP]
    // 0xad58c4: r4 = const [0, 0x2, 0x2, 0, aZh, 0, zUb, 0x1, null]
    //     0xad58c4: add             x4, PP, #0x3a, lsl #12  ; [pp+0x3a6b8] List(9) [0, 0x2, 0x2, 0, "aZh", 0, "zUb", 0x1, Null]
    //     0xad58c8: ldr             x4, [x4, #0x6b8]
    // 0xad58cc: r0 = __unknown_function__()
    //     0xad58cc: bl              #0xad590c  ; [] ::__unknown_function__
    // 0xad58d0: mov             x1, x0
    // 0xad58d4: stur            x1, [fp, #-0x18]
    // 0xad58d8: r0 = Await()
    //     0xad58d8: bl              #0xa75a20  ; AwaitStub
    // 0xad58dc: ldur            x1, [fp, #-0x20]
    // 0xad58e0: ArrayStore: r1[0] = r0  ; List_4
    //     0xad58e0: stur            w0, [x1, #0x17]
    //     0xad58e4: ldurb           w16, [x1, #-1]
    //     0xad58e8: ldurb           w17, [x0, #-1]
    //     0xad58ec: and             x16, x17, x16, lsr #2
    //     0xad58f0: tst             x16, HEAP, lsr #32
    //     0xad58f4: b.eq            #0xad58fc
    //     0xad58f8: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xad58fc: r0 = Null
    //     0xad58fc: mov             x0, NULL
    // 0xad5900: r0 = ReturnAsyncNotFuture()
    //     0xad5900: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad5904: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad5904: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad5908: b               #0xad5858
  }
  [closure] String <anonymous closure>(dynamic, Qjb) {
    // ** addr: 0x74956c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, mBa<String>) {
    // ** addr: 0x7494f0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, PBa<String>, bool) {
    // ** addr: 0x7493f0, size: -0x1
  }
  [closure] oma <anonymous closure>(dynamic, aqa, PBa<String>) {
    // ** addr: 0x74928c, size: -0x1
  }
  [closure] LBa<String> <anonymous closure>(dynamic, aqa, PBa<String>) {
    // ** addr: 0x749148, size: -0x1
  }
}

// class id: 4074, size: 0xc, field offset: 0xc
//   const constructor, 
class vmb extends _ijb {
}
