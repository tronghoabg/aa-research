// lib: , url: PRk

// class id: 1050241, size: 0x8
class :: {

  static late final Xdb Pph; // offset: 0x1348
  static late final Xdb _Oph; // offset: 0x1344
}

// class id: 483, size: 0x18, field offset: 0x8
//   transformed mixin,
abstract class _keb extends Object
     with aeb {

  [closure] Future<Ndb> <anonymous closure>(dynamic) async {
    // ** addr: 0xae7ab8, size: 0x1a0
    // 0xae7ab8: EnterFrame
    //     0xae7ab8: stp             fp, lr, [SP, #-0x10]!
    //     0xae7abc: mov             fp, SP
    // 0xae7ac0: AllocStack(0xa0)
    //     0xae7ac0: sub             SP, SP, #0xa0
    // 0xae7ac4: SetupParameters(_keb this /* r1 */)
    //     0xae7ac4: stur            NULL, [fp, #-8]
    //     0xae7ac8: movz            x0, #0
    //     0xae7acc: add             x1, fp, w0, sxtw #2
    //     0xae7ad0: ldr             x1, [x1, #0x10]
    //     0xae7ad4: ldur            w2, [x1, #0x17]
    //     0xae7ad8: add             x2, x2, HEAP, lsl #32
    //     0xae7adc: stur            x2, [fp, #-0x78]
    // 0xae7ae0: CheckStackOverflow
    //     0xae7ae0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae7ae4: cmp             SP, x16
    //     0xae7ae8: b.ls            #0xae7c4c
    // 0xae7aec: InitAsync() -> Future<Ndb>
    //     0xae7aec: add             x0, PP, #0x14, lsl #12  ; [pp+0x14ad0] TypeArguments: <Ndb>
    //     0xae7af0: ldr             x0, [x0, #0xad0]
    //     0xae7af4: bl              #0xa75e10  ; InitAsyncStub
    // 0xae7af8: ldur            x2, [fp, #-0x78]
    // 0xae7afc: ArrayLoad: r1 = r2[0]  ; List_4
    //     0xae7afc: ldur            w1, [x2, #0x17]
    // 0xae7b00: DecompressPointer r1
    //     0xae7b00: add             x1, x1, HEAP, lsl #32
    // 0xae7b04: r0 = LoadClassIdInstr(r1)
    //     0xae7b04: ldur            x0, [x1, #-1]
    //     0xae7b08: ubfx            x0, x0, #0xc, #0x14
    // 0xae7b0c: r0 = GDT[cid_x0 + -0xff8]()
    //     0xae7b0c: sub             lr, x0, #0xff8
    //     0xae7b10: ldr             lr, [x21, lr, lsl #3]
    //     0xae7b14: blr             lr
    // 0xae7b18: ldur            x0, [fp, #-0x78]
    // 0xae7b1c: LoadField: r2 = r0->field_13
    //     0xae7b1c: ldur            w2, [x0, #0x13]
    // 0xae7b20: DecompressPointer r2
    //     0xae7b20: add             x2, x2, HEAP, lsl #32
    // 0xae7b24: LoadField: r1 = r0->field_f
    //     0xae7b24: ldur            w1, [x0, #0xf]
    // 0xae7b28: DecompressPointer r1
    //     0xae7b28: add             x1, x1, HEAP, lsl #32
    // 0xae7b2c: LoadField: r3 = r1->field_7
    //     0xae7b2c: ldur            w3, [x1, #7]
    // 0xae7b30: DecompressPointer r3
    //     0xae7b30: add             x3, x3, HEAP, lsl #32
    // 0xae7b34: mov             x1, x3
    // 0xae7b38: stur            x3, [fp, #-0x80]
    // 0xae7b3c: r0 = call 0xa53cf4
    //     0xae7b3c: bl              #0xa53cf4
    // 0xae7b40: mov             x1, x0
    // 0xae7b44: ldur            x0, [fp, #-0x80]
    // 0xae7b48: LoadField: r2 = r0->field_f
    //     0xae7b48: ldur            w2, [x0, #0xf]
    // 0xae7b4c: DecompressPointer r2
    //     0xae7b4c: add             x2, x2, HEAP, lsl #32
    // 0xae7b50: cmp             w2, w1
    // 0xae7b54: b.ne            #0xae7b60
    // 0xae7b58: r0 = Null
    //     0xae7b58: mov             x0, NULL
    // 0xae7b5c: b               #0xae7b64
    // 0xae7b60: mov             x0, x1
    // 0xae7b64: cmp             w0, NULL
    // 0xae7b68: r16 = true
    //     0xae7b68: add             x16, NULL, #0x20  ; true
    // 0xae7b6c: r17 = false
    //     0xae7b6c: add             x17, NULL, #0x30  ; false
    // 0xae7b70: csel            x1, x16, x17, eq
    // 0xae7b74: stur            x1, [fp, #-0x98]
    // 0xae7b78: tbnz            w1, #4, #0xae7bdc
    // 0xae7b7c: ldur            x0, [fp, #-0x78]
    // 0xae7b80: LoadField: r2 = r0->field_f
    //     0xae7b80: ldur            w2, [x0, #0xf]
    // 0xae7b84: DecompressPointer r2
    //     0xae7b84: add             x2, x2, HEAP, lsl #32
    // 0xae7b88: stur            x2, [fp, #-0x90]
    // 0xae7b8c: LoadField: r3 = r0->field_13
    //     0xae7b8c: ldur            w3, [x0, #0x13]
    // 0xae7b90: DecompressPointer r3
    //     0xae7b90: add             x3, x3, HEAP, lsl #32
    // 0xae7b94: stur            x3, [fp, #-0x88]
    // 0xae7b98: ArrayLoad: r4 = r0[0]  ; List_4
    //     0xae7b98: ldur            w4, [x0, #0x17]
    // 0xae7b9c: DecompressPointer r4
    //     0xae7b9c: add             x4, x4, HEAP, lsl #32
    // 0xae7ba0: stur            x4, [fp, #-0x80]
    // 0xae7ba4: r0 = Mdb()
    //     0xae7ba4: bl              #0xae9b80  ; AllocateMdbStub -> Mdb (size=0x18)
    // 0xae7ba8: mov             x4, x0
    // 0xae7bac: ldur            x0, [fp, #-0x90]
    // 0xae7bb0: stur            x4, [fp, #-0xa0]
    // 0xae7bb4: StoreField: r4->field_7 = r0
    //     0xae7bb4: stur            w0, [x4, #7]
    // 0xae7bb8: ldur            x2, [fp, #-0x88]
    // 0xae7bbc: StoreField: r4->field_f = r2
    //     0xae7bbc: stur            w2, [x4, #0xf]
    // 0xae7bc0: ldur            x1, [fp, #-0x80]
    // 0xae7bc4: StoreField: r4->field_b = r1
    //     0xae7bc4: stur            w1, [x4, #0xb]
    // 0xae7bc8: LoadField: r1 = r0->field_7
    //     0xae7bc8: ldur            w1, [x0, #7]
    // 0xae7bcc: DecompressPointer r1
    //     0xae7bcc: add             x1, x1, HEAP, lsl #32
    // 0xae7bd0: mov             x3, x4
    // 0xae7bd4: r0 = call 0x9f1700
    //     0xae7bd4: bl              #0x9f1700
    // 0xae7bd8: ldur            x0, [fp, #-0xa0]
    // 0xae7bdc: stur            x0, [fp, #-0x80]
    // 0xae7be0: cmp             w0, NULL
    // 0xae7be4: b.eq            #0xae7c54
    // 0xae7be8: mov             x1, x0
    // 0xae7bec: r0 = __unknown_function__()
    //     0xae7bec: bl              #0xae7c58  ; [] ::__unknown_function__
    // 0xae7bf0: mov             x1, x0
    // 0xae7bf4: stur            x1, [fp, #-0x88]
    // 0xae7bf8: r0 = Await()
    //     0xae7bf8: bl              #0xa75a20  ; AwaitStub
    // 0xae7bfc: r0 = ReturnAsync()
    //     0xae7bfc: b               #0xa6b994  ; ReturnAsyncStub
    // 0xae7c00: sub             SP, fp, #0xa0
    // 0xae7c04: ldur            x2, [fp, #-0x98]
    // 0xae7c08: mov             x3, x0
    // 0xae7c0c: stur            x0, [fp, #-0x80]
    // 0xae7c10: mov             x0, x1
    // 0xae7c14: stur            x1, [fp, #-0x88]
    // 0xae7c18: tbnz            w2, #4, #0xae7c3c
    // 0xae7c1c: ldur            x1, [fp, #-0x78]
    // 0xae7c20: LoadField: r2 = r1->field_f
    //     0xae7c20: ldur            w2, [x1, #0xf]
    // 0xae7c24: DecompressPointer r2
    //     0xae7c24: add             x2, x2, HEAP, lsl #32
    // 0xae7c28: LoadField: r4 = r1->field_13
    //     0xae7c28: ldur            w4, [x1, #0x13]
    // 0xae7c2c: DecompressPointer r4
    //     0xae7c2c: add             x4, x4, HEAP, lsl #32
    // 0xae7c30: mov             x1, x2
    // 0xae7c34: mov             x2, x4
    // 0xae7c38: r0 = call 0x7deefc
    //     0xae7c38: bl              #0x7deefc
    // 0xae7c3c: ldur            x0, [fp, #-0x80]
    // 0xae7c40: ldur            x1, [fp, #-0x88]
    // 0xae7c44: r0 = ReThrow()
    //     0xae7c44: bl              #0xb27dd0  ; ReThrowStub
    // 0xae7c48: brk             #0
    // 0xae7c4c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae7c4c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae7c50: b               #0xae7aec
    // 0xae7c54: r0 = NullErrorSharedWithoutFPURegs()
    //     0xae7c54: bl              #0xb2a398  ; NullErrorSharedWithoutFPURegsStub
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0xae9a30, size: 0x88
    // 0xae9a30: EnterFrame
    //     0xae9a30: stp             fp, lr, [SP, #-0x10]!
    //     0xae9a34: mov             fp, SP
    // 0xae9a38: AllocStack(0x18)
    //     0xae9a38: sub             SP, SP, #0x18
    // 0xae9a3c: SetupParameters(_keb this /* r1 */)
    //     0xae9a3c: stur            NULL, [fp, #-8]
    //     0xae9a40: movz            x0, #0
    //     0xae9a44: add             x1, fp, w0, sxtw #2
    //     0xae9a48: ldr             x1, [x1, #0x10]
    //     0xae9a4c: ldur            w2, [x1, #0x17]
    //     0xae9a50: add             x2, x2, HEAP, lsl #32
    //     0xae9a54: stur            x2, [fp, #-0x10]
    // 0xae9a58: CheckStackOverflow
    //     0xae9a58: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae9a5c: cmp             SP, x16
    //     0xae9a60: b.ls            #0xae9ab0
    // 0xae9a64: InitAsync() -> Future<void?>
    //     0xae9a64: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xae9a68: bl              #0xa75e10  ; InitAsyncStub
    // 0xae9a6c: ldur            x0, [fp, #-0x10]
    // 0xae9a70: LoadField: r1 = r0->field_f
    //     0xae9a70: ldur            w1, [x0, #0xf]
    // 0xae9a74: DecompressPointer r1
    //     0xae9a74: add             x1, x1, HEAP, lsl #32
    // 0xae9a78: LoadField: r2 = r0->field_13
    //     0xae9a78: ldur            w2, [x0, #0x13]
    // 0xae9a7c: DecompressPointer r2
    //     0xae9a7c: add             x2, x2, HEAP, lsl #32
    // 0xae9a80: r0 = call 0x7deefc
    //     0xae9a80: bl              #0x7deefc
    // 0xae9a84: ldur            x0, [fp, #-0x10]
    // 0xae9a88: LoadField: r1 = r0->field_f
    //     0xae9a88: ldur            w1, [x0, #0xf]
    // 0xae9a8c: DecompressPointer r1
    //     0xae9a8c: add             x1, x1, HEAP, lsl #32
    // 0xae9a90: LoadField: r2 = r0->field_13
    //     0xae9a90: ldur            w2, [x0, #0x13]
    // 0xae9a94: DecompressPointer r2
    //     0xae9a94: add             x2, x2, HEAP, lsl #32
    // 0xae9a98: r0 = __unknown_function__()
    //     0xae9a98: bl              #0xae9ab8  ; [] ::__unknown_function__
    // 0xae9a9c: mov             x1, x0
    // 0xae9aa0: stur            x1, [fp, #-0x18]
    // 0xae9aa4: r0 = Await()
    //     0xae9aa4: bl              #0xa75a20  ; AwaitStub
    // 0xae9aa8: r0 = Null
    //     0xae9aa8: mov             x0, NULL
    // 0xae9aac: r0 = ReturnAsyncNotFuture()
    //     0xae9aac: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae9ab0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae9ab0: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae9ab4: b               #0xae9a64
  }
  [closure] Future<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x7ded08, size: -0x1
  }
}

// class id: 485, size: 0x18, field offset: 0x18
class jeb extends _keb {
}
