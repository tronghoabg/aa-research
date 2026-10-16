// lib: , url: YDk

// class id: 1049543, size: 0x8
class :: {
}

// class id: 3599, size: 0x58, field offset: 0x44
class Kxa extends lI
    implements aga {

  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0xa89da4, size: 0x2bc
    // 0xa89da4: EnterFrame
    //     0xa89da4: stp             fp, lr, [SP, #-0x10]!
    //     0xa89da8: mov             fp, SP
    // 0xa89dac: AllocStack(0x78)
    //     0xa89dac: sub             SP, SP, #0x78
    // 0xa89db0: SetupParameters([dynamic _ /* r0 */])
    //     0xa89db0: ldr             x0, [fp, #0x10]
    //     0xa89db4: ldur            w3, [x0, #0x17]
    //     0xa89db8: add             x3, x3, HEAP, lsl #32
    //     0xa89dbc: stur            x3, [fp, #-0x68]
    // 0xa89dc0: CheckStackOverflow
    //     0xa89dc0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa89dc4: cmp             SP, x16
    //     0xa89dc8: b.ls            #0xa8a050
    // 0xa89dcc: ArrayLoad: r0 = r3[0]  ; List_4
    //     0xa89dcc: ldur            w0, [x3, #0x17]
    // 0xa89dd0: DecompressPointer r0
    //     0xa89dd0: add             x0, x0, HEAP, lsl #32
    // 0xa89dd4: LoadField: r4 = r3->field_f
    //     0xa89dd4: ldur            w4, [x3, #0xf]
    // 0xa89dd8: DecompressPointer r4
    //     0xa89dd8: add             x4, x4, HEAP, lsl #32
    // 0xa89ddc: stur            x4, [fp, #-0x60]
    // 0xa89de0: cmp             w0, NULL
    // 0xa89de4: b.ne            #0xa89df4
    // 0xa89de8: mov             x1, x4
    // 0xa89dec: r0 = Null
    //     0xa89dec: mov             x0, NULL
    // 0xa89df0: b               #0xa89ea4
    // 0xa89df4: LoadField: r2 = r4->field_47
    //     0xa89df4: ldur            w2, [x4, #0x47]
    // 0xa89df8: DecompressPointer r2
    //     0xa89df8: add             x2, x2, HEAP, lsl #32
    // 0xa89dfc: LoadField: r0 = r3->field_13
    //     0xa89dfc: ldur            w0, [x3, #0x13]
    // 0xa89e00: DecompressPointer r0
    //     0xa89e00: add             x0, x0, HEAP, lsl #32
    // 0xa89e04: r1 = LoadInt32Instr(r0)
    //     0xa89e04: sbfx            x1, x0, #1, #0x1f
    //     0xa89e08: tbz             w0, #0, #0xa89e10
    //     0xa89e0c: ldur            x1, [x0, #7]
    // 0xa89e10: sub             x5, x1, #1
    // 0xa89e14: r0 = BoxInt64Instr(r5)
    //     0xa89e14: sbfiz           x0, x5, #1, #0x1f
    //     0xa89e18: cmp             x5, x0, asr #1
    //     0xa89e1c: b.eq            #0xa89e28
    //     0xa89e20: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xa89e24: stur            x5, [x0, #7]
    // 0xa89e28: mov             x1, x2
    // 0xa89e2c: mov             x2, x0
    // 0xa89e30: r0 = call 0x3855e0
    //     0xa89e30: bl              #0x3855e0
    // 0xa89e34: cmp             w0, NULL
    // 0xa89e38: b.ne            #0xa89e44
    // 0xa89e3c: r1 = Null
    //     0xa89e3c: mov             x1, NULL
    // 0xa89e40: b               #0xa89e4c
    // 0xa89e44: ArrayLoad: r1 = r0[0]  ; List_4
    //     0xa89e44: ldur            w1, [x0, #0x17]
    // 0xa89e48: DecompressPointer r1
    //     0xa89e48: add             x1, x1, HEAP, lsl #32
    // 0xa89e4c: cmp             w1, NULL
    // 0xa89e50: b.eq            #0xa8a058
    // 0xa89e54: r0 = LoadClassIdInstr(r1)
    //     0xa89e54: ldur            x0, [x1, #-1]
    //     0xa89e58: ubfx            x0, x0, #0xc, #0x14
    // 0xa89e5c: r0 = GDT[cid_x0 + -0xecb]()
    //     0xa89e5c: sub             lr, x0, #0xecb
    //     0xa89e60: ldr             lr, [x21, lr, lsl #3]
    //     0xa89e64: blr             lr
    // 0xa89e68: mov             x3, x0
    // 0xa89e6c: r2 = Null
    //     0xa89e6c: mov             x2, NULL
    // 0xa89e70: r1 = Null
    //     0xa89e70: mov             x1, NULL
    // 0xa89e74: stur            x3, [fp, #-0x70]
    // 0xa89e78: r4 = LoadClassIdInstr(r0)
    //     0xa89e78: ldur            x4, [x0, #-1]
    //     0xa89e7c: ubfx            x4, x4, #0xc, #0x14
    // 0xa89e80: sub             x4, x4, #0x836
    // 0xa89e84: cmp             x4, #0x99
    // 0xa89e88: b.ls            #0xa89e9c
    // 0xa89e8c: r8 = rI?
    //     0xa89e8c: ldr             x8, [PP, #0x29e0]  ; [pp+0x29e0] Type: rI?
    // 0xa89e90: r3 = Null
    //     0xa89e90: add             x3, PP, #0x30, lsl #12  ; [pp+0x30d08] Null
    //     0xa89e94: ldr             x3, [x3, #0xd08]
    // 0xa89e98: r0 = rI?()
    //     0xa89e98: bl              #0xa6b8b8  ; IsType_rI?_Stub
    // 0xa89e9c: ldur            x0, [fp, #-0x70]
    // 0xa89ea0: ldur            x1, [fp, #-0x60]
    // 0xa89ea4: StoreField: r1->field_4b = r0
    //     0xa89ea4: stur            w0, [x1, #0x4b]
    //     0xa89ea8: ldurb           w16, [x1, #-1]
    //     0xa89eac: ldurb           w17, [x0, #-1]
    //     0xa89eb0: and             x16, x17, x16, lsr #2
    //     0xa89eb4: tst             x16, HEAP, lsr #32
    //     0xa89eb8: b.eq            #0xa89ec0
    //     0xa89ebc: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xa89ec0: ldur            x3, [fp, #-0x68]
    // 0xa89ec4: LoadField: r4 = r3->field_f
    //     0xa89ec4: ldur            w4, [x3, #0xf]
    // 0xa89ec8: DecompressPointer r4
    //     0xa89ec8: add             x4, x4, HEAP, lsl #32
    // 0xa89ecc: stur            x4, [fp, #-0x70]
    // 0xa89ed0: ArrayLoad: r5 = r4[0]  ; List_4
    //     0xa89ed0: ldur            w5, [x4, #0x17]
    // 0xa89ed4: DecompressPointer r5
    //     0xa89ed4: add             x5, x5, HEAP, lsl #32
    // 0xa89ed8: stur            x5, [fp, #-0x60]
    // 0xa89edc: cmp             w5, NULL
    // 0xa89ee0: b.eq            #0xa8a05c
    // 0xa89ee4: mov             x0, x5
    // 0xa89ee8: r2 = Null
    //     0xa89ee8: mov             x2, NULL
    // 0xa89eec: r1 = Null
    //     0xa89eec: mov             x1, NULL
    // 0xa89ef0: r4 = LoadClassIdInstr(r0)
    //     0xa89ef0: ldur            x4, [x0, #-1]
    //     0xa89ef4: ubfx            x4, x4, #0xc, #0x14
    // 0xa89ef8: sub             x4, x4, #0xe7b
    // 0xa89efc: cmp             x4, #4
    // 0xa89f00: b.ls            #0xa89f18
    // 0xa89f04: r8 = Fxa
    //     0xa89f04: add             x8, PP, #0x30, lsl #12  ; [pp+0x30d18] Type: Fxa
    //     0xa89f08: ldr             x8, [x8, #0xd18]
    // 0xa89f0c: r3 = Null
    //     0xa89f0c: add             x3, PP, #0x30, lsl #12  ; [pp+0x30d20] Null
    //     0xa89f10: ldr             x3, [x3, #0xd20]
    // 0xa89f14: r0 = DefaultTypeTest()
    //     0xa89f14: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa89f18: ldur            x3, [fp, #-0x68]
    // 0xa89f1c: LoadField: r1 = r3->field_13
    //     0xa89f1c: ldur            w1, [x3, #0x13]
    // 0xa89f20: DecompressPointer r1
    //     0xa89f20: add             x1, x1, HEAP, lsl #32
    // 0xa89f24: mov             x0, x1
    // 0xa89f28: ldur            x4, [fp, #-0x70]
    // 0xa89f2c: StoreField: r4->field_4f = r0
    //     0xa89f2c: stur            w0, [x4, #0x4f]
    //     0xa89f30: tbz             w0, #0, #0xa89f4c
    //     0xa89f34: ldurb           w16, [x4, #-1]
    //     0xa89f38: ldurb           w17, [x0, #-1]
    //     0xa89f3c: and             x16, x17, x16, lsr #2
    //     0xa89f40: tst             x16, HEAP, lsr #32
    //     0xa89f44: b.eq            #0xa89f4c
    //     0xa89f48: bl              #0xb282c4  ; WriteBarrierWrappersStub
    // 0xa89f4c: LoadField: r0 = r4->field_47
    //     0xa89f4c: ldur            w0, [x4, #0x47]
    // 0xa89f50: DecompressPointer r0
    //     0xa89f50: add             x0, x0, HEAP, lsl #32
    // 0xa89f54: mov             x2, x1
    // 0xa89f58: mov             x1, x0
    // 0xa89f5c: r0 = call 0x3855e0
    //     0xa89f5c: bl              #0x3855e0
    // 0xa89f60: cmp             w0, NULL
    // 0xa89f64: b.ne            #0xa89f70
    // 0xa89f68: r4 = Null
    //     0xa89f68: mov             x4, NULL
    // 0xa89f6c: b               #0xa89f7c
    // 0xa89f70: ArrayLoad: r1 = r0[0]  ; List_4
    //     0xa89f70: ldur            w1, [x0, #0x17]
    // 0xa89f74: DecompressPointer r1
    //     0xa89f74: add             x1, x1, HEAP, lsl #32
    // 0xa89f78: mov             x4, x1
    // 0xa89f7c: ldur            x0, [fp, #-0x68]
    // 0xa89f80: stur            x4, [fp, #-0x78]
    // 0xa89f84: LoadField: r1 = r0->field_f
    //     0xa89f84: ldur            w1, [x0, #0xf]
    // 0xa89f88: DecompressPointer r1
    //     0xa89f88: add             x1, x1, HEAP, lsl #32
    // 0xa89f8c: LoadField: r2 = r0->field_13
    //     0xa89f8c: ldur            w2, [x0, #0x13]
    // 0xa89f90: DecompressPointer r2
    //     0xa89f90: add             x2, x2, HEAP, lsl #32
    // 0xa89f94: r3 = LoadInt32Instr(r2)
    //     0xa89f94: sbfx            x3, x2, #1, #0x1f
    //     0xa89f98: tbz             w2, #0, #0xa89fa0
    //     0xa89f9c: ldur            x3, [x2, #7]
    // 0xa89fa0: mov             x2, x3
    // 0xa89fa4: ldur            x3, [fp, #-0x60]
    // 0xa89fa8: r0 = call 0x3e8358
    //     0xa89fa8: bl              #0x3e8358
    // 0xa89fac: mov             x1, x0
    // 0xa89fb0: ldur            x0, [fp, #-0x68]
    // 0xa89fb4: LoadField: r5 = r0->field_13
    //     0xa89fb4: ldur            w5, [x0, #0x13]
    // 0xa89fb8: DecompressPointer r5
    //     0xa89fb8: add             x5, x5, HEAP, lsl #32
    // 0xa89fbc: mov             x3, x1
    // 0xa89fc0: ldur            x1, [fp, #-0x70]
    // 0xa89fc4: ldur            x2, [fp, #-0x78]
    // 0xa89fc8: r0 = call 0x84337c
    //     0xa89fc8: bl              #0x84337c
    // 0xa89fcc: ldur            x2, [fp, #-0x68]
    // 0xa89fd0: LoadField: r1 = r2->field_f
    //     0xa89fd0: ldur            w1, [x2, #0xf]
    // 0xa89fd4: DecompressPointer r1
    //     0xa89fd4: add             x1, x1, HEAP, lsl #32
    // 0xa89fd8: StoreField: r1->field_4f = rNULL
    //     0xa89fd8: stur            NULL, [x1, #0x4f]
    // 0xa89fdc: cmp             w0, NULL
    // 0xa89fe0: b.eq            #0xa8a008
    // 0xa89fe4: LoadField: r3 = r1->field_47
    //     0xa89fe4: ldur            w3, [x1, #0x47]
    // 0xa89fe8: DecompressPointer r3
    //     0xa89fe8: add             x3, x3, HEAP, lsl #32
    // 0xa89fec: LoadField: r1 = r2->field_13
    //     0xa89fec: ldur            w1, [x2, #0x13]
    // 0xa89ff0: DecompressPointer r1
    //     0xa89ff0: add             x1, x1, HEAP, lsl #32
    // 0xa89ff4: mov             x2, x1
    // 0xa89ff8: mov             x1, x3
    // 0xa89ffc: mov             x3, x0
    // 0xa8a000: r0 = call 0x9a1bc8
    //     0xa8a000: bl              #0x9a1bc8
    // 0xa8a004: b               #0xa8a024
    // 0xa8a008: LoadField: r0 = r1->field_47
    //     0xa8a008: ldur            w0, [x1, #0x47]
    // 0xa8a00c: DecompressPointer r0
    //     0xa8a00c: add             x0, x0, HEAP, lsl #32
    // 0xa8a010: LoadField: r1 = r2->field_13
    //     0xa8a010: ldur            w1, [x2, #0x13]
    // 0xa8a014: DecompressPointer r1
    //     0xa8a014: add             x1, x1, HEAP, lsl #32
    // 0xa8a018: mov             x2, x1
    // 0xa8a01c: mov             x1, x0
    // 0xa8a020: r0 = call 0x972188
    //     0xa8a020: bl              #0x972188
    // 0xa8a024: r0 = Null
    //     0xa8a024: mov             x0, NULL
    // 0xa8a028: LeaveFrame
    //     0xa8a028: mov             SP, fp
    //     0xa8a02c: ldp             fp, lr, [SP], #0x10
    // 0xa8a030: ret
    //     0xa8a030: ret             
    // 0xa8a034: sub             SP, fp, #0x78
    // 0xa8a038: ldur            x2, [fp, #-0x68]
    // 0xa8a03c: LoadField: r3 = r2->field_f
    //     0xa8a03c: ldur            w3, [x2, #0xf]
    // 0xa8a040: DecompressPointer r3
    //     0xa8a040: add             x3, x3, HEAP, lsl #32
    // 0xa8a044: StoreField: r3->field_4f = rNULL
    //     0xa8a044: stur            NULL, [x3, #0x4f]
    // 0xa8a048: r0 = ReThrow()
    //     0xa8a048: bl              #0xb27dd0  ; ReThrowStub
    // 0xa8a04c: brk             #0
    // 0xa8a050: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa8a050: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa8a054: b               #0xa89dcc
    // 0xa8a058: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xa8a058: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xa8a05c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xa8a05c: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0xa8a078, size: 0xf4
    // 0xa8a078: EnterFrame
    //     0xa8a078: stp             fp, lr, [SP, #-0x10]!
    //     0xa8a07c: mov             fp, SP
    // 0xa8a080: AllocStack(0x58)
    //     0xa8a080: sub             SP, SP, #0x58
    // 0xa8a084: SetupParameters([dynamic _ /* r0 */])
    //     0xa8a084: ldr             x0, [fp, #0x10]
    //     0xa8a088: ldur            w3, [x0, #0x17]
    //     0xa8a08c: add             x3, x3, HEAP, lsl #32
    //     0xa8a090: stur            x3, [fp, #-0x58]
    // 0xa8a094: CheckStackOverflow
    //     0xa8a094: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa8a098: cmp             SP, x16
    //     0xa8a09c: b.ls            #0xa8a164
    // 0xa8a0a0: LoadField: r4 = r3->field_f
    //     0xa8a0a0: ldur            w4, [x3, #0xf]
    // 0xa8a0a4: DecompressPointer r4
    //     0xa8a0a4: add             x4, x4, HEAP, lsl #32
    // 0xa8a0a8: stur            x4, [fp, #-0x50]
    // 0xa8a0ac: LoadField: r5 = r3->field_13
    //     0xa8a0ac: ldur            w5, [x3, #0x13]
    // 0xa8a0b0: DecompressPointer r5
    //     0xa8a0b0: add             x5, x5, HEAP, lsl #32
    // 0xa8a0b4: mov             x0, x5
    // 0xa8a0b8: stur            x5, [fp, #-0x48]
    // 0xa8a0bc: StoreField: r4->field_4f = r0
    //     0xa8a0bc: stur            w0, [x4, #0x4f]
    //     0xa8a0c0: tbz             w0, #0, #0xa8a0dc
    //     0xa8a0c4: ldurb           w16, [x4, #-1]
    //     0xa8a0c8: ldurb           w17, [x0, #-1]
    //     0xa8a0cc: and             x16, x17, x16, lsr #2
    //     0xa8a0d0: tst             x16, HEAP, lsr #32
    //     0xa8a0d4: b.eq            #0xa8a0dc
    //     0xa8a0d8: bl              #0xb282c4  ; WriteBarrierWrappersStub
    // 0xa8a0dc: LoadField: r1 = r4->field_47
    //     0xa8a0dc: ldur            w1, [x4, #0x47]
    // 0xa8a0e0: DecompressPointer r1
    //     0xa8a0e0: add             x1, x1, HEAP, lsl #32
    // 0xa8a0e4: mov             x2, x5
    // 0xa8a0e8: r0 = call 0x3855e0
    //     0xa8a0e8: bl              #0x3855e0
    // 0xa8a0ec: cmp             w0, NULL
    // 0xa8a0f0: b.ne            #0xa8a0fc
    // 0xa8a0f4: r2 = Null
    //     0xa8a0f4: mov             x2, NULL
    // 0xa8a0f8: b               #0xa8a108
    // 0xa8a0fc: ArrayLoad: r1 = r0[0]  ; List_4
    //     0xa8a0fc: ldur            w1, [x0, #0x17]
    // 0xa8a100: DecompressPointer r1
    //     0xa8a100: add             x1, x1, HEAP, lsl #32
    // 0xa8a104: mov             x2, x1
    // 0xa8a108: ldur            x1, [fp, #-0x50]
    // 0xa8a10c: ldur            x5, [fp, #-0x48]
    // 0xa8a110: r3 = Null
    //     0xa8a110: mov             x3, NULL
    // 0xa8a114: r0 = call 0x84337c
    //     0xa8a114: bl              #0x84337c
    // 0xa8a118: ldur            x2, [fp, #-0x58]
    // 0xa8a11c: LoadField: r0 = r2->field_f
    //     0xa8a11c: ldur            w0, [x2, #0xf]
    // 0xa8a120: DecompressPointer r0
    //     0xa8a120: add             x0, x0, HEAP, lsl #32
    // 0xa8a124: StoreField: r0->field_4f = rNULL
    //     0xa8a124: stur            NULL, [x0, #0x4f]
    // 0xa8a128: LoadField: r1 = r0->field_47
    //     0xa8a128: ldur            w1, [x0, #0x47]
    // 0xa8a12c: DecompressPointer r1
    //     0xa8a12c: add             x1, x1, HEAP, lsl #32
    // 0xa8a130: ldur            x2, [fp, #-0x48]
    // 0xa8a134: r0 = call 0x972188
    //     0xa8a134: bl              #0x972188
    // 0xa8a138: r0 = Null
    //     0xa8a138: mov             x0, NULL
    // 0xa8a13c: LeaveFrame
    //     0xa8a13c: mov             SP, fp
    //     0xa8a140: ldp             fp, lr, [SP], #0x10
    // 0xa8a144: ret
    //     0xa8a144: ret             
    // 0xa8a148: sub             SP, fp, #0x58
    // 0xa8a14c: ldur            x2, [fp, #-0x58]
    // 0xa8a150: LoadField: r3 = r2->field_f
    //     0xa8a150: ldur            w3, [x2, #0xf]
    // 0xa8a154: DecompressPointer r3
    //     0xa8a154: add             x3, x3, HEAP, lsl #32
    // 0xa8a158: StoreField: r3->field_4f = rNULL
    //     0xa8a158: stur            NULL, [x3, #0x4f]
    // 0xa8a15c: r0 = ReThrow()
    //     0xa8a15c: bl              #0xb27dd0  ; ReThrowStub
    // 0xa8a160: brk             #0
    // 0xa8a164: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa8a164: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa8a168: b               #0xa8a0a0
  }
  [closure] void tuj(dynamic, int) {
    // ** addr: 0x65d290, size: -0x1
  }
  [closure] vna? <anonymous closure>(dynamic) {
    // ** addr: 0x65d218, size: -0x1
  }
  [closure] void dJe(dynamic, rI) {
    // ** addr: 0xa04b90, size: -0x1
  }
}

// class id: 3627, size: 0x18, field offset: 0x14
//   const constructor, 
class Lxa extends rma<dynamic> {
}

// class id: 3705, size: 0xc, field offset: 0xc
//   const constructor, 
abstract class Exa extends jI {
}

// class id: 3706, size: 0x10, field offset: 0xc
//   const constructor, 
abstract class Fxa extends Exa {
}

// class id: 3708, size: 0x14, field offset: 0x10
//   const constructor, 
class Jxa extends Fxa {
}

// class id: 3711, size: 0x10, field offset: 0x10
//   const constructor, 
class Gxa extends Fxa {
}
