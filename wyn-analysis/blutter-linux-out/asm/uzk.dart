// lib: , url: uzk

// class id: 1049305, size: 0x8
class :: {
}

// class id: 4335, size: 0xc, field offset: 0xc
//   const constructor, transformed mixin,
abstract class _uF extends RE<dynamic>
     with oF<X0> {

  void KEc(_uF, (dynamic) => void) {
    // ** addr: 0xa737ec, size: 0x6c
    // 0xa737ec: EnterFrame
    //     0xa737ec: stp             fp, lr, [SP, #-0x10]!
    //     0xa737f0: mov             fp, SP
    // 0xa737f4: CheckStackOverflow
    //     0xa737f4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa737f8: cmp             SP, x16
    //     0xa737fc: b.ls            #0xa73838
    // 0xa73800: ldr             x0, [fp, #0x10]
    // 0xa73804: r2 = Null
    //     0xa73804: mov             x2, NULL
    // 0xa73808: r1 = Null
    //     0xa73808: mov             x1, NULL
    // 0xa7380c: r8 = (dynamic this) => void?
    //     0xa7380c: add             x8, PP, #0x24, lsl #12  ; [pp+0x24c18] FunctionType: (dynamic this) => void?
    //     0xa73810: ldr             x8, [x8, #0xc18]
    // 0xa73814: r3 = Null
    //     0xa73814: add             x3, PP, #0x26, lsl #12  ; [pp+0x26bf8] Null
    //     0xa73818: ldr             x3, [x3, #0xbf8]
    // 0xa7381c: r0 = DefaultTypeTest()
    //     0xa7381c: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xa73820: ldr             x1, [fp, #0x18]
    // 0xa73824: ldr             x2, [fp, #0x10]
    // 0xa73828: r0 = call 0x4182a0
    //     0xa73828: bl              #0x4182a0
    // 0xa7382c: LeaveFrame
    //     0xa7382c: mov             SP, fp
    //     0xa73830: ldp             fp, lr, [SP], #0x10
    // 0xa73834: ret
    //     0xa73834: ret             
    // 0xa73838: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa73838: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa7383c: b               #0xa73800
  }
}
