// lib: , url: PPk

// class id: 1050155, size: 0x8
class :: {
}

// class id: 572, size: 0x34, field offset: 0x8
class Vbb extends Object {

  Map<String, dynamic> qdc(Vbb) {
    // ** addr: 0xaa2214, size: 0x48
    // 0xaa2214: EnterFrame
    //     0xaa2214: stp             fp, lr, [SP, #-0x10]!
    //     0xaa2218: mov             fp, SP
    // 0xaa221c: CheckStackOverflow
    //     0xaa221c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa2220: cmp             SP, x16
    //     0xaa2224: b.ls            #0xaa223c
    // 0xaa2228: ldr             x1, [fp, #0x10]
    // 0xaa222c: r0 = call 0x62848c
    //     0xaa222c: bl              #0x62848c
    // 0xaa2230: LeaveFrame
    //     0xaa2230: mov             SP, fp
    //     0xaa2234: ldp             fp, lr, [SP], #0x10
    // 0xaa2238: ret
    //     0xaa2238: ret             
    // 0xaa223c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa223c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa2240: b               #0xaa2228
  }
}
