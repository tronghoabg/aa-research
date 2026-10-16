// lib: , url: rHk

// class id: 1049731, size: 0x8
class :: {
}

// class id: 1150, size: 0x6c, field offset: 0x5c
//   const constructor, 
class WMa extends XMa {

  Map<String, dynamic> qdc(WMa) {
    // ** addr: 0xb16910, size: 0x48
    // 0xb16910: EnterFrame
    //     0xb16910: stp             fp, lr, [SP, #-0x10]!
    //     0xb16914: mov             fp, SP
    // 0xb16918: CheckStackOverflow
    //     0xb16918: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb1691c: cmp             SP, x16
    //     0xb16920: b.ls            #0xb16938
    // 0xb16924: ldr             x1, [fp, #0x10]
    // 0xb16928: r0 = call 0x9c42d0
    //     0xb16928: bl              #0x9c42d0
    // 0xb1692c: LeaveFrame
    //     0xb1692c: mov             SP, fp
    //     0xb16930: ldp             fp, lr, [SP], #0x10
    // 0xb16934: ret
    //     0xb16934: ret             
    // 0xb16938: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb16938: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb1693c: b               #0xb16924
  }
}
