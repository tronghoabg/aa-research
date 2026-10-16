// lib: , url: LLk

// class id: 1049952, size: 0x8
class :: {
}

// class id: 5655, size: 0x30, field offset: 0xc
class gVa extends Iterable<dynamic>
    implements wUa {

  num [](gVa, int) {
    // ** addr: 0xaa50f8, size: 0x8c
    // 0xaa50f8: EnterFrame
    //     0xaa50f8: stp             fp, lr, [SP, #-0x10]!
    //     0xaa50fc: mov             fp, SP
    // 0xaa5100: CheckStackOverflow
    //     0xaa5100: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa5104: cmp             SP, x16
    //     0xaa5108: b.ls            #0xaa5164
    // 0xaa510c: ldr             x0, [fp, #0x10]
    // 0xaa5110: r2 = Null
    //     0xaa5110: mov             x2, NULL
    // 0xaa5114: r1 = Null
    //     0xaa5114: mov             x1, NULL
    // 0xaa5118: branchIfSmi(r0, 0xaa5140)
    //     0xaa5118: tbz             w0, #0, #0xaa5140
    // 0xaa511c: r4 = LoadClassIdInstr(r0)
    //     0xaa511c: ldur            x4, [x0, #-1]
    //     0xaa5120: ubfx            x4, x4, #0xc, #0x14
    // 0xaa5124: sub             x4, x4, #0x3c
    // 0xaa5128: cmp             x4, #1
    // 0xaa512c: b.ls            #0xaa5140
    // 0xaa5130: r8 = int
    //     0xaa5130: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa5134: r3 = Null
    //     0xaa5134: add             x3, PP, #0x40, lsl #12  ; [pp+0x40a70] Null
    //     0xaa5138: ldr             x3, [x3, #0xa70]
    // 0xaa513c: r0 = int()
    //     0xaa513c: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa5140: ldr             x0, [fp, #0x10]
    // 0xaa5144: r2 = LoadInt32Instr(r0)
    //     0xaa5144: sbfx            x2, x0, #1, #0x1f
    //     0xaa5148: tbz             w0, #0, #0xaa5150
    //     0xaa514c: ldur            x2, [x0, #7]
    // 0xaa5150: ldr             x1, [fp, #0x18]
    // 0xaa5154: r0 = call 0x6480f4
    //     0xaa5154: bl              #0x6480f4
    // 0xaa5158: LeaveFrame
    //     0xaa5158: mov             SP, fp
    //     0xaa515c: ldp             fp, lr, [SP], #0x10
    // 0xaa5160: ret
    //     0xaa5160: ret             
    // 0xaa5164: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa5164: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa5168: b               #0xaa510c
  }
}
