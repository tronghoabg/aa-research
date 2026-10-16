// lib: , url: HAk

// class id: 1049368, size: 0x8
class :: {
}

// class id: 2233, size: 0x78, field offset: 0x54
class pca extends YQ {

  [closure] double egd(dynamic, double) {
    // ** addr: 0x38f86c, size: -0x1
  }
  [closure] double cgd(dynamic, double) {
    // ** addr: 0x389c20, size: -0x1
  }
  [closure] double bgd(dynamic, double) {
    // ** addr: 0x39cfdc, size: -0x1
  }
  [closure] double dgd(dynamic, double) {
    // ** addr: 0x3a59e0, size: -0x1
  }
}

// class id: 2262, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class oca extends Object {
}

// class id: 4294, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class jG extends SE {

  void KEc(jG, (dynamic) => void) {
    // ** addr: 0xa8f444, size: 0x6c
    // 0xa8f444: EnterFrame
    //     0xa8f444: stp             fp, lr, [SP, #-0x10]!
    //     0xa8f448: mov             fp, SP
    // 0xa8f44c: CheckStackOverflow
    //     0xa8f44c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa8f450: cmp             SP, x16
    //     0xa8f454: b.ls            #0xa8f490
    // 0xa8f458: ldr             x0, [fp, #0x10]
    // 0xa8f45c: r2 = Null
    //     0xa8f45c: mov             x2, NULL
    // 0xa8f460: r1 = Null
    //     0xa8f460: mov             x1, NULL
    // 0xa8f464: r8 = (dynamic this) => void?
    //     0xa8f464: add             x8, PP, #0x24, lsl #12  ; [pp+0x24c18] FunctionType: (dynamic this) => void?
    //     0xa8f468: ldr             x8, [x8, #0xc18]
    // 0xa8f46c: r3 = Null
    //     0xa8f46c: add             x3, PP, #0x28, lsl #12  ; [pp+0x28450] Null
    //     0xa8f470: ldr             x3, [x3, #0x450]
    // 0xa8f474: r0 = DefaultTypeTest()
    //     0xa8f474: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa8f478: ldr             x1, [fp, #0x18]
    // 0xa8f47c: ldr             x2, [fp, #0x10]
    // 0xa8f480: r0 = call 0x4182f4
    //     0xa8f480: bl              #0x4182f4
    // 0xa8f484: LeaveFrame
    //     0xa8f484: mov             SP, fp
    //     0xa8f488: ldp             fp, lr, [SP], #0x10
    // 0xa8f48c: ret
    //     0xa8f48c: ret             
    // 0xa8f490: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa8f490: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa8f494: b               #0xa8f458
  }
}
