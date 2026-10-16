// lib: , url: BJk

// class id: 1049841, size: 0x8
class :: {
}

// class id: 964, size: 0xc, field offset: 0x8
class GRa extends Object {

  JRa [](GRa, String) {
    // ** addr: 0xadbfa8, size: 0x84
    // 0xadbfa8: EnterFrame
    //     0xadbfa8: stp             fp, lr, [SP, #-0x10]!
    //     0xadbfac: mov             fp, SP
    // 0xadbfb0: CheckStackOverflow
    //     0xadbfb0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadbfb4: cmp             SP, x16
    //     0xadbfb8: b.ls            #0xadc00c
    // 0xadbfbc: ldr             x0, [fp, #0x10]
    // 0xadbfc0: r2 = Null
    //     0xadbfc0: mov             x2, NULL
    // 0xadbfc4: r1 = Null
    //     0xadbfc4: mov             x1, NULL
    // 0xadbfc8: r4 = 60
    //     0xadbfc8: movz            x4, #0x3c
    // 0xadbfcc: branchIfSmi(r0, 0xadbfd8)
    //     0xadbfcc: tbz             w0, #0, #0xadbfd8
    // 0xadbfd0: r4 = LoadClassIdInstr(r0)
    //     0xadbfd0: ldur            x4, [x0, #-1]
    //     0xadbfd4: ubfx            x4, x4, #0xc, #0x14
    // 0xadbfd8: sub             x4, x4, #0x5e
    // 0xadbfdc: cmp             x4, #1
    // 0xadbfe0: b.ls            #0xadbff4
    // 0xadbfe4: r8 = String
    //     0xadbfe4: ldr             x8, [PP, #0xa10]  ; [pp+0xa10] Type: String
    // 0xadbfe8: r3 = Null
    //     0xadbfe8: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3ebc8] Null
    //     0xadbfec: ldr             x3, [x3, #0xbc8]
    // 0xadbff0: r0 = String()
    //     0xadbff0: bl              #0xb2f430  ; IsType_String_Stub
    // 0xadbff4: ldr             x1, [fp, #0x18]
    // 0xadbff8: ldr             x2, [fp, #0x10]
    // 0xadbffc: r0 = call 0x770678
    //     0xadbffc: bl              #0x770678
    // 0xadc000: LeaveFrame
    //     0xadc000: mov             SP, fp
    //     0xadc004: ldp             fp, lr, [SP], #0x10
    // 0xadc008: ret
    //     0xadc008: ret             
    // 0xadc00c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadc00c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadc010: b               #0xadbfbc
  }
  [closure] void <anonymous closure>(dynamic, String, JRa) {
    // ** addr: 0x77035c, size: -0x1
  }
}
