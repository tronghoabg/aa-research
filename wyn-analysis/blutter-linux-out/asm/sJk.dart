// lib: , url: sJk

// class id: 1049828, size: 0x8
class :: {
}

// class id: 5687, size: 0x18, field offset: 0xc
class wRa extends Iterable<dynamic>
    implements ps {

  late int data; // offset: 0x14

  num [](wRa, int) {
    // ** addr: 0xb02134, size: 0xa4
    // 0xb02134: EnterFrame
    //     0xb02134: stp             fp, lr, [SP, #-0x10]!
    //     0xb02138: mov             fp, SP
    // 0xb0213c: CheckStackOverflow
    //     0xb0213c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb02140: cmp             SP, x16
    //     0xb02144: b.ls            #0xb021b8
    // 0xb02148: ldr             x0, [fp, #0x10]
    // 0xb0214c: r2 = Null
    //     0xb0214c: mov             x2, NULL
    // 0xb02150: r1 = Null
    //     0xb02150: mov             x1, NULL
    // 0xb02154: branchIfSmi(r0, 0xb0217c)
    //     0xb02154: tbz             w0, #0, #0xb0217c
    // 0xb02158: r4 = LoadClassIdInstr(r0)
    //     0xb02158: ldur            x4, [x0, #-1]
    //     0xb0215c: ubfx            x4, x4, #0xc, #0x14
    // 0xb02160: sub             x4, x4, #0x3c
    // 0xb02164: cmp             x4, #1
    // 0xb02168: b.ls            #0xb0217c
    // 0xb0216c: r8 = int
    //     0xb0216c: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xb02170: r3 = Null
    //     0xb02170: add             x3, PP, #0x40, lsl #12  ; [pp+0x40fa0] Null
    //     0xb02174: ldr             x3, [x3, #0xfa0]
    // 0xb02178: r0 = int()
    //     0xb02178: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xb0217c: ldr             x0, [fp, #0x10]
    // 0xb02180: r2 = LoadInt32Instr(r0)
    //     0xb02180: sbfx            x2, x0, #1, #0x1f
    //     0xb02184: tbz             w0, #0, #0xb0218c
    //     0xb02188: ldur            x2, [x0, #7]
    // 0xb0218c: ldr             x1, [fp, #0x18]
    // 0xb02190: r0 = call 0x8b0300
    //     0xb02190: bl              #0x8b0300
    // 0xb02194: mov             x2, x0
    // 0xb02198: r0 = BoxInt64Instr(r2)
    //     0xb02198: sbfiz           x0, x2, #1, #0x1f
    //     0xb0219c: cmp             x2, x0, asr #1
    //     0xb021a0: b.eq            #0xb021ac
    //     0xb021a4: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xb021a8: stur            x2, [x0, #7]
    // 0xb021ac: LeaveFrame
    //     0xb021ac: mov             SP, fp
    //     0xb021b0: ldp             fp, lr, [SP], #0x10
    // 0xb021b4: ret
    //     0xb021b4: ret             
    // 0xb021b8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb021b8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb021bc: b               #0xb02148
  }
}
