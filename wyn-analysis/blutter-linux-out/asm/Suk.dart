// lib: , url: SUk

// class id: 1050388, size: 0x8
class :: {

  [closure] static rQ <anonymous closure>(dynamic, aqa) {
    // ** addr: 0x6ef3e0, size: -0x1
  }
}

// class id: 3314, size: 0x14, field offset: 0x14
class _Hkb extends Nu<dynamic> {

  [closure] Oma <anonymous closure>(dynamic, aqa, fW) {
    // ** addr: 0x6efb38, size: -0x1
  }
}

// class id: 3315, size: 0x14, field offset: 0x14
class _Fkb extends Nu<dynamic> {

  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xaade28, size: 0xfc
    // 0xaade28: EnterFrame
    //     0xaade28: stp             fp, lr, [SP, #-0x10]!
    //     0xaade2c: mov             fp, SP
    // 0xaade30: AllocStack(0x30)
    //     0xaade30: sub             SP, SP, #0x30
    // 0xaade34: SetupParameters(_Fkb this /* r1 */)
    //     0xaade34: stur            NULL, [fp, #-8]
    //     0xaade38: movz            x0, #0
    //     0xaade3c: add             x1, fp, w0, sxtw #2
    //     0xaade40: ldr             x1, [x1, #0x10]
    //     0xaade44: ldur            w2, [x1, #0x17]
    //     0xaade48: add             x2, x2, HEAP, lsl #32
    //     0xaade4c: stur            x2, [fp, #-0x10]
    // 0xaade50: CheckStackOverflow
    //     0xaade50: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaade54: cmp             SP, x16
    //     0xaade58: b.ls            #0xaadf10
    // 0xaade5c: InitAsync() -> Future<Null?>
    //     0xaade5c: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xaade60: bl              #0xa75e10  ; InitAsyncStub
    // 0xaade64: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xaade64: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaade68: ldr             x0, [x0, #0x28a8]
    //     0xaade6c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaade70: cmp             w0, w16
    //     0xaade74: b.ne            #0xaade84
    //     0xaade78: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xaade7c: ldr             x2, [x2, #0xc90]
    //     0xaade80: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaade84: stur            x0, [fp, #-0x18]
    // 0xaade88: r16 = <Qjb>
    //     0xaade88: add             x16, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xaade8c: ldr             x16, [x16, #0xc98]
    // 0xaade90: stp             x0, x16, [SP]
    // 0xaade94: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xaade94: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xaade98: r0 = call 0x346fb4
    //     0xaade98: bl              #0x346fb4
    // 0xaade9c: LoadField: r1 = r0->field_23
    //     0xaade9c: ldur            w1, [x0, #0x23]
    // 0xaadea0: DecompressPointer r1
    //     0xaadea0: add             x1, x1, HEAP, lsl #32
    // 0xaadea4: r16 = Sentinel
    //     0xaadea4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xaadea8: cmp             w1, w16
    // 0xaadeac: b.eq            #0xaadf18
    // 0xaadeb0: r2 = "v1.sensors.calib_understand"
    //     0xaadeb0: add             x2, PP, #0x2e, lsl #12  ; [pp+0x2e220] "v1.sensors.calib_understand"
    //     0xaadeb4: ldr             x2, [x2, #0x220]
    // 0xaadeb8: r0 = call 0x33fc04
    //     0xaadeb8: bl              #0x33fc04
    // 0xaadebc: cmp             w0, NULL
    // 0xaadec0: b.eq            #0xaadec8
    // 0xaadec4: tbz             w0, #4, #0xaadee4
    // 0xaadec8: ldur            x0, [fp, #-0x10]
    // 0xaadecc: LoadField: r1 = r0->field_f
    //     0xaadecc: ldur            w1, [x0, #0xf]
    // 0xaaded0: DecompressPointer r1
    //     0xaaded0: add             x1, x1, HEAP, lsl #32
    // 0xaaded4: r0 = call 0x6ef384
    //     0xaaded4: bl              #0x6ef384
    // 0xaaded8: mov             x1, x0
    // 0xaadedc: stur            x1, [fp, #-0x20]
    // 0xaadee0: r0 = Await()
    //     0xaadee0: bl              #0xa75a20  ; AwaitStub
    // 0xaadee4: r0 = __unknown_function__()
    //     0xaadee4: bl              #0xaae14c  ; [] ::__unknown_function__
    // 0xaadee8: r16 = <pkb>
    //     0xaadee8: add             x16, PP, #0x11, lsl #12  ; [pp+0x116f0] TypeArguments: <pkb>
    //     0xaadeec: ldr             x16, [x16, #0x6f0]
    // 0xaadef0: ldur            lr, [fp, #-0x18]
    // 0xaadef4: stp             lr, x16, [SP]
    // 0xaadef8: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xaadef8: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xaadefc: r0 = call 0x346fb4
    //     0xaadefc: bl              #0x346fb4
    // 0xaadf00: mov             x1, x0
    // 0xaadf04: r0 = call 0x6e4d6c
    //     0xaadf04: bl              #0x6e4d6c
    // 0xaadf08: r0 = Null
    //     0xaadf08: mov             x0, NULL
    // 0xaadf0c: r0 = ReturnAsyncNotFuture()
    //     0xaadf0c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaadf10: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaadf10: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaadf14: b               #0xaade5c
    // 0xaadf18: r9 = _pCh
    //     0xaadf18: add             x9, PP, #9, lsl #12  ; [pp+0x9d10] Field <Qjb._pCh@1796148846>: late (offset: 0x24)
    //     0xaadf1c: ldr             x9, [x9, #0xd10]
    // 0xaadf20: r0 = LateInitializationErrorSharedWithoutFPURegs()
    //     0xaadf20: bl              #0xb2a470  ; LateInitializationErrorSharedWithoutFPURegsStub
  }
  [closure] Hma <anonymous closure>(dynamic, aqa, fW) {
    // ** addr: 0x6e36dc, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x6e4d14, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x6e4c20, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x6e4b90, size: -0x1
  }
  [closure] Hma <anonymous closure>(dynamic, aqa, fW) {
    // ** addr: 0x6e493c, size: -0x1
  }
}

// class id: 3860, size: 0x14, field offset: 0xc
//   const constructor, 
class Ikb extends iw {
}

// class id: 4097, size: 0xc, field offset: 0xc
//   const constructor, 
class Gkb extends _ijb {
}

// class id: 4098, size: 0xc, field offset: 0xc
//   const constructor, 
class Ekb extends _ijb {
}

// class id: 4303, size: 0xc, field offset: 0xc
class Dkb extends jG {
}

// class id: 4304, size: 0xc, field offset: 0xc
class _Jkb extends jG {
}
