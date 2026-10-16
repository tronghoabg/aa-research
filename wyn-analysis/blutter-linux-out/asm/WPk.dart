// lib: , url: WPk

// class id: 1050161, size: 0x8
class :: {
}

// class id: 568, size: 0x10, field offset: 0x8
//   const constructor, 
class ccb extends Object {

  Map<String, dynamic> qdc(ccb) {
    // ** addr: 0xaa2568, size: 0x48
    // 0xaa2568: EnterFrame
    //     0xaa2568: stp             fp, lr, [SP, #-0x10]!
    //     0xaa256c: mov             fp, SP
    // 0xaa2570: CheckStackOverflow
    //     0xaa2570: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa2574: cmp             SP, x16
    //     0xaa2578: b.ls            #0xaa2590
    // 0xaa257c: ldr             x1, [fp, #0x10]
    // 0xaa2580: r0 = call 0x629870
    //     0xaa2580: bl              #0x629870
    // 0xaa2584: LeaveFrame
    //     0xaa2584: mov             SP, fp
    //     0xaa2588: ldp             fp, lr, [SP], #0x10
    // 0xaa258c: ret
    //     0xaa258c: ret             
    // 0xaa2590: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa2590: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa2594: b               #0xaa257c
  }
}

// class id: 569, size: 0x30, field offset: 0x8
//   const constructor, 
class bcb extends Object {

  Map<String, dynamic> qdc(bcb) {
    // ** addr: 0xaa246c, size: 0x48
    // 0xaa246c: EnterFrame
    //     0xaa246c: stp             fp, lr, [SP, #-0x10]!
    //     0xaa2470: mov             fp, SP
    // 0xaa2474: CheckStackOverflow
    //     0xaa2474: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa2478: cmp             SP, x16
    //     0xaa247c: b.ls            #0xaa2494
    // 0xaa2480: ldr             x1, [fp, #0x10]
    // 0xaa2484: r0 = call 0x628d4c
    //     0xaa2484: bl              #0x628d4c
    // 0xaa2488: LeaveFrame
    //     0xaa2488: mov             SP, fp
    //     0xaa248c: ldp             fp, lr, [SP], #0x10
    // 0xaa2490: ret
    //     0xaa2490: ret             
    // 0xaa2494: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa2494: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa2498: b               #0xaa2480
  }
}
