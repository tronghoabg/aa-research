// lib: , url: HMk

// class id: 1049988, size: 0x8
class :: {
}

// class id: 801, size: 0x14, field offset: 0x8
class PVa extends Object {

  Map<String, dynamic> qdc(PVa) {
    // ** addr: 0xae1db0, size: 0x48
    // 0xae1db0: EnterFrame
    //     0xae1db0: stp             fp, lr, [SP, #-0x10]!
    //     0xae1db4: mov             fp, SP
    // 0xae1db8: CheckStackOverflow
    //     0xae1db8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae1dbc: cmp             SP, x16
    //     0xae1dc0: b.ls            #0xae1dd8
    // 0xae1dc4: ldr             x1, [fp, #0x10]
    // 0xae1dc8: r0 = call 0x7a16e4
    //     0xae1dc8: bl              #0x7a16e4
    // 0xae1dcc: LeaveFrame
    //     0xae1dcc: mov             SP, fp
    //     0xae1dd0: ldp             fp, lr, [SP], #0x10
    // 0xae1dd4: ret
    //     0xae1dd4: ret             
    // 0xae1dd8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae1dd8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae1ddc: b               #0xae1dc4
  }
}

// class id: 802, size: 0x8, field offset: 0x8
abstract class NB extends Object {

  static late NB vIf; // offset: 0x1240
}
