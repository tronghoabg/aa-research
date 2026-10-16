// lib: , url: hQk

// class id: 1050167, size: 0x8
class :: {
}

// class id: 563, size: 0x18, field offset: 0x8
//   const constructor, 
class jcb extends Object {

  Map<String, dynamic> qdc(jcb) {
    // ** addr: 0xaa2ad8, size: 0x48
    // 0xaa2ad8: EnterFrame
    //     0xaa2ad8: stp             fp, lr, [SP, #-0x10]!
    //     0xaa2adc: mov             fp, SP
    // 0xaa2ae0: CheckStackOverflow
    //     0xaa2ae0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa2ae4: cmp             SP, x16
    //     0xaa2ae8: b.ls            #0xaa2b00
    // 0xaa2aec: ldr             x1, [fp, #0x10]
    // 0xaa2af0: r0 = call 0x62af78
    //     0xaa2af0: bl              #0x62af78
    // 0xaa2af4: LeaveFrame
    //     0xaa2af4: mov             SP, fp
    //     0xaa2af8: ldp             fp, lr, [SP], #0x10
    // 0xaa2afc: ret
    //     0xaa2afc: ret             
    // 0xaa2b00: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa2b00: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa2b04: b               #0xaa2aec
  }
}
