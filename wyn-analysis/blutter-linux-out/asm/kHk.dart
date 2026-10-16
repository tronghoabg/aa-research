// lib: , url: KHk

// class id: 1049750, size: 0x8
class :: {
}

// class id: 1149, size: 0x5c, field offset: 0x8
//   const constructor, 
class XMa extends Object {

  Map<String, dynamic> qdc(XMa) {
    // ** addr: 0xa785b0, size: 0x48
    // 0xa785b0: EnterFrame
    //     0xa785b0: stp             fp, lr, [SP, #-0x10]!
    //     0xa785b4: mov             fp, SP
    // 0xa785b8: CheckStackOverflow
    //     0xa785b8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa785bc: cmp             SP, x16
    //     0xa785c0: b.ls            #0xa785d8
    // 0xa785c4: ldr             x1, [fp, #0x10]
    // 0xa785c8: r0 = call 0x342948
    //     0xa785c8: bl              #0x342948
    // 0xa785cc: LeaveFrame
    //     0xa785cc: mov             SP, fp
    //     0xa785d0: ldp             fp, lr, [SP], #0x10
    // 0xa785d4: ret
    //     0xa785d4: ret             
    // 0xa785d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa785d8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa785dc: b               #0xa785c4
  }
}
