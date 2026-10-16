// lib: , url: PMk

// class id: 1049996, size: 0x8
class :: {
}

// class id: 3890, size: 0x34, field offset: 0xc
//   const constructor, 
class dWa extends iw {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0xa939b0, size: 0xa8
    // 0xa939b0: EnterFrame
    //     0xa939b0: stp             fp, lr, [SP, #-0x10]!
    //     0xa939b4: mov             fp, SP
    // 0xa939b8: AllocStack(0x18)
    //     0xa939b8: sub             SP, SP, #0x18
    // 0xa939bc: SetupParameters(dWa this /* r1 */)
    //     0xa939bc: stur            NULL, [fp, #-8]
    //     0xa939c0: movz            x0, #0
    //     0xa939c4: add             x1, fp, w0, sxtw #2
    //     0xa939c8: ldr             x1, [x1, #0x10]
    //     0xa939cc: ldur            w2, [x1, #0x17]
    //     0xa939d0: add             x2, x2, HEAP, lsl #32
    //     0xa939d4: stur            x2, [fp, #-0x10]
    // 0xa939d8: CheckStackOverflow
    //     0xa939d8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa939dc: cmp             SP, x16
    //     0xa939e0: b.ls            #0xa93a50
    // 0xa939e4: InitAsync() -> Future<void?>
    //     0xa939e4: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xa939e8: bl              #0xa75e10  ; InitAsyncStub
    // 0xa939ec: ldur            x0, [fp, #-0x10]
    // 0xa939f0: LoadField: r1 = r0->field_f
    //     0xa939f0: ldur            w1, [x0, #0xf]
    // 0xa939f4: DecompressPointer r1
    //     0xa939f4: add             x1, x1, HEAP, lsl #32
    // 0xa939f8: LoadField: r2 = r0->field_13
    //     0xa939f8: ldur            w2, [x0, #0x13]
    // 0xa939fc: DecompressPointer r2
    //     0xa939fc: add             x2, x2, HEAP, lsl #32
    // 0xa93a00: LoadField: r3 = r1->field_b
    //     0xa93a00: ldur            w3, [x1, #0xb]
    // 0xa93a04: DecompressPointer r3
    //     0xa93a04: add             x3, x3, HEAP, lsl #32
    // 0xa93a08: r0 = call 0x5ee000
    //     0xa93a08: bl              #0x5ee000
    // 0xa93a0c: mov             x1, x0
    // 0xa93a10: stur            x1, [fp, #-0x18]
    // 0xa93a14: r0 = Await()
    //     0xa93a14: bl              #0xa75a20  ; AwaitStub
    // 0xa93a18: cmp             w0, NULL
    // 0xa93a1c: b.eq            #0xa93a48
    // 0xa93a20: ldur            x1, [fp, #-0x10]
    // 0xa93a24: LoadField: r2 = r1->field_f
    //     0xa93a24: ldur            w2, [x1, #0xf]
    // 0xa93a28: DecompressPointer r2
    //     0xa93a28: add             x2, x2, HEAP, lsl #32
    // 0xa93a2c: LoadField: r1 = r2->field_2f
    //     0xa93a2c: ldur            w1, [x2, #0x2f]
    // 0xa93a30: DecompressPointer r1
    //     0xa93a30: add             x1, x1, HEAP, lsl #32
    // 0xa93a34: ArrayLoad: r2 = r1[0]  ; List_4
    //     0xa93a34: ldur            w2, [x1, #0x17]
    // 0xa93a38: DecompressPointer r2
    //     0xa93a38: add             x2, x2, HEAP, lsl #32
    // 0xa93a3c: mov             x1, x2
    // 0xa93a40: mov             x2, x0
    // 0xa93a44: r0 = call 0x5ed3e8
    //     0xa93a44: bl              #0x5ed3e8
    // 0xa93a48: r0 = Null
    //     0xa93a48: mov             x0, NULL
    // 0xa93a4c: r0 = ReturnAsyncNotFuture()
    //     0xa93a4c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa93a50: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa93a50: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa93a54: b               #0xa939e4
  }
  [closure] Hma <anonymous closure>(dynamic, aqa) {
    // ** addr: 0x5eea58, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x5ef3b4, size: -0x1
  }
  [closure] Tla <anonymous closure>(dynamic, aqa, eoa) {
    // ** addr: 0x5ef244, size: -0x1
  }
}
