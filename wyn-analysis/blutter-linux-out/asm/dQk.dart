// lib: , url: dQk

// class id: 1050165, size: 0x8
class :: {
}

// class id: 565, size: 0x58, field offset: 0x8
class hcb extends Object {

  Map<String, dynamic> qdc(hcb) {
    // ** addr: 0xaa2ffc, size: 0x48
    // 0xaa2ffc: EnterFrame
    //     0xaa2ffc: stp             fp, lr, [SP, #-0x10]!
    //     0xaa3000: mov             fp, SP
    // 0xaa3004: CheckStackOverflow
    //     0xaa3004: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa3008: cmp             SP, x16
    //     0xaa300c: b.ls            #0xaa3024
    // 0xaa3010: ldr             x1, [fp, #0x10]
    // 0xaa3014: r0 = call 0x62be84
    //     0xaa3014: bl              #0x62be84
    // 0xaa3018: LeaveFrame
    //     0xaa3018: mov             SP, fp
    //     0xaa301c: ldp             fp, lr, [SP], #0x10
    // 0xaa3020: ret
    //     0xaa3020: ret             
    // 0xaa3024: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa3024: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa3028: b               #0xaa3010
  }
}

// class id: 5832, size: 0x14, field offset: 0x14
enum gcb extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
