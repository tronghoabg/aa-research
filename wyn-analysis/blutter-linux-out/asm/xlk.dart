// lib: , url: XLk

// class id: 1049964, size: 0x8
class :: {
}

// class id: 823, size: 0x28, field offset: 0x8
class mVa extends Object {

  int [](mVa, int) {
    // ** addr: 0xadc128, size: 0xcc
    // 0xadc128: EnterFrame
    //     0xadc128: stp             fp, lr, [SP, #-0x10]!
    //     0xadc12c: mov             fp, SP
    // 0xadc130: AllocStack(0x10)
    //     0xadc130: sub             SP, SP, #0x10
    // 0xadc134: CheckStackOverflow
    //     0xadc134: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadc138: cmp             SP, x16
    //     0xadc13c: b.ls            #0xadc1d4
    // 0xadc140: ldr             x0, [fp, #0x10]
    // 0xadc144: r2 = Null
    //     0xadc144: mov             x2, NULL
    // 0xadc148: r1 = Null
    //     0xadc148: mov             x1, NULL
    // 0xadc14c: branchIfSmi(r0, 0xadc174)
    //     0xadc14c: tbz             w0, #0, #0xadc174
    // 0xadc150: r4 = LoadClassIdInstr(r0)
    //     0xadc150: ldur            x4, [x0, #-1]
    //     0xadc154: ubfx            x4, x4, #0xc, #0x14
    // 0xadc158: sub             x4, x4, #0x3c
    // 0xadc15c: cmp             x4, #1
    // 0xadc160: b.ls            #0xadc174
    // 0xadc164: r8 = int
    //     0xadc164: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadc168: r3 = Null
    //     0xadc168: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3ebd8] Null
    //     0xadc16c: ldr             x3, [x3, #0xbd8]
    // 0xadc170: r0 = int()
    //     0xadc170: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadc174: ldr             x0, [fp, #0x18]
    // 0xadc178: LoadField: r2 = r0->field_7
    //     0xadc178: ldur            w2, [x0, #7]
    // 0xadc17c: DecompressPointer r2
    //     0xadc17c: add             x2, x2, HEAP, lsl #32
    // 0xadc180: LoadField: r1 = r0->field_1b
    //     0xadc180: ldur            x1, [x0, #0x1b]
    // 0xadc184: ldr             x0, [fp, #0x10]
    // 0xadc188: r3 = LoadInt32Instr(r0)
    //     0xadc188: sbfx            x3, x0, #1, #0x1f
    //     0xadc18c: tbz             w0, #0, #0xadc194
    //     0xadc190: ldur            x3, [x0, #7]
    // 0xadc194: add             x4, x1, x3
    // 0xadc198: r0 = BoxInt64Instr(r4)
    //     0xadc198: sbfiz           x0, x4, #1, #0x1f
    //     0xadc19c: cmp             x4, x0, asr #1
    //     0xadc1a0: b.eq            #0xadc1ac
    //     0xadc1a4: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xadc1a8: stur            x4, [x0, #7]
    // 0xadc1ac: r1 = LoadClassIdInstr(r2)
    //     0xadc1ac: ldur            x1, [x2, #-1]
    //     0xadc1b0: ubfx            x1, x1, #0xc, #0x14
    // 0xadc1b4: stp             x0, x2, [SP]
    // 0xadc1b8: mov             x0, x1
    // 0xadc1bc: r0 = GDT[cid_x0 + -0x1f6]()
    //     0xadc1bc: sub             lr, x0, #0x1f6
    //     0xadc1c0: ldr             lr, [x21, lr, lsl #3]
    //     0xadc1c4: blr             lr
    // 0xadc1c8: LeaveFrame
    //     0xadc1c8: mov             SP, fp
    //     0xadc1cc: ldp             fp, lr, [SP], #0x10
    // 0xadc1d0: ret
    //     0xadc1d0: ret             
    // 0xadc1d4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadc1d4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadc1d8: b               #0xadc140
  }
}
