// lib: , url: DLk

// class id: 1049944, size: 0x8
class :: {
}

// class id: 5662, size: 0x28, field offset: 0xc
class YUa extends Iterable<dynamic>
    implements wUa {

  num [](YUa, int) {
    // ** addr: 0xaa4d00, size: 0x80
    // 0xaa4d00: EnterFrame
    //     0xaa4d00: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4d04: mov             fp, SP
    // 0xaa4d08: CheckStackOverflow
    //     0xaa4d08: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4d0c: cmp             SP, x16
    //     0xaa4d10: b.ls            #0xaa4d60
    // 0xaa4d14: ldr             x0, [fp, #0x10]
    // 0xaa4d18: r2 = Null
    //     0xaa4d18: mov             x2, NULL
    // 0xaa4d1c: r1 = Null
    //     0xaa4d1c: mov             x1, NULL
    // 0xaa4d20: branchIfSmi(r0, 0xaa4d48)
    //     0xaa4d20: tbz             w0, #0, #0xaa4d48
    // 0xaa4d24: r4 = LoadClassIdInstr(r0)
    //     0xaa4d24: ldur            x4, [x0, #-1]
    //     0xaa4d28: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4d2c: sub             x4, x4, #0x3c
    // 0xaa4d30: cmp             x4, #1
    // 0xaa4d34: b.ls            #0xaa4d48
    // 0xaa4d38: r8 = int
    //     0xaa4d38: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4d3c: r3 = Null
    //     0xaa4d3c: add             x3, PP, #0x40, lsl #12  ; [pp+0x40ba8] Null
    //     0xaa4d40: ldr             x3, [x3, #0xba8]
    // 0xaa4d44: r0 = int()
    //     0xaa4d44: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4d48: ldr             x1, [fp, #0x18]
    // 0xaa4d4c: ldr             x2, [fp, #0x10]
    // 0xaa4d50: r0 = call 0x97aac4
    //     0xaa4d50: bl              #0x97aac4
    // 0xaa4d54: LeaveFrame
    //     0xaa4d54: mov             SP, fp
    //     0xaa4d58: ldp             fp, lr, [SP], #0x10
    // 0xaa4d5c: ret
    //     0xaa4d5c: ret             
    // 0xaa4d60: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4d60: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4d64: b               #0xaa4d14
  }
}
