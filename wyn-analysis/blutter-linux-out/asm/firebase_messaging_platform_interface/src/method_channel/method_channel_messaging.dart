// lib: , url: package:firebase_messaging_platform_interface/src/method_channel/method_channel_messaging.dart

// class id: 1049106, size: 0x8
class :: {

  static void _firebaseMessagingCallbackDispatcher() {
    // ** addr: 0x71281c, size: -0x1
  }
  [closure] static Future<Null> <anonymous closure>(dynamic, MethodCall) async {
    // ** addr: 0xacb990, size: 0x254
    // 0xacb990: EnterFrame
    //     0xacb990: stp             fp, lr, [SP, #-0x10]!
    //     0xacb994: mov             fp, SP
    // 0xacb998: AllocStack(0xb8)
    //     0xacb998: sub             SP, SP, #0xb8
    // 0xacb99c: SetupParameters(dynamic _ /* r1 */, dynamic _ /* r2, fp-0x78 */)
    //     0xacb99c: stur            NULL, [fp, #-8]
    //     0xacb9a0: movz            x0, #0
    //     0xacb9a4: add             x1, fp, w0, sxtw #2
    //     0xacb9a8: ldr             x1, [x1, #0x18]
    //     0xacb9ac: add             x2, fp, w0, sxtw #2
    //     0xacb9b0: ldr             x2, [x2, #0x10]
    //     0xacb9b4: stur            x2, [fp, #-0x78]
    //     0xacb9b8: ldur            w3, [x1, #0x17]
    //     0xacb9bc: add             x3, x3, HEAP, lsl #32
    //     0xacb9c0: stur            x3, [fp, #-0x70]
    // 0xacb9c4: CheckStackOverflow
    //     0xacb9c4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xacb9c8: cmp             SP, x16
    //     0xacb9cc: b.ls            #0xacbbd8
    // 0xacb9d0: InitAsync() -> Future<Null?>
    //     0xacb9d0: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xacb9d4: bl              #0xa75e10  ; InitAsyncStub
    // 0xacb9d8: ldur            x1, [fp, #-0x78]
    // 0xacb9dc: LoadField: r2 = r1->field_7
    //     0xacb9dc: ldur            w2, [x1, #7]
    // 0xacb9e0: DecompressPointer r2
    //     0xacb9e0: add             x2, x2, HEAP, lsl #32
    // 0xacb9e4: stur            x2, [fp, #-0x80]
    // 0xacb9e8: r0 = LoadClassIdInstr(r2)
    //     0xacb9e8: ldur            x0, [x2, #-1]
    //     0xacb9ec: ubfx            x0, x0, #0xc, #0x14
    // 0xacb9f0: r16 = "MessagingBackground#onMessage"
    //     0xacb9f0: add             x16, PP, #8, lsl #12  ; [pp+0x8698] "MessagingBackground#onMessage"
    //     0xacb9f4: ldr             x16, [x16, #0x698]
    // 0xacb9f8: stp             x16, x2, [SP]
    // 0xacb9fc: mov             lr, x0
    // 0xacba00: ldr             lr, [x21, lr, lsl #3]
    // 0xacba04: blr             lr
    // 0xacba08: tbnz            w0, #4, #0xacbb88
    // 0xacba0c: ldur            x0, [fp, #-0x78]
    // 0xacba10: LoadField: r1 = r0->field_b
    //     0xacba10: ldur            w1, [x0, #0xb]
    // 0xacba14: DecompressPointer r1
    //     0xacba14: add             x1, x1, HEAP, lsl #32
    // 0xacba18: stur            x1, [fp, #-0x88]
    // 0xacba1c: r16 = "userCallbackHandle"
    //     0xacba1c: add             x16, PP, #8, lsl #12  ; [pp+0x86a0] "userCallbackHandle"
    //     0xacba20: ldr             x16, [x16, #0x6a0]
    // 0xacba24: stp             x16, x1, [SP]
    // 0xacba28: r4 = 0
    //     0xacba28: movz            x4, #0
    // 0xacba2c: ldr             x0, [SP, #8]
    // 0xacba30: r16 = UnlinkedCall_0x2e3aa8
    //     0xacba30: add             x16, PP, #8, lsl #12  ; [pp+0x86a8] UnlinkedCall: 0x2e3aa8 - SwitchableCallMissStub
    //     0xacba34: add             x16, x16, #0x6a8
    // 0xacba38: ldp             x5, lr, [x16]
    // 0xacba3c: blr             lr
    // 0xacba40: mov             x3, x0
    // 0xacba44: r2 = Null
    //     0xacba44: mov             x2, NULL
    // 0xacba48: r1 = Null
    //     0xacba48: mov             x1, NULL
    // 0xacba4c: stur            x3, [fp, #-0x90]
    // 0xacba50: branchIfSmi(r0, 0xacba78)
    //     0xacba50: tbz             w0, #0, #0xacba78
    // 0xacba54: r4 = LoadClassIdInstr(r0)
    //     0xacba54: ldur            x4, [x0, #-1]
    //     0xacba58: ubfx            x4, x4, #0xc, #0x14
    // 0xacba5c: sub             x4, x4, #0x3c
    // 0xacba60: cmp             x4, #1
    // 0xacba64: b.ls            #0xacba78
    // 0xacba68: r8 = int
    //     0xacba68: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xacba6c: r3 = Null
    //     0xacba6c: add             x3, PP, #8, lsl #12  ; [pp+0x86b8] Null
    //     0xacba70: ldr             x3, [x3, #0x6b8]
    // 0xacba74: r0 = int()
    //     0xacba74: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xacba78: ldur            x0, [fp, #-0x90]
    // 0xacba7c: r1 = LoadInt32Instr(r0)
    //     0xacba7c: sbfx            x1, x0, #1, #0x1f
    //     0xacba80: tbz             w0, #0, #0xacba88
    //     0xacba84: ldur            x1, [x0, #7]
    // 0xacba88: stur            x1, [fp, #-0x98]
    // 0xacba8c: r0 = Ft()
    //     0xacba8c: bl              #0xacbe44  ; AllocateFtStub -> Ft (size=0x10)
    // 0xacba90: mov             x1, x0
    // 0xacba94: ldur            x0, [fp, #-0x98]
    // 0xacba98: StoreField: r1->field_7 = r0
    //     0xacba98: stur            x0, [x1, #7]
    // 0xacba9c: r0 = call 0x735b04
    //     0xacba9c: bl              #0x735b04
    // 0xacbaa0: mov             x3, x0
    // 0xacbaa4: stur            x3, [fp, #-0x90]
    // 0xacbaa8: cmp             w3, NULL
    // 0xacbaac: b.eq            #0xacbbe0
    // 0xacbab0: mov             x0, x3
    // 0xacbab4: r2 = Null
    //     0xacbab4: mov             x2, NULL
    // 0xacbab8: r1 = Null
    //     0xacbab8: mov             x1, NULL
    // 0xacbabc: r8 = (dynamic this, tE) => Future<void?>
    //     0xacbabc: add             x8, PP, #8, lsl #12  ; [pp+0x86c8] FunctionType: (dynamic this, tE) => Future<void?>
    //     0xacbac0: ldr             x8, [x8, #0x6c8]
    // 0xacbac4: r3 = Null
    //     0xacbac4: add             x3, PP, #8, lsl #12  ; [pp+0x86d0] Null
    //     0xacbac8: ldr             x3, [x3, #0x6d0]
    // 0xacbacc: r0 = DefaultTypeTest()
    //     0xacbacc: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xacbad0: ldur            x16, [fp, #-0x88]
    // 0xacbad4: r30 = "message"
    //     0xacbad4: add             lr, PP, #8, lsl #12  ; [pp+0x86e0] "message"
    //     0xacbad8: ldr             lr, [lr, #0x6e0]
    // 0xacbadc: stp             lr, x16, [SP]
    // 0xacbae0: r4 = 0
    //     0xacbae0: movz            x4, #0
    // 0xacbae4: ldr             x0, [SP, #8]
    // 0xacbae8: r16 = UnlinkedCall_0x2e3aa8
    //     0xacbae8: add             x16, PP, #8, lsl #12  ; [pp+0x86e8] UnlinkedCall: 0x2e3aa8 - SwitchableCallMissStub
    //     0xacbaec: add             x16, x16, #0x6e8
    // 0xacbaf0: ldp             x5, lr, [x16]
    // 0xacbaf4: blr             lr
    // 0xacbaf8: mov             x3, x0
    // 0xacbafc: r2 = Null
    //     0xacbafc: mov             x2, NULL
    // 0xacbb00: r1 = Null
    //     0xacbb00: mov             x1, NULL
    // 0xacbb04: stur            x3, [fp, #-0x88]
    // 0xacbb08: r8 = Map
    //     0xacbb08: ldr             x8, [PP, #0x2f58]  ; [pp+0x2f58] Type: Map
    // 0xacbb0c: r3 = Null
    //     0xacbb0c: add             x3, PP, #8, lsl #12  ; [pp+0x86f8] Null
    //     0xacbb10: ldr             x3, [x3, #0x6f8]
    // 0xacbb14: r0 = Map()
    //     0xacbb14: bl              #0xb30760  ; IsType_Map_Stub
    // 0xacbb18: ldur            x2, [fp, #-0x88]
    // 0xacbb1c: r1 = <String, dynamic>
    //     0xacbb1c: ldr             x1, [PP, #0x25f8]  ; [pp+0x25f8] TypeArguments: <String, dynamic>
    // 0xacbb20: r0 = call 0x327554
    //     0xacbb20: bl              #0x327554
    // 0xacbb24: mov             x2, x0
    // 0xacbb28: r1 = Null
    //     0xacbb28: mov             x1, NULL
    // 0xacbb2c: stur            x0, [fp, #-0x88]
    // 0xacbb30: r0 = call 0x7346a4
    //     0xacbb30: bl              #0x7346a4
    // 0xacbb34: mov             x1, x0
    // 0xacbb38: stur            x1, [fp, #-0xa0]
    // 0xacbb3c: ldur            x16, [fp, #-0x90]
    // 0xacbb40: stp             x1, x16, [SP]
    // 0xacbb44: ldur            x0, [fp, #-0x90]
    // 0xacbb48: ClosureCall
    //     0xacbb48: ldr             x4, [PP, #0xe70]  ; [pp+0xe70] List(5) [0, 0x2, 0x2, 0x2, Null]
    //     0xacbb4c: ldur            x2, [x0, #0x1f]
    //     0xacbb50: blr             x2
    // 0xacbb54: mov             x1, x0
    // 0xacbb58: stur            x1, [fp, #-0xa8]
    // 0xacbb5c: r0 = Await()
    //     0xacbb5c: bl              #0xa75a20  ; AwaitStub
    // 0xacbb60: b               #0xacbb80
    // 0xacbb64: sub             SP, fp, #0xb8
    // 0xacbb68: stur            x0, [fp, #-0x70]
    // 0xacbb6c: r1 = "FlutterFire Messaging: An error occurred in your background messaging handler:"
    //     0xacbb6c: add             x1, PP, #8, lsl #12  ; [pp+0x8708] "FlutterFire Messaging: An error occurred in your background messaging handler:"
    //     0xacbb70: ldr             x1, [x1, #0x708]
    // 0xacbb74: r0 = call 0x33fce0
    //     0xacbb74: bl              #0x33fce0
    // 0xacbb78: ldur            x1, [fp, #-0x70]
    // 0xacbb7c: r0 = call 0x33fce0
    //     0xacbb7c: bl              #0x33fce0
    // 0xacbb80: r0 = Null
    //     0xacbb80: mov             x0, NULL
    // 0xacbb84: r0 = ReturnAsyncNotFuture()
    //     0xacbb84: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xacbb88: ldur            x0, [fp, #-0x80]
    // 0xacbb8c: r1 = Null
    //     0xacbb8c: mov             x1, NULL
    // 0xacbb90: r2 = 4
    //     0xacbb90: movz            x2, #0x4
    // 0xacbb94: r0 = AllocateArray()
    //     0xacbb94: bl              #0xb29b38  ; AllocateArrayStub
    // 0xacbb98: mov             x1, x0
    // 0xacbb9c: ldur            x0, [fp, #-0x80]
    // 0xacbba0: StoreField: r1->field_f = r0
    //     0xacbba0: stur            w0, [x1, #0xf]
    // 0xacbba4: r16 = " has not been implemented"
    //     0xacbba4: add             x16, PP, #8, lsl #12  ; [pp+0x8710] " has not been implemented"
    //     0xacbba8: ldr             x16, [x16, #0x710]
    // 0xacbbac: StoreField: r1->field_13 = r16
    //     0xacbbac: stur            w16, [x1, #0x13]
    // 0xacbbb0: str             x1, [SP]
    // 0xacbbb4: r0 = _interpolate()
    //     0xacbbb4: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xacbbb8: stur            x0, [fp, #-0x70]
    // 0xacbbbc: r0 = pa()
    //     0xacbbbc: bl              #0xa6c1c8  ; AllocatepaStub -> pa (size=0x10)
    // 0xacbbc0: mov             x1, x0
    // 0xacbbc4: ldur            x0, [fp, #-0x70]
    // 0xacbbc8: StoreField: r1->field_b = r0
    //     0xacbbc8: stur            w0, [x1, #0xb]
    // 0xacbbcc: mov             x0, x1
    // 0xacbbd0: r0 = Throw()
    //     0xacbbd0: bl              #0xb27dfc  ; ThrowStub
    // 0xacbbd4: brk             #0
    // 0xacbbd8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xacbbd8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xacbbdc: b               #0xacb9d0
    // 0xacbbe0: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xacbbe0: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
  }
}

// class id: 4738, size: 0xc, field offset: 0xc
class qE extends rE {

  static late Ob<String> BZf; // offset: 0xea4

  [closure] static Future<void> <anonymous closure>(dynamic, MethodCall) async {
    // ** addr: 0xacbe50, size: 0x2d8
    // 0xacbe50: EnterFrame
    //     0xacbe50: stp             fp, lr, [SP, #-0x10]!
    //     0xacbe54: mov             fp, SP
    // 0xacbe58: AllocStack(0x38)
    //     0xacbe58: sub             SP, SP, #0x38
    // 0xacbe5c: SetupParameters(dynamic _ /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xacbe5c: stur            NULL, [fp, #-8]
    //     0xacbe60: movz            x0, #0
    //     0xacbe64: add             x1, fp, w0, sxtw #2
    //     0xacbe68: ldr             x1, [x1, #0x18]
    //     0xacbe6c: add             x2, fp, w0, sxtw #2
    //     0xacbe70: ldr             x2, [x2, #0x10]
    //     0xacbe74: stur            x2, [fp, #-0x18]
    //     0xacbe78: ldur            w3, [x1, #0x17]
    //     0xacbe7c: add             x3, x3, HEAP, lsl #32
    //     0xacbe80: stur            x3, [fp, #-0x10]
    // 0xacbe84: CheckStackOverflow
    //     0xacbe84: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xacbe88: cmp             SP, x16
    //     0xacbe8c: b.ls            #0xacc120
    // 0xacbe90: InitAsync() -> Future<void?>
    //     0xacbe90: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xacbe94: bl              #0xa75e10  ; InitAsyncStub
    // 0xacbe98: ldur            x0, [fp, #-0x18]
    // 0xacbe9c: LoadField: r1 = r0->field_7
    //     0xacbe9c: ldur            w1, [x0, #7]
    // 0xacbea0: DecompressPointer r1
    //     0xacbea0: add             x1, x1, HEAP, lsl #32
    // 0xacbea4: stur            x1, [fp, #-0x10]
    // 0xacbea8: r16 = "Messaging#onTokenRefresh"
    //     0xacbea8: add             x16, PP, #0x15, lsl #12  ; [pp+0x15aa0] "Messaging#onTokenRefresh"
    //     0xacbeac: ldr             x16, [x16, #0xaa0]
    // 0xacbeb0: stp             x1, x16, [SP]
    // 0xacbeb4: r0 = call 0x9ff3b8
    //     0xacbeb4: bl              #0x9ff3b8
    // 0xacbeb8: tbnz            w0, #4, #0xacbf40
    // 0xacbebc: ldur            x0, [fp, #-0x18]
    // 0xacbec0: r0 = InitLateStaticField(0xea4) // [package:firebase_messaging_platform_interface/src/method_channel/method_channel_messaging.dart] qE::BZf
    //     0xacbec0: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xacbec4: ldr             x0, [x0, #0x1d48]
    //     0xacbec8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xacbecc: cmp             w0, w16
    //     0xacbed0: b.ne            #0xacbee0
    //     0xacbed4: add             x2, PP, #0x15, lsl #12  ; [pp+0x15aa8] Field <qE.BZf>: static late (offset: 0xea4)
    //     0xacbed8: ldr             x2, [x2, #0xaa8]
    //     0xacbedc: bl              #0xb27d24  ; InitLateStaticFieldStub
    // 0xacbee0: mov             x3, x0
    // 0xacbee4: ldur            x0, [fp, #-0x18]
    // 0xacbee8: stur            x3, [fp, #-0x28]
    // 0xacbeec: LoadField: r4 = r0->field_b
    //     0xacbeec: ldur            w4, [x0, #0xb]
    // 0xacbef0: DecompressPointer r4
    //     0xacbef0: add             x4, x4, HEAP, lsl #32
    // 0xacbef4: mov             x0, x4
    // 0xacbef8: stur            x4, [fp, #-0x20]
    // 0xacbefc: r2 = Null
    //     0xacbefc: mov             x2, NULL
    // 0xacbf00: r1 = Null
    //     0xacbf00: mov             x1, NULL
    // 0xacbf04: r4 = 60
    //     0xacbf04: movz            x4, #0x3c
    // 0xacbf08: branchIfSmi(r0, 0xacbf14)
    //     0xacbf08: tbz             w0, #0, #0xacbf14
    // 0xacbf0c: r4 = LoadClassIdInstr(r0)
    //     0xacbf0c: ldur            x4, [x0, #-1]
    //     0xacbf10: ubfx            x4, x4, #0xc, #0x14
    // 0xacbf14: sub             x4, x4, #0x5e
    // 0xacbf18: cmp             x4, #1
    // 0xacbf1c: b.ls            #0xacbf30
    // 0xacbf20: r8 = String
    //     0xacbf20: ldr             x8, [PP, #0xa10]  ; [pp+0xa10] Type: String
    // 0xacbf24: r3 = Null
    //     0xacbf24: add             x3, PP, #0x15, lsl #12  ; [pp+0x15ab0] Null
    //     0xacbf28: ldr             x3, [x3, #0xab0]
    // 0xacbf2c: r0 = String()
    //     0xacbf2c: bl              #0xb2f430  ; IsType_String_Stub
    // 0xacbf30: ldur            x1, [fp, #-0x28]
    // 0xacbf34: ldur            x2, [fp, #-0x20]
    // 0xacbf38: r0 = call 0x96c6a0
    //     0xacbf38: bl              #0x96c6a0
    // 0xacbf3c: b               #0xacc06c
    // 0xacbf40: ldur            x0, [fp, #-0x18]
    // 0xacbf44: r16 = "Messaging#onMessage"
    //     0xacbf44: add             x16, PP, #0x15, lsl #12  ; [pp+0x15ac0] "Messaging#onMessage"
    //     0xacbf48: ldr             x16, [x16, #0xac0]
    // 0xacbf4c: ldur            lr, [fp, #-0x10]
    // 0xacbf50: stp             lr, x16, [SP]
    // 0xacbf54: r0 = call 0x9ff3b8
    //     0xacbf54: bl              #0x9ff3b8
    // 0xacbf58: tbnz            w0, #4, #0xacbfd8
    // 0xacbf5c: ldur            x0, [fp, #-0x18]
    // 0xacbf60: LoadField: r3 = r0->field_b
    //     0xacbf60: ldur            w3, [x0, #0xb]
    // 0xacbf64: DecompressPointer r3
    //     0xacbf64: add             x3, x3, HEAP, lsl #32
    // 0xacbf68: mov             x0, x3
    // 0xacbf6c: stur            x3, [fp, #-0x20]
    // 0xacbf70: r2 = Null
    //     0xacbf70: mov             x2, NULL
    // 0xacbf74: r1 = Null
    //     0xacbf74: mov             x1, NULL
    // 0xacbf78: r8 = Map
    //     0xacbf78: ldr             x8, [PP, #0x2f58]  ; [pp+0x2f58] Type: Map
    // 0xacbf7c: r3 = Null
    //     0xacbf7c: add             x3, PP, #0x15, lsl #12  ; [pp+0x15ac8] Null
    //     0xacbf80: ldr             x3, [x3, #0xac8]
    // 0xacbf84: r0 = Map()
    //     0xacbf84: bl              #0xb30760  ; IsType_Map_Stub
    // 0xacbf88: ldur            x2, [fp, #-0x20]
    // 0xacbf8c: r1 = <String, dynamic>
    //     0xacbf8c: ldr             x1, [PP, #0x25f8]  ; [pp+0x25f8] TypeArguments: <String, dynamic>
    // 0xacbf90: r0 = call 0x327554
    //     0xacbf90: bl              #0x327554
    // 0xacbf94: stur            x0, [fp, #-0x20]
    // 0xacbf98: r0 = InitLateStaticField(0xe84) // [qvk] rE::iZf
    //     0xacbf98: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xacbf9c: ldr             x0, [x0, #0x1d08]
    //     0xacbfa0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xacbfa4: cmp             w0, w16
    //     0xacbfa8: b.ne            #0xacbfb8
    //     0xacbfac: add             x2, PP, #0x15, lsl #12  ; [pp+0x15ad8] Field <rE.iZf>: static late final (offset: 0xe84)
    //     0xacbfb0: ldr             x2, [x2, #0xad8]
    //     0xacbfb4: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xacbfb8: ldur            x2, [fp, #-0x20]
    // 0xacbfbc: r1 = Null
    //     0xacbfbc: mov             x1, NULL
    // 0xacbfc0: stur            x0, [fp, #-0x20]
    // 0xacbfc4: r0 = call 0x7346a4
    //     0xacbfc4: bl              #0x7346a4
    // 0xacbfc8: ldur            x1, [fp, #-0x20]
    // 0xacbfcc: mov             x2, x0
    // 0xacbfd0: r0 = call 0x96c6a0
    //     0xacbfd0: bl              #0x96c6a0
    // 0xacbfd4: b               #0xacc06c
    // 0xacbfd8: ldur            x0, [fp, #-0x18]
    // 0xacbfdc: r16 = "Messaging#onMessageOpenedApp"
    //     0xacbfdc: add             x16, PP, #0x15, lsl #12  ; [pp+0x15ae0] "Messaging#onMessageOpenedApp"
    //     0xacbfe0: ldr             x16, [x16, #0xae0]
    // 0xacbfe4: ldur            lr, [fp, #-0x10]
    // 0xacbfe8: stp             lr, x16, [SP]
    // 0xacbfec: r0 = call 0x9ff3b8
    //     0xacbfec: bl              #0x9ff3b8
    // 0xacbff0: tbnz            w0, #4, #0xacc074
    // 0xacbff4: ldur            x0, [fp, #-0x18]
    // 0xacbff8: LoadField: r3 = r0->field_b
    //     0xacbff8: ldur            w3, [x0, #0xb]
    // 0xacbffc: DecompressPointer r3
    //     0xacbffc: add             x3, x3, HEAP, lsl #32
    // 0xacc000: mov             x0, x3
    // 0xacc004: stur            x3, [fp, #-0x20]
    // 0xacc008: r2 = Null
    //     0xacc008: mov             x2, NULL
    // 0xacc00c: r1 = Null
    //     0xacc00c: mov             x1, NULL
    // 0xacc010: r8 = Map
    //     0xacc010: ldr             x8, [PP, #0x2f58]  ; [pp+0x2f58] Type: Map
    // 0xacc014: r3 = Null
    //     0xacc014: add             x3, PP, #0x15, lsl #12  ; [pp+0x15ae8] Null
    //     0xacc018: ldr             x3, [x3, #0xae8]
    // 0xacc01c: r0 = Map()
    //     0xacc01c: bl              #0xb30760  ; IsType_Map_Stub
    // 0xacc020: ldur            x2, [fp, #-0x20]
    // 0xacc024: r1 = <String, dynamic>
    //     0xacc024: ldr             x1, [PP, #0x25f8]  ; [pp+0x25f8] TypeArguments: <String, dynamic>
    // 0xacc028: r0 = call 0x327554
    //     0xacc028: bl              #0x327554
    // 0xacc02c: stur            x0, [fp, #-0x20]
    // 0xacc030: r0 = InitLateStaticField(0xe88) // [qvk] rE::kZf
    //     0xacc030: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xacc034: ldr             x0, [x0, #0x1d10]
    //     0xacc038: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xacc03c: cmp             w0, w16
    //     0xacc040: b.ne            #0xacc050
    //     0xacc044: add             x2, PP, #0x15, lsl #12  ; [pp+0x15af8] Field <rE.kZf>: static late final (offset: 0xe88)
    //     0xacc048: ldr             x2, [x2, #0xaf8]
    //     0xacc04c: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xacc050: ldur            x2, [fp, #-0x20]
    // 0xacc054: r1 = Null
    //     0xacc054: mov             x1, NULL
    // 0xacc058: stur            x0, [fp, #-0x20]
    // 0xacc05c: r0 = call 0x7346a4
    //     0xacc05c: bl              #0x7346a4
    // 0xacc060: ldur            x1, [fp, #-0x20]
    // 0xacc064: mov             x2, x0
    // 0xacc068: r0 = call 0x96c6a0
    //     0xacc068: bl              #0x96c6a0
    // 0xacc06c: r0 = Null
    //     0xacc06c: mov             x0, NULL
    // 0xacc070: r0 = ReturnAsyncNotFuture()
    //     0xacc070: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xacc074: ldur            x0, [fp, #-0x18]
    // 0xacc078: r16 = "Messaging#onBackgroundMessage"
    //     0xacc078: add             x16, PP, #0x15, lsl #12  ; [pp+0x15b00] "Messaging#onBackgroundMessage"
    //     0xacc07c: ldr             x16, [x16, #0xb00]
    // 0xacc080: ldur            lr, [fp, #-0x10]
    // 0xacc084: stp             lr, x16, [SP]
    // 0xacc088: r0 = call 0x9ff3b8
    //     0xacc088: bl              #0x9ff3b8
    // 0xacc08c: tbnz            w0, #4, #0xacc0d0
    // 0xacc090: ldur            x0, [fp, #-0x18]
    // 0xacc094: LoadField: r3 = r0->field_b
    //     0xacc094: ldur            w3, [x0, #0xb]
    // 0xacc098: DecompressPointer r3
    //     0xacc098: add             x3, x3, HEAP, lsl #32
    // 0xacc09c: mov             x0, x3
    // 0xacc0a0: stur            x3, [fp, #-0x20]
    // 0xacc0a4: r2 = Null
    //     0xacc0a4: mov             x2, NULL
    // 0xacc0a8: r1 = Null
    //     0xacc0a8: mov             x1, NULL
    // 0xacc0ac: r8 = Map
    //     0xacc0ac: ldr             x8, [PP, #0x2f58]  ; [pp+0x2f58] Type: Map
    // 0xacc0b0: r3 = Null
    //     0xacc0b0: add             x3, PP, #0x15, lsl #12  ; [pp+0x15b08] Null
    //     0xacc0b4: ldr             x3, [x3, #0xb08]
    // 0xacc0b8: r0 = Map()
    //     0xacc0b8: bl              #0xb30760  ; IsType_Map_Stub
    // 0xacc0bc: ldur            x2, [fp, #-0x20]
    // 0xacc0c0: r1 = <String, dynamic>
    //     0xacc0c0: ldr             x1, [PP, #0x25f8]  ; [pp+0x25f8] TypeArguments: <String, dynamic>
    // 0xacc0c4: r0 = call 0x327554
    //     0xacc0c4: bl              #0x327554
    // 0xacc0c8: r0 = Null
    //     0xacc0c8: mov             x0, NULL
    // 0xacc0cc: r0 = ReturnAsyncNotFuture()
    //     0xacc0cc: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xacc0d0: ldur            x0, [fp, #-0x10]
    // 0xacc0d4: r1 = Null
    //     0xacc0d4: mov             x1, NULL
    // 0xacc0d8: r2 = 4
    //     0xacc0d8: movz            x2, #0x4
    // 0xacc0dc: r0 = AllocateArray()
    //     0xacc0dc: bl              #0xb29b38  ; AllocateArrayStub
    // 0xacc0e0: mov             x1, x0
    // 0xacc0e4: ldur            x0, [fp, #-0x10]
    // 0xacc0e8: StoreField: r1->field_f = r0
    //     0xacc0e8: stur            w0, [x1, #0xf]
    // 0xacc0ec: r16 = " has not been implemented"
    //     0xacc0ec: add             x16, PP, #8, lsl #12  ; [pp+0x8710] " has not been implemented"
    //     0xacc0f0: ldr             x16, [x16, #0x710]
    // 0xacc0f4: StoreField: r1->field_13 = r16
    //     0xacc0f4: stur            w16, [x1, #0x13]
    // 0xacc0f8: str             x1, [SP]
    // 0xacc0fc: r0 = _interpolate()
    //     0xacc0fc: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xacc100: stur            x0, [fp, #-0x10]
    // 0xacc104: r0 = pa()
    //     0xacc104: bl              #0xa6c1c8  ; AllocatepaStub -> pa (size=0x10)
    // 0xacc108: mov             x1, x0
    // 0xacc10c: ldur            x0, [fp, #-0x10]
    // 0xacc110: StoreField: r1->field_b = r0
    //     0xacc110: stur            w0, [x1, #0xb]
    // 0xacc114: mov             x0, x1
    // 0xacc118: r0 = Throw()
    //     0xacc118: bl              #0xb27dfc  ; ThrowStub
    // 0xacc11c: brk             #0
    // 0xacc120: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xacc120: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xacc124: b               #0xacbe90
  }
}
