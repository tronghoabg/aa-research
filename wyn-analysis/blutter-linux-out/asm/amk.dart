// lib: xXk, url: AMk

// class id: 1049981, size: 0x8
class :: {

  [closure] static String _kYg(dynamic, String) {
    // ** addr: 0x6f80c4, size: -0x1
  }
}

// class id: 806, size: 0xc, field offset: 0x8
class JVa extends Object
    implements ra {
}

// class id: 807, size: 0x8, field offset: 0x8
abstract class IVa extends Object {
}

// class id: 808, size: 0x14, field offset: 0x8
class GVa<X0> extends Object
    implements IVa {

  bool Kl(GVa<X0>, String) {
    // ** addr: 0xab45e0, size: 0x84
    // 0xab45e0: EnterFrame
    //     0xab45e0: stp             fp, lr, [SP, #-0x10]!
    //     0xab45e4: mov             fp, SP
    // 0xab45e8: CheckStackOverflow
    //     0xab45e8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xab45ec: cmp             SP, x16
    //     0xab45f0: b.ls            #0xab4644
    // 0xab45f4: ldr             x0, [fp, #0x10]
    // 0xab45f8: r2 = Null
    //     0xab45f8: mov             x2, NULL
    // 0xab45fc: r1 = Null
    //     0xab45fc: mov             x1, NULL
    // 0xab4600: r4 = 60
    //     0xab4600: movz            x4, #0x3c
    // 0xab4604: branchIfSmi(r0, 0xab4610)
    //     0xab4604: tbz             w0, #0, #0xab4610
    // 0xab4608: r4 = LoadClassIdInstr(r0)
    //     0xab4608: ldur            x4, [x0, #-1]
    //     0xab460c: ubfx            x4, x4, #0xc, #0x14
    // 0xab4610: sub             x4, x4, #0x5e
    // 0xab4614: cmp             x4, #1
    // 0xab4618: b.ls            #0xab462c
    // 0xab461c: r8 = String
    //     0xab461c: ldr             x8, [PP, #0xa10]  ; [pp+0xa10] Type: String
    // 0xab4620: r3 = Null
    //     0xab4620: add             x3, PP, #0x1c, lsl #12  ; [pp+0x1c8e8] Null
    //     0xab4624: ldr             x3, [x3, #0x8e8]
    // 0xab4628: r0 = String()
    //     0xab4628: bl              #0xb2f430  ; IsType_String_Stub
    // 0xab462c: ldr             x1, [fp, #0x18]
    // 0xab4630: ldr             x2, [fp, #0x10]
    // 0xab4634: r0 = call 0x6f779c
    //     0xab4634: bl              #0x6f779c
    // 0xab4638: LeaveFrame
    //     0xab4638: mov             SP, fp
    //     0xab463c: ldp             fp, lr, [SP], #0x10
    // 0xab4640: ret
    //     0xab4640: ret             
    // 0xab4644: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xab4644: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xab4648: b               #0xab45f4
  }
  X0 [](GVa<X0>, String) {
    // ** addr: 0xab4670, size: 0x84
    // 0xab4670: EnterFrame
    //     0xab4670: stp             fp, lr, [SP, #-0x10]!
    //     0xab4674: mov             fp, SP
    // 0xab4678: CheckStackOverflow
    //     0xab4678: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xab467c: cmp             SP, x16
    //     0xab4680: b.ls            #0xab46d4
    // 0xab4684: ldr             x0, [fp, #0x10]
    // 0xab4688: r2 = Null
    //     0xab4688: mov             x2, NULL
    // 0xab468c: r1 = Null
    //     0xab468c: mov             x1, NULL
    // 0xab4690: r4 = 60
    //     0xab4690: movz            x4, #0x3c
    // 0xab4694: branchIfSmi(r0, 0xab46a0)
    //     0xab4694: tbz             w0, #0, #0xab46a0
    // 0xab4698: r4 = LoadClassIdInstr(r0)
    //     0xab4698: ldur            x4, [x0, #-1]
    //     0xab469c: ubfx            x4, x4, #0xc, #0x14
    // 0xab46a0: sub             x4, x4, #0x5e
    // 0xab46a4: cmp             x4, #1
    // 0xab46a8: b.ls            #0xab46bc
    // 0xab46ac: r8 = String
    //     0xab46ac: ldr             x8, [PP, #0xa10]  ; [pp+0xa10] Type: String
    // 0xab46b0: r3 = Null
    //     0xab46b0: add             x3, PP, #0x1c, lsl #12  ; [pp+0x1c900] Null
    //     0xab46b4: ldr             x3, [x3, #0x900]
    // 0xab46b8: r0 = String()
    //     0xab46b8: bl              #0xb2f430  ; IsType_String_Stub
    // 0xab46bc: ldr             x1, [fp, #0x18]
    // 0xab46c0: ldr             x2, [fp, #0x10]
    // 0xab46c4: r0 = call 0x6f7b88
    //     0xab46c4: bl              #0x6f7b88
    // 0xab46c8: LeaveFrame
    //     0xab46c8: mov             SP, fp
    //     0xab46cc: ldp             fp, lr, [SP], #0x10
    // 0xab46d0: ret
    //     0xab46d0: ret             
    // 0xab46d4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xab46d4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xab46d8: b               #0xab4684
  }
}
