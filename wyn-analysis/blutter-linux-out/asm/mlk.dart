// lib: , url: MLk

// class id: 1049953, size: 0x8
class :: {
}

// class id: 5654, size: 0x28, field offset: 0xc
class hVa extends Iterable<dynamic>
    implements wUa {

  num [](hVa, int) {
    // ** addr: 0xaa5190, size: 0x8c
    // 0xaa5190: EnterFrame
    //     0xaa5190: stp             fp, lr, [SP, #-0x10]!
    //     0xaa5194: mov             fp, SP
    // 0xaa5198: CheckStackOverflow
    //     0xaa5198: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa519c: cmp             SP, x16
    //     0xaa51a0: b.ls            #0xaa51fc
    // 0xaa51a4: ldr             x0, [fp, #0x10]
    // 0xaa51a8: r2 = Null
    //     0xaa51a8: mov             x2, NULL
    // 0xaa51ac: r1 = Null
    //     0xaa51ac: mov             x1, NULL
    // 0xaa51b0: branchIfSmi(r0, 0xaa51d8)
    //     0xaa51b0: tbz             w0, #0, #0xaa51d8
    // 0xaa51b4: r4 = LoadClassIdInstr(r0)
    //     0xaa51b4: ldur            x4, [x0, #-1]
    //     0xaa51b8: ubfx            x4, x4, #0xc, #0x14
    // 0xaa51bc: sub             x4, x4, #0x3c
    // 0xaa51c0: cmp             x4, #1
    // 0xaa51c4: b.ls            #0xaa51d8
    // 0xaa51c8: r8 = int
    //     0xaa51c8: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa51cc: r3 = Null
    //     0xaa51cc: add             x3, PP, #0x40, lsl #12  ; [pp+0x40a48] Null
    //     0xaa51d0: ldr             x3, [x3, #0xa48]
    // 0xaa51d4: r0 = int()
    //     0xaa51d4: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa51d8: ldr             x0, [fp, #0x10]
    // 0xaa51dc: r2 = LoadInt32Instr(r0)
    //     0xaa51dc: sbfx            x2, x0, #1, #0x1f
    //     0xaa51e0: tbz             w0, #0, #0xaa51e8
    //     0xaa51e4: ldur            x2, [x0, #7]
    // 0xaa51e8: ldr             x1, [fp, #0x18]
    // 0xaa51ec: r0 = call 0x6482c4
    //     0xaa51ec: bl              #0x6482c4
    // 0xaa51f0: LeaveFrame
    //     0xaa51f0: mov             SP, fp
    //     0xaa51f4: ldp             fp, lr, [SP], #0x10
    // 0xaa51f8: ret
    //     0xaa51f8: ret             
    // 0xaa51fc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa51fc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa5200: b               #0xaa51a4
  }
}
