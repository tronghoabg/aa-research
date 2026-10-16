// lib: , url: QUk

// class id: 1050386, size: 0x8
class :: {
}

// class id: 244, size: 0x24, field offset: 0x8
class zkb extends Object {

  Map<String, dynamic> qdc(zkb) {
    // ** addr: 0xad9854, size: 0x48
    // 0xad9854: EnterFrame
    //     0xad9854: stp             fp, lr, [SP, #-0x10]!
    //     0xad9858: mov             fp, SP
    // 0xad985c: CheckStackOverflow
    //     0xad985c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad9860: cmp             SP, x16
    //     0xad9864: b.ls            #0xad987c
    // 0xad9868: ldr             x1, [fp, #0x10]
    // 0xad986c: r0 = call 0x755e44
    //     0xad986c: bl              #0x755e44
    // 0xad9870: LeaveFrame
    //     0xad9870: mov             SP, fp
    //     0xad9874: ldp             fp, lr, [SP], #0x10
    // 0xad9878: ret
    //     0xad9878: ret             
    // 0xad987c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad987c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad9880: b               #0xad9868
  }
  [closure] Map<String, dynamic> <anonymous closure>(dynamic, ykb) {
    // ** addr: 0x756100, size: -0x1
  }
  [closure] static ykb <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x756590, size: -0x1
  }
}

// class id: 245, size: 0x2c, field offset: 0x8
class ykb extends Object {

  Map<String, dynamic> qdc(ykb) {
    // ** addr: 0xad88ec, size: 0x48
    // 0xad88ec: EnterFrame
    //     0xad88ec: stp             fp, lr, [SP, #-0x10]!
    //     0xad88f0: mov             fp, SP
    // 0xad88f4: CheckStackOverflow
    //     0xad88f4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad88f8: cmp             SP, x16
    //     0xad88fc: b.ls            #0xad8914
    // 0xad8900: ldr             x1, [fp, #0x10]
    // 0xad8904: r0 = call 0x7558f8
    //     0xad8904: bl              #0x7558f8
    // 0xad8908: LeaveFrame
    //     0xad8908: mov             SP, fp
    //     0xad890c: ldp             fp, lr, [SP], #0x10
    // 0xad8910: ret
    //     0xad8910: ret             
    // 0xad8914: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad8914: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad8918: b               #0xad8900
  }
}

// class id: 2728, size: 0x38, field offset: 0x24
class Akb extends mJ {

  [closure] zkb <anonymous closure>(dynamic, Lx<Map<String, dynamic>>, Kx?) {
    // ** addr: 0x756160, size: -0x1
  }
  [closure] Map<String, dynamic> <anonymous closure>(dynamic, zkb, Hy?) {
    // ** addr: 0x756130, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, void) {
    // ** addr: 0x755dac, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object?, Ia) {
    // ** addr: 0x755d10, size: -0x1
  }
}
