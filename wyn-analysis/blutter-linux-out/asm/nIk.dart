// lib: , url: NIk

// class id: 1049797, size: 0x8
class :: {
}

// class id: 5607, size: 0x10, field offset: 0xc
abstract class SPa<X0> extends W<X0> {

  X0 [](SPa<X0>, int) {
    // ** addr: 0xa6a880, size: 0xa8
    // 0xa6a880: EnterFrame
    //     0xa6a880: stp             fp, lr, [SP, #-0x10]!
    //     0xa6a884: mov             fp, SP
    // 0xa6a888: ldr             x0, [fp, #0x10]
    // 0xa6a88c: r2 = Null
    //     0xa6a88c: mov             x2, NULL
    // 0xa6a890: r1 = Null
    //     0xa6a890: mov             x1, NULL
    // 0xa6a894: branchIfSmi(r0, 0xa6a8bc)
    //     0xa6a894: tbz             w0, #0, #0xa6a8bc
    // 0xa6a898: r4 = LoadClassIdInstr(r0)
    //     0xa6a898: ldur            x4, [x0, #-1]
    //     0xa6a89c: ubfx            x4, x4, #0xc, #0x14
    // 0xa6a8a0: sub             x4, x4, #0x3c
    // 0xa6a8a4: cmp             x4, #1
    // 0xa6a8a8: b.ls            #0xa6a8bc
    // 0xa6a8ac: r8 = int
    //     0xa6a8ac: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xa6a8b0: r3 = Null
    //     0xa6a8b0: add             x3, PP, #0x24, lsl #12  ; [pp+0x247e0] Null
    //     0xa6a8b4: ldr             x3, [x3, #0x7e0]
    // 0xa6a8b8: r0 = int()
    //     0xa6a8b8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xa6a8bc: ldr             x2, [fp, #0x18]
    // 0xa6a8c0: LoadField: r3 = r2->field_b
    //     0xa6a8c0: ldur            w3, [x2, #0xb]
    // 0xa6a8c4: DecompressPointer r3
    //     0xa6a8c4: add             x3, x3, HEAP, lsl #32
    // 0xa6a8c8: LoadField: r2 = r3->field_b
    //     0xa6a8c8: ldur            w2, [x3, #0xb]
    // 0xa6a8cc: ldr             x4, [fp, #0x10]
    // 0xa6a8d0: r5 = LoadInt32Instr(r4)
    //     0xa6a8d0: sbfx            x5, x4, #1, #0x1f
    //     0xa6a8d4: tbz             w4, #0, #0xa6a8dc
    //     0xa6a8d8: ldur            x5, [x4, #7]
    // 0xa6a8dc: r0 = LoadInt32Instr(r2)
    //     0xa6a8dc: sbfx            x0, x2, #1, #0x1f
    // 0xa6a8e0: mov             x1, x5
    // 0xa6a8e4: cmp             x1, x0
    // 0xa6a8e8: b.hs            #0xa6a90c
    // 0xa6a8ec: LoadField: r1 = r3->field_f
    //     0xa6a8ec: ldur            w1, [x3, #0xf]
    // 0xa6a8f0: DecompressPointer r1
    //     0xa6a8f0: add             x1, x1, HEAP, lsl #32
    // 0xa6a8f4: ArrayLoad: r0 = r1[r5]  ; Unknown_4
    //     0xa6a8f4: add             x16, x1, x5, lsl #2
    //     0xa6a8f8: ldur            w0, [x16, #0xf]
    // 0xa6a8fc: DecompressPointer r0
    //     0xa6a8fc: add             x0, x0, HEAP, lsl #32
    // 0xa6a900: LeaveFrame
    //     0xa6a900: mov             SP, fp
    //     0xa6a904: ldp             fp, lr, [SP], #0x10
    // 0xa6a908: ret
    //     0xa6a908: ret             
    // 0xa6a90c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xa6a90c: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
}
