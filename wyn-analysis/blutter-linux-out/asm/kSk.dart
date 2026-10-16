// lib: , url: KSk

// class id: 1050288, size: 0x8
class :: {

  static late cfb _Lsh; // offset: 0x1388
}

// class id: 1858, size: 0x30, field offset: 0x8
class cfb extends _yla {

  [closure] Future<bool> <anonymous closure>(dynamic) async {
    // ** addr: 0xae1ea4, size: 0x1f4
    // 0xae1ea4: EnterFrame
    //     0xae1ea4: stp             fp, lr, [SP, #-0x10]!
    //     0xae1ea8: mov             fp, SP
    // 0xae1eac: AllocStack(0x88)
    //     0xae1eac: sub             SP, SP, #0x88
    // 0xae1eb0: SetupParameters(cfb this /* r1 */)
    //     0xae1eb0: stur            NULL, [fp, #-8]
    //     0xae1eb4: movz            x0, #0
    //     0xae1eb8: add             x1, fp, w0, sxtw #2
    //     0xae1ebc: ldr             x1, [x1, #0x10]
    //     0xae1ec0: ldur            w2, [x1, #0x17]
    //     0xae1ec4: add             x2, x2, HEAP, lsl #32
    //     0xae1ec8: stur            x2, [fp, #-0x68]
    // 0xae1ecc: CheckStackOverflow
    //     0xae1ecc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae1ed0: cmp             SP, x16
    //     0xae1ed4: b.ls            #0xae208c
    // 0xae1ed8: InitAsync() -> Future<bool>
    //     0xae1ed8: ldr             x0, [PP, #0x2e80]  ; [pp+0x2e80] TypeArguments: <bool>
    //     0xae1edc: bl              #0xa75e10  ; InitAsyncStub
    // 0xae1ee0: ldur            x0, [fp, #-0x68]
    // 0xae1ee4: LoadField: r1 = r0->field_f
    //     0xae1ee4: ldur            w1, [x0, #0xf]
    // 0xae1ee8: DecompressPointer r1
    //     0xae1ee8: add             x1, x1, HEAP, lsl #32
    // 0xae1eec: LoadField: r2 = r1->field_1b
    //     0xae1eec: ldur            w2, [x1, #0x1b]
    // 0xae1ef0: DecompressPointer r2
    //     0xae1ef0: add             x2, x2, HEAP, lsl #32
    // 0xae1ef4: tbnz            w2, #4, #0xae1f00
    // 0xae1ef8: r0 = true
    //     0xae1ef8: add             x0, NULL, #0x20  ; true
    // 0xae1efc: r0 = ReturnAsyncNotFuture()
    //     0xae1efc: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae1f00: r2 = true
    //     0xae1f00: add             x2, NULL, #0x20  ; true
    // 0xae1f04: StoreField: r1->field_1b = r2
    //     0xae1f04: stur            w2, [x1, #0x1b]
    // 0xae1f08: r0 = __unknown_function__()
    //     0xae1f08: bl              #0xae2098  ; [] ::__unknown_function__
    // 0xae1f0c: mov             x1, x0
    // 0xae1f10: stur            x1, [fp, #-0x70]
    // 0xae1f14: r0 = Await()
    //     0xae1f14: bl              #0xa75a20  ; AwaitStub
    // 0xae1f18: ldur            x0, [fp, #-0x68]
    // 0xae1f1c: LoadField: r1 = r0->field_f
    //     0xae1f1c: ldur            w1, [x0, #0xf]
    // 0xae1f20: DecompressPointer r1
    //     0xae1f20: add             x1, x1, HEAP, lsl #32
    // 0xae1f24: LoadField: r2 = r1->field_f
    //     0xae1f24: ldur            w2, [x1, #0xf]
    // 0xae1f28: DecompressPointer r2
    //     0xae1f28: add             x2, x2, HEAP, lsl #32
    // 0xae1f2c: LoadField: r1 = r2->field_2f
    //     0xae1f2c: ldur            w1, [x2, #0x2f]
    // 0xae1f30: DecompressPointer r1
    //     0xae1f30: add             x1, x1, HEAP, lsl #32
    // 0xae1f34: cmp             w1, NULL
    // 0xae1f38: b.ne            #0xae1f90
    // 0xae1f3c: r0 = __unknown_function__()
    //     0xae1f3c: bl              #0xad8118  ; [] ::__unknown_function__
    // 0xae1f40: mov             x1, x0
    // 0xae1f44: stur            x1, [fp, #-0x70]
    // 0xae1f48: r0 = Await()
    //     0xae1f48: bl              #0xa75a20  ; AwaitStub
    // 0xae1f4c: mov             x2, x0
    // 0xae1f50: ldur            x0, [fp, #-0x68]
    // 0xae1f54: stur            x2, [fp, #-0x78]
    // 0xae1f58: LoadField: r3 = r0->field_f
    //     0xae1f58: ldur            w3, [x0, #0xf]
    // 0xae1f5c: DecompressPointer r3
    //     0xae1f5c: add             x3, x3, HEAP, lsl #32
    // 0xae1f60: stur            x3, [fp, #-0x70]
    // 0xae1f64: LoadField: r1 = r3->field_f
    //     0xae1f64: ldur            w1, [x3, #0xf]
    // 0xae1f68: DecompressPointer r1
    //     0xae1f68: add             x1, x1, HEAP, lsl #32
    // 0xae1f6c: str             x2, [SP]
    // 0xae1f70: r4 = const [0, 0x2, 0x1, 0x1, Yrh, 0x1, null]
    //     0xae1f70: add             x4, PP, #0x21, lsl #12  ; [pp+0x217f0] List(7) [0, 0x2, 0x1, 0x1, "Yrh", 0x1, Null]
    //     0xae1f74: ldr             x4, [x4, #0x7f0]
    // 0xae1f78: r0 = call 0x366978
    //     0xae1f78: bl              #0x366978
    // 0xae1f7c: ldur            x1, [fp, #-0x70]
    // 0xae1f80: mov             x2, x0
    // 0xae1f84: r0 = call 0x3677f8
    //     0xae1f84: bl              #0x3677f8
    // 0xae1f88: b               #0xae1f90
    // 0xae1f8c: sub             SP, fp, #0x88
    // 0xae1f90: ldur            x0, [fp, #-0x68]
    // 0xae1f94: LoadField: r1 = r0->field_f
    //     0xae1f94: ldur            w1, [x0, #0xf]
    // 0xae1f98: DecompressPointer r1
    //     0xae1f98: add             x1, x1, HEAP, lsl #32
    // 0xae1f9c: r0 = __unknown_function__()
    //     0xae1f9c: bl              #0xa80648  ; [] ::__unknown_function__
    // 0xae1fa0: mov             x1, x0
    // 0xae1fa4: stur            x1, [fp, #-0x70]
    // 0xae1fa8: r0 = Await()
    //     0xae1fa8: bl              #0xa75a20  ; AwaitStub
    // 0xae1fac: r0 = LoadStaticField(0x924)
    //     0xae1fac: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xae1fb0: ldr             x0, [x0, #0x1248]
    // 0xae1fb4: cmp             w0, NULL
    // 0xae1fb8: b.eq            #0xae2094
    // 0xae1fbc: ldur            x1, [fp, #-0x68]
    // 0xae1fc0: LoadField: r3 = r1->field_f
    //     0xae1fc0: ldur            w3, [x1, #0xf]
    // 0xae1fc4: DecompressPointer r3
    //     0xae1fc4: add             x3, x3, HEAP, lsl #32
    // 0xae1fc8: stur            x3, [fp, #-0x70]
    // 0xae1fcc: LoadField: r4 = r0->field_f3
    //     0xae1fcc: ldur            w4, [x0, #0xf3]
    // 0xae1fd0: DecompressPointer r4
    //     0xae1fd0: add             x4, x4, HEAP, lsl #32
    // 0xae1fd4: stur            x4, [fp, #-0x68]
    // 0xae1fd8: LoadField: r2 = r4->field_7
    //     0xae1fd8: ldur            w2, [x4, #7]
    // 0xae1fdc: DecompressPointer r2
    //     0xae1fdc: add             x2, x2, HEAP, lsl #32
    // 0xae1fe0: mov             x0, x3
    // 0xae1fe4: r1 = Null
    //     0xae1fe4: mov             x1, NULL
    // 0xae1fe8: cmp             w2, NULL
    // 0xae1fec: b.eq            #0xae200c
    // 0xae1ff0: ArrayLoad: r4 = r2[0]  ; List_4
    //     0xae1ff0: ldur            w4, [x2, #0x17]
    // 0xae1ff4: DecompressPointer r4
    //     0xae1ff4: add             x4, x4, HEAP, lsl #32
    // 0xae1ff8: r8 = X0
    //     0xae1ff8: ldr             x8, [PP, #0x1b0]  ; [pp+0x1b0] TypeParameter: X0
    // 0xae1ffc: LoadField: r9 = r4->field_7
    //     0xae1ffc: ldur            x9, [x4, #7]
    // 0xae2000: r3 = Null
    //     0xae2000: add             x3, PP, #0x21, lsl #12  ; [pp+0x217f8] Null
    //     0xae2004: ldr             x3, [x3, #0x7f8]
    // 0xae2008: blr             x9
    // 0xae200c: ldur            x0, [fp, #-0x68]
    // 0xae2010: LoadField: r1 = r0->field_b
    //     0xae2010: ldur            w1, [x0, #0xb]
    // 0xae2014: LoadField: r2 = r0->field_f
    //     0xae2014: ldur            w2, [x0, #0xf]
    // 0xae2018: DecompressPointer r2
    //     0xae2018: add             x2, x2, HEAP, lsl #32
    // 0xae201c: LoadField: r3 = r2->field_b
    //     0xae201c: ldur            w3, [x2, #0xb]
    // 0xae2020: r2 = LoadInt32Instr(r1)
    //     0xae2020: sbfx            x2, x1, #1, #0x1f
    // 0xae2024: stur            x2, [fp, #-0x80]
    // 0xae2028: r1 = LoadInt32Instr(r3)
    //     0xae2028: sbfx            x1, x3, #1, #0x1f
    // 0xae202c: cmp             x2, x1
    // 0xae2030: b.ne            #0xae203c
    // 0xae2034: mov             x1, x0
    // 0xae2038: r0 = call 0x2e77dc
    //     0xae2038: bl              #0x2e77dc
    // 0xae203c: ldur            x2, [fp, #-0x68]
    // 0xae2040: ldur            x3, [fp, #-0x80]
    // 0xae2044: add             x4, x3, #1
    // 0xae2048: lsl             x5, x4, #1
    // 0xae204c: StoreField: r2->field_b = r5
    //     0xae204c: stur            w5, [x2, #0xb]
    // 0xae2050: LoadField: r1 = r2->field_f
    //     0xae2050: ldur            w1, [x2, #0xf]
    // 0xae2054: DecompressPointer r1
    //     0xae2054: add             x1, x1, HEAP, lsl #32
    // 0xae2058: ldur            x0, [fp, #-0x70]
    // 0xae205c: ArrayStore: r1[r3] = r0  ; List_4
    //     0xae205c: add             x25, x1, x3, lsl #2
    //     0xae2060: add             x25, x25, #0xf
    //     0xae2064: str             w0, [x25]
    //     0xae2068: tbz             w0, #0, #0xae2084
    //     0xae206c: ldurb           w16, [x1, #-1]
    //     0xae2070: ldurb           w17, [x0, #-1]
    //     0xae2074: and             x16, x17, x16, lsr #2
    //     0xae2078: tst             x16, HEAP, lsr #32
    //     0xae207c: b.eq            #0xae2084
    //     0xae2080: bl              #0xb27e20  ; ArrayWriteBarrierStub
    // 0xae2084: r0 = true
    //     0xae2084: add             x0, NULL, #0x20  ; true
    // 0xae2088: r0 = ReturnAsyncNotFuture()
    //     0xae2088: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae208c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae208c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae2090: b               #0xae1ed8
    // 0xae2094: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xae2094: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
  }
}
