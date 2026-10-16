// lib: , url: ELk

// class id: 1049945, size: 0x8
class :: {
}

// class id: 5661, size: 0x28, field offset: 0xc
class ZUa extends Iterable<dynamic>
    implements wUa {

  num [](ZUa, int) {
    // ** addr: 0xaa4d8c, size: 0x80
    // 0xaa4d8c: EnterFrame
    //     0xaa4d8c: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4d90: mov             fp, SP
    // 0xaa4d94: CheckStackOverflow
    //     0xaa4d94: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4d98: cmp             SP, x16
    //     0xaa4d9c: b.ls            #0xaa4dec
    // 0xaa4da0: ldr             x0, [fp, #0x10]
    // 0xaa4da4: r2 = Null
    //     0xaa4da4: mov             x2, NULL
    // 0xaa4da8: r1 = Null
    //     0xaa4da8: mov             x1, NULL
    // 0xaa4dac: branchIfSmi(r0, 0xaa4dd4)
    //     0xaa4dac: tbz             w0, #0, #0xaa4dd4
    // 0xaa4db0: r4 = LoadClassIdInstr(r0)
    //     0xaa4db0: ldur            x4, [x0, #-1]
    //     0xaa4db4: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4db8: sub             x4, x4, #0x3c
    // 0xaa4dbc: cmp             x4, #1
    // 0xaa4dc0: b.ls            #0xaa4dd4
    // 0xaa4dc4: r8 = int
    //     0xaa4dc4: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4dc8: r3 = Null
    //     0xaa4dc8: add             x3, PP, #0x40, lsl #12  ; [pp+0x40b78] Null
    //     0xaa4dcc: ldr             x3, [x3, #0xb78]
    // 0xaa4dd0: r0 = int()
    //     0xaa4dd0: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4dd4: ldr             x1, [fp, #0x18]
    // 0xaa4dd8: ldr             x2, [fp, #0x10]
    // 0xaa4ddc: r0 = call 0x97ab2c
    //     0xaa4ddc: bl              #0x97ab2c
    // 0xaa4de0: LeaveFrame
    //     0xaa4de0: mov             SP, fp
    //     0xaa4de4: ldp             fp, lr, [SP], #0x10
    // 0xaa4de8: ret
    //     0xaa4de8: ret             
    // 0xaa4dec: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4dec: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4df0: b               #0xaa4da0
  }
}
