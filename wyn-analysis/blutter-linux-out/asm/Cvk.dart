// lib: , url: CVk

// class id: 1050413, size: 0x8
class :: {
}

// class id: 2727, size: 0x5c, field offset: 0x24
class dmb extends mJ {

  dynamic qdc(dmb) {
    // ** addr: 0xa7aaec, size: 0x48
    // 0xa7aaec: EnterFrame
    //     0xa7aaec: stp             fp, lr, [SP, #-0x10]!
    //     0xa7aaf0: mov             fp, SP
    // 0xa7aaf4: CheckStackOverflow
    //     0xa7aaf4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa7aaf8: cmp             SP, x16
    //     0xa7aafc: b.ls            #0xa7ab14
    // 0xa7ab00: ldr             x1, [fp, #0x10]
    // 0xa7ab04: r0 = call 0x34792c
    //     0xa7ab04: bl              #0x34792c
    // 0xa7ab08: LeaveFrame
    //     0xa7ab08: mov             SP, fp
    //     0xa7ab0c: ldp             fp, lr, [SP], #0x10
    // 0xa7ab10: ret
    //     0xa7ab10: ret             
    // 0xa7ab14: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa7ab14: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa7ab18: b               #0xa7ab00
  }
}

// class id: 3286, size: 0x28, field offset: 0x14
class _cmb extends Nu<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0xad2688, size: 0x84
    // 0xad2688: EnterFrame
    //     0xad2688: stp             fp, lr, [SP, #-0x10]!
    //     0xad268c: mov             fp, SP
    // 0xad2690: AllocStack(0x18)
    //     0xad2690: sub             SP, SP, #0x18
    // 0xad2694: SetupParameters(_cmb this /* r1 */)
    //     0xad2694: stur            NULL, [fp, #-8]
    //     0xad2698: movz            x0, #0
    //     0xad269c: add             x1, fp, w0, sxtw #2
    //     0xad26a0: ldr             x1, [x1, #0x10]
    //     0xad26a4: ldur            w2, [x1, #0x17]
    //     0xad26a8: add             x2, x2, HEAP, lsl #32
    //     0xad26ac: stur            x2, [fp, #-0x10]
    // 0xad26b0: CheckStackOverflow
    //     0xad26b0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad26b4: cmp             SP, x16
    //     0xad26b8: b.ls            #0xad2704
    // 0xad26bc: InitAsync() -> Future<void?>
    //     0xad26bc: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xad26c0: bl              #0xa75e10  ; InitAsyncStub
    // 0xad26c4: ldur            x2, [fp, #-0x10]
    // 0xad26c8: LoadField: r0 = r2->field_f
    //     0xad26c8: ldur            w0, [x2, #0xf]
    // 0xad26cc: DecompressPointer r0
    //     0xad26cc: add             x0, x0, HEAP, lsl #32
    // 0xad26d0: stur            x0, [fp, #-0x18]
    // 0xad26d4: LoadField: r1 = r0->field_f
    //     0xad26d4: ldur            w1, [x0, #0xf]
    // 0xad26d8: DecompressPointer r1
    //     0xad26d8: add             x1, x1, HEAP, lsl #32
    // 0xad26dc: cmp             w1, NULL
    // 0xad26e0: b.eq            #0xad26fc
    // 0xad26e4: r1 = Function '<anonymous closure>':.
    //     0xad26e4: add             x1, PP, #0x11, lsl #12  ; [pp+0x11110] AnonymousClosure: (0x684ff4), in [CVk] _cmb::<anonymous closure> (0x741054)
    //     0xad26e8: ldr             x1, [x1, #0x110]
    // 0xad26ec: r0 = AllocateClosure()
    //     0xad26ec: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xad26f0: ldur            x1, [fp, #-0x18]
    // 0xad26f4: mov             x2, x0
    // 0xad26f8: r0 = call 0x312460
    //     0xad26f8: bl              #0x312460
    // 0xad26fc: r0 = Null
    //     0xad26fc: mov             x0, NULL
    // 0xad2700: r0 = ReturnAsyncNotFuture()
    //     0xad2700: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad2704: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad2704: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad2708: b               #0xad26bc
  }
  [closure] void <anonymous closure>(dynamic, S) {
    // ** addr: 0x742220, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x741054, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x6850b8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x684ff4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x742290, size: -0x1
  }
}

// class id: 3850, size: 0x1c, field offset: 0xc
//   const constructor, 
abstract class Xlb extends iw {
}

// class id: 3851, size: 0x1c, field offset: 0x1c
class amb extends Xlb {

  [closure] int <anonymous closure>(dynamic, (tW?, int), (tW?, int)) {
    // ** addr: 0x6305f4, size: -0x1
  }
}

// class id: 3852, size: 0x1c, field offset: 0x1c
class Zlb extends Xlb {
}

// class id: 3853, size: 0x1c, field offset: 0x1c
class Ylb extends Xlb {
}

// class id: 4032, size: 0x10, field offset: 0xc
//   const constructor, 
class bmb extends Ku {

  bool field_c;
}

// class id: 5789, size: 0x18, field offset: 0x14
enum Wlb extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
  _OneByteString field_14;
}
