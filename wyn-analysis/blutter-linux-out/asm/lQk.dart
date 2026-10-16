// lib: , url: LQk

// class id: 1050189, size: 0x8
class :: {
}

// class id: 547, size: 0x14, field offset: 0x8
class _Kcb<X0> extends Object {
}

// class id: 5565, size: 0x20, field offset: 0x18
class Icb<X0> extends Jcb<X0>
    implements Hcb<X0> {

  Hcb<Y0> Zk<Y0>(Icb<X0>) {
    // ** addr: 0xb08ddc, size: 0x9c
    // 0xb08ddc: EnterFrame
    //     0xb08ddc: stp             fp, lr, [SP, #-0x10]!
    //     0xb08de0: mov             fp, SP
    // 0xb08de4: AllocStack(0x20)
    //     0xb08de4: sub             SP, SP, #0x20
    // 0xb08de8: SetupParameters([dynamic _ /* r0 */])
    //     0xb08de8: ldur            w0, [x4, #0xf]
    //     0xb08dec: cbnz            w0, #0xb08df8
    //     0xb08df0: mov             x1, NULL
    //     0xb08df4: b               #0xb08e04
    //     0xb08df8: ldur            w0, [x4, #0x17]
    //     0xb08dfc: add             x1, fp, w0, sxtw #2
    //     0xb08e00: ldr             x1, [x1, #0x10]
    //     0xb08e04: ldr             x0, [fp, #0x10]
    //     0xb08e08: stur            x1, [fp, #-8]
    // 0xb08e0c: CheckStackOverflow
    //     0xb08e0c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb08e10: cmp             SP, x16
    //     0xb08e14: b.ls            #0xb08e70
    // 0xb08e18: r1 = 1
    //     0xb08e18: movz            x1, #0x1
    // 0xb08e1c: r0 = AllocateContext()
    //     0xb08e1c: bl              #0xb28aa8  ; AllocateContextStub
    // 0xb08e20: mov             x1, x0
    // 0xb08e24: ldr             x0, [fp, #0x10]
    // 0xb08e28: StoreField: r1->field_f = r0
    //     0xb08e28: stur            w0, [x1, #0xf]
    // 0xb08e2c: LoadField: r3 = r0->field_7
    //     0xb08e2c: ldur            w3, [x0, #7]
    // 0xb08e30: DecompressPointer r3
    //     0xb08e30: add             x3, x3, HEAP, lsl #32
    // 0xb08e34: mov             x2, x1
    // 0xb08e38: r1 = Function '<anonymous closure>':.
    //     0xb08e38: add             x1, PP, #0x1a, lsl #12  ; [pp+0x1a8a8] AnonymousClosure: (0x93d7fc), in [LQk] Icb::Zk (0xb08ddc)
    //     0xb08e3c: ldr             x1, [x1, #0x8a8]
    // 0xb08e40: r0 = AllocateClosureTA()
    //     0xb08e40: bl              #0xb28cb0  ; AllocateClosureTAStub
    // 0xb08e44: mov             x1, x0
    // 0xb08e48: ldur            x0, [fp, #-8]
    // 0xb08e4c: StoreField: r1->field_b = r0
    //     0xb08e4c: stur            w0, [x1, #0xb]
    // 0xb08e50: ldr             x16, [fp, #0x10]
    // 0xb08e54: stp             x16, x0, [SP, #8]
    // 0xb08e58: str             x1, [SP]
    // 0xb08e5c: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0xb08e5c: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0xb08e60: r0 = call 0x93d434
    //     0xb08e60: bl              #0x93d434
    // 0xb08e64: LeaveFrame
    //     0xb08e64: mov             SP, fp
    //     0xb08e68: ldp             fp, lr, [SP], #0x10
    // 0xb08e6c: ret
    //     0xb08e6c: ret             
    // 0xb08e70: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb08e70: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb08e74: b               #0xb08e18
  }
  [closure] static Stream<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x6e70d0, size: -0x1
  }
  [closure] Stream<X0> <anonymous closure>(dynamic, Stream<X0>) {
    // ** addr: 0x93dfe8, size: -0x1
  }
  [closure] Eb<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x93d5b4, size: -0x1
  }
  [closure] Future<void> <anonymous closure>(dynamic) {
    // ** addr: 0x93d534, size: -0x1
  }
  [closure] Stream<Y0> <anonymous closure>(dynamic, Stream<X0>) {
    // ** addr: 0x93d7fc, size: -0x1
  }
  [closure] Stream<X0> <anonymous closure>(dynamic, Stream<X0>) {
    // ** addr: 0x93dcd8, size: -0x1
  }
  [closure] Stream<Y0> <anonymous closure>(dynamic, Stream<X0>) {
    // ** addr: 0x93de70, size: -0x1
  }
  [closure] Stream<Y0> <anonymous closure>(dynamic, Stream<X0>) {
    // ** addr: 0x95edd0, size: -0x1
  }
}
