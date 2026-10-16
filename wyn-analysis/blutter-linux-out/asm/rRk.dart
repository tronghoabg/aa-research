// lib: , url: rRk

// class id: 1050217, size: 0x8
class :: {
}

// class id: 522, size: 0x8, field offset: 0x8
abstract class rdb extends Object
    implements vdb {

  dynamic rtb(dynamic) {
    // ** addr: 0xa99dd0, size: 0x3c
    // 0xa99dd0: EnterFrame
    //     0xa99dd0: stp             fp, lr, [SP, #-0x10]!
    //     0xa99dd4: mov             fp, SP
    // 0xa99dd8: ldr             x2, [fp, #0x10]
    // 0xa99ddc: r1 = Function 'rtb':.
    //     0xa99ddc: add             x1, PP, #0x1d, lsl #12  ; [pp+0x1dc80] AnonymousClosure: (0x5fed2c), of [rRk] rdb
    //     0xa99de0: ldr             x1, [x1, #0xc80]
    // 0xa99de4: r0 = AllocateClosure()
    //     0xa99de4: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xa99de8: LeaveFrame
    //     0xa99de8: mov             SP, fp
    //     0xa99dec: ldp             fp, lr, [SP], #0x10
    // 0xa99df0: ret
    //     0xa99df0: ret             
  }
  [closure] String rtb(dynamic, String, {Object? njc}) {
    // ** addr: 0x5fed2c, size: -0x1
  }
}
