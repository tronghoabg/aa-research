// lib: , url: package:flutter/src/services/platform_channel.dart

// class id: 1049423, size: 0x8
class :: {
}

// class id: 1927, size: 0x14, field offset: 0x8
//   const constructor, 
class Nia extends Object {

  _OneByteString field_8;
  Aia field_c;

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0xa9613c, size: 0x14c
    // 0xa9613c: EnterFrame
    //     0xa9613c: stp             fp, lr, [SP, #-0x10]!
    //     0xa96140: mov             fp, SP
    // 0xa96144: AllocStack(0x90)
    //     0xa96144: sub             SP, SP, #0x90
    // 0xa96148: SetupParameters(Nia this /* r1 */)
    //     0xa96148: stur            NULL, [fp, #-8]
    //     0xa9614c: movz            x0, #0
    //     0xa96150: add             x1, fp, w0, sxtw #2
    //     0xa96154: ldr             x1, [x1, #0x10]
    //     0xa96158: ldur            w2, [x1, #0x17]
    //     0xa9615c: add             x2, x2, HEAP, lsl #32
    //     0xa96160: stur            x2, [fp, #-0x60]
    // 0xa96164: CheckStackOverflow
    //     0xa96164: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa96168: cmp             SP, x16
    //     0xa9616c: b.ls            #0xa96280
    // 0xa96170: InitAsync() -> Future<void?>
    //     0xa96170: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xa96174: bl              #0xa75e10  ; InitAsyncStub
    // 0xa96178: r0 = call 0x33ad30
    //     0xa96178: bl              #0x33ad30
    // 0xa9617c: ldur            x0, [fp, #-0x60]
    // 0xa96180: LoadField: r1 = r0->field_f
    //     0xa96180: ldur            w1, [x0, #0xf]
    // 0xa96184: DecompressPointer r1
    //     0xa96184: add             x1, x1, HEAP, lsl #32
    // 0xa96188: LoadField: r2 = r1->field_7
    //     0xa96188: ldur            w2, [x1, #7]
    // 0xa9618c: DecompressPointer r2
    //     0xa9618c: add             x2, x2, HEAP, lsl #32
    // 0xa96190: r1 = Instance__cia
    //     0xa96190: ldr             x1, [PP, #0x2630]  ; [pp+0x2630] Obj!_cia@5569f1
    // 0xa96194: r3 = Null
    //     0xa96194: mov             x3, NULL
    // 0xa96198: r0 = call 0x3490f4
    //     0xa96198: bl              #0x3490f4
    // 0xa9619c: ldur            x0, [fp, #-0x60]
    // 0xa961a0: ArrayLoad: r1 = r0[0]  ; List_4
    //     0xa961a0: ldur            w1, [x0, #0x17]
    // 0xa961a4: DecompressPointer r1
    //     0xa961a4: add             x1, x1, HEAP, lsl #32
    // 0xa961a8: LoadField: r2 = r0->field_13
    //     0xa961a8: ldur            w2, [x0, #0x13]
    // 0xa961ac: DecompressPointer r2
    //     0xa961ac: add             x2, x2, HEAP, lsl #32
    // 0xa961b0: r16 = <void?>
    //     0xa961b0: ldr             x16, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    // 0xa961b4: stp             x1, x16, [SP, #0x10]
    // 0xa961b8: r16 = "cancel"
    //     0xa961b8: add             x16, PP, #8, lsl #12  ; [pp+0x8570] "cancel"
    //     0xa961bc: ldr             x16, [x16, #0x570]
    // 0xa961c0: stp             x2, x16, [SP]
    // 0xa961c4: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0xa961c4: ldr             x4, [PP, #0x2610]  ; [pp+0x2610] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0xa961c8: r0 = call 0xa2ddb0
    //     0xa961c8: bl              #0xa2ddb0
    // 0xa961cc: mov             x1, x0
    // 0xa961d0: stur            x1, [fp, #-0x68]
    // 0xa961d4: r0 = Await()
    //     0xa961d4: bl              #0xa75a20  ; AwaitStub
    // 0xa961d8: b               #0xa96278
    // 0xa961dc: sub             SP, fp, #0x90
    // 0xa961e0: ldur            x3, [fp, #-0x60]
    // 0xa961e4: mov             x4, x0
    // 0xa961e8: stur            x0, [fp, #-0x68]
    // 0xa961ec: mov             x0, x1
    // 0xa961f0: stur            x1, [fp, #-0x70]
    // 0xa961f4: r1 = Null
    //     0xa961f4: mov             x1, NULL
    // 0xa961f8: r2 = 4
    //     0xa961f8: movz            x2, #0x4
    // 0xa961fc: r0 = AllocateArray()
    //     0xa961fc: bl              #0xb29b38  ; AllocateArrayStub
    // 0xa96200: r16 = "while de-activating platform stream on channel "
    //     0xa96200: add             x16, PP, #8, lsl #12  ; [pp+0x8578] "while de-activating platform stream on channel "
    //     0xa96204: ldr             x16, [x16, #0x578]
    // 0xa96208: StoreField: r0->field_f = r16
    //     0xa96208: stur            w16, [x0, #0xf]
    // 0xa9620c: ldur            x1, [fp, #-0x60]
    // 0xa96210: LoadField: r2 = r1->field_f
    //     0xa96210: ldur            w2, [x1, #0xf]
    // 0xa96214: DecompressPointer r2
    //     0xa96214: add             x2, x2, HEAP, lsl #32
    // 0xa96218: LoadField: r1 = r2->field_7
    //     0xa96218: ldur            w1, [x2, #7]
    // 0xa9621c: DecompressPointer r1
    //     0xa9621c: add             x1, x1, HEAP, lsl #32
    // 0xa96220: StoreField: r0->field_13 = r1
    //     0xa96220: stur            w1, [x0, #0x13]
    // 0xa96224: str             x0, [SP]
    // 0xa96228: r0 = _interpolate()
    //     0xa96228: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xa9622c: r1 = <List<Object>>
    //     0xa9622c: ldr             x1, [PP, #0xe50]  ; [pp+0xe50] TypeArguments: <List<Object>>
    // 0xa96230: stur            x0, [fp, #-0x60]
    // 0xa96234: r0 = SI()
    //     0xa96234: bl              #0xa6bfc8  ; AllocateSIStub -> SI (size=0x2c)
    // 0xa96238: mov             x1, x0
    // 0xa9623c: ldur            x2, [fp, #-0x60]
    // 0xa96240: r3 = Instance_KI
    //     0xa96240: ldr             x3, [PP, #0xe58]  ; [pp+0xe58] Obj!KI@5776f1
    // 0xa96244: stur            x0, [fp, #-0x60]
    // 0xa96248: r0 = call 0x2eecac
    //     0xa96248: bl              #0x2eecac
    // 0xa9624c: r0 = WI()
    //     0xa9624c: bl              #0xa6c0e0  ; AllocateWIStub -> WI (size=0x1c)
    // 0xa96250: mov             x1, x0
    // 0xa96254: ldur            x0, [fp, #-0x68]
    // 0xa96258: StoreField: r1->field_7 = r0
    //     0xa96258: stur            w0, [x1, #7]
    // 0xa9625c: ldur            x0, [fp, #-0x70]
    // 0xa96260: StoreField: r1->field_b = r0
    //     0xa96260: stur            w0, [x1, #0xb]
    // 0xa96264: ldur            x0, [fp, #-0x60]
    // 0xa96268: StoreField: r1->field_f = r0
    //     0xa96268: stur            w0, [x1, #0xf]
    // 0xa9626c: r0 = false
    //     0xa9626c: add             x0, NULL, #0x30  ; false
    // 0xa96270: ArrayStore: r1[0] = r0  ; List_4
    //     0xa96270: stur            w0, [x1, #0x17]
    // 0xa96274: r0 = call 0x2eec40
    //     0xa96274: bl              #0x2eec40
    // 0xa96278: r0 = Null
    //     0xa96278: mov             x0, NULL
    // 0xa9627c: r0 = ReturnAsyncNotFuture()
    //     0xa9627c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa96280: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa96280: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa96284: b               #0xa96170
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0xa96288, size: 0x164
    // 0xa96288: EnterFrame
    //     0xa96288: stp             fp, lr, [SP, #-0x10]!
    //     0xa9628c: mov             fp, SP
    // 0xa96290: AllocStack(0x90)
    //     0xa96290: sub             SP, SP, #0x90
    // 0xa96294: SetupParameters(Nia this /* r1 */)
    //     0xa96294: stur            NULL, [fp, #-8]
    //     0xa96298: movz            x0, #0
    //     0xa9629c: add             x1, fp, w0, sxtw #2
    //     0xa962a0: ldr             x1, [x1, #0x10]
    //     0xa962a4: ldur            w2, [x1, #0x17]
    //     0xa962a8: add             x2, x2, HEAP, lsl #32
    //     0xa962ac: stur            x2, [fp, #-0x60]
    // 0xa962b0: CheckStackOverflow
    //     0xa962b0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa962b4: cmp             SP, x16
    //     0xa962b8: b.ls            #0xa963e4
    // 0xa962bc: InitAsync() -> Future<void?>
    //     0xa962bc: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xa962c0: bl              #0xa75e10  ; InitAsyncStub
    // 0xa962c4: r0 = call 0x33ad30
    //     0xa962c4: bl              #0x33ad30
    // 0xa962c8: ldur            x0, [fp, #-0x60]
    // 0xa962cc: LoadField: r1 = r0->field_f
    //     0xa962cc: ldur            w1, [x0, #0xf]
    // 0xa962d0: DecompressPointer r1
    //     0xa962d0: add             x1, x1, HEAP, lsl #32
    // 0xa962d4: LoadField: r3 = r1->field_7
    //     0xa962d4: ldur            w3, [x1, #7]
    // 0xa962d8: DecompressPointer r3
    //     0xa962d8: add             x3, x3, HEAP, lsl #32
    // 0xa962dc: mov             x2, x0
    // 0xa962e0: stur            x3, [fp, #-0x68]
    // 0xa962e4: r1 = Function '<anonymous closure>':.
    //     0xa962e4: add             x1, PP, #8, lsl #12  ; [pp+0x8580] AnonymousClosure: (0xa963ec), in [package:flutter/src/services/platform_channel.dart] Nia::<anonymous closure> (0xa96288)
    //     0xa962e8: ldr             x1, [x1, #0x580]
    // 0xa962ec: r0 = AllocateClosure()
    //     0xa962ec: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xa962f0: ldur            x2, [fp, #-0x68]
    // 0xa962f4: mov             x3, x0
    // 0xa962f8: r1 = Instance__cia
    //     0xa962f8: ldr             x1, [PP, #0x2630]  ; [pp+0x2630] Obj!_cia@5569f1
    // 0xa962fc: r0 = call 0x3490f4
    //     0xa962fc: bl              #0x3490f4
    // 0xa96300: ldur            x0, [fp, #-0x60]
    // 0xa96304: ArrayLoad: r1 = r0[0]  ; List_4
    //     0xa96304: ldur            w1, [x0, #0x17]
    // 0xa96308: DecompressPointer r1
    //     0xa96308: add             x1, x1, HEAP, lsl #32
    // 0xa9630c: LoadField: r2 = r0->field_13
    //     0xa9630c: ldur            w2, [x0, #0x13]
    // 0xa96310: DecompressPointer r2
    //     0xa96310: add             x2, x2, HEAP, lsl #32
    // 0xa96314: r16 = <void?>
    //     0xa96314: ldr             x16, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    // 0xa96318: stp             x1, x16, [SP, #0x10]
    // 0xa9631c: r16 = "listen"
    //     0xa9631c: add             x16, PP, #8, lsl #12  ; [pp+0x8588] "listen"
    //     0xa96320: ldr             x16, [x16, #0x588]
    // 0xa96324: stp             x2, x16, [SP]
    // 0xa96328: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0xa96328: ldr             x4, [PP, #0x2610]  ; [pp+0x2610] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0xa9632c: r0 = call 0xa2ddb0
    //     0xa9632c: bl              #0xa2ddb0
    // 0xa96330: mov             x1, x0
    // 0xa96334: stur            x1, [fp, #-0x68]
    // 0xa96338: r0 = Await()
    //     0xa96338: bl              #0xa75a20  ; AwaitStub
    // 0xa9633c: b               #0xa963dc
    // 0xa96340: sub             SP, fp, #0x90
    // 0xa96344: ldur            x3, [fp, #-0x60]
    // 0xa96348: mov             x4, x0
    // 0xa9634c: stur            x0, [fp, #-0x68]
    // 0xa96350: mov             x0, x1
    // 0xa96354: stur            x1, [fp, #-0x70]
    // 0xa96358: r1 = Null
    //     0xa96358: mov             x1, NULL
    // 0xa9635c: r2 = 4
    //     0xa9635c: movz            x2, #0x4
    // 0xa96360: r0 = AllocateArray()
    //     0xa96360: bl              #0xb29b38  ; AllocateArrayStub
    // 0xa96364: r16 = "while activating platform stream on channel "
    //     0xa96364: add             x16, PP, #8, lsl #12  ; [pp+0x8590] "while activating platform stream on channel "
    //     0xa96368: ldr             x16, [x16, #0x590]
    // 0xa9636c: StoreField: r0->field_f = r16
    //     0xa9636c: stur            w16, [x0, #0xf]
    // 0xa96370: ldur            x1, [fp, #-0x60]
    // 0xa96374: LoadField: r2 = r1->field_f
    //     0xa96374: ldur            w2, [x1, #0xf]
    // 0xa96378: DecompressPointer r2
    //     0xa96378: add             x2, x2, HEAP, lsl #32
    // 0xa9637c: LoadField: r1 = r2->field_7
    //     0xa9637c: ldur            w1, [x2, #7]
    // 0xa96380: DecompressPointer r1
    //     0xa96380: add             x1, x1, HEAP, lsl #32
    // 0xa96384: StoreField: r0->field_13 = r1
    //     0xa96384: stur            w1, [x0, #0x13]
    // 0xa96388: str             x0, [SP]
    // 0xa9638c: r0 = _interpolate()
    //     0xa9638c: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xa96390: r1 = <List<Object>>
    //     0xa96390: ldr             x1, [PP, #0xe50]  ; [pp+0xe50] TypeArguments: <List<Object>>
    // 0xa96394: stur            x0, [fp, #-0x60]
    // 0xa96398: r0 = SI()
    //     0xa96398: bl              #0xa6bfc8  ; AllocateSIStub -> SI (size=0x2c)
    // 0xa9639c: mov             x1, x0
    // 0xa963a0: ldur            x2, [fp, #-0x60]
    // 0xa963a4: r3 = Instance_KI
    //     0xa963a4: ldr             x3, [PP, #0xe58]  ; [pp+0xe58] Obj!KI@5776f1
    // 0xa963a8: stur            x0, [fp, #-0x60]
    // 0xa963ac: r0 = call 0x2eecac
    //     0xa963ac: bl              #0x2eecac
    // 0xa963b0: r0 = WI()
    //     0xa963b0: bl              #0xa6c0e0  ; AllocateWIStub -> WI (size=0x1c)
    // 0xa963b4: mov             x1, x0
    // 0xa963b8: ldur            x0, [fp, #-0x68]
    // 0xa963bc: StoreField: r1->field_7 = r0
    //     0xa963bc: stur            w0, [x1, #7]
    // 0xa963c0: ldur            x0, [fp, #-0x70]
    // 0xa963c4: StoreField: r1->field_b = r0
    //     0xa963c4: stur            w0, [x1, #0xb]
    // 0xa963c8: ldur            x0, [fp, #-0x60]
    // 0xa963cc: StoreField: r1->field_f = r0
    //     0xa963cc: stur            w0, [x1, #0xf]
    // 0xa963d0: r0 = false
    //     0xa963d0: add             x0, NULL, #0x30  ; false
    // 0xa963d4: ArrayStore: r1[0] = r0  ; List_4
    //     0xa963d4: stur            w0, [x1, #0x17]
    // 0xa963d8: r0 = call 0x2eec40
    //     0xa963d8: bl              #0x2eec40
    // 0xa963dc: r0 = Null
    //     0xa963dc: mov             x0, NULL
    // 0xa963e0: r0 = ReturnAsyncNotFuture()
    //     0xa963e0: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa963e4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa963e4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa963e8: b               #0xa962bc
  }
  [closure] Future<Null> <anonymous closure>(dynamic, ByteData?) async {
    // ** addr: 0xa963ec, size: 0x158
    // 0xa963ec: EnterFrame
    //     0xa963ec: stp             fp, lr, [SP, #-0x10]!
    //     0xa963f0: mov             fp, SP
    // 0xa963f4: AllocStack(0x78)
    //     0xa963f4: sub             SP, SP, #0x78
    // 0xa963f8: SetupParameters(Nia this /* r1 */, dynamic _ /* r2, fp-0x68 */)
    //     0xa963f8: stur            NULL, [fp, #-8]
    //     0xa963fc: movz            x0, #0
    //     0xa96400: add             x1, fp, w0, sxtw #2
    //     0xa96404: ldr             x1, [x1, #0x18]
    //     0xa96408: add             x2, fp, w0, sxtw #2
    //     0xa9640c: ldr             x2, [x2, #0x10]
    //     0xa96410: stur            x2, [fp, #-0x68]
    //     0xa96414: ldur            w3, [x1, #0x17]
    //     0xa96418: add             x3, x3, HEAP, lsl #32
    //     0xa9641c: stur            x3, [fp, #-0x60]
    // 0xa96420: CheckStackOverflow
    //     0xa96420: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa96424: cmp             SP, x16
    //     0xa96428: b.ls            #0xa9653c
    // 0xa9642c: InitAsync() -> Future<Null?>
    //     0xa9642c: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xa96430: bl              #0xa75e10  ; InitAsyncStub
    // 0xa96434: ldur            x3, [fp, #-0x68]
    // 0xa96438: cmp             w3, NULL
    // 0xa9643c: b.ne            #0xa96460
    // 0xa96440: ldur            x4, [fp, #-0x60]
    // 0xa96444: LoadField: r1 = r4->field_1b
    //     0xa96444: ldur            w1, [x4, #0x1b]
    // 0xa96448: DecompressPointer r1
    //     0xa96448: add             x1, x1, HEAP, lsl #32
    // 0xa9644c: r16 = Sentinel
    //     0xa9644c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xa96450: cmp             w1, w16
    // 0xa96454: b.eq            #0xa964fc
    // 0xa96458: r0 = call 0x968280
    //     0xa96458: bl              #0x968280
    // 0xa9645c: b               #0xa964f4
    // 0xa96460: ldur            x4, [fp, #-0x60]
    // 0xa96464: LoadField: r5 = r4->field_1b
    //     0xa96464: ldur            w5, [x4, #0x1b]
    // 0xa96468: DecompressPointer r5
    //     0xa96468: add             x5, x5, HEAP, lsl #32
    // 0xa9646c: stur            x5, [fp, #-0x70]
    // 0xa96470: r16 = Sentinel
    //     0xa96470: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xa96474: cmp             w5, w16
    // 0xa96478: b.eq            #0xa9650c
    // 0xa9647c: LoadField: r0 = r4->field_f
    //     0xa9647c: ldur            w0, [x4, #0xf]
    // 0xa96480: DecompressPointer r0
    //     0xa96480: add             x0, x0, HEAP, lsl #32
    // 0xa96484: LoadField: r1 = r0->field_b
    //     0xa96484: ldur            w1, [x0, #0xb]
    // 0xa96488: DecompressPointer r1
    //     0xa96488: add             x1, x1, HEAP, lsl #32
    // 0xa9648c: r0 = LoadClassIdInstr(r1)
    //     0xa9648c: ldur            x0, [x1, #-1]
    //     0xa96490: ubfx            x0, x0, #0xc, #0x14
    // 0xa96494: mov             x2, x3
    // 0xa96498: r0 = GDT[cid_x0 + -0x1000]()
    //     0xa96498: sub             lr, x0, #1, lsl #12
    //     0xa9649c: ldr             lr, [x21, lr, lsl #3]
    //     0xa964a0: blr             lr
    // 0xa964a4: ldur            x1, [fp, #-0x70]
    // 0xa964a8: mov             x2, x0
    // 0xa964ac: r0 = call 0x96c6a0
    //     0xa964ac: bl              #0x96c6a0
    // 0xa964b0: b               #0xa964f4
    // 0xa964b4: sub             SP, fp, #0x78
    // 0xa964b8: mov             x2, x0
    // 0xa964bc: r0 = 60
    //     0xa964bc: movz            x0, #0x3c
    // 0xa964c0: branchIfSmi(r2, 0xa964cc)
    //     0xa964c0: tbz             w2, #0, #0xa964cc
    // 0xa964c4: r0 = LoadClassIdInstr(r2)
    //     0xa964c4: ldur            x0, [x2, #-1]
    //     0xa964c8: ubfx            x0, x0, #0xc, #0x14
    // 0xa964cc: cmp             x0, #0x796
    // 0xa964d0: b.ne            #0xa96530
    // 0xa964d4: ldur            x0, [fp, #-0x60]
    // 0xa964d8: LoadField: r1 = r0->field_1b
    //     0xa964d8: ldur            w1, [x0, #0x1b]
    // 0xa964dc: DecompressPointer r1
    //     0xa964dc: add             x1, x1, HEAP, lsl #32
    // 0xa964e0: r16 = Sentinel
    //     0xa964e0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xa964e4: cmp             w1, w16
    // 0xa964e8: b.eq            #0xa96520
    // 0xa964ec: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xa964ec: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xa964f0: r0 = call 0x979d28
    //     0xa964f0: bl              #0x979d28
    // 0xa964f4: r0 = Null
    //     0xa964f4: mov             x0, NULL
    // 0xa964f8: r0 = ReturnAsyncNotFuture()
    //     0xa964f8: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa964fc: r16 = "controller"
    //     0xa964fc: ldr             x16, [PP, #0x4908]  ; [pp+0x4908] "controller"
    // 0xa96500: str             x16, [SP]
    // 0xa96504: r0 = _throwLocalNotInitialized()
    //     0xa96504: bl              #0x3053b0  ; [dart:_internal] LateError::_throwLocalNotInitialized
    // 0xa96508: brk             #0
    // 0xa9650c: mov             x0, x4
    // 0xa96510: r16 = "controller"
    //     0xa96510: ldr             x16, [PP, #0x4908]  ; [pp+0x4908] "controller"
    // 0xa96514: str             x16, [SP]
    // 0xa96518: r0 = _throwLocalNotInitialized()
    //     0xa96518: bl              #0x3053b0  ; [dart:_internal] LateError::_throwLocalNotInitialized
    // 0xa9651c: brk             #0
    // 0xa96520: r16 = "controller"
    //     0xa96520: ldr             x16, [PP, #0x4908]  ; [pp+0x4908] "controller"
    // 0xa96524: str             x16, [SP]
    // 0xa96528: r0 = _throwLocalNotInitialized()
    //     0xa96528: bl              #0x3053b0  ; [dart:_internal] LateError::_throwLocalNotInitialized
    // 0xa9652c: brk             #0
    // 0xa96530: mov             x0, x2
    // 0xa96534: r0 = ReThrow()
    //     0xa96534: bl              #0xb27dd0  ; ReThrowStub
    // 0xa96538: brk             #0
    // 0xa9653c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa9653c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa96540: b               #0xa9642c
  }
}

// class id: 1928, size: 0x14, field offset: 0x8
//   const constructor, 
class MethodChannel extends Object {

  _OneByteString field_8;
  Aia field_c;

  [closure] Future<ByteData?> <anonymous closure>(dynamic, ByteData?) {
    // ** addr: 0x349510, size: -0x1
  }
}

// class id: 1929, size: 0x14, field offset: 0x14
//   const constructor, 
class Mia extends MethodChannel {

  _OneByteString field_8;
  Aia field_c;
}

// class id: 1930, size: 0x18, field offset: 0x8
//   const constructor, 
class Lia<X0> extends Object {

  _OneByteString field_c;
  yia field_10;

  [closure] Future<ByteData?> <anonymous closure>(dynamic, ByteData?) async {
    // ** addr: 0xa7ce04, size: 0xe8
    // 0xa7ce04: EnterFrame
    //     0xa7ce04: stp             fp, lr, [SP, #-0x10]!
    //     0xa7ce08: mov             fp, SP
    // 0xa7ce0c: AllocStack(0x38)
    //     0xa7ce0c: sub             SP, SP, #0x38
    // 0xa7ce10: SetupParameters(Lia<X0> this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xa7ce10: stur            NULL, [fp, #-8]
    //     0xa7ce14: movz            x0, #0
    //     0xa7ce18: add             x1, fp, w0, sxtw #2
    //     0xa7ce1c: ldr             x1, [x1, #0x18]
    //     0xa7ce20: add             x2, fp, w0, sxtw #2
    //     0xa7ce24: ldr             x2, [x2, #0x10]
    //     0xa7ce28: stur            x2, [fp, #-0x18]
    //     0xa7ce2c: ldur            w3, [x1, #0x17]
    //     0xa7ce30: add             x3, x3, HEAP, lsl #32
    //     0xa7ce34: stur            x3, [fp, #-0x10]
    // 0xa7ce38: CheckStackOverflow
    //     0xa7ce38: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa7ce3c: cmp             SP, x16
    //     0xa7ce40: b.ls            #0xa7cee0
    // 0xa7ce44: InitAsync() -> Future<ByteData?>
    //     0xa7ce44: ldr             x0, [PP, #0x2638]  ; [pp+0x2638] TypeArguments: <ByteData?>
    //     0xa7ce48: bl              #0xa75e10  ; InitAsyncStub
    // 0xa7ce4c: ldur            x3, [fp, #-0x10]
    // 0xa7ce50: LoadField: r0 = r3->field_f
    //     0xa7ce50: ldur            w0, [x3, #0xf]
    // 0xa7ce54: DecompressPointer r0
    //     0xa7ce54: add             x0, x0, HEAP, lsl #32
    // 0xa7ce58: LoadField: r4 = r0->field_f
    //     0xa7ce58: ldur            w4, [x0, #0xf]
    // 0xa7ce5c: DecompressPointer r4
    //     0xa7ce5c: add             x4, x4, HEAP, lsl #32
    // 0xa7ce60: stur            x4, [fp, #-0x28]
    // 0xa7ce64: LoadField: r5 = r3->field_13
    //     0xa7ce64: ldur            w5, [x3, #0x13]
    // 0xa7ce68: DecompressPointer r5
    //     0xa7ce68: add             x5, x5, HEAP, lsl #32
    // 0xa7ce6c: stur            x5, [fp, #-0x20]
    // 0xa7ce70: r0 = LoadClassIdInstr(r4)
    //     0xa7ce70: ldur            x0, [x4, #-1]
    //     0xa7ce74: ubfx            x0, x0, #0xc, #0x14
    // 0xa7ce78: mov             x1, x4
    // 0xa7ce7c: ldur            x2, [fp, #-0x18]
    // 0xa7ce80: r0 = GDT[cid_x0 + 0xe27]()
    //     0xa7ce80: add             lr, x0, #0xe27
    //     0xa7ce84: ldr             lr, [x21, lr, lsl #3]
    //     0xa7ce88: blr             lr
    // 0xa7ce8c: mov             x1, x0
    // 0xa7ce90: ldur            x0, [fp, #-0x20]
    // 0xa7ce94: cmp             w0, NULL
    // 0xa7ce98: b.eq            #0xa7cee8
    // 0xa7ce9c: stp             x1, x0, [SP]
    // 0xa7cea0: ClosureCall
    //     0xa7cea0: ldr             x4, [PP, #0xe70]  ; [pp+0xe70] List(5) [0, 0x2, 0x2, 0x2, Null]
    //     0xa7cea4: ldur            x2, [x0, #0x1f]
    //     0xa7cea8: blr             x2
    // 0xa7ceac: mov             x1, x0
    // 0xa7ceb0: stur            x1, [fp, #-0x18]
    // 0xa7ceb4: r0 = Await()
    //     0xa7ceb4: bl              #0xa75a20  ; AwaitStub
    // 0xa7ceb8: ldur            x1, [fp, #-0x28]
    // 0xa7cebc: r2 = LoadClassIdInstr(r1)
    //     0xa7cebc: ldur            x2, [x1, #-1]
    //     0xa7cec0: ubfx            x2, x2, #0xc, #0x14
    // 0xa7cec4: mov             x16, x0
    // 0xa7cec8: mov             x0, x2
    // 0xa7cecc: mov             x2, x16
    // 0xa7ced0: r0 = GDT[cid_x0 + 0xdf4]()
    //     0xa7ced0: add             lr, x0, #0xdf4
    //     0xa7ced4: ldr             lr, [x21, lr, lsl #3]
    //     0xa7ced8: blr             lr
    // 0xa7cedc: r0 = ReturnAsyncNotFuture()
    //     0xa7cedc: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xa7cee0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa7cee0: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa7cee4: b               #0xa7ce44
    // 0xa7cee8: r0 = NullErrorSharedWithoutFPURegs()
    //     0xa7cee8: bl              #0xb2a398  ; NullErrorSharedWithoutFPURegsStub
  }
}
