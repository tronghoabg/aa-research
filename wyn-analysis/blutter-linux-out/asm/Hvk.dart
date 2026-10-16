// lib: , url: HVk

// class id: 1050418, size: 0x8
class :: {
}

// class id: 3282, size: 0x14, field offset: 0x14
class _mmb extends Nu<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic, bool) async {
    // ** addr: 0xad4db0, size: 0xb4
    // 0xad4db0: EnterFrame
    //     0xad4db0: stp             fp, lr, [SP, #-0x10]!
    //     0xad4db4: mov             fp, SP
    // 0xad4db8: AllocStack(0x28)
    //     0xad4db8: sub             SP, SP, #0x28
    // 0xad4dbc: SetupParameters(_mmb this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xad4dbc: stur            NULL, [fp, #-8]
    //     0xad4dc0: movz            x0, #0
    //     0xad4dc4: add             x1, fp, w0, sxtw #2
    //     0xad4dc8: ldr             x1, [x1, #0x18]
    //     0xad4dcc: add             x2, fp, w0, sxtw #2
    //     0xad4dd0: ldr             x2, [x2, #0x10]
    //     0xad4dd4: stur            x2, [fp, #-0x18]
    //     0xad4dd8: ldur            w3, [x1, #0x17]
    //     0xad4ddc: add             x3, x3, HEAP, lsl #32
    //     0xad4de0: stur            x3, [fp, #-0x10]
    // 0xad4de4: CheckStackOverflow
    //     0xad4de4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad4de8: cmp             SP, x16
    //     0xad4dec: b.ls            #0xad4e5c
    // 0xad4df0: InitAsync() -> Future<void?>
    //     0xad4df0: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xad4df4: bl              #0xa75e10  ; InitAsyncStub
    // 0xad4df8: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xad4df8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xad4dfc: ldr             x0, [x0, #0x28a8]
    //     0xad4e00: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xad4e04: cmp             w0, w16
    //     0xad4e08: b.ne            #0xad4e18
    //     0xad4e0c: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xad4e10: ldr             x2, [x2, #0xc90]
    //     0xad4e14: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xad4e18: r16 = <Qjb>
    //     0xad4e18: add             x16, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xad4e1c: ldr             x16, [x16, #0xc98]
    // 0xad4e20: stp             x0, x16, [SP]
    // 0xad4e24: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xad4e24: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xad4e28: r0 = call 0x346fb4
    //     0xad4e28: bl              #0x346fb4
    // 0xad4e2c: mov             x1, x0
    // 0xad4e30: ldur            x2, [fp, #-0x18]
    // 0xad4e34: r0 = __unknown_function__()
    //     0xad4e34: bl              #0xad50d0  ; [] ::__unknown_function__
    // 0xad4e38: mov             x1, x0
    // 0xad4e3c: stur            x1, [fp, #-0x18]
    // 0xad4e40: r0 = Await()
    //     0xad4e40: bl              #0xa75a20  ; AwaitStub
    // 0xad4e44: r0 = __unknown_function__()
    //     0xad4e44: bl              #0xad4e64  ; [] ::__unknown_function__
    // 0xad4e48: mov             x1, x0
    // 0xad4e4c: stur            x1, [fp, #-0x18]
    // 0xad4e50: r0 = Await()
    //     0xad4e50: bl              #0xa75a20  ; AwaitStub
    // 0xad4e54: r0 = Null
    //     0xad4e54: mov             x0, NULL
    // 0xad4e58: r0 = ReturnAsyncNotFuture()
    //     0xad4e58: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad4e5c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad4e5c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad4e60: b               #0xad4df0
  }
  [closure] bool <anonymous closure>(dynamic, Qjb) {
    // ** addr: 0x747ac8, size: -0x1
  }
}

// class id: 4079, size: 0xc, field offset: 0xc
//   const constructor, 
class lmb extends _ijb {
}
