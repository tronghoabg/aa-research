// lib: , url: JLk

// class id: 1049950, size: 0x8
class :: {
}

// class id: 5657, size: 0x38, field offset: 0xc
class eVa extends Iterable<dynamic>
    implements wUa {

  num [](eVa, int) {
    // ** addr: 0xaa4fd4, size: 0x8c
    // 0xaa4fd4: EnterFrame
    //     0xaa4fd4: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4fd8: mov             fp, SP
    // 0xaa4fdc: CheckStackOverflow
    //     0xaa4fdc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4fe0: cmp             SP, x16
    //     0xaa4fe4: b.ls            #0xaa5040
    // 0xaa4fe8: ldr             x0, [fp, #0x10]
    // 0xaa4fec: r2 = Null
    //     0xaa4fec: mov             x2, NULL
    // 0xaa4ff0: r1 = Null
    //     0xaa4ff0: mov             x1, NULL
    // 0xaa4ff4: branchIfSmi(r0, 0xaa501c)
    //     0xaa4ff4: tbz             w0, #0, #0xaa501c
    // 0xaa4ff8: r4 = LoadClassIdInstr(r0)
    //     0xaa4ff8: ldur            x4, [x0, #-1]
    //     0xaa4ffc: ubfx            x4, x4, #0xc, #0x14
    // 0xaa5000: sub             x4, x4, #0x3c
    // 0xaa5004: cmp             x4, #1
    // 0xaa5008: b.ls            #0xaa501c
    // 0xaa500c: r8 = int
    //     0xaa500c: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa5010: r3 = Null
    //     0xaa5010: add             x3, PP, #0x40, lsl #12  ; [pp+0x40ac8] Null
    //     0xaa5014: ldr             x3, [x3, #0xac8]
    // 0xaa5018: r0 = int()
    //     0xaa5018: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa501c: ldr             x0, [fp, #0x10]
    // 0xaa5020: r2 = LoadInt32Instr(r0)
    //     0xaa5020: sbfx            x2, x0, #1, #0x1f
    //     0xaa5024: tbz             w0, #0, #0xaa502c
    //     0xaa5028: ldur            x2, [x0, #7]
    // 0xaa502c: ldr             x1, [fp, #0x18]
    // 0xaa5030: r0 = call 0x647ed4
    //     0xaa5030: bl              #0x647ed4
    // 0xaa5034: LeaveFrame
    //     0xaa5034: mov             SP, fp
    //     0xaa5038: ldp             fp, lr, [SP], #0x10
    // 0xaa503c: ret
    //     0xaa503c: ret             
    // 0xaa5040: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa5040: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa5044: b               #0xaa4fe8
  }
}
