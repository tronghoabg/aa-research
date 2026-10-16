// lib: , url: BLk

// class id: 1049942, size: 0x8
class :: {
}

// class id: 5664, size: 0x28, field offset: 0xc
class WUa extends Iterable<dynamic>
    implements wUa {

  num [](WUa, int) {
    // ** addr: 0xaa4be8, size: 0x80
    // 0xaa4be8: EnterFrame
    //     0xaa4be8: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4bec: mov             fp, SP
    // 0xaa4bf0: CheckStackOverflow
    //     0xaa4bf0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4bf4: cmp             SP, x16
    //     0xaa4bf8: b.ls            #0xaa4c48
    // 0xaa4bfc: ldr             x0, [fp, #0x10]
    // 0xaa4c00: r2 = Null
    //     0xaa4c00: mov             x2, NULL
    // 0xaa4c04: r1 = Null
    //     0xaa4c04: mov             x1, NULL
    // 0xaa4c08: branchIfSmi(r0, 0xaa4c30)
    //     0xaa4c08: tbz             w0, #0, #0xaa4c30
    // 0xaa4c0c: r4 = LoadClassIdInstr(r0)
    //     0xaa4c0c: ldur            x4, [x0, #-1]
    //     0xaa4c10: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4c14: sub             x4, x4, #0x3c
    // 0xaa4c18: cmp             x4, #1
    // 0xaa4c1c: b.ls            #0xaa4c30
    // 0xaa4c20: r8 = int
    //     0xaa4c20: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4c24: r3 = Null
    //     0xaa4c24: add             x3, PP, #0x40, lsl #12  ; [pp+0x40bf8] Null
    //     0xaa4c28: ldr             x3, [x3, #0xbf8]
    // 0xaa4c2c: r0 = int()
    //     0xaa4c2c: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4c30: ldr             x1, [fp, #0x18]
    // 0xaa4c34: ldr             x2, [fp, #0x10]
    // 0xaa4c38: r0 = call 0x97a968
    //     0xaa4c38: bl              #0x97a968
    // 0xaa4c3c: LeaveFrame
    //     0xaa4c3c: mov             SP, fp
    //     0xaa4c40: ldp             fp, lr, [SP], #0x10
    // 0xaa4c44: ret
    //     0xaa4c44: ret             
    // 0xaa4c48: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4c48: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4c4c: b               #0xaa4bfc
  }
}
