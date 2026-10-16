// lib: , url: FLk

// class id: 1049946, size: 0x8
class :: {
}

// class id: 5660, size: 0x28, field offset: 0xc
class aVa extends Iterable<dynamic>
    implements wUa {

  num [](aVa, int) {
    // ** addr: 0xaa4e18, size: 0x80
    // 0xaa4e18: EnterFrame
    //     0xaa4e18: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4e1c: mov             fp, SP
    // 0xaa4e20: CheckStackOverflow
    //     0xaa4e20: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4e24: cmp             SP, x16
    //     0xaa4e28: b.ls            #0xaa4e78
    // 0xaa4e2c: ldr             x0, [fp, #0x10]
    // 0xaa4e30: r2 = Null
    //     0xaa4e30: mov             x2, NULL
    // 0xaa4e34: r1 = Null
    //     0xaa4e34: mov             x1, NULL
    // 0xaa4e38: branchIfSmi(r0, 0xaa4e60)
    //     0xaa4e38: tbz             w0, #0, #0xaa4e60
    // 0xaa4e3c: r4 = LoadClassIdInstr(r0)
    //     0xaa4e3c: ldur            x4, [x0, #-1]
    //     0xaa4e40: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4e44: sub             x4, x4, #0x3c
    // 0xaa4e48: cmp             x4, #1
    // 0xaa4e4c: b.ls            #0xaa4e60
    // 0xaa4e50: r8 = int
    //     0xaa4e50: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4e54: r3 = Null
    //     0xaa4e54: add             x3, PP, #0x40, lsl #12  ; [pp+0x40b48] Null
    //     0xaa4e58: ldr             x3, [x3, #0xb48]
    // 0xaa4e5c: r0 = int()
    //     0xaa4e5c: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4e60: ldr             x1, [fp, #0x18]
    // 0xaa4e64: ldr             x2, [fp, #0x10]
    // 0xaa4e68: r0 = call 0x97abb4
    //     0xaa4e68: bl              #0x97abb4
    // 0xaa4e6c: LeaveFrame
    //     0xaa4e6c: mov             SP, fp
    //     0xaa4e70: ldp             fp, lr, [SP], #0x10
    // 0xaa4e74: ret
    //     0xaa4e74: ret             
    // 0xaa4e78: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4e78: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4e7c: b               #0xaa4e2c
  }
}
