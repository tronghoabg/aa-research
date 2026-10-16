// lib: , url: mSk

// class id: 1050264, size: 0x8
class :: {
}

// class id: 475, size: 0xc, field offset: 0x8
class Aeb extends Object
    implements zeb {

  [closure] Future<Y0> <anonymous closure>(dynamic) async {
    // ** addr: 0xab063c, size: 0x36c
    // 0xab063c: EnterFrame
    //     0xab063c: stp             fp, lr, [SP, #-0x10]!
    //     0xab0640: mov             fp, SP
    // 0xab0644: AllocStack(0xc0)
    //     0xab0644: sub             SP, SP, #0xc0
    // 0xab0648: SetupParameters(Aeb this /* r1 */)
    //     0xab0648: stur            NULL, [fp, #-8]
    //     0xab064c: movz            x0, #0
    //     0xab0650: add             x1, fp, w0, sxtw #2
    //     0xab0654: ldr             x1, [x1, #0x10]
    //     0xab0658: ldur            w2, [x1, #0x17]
    //     0xab065c: add             x2, x2, HEAP, lsl #32
    //     0xab0660: stur            x2, [fp, #-0x88]
    // 0xab0664: CheckStackOverflow
    //     0xab0664: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xab0668: cmp             SP, x16
    //     0xab066c: b.ls            #0xab0994
    // 0xab0670: LoadField: r3 = r1->field_b
    //     0xab0670: ldur            w3, [x1, #0xb]
    // 0xab0674: DecompressPointer r3
    //     0xab0674: add             x3, x3, HEAP, lsl #32
    // 0xab0678: mov             x0, x3
    // 0xab067c: stur            x3, [fp, #-0x80]
    // 0xab0680: r0 = InitAsync()
    //     0xab0680: bl              #0xa75e10  ; InitAsyncStub
    // 0xab0684: ldur            x2, [fp, #-0x88]
    // 0xab0688: LoadField: r0 = r2->field_f
    //     0xab0688: ldur            w0, [x2, #0xf]
    // 0xab068c: DecompressPointer r0
    //     0xab068c: add             x0, x0, HEAP, lsl #32
    // 0xab0690: LoadField: r3 = r0->field_7
    //     0xab0690: ldur            w3, [x0, #7]
    // 0xab0694: DecompressPointer r3
    //     0xab0694: add             x3, x3, HEAP, lsl #32
    // 0xab0698: stur            x3, [fp, #-0x98]
    // 0xab069c: LoadField: r0 = r3->field_b
    //     0xab069c: ldur            w0, [x3, #0xb]
    // 0xab06a0: LoadField: r1 = r3->field_f
    //     0xab06a0: ldur            w1, [x3, #0xf]
    // 0xab06a4: DecompressPointer r1
    //     0xab06a4: add             x1, x1, HEAP, lsl #32
    // 0xab06a8: LoadField: r4 = r1->field_b
    //     0xab06a8: ldur            w4, [x1, #0xb]
    // 0xab06ac: r5 = LoadInt32Instr(r0)
    //     0xab06ac: sbfx            x5, x0, #1, #0x1f
    // 0xab06b0: stur            x5, [fp, #-0x90]
    // 0xab06b4: r0 = LoadInt32Instr(r4)
    //     0xab06b4: sbfx            x0, x4, #1, #0x1f
    // 0xab06b8: cmp             x5, x0
    // 0xab06bc: b.ne            #0xab06c8
    // 0xab06c0: mov             x1, x3
    // 0xab06c4: r0 = call 0x2e77dc
    //     0xab06c4: bl              #0x2e77dc
    // 0xab06c8: ldur            x0, [fp, #-0x98]
    // 0xab06cc: ldur            x1, [fp, #-0x90]
    // 0xab06d0: add             x2, x1, #1
    // 0xab06d4: lsl             x3, x2, #1
    // 0xab06d8: StoreField: r0->field_b = r3
    //     0xab06d8: stur            w3, [x0, #0xb]
    // 0xab06dc: LoadField: r2 = r0->field_f
    //     0xab06dc: ldur            w2, [x0, #0xf]
    // 0xab06e0: DecompressPointer r2
    //     0xab06e0: add             x2, x2, HEAP, lsl #32
    // 0xab06e4: stur            x2, [fp, #-0xa0]
    // 0xab06e8: r0 = yeb()
    //     0xab06e8: bl              #0xab09a8  ; AllocateyebStub -> yeb (size=0xc)
    // 0xab06ec: ldur            x1, [fp, #-0xa0]
    // 0xab06f0: ldur            x2, [fp, #-0x90]
    // 0xab06f4: ArrayStore: r1[r2] = r0  ; List_4
    //     0xab06f4: add             x25, x1, x2, lsl #2
    //     0xab06f8: add             x25, x25, #0xf
    //     0xab06fc: str             w0, [x25]
    //     0xab0700: tbz             w0, #0, #0xab071c
    //     0xab0704: ldurb           w16, [x1, #-1]
    //     0xab0708: ldurb           w17, [x0, #-1]
    //     0xab070c: and             x16, x17, x16, lsr #2
    //     0xab0710: tst             x16, HEAP, lsr #32
    //     0xab0714: b.eq            #0xab071c
    //     0xab0718: bl              #0xb27e20  ; ArrayWriteBarrierStub
    // 0xab071c: ldur            x0, [fp, #-0x88]
    // 0xab0720: ldur            x3, [fp, #-0x80]
    // 0xab0724: mov             x2, x0
    // 0xab0728: r1 = Function '<anonymous closure>':.
    //     0xab0728: add             x1, PP, #0x14, lsl #12  ; [pp+0x14cc0] AnonymousClosure: (0x6e6cb8), in [mSk] Aeb::<anonymous closure> (0xab063c)
    //     0xab072c: ldr             x1, [x1, #0xcc0]
    // 0xab0730: r0 = AllocateClosure()
    //     0xab0730: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xab0734: mov             x3, x0
    // 0xab0738: ldur            x0, [fp, #-0x80]
    // 0xab073c: stur            x3, [fp, #-0x98]
    // 0xab0740: StoreField: r3->field_b = r0
    //     0xab0740: stur            w0, [x3, #0xb]
    // 0xab0744: r1 = Null
    //     0xab0744: mov             x1, NULL
    // 0xab0748: r2 = 4
    //     0xab0748: movz            x2, #0x4
    // 0xab074c: r0 = AllocateArray()
    //     0xab074c: bl              #0xb29b38  ; AllocateArrayStub
    // 0xab0750: mov             x3, x0
    // 0xab0754: ldur            x2, [fp, #-0x88]
    // 0xab0758: LoadField: r0 = r2->field_f
    //     0xab0758: ldur            w0, [x2, #0xf]
    // 0xab075c: DecompressPointer r0
    //     0xab075c: add             x0, x0, HEAP, lsl #32
    // 0xab0760: StoreField: r3->field_f = r0
    //     0xab0760: stur            w0, [x3, #0xf]
    // 0xab0764: ArrayLoad: r0 = r2[0]  ; List_4
    //     0xab0764: ldur            w0, [x2, #0x17]
    // 0xab0768: DecompressPointer r0
    //     0xab0768: add             x0, x0, HEAP, lsl #32
    // 0xab076c: r1 = LoadInt32Instr(r0)
    //     0xab076c: sbfx            x1, x0, #1, #0x1f
    //     0xab0770: tbz             w0, #0, #0xab0778
    //     0xab0774: ldur            x1, [x0, #7]
    // 0xab0778: add             x4, x1, #1
    // 0xab077c: r0 = BoxInt64Instr(r4)
    //     0xab077c: sbfiz           x0, x4, #1, #0x1f
    //     0xab0780: cmp             x4, x0, asr #1
    //     0xab0784: b.eq            #0xab0790
    //     0xab0788: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xab078c: stur            x4, [x0, #7]
    // 0xab0790: StoreField: r3->field_13 = r0
    //     0xab0790: stur            w0, [x3, #0x13]
    // 0xab0794: r16 = <Object?, Object?>
    //     0xab0794: ldr             x16, [PP, #0x5608]  ; [pp+0x5608] TypeArguments: <Object?, Object?>
    // 0xab0798: stp             x3, x16, [SP]
    // 0xab079c: r0 = Map._fromLiteral()
    //     0xab079c: bl              #0x2fd170  ; [dart:core] Map::Map._fromLiteral
    // 0xab07a0: ldur            x1, [fp, #-0x80]
    // 0xab07a4: r2 = Null
    //     0xab07a4: mov             x2, NULL
    // 0xab07a8: r3 = <FutureOr<Y0>>
    //     0xab07a8: add             x3, PP, #0x14, lsl #12  ; [pp+0x14cc8] TypeArguments: <FutureOr<Y0>>
    //     0xab07ac: ldr             x3, [x3, #0xcc8]
    // 0xab07b0: stur            x0, [fp, #-0xa0]
    // 0xab07b4: r30 = InstantiateTypeArgumentsStub
    //     0xab07b4: ldr             lr, [PP, #0x1320]  ; [pp+0x1320] Stub: InstantiateTypeArguments (0x2d0f10)
    // 0xab07b8: LoadField: r30 = r30->field_7
    //     0xab07b8: ldur            lr, [lr, #7]
    // 0xab07bc: blr             lr
    // 0xab07c0: stur            x0, [fp, #-0xa8]
    // 0xab07c4: ldur            x16, [fp, #-0x98]
    // 0xab07c8: stp             x16, x0, [SP, #8]
    // 0xab07cc: ldur            x16, [fp, #-0xa0]
    // 0xab07d0: str             x16, [SP]
    // 0xab07d4: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0xab07d4: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0xab07d8: r0 = call 0x6e6bf8
    //     0xab07d8: bl              #0x6e6bf8
    // 0xab07dc: mov             x3, x0
    // 0xab07e0: r2 = Null
    //     0xab07e0: mov             x2, NULL
    // 0xab07e4: r1 = Null
    //     0xab07e4: mov             x1, NULL
    // 0xab07e8: stur            x3, [fp, #-0xa8]
    // 0xab07ec: cmp             w0, NULL
    // 0xab07f0: b.eq            #0xab0888
    // 0xab07f4: branchIfSmi(r0, 0xab0888)
    //     0xab07f4: tbz             w0, #0, #0xab0888
    // 0xab07f8: r3 = LoadClassIdInstr(r0)
    //     0xab07f8: ldur            x3, [x0, #-1]
    //     0xab07fc: ubfx            x3, x3, #0xc, #0x14
    // 0xab0800: r17 = 5579
    //     0xab0800: movz            x17, #0x15cb
    // 0xab0804: cmp             x3, x17
    // 0xab0808: b.eq            #0xab0890
    // 0xab080c: r4 = LoadClassIdInstr(r0)
    //     0xab080c: ldur            x4, [x0, #-1]
    //     0xab0810: ubfx            x4, x4, #0xc, #0x14
    // 0xab0814: ldr             x3, [THR, #0x748]  ; THR::isolate_group
    // 0xab0818: ldr             x3, [x3, #0x18]
    // 0xab081c: ldr             x3, [x3, x4, lsl #3]
    // 0xab0820: LoadField: r3 = r3->field_2b
    //     0xab0820: ldur            w3, [x3, #0x2b]
    // 0xab0824: DecompressPointer r3
    //     0xab0824: add             x3, x3, HEAP, lsl #32
    // 0xab0828: cmp             w3, NULL
    // 0xab082c: b.eq            #0xab0888
    // 0xab0830: LoadField: r3 = r3->field_f
    //     0xab0830: ldur            w3, [x3, #0xf]
    // 0xab0834: lsr             x3, x3, #3
    // 0xab0838: r17 = 5579
    //     0xab0838: movz            x17, #0x15cb
    // 0xab083c: cmp             x3, x17
    // 0xab0840: b.eq            #0xab0890
    // 0xab0844: r3 = SubtypeTestCache
    //     0xab0844: add             x3, PP, #0x14, lsl #12  ; [pp+0x14cd0] SubtypeTestCache
    //     0xab0848: ldr             x3, [x3, #0xcd0]
    // 0xab084c: r30 = Subtype1TestCacheStub
    //     0xab084c: ldr             lr, [PP, #0x1178]  ; [pp+0x1178] Stub: Subtype1TestCache (0x2e2e7c)
    // 0xab0850: LoadField: r30 = r30->field_7
    //     0xab0850: ldur            lr, [lr, #7]
    // 0xab0854: blr             lr
    // 0xab0858: cmp             w7, NULL
    // 0xab085c: b.eq            #0xab0868
    // 0xab0860: tbnz            w7, #4, #0xab0888
    // 0xab0864: b               #0xab0890
    // 0xab0868: r8 = Future
    //     0xab0868: add             x8, PP, #0x14, lsl #12  ; [pp+0x14cd8] Type: Future
    //     0xab086c: ldr             x8, [x8, #0xcd8]
    // 0xab0870: r3 = SubtypeTestCache
    //     0xab0870: add             x3, PP, #0x14, lsl #12  ; [pp+0x14ce0] SubtypeTestCache
    //     0xab0874: ldr             x3, [x3, #0xce0]
    // 0xab0878: r30 = InstanceOfStub
    //     0xab0878: ldr             lr, [PP, #0x1120]  ; [pp+0x1120] Stub: InstanceOf (0x2d1240)
    // 0xab087c: LoadField: r30 = r30->field_7
    //     0xab087c: ldur            lr, [lr, #7]
    // 0xab0880: blr             lr
    // 0xab0884: b               #0xab0894
    // 0xab0888: r0 = false
    //     0xab0888: add             x0, NULL, #0x30  ; false
    // 0xab088c: b               #0xab0894
    // 0xab0890: r0 = true
    //     0xab0890: add             x0, NULL, #0x20  ; true
    // 0xab0894: tbnz            w0, #4, #0xab08f0
    // 0xab0898: ldur            x0, [fp, #-0xa8]
    // 0xab089c: ldur            x1, [fp, #-0x80]
    // 0xab08a0: r0 = AwaitWithTypeCheck()
    //     0xab08a0: bl              #0xa753bc  ; AwaitWithTypeCheckStub
    // 0xab08a4: mov             x3, x0
    // 0xab08a8: stur            x3, [fp, #-0x80]
    // 0xab08ac: ldur            x2, [fp, #-0x88]
    // 0xab08b0: LoadField: r0 = r2->field_f
    //     0xab08b0: ldur            w0, [x2, #0xf]
    // 0xab08b4: DecompressPointer r0
    //     0xab08b4: add             x0, x0, HEAP, lsl #32
    // 0xab08b8: LoadField: r2 = r0->field_7
    //     0xab08b8: ldur            w2, [x0, #7]
    // 0xab08bc: DecompressPointer r2
    //     0xab08bc: add             x2, x2, HEAP, lsl #32
    // 0xab08c0: LoadField: r0 = r2->field_b
    //     0xab08c0: ldur            w0, [x2, #0xb]
    // 0xab08c4: r1 = LoadInt32Instr(r0)
    //     0xab08c4: sbfx            x1, x0, #1, #0x1f
    // 0xab08c8: sub             x4, x1, #1
    // 0xab08cc: mov             x0, x1
    // 0xab08d0: mov             x1, x4
    // 0xab08d4: cmp             x1, x0
    // 0xab08d8: b.hs            #0xab099c
    // 0xab08dc: mov             x1, x2
    // 0xab08e0: mov             x2, x4
    // 0xab08e4: r0 = call 0x9e7ee0
    //     0xab08e4: bl              #0x9e7ee0
    // 0xab08e8: ldur            x0, [fp, #-0x80]
    // 0xab08ec: r0 = ReturnAsync()
    //     0xab08ec: b               #0xa6b994  ; ReturnAsyncStub
    // 0xab08f0: ldur            x2, [fp, #-0x88]
    // 0xab08f4: LoadField: r0 = r2->field_f
    //     0xab08f4: ldur            w0, [x2, #0xf]
    // 0xab08f8: DecompressPointer r0
    //     0xab08f8: add             x0, x0, HEAP, lsl #32
    // 0xab08fc: LoadField: r2 = r0->field_7
    //     0xab08fc: ldur            w2, [x0, #7]
    // 0xab0900: DecompressPointer r2
    //     0xab0900: add             x2, x2, HEAP, lsl #32
    // 0xab0904: LoadField: r0 = r2->field_b
    //     0xab0904: ldur            w0, [x2, #0xb]
    // 0xab0908: r1 = LoadInt32Instr(r0)
    //     0xab0908: sbfx            x1, x0, #1, #0x1f
    // 0xab090c: sub             x3, x1, #1
    // 0xab0910: mov             x0, x1
    // 0xab0914: mov             x1, x3
    // 0xab0918: cmp             x1, x0
    // 0xab091c: b.hs            #0xab09a0
    // 0xab0920: mov             x1, x2
    // 0xab0924: mov             x2, x3
    // 0xab0928: r0 = call 0x9e7ee0
    //     0xab0928: bl              #0x9e7ee0
    // 0xab092c: ldur            x0, [fp, #-0xa8]
    // 0xab0930: r0 = ReturnAsync()
    //     0xab0930: b               #0xa6b994  ; ReturnAsyncStub
    // 0xab0934: sub             SP, fp, #0xc0
    // 0xab0938: ldur            x2, [fp, #-0x88]
    // 0xab093c: mov             x4, x0
    // 0xab0940: mov             x3, x1
    // 0xab0944: stur            x0, [fp, #-0x80]
    // 0xab0948: stur            x1, [fp, #-0x98]
    // 0xab094c: LoadField: r0 = r2->field_f
    //     0xab094c: ldur            w0, [x2, #0xf]
    // 0xab0950: DecompressPointer r0
    //     0xab0950: add             x0, x0, HEAP, lsl #32
    // 0xab0954: LoadField: r2 = r0->field_7
    //     0xab0954: ldur            w2, [x0, #7]
    // 0xab0958: DecompressPointer r2
    //     0xab0958: add             x2, x2, HEAP, lsl #32
    // 0xab095c: LoadField: r0 = r2->field_b
    //     0xab095c: ldur            w0, [x2, #0xb]
    // 0xab0960: r1 = LoadInt32Instr(r0)
    //     0xab0960: sbfx            x1, x0, #1, #0x1f
    // 0xab0964: sub             x5, x1, #1
    // 0xab0968: mov             x0, x1
    // 0xab096c: mov             x1, x5
    // 0xab0970: cmp             x1, x0
    // 0xab0974: b.hs            #0xab09a4
    // 0xab0978: mov             x1, x2
    // 0xab097c: mov             x2, x5
    // 0xab0980: r0 = call 0x9e7ee0
    //     0xab0980: bl              #0x9e7ee0
    // 0xab0984: ldur            x0, [fp, #-0x80]
    // 0xab0988: ldur            x1, [fp, #-0x98]
    // 0xab098c: r0 = ReThrow()
    //     0xab098c: bl              #0xb27dd0  ; ReThrowStub
    // 0xab0990: brk             #0
    // 0xab0994: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xab0994: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xab0998: b               #0xab0670
    // 0xab099c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xab099c: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xab09a0: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xab09a0: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xab09a4: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xab09a4: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] FutureOr<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x6e6cb8, size: -0x1
  }
}
