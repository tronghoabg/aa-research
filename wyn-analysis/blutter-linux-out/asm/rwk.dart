// lib: , url: RWk

// class id: 1050491, size: 0x8
class :: {
}

// class id: 203, size: 0x1c, field offset: 0x8
class Spb<X0, X1> extends Object {

  X1 [](Spb<X0, X1>, X0) {
    // ** addr: 0xaa5260, size: 0x4c
    // 0xaa5260: EnterFrame
    //     0xaa5260: stp             fp, lr, [SP, #-0x10]!
    //     0xaa5264: mov             fp, SP
    // 0xaa5268: CheckStackOverflow
    //     0xaa5268: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa526c: cmp             SP, x16
    //     0xaa5270: b.ls            #0xaa528c
    // 0xaa5274: ldr             x1, [fp, #0x18]
    // 0xaa5278: ldr             x2, [fp, #0x10]
    // 0xaa527c: r0 = call 0x648594
    //     0xaa527c: bl              #0x648594
    // 0xaa5280: LeaveFrame
    //     0xaa5280: mov             SP, fp
    //     0xaa5284: ldp             fp, lr, [SP], #0x10
    // 0xaa5288: ret
    //     0xaa5288: ret             
    // 0xaa528c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa528c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa5290: b               #0xaa5274
  }
}
