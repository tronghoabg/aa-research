// lib: , url: CJk

// class id: 1049842, size: 0x8
class :: {
}

// class id: 961, size: 0x10, field offset: 0x8
class JRa extends Object {

  LRa? [](JRa, Object?) {
    // ** addr: 0xadbda8, size: 0xd4
    // 0xadbda8: EnterFrame
    //     0xadbda8: stp             fp, lr, [SP, #-0x10]!
    //     0xadbdac: mov             fp, SP
    // 0xadbdb0: AllocStack(0x8)
    //     0xadbdb0: sub             SP, SP, #8
    // 0xadbdb4: CheckStackOverflow
    //     0xadbdb4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadbdb8: cmp             SP, x16
    //     0xadbdbc: b.ls            #0xadbe5c
    // 0xadbdc0: ldr             x2, [fp, #0x10]
    // 0xadbdc4: r0 = 60
    //     0xadbdc4: movz            x0, #0x3c
    // 0xadbdc8: branchIfSmi(r2, 0xadbdd4)
    //     0xadbdc8: tbz             w2, #0, #0xadbdd4
    // 0xadbdcc: r0 = LoadClassIdInstr(r2)
    //     0xadbdcc: ldur            x0, [x2, #-1]
    //     0xadbdd0: ubfx            x0, x0, #0xc, #0x14
    // 0xadbdd4: sub             x16, x0, #0x5e
    // 0xadbdd8: cmp             x16, #1
    // 0xadbddc: b.hi            #0xadbdf0
    // 0xadbde0: r1 = _ConstMap len:197
    //     0xadbde0: add             x1, PP, #0x38, lsl #12  ; [pp+0x38ea0] Map<String, int>(197)
    //     0xadbde4: ldr             x1, [x1, #0xea0]
    // 0xadbde8: r0 = call 0xa04bcc
    //     0xadbde8: bl              #0xa04bcc
    // 0xadbdec: mov             x2, x0
    // 0xadbdf0: r0 = 60
    //     0xadbdf0: movz            x0, #0x3c
    // 0xadbdf4: branchIfSmi(r2, 0xadbe00)
    //     0xadbdf4: tbz             w2, #0, #0xadbe00
    // 0xadbdf8: r0 = LoadClassIdInstr(r2)
    //     0xadbdf8: ldur            x0, [x2, #-1]
    //     0xadbdfc: ubfx            x0, x0, #0xc, #0x14
    // 0xadbe00: sub             x16, x0, #0x3c
    // 0xadbe04: cmp             x16, #1
    // 0xadbe08: b.hi            #0xadbe4c
    // 0xadbe0c: ldr             x0, [fp, #0x18]
    // 0xadbe10: LoadField: r3 = r0->field_7
    //     0xadbe10: ldur            w3, [x0, #7]
    // 0xadbe14: DecompressPointer r3
    //     0xadbe14: add             x3, x3, HEAP, lsl #32
    // 0xadbe18: mov             x1, x3
    // 0xadbe1c: stur            x3, [fp, #-8]
    // 0xadbe20: r0 = call 0xa53cf4
    //     0xadbe20: bl              #0xa53cf4
    // 0xadbe24: ldur            x1, [fp, #-8]
    // 0xadbe28: LoadField: r2 = r1->field_f
    //     0xadbe28: ldur            w2, [x1, #0xf]
    // 0xadbe2c: DecompressPointer r2
    //     0xadbe2c: add             x2, x2, HEAP, lsl #32
    // 0xadbe30: cmp             w2, w0
    // 0xadbe34: b.ne            #0xadbe40
    // 0xadbe38: r1 = Null
    //     0xadbe38: mov             x1, NULL
    // 0xadbe3c: b               #0xadbe44
    // 0xadbe40: mov             x1, x0
    // 0xadbe44: mov             x0, x1
    // 0xadbe48: b               #0xadbe50
    // 0xadbe4c: r0 = Null
    //     0xadbe4c: mov             x0, NULL
    // 0xadbe50: LeaveFrame
    //     0xadbe50: mov             SP, fp
    //     0xadbe54: ldp             fp, lr, [SP], #0x10
    // 0xadbe58: ret
    //     0xadbe58: ret             
    // 0xadbe5c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadbe5c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadbe60: b               #0xadbdc0
  }
  [closure] void <anonymous closure>(dynamic, int, LRa) {
    // ** addr: 0x7705f8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, String, JRa) {
    // ** addr: 0x770584, size: -0x1
  }
}
