// lib: , url: DUk

// class id: 1050373, size: 0x8
class :: {
}

// class id: 263, size: 0x10, field offset: 0x8
class Vjb extends Object {
}

// class id: 264, size: 0x10, field offset: 0x8
class Ujb extends Object {
}

// class id: 265, size: 0x8, field offset: 0x8
abstract class Tjb extends Object {
}

// class id: 2734, size: 0x2c, field offset: 0x24
class Sjb extends mJ {

  late Rjb JRh; // offset: 0x28

  [closure] static Future<Never> <anonymous closure>(dynamic) async {
    // ** addr: 0xac47d8, size: 0x8c
    // 0xac47d8: EnterFrame
    //     0xac47d8: stp             fp, lr, [SP, #-0x10]!
    //     0xac47dc: mov             fp, SP
    // 0xac47e0: AllocStack(0x18)
    //     0xac47e0: sub             SP, SP, #0x18
    // 0xac47e4: SetupParameters(dynamic _ /* r1 */)
    //     0xac47e4: stur            NULL, [fp, #-8]
    //     0xac47e8: movz            x0, #0
    //     0xac47ec: add             x1, fp, w0, sxtw #2
    //     0xac47f0: ldr             x1, [x1, #0x10]
    //     0xac47f4: ldur            w2, [x1, #0x17]
    //     0xac47f8: add             x2, x2, HEAP, lsl #32
    //     0xac47fc: stur            x2, [fp, #-0x10]
    // 0xac4800: CheckStackOverflow
    //     0xac4800: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xac4804: cmp             SP, x16
    //     0xac4808: b.ls            #0xac4854
    // 0xac480c: InitAsync() -> Future<Never>
    //     0xac480c: ldr             x0, [PP, #0x2ae0]  ; [pp+0x2ae0] TypeArguments: <Never>
    //     0xac4810: bl              #0xa75e10  ; InitAsyncStub
    // 0xac4814: CheckStackOverflow
    //     0xac4814: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xac4818: cmp             SP, x16
    //     0xac481c: b.ls            #0xac485c
    // 0xac4820: r0 = __unknown_function__()
    //     0xac4820: bl              #0xac4864  ; [] ::__unknown_function__
    // 0xac4824: mov             x1, x0
    // 0xac4828: stur            x1, [fp, #-0x18]
    // 0xac482c: r0 = Await()
    //     0xac482c: bl              #0xa75a20  ; AwaitStub
    // 0xac4830: r1 = Null
    //     0xac4830: mov             x1, NULL
    // 0xac4834: r2 = Instance_ka
    //     0xac4834: add             x2, PP, #0x15, lsl #12  ; [pp+0x15108] Obj!ka@57ad21
    //     0xac4838: ldr             x2, [x2, #0x108]
    // 0xac483c: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xac483c: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xac4840: r0 = call 0x33afdc
    //     0xac4840: bl              #0x33afdc
    // 0xac4844: mov             x1, x0
    // 0xac4848: stur            x1, [fp, #-0x18]
    // 0xac484c: r0 = Await()
    //     0xac484c: bl              #0xa75a20  ; AwaitStub
    // 0xac4850: b               #0xac4814
    // 0xac4854: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xac4854: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xac4858: b               #0xac480c
    // 0xac485c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xac485c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xac4860: b               #0xac4820
  }
  [closure] static Future<void> <anonymous closure>(dynamic, int) async {
    // ** addr: 0xacc588, size: 0xdc
    // 0xacc588: EnterFrame
    //     0xacc588: stp             fp, lr, [SP, #-0x10]!
    //     0xacc58c: mov             fp, SP
    // 0xacc590: AllocStack(0x20)
    //     0xacc590: sub             SP, SP, #0x20
    // 0xacc594: SetupParameters(dynamic _ /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xacc594: stur            NULL, [fp, #-8]
    //     0xacc598: movz            x0, #0
    //     0xacc59c: add             x1, fp, w0, sxtw #2
    //     0xacc5a0: ldr             x1, [x1, #0x18]
    //     0xacc5a4: add             x2, fp, w0, sxtw #2
    //     0xacc5a8: ldr             x2, [x2, #0x10]
    //     0xacc5ac: stur            x2, [fp, #-0x18]
    //     0xacc5b0: ldur            w3, [x1, #0x17]
    //     0xacc5b4: add             x3, x3, HEAP, lsl #32
    //     0xacc5b8: stur            x3, [fp, #-0x10]
    // 0xacc5bc: CheckStackOverflow
    //     0xacc5bc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xacc5c0: cmp             SP, x16
    //     0xacc5c4: b.ls            #0xacc65c
    // 0xacc5c8: InitAsync() -> Future<void?>
    //     0xacc5c8: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xacc5cc: bl              #0xa75e10  ; InitAsyncStub
    // 0xacc5d0: r0 = InitLateStaticField(0x684) // [Cwk] ::YFc
    //     0xacc5d0: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xacc5d4: ldr             x0, [x0, #0xd08]
    //     0xacc5d8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xacc5dc: cmp             w0, w16
    //     0xacc5e0: b.ne            #0xacc5ec
    //     0xacc5e4: ldr             x2, [PP, #0xf30]  ; [pp+0xf30] Field <::.YFc>: static late (offset: 0x684)
    //     0xacc5e8: bl              #0xb27d24  ; InitLateStaticFieldStub
    // 0xacc5ec: r1 = Null
    //     0xacc5ec: mov             x1, NULL
    // 0xacc5f0: r2 = 4
    //     0xacc5f0: movz            x2, #0x4
    // 0xacc5f4: r0 = AllocateArray()
    //     0xacc5f4: bl              #0xb29b38  ; AllocateArrayStub
    // 0xacc5f8: r16 = "DataFileLoader: Downloaded "
    //     0xacc5f8: add             x16, PP, #0x15, lsl #12  ; [pp+0x15160] "DataFileLoader: Downloaded "
    //     0xacc5fc: ldr             x16, [x16, #0x160]
    // 0xacc600: StoreField: r0->field_f = r16
    //     0xacc600: stur            w16, [x0, #0xf]
    // 0xacc604: ldur            x1, [fp, #-0x18]
    // 0xacc608: StoreField: r0->field_13 = r1
    //     0xacc608: stur            w1, [x0, #0x13]
    // 0xacc60c: str             x0, [SP]
    // 0xacc610: r0 = _interpolate()
    //     0xacc610: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xacc614: str             NULL, [SP]
    // 0xacc618: mov             x1, x0
    // 0xacc61c: r4 = const [0, 0x2, 0x1, 0x1, ZFc, 0x1, null]
    //     0xacc61c: ldr             x4, [PP, #0xf40]  ; [pp+0xf40] List(7) [0, 0x2, 0x1, 0x1, "ZFc", 0x1, Null]
    // 0xacc620: r0 = call 0x2f00bc
    //     0xacc620: bl              #0x2f00bc
    // 0xacc624: ldur            x0, [fp, #-0x10]
    // 0xacc628: LoadField: r1 = r0->field_f
    //     0xacc628: ldur            w1, [x0, #0xf]
    // 0xacc62c: DecompressPointer r1
    //     0xacc62c: add             x1, x1, HEAP, lsl #32
    // 0xacc630: ldur            x2, [fp, #-0x18]
    // 0xacc634: r3 = LoadInt32Instr(r2)
    //     0xacc634: sbfx            x3, x2, #1, #0x1f
    //     0xacc638: tbz             w2, #0, #0xacc640
    //     0xacc63c: ldur            x3, [x2, #7]
    // 0xacc640: mov             x2, x3
    // 0xacc644: r0 = __unknown_function__()
    //     0xacc644: bl              #0xacc664  ; [] ::__unknown_function__
    // 0xacc648: mov             x1, x0
    // 0xacc64c: stur            x1, [fp, #-0x18]
    // 0xacc650: r0 = Await()
    //     0xacc650: bl              #0xa75a20  ; AwaitStub
    // 0xacc654: r0 = Null
    //     0xacc654: mov             x0, NULL
    // 0xacc658: r0 = ReturnAsyncNotFuture()
    //     0xacc658: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xacc65c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xacc65c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xacc660: b               #0xacc5c8
  }
  [closure] static vo <anonymous closure>(dynamic) {
    // ** addr: 0x711644, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic, int, int) {
    // ** addr: 0x7114cc, size: -0x1
  }
  [closure] static String <anonymous closure>(dynamic, Pa) {
    // ** addr: 0x7116b8, size: -0x1
  }
}
