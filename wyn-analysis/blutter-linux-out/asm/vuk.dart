// lib: , url: VUk

// class id: 1050391, size: 0x8
class :: {

  [closure] static rQ <anonymous closure>(dynamic, aqa) {
    // ** addr: 0x6f22f0, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x6ef9c4, size: -0x1
  }
}

// class id: 3310, size: 0x14, field offset: 0x14
class _Hkb extends Nu<dynamic> {

  [closure] Oma <anonymous closure>(dynamic, aqa, fW) {
    // ** addr: 0x6f2990, size: -0x1
  }
}

// class id: 3311, size: 0x1c, field offset: 0x14
class _Qkb extends Nu<dynamic> {

  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xab373c, size: 0xdc
    // 0xab373c: EnterFrame
    //     0xab373c: stp             fp, lr, [SP, #-0x10]!
    //     0xab3740: mov             fp, SP
    // 0xab3744: AllocStack(0x30)
    //     0xab3744: sub             SP, SP, #0x30
    // 0xab3748: SetupParameters(_Qkb this /* r1 */)
    //     0xab3748: stur            NULL, [fp, #-8]
    //     0xab374c: movz            x0, #0
    //     0xab3750: add             x1, fp, w0, sxtw #2
    //     0xab3754: ldr             x1, [x1, #0x10]
    //     0xab3758: ldur            w2, [x1, #0x17]
    //     0xab375c: add             x2, x2, HEAP, lsl #32
    //     0xab3760: stur            x2, [fp, #-0x10]
    // 0xab3764: CheckStackOverflow
    //     0xab3764: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xab3768: cmp             SP, x16
    //     0xab376c: b.ls            #0xab3810
    // 0xab3770: InitAsync() -> Future<Null?>
    //     0xab3770: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xab3774: bl              #0xa75e10  ; InitAsyncStub
    // 0xab3778: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xab3778: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xab377c: ldr             x0, [x0, #0x28a8]
    //     0xab3780: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xab3784: cmp             w0, w16
    //     0xab3788: b.ne            #0xab3798
    //     0xab378c: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xab3790: ldr             x2, [x2, #0xc90]
    //     0xab3794: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xab3798: stur            x0, [fp, #-0x18]
    // 0xab379c: r16 = <Qjb>
    //     0xab379c: add             x16, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xab37a0: ldr             x16, [x16, #0xc98]
    // 0xab37a4: stp             x0, x16, [SP]
    // 0xab37a8: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xab37a8: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xab37ac: r0 = call 0x346fb4
    //     0xab37ac: bl              #0x346fb4
    // 0xab37b0: mov             x1, x0
    // 0xab37b4: r0 = call 0x6f28d4
    //     0xab37b4: bl              #0x6f28d4
    // 0xab37b8: tbz             w0, #4, #0xab37e4
    // 0xab37bc: ldur            x0, [fp, #-0x10]
    // 0xab37c0: LoadField: r1 = r0->field_b
    //     0xab37c0: ldur            w1, [x0, #0xb]
    // 0xab37c4: DecompressPointer r1
    //     0xab37c4: add             x1, x1, HEAP, lsl #32
    // 0xab37c8: LoadField: r2 = r1->field_f
    //     0xab37c8: ldur            w2, [x1, #0xf]
    // 0xab37cc: DecompressPointer r2
    //     0xab37cc: add             x2, x2, HEAP, lsl #32
    // 0xab37d0: mov             x1, x2
    // 0xab37d4: r0 = call 0x6f2294
    //     0xab37d4: bl              #0x6f2294
    // 0xab37d8: mov             x1, x0
    // 0xab37dc: stur            x1, [fp, #-0x20]
    // 0xab37e0: r0 = Await()
    //     0xab37e0: bl              #0xa75a20  ; AwaitStub
    // 0xab37e4: r0 = __unknown_function__()
    //     0xab37e4: bl              #0xaae14c  ; [] ::__unknown_function__
    // 0xab37e8: r16 = <pkb>
    //     0xab37e8: add             x16, PP, #0x11, lsl #12  ; [pp+0x116f0] TypeArguments: <pkb>
    //     0xab37ec: ldr             x16, [x16, #0x6f0]
    // 0xab37f0: ldur            lr, [fp, #-0x18]
    // 0xab37f4: stp             lr, x16, [SP]
    // 0xab37f8: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xab37f8: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xab37fc: r0 = call 0x346fb4
    //     0xab37fc: bl              #0x346fb4
    // 0xab3800: mov             x1, x0
    // 0xab3804: r0 = call 0x6e4d6c
    //     0xab3804: bl              #0x6e4d6c
    // 0xab3808: r0 = Null
    //     0xab3808: mov             x0, NULL
    // 0xab380c: r0 = ReturnAsyncNotFuture()
    //     0xab380c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xab3810: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xab3810: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xab3814: b               #0xab3770
  }
  [closure] bool <anonymous closure>(dynamic, Qjb) {
    // ** addr: 0x6e34f8, size: -0x1
  }
  [closure] Hma <anonymous closure>(dynamic, aqa, fW) {
    // ** addr: 0x6f0f58, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, int) {
    // ** addr: 0x6f200c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x6f2250, size: -0x1
  }
}

// class id: 3859, size: 0x14, field offset: 0xc
//   const constructor, 
class Ikb extends iw {
}

// class id: 4093, size: 0xc, field offset: 0xc
//   const constructor, 
class Gkb extends _ijb {
}

// class id: 4094, size: 0xc, field offset: 0xc
//   const constructor, 
class Pkb extends _ijb {
}

// class id: 4300, size: 0xc, field offset: 0xc
class _Jkb extends jG {
}
