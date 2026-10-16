// lib: , url: BSk

// class id: 1050279, size: 0x8
class :: {
}

// class id: 5600, size: 0x18, field offset: 0xc
abstract class Keb<X0> extends W<X0> {

  int length(Keb<X0>) {
    // ** addr: 0xaa5e30, size: 0x48
    // 0xaa5e30: ldr             x2, [SP]
    // 0xaa5e34: LoadField: r3 = r2->field_f
    //     0xaa5e34: ldur            x3, [x2, #0xf]
    // 0xaa5e38: r0 = BoxInt64Instr(r3)
    //     0xaa5e38: sbfiz           x0, x3, #1, #0x1f
    //     0xaa5e3c: cmp             x3, x0, asr #1
    //     0xaa5e40: b.eq            #0xaa5e5c
    //     0xaa5e44: stp             fp, lr, [SP, #-0x10]!
    //     0xaa5e48: mov             fp, SP
    //     0xaa5e4c: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xaa5e50: mov             SP, fp
    //     0xaa5e54: ldp             fp, lr, [SP], #0x10
    //     0xaa5e58: stur            x3, [x0, #7]
    // 0xaa5e5c: ret
    //     0xaa5e5c: ret             
  }
  X0 [](Keb<X0>, int) {
    // ** addr: 0xa6b24c, size: 0x88
    // 0xa6b24c: EnterFrame
    //     0xa6b24c: stp             fp, lr, [SP, #-0x10]!
    //     0xa6b250: mov             fp, SP
    // 0xa6b254: AllocStack(0x10)
    //     0xa6b254: sub             SP, SP, #0x10
    // 0xa6b258: CheckStackOverflow
    //     0xa6b258: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa6b25c: cmp             SP, x16
    //     0xa6b260: b.ls            #0xa6b2b4
    // 0xa6b264: ldr             x0, [fp, #0x10]
    // 0xa6b268: r2 = Null
    //     0xa6b268: mov             x2, NULL
    // 0xa6b26c: r1 = Null
    //     0xa6b26c: mov             x1, NULL
    // 0xa6b270: branchIfSmi(r0, 0xa6b298)
    //     0xa6b270: tbz             w0, #0, #0xa6b298
    // 0xa6b274: r4 = LoadClassIdInstr(r0)
    //     0xa6b274: ldur            x4, [x0, #-1]
    //     0xa6b278: ubfx            x4, x4, #0xc, #0x14
    // 0xa6b27c: sub             x4, x4, #0x3c
    // 0xa6b280: cmp             x4, #1
    // 0xa6b284: b.ls            #0xa6b298
    // 0xa6b288: r8 = int
    //     0xa6b288: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xa6b28c: r3 = Null
    //     0xa6b28c: add             x3, PP, #0x1d, lsl #12  ; [pp+0x1dc50] Null
    //     0xa6b290: ldr             x3, [x3, #0xc50]
    // 0xa6b294: r0 = int()
    //     0xa6b294: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xa6b298: ldr             x16, [fp, #0x18]
    // 0xa6b29c: ldr             lr, [fp, #0x10]
    // 0xa6b2a0: stp             lr, x16, [SP]
    // 0xa6b2a4: r0 = call 0x9b46d0
    //     0xa6b2a4: bl              #0x9b46d0
    // 0xa6b2a8: LeaveFrame
    //     0xa6b2a8: mov             SP, fp
    //     0xa6b2ac: ldp             fp, lr, [SP], #0x10
    // 0xa6b2b0: ret
    //     0xa6b2b0: ret             
    // 0xa6b2b4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa6b2b4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa6b2b8: b               #0xa6b264
  }
}

// class id: 5601, size: 0x18, field offset: 0x18
abstract class _Leb extends Keb<dynamic> {
}

// class id: 5602, size: 0x18, field offset: 0x18
class Meb extends _Leb {
}
