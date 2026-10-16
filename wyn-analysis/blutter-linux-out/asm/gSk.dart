// lib: , url: GSk

// class id: 1050284, size: 0x8
class :: {
}

// class id: 462, size: 0xc, field offset: 0x8
class Ueb extends Object {

  dynamic rtb(dynamic) {
    // ** addr: 0xaad04c, size: 0x3c
    // 0xaad04c: EnterFrame
    //     0xaad04c: stp             fp, lr, [SP, #-0x10]!
    //     0xaad050: mov             fp, SP
    // 0xaad054: ldr             x2, [fp, #0x10]
    // 0xaad058: r1 = Function 'rtb':.
    //     0xaad058: add             x1, PP, #0x24, lsl #12  ; [pp+0x24608] AnonymousClosure: (0x6dd710), of [GSk] Ueb
    //     0xaad05c: ldr             x1, [x1, #0x608]
    // 0xaad060: r0 = AllocateClosure()
    //     0xaad060: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xaad064: LeaveFrame
    //     0xaad064: mov             SP, fp
    //     0xaad068: ldp             fp, lr, [SP], #0x10
    // 0xaad06c: ret
    //     0xaad06c: ret             
  }
  [closure] String? rtb(dynamic, Teb) {
    // ** addr: 0x6dd710, size: -0x1
  }
}

// class id: 5821, size: 0x14, field offset: 0x14
enum Teb extends _Enum {
}
