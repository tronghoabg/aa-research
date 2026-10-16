// lib: , url: HLk

// class id: 1049948, size: 0x8
class :: {
}

// class id: 5659, size: 0x38, field offset: 0xc
class cVa extends Iterable<dynamic>
    implements wUa {

  num [](cVa, int) {
    // ** addr: 0xaa4ea4, size: 0x8c
    // 0xaa4ea4: EnterFrame
    //     0xaa4ea4: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4ea8: mov             fp, SP
    // 0xaa4eac: CheckStackOverflow
    //     0xaa4eac: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4eb0: cmp             SP, x16
    //     0xaa4eb4: b.ls            #0xaa4f10
    // 0xaa4eb8: ldr             x0, [fp, #0x10]
    // 0xaa4ebc: r2 = Null
    //     0xaa4ebc: mov             x2, NULL
    // 0xaa4ec0: r1 = Null
    //     0xaa4ec0: mov             x1, NULL
    // 0xaa4ec4: branchIfSmi(r0, 0xaa4eec)
    //     0xaa4ec4: tbz             w0, #0, #0xaa4eec
    // 0xaa4ec8: r4 = LoadClassIdInstr(r0)
    //     0xaa4ec8: ldur            x4, [x0, #-1]
    //     0xaa4ecc: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4ed0: sub             x4, x4, #0x3c
    // 0xaa4ed4: cmp             x4, #1
    // 0xaa4ed8: b.ls            #0xaa4eec
    // 0xaa4edc: r8 = int
    //     0xaa4edc: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4ee0: r3 = Null
    //     0xaa4ee0: add             x3, PP, #0x40, lsl #12  ; [pp+0x40b18] Null
    //     0xaa4ee4: ldr             x3, [x3, #0xb18]
    // 0xaa4ee8: r0 = int()
    //     0xaa4ee8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4eec: ldr             x0, [fp, #0x10]
    // 0xaa4ef0: r2 = LoadInt32Instr(r0)
    //     0xaa4ef0: sbfx            x2, x0, #1, #0x1f
    //     0xaa4ef4: tbz             w0, #0, #0xaa4efc
    //     0xaa4ef8: ldur            x2, [x0, #7]
    // 0xaa4efc: ldr             x1, [fp, #0x18]
    // 0xaa4f00: r0 = call 0x647bb0
    //     0xaa4f00: bl              #0x647bb0
    // 0xaa4f04: LeaveFrame
    //     0xaa4f04: mov             SP, fp
    //     0xaa4f08: ldp             fp, lr, [SP], #0x10
    // 0xaa4f0c: ret
    //     0xaa4f0c: ret             
    // 0xaa4f10: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4f10: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4f14: b               #0xaa4eb8
  }
}
