// lib: uXk, url: KTk

// class id: 1050341, size: 0x8
class :: {
}

// class id: 318, size: 0xc, field offset: 0x8
class Qhb extends Object
    implements Phb {

  Qhb -(Qhb, Qhb) {
    // ** addr: 0xafffc4, size: 0x84
    // 0xafffc4: EnterFrame
    //     0xafffc4: stp             fp, lr, [SP, #-0x10]!
    //     0xafffc8: mov             fp, SP
    // 0xafffcc: CheckStackOverflow
    //     0xafffcc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xafffd0: cmp             SP, x16
    //     0xafffd4: b.ls            #0xb00028
    // 0xafffd8: ldr             x0, [fp, #0x10]
    // 0xafffdc: r2 = Null
    //     0xafffdc: mov             x2, NULL
    // 0xafffe0: r1 = Null
    //     0xafffe0: mov             x1, NULL
    // 0xafffe4: r4 = 60
    //     0xafffe4: movz            x4, #0x3c
    // 0xafffe8: branchIfSmi(r0, 0xaffff4)
    //     0xafffe8: tbz             w0, #0, #0xaffff4
    // 0xafffec: r4 = LoadClassIdInstr(r0)
    //     0xafffec: ldur            x4, [x0, #-1]
    //     0xaffff0: ubfx            x4, x4, #0xc, #0x14
    // 0xaffff4: cmp             x4, #0x13e
    // 0xaffff8: b.eq            #0xb00010
    // 0xaffffc: r8 = Qhb
    //     0xaffffc: add             x8, PP, #0x35, lsl #12  ; [pp+0x35dd8] Type: Qhb
    //     0xb00000: ldr             x8, [x8, #0xdd8]
    // 0xb00004: r3 = Null
    //     0xb00004: add             x3, PP, #0x35, lsl #12  ; [pp+0x35df0] Null
    //     0xb00008: ldr             x3, [x3, #0xdf0]
    // 0xb0000c: r0 = DefaultTypeTest()
    //     0xb0000c: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xb00010: ldr             x1, [fp, #0x18]
    // 0xb00014: ldr             x2, [fp, #0x10]
    // 0xb00018: r0 = call 0x88d908
    //     0xb00018: bl              #0x88d908
    // 0xb0001c: LeaveFrame
    //     0xb0001c: mov             SP, fp
    //     0xb00020: ldp             fp, lr, [SP], #0x10
    // 0xb00024: ret
    //     0xb00024: ret             
    // 0xb00028: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb00028: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb0002c: b               #0xafffd8
  }
  Qhb +(Qhb, Qhb) {
    // ** addr: 0xb00048, size: 0x84
    // 0xb00048: EnterFrame
    //     0xb00048: stp             fp, lr, [SP, #-0x10]!
    //     0xb0004c: mov             fp, SP
    // 0xb00050: CheckStackOverflow
    //     0xb00050: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb00054: cmp             SP, x16
    //     0xb00058: b.ls            #0xb000ac
    // 0xb0005c: ldr             x0, [fp, #0x10]
    // 0xb00060: r2 = Null
    //     0xb00060: mov             x2, NULL
    // 0xb00064: r1 = Null
    //     0xb00064: mov             x1, NULL
    // 0xb00068: r4 = 60
    //     0xb00068: movz            x4, #0x3c
    // 0xb0006c: branchIfSmi(r0, 0xb00078)
    //     0xb0006c: tbz             w0, #0, #0xb00078
    // 0xb00070: r4 = LoadClassIdInstr(r0)
    //     0xb00070: ldur            x4, [x0, #-1]
    //     0xb00074: ubfx            x4, x4, #0xc, #0x14
    // 0xb00078: cmp             x4, #0x13e
    // 0xb0007c: b.eq            #0xb00094
    // 0xb00080: r8 = Qhb
    //     0xb00080: add             x8, PP, #0x35, lsl #12  ; [pp+0x35dd8] Type: Qhb
    //     0xb00084: ldr             x8, [x8, #0xdd8]
    // 0xb00088: r3 = Null
    //     0xb00088: add             x3, PP, #0x35, lsl #12  ; [pp+0x35de0] Null
    //     0xb0008c: ldr             x3, [x3, #0xde0]
    // 0xb00090: r0 = DefaultTypeTest()
    //     0xb00090: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xb00094: ldr             x1, [fp, #0x18]
    // 0xb00098: ldr             x2, [fp, #0x10]
    // 0xb0009c: r0 = call 0x88db4c
    //     0xb0009c: bl              #0x88db4c
    // 0xb000a0: LeaveFrame
    //     0xb000a0: mov             SP, fp
    //     0xb000a4: ldp             fp, lr, [SP], #0x10
    // 0xb000a8: ret
    //     0xb000a8: ret             
    // 0xb000ac: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb000ac: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb000b0: b               #0xb0005c
  }
  double [](Qhb, int) {
    // ** addr: 0xb000cc, size: 0xd8
    // 0xb000cc: EnterFrame
    //     0xb000cc: stp             fp, lr, [SP, #-0x10]!
    //     0xb000d0: mov             fp, SP
    // 0xb000d4: ldr             x0, [fp, #0x10]
    // 0xb000d8: r2 = Null
    //     0xb000d8: mov             x2, NULL
    // 0xb000dc: r1 = Null
    //     0xb000dc: mov             x1, NULL
    // 0xb000e0: branchIfSmi(r0, 0xb00108)
    //     0xb000e0: tbz             w0, #0, #0xb00108
    // 0xb000e4: r4 = LoadClassIdInstr(r0)
    //     0xb000e4: ldur            x4, [x0, #-1]
    //     0xb000e8: ubfx            x4, x4, #0xc, #0x14
    // 0xb000ec: sub             x4, x4, #0x3c
    // 0xb000f0: cmp             x4, #1
    // 0xb000f4: b.ls            #0xb00108
    // 0xb000f8: r8 = int
    //     0xb000f8: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xb000fc: r3 = Null
    //     0xb000fc: add             x3, PP, #0x35, lsl #12  ; [pp+0x35dc8] Null
    //     0xb00100: ldr             x3, [x3, #0xdc8]
    // 0xb00104: r0 = int()
    //     0xb00104: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xb00108: ldr             x2, [fp, #0x18]
    // 0xb0010c: LoadField: r3 = r2->field_7
    //     0xb0010c: ldur            w3, [x2, #7]
    // 0xb00110: DecompressPointer r3
    //     0xb00110: add             x3, x3, HEAP, lsl #32
    // 0xb00114: LoadField: r2 = r3->field_13
    //     0xb00114: ldur            w2, [x3, #0x13]
    // 0xb00118: ldr             x4, [fp, #0x10]
    // 0xb0011c: r5 = LoadInt32Instr(r4)
    //     0xb0011c: sbfx            x5, x4, #1, #0x1f
    //     0xb00120: tbz             w4, #0, #0xb00128
    //     0xb00124: ldur            x5, [x4, #7]
    // 0xb00128: r0 = LoadInt32Instr(r2)
    //     0xb00128: sbfx            x0, x2, #1, #0x1f
    // 0xb0012c: mov             x1, x5
    // 0xb00130: cmp             x1, x0
    // 0xb00134: b.hs            #0xb00178
    // 0xb00138: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xb00138: add             x16, x3, x5, lsl #2
    //     0xb0013c: ldur            s0, [x16, #0x17]
    // 0xb00140: fcvt            d1, s0
    // 0xb00144: r0 = inline_Allocate_Double()
    //     0xb00144: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xb00148: add             x0, x0, #0x10
    //     0xb0014c: cmp             x1, x0
    //     0xb00150: b.ls            #0xb0017c
    //     0xb00154: str             x0, [THR, #0x50]  ; THR::top
    //     0xb00158: sub             x0, x0, #0xf
    //     0xb0015c: movz            x1, #0xe15c
    //     0xb00160: movk            x1, #0x3, lsl #16
    //     0xb00164: stur            x1, [x0, #-1]
    // 0xb00168: StoreField: r0->field_7 = d1
    //     0xb00168: stur            d1, [x0, #7]
    // 0xb0016c: LeaveFrame
    //     0xb0016c: mov             SP, fp
    //     0xb00170: ldp             fp, lr, [SP], #0x10
    // 0xb00174: ret
    //     0xb00174: ret             
    // 0xb00178: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xb00178: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xb0017c: SaveReg d1
    //     0xb0017c: str             q1, [SP, #-0x10]!
    // 0xb00180: r0 = AllocateDouble()
    //     0xb00180: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xb00184: RestoreReg d1
    //     0xb00184: ldr             q1, [SP], #0x10
    // 0xb00188: b               #0xb00168
  }
  Qhb *(Qhb, double) {
    // ** addr: 0xb001a4, size: 0x50
    // 0xb001a4: EnterFrame
    //     0xb001a4: stp             fp, lr, [SP, #-0x10]!
    //     0xb001a8: mov             fp, SP
    // 0xb001ac: CheckStackOverflow
    //     0xb001ac: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb001b0: cmp             SP, x16
    //     0xb001b4: b.ls            #0xb001d4
    // 0xb001b8: ldr             x0, [fp, #0x10]
    // 0xb001bc: LoadField: d0 = r0->field_7
    //     0xb001bc: ldur            d0, [x0, #7]
    // 0xb001c0: ldr             x1, [fp, #0x18]
    // 0xb001c4: r0 = call 0x88dcdc
    //     0xb001c4: bl              #0x88dcdc
    // 0xb001c8: LeaveFrame
    //     0xb001c8: mov             SP, fp
    //     0xb001cc: ldp             fp, lr, [SP], #0x10
    // 0xb001d0: ret
    //     0xb001d0: ret             
    // 0xb001d4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb001d4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb001d8: b               #0xb001b8
  }
}

// class id: 320, size: 0x8, field offset: 0x8
abstract class Phb extends Object {
}

// class id: 321, size: 0xc, field offset: 0x8
class yK extends Object {

  yK +(yK, yK) {
    // ** addr: 0xaf89bc, size: 0x84
    // 0xaf89bc: EnterFrame
    //     0xaf89bc: stp             fp, lr, [SP, #-0x10]!
    //     0xaf89c0: mov             fp, SP
    // 0xaf89c4: CheckStackOverflow
    //     0xaf89c4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf89c8: cmp             SP, x16
    //     0xaf89cc: b.ls            #0xaf8a20
    // 0xaf89d0: ldr             x0, [fp, #0x10]
    // 0xaf89d4: r2 = Null
    //     0xaf89d4: mov             x2, NULL
    // 0xaf89d8: r1 = Null
    //     0xaf89d8: mov             x1, NULL
    // 0xaf89dc: r4 = 60
    //     0xaf89dc: movz            x4, #0x3c
    // 0xaf89e0: branchIfSmi(r0, 0xaf89ec)
    //     0xaf89e0: tbz             w0, #0, #0xaf89ec
    // 0xaf89e4: r4 = LoadClassIdInstr(r0)
    //     0xaf89e4: ldur            x4, [x0, #-1]
    //     0xaf89e8: ubfx            x4, x4, #0xc, #0x14
    // 0xaf89ec: cmp             x4, #0x141
    // 0xaf89f0: b.eq            #0xaf8a08
    // 0xaf89f4: r8 = yK
    //     0xaf89f4: add             x8, PP, #0x32, lsl #12  ; [pp+0x32ab0] Type: yK
    //     0xaf89f8: ldr             x8, [x8, #0xab0]
    // 0xaf89fc: r3 = Null
    //     0xaf89fc: add             x3, PP, #0x32, lsl #12  ; [pp+0x32ac8] Null
    //     0xaf8a00: ldr             x3, [x3, #0xac8]
    // 0xaf8a04: r0 = DefaultTypeTest()
    //     0xaf8a04: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xaf8a08: ldr             x1, [fp, #0x18]
    // 0xaf8a0c: ldr             x2, [fp, #0x10]
    // 0xaf8a10: r0 = call 0x8244b0
    //     0xaf8a10: bl              #0x8244b0
    // 0xaf8a14: LeaveFrame
    //     0xaf8a14: mov             SP, fp
    //     0xaf8a18: ldp             fp, lr, [SP], #0x10
    // 0xaf8a1c: ret
    //     0xaf8a1c: ret             
    // 0xaf8a20: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf8a20: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf8a24: b               #0xaf89d0
  }
  dynamic *(yK, dynamic) {
    // ** addr: 0xaf8a40, size: 0x50
    // 0xaf8a40: EnterFrame
    //     0xaf8a40: stp             fp, lr, [SP, #-0x10]!
    //     0xaf8a44: mov             fp, SP
    // 0xaf8a48: CheckStackOverflow
    //     0xaf8a48: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf8a4c: cmp             SP, x16
    //     0xaf8a50: b.ls            #0xaf8a70
    // 0xaf8a54: ldr             x0, [fp, #0x10]
    // 0xaf8a58: LoadField: d0 = r0->field_7
    //     0xaf8a58: ldur            d0, [x0, #7]
    // 0xaf8a5c: ldr             x1, [fp, #0x18]
    // 0xaf8a60: r0 = call 0x824ad8
    //     0xaf8a60: bl              #0x824ad8
    // 0xaf8a64: LeaveFrame
    //     0xaf8a64: mov             SP, fp
    //     0xaf8a68: ldp             fp, lr, [SP], #0x10
    // 0xaf8a6c: ret
    //     0xaf8a6c: ret             
    // 0xaf8a70: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf8a70: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf8a74: b               #0xaf8a54
  }
  yK -(yK, yK) {
    // ** addr: 0xaf8a90, size: 0x84
    // 0xaf8a90: EnterFrame
    //     0xaf8a90: stp             fp, lr, [SP, #-0x10]!
    //     0xaf8a94: mov             fp, SP
    // 0xaf8a98: CheckStackOverflow
    //     0xaf8a98: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf8a9c: cmp             SP, x16
    //     0xaf8aa0: b.ls            #0xaf8af4
    // 0xaf8aa4: ldr             x0, [fp, #0x10]
    // 0xaf8aa8: r2 = Null
    //     0xaf8aa8: mov             x2, NULL
    // 0xaf8aac: r1 = Null
    //     0xaf8aac: mov             x1, NULL
    // 0xaf8ab0: r4 = 60
    //     0xaf8ab0: movz            x4, #0x3c
    // 0xaf8ab4: branchIfSmi(r0, 0xaf8ac0)
    //     0xaf8ab4: tbz             w0, #0, #0xaf8ac0
    // 0xaf8ab8: r4 = LoadClassIdInstr(r0)
    //     0xaf8ab8: ldur            x4, [x0, #-1]
    //     0xaf8abc: ubfx            x4, x4, #0xc, #0x14
    // 0xaf8ac0: cmp             x4, #0x141
    // 0xaf8ac4: b.eq            #0xaf8adc
    // 0xaf8ac8: r8 = yK
    //     0xaf8ac8: add             x8, PP, #0x32, lsl #12  ; [pp+0x32ab0] Type: yK
    //     0xaf8acc: ldr             x8, [x8, #0xab0]
    // 0xaf8ad0: r3 = Null
    //     0xaf8ad0: add             x3, PP, #0x32, lsl #12  ; [pp+0x32ab8] Null
    //     0xaf8ad4: ldr             x3, [x3, #0xab8]
    // 0xaf8ad8: r0 = DefaultTypeTest()
    //     0xaf8ad8: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xaf8adc: ldr             x1, [fp, #0x18]
    // 0xaf8ae0: ldr             x2, [fp, #0x10]
    // 0xaf8ae4: r0 = call 0x824b24
    //     0xaf8ae4: bl              #0x824b24
    // 0xaf8ae8: LeaveFrame
    //     0xaf8ae8: mov             SP, fp
    //     0xaf8aec: ldp             fp, lr, [SP], #0x10
    // 0xaf8af0: ret
    //     0xaf8af0: ret             
    // 0xaf8af4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf8af4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf8af8: b               #0xaf8aa4
  }
  double [](yK, int) {
    // ** addr: 0xaf8b14, size: 0xd8
    // 0xaf8b14: EnterFrame
    //     0xaf8b14: stp             fp, lr, [SP, #-0x10]!
    //     0xaf8b18: mov             fp, SP
    // 0xaf8b1c: ldr             x0, [fp, #0x10]
    // 0xaf8b20: r2 = Null
    //     0xaf8b20: mov             x2, NULL
    // 0xaf8b24: r1 = Null
    //     0xaf8b24: mov             x1, NULL
    // 0xaf8b28: branchIfSmi(r0, 0xaf8b50)
    //     0xaf8b28: tbz             w0, #0, #0xaf8b50
    // 0xaf8b2c: r4 = LoadClassIdInstr(r0)
    //     0xaf8b2c: ldur            x4, [x0, #-1]
    //     0xaf8b30: ubfx            x4, x4, #0xc, #0x14
    // 0xaf8b34: sub             x4, x4, #0x3c
    // 0xaf8b38: cmp             x4, #1
    // 0xaf8b3c: b.ls            #0xaf8b50
    // 0xaf8b40: r8 = int
    //     0xaf8b40: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaf8b44: r3 = Null
    //     0xaf8b44: add             x3, PP, #0x32, lsl #12  ; [pp+0x32ad8] Null
    //     0xaf8b48: ldr             x3, [x3, #0xad8]
    // 0xaf8b4c: r0 = int()
    //     0xaf8b4c: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaf8b50: ldr             x2, [fp, #0x18]
    // 0xaf8b54: LoadField: r3 = r2->field_7
    //     0xaf8b54: ldur            w3, [x2, #7]
    // 0xaf8b58: DecompressPointer r3
    //     0xaf8b58: add             x3, x3, HEAP, lsl #32
    // 0xaf8b5c: LoadField: r2 = r3->field_13
    //     0xaf8b5c: ldur            w2, [x3, #0x13]
    // 0xaf8b60: ldr             x4, [fp, #0x10]
    // 0xaf8b64: r5 = LoadInt32Instr(r4)
    //     0xaf8b64: sbfx            x5, x4, #1, #0x1f
    //     0xaf8b68: tbz             w4, #0, #0xaf8b70
    //     0xaf8b6c: ldur            x5, [x4, #7]
    // 0xaf8b70: r0 = LoadInt32Instr(r2)
    //     0xaf8b70: sbfx            x0, x2, #1, #0x1f
    // 0xaf8b74: mov             x1, x5
    // 0xaf8b78: cmp             x1, x0
    // 0xaf8b7c: b.hs            #0xaf8bc0
    // 0xaf8b80: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0xaf8b80: add             x16, x3, x5, lsl #2
    //     0xaf8b84: ldur            s0, [x16, #0x17]
    // 0xaf8b88: fcvt            d1, s0
    // 0xaf8b8c: r0 = inline_Allocate_Double()
    //     0xaf8b8c: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0xaf8b90: add             x0, x0, #0x10
    //     0xaf8b94: cmp             x1, x0
    //     0xaf8b98: b.ls            #0xaf8bc4
    //     0xaf8b9c: str             x0, [THR, #0x50]  ; THR::top
    //     0xaf8ba0: sub             x0, x0, #0xf
    //     0xaf8ba4: movz            x1, #0xe15c
    //     0xaf8ba8: movk            x1, #0x3, lsl #16
    //     0xaf8bac: stur            x1, [x0, #-1]
    // 0xaf8bb0: StoreField: r0->field_7 = d1
    //     0xaf8bb0: stur            d1, [x0, #7]
    // 0xaf8bb4: LeaveFrame
    //     0xaf8bb4: mov             SP, fp
    //     0xaf8bb8: ldp             fp, lr, [SP], #0x10
    // 0xaf8bbc: ret
    //     0xaf8bbc: ret             
    // 0xaf8bc0: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xaf8bc0: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
    // 0xaf8bc4: SaveReg d1
    //     0xaf8bc4: str             q1, [SP, #-0x10]!
    // 0xaf8bc8: r0 = AllocateDouble()
    //     0xaf8bc8: bl              #0xb29a90  ; AllocateDoubleStub
    // 0xaf8bcc: RestoreReg d1
    //     0xaf8bcc: ldr             q1, [SP], #0x10
    // 0xaf8bd0: b               #0xaf8bb0
  }
}
