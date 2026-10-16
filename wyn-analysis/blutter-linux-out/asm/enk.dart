// lib: , url: ENk

// class id: 1050037, size: 0x8
class :: {
}

// class id: 682, size: 0x18, field offset: 0x8
class EYa extends Object {

  late int _tbg; // offset: 0x14
  late double _qbg; // offset: 0x8
  late double _rbg; // offset: 0xc
  late double _sbg; // offset: 0x10

  int toInt(EYa) {
    // ** addr: 0xa74df4, size: 0x44
    // 0xa74df4: ldr             x1, [SP]
    // 0xa74df8: LoadField: r0 = r1->field_13
    //     0xa74df8: ldur            w0, [x1, #0x13]
    // 0xa74dfc: DecompressPointer r0
    //     0xa74dfc: add             x0, x0, HEAP, lsl #32
    // 0xa74e00: r16 = Sentinel
    //     0xa74e00: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xa74e04: cmp             w0, w16
    // 0xa74e08: b.eq            #0xa74e10
    // 0xa74e0c: ret
    //     0xa74e0c: ret             
    // 0xa74e10: EnterFrame
    //     0xa74e10: stp             fp, lr, [SP, #-0x10]!
    //     0xa74e14: mov             fp, SP
    // 0xa74e18: r9 = _tbg
    //     0xa74e18: ldr             x9, [PP, #0x60c0]  ; [pp+0x60c0] Field <EYa._tbg@1141004467>: late (offset: 0x14)
    // 0xa74e1c: r0 = LateInitializationErrorSharedWithoutFPURegs()
    //     0xa74e1c: bl              #0xb2a470  ; LateInitializationErrorSharedWithoutFPURegsStub
  }
}
