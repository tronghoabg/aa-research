// lib: , url: WKk

// class id: 1049911, size: 0x8
class :: {
}

// class id: 841, size: 0xc, field offset: 0x8
class oUa extends Object {

  nUa [](oUa, int) {
    // ** addr: 0xb06f88, size: 0xa0
    // 0xb06f88: EnterFrame
    //     0xb06f88: stp             fp, lr, [SP, #-0x10]!
    //     0xb06f8c: mov             fp, SP
    // 0xb06f90: ldr             x0, [fp, #0x10]
    // 0xb06f94: r2 = Null
    //     0xb06f94: mov             x2, NULL
    // 0xb06f98: r1 = Null
    //     0xb06f98: mov             x1, NULL
    // 0xb06f9c: branchIfSmi(r0, 0xb06fc4)
    //     0xb06f9c: tbz             w0, #0, #0xb06fc4
    // 0xb06fa0: r4 = LoadClassIdInstr(r0)
    //     0xb06fa0: ldur            x4, [x0, #-1]
    //     0xb06fa4: ubfx            x4, x4, #0xc, #0x14
    // 0xb06fa8: sub             x4, x4, #0x3c
    // 0xb06fac: cmp             x4, #1
    // 0xb06fb0: b.ls            #0xb06fc4
    // 0xb06fb4: r8 = int
    //     0xb06fb4: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xb06fb8: r3 = Null
    //     0xb06fb8: add             x3, PP, #0x40, lsl #12  ; [pp+0x40cd8] Null
    //     0xb06fbc: ldr             x3, [x3, #0xcd8]
    // 0xb06fc0: r0 = int()
    //     0xb06fc0: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xb06fc4: ldr             x2, [fp, #0x18]
    // 0xb06fc8: LoadField: r3 = r2->field_7
    //     0xb06fc8: ldur            w3, [x2, #7]
    // 0xb06fcc: DecompressPointer r3
    //     0xb06fcc: add             x3, x3, HEAP, lsl #32
    // 0xb06fd0: LoadField: r2 = r3->field_b
    //     0xb06fd0: ldur            w2, [x3, #0xb]
    // 0xb06fd4: ldr             x4, [fp, #0x10]
    // 0xb06fd8: r5 = LoadInt32Instr(r4)
    //     0xb06fd8: sbfx            x5, x4, #1, #0x1f
    //     0xb06fdc: tbz             w4, #0, #0xb06fe4
    //     0xb06fe0: ldur            x5, [x4, #7]
    // 0xb06fe4: r0 = LoadInt32Instr(r2)
    //     0xb06fe4: sbfx            x0, x2, #1, #0x1f
    // 0xb06fe8: mov             x1, x5
    // 0xb06fec: cmp             x1, x0
    // 0xb06ff0: b.hs            #0xb0700c
    // 0xb06ff4: ArrayLoad: r0 = r3[r5]  ; Unknown_4
    //     0xb06ff4: add             x16, x3, x5, lsl #2
    //     0xb06ff8: ldur            w0, [x16, #0xf]
    // 0xb06ffc: DecompressPointer r0
    //     0xb06ffc: add             x0, x0, HEAP, lsl #32
    // 0xb07000: LeaveFrame
    //     0xb07000: mov             SP, fp
    //     0xb07004: ldp             fp, lr, [SP], #0x10
    // 0xb07008: ret
    //     0xb07008: ret             
    // 0xb0700c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xb0700c: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
}

// class id: 842, size: 0x28, field offset: 0x8
class nUa extends Object {

  late Int32List tHb; // offset: 0x14
}
