// lib: , url: YPk

// class id: 1050162, size: 0x8
class :: {
}

// class id: 567, size: 0x24, field offset: 0x8
class dcb extends Object {

  Map<String, dynamic> qdc(dcb) {
    // ** addr: 0xaa24b4, size: 0x48
    // 0xaa24b4: EnterFrame
    //     0xaa24b4: stp             fp, lr, [SP, #-0x10]!
    //     0xaa24b8: mov             fp, SP
    // 0xaa24bc: CheckStackOverflow
    //     0xaa24bc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa24c0: cmp             SP, x16
    //     0xaa24c4: b.ls            #0xaa24dc
    // 0xaa24c8: ldr             x1, [fp, #0x10]
    // 0xaa24cc: r0 = call 0x628f48
    //     0xaa24cc: bl              #0x628f48
    // 0xaa24d0: LeaveFrame
    //     0xaa24d0: mov             SP, fp
    //     0xaa24d4: ldp             fp, lr, [SP], #0x10
    // 0xaa24d8: ret
    //     0xaa24d8: ret             
    // 0xaa24dc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa24dc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa24e0: b               #0xaa24c8
  }
}
