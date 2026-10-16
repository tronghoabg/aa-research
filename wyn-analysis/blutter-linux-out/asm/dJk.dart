// lib: , url: DJk

// class id: 1049843, size: 0x8
class :: {
}

// class id: 948, size: 0x8, field offset: 0x8
abstract class LRa extends Object {

  dynamic toInt(dynamic) {
    // ** addr: 0xb00618, size: 0x3c
    // 0xb00618: EnterFrame
    //     0xb00618: stp             fp, lr, [SP, #-0x10]!
    //     0xb0061c: mov             fp, SP
    // 0xb00620: ldr             x2, [fp, #0x10]
    // 0xb00624: r1 = Function 'toInt':.
    //     0xb00624: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eb50] AnonymousClosure: (0xa3f778), of [DJk] LRa
    //     0xb00628: ldr             x1, [x1, #0xb50]
    // 0xb0062c: r0 = AllocateClosure()
    //     0xb0062c: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb00630: LeaveFrame
    //     0xb00630: mov             SP, fp
    //     0xb00634: ldp             fp, lr, [SP], #0x10
    // 0xb00638: ret
    //     0xb00638: ret             
  }
  int toInt(LRa, [int]) {
    // ** addr: 0xadbe64, size: 0x68
    // 0xadbe64: EnterFrame
    //     0xadbe64: stp             fp, lr, [SP, #-0x10]!
    //     0xadbe68: mov             fp, SP
    // 0xadbe6c: LoadField: r0 = r4->field_13
    //     0xadbe6c: ldur            w0, [x4, #0x13]
    // 0xadbe70: sub             x1, x0, #2
    // 0xadbe74: cmp             w1, #2
    // 0xadbe78: b.lt            #0xadbe88
    // 0xadbe7c: add             x0, fp, w1, sxtw #2
    // 0xadbe80: ldr             x0, [x0, #8]
    // 0xadbe84: b               #0xadbe8c
    // 0xadbe88: r0 = 0
    //     0xadbe88: movz            x0, #0
    // 0xadbe8c: r2 = Null
    //     0xadbe8c: mov             x2, NULL
    // 0xadbe90: r1 = Null
    //     0xadbe90: mov             x1, NULL
    // 0xadbe94: branchIfSmi(r0, 0xadbebc)
    //     0xadbe94: tbz             w0, #0, #0xadbebc
    // 0xadbe98: r4 = LoadClassIdInstr(r0)
    //     0xadbe98: ldur            x4, [x0, #-1]
    //     0xadbe9c: ubfx            x4, x4, #0xc, #0x14
    // 0xadbea0: sub             x4, x4, #0x3c
    // 0xadbea4: cmp             x4, #1
    // 0xadbea8: b.ls            #0xadbebc
    // 0xadbeac: r8 = int
    //     0xadbeac: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadbeb0: r3 = Null
    //     0xadbeb0: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb68] Null
    //     0xadbeb4: ldr             x3, [x3, #0xb68]
    // 0xadbeb8: r0 = int()
    //     0xadbeb8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadbebc: r0 = 0
    //     0xadbebc: movz            x0, #0
    // 0xadbec0: LeaveFrame
    //     0xadbec0: mov             SP, fp
    //     0xadbec4: ldp             fp, lr, [SP], #0x10
    // 0xadbec8: ret
    //     0xadbec8: ret             
  }
  double toDouble(LRa, [int]) {
    // ** addr: 0xadbecc, size: 0x68
    // 0xadbecc: EnterFrame
    //     0xadbecc: stp             fp, lr, [SP, #-0x10]!
    //     0xadbed0: mov             fp, SP
    // 0xadbed4: LoadField: r0 = r4->field_13
    //     0xadbed4: ldur            w0, [x4, #0x13]
    // 0xadbed8: sub             x1, x0, #2
    // 0xadbedc: cmp             w1, #2
    // 0xadbee0: b.lt            #0xadbef0
    // 0xadbee4: add             x0, fp, w1, sxtw #2
    // 0xadbee8: ldr             x0, [x0, #8]
    // 0xadbeec: b               #0xadbef4
    // 0xadbef0: r0 = 0
    //     0xadbef0: movz            x0, #0
    // 0xadbef4: r2 = Null
    //     0xadbef4: mov             x2, NULL
    // 0xadbef8: r1 = Null
    //     0xadbef8: mov             x1, NULL
    // 0xadbefc: branchIfSmi(r0, 0xadbf24)
    //     0xadbefc: tbz             w0, #0, #0xadbf24
    // 0xadbf00: r4 = LoadClassIdInstr(r0)
    //     0xadbf00: ldur            x4, [x0, #-1]
    //     0xadbf04: ubfx            x4, x4, #0xc, #0x14
    // 0xadbf08: sub             x4, x4, #0x3c
    // 0xadbf0c: cmp             x4, #1
    // 0xadbf10: b.ls            #0xadbf24
    // 0xadbf14: r8 = int
    //     0xadbf14: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadbf18: r3 = Null
    //     0xadbf18: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb58] Null
    //     0xadbf1c: ldr             x3, [x3, #0xb58]
    // 0xadbf20: r0 = int()
    //     0xadbf20: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadbf24: r0 = 0.000000
    //     0xadbf24: ldr             x0, [PP, #0xa58]  ; [pp+0xa58] 0
    // 0xadbf28: LeaveFrame
    //     0xadbf28: mov             SP, fp
    //     0xadbf2c: ldp             fp, lr, [SP], #0x10
    // 0xadbf30: ret
    //     0xadbf30: ret             
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0xa3f778, size: -0x1
  }
}

// class id: 949, size: 0xc, field offset: 0x8
class XRa extends LRa {
}

// class id: 950, size: 0xc, field offset: 0x8
class WRa extends LRa {

  double toDouble(WRa, [int]) {
    // ** addr: 0xadc584, size: 0xd4
    // 0xadc584: EnterFrame
    //     0xadc584: stp             fp, lr, [SP, #-0x10]!
    //     0xadc588: mov             fp, SP
    // 0xadc58c: AllocStack(0x8)
    //     0xadc58c: sub             SP, SP, #8
    // 0xadc590: SetupParameters(WRa this /* r3, fp-0x8 */, [dynamic _ = 0 /* r0 */])
    //     0xadc590: ldur            w0, [x4, #0x13]
    //     0xadc594: sub             x1, x0, #2
    //     0xadc598: add             x3, fp, w1, sxtw #2
    //     0xadc59c: ldr             x3, [x3, #0x10]
    //     0xadc5a0: stur            x3, [fp, #-8]
    //     0xadc5a4: cmp             w1, #2
    //     0xadc5a8: b.lt            #0xadc5b8
    //     0xadc5ac: add             x0, fp, w1, sxtw #2
    //     0xadc5b0: ldr             x0, [x0, #8]
    //     0xadc5b4: b               #0xadc5bc
    //     0xadc5b8: movz            x0, #0
    // 0xadc5bc: r2 = Null
    //     0xadc5bc: mov             x2, NULL
    // 0xadc5c0: r1 = Null
    //     0xadc5c0: mov             x1, NULL
    // 0xadc5c4: branchIfSmi(r0, 0xadc5ec)
    //     0xadc5c4: tbz             w0, #0, #0xadc5ec
    // 0xadc5c8: r4 = LoadClassIdInstr(r0)
    //     0xadc5c8: ldur            x4, [x0, #-1]
    //     0xadc5cc: ubfx            x4, x4, #0xc, #0x14
    // 0xadc5d0: sub             x4, x4, #0x3c
    // 0xadc5d4: cmp             x4, #1
    // 0xadc5d8: b.ls            #0xadc5ec
    // 0xadc5dc: r8 = int
    //     0xadc5dc: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadc5e0: r3 = Null
    //     0xadc5e0: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3ebb8] Null
    //     0xadc5e4: ldr             x3, [x3, #0xbb8]
    // 0xadc5e8: r0 = int()
    //     0xadc5e8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadc5ec: ldur            x2, [fp, #-8]
    // 0xadc5f0: LoadField: r3 = r2->field_7
    //     0xadc5f0: ldur            w3, [x2, #7]
    // 0xadc5f4: DecompressPointer r3
    //     0xadc5f4: add             x3, x3, HEAP, lsl #32
    // 0xadc5f8: LoadField: r2 = r3->field_13
    //     0xadc5f8: ldur            w2, [x3, #0x13]
    // 0xadc5fc: r0 = LoadInt32Instr(r2)
    //     0xadc5fc: sbfx            x0, x2, #1, #0x1f
    // 0xadc600: r1 = 0
    //     0xadc600: movz            x1, #0
    // 0xadc604: cmp             x1, x0
    // 0xadc608: b.hs            #0xadc644
    // 0xadc60c: ArrayLoad: d0 = r3[0]  ; List_8
    //     0xadc60c: ldur            d0, [x3, #0x17]
    // 0xadc610: r0 = inline_Allocate_Double()
    //     0xadc610: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xadc614: add             x0, x0, #0x10
    //     0xadc618: cmp             x1, x0
    //     0xadc61c: b.ls            #0xadc648
    //     0xadc620: str             x0, [THR, #0x50]  ; THR::top
    //     0xadc624: sub             x0, x0, #0xf
    //     0xadc628: movz            x1, #0xe15c
    //     0xadc62c: movk            x1, #0x3, lsl #16
    //     0xadc630: stur            x1, [x0, #-1]
    // 0xadc634: StoreField: r0->field_7 = d0
    //     0xadc634: stur            d0, [x0, #7]
    // 0xadc638: LeaveFrame
    //     0xadc638: mov             SP, fp
    //     0xadc63c: ldp             fp, lr, [SP], #0x10
    // 0xadc640: ret
    //     0xadc640: ret             
    // 0xadc644: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadc644: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xadc648: SaveReg d0
    //     0xadc648: str             q0, [SP, #-0x10]!
    // 0xadc64c: r0 = AllocateDouble()
    //     0xadc64c: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xadc650: RestoreReg d0
    //     0xadc650: ldr             q0, [SP], #0x10
    // 0xadc654: b               #0xadc634
  }
}

// class id: 951, size: 0xc, field offset: 0x8
class VRa extends LRa {

  double toDouble(VRa, [int]) {
    // ** addr: 0xadc688, size: 0xd8
    // 0xadc688: EnterFrame
    //     0xadc688: stp             fp, lr, [SP, #-0x10]!
    //     0xadc68c: mov             fp, SP
    // 0xadc690: AllocStack(0x8)
    //     0xadc690: sub             SP, SP, #8
    // 0xadc694: SetupParameters(VRa this /* r3, fp-0x8 */, [dynamic _ = 0 /* r0 */])
    //     0xadc694: ldur            w0, [x4, #0x13]
    //     0xadc698: sub             x1, x0, #2
    //     0xadc69c: add             x3, fp, w1, sxtw #2
    //     0xadc6a0: ldr             x3, [x3, #0x10]
    //     0xadc6a4: stur            x3, [fp, #-8]
    //     0xadc6a8: cmp             w1, #2
    //     0xadc6ac: b.lt            #0xadc6bc
    //     0xadc6b0: add             x0, fp, w1, sxtw #2
    //     0xadc6b4: ldr             x0, [x0, #8]
    //     0xadc6b8: b               #0xadc6c0
    //     0xadc6bc: movz            x0, #0
    // 0xadc6c0: r2 = Null
    //     0xadc6c0: mov             x2, NULL
    // 0xadc6c4: r1 = Null
    //     0xadc6c4: mov             x1, NULL
    // 0xadc6c8: branchIfSmi(r0, 0xadc6f0)
    //     0xadc6c8: tbz             w0, #0, #0xadc6f0
    // 0xadc6cc: r4 = LoadClassIdInstr(r0)
    //     0xadc6cc: ldur            x4, [x0, #-1]
    //     0xadc6d0: ubfx            x4, x4, #0xc, #0x14
    // 0xadc6d4: sub             x4, x4, #0x3c
    // 0xadc6d8: cmp             x4, #1
    // 0xadc6dc: b.ls            #0xadc6f0
    // 0xadc6e0: r8 = int
    //     0xadc6e0: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadc6e4: r3 = Null
    //     0xadc6e4: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb28] Null
    //     0xadc6e8: ldr             x3, [x3, #0xb28]
    // 0xadc6ec: r0 = int()
    //     0xadc6ec: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadc6f0: ldur            x2, [fp, #-8]
    // 0xadc6f4: LoadField: r3 = r2->field_7
    //     0xadc6f4: ldur            w3, [x2, #7]
    // 0xadc6f8: DecompressPointer r3
    //     0xadc6f8: add             x3, x3, HEAP, lsl #32
    // 0xadc6fc: LoadField: r2 = r3->field_13
    //     0xadc6fc: ldur            w2, [x3, #0x13]
    // 0xadc700: r0 = LoadInt32Instr(r2)
    //     0xadc700: sbfx            x0, x2, #1, #0x1f
    // 0xadc704: r1 = 0
    //     0xadc704: movz            x1, #0
    // 0xadc708: cmp             x1, x0
    // 0xadc70c: b.hs            #0xadc74c
    // 0xadc710: ArrayLoad: d0 = r3[0]  ; List_8
    //     0xadc710: ldur            s0, [x3, #0x17]
    // 0xadc714: fcvt            d1, s0
    // 0xadc718: r0 = inline_Allocate_Double()
    //     0xadc718: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xadc71c: add             x0, x0, #0x10
    //     0xadc720: cmp             x1, x0
    //     0xadc724: b.ls            #0xadc750
    //     0xadc728: str             x0, [THR, #0x50]  ; THR::top
    //     0xadc72c: sub             x0, x0, #0xf
    //     0xadc730: movz            x1, #0xe15c
    //     0xadc734: movk            x1, #0x3, lsl #16
    //     0xadc738: stur            x1, [x0, #-1]
    // 0xadc73c: StoreField: r0->field_7 = d1
    //     0xadc73c: stur            d1, [x0, #7]
    // 0xadc740: LeaveFrame
    //     0xadc740: mov             SP, fp
    //     0xadc744: ldp             fp, lr, [SP], #0x10
    // 0xadc748: ret
    //     0xadc748: ret             
    // 0xadc74c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadc74c: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xadc750: SaveReg d1
    //     0xadc750: str             q1, [SP, #-0x10]!
    // 0xadc754: r0 = AllocateDouble()
    //     0xadc754: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xadc758: RestoreReg d1
    //     0xadc758: ldr             q1, [SP], #0x10
    // 0xadc75c: b               #0xadc73c
  }
}

// class id: 952, size: 0xc, field offset: 0x8
class URa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb005dc, size: 0x3c
    // 0xb005dc: EnterFrame
    //     0xb005dc: stp             fp, lr, [SP, #-0x10]!
    //     0xb005e0: mov             fp, SP
    // 0xb005e4: ldr             x2, [fp, #0x10]
    // 0xb005e8: r1 = Function 'toInt':.
    //     0xb005e8: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eb00] AnonymousClosure: (0x779c7c), of [DJk] URa
    //     0xb005ec: ldr             x1, [x1, #0xb00]
    // 0xb005f0: r0 = AllocateClosure()
    //     0xb005f0: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb005f4: LeaveFrame
    //     0xb005f4: mov             SP, fp
    //     0xb005f8: ldp             fp, lr, [SP], #0x10
    // 0xb005fc: ret
    //     0xb005fc: ret             
  }
  int toInt(URa, [int]) {
    // ** addr: 0xadc89c, size: 0xc0
    // 0xadc89c: EnterFrame
    //     0xadc89c: stp             fp, lr, [SP, #-0x10]!
    //     0xadc8a0: mov             fp, SP
    // 0xadc8a4: AllocStack(0x18)
    //     0xadc8a4: sub             SP, SP, #0x18
    // 0xadc8a8: SetupParameters(URa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4, fp-0x8 */])
    //     0xadc8a8: ldur            w0, [x4, #0x13]
    //     0xadc8ac: sub             x1, x0, #2
    //     0xadc8b0: add             x3, fp, w1, sxtw #2
    //     0xadc8b4: ldr             x3, [x3, #0x10]
    //     0xadc8b8: stur            x3, [fp, #-0x10]
    //     0xadc8bc: cmp             w1, #2
    //     0xadc8c0: b.lt            #0xadc8d4
    //     0xadc8c4: add             x0, fp, w1, sxtw #2
    //     0xadc8c8: ldr             x0, [x0, #8]
    //     0xadc8cc: mov             x4, x0
    //     0xadc8d0: b               #0xadc8d8
    //     0xadc8d4: movz            x4, #0
    //     0xadc8d8: stur            x4, [fp, #-8]
    // 0xadc8dc: CheckStackOverflow
    //     0xadc8dc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadc8e0: cmp             SP, x16
    //     0xadc8e4: b.ls            #0xadc954
    // 0xadc8e8: r4 as int
    //     0xadc8e8: mov             x0, x4
    //     0xadc8ec: mov             x2, NULL
    //     0xadc8f0: mov             x1, NULL
    //     0xadc8f4: tbz             w0, #0, #0xadc91c
    //     0xadc8f8: ldur            x4, [x0, #-1]
    //     0xadc8fc: ubfx            x4, x4, #0xc, #0x14
    //     0xadc900: sub             x4, x4, #0x3c
    //     0xadc904: cmp             x4, #1
    //     0xadc908: b.ls            #0xadc91c
    //     0xadc90c: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    //     0xadc910: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb18] Null
    //     0xadc914: ldr             x3, [x3, #0xb18]
    //     0xadc918: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadc91c: ldur            x16, [fp, #-8]
    // 0xadc920: str             x16, [SP]
    // 0xadc924: ldur            x1, [fp, #-0x10]
    // 0xadc928: r4 = const [0, 0x2, 0x1, 0x2, null]
    //     0xadc928: ldr             x4, [PP, #0x16a0]  ; [pp+0x16a0] List(5) [0, 0x2, 0x1, 0x2, Null]
    // 0xadc92c: r0 = call 0xa3f6c8
    //     0xadc92c: bl              #0xa3f6c8
    // 0xadc930: mov             x2, x0
    // 0xadc934: r0 = BoxInt64Instr(r2)
    //     0xadc934: sbfiz           x0, x2, #1, #0x1f
    //     0xadc938: cmp             x2, x0, asr #1
    //     0xadc93c: b.eq            #0xadc948
    //     0xadc940: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xadc944: stur            x2, [x0, #7]
    // 0xadc948: LeaveFrame
    //     0xadc948: mov             SP, fp
    //     0xadc94c: ldp             fp, lr, [SP], #0x10
    // 0xadc950: ret
    //     0xadc950: ret             
    // 0xadc954: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadc954: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadc958: b               #0xadc8e8
  }
  double toDouble(URa, [int]) {
    // ** addr: 0xadc95c, size: 0xe0
    // 0xadc95c: EnterFrame
    //     0xadc95c: stp             fp, lr, [SP, #-0x10]!
    //     0xadc960: mov             fp, SP
    // 0xadc964: AllocStack(0x18)
    //     0xadc964: sub             SP, SP, #0x18
    // 0xadc968: SetupParameters(URa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4, fp-0x8 */])
    //     0xadc968: ldur            w0, [x4, #0x13]
    //     0xadc96c: sub             x1, x0, #2
    //     0xadc970: add             x3, fp, w1, sxtw #2
    //     0xadc974: ldr             x3, [x3, #0x10]
    //     0xadc978: stur            x3, [fp, #-0x10]
    //     0xadc97c: cmp             w1, #2
    //     0xadc980: b.lt            #0xadc994
    //     0xadc984: add             x0, fp, w1, sxtw #2
    //     0xadc988: ldr             x0, [x0, #8]
    //     0xadc98c: mov             x4, x0
    //     0xadc990: b               #0xadc998
    //     0xadc994: movz            x4, #0
    //     0xadc998: stur            x4, [fp, #-8]
    // 0xadc99c: CheckStackOverflow
    //     0xadc99c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadc9a0: cmp             SP, x16
    //     0xadc9a4: b.ls            #0xadca24
    // 0xadc9a8: r4 as int
    //     0xadc9a8: mov             x0, x4
    //     0xadc9ac: mov             x2, NULL
    //     0xadc9b0: mov             x1, NULL
    //     0xadc9b4: tbz             w0, #0, #0xadc9dc
    //     0xadc9b8: ldur            x4, [x0, #-1]
    //     0xadc9bc: ubfx            x4, x4, #0xc, #0x14
    //     0xadc9c0: sub             x4, x4, #0x3c
    //     0xadc9c4: cmp             x4, #1
    //     0xadc9c8: b.ls            #0xadc9dc
    //     0xadc9cc: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    //     0xadc9d0: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb08] Null
    //     0xadc9d4: ldr             x3, [x3, #0xb08]
    //     0xadc9d8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadc9dc: ldur            x16, [fp, #-8]
    // 0xadc9e0: str             x16, [SP]
    // 0xadc9e4: ldur            x1, [fp, #-0x10]
    // 0xadc9e8: r4 = const [0, 0x2, 0x1, 0x2, null]
    //     0xadc9e8: ldr             x4, [PP, #0x16a0]  ; [pp+0x16a0] List(5) [0, 0x2, 0x1, 0x2, Null]
    // 0xadc9ec: r0 = call 0x779c14
    //     0xadc9ec: bl              #0x779c14
    // 0xadc9f0: r0 = inline_Allocate_Double()
    //     0xadc9f0: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xadc9f4: add             x0, x0, #0x10
    //     0xadc9f8: cmp             x1, x0
    //     0xadc9fc: b.ls            #0xadca2c
    //     0xadca00: str             x0, [THR, #0x50]  ; THR::top
    //     0xadca04: sub             x0, x0, #0xf
    //     0xadca08: movz            x1, #0xe15c
    //     0xadca0c: movk            x1, #0x3, lsl #16
    //     0xadca10: stur            x1, [x0, #-1]
    // 0xadca14: StoreField: r0->field_7 = d0
    //     0xadca14: stur            d0, [x0, #7]
    // 0xadca18: LeaveFrame
    //     0xadca18: mov             SP, fp
    //     0xadca1c: ldp             fp, lr, [SP], #0x10
    // 0xadca20: ret
    //     0xadca20: ret             
    // 0xadca24: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadca24: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadca28: b               #0xadc9a8
    // 0xadca2c: SaveReg d0
    //     0xadca2c: str             q0, [SP, #-0x10]!
    // 0xadca30: r0 = AllocateDouble()
    //     0xadca30: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xadca34: RestoreReg d0
    //     0xadca34: ldr             q0, [SP], #0x10
    // 0xadca38: b               #0xadca14
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x779c7c, size: -0x1
  }
}

// class id: 953, size: 0xc, field offset: 0x8
class TRa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb005a0, size: 0x3c
    // 0xb005a0: EnterFrame
    //     0xb005a0: stp             fp, lr, [SP, #-0x10]!
    //     0xb005a4: mov             fp, SP
    // 0xb005a8: ldr             x2, [fp, #0x10]
    // 0xb005ac: r1 = Function 'toInt':.
    //     0xb005ac: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eac8] AnonymousClosure: (0x779e20), of [DJk] TRa
    //     0xb005b0: ldr             x1, [x1, #0xac8]
    // 0xb005b4: r0 = AllocateClosure()
    //     0xb005b4: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb005b8: LeaveFrame
    //     0xb005b8: mov             SP, fp
    //     0xb005bc: ldp             fp, lr, [SP], #0x10
    // 0xb005c0: ret
    //     0xb005c0: ret             
  }
  int toInt(TRa, [int]) {
    // ** addr: 0xadca48, size: 0x104
    // 0xadca48: EnterFrame
    //     0xadca48: stp             fp, lr, [SP, #-0x10]!
    //     0xadca4c: mov             fp, SP
    // 0xadca50: AllocStack(0x10)
    //     0xadca50: sub             SP, SP, #0x10
    // 0xadca54: SetupParameters(TRa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4 */])
    //     0xadca54: ldur            w0, [x4, #0x13]
    //     0xadca58: sub             x1, x0, #2
    //     0xadca5c: add             x3, fp, w1, sxtw #2
    //     0xadca60: ldr             x3, [x3, #0x10]
    //     0xadca64: stur            x3, [fp, #-0x10]
    //     0xadca68: cmp             w1, #2
    //     0xadca6c: b.lt            #0xadca80
    //     0xadca70: add             x0, fp, w1, sxtw #2
    //     0xadca74: ldr             x0, [x0, #8]
    //     0xadca78: mov             x4, x0
    //     0xadca7c: b               #0xadca84
    //     0xadca80: movz            x4, #0
    // 0xadca84: mov             x0, x4
    // 0xadca88: stur            x4, [fp, #-8]
    // 0xadca8c: r2 = Null
    //     0xadca8c: mov             x2, NULL
    // 0xadca90: r1 = Null
    //     0xadca90: mov             x1, NULL
    // 0xadca94: branchIfSmi(r0, 0xadcabc)
    //     0xadca94: tbz             w0, #0, #0xadcabc
    // 0xadca98: r4 = LoadClassIdInstr(r0)
    //     0xadca98: ldur            x4, [x0, #-1]
    //     0xadca9c: ubfx            x4, x4, #0xc, #0x14
    // 0xadcaa0: sub             x4, x4, #0x3c
    // 0xadcaa4: cmp             x4, #1
    // 0xadcaa8: b.ls            #0xadcabc
    // 0xadcaac: r8 = int
    //     0xadcaac: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadcab0: r3 = Null
    //     0xadcab0: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3ead0] Null
    //     0xadcab4: ldr             x3, [x3, #0xad0]
    // 0xadcab8: r0 = int()
    //     0xadcab8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadcabc: ldur            x2, [fp, #-0x10]
    // 0xadcac0: LoadField: r3 = r2->field_7
    //     0xadcac0: ldur            w3, [x2, #7]
    // 0xadcac4: DecompressPointer r3
    //     0xadcac4: add             x3, x3, HEAP, lsl #32
    // 0xadcac8: LoadField: r2 = r3->field_13
    //     0xadcac8: ldur            w2, [x3, #0x13]
    // 0xadcacc: ldur            x4, [fp, #-8]
    // 0xadcad0: r5 = LoadInt32Instr(r4)
    //     0xadcad0: sbfx            x5, x4, #1, #0x1f
    //     0xadcad4: tbz             w4, #0, #0xadcadc
    //     0xadcad8: ldur            x5, [x4, #7]
    // 0xadcadc: r0 = LoadInt32Instr(r2)
    //     0xadcadc: sbfx            x0, x2, #1, #0x1f
    // 0xadcae0: mov             x1, x5
    // 0xadcae4: cmp             x1, x0
    // 0xadcae8: b.hs            #0xadcb38
    // 0xadcaec: ArrayLoad: r1 = r3[r5]  ; TypedSigned_4
    //     0xadcaec: add             x16, x3, x5, lsl #2
    //     0xadcaf0: ldursw          x1, [x16, #0x17]
    // 0xadcaf4: sbfiz           x0, x1, #1, #0x1f
    // 0xadcaf8: cmp             w1, w0, asr #1
    // 0xadcafc: b.eq            #0xadcb2c
    // 0xadcb00: r0 = inline_Allocate_Mint()
    //     0xadcb00: ldp             x0, x2, [THR, #0x50]  ; THR::top
    //     0xadcb04: add             x0, x0, #0x10
    //     0xadcb08: cmp             x2, x0
    //     0xadcb0c: b.ls            #0xadcb3c
    //     0xadcb10: str             x0, [THR, #0x50]  ; THR::top
    //     0xadcb14: sub             x0, x0, #0xf
    //     0xadcb18: movz            x2, #0xd15c
    //     0xadcb1c: movk            x2, #0x3, lsl #16
    //     0xadcb20: stur            x2, [x0, #-1]
    // 0xadcb24: sxtw            x2, w1
    // 0xadcb28: StoreField: r0->field_7 = r2
    //     0xadcb28: stur            x2, [x0, #7]
    // 0xadcb2c: LeaveFrame
    //     0xadcb2c: mov             SP, fp
    //     0xadcb30: ldp             fp, lr, [SP], #0x10
    // 0xadcb34: ret
    //     0xadcb34: ret             
    // 0xadcb38: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadcb38: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xadcb3c: SaveReg r1
    //     0xadcb3c: str             x1, [SP, #-8]!
    // 0xadcb40: r0 = AllocateMint()
    //     0xadcb40: bl              #0xb29ae4  ; AllocateMintStub
    // 0xadcb44: RestoreReg r1
    //     0xadcb44: ldr             x1, [SP], #8
    // 0xadcb48: b               #0xadcb24
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x779e20, size: -0x1
  }
}

// class id: 954, size: 0xc, field offset: 0x8
class SRa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb00564, size: 0x3c
    // 0xb00564: EnterFrame
    //     0xb00564: stp             fp, lr, [SP, #-0x10]!
    //     0xb00568: mov             fp, SP
    // 0xb0056c: ldr             x2, [fp, #0x10]
    // 0xb00570: r1 = Function 'toInt':.
    //     0xb00570: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eae0] AnonymousClosure: (0x77a250), of [DJk] SRa
    //     0xb00574: ldr             x1, [x1, #0xae0]
    // 0xb00578: r0 = AllocateClosure()
    //     0xb00578: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb0057c: LeaveFrame
    //     0xb0057c: mov             SP, fp
    //     0xb00580: ldp             fp, lr, [SP], #0x10
    // 0xb00584: ret
    //     0xb00584: ret             
  }
  int toInt(SRa, [int]) {
    // ** addr: 0xadcc00, size: 0xc0
    // 0xadcc00: EnterFrame
    //     0xadcc00: stp             fp, lr, [SP, #-0x10]!
    //     0xadcc04: mov             fp, SP
    // 0xadcc08: AllocStack(0x10)
    //     0xadcc08: sub             SP, SP, #0x10
    // 0xadcc0c: SetupParameters(SRa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4 */])
    //     0xadcc0c: ldur            w0, [x4, #0x13]
    //     0xadcc10: sub             x1, x0, #2
    //     0xadcc14: add             x3, fp, w1, sxtw #2
    //     0xadcc18: ldr             x3, [x3, #0x10]
    //     0xadcc1c: stur            x3, [fp, #-0x10]
    //     0xadcc20: cmp             w1, #2
    //     0xadcc24: b.lt            #0xadcc38
    //     0xadcc28: add             x0, fp, w1, sxtw #2
    //     0xadcc2c: ldr             x0, [x0, #8]
    //     0xadcc30: mov             x4, x0
    //     0xadcc34: b               #0xadcc3c
    //     0xadcc38: movz            x4, #0
    // 0xadcc3c: mov             x0, x4
    // 0xadcc40: stur            x4, [fp, #-8]
    // 0xadcc44: r2 = Null
    //     0xadcc44: mov             x2, NULL
    // 0xadcc48: r1 = Null
    //     0xadcc48: mov             x1, NULL
    // 0xadcc4c: branchIfSmi(r0, 0xadcc74)
    //     0xadcc4c: tbz             w0, #0, #0xadcc74
    // 0xadcc50: r4 = LoadClassIdInstr(r0)
    //     0xadcc50: ldur            x4, [x0, #-1]
    //     0xadcc54: ubfx            x4, x4, #0xc, #0x14
    // 0xadcc58: sub             x4, x4, #0x3c
    // 0xadcc5c: cmp             x4, #1
    // 0xadcc60: b.ls            #0xadcc74
    // 0xadcc64: r8 = int
    //     0xadcc64: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadcc68: r3 = Null
    //     0xadcc68: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eae8] Null
    //     0xadcc6c: ldr             x3, [x3, #0xae8]
    // 0xadcc70: r0 = int()
    //     0xadcc70: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadcc74: ldur            x2, [fp, #-0x10]
    // 0xadcc78: LoadField: r3 = r2->field_7
    //     0xadcc78: ldur            w3, [x2, #7]
    // 0xadcc7c: DecompressPointer r3
    //     0xadcc7c: add             x3, x3, HEAP, lsl #32
    // 0xadcc80: LoadField: r2 = r3->field_13
    //     0xadcc80: ldur            w2, [x3, #0x13]
    // 0xadcc84: ldur            x4, [fp, #-8]
    // 0xadcc88: r5 = LoadInt32Instr(r4)
    //     0xadcc88: sbfx            x5, x4, #1, #0x1f
    //     0xadcc8c: tbz             w4, #0, #0xadcc94
    //     0xadcc90: ldur            x5, [x4, #7]
    // 0xadcc94: r0 = LoadInt32Instr(r2)
    //     0xadcc94: sbfx            x0, x2, #1, #0x1f
    // 0xadcc98: mov             x1, x5
    // 0xadcc9c: cmp             x1, x0
    // 0xadcca0: b.hs            #0xadccbc
    // 0xadcca4: ArrayLoad: r1 = r3[r5]  ; TypedSigned_2
    //     0xadcca4: add             x16, x3, x5, lsl #1
    //     0xadcca8: ldursh          x1, [x16, #0x17]
    // 0xadccac: lsl             x0, x1, #1
    // 0xadccb0: LeaveFrame
    //     0xadccb0: mov             SP, fp
    //     0xadccb4: ldp             fp, lr, [SP], #0x10
    // 0xadccb8: ret
    //     0xadccb8: ret             
    // 0xadccbc: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadccbc: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x77a250, size: -0x1
  }
}

// class id: 955, size: 0xc, field offset: 0x8
class RRa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb00528, size: 0x3c
    // 0xb00528: EnterFrame
    //     0xb00528: stp             fp, lr, [SP, #-0x10]!
    //     0xb0052c: mov             fp, SP
    // 0xb00530: ldr             x2, [fp, #0x10]
    // 0xb00534: r1 = Function 'toInt':.
    //     0xb00534: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3ea98] AnonymousClosure: (0x77a948), of [DJk] RRa
    //     0xb00538: ldr             x1, [x1, #0xa98]
    // 0xb0053c: r0 = AllocateClosure()
    //     0xb0053c: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb00540: LeaveFrame
    //     0xb00540: mov             SP, fp
    //     0xb00544: ldp             fp, lr, [SP], #0x10
    // 0xb00548: ret
    //     0xb00548: ret             
  }
  int toInt(RRa, [int]) {
    // ** addr: 0xadcccc, size: 0xc0
    // 0xadcccc: EnterFrame
    //     0xadcccc: stp             fp, lr, [SP, #-0x10]!
    //     0xadccd0: mov             fp, SP
    // 0xadccd4: AllocStack(0x10)
    //     0xadccd4: sub             SP, SP, #0x10
    // 0xadccd8: SetupParameters(RRa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4 */])
    //     0xadccd8: ldur            w0, [x4, #0x13]
    //     0xadccdc: sub             x1, x0, #2
    //     0xadcce0: add             x3, fp, w1, sxtw #2
    //     0xadcce4: ldr             x3, [x3, #0x10]
    //     0xadcce8: stur            x3, [fp, #-0x10]
    //     0xadccec: cmp             w1, #2
    //     0xadccf0: b.lt            #0xadcd04
    //     0xadccf4: add             x0, fp, w1, sxtw #2
    //     0xadccf8: ldr             x0, [x0, #8]
    //     0xadccfc: mov             x4, x0
    //     0xadcd00: b               #0xadcd08
    //     0xadcd04: movz            x4, #0
    // 0xadcd08: mov             x0, x4
    // 0xadcd0c: stur            x4, [fp, #-8]
    // 0xadcd10: r2 = Null
    //     0xadcd10: mov             x2, NULL
    // 0xadcd14: r1 = Null
    //     0xadcd14: mov             x1, NULL
    // 0xadcd18: branchIfSmi(r0, 0xadcd40)
    //     0xadcd18: tbz             w0, #0, #0xadcd40
    // 0xadcd1c: r4 = LoadClassIdInstr(r0)
    //     0xadcd1c: ldur            x4, [x0, #-1]
    //     0xadcd20: ubfx            x4, x4, #0xc, #0x14
    // 0xadcd24: sub             x4, x4, #0x3c
    // 0xadcd28: cmp             x4, #1
    // 0xadcd2c: b.ls            #0xadcd40
    // 0xadcd30: r8 = int
    //     0xadcd30: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadcd34: r3 = Null
    //     0xadcd34: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eaa0] Null
    //     0xadcd38: ldr             x3, [x3, #0xaa0]
    // 0xadcd3c: r0 = int()
    //     0xadcd3c: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadcd40: ldur            x2, [fp, #-0x10]
    // 0xadcd44: LoadField: r3 = r2->field_7
    //     0xadcd44: ldur            w3, [x2, #7]
    // 0xadcd48: DecompressPointer r3
    //     0xadcd48: add             x3, x3, HEAP, lsl #32
    // 0xadcd4c: LoadField: r2 = r3->field_13
    //     0xadcd4c: ldur            w2, [x3, #0x13]
    // 0xadcd50: ldur            x4, [fp, #-8]
    // 0xadcd54: r5 = LoadInt32Instr(r4)
    //     0xadcd54: sbfx            x5, x4, #1, #0x1f
    //     0xadcd58: tbz             w4, #0, #0xadcd60
    //     0xadcd5c: ldur            x5, [x4, #7]
    // 0xadcd60: r0 = LoadInt32Instr(r2)
    //     0xadcd60: sbfx            x0, x2, #1, #0x1f
    // 0xadcd64: mov             x1, x5
    // 0xadcd68: cmp             x1, x0
    // 0xadcd6c: b.hs            #0xadcd88
    // 0xadcd70: ArrayLoad: r1 = r3[r5]  ; TypedSigned_1
    //     0xadcd70: add             x16, x3, x5
    //     0xadcd74: ldrsb           x1, [x16, #0x17]
    // 0xadcd78: lsl             x0, x1, #1
    // 0xadcd7c: LeaveFrame
    //     0xadcd7c: mov             SP, fp
    //     0xadcd80: ldp             fp, lr, [SP], #0x10
    // 0xadcd84: ret
    //     0xadcd84: ret             
    // 0xadcd88: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadcd88: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x77a948, size: -0x1
  }
}

// class id: 956, size: 0xc, field offset: 0x8
class QRa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb004ec, size: 0x3c
    // 0xb004ec: EnterFrame
    //     0xb004ec: stp             fp, lr, [SP, #-0x10]!
    //     0xb004f0: mov             fp, SP
    // 0xb004f4: ldr             x2, [fp, #0x10]
    // 0xb004f8: r1 = Function 'toInt':.
    //     0xb004f8: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eb78] AnonymousClosure: (0x77ab00), of [DJk] QRa
    //     0xb004fc: ldr             x1, [x1, #0xb78]
    // 0xb00500: r0 = AllocateClosure()
    //     0xb00500: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb00504: LeaveFrame
    //     0xb00504: mov             SP, fp
    //     0xb00508: ldp             fp, lr, [SP], #0x10
    // 0xb0050c: ret
    //     0xb0050c: ret             
  }
  int toInt(QRa, [int]) {
    // ** addr: 0xadcd98, size: 0xc0
    // 0xadcd98: EnterFrame
    //     0xadcd98: stp             fp, lr, [SP, #-0x10]!
    //     0xadcd9c: mov             fp, SP
    // 0xadcda0: AllocStack(0x18)
    //     0xadcda0: sub             SP, SP, #0x18
    // 0xadcda4: SetupParameters(QRa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4, fp-0x8 */])
    //     0xadcda4: ldur            w0, [x4, #0x13]
    //     0xadcda8: sub             x1, x0, #2
    //     0xadcdac: add             x3, fp, w1, sxtw #2
    //     0xadcdb0: ldr             x3, [x3, #0x10]
    //     0xadcdb4: stur            x3, [fp, #-0x10]
    //     0xadcdb8: cmp             w1, #2
    //     0xadcdbc: b.lt            #0xadcdd0
    //     0xadcdc0: add             x0, fp, w1, sxtw #2
    //     0xadcdc4: ldr             x0, [x0, #8]
    //     0xadcdc8: mov             x4, x0
    //     0xadcdcc: b               #0xadcdd4
    //     0xadcdd0: movz            x4, #0
    //     0xadcdd4: stur            x4, [fp, #-8]
    // 0xadcdd8: CheckStackOverflow
    //     0xadcdd8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadcddc: cmp             SP, x16
    //     0xadcde0: b.ls            #0xadce50
    // 0xadcde4: r4 as int
    //     0xadcde4: mov             x0, x4
    //     0xadcde8: mov             x2, NULL
    //     0xadcdec: mov             x1, NULL
    //     0xadcdf0: tbz             w0, #0, #0xadce18
    //     0xadcdf4: ldur            x4, [x0, #-1]
    //     0xadcdf8: ubfx            x4, x4, #0xc, #0x14
    //     0xadcdfc: sub             x4, x4, #0x3c
    //     0xadce00: cmp             x4, #1
    //     0xadce04: b.ls            #0xadce18
    //     0xadce08: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    //     0xadce0c: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb90] Null
    //     0xadce10: ldr             x3, [x3, #0xb90]
    //     0xadce14: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadce18: ldur            x16, [fp, #-8]
    // 0xadce1c: str             x16, [SP]
    // 0xadce20: ldur            x1, [fp, #-0x10]
    // 0xadce24: r4 = const [0, 0x2, 0x1, 0x2, null]
    //     0xadce24: ldr             x4, [PP, #0x16a0]  ; [pp+0x16a0] List(5) [0, 0x2, 0x1, 0x2, Null]
    // 0xadce28: r0 = call 0xa3f6c8
    //     0xadce28: bl              #0xa3f6c8
    // 0xadce2c: mov             x2, x0
    // 0xadce30: r0 = BoxInt64Instr(r2)
    //     0xadce30: sbfiz           x0, x2, #1, #0x1f
    //     0xadce34: cmp             x2, x0, asr #1
    //     0xadce38: b.eq            #0xadce44
    //     0xadce3c: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xadce40: stur            x2, [x0, #7]
    // 0xadce44: LeaveFrame
    //     0xadce44: mov             SP, fp
    //     0xadce48: ldp             fp, lr, [SP], #0x10
    // 0xadce4c: ret
    //     0xadce4c: ret             
    // 0xadce50: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadce50: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadce54: b               #0xadcde4
  }
  double toDouble(QRa, [int]) {
    // ** addr: 0xadce58, size: 0xe0
    // 0xadce58: EnterFrame
    //     0xadce58: stp             fp, lr, [SP, #-0x10]!
    //     0xadce5c: mov             fp, SP
    // 0xadce60: AllocStack(0x18)
    //     0xadce60: sub             SP, SP, #0x18
    // 0xadce64: SetupParameters(QRa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4, fp-0x8 */])
    //     0xadce64: ldur            w0, [x4, #0x13]
    //     0xadce68: sub             x1, x0, #2
    //     0xadce6c: add             x3, fp, w1, sxtw #2
    //     0xadce70: ldr             x3, [x3, #0x10]
    //     0xadce74: stur            x3, [fp, #-0x10]
    //     0xadce78: cmp             w1, #2
    //     0xadce7c: b.lt            #0xadce90
    //     0xadce80: add             x0, fp, w1, sxtw #2
    //     0xadce84: ldr             x0, [x0, #8]
    //     0xadce88: mov             x4, x0
    //     0xadce8c: b               #0xadce94
    //     0xadce90: movz            x4, #0
    //     0xadce94: stur            x4, [fp, #-8]
    // 0xadce98: CheckStackOverflow
    //     0xadce98: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadce9c: cmp             SP, x16
    //     0xadcea0: b.ls            #0xadcf20
    // 0xadcea4: r4 as int
    //     0xadcea4: mov             x0, x4
    //     0xadcea8: mov             x2, NULL
    //     0xadceac: mov             x1, NULL
    //     0xadceb0: tbz             w0, #0, #0xadced8
    //     0xadceb4: ldur            x4, [x0, #-1]
    //     0xadceb8: ubfx            x4, x4, #0xc, #0x14
    //     0xadcebc: sub             x4, x4, #0x3c
    //     0xadcec0: cmp             x4, #1
    //     0xadcec4: b.ls            #0xadced8
    //     0xadcec8: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    //     0xadcecc: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb80] Null
    //     0xadced0: ldr             x3, [x3, #0xb80]
    //     0xadced4: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadced8: ldur            x16, [fp, #-8]
    // 0xadcedc: str             x16, [SP]
    // 0xadcee0: ldur            x1, [fp, #-0x10]
    // 0xadcee4: r4 = const [0, 0x2, 0x1, 0x2, null]
    //     0xadcee4: ldr             x4, [PP, #0x16a0]  ; [pp+0x16a0] List(5) [0, 0x2, 0x1, 0x2, Null]
    // 0xadcee8: r0 = call 0x779c14
    //     0xadcee8: bl              #0x779c14
    // 0xadceec: r0 = inline_Allocate_Double()
    //     0xadceec: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xadcef0: add             x0, x0, #0x10
    //     0xadcef4: cmp             x1, x0
    //     0xadcef8: b.ls            #0xadcf28
    //     0xadcefc: str             x0, [THR, #0x50]  ; THR::top
    //     0xadcf00: sub             x0, x0, #0xf
    //     0xadcf04: movz            x1, #0xe15c
    //     0xadcf08: movk            x1, #0x3, lsl #16
    //     0xadcf0c: stur            x1, [x0, #-1]
    // 0xadcf10: StoreField: r0->field_7 = d0
    //     0xadcf10: stur            d0, [x0, #7]
    // 0xadcf14: LeaveFrame
    //     0xadcf14: mov             SP, fp
    //     0xadcf18: ldp             fp, lr, [SP], #0x10
    // 0xadcf1c: ret
    //     0xadcf1c: ret             
    // 0xadcf20: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadcf20: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadcf24: b               #0xadcea4
    // 0xadcf28: SaveReg d0
    //     0xadcf28: str             q0, [SP, #-0x10]!
    // 0xadcf2c: r0 = AllocateDouble()
    //     0xadcf2c: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xadcf30: RestoreReg d0
    //     0xadcf30: ldr             q0, [SP], #0x10
    // 0xadcf34: b               #0xadcf10
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x77ab00, size: -0x1
  }
}

// class id: 957, size: 0xc, field offset: 0x8
class PRa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb004b0, size: 0x3c
    // 0xb004b0: EnterFrame
    //     0xb004b0: stp             fp, lr, [SP, #-0x10]!
    //     0xb004b4: mov             fp, SP
    // 0xb004b8: ldr             x2, [fp, #0x10]
    // 0xb004bc: r1 = Function 'toInt':.
    //     0xb004bc: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eb38] AnonymousClosure: (0x77ac9c), of [DJk] PRa
    //     0xb004c0: ldr             x1, [x1, #0xb38]
    // 0xb004c4: r0 = AllocateClosure()
    //     0xb004c4: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb004c8: LeaveFrame
    //     0xb004c8: mov             SP, fp
    //     0xb004cc: ldp             fp, lr, [SP], #0x10
    // 0xb004d0: ret
    //     0xb004d0: ret             
  }
  int toInt(PRa, [int]) {
    // ** addr: 0xadcf44, size: 0x104
    // 0xadcf44: EnterFrame
    //     0xadcf44: stp             fp, lr, [SP, #-0x10]!
    //     0xadcf48: mov             fp, SP
    // 0xadcf4c: AllocStack(0x10)
    //     0xadcf4c: sub             SP, SP, #0x10
    // 0xadcf50: SetupParameters(PRa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4 */])
    //     0xadcf50: ldur            w0, [x4, #0x13]
    //     0xadcf54: sub             x1, x0, #2
    //     0xadcf58: add             x3, fp, w1, sxtw #2
    //     0xadcf5c: ldr             x3, [x3, #0x10]
    //     0xadcf60: stur            x3, [fp, #-0x10]
    //     0xadcf64: cmp             w1, #2
    //     0xadcf68: b.lt            #0xadcf7c
    //     0xadcf6c: add             x0, fp, w1, sxtw #2
    //     0xadcf70: ldr             x0, [x0, #8]
    //     0xadcf74: mov             x4, x0
    //     0xadcf78: b               #0xadcf80
    //     0xadcf7c: movz            x4, #0
    // 0xadcf80: mov             x0, x4
    // 0xadcf84: stur            x4, [fp, #-8]
    // 0xadcf88: r2 = Null
    //     0xadcf88: mov             x2, NULL
    // 0xadcf8c: r1 = Null
    //     0xadcf8c: mov             x1, NULL
    // 0xadcf90: branchIfSmi(r0, 0xadcfb8)
    //     0xadcf90: tbz             w0, #0, #0xadcfb8
    // 0xadcf94: r4 = LoadClassIdInstr(r0)
    //     0xadcf94: ldur            x4, [x0, #-1]
    //     0xadcf98: ubfx            x4, x4, #0xc, #0x14
    // 0xadcf9c: sub             x4, x4, #0x3c
    // 0xadcfa0: cmp             x4, #1
    // 0xadcfa4: b.ls            #0xadcfb8
    // 0xadcfa8: r8 = int
    //     0xadcfa8: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadcfac: r3 = Null
    //     0xadcfac: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eb40] Null
    //     0xadcfb0: ldr             x3, [x3, #0xb40]
    // 0xadcfb4: r0 = int()
    //     0xadcfb4: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadcfb8: ldur            x2, [fp, #-0x10]
    // 0xadcfbc: LoadField: r3 = r2->field_7
    //     0xadcfbc: ldur            w3, [x2, #7]
    // 0xadcfc0: DecompressPointer r3
    //     0xadcfc0: add             x3, x3, HEAP, lsl #32
    // 0xadcfc4: LoadField: r2 = r3->field_13
    //     0xadcfc4: ldur            w2, [x3, #0x13]
    // 0xadcfc8: ldur            x4, [fp, #-8]
    // 0xadcfcc: r5 = LoadInt32Instr(r4)
    //     0xadcfcc: sbfx            x5, x4, #1, #0x1f
    //     0xadcfd0: tbz             w4, #0, #0xadcfd8
    //     0xadcfd4: ldur            x5, [x4, #7]
    // 0xadcfd8: r0 = LoadInt32Instr(r2)
    //     0xadcfd8: sbfx            x0, x2, #1, #0x1f
    // 0xadcfdc: mov             x1, x5
    // 0xadcfe0: cmp             x1, x0
    // 0xadcfe4: b.hs            #0xadd034
    // 0xadcfe8: ArrayLoad: r1 = r3[r5]  ; List_4
    //     0xadcfe8: add             x16, x3, x5, lsl #2
    //     0xadcfec: ldur            w1, [x16, #0x17]
    // 0xadcff0: lsl             w0, w1, #1
    // 0xadcff4: tst             x1, #0xc0000000
    // 0xadcff8: b.eq            #0xadd028
    // 0xadcffc: r0 = inline_Allocate_Mint()
    //     0xadcffc: ldp             x0, x2, [THR, #0x50]  ; THR::top
    //     0xadd000: add             x0, x0, #0x10
    //     0xadd004: cmp             x2, x0
    //     0xadd008: b.ls            #0xadd038
    //     0xadd00c: str             x0, [THR, #0x50]  ; THR::top
    //     0xadd010: sub             x0, x0, #0xf
    //     0xadd014: movz            x2, #0xd15c
    //     0xadd018: movk            x2, #0x3, lsl #16
    //     0xadd01c: stur            x2, [x0, #-1]
    // 0xadd020: ubfx            x2, x1, #0, #0x20
    // 0xadd024: StoreField: r0->field_7 = r2
    //     0xadd024: stur            x2, [x0, #7]
    // 0xadd028: LeaveFrame
    //     0xadd028: mov             SP, fp
    //     0xadd02c: ldp             fp, lr, [SP], #0x10
    // 0xadd030: ret
    //     0xadd030: ret             
    // 0xadd034: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadd034: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xadd038: SaveReg r1
    //     0xadd038: str             x1, [SP, #-8]!
    // 0xadd03c: r0 = AllocateMint()
    //     0xadd03c: bl              #0xb29ae4  ; AllocateMintStub
    // 0xadd040: RestoreReg r1
    //     0xadd040: ldr             x1, [SP], #8
    // 0xadd044: b               #0xadd020
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x77ac9c, size: -0x1
  }
}

// class id: 958, size: 0xc, field offset: 0x8
class ORa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb00474, size: 0x3c
    // 0xb00474: EnterFrame
    //     0xb00474: stp             fp, lr, [SP, #-0x10]!
    //     0xb00478: mov             fp, SP
    // 0xb0047c: ldr             x2, [fp, #0x10]
    // 0xb00480: r1 = Function 'toInt':.
    //     0xb00480: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eba0] AnonymousClosure: (0x77ae4c), of [DJk] ORa
    //     0xb00484: ldr             x1, [x1, #0xba0]
    // 0xb00488: r0 = AllocateClosure()
    //     0xb00488: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb0048c: LeaveFrame
    //     0xb0048c: mov             SP, fp
    //     0xb00490: ldp             fp, lr, [SP], #0x10
    // 0xb00494: ret
    //     0xb00494: ret             
  }
  int toInt(ORa, [int]) {
    // ** addr: 0xadd054, size: 0xc0
    // 0xadd054: EnterFrame
    //     0xadd054: stp             fp, lr, [SP, #-0x10]!
    //     0xadd058: mov             fp, SP
    // 0xadd05c: AllocStack(0x10)
    //     0xadd05c: sub             SP, SP, #0x10
    // 0xadd060: SetupParameters(ORa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4 */])
    //     0xadd060: ldur            w0, [x4, #0x13]
    //     0xadd064: sub             x1, x0, #2
    //     0xadd068: add             x3, fp, w1, sxtw #2
    //     0xadd06c: ldr             x3, [x3, #0x10]
    //     0xadd070: stur            x3, [fp, #-0x10]
    //     0xadd074: cmp             w1, #2
    //     0xadd078: b.lt            #0xadd08c
    //     0xadd07c: add             x0, fp, w1, sxtw #2
    //     0xadd080: ldr             x0, [x0, #8]
    //     0xadd084: mov             x4, x0
    //     0xadd088: b               #0xadd090
    //     0xadd08c: movz            x4, #0
    // 0xadd090: mov             x0, x4
    // 0xadd094: stur            x4, [fp, #-8]
    // 0xadd098: r2 = Null
    //     0xadd098: mov             x2, NULL
    // 0xadd09c: r1 = Null
    //     0xadd09c: mov             x1, NULL
    // 0xadd0a0: branchIfSmi(r0, 0xadd0c8)
    //     0xadd0a0: tbz             w0, #0, #0xadd0c8
    // 0xadd0a4: r4 = LoadClassIdInstr(r0)
    //     0xadd0a4: ldur            x4, [x0, #-1]
    //     0xadd0a8: ubfx            x4, x4, #0xc, #0x14
    // 0xadd0ac: sub             x4, x4, #0x3c
    // 0xadd0b0: cmp             x4, #1
    // 0xadd0b4: b.ls            #0xadd0c8
    // 0xadd0b8: r8 = int
    //     0xadd0b8: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadd0bc: r3 = Null
    //     0xadd0bc: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eba8] Null
    //     0xadd0c0: ldr             x3, [x3, #0xba8]
    // 0xadd0c4: r0 = int()
    //     0xadd0c4: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadd0c8: ldur            x2, [fp, #-0x10]
    // 0xadd0cc: LoadField: r3 = r2->field_7
    //     0xadd0cc: ldur            w3, [x2, #7]
    // 0xadd0d0: DecompressPointer r3
    //     0xadd0d0: add             x3, x3, HEAP, lsl #32
    // 0xadd0d4: LoadField: r2 = r3->field_13
    //     0xadd0d4: ldur            w2, [x3, #0x13]
    // 0xadd0d8: ldur            x4, [fp, #-8]
    // 0xadd0dc: r5 = LoadInt32Instr(r4)
    //     0xadd0dc: sbfx            x5, x4, #1, #0x1f
    //     0xadd0e0: tbz             w4, #0, #0xadd0e8
    //     0xadd0e4: ldur            x5, [x4, #7]
    // 0xadd0e8: r0 = LoadInt32Instr(r2)
    //     0xadd0e8: sbfx            x0, x2, #1, #0x1f
    // 0xadd0ec: mov             x1, x5
    // 0xadd0f0: cmp             x1, x0
    // 0xadd0f4: b.hs            #0xadd110
    // 0xadd0f8: add             x16, x3, x5, lsl #1
    // 0xadd0fc: ldurh           w1, [x16, #0x17]
    // 0xadd100: lsl             x0, x1, #1
    // 0xadd104: LeaveFrame
    //     0xadd104: mov             SP, fp
    //     0xadd108: ldp             fp, lr, [SP], #0x10
    // 0xadd10c: ret
    //     0xadd10c: ret             
    // 0xadd110: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadd110: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x77ae4c, size: -0x1
  }
}

// class id: 959, size: 0xc, field offset: 0x8
class NRa extends LRa {
}

// class id: 960, size: 0xc, field offset: 0x8
class MRa extends LRa {

  dynamic toInt(dynamic) {
    // ** addr: 0xb00438, size: 0x3c
    // 0xb00438: EnterFrame
    //     0xb00438: stp             fp, lr, [SP, #-0x10]!
    //     0xb0043c: mov             fp, SP
    // 0xb00440: ldr             x2, [fp, #0x10]
    // 0xb00444: r1 = Function 'toInt':.
    //     0xb00444: add             x1, PP, #0x3e, lsl #12  ; [pp+0x3eab0] AnonymousClosure: (0x77b1f0), of [DJk] MRa
    //     0xb00448: ldr             x1, [x1, #0xab0]
    // 0xb0044c: r0 = AllocateClosure()
    //     0xb0044c: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb00450: LeaveFrame
    //     0xb00450: mov             SP, fp
    //     0xb00454: ldp             fp, lr, [SP], #0x10
    // 0xb00458: ret
    //     0xb00458: ret             
  }
  int toInt(MRa, [int]) {
    // ** addr: 0xadd138, size: 0xc0
    // 0xadd138: EnterFrame
    //     0xadd138: stp             fp, lr, [SP, #-0x10]!
    //     0xadd13c: mov             fp, SP
    // 0xadd140: AllocStack(0x10)
    //     0xadd140: sub             SP, SP, #0x10
    // 0xadd144: SetupParameters(MRa this /* r3, fp-0x10 */, [dynamic _ = 0 /* r4 */])
    //     0xadd144: ldur            w0, [x4, #0x13]
    //     0xadd148: sub             x1, x0, #2
    //     0xadd14c: add             x3, fp, w1, sxtw #2
    //     0xadd150: ldr             x3, [x3, #0x10]
    //     0xadd154: stur            x3, [fp, #-0x10]
    //     0xadd158: cmp             w1, #2
    //     0xadd15c: b.lt            #0xadd170
    //     0xadd160: add             x0, fp, w1, sxtw #2
    //     0xadd164: ldr             x0, [x0, #8]
    //     0xadd168: mov             x4, x0
    //     0xadd16c: b               #0xadd174
    //     0xadd170: movz            x4, #0
    // 0xadd174: mov             x0, x4
    // 0xadd178: stur            x4, [fp, #-8]
    // 0xadd17c: r2 = Null
    //     0xadd17c: mov             x2, NULL
    // 0xadd180: r1 = Null
    //     0xadd180: mov             x1, NULL
    // 0xadd184: branchIfSmi(r0, 0xadd1ac)
    //     0xadd184: tbz             w0, #0, #0xadd1ac
    // 0xadd188: r4 = LoadClassIdInstr(r0)
    //     0xadd188: ldur            x4, [x0, #-1]
    //     0xadd18c: ubfx            x4, x4, #0xc, #0x14
    // 0xadd190: sub             x4, x4, #0x3c
    // 0xadd194: cmp             x4, #1
    // 0xadd198: b.ls            #0xadd1ac
    // 0xadd19c: r8 = int
    //     0xadd19c: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xadd1a0: r3 = Null
    //     0xadd1a0: add             x3, PP, #0x3e, lsl #12  ; [pp+0x3eab8] Null
    //     0xadd1a4: ldr             x3, [x3, #0xab8]
    // 0xadd1a8: r0 = int()
    //     0xadd1a8: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xadd1ac: ldur            x2, [fp, #-0x10]
    // 0xadd1b0: LoadField: r3 = r2->field_7
    //     0xadd1b0: ldur            w3, [x2, #7]
    // 0xadd1b4: DecompressPointer r3
    //     0xadd1b4: add             x3, x3, HEAP, lsl #32
    // 0xadd1b8: LoadField: r2 = r3->field_13
    //     0xadd1b8: ldur            w2, [x3, #0x13]
    // 0xadd1bc: ldur            x4, [fp, #-8]
    // 0xadd1c0: r5 = LoadInt32Instr(r4)
    //     0xadd1c0: sbfx            x5, x4, #1, #0x1f
    //     0xadd1c4: tbz             w4, #0, #0xadd1cc
    //     0xadd1c8: ldur            x5, [x4, #7]
    // 0xadd1cc: r0 = LoadInt32Instr(r2)
    //     0xadd1cc: sbfx            x0, x2, #1, #0x1f
    // 0xadd1d0: mov             x1, x5
    // 0xadd1d4: cmp             x1, x0
    // 0xadd1d8: b.hs            #0xadd1f4
    // 0xadd1dc: ArrayLoad: r1 = r3[r5]  ; List_1
    //     0xadd1dc: add             x16, x3, x5
    //     0xadd1e0: ldrb            w1, [x16, #0x17]
    // 0xadd1e4: lsl             x0, x1, #1
    // 0xadd1e8: LeaveFrame
    //     0xadd1e8: mov             SP, fp
    //     0xadd1ec: ldp             fp, lr, [SP], #0x10
    // 0xadd1f0: ret
    //     0xadd1f0: ret             
    // 0xadd1f4: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xadd1f4: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] int toInt(dynamic, [int]) {
    // ** addr: 0x77b1f0, size: -0x1
  }
}

// class id: 5881, size: 0x14, field offset: 0x14
enum KRa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
