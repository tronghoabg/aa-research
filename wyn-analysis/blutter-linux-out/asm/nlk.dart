// lib: , url: NLk

// class id: 1049954, size: 0x8
class :: {
}

// class id: 5653, size: 0xc, field offset: 0xc
class iVa extends Iterable<dynamic>
    implements wUa {

  static late final JUa EWg; // offset: 0x11d8

  num [](iVa, int) {
    // ** addr: 0xadbd38, size: 0x64
    // 0xadbd38: EnterFrame
    //     0xadbd38: stp             fp, lr, [SP, #-0x10]!
    //     0xadbd3c: mov             fp, SP
    // 0xadbd40: ldr             x0, [fp, #0x10]
    // 0xadbd44: r2 = Null
    //     0xadbd44: mov             x2, NULL
    // 0xadbd48: r1 = Null
    //     0xadbd48: mov             x1, NULL
    // 0xadbd4c: branchIfSmi(r0, 0xadbd74)
    //     0xadbd4c: tbz             w0, #0, #0xadbd74
    // 0xadbd50: r4 = LoadClassIdInstr(r0)
    //     0xadbd50: ldur            x4, [x0, #-1]
    //     0xadbd54: ubfx            x4, x4, #0xc, #0x14
    // 0xadbd58: sub             x4, x4, #0x3c
    // 0xadbd5c: cmp             x4, #1
    // 0xadbd60: b.ls            #0xadbd74
    // 0xadbd64: r8 = int
    //     0xadbd64: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadbd68: r3 = Null
    //     0xadbd68: add             x3, PP, #0x3d, lsl #12  ; [pp+0x3d1e0] Null
    //     0xadbd6c: ldr             x3, [x3, #0x1e0]
    // 0xadbd70: r0 = int()
    //     0xadbd70: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadbd74: r0 = 0
    //     0xadbd74: movz            x0, #0
    // 0xadbd78: LeaveFrame
    //     0xadbd78: mov             SP, fp
    //     0xadbd7c: ldp             fp, lr, [SP], #0x10
    // 0xadbd80: ret
    //     0xadbd80: ret             
  }
}
