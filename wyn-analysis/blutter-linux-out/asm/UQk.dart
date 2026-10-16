// lib: , url: UQk

// class id: 1050198, size: 0x8
class :: {

  [closure] static void hIi(dynamic, (dynamic) => void) {
    // ** addr: 0xb0931c, size: 0xb8
    // 0xb0931c: EnterFrame
    //     0xb0931c: stp             fp, lr, [SP, #-0x10]!
    //     0xb09320: mov             fp, SP
    // 0xb09324: AllocStack(0x58)
    //     0xb09324: sub             SP, SP, #0x58
    // 0xb09328: SetupParameters([dynamic _ /* r0 */])
    //     0xb09328: ldr             x0, [fp, #0x18]
    //     0xb0932c: ldur            w1, [x0, #0x17]
    //     0xb09330: add             x1, x1, HEAP, lsl #32
    //     0xb09334: stur            x1, [fp, #-0x50]
    // 0xb09338: CheckStackOverflow
    //     0xb09338: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb0933c: cmp             SP, x16
    //     0xb09340: b.ls            #0xb093cc
    // 0xb09344: ldr             x16, [fp, #0x10]
    // 0xb09348: str             x16, [SP]
    // 0xb0934c: ldr             x0, [fp, #0x10]
    // 0xb09350: ClosureCall
    //     0xb09350: ldr             x4, [PP, #0xe40]  ; [pp+0xe40] List(5) [0, 0x1, 0x1, 0x1, Null]
    //     0xb09354: ldur            x2, [x0, #0x1f]
    //     0xb09358: blr             x2
    // 0xb0935c: b               #0xb093ac
    // 0xb09360: sub             SP, fp, #0x58
    // 0xb09364: ldur            x2, [fp, #-0x50]
    // 0xb09368: mov             x3, x0
    // 0xb0936c: mov             x5, x1
    // 0xb09370: LoadField: r1 = r2->field_13
    //     0xb09370: ldur            w1, [x2, #0x13]
    // 0xb09374: DecompressPointer r1
    //     0xb09374: add             x1, x1, HEAP, lsl #32
    // 0xb09378: ArrayLoad: r0 = r2[0]  ; List_4
    //     0xb09378: ldur            w0, [x2, #0x17]
    // 0xb0937c: DecompressPointer r0
    //     0xb0937c: add             x0, x0, HEAP, lsl #32
    // 0xb09380: r16 = Sentinel
    //     0xb09380: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xb09384: cmp             w0, w16
    // 0xb09388: b.eq            #0xb093bc
    // 0xb0938c: r2 = LoadClassIdInstr(r1)
    //     0xb0938c: ldur            x2, [x1, #-1]
    //     0xb09390: ubfx            x2, x2, #0xc, #0x14
    // 0xb09394: mov             x16, x0
    // 0xb09398: mov             x0, x2
    // 0xb0939c: mov             x2, x16
    // 0xb093a0: r0 = GDT[cid_x0 + -0x1000]()
    //     0xb093a0: sub             lr, x0, #1, lsl #12
    //     0xb093a4: ldr             lr, [x21, lr, lsl #3]
    //     0xb093a8: blr             lr
    // 0xb093ac: r0 = Null
    //     0xb093ac: mov             x0, NULL
    // 0xb093b0: LeaveFrame
    //     0xb093b0: mov             SP, fp
    //     0xb093b4: ldp             fp, lr, [SP], #0x10
    // 0xb093b8: ret
    //     0xb093b8: ret             
    // 0xb093bc: r16 = "controller"
    //     0xb093bc: ldr             x16, [PP, #0x4908]  ; [pp+0x4908] "controller"
    // 0xb093c0: str             x16, [SP]
    // 0xb093c4: r0 = _throwLocalNotInitialized()
    //     0xb093c4: bl              #0x3053b0  ; [dart:_internal] LateError::_throwLocalNotInitialized
    // 0xb093c8: brk             #0
    // 0xb093cc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb093cc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb093d0: b               #0xb09344
  }
  [closure] static Null <anonymous closure>(dynamic) {
    // ** addr: 0x93eb88, size: -0x1
  }
  [closure] static Future<List<dynamic>> <anonymous closure>(dynamic) {
    // ** addr: 0x93e8f8, size: -0x1
  }
  [closure] static Null <anonymous closure>(dynamic) {
    // ** addr: 0x93e7a4, size: -0x1
  }
  [closure] static Null <anonymous closure>(dynamic) {
    // ** addr: 0x93e654, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x93e71c, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x93e870, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x93f0a4, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic, Y0) {
    // ** addr: 0x93ef48, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic, Object, Ia?) {
    // ** addr: 0x93eddc, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x93ecd0, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x93ed54, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x93ee90, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x93eff4, size: -0x1
  }
}
