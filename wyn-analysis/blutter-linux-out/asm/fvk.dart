// lib: , url: FVk

// class id: 1050416, size: 0x8
class :: {
}

// class id: 3283, size: 0x18, field offset: 0x14
class _jmb extends Nu<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic, mBa<int>) async {
    // ** addr: 0xad4c38, size: 0xf0
    // 0xad4c38: EnterFrame
    //     0xad4c38: stp             fp, lr, [SP, #-0x10]!
    //     0xad4c3c: mov             fp, SP
    // 0xad4c40: AllocStack(0x28)
    //     0xad4c40: sub             SP, SP, #0x28
    // 0xad4c44: SetupParameters(_jmb this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xad4c44: stur            NULL, [fp, #-8]
    //     0xad4c48: movz            x0, #0
    //     0xad4c4c: add             x1, fp, w0, sxtw #2
    //     0xad4c50: ldr             x1, [x1, #0x18]
    //     0xad4c54: add             x2, fp, w0, sxtw #2
    //     0xad4c58: ldr             x2, [x2, #0x10]
    //     0xad4c5c: stur            x2, [fp, #-0x18]
    //     0xad4c60: ldur            w3, [x1, #0x17]
    //     0xad4c64: add             x3, x3, HEAP, lsl #32
    //     0xad4c68: stur            x3, [fp, #-0x10]
    // 0xad4c6c: CheckStackOverflow
    //     0xad4c6c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad4c70: cmp             SP, x16
    //     0xad4c74: b.ls            #0xad4d20
    // 0xad4c78: InitAsync() -> Future<void?>
    //     0xad4c78: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xad4c7c: bl              #0xa75e10  ; InitAsyncStub
    // 0xad4c80: ldur            x1, [fp, #-0x18]
    // 0xad4c84: r0 = call 0x705c94
    //     0xad4c84: bl              #0x705c94
    // 0xad4c88: mov             x1, x0
    // 0xad4c8c: ldur            x0, [fp, #-0x10]
    // 0xad4c90: LoadField: r2 = r0->field_13
    //     0xad4c90: ldur            w2, [x0, #0x13]
    // 0xad4c94: DecompressPointer r2
    //     0xad4c94: add             x2, x2, HEAP, lsl #32
    // 0xad4c98: r3 = LoadInt32Instr(r1)
    //     0xad4c98: sbfx            x3, x1, #1, #0x1f
    //     0xad4c9c: tbz             w1, #0, #0xad4ca4
    //     0xad4ca0: ldur            x3, [x1, #7]
    // 0xad4ca4: r1 = LoadInt32Instr(r2)
    //     0xad4ca4: sbfx            x1, x2, #1, #0x1f
    //     0xad4ca8: tbz             w2, #0, #0xad4cb0
    //     0xad4cac: ldur            x1, [x2, #7]
    // 0xad4cb0: cmp             x3, x1
    // 0xad4cb4: b.eq            #0xad4d18
    // 0xad4cb8: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xad4cb8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xad4cbc: ldr             x0, [x0, #0x28a8]
    //     0xad4cc0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xad4cc4: cmp             w0, w16
    //     0xad4cc8: b.ne            #0xad4cd8
    //     0xad4ccc: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xad4cd0: ldr             x2, [x2, #0xc90]
    //     0xad4cd4: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xad4cd8: r16 = <Qjb>
    //     0xad4cd8: add             x16, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xad4cdc: ldr             x16, [x16, #0xc98]
    // 0xad4ce0: stp             x0, x16, [SP]
    // 0xad4ce4: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xad4ce4: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xad4ce8: r0 = call 0x346fb4
    //     0xad4ce8: bl              #0x346fb4
    // 0xad4cec: ldur            x1, [fp, #-0x18]
    // 0xad4cf0: stur            x0, [fp, #-0x18]
    // 0xad4cf4: r0 = call 0x705c94
    //     0xad4cf4: bl              #0x705c94
    // 0xad4cf8: r2 = LoadInt32Instr(r0)
    //     0xad4cf8: sbfx            x2, x0, #1, #0x1f
    //     0xad4cfc: tbz             w0, #0, #0xad4d04
    //     0xad4d00: ldur            x2, [x0, #7]
    // 0xad4d04: ldur            x1, [fp, #-0x18]
    // 0xad4d08: r0 = __unknown_function__()
    //     0xad4d08: bl              #0xad4d28  ; [] ::__unknown_function__
    // 0xad4d0c: mov             x1, x0
    // 0xad4d10: stur            x1, [fp, #-0x18]
    // 0xad4d14: r0 = Await()
    //     0xad4d14: bl              #0xa75a20  ; AwaitStub
    // 0xad4d18: r0 = Null
    //     0xad4d18: mov             x0, NULL
    // 0xad4d1c: r0 = ReturnAsyncNotFuture()
    //     0xad4d1c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad4d20: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad4d20: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad4d24: b               #0xad4c78
  }
  [closure] int <anonymous closure>(dynamic, Qjb) {
    // ** addr: 0x747734, size: -0x1
  }
  [closure] WAa<int> <anonymous closure>(dynamic, int, hx) {
    // ** addr: 0x74759c, size: -0x1
  }
  [closure] LBa<int> <anonymous closure>(dynamic, aqa, PBa<int>) {
    // ** addr: 0x74740c, size: -0x1
  }
}

// class id: 4080, size: 0xc, field offset: 0xc
//   const constructor, 
class imb extends _ijb {
}
