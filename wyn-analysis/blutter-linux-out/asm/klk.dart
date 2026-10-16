// lib: , url: KLk

// class id: 1049951, size: 0x8
class :: {
}

// class id: 5656, size: 0x28, field offset: 0xc
class fVa extends Iterable<dynamic>
    implements wUa {

  num [](fVa, int) {
    // ** addr: 0xaa506c, size: 0x80
    // 0xaa506c: EnterFrame
    //     0xaa506c: stp             fp, lr, [SP, #-0x10]!
    //     0xaa5070: mov             fp, SP
    // 0xaa5074: CheckStackOverflow
    //     0xaa5074: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa5078: cmp             SP, x16
    //     0xaa507c: b.ls            #0xaa50cc
    // 0xaa5080: ldr             x0, [fp, #0x10]
    // 0xaa5084: r2 = Null
    //     0xaa5084: mov             x2, NULL
    // 0xaa5088: r1 = Null
    //     0xaa5088: mov             x1, NULL
    // 0xaa508c: branchIfSmi(r0, 0xaa50b4)
    //     0xaa508c: tbz             w0, #0, #0xaa50b4
    // 0xaa5090: r4 = LoadClassIdInstr(r0)
    //     0xaa5090: ldur            x4, [x0, #-1]
    //     0xaa5094: ubfx            x4, x4, #0xc, #0x14
    // 0xaa5098: sub             x4, x4, #0x3c
    // 0xaa509c: cmp             x4, #1
    // 0xaa50a0: b.ls            #0xaa50b4
    // 0xaa50a4: r8 = int
    //     0xaa50a4: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaa50a8: r3 = Null
    //     0xaa50a8: add             x3, PP, #0x40, lsl #12  ; [pp+0x40aa0] Null
    //     0xaa50ac: ldr             x3, [x3, #0xaa0]
    // 0xaa50b0: r0 = int()
    //     0xaa50b0: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaa50b4: ldr             x1, [fp, #0x18]
    // 0xaa50b8: ldr             x2, [fp, #0x10]
    // 0xaa50bc: r0 = call 0x97acd0
    //     0xaa50bc: bl              #0x97acd0
    // 0xaa50c0: LeaveFrame
    //     0xaa50c0: mov             SP, fp
    //     0xaa50c4: ldp             fp, lr, [SP], #0x10
    // 0xaa50c8: ret
    //     0xaa50c8: ret             
    // 0xaa50cc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa50cc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa50d0: b               #0xaa5080
  }
}
