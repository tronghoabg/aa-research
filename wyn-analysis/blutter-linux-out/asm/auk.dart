// lib: , url: AUk

// class id: 1050370, size: 0x8
class :: {
}

// class id: 268, size: 0x28, field offset: 0x8
class Ljb extends Object {
}

// class id: 269, size: 0x54, field offset: 0x8
class Kjb extends Object {
}

// class id: 2736, size: 0x58, field offset: 0x24
class Mjb extends mJ {

  late Fdb _zMh; // offset: 0x3c

  [closure] Future<void> <anonymous closure>(dynamic, Fdb, int, int) async {
    // ** addr: 0xae9bc4, size: 0xd0
    // 0xae9bc4: EnterFrame
    //     0xae9bc4: stp             fp, lr, [SP, #-0x10]!
    //     0xae9bc8: mov             fp, SP
    // 0xae9bcc: AllocStack(0x20)
    //     0xae9bcc: sub             SP, SP, #0x20
    // 0xae9bd0: SetupParameters(Mjb this /* r1 */, dynamic _ /* r2, fp-0x20 */, dynamic _ /* r3, fp-0x18 */)
    //     0xae9bd0: stur            NULL, [fp, #-8]
    //     0xae9bd4: movz            x0, #0
    //     0xae9bd8: add             x1, fp, w0, sxtw #2
    //     0xae9bdc: ldr             x1, [x1, #0x28]
    //     0xae9be0: add             x2, fp, w0, sxtw #2
    //     0xae9be4: ldr             x2, [x2, #0x20]
    //     0xae9be8: stur            x2, [fp, #-0x20]
    //     0xae9bec: add             x3, fp, w0, sxtw #2
    //     0xae9bf0: ldr             x3, [x3, #0x18]
    //     0xae9bf4: stur            x3, [fp, #-0x18]
    //     0xae9bf8: ldur            w4, [x1, #0x17]
    //     0xae9bfc: add             x4, x4, HEAP, lsl #32
    //     0xae9c00: stur            x4, [fp, #-0x10]
    // 0xae9c04: CheckStackOverflow
    //     0xae9c04: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae9c08: cmp             SP, x16
    //     0xae9c0c: b.ls            #0xae9c8c
    // 0xae9c10: InitAsync() -> Future<void?>
    //     0xae9c10: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xae9c14: bl              #0xa75e10  ; InitAsyncStub
    // 0xae9c18: ldur            x0, [fp, #-0x18]
    // 0xae9c1c: r1 = LoadInt32Instr(r0)
    //     0xae9c1c: sbfx            x1, x0, #1, #0x1f
    //     0xae9c20: tbz             w0, #0, #0xae9c28
    //     0xae9c24: ldur            x1, [x0, #7]
    // 0xae9c28: cmp             x1, #2
    // 0xae9c2c: b.ge            #0xae9c84
    // 0xae9c30: ldur            x1, [fp, #-0x20]
    // 0xae9c34: r2 = "ALTER TABLE contrib ADD COLUMN mapAddress TEXT"
    //     0xae9c34: add             x2, PP, #0x14, lsl #12  ; [pp+0x14a70] "ALTER TABLE contrib ADD COLUMN mapAddress TEXT"
    //     0xae9c38: ldr             x2, [x2, #0xa70]
    // 0xae9c3c: r0 = call 0x7df9b8
    //     0xae9c3c: bl              #0x7df9b8
    // 0xae9c40: mov             x1, x0
    // 0xae9c44: stur            x1, [fp, #-0x18]
    // 0xae9c48: r0 = Await()
    //     0xae9c48: bl              #0xa75a20  ; AwaitStub
    // 0xae9c4c: ldur            x1, [fp, #-0x20]
    // 0xae9c50: r2 = "ALTER TABLE contrib ADD COLUMN dataVersion TEXT"
    //     0xae9c50: add             x2, PP, #0x14, lsl #12  ; [pp+0x14a78] "ALTER TABLE contrib ADD COLUMN dataVersion TEXT"
    //     0xae9c54: ldr             x2, [x2, #0xa78]
    // 0xae9c58: r0 = call 0x7df9b8
    //     0xae9c58: bl              #0x7df9b8
    // 0xae9c5c: mov             x1, x0
    // 0xae9c60: stur            x1, [fp, #-0x18]
    // 0xae9c64: r0 = Await()
    //     0xae9c64: bl              #0xa75a20  ; AwaitStub
    // 0xae9c68: ldur            x1, [fp, #-0x20]
    // 0xae9c6c: r2 = "ALTER TABLE contrib ADD COLUMN autoTaskId INTEGER"
    //     0xae9c6c: add             x2, PP, #0x14, lsl #12  ; [pp+0x14a80] "ALTER TABLE contrib ADD COLUMN autoTaskId INTEGER"
    //     0xae9c70: ldr             x2, [x2, #0xa80]
    // 0xae9c74: r0 = call 0x7df9b8
    //     0xae9c74: bl              #0x7df9b8
    // 0xae9c78: mov             x1, x0
    // 0xae9c7c: stur            x1, [fp, #-0x18]
    // 0xae9c80: r0 = Await()
    //     0xae9c80: bl              #0xa75a20  ; AwaitStub
    // 0xae9c84: r0 = Null
    //     0xae9c84: mov             x0, NULL
    // 0xae9c88: r0 = ReturnAsyncNotFuture()
    //     0xae9c88: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae9c8c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae9c8c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae9c90: b               #0xae9c10
  }
  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xae9c94, size: 0x408
    // 0xae9c94: EnterFrame
    //     0xae9c94: stp             fp, lr, [SP, #-0x10]!
    //     0xae9c98: mov             fp, SP
    // 0xae9c9c: AllocStack(0xb8)
    //     0xae9c9c: sub             SP, SP, #0xb8
    // 0xae9ca0: SetupParameters(Mjb this /* r1 */)
    //     0xae9ca0: stur            NULL, [fp, #-8]
    //     0xae9ca4: movz            x0, #0
    //     0xae9ca8: add             x1, fp, w0, sxtw #2
    //     0xae9cac: ldr             x1, [x1, #0x10]
    //     0xae9cb0: ldur            w2, [x1, #0x17]
    //     0xae9cb4: add             x2, x2, HEAP, lsl #32
    //     0xae9cb8: stur            x2, [fp, #-0x78]
    // 0xae9cbc: CheckStackOverflow
    //     0xae9cbc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae9cc0: cmp             SP, x16
    //     0xae9cc4: b.ls            #0xaea084
    // 0xae9cc8: InitAsync() -> Future<Null?>
    //     0xae9cc8: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xae9ccc: bl              #0xa75e10  ; InitAsyncStub
    // 0xae9cd0: ldur            x0, [fp, #-0x78]
    // 0xae9cd4: LoadField: r1 = r0->field_f
    //     0xae9cd4: ldur            w1, [x0, #0xf]
    // 0xae9cd8: DecompressPointer r1
    //     0xae9cd8: add             x1, x1, HEAP, lsl #32
    // 0xae9cdc: r0 = __unknown_function__()
    //     0xae9cdc: bl              #0xad320c  ; [] ::__unknown_function__
    // 0xae9ce0: mov             x1, x0
    // 0xae9ce4: stur            x1, [fp, #-0x80]
    // 0xae9ce8: r0 = Await()
    //     0xae9ce8: bl              #0xa75a20  ; AwaitStub
    // 0xae9cec: r1 = Function '<anonymous closure>':.
    //     0xae9cec: add             x1, PP, #0x12, lsl #12  ; [pp+0x12188] AnonymousClosure: (0x7e0118), in [AUk] Mjb::<anonymous closure> (0xae9c94)
    //     0xae9cf0: ldr             x1, [x1, #0x188]
    // 0xae9cf4: r2 = Null
    //     0xae9cf4: mov             x2, NULL
    // 0xae9cf8: stur            x0, [fp, #-0x80]
    // 0xae9cfc: r0 = AllocateClosure()
    //     0xae9cfc: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xae9d00: ldur            x3, [fp, #-0x80]
    // 0xae9d04: r1 = LoadClassIdInstr(r3)
    //     0xae9d04: ldur            x1, [x3, #-1]
    //     0xae9d08: ubfx            x1, x1, #0xc, #0x14
    // 0xae9d0c: mov             x2, x0
    // 0xae9d10: mov             x0, x1
    // 0xae9d14: mov             x1, x3
    // 0xae9d18: r0 = GDT[cid_x0 + 0xb78b]()
    //     0xae9d18: movz            x17, #0xb78b
    //     0xae9d1c: add             lr, x0, x17
    //     0xae9d20: ldr             lr, [x21, lr, lsl #3]
    //     0xae9d24: blr             lr
    // 0xae9d28: mov             x1, x0
    // 0xae9d2c: r0 = call 0x6472a0
    //     0xae9d2c: bl              #0x6472a0
    // 0xae9d30: r1 = LoadClassIdInstr(r0)
    //     0xae9d30: ldur            x1, [x0, #-1]
    //     0xae9d34: ubfx            x1, x1, #0xc, #0x14
    // 0xae9d38: mov             x16, x0
    // 0xae9d3c: mov             x0, x1
    // 0xae9d40: mov             x1, x16
    // 0xae9d44: r0 = GDT[cid_x0 + 0x103e8]()
    //     0xae9d44: movz            x17, #0x3e8
    //     0xae9d48: movk            x17, #0x1, lsl #16
    //     0xae9d4c: add             lr, x0, x17
    //     0xae9d50: ldr             lr, [x21, lr, lsl #3]
    //     0xae9d54: blr             lr
    // 0xae9d58: eor             x1, x0, #0x10
    // 0xae9d5c: tbnz            w1, #4, #0xae9d84
    // 0xae9d60: ldur            x0, [fp, #-0x78]
    // 0xae9d64: LoadField: r1 = r0->field_f
    //     0xae9d64: ldur            w1, [x0, #0xf]
    // 0xae9d68: DecompressPointer r1
    //     0xae9d68: add             x1, x1, HEAP, lsl #32
    // 0xae9d6c: LoadField: r2 = r1->field_23
    //     0xae9d6c: ldur            w2, [x1, #0x23]
    // 0xae9d70: DecompressPointer r2
    //     0xae9d70: add             x2, x2, HEAP, lsl #32
    // 0xae9d74: mov             x1, x2
    // 0xae9d78: r2 = "all contrib files are submitted "
    //     0xae9d78: add             x2, PP, #0x12, lsl #12  ; [pp+0x12190] "all contrib files are submitted "
    //     0xae9d7c: ldr             x2, [x2, #0x190]
    // 0xae9d80: r0 = call 0x345770
    //     0xae9d80: bl              #0x345770
    // 0xae9d84: ldur            x0, [fp, #-0x80]
    // 0xae9d88: r1 = Function '<anonymous closure>':.
    //     0xae9d88: add             x1, PP, #0x12, lsl #12  ; [pp+0x12198] AnonymousClosure: (0x7e0134), in [AUk] Mjb::<anonymous closure> (0xae9c94)
    //     0xae9d8c: ldr             x1, [x1, #0x198]
    // 0xae9d90: r2 = Null
    //     0xae9d90: mov             x2, NULL
    // 0xae9d94: r0 = AllocateClosure()
    //     0xae9d94: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xae9d98: ldur            x1, [fp, #-0x80]
    // 0xae9d9c: r2 = LoadClassIdInstr(r1)
    //     0xae9d9c: ldur            x2, [x1, #-1]
    //     0xae9da0: ubfx            x2, x2, #0xc, #0x14
    // 0xae9da4: mov             x16, x0
    // 0xae9da8: mov             x0, x2
    // 0xae9dac: mov             x2, x16
    // 0xae9db0: r0 = GDT[cid_x0 + 0xb78b]()
    //     0xae9db0: movz            x17, #0xb78b
    //     0xae9db4: add             lr, x0, x17
    //     0xae9db8: ldr             lr, [x21, lr, lsl #3]
    //     0xae9dbc: blr             lr
    // 0xae9dc0: mov             x1, x0
    // 0xae9dc4: r4 = const [0, 0x1, 0, 0x1, null]
    //     0xae9dc4: ldr             x4, [PP, #0x68]  ; [pp+0x68] List(5) [0, 0x1, 0, 0x1, Null]
    // 0xae9dc8: r0 = call 0x438044
    //     0xae9dc8: bl              #0x438044
    // 0xae9dcc: stur            x0, [fp, #-0x88]
    // 0xae9dd0: LoadField: r2 = r0->field_7
    //     0xae9dd0: ldur            w2, [x0, #7]
    // 0xae9dd4: DecompressPointer r2
    //     0xae9dd4: add             x2, x2, HEAP, lsl #32
    // 0xae9dd8: mov             x1, x2
    // 0xae9ddc: stur            x2, [fp, #-0x80]
    // 0xae9de0: r0 = K()
    //     0xae9de0: bl              #0xa6bfb0  ; AllocateKStub -> K<X0> (size=0x24)
    // 0xae9de4: mov             x4, x0
    // 0xae9de8: ldur            x3, [fp, #-0x88]
    // 0xae9dec: stur            x4, [fp, #-0xa0]
    // 0xae9df0: StoreField: r4->field_b = r3
    //     0xae9df0: stur            w3, [x4, #0xb]
    // 0xae9df4: LoadField: r0 = r3->field_b
    //     0xae9df4: ldur            w0, [x3, #0xb]
    // 0xae9df8: r5 = LoadInt32Instr(r0)
    //     0xae9df8: sbfx            x5, x0, #1, #0x1f
    // 0xae9dfc: stur            x5, [fp, #-0x98]
    // 0xae9e00: StoreField: r4->field_f = r5
    //     0xae9e00: stur            x5, [x4, #0xf]
    // 0xae9e04: ArrayStore: r4[0] = rZR  ; List_8
    //     0xae9e04: stur            xzr, [x4, #0x17]
    // 0xae9e08: ldur            x6, [fp, #-0x78]
    // 0xae9e0c: CheckStackOverflow
    //     0xae9e0c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae9e10: cmp             SP, x16
    //     0xae9e14: b.ls            #0xaea08c
    // 0xae9e18: LoadField: r0 = r3->field_b
    //     0xae9e18: ldur            w0, [x3, #0xb]
    // 0xae9e1c: r1 = LoadInt32Instr(r0)
    //     0xae9e1c: sbfx            x1, x0, #1, #0x1f
    // 0xae9e20: cmp             x5, x1
    // 0xae9e24: b.ne            #0xaea064
    // 0xae9e28: ArrayLoad: r2 = r4[0]  ; List_8
    //     0xae9e28: ldur            x2, [x4, #0x17]
    // 0xae9e2c: cmp             x2, x1
    // 0xae9e30: b.ge            #0xaea000
    // 0xae9e34: mov             x0, x1
    // 0xae9e38: mov             x1, x2
    // 0xae9e3c: cmp             x1, x0
    // 0xae9e40: b.hs            #0xaea094
    // 0xae9e44: LoadField: r0 = r3->field_f
    //     0xae9e44: ldur            w0, [x3, #0xf]
    // 0xae9e48: DecompressPointer r0
    //     0xae9e48: add             x0, x0, HEAP, lsl #32
    // 0xae9e4c: ArrayLoad: r7 = r0[r2]  ; Unknown_4
    //     0xae9e4c: add             x16, x0, x2, lsl #2
    //     0xae9e50: ldur            w7, [x16, #0xf]
    // 0xae9e54: DecompressPointer r7
    //     0xae9e54: add             x7, x7, HEAP, lsl #32
    // 0xae9e58: mov             x0, x7
    // 0xae9e5c: stur            x7, [fp, #-0x90]
    // 0xae9e60: StoreField: r4->field_1f = r0
    //     0xae9e60: stur            w0, [x4, #0x1f]
    //     0xae9e64: tbz             w0, #0, #0xae9e80
    //     0xae9e68: ldurb           w16, [x4, #-1]
    //     0xae9e6c: ldurb           w17, [x0, #-1]
    //     0xae9e70: and             x16, x17, x16, lsr #2
    //     0xae9e74: tst             x16, HEAP, lsr #32
    //     0xae9e78: b.eq            #0xae9e80
    //     0xae9e7c: bl              #0xb282c4  ; WriteBarrierWrappersStub
    // 0xae9e80: add             x0, x2, #1
    // 0xae9e84: ArrayStore: r4[0] = r0  ; List_8
    //     0xae9e84: stur            x0, [x4, #0x17]
    // 0xae9e88: cmp             w7, NULL
    // 0xae9e8c: b.ne            #0xae9ec0
    // 0xae9e90: mov             x0, x7
    // 0xae9e94: ldur            x2, [fp, #-0x80]
    // 0xae9e98: r1 = Null
    //     0xae9e98: mov             x1, NULL
    // 0xae9e9c: cmp             w2, NULL
    // 0xae9ea0: b.eq            #0xae9ec0
    // 0xae9ea4: ArrayLoad: r4 = r2[0]  ; List_4
    //     0xae9ea4: ldur            w4, [x2, #0x17]
    // 0xae9ea8: DecompressPointer r4
    //     0xae9ea8: add             x4, x4, HEAP, lsl #32
    // 0xae9eac: r8 = X0
    //     0xae9eac: ldr             x8, [PP, #0x1b0]  ; [pp+0x1b0] TypeParameter: X0
    // 0xae9eb0: LoadField: r9 = r4->field_7
    //     0xae9eb0: ldur            x9, [x4, #7]
    // 0xae9eb4: r3 = Null
    //     0xae9eb4: add             x3, PP, #0x12, lsl #12  ; [pp+0x121a0] Null
    //     0xae9eb8: ldr             x3, [x3, #0x1a0]
    // 0xae9ebc: blr             x9
    // 0xae9ec0: ldur            x0, [fp, #-0x78]
    // 0xae9ec4: ldur            x3, [fp, #-0x90]
    // 0xae9ec8: LoadField: r1 = r0->field_f
    //     0xae9ec8: ldur            w1, [x0, #0xf]
    // 0xae9ecc: DecompressPointer r1
    //     0xae9ecc: add             x1, x1, HEAP, lsl #32
    // 0xae9ed0: LoadField: r4 = r1->field_23
    //     0xae9ed0: ldur            w4, [x1, #0x23]
    // 0xae9ed4: DecompressPointer r4
    //     0xae9ed4: add             x4, x4, HEAP, lsl #32
    // 0xae9ed8: stur            x4, [fp, #-0xa8]
    // 0xae9edc: r1 = Null
    //     0xae9edc: mov             x1, NULL
    // 0xae9ee0: r2 = 8
    //     0xae9ee0: movz            x2, #0x8
    // 0xae9ee4: r0 = AllocateArray()
    //     0xae9ee4: bl              #0xb29b38  ; AllocateArrayStub
    // 0xae9ee8: r16 = "Removing "
    //     0xae9ee8: add             x16, PP, #0x12, lsl #12  ; [pp+0x121b0] "Removing "
    //     0xae9eec: ldr             x16, [x16, #0x1b0]
    // 0xae9ef0: StoreField: r0->field_f = r16
    //     0xae9ef0: stur            w16, [x0, #0xf]
    // 0xae9ef4: ldur            x1, [fp, #-0x90]
    // 0xae9ef8: LoadField: r2 = r1->field_7
    //     0xae9ef8: ldur            w2, [x1, #7]
    // 0xae9efc: DecompressPointer r2
    //     0xae9efc: add             x2, x2, HEAP, lsl #32
    // 0xae9f00: StoreField: r0->field_13 = r2
    //     0xae9f00: stur            w2, [x0, #0x13]
    // 0xae9f04: r16 = ": "
    //     0xae9f04: ldr             x16, [PP, #0x1650]  ; [pp+0x1650] ": "
    // 0xae9f08: ArrayStore: r0[0] = r16  ; List_4
    //     0xae9f08: stur            w16, [x0, #0x17]
    // 0xae9f0c: LoadField: r2 = r1->field_3f
    //     0xae9f0c: ldur            w2, [x1, #0x3f]
    // 0xae9f10: DecompressPointer r2
    //     0xae9f10: add             x2, x2, HEAP, lsl #32
    // 0xae9f14: StoreField: r0->field_1b = r2
    //     0xae9f14: stur            w2, [x0, #0x1b]
    // 0xae9f18: str             x0, [SP]
    // 0xae9f1c: r0 = _interpolate()
    //     0xae9f1c: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xae9f20: str             NULL, [SP]
    // 0xae9f24: ldur            x1, [fp, #-0xa8]
    // 0xae9f28: mov             x3, x0
    // 0xae9f2c: r2 = Instance_lYa
    //     0xae9f2c: add             x2, PP, #9, lsl #12  ; [pp+0x9fd0] Obj!lYa@571e91
    //     0xae9f30: ldr             x2, [x2, #0xfd0]
    // 0xae9f34: r4 = const [0, 0x4, 0x1, 0x3, wm, 0x3, null]
    //     0xae9f34: add             x4, PP, #9, lsl #12  ; [pp+0x9e70] List(7) [0, 0x4, 0x1, 0x3, "wm", 0x3, Null]
    //     0xae9f38: ldr             x4, [x4, #0xe70]
    // 0xae9f3c: r0 = __unknown_function__()
    //     0xae9f3c: bl              #0xa766a4  ; [] ::__unknown_function__
    // 0xae9f40: ldur            x0, [fp, #-0x90]
    // 0xae9f44: LoadField: r1 = r0->field_3f
    //     0xae9f44: ldur            w1, [x0, #0x3f]
    // 0xae9f48: DecompressPointer r1
    //     0xae9f48: add             x1, x1, HEAP, lsl #32
    // 0xae9f4c: stur            x1, [fp, #-0xa8]
    // 0xae9f50: r0 = call 0x2fcd4c
    //     0xae9f50: bl              #0x2fcd4c
    // 0xae9f54: r0 = _iq()
    //     0xae9f54: bl              #0xa6ee74  ; Allocate_iqStub -> _iq (size=0x10)
    // 0xae9f58: ldur            x1, [fp, #-0xa8]
    // 0xae9f5c: stur            x0, [fp, #-0xb0]
    // 0xae9f60: StoreField: r0->field_7 = r1
    //     0xae9f60: stur            w1, [x0, #7]
    // 0xae9f64: r0 = call 0x2fccb0
    //     0xae9f64: bl              #0x2fccb0
    // 0xae9f68: ldur            x3, [fp, #-0xb0]
    // 0xae9f6c: StoreField: r3->field_b = r0
    //     0xae9f6c: stur            w0, [x3, #0xb]
    //     0xae9f70: ldurb           w16, [x3, #-1]
    //     0xae9f74: ldurb           w17, [x0, #-1]
    //     0xae9f78: and             x16, x17, x16, lsr #2
    //     0xae9f7c: tst             x16, HEAP, lsr #32
    //     0xae9f80: b.eq            #0xae9f88
    //     0xae9f84: bl              #0xb282a4  ; WriteBarrierWrappersStub
    // 0xae9f88: mov             x1, x3
    // 0xae9f8c: r2 = false
    //     0xae9f8c: add             x2, NULL, #0x30  ; false
    // 0xae9f90: r0 = call 0x9971cc
    //     0xae9f90: bl              #0x9971cc
    // 0xae9f94: mov             x1, x0
    // 0xae9f98: stur            x1, [fp, #-0xa8]
    // 0xae9f9c: r0 = Await()
    //     0xae9f9c: bl              #0xa75a20  ; AwaitStub
    // 0xae9fa0: b               #0xae9fa8
    // 0xae9fa4: sub             SP, fp, #0xb8
    // 0xae9fa8: ldur            x3, [fp, #-0x78]
    // 0xae9fac: ldur            x0, [fp, #-0x90]
    // 0xae9fb0: LoadField: r1 = r3->field_f
    //     0xae9fb0: ldur            w1, [x3, #0xf]
    // 0xae9fb4: DecompressPointer r1
    //     0xae9fb4: add             x1, x1, HEAP, lsl #32
    // 0xae9fb8: LoadField: r2 = r0->field_7
    //     0xae9fb8: ldur            w2, [x0, #7]
    // 0xae9fbc: DecompressPointer r2
    //     0xae9fbc: add             x2, x2, HEAP, lsl #32
    // 0xae9fc0: cmp             w2, NULL
    // 0xae9fc4: b.eq            #0xaea098
    // 0xae9fc8: r4 = LoadInt32Instr(r2)
    //     0xae9fc8: sbfx            x4, x2, #1, #0x1f
    //     0xae9fcc: tbz             w2, #0, #0xae9fd4
    //     0xae9fd0: ldur            x4, [x2, #7]
    // 0xae9fd4: mov             x2, x4
    // 0xae9fd8: r0 = __unknown_function__()
    //     0xae9fd8: bl              #0xaea09c  ; [] ::__unknown_function__
    // 0xae9fdc: mov             x1, x0
    // 0xae9fe0: stur            x1, [fp, #-0xa8]
    // 0xae9fe4: r0 = Await()
    //     0xae9fe4: bl              #0xa75a20  ; AwaitStub
    // 0xae9fe8: b               #0xae9ff0
    // 0xae9fec: sub             SP, fp, #0xb8
    // 0xae9ff0: ldur            x3, [fp, #-0x88]
    // 0xae9ff4: ldur            x4, [fp, #-0xa0]
    // 0xae9ff8: ldur            x5, [fp, #-0x98]
    // 0xae9ffc: b               #0xae9e08
    // 0xaea000: mov             x0, x6
    // 0xaea004: mov             x1, x4
    // 0xaea008: StoreField: r1->field_1f = rNULL
    //     0xaea008: stur            NULL, [x1, #0x1f]
    // 0xaea00c: LoadField: r1 = r0->field_f
    //     0xaea00c: ldur            w1, [x0, #0xf]
    // 0xaea010: DecompressPointer r1
    //     0xaea010: add             x1, x1, HEAP, lsl #32
    // 0xaea014: LoadField: r2 = r1->field_23
    //     0xaea014: ldur            w2, [x1, #0x23]
    // 0xaea018: DecompressPointer r2
    //     0xaea018: add             x2, x2, HEAP, lsl #32
    // 0xaea01c: mov             x1, x2
    // 0xaea020: r2 = "Start auto submit process"
    //     0xaea020: add             x2, PP, #0x12, lsl #12  ; [pp+0x121b8] "Start auto submit process"
    //     0xaea024: ldr             x2, [x2, #0x1b8]
    // 0xaea028: r0 = call 0x33fc94
    //     0xaea028: bl              #0x33fc94
    // 0xaea02c: ldur            x0, [fp, #-0x78]
    // 0xaea030: LoadField: r2 = r0->field_f
    //     0xaea030: ldur            w2, [x0, #0xf]
    // 0xaea034: DecompressPointer r2
    //     0xaea034: add             x2, x2, HEAP, lsl #32
    // 0xaea038: r1 = Function '_HMh@1810205222':.
    //     0xaea038: add             x1, PP, #0x12, lsl #12  ; [pp+0x121c0] AnonymousClosure: (0x7dfba0), of [AUk] Mjb
    //     0xaea03c: ldr             x1, [x1, #0x1c0]
    // 0xaea040: r0 = AllocateClosure()
    //     0xaea040: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xaea044: str             x0, [SP]
    // 0xaea048: r1 = <void?>
    //     0xaea048: ldr             x1, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    // 0xaea04c: r2 = Instance_ka
    //     0xaea04c: add             x2, PP, #0x11, lsl #12  ; [pp+0x114f8] Obj!ka@57ac41
    //     0xaea050: ldr             x2, [x2, #0x4f8]
    // 0xaea054: r4 = const [0, 0x3, 0x1, 0x3, null]
    //     0xaea054: ldr             x4, [PP, #0x1648]  ; [pp+0x1648] List(5) [0, 0x3, 0x1, 0x3, Null]
    // 0xaea058: r0 = call 0x33afdc
    //     0xaea058: bl              #0x33afdc
    // 0xaea05c: r0 = Null
    //     0xaea05c: mov             x0, NULL
    // 0xaea060: r0 = ReturnAsyncNotFuture()
    //     0xaea060: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaea064: mov             x0, x3
    // 0xaea068: r0 = qa()
    //     0xaea068: bl              #0xa6a95c  ; AllocateqaStub -> qa (size=0x10)
    // 0xaea06c: mov             x1, x0
    // 0xaea070: ldur            x0, [fp, #-0x88]
    // 0xaea074: StoreField: r1->field_b = r0
    //     0xaea074: stur            w0, [x1, #0xb]
    // 0xaea078: mov             x0, x1
    // 0xaea07c: r0 = Throw()
    //     0xaea07c: bl              #0xb27dfc  ; ThrowStub
    // 0xaea080: brk             #0
    // 0xaea084: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaea084: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaea088: b               #0xae9cc8
    // 0xaea08c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaea08c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaea090: b               #0xae9e18
    // 0xaea094: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xaea094: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xaea098: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xaea098: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] bool <anonymous closure>(dynamic, hx) {
    // ** addr: 0x7e0234, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, S) {
    // ** addr: 0x7e0150, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x7dfa54, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, Kjb) {
    // ** addr: 0x7e0118, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, Kjb) {
    // ** addr: 0x7e0134, size: -0x1
  }
  [closure] void _HMh(dynamic) {
    // ** addr: 0x7dfba0, size: -0x1
  }
  [closure] Future<void> <anonymous closure>(dynamic, Fdb, int) {
    // ** addr: 0x7dfa1c, size: -0x1
  }
  [closure] Kjb <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x7d4e34, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, Kjb) {
    // ** addr: 0x7d4d34, size: -0x1
  }
}

// class id: 5794, size: 0x18, field offset: 0x14
enum Jjb extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
  _OneByteString field_14;
}
