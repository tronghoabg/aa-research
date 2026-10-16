// lib: , url: AVk

// class id: 1050411, size: 0x8
class :: {
}

// class id: 3287, size: 0x14, field offset: 0x14
//   transformed mixin,
abstract class _Ulb extends Nu<dynamic>
     with jR {
}

// class id: 3288, size: 0x28, field offset: 0x14
class _Tlb extends _Ulb {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0xad2164, size: 0x90
    // 0xad2164: EnterFrame
    //     0xad2164: stp             fp, lr, [SP, #-0x10]!
    //     0xad2168: mov             fp, SP
    // 0xad216c: AllocStack(0x60)
    //     0xad216c: sub             SP, SP, #0x60
    // 0xad2170: SetupParameters(_Tlb this /* r1 */)
    //     0xad2170: stur            NULL, [fp, #-8]
    //     0xad2174: movz            x0, #0
    //     0xad2178: add             x1, fp, w0, sxtw #2
    //     0xad217c: ldr             x1, [x1, #0x10]
    //     0xad2180: ldur            w2, [x1, #0x17]
    //     0xad2184: add             x2, x2, HEAP, lsl #32
    //     0xad2188: stur            x2, [fp, #-0x58]
    // 0xad218c: CheckStackOverflow
    //     0xad218c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad2190: cmp             SP, x16
    //     0xad2194: b.ls            #0xad21ec
    // 0xad2198: InitAsync() -> Future<void?>
    //     0xad2198: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xad219c: bl              #0xa75e10  ; InitAsyncStub
    // 0xad21a0: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xad21a0: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xad21a4: ldr             x0, [x0, #0x28a8]
    //     0xad21a8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xad21ac: cmp             w0, w16
    //     0xad21b0: b.ne            #0xad21c0
    //     0xad21b4: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xad21b8: ldr             x2, [x2, #0xc90]
    //     0xad21bc: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xad21c0: mov             x1, x0
    // 0xad21c4: r2 = true
    //     0xad21c4: add             x2, NULL, #0x20  ; true
    // 0xad21c8: r0 = __unknown_function__()
    //     0xad21c8: bl              #0xa79020  ; [] ::__unknown_function__
    // 0xad21cc: mov             x1, x0
    // 0xad21d0: stur            x1, [fp, #-0x60]
    // 0xad21d4: r0 = Await()
    //     0xad21d4: bl              #0xa75a20  ; AwaitStub
    // 0xad21d8: b               #0xad21e0
    // 0xad21dc: sub             SP, fp, #0x60
    // 0xad21e0: r0 = __unknown_function__()
    //     0xad21e0: bl              #0xacb45c  ; [] ::__unknown_function__
    // 0xad21e4: r0 = call 0x7401c8
    //     0xad21e4: bl              #0x7401c8
    // 0xad21e8: brk             #0
    // 0xad21ec: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad21ec: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad21f0: b               #0xad2198
  }
  [closure] bool <anonymous closure>(dynamic, dkb) {
    // ** addr: 0x6efab0, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, Qjb) {
    // ** addr: 0x740484, size: -0x1
  }
  [closure] Pjb <anonymous closure>(dynamic, Qjb) {
    // ** addr: 0x7402bc, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, Zjb) {
    // ** addr: 0x6e34e8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, S) {
    // ** addr: 0x740220, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, bool) {
    // ** addr: 0x73feac, size: -0x1
  }
  [closure] rQ <anonymous closure>(dynamic, aqa) {
    // ** addr: 0x73ff30, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x70179c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x740290, size: -0x1
  }
}

// class id: 4083, size: 0xc, field offset: 0xc
//   const constructor, 
class Slb extends _ijb {
}
