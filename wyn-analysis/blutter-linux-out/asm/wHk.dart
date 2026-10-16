// lib: , url: WHk

// class id: 1049758, size: 0x8
class :: {
}

// class id: 1111, size: 0x1c, field offset: 0x8
class YNa extends Object {

  Map<String, dynamic> qdc(YNa) {
    // ** addr: 0xadbce4, size: 0x48
    // 0xadbce4: EnterFrame
    //     0xadbce4: stp             fp, lr, [SP, #-0x10]!
    //     0xadbce8: mov             fp, SP
    // 0xadbcec: CheckStackOverflow
    //     0xadbcec: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadbcf0: cmp             SP, x16
    //     0xadbcf4: b.ls            #0xadbd0c
    // 0xadbcf8: ldr             x1, [fp, #0x10]
    // 0xadbcfc: r0 = call 0x76ecb8
    //     0xadbcfc: bl              #0x76ecb8
    // 0xadbd00: LeaveFrame
    //     0xadbd00: mov             SP, fp
    //     0xadbd04: ldp             fp, lr, [SP], #0x10
    // 0xadbd08: ret
    //     0xadbd08: ret             
    // 0xadbd0c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadbd0c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadbd10: b               #0xadbcf8
  }
}

// class id: 1112, size: 0x18, field offset: 0x8
class WNa extends Object {

  Map<String, dynamic> qdc(WNa) {
    // ** addr: 0xadbc90, size: 0x48
    // 0xadbc90: EnterFrame
    //     0xadbc90: stp             fp, lr, [SP, #-0x10]!
    //     0xadbc94: mov             fp, SP
    // 0xadbc98: CheckStackOverflow
    //     0xadbc98: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xadbc9c: cmp             SP, x16
    //     0xadbca0: b.ls            #0xadbcb8
    // 0xadbca4: ldr             x1, [fp, #0x10]
    // 0xadbca8: r0 = call 0x76ebd8
    //     0xadbca8: bl              #0x76ebd8
    // 0xadbcac: LeaveFrame
    //     0xadbcac: mov             SP, fp
    //     0xadbcb0: ldp             fp, lr, [SP], #0x10
    // 0xadbcb4: ret
    //     0xadbcb4: ret             
    // 0xadbcb8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xadbcb8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xadbcbc: b               #0xadbca4
  }
}

// class id: 5895, size: 0x14, field offset: 0x14
enum aOa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 5896, size: 0x14, field offset: 0x14
enum ZNa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 5897, size: 0x14, field offset: 0x14
enum XNa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
