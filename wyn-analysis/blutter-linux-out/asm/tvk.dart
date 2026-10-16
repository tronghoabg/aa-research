// lib: , url: tVk

// class id: 1050465, size: 0x8
class :: {
}

// class id: 3248, size: 0x3c, field offset: 0x14
class _Aob extends Nu<dynamic> {

  late S _FVc; // offset: 0x34

  [closure] Future<void> <anonymous closure>(dynamic, S) async {
    // ** addr: 0xaf7ce0, size: 0x240
    // 0xaf7ce0: EnterFrame
    //     0xaf7ce0: stp             fp, lr, [SP, #-0x10]!
    //     0xaf7ce4: mov             fp, SP
    // 0xaf7ce8: AllocStack(0x98)
    //     0xaf7ce8: sub             SP, SP, #0x98
    // 0xaf7cec: SetupParameters(_Aob this /* r1 */, dynamic _ /* r2, fp-0x78 */)
    //     0xaf7cec: stur            NULL, [fp, #-8]
    //     0xaf7cf0: movz            x0, #0
    //     0xaf7cf4: add             x1, fp, w0, sxtw #2
    //     0xaf7cf8: ldr             x1, [x1, #0x18]
    //     0xaf7cfc: add             x2, fp, w0, sxtw #2
    //     0xaf7d00: ldr             x2, [x2, #0x10]
    //     0xaf7d04: stur            x2, [fp, #-0x78]
    //     0xaf7d08: ldur            w3, [x1, #0x17]
    //     0xaf7d0c: add             x3, x3, HEAP, lsl #32
    //     0xaf7d10: stur            x3, [fp, #-0x70]
    // 0xaf7d14: CheckStackOverflow
    //     0xaf7d14: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf7d18: cmp             SP, x16
    //     0xaf7d1c: b.ls            #0xaf7ef4
    // 0xaf7d20: InitAsync() -> Future<void?>
    //     0xaf7d20: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xaf7d24: bl              #0xa75e10  ; InitAsyncStub
    // 0xaf7d28: ldur            x0, [fp, #-0x78]
    // 0xaf7d2c: ldur            x1, [fp, #-0x70]
    // 0xaf7d30: r1 = 2
    //     0xaf7d30: movz            x1, #0x2
    // 0xaf7d34: r0 = AllocateContext()
    //     0xaf7d34: bl              #0xb28aa8  ; AllocateContextStub
    // 0xaf7d38: mov             x2, x0
    // 0xaf7d3c: ldur            x0, [fp, #-0x70]
    // 0xaf7d40: stur            x2, [fp, #-0x80]
    // 0xaf7d44: StoreField: r2->field_b = r0
    //     0xaf7d44: stur            w0, [x2, #0xb]
    // 0xaf7d48: LoadField: r1 = r0->field_f
    //     0xaf7d48: ldur            w1, [x0, #0xf]
    // 0xaf7d4c: DecompressPointer r1
    //     0xaf7d4c: add             x1, x1, HEAP, lsl #32
    // 0xaf7d50: LoadField: r3 = r1->field_1b
    //     0xaf7d50: ldur            w3, [x1, #0x1b]
    // 0xaf7d54: DecompressPointer r3
    //     0xaf7d54: add             x3, x3, HEAP, lsl #32
    // 0xaf7d58: mov             x1, x3
    // 0xaf7d5c: r0 = call 0x809a74
    //     0xaf7d5c: bl              #0x809a74
    // 0xaf7d60: mov             x1, x0
    // 0xaf7d64: stur            x1, [fp, #-0x88]
    // 0xaf7d68: r0 = Await()
    //     0xaf7d68: bl              #0xa75a20  ; AwaitStub
    // 0xaf7d6c: mov             x1, x0
    // 0xaf7d70: ldur            x3, [fp, #-0x80]
    // 0xaf7d74: StoreField: r3->field_f = r0
    //     0xaf7d74: stur            w0, [x3, #0xf]
    //     0xaf7d78: tbz             w0, #0, #0xaf7d94
    //     0xaf7d7c: ldurb           w16, [x3, #-1]
    //     0xaf7d80: ldurb           w17, [x0, #-1]
    //     0xaf7d84: and             x16, x17, x16, lsr #2
    //     0xaf7d88: tst             x16, HEAP, lsr #32
    //     0xaf7d8c: b.eq            #0xaf7d94
    //     0xaf7d90: bl              #0xb282a4  ; WriteBarrierWrappersStub
    // 0xaf7d94: ldur            x0, [fp, #-0x78]
    // 0xaf7d98: LoadField: r2 = r0->field_7
    //     0xaf7d98: ldur            w2, [x0, #7]
    // 0xaf7d9c: DecompressPointer r2
    //     0xaf7d9c: add             x2, x2, HEAP, lsl #32
    // 0xaf7da0: cmp             w2, NULL
    // 0xaf7da4: b.ne            #0xaf7db0
    // 0xaf7da8: r0 = Null
    //     0xaf7da8: mov             x0, NULL
    // 0xaf7dac: r0 = ReturnAsyncNotFuture()
    //     0xaf7dac: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaf7db0: ldur            x0, [fp, #-0x70]
    // 0xaf7db4: LoadField: r4 = r0->field_f
    //     0xaf7db4: ldur            w4, [x0, #0xf]
    // 0xaf7db8: DecompressPointer r4
    //     0xaf7db8: add             x4, x4, HEAP, lsl #32
    // 0xaf7dbc: stur            x4, [fp, #-0x78]
    // 0xaf7dc0: LoadField: r2 = r4->field_23
    //     0xaf7dc0: ldur            x2, [x4, #0x23]
    // 0xaf7dc4: r5 = LoadInt32Instr(r1)
    //     0xaf7dc4: sbfx            x5, x1, #1, #0x1f
    //     0xaf7dc8: tbz             w1, #0, #0xaf7dd0
    //     0xaf7dcc: ldur            x5, [x1, #7]
    // 0xaf7dd0: cmp             x2, x5
    // 0xaf7dd4: b.eq            #0xaf7e04
    // 0xaf7dd8: LoadField: r1 = r4->field_f
    //     0xaf7dd8: ldur            w1, [x4, #0xf]
    // 0xaf7ddc: DecompressPointer r1
    //     0xaf7ddc: add             x1, x1, HEAP, lsl #32
    // 0xaf7de0: cmp             w1, NULL
    // 0xaf7de4: b.eq            #0xaf7e04
    // 0xaf7de8: mov             x2, x3
    // 0xaf7dec: r1 = Function '<anonymous closure>':.
    //     0xaf7dec: add             x1, PP, #0x35, lsl #12  ; [pp+0x35a78] AnonymousClosure: (0x809bb8), in [tVk] _Aob::<anonymous closure> (0xaf7ce0)
    //     0xaf7df0: ldr             x1, [x1, #0xa78]
    // 0xaf7df4: r0 = AllocateClosure()
    //     0xaf7df4: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xaf7df8: ldur            x1, [fp, #-0x78]
    // 0xaf7dfc: mov             x2, x0
    // 0xaf7e00: r0 = call 0x312460
    //     0xaf7e00: bl              #0x312460
    // 0xaf7e04: ldur            x0, [fp, #-0x70]
    // 0xaf7e08: ldur            x2, [fp, #-0x80]
    // 0xaf7e0c: LoadField: r1 = r2->field_f
    //     0xaf7e0c: ldur            w1, [x2, #0xf]
    // 0xaf7e10: DecompressPointer r1
    //     0xaf7e10: add             x1, x1, HEAP, lsl #32
    // 0xaf7e14: stp             x1, NULL, [SP]
    // 0xaf7e18: r0 = _Double.fromInteger()
    //     0xaf7e18: bl              #0xa6b678  ; [dart:core] _Double::_Double.fromInteger
    // 0xaf7e1c: LoadField: d0 = r0->field_7
    //     0xaf7e1c: ldur            d0, [x0, #7]
    // 0xaf7e20: d1 = 0.070000
    //     0xaf7e20: add             x17, PP, #0x35, lsl #12  ; [pp+0x35a80] IMM: double(0.07) from 0x3fb1eb851eb851ec
    //     0xaf7e24: ldr             d1, [x17, #0xa80]
    // 0xaf7e28: fmul            d2, d0, d1
    // 0xaf7e2c: fcmp            d2, d2
    // 0xaf7e30: b.vs            #0xaf7efc
    // 0xaf7e34: fcvtzs          x1, d2
    // 0xaf7e38: asr             x16, x1, #0x1e
    // 0xaf7e3c: cmp             x16, x1, asr #63
    // 0xaf7e40: b.ne            #0xaf7efc
    // 0xaf7e44: lsl             x1, x1, #1
    // 0xaf7e48: mov             x0, x1
    // 0xaf7e4c: ldur            x3, [fp, #-0x80]
    // 0xaf7e50: StoreField: r3->field_13 = r0
    //     0xaf7e50: stur            w0, [x3, #0x13]
    //     0xaf7e54: tbz             w0, #0, #0xaf7e70
    //     0xaf7e58: ldurb           w16, [x3, #-1]
    //     0xaf7e5c: ldurb           w17, [x0, #-1]
    //     0xaf7e60: and             x16, x17, x16, lsr #2
    //     0xaf7e64: tst             x16, HEAP, lsr #32
    //     0xaf7e68: b.eq            #0xaf7e70
    //     0xaf7e6c: bl              #0xb282a4  ; WriteBarrierWrappersStub
    // 0xaf7e70: ldur            x0, [fp, #-0x70]
    // 0xaf7e74: LoadField: r4 = r0->field_f
    //     0xaf7e74: ldur            w4, [x0, #0xf]
    // 0xaf7e78: DecompressPointer r4
    //     0xaf7e78: add             x4, x4, HEAP, lsl #32
    // 0xaf7e7c: stur            x4, [fp, #-0x78]
    // 0xaf7e80: LoadField: r2 = r4->field_2b
    //     0xaf7e80: ldur            x2, [x4, #0x2b]
    // 0xaf7e84: r5 = LoadInt32Instr(r1)
    //     0xaf7e84: sbfx            x5, x1, #1, #0x1f
    //     0xaf7e88: tbz             w1, #0, #0xaf7e90
    //     0xaf7e8c: ldur            x5, [x1, #7]
    // 0xaf7e90: cmp             x5, x2
    // 0xaf7e94: b.eq            #0xaf7eec
    // 0xaf7e98: LoadField: r1 = r4->field_f
    //     0xaf7e98: ldur            w1, [x4, #0xf]
    // 0xaf7e9c: DecompressPointer r1
    //     0xaf7e9c: add             x1, x1, HEAP, lsl #32
    // 0xaf7ea0: cmp             w1, NULL
    // 0xaf7ea4: b.eq            #0xaf7eec
    // 0xaf7ea8: mov             x2, x3
    // 0xaf7eac: r1 = Function '<anonymous closure>':.
    //     0xaf7eac: add             x1, PP, #0x35, lsl #12  ; [pp+0x35a88] AnonymousClosure: (0x809b7c), in [tVk] _Aob::<anonymous closure> (0xaf7ce0)
    //     0xaf7eb0: ldr             x1, [x1, #0xa88]
    // 0xaf7eb4: r0 = AllocateClosure()
    //     0xaf7eb4: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xaf7eb8: ldur            x1, [fp, #-0x78]
    // 0xaf7ebc: mov             x2, x0
    // 0xaf7ec0: r0 = call 0x312460
    //     0xaf7ec0: bl              #0x312460
    // 0xaf7ec4: b               #0xaf7eec
    // 0xaf7ec8: sub             SP, fp, #0x98
    // 0xaf7ecc: ldur            x2, [fp, #-0x70]
    // 0xaf7ed0: LoadField: r0 = r2->field_f
    //     0xaf7ed0: ldur            w0, [x2, #0xf]
    // 0xaf7ed4: DecompressPointer r0
    //     0xaf7ed4: add             x0, x0, HEAP, lsl #32
    // 0xaf7ed8: LoadField: r1 = r0->field_13
    //     0xaf7ed8: ldur            w1, [x0, #0x13]
    // 0xaf7edc: DecompressPointer r1
    //     0xaf7edc: add             x1, x1, HEAP, lsl #32
    // 0xaf7ee0: r2 = "Battery Level Stream exception"
    //     0xaf7ee0: add             x2, PP, #0x35, lsl #12  ; [pp+0x35a90] "Battery Level Stream exception"
    //     0xaf7ee4: ldr             x2, [x2, #0xa90]
    // 0xaf7ee8: r0 = call 0x33fc94
    //     0xaf7ee8: bl              #0x33fc94
    // 0xaf7eec: r0 = Null
    //     0xaf7eec: mov             x0, NULL
    // 0xaf7ef0: r0 = ReturnAsyncNotFuture()
    //     0xaf7ef0: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaf7ef4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf7ef4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf7ef8: b               #0xaf7d20
    // 0xaf7efc: SaveReg d2
    //     0xaf7efc: str             q2, [SP, #-0x10]!
    // 0xaf7f00: d0 = 0.000000
    //     0xaf7f00: fmov            d0, d2
    // 0xaf7f04: r0 = 74
    //     0xaf7f04: movz            x0, #0x4a
    // 0xaf7f08: r30 = DoubleToIntegerStub
    //     0xaf7f08: ldr             lr, [PP, #0xab0]  ; [pp+0xab0] Stub: DoubleToInteger (0x2e1874)
    // 0xaf7f0c: LoadField: r30 = r30->field_7
    //     0xaf7f0c: ldur            lr, [lr, #7]
    // 0xaf7f10: blr             lr
    // 0xaf7f14: mov             x1, x0
    // 0xaf7f18: RestoreReg d2
    //     0xaf7f18: ldr             q2, [SP], #0x10
    // 0xaf7f1c: b               #0xaf7e48
  }
  [closure] void <anonymous closure>(dynamic, cw) {
    // ** addr: 0xaf7f20, size: 0xd0
    // 0xaf7f20: EnterFrame
    //     0xaf7f20: stp             fp, lr, [SP, #-0x10]!
    //     0xaf7f24: mov             fp, SP
    // 0xaf7f28: AllocStack(0x60)
    //     0xaf7f28: sub             SP, SP, #0x60
    // 0xaf7f2c: SetupParameters([dynamic _ /* r0 */])
    //     0xaf7f2c: ldr             x0, [fp, #0x18]
    //     0xaf7f30: ldur            w1, [x0, #0x17]
    //     0xaf7f34: add             x1, x1, HEAP, lsl #32
    //     0xaf7f38: stur            x1, [fp, #-0x50]
    // 0xaf7f3c: CheckStackOverflow
    //     0xaf7f3c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf7f40: cmp             SP, x16
    //     0xaf7f44: b.ls            #0xaf7fe8
    // 0xaf7f48: r1 = 1
    //     0xaf7f48: movz            x1, #0x1
    // 0xaf7f4c: r0 = AllocateContext()
    //     0xaf7f4c: bl              #0xb28aa8  ; AllocateContextStub
    // 0xaf7f50: mov             x3, x0
    // 0xaf7f54: ldur            x0, [fp, #-0x50]
    // 0xaf7f58: stur            x3, [fp, #-0x60]
    // 0xaf7f5c: StoreField: r3->field_b = r0
    //     0xaf7f5c: stur            w0, [x3, #0xb]
    // 0xaf7f60: ldr             x1, [fp, #0x10]
    // 0xaf7f64: StoreField: r3->field_f = r1
    //     0xaf7f64: stur            w1, [x3, #0xf]
    // 0xaf7f68: LoadField: r4 = r0->field_f
    //     0xaf7f68: ldur            w4, [x0, #0xf]
    // 0xaf7f6c: DecompressPointer r4
    //     0xaf7f6c: add             x4, x4, HEAP, lsl #32
    // 0xaf7f70: stur            x4, [fp, #-0x58]
    // 0xaf7f74: LoadField: r2 = r4->field_1f
    //     0xaf7f74: ldur            w2, [x4, #0x1f]
    // 0xaf7f78: DecompressPointer r2
    //     0xaf7f78: add             x2, x2, HEAP, lsl #32
    // 0xaf7f7c: cmp             w2, w1
    // 0xaf7f80: b.eq            #0xaf7fd8
    // 0xaf7f84: LoadField: r1 = r4->field_f
    //     0xaf7f84: ldur            w1, [x4, #0xf]
    // 0xaf7f88: DecompressPointer r1
    //     0xaf7f88: add             x1, x1, HEAP, lsl #32
    // 0xaf7f8c: cmp             w1, NULL
    // 0xaf7f90: b.eq            #0xaf7fd8
    // 0xaf7f94: mov             x2, x3
    // 0xaf7f98: r1 = Function '<anonymous closure>':.
    //     0xaf7f98: add             x1, PP, #0x35, lsl #12  ; [pp+0x35af0] AnonymousClosure: (0x809e40), in [tVk] _Aob::<anonymous closure> (0x809bf4)
    //     0xaf7f9c: ldr             x1, [x1, #0xaf0]
    // 0xaf7fa0: r0 = AllocateClosure()
    //     0xaf7fa0: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xaf7fa4: ldur            x1, [fp, #-0x58]
    // 0xaf7fa8: mov             x2, x0
    // 0xaf7fac: r0 = call 0x312460
    //     0xaf7fac: bl              #0x312460
    // 0xaf7fb0: b               #0xaf7fd8
    // 0xaf7fb4: sub             SP, fp, #0x60
    // 0xaf7fb8: ldur            x2, [fp, #-0x50]
    // 0xaf7fbc: LoadField: r0 = r2->field_f
    //     0xaf7fbc: ldur            w0, [x2, #0xf]
    // 0xaf7fc0: DecompressPointer r0
    //     0xaf7fc0: add             x0, x0, HEAP, lsl #32
    // 0xaf7fc4: LoadField: r1 = r0->field_13
    //     0xaf7fc4: ldur            w1, [x0, #0x13]
    // 0xaf7fc8: DecompressPointer r1
    //     0xaf7fc8: add             x1, x1, HEAP, lsl #32
    // 0xaf7fcc: r2 = "Battery State Stream exception"
    //     0xaf7fcc: add             x2, PP, #0x35, lsl #12  ; [pp+0x35af8] "Battery State Stream exception"
    //     0xaf7fd0: ldr             x2, [x2, #0xaf8]
    // 0xaf7fd4: r0 = call 0x33fc94
    //     0xaf7fd4: bl              #0x33fc94
    // 0xaf7fd8: r0 = Null
    //     0xaf7fd8: mov             x0, NULL
    // 0xaf7fdc: LeaveFrame
    //     0xaf7fdc: mov             SP, fp
    //     0xaf7fe0: ldp             fp, lr, [SP], #0x10
    // 0xaf7fe4: ret
    //     0xaf7fe4: ret             
    // 0xaf7fe8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf7fe8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf7fec: b               #0xaf7f48
  }
  [closure] Shader <anonymous closure>(dynamic, fs) {
    // ** addr: 0x784254, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, cw) {
    // ** addr: 0x809bf4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x809bb8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x809b7c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x809e40, size: -0x1
  }
}

// class id: 4028, size: 0xc, field offset: 0xc
//   const constructor, 
class zob extends Ku {
}
