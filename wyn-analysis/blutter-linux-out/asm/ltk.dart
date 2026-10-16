// lib: , url: lTk

// class id: 1050315, size: 0x8
class :: {
}

// class id: 411, size: 0x28, field offset: 0x8
//   const constructor, 
class fs extends Object {

  _Mint field_8;
  _Mint field_10;
  _Mint field_18;
  _Mint field_20;
}

// class id: 412, size: 0x18, field offset: 0x8
//   const constructor, 
class ii extends Object {

  _Mint field_8;
  _Mint field_10;

  ii +(ii, ii) {
    // ** addr: 0xaf8e4c, size: 0x64
    // 0xaf8e4c: EnterFrame
    //     0xaf8e4c: stp             fp, lr, [SP, #-0x10]!
    //     0xaf8e50: mov             fp, SP
    // 0xaf8e54: ldr             x0, [fp, #0x10]
    // 0xaf8e58: r2 = Null
    //     0xaf8e58: mov             x2, NULL
    // 0xaf8e5c: r1 = Null
    //     0xaf8e5c: mov             x1, NULL
    // 0xaf8e60: r4 = 60
    //     0xaf8e60: movz            x4, #0x3c
    // 0xaf8e64: branchIfSmi(r0, 0xaf8e70)
    //     0xaf8e64: tbz             w0, #0, #0xaf8e70
    // 0xaf8e68: r4 = LoadClassIdInstr(r0)
    //     0xaf8e68: ldur            x4, [x0, #-1]
    //     0xaf8e6c: ubfx            x4, x4, #0xc, #0x14
    // 0xaf8e70: cmp             x4, #0x19c
    // 0xaf8e74: b.eq            #0xaf8e8c
    // 0xaf8e78: r8 = ii
    //     0xaf8e78: add             x8, PP, #0x32, lsl #12  ; [pp+0x32638] Type: ii
    //     0xaf8e7c: ldr             x8, [x8, #0x638]
    // 0xaf8e80: r3 = Null
    //     0xaf8e80: add             x3, PP, #0x32, lsl #12  ; [pp+0x32640] Null
    //     0xaf8e84: ldr             x3, [x3, #0x640]
    // 0xaf8e88: r0 = ii()
    //     0xaf8e88: bl              #0xaf8e98  ; IsType_ii_Stub
    // 0xaf8e8c: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0xaf8e8c: ldr             x0, [PP, #0x880]  ; [pp+0x880] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0xaf8e90: r0 = Throw()
    //     0xaf8e90: bl              #0xb27dfc  ; ThrowStub
    // 0xaf8e94: brk             #0
  }
}
