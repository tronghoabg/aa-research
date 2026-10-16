// lib: , url: ALk

// class id: 1049941, size: 0x8
class :: {
}

// class id: 5665, size: 0x28, field offset: 0xc
class VUa extends Iterable<dynamic>
    implements wUa {

  num [](VUa, int) {
    // ** addr: 0xaa4b5c, size: 0x80
    // 0xaa4b5c: EnterFrame
    //     0xaa4b5c: stp             fp, lr, [SP, #-0x10]!
    //     0xaa4b60: mov             fp, SP
    // 0xaa4b64: CheckStackOverflow
    //     0xaa4b64: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa4b68: cmp             SP, x16
    //     0xaa4b6c: b.ls            #0xaa4bbc
    // 0xaa4b70: ldr             x0, [fp, #0x10]
    // 0xaa4b74: r2 = Null
    //     0xaa4b74: mov             x2, NULL
    // 0xaa4b78: r1 = Null
    //     0xaa4b78: mov             x1, NULL
    // 0xaa4b7c: branchIfSmi(r0, 0xaa4ba4)
    //     0xaa4b7c: tbz             w0, #0, #0xaa4ba4
    // 0xaa4b80: r4 = LoadClassIdInstr(r0)
    //     0xaa4b80: ldur            x4, [x0, #-1]
    //     0xaa4b84: ubfx            x4, x4, #0xc, #0x14
    // 0xaa4b88: sub             x4, x4, #0x3c
    // 0xaa4b8c: cmp             x4, #1
    // 0xaa4b90: b.ls            #0xaa4ba4
    // 0xaa4b94: r8 = int
    //     0xaa4b94: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa4b98: r3 = Null
    //     0xaa4b98: add             x3, PP, #0x40, lsl #12  ; [pp+0x40c20] Null
    //     0xaa4b9c: ldr             x3, [x3, #0xc20]
    // 0xaa4ba0: r0 = int()
    //     0xaa4ba0: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa4ba4: ldr             x1, [fp, #0x18]
    // 0xaa4ba8: ldr             x2, [fp, #0x10]
    // 0xaa4bac: r0 = call 0x97a84c
    //     0xaa4bac: bl              #0x97a84c
    // 0xaa4bb0: LeaveFrame
    //     0xaa4bb0: mov             SP, fp
    //     0xaa4bb4: ldp             fp, lr, [SP], #0x10
    // 0xaa4bb8: ret
    //     0xaa4bb8: ret             
    // 0xaa4bbc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa4bbc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa4bc0: b               #0xaa4b70
  }
}
