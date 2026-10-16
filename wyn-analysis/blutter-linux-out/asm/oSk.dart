// lib: , url: oSk

// class id: 1050266, size: 0x8
class :: {
}

// class id: 473, size: 0x8, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _Ceb extends Object
     with W<X0> {

  List<Y0> Zk<Y0>(_Ceb) {
    // ** addr: 0xaa3a94, size: 0x70
    // 0xaa3a94: EnterFrame
    //     0xaa3a94: stp             fp, lr, [SP, #-0x10]!
    //     0xaa3a98: mov             fp, SP
    // 0xaa3a9c: AllocStack(0x10)
    //     0xaa3a9c: sub             SP, SP, #0x10
    // 0xaa3aa0: SetupParameters()
    //     0xaa3aa0: ldur            w0, [x4, #0xf]
    //     0xaa3aa4: cbnz            w0, #0xaa3ab0
    //     0xaa3aa8: mov             x1, NULL
    //     0xaa3aac: b               #0xaa3abc
    //     0xaa3ab0: ldur            w0, [x4, #0x17]
    //     0xaa3ab4: add             x1, fp, w0, sxtw #2
    //     0xaa3ab8: ldr             x1, [x1, #0x10]
    // 0xaa3abc: CheckStackOverflow
    //     0xaa3abc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaa3ac0: cmp             SP, x16
    //     0xaa3ac4: b.ls            #0xaa3afc
    // 0xaa3ac8: r2 = Null
    //     0xaa3ac8: mov             x2, NULL
    // 0xaa3acc: r3 = <String, Y0>
    //     0xaa3acc: add             x3, PP, #0x1c, lsl #12  ; [pp+0x1c188] TypeArguments: <String, Y0>
    //     0xaa3ad0: ldr             x3, [x3, #0x188]
    // 0xaa3ad4: r30 = InstantiateTypeArgumentsStub
    //     0xaa3ad4: ldr             lr, [PP, #0x1320]  ; [pp+0x1320] Stub: InstantiateTypeArguments (0x2d0f10)
    // 0xaa3ad8: LoadField: r30 = r30->field_7
    //     0xaa3ad8: ldur            lr, [lr, #7]
    // 0xaa3adc: blr             lr
    // 0xaa3ae0: ldr             x16, [fp, #0x10]
    // 0xaa3ae4: stp             x16, x0, [SP]
    // 0xaa3ae8: r4 = const [0x2, 0x1, 0x1, 0x1, null]
    //     0xaa3ae8: ldr             x4, [PP, #0x2e58]  ; [pp+0x2e58] List(5) [0x2, 0x1, 0x1, 0x1, Null]
    // 0xaa3aec: r0 = call 0x640f18
    //     0xaa3aec: bl              #0x640f18
    // 0xaa3af0: LeaveFrame
    //     0xaa3af0: mov             SP, fp
    //     0xaa3af4: ldp             fp, lr, [SP], #0x10
    // 0xaa3af8: ret
    //     0xaa3af8: ret             
    // 0xaa3afc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaa3afc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaa3b00: b               #0xaa3ac8
  }
  List<String> +(_Ceb, List<String>) {
    // ** addr: 0xa82344, size: 0x6c
    // 0xa82344: EnterFrame
    //     0xa82344: stp             fp, lr, [SP, #-0x10]!
    //     0xa82348: mov             fp, SP
    // 0xa8234c: CheckStackOverflow
    //     0xa8234c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa82350: cmp             SP, x16
    //     0xa82354: b.ls            #0xa82390
    // 0xa82358: ldr             x0, [fp, #0x10]
    // 0xa8235c: r2 = Null
    //     0xa8235c: mov             x2, NULL
    // 0xa82360: r1 = Null
    //     0xa82360: mov             x1, NULL
    // 0xa82364: r8 = List<String>
    //     0xa82364: add             x8, PP, #0x1c, lsl #12  ; [pp+0x1ce38] Type: List<String>
    //     0xa82368: ldr             x8, [x8, #0xe38]
    // 0xa8236c: r3 = Null
    //     0xa8236c: add             x3, PP, #0x24, lsl #12  ; [pp+0x24718] Null
    //     0xa82370: ldr             x3, [x3, #0x718]
    // 0xa82374: r0 = List<String>()
    //     0xa82374: bl              #0xa70338  ; IsType_List<String>_Stub
    // 0xa82378: ldr             x2, [fp, #0x18]
    // 0xa8237c: r1 = <String>
    //     0xa8237c: ldr             x1, [PP, #0xf60]  ; [pp+0xf60] TypeArguments: <String>
    // 0xa82380: r0 = call 0x2e74f0
    //     0xa82380: bl              #0x2e74f0
    // 0xa82384: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0xa82384: ldr             x0, [PP, #0x880]  ; [pp+0x880] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0xa82388: r0 = Throw()
    //     0xa82388: bl              #0xb27dfc  ; ThrowStub
    // 0xa8238c: brk             #0
    // 0xa82390: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa82390: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa82394: b               #0xa82358
  }
  [closure] bool Bk(dynamic, Object?) {
    // ** addr: 0x64244c, size: -0x1
  }
}

// class id: 474, size: 0x1c, field offset: 0x8
class Beb extends _Ceb {

  late List<String> _yqg; // offset: 0x10
  static late final bool _aAb; // offset: 0x1350
  late String _fzb; // offset: 0x18
  late bool _xqg; // offset: 0xc

  String [](Beb, int) {
    // ** addr: 0xa82284, size: 0xc0
    // 0xa82284: EnterFrame
    //     0xa82284: stp             fp, lr, [SP, #-0x10]!
    //     0xa82288: mov             fp, SP
    // 0xa8228c: ldr             x0, [fp, #0x10]
    // 0xa82290: r2 = Null
    //     0xa82290: mov             x2, NULL
    // 0xa82294: r1 = Null
    //     0xa82294: mov             x1, NULL
    // 0xa82298: branchIfSmi(r0, 0xa822c0)
    //     0xa82298: tbz             w0, #0, #0xa822c0
    // 0xa8229c: r4 = LoadClassIdInstr(r0)
    //     0xa8229c: ldur            x4, [x0, #-1]
    //     0xa822a0: ubfx            x4, x4, #0xc, #0x14
    // 0xa822a4: sub             x4, x4, #0x3c
    // 0xa822a8: cmp             x4, #1
    // 0xa822ac: b.ls            #0xa822c0
    // 0xa822b0: r8 = int
    //     0xa822b0: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xa822b4: r3 = Null
    //     0xa822b4: add             x3, PP, #0x1c, lsl #12  ; [pp+0x1c138] Null
    //     0xa822b8: ldr             x3, [x3, #0x138]
    // 0xa822bc: r0 = int()
    //     0xa822bc: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xa822c0: ldr             x2, [fp, #0x18]
    // 0xa822c4: LoadField: r3 = r2->field_f
    //     0xa822c4: ldur            w3, [x2, #0xf]
    // 0xa822c8: DecompressPointer r3
    //     0xa822c8: add             x3, x3, HEAP, lsl #32
    // 0xa822cc: r16 = Sentinel
    //     0xa822cc: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xa822d0: cmp             w3, w16
    // 0xa822d4: b.eq            #0xa8231c
    // 0xa822d8: LoadField: r2 = r3->field_b
    //     0xa822d8: ldur            w2, [x3, #0xb]
    // 0xa822dc: ldr             x4, [fp, #0x10]
    // 0xa822e0: r5 = LoadInt32Instr(r4)
    //     0xa822e0: sbfx            x5, x4, #1, #0x1f
    //     0xa822e4: tbz             w4, #0, #0xa822ec
    //     0xa822e8: ldur            x5, [x4, #7]
    // 0xa822ec: r0 = LoadInt32Instr(r2)
    //     0xa822ec: sbfx            x0, x2, #1, #0x1f
    // 0xa822f0: mov             x1, x5
    // 0xa822f4: cmp             x1, x0
    // 0xa822f8: b.hs            #0xa82328
    // 0xa822fc: LoadField: r1 = r3->field_f
    //     0xa822fc: ldur            w1, [x3, #0xf]
    // 0xa82300: DecompressPointer r1
    //     0xa82300: add             x1, x1, HEAP, lsl #32
    // 0xa82304: ArrayLoad: r0 = r1[r5]  ; Unknown_4
    //     0xa82304: add             x16, x1, x5, lsl #2
    //     0xa82308: ldur            w0, [x16, #0xf]
    // 0xa8230c: DecompressPointer r0
    //     0xa8230c: add             x0, x0, HEAP, lsl #32
    // 0xa82310: LeaveFrame
    //     0xa82310: mov             SP, fp
    //     0xa82314: ldp             fp, lr, [SP], #0x10
    // 0xa82318: ret
    //     0xa82318: ret             
    // 0xa8231c: r9 = _yqg
    //     0xa8231c: add             x9, PP, #0x19, lsl #12  ; [pp+0x19418] Field <Beb._yqg@1717479637>: late (offset: 0x10)
    //     0xa82320: ldr             x9, [x9, #0x418]
    // 0xa82324: r0 = LateInitializationErrorSharedWithoutFPURegs()
    //     0xa82324: bl              #0xb2a470  ; LateInitializationErrorSharedWithoutFPURegsStub
    // 0xa82328: r0 = RangeErrorSharedWithoutFPURegs()
    //     0xa82328: bl              #0xb2a088  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] bool _jac(dynamic, String) {
    // ** addr: 0x7fe8bc, size: -0x1
  }
  [closure] bool _Bqg(dynamic, String) {
    // ** addr: 0x7fe880, size: -0x1
  }
  [closure] List<String> _EFb(dynamic, String, bool?) {
    // ** addr: 0x7fe840, size: -0x1
  }
  [closure] String <anonymous closure>(dynamic, Wp) {
    // ** addr: 0x701b4c, size: -0x1
  }
}
