// lib: , url: DNk

// class id: 1050036, size: 0x8
class :: {
}

// class id: 683, size: 0x24, field offset: 0x8
class DYa extends Object {

  int toInt(DYa) {
    // ** addr: 0xa74d7c, size: 0x60
    // 0xa74d7c: EnterFrame
    //     0xa74d7c: stp             fp, lr, [SP, #-0x10]!
    //     0xa74d80: mov             fp, SP
    // 0xa74d84: CheckStackOverflow
    //     0xa74d84: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa74d88: cmp             SP, x16
    //     0xa74d8c: b.ls            #0xa74dbc
    // 0xa74d90: ldr             x1, [fp, #0x10]
    // 0xa74d94: r0 = call 0x32cfe8
    //     0xa74d94: bl              #0x32cfe8
    // 0xa74d98: mov             x2, x0
    // 0xa74d9c: r0 = BoxInt64Instr(r2)
    //     0xa74d9c: sbfiz           x0, x2, #1, #0x1f
    //     0xa74da0: cmp             x2, x0, asr #1
    //     0xa74da4: b.eq            #0xa74db0
    //     0xa74da8: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xa74dac: stur            x2, [x0, #7]
    // 0xa74db0: LeaveFrame
    //     0xa74db0: mov             SP, fp
    //     0xa74db4: ldp             fp, lr, [SP], #0x10
    // 0xa74db8: ret
    //     0xa74db8: ret             
    // 0xa74dbc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa74dbc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa74dc0: b               #0xa74d90
  }
}
