// lib: , url: tHk

// class id: 1049733, size: 0x8
class :: {
}

// class id: 1145, size: 0x28, field offset: 0x8
//   const constructor, 
class bNa extends Object {

  _OneByteString field_8;
  _TwoByteString field_c;
  _OneByteString field_10;
  aNa field_14;
  bool field_18;
  bool field_1c;
  bool field_20;

  Map<String, dynamic> qdc(bNa) {
    // ** addr: 0xa78ff0, size: 0x48
    // 0xa78ff0: EnterFrame
    //     0xa78ff0: stp             fp, lr, [SP, #-0x10]!
    //     0xa78ff4: mov             fp, SP
    // 0xa78ff8: CheckStackOverflow
    //     0xa78ff8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa78ffc: cmp             SP, x16
    //     0xa79000: b.ls            #0xa79018
    // 0xa79004: ldr             x1, [fp, #0x10]
    // 0xa79008: r0 = call 0x33f90c
    //     0xa79008: bl              #0x33f90c
    // 0xa7900c: LeaveFrame
    //     0xa7900c: mov             SP, fp
    //     0xa79010: ldp             fp, lr, [SP], #0x10
    // 0xa79014: ret
    //     0xa79014: ret             
    // 0xa79018: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa79018: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa7901c: b               #0xa79004
  }
}

// class id: 1146, size: 0x10, field offset: 0x8
//   const constructor, 
class aNa extends Object {

  _OneByteString field_8;
  _OneByteString field_c;

  Map<String, dynamic> qdc(aNa) {
    // ** addr: 0xa76548, size: 0x48
    // 0xa76548: EnterFrame
    //     0xa76548: stp             fp, lr, [SP, #-0x10]!
    //     0xa7654c: mov             fp, SP
    // 0xa76550: CheckStackOverflow
    //     0xa76550: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa76554: cmp             SP, x16
    //     0xa76558: b.ls            #0xa76570
    // 0xa7655c: ldr             x1, [fp, #0x10]
    // 0xa76560: r0 = call 0x33fa90
    //     0xa76560: bl              #0x33fa90
    // 0xa76564: LeaveFrame
    //     0xa76564: mov             SP, fp
    //     0xa76568: ldp             fp, lr, [SP], #0x10
    // 0xa7656c: ret
    //     0xa7656c: ret             
    // 0xa76570: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa76570: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa76574: b               #0xa7655c
  }
}
