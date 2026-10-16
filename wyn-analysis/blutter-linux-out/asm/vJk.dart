// lib: , url: vJk

// class id: 1049831, size: 0x8
class :: {
}

// class id: 5684, size: 0x10, field offset: 0xc
class zRa extends Iterable<dynamic>
    implements ps {

  num [](zRa, int) {
    // ** addr: 0xb01d84, size: 0xc4
    // 0xb01d84: EnterFrame
    //     0xb01d84: stp             fp, lr, [SP, #-0x10]!
    //     0xb01d88: mov             fp, SP
    // 0xb01d8c: ldr             x0, [fp, #0x10]
    // 0xb01d90: r2 = Null
    //     0xb01d90: mov             x2, NULL
    // 0xb01d94: r1 = Null
    //     0xb01d94: mov             x1, NULL
    // 0xb01d98: branchIfSmi(r0, 0xb01dc0)
    //     0xb01d98: tbz             w0, #0, #0xb01dc0
    // 0xb01d9c: r4 = LoadClassIdInstr(r0)
    //     0xb01d9c: ldur            x4, [x0, #-1]
    //     0xb01da0: ubfx            x4, x4, #0xc, #0x14
    // 0xb01da4: sub             x4, x4, #0x3c
    // 0xb01da8: cmp             x4, #1
    // 0xb01dac: b.ls            #0xb01dc0
    // 0xb01db0: r8 = int
    //     0xb01db0: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xb01db4: r3 = Null
    //     0xb01db4: add             x3, PP, #0x40, lsl #12  ; [pp+0x40f10] Null
    //     0xb01db8: ldr             x3, [x3, #0xf10]
    // 0xb01dbc: r0 = int()
    //     0xb01dbc: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xb01dc0: ldr             x2, [fp, #0x18]
    // 0xb01dc4: LoadField: r3 = r2->field_b
    //     0xb01dc4: ldur            w3, [x2, #0xb]
    // 0xb01dc8: DecompressPointer r3
    //     0xb01dc8: add             x3, x3, HEAP, lsl #32
    // 0xb01dcc: LoadField: r2 = r3->field_13
    //     0xb01dcc: ldur            w2, [x3, #0x13]
    // 0xb01dd0: ldr             x4, [fp, #0x10]
    // 0xb01dd4: r5 = LoadInt32Instr(r4)
    //     0xb01dd4: sbfx            x5, x4, #1, #0x1f
    //     0xb01dd8: tbz             w4, #0, #0xb01de0
    //     0xb01ddc: ldur            x5, [x4, #7]
    // 0xb01de0: r0 = LoadInt32Instr(r2)
    //     0xb01de0: sbfx            x0, x2, #1, #0x1f
    // 0xb01de4: cmp             x5, x0
    // 0xb01de8: b.ge            #0xb01e08
    // 0xb01dec: mov             x1, x5
    // 0xb01df0: cmp             x1, x0
    // 0xb01df4: b.hs            #0xb01e2c
    // 0xb01df8: ArrayLoad: r2 = r3[r5]  ; List_4
    //     0xb01df8: add             x16, x3, x5, lsl #2
    //     0xb01dfc: ldur            w2, [x16, #0x17]
    // 0xb01e00: ubfx            x2, x2, #0, #0x20
    // 0xb01e04: b               #0xb01e0c
    // 0xb01e08: r2 = 0
    //     0xb01e08: movz            x2, #0
    // 0xb01e0c: r0 = BoxInt64Instr(r2)
    //     0xb01e0c: sbfiz           x0, x2, #1, #0x1f
    //     0xb01e10: cmp             x2, x0, asr #1
    //     0xb01e14: b.eq            #0xb01e20
    //     0xb01e18: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xb01e1c: stur            x2, [x0, #7]
    // 0xb01e20: LeaveFrame
    //     0xb01e20: mov             SP, fp
    //     0xb01e24: ldp             fp, lr, [SP], #0x10
    // 0xb01e28: ret
    //     0xb01e28: ret             
    // 0xb01e2c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xb01e2c: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
}
