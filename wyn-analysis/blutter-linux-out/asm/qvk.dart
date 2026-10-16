// lib: , url: qVk

// class id: 1050462, size: 0x8
class :: {
}

// class id: 212, size: 0xc, field offset: 0x8
class xob extends Object {

  [closure] Future<Null> <anonymous closure>(dynamic, XB) async {
    // ** addr: 0xabada4, size: 0x19c
    // 0xabada4: EnterFrame
    //     0xabada4: stp             fp, lr, [SP, #-0x10]!
    //     0xabada8: mov             fp, SP
    // 0xabadac: AllocStack(0x30)
    //     0xabadac: sub             SP, SP, #0x30
    // 0xabadb0: SetupParameters(xob this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xabadb0: stur            NULL, [fp, #-8]
    //     0xabadb4: movz            x0, #0
    //     0xabadb8: add             x1, fp, w0, sxtw #2
    //     0xabadbc: ldr             x1, [x1, #0x18]
    //     0xabadc0: add             x2, fp, w0, sxtw #2
    //     0xabadc4: ldr             x2, [x2, #0x10]
    //     0xabadc8: stur            x2, [fp, #-0x18]
    //     0xabadcc: ldur            w3, [x1, #0x17]
    //     0xabadd0: add             x3, x3, HEAP, lsl #32
    //     0xabadd4: stur            x3, [fp, #-0x10]
    // 0xabadd8: CheckStackOverflow
    //     0xabadd8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xabaddc: cmp             SP, x16
    //     0xabade0: b.ls            #0xabaf38
    // 0xabade4: InitAsync() -> Future<Null?>
    //     0xabade4: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xabade8: bl              #0xa75e10  ; InitAsyncStub
    // 0xabadec: ldur            x1, [fp, #-0x18]
    // 0xabadf0: r0 = __unknown_function__()
    //     0xabadf0: bl              #0xabb1a0  ; [] ::__unknown_function__
    // 0xabadf4: mov             x1, x0
    // 0xabadf8: stur            x1, [fp, #-0x20]
    // 0xabadfc: r0 = Await()
    //     0xabadfc: bl              #0xa75a20  ; AwaitStub
    // 0xabae00: mov             x1, x0
    // 0xabae04: stur            x0, [fp, #-0x20]
    // 0xabae08: r0 = call 0x7001f4
    //     0xabae08: bl              #0x7001f4
    // 0xabae0c: tbnz            w0, #4, #0xabae6c
    // 0xabae10: ldur            x0, [fp, #-0x10]
    // 0xabae14: LoadField: r1 = r0->field_f
    //     0xabae14: ldur            w1, [x0, #0xf]
    // 0xabae18: DecompressPointer r1
    //     0xabae18: add             x1, x1, HEAP, lsl #32
    // 0xabae1c: LoadField: r3 = r1->field_7
    //     0xabae1c: ldur            w3, [x1, #7]
    // 0xabae20: DecompressPointer r3
    //     0xabae20: add             x3, x3, HEAP, lsl #32
    // 0xabae24: stur            x3, [fp, #-0x28]
    // 0xabae28: r1 = Null
    //     0xabae28: mov             x1, NULL
    // 0xabae2c: r2 = 4
    //     0xabae2c: movz            x2, #0x4
    // 0xabae30: r0 = AllocateArray()
    //     0xabae30: bl              #0xb29b38  ; AllocateArrayStub
    // 0xabae34: r16 = "Logo and location overlay burned successfully: "
    //     0xabae34: add             x16, PP, #0x34, lsl #12  ; [pp+0x34478] "Logo and location overlay burned successfully: "
    //     0xabae38: ldr             x16, [x16, #0x478]
    // 0xabae3c: StoreField: r0->field_f = r16
    //     0xabae3c: stur            w16, [x0, #0xf]
    // 0xabae40: ldur            x2, [fp, #-0x10]
    // 0xabae44: LoadField: r1 = r2->field_13
    //     0xabae44: ldur            w1, [x2, #0x13]
    // 0xabae48: DecompressPointer r1
    //     0xabae48: add             x1, x1, HEAP, lsl #32
    // 0xabae4c: StoreField: r0->field_13 = r1
    //     0xabae4c: stur            w1, [x0, #0x13]
    // 0xabae50: str             x0, [SP]
    // 0xabae54: r0 = _interpolate()
    //     0xabae54: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xabae58: ldur            x1, [fp, #-0x28]
    // 0xabae5c: mov             x2, x0
    // 0xabae60: r0 = call 0x345770
    //     0xabae60: bl              #0x345770
    // 0xabae64: r0 = Null
    //     0xabae64: mov             x0, NULL
    // 0xabae68: r0 = ReturnAsyncNotFuture()
    //     0xabae68: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xabae6c: ldur            x2, [fp, #-0x10]
    // 0xabae70: ldur            x0, [fp, #-0x20]
    // 0xabae74: ldur            x1, [fp, #-0x18]
    // 0xabae78: r0 = __unknown_function__()
    //     0xabae78: bl              #0xabaf40  ; [] ::__unknown_function__
    // 0xabae7c: mov             x1, x0
    // 0xabae80: stur            x1, [fp, #-0x18]
    // 0xabae84: r0 = Await()
    //     0xabae84: bl              #0xa75a20  ; AwaitStub
    // 0xabae88: mov             x3, x0
    // 0xabae8c: ldur            x0, [fp, #-0x10]
    // 0xabae90: stur            x3, [fp, #-0x28]
    // 0xabae94: LoadField: r1 = r0->field_f
    //     0xabae94: ldur            w1, [x0, #0xf]
    // 0xabae98: DecompressPointer r1
    //     0xabae98: add             x1, x1, HEAP, lsl #32
    // 0xabae9c: LoadField: r4 = r1->field_7
    //     0xabae9c: ldur            w4, [x1, #7]
    // 0xabaea0: DecompressPointer r4
    //     0xabaea0: add             x4, x4, HEAP, lsl #32
    // 0xabaea4: stur            x4, [fp, #-0x18]
    // 0xabaea8: r1 = Null
    //     0xabaea8: mov             x1, NULL
    // 0xabaeac: r2 = 4
    //     0xabaeac: movz            x2, #0x4
    // 0xabaeb0: r0 = AllocateArray()
    //     0xabaeb0: bl              #0xb29b38  ; AllocateArrayStub
    // 0xabaeb4: r16 = "FFmpeg burn overlay failed with return code "
    //     0xabaeb4: add             x16, PP, #0x34, lsl #12  ; [pp+0x34480] "FFmpeg burn overlay failed with return code "
    //     0xabaeb8: ldr             x16, [x16, #0x480]
    // 0xabaebc: StoreField: r0->field_f = r16
    //     0xabaebc: stur            w16, [x0, #0xf]
    // 0xabaec0: ldur            x1, [fp, #-0x20]
    // 0xabaec4: StoreField: r0->field_13 = r1
    //     0xabaec4: stur            w1, [x0, #0x13]
    // 0xabaec8: str             x0, [SP]
    // 0xabaecc: r0 = _interpolate()
    //     0xabaecc: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xabaed0: ldur            x1, [fp, #-0x18]
    // 0xabaed4: mov             x2, x0
    // 0xabaed8: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xabaed8: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xabaedc: r0 = call 0x3464a8
    //     0xabaedc: bl              #0x3464a8
    // 0xabaee0: ldur            x2, [fp, #-0x10]
    // 0xabaee4: r1 = Function '<anonymous closure>':.
    //     0xabaee4: add             x1, PP, #0x34, lsl #12  ; [pp+0x34488] AnonymousClosure: (0x700294), in [qVk] xob::<anonymous closure> (0xabada4)
    //     0xabaee8: ldr             x1, [x1, #0x488]
    // 0xabaeec: r0 = AllocateClosure()
    //     0xabaeec: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xabaef0: ldur            x1, [fp, #-0x28]
    // 0xabaef4: r2 = LoadClassIdInstr(r1)
    //     0xabaef4: ldur            x2, [x1, #-1]
    //     0xabaef8: ubfx            x2, x2, #0xc, #0x14
    // 0xabaefc: mov             x16, x0
    // 0xabaf00: mov             x0, x2
    // 0xabaf04: mov             x2, x16
    // 0xabaf08: r0 = GDT[cid_x0 + 0xc0e8]()
    //     0xabaf08: movz            x17, #0xc0e8
    //     0xabaf0c: add             lr, x0, x17
    //     0xabaf10: ldr             lr, [x21, lr, lsl #3]
    //     0xabaf14: blr             lr
    // 0xabaf18: r0 = _sa()
    //     0xabaf18: bl              #0xa71504  ; Allocate_saStub -> _sa (size=0xc)
    // 0xabaf1c: mov             x1, x0
    // 0xabaf20: r0 = "Failed to burn overlays"
    //     0xabaf20: add             x0, PP, #0x34, lsl #12  ; [pp+0x34490] "Failed to burn overlays"
    //     0xabaf24: ldr             x0, [x0, #0x490]
    // 0xabaf28: StoreField: r1->field_7 = r0
    //     0xabaf28: stur            w0, [x1, #7]
    // 0xabaf2c: mov             x0, x1
    // 0xabaf30: r0 = Throw()
    //     0xabaf30: bl              #0xb27dfc  ; ThrowStub
    // 0xabaf34: brk             #0
    // 0xabaf38: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xabaf38: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xabaf3c: b               #0xabade4
  }
  [closure] Future<Null> <anonymous closure>(dynamic, XB) async {
    // ** addr: 0xabb7dc, size: 0x1f8
    // 0xabb7dc: EnterFrame
    //     0xabb7dc: stp             fp, lr, [SP, #-0x10]!
    //     0xabb7e0: mov             fp, SP
    // 0xabb7e4: AllocStack(0x38)
    //     0xabb7e4: sub             SP, SP, #0x38
    // 0xabb7e8: SetupParameters(xob this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xabb7e8: stur            NULL, [fp, #-8]
    //     0xabb7ec: movz            x0, #0
    //     0xabb7f0: add             x1, fp, w0, sxtw #2
    //     0xabb7f4: ldr             x1, [x1, #0x18]
    //     0xabb7f8: add             x2, fp, w0, sxtw #2
    //     0xabb7fc: ldr             x2, [x2, #0x10]
    //     0xabb800: stur            x2, [fp, #-0x18]
    //     0xabb804: ldur            w3, [x1, #0x17]
    //     0xabb808: add             x3, x3, HEAP, lsl #32
    //     0xabb80c: stur            x3, [fp, #-0x10]
    // 0xabb810: CheckStackOverflow
    //     0xabb810: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xabb814: cmp             SP, x16
    //     0xabb818: b.ls            #0xabb9cc
    // 0xabb81c: InitAsync() -> Future<Null?>
    //     0xabb81c: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xabb820: bl              #0xa75e10  ; InitAsyncStub
    // 0xabb824: ldur            x1, [fp, #-0x18]
    // 0xabb828: r0 = __unknown_function__()
    //     0xabb828: bl              #0xabb1a0  ; [] ::__unknown_function__
    // 0xabb82c: mov             x1, x0
    // 0xabb830: stur            x1, [fp, #-0x20]
    // 0xabb834: r0 = Await()
    //     0xabb834: bl              #0xa75a20  ; AwaitStub
    // 0xabb838: ldur            x2, [fp, #-0x10]
    // 0xabb83c: stur            x0, [fp, #-0x28]
    // 0xabb840: ArrayLoad: r1 = r2[0]  ; List_4
    //     0xabb840: ldur            w1, [x2, #0x17]
    // 0xabb844: DecompressPointer r1
    //     0xabb844: add             x1, x1, HEAP, lsl #32
    // 0xabb848: stur            x1, [fp, #-0x20]
    // 0xabb84c: r0 = call 0x2fcd4c
    //     0xabb84c: bl              #0x2fcd4c
    // 0xabb850: r0 = _iq()
    //     0xabb850: bl              #0xa6ee74  ; Allocate_iqStub -> _iq (size=0x10)
    // 0xabb854: ldur            x1, [fp, #-0x20]
    // 0xabb858: stur            x0, [fp, #-0x30]
    // 0xabb85c: StoreField: r0->field_7 = r1
    //     0xabb85c: stur            w1, [x0, #7]
    // 0xabb860: r0 = call 0x2fccb0
    //     0xabb860: bl              #0x2fccb0
    // 0xabb864: ldur            x1, [fp, #-0x30]
    // 0xabb868: StoreField: r1->field_b = r0
    //     0xabb868: stur            w0, [x1, #0xb]
    //     0xabb86c: ldurb           w16, [x1, #-1]
    //     0xabb870: ldurb           w17, [x0, #-1]
    //     0xabb874: and             x16, x17, x16, lsr #2
    //     0xabb878: tst             x16, HEAP, lsr #32
    //     0xabb87c: b.eq            #0xabb884
    //     0xabb880: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xabb884: r4 = const [0, 0x1, 0, 0x1, null]
    //     0xabb884: ldr             x4, [PP, #0x68]  ; [pp+0x68] List(5) [0, 0x1, 0, 0x1, Null]
    // 0xabb888: r0 = call 0x9c3a0c
    //     0xabb888: bl              #0x9c3a0c
    // 0xabb88c: mov             x1, x0
    // 0xabb890: stur            x1, [fp, #-0x20]
    // 0xabb894: r0 = Await()
    //     0xabb894: bl              #0xa75a20  ; AwaitStub
    // 0xabb898: ldur            x1, [fp, #-0x28]
    // 0xabb89c: r0 = call 0x7001f4
    //     0xabb89c: bl              #0x7001f4
    // 0xabb8a0: tbnz            w0, #4, #0xabb900
    // 0xabb8a4: ldur            x0, [fp, #-0x10]
    // 0xabb8a8: LoadField: r1 = r0->field_f
    //     0xabb8a8: ldur            w1, [x0, #0xf]
    // 0xabb8ac: DecompressPointer r1
    //     0xabb8ac: add             x1, x1, HEAP, lsl #32
    // 0xabb8b0: LoadField: r3 = r1->field_7
    //     0xabb8b0: ldur            w3, [x1, #7]
    // 0xabb8b4: DecompressPointer r3
    //     0xabb8b4: add             x3, x3, HEAP, lsl #32
    // 0xabb8b8: stur            x3, [fp, #-0x20]
    // 0xabb8bc: r1 = Null
    //     0xabb8bc: mov             x1, NULL
    // 0xabb8c0: r2 = 4
    //     0xabb8c0: movz            x2, #0x4
    // 0xabb8c4: r0 = AllocateArray()
    //     0xabb8c4: bl              #0xb29b38  ; AllocateArrayStub
    // 0xabb8c8: r16 = "Videos merged successfully: "
    //     0xabb8c8: add             x16, PP, #0x34, lsl #12  ; [pp+0x34c48] "Videos merged successfully: "
    //     0xabb8cc: ldr             x16, [x16, #0xc48]
    // 0xabb8d0: StoreField: r0->field_f = r16
    //     0xabb8d0: stur            w16, [x0, #0xf]
    // 0xabb8d4: ldur            x2, [fp, #-0x10]
    // 0xabb8d8: LoadField: r1 = r2->field_13
    //     0xabb8d8: ldur            w1, [x2, #0x13]
    // 0xabb8dc: DecompressPointer r1
    //     0xabb8dc: add             x1, x1, HEAP, lsl #32
    // 0xabb8e0: StoreField: r0->field_13 = r1
    //     0xabb8e0: stur            w1, [x0, #0x13]
    // 0xabb8e4: str             x0, [SP]
    // 0xabb8e8: r0 = _interpolate()
    //     0xabb8e8: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xabb8ec: ldur            x1, [fp, #-0x20]
    // 0xabb8f0: mov             x2, x0
    // 0xabb8f4: r0 = call 0x345770
    //     0xabb8f4: bl              #0x345770
    // 0xabb8f8: r0 = Null
    //     0xabb8f8: mov             x0, NULL
    // 0xabb8fc: r0 = ReturnAsyncNotFuture()
    //     0xabb8fc: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xabb900: ldur            x2, [fp, #-0x10]
    // 0xabb904: ldur            x0, [fp, #-0x28]
    // 0xabb908: ldur            x1, [fp, #-0x18]
    // 0xabb90c: r0 = __unknown_function__()
    //     0xabb90c: bl              #0xabaf40  ; [] ::__unknown_function__
    // 0xabb910: mov             x1, x0
    // 0xabb914: stur            x1, [fp, #-0x18]
    // 0xabb918: r0 = Await()
    //     0xabb918: bl              #0xa75a20  ; AwaitStub
    // 0xabb91c: mov             x3, x0
    // 0xabb920: ldur            x0, [fp, #-0x10]
    // 0xabb924: stur            x3, [fp, #-0x20]
    // 0xabb928: LoadField: r1 = r0->field_f
    //     0xabb928: ldur            w1, [x0, #0xf]
    // 0xabb92c: DecompressPointer r1
    //     0xabb92c: add             x1, x1, HEAP, lsl #32
    // 0xabb930: LoadField: r4 = r1->field_7
    //     0xabb930: ldur            w4, [x1, #7]
    // 0xabb934: DecompressPointer r4
    //     0xabb934: add             x4, x4, HEAP, lsl #32
    // 0xabb938: stur            x4, [fp, #-0x18]
    // 0xabb93c: r1 = Null
    //     0xabb93c: mov             x1, NULL
    // 0xabb940: r2 = 4
    //     0xabb940: movz            x2, #0x4
    // 0xabb944: r0 = AllocateArray()
    //     0xabb944: bl              #0xb29b38  ; AllocateArrayStub
    // 0xabb948: r16 = "FFmpeg merge failed with return code "
    //     0xabb948: add             x16, PP, #0x34, lsl #12  ; [pp+0x34c50] "FFmpeg merge failed with return code "
    //     0xabb94c: ldr             x16, [x16, #0xc50]
    // 0xabb950: StoreField: r0->field_f = r16
    //     0xabb950: stur            w16, [x0, #0xf]
    // 0xabb954: ldur            x1, [fp, #-0x28]
    // 0xabb958: StoreField: r0->field_13 = r1
    //     0xabb958: stur            w1, [x0, #0x13]
    // 0xabb95c: str             x0, [SP]
    // 0xabb960: r0 = _interpolate()
    //     0xabb960: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xabb964: ldur            x1, [fp, #-0x18]
    // 0xabb968: mov             x2, x0
    // 0xabb96c: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xabb96c: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xabb970: r0 = call 0x3464a8
    //     0xabb970: bl              #0x3464a8
    // 0xabb974: ldur            x2, [fp, #-0x10]
    // 0xabb978: r1 = Function '<anonymous closure>':.
    //     0xabb978: add             x1, PP, #0x34, lsl #12  ; [pp+0x34c58] AnonymousClosure: (0x700294), in [qVk] xob::<anonymous closure> (0xabada4)
    //     0xabb97c: ldr             x1, [x1, #0xc58]
    // 0xabb980: r0 = AllocateClosure()
    //     0xabb980: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xabb984: ldur            x1, [fp, #-0x20]
    // 0xabb988: r2 = LoadClassIdInstr(r1)
    //     0xabb988: ldur            x2, [x1, #-1]
    //     0xabb98c: ubfx            x2, x2, #0xc, #0x14
    // 0xabb990: mov             x16, x0
    // 0xabb994: mov             x0, x2
    // 0xabb998: mov             x2, x16
    // 0xabb99c: r0 = GDT[cid_x0 + 0xc0e8]()
    //     0xabb99c: movz            x17, #0xc0e8
    //     0xabb9a0: add             lr, x0, x17
    //     0xabb9a4: ldr             lr, [x21, lr, lsl #3]
    //     0xabb9a8: blr             lr
    // 0xabb9ac: r0 = _sa()
    //     0xabb9ac: bl              #0xa71504  ; Allocate_saStub -> _sa (size=0xc)
    // 0xabb9b0: mov             x1, x0
    // 0xabb9b4: r0 = "Failed to merge videos"
    //     0xabb9b4: add             x0, PP, #0x34, lsl #12  ; [pp+0x34c60] "Failed to merge videos"
    //     0xabb9b8: ldr             x0, [x0, #0xc60]
    // 0xabb9bc: StoreField: r1->field_7 = r0
    //     0xabb9bc: stur            w0, [x1, #7]
    // 0xabb9c0: mov             x0, x1
    // 0xabb9c4: r0 = Throw()
    //     0xabb9c4: bl              #0xb27dfc  ; ThrowStub
    // 0xabb9c8: brk             #0
    // 0xabb9cc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xabb9cc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xabb9d0: b               #0xabb81c
  }
  [closure] int <anonymous closure>(dynamic, File, File) {
    // ** addr: 0x70083c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, ZB) {
    // ** addr: 0x700294, size: -0x1
  }
  [closure] String <anonymous closure>(dynamic, File) {
    // ** addr: 0x7002f0, size: -0x1
  }
}
