// lib: , url: YUk

// class id: 1050467, size: 0x8
class :: {
}

// class id: 3243, size: 0x18, field offset: 0x14
class _Mob extends Nu<dynamic> {

  [closure] void <anonymous closure>(dynamic, NM) {
    // ** addr: 0x7860a0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, OM) {
    // ** addr: 0x785ff0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x785f90, size: -0x1
  }
}

// class id: 3245, size: 0x18, field offset: 0x14
class _Iob extends Nu<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic, NM) async {
    // ** addr: 0xade940, size: 0x74
    // 0xade940: EnterFrame
    //     0xade940: stp             fp, lr, [SP, #-0x10]!
    //     0xade944: mov             fp, SP
    // 0xade948: AllocStack(0x18)
    //     0xade948: sub             SP, SP, #0x18
    // 0xade94c: SetupParameters(_Iob this /* r1 */)
    //     0xade94c: stur            NULL, [fp, #-8]
    //     0xade950: movz            x0, #0
    //     0xade954: add             x1, fp, w0, sxtw #2
    //     0xade958: ldr             x1, [x1, #0x18]
    //     0xade95c: ldur            w2, [x1, #0x17]
    //     0xade960: add             x2, x2, HEAP, lsl #32
    //     0xade964: stur            x2, [fp, #-0x10]
    // 0xade968: CheckStackOverflow
    //     0xade968: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xade96c: cmp             SP, x16
    //     0xade970: b.ls            #0xade9ac
    // 0xade974: InitAsync() -> Future<void?>
    //     0xade974: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xade978: bl              #0xa75e10  ; InitAsyncStub
    // 0xade97c: ldur            x2, [fp, #-0x10]
    // 0xade980: LoadField: r0 = r2->field_f
    //     0xade980: ldur            w0, [x2, #0xf]
    // 0xade984: DecompressPointer r0
    //     0xade984: add             x0, x0, HEAP, lsl #32
    // 0xade988: stur            x0, [fp, #-0x18]
    // 0xade98c: r1 = Function '<anonymous closure>':.
    //     0xade98c: add             x1, PP, #0x35, lsl #12  ; [pp+0x35678] AnonymousClosure: (0x6850b8), in [CVk] _cmb::<anonymous closure> (0x741054)
    //     0xade990: ldr             x1, [x1, #0x678]
    // 0xade994: r0 = AllocateClosure()
    //     0xade994: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xade998: ldur            x1, [fp, #-0x18]
    // 0xade99c: mov             x2, x0
    // 0xade9a0: r0 = call 0x312460
    //     0xade9a0: bl              #0x312460
    // 0xade9a4: r0 = Null
    //     0xade9a4: mov             x0, NULL
    // 0xade9a8: r0 = ReturnAsyncNotFuture()
    //     0xade9a8: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xade9ac: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xade9ac: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xade9b0: b               #0xade974
  }
  [closure] void <anonymous closure>(dynamic, OM) {
    // ** addr: 0x7857f4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x785794, size: -0x1
  }
}

// class id: 3246, size: 0x18, field offset: 0x14
class _Gob extends Nu<dynamic> {

  [closure] void <anonymous closure>(dynamic, NM) {
    // ** addr: 0x7853ac, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, OM) {
    // ** addr: 0x7852fc, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x78529c, size: -0x1
  }
}

// class id: 3247, size: 0x18, field offset: 0x14
class _Dob extends Nu<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic, NM) async {
    // ** addr: 0xade7d0, size: 0x170
    // 0xade7d0: EnterFrame
    //     0xade7d0: stp             fp, lr, [SP, #-0x10]!
    //     0xade7d4: mov             fp, SP
    // 0xade7d8: AllocStack(0x28)
    //     0xade7d8: sub             SP, SP, #0x28
    // 0xade7dc: SetupParameters(_Dob this /* r1 */)
    //     0xade7dc: stur            NULL, [fp, #-8]
    //     0xade7e0: movz            x0, #0
    //     0xade7e4: add             x1, fp, w0, sxtw #2
    //     0xade7e8: ldr             x1, [x1, #0x18]
    //     0xade7ec: ldur            w2, [x1, #0x17]
    //     0xade7f0: add             x2, x2, HEAP, lsl #32
    //     0xade7f4: stur            x2, [fp, #-0x10]
    // 0xade7f8: CheckStackOverflow
    //     0xade7f8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xade7fc: cmp             SP, x16
    //     0xade800: b.ls            #0xade920
    // 0xade804: InitAsync() -> Future<void?>
    //     0xade804: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xade808: bl              #0xa75e10  ; InitAsyncStub
    // 0xade80c: ldur            x0, [fp, #-0x10]
    // 0xade810: LoadField: r3 = r0->field_f
    //     0xade810: ldur            w3, [x0, #0xf]
    // 0xade814: DecompressPointer r3
    //     0xade814: add             x3, x3, HEAP, lsl #32
    // 0xade818: mov             x2, x0
    // 0xade81c: stur            x3, [fp, #-0x18]
    // 0xade820: r1 = Function '<anonymous closure>':.
    //     0xade820: add             x1, PP, #0x35, lsl #12  ; [pp+0x356c0] AnonymousClosure: (0x6850b8), in [CVk] _cmb::<anonymous closure> (0x741054)
    //     0xade824: ldr             x1, [x1, #0x6c0]
    // 0xade828: r0 = AllocateClosure()
    //     0xade828: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xade82c: ldur            x1, [fp, #-0x18]
    // 0xade830: mov             x2, x0
    // 0xade834: r0 = call 0x312460
    //     0xade834: bl              #0x312460
    // 0xade838: ldur            x0, [fp, #-0x10]
    // 0xade83c: LoadField: r1 = r0->field_f
    //     0xade83c: ldur            w1, [x0, #0xf]
    // 0xade840: DecompressPointer r1
    //     0xade840: add             x1, x1, HEAP, lsl #32
    // 0xade844: LoadField: r2 = r1->field_b
    //     0xade844: ldur            w2, [x1, #0xb]
    // 0xade848: DecompressPointer r2
    //     0xade848: add             x2, x2, HEAP, lsl #32
    // 0xade84c: cmp             w2, NULL
    // 0xade850: b.eq            #0xade928
    // 0xade854: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xade854: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xade858: ldr             x0, [x0, #0x28a8]
    //     0xade85c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xade860: cmp             w0, w16
    //     0xade864: b.ne            #0xade874
    //     0xade868: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xade86c: ldr             x2, [x2, #0xc90]
    //     0xade870: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xade874: r16 = <Qjb>
    //     0xade874: add             x16, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xade878: ldr             x16, [x16, #0xc98]
    // 0xade87c: stp             x0, x16, [SP]
    // 0xade880: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xade880: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xade884: r0 = call 0x346fb4
    //     0xade884: bl              #0x346fb4
    // 0xade888: LoadField: r1 = r0->field_23
    //     0xade888: ldur            w1, [x0, #0x23]
    // 0xade88c: DecompressPointer r1
    //     0xade88c: add             x1, x1, HEAP, lsl #32
    // 0xade890: r16 = Sentinel
    //     0xade890: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xade894: cmp             w1, w16
    // 0xade898: b.eq            #0xade92c
    // 0xade89c: r2 = "v1.sensors.calib_understand"
    //     0xade89c: add             x2, PP, #0x2e, lsl #12  ; [pp+0x2e220] "v1.sensors.calib_understand"
    //     0xade8a0: ldr             x2, [x2, #0x220]
    // 0xade8a4: r0 = call 0x33fc04
    //     0xade8a4: bl              #0x33fc04
    // 0xade8a8: cmp             w0, NULL
    // 0xade8ac: b.eq            #0xade8b4
    // 0xade8b0: tbz             w0, #4, #0xade8d8
    // 0xade8b4: ldur            x0, [fp, #-0x10]
    // 0xade8b8: LoadField: r1 = r0->field_f
    //     0xade8b8: ldur            w1, [x0, #0xf]
    // 0xade8bc: DecompressPointer r1
    //     0xade8bc: add             x1, x1, HEAP, lsl #32
    // 0xade8c0: LoadField: r2 = r0->field_13
    //     0xade8c0: ldur            w2, [x0, #0x13]
    // 0xade8c4: DecompressPointer r2
    //     0xade8c4: add             x2, x2, HEAP, lsl #32
    // 0xade8c8: r0 = call 0x78489c
    //     0xade8c8: bl              #0x78489c
    // 0xade8cc: mov             x1, x0
    // 0xade8d0: stur            x1, [fp, #-0x18]
    // 0xade8d4: r0 = Await()
    //     0xade8d4: bl              #0xa75a20  ; AwaitStub
    // 0xade8d8: ldur            x0, [fp, #-0x10]
    // 0xade8dc: LoadField: r1 = r0->field_f
    //     0xade8dc: ldur            w1, [x0, #0xf]
    // 0xade8e0: DecompressPointer r1
    //     0xade8e0: add             x1, x1, HEAP, lsl #32
    // 0xade8e4: LoadField: r0 = r1->field_b
    //     0xade8e4: ldur            w0, [x1, #0xb]
    // 0xade8e8: DecompressPointer r0
    //     0xade8e8: add             x0, x0, HEAP, lsl #32
    // 0xade8ec: cmp             w0, NULL
    // 0xade8f0: b.eq            #0xade938
    // 0xade8f4: LoadField: r1 = r0->field_b
    //     0xade8f4: ldur            w1, [x0, #0xb]
    // 0xade8f8: DecompressPointer r1
    //     0xade8f8: add             x1, x1, HEAP, lsl #32
    // 0xade8fc: cmp             w1, NULL
    // 0xade900: b.eq            #0xade93c
    // 0xade904: str             x1, [SP]
    // 0xade908: mov             x0, x1
    // 0xade90c: ClosureCall
    //     0xade90c: ldr             x4, [PP, #0xe40]  ; [pp+0xe40] List(5) [0, 0x1, 0x1, 0x1, Null]
    //     0xade910: ldur            x2, [x0, #0x1f]
    //     0xade914: blr             x2
    // 0xade918: r0 = Null
    //     0xade918: mov             x0, NULL
    // 0xade91c: r0 = ReturnAsyncNotFuture()
    //     0xade91c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xade920: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xade920: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xade924: b               #0xade804
    // 0xade928: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xade928: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xade92c: r9 = _pCh
    //     0xade92c: add             x9, PP, #9, lsl #12  ; [pp+0x9d10] Field <Qjb._pCh@1796148846>: late (offset: 0x24)
    //     0xade930: ldr             x9, [x9, #0xd10]
    // 0xade934: r0 = LateInitializationErrorSharedWithoutFPURegs()
    //     0xade934: bl              #0xb2a470  ; LateInitializationErrorSharedWithoutFPURegsStub
    // 0xade938: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xade938: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xade93c: r0 = NullErrorSharedWithoutFPURegs()
    //     0xade93c: bl              #0xb2a398  ; NullErrorSharedWithoutFPURegsStub
  }
  [closure] void <anonymous closure>(dynamic, OM) {
    // ** addr: 0x78483c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x7847dc, size: -0x1
  }
  [closure] rQ <anonymous closure>(dynamic, aqa) {
    // ** addr: 0x7848f8, size: -0x1
  }
}

// class id: 3844, size: 0xc, field offset: 0xc
//   const constructor, 
class Nob extends iw {
}

// class id: 4023, size: 0x14, field offset: 0xc
//   const constructor, 
class Lob extends Ku {
}

// class id: 4025, size: 0x10, field offset: 0xc
//   const constructor, 
class Hob extends Ku {
}

// class id: 4026, size: 0x1c, field offset: 0xc
//   const constructor, 
class Fob extends Ku {
}

// class id: 4027, size: 0x10, field offset: 0xc
//   const constructor, 
class Cob extends Ku {
}

// class id: 4298, size: 0xc, field offset: 0xc
class Oob extends jG {
}

// class id: 4299, size: 0xc, field offset: 0xc
class Eob extends jG {
}
