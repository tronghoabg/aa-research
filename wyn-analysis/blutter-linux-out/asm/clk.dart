// lib: , url: CLk

// class id: 1049943, size: 0x8
class :: {
}

// class id: 5663, size: 0x28, field offset: 0xc
class XUa extends Iterable<dynamic>
    implements wUa {

  num [](XUa, int) {
    // ** addr: 0xaa4c74, size: 0x80
    // 0xaa4c74: EnterFrame
    //     0xaa4c74: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4c78: mov             fp, SP
    // 0xaa4c7c: CheckStackOverflow
    //     0xaa4c7c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4c80: cmp             SP, x16
    //     0xaa4c84: b.ls            #0xaa4cd4
    // 0xaa4c88: ldr             x0, [fp, #0x10]
    // 0xaa4c8c: r2 = Null
    //     0xaa4c8c: mov             x2, NULL
    // 0xaa4c90: r1 = Null
    //     0xaa4c90: mov             x1, NULL
    // 0xaa4c94: branchIfSmi(r0, 0xaa4cbc)
    //     0xaa4c94: tbz             w0, #0, #0xaa4cbc
    // 0xaa4c98: r4 = LoadClassIdInstr(r0)
    //     0xaa4c98: ldur            x4, [x0, #-1]
    //     0xaa4c9c: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4ca0: sub             x4, x4, #0x3c
    // 0xaa4ca4: cmp             x4, #1
    // 0xaa4ca8: b.ls            #0xaa4cbc
    // 0xaa4cac: r8 = int
    //     0xaa4cac: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4cb0: r3 = Null
    //     0xaa4cb0: add             x3, PP, #0x40, lsl #12  ; [pp+0x40bd0] Null
    //     0xaa4cb4: ldr             x3, [x3, #0xbd0]
    // 0xaa4cb8: r0 = int()
    //     0xaa4cb8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4cbc: ldr             x1, [fp, #0x18]
    // 0xaa4cc0: ldr             x2, [fp, #0x10]
    // 0xaa4cc4: r0 = call 0x97aa18
    //     0xaa4cc4: bl              #0x97aa18
    // 0xaa4cc8: LeaveFrame
    //     0xaa4cc8: mov             SP, fp
    //     0xaa4ccc: ldp             fp, lr, [SP], #0x10
    // 0xaa4cd0: ret
    //     0xaa4cd0: ret             
    // 0xaa4cd4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4cd4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4cd8: b               #0xaa4c88
  }
}
