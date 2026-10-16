// lib: , url: SAk

// class id: 1049380, size: 0x8
class :: {
}

// class id: 2127, size: 0x5c, field offset: 0x50
//   transformed mixin,
abstract class _dea extends rI
     with _eea {
}

// class id: 2128, size: 0x60, field offset: 0x5c
class Wda extends _dea {
}

// class id: 2129, size: 0x78, field offset: 0x60
class Vda extends Wda {

  [closure] Future<void> <anonymous closure>(dynamic, ka) async {
    // ** addr: 0xaa7bc0, size: 0x154
    // 0xaa7bc0: EnterFrame
    //     0xaa7bc0: stp             fp, lr, [SP, #-0x10]!
    //     0xaa7bc4: mov             fp, SP
    // 0xaa7bc8: AllocStack(0x18)
    //     0xaa7bc8: sub             SP, SP, #0x18
    // 0xaa7bcc: SetupParameters(Vda this /* r1 */)
    //     0xaa7bcc: stur            NULL, [fp, #-8]
    //     0xaa7bd0: movz            x0, #0
    //     0xaa7bd4: add             x1, fp, w0, sxtw #2
    //     0xaa7bd8: ldr             x1, [x1, #0x18]
    //     0xaa7bdc: ldur            w2, [x1, #0x17]
    //     0xaa7be0: add             x2, x2, HEAP, lsl #32
    //     0xaa7be4: stur            x2, [fp, #-0x10]
    // 0xaa7be8: CheckStackOverflow
    //     0xaa7be8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa7bec: cmp             SP, x16
    //     0xaa7bf0: b.ls            #0xaa7d0c
    // 0xaa7bf4: InitAsync() -> Future<void?>
    //     0xaa7bf4: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xaa7bf8: bl              #0xa75e10  ; InitAsyncStub
    // 0xaa7bfc: ldur            x0, [fp, #-0x10]
    // 0xaa7c00: LoadField: r1 = r0->field_f
    //     0xaa7c00: ldur            w1, [x0, #0xf]
    // 0xaa7c04: DecompressPointer r1
    //     0xaa7c04: add             x1, x1, HEAP, lsl #32
    // 0xaa7c08: LoadField: r2 = r1->field_67
    //     0xaa7c08: ldur            w2, [x1, #0x67]
    // 0xaa7c0c: DecompressPointer r2
    //     0xaa7c0c: add             x2, x2, HEAP, lsl #32
    // 0xaa7c10: tbz             w2, #4, #0xaa7ce4
    // 0xaa7c14: ArrayLoad: r2 = r1[0]  ; List_4
    //     0xaa7c14: ldur            w2, [x1, #0x17]
    // 0xaa7c18: DecompressPointer r2
    //     0xaa7c18: add             x2, x2, HEAP, lsl #32
    // 0xaa7c1c: cmp             w2, NULL
    // 0xaa7c20: b.eq            #0xaa7cd4
    // 0xaa7c24: LoadField: r3 = r1->field_6b
    //     0xaa7c24: ldur            w3, [x1, #0x6b]
    // 0xaa7c28: DecompressPointer r3
    //     0xaa7c28: add             x3, x3, HEAP, lsl #32
    // 0xaa7c2c: stur            x3, [fp, #-0x18]
    // 0xaa7c30: r2 = Instance_es
    //     0xaa7c30: ldr             x2, [PP, #0x39e0]  ; [pp+0x39e0] Obj!es@56e6c1
    // 0xaa7c34: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xaa7c34: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xaa7c38: r0 = call 0x31c78c
    //     0xaa7c38: bl              #0x31c78c
    // 0xaa7c3c: mov             x1, x0
    // 0xaa7c40: ldur            x0, [fp, #-0x18]
    // 0xaa7c44: r2 = LoadClassIdInstr(r0)
    //     0xaa7c44: ldur            x2, [x0, #-1]
    //     0xaa7c48: ubfx            x2, x2, #0xc, #0x14
    // 0xaa7c4c: cmp             x2, #0x77e
    // 0xaa7c50: b.ne            #0xaa7c80
    // 0xaa7c54: LoadField: r2 = r0->field_27
    //     0xaa7c54: ldur            w2, [x0, #0x27]
    // 0xaa7c58: DecompressPointer r2
    //     0xaa7c58: add             x2, x2, HEAP, lsl #32
    // 0xaa7c5c: LoadField: r3 = r0->field_7
    //     0xaa7c5c: ldur            x3, [x0, #7]
    // 0xaa7c60: LoadField: r5 = r0->field_1b
    //     0xaa7c60: ldur            w5, [x0, #0x1b]
    // 0xaa7c64: DecompressPointer r5
    //     0xaa7c64: add             x5, x5, HEAP, lsl #32
    // 0xaa7c68: mov             x16, x1
    // 0xaa7c6c: mov             x1, x2
    // 0xaa7c70: mov             x2, x16
    // 0xaa7c74: r0 = __unknown_function__()
    //     0xaa7c74: bl              #0xb1e770  ; [] ::__unknown_function__
    // 0xaa7c78: mov             x1, x0
    // 0xaa7c7c: b               #0xaa7cc8
    // 0xaa7c80: LoadField: r2 = r0->field_27
    //     0xaa7c80: ldur            w2, [x0, #0x27]
    // 0xaa7c84: DecompressPointer r2
    //     0xaa7c84: add             x2, x2, HEAP, lsl #32
    // 0xaa7c88: LoadField: r3 = r0->field_7
    //     0xaa7c88: ldur            x3, [x0, #7]
    // 0xaa7c8c: LoadField: r5 = r0->field_1b
    //     0xaa7c8c: ldur            w5, [x0, #0x1b]
    // 0xaa7c90: DecompressPointer r5
    //     0xaa7c90: add             x5, x5, HEAP, lsl #32
    // 0xaa7c94: r0 = LoadClassIdInstr(r2)
    //     0xaa7c94: ldur            x0, [x2, #-1]
    //     0xaa7c98: ubfx            x0, x0, #0xc, #0x14
    // 0xaa7c9c: cmp             x0, #0x77a
    // 0xaa7ca0: b.eq            #0xaa7cec
    // 0xaa7ca4: r0 = LoadClassIdInstr(r2)
    //     0xaa7ca4: ldur            x0, [x2, #-1]
    //     0xaa7ca8: ubfx            x0, x0, #0xc, #0x14
    // 0xaa7cac: mov             x16, x1
    // 0xaa7cb0: mov             x1, x2
    // 0xaa7cb4: mov             x2, x16
    // 0xaa7cb8: r0 = GDT[cid_x0 + -0xfd1]()
    //     0xaa7cb8: sub             lr, x0, #0xfd1
    //     0xaa7cbc: ldr             lr, [x21, lr, lsl #3]
    //     0xaa7cc0: blr             lr
    // 0xaa7cc4: mov             x1, x0
    // 0xaa7cc8: mov             x0, x1
    // 0xaa7ccc: stur            x1, [fp, #-0x18]
    // 0xaa7cd0: r0 = Await()
    //     0xaa7cd0: bl              #0xa75a20  ; AwaitStub
    // 0xaa7cd4: ldur            x0, [fp, #-0x10]
    // 0xaa7cd8: LoadField: r1 = r0->field_f
    //     0xaa7cd8: ldur            w1, [x0, #0xf]
    // 0xaa7cdc: DecompressPointer r1
    //     0xaa7cdc: add             x1, x1, HEAP, lsl #32
    // 0xaa7ce0: r0 = call 0x677600
    //     0xaa7ce0: bl              #0x677600
    // 0xaa7ce4: r0 = Null
    //     0xaa7ce4: mov             x0, NULL
    // 0xaa7ce8: r0 = ReturnAsyncNotFuture()
    //     0xaa7ce8: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaa7cec: r0 = pa()
    //     0xaa7cec: bl              #0xa6c1c8  ; AllocatepaStub -> pa (size=0x10)
    // 0xaa7cf0: mov             x1, x0
    // 0xaa7cf4: r0 = "Not supported for hybrid composition."
    //     0xaa7cf4: add             x0, PP, #0x57, lsl #12  ; [pp+0x57a30] "Not supported for hybrid composition."
    //     0xaa7cf8: ldr             x0, [x0, #0xa30]
    // 0xaa7cfc: StoreField: r1->field_b = r0
    //     0xaa7cfc: stur            w0, [x1, #0xb]
    // 0xaa7d00: mov             x0, x1
    // 0xaa7d04: r0 = Throw()
    //     0xaa7d04: bl              #0xb27dfc  ; ThrowStub
    // 0xaa7d08: brk             #0
    // 0xaa7d0c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa7d0c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa7d10: b               #0xaa7bf4
  }
  [closure] void _KCe(dynamic, int) {
    // ** addr: 0x3fe014, size: -0x1
  }
  [closure] void _MXe(dynamic, uda, es) {
    // ** addr: 0x412ef8, size: -0x1
  }
}

// class id: 2130, size: 0x50, field offset: 0x50
abstract class _eea extends rI
    implements RH {
}

// class id: 2645, size: 0x38, field offset: 0x24
class _cea extends mM {

  late (dynamic, fK) => Future<void> _EVc; // offset: 0x24
  late Set<mM> _EGe; // offset: 0x34

  [closure] void vWc(dynamic, fK) {
    // ** addr: 0x42bca4, size: -0x1
  }
}

// class id: 6015, size: 0x14, field offset: 0x14
enum _Uda extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 6016, size: 0x14, field offset: 0x14
enum Tda extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
