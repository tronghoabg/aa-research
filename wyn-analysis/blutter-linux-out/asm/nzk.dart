// lib: , url: Nzk

// class id: 1049324, size: 0x8
class :: {
}

// class id: 2360, size: 0x10, field offset: 0x8
//   const constructor, 
class DZ extends Object {

  _Mint field_8;
}

// class id: 2361, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class zZ extends Object {
}

// class id: 2362, size: 0x20, field offset: 0x8
//   const constructor, 
class _CZ extends zZ {
}

// class id: 2363, size: 0x18, field offset: 0x8
//   const constructor, 
class BZ extends zZ {

  _Double field_8;
  _Double field_10;

  BZ -(BZ, BZ) {
    // ** addr: 0xa83de0, size: 0x84
    // 0xa83de0: EnterFrame
    //     0xa83de0: stp             fp, lr, [SP, #-0x10]!
    //     0xa83de4: mov             fp, SP
    // 0xa83de8: CheckStackOverflow
    //     0xa83de8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa83dec: cmp             SP, x16
    //     0xa83df0: b.ls            #0xa83e44
    // 0xa83df4: ldr             x0, [fp, #0x10]
    // 0xa83df8: r2 = Null
    //     0xa83df8: mov             x2, NULL
    // 0xa83dfc: r1 = Null
    //     0xa83dfc: mov             x1, NULL
    // 0xa83e00: r4 = 60
    //     0xa83e00: movz            x4, #0x3c
    // 0xa83e04: branchIfSmi(r0, 0xa83e10)
    //     0xa83e04: tbz             w0, #0, #0xa83e10
    // 0xa83e08: r4 = LoadClassIdInstr(r0)
    //     0xa83e08: ldur            x4, [x0, #-1]
    //     0xa83e0c: ubfx            x4, x4, #0xc, #0x14
    // 0xa83e10: cmp             x4, #0x93b
    // 0xa83e14: b.eq            #0xa83e2c
    // 0xa83e18: r8 = BZ
    //     0xa83e18: add             x8, PP, #0x25, lsl #12  ; [pp+0x25430] Type: BZ
    //     0xa83e1c: ldr             x8, [x8, #0x430]
    // 0xa83e20: r3 = Null
    //     0xa83e20: add             x3, PP, #0x25, lsl #12  ; [pp+0x25448] Null
    //     0xa83e24: ldr             x3, [x3, #0x448]
    // 0xa83e28: r0 = DefaultTypeTest()
    //     0xa83e28: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa83e2c: ldr             x1, [fp, #0x18]
    // 0xa83e30: ldr             x2, [fp, #0x10]
    // 0xa83e34: r0 = call 0x3940b4
    //     0xa83e34: bl              #0x3940b4
    // 0xa83e38: LeaveFrame
    //     0xa83e38: mov             SP, fp
    //     0xa83e3c: ldp             fp, lr, [SP], #0x10
    // 0xa83e40: ret
    //     0xa83e40: ret             
    // 0xa83e44: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa83e44: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa83e48: b               #0xa83df4
  }
  BZ +(BZ, BZ) {
    // ** addr: 0xa83e70, size: 0x84
    // 0xa83e70: EnterFrame
    //     0xa83e70: stp             fp, lr, [SP, #-0x10]!
    //     0xa83e74: mov             fp, SP
    // 0xa83e78: CheckStackOverflow
    //     0xa83e78: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa83e7c: cmp             SP, x16
    //     0xa83e80: b.ls            #0xa83ed4
    // 0xa83e84: ldr             x0, [fp, #0x10]
    // 0xa83e88: r2 = Null
    //     0xa83e88: mov             x2, NULL
    // 0xa83e8c: r1 = Null
    //     0xa83e8c: mov             x1, NULL
    // 0xa83e90: r4 = 60
    //     0xa83e90: movz            x4, #0x3c
    // 0xa83e94: branchIfSmi(r0, 0xa83ea0)
    //     0xa83e94: tbz             w0, #0, #0xa83ea0
    // 0xa83e98: r4 = LoadClassIdInstr(r0)
    //     0xa83e98: ldur            x4, [x0, #-1]
    //     0xa83e9c: ubfx            x4, x4, #0xc, #0x14
    // 0xa83ea0: cmp             x4, #0x93b
    // 0xa83ea4: b.eq            #0xa83ebc
    // 0xa83ea8: r8 = BZ
    //     0xa83ea8: add             x8, PP, #0x25, lsl #12  ; [pp+0x25430] Type: BZ
    //     0xa83eac: ldr             x8, [x8, #0x430]
    // 0xa83eb0: r3 = Null
    //     0xa83eb0: add             x3, PP, #0x25, lsl #12  ; [pp+0x25438] Null
    //     0xa83eb4: ldr             x3, [x3, #0x438]
    // 0xa83eb8: r0 = DefaultTypeTest()
    //     0xa83eb8: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa83ebc: ldr             x1, [fp, #0x18]
    // 0xa83ec0: ldr             x2, [fp, #0x10]
    // 0xa83ec4: r0 = call 0x394100
    //     0xa83ec4: bl              #0x394100
    // 0xa83ec8: LeaveFrame
    //     0xa83ec8: mov             SP, fp
    //     0xa83ecc: ldp             fp, lr, [SP], #0x10
    // 0xa83ed0: ret
    //     0xa83ed0: ret             
    // 0xa83ed4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa83ed4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa83ed8: b               #0xa83e84
  }
  BZ *(BZ, double) {
    // ** addr: 0xa83ef4, size: 0x50
    // 0xa83ef4: EnterFrame
    //     0xa83ef4: stp             fp, lr, [SP, #-0x10]!
    //     0xa83ef8: mov             fp, SP
    // 0xa83efc: CheckStackOverflow
    //     0xa83efc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa83f00: cmp             SP, x16
    //     0xa83f04: b.ls            #0xa83f24
    // 0xa83f08: ldr             x0, [fp, #0x10]
    // 0xa83f0c: LoadField: d0 = r0->field_7
    //     0xa83f0c: ldur            d0, [x0, #7]
    // 0xa83f10: ldr             x1, [fp, #0x18]
    // 0xa83f14: r0 = call 0xa20a0c
    //     0xa83f14: bl              #0xa20a0c
    // 0xa83f18: LeaveFrame
    //     0xa83f18: mov             SP, fp
    //     0xa83f1c: ldp             fp, lr, [SP], #0x10
    // 0xa83f20: ret
    //     0xa83f20: ret             
    // 0xa83f24: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa83f24: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa83f28: b               #0xa83f08
  }
}

// class id: 2364, size: 0x18, field offset: 0x8
//   const constructor, 
class AZ extends zZ {

  _Mint field_8;
  _Mint field_10;

  AZ -(AZ, AZ) {
    // ** addr: 0xa83f50, size: 0x84
    // 0xa83f50: EnterFrame
    //     0xa83f50: stp             fp, lr, [SP, #-0x10]!
    //     0xa83f54: mov             fp, SP
    // 0xa83f58: CheckStackOverflow
    //     0xa83f58: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa83f5c: cmp             SP, x16
    //     0xa83f60: b.ls            #0xa83fb4
    // 0xa83f64: ldr             x0, [fp, #0x10]
    // 0xa83f68: r2 = Null
    //     0xa83f68: mov             x2, NULL
    // 0xa83f6c: r1 = Null
    //     0xa83f6c: mov             x1, NULL
    // 0xa83f70: r4 = 60
    //     0xa83f70: movz            x4, #0x3c
    // 0xa83f74: branchIfSmi(r0, 0xa83f80)
    //     0xa83f74: tbz             w0, #0, #0xa83f80
    // 0xa83f78: r4 = LoadClassIdInstr(r0)
    //     0xa83f78: ldur            x4, [x0, #-1]
    //     0xa83f7c: ubfx            x4, x4, #0xc, #0x14
    // 0xa83f80: cmp             x4, #0x93c
    // 0xa83f84: b.eq            #0xa83f9c
    // 0xa83f88: r8 = AZ
    //     0xa83f88: add             x8, PP, #0x25, lsl #12  ; [pp+0x25458] Type: AZ
    //     0xa83f8c: ldr             x8, [x8, #0x458]
    // 0xa83f90: r3 = Null
    //     0xa83f90: add             x3, PP, #0x25, lsl #12  ; [pp+0x25470] Null
    //     0xa83f94: ldr             x3, [x3, #0x470]
    // 0xa83f98: r0 = DefaultTypeTest()
    //     0xa83f98: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa83f9c: ldr             x1, [fp, #0x18]
    // 0xa83fa0: ldr             x2, [fp, #0x10]
    // 0xa83fa4: r0 = call 0x3947e8
    //     0xa83fa4: bl              #0x3947e8
    // 0xa83fa8: LeaveFrame
    //     0xa83fa8: mov             SP, fp
    //     0xa83fac: ldp             fp, lr, [SP], #0x10
    // 0xa83fb0: ret
    //     0xa83fb0: ret             
    // 0xa83fb4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa83fb4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa83fb8: b               #0xa83f64
  }
  AZ *(AZ, double) {
    // ** addr: 0xa83fd4, size: 0x50
    // 0xa83fd4: EnterFrame
    //     0xa83fd4: stp             fp, lr, [SP, #-0x10]!
    //     0xa83fd8: mov             fp, SP
    // 0xa83fdc: CheckStackOverflow
    //     0xa83fdc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa83fe0: cmp             SP, x16
    //     0xa83fe4: b.ls            #0xa84004
    // 0xa83fe8: ldr             x0, [fp, #0x10]
    // 0xa83fec: LoadField: d0 = r0->field_7
    //     0xa83fec: ldur            d0, [x0, #7]
    // 0xa83ff0: ldr             x1, [fp, #0x18]
    // 0xa83ff4: r0 = call 0xa209c8
    //     0xa83ff4: bl              #0xa209c8
    // 0xa83ff8: LeaveFrame
    //     0xa83ff8: mov             SP, fp
    //     0xa83ffc: ldp             fp, lr, [SP], #0x10
    // 0xa84000: ret
    //     0xa84000: ret             
    // 0xa84004: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa84004: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa84008: b               #0xa83fe8
  }
  AZ +(AZ, AZ) {
    // ** addr: 0xa84024, size: 0x84
    // 0xa84024: EnterFrame
    //     0xa84024: stp             fp, lr, [SP, #-0x10]!
    //     0xa84028: mov             fp, SP
    // 0xa8402c: CheckStackOverflow
    //     0xa8402c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa84030: cmp             SP, x16
    //     0xa84034: b.ls            #0xa84088
    // 0xa84038: ldr             x0, [fp, #0x10]
    // 0xa8403c: r2 = Null
    //     0xa8403c: mov             x2, NULL
    // 0xa84040: r1 = Null
    //     0xa84040: mov             x1, NULL
    // 0xa84044: r4 = 60
    //     0xa84044: movz            x4, #0x3c
    // 0xa84048: branchIfSmi(r0, 0xa84054)
    //     0xa84048: tbz             w0, #0, #0xa84054
    // 0xa8404c: r4 = LoadClassIdInstr(r0)
    //     0xa8404c: ldur            x4, [x0, #-1]
    //     0xa84050: ubfx            x4, x4, #0xc, #0x14
    // 0xa84054: cmp             x4, #0x93c
    // 0xa84058: b.eq            #0xa84070
    // 0xa8405c: r8 = AZ
    //     0xa8405c: add             x8, PP, #0x25, lsl #12  ; [pp+0x25458] Type: AZ
    //     0xa84060: ldr             x8, [x8, #0x458]
    // 0xa84064: r3 = Null
    //     0xa84064: add             x3, PP, #0x25, lsl #12  ; [pp+0x25460] Null
    //     0xa84068: ldr             x3, [x3, #0x460]
    // 0xa8406c: r0 = DefaultTypeTest()
    //     0xa8406c: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa84070: ldr             x1, [fp, #0x18]
    // 0xa84074: ldr             x2, [fp, #0x10]
    // 0xa84078: r0 = call 0x394834
    //     0xa84078: bl              #0x394834
    // 0xa8407c: LeaveFrame
    //     0xa8407c: mov             SP, fp
    //     0xa84080: ldp             fp, lr, [SP], #0x10
    // 0xa84084: ret
    //     0xa84084: ret             
    // 0xa84088: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa84088: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa8408c: b               #0xa84038
  }
}
