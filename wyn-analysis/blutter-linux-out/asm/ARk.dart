// lib: , url: ARk

// class id: 1050226, size: 0x8
class :: {

  [closure] static Future<int> <anonymous closure>(dynamic, Edb?) async {
    // ** addr: 0xae4ce0, size: 0x10c
    // 0xae4ce0: EnterFrame
    //     0xae4ce0: stp             fp, lr, [SP, #-0x10]!
    //     0xae4ce4: mov             fp, SP
    // 0xae4ce8: AllocStack(0x40)
    //     0xae4ce8: sub             SP, SP, #0x40
    // 0xae4cec: SetupParameters(dynamic _ /* r1 */)
    //     0xae4cec: stur            NULL, [fp, #-8]
    //     0xae4cf0: movz            x0, #0
    //     0xae4cf4: add             x1, fp, w0, sxtw #2
    //     0xae4cf8: ldr             x1, [x1, #0x18]
    //     0xae4cfc: ldur            w2, [x1, #0x17]
    //     0xae4d00: add             x2, x2, HEAP, lsl #32
    //     0xae4d04: stur            x2, [fp, #-0x10]
    // 0xae4d08: CheckStackOverflow
    //     0xae4d08: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae4d0c: cmp             SP, x16
    //     0xae4d10: b.ls            #0xae4de4
    // 0xae4d14: InitAsync() -> Future<int>
    //     0xae4d14: ldr             x0, [PP, #0x1a08]  ; [pp+0x1a08] TypeArguments: <int>
    //     0xae4d18: bl              #0xa75e10  ; InitAsyncStub
    // 0xae4d1c: ldur            x0, [fp, #-0x10]
    // 0xae4d20: LoadField: r3 = r0->field_f
    //     0xae4d20: ldur            w3, [x0, #0xf]
    // 0xae4d24: DecompressPointer r3
    //     0xae4d24: add             x3, x3, HEAP, lsl #32
    // 0xae4d28: stur            x3, [fp, #-0x18]
    // 0xae4d2c: r1 = Null
    //     0xae4d2c: mov             x1, NULL
    // 0xae4d30: r2 = 8
    //     0xae4d30: movz            x2, #0x8
    // 0xae4d34: r0 = AllocateArray()
    //     0xae4d34: bl              #0xb29b38  ; AllocateArrayStub
    // 0xae4d38: r16 = "sql"
    //     0xae4d38: add             x16, PP, #0x12, lsl #12  ; [pp+0x12230] "sql"
    //     0xae4d3c: ldr             x16, [x16, #0x230]
    // 0xae4d40: StoreField: r0->field_f = r16
    //     0xae4d40: stur            w16, [x0, #0xf]
    // 0xae4d44: ldur            x1, [fp, #-0x10]
    // 0xae4d48: ArrayLoad: r2 = r1[0]  ; List_4
    //     0xae4d48: ldur            w2, [x1, #0x17]
    // 0xae4d4c: DecompressPointer r2
    //     0xae4d4c: add             x2, x2, HEAP, lsl #32
    // 0xae4d50: StoreField: r0->field_13 = r2
    //     0xae4d50: stur            w2, [x0, #0x13]
    // 0xae4d54: r16 = "arguments"
    //     0xae4d54: add             x16, PP, #0x12, lsl #12  ; [pp+0x12238] "arguments"
    //     0xae4d58: ldr             x16, [x16, #0x238]
    // 0xae4d5c: ArrayStore: r0[0] = r16  ; List_4
    //     0xae4d5c: stur            w16, [x0, #0x17]
    // 0xae4d60: LoadField: r2 = r1->field_1b
    //     0xae4d60: ldur            w2, [x1, #0x1b]
    // 0xae4d64: DecompressPointer r2
    //     0xae4d64: add             x2, x2, HEAP, lsl #32
    // 0xae4d68: StoreField: r0->field_1b = r2
    //     0xae4d68: stur            w2, [x0, #0x1b]
    // 0xae4d6c: r16 = <String, Object?>
    //     0xae4d6c: add             x16, PP, #8, lsl #12  ; [pp+0x8d50] TypeArguments: <String, Object?>
    //     0xae4d70: ldr             x16, [x16, #0xd50]
    // 0xae4d74: stp             x0, x16, [SP]
    // 0xae4d78: r0 = Map._fromLiteral()
    //     0xae4d78: bl              #0x2fd170  ; [dart:core] Map::Map._fromLiteral
    // 0xae4d7c: mov             x3, x0
    // 0xae4d80: ldur            x0, [fp, #-0x10]
    // 0xae4d84: stur            x3, [fp, #-0x20]
    // 0xae4d88: LoadField: r2 = r0->field_13
    //     0xae4d88: ldur            w2, [x0, #0x13]
    // 0xae4d8c: DecompressPointer r2
    //     0xae4d8c: add             x2, x2, HEAP, lsl #32
    // 0xae4d90: ldur            x1, [fp, #-0x18]
    // 0xae4d94: r0 = call 0x5f55d0
    //     0xae4d94: bl              #0x5f55d0
    // 0xae4d98: ldur            x1, [fp, #-0x20]
    // 0xae4d9c: mov             x2, x0
    // 0xae4da0: r0 = call 0x3cb9f0
    //     0xae4da0: bl              #0x3cb9f0
    // 0xae4da4: r16 = <int?>
    //     0xae4da4: ldr             x16, [PP, #0x2dc8]  ; [pp+0x2dc8] TypeArguments: <int?>
    // 0xae4da8: ldur            lr, [fp, #-0x18]
    // 0xae4dac: stp             lr, x16, [SP, #0x10]
    // 0xae4db0: r16 = "update"
    //     0xae4db0: add             x16, PP, #0x12, lsl #12  ; [pp+0x12240] "update"
    //     0xae4db4: ldr             x16, [x16, #0x240]
    // 0xae4db8: ldur            lr, [fp, #-0x20]
    // 0xae4dbc: stp             lr, x16, [SP]
    // 0xae4dc0: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0xae4dc0: ldr             x4, [PP, #0x2610]  ; [pp+0x2610] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0xae4dc4: r0 = call 0x5f51bc
    //     0xae4dc4: bl              #0x5f51bc
    // 0xae4dc8: mov             x1, x0
    // 0xae4dcc: stur            x1, [fp, #-0x18]
    // 0xae4dd0: r0 = Await()
    //     0xae4dd0: bl              #0xa75a20  ; AwaitStub
    // 0xae4dd4: cmp             w0, NULL
    // 0xae4dd8: b.ne            #0xae4de0
    // 0xae4ddc: r0 = 0
    //     0xae4ddc: movz            x0, #0
    // 0xae4de0: r0 = ReturnAsync()
    //     0xae4de0: b               #0xa6b994  ; ReturnAsyncStub
    // 0xae4de4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae4de4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae4de8: b               #0xae4d14
  }
}

// class id: 500, size: 0x28, field offset: 0x8
//   transformed mixin,
abstract class _Tdb extends Object
     with Sdb {

  late String Gtb; // offset: 0xc

  [closure] Future<int> <anonymous closure>(dynamic, Edb?) async {
    // ** addr: 0xa9552c, size: 0xb0
    // 0xa9552c: EnterFrame
    //     0xa9552c: stp             fp, lr, [SP, #-0x10]!
    //     0xa95530: mov             fp, SP
    // 0xa95534: AllocStack(0x38)
    //     0xa95534: sub             SP, SP, #0x38
    // 0xa95538: SetupParameters(_Tdb this /* r1 */)
    //     0xa95538: stur            NULL, [fp, #-8]
    //     0xa9553c: movz            x0, #0
    //     0xa95540: add             x1, fp, w0, sxtw #2
    //     0xa95544: ldr             x1, [x1, #0x18]
    //     0xa95548: ldur            w2, [x1, #0x17]
    //     0xa9554c: add             x2, x2, HEAP, lsl #32
    //     0xa95550: stur            x2, [fp, #-0x10]
    // 0xa95554: CheckStackOverflow
    //     0xa95554: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa95558: cmp             SP, x16
    //     0xa9555c: b.ls            #0xa955d4
    // 0xa95560: InitAsync() -> Future<int>
    //     0xa95560: ldr             x0, [PP, #0x1a08]  ; [pp+0x1a08] TypeArguments: <int>
    //     0xa95564: bl              #0xa75e10  ; InitAsyncStub
    // 0xa95568: ldur            x0, [fp, #-0x10]
    // 0xa9556c: LoadField: r4 = r0->field_f
    //     0xa9556c: ldur            w4, [x0, #0xf]
    // 0xa95570: DecompressPointer r4
    //     0xa95570: add             x4, x4, HEAP, lsl #32
    // 0xa95574: stur            x4, [fp, #-0x18]
    // 0xa95578: LoadField: r2 = r0->field_13
    //     0xa95578: ldur            w2, [x0, #0x13]
    // 0xa9557c: DecompressPointer r2
    //     0xa9557c: add             x2, x2, HEAP, lsl #32
    // 0xa95580: ArrayLoad: r3 = r0[0]  ; List_4
    //     0xa95580: ldur            w3, [x0, #0x17]
    // 0xa95584: DecompressPointer r3
    //     0xa95584: add             x3, x3, HEAP, lsl #32
    // 0xa95588: LoadField: r5 = r0->field_1b
    //     0xa95588: ldur            w5, [x0, #0x1b]
    // 0xa9558c: DecompressPointer r5
    //     0xa9558c: add             x5, x5, HEAP, lsl #32
    // 0xa95590: mov             x1, x4
    // 0xa95594: r0 = call 0x5f5528
    //     0xa95594: bl              #0x5f5528
    // 0xa95598: r16 = <int?>
    //     0xa95598: ldr             x16, [PP, #0x2dc8]  ; [pp+0x2dc8] TypeArguments: <int?>
    // 0xa9559c: ldur            lr, [fp, #-0x18]
    // 0xa955a0: stp             lr, x16, [SP, #0x10]
    // 0xa955a4: r16 = "insert"
    //     0xa955a4: add             x16, PP, #0x12, lsl #12  ; [pp+0x12530] "insert"
    //     0xa955a8: ldr             x16, [x16, #0x530]
    // 0xa955ac: stp             x0, x16, [SP]
    // 0xa955b0: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0xa955b0: ldr             x4, [PP, #0x2610]  ; [pp+0x2610] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0xa955b4: r0 = call 0x5f51bc
    //     0xa955b4: bl              #0x5f51bc
    // 0xa955b8: mov             x1, x0
    // 0xa955bc: stur            x1, [fp, #-0x18]
    // 0xa955c0: r0 = Await()
    //     0xa955c0: bl              #0xa75a20  ; AwaitStub
    // 0xa955c4: cmp             w0, NULL
    // 0xa955c8: b.ne            #0xa955d0
    // 0xa955cc: r0 = 0
    //     0xa955cc: movz            x0, #0
    // 0xa955d0: r0 = ReturnAsync()
    //     0xa955d0: b               #0xa6b994  ; ReturnAsyncStub
    // 0xa955d4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa955d4: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa955d8: b               #0xa95560
  }
  [closure] Future<List<Map<String, Object?>>> <anonymous closure>(dynamic, Edb?) async {
    // ** addr: 0xad3e34, size: 0xac
    // 0xad3e34: EnterFrame
    //     0xad3e34: stp             fp, lr, [SP, #-0x10]!
    //     0xad3e38: mov             fp, SP
    // 0xad3e3c: AllocStack(0x38)
    //     0xad3e3c: sub             SP, SP, #0x38
    // 0xad3e40: SetupParameters(_Tdb this /* r1 */)
    //     0xad3e40: stur            NULL, [fp, #-8]
    //     0xad3e44: movz            x0, #0
    //     0xad3e48: add             x1, fp, w0, sxtw #2
    //     0xad3e4c: ldr             x1, [x1, #0x18]
    //     0xad3e50: ldur            w2, [x1, #0x17]
    //     0xad3e54: add             x2, x2, HEAP, lsl #32
    //     0xad3e58: stur            x2, [fp, #-0x10]
    // 0xad3e5c: CheckStackOverflow
    //     0xad3e5c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xad3e60: cmp             SP, x16
    //     0xad3e64: b.ls            #0xad3ed8
    // 0xad3e68: InitAsync() -> Future<List<Map<String, Object?>>>
    //     0xad3e68: add             x0, PP, #0x14, lsl #12  ; [pp+0x14990] TypeArguments: <List<Map<String, Object?>>>
    //     0xad3e6c: ldr             x0, [x0, #0x990]
    //     0xad3e70: bl              #0xa75e10  ; InitAsyncStub
    // 0xad3e74: ldur            x0, [fp, #-0x10]
    // 0xad3e78: LoadField: r4 = r0->field_f
    //     0xad3e78: ldur            w4, [x0, #0xf]
    // 0xad3e7c: DecompressPointer r4
    //     0xad3e7c: add             x4, x4, HEAP, lsl #32
    // 0xad3e80: stur            x4, [fp, #-0x18]
    // 0xad3e84: LoadField: r2 = r0->field_13
    //     0xad3e84: ldur            w2, [x0, #0x13]
    // 0xad3e88: DecompressPointer r2
    //     0xad3e88: add             x2, x2, HEAP, lsl #32
    // 0xad3e8c: ArrayLoad: r3 = r0[0]  ; List_4
    //     0xad3e8c: ldur            w3, [x0, #0x17]
    // 0xad3e90: DecompressPointer r3
    //     0xad3e90: add             x3, x3, HEAP, lsl #32
    // 0xad3e94: LoadField: r5 = r0->field_1b
    //     0xad3e94: ldur            w5, [x0, #0x1b]
    // 0xad3e98: DecompressPointer r5
    //     0xad3e98: add             x5, x5, HEAP, lsl #32
    // 0xad3e9c: mov             x1, x4
    // 0xad3ea0: r0 = call 0x5f5528
    //     0xad3ea0: bl              #0x5f5528
    // 0xad3ea4: ldur            x16, [fp, #-0x18]
    // 0xad3ea8: stp             x16, NULL, [SP, #0x10]
    // 0xad3eac: r16 = "query"
    //     0xad3eac: add             x16, PP, #0x12, lsl #12  ; [pp+0x12620] "query"
    //     0xad3eb0: ldr             x16, [x16, #0x620]
    // 0xad3eb4: stp             x0, x16, [SP]
    // 0xad3eb8: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0xad3eb8: ldr             x4, [PP, #0x2610]  ; [pp+0x2610] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0xad3ebc: r0 = call 0x5f51bc
    //     0xad3ebc: bl              #0x5f51bc
    // 0xad3ec0: mov             x1, x0
    // 0xad3ec4: stur            x1, [fp, #-0x18]
    // 0xad3ec8: r0 = Await()
    //     0xad3ec8: bl              #0xa75a20  ; AwaitStub
    // 0xad3ecc: mov             x1, x0
    // 0xad3ed0: r0 = call 0x745bd0
    //     0xad3ed0: bl              #0x745bd0
    // 0xad3ed4: r0 = ReturnAsyncNotFuture()
    //     0xad3ed4: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xad3ed8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xad3ed8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xad3edc: b               #0xad3e68
  }
  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xae81fc, size: 0x1c8
    // 0xae81fc: EnterFrame
    //     0xae81fc: stp             fp, lr, [SP, #-0x10]!
    //     0xae8200: mov             fp, SP
    // 0xae8204: AllocStack(0x90)
    //     0xae8204: sub             SP, SP, #0x90
    // 0xae8208: SetupParameters(_Tdb this /* r1 */)
    //     0xae8208: stur            NULL, [fp, #-8]
    //     0xae820c: movz            x0, #0
    //     0xae8210: add             x1, fp, w0, sxtw #2
    //     0xae8214: ldr             x1, [x1, #0x10]
    //     0xae8218: ldur            w2, [x1, #0x17]
    //     0xae821c: add             x2, x2, HEAP, lsl #32
    //     0xae8220: stur            x2, [fp, #-0x60]
    // 0xae8224: CheckStackOverflow
    //     0xae8224: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae8228: cmp             SP, x16
    //     0xae822c: b.ls            #0xae83bc
    // 0xae8230: InitAsync() -> Future<Null?>
    //     0xae8230: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xae8234: bl              #0xa75e10  ; InitAsyncStub
    // 0xae8238: ldur            x2, [fp, #-0x60]
    // 0xae823c: LoadField: r1 = r2->field_f
    //     0xae823c: ldur            w1, [x2, #0xf]
    // 0xae8240: DecompressPointer r1
    //     0xae8240: add             x1, x1, HEAP, lsl #32
    // 0xae8244: LoadField: r0 = r1->field_7
    //     0xae8244: ldur            w0, [x1, #7]
    // 0xae8248: DecompressPointer r0
    //     0xae8248: add             x0, x0, HEAP, lsl #32
    // 0xae824c: tbz             w0, #4, #0xae83b4
    // 0xae8250: r0 = true
    //     0xae8250: add             x0, NULL, #0x20  ; true
    // 0xae8254: StoreField: r1->field_7 = r0
    //     0xae8254: stur            w0, [x1, #7]
    // 0xae8258: r0 = call 0x7def38
    //     0xae8258: bl              #0x7def38
    // 0xae825c: ldur            x0, [fp, #-0x60]
    // 0xae8260: LoadField: r3 = r0->field_f
    //     0xae8260: ldur            w3, [x0, #0xf]
    // 0xae8264: DecompressPointer r3
    //     0xae8264: add             x3, x3, HEAP, lsl #32
    // 0xae8268: stur            x3, [fp, #-0x70]
    // 0xae826c: LoadField: r1 = r3->field_1b
    //     0xae826c: ldur            w1, [x3, #0x1b]
    // 0xae8270: DecompressPointer r1
    //     0xae8270: add             x1, x1, HEAP, lsl #32
    // 0xae8274: tbnz            w1, #4, #0xae8310
    // 0xae8278: LoadField: r4 = r3->field_f
    //     0xae8278: ldur            w4, [x3, #0xf]
    // 0xae827c: DecompressPointer r4
    //     0xae827c: add             x4, x4, HEAP, lsl #32
    // 0xae8280: mov             x2, x0
    // 0xae8284: stur            x4, [fp, #-0x68]
    // 0xae8288: r1 = Function '<anonymous closure>':.
    //     0xae8288: add             x1, PP, #0x14, lsl #12  ; [pp+0x14bc8] AnonymousClosure: (0xae8470), in [ARk] _Tdb::<anonymous closure> (0xae81fc)
    //     0xae828c: ldr             x1, [x1, #0xbc8]
    // 0xae8290: r0 = AllocateClosure()
    //     0xae8290: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xae8294: r16 = <Null?>
    //     0xae8294: ldr             x16, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    // 0xae8298: ldur            lr, [fp, #-0x70]
    // 0xae829c: stp             lr, x16, [SP, #0x10]
    // 0xae82a0: ldur            x16, [fp, #-0x68]
    // 0xae82a4: stp             x0, x16, [SP]
    // 0xae82a8: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0xae82a8: ldr             x4, [PP, #0x2610]  ; [pp+0x2610] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0xae82ac: r0 = __unknown_function__()
    //     0xae82ac: bl              #0xa94e6c  ; [] ::__unknown_function__
    // 0xae82b0: mov             x1, x0
    // 0xae82b4: stur            x1, [fp, #-0x68]
    // 0xae82b8: r0 = Await()
    //     0xae82b8: bl              #0xa75a20  ; AwaitStub
    // 0xae82bc: r0 = Null
    //     0xae82bc: mov             x0, NULL
    // 0xae82c0: b               #0xae8314
    // 0xae82c4: sub             SP, fp, #0x90
    // 0xae82c8: stur            x0, [fp, #-0x68]
    // 0xae82cc: r1 = Null
    //     0xae82cc: mov             x1, NULL
    // 0xae82d0: r2 = 6
    //     0xae82d0: movz            x2, #0x6
    // 0xae82d4: r0 = AllocateArray()
    //     0xae82d4: bl              #0xb29b38  ; AllocateArrayStub
    // 0xae82d8: r16 = "Error "
    //     0xae82d8: add             x16, PP, #0x14, lsl #12  ; [pp+0x14bd0] "Error "
    //     0xae82dc: ldr             x16, [x16, #0xbd0]
    // 0xae82e0: StoreField: r0->field_f = r16
    //     0xae82e0: stur            w16, [x0, #0xf]
    // 0xae82e4: ldur            x1, [fp, #-0x68]
    // 0xae82e8: StoreField: r0->field_13 = r1
    //     0xae82e8: stur            w1, [x0, #0x13]
    // 0xae82ec: r16 = " before rollback"
    //     0xae82ec: add             x16, PP, #0x14, lsl #12  ; [pp+0x14bd8] " before rollback"
    //     0xae82f0: ldr             x16, [x16, #0xbd8]
    // 0xae82f4: ArrayStore: r0[0] = r16  ; List_4
    //     0xae82f4: stur            w16, [x0, #0x17]
    // 0xae82f8: str             x0, [SP]
    // 0xae82fc: r0 = _interpolate()
    //     0xae82fc: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xae8300: mov             x1, x0
    // 0xae8304: r0 = call 0x33fce0
    //     0xae8304: bl              #0x33fce0
    // 0xae8308: ldur            x0, [fp, #-0x68]
    // 0xae830c: b               #0xae8314
    // 0xae8310: r0 = Null
    //     0xae8310: mov             x0, NULL
    // 0xae8314: stur            x0, [fp, #-0x70]
    // 0xae8318: ldur            x3, [fp, #-0x60]
    // 0xae831c: LoadField: r4 = r3->field_f
    //     0xae831c: ldur            w4, [x3, #0xf]
    // 0xae8320: DecompressPointer r4
    //     0xae8320: add             x4, x4, HEAP, lsl #32
    // 0xae8324: mov             x2, x3
    // 0xae8328: stur            x4, [fp, #-0x68]
    // 0xae832c: r1 = Function '<anonymous closure>':.
    //     0xae832c: add             x1, PP, #0x14, lsl #12  ; [pp+0x14be0] AnonymousClosure: (0x7defb0), in [ARk] _Tdb::<anonymous closure> (0xae81fc)
    //     0xae8330: ldr             x1, [x1, #0xbe0]
    // 0xae8334: r0 = AllocateClosure()
    //     0xae8334: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xae8338: ldur            x16, [fp, #-0x68]
    // 0xae833c: stp             x16, NULL, [SP, #8]
    // 0xae8340: str             x0, [SP]
    // 0xae8344: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0xae8344: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0xae8348: r0 = call 0x5f526c
    //     0xae8348: bl              #0x5f526c
    // 0xae834c: mov             x1, x0
    // 0xae8350: stur            x1, [fp, #-0x68]
    // 0xae8354: r0 = Await()
    //     0xae8354: bl              #0xa75a20  ; AwaitStub
    // 0xae8358: b               #0xae83b4
    // 0xae835c: sub             SP, fp, #0x90
    // 0xae8360: ldur            x3, [fp, #-0x60]
    // 0xae8364: stur            x0, [fp, #-0x68]
    // 0xae8368: r1 = Null
    //     0xae8368: mov             x1, NULL
    // 0xae836c: r2 = 8
    //     0xae836c: movz            x2, #0x8
    // 0xae8370: r0 = AllocateArray()
    //     0xae8370: bl              #0xb29b38  ; AllocateArrayStub
    // 0xae8374: r16 = "error "
    //     0xae8374: add             x16, PP, #0x14, lsl #12  ; [pp+0x14b00] "error "
    //     0xae8378: ldr             x16, [x16, #0xb00]
    // 0xae837c: StoreField: r0->field_f = r16
    //     0xae837c: stur            w16, [x0, #0xf]
    // 0xae8380: ldur            x1, [fp, #-0x68]
    // 0xae8384: StoreField: r0->field_13 = r1
    //     0xae8384: stur            w1, [x0, #0x13]
    // 0xae8388: r16 = " closing database "
    //     0xae8388: add             x16, PP, #0x14, lsl #12  ; [pp+0x14be8] " closing database "
    //     0xae838c: ldr             x16, [x16, #0xbe8]
    // 0xae8390: ArrayStore: r0[0] = r16  ; List_4
    //     0xae8390: stur            w16, [x0, #0x17]
    // 0xae8394: ldur            x1, [fp, #-0x60]
    // 0xae8398: LoadField: r2 = r1->field_13
    //     0xae8398: ldur            w2, [x1, #0x13]
    // 0xae839c: DecompressPointer r2
    //     0xae839c: add             x2, x2, HEAP, lsl #32
    // 0xae83a0: StoreField: r0->field_1b = r2
    //     0xae83a0: stur            w2, [x0, #0x1b]
    // 0xae83a4: str             x0, [SP]
    // 0xae83a8: r0 = _interpolate()
    //     0xae83a8: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xae83ac: mov             x1, x0
    // 0xae83b0: r0 = call 0x33fce0
    //     0xae83b0: bl              #0x33fce0
    // 0xae83b4: r0 = Null
    //     0xae83b4: mov             x0, NULL
    // 0xae83b8: r0 = ReturnAsyncNotFuture()
    //     0xae83b8: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae83bc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae83bc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae83c0: b               #0xae8230
  }
  [closure] Future<Null> <anonymous closure>(dynamic, Edb?) async {
    // ** addr: 0xae8470, size: 0xe8
    // 0xae8470: EnterFrame
    //     0xae8470: stp             fp, lr, [SP, #-0x10]!
    //     0xae8474: mov             fp, SP
    // 0xae8478: AllocStack(0xa8)
    //     0xae8478: sub             SP, SP, #0xa8
    // 0xae847c: SetupParameters(_Tdb this /* r1 */, dynamic _ /* r2, fp-0x70 */)
    //     0xae847c: stur            NULL, [fp, #-8]
    //     0xae8480: movz            x0, #0
    //     0xae8484: add             x1, fp, w0, sxtw #2
    //     0xae8488: ldr             x1, [x1, #0x18]
    //     0xae848c: add             x2, fp, w0, sxtw #2
    //     0xae8490: ldr             x2, [x2, #0x10]
    //     0xae8494: stur            x2, [fp, #-0x70]
    //     0xae8498: ldur            w3, [x1, #0x17]
    //     0xae849c: add             x3, x3, HEAP, lsl #32
    //     0xae84a0: stur            x3, [fp, #-0x68]
    // 0xae84a4: CheckStackOverflow
    //     0xae84a4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae84a8: cmp             SP, x16
    //     0xae84ac: b.ls            #0xae8550
    // 0xae84b0: InitAsync() -> Future<Null?>
    //     0xae84b0: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xae84b4: bl              #0xa75e10  ; InitAsyncStub
    // 0xae84b8: ldur            x3, [fp, #-0x70]
    // 0xae84bc: ldur            x4, [fp, #-0x68]
    // 0xae84c0: LoadField: r5 = r4->field_f
    //     0xae84c0: ldur            w5, [x4, #0xf]
    // 0xae84c4: DecompressPointer r5
    //     0xae84c4: add             x5, x5, HEAP, lsl #32
    // 0xae84c8: mov             x0, x3
    // 0xae84cc: stur            x5, [fp, #-0x78]
    // 0xae84d0: r2 = Null
    //     0xae84d0: mov             x2, NULL
    // 0xae84d4: r1 = Null
    //     0xae84d4: mov             x1, NULL
    // 0xae84d8: r4 = LoadClassIdInstr(r0)
    //     0xae84d8: ldur            x4, [x0, #-1]
    //     0xae84dc: ubfx            x4, x4, #0xc, #0x14
    // 0xae84e0: cmp             x4, #0x1e9
    // 0xae84e4: b.eq            #0xae84fc
    // 0xae84e8: r8 = feb?
    //     0xae84e8: add             x8, PP, #0x14, lsl #12  ; [pp+0x14bf8] Type: feb?
    //     0xae84ec: ldr             x8, [x8, #0xbf8]
    // 0xae84f0: r3 = Null
    //     0xae84f0: add             x3, PP, #0x14, lsl #12  ; [pp+0x14c00] Null
    //     0xae84f4: ldr             x3, [x3, #0xc00]
    // 0xae84f8: r0 = DefaultNullableTypeTest()
    //     0xae84f8: bl              #0xb279ec  ; DefaultNullableTypeTestStub
    // 0xae84fc: ldur            x0, [fp, #-0x70]
    // 0xae8500: cmp             w0, NULL
    // 0xae8504: b.ne            #0xae850c
    // 0xae8508: r0 = call 0x7df16c
    //     0xae8508: bl              #0x7df16c
    // 0xae850c: stur            x0, [fp, #-0x70]
    // 0xae8510: ldur            x16, [fp, #-0x78]
    // 0xae8514: stp             x16, NULL, [SP, #0x20]
    // 0xae8518: r16 = "ROLLBACK"
    //     0xae8518: add             x16, PP, #0x14, lsl #12  ; [pp+0x14c10] "ROLLBACK"
    //     0xae851c: ldr             x16, [x16, #0xc10]
    // 0xae8520: stp             x16, x0, [SP, #0x10]
    // 0xae8524: r16 = false
    //     0xae8524: add             x16, NULL, #0x30  ; false
    // 0xae8528: stp             x16, NULL, [SP]
    // 0xae852c: r4 = const [0x1, 0x5, 0x5, 0x5, null]
    //     0xae852c: ldr             x4, [PP, #0x1398]  ; [pp+0x1398] List(5) [0x1, 0x5, 0x5, 0x5, Null]
    // 0xae8530: r0 = call 0x7df00c
    //     0xae8530: bl              #0x7df00c
    // 0xae8534: mov             x1, x0
    // 0xae8538: stur            x1, [fp, #-0x78]
    // 0xae853c: r0 = Await()
    //     0xae853c: bl              #0xa75a20  ; AwaitStub
    // 0xae8540: b               #0xae8548
    // 0xae8544: sub             SP, fp, #0xa8
    // 0xae8548: r0 = Null
    //     0xae8548: mov             x0, NULL
    // 0xae854c: r0 = ReturnAsyncNotFuture()
    //     0xae854c: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae8550: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae8550: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae8554: b               #0xae84b0
  }
  [closure] Future<Y0> <anonymous closure>(dynamic, Edb?) async {
    // ** addr: 0xae8564, size: 0x8c
    // 0xae8564: EnterFrame
    //     0xae8564: stp             fp, lr, [SP, #-0x10]!
    //     0xae8568: mov             fp, SP
    // 0xae856c: AllocStack(0x40)
    //     0xae856c: sub             SP, SP, #0x40
    // 0xae8570: SetupParameters(_Tdb this /* r1 */, dynamic _ /* r2, fp-0x20 */)
    //     0xae8570: stur            NULL, [fp, #-8]
    //     0xae8574: movz            x0, #0
    //     0xae8578: add             x1, fp, w0, sxtw #2
    //     0xae857c: ldr             x1, [x1, #0x18]
    //     0xae8580: add             x2, fp, w0, sxtw #2
    //     0xae8584: ldr             x2, [x2, #0x10]
    //     0xae8588: stur            x2, [fp, #-0x20]
    //     0xae858c: ldur            w3, [x1, #0x17]
    //     0xae8590: add             x3, x3, HEAP, lsl #32
    //     0xae8594: stur            x3, [fp, #-0x18]
    // 0xae8598: CheckStackOverflow
    //     0xae8598: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae859c: cmp             SP, x16
    //     0xae85a0: b.ls            #0xae85e8
    // 0xae85a4: LoadField: r4 = r1->field_b
    //     0xae85a4: ldur            w4, [x1, #0xb]
    // 0xae85a8: DecompressPointer r4
    //     0xae85a8: add             x4, x4, HEAP, lsl #32
    // 0xae85ac: mov             x0, x4
    // 0xae85b0: stur            x4, [fp, #-0x10]
    // 0xae85b4: r0 = InitAsync()
    //     0xae85b4: bl              #0xa75e10  ; InitAsyncStub
    // 0xae85b8: ldur            x0, [fp, #-0x18]
    // 0xae85bc: LoadField: r1 = r0->field_f
    //     0xae85bc: ldur            w1, [x0, #0xf]
    // 0xae85c0: DecompressPointer r1
    //     0xae85c0: add             x1, x1, HEAP, lsl #32
    // 0xae85c4: LoadField: r2 = r0->field_13
    //     0xae85c4: ldur            w2, [x0, #0x13]
    // 0xae85c8: DecompressPointer r2
    //     0xae85c8: add             x2, x2, HEAP, lsl #32
    // 0xae85cc: ldur            x16, [fp, #-0x10]
    // 0xae85d0: stp             x1, x16, [SP, #0x10]
    // 0xae85d4: ldur            x16, [fp, #-0x20]
    // 0xae85d8: stp             x2, x16, [SP]
    // 0xae85dc: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0xae85dc: ldr             x4, [PP, #0x2610]  ; [pp+0x2610] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0xae85e0: r0 = __unknown_function__()
    //     0xae85e0: bl              #0xae85f0  ; [] ::__unknown_function__
    // 0xae85e4: r0 = ReturnAsync()
    //     0xae85e4: b               #0xa6b994  ; ReturnAsyncStub
    // 0xae85e8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae85e8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae85ec: b               #0xae85a4
  }
  [closure] Future<Null> <anonymous closure>(dynamic, Edb) async {
    // ** addr: 0xae90ec, size: 0x4d8
    // 0xae90ec: EnterFrame
    //     0xae90ec: stp             fp, lr, [SP, #-0x10]!
    //     0xae90f0: mov             fp, SP
    // 0xae90f4: AllocStack(0x58)
    //     0xae90f4: sub             SP, SP, #0x58
    // 0xae90f8: SetupParameters(_Tdb this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xae90f8: stur            NULL, [fp, #-8]
    //     0xae90fc: movz            x0, #0
    //     0xae9100: add             x1, fp, w0, sxtw #2
    //     0xae9104: ldr             x1, [x1, #0x18]
    //     0xae9108: add             x2, fp, w0, sxtw #2
    //     0xae910c: ldr             x2, [x2, #0x10]
    //     0xae9110: stur            x2, [fp, #-0x18]
    //     0xae9114: ldur            w3, [x1, #0x17]
    //     0xae9118: add             x3, x3, HEAP, lsl #32
    //     0xae911c: stur            x3, [fp, #-0x10]
    // 0xae9120: CheckStackOverflow
    //     0xae9120: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae9124: cmp             SP, x16
    //     0xae9128: b.ls            #0xae95b0
    // 0xae912c: InitAsync() -> Future<Null?>
    //     0xae912c: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xae9130: bl              #0xa75e10  ; InitAsyncStub
    // 0xae9134: ldur            x0, [fp, #-0x18]
    // 0xae9138: r2 = Null
    //     0xae9138: mov             x2, NULL
    // 0xae913c: r1 = Null
    //     0xae913c: mov             x1, NULL
    // 0xae9140: r4 = LoadClassIdInstr(r0)
    //     0xae9140: ldur            x4, [x0, #-1]
    //     0xae9144: ubfx            x4, x4, #0xc, #0x14
    // 0xae9148: cmp             x4, #0x1e9
    // 0xae914c: b.eq            #0xae9164
    // 0xae9150: r8 = feb
    //     0xae9150: add             x8, PP, #0x14, lsl #12  ; [pp+0x14b10] Type: feb
    //     0xae9154: ldr             x8, [x8, #0xb10]
    // 0xae9158: r3 = Null
    //     0xae9158: add             x3, PP, #0x14, lsl #12  ; [pp+0x14b18] Null
    //     0xae915c: ldr             x3, [x3, #0xb18]
    // 0xae9160: r0 = DefaultTypeTest()
    //     0xae9160: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xae9164: ldur            x3, [fp, #-0x10]
    // 0xae9168: LoadField: r1 = r3->field_f
    //     0xae9168: ldur            w1, [x3, #0xf]
    // 0xae916c: DecompressPointer r1
    //     0xae916c: add             x1, x1, HEAP, lsl #32
    // 0xae9170: ldur            x0, [fp, #-0x18]
    // 0xae9174: StoreField: r1->field_f = r0
    //     0xae9174: stur            w0, [x1, #0xf]
    //     0xae9178: ldurb           w16, [x1, #-1]
    //     0xae917c: ldurb           w17, [x0, #-1]
    //     0xae9180: and             x16, x17, x16, lsr #2
    //     0xae9184: tst             x16, HEAP, lsr #32
    //     0xae9188: b.eq            #0xae9190
    //     0xae918c: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xae9190: ldur            x2, [fp, #-0x18]
    // 0xae9194: r0 = __unknown_function__()
    //     0xae9194: bl              #0xae8b6c  ; [] ::__unknown_function__
    // 0xae9198: mov             x1, x0
    // 0xae919c: stur            x1, [fp, #-0x20]
    // 0xae91a0: r0 = Await()
    //     0xae91a0: bl              #0xa75a20  ; AwaitStub
    // 0xae91a4: mov             x2, x0
    // 0xae91a8: stur            x2, [fp, #-0x20]
    // 0xae91ac: cbnz            w2, #0xae9270
    // 0xae91b0: ldur            x3, [fp, #-0x10]
    // 0xae91b4: LoadField: r1 = r3->field_13
    //     0xae91b4: ldur            w1, [x3, #0x13]
    // 0xae91b8: DecompressPointer r1
    //     0xae91b8: add             x1, x1, HEAP, lsl #32
    // 0xae91bc: r0 = LoadClassIdInstr(r1)
    //     0xae91bc: ldur            x0, [x1, #-1]
    //     0xae91c0: ubfx            x0, x0, #0xc, #0x14
    // 0xae91c4: r0 = GDT[cid_x0 + -0xfff]()
    //     0xae91c4: sub             lr, x0, #0xfff
    //     0xae91c8: ldr             lr, [x21, lr, lsl #3]
    //     0xae91cc: blr             lr
    // 0xae91d0: ldur            x2, [fp, #-0x10]
    // 0xae91d4: LoadField: r1 = r2->field_13
    //     0xae91d4: ldur            w1, [x2, #0x13]
    // 0xae91d8: DecompressPointer r1
    //     0xae91d8: add             x1, x1, HEAP, lsl #32
    // 0xae91dc: r0 = LoadClassIdInstr(r1)
    //     0xae91dc: ldur            x0, [x1, #-1]
    //     0xae91e0: ubfx            x0, x0, #0xc, #0x14
    // 0xae91e4: r0 = GDT[cid_x0 + -0xfff]()
    //     0xae91e4: sub             lr, x0, #0xfff
    //     0xae91e8: ldr             lr, [x21, lr, lsl #3]
    //     0xae91ec: blr             lr
    // 0xae91f0: mov             x3, x0
    // 0xae91f4: ldur            x2, [fp, #-0x10]
    // 0xae91f8: stur            x3, [fp, #-0x30]
    // 0xae91fc: LoadField: r4 = r2->field_f
    //     0xae91fc: ldur            w4, [x2, #0xf]
    // 0xae9200: DecompressPointer r4
    //     0xae9200: add             x4, x4, HEAP, lsl #32
    // 0xae9204: stur            x4, [fp, #-0x28]
    // 0xae9208: LoadField: r1 = r2->field_13
    //     0xae9208: ldur            w1, [x2, #0x13]
    // 0xae920c: DecompressPointer r1
    //     0xae920c: add             x1, x1, HEAP, lsl #32
    // 0xae9210: r0 = LoadClassIdInstr(r1)
    //     0xae9210: ldur            x0, [x1, #-1]
    //     0xae9214: ubfx            x0, x0, #0xc, #0x14
    // 0xae9218: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae9218: sub             lr, x0, #1, lsl #12
    //     0xae921c: ldr             lr, [x21, lr, lsl #3]
    //     0xae9220: blr             lr
    // 0xae9224: mov             x2, x0
    // 0xae9228: r0 = BoxInt64Instr(r2)
    //     0xae9228: sbfiz           x0, x2, #1, #0x1f
    //     0xae922c: cmp             x2, x0, asr #1
    //     0xae9230: b.eq            #0xae923c
    //     0xae9234: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xae9238: stur            x2, [x0, #7]
    // 0xae923c: ldur            x16, [fp, #-0x30]
    // 0xae9240: ldur            lr, [fp, #-0x28]
    // 0xae9244: stp             lr, x16, [SP, #8]
    // 0xae9248: str             x0, [SP]
    // 0xae924c: ldur            x0, [fp, #-0x30]
    // 0xae9250: ClosureCall
    //     0xae9250: ldr             x4, [PP, #0x1270]  ; [pp+0x1270] List(5) [0, 0x3, 0x3, 0x3, Null]
    //     0xae9254: ldur            x2, [x0, #0x1f]
    //     0xae9258: blr             x2
    // 0xae925c: mov             x1, x0
    // 0xae9260: stur            x1, [fp, #-0x28]
    // 0xae9264: r0 = Await()
    //     0xae9264: bl              #0xa75a20  ; AwaitStub
    // 0xae9268: ldur            x2, [fp, #-0x10]
    // 0xae926c: b               #0xae951c
    // 0xae9270: mov             x3, x2
    // 0xae9274: ldur            x2, [fp, #-0x10]
    // 0xae9278: LoadField: r1 = r2->field_13
    //     0xae9278: ldur            w1, [x2, #0x13]
    // 0xae927c: DecompressPointer r1
    //     0xae927c: add             x1, x1, HEAP, lsl #32
    // 0xae9280: r0 = LoadClassIdInstr(r1)
    //     0xae9280: ldur            x0, [x1, #-1]
    //     0xae9284: ubfx            x0, x0, #0xc, #0x14
    // 0xae9288: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae9288: sub             lr, x0, #1, lsl #12
    //     0xae928c: ldr             lr, [x21, lr, lsl #3]
    //     0xae9290: blr             lr
    // 0xae9294: ldur            x2, [fp, #-0x20]
    // 0xae9298: cmp             w2, NULL
    // 0xae929c: b.eq            #0xae95b8
    // 0xae92a0: r3 = LoadInt32Instr(r2)
    //     0xae92a0: sbfx            x3, x2, #1, #0x1f
    //     0xae92a4: tbz             w2, #0, #0xae92ac
    //     0xae92a8: ldur            x3, [x2, #7]
    // 0xae92ac: stur            x3, [fp, #-0x38]
    // 0xae92b0: cmp             x0, x3
    // 0xae92b4: b.le            #0xae937c
    // 0xae92b8: ldur            x3, [fp, #-0x10]
    // 0xae92bc: LoadField: r1 = r3->field_13
    //     0xae92bc: ldur            w1, [x3, #0x13]
    // 0xae92c0: DecompressPointer r1
    //     0xae92c0: add             x1, x1, HEAP, lsl #32
    // 0xae92c4: r0 = LoadClassIdInstr(r1)
    //     0xae92c4: ldur            x0, [x1, #-1]
    //     0xae92c8: ubfx            x0, x0, #0xc, #0x14
    // 0xae92cc: r0 = GDT[cid_x0 + -0xff3]()
    //     0xae92cc: sub             lr, x0, #0xff3
    //     0xae92d0: ldr             lr, [x21, lr, lsl #3]
    //     0xae92d4: blr             lr
    // 0xae92d8: ldur            x2, [fp, #-0x10]
    // 0xae92dc: LoadField: r1 = r2->field_13
    //     0xae92dc: ldur            w1, [x2, #0x13]
    // 0xae92e0: DecompressPointer r1
    //     0xae92e0: add             x1, x1, HEAP, lsl #32
    // 0xae92e4: r0 = LoadClassIdInstr(r1)
    //     0xae92e4: ldur            x0, [x1, #-1]
    //     0xae92e8: ubfx            x0, x0, #0xc, #0x14
    // 0xae92ec: r0 = GDT[cid_x0 + -0xff3]()
    //     0xae92ec: sub             lr, x0, #0xff3
    //     0xae92f0: ldr             lr, [x21, lr, lsl #3]
    //     0xae92f4: blr             lr
    // 0xae92f8: mov             x3, x0
    // 0xae92fc: ldur            x2, [fp, #-0x10]
    // 0xae9300: stur            x3, [fp, #-0x30]
    // 0xae9304: LoadField: r4 = r2->field_f
    //     0xae9304: ldur            w4, [x2, #0xf]
    // 0xae9308: DecompressPointer r4
    //     0xae9308: add             x4, x4, HEAP, lsl #32
    // 0xae930c: stur            x4, [fp, #-0x28]
    // 0xae9310: LoadField: r1 = r2->field_13
    //     0xae9310: ldur            w1, [x2, #0x13]
    // 0xae9314: DecompressPointer r1
    //     0xae9314: add             x1, x1, HEAP, lsl #32
    // 0xae9318: r0 = LoadClassIdInstr(r1)
    //     0xae9318: ldur            x0, [x1, #-1]
    //     0xae931c: ubfx            x0, x0, #0xc, #0x14
    // 0xae9320: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae9320: sub             lr, x0, #1, lsl #12
    //     0xae9324: ldr             lr, [x21, lr, lsl #3]
    //     0xae9328: blr             lr
    // 0xae932c: mov             x2, x0
    // 0xae9330: r0 = BoxInt64Instr(r2)
    //     0xae9330: sbfiz           x0, x2, #1, #0x1f
    //     0xae9334: cmp             x2, x0, asr #1
    //     0xae9338: b.eq            #0xae9344
    //     0xae933c: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xae9340: stur            x2, [x0, #7]
    // 0xae9344: ldur            x16, [fp, #-0x30]
    // 0xae9348: ldur            lr, [fp, #-0x28]
    // 0xae934c: stp             lr, x16, [SP, #0x10]
    // 0xae9350: ldur            x16, [fp, #-0x20]
    // 0xae9354: stp             x0, x16, [SP]
    // 0xae9358: ldur            x0, [fp, #-0x30]
    // 0xae935c: ClosureCall
    //     0xae935c: ldr             x4, [PP, #0x1018]  ; [pp+0x1018] List(5) [0, 0x4, 0x4, 0x4, Null]
    //     0xae9360: ldur            x2, [x0, #0x1f]
    //     0xae9364: blr             x2
    // 0xae9368: mov             x1, x0
    // 0xae936c: stur            x1, [fp, #-0x28]
    // 0xae9370: r0 = Await()
    //     0xae9370: bl              #0xa75a20  ; AwaitStub
    // 0xae9374: ldur            x2, [fp, #-0x10]
    // 0xae9378: b               #0xae951c
    // 0xae937c: ldur            x2, [fp, #-0x10]
    // 0xae9380: LoadField: r1 = r2->field_13
    //     0xae9380: ldur            w1, [x2, #0x13]
    // 0xae9384: DecompressPointer r1
    //     0xae9384: add             x1, x1, HEAP, lsl #32
    // 0xae9388: r0 = LoadClassIdInstr(r1)
    //     0xae9388: ldur            x0, [x1, #-1]
    //     0xae938c: ubfx            x0, x0, #0xc, #0x14
    // 0xae9390: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae9390: sub             lr, x0, #1, lsl #12
    //     0xae9394: ldr             lr, [x21, lr, lsl #3]
    //     0xae9398: blr             lr
    // 0xae939c: mov             x1, x0
    // 0xae93a0: ldur            x0, [fp, #-0x38]
    // 0xae93a4: cmp             x1, x0
    // 0xae93a8: b.ge            #0xae9518
    // 0xae93ac: ldur            x2, [fp, #-0x10]
    // 0xae93b0: LoadField: r1 = r2->field_13
    //     0xae93b0: ldur            w1, [x2, #0x13]
    // 0xae93b4: DecompressPointer r1
    //     0xae93b4: add             x1, x1, HEAP, lsl #32
    // 0xae93b8: r0 = LoadClassIdInstr(r1)
    //     0xae93b8: ldur            x0, [x1, #-1]
    //     0xae93bc: ubfx            x0, x0, #0xc, #0x14
    // 0xae93c0: r0 = GDT[cid_x0 + -0xffb]()
    //     0xae93c0: sub             lr, x0, #0xffb
    //     0xae93c4: ldr             lr, [x21, lr, lsl #3]
    //     0xae93c8: blr             lr
    // 0xae93cc: cmp             w0, NULL
    // 0xae93d0: b.eq            #0xae9510
    // 0xae93d4: ldur            x3, [fp, #-0x18]
    // 0xae93d8: ldur            x2, [fp, #-0x10]
    // 0xae93dc: LoadField: r1 = r2->field_13
    //     0xae93dc: ldur            w1, [x2, #0x13]
    // 0xae93e0: DecompressPointer r1
    //     0xae93e0: add             x1, x1, HEAP, lsl #32
    // 0xae93e4: r0 = LoadClassIdInstr(r1)
    //     0xae93e4: ldur            x0, [x1, #-1]
    //     0xae93e8: ubfx            x0, x0, #0xc, #0x14
    // 0xae93ec: r0 = GDT[cid_x0 + -0xffb]()
    //     0xae93ec: sub             lr, x0, #0xffb
    //     0xae93f0: ldr             lr, [x21, lr, lsl #3]
    //     0xae93f4: blr             lr
    // 0xae93f8: mov             x2, x0
    // 0xae93fc: stur            x2, [fp, #-0x30]
    // 0xae9400: cmp             w2, NULL
    // 0xae9404: b.eq            #0xae95bc
    // 0xae9408: ldur            x3, [fp, #-0x10]
    // 0xae940c: LoadField: r4 = r3->field_f
    //     0xae940c: ldur            w4, [x3, #0xf]
    // 0xae9410: DecompressPointer r4
    //     0xae9410: add             x4, x4, HEAP, lsl #32
    // 0xae9414: stur            x4, [fp, #-0x28]
    // 0xae9418: LoadField: r1 = r3->field_13
    //     0xae9418: ldur            w1, [x3, #0x13]
    // 0xae941c: DecompressPointer r1
    //     0xae941c: add             x1, x1, HEAP, lsl #32
    // 0xae9420: r0 = LoadClassIdInstr(r1)
    //     0xae9420: ldur            x0, [x1, #-1]
    //     0xae9424: ubfx            x0, x0, #0xc, #0x14
    // 0xae9428: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae9428: sub             lr, x0, #1, lsl #12
    //     0xae942c: ldr             lr, [x21, lr, lsl #3]
    //     0xae9430: blr             lr
    // 0xae9434: mov             x2, x0
    // 0xae9438: r0 = BoxInt64Instr(r2)
    //     0xae9438: sbfiz           x0, x2, #1, #0x1f
    //     0xae943c: cmp             x2, x0, asr #1
    //     0xae9440: b.eq            #0xae944c
    //     0xae9444: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xae9448: stur            x2, [x0, #7]
    // 0xae944c: ldur            x16, [fp, #-0x30]
    // 0xae9450: ldur            lr, [fp, #-0x28]
    // 0xae9454: stp             lr, x16, [SP, #0x10]
    // 0xae9458: ldur            x16, [fp, #-0x20]
    // 0xae945c: stp             x0, x16, [SP]
    // 0xae9460: ldur            x0, [fp, #-0x30]
    // 0xae9464: ClosureCall
    //     0xae9464: ldr             x4, [PP, #0x1018]  ; [pp+0x1018] List(5) [0, 0x4, 0x4, 0x4, Null]
    //     0xae9468: ldur            x2, [x0, #0x1f]
    //     0xae946c: blr             x2
    // 0xae9470: mov             x1, x0
    // 0xae9474: stur            x1, [fp, #-0x28]
    // 0xae9478: r0 = Await()
    //     0xae9478: bl              #0xa75a20  ; AwaitStub
    // 0xae947c: ldur            x2, [fp, #-0x10]
    // 0xae9480: LoadField: r0 = r2->field_f
    //     0xae9480: ldur            w0, [x2, #0xf]
    // 0xae9484: DecompressPointer r0
    //     0xae9484: add             x0, x0, HEAP, lsl #32
    // 0xae9488: LoadField: r1 = r0->field_f
    //     0xae9488: ldur            w1, [x0, #0xf]
    // 0xae948c: DecompressPointer r1
    //     0xae948c: add             x1, x1, HEAP, lsl #32
    // 0xae9490: cmp             w1, NULL
    // 0xae9494: b.eq            #0xae95c0
    // 0xae9498: LoadField: r0 = r1->field_7
    //     0xae9498: ldur            w0, [x1, #7]
    // 0xae949c: DecompressPointer r0
    //     0xae949c: add             x0, x0, HEAP, lsl #32
    // 0xae94a0: ldur            x1, [fp, #-0x18]
    // 0xae94a4: LoadField: r3 = r1->field_7
    //     0xae94a4: ldur            w3, [x1, #7]
    // 0xae94a8: DecompressPointer r3
    //     0xae94a8: add             x3, x3, HEAP, lsl #32
    // 0xae94ac: cmp             w0, w3
    // 0xae94b0: b.eq            #0xae951c
    // 0xae94b4: and             w16, w0, w3
    // 0xae94b8: branchIfSmi(r16, 0xae94ec)
    //     0xae94b8: tbz             w16, #0, #0xae94ec
    // 0xae94bc: r16 = LoadClassIdInstr(r0)
    //     0xae94bc: ldur            x16, [x0, #-1]
    //     0xae94c0: ubfx            x16, x16, #0xc, #0x14
    // 0xae94c4: cmp             x16, #0x3d
    // 0xae94c8: b.ne            #0xae94ec
    // 0xae94cc: r16 = LoadClassIdInstr(r3)
    //     0xae94cc: ldur            x16, [x3, #-1]
    //     0xae94d0: ubfx            x16, x16, #0xc, #0x14
    // 0xae94d4: cmp             x16, #0x3d
    // 0xae94d8: b.ne            #0xae94ec
    // 0xae94dc: LoadField: r16 = r0->field_7
    //     0xae94dc: ldur            x16, [x0, #7]
    // 0xae94e0: LoadField: r17 = r3->field_7
    //     0xae94e0: ldur            x17, [x3, #7]
    // 0xae94e4: cmp             x16, x17
    // 0xae94e8: b.eq            #0xae951c
    // 0xae94ec: StoreField: r1->field_7 = r0
    //     0xae94ec: stur            w0, [x1, #7]
    //     0xae94f0: tbz             w0, #0, #0xae950c
    //     0xae94f4: ldurb           w16, [x1, #-1]
    //     0xae94f8: ldurb           w17, [x0, #-1]
    //     0xae94fc: and             x16, x17, x16, lsr #2
    //     0xae9500: tst             x16, HEAP, lsr #32
    //     0xae9504: b.eq            #0xae950c
    //     0xae9508: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xae950c: b               #0xae951c
    // 0xae9510: ldur            x2, [fp, #-0x10]
    // 0xae9514: b               #0xae951c
    // 0xae9518: ldur            x2, [fp, #-0x10]
    // 0xae951c: ldur            x3, [fp, #-0x20]
    // 0xae9520: LoadField: r1 = r2->field_13
    //     0xae9520: ldur            w1, [x2, #0x13]
    // 0xae9524: DecompressPointer r1
    //     0xae9524: add             x1, x1, HEAP, lsl #32
    // 0xae9528: r0 = LoadClassIdInstr(r1)
    //     0xae9528: ldur            x0, [x1, #-1]
    //     0xae952c: ubfx            x0, x0, #0xc, #0x14
    // 0xae9530: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae9530: sub             lr, x0, #1, lsl #12
    //     0xae9534: ldr             lr, [x21, lr, lsl #3]
    //     0xae9538: blr             lr
    // 0xae953c: mov             x2, x0
    // 0xae9540: r0 = BoxInt64Instr(r2)
    //     0xae9540: sbfiz           x0, x2, #1, #0x1f
    //     0xae9544: cmp             x2, x0, asr #1
    //     0xae9548: b.eq            #0xae9554
    //     0xae954c: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xae9550: stur            x2, [x0, #7]
    // 0xae9554: mov             x1, x0
    // 0xae9558: ldur            x0, [fp, #-0x20]
    // 0xae955c: cmp             w0, w1
    // 0xae9560: b.eq            #0xae95a8
    // 0xae9564: ldur            x2, [fp, #-0x10]
    // 0xae9568: LoadField: r3 = r2->field_f
    //     0xae9568: ldur            w3, [x2, #0xf]
    // 0xae956c: DecompressPointer r3
    //     0xae956c: add             x3, x3, HEAP, lsl #32
    // 0xae9570: stur            x3, [fp, #-0x18]
    // 0xae9574: LoadField: r1 = r2->field_13
    //     0xae9574: ldur            w1, [x2, #0x13]
    // 0xae9578: DecompressPointer r1
    //     0xae9578: add             x1, x1, HEAP, lsl #32
    // 0xae957c: r0 = LoadClassIdInstr(r1)
    //     0xae957c: ldur            x0, [x1, #-1]
    //     0xae9580: ubfx            x0, x0, #0xc, #0x14
    // 0xae9584: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae9584: sub             lr, x0, #1, lsl #12
    //     0xae9588: ldr             lr, [x21, lr, lsl #3]
    //     0xae958c: blr             lr
    // 0xae9590: ldur            x1, [fp, #-0x18]
    // 0xae9594: mov             x2, x0
    // 0xae9598: r0 = call 0x7df664
    //     0xae9598: bl              #0x7df664
    // 0xae959c: mov             x1, x0
    // 0xae95a0: stur            x1, [fp, #-0x18]
    // 0xae95a4: r0 = Await()
    //     0xae95a4: bl              #0xa75a20  ; AwaitStub
    // 0xae95a8: r0 = Null
    //     0xae95a8: mov             x0, NULL
    // 0xae95ac: r0 = ReturnAsyncNotFuture()
    //     0xae95ac: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae95b0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae95b0: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae95b4: b               #0xae912c
    // 0xae95b8: r0 = NullErrorSharedWithoutFPURegs()
    //     0xae95b8: bl              #0xb2a398  ; NullErrorSharedWithoutFPURegsStub
    // 0xae95bc: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xae95bc: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xae95c0: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xae95c0: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] Future<void> PQi(dynamic, Fdb, int, int) async {
    // ** addr: 0xae965c, size: 0x2fc
    // 0xae965c: EnterFrame
    //     0xae965c: stp             fp, lr, [SP, #-0x10]!
    //     0xae9660: mov             fp, SP
    // 0xae9664: AllocStack(0xb0)
    //     0xae9664: sub             SP, SP, #0xb0
    // 0xae9668: SetupParameters(_Tdb this /* r1 */, dynamic _ /* r2, fp-0x80 */)
    //     0xae9668: stur            NULL, [fp, #-8]
    //     0xae966c: movz            x0, #0
    //     0xae9670: add             x1, fp, w0, sxtw #2
    //     0xae9674: ldr             x1, [x1, #0x28]
    //     0xae9678: add             x2, fp, w0, sxtw #2
    //     0xae967c: ldr             x2, [x2, #0x20]
    //     0xae9680: stur            x2, [fp, #-0x80]
    //     0xae9684: ldur            w3, [x1, #0x17]
    //     0xae9688: add             x3, x3, HEAP, lsl #32
    //     0xae968c: stur            x3, [fp, #-0x78]
    // 0xae9690: CheckStackOverflow
    //     0xae9690: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xae9694: cmp             SP, x16
    //     0xae9698: b.ls            #0xae9940
    // 0xae969c: InitAsync() -> Future<void?>
    //     0xae969c: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xae96a0: bl              #0xa75e10  ; InitAsyncStub
    // 0xae96a4: ldur            x0, [fp, #-0x80]
    // 0xae96a8: r2 = Null
    //     0xae96a8: mov             x2, NULL
    // 0xae96ac: r1 = Null
    //     0xae96ac: mov             x1, NULL
    // 0xae96b0: r4 = LoadClassIdInstr(r0)
    //     0xae96b0: ldur            x4, [x0, #-1]
    //     0xae96b4: ubfx            x4, x4, #0xc, #0x14
    // 0xae96b8: sub             x4, x4, #0x1f7
    // 0xae96bc: cmp             x4, #1
    // 0xae96c0: b.ls            #0xae96d8
    // 0xae96c4: r8 = Ndb
    //     0xae96c4: add             x8, PP, #0x14, lsl #12  ; [pp+0x14b38] Type: Ndb
    //     0xae96c8: ldr             x8, [x8, #0xb38]
    // 0xae96cc: r3 = Null
    //     0xae96cc: add             x3, PP, #0x14, lsl #12  ; [pp+0x14b40] Null
    //     0xae96d0: ldr             x3, [x3, #0xb40]
    // 0xae96d4: r0 = DefaultTypeTest()
    //     0xae96d4: bl              #0xb27a04  ; DefaultTypeTestStub
    // 0xae96d8: ldur            x1, [fp, #-0x80]
    // 0xae96dc: r0 = __unknown_function__()
    //     0xae96dc: bl              #0xae80dc  ; [] ::__unknown_function__
    // 0xae96e0: mov             x1, x0
    // 0xae96e4: stur            x1, [fp, #-0x88]
    // 0xae96e8: r0 = Await()
    //     0xae96e8: bl              #0xa75a20  ; AwaitStub
    // 0xae96ec: ldur            x0, [fp, #-0x78]
    // 0xae96f0: LoadField: r1 = r0->field_f
    //     0xae96f0: ldur            w1, [x0, #0xf]
    // 0xae96f4: DecompressPointer r1
    //     0xae96f4: add             x1, x1, HEAP, lsl #32
    // 0xae96f8: r2 = false
    //     0xae96f8: add             x2, NULL, #0x30  ; false
    // 0xae96fc: StoreField: r1->field_7 = r2
    //     0xae96fc: stur            w2, [x1, #7]
    // 0xae9700: LoadField: r2 = r1->field_27
    //     0xae9700: ldur            w2, [x1, #0x27]
    // 0xae9704: DecompressPointer r2
    //     0xae9704: add             x2, x2, HEAP, lsl #32
    // 0xae9708: cmp             w2, NULL
    // 0xae970c: b.eq            #0xae9948
    // 0xae9710: LoadField: r1 = r2->field_7
    //     0xae9710: ldur            w1, [x2, #7]
    // 0xae9714: DecompressPointer r1
    //     0xae9714: add             x1, x1, HEAP, lsl #32
    // 0xae9718: ldur            x3, [fp, #-0x80]
    // 0xae971c: LoadField: r2 = r3->field_b
    //     0xae971c: ldur            w2, [x3, #0xb]
    // 0xae9720: DecompressPointer r2
    //     0xae9720: add             x2, x2, HEAP, lsl #32
    // 0xae9724: r16 = Sentinel
    //     0xae9724: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0xae9728: cmp             w2, w16
    // 0xae972c: b.eq            #0xae994c
    // 0xae9730: r0 = __unknown_function__()
    //     0xae9730: bl              #0xae9958  ; [] ::__unknown_function__
    // 0xae9734: mov             x1, x0
    // 0xae9738: stur            x1, [fp, #-0x88]
    // 0xae973c: r0 = Await()
    //     0xae973c: bl              #0xa75a20  ; AwaitStub
    // 0xae9740: ldur            x0, [fp, #-0x78]
    // 0xae9744: LoadField: r1 = r0->field_f
    //     0xae9744: ldur            w1, [x0, #0xf]
    // 0xae9748: DecompressPointer r1
    //     0xae9748: add             x1, x1, HEAP, lsl #32
    // 0xae974c: r0 = __unknown_function__()
    //     0xae974c: bl              #0xae8ca0  ; [] ::__unknown_function__
    // 0xae9750: mov             x1, x0
    // 0xae9754: stur            x1, [fp, #-0x88]
    // 0xae9758: r0 = Await()
    //     0xae9758: bl              #0xa75a20  ; AwaitStub
    // 0xae975c: mov             x1, x0
    // 0xae9760: ldur            x2, [fp, #-0x78]
    // 0xae9764: ArrayStore: r2[0] = r0  ; List_4
    //     0xae9764: stur            w0, [x2, #0x17]
    //     0xae9768: tbz             w0, #0, #0xae9784
    //     0xae976c: ldurb           w16, [x2, #-1]
    //     0xae9770: ldurb           w17, [x0, #-1]
    //     0xae9774: and             x16, x17, x16, lsr #2
    //     0xae9778: tst             x16, HEAP, lsr #32
    //     0xae977c: b.eq            #0xae9784
    //     0xae9780: bl              #0xb28284  ; WriteBarrierWrappersStub
    // 0xae9784: mov             x0, x1
    // 0xae9788: ldur            x3, [fp, #-0x80]
    // 0xae978c: ArrayStore: r3[0] = r0  ; List_4
    //     0xae978c: stur            w0, [x3, #0x17]
    //     0xae9790: tbz             w0, #0, #0xae97ac
    //     0xae9794: ldurb           w16, [x3, #-1]
    //     0xae9798: ldurb           w17, [x0, #-1]
    //     0xae979c: and             x16, x17, x16, lsr #2
    //     0xae97a0: tst             x16, HEAP, lsr #32
    //     0xae97a4: b.eq            #0xae97ac
    //     0xae97a8: bl              #0xb282a4  ; WriteBarrierWrappersStub
    // 0xae97ac: LoadField: r1 = r2->field_13
    //     0xae97ac: ldur            w1, [x2, #0x13]
    // 0xae97b0: DecompressPointer r1
    //     0xae97b0: add             x1, x1, HEAP, lsl #32
    // 0xae97b4: r0 = LoadClassIdInstr(r1)
    //     0xae97b4: ldur            x0, [x1, #-1]
    //     0xae97b8: ubfx            x0, x0, #0xc, #0x14
    // 0xae97bc: r0 = GDT[cid_x0 + -0xff4]()
    //     0xae97bc: sub             lr, x0, #0xff4
    //     0xae97c0: ldr             lr, [x21, lr, lsl #3]
    //     0xae97c4: blr             lr
    // 0xae97c8: ldur            x0, [fp, #-0x78]
    // 0xae97cc: LoadField: r3 = r0->field_f
    //     0xae97cc: ldur            w3, [x0, #0xf]
    // 0xae97d0: DecompressPointer r3
    //     0xae97d0: add             x3, x3, HEAP, lsl #32
    // 0xae97d4: ldur            x1, [fp, #-0x80]
    // 0xae97d8: stur            x3, [fp, #-0x88]
    // 0xae97dc: r2 = true
    //     0xae97dc: add             x2, NULL, #0x20  ; true
    // 0xae97e0: r0 = __unknown_function__()
    //     0xae97e0: bl              #0xae8974  ; [] ::__unknown_function__
    // 0xae97e4: mov             x1, x0
    // 0xae97e8: stur            x1, [fp, #-0x90]
    // 0xae97ec: r0 = Await()
    //     0xae97ec: bl              #0xa75a20  ; AwaitStub
    // 0xae97f0: ldur            x1, [fp, #-0x88]
    // 0xae97f4: StoreField: r1->field_f = r0
    //     0xae97f4: stur            w0, [x1, #0xf]
    //     0xae97f8: ldurb           w16, [x1, #-1]
    //     0xae97fc: ldurb           w17, [x0, #-1]
    //     0xae9800: and             x16, x17, x16, lsr #2
    //     0xae9804: tst             x16, HEAP, lsr #32
    //     0xae9808: b.eq            #0xae9810
    //     0xae980c: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xae9810: ldur            x2, [fp, #-0x78]
    // 0xae9814: LoadField: r1 = r2->field_13
    //     0xae9814: ldur            w1, [x2, #0x13]
    // 0xae9818: DecompressPointer r1
    //     0xae9818: add             x1, x1, HEAP, lsl #32
    // 0xae981c: r0 = LoadClassIdInstr(r1)
    //     0xae981c: ldur            x0, [x1, #-1]
    //     0xae9820: ubfx            x0, x0, #0xc, #0x14
    // 0xae9824: r0 = GDT[cid_x0 + -0xfff]()
    //     0xae9824: sub             lr, x0, #0xfff
    //     0xae9828: ldr             lr, [x21, lr, lsl #3]
    //     0xae982c: blr             lr
    // 0xae9830: ldur            x2, [fp, #-0x78]
    // 0xae9834: LoadField: r1 = r2->field_13
    //     0xae9834: ldur            w1, [x2, #0x13]
    // 0xae9838: DecompressPointer r1
    //     0xae9838: add             x1, x1, HEAP, lsl #32
    // 0xae983c: r0 = LoadClassIdInstr(r1)
    //     0xae983c: ldur            x0, [x1, #-1]
    //     0xae9840: ubfx            x0, x0, #0xc, #0x14
    // 0xae9844: r0 = GDT[cid_x0 + -0xfff]()
    //     0xae9844: sub             lr, x0, #0xfff
    //     0xae9848: ldr             lr, [x21, lr, lsl #3]
    //     0xae984c: blr             lr
    // 0xae9850: mov             x3, x0
    // 0xae9854: ldur            x2, [fp, #-0x78]
    // 0xae9858: stur            x3, [fp, #-0x88]
    // 0xae985c: LoadField: r1 = r2->field_13
    //     0xae985c: ldur            w1, [x2, #0x13]
    // 0xae9860: DecompressPointer r1
    //     0xae9860: add             x1, x1, HEAP, lsl #32
    // 0xae9864: r0 = LoadClassIdInstr(r1)
    //     0xae9864: ldur            x0, [x1, #-1]
    //     0xae9868: ubfx            x0, x0, #0xc, #0x14
    // 0xae986c: r0 = GDT[cid_x0 + -0x1000]()
    //     0xae986c: sub             lr, x0, #1, lsl #12
    //     0xae9870: ldr             lr, [x21, lr, lsl #3]
    //     0xae9874: blr             lr
    // 0xae9878: mov             x2, x0
    // 0xae987c: r0 = BoxInt64Instr(r2)
    //     0xae987c: sbfiz           x0, x2, #1, #0x1f
    //     0xae9880: cmp             x2, x0, asr #1
    //     0xae9884: b.eq            #0xae9890
    //     0xae9888: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xae988c: stur            x2, [x0, #7]
    // 0xae9890: ldur            x16, [fp, #-0x88]
    // 0xae9894: ldur            lr, [fp, #-0x80]
    // 0xae9898: stp             lr, x16, [SP, #8]
    // 0xae989c: str             x0, [SP]
    // 0xae98a0: ldur            x0, [fp, #-0x88]
    // 0xae98a4: ClosureCall
    //     0xae98a4: ldr             x4, [PP, #0x1270]  ; [pp+0x1270] List(5) [0, 0x3, 0x3, 0x3, Null]
    //     0xae98a8: ldur            x2, [x0, #0x1f]
    //     0xae98ac: blr             x2
    // 0xae98b0: mov             x1, x0
    // 0xae98b4: stur            x1, [fp, #-0x88]
    // 0xae98b8: r0 = Await()
    //     0xae98b8: bl              #0xa75a20  ; AwaitStub
    // 0xae98bc: r0 = Null
    //     0xae98bc: mov             x0, NULL
    // 0xae98c0: r0 = ReturnAsyncNotFuture()
    //     0xae98c0: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xae98c4: sub             SP, fp, #0xb0
    // 0xae98c8: ldur            x2, [fp, #-0x78]
    // 0xae98cc: mov             x3, x0
    // 0xae98d0: stur            x0, [fp, #-0x88]
    // 0xae98d4: mov             x16, x1
    // 0xae98d8: mov             x1, x0
    // 0xae98dc: mov             x0, x16
    // 0xae98e0: stur            x0, [fp, #-0x90]
    // 0xae98e4: r0 = call 0x33fce0
    //     0xae98e4: bl              #0x33fce0
    // 0xae98e8: ldur            x0, [fp, #-0x78]
    // 0xae98ec: LoadField: r3 = r0->field_f
    //     0xae98ec: ldur            w3, [x0, #0xf]
    // 0xae98f0: DecompressPointer r3
    //     0xae98f0: add             x3, x3, HEAP, lsl #32
    // 0xae98f4: ldur            x1, [fp, #-0x80]
    // 0xae98f8: stur            x3, [fp, #-0x98]
    // 0xae98fc: r2 = true
    //     0xae98fc: add             x2, NULL, #0x20  ; true
    // 0xae9900: r0 = __unknown_function__()
    //     0xae9900: bl              #0xae8974  ; [] ::__unknown_function__
    // 0xae9904: mov             x1, x0
    // 0xae9908: stur            x1, [fp, #-0x80]
    // 0xae990c: r0 = Await()
    //     0xae990c: bl              #0xa75a20  ; AwaitStub
    // 0xae9910: ldur            x1, [fp, #-0x98]
    // 0xae9914: StoreField: r1->field_f = r0
    //     0xae9914: stur            w0, [x1, #0xf]
    //     0xae9918: ldurb           w16, [x1, #-1]
    //     0xae991c: ldurb           w17, [x0, #-1]
    //     0xae9920: and             x16, x17, x16, lsr #2
    //     0xae9924: tst             x16, HEAP, lsr #32
    //     0xae9928: b.eq            #0xae9930
    //     0xae992c: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xae9930: ldur            x0, [fp, #-0x88]
    // 0xae9934: ldur            x1, [fp, #-0x90]
    // 0xae9938: r0 = ReThrow()
    //     0xae9938: bl              #0xb27dd0  ; ReThrowStub
    // 0xae993c: brk             #0
    // 0xae9940: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xae9940: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xae9944: b               #0xae969c
    // 0xae9948: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xae9948: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xae994c: r9 = Gtb
    //     0xae994c: add             x9, PP, #0x14, lsl #12  ; [pp+0x14b50] Field <_Tdb@1203204050.Gtb>: late (offset: 0xc)
    //     0xae9950: ldr             x9, [x9, #0xb50]
    // 0xae9954: r0 = LateInitializationErrorSharedWithoutFPURegs()
    //     0xae9954: bl              #0xb2a470  ; LateInitializationErrorSharedWithoutFPURegsStub
  }
  [closure] Future<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x5f52fc, size: -0x1
  }
  [closure] Future<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x5f50d8, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x5f4fe8, size: -0x1
  }
  [closure] Future<Y0> <anonymous closure>(dynamic, Edb?) {
    // ** addr: 0x7df364, size: -0x1
  }
  [closure] Future<void> <anonymous closure>(dynamic) {
    // ** addr: 0x7defb0, size: -0x1
  }
}

// class id: 501, size: 0x30, field offset: 0x28
//   transformed mixin,
abstract class _Udb extends _Tdb
     with Rdb {
}

// class id: 502, size: 0x30, field offset: 0x30
//   transformed mixin,
abstract class _Pdb extends _Udb
     with Qdb {
}

// class id: 503, size: 0x30, field offset: 0x30
class Odb extends _Pdb {
}

// class id: 505, size: 0x8, field offset: 0x8
abstract class Sdb extends Object
    implements Ndb {
}

// class id: 506, size: 0x8, field offset: 0x8
abstract class Rdb extends Object
    implements Ndb {
}

// class id: 507, size: 0x8, field offset: 0x8
abstract class Qdb extends Object
    implements Ldb {
}
