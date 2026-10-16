// lib: , url: ILk

// class id: 1049949, size: 0x8
class :: {
}

// class id: 5658, size: 0x28, field offset: 0xc
class dVa extends Iterable<dynamic>
    implements wUa {

  num [](dVa, int) {
    // ** addr: 0xaa4f3c, size: 0x8c
    // 0xaa4f3c: EnterFrame
    //     0xaa4f3c: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4f40: mov             fp, SP
    // 0xaa4f44: CheckStackOverflow
    //     0xaa4f44: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4f48: cmp             SP, x16
    //     0xaa4f4c: b.ls            #0xaa4fa8
    // 0xaa4f50: ldr             x0, [fp, #0x10]
    // 0xaa4f54: r2 = Null
    //     0xaa4f54: mov             x2, NULL
    // 0xaa4f58: r1 = Null
    //     0xaa4f58: mov             x1, NULL
    // 0xaa4f5c: branchIfSmi(r0, 0xaa4f84)
    //     0xaa4f5c: tbz             w0, #0, #0xaa4f84
    // 0xaa4f60: r4 = LoadClassIdInstr(r0)
    //     0xaa4f60: ldur            x4, [x0, #-1]
    //     0xaa4f64: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4f68: sub             x4, x4, #0x3c
    // 0xaa4f6c: cmp             x4, #1
    // 0xaa4f70: b.ls            #0xaa4f84
    // 0xaa4f74: r8 = int
    //     0xaa4f74: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4f78: r3 = Null
    //     0xaa4f78: add             x3, PP, #0x40, lsl #12  ; [pp+0x40af0] Null
    //     0xaa4f7c: ldr             x3, [x3, #0xaf0]
    // 0xaa4f80: r0 = int()
    //     0xaa4f80: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4f84: ldr             x0, [fp, #0x10]
    // 0xaa4f88: r2 = LoadInt32Instr(r0)
    //     0xaa4f88: sbfx            x2, x0, #1, #0x1f
    //     0xaa4f8c: tbz             w0, #0, #0xaa4f94
    //     0xaa4f90: ldur            x2, [x0, #7]
    // 0xaa4f94: ldr             x1, [fp, #0x18]
    // 0xaa4f98: r0 = call 0x647d98
    //     0xaa4f98: bl              #0x647d98
    // 0xaa4f9c: LeaveFrame
    //     0xaa4f9c: mov             SP, fp
    //     0xaa4fa0: ldp             fp, lr, [SP], #0x10
    // 0xaa4fa4: ret
    //     0xaa4fa4: ret             
    // 0xaa4fa8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4fa8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4fac: b               #0xaa4f50
  }
}
