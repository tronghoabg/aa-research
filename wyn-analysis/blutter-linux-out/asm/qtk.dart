// lib: pXk, url: QTk

// class id: 1050342, size: 0x8
class :: {
}

// class id: 312, size: 0xc, field offset: 0x8
class Qhb extends Object
    implements Phb {

  Qhb +(Qhb, Qhb) {
    // ** addr: 0xa84710, size: 0x84
    // 0xa84710: EnterFrame
    //     0xa84710: stp             fp, lr, [SP, #-0x10]!
    //     0xa84714: mov             fp, SP
    // 0xa84718: CheckStackOverflow
    //     0xa84718: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa8471c: cmp             SP, x16
    //     0xa84720: b.ls            #0xa84774
    // 0xa84724: ldr             x0, [fp, #0x10]
    // 0xa84728: r2 = Null
    //     0xa84728: mov             x2, NULL
    // 0xa8472c: r1 = Null
    //     0xa8472c: mov             x1, NULL
    // 0xa84730: r4 = 60
    //     0xa84730: movz            x4, #0x3c
    // 0xa84734: branchIfSmi(r0, 0xa84740)
    //     0xa84734: tbz             w0, #0, #0xa84740
    // 0xa84738: r4 = LoadClassIdInstr(r0)
    //     0xa84738: ldur            x4, [x0, #-1]
    //     0xa8473c: ubfx            x4, x4, #0xc, #0x14
    // 0xa84740: cmp             x4, #0x138
    // 0xa84744: b.eq            #0xa8475c
    // 0xa84748: r8 = Qhb
    //     0xa84748: add             x8, PP, #0x26, lsl #12  ; [pp+0x26ad8] Type: Qhb
    //     0xa8474c: ldr             x8, [x8, #0xad8]
    // 0xa84750: r3 = Null
    //     0xa84750: add             x3, PP, #0x26, lsl #12  ; [pp+0x26ae0] Null
    //     0xa84754: ldr             x3, [x3, #0xae0]
    // 0xa84758: r0 = DefaultTypeTest()
    //     0xa84758: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa8475c: ldr             x1, [fp, #0x18]
    // 0xa84760: ldr             x2, [fp, #0x10]
    // 0xa84764: r0 = call 0x3a02f0
    //     0xa84764: bl              #0x3a02f0
    // 0xa84768: LeaveFrame
    //     0xa84768: mov             SP, fp
    //     0xa8476c: ldp             fp, lr, [SP], #0x10
    // 0xa84770: ret
    //     0xa84770: ret             
    // 0xa84774: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa84774: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa84778: b               #0xa84724
  }
  Qhb *(Qhb, double) {
    // ** addr: 0xa84794, size: 0x50
    // 0xa84794: EnterFrame
    //     0xa84794: stp             fp, lr, [SP, #-0x10]!
    //     0xa84798: mov             fp, SP
    // 0xa8479c: CheckStackOverflow
    //     0xa8479c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa847a0: cmp             SP, x16
    //     0xa847a4: b.ls            #0xa847c4
    // 0xa847a8: ldr             x0, [fp, #0x10]
    // 0xa847ac: LoadField: d0 = r0->field_7
    //     0xa847ac: ldur            d0, [x0, #7]
    // 0xa847b0: ldr             x1, [fp, #0x18]
    // 0xa847b4: r0 = call 0x3a04e4
    //     0xa847b4: bl              #0x3a04e4
    // 0xa847b8: LeaveFrame
    //     0xa847b8: mov             SP, fp
    //     0xa847bc: ldp             fp, lr, [SP], #0x10
    // 0xa847c0: ret
    //     0xa847c0: ret             
    // 0xa847c4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa847c4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa847c8: b               #0xa847a8
  }
  Qhb -(Qhb, Qhb) {
    // ** addr: 0xa847e4, size: 0x84
    // 0xa847e4: EnterFrame
    //     0xa847e4: stp             fp, lr, [SP, #-0x10]!
    //     0xa847e8: mov             fp, SP
    // 0xa847ec: CheckStackOverflow
    //     0xa847ec: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa847f0: cmp             SP, x16
    //     0xa847f4: b.ls            #0xa84848
    // 0xa847f8: ldr             x0, [fp, #0x10]
    // 0xa847fc: r2 = Null
    //     0xa847fc: mov             x2, NULL
    // 0xa84800: r1 = Null
    //     0xa84800: mov             x1, NULL
    // 0xa84804: r4 = 60
    //     0xa84804: movz            x4, #0x3c
    // 0xa84808: branchIfSmi(r0, 0xa84814)
    //     0xa84808: tbz             w0, #0, #0xa84814
    // 0xa8480c: r4 = LoadClassIdInstr(r0)
    //     0xa8480c: ldur            x4, [x0, #-1]
    //     0xa84810: ubfx            x4, x4, #0xc, #0x14
    // 0xa84814: cmp             x4, #0x138
    // 0xa84818: b.eq            #0xa84830
    // 0xa8481c: r8 = Qhb
    //     0xa8481c: add             x8, PP, #0x26, lsl #12  ; [pp+0x26ad8] Type: Qhb
    //     0xa84820: ldr             x8, [x8, #0xad8]
    // 0xa84824: r3 = Null
    //     0xa84824: add             x3, PP, #0x26, lsl #12  ; [pp+0x26af0] Null
    //     0xa84828: ldr             x3, [x3, #0xaf0]
    // 0xa8482c: r0 = DefaultTypeTest()
    //     0xa8482c: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa84830: ldr             x1, [fp, #0x18]
    // 0xa84834: ldr             x2, [fp, #0x10]
    // 0xa84838: r0 = call 0x3a05b4
    //     0xa84838: bl              #0x3a05b4
    // 0xa8483c: LeaveFrame
    //     0xa8483c: mov             SP, fp
    //     0xa84840: ldp             fp, lr, [SP], #0x10
    // 0xa84844: ret
    //     0xa84844: ret             
    // 0xa84848: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa84848: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa8484c: b               #0xa847f8
  }
  double [](Qhb, int) {
    // ** addr: 0xa84868, size: 0xd4
    // 0xa84868: EnterFrame
    //     0xa84868: stp             fp, lr, [SP, #-0x10]!
    //     0xa8486c: mov             fp, SP
    // 0xa84870: ldr             x0, [fp, #0x10]
    // 0xa84874: r2 = Null
    //     0xa84874: mov             x2, NULL
    // 0xa84878: r1 = Null
    //     0xa84878: mov             x1, NULL
    // 0xa8487c: branchIfSmi(r0, 0xa848a4)
    //     0xa8487c: tbz             w0, #0, #0xa848a4
    // 0xa84880: r4 = LoadClassIdInstr(r0)
    //     0xa84880: ldur            x4, [x0, #-1]
    //     0xa84884: ubfx            x4, x4, #0xc, #0x14
    // 0xa84888: sub             x4, x4, #0x3c
    // 0xa8488c: cmp             x4, #1
    // 0xa84890: b.ls            #0xa848a4
    // 0xa84894: r8 = int
    //     0xa84894: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xa84898: r3 = Null
    //     0xa84898: add             x3, PP, #0xf, lsl #12  ; [pp+0xfc50] Null
    //     0xa8489c: ldr             x3, [x3, #0xc50]
    // 0xa848a0: r0 = int()
    //     0xa848a0: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xa848a4: ldr             x2, [fp, #0x18]
    // 0xa848a8: LoadField: r3 = r2->field_7
    //     0xa848a8: ldur            w3, [x2, #7]
    // 0xa848ac: DecompressPointer r3
    //     0xa848ac: add             x3, x3, HEAP, lsl #32
    // 0xa848b0: LoadField: r2 = r3->field_13
    //     0xa848b0: ldur            w2, [x3, #0x13]
    // 0xa848b4: ldr             x4, [fp, #0x10]
    // 0xa848b8: r5 = LoadInt32Instr(r4)
    //     0xa848b8: sbfx            x5, x4, #1, #0x1f
    //     0xa848bc: tbz             w4, #0, #0xa848c4
    //     0xa848c0: ldur            x5, [x4, #7]
    // 0xa848c4: r0 = LoadInt32Instr(r2)
    //     0xa848c4: sbfx            x0, x2, #1, #0x1f
    // 0xa848c8: mov             x1, x5
    // 0xa848cc: cmp             x1, x0
    // 0xa848d0: b.hs            #0xa84910
    // 0xa848d4: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xa848d4: add             x16, x3, x5, lsl #3
    //     0xa848d8: ldur            d0, [x16, #0x17]
    // 0xa848dc: r0 = inline_Allocate_Double()
    //     0xa848dc: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xa848e0: add             x0, x0, #0x10
    //     0xa848e4: cmp             x1, x0
    //     0xa848e8: b.ls            #0xa84914
    //     0xa848ec: str             x0, [THR, #0x50]  ; THR::top
    //     0xa848f0: sub             x0, x0, #0xf
    //     0xa848f4: movz            x1, #0xe15c
    //     0xa848f8: movk            x1, #0x3, lsl #16
    //     0xa848fc: stur            x1, [x0, #-1]
    // 0xa84900: StoreField: r0->field_7 = d0
    //     0xa84900: stur            d0, [x0, #7]
    // 0xa84904: LeaveFrame
    //     0xa84904: mov             SP, fp
    //     0xa84908: ldp             fp, lr, [SP], #0x10
    // 0xa8490c: ret
    //     0xa8490c: ret             
    // 0xa84910: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xa84910: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xa84914: SaveReg d0
    //     0xa84914: str             q0, [SP, #-0x10]!
    // 0xa84918: r0 = AllocateDouble()
    //     0xa84918: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xa8491c: RestoreReg d0
    //     0xa8491c: ldr             q0, [SP], #0x10
    // 0xa84920: b               #0xa84900
  }
}

// class id: 313, size: 0xc, field offset: 0x8
class pO extends Object
    implements Phb {

  pO +(pO, pO) {
    // ** addr: 0xa82058, size: 0x84
    // 0xa82058: EnterFrame
    //     0xa82058: stp             fp, lr, [SP, #-0x10]!
    //     0xa8205c: mov             fp, SP
    // 0xa82060: CheckStackOverflow
    //     0xa82060: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa82064: cmp             SP, x16
    //     0xa82068: b.ls            #0xa820bc
    // 0xa8206c: ldr             x0, [fp, #0x10]
    // 0xa82070: r2 = Null
    //     0xa82070: mov             x2, NULL
    // 0xa82074: r1 = Null
    //     0xa82074: mov             x1, NULL
    // 0xa82078: r4 = 60
    //     0xa82078: movz            x4, #0x3c
    // 0xa8207c: branchIfSmi(r0, 0xa82088)
    //     0xa8207c: tbz             w0, #0, #0xa82088
    // 0xa82080: r4 = LoadClassIdInstr(r0)
    //     0xa82080: ldur            x4, [x0, #-1]
    //     0xa82084: ubfx            x4, x4, #0xc, #0x14
    // 0xa82088: cmp             x4, #0x139
    // 0xa8208c: b.eq            #0xa820a4
    // 0xa82090: r8 = pO
    //     0xa82090: add             x8, PP, #0x26, lsl #12  ; [pp+0x26b38] Type: pO
    //     0xa82094: ldr             x8, [x8, #0xb38]
    // 0xa82098: r3 = Null
    //     0xa82098: add             x3, PP, #0x26, lsl #12  ; [pp+0x26b40] Null
    //     0xa8209c: ldr             x3, [x3, #0xb40]
    // 0xa820a0: r0 = DefaultTypeTest()
    //     0xa820a0: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa820a4: ldr             x1, [fp, #0x18]
    // 0xa820a8: ldr             x2, [fp, #0x10]
    // 0xa820ac: r0 = call 0x36a780
    //     0xa820ac: bl              #0x36a780
    // 0xa820b0: LeaveFrame
    //     0xa820b0: mov             SP, fp
    //     0xa820b4: ldp             fp, lr, [SP], #0x10
    // 0xa820b8: ret
    //     0xa820b8: ret             
    // 0xa820bc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa820bc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa820c0: b               #0xa8206c
  }
  pO *(pO, double) {
    // ** addr: 0xa820dc, size: 0x50
    // 0xa820dc: EnterFrame
    //     0xa820dc: stp             fp, lr, [SP, #-0x10]!
    //     0xa820e0: mov             fp, SP
    // 0xa820e4: CheckStackOverflow
    //     0xa820e4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa820e8: cmp             SP, x16
    //     0xa820ec: b.ls            #0xa8210c
    // 0xa820f0: ldr             x0, [fp, #0x10]
    // 0xa820f4: LoadField: d0 = r0->field_7
    //     0xa820f4: ldur            d0, [x0, #7]
    // 0xa820f8: ldr             x1, [fp, #0x18]
    // 0xa820fc: r0 = call 0x36a960
    //     0xa820fc: bl              #0x36a960
    // 0xa82100: LeaveFrame
    //     0xa82100: mov             SP, fp
    //     0xa82104: ldp             fp, lr, [SP], #0x10
    // 0xa82108: ret
    //     0xa82108: ret             
    // 0xa8210c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa8210c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa82110: b               #0xa820f0
  }
  pO -(pO, pO) {
    // ** addr: 0xa8212c, size: 0x84
    // 0xa8212c: EnterFrame
    //     0xa8212c: stp             fp, lr, [SP, #-0x10]!
    //     0xa82130: mov             fp, SP
    // 0xa82134: CheckStackOverflow
    //     0xa82134: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa82138: cmp             SP, x16
    //     0xa8213c: b.ls            #0xa82190
    // 0xa82140: ldr             x0, [fp, #0x10]
    // 0xa82144: r2 = Null
    //     0xa82144: mov             x2, NULL
    // 0xa82148: r1 = Null
    //     0xa82148: mov             x1, NULL
    // 0xa8214c: r4 = 60
    //     0xa8214c: movz            x4, #0x3c
    // 0xa82150: branchIfSmi(r0, 0xa8215c)
    //     0xa82150: tbz             w0, #0, #0xa8215c
    // 0xa82154: r4 = LoadClassIdInstr(r0)
    //     0xa82154: ldur            x4, [x0, #-1]
    //     0xa82158: ubfx            x4, x4, #0xc, #0x14
    // 0xa8215c: cmp             x4, #0x139
    // 0xa82160: b.eq            #0xa82178
    // 0xa82164: r8 = pO
    //     0xa82164: add             x8, PP, #0x26, lsl #12  ; [pp+0x26b38] Type: pO
    //     0xa82168: ldr             x8, [x8, #0xb38]
    // 0xa8216c: r3 = Null
    //     0xa8216c: add             x3, PP, #0x26, lsl #12  ; [pp+0x26b50] Null
    //     0xa82170: ldr             x3, [x3, #0xb50]
    // 0xa82174: r0 = DefaultTypeTest()
    //     0xa82174: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa82178: ldr             x1, [fp, #0x18]
    // 0xa8217c: ldr             x2, [fp, #0x10]
    // 0xa82180: r0 = call 0x36a9e4
    //     0xa82180: bl              #0x36a9e4
    // 0xa82184: LeaveFrame
    //     0xa82184: mov             SP, fp
    //     0xa82188: ldp             fp, lr, [SP], #0x10
    // 0xa8218c: ret
    //     0xa8218c: ret             
    // 0xa82190: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa82190: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa82194: b               #0xa82140
  }
  double [](pO, int) {
    // ** addr: 0xa821b0, size: 0xd4
    // 0xa821b0: EnterFrame
    //     0xa821b0: stp             fp, lr, [SP, #-0x10]!
    //     0xa821b4: mov             fp, SP
    // 0xa821b8: ldr             x0, [fp, #0x10]
    // 0xa821bc: r2 = Null
    //     0xa821bc: mov             x2, NULL
    // 0xa821c0: r1 = Null
    //     0xa821c0: mov             x1, NULL
    // 0xa821c4: branchIfSmi(r0, 0xa821ec)
    //     0xa821c4: tbz             w0, #0, #0xa821ec
    // 0xa821c8: r4 = LoadClassIdInstr(r0)
    //     0xa821c8: ldur            x4, [x0, #-1]
    //     0xa821cc: ubfx            x4, x4, #0xc, #0x14
    // 0xa821d0: sub             x4, x4, #0x3c
    // 0xa821d4: cmp             x4, #1
    // 0xa821d8: b.ls            #0xa821ec
    // 0xa821dc: r8 = int
    //     0xa821dc: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xa821e0: r3 = Null
    //     0xa821e0: add             x3, PP, #0xc, lsl #12  ; [pp+0xcc60] Null
    //     0xa821e4: ldr             x3, [x3, #0xc60]
    // 0xa821e8: r0 = int()
    //     0xa821e8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xa821ec: ldr             x2, [fp, #0x18]
    // 0xa821f0: LoadField: r3 = r2->field_7
    //     0xa821f0: ldur            w3, [x2, #7]
    // 0xa821f4: DecompressPointer r3
    //     0xa821f4: add             x3, x3, HEAP, lsl #32
    // 0xa821f8: LoadField: r2 = r3->field_13
    //     0xa821f8: ldur            w2, [x3, #0x13]
    // 0xa821fc: ldr             x4, [fp, #0x10]
    // 0xa82200: r5 = LoadInt32Instr(r4)
    //     0xa82200: sbfx            x5, x4, #1, #0x1f
    //     0xa82204: tbz             w4, #0, #0xa8220c
    //     0xa82208: ldur            x5, [x4, #7]
    // 0xa8220c: r0 = LoadInt32Instr(r2)
    //     0xa8220c: sbfx            x0, x2, #1, #0x1f
    // 0xa82210: mov             x1, x5
    // 0xa82214: cmp             x1, x0
    // 0xa82218: b.hs            #0xa82258
    // 0xa8221c: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xa8221c: add             x16, x3, x5, lsl #3
    //     0xa82220: ldur            d0, [x16, #0x17]
    // 0xa82224: r0 = inline_Allocate_Double()
    //     0xa82224: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xa82228: add             x0, x0, #0x10
    //     0xa8222c: cmp             x1, x0
    //     0xa82230: b.ls            #0xa8225c
    //     0xa82234: str             x0, [THR, #0x50]  ; THR::top
    //     0xa82238: sub             x0, x0, #0xf
    //     0xa8223c: movz            x1, #0xe15c
    //     0xa82240: movk            x1, #0x3, lsl #16
    //     0xa82244: stur            x1, [x0, #-1]
    // 0xa82248: StoreField: r0->field_7 = d0
    //     0xa82248: stur            d0, [x0, #7]
    // 0xa8224c: LeaveFrame
    //     0xa8224c: mov             SP, fp
    //     0xa82250: ldp             fp, lr, [SP], #0x10
    // 0xa82254: ret
    //     0xa82254: ret             
    // 0xa82258: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xa82258: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xa8225c: SaveReg d0
    //     0xa8225c: str             q0, [SP, #-0x10]!
    // 0xa82260: r0 = AllocateDouble()
    //     0xa82260: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xa82264: RestoreReg d0
    //     0xa82264: ldr             q0, [SP], #0x10
    // 0xa82268: b               #0xa82248
  }
}

// class id: 314, size: 0xc, field offset: 0x8
class Uhb extends Object
    implements Phb {

  Uhb +(Uhb, Uhb) {
    // ** addr: 0xb0a4d0, size: 0x84
    // 0xb0a4d0: EnterFrame
    //     0xb0a4d0: stp             fp, lr, [SP, #-0x10]!
    //     0xb0a4d4: mov             fp, SP
    // 0xb0a4d8: CheckStackOverflow
    //     0xb0a4d8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb0a4dc: cmp             SP, x16
    //     0xb0a4e0: b.ls            #0xb0a534
    // 0xb0a4e4: ldr             x0, [fp, #0x10]
    // 0xb0a4e8: r2 = Null
    //     0xb0a4e8: mov             x2, NULL
    // 0xb0a4ec: r1 = Null
    //     0xb0a4ec: mov             x1, NULL
    // 0xb0a4f0: r4 = 60
    //     0xb0a4f0: movz            x4, #0x3c
    // 0xb0a4f4: branchIfSmi(r0, 0xb0a500)
    //     0xb0a4f4: tbz             w0, #0, #0xb0a500
    // 0xb0a4f8: r4 = LoadClassIdInstr(r0)
    //     0xb0a4f8: ldur            x4, [x0, #-1]
    //     0xb0a4fc: ubfx            x4, x4, #0xc, #0x14
    // 0xb0a500: cmp             x4, #0x13a
    // 0xb0a504: b.eq            #0xb0a51c
    // 0xb0a508: r8 = Uhb
    //     0xb0a508: add             x8, PP, #0x33, lsl #12  ; [pp+0x33bd0] Type: Uhb
    //     0xb0a50c: ldr             x8, [x8, #0xbd0]
    // 0xb0a510: r3 = Null
    //     0xb0a510: add             x3, PP, #0x33, lsl #12  ; [pp+0x33bd8] Null
    //     0xb0a514: ldr             x3, [x3, #0xbd8]
    // 0xb0a518: r0 = Uhb()
    //     0xb0a518: bl              #0xb0a6f0  ; IsType_Uhb_Stub
    // 0xb0a51c: ldr             x1, [fp, #0x18]
    // 0xb0a520: ldr             x2, [fp, #0x10]
    // 0xb0a524: r0 = call 0x966bd4
    //     0xb0a524: bl              #0x966bd4
    // 0xb0a528: LeaveFrame
    //     0xb0a528: mov             SP, fp
    //     0xb0a52c: ldp             fp, lr, [SP], #0x10
    // 0xb0a530: ret
    //     0xb0a530: ret             
    // 0xb0a534: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb0a534: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb0a538: b               #0xb0a4e4
  }
  Uhb *(Uhb, double) {
    // ** addr: 0xb0a560, size: 0x50
    // 0xb0a560: EnterFrame
    //     0xb0a560: stp             fp, lr, [SP, #-0x10]!
    //     0xb0a564: mov             fp, SP
    // 0xb0a568: CheckStackOverflow
    //     0xb0a568: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb0a56c: cmp             SP, x16
    //     0xb0a570: b.ls            #0xb0a590
    // 0xb0a574: ldr             x0, [fp, #0x10]
    // 0xb0a578: LoadField: d0 = r0->field_7
    //     0xb0a578: ldur            d0, [x0, #7]
    // 0xb0a57c: ldr             x1, [fp, #0x18]
    // 0xb0a580: r0 = call 0x966d48
    //     0xb0a580: bl              #0x966d48
    // 0xb0a584: LeaveFrame
    //     0xb0a584: mov             SP, fp
    //     0xb0a588: ldp             fp, lr, [SP], #0x10
    // 0xb0a58c: ret
    //     0xb0a58c: ret             
    // 0xb0a590: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb0a590: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb0a594: b               #0xb0a574
  }
  Uhb -(Uhb, Uhb) {
    // ** addr: 0xb0a5b0, size: 0x84
    // 0xb0a5b0: EnterFrame
    //     0xb0a5b0: stp             fp, lr, [SP, #-0x10]!
    //     0xb0a5b4: mov             fp, SP
    // 0xb0a5b8: CheckStackOverflow
    //     0xb0a5b8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb0a5bc: cmp             SP, x16
    //     0xb0a5c0: b.ls            #0xb0a614
    // 0xb0a5c4: ldr             x0, [fp, #0x10]
    // 0xb0a5c8: r2 = Null
    //     0xb0a5c8: mov             x2, NULL
    // 0xb0a5cc: r1 = Null
    //     0xb0a5cc: mov             x1, NULL
    // 0xb0a5d0: r4 = 60
    //     0xb0a5d0: movz            x4, #0x3c
    // 0xb0a5d4: branchIfSmi(r0, 0xb0a5e0)
    //     0xb0a5d4: tbz             w0, #0, #0xb0a5e0
    // 0xb0a5d8: r4 = LoadClassIdInstr(r0)
    //     0xb0a5d8: ldur            x4, [x0, #-1]
    //     0xb0a5dc: ubfx            x4, x4, #0xc, #0x14
    // 0xb0a5e0: cmp             x4, #0x13a
    // 0xb0a5e4: b.eq            #0xb0a5fc
    // 0xb0a5e8: r8 = Uhb
    //     0xb0a5e8: add             x8, PP, #0x33, lsl #12  ; [pp+0x33bd0] Type: Uhb
    //     0xb0a5ec: ldr             x8, [x8, #0xbd0]
    // 0xb0a5f0: r3 = Null
    //     0xb0a5f0: add             x3, PP, #0x33, lsl #12  ; [pp+0x33be8] Null
    //     0xb0a5f4: ldr             x3, [x3, #0xbe8]
    // 0xb0a5f8: r0 = Uhb()
    //     0xb0a5f8: bl              #0xb0a6f0  ; IsType_Uhb_Stub
    // 0xb0a5fc: ldr             x1, [fp, #0x18]
    // 0xb0a600: ldr             x2, [fp, #0x10]
    // 0xb0a604: r0 = call 0x966dc0
    //     0xb0a604: bl              #0x966dc0
    // 0xb0a608: LeaveFrame
    //     0xb0a608: mov             SP, fp
    //     0xb0a60c: ldp             fp, lr, [SP], #0x10
    // 0xb0a610: ret
    //     0xb0a610: ret             
    // 0xb0a614: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb0a614: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb0a618: b               #0xb0a5c4
  }
  double [](Uhb, int) {
    // ** addr: 0xb0a634, size: 0xd4
    // 0xb0a634: EnterFrame
    //     0xb0a634: stp             fp, lr, [SP, #-0x10]!
    //     0xb0a638: mov             fp, SP
    // 0xb0a63c: ldr             x0, [fp, #0x10]
    // 0xb0a640: r2 = Null
    //     0xb0a640: mov             x2, NULL
    // 0xb0a644: r1 = Null
    //     0xb0a644: mov             x1, NULL
    // 0xb0a648: branchIfSmi(r0, 0xb0a670)
    //     0xb0a648: tbz             w0, #0, #0xb0a670
    // 0xb0a64c: r4 = LoadClassIdInstr(r0)
    //     0xb0a64c: ldur            x4, [x0, #-1]
    //     0xb0a650: ubfx            x4, x4, #0xc, #0x14
    // 0xb0a654: sub             x4, x4, #0x3c
    // 0xb0a658: cmp             x4, #1
    // 0xb0a65c: b.ls            #0xb0a670
    // 0xb0a660: r8 = int
    //     0xb0a660: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xb0a664: r3 = Null
    //     0xb0a664: add             x3, PP, #0x33, lsl #12  ; [pp+0x33bc0] Null
    //     0xb0a668: ldr             x3, [x3, #0xbc0]
    // 0xb0a66c: r0 = int()
    //     0xb0a66c: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xb0a670: ldr             x2, [fp, #0x18]
    // 0xb0a674: LoadField: r3 = r2->field_7
    //     0xb0a674: ldur            w3, [x2, #7]
    // 0xb0a678: DecompressPointer r3
    //     0xb0a678: add             x3, x3, HEAP, lsl #32
    // 0xb0a67c: LoadField: r2 = r3->field_13
    //     0xb0a67c: ldur            w2, [x3, #0x13]
    // 0xb0a680: ldr             x4, [fp, #0x10]
    // 0xb0a684: r5 = LoadInt32Instr(r4)
    //     0xb0a684: sbfx            x5, x4, #1, #0x1f
    //     0xb0a688: tbz             w4, #0, #0xb0a690
    //     0xb0a68c: ldur            x5, [x4, #7]
    // 0xb0a690: r0 = LoadInt32Instr(r2)
    //     0xb0a690: sbfx            x0, x2, #1, #0x1f
    // 0xb0a694: mov             x1, x5
    // 0xb0a698: cmp             x1, x0
    // 0xb0a69c: b.hs            #0xb0a6dc
    // 0xb0a6a0: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xb0a6a0: add             x16, x3, x5, lsl #3
    //     0xb0a6a4: ldur            d0, [x16, #0x17]
    // 0xb0a6a8: r0 = inline_Allocate_Double()
    //     0xb0a6a8: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xb0a6ac: add             x0, x0, #0x10
    //     0xb0a6b0: cmp             x1, x0
    //     0xb0a6b4: b.ls            #0xb0a6e0
    //     0xb0a6b8: str             x0, [THR, #0x50]  ; THR::top
    //     0xb0a6bc: sub             x0, x0, #0xf
    //     0xb0a6c0: movz            x1, #0xe15c
    //     0xb0a6c4: movk            x1, #0x3, lsl #16
    //     0xb0a6c8: stur            x1, [x0, #-1]
    // 0xb0a6cc: StoreField: r0->field_7 = d0
    //     0xb0a6cc: stur            d0, [x0, #7]
    // 0xb0a6d0: LeaveFrame
    //     0xb0a6d0: mov             SP, fp
    //     0xb0a6d4: ldp             fp, lr, [SP], #0x10
    // 0xb0a6d8: ret
    //     0xb0a6d8: ret             
    // 0xb0a6dc: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xb0a6dc: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xb0a6e0: SaveReg d0
    //     0xb0a6e0: str             q0, [SP, #-0x10]!
    // 0xb0a6e4: r0 = AllocateDouble()
    //     0xb0a6e4: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xb0a6e8: RestoreReg d0
    //     0xb0a6e8: ldr             q0, [SP], #0x10
    // 0xb0a6ec: b               #0xb0a6cc
  }
}

// class id: 315, size: 0x8, field offset: 0x8
abstract class Phb extends Object {
}

// class id: 316, size: 0xc, field offset: 0x8
class Thb extends Object {

  Thb +(Thb, Thb) {
    // ** addr: 0xae5ca4, size: 0x84
    // 0xae5ca4: EnterFrame
    //     0xae5ca4: stp             fp, lr, [SP, #-0x10]!
    //     0xae5ca8: mov             fp, SP
    // 0xae5cac: CheckStackOverflow
    //     0xae5cac: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae5cb0: cmp             SP, x16
    //     0xae5cb4: b.ls            #0xae5d08
    // 0xae5cb8: ldr             x0, [fp, #0x10]
    // 0xae5cbc: r2 = Null
    //     0xae5cbc: mov             x2, NULL
    // 0xae5cc0: r1 = Null
    //     0xae5cc0: mov             x1, NULL
    // 0xae5cc4: r4 = 60
    //     0xae5cc4: movz            x4, #0x3c
    // 0xae5cc8: branchIfSmi(r0, 0xae5cd4)
    //     0xae5cc8: tbz             w0, #0, #0xae5cd4
    // 0xae5ccc: r4 = LoadClassIdInstr(r0)
    //     0xae5ccc: ldur            x4, [x0, #-1]
    //     0xae5cd0: ubfx            x4, x4, #0xc, #0x14
    // 0xae5cd4: cmp             x4, #0x13c
    // 0xae5cd8: b.eq            #0xae5cf0
    // 0xae5cdc: r8 = Thb
    //     0xae5cdc: add             x8, PP, #0x26, lsl #12  ; [pp+0x26b00] Type: Thb
    //     0xae5ce0: ldr             x8, [x8, #0xb00]
    // 0xae5ce4: r3 = Null
    //     0xae5ce4: add             x3, PP, #0x26, lsl #12  ; [pp+0x26b18] Null
    //     0xae5ce8: ldr             x3, [x3, #0xb18]
    // 0xae5cec: r0 = DefaultTypeTest()
    //     0xae5cec: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xae5cf0: ldr             x1, [fp, #0x18]
    // 0xae5cf4: ldr             x2, [fp, #0x10]
    // 0xae5cf8: r0 = call 0x7dabc4
    //     0xae5cf8: bl              #0x7dabc4
    // 0xae5cfc: LeaveFrame
    //     0xae5cfc: mov             SP, fp
    //     0xae5d00: ldp             fp, lr, [SP], #0x10
    // 0xae5d04: ret
    //     0xae5d04: ret             
    // 0xae5d08: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae5d08: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae5d0c: b               #0xae5cb8
  }
  Thb *(Thb, Thb) {
    // ** addr: 0xae5d28, size: 0x84
    // 0xae5d28: EnterFrame
    //     0xae5d28: stp             fp, lr, [SP, #-0x10]!
    //     0xae5d2c: mov             fp, SP
    // 0xae5d30: CheckStackOverflow
    //     0xae5d30: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae5d34: cmp             SP, x16
    //     0xae5d38: b.ls            #0xae5d8c
    // 0xae5d3c: ldr             x0, [fp, #0x10]
    // 0xae5d40: r2 = Null
    //     0xae5d40: mov             x2, NULL
    // 0xae5d44: r1 = Null
    //     0xae5d44: mov             x1, NULL
    // 0xae5d48: r4 = 60
    //     0xae5d48: movz            x4, #0x3c
    // 0xae5d4c: branchIfSmi(r0, 0xae5d58)
    //     0xae5d4c: tbz             w0, #0, #0xae5d58
    // 0xae5d50: r4 = LoadClassIdInstr(r0)
    //     0xae5d50: ldur            x4, [x0, #-1]
    //     0xae5d54: ubfx            x4, x4, #0xc, #0x14
    // 0xae5d58: cmp             x4, #0x13c
    // 0xae5d5c: b.eq            #0xae5d74
    // 0xae5d60: r8 = Thb
    //     0xae5d60: add             x8, PP, #0x26, lsl #12  ; [pp+0x26b00] Type: Thb
    //     0xae5d64: ldr             x8, [x8, #0xb00]
    // 0xae5d68: r3 = Null
    //     0xae5d68: add             x3, PP, #0x26, lsl #12  ; [pp+0x26b28] Null
    //     0xae5d6c: ldr             x3, [x3, #0xb28]
    // 0xae5d70: r0 = DefaultTypeTest()
    //     0xae5d70: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xae5d74: ldr             x1, [fp, #0x18]
    // 0xae5d78: ldr             x2, [fp, #0x10]
    // 0xae5d7c: r0 = call 0x7dad04
    //     0xae5d7c: bl              #0x7dad04
    // 0xae5d80: LeaveFrame
    //     0xae5d80: mov             SP, fp
    //     0xae5d84: ldp             fp, lr, [SP], #0x10
    // 0xae5d88: ret
    //     0xae5d88: ret             
    // 0xae5d8c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae5d8c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae5d90: b               #0xae5d3c
  }
  Thb -(Thb, Thb) {
    // ** addr: 0xae5dac, size: 0x84
    // 0xae5dac: EnterFrame
    //     0xae5dac: stp             fp, lr, [SP, #-0x10]!
    //     0xae5db0: mov             fp, SP
    // 0xae5db4: CheckStackOverflow
    //     0xae5db4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae5db8: cmp             SP, x16
    //     0xae5dbc: b.ls            #0xae5e10
    // 0xae5dc0: ldr             x0, [fp, #0x10]
    // 0xae5dc4: r2 = Null
    //     0xae5dc4: mov             x2, NULL
    // 0xae5dc8: r1 = Null
    //     0xae5dc8: mov             x1, NULL
    // 0xae5dcc: r4 = 60
    //     0xae5dcc: movz            x4, #0x3c
    // 0xae5dd0: branchIfSmi(r0, 0xae5ddc)
    //     0xae5dd0: tbz             w0, #0, #0xae5ddc
    // 0xae5dd4: r4 = LoadClassIdInstr(r0)
    //     0xae5dd4: ldur            x4, [x0, #-1]
    //     0xae5dd8: ubfx            x4, x4, #0xc, #0x14
    // 0xae5ddc: cmp             x4, #0x13c
    // 0xae5de0: b.eq            #0xae5df8
    // 0xae5de4: r8 = Thb
    //     0xae5de4: add             x8, PP, #0x26, lsl #12  ; [pp+0x26b00] Type: Thb
    //     0xae5de8: ldr             x8, [x8, #0xb00]
    // 0xae5dec: r3 = Null
    //     0xae5dec: add             x3, PP, #0x26, lsl #12  ; [pp+0x26b08] Null
    //     0xae5df0: ldr             x3, [x3, #0xb08]
    // 0xae5df4: r0 = DefaultTypeTest()
    //     0xae5df4: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xae5df8: ldr             x1, [fp, #0x18]
    // 0xae5dfc: ldr             x2, [fp, #0x10]
    // 0xae5e00: r0 = call 0x7dae18
    //     0xae5e00: bl              #0x7dae18
    // 0xae5e04: LeaveFrame
    //     0xae5e04: mov             SP, fp
    //     0xae5e08: ldp             fp, lr, [SP], #0x10
    // 0xae5e0c: ret
    //     0xae5e0c: ret             
    // 0xae5e10: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae5e10: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae5e14: b               #0xae5dc0
  }
  double [](Thb, int) {
    // ** addr: 0xae5e30, size: 0xd4
    // 0xae5e30: EnterFrame
    //     0xae5e30: stp             fp, lr, [SP, #-0x10]!
    //     0xae5e34: mov             fp, SP
    // 0xae5e38: ldr             x0, [fp, #0x10]
    // 0xae5e3c: r2 = Null
    //     0xae5e3c: mov             x2, NULL
    // 0xae5e40: r1 = Null
    //     0xae5e40: mov             x1, NULL
    // 0xae5e44: branchIfSmi(r0, 0xae5e6c)
    //     0xae5e44: tbz             w0, #0, #0xae5e6c
    // 0xae5e48: r4 = LoadClassIdInstr(r0)
    //     0xae5e48: ldur            x4, [x0, #-1]
    //     0xae5e4c: ubfx            x4, x4, #0xc, #0x14
    // 0xae5e50: sub             x4, x4, #0x3c
    // 0xae5e54: cmp             x4, #1
    // 0xae5e58: b.ls            #0xae5e6c
    // 0xae5e5c: r8 = int
    //     0xae5e5c: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xae5e60: r3 = Null
    //     0xae5e60: add             x3, PP, #0x1e, lsl #12  ; [pp+0x1e698] Null
    //     0xae5e64: ldr             x3, [x3, #0x698]
    // 0xae5e68: r0 = int()
    //     0xae5e68: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xae5e6c: ldr             x2, [fp, #0x18]
    // 0xae5e70: LoadField: r3 = r2->field_7
    //     0xae5e70: ldur            w3, [x2, #7]
    // 0xae5e74: DecompressPointer r3
    //     0xae5e74: add             x3, x3, HEAP, lsl #32
    // 0xae5e78: LoadField: r2 = r3->field_13
    //     0xae5e78: ldur            w2, [x3, #0x13]
    // 0xae5e7c: ldr             x4, [fp, #0x10]
    // 0xae5e80: r5 = LoadInt32Instr(r4)
    //     0xae5e80: sbfx            x5, x4, #1, #0x1f
    //     0xae5e84: tbz             w4, #0, #0xae5e8c
    //     0xae5e88: ldur            x5, [x4, #7]
    // 0xae5e8c: r0 = LoadInt32Instr(r2)
    //     0xae5e8c: sbfx            x0, x2, #1, #0x1f
    // 0xae5e90: mov             x1, x5
    // 0xae5e94: cmp             x1, x0
    // 0xae5e98: b.hs            #0xae5ed8
    // 0xae5e9c: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xae5e9c: add             x16, x3, x5, lsl #3
    //     0xae5ea0: ldur            d0, [x16, #0x17]
    // 0xae5ea4: r0 = inline_Allocate_Double()
    //     0xae5ea4: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xae5ea8: add             x0, x0, #0x10
    //     0xae5eac: cmp             x1, x0
    //     0xae5eb0: b.ls            #0xae5edc
    //     0xae5eb4: str             x0, [THR, #0x50]  ; THR::top
    //     0xae5eb8: sub             x0, x0, #0xf
    //     0xae5ebc: movz            x1, #0xe15c
    //     0xae5ec0: movk            x1, #0x3, lsl #16
    //     0xae5ec4: stur            x1, [x0, #-1]
    // 0xae5ec8: StoreField: r0->field_7 = d0
    //     0xae5ec8: stur            d0, [x0, #7]
    // 0xae5ecc: LeaveFrame
    //     0xae5ecc: mov             SP, fp
    //     0xae5ed0: ldp             fp, lr, [SP], #0x10
    // 0xae5ed4: ret
    //     0xae5ed4: ret             
    // 0xae5ed8: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xae5ed8: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xae5edc: SaveReg d0
    //     0xae5edc: str             q0, [SP, #-0x10]!
    // 0xae5ee0: r0 = AllocateDouble()
    //     0xae5ee0: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xae5ee4: RestoreReg d0
    //     0xae5ee4: ldr             q0, [SP], #0x10
    // 0xae5ee8: b               #0xae5ec8
  }
}

// class id: 317, size: 0xc, field offset: 0x8
class Shb extends Object {

  Shb +(Shb, Shb) {
    // ** addr: 0xafe124, size: 0x84
    // 0xafe124: EnterFrame
    //     0xafe124: stp             fp, lr, [SP, #-0x10]!
    //     0xafe128: mov             fp, SP
    // 0xafe12c: CheckStackOverflow
    //     0xafe12c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xafe130: cmp             SP, x16
    //     0xafe134: b.ls            #0xafe188
    // 0xafe138: ldr             x0, [fp, #0x10]
    // 0xafe13c: r2 = Null
    //     0xafe13c: mov             x2, NULL
    // 0xafe140: r1 = Null
    //     0xafe140: mov             x1, NULL
    // 0xafe144: r4 = 60
    //     0xafe144: movz            x4, #0x3c
    // 0xafe148: branchIfSmi(r0, 0xafe154)
    //     0xafe148: tbz             w0, #0, #0xafe154
    // 0xafe14c: r4 = LoadClassIdInstr(r0)
    //     0xafe14c: ldur            x4, [x0, #-1]
    //     0xafe150: ubfx            x4, x4, #0xc, #0x14
    // 0xafe154: cmp             x4, #0x13d
    // 0xafe158: b.eq            #0xafe170
    // 0xafe15c: r8 = Shb
    //     0xafe15c: add             x8, PP, #0x2c, lsl #12  ; [pp+0x2c8b8] Type: Shb
    //     0xafe160: ldr             x8, [x8, #0x8b8]
    // 0xafe164: r3 = Null
    //     0xafe164: add             x3, PP, #0x2c, lsl #12  ; [pp+0x2c8d0] Null
    //     0xafe168: ldr             x3, [x3, #0x8d0]
    // 0xafe16c: r0 = DefaultTypeTest()
    //     0xafe16c: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xafe170: ldr             x1, [fp, #0x18]
    // 0xafe174: ldr             x2, [fp, #0x10]
    // 0xafe178: r0 = call 0x85f2ec
    //     0xafe178: bl              #0x85f2ec
    // 0xafe17c: LeaveFrame
    //     0xafe17c: mov             SP, fp
    //     0xafe180: ldp             fp, lr, [SP], #0x10
    // 0xafe184: ret
    //     0xafe184: ret             
    // 0xafe188: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xafe188: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xafe18c: b               #0xafe138
  }
  dynamic *(Shb, dynamic) {
    // ** addr: 0xafe1a8, size: 0x50
    // 0xafe1a8: EnterFrame
    //     0xafe1a8: stp             fp, lr, [SP, #-0x10]!
    //     0xafe1ac: mov             fp, SP
    // 0xafe1b0: CheckStackOverflow
    //     0xafe1b0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xafe1b4: cmp             SP, x16
    //     0xafe1b8: b.ls            #0xafe1d8
    // 0xafe1bc: ldr             x0, [fp, #0x10]
    // 0xafe1c0: LoadField: d0 = r0->field_7
    //     0xafe1c0: ldur            d0, [x0, #7]
    // 0xafe1c4: ldr             x1, [fp, #0x18]
    // 0xafe1c8: r0 = call 0x85f694
    //     0xafe1c8: bl              #0x85f694
    // 0xafe1cc: LeaveFrame
    //     0xafe1cc: mov             SP, fp
    //     0xafe1d0: ldp             fp, lr, [SP], #0x10
    // 0xafe1d4: ret
    //     0xafe1d4: ret             
    // 0xafe1d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xafe1d8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xafe1dc: b               #0xafe1bc
  }
  Shb -(Shb, Shb) {
    // ** addr: 0xafe1f8, size: 0x84
    // 0xafe1f8: EnterFrame
    //     0xafe1f8: stp             fp, lr, [SP, #-0x10]!
    //     0xafe1fc: mov             fp, SP
    // 0xafe200: CheckStackOverflow
    //     0xafe200: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xafe204: cmp             SP, x16
    //     0xafe208: b.ls            #0xafe25c
    // 0xafe20c: ldr             x0, [fp, #0x10]
    // 0xafe210: r2 = Null
    //     0xafe210: mov             x2, NULL
    // 0xafe214: r1 = Null
    //     0xafe214: mov             x1, NULL
    // 0xafe218: r4 = 60
    //     0xafe218: movz            x4, #0x3c
    // 0xafe21c: branchIfSmi(r0, 0xafe228)
    //     0xafe21c: tbz             w0, #0, #0xafe228
    // 0xafe220: r4 = LoadClassIdInstr(r0)
    //     0xafe220: ldur            x4, [x0, #-1]
    //     0xafe224: ubfx            x4, x4, #0xc, #0x14
    // 0xafe228: cmp             x4, #0x13d
    // 0xafe22c: b.eq            #0xafe244
    // 0xafe230: r8 = Shb
    //     0xafe230: add             x8, PP, #0x2c, lsl #12  ; [pp+0x2c8b8] Type: Shb
    //     0xafe234: ldr             x8, [x8, #0x8b8]
    // 0xafe238: r3 = Null
    //     0xafe238: add             x3, PP, #0x2c, lsl #12  ; [pp+0x2c8c0] Null
    //     0xafe23c: ldr             x3, [x3, #0x8c0]
    // 0xafe240: r0 = DefaultTypeTest()
    //     0xafe240: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xafe244: ldr             x1, [fp, #0x18]
    // 0xafe248: ldr             x2, [fp, #0x10]
    // 0xafe24c: r0 = call 0x85f824
    //     0xafe24c: bl              #0x85f824
    // 0xafe250: LeaveFrame
    //     0xafe250: mov             SP, fp
    //     0xafe254: ldp             fp, lr, [SP], #0x10
    // 0xafe258: ret
    //     0xafe258: ret             
    // 0xafe25c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xafe25c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xafe260: b               #0xafe20c
  }
  double [](Shb, int) {
    // ** addr: 0xafe27c, size: 0xd4
    // 0xafe27c: EnterFrame
    //     0xafe27c: stp             fp, lr, [SP, #-0x10]!
    //     0xafe280: mov             fp, SP
    // 0xafe284: ldr             x0, [fp, #0x10]
    // 0xafe288: r2 = Null
    //     0xafe288: mov             x2, NULL
    // 0xafe28c: r1 = Null
    //     0xafe28c: mov             x1, NULL
    // 0xafe290: branchIfSmi(r0, 0xafe2b8)
    //     0xafe290: tbz             w0, #0, #0xafe2b8
    // 0xafe294: r4 = LoadClassIdInstr(r0)
    //     0xafe294: ldur            x4, [x0, #-1]
    //     0xafe298: ubfx            x4, x4, #0xc, #0x14
    // 0xafe29c: sub             x4, x4, #0x3c
    // 0xafe2a0: cmp             x4, #1
    // 0xafe2a4: b.ls            #0xafe2b8
    // 0xafe2a8: r8 = int
    //     0xafe2a8: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xafe2ac: r3 = Null
    //     0xafe2ac: add             x3, PP, #0x2c, lsl #12  ; [pp+0x2c8e0] Null
    //     0xafe2b0: ldr             x3, [x3, #0x8e0]
    // 0xafe2b4: r0 = int()
    //     0xafe2b4: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xafe2b8: ldr             x2, [fp, #0x18]
    // 0xafe2bc: LoadField: r3 = r2->field_7
    //     0xafe2bc: ldur            w3, [x2, #7]
    // 0xafe2c0: DecompressPointer r3
    //     0xafe2c0: add             x3, x3, HEAP, lsl #32
    // 0xafe2c4: LoadField: r2 = r3->field_13
    //     0xafe2c4: ldur            w2, [x3, #0x13]
    // 0xafe2c8: ldr             x4, [fp, #0x10]
    // 0xafe2cc: r5 = LoadInt32Instr(r4)
    //     0xafe2cc: sbfx            x5, x4, #1, #0x1f
    //     0xafe2d0: tbz             w4, #0, #0xafe2d8
    //     0xafe2d4: ldur            x5, [x4, #7]
    // 0xafe2d8: r0 = LoadInt32Instr(r2)
    //     0xafe2d8: sbfx            x0, x2, #1, #0x1f
    // 0xafe2dc: mov             x1, x5
    // 0xafe2e0: cmp             x1, x0
    // 0xafe2e4: b.hs            #0xafe324
    // 0xafe2e8: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xafe2e8: add             x16, x3, x5, lsl #3
    //     0xafe2ec: ldur            d0, [x16, #0x17]
    // 0xafe2f0: r0 = inline_Allocate_Double()
    //     0xafe2f0: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xafe2f4: add             x0, x0, #0x10
    //     0xafe2f8: cmp             x1, x0
    //     0xafe2fc: b.ls            #0xafe328
    //     0xafe300: str             x0, [THR, #0x50]  ; THR::top
    //     0xafe304: sub             x0, x0, #0xf
    //     0xafe308: movz            x1, #0xe15c
    //     0xafe30c: movk            x1, #0x3, lsl #16
    //     0xafe310: stur            x1, [x0, #-1]
    // 0xafe314: StoreField: r0->field_7 = d0
    //     0xafe314: stur            d0, [x0, #7]
    // 0xafe318: LeaveFrame
    //     0xafe318: mov             SP, fp
    //     0xafe31c: ldp             fp, lr, [SP], #0x10
    // 0xafe320: ret
    //     0xafe320: ret             
    // 0xafe324: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xafe324: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xafe328: SaveReg d0
    //     0xafe328: str             q0, [SP, #-0x10]!
    // 0xafe32c: r0 = AllocateDouble()
    //     0xafe32c: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xafe330: RestoreReg d0
    //     0xafe330: ldr             q0, [SP], #0x10
    // 0xafe334: b               #0xafe314
  }
}

// class id: 2324, size: 0xc, field offset: 0x8
class yK extends Object {

  yK +(yK, yK) {
    // ** addr: 0xa6c104, size: 0x80
    // 0xa6c104: EnterFrame
    //     0xa6c104: stp             fp, lr, [SP, #-0x10]!
    //     0xa6c108: mov             fp, SP
    // 0xa6c10c: CheckStackOverflow
    //     0xa6c10c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa6c110: cmp             SP, x16
    //     0xa6c114: b.ls            #0xa6c164
    // 0xa6c118: ldr             x0, [fp, #0x10]
    // 0xa6c11c: r2 = Null
    //     0xa6c11c: mov             x2, NULL
    // 0xa6c120: r1 = Null
    //     0xa6c120: mov             x1, NULL
    // 0xa6c124: r4 = 60
    //     0xa6c124: movz            x4, #0x3c
    // 0xa6c128: branchIfSmi(r0, 0xa6c134)
    //     0xa6c128: tbz             w0, #0, #0xa6c134
    // 0xa6c12c: r4 = LoadClassIdInstr(r0)
    //     0xa6c12c: ldur            x4, [x0, #-1]
    //     0xa6c130: ubfx            x4, x4, #0xc, #0x14
    // 0xa6c134: cmp             x4, #0x914
    // 0xa6c138: b.eq            #0xa6c14c
    // 0xa6c13c: r8 = yK
    //     0xa6c13c: ldr             x8, [PP, #0x2710]  ; [pp+0x2710] Type: yK
    // 0xa6c140: r3 = Null
    //     0xa6c140: add             x3, PP, #0x26, lsl #12  ; [pp+0x26b70] Null
    //     0xa6c144: ldr             x3, [x3, #0xb70]
    // 0xa6c148: r0 = yK()
    //     0xa6c148: bl              #0xa6c328  ; IsType_yK_Stub
    // 0xa6c14c: ldr             x1, [fp, #0x18]
    // 0xa6c150: ldr             x2, [fp, #0x10]
    // 0xa6c154: r0 = call 0x2eef7c
    //     0xa6c154: bl              #0x2eef7c
    // 0xa6c158: LeaveFrame
    //     0xa6c158: mov             SP, fp
    //     0xa6c15c: ldp             fp, lr, [SP], #0x10
    // 0xa6c160: ret
    //     0xa6c160: ret             
    // 0xa6c164: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa6c164: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa6c168: b               #0xa6c118
  }
  dynamic *(yK, dynamic) {
    // ** addr: 0xa6c190, size: 0x50
    // 0xa6c190: EnterFrame
    //     0xa6c190: stp             fp, lr, [SP, #-0x10]!
    //     0xa6c194: mov             fp, SP
    // 0xa6c198: CheckStackOverflow
    //     0xa6c198: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa6c19c: cmp             SP, x16
    //     0xa6c1a0: b.ls            #0xa6c1c0
    // 0xa6c1a4: ldr             x0, [fp, #0x10]
    // 0xa6c1a8: LoadField: d0 = r0->field_7
    //     0xa6c1a8: ldur            d0, [x0, #7]
    // 0xa6c1ac: ldr             x1, [fp, #0x18]
    // 0xa6c1b0: r0 = call 0x2ef4b4
    //     0xa6c1b0: bl              #0x2ef4b4
    // 0xa6c1b4: LeaveFrame
    //     0xa6c1b4: mov             SP, fp
    //     0xa6c1b8: ldp             fp, lr, [SP], #0x10
    // 0xa6c1bc: ret
    //     0xa6c1bc: ret             
    // 0xa6c1c0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa6c1c0: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa6c1c4: b               #0xa6c1a4
  }
  yK -(yK, yK) {
    // ** addr: 0xa6c1ec, size: 0x80
    // 0xa6c1ec: EnterFrame
    //     0xa6c1ec: stp             fp, lr, [SP, #-0x10]!
    //     0xa6c1f0: mov             fp, SP
    // 0xa6c1f4: CheckStackOverflow
    //     0xa6c1f4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa6c1f8: cmp             SP, x16
    //     0xa6c1fc: b.ls            #0xa6c24c
    // 0xa6c200: ldr             x0, [fp, #0x10]
    // 0xa6c204: r2 = Null
    //     0xa6c204: mov             x2, NULL
    // 0xa6c208: r1 = Null
    //     0xa6c208: mov             x1, NULL
    // 0xa6c20c: r4 = 60
    //     0xa6c20c: movz            x4, #0x3c
    // 0xa6c210: branchIfSmi(r0, 0xa6c21c)
    //     0xa6c210: tbz             w0, #0, #0xa6c21c
    // 0xa6c214: r4 = LoadClassIdInstr(r0)
    //     0xa6c214: ldur            x4, [x0, #-1]
    //     0xa6c218: ubfx            x4, x4, #0xc, #0x14
    // 0xa6c21c: cmp             x4, #0x914
    // 0xa6c220: b.eq            #0xa6c234
    // 0xa6c224: r8 = yK
    //     0xa6c224: ldr             x8, [PP, #0x2710]  ; [pp+0x2710] Type: yK
    // 0xa6c228: r3 = Null
    //     0xa6c228: add             x3, PP, #0x26, lsl #12  ; [pp+0x26b60] Null
    //     0xa6c22c: ldr             x3, [x3, #0xb60]
    // 0xa6c230: r0 = yK()
    //     0xa6c230: bl              #0xa6c328  ; IsType_yK_Stub
    // 0xa6c234: ldr             x1, [fp, #0x18]
    // 0xa6c238: ldr             x2, [fp, #0x10]
    // 0xa6c23c: r0 = call 0x2ef854
    //     0xa6c23c: bl              #0x2ef854
    // 0xa6c240: LeaveFrame
    //     0xa6c240: mov             SP, fp
    //     0xa6c244: ldp             fp, lr, [SP], #0x10
    // 0xa6c248: ret
    //     0xa6c248: ret             
    // 0xa6c24c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa6c24c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa6c250: b               #0xa6c200
  }
  double [](yK, int) {
    // ** addr: 0xa6c26c, size: 0xd4
    // 0xa6c26c: EnterFrame
    //     0xa6c26c: stp             fp, lr, [SP, #-0x10]!
    //     0xa6c270: mov             fp, SP
    // 0xa6c274: ldr             x0, [fp, #0x10]
    // 0xa6c278: r2 = Null
    //     0xa6c278: mov             x2, NULL
    // 0xa6c27c: r1 = Null
    //     0xa6c27c: mov             x1, NULL
    // 0xa6c280: branchIfSmi(r0, 0xa6c2a8)
    //     0xa6c280: tbz             w0, #0, #0xa6c2a8
    // 0xa6c284: r4 = LoadClassIdInstr(r0)
    //     0xa6c284: ldur            x4, [x0, #-1]
    //     0xa6c288: ubfx            x4, x4, #0xc, #0x14
    // 0xa6c28c: sub             x4, x4, #0x3c
    // 0xa6c290: cmp             x4, #1
    // 0xa6c294: b.ls            #0xa6c2a8
    // 0xa6c298: r8 = int
    //     0xa6c298: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xa6c29c: r3 = Null
    //     0xa6c29c: add             x3, PP, #0xc, lsl #12  ; [pp+0xcc70] Null
    //     0xa6c2a0: ldr             x3, [x3, #0xc70]
    // 0xa6c2a4: r0 = int()
    //     0xa6c2a4: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xa6c2a8: ldr             x2, [fp, #0x18]
    // 0xa6c2ac: LoadField: r3 = r2->field_7
    //     0xa6c2ac: ldur            w3, [x2, #7]
    // 0xa6c2b0: DecompressPointer r3
    //     0xa6c2b0: add             x3, x3, HEAP, lsl #32
    // 0xa6c2b4: LoadField: r2 = r3->field_13
    //     0xa6c2b4: ldur            w2, [x3, #0x13]
    // 0xa6c2b8: ldr             x4, [fp, #0x10]
    // 0xa6c2bc: r5 = LoadInt32Instr(r4)
    //     0xa6c2bc: sbfx            x5, x4, #1, #0x1f
    //     0xa6c2c0: tbz             w4, #0, #0xa6c2c8
    //     0xa6c2c4: ldur            x5, [x4, #7]
    // 0xa6c2c8: r0 = LoadInt32Instr(r2)
    //     0xa6c2c8: sbfx            x0, x2, #1, #0x1f
    // 0xa6c2cc: mov             x1, x5
    // 0xa6c2d0: cmp             x1, x0
    // 0xa6c2d4: b.hs            #0xa6c314
    // 0xa6c2d8: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xa6c2d8: add             x16, x3, x5, lsl #3
    //     0xa6c2dc: ldur            d0, [x16, #0x17]
    // 0xa6c2e0: r0 = inline_Allocate_Double()
    //     0xa6c2e0: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xa6c2e4: add             x0, x0, #0x10
    //     0xa6c2e8: cmp             x1, x0
    //     0xa6c2ec: b.ls            #0xa6c318
    //     0xa6c2f0: str             x0, [THR, #0x50]  ; THR::top
    //     0xa6c2f4: sub             x0, x0, #0xf
    //     0xa6c2f8: movz            x1, #0xe15c
    //     0xa6c2fc: movk            x1, #0x3, lsl #16
    //     0xa6c300: stur            x1, [x0, #-1]
    // 0xa6c304: StoreField: r0->field_7 = d0
    //     0xa6c304: stur            d0, [x0, #7]
    // 0xa6c308: LeaveFrame
    //     0xa6c308: mov             SP, fp
    //     0xa6c30c: ldp             fp, lr, [SP], #0x10
    // 0xa6c310: ret
    //     0xa6c310: ret             
    // 0xa6c314: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xa6c314: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xa6c318: SaveReg d0
    //     0xa6c318: str             q0, [SP, #-0x10]!
    // 0xa6c31c: r0 = AllocateDouble()
    //     0xa6c31c: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xa6c320: RestoreReg d0
    //     0xa6c320: ldr             q0, [SP], #0x10
    // 0xa6c324: b               #0xa6c304
  }
}
