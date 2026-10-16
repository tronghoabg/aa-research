// lib: , url: IUk

// class id: 1050378, size: 0x8
class :: {
}

// class id: 258, size: 0x1c, field offset: 0x8
class ckb extends Object {

  Map<String, dynamic> qdc(ckb) {
    // ** addr: 0xaf2a38, size: 0x48
    // 0xaf2a38: EnterFrame
    //     0xaf2a38: stp             fp, lr, [SP, #-0x10]!
    //     0xaf2a3c: mov             fp, SP
    // 0xaf2a40: CheckStackOverflow
    //     0xaf2a40: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf2a44: cmp             SP, x16
    //     0xaf2a48: b.ls            #0xaf2a60
    // 0xaf2a4c: ldr             x1, [fp, #0x10]
    // 0xaf2a50: r0 = call 0x7f75a8
    //     0xaf2a50: bl              #0x7f75a8
    // 0xaf2a54: LeaveFrame
    //     0xaf2a54: mov             SP, fp
    //     0xaf2a58: ldp             fp, lr, [SP], #0x10
    // 0xaf2a5c: ret
    //     0xaf2a5c: ret             
    // 0xaf2a60: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf2a60: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf2a64: b               #0xaf2a4c
  }
}

// class id: 259, size: 0x7c, field offset: 0x8
class bkb extends Object {
}

// class id: 2731, size: 0x5c, field offset: 0x24
class dkb extends mJ {

  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xaf2220, size: 0x394
    // 0xaf2220: EnterFrame
    //     0xaf2220: stp             fp, lr, [SP, #-0x10]!
    //     0xaf2224: mov             fp, SP
    // 0xaf2228: AllocStack(0xc8)
    //     0xaf2228: sub             SP, SP, #0xc8
    // 0xaf222c: SetupParameters(dkb this /* r1 */)
    //     0xaf222c: stur            NULL, [fp, #-8]
    //     0xaf2230: movz            x0, #0
    //     0xaf2234: add             x1, fp, w0, sxtw #2
    //     0xaf2238: ldr             x1, [x1, #0x10]
    //     0xaf223c: ldur            w2, [x1, #0x17]
    //     0xaf2240: add             x2, x2, HEAP, lsl #32
    //     0xaf2244: stur            x2, [fp, #-0x88]
    // 0xaf2248: CheckStackOverflow
    //     0xaf2248: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf224c: cmp             SP, x16
    //     0xaf2250: b.ls            #0xaf25ac
    // 0xaf2254: InitAsync() -> Future<Null?>
    //     0xaf2254: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xaf2258: bl              #0xa75e10  ; InitAsyncStub
    // 0xaf225c: r0 = Ka()
    //     0xaf225c: bl              #0xa6f7bc  ; AllocateKaStub -> Ka (size=0x14)
    // 0xaf2260: stur            x0, [fp, #-0x90]
    // 0xaf2264: StoreField: r0->field_7 = rZR
    //     0xaf2264: stur            xzr, [x0, #7]
    // 0xaf2268: StoreField: r0->field_f = rZR
    //     0xaf2268: stur            wzr, [x0, #0xf]
    // 0xaf226c: r0 = InitLateStaticField(0x37c) // [dart:core] Ka::_FEb
    //     0xaf226c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaf2270: ldr             x0, [x0, #0x6f8]
    //     0xaf2274: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaf2278: cmp             w0, w16
    //     0xaf227c: b.ne            #0xaf2288
    //     0xaf2280: ldr             x2, [PP, #0x1530]  ; [pp+0x1530] Field <Ka._FEb@0150898>: static late final (offset: 0x37c)
    //     0xaf2284: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaf2288: ldur            x1, [fp, #-0x90]
    // 0xaf228c: r0 = call 0x2f04ac
    //     0xaf228c: bl              #0x2f04ac
    // 0xaf2290: r4 = const [0, 0, 0, 0, null]
    //     0xaf2290: add             x4, PP, #9, lsl #12  ; [pp+0x9ca0] List(5) [0, 0, 0, 0, Null]
    //     0xaf2294: ldr             x4, [x4, #0xca0]
    // 0xaf2298: r0 = call 0x34043c
    //     0xaf2298: bl              #0x34043c
    // 0xaf229c: mov             x2, x0
    // 0xaf22a0: r1 = Null
    //     0xaf22a0: mov             x1, NULL
    // 0xaf22a4: r0 = call 0x5f9fe8
    //     0xaf22a4: bl              #0x5f9fe8
    // 0xaf22a8: mov             x1, x0
    // 0xaf22ac: r0 = call 0x5f7138
    //     0xaf22ac: bl              #0x5f7138
    // 0xaf22b0: stur            x0, [fp, #-0x98]
    // 0xaf22b4: cmp             w0, NULL
    // 0xaf22b8: b.eq            #0xaf2414
    // 0xaf22bc: ldur            x4, [fp, #-0x88]
    // 0xaf22c0: LoadField: r1 = r4->field_f
    //     0xaf22c0: ldur            w1, [x4, #0xf]
    // 0xaf22c4: DecompressPointer r1
    //     0xaf22c4: add             x1, x1, HEAP, lsl #32
    // 0xaf22c8: LoadField: r2 = r0->field_7
    //     0xaf22c8: ldur            w2, [x0, #7]
    // 0xaf22cc: DecompressPointer r2
    //     0xaf22cc: add             x2, x2, HEAP, lsl #32
    // 0xaf22d0: LoadField: r3 = r2->field_f
    //     0xaf22d0: ldur            w3, [x2, #0xf]
    // 0xaf22d4: DecompressPointer r3
    //     0xaf22d4: add             x3, x3, HEAP, lsl #32
    // 0xaf22d8: LoadField: r2 = r3->field_7
    //     0xaf22d8: ldur            w2, [x3, #7]
    // 0xaf22dc: DecompressPointer r2
    //     0xaf22dc: add             x2, x2, HEAP, lsl #32
    // 0xaf22e0: LoadField: r3 = r2->field_7
    //     0xaf22e0: ldur            w3, [x2, #7]
    // 0xaf22e4: DecompressPointer r3
    //     0xaf22e4: add             x3, x3, HEAP, lsl #32
    // 0xaf22e8: mov             x2, x3
    // 0xaf22ec: r3 = "premium"
    //     0xaf22ec: add             x3, PP, #0x17, lsl #12  ; [pp+0x17bd8] "premium"
    //     0xaf22f0: ldr             x3, [x3, #0xbd8]
    // 0xaf22f4: r0 = __unknown_function__()
    //     0xaf22f4: bl              #0xaf25b4  ; [] ::__unknown_function__
    // 0xaf22f8: mov             x1, x0
    // 0xaf22fc: stur            x1, [fp, #-0xa0]
    // 0xaf2300: r0 = Await()
    //     0xaf2300: bl              #0xa75a20  ; AwaitStub
    // 0xaf2304: stur            x0, [fp, #-0xb0]
    // 0xaf2308: cmp             w0, NULL
    // 0xaf230c: b.eq            #0xaf2398
    // 0xaf2310: ldur            x3, [fp, #-0x88]
    // 0xaf2314: ArrayLoad: r4 = r0[0]  ; List_4
    //     0xaf2314: ldur            w4, [x0, #0x17]
    // 0xaf2318: DecompressPointer r4
    //     0xaf2318: add             x4, x4, HEAP, lsl #32
    // 0xaf231c: stur            x4, [fp, #-0xa8]
    // 0xaf2320: LoadField: r5 = r0->field_f
    //     0xaf2320: ldur            w5, [x0, #0xf]
    // 0xaf2324: DecompressPointer r5
    //     0xaf2324: add             x5, x5, HEAP, lsl #32
    // 0xaf2328: stur            x5, [fp, #-0xa0]
    // 0xaf232c: LoadField: r6 = r0->field_13
    //     0xaf232c: ldur            w6, [x0, #0x13]
    // 0xaf2330: DecompressPointer r6
    //     0xaf2330: add             x6, x6, HEAP, lsl #32
    // 0xaf2334: stur            x6, [fp, #-0x98]
    // 0xaf2338: r1 = <scb>
    //     0xaf2338: add             x1, PP, #0x17, lsl #12  ; [pp+0x17be0] TypeArguments: <scb>
    //     0xaf233c: ldr             x1, [x1, #0xbe0]
    // 0xaf2340: r2 = 0
    //     0xaf2340: movz            x2, #0
    // 0xaf2344: r0 = call 0x2e7344
    //     0xaf2344: bl              #0x2e7344
    // 0xaf2348: stur            x0, [fp, #-0xb8]
    // 0xaf234c: r0 = Lbb()
    //     0xaf234c: bl              #0xaa1ae0  ; AllocateLbbStub -> Lbb (size=0x14)
    // 0xaf2350: mov             x1, x0
    // 0xaf2354: r0 = "premium"
    //     0xaf2354: add             x0, PP, #0x17, lsl #12  ; [pp+0x17bd8] "premium"
    //     0xaf2358: ldr             x0, [x0, #0xbd8]
    // 0xaf235c: StoreField: r1->field_7 = r0
    //     0xaf235c: stur            w0, [x1, #7]
    // 0xaf2360: ldur            x0, [fp, #-0x98]
    // 0xaf2364: StoreField: r1->field_b = r0
    //     0xaf2364: stur            w0, [x1, #0xb]
    // 0xaf2368: ldur            x0, [fp, #-0xa8]
    // 0xaf236c: StoreField: r1->field_f = r0
    //     0xaf236c: stur            w0, [x1, #0xf]
    // 0xaf2370: mov             x0, x1
    // 0xaf2374: ldur            x3, [fp, #-0x88]
    // 0xaf2378: ArrayStore: r3[0] = r0  ; List_4
    //     0xaf2378: stur            w0, [x3, #0x17]
    //     0xaf237c: ldurb           w16, [x3, #-1]
    //     0xaf2380: ldurb           w17, [x0, #-1]
    //     0xaf2384: and             x16, x17, x16, lsr #2
    //     0xaf2388: tst             x16, HEAP, lsr #32
    //     0xaf238c: b.eq            #0xaf2394
    //     0xaf2390: bl              #0xb282a4  ; WriteBarrierWrappersStub
    // 0xaf2394: b               #0xaf2414
    // 0xaf2398: ldur            x3, [fp, #-0x88]
    // 0xaf239c: LoadField: r0 = r3->field_f
    //     0xaf239c: ldur            w0, [x3, #0xf]
    // 0xaf23a0: DecompressPointer r0
    //     0xaf23a0: add             x0, x0, HEAP, lsl #32
    // 0xaf23a4: LoadField: r1 = r0->field_3f
    //     0xaf23a4: ldur            w1, [x0, #0x3f]
    // 0xaf23a8: DecompressPointer r1
    //     0xaf23a8: add             x1, x1, HEAP, lsl #32
    // 0xaf23ac: r2 = "No subscription in firestore db"
    //     0xaf23ac: add             x2, PP, #0x17, lsl #12  ; [pp+0x17be8] "No subscription in firestore db"
    //     0xaf23b0: ldr             x2, [x2, #0xbe8]
    // 0xaf23b4: r0 = call 0x33fc94
    //     0xaf23b4: bl              #0x33fc94
    // 0xaf23b8: b               #0xaf2414
    // 0xaf23bc: sub             SP, fp, #0xc8
    // 0xaf23c0: ldur            x3, [fp, #-0x88]
    // 0xaf23c4: stur            x0, [fp, #-0xa0]
    // 0xaf23c8: LoadField: r1 = r3->field_f
    //     0xaf23c8: ldur            w1, [x3, #0xf]
    // 0xaf23cc: DecompressPointer r1
    //     0xaf23cc: add             x1, x1, HEAP, lsl #32
    // 0xaf23d0: LoadField: r4 = r1->field_3f
    //     0xaf23d0: ldur            w4, [x1, #0x3f]
    // 0xaf23d4: DecompressPointer r4
    //     0xaf23d4: add             x4, x4, HEAP, lsl #32
    // 0xaf23d8: stur            x4, [fp, #-0x98]
    // 0xaf23dc: r1 = Null
    //     0xaf23dc: mov             x1, NULL
    // 0xaf23e0: r2 = 4
    //     0xaf23e0: movz            x2, #0x4
    // 0xaf23e4: r0 = AllocateArray()
    //     0xaf23e4: bl              #0xb29b38  ; AllocateArrayStub
    // 0xaf23e8: r16 = "Error query firestore subscription. "
    //     0xaf23e8: add             x16, PP, #0x17, lsl #12  ; [pp+0x17bf0] "Error query firestore subscription. "
    //     0xaf23ec: ldr             x16, [x16, #0xbf0]
    // 0xaf23f0: StoreField: r0->field_f = r16
    //     0xaf23f0: stur            w16, [x0, #0xf]
    // 0xaf23f4: ldur            x1, [fp, #-0xa0]
    // 0xaf23f8: StoreField: r0->field_13 = r1
    //     0xaf23f8: stur            w1, [x0, #0x13]
    // 0xaf23fc: str             x0, [SP]
    // 0xaf2400: r0 = _interpolate()
    //     0xaf2400: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xaf2404: ldur            x1, [fp, #-0x98]
    // 0xaf2408: mov             x2, x0
    // 0xaf240c: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xaf240c: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xaf2410: r0 = call 0x3464a8
    //     0xaf2410: bl              #0x3464a8
    // 0xaf2414: ldur            x2, [fp, #-0x88]
    // 0xaf2418: ldur            x1, [fp, #-0x90]
    // 0xaf241c: r0 = call 0x304360
    //     0xaf241c: bl              #0x304360
    // 0xaf2420: ldur            x0, [fp, #-0x88]
    // 0xaf2424: LoadField: r1 = r0->field_f
    //     0xaf2424: ldur            w1, [x0, #0xf]
    // 0xaf2428: DecompressPointer r1
    //     0xaf2428: add             x1, x1, HEAP, lsl #32
    // 0xaf242c: LoadField: r3 = r1->field_3f
    //     0xaf242c: ldur            w3, [x1, #0x3f]
    // 0xaf2430: DecompressPointer r3
    //     0xaf2430: add             x3, x3, HEAP, lsl #32
    // 0xaf2434: stur            x3, [fp, #-0x98]
    // 0xaf2438: r1 = Null
    //     0xaf2438: mov             x1, NULL
    // 0xaf243c: r2 = 6
    //     0xaf243c: movz            x2, #0x6
    // 0xaf2440: r0 = AllocateArray()
    //     0xaf2440: bl              #0xb29b38  ; AllocateArrayStub
    // 0xaf2444: stur            x0, [fp, #-0xa0]
    // 0xaf2448: r16 = "FS read time: "
    //     0xaf2448: add             x16, PP, #0x17, lsl #12  ; [pp+0x17bf8] "FS read time: "
    //     0xaf244c: ldr             x16, [x16, #0xbf8]
    // 0xaf2450: StoreField: r0->field_f = r16
    //     0xaf2450: stur            w16, [x0, #0xf]
    // 0xaf2454: ldur            x1, [fp, #-0x90]
    // 0xaf2458: r0 = call 0x7f7d2c
    //     0xaf2458: bl              #0x7f7d2c
    // 0xaf245c: mov             x2, x0
    // 0xaf2460: r0 = BoxInt64Instr(r2)
    //     0xaf2460: sbfiz           x0, x2, #1, #0x1f
    //     0xaf2464: cmp             x2, x0, asr #1
    //     0xaf2468: b.eq            #0xaf2474
    //     0xaf246c: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xaf2470: stur            x2, [x0, #7]
    // 0xaf2474: ldur            x1, [fp, #-0xa0]
    // 0xaf2478: ArrayStore: r1[1] = r0  ; List_4
    //     0xaf2478: add             x25, x1, #0x13
    //     0xaf247c: str             w0, [x25]
    //     0xaf2480: tbz             w0, #0, #0xaf249c
    //     0xaf2484: ldurb           w16, [x1, #-1]
    //     0xaf2488: ldurb           w17, [x0, #-1]
    //     0xaf248c: and             x16, x17, x16, lsr #2
    //     0xaf2490: tst             x16, HEAP, lsr #32
    //     0xaf2494: b.eq            #0xaf249c
    //     0xaf2498: bl              #0xb27e20  ; ArrayWriteBarrierStub
    // 0xaf249c: ldur            x0, [fp, #-0xa0]
    // 0xaf24a0: r16 = "ms"
    //     0xaf24a0: add             x16, PP, #0x17, lsl #12  ; [pp+0x17b80] "ms"
    //     0xaf24a4: ldr             x16, [x16, #0xb80]
    // 0xaf24a8: ArrayStore: r0[0] = r16  ; List_4
    //     0xaf24a8: stur            w16, [x0, #0x17]
    // 0xaf24ac: str             x0, [SP]
    // 0xaf24b0: r0 = _interpolate()
    //     0xaf24b0: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xaf24b4: ldur            x1, [fp, #-0x98]
    // 0xaf24b8: mov             x2, x0
    // 0xaf24bc: r0 = call 0x33fc94
    //     0xaf24bc: bl              #0x33fc94
    // 0xaf24c0: r4 = const [0, 0, 0, 0, null]
    //     0xaf24c0: add             x4, PP, #9, lsl #12  ; [pp+0x9ca0] List(5) [0, 0, 0, 0, Null]
    //     0xaf24c4: ldr             x4, [x4, #0xca0]
    // 0xaf24c8: r0 = call 0x34043c
    //     0xaf24c8: bl              #0x34043c
    // 0xaf24cc: mov             x2, x0
    // 0xaf24d0: r1 = Null
    //     0xaf24d0: mov             x1, NULL
    // 0xaf24d4: r0 = call 0x3442b8
    //     0xaf24d4: bl              #0x3442b8
    // 0xaf24d8: r1 = Null
    //     0xaf24d8: mov             x1, NULL
    // 0xaf24dc: r2 = 8
    //     0xaf24dc: movz            x2, #0x8
    // 0xaf24e0: stur            x0, [fp, #-0x98]
    // 0xaf24e4: r0 = AllocateArray()
    //     0xaf24e4: bl              #0xb29b38  ; AllocateArrayStub
    // 0xaf24e8: stur            x0, [fp, #-0xa0]
    // 0xaf24ec: r16 = "source"
    //     0xaf24ec: ldr             x16, [PP, #0x5168]  ; [pp+0x5168] "source"
    // 0xaf24f0: StoreField: r0->field_f = r16
    //     0xaf24f0: stur            w16, [x0, #0xf]
    // 0xaf24f4: r16 = "firebase"
    //     0xaf24f4: add             x16, PP, #0x17, lsl #12  ; [pp+0x17c00] "firebase"
    //     0xaf24f8: ldr             x16, [x16, #0xc00]
    // 0xaf24fc: StoreField: r0->field_13 = r16
    //     0xaf24fc: stur            w16, [x0, #0x13]
    // 0xaf2500: r16 = "value"
    //     0xaf2500: ldr             x16, [PP, #0x4420]  ; [pp+0x4420] "value"
    // 0xaf2504: ArrayStore: r0[0] = r16  ; List_4
    //     0xaf2504: stur            w16, [x0, #0x17]
    // 0xaf2508: ldur            x1, [fp, #-0x90]
    // 0xaf250c: r0 = call 0x7f7d2c
    //     0xaf250c: bl              #0x7f7d2c
    // 0xaf2510: mov             x2, x0
    // 0xaf2514: r0 = BoxInt64Instr(r2)
    //     0xaf2514: sbfiz           x0, x2, #1, #0x1f
    //     0xaf2518: cmp             x2, x0, asr #1
    //     0xaf251c: b.eq            #0xaf2528
    //     0xaf2520: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xaf2524: stur            x2, [x0, #7]
    // 0xaf2528: ldur            x1, [fp, #-0xa0]
    // 0xaf252c: ArrayStore: r1[3] = r0  ; List_4
    //     0xaf252c: add             x25, x1, #0x1b
    //     0xaf2530: str             w0, [x25]
    //     0xaf2534: tbz             w0, #0, #0xaf2550
    //     0xaf2538: ldurb           w16, [x1, #-1]
    //     0xaf253c: ldurb           w17, [x0, #-1]
    //     0xaf2540: and             x16, x17, x16, lsr #2
    //     0xaf2544: tst             x16, HEAP, lsr #32
    //     0xaf2548: b.eq            #0xaf2550
    //     0xaf254c: bl              #0xb27e20  ; ArrayWriteBarrierStub
    // 0xaf2550: r16 = <String, Object>
    //     0xaf2550: add             x16, PP, #9, lsl #12  ; [pp+0x9f20] TypeArguments: <String, Object>
    //     0xaf2554: ldr             x16, [x16, #0xf20]
    // 0xaf2558: ldur            lr, [fp, #-0xa0]
    // 0xaf255c: stp             lr, x16, [SP]
    // 0xaf2560: r0 = Map._fromLiteral()
    //     0xaf2560: bl              #0x2fd170  ; [dart:core] Map::Map._fromLiteral
    // 0xaf2564: str             x0, [SP]
    // 0xaf2568: ldur            x1, [fp, #-0x98]
    // 0xaf256c: r2 = "subscription_read_time"
    //     0xaf256c: add             x2, PP, #0x17, lsl #12  ; [pp+0x17c08] "subscription_read_time"
    //     0xaf2570: ldr             x2, [x2, #0xc08]
    // 0xaf2574: r4 = const [0, 0x3, 0x1, 0x2, wfc, 0x2, null]
    //     0xaf2574: add             x4, PP, #0x14, lsl #12  ; [pp+0x14e50] List(7) [0, 0x3, 0x1, 0x2, "wfc", 0x2, Null]
    //     0xaf2578: ldr             x4, [x4, #0xe50]
    // 0xaf257c: r0 = __unknown_function__()
    //     0xaf257c: bl              #0xa786f0  ; [] ::__unknown_function__
    // 0xaf2580: ldur            x2, [fp, #-0x88]
    // 0xaf2584: r1 = Function '<anonymous closure>':.
    //     0xaf2584: add             x1, PP, #0x17, lsl #12  ; [pp+0x17c10] AnonymousClosure: (0x7f7b34), in [IUk] dkb::<anonymous closure> (0xaf2220)
    //     0xaf2588: ldr             x1, [x1, #0xc10]
    // 0xaf258c: stur            x0, [fp, #-0x88]
    // 0xaf2590: r0 = AllocateClosure()
    //     0xaf2590: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xaf2594: ldur            x1, [fp, #-0x88]
    // 0xaf2598: mov             x2, x0
    // 0xaf259c: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xaf259c: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xaf25a0: r0 = call 0x9eb7e8
    //     0xaf25a0: bl              #0x9eb7e8
    // 0xaf25a4: r0 = Null
    //     0xaf25a4: mov             x0, NULL
    // 0xaf25a8: r0 = ReturnAsyncNotFuture()
    //     0xaf25a8: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaf25ac: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf25ac: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf25b0: b               #0xaf2254
  }
  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xaf2a74, size: 0x24c
    // 0xaf2a74: EnterFrame
    //     0xaf2a74: stp             fp, lr, [SP, #-0x10]!
    //     0xaf2a78: mov             fp, SP
    // 0xaf2a7c: AllocStack(0x38)
    //     0xaf2a7c: sub             SP, SP, #0x38
    // 0xaf2a80: SetupParameters(dkb this /* r1 */)
    //     0xaf2a80: stur            NULL, [fp, #-8]
    //     0xaf2a84: movz            x0, #0
    //     0xaf2a88: add             x1, fp, w0, sxtw #2
    //     0xaf2a8c: ldr             x1, [x1, #0x10]
    //     0xaf2a90: ldur            w2, [x1, #0x17]
    //     0xaf2a94: add             x2, x2, HEAP, lsl #32
    //     0xaf2a98: stur            x2, [fp, #-0x10]
    // 0xaf2a9c: CheckStackOverflow
    //     0xaf2a9c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaf2aa0: cmp             SP, x16
    //     0xaf2aa4: b.ls            #0xaf2cb8
    // 0xaf2aa8: InitAsync() -> Future<Null?>
    //     0xaf2aa8: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xaf2aac: bl              #0xa75e10  ; InitAsyncStub
    // 0xaf2ab0: r0 = Ka()
    //     0xaf2ab0: bl              #0xa6f7bc  ; AllocateKaStub -> Ka (size=0x14)
    // 0xaf2ab4: stur            x0, [fp, #-0x18]
    // 0xaf2ab8: StoreField: r0->field_7 = rZR
    //     0xaf2ab8: stur            xzr, [x0, #7]
    // 0xaf2abc: StoreField: r0->field_f = rZR
    //     0xaf2abc: stur            wzr, [x0, #0xf]
    // 0xaf2ac0: r0 = InitLateStaticField(0x37c) // [dart:core] Ka::_FEb
    //     0xaf2ac0: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaf2ac4: ldr             x0, [x0, #0x6f8]
    //     0xaf2ac8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaf2acc: cmp             w0, w16
    //     0xaf2ad0: b.ne            #0xaf2adc
    //     0xaf2ad4: ldr             x2, [PP, #0x1530]  ; [pp+0x1530] Field <Ka._FEb@0150898>: static late final (offset: 0x37c)
    //     0xaf2ad8: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xaf2adc: ldur            x1, [fp, #-0x18]
    // 0xaf2ae0: r0 = call 0x2f04ac
    //     0xaf2ae0: bl              #0x2f04ac
    // 0xaf2ae4: ldur            x2, [fp, #-0x10]
    // 0xaf2ae8: LoadField: r1 = r2->field_f
    //     0xaf2ae8: ldur            w1, [x2, #0xf]
    // 0xaf2aec: DecompressPointer r1
    //     0xaf2aec: add             x1, x1, HEAP, lsl #32
    // 0xaf2af0: r0 = __unknown_function__()
    //     0xaf2af0: bl              #0xaf2cc0  ; [] ::__unknown_function__
    // 0xaf2af4: mov             x1, x0
    // 0xaf2af8: stur            x1, [fp, #-0x20]
    // 0xaf2afc: r0 = Await()
    //     0xaf2afc: bl              #0xa75a20  ; AwaitStub
    // 0xaf2b00: ldur            x2, [fp, #-0x10]
    // 0xaf2b04: StoreField: r2->field_13 = r0
    //     0xaf2b04: stur            w0, [x2, #0x13]
    //     0xaf2b08: tbz             w0, #0, #0xaf2b24
    //     0xaf2b0c: ldurb           w16, [x2, #-1]
    //     0xaf2b10: ldurb           w17, [x0, #-1]
    //     0xaf2b14: and             x16, x17, x16, lsr #2
    //     0xaf2b18: tst             x16, HEAP, lsr #32
    //     0xaf2b1c: b.eq            #0xaf2b24
    //     0xaf2b20: bl              #0xb28284  ; WriteBarrierWrappersStub
    // 0xaf2b24: ldur            x1, [fp, #-0x18]
    // 0xaf2b28: r0 = call 0x304360
    //     0xaf2b28: bl              #0x304360
    // 0xaf2b2c: ldur            x0, [fp, #-0x10]
    // 0xaf2b30: LoadField: r1 = r0->field_f
    //     0xaf2b30: ldur            w1, [x0, #0xf]
    // 0xaf2b34: DecompressPointer r1
    //     0xaf2b34: add             x1, x1, HEAP, lsl #32
    // 0xaf2b38: LoadField: r3 = r1->field_3f
    //     0xaf2b38: ldur            w3, [x1, #0x3f]
    // 0xaf2b3c: DecompressPointer r3
    //     0xaf2b3c: add             x3, x3, HEAP, lsl #32
    // 0xaf2b40: stur            x3, [fp, #-0x20]
    // 0xaf2b44: r1 = Null
    //     0xaf2b44: mov             x1, NULL
    // 0xaf2b48: r2 = 6
    //     0xaf2b48: movz            x2, #0x6
    // 0xaf2b4c: r0 = AllocateArray()
    //     0xaf2b4c: bl              #0xb29b38  ; AllocateArrayStub
    // 0xaf2b50: stur            x0, [fp, #-0x28]
    // 0xaf2b54: r16 = "Qonversion read time: "
    //     0xaf2b54: add             x16, PP, #0x17, lsl #12  ; [pp+0x17ef0] "Qonversion read time: "
    //     0xaf2b58: ldr             x16, [x16, #0xef0]
    // 0xaf2b5c: StoreField: r0->field_f = r16
    //     0xaf2b5c: stur            w16, [x0, #0xf]
    // 0xaf2b60: ldur            x1, [fp, #-0x18]
    // 0xaf2b64: r0 = call 0x7f7d2c
    //     0xaf2b64: bl              #0x7f7d2c
    // 0xaf2b68: mov             x2, x0
    // 0xaf2b6c: r0 = BoxInt64Instr(r2)
    //     0xaf2b6c: sbfiz           x0, x2, #1, #0x1f
    //     0xaf2b70: cmp             x2, x0, asr #1
    //     0xaf2b74: b.eq            #0xaf2b80
    //     0xaf2b78: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xaf2b7c: stur            x2, [x0, #7]
    // 0xaf2b80: ldur            x1, [fp, #-0x28]
    // 0xaf2b84: ArrayStore: r1[1] = r0  ; List_4
    //     0xaf2b84: add             x25, x1, #0x13
    //     0xaf2b88: str             w0, [x25]
    //     0xaf2b8c: tbz             w0, #0, #0xaf2ba8
    //     0xaf2b90: ldurb           w16, [x1, #-1]
    //     0xaf2b94: ldurb           w17, [x0, #-1]
    //     0xaf2b98: and             x16, x17, x16, lsr #2
    //     0xaf2b9c: tst             x16, HEAP, lsr #32
    //     0xaf2ba0: b.eq            #0xaf2ba8
    //     0xaf2ba4: bl              #0xb27e20  ; ArrayWriteBarrierStub
    // 0xaf2ba8: ldur            x0, [fp, #-0x28]
    // 0xaf2bac: r16 = "ms"
    //     0xaf2bac: add             x16, PP, #0x17, lsl #12  ; [pp+0x17b80] "ms"
    //     0xaf2bb0: ldr             x16, [x16, #0xb80]
    // 0xaf2bb4: ArrayStore: r0[0] = r16  ; List_4
    //     0xaf2bb4: stur            w16, [x0, #0x17]
    // 0xaf2bb8: str             x0, [SP]
    // 0xaf2bbc: r0 = _interpolate()
    //     0xaf2bbc: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xaf2bc0: ldur            x1, [fp, #-0x20]
    // 0xaf2bc4: mov             x2, x0
    // 0xaf2bc8: r0 = call 0x33fc94
    //     0xaf2bc8: bl              #0x33fc94
    // 0xaf2bcc: r4 = const [0, 0, 0, 0, null]
    //     0xaf2bcc: add             x4, PP, #9, lsl #12  ; [pp+0x9ca0] List(5) [0, 0, 0, 0, Null]
    //     0xaf2bd0: ldr             x4, [x4, #0xca0]
    // 0xaf2bd4: r0 = call 0x34043c
    //     0xaf2bd4: bl              #0x34043c
    // 0xaf2bd8: mov             x2, x0
    // 0xaf2bdc: r1 = Null
    //     0xaf2bdc: mov             x1, NULL
    // 0xaf2be0: r0 = call 0x3442b8
    //     0xaf2be0: bl              #0x3442b8
    // 0xaf2be4: r1 = Null
    //     0xaf2be4: mov             x1, NULL
    // 0xaf2be8: r2 = 8
    //     0xaf2be8: movz            x2, #0x8
    // 0xaf2bec: stur            x0, [fp, #-0x20]
    // 0xaf2bf0: r0 = AllocateArray()
    //     0xaf2bf0: bl              #0xb29b38  ; AllocateArrayStub
    // 0xaf2bf4: stur            x0, [fp, #-0x28]
    // 0xaf2bf8: r16 = "source"
    //     0xaf2bf8: ldr             x16, [PP, #0x5168]  ; [pp+0x5168] "source"
    // 0xaf2bfc: StoreField: r0->field_f = r16
    //     0xaf2bfc: stur            w16, [x0, #0xf]
    // 0xaf2c00: r16 = "qonversion"
    //     0xaf2c00: add             x16, PP, #0x17, lsl #12  ; [pp+0x17bc8] "qonversion"
    //     0xaf2c04: ldr             x16, [x16, #0xbc8]
    // 0xaf2c08: StoreField: r0->field_13 = r16
    //     0xaf2c08: stur            w16, [x0, #0x13]
    // 0xaf2c0c: r16 = "value"
    //     0xaf2c0c: ldr             x16, [PP, #0x4420]  ; [pp+0x4420] "value"
    // 0xaf2c10: ArrayStore: r0[0] = r16  ; List_4
    //     0xaf2c10: stur            w16, [x0, #0x17]
    // 0xaf2c14: ldur            x1, [fp, #-0x18]
    // 0xaf2c18: r0 = call 0x7f7d2c
    //     0xaf2c18: bl              #0x7f7d2c
    // 0xaf2c1c: mov             x2, x0
    // 0xaf2c20: r0 = BoxInt64Instr(r2)
    //     0xaf2c20: sbfiz           x0, x2, #1, #0x1f
    //     0xaf2c24: cmp             x2, x0, asr #1
    //     0xaf2c28: b.eq            #0xaf2c34
    //     0xaf2c2c: bl              #0xb29dc0  ; AllocateMintSharedWithoutFPURegsStub
    //     0xaf2c30: stur            x2, [x0, #7]
    // 0xaf2c34: ldur            x1, [fp, #-0x28]
    // 0xaf2c38: ArrayStore: r1[3] = r0  ; List_4
    //     0xaf2c38: add             x25, x1, #0x1b
    //     0xaf2c3c: str             w0, [x25]
    //     0xaf2c40: tbz             w0, #0, #0xaf2c5c
    //     0xaf2c44: ldurb           w16, [x1, #-1]
    //     0xaf2c48: ldurb           w17, [x0, #-1]
    //     0xaf2c4c: and             x16, x17, x16, lsr #2
    //     0xaf2c50: tst             x16, HEAP, lsr #32
    //     0xaf2c54: b.eq            #0xaf2c5c
    //     0xaf2c58: bl              #0xb27e20  ; ArrayWriteBarrierStub
    // 0xaf2c5c: r16 = <String, Object>
    //     0xaf2c5c: add             x16, PP, #9, lsl #12  ; [pp+0x9f20] TypeArguments: <String, Object>
    //     0xaf2c60: ldr             x16, [x16, #0xf20]
    // 0xaf2c64: ldur            lr, [fp, #-0x28]
    // 0xaf2c68: stp             lr, x16, [SP]
    // 0xaf2c6c: r0 = Map._fromLiteral()
    //     0xaf2c6c: bl              #0x2fd170  ; [dart:core] Map::Map._fromLiteral
    // 0xaf2c70: str             x0, [SP]
    // 0xaf2c74: ldur            x1, [fp, #-0x20]
    // 0xaf2c78: r2 = "subscription_read_time"
    //     0xaf2c78: add             x2, PP, #0x17, lsl #12  ; [pp+0x17c08] "subscription_read_time"
    //     0xaf2c7c: ldr             x2, [x2, #0xc08]
    // 0xaf2c80: r4 = const [0, 0x3, 0x1, 0x2, wfc, 0x2, null]
    //     0xaf2c80: add             x4, PP, #0x14, lsl #12  ; [pp+0x14e50] List(7) [0, 0x3, 0x1, 0x2, "wfc", 0x2, Null]
    //     0xaf2c84: ldr             x4, [x4, #0xe50]
    // 0xaf2c88: r0 = __unknown_function__()
    //     0xaf2c88: bl              #0xa786f0  ; [] ::__unknown_function__
    // 0xaf2c8c: ldur            x2, [fp, #-0x10]
    // 0xaf2c90: r1 = Function '<anonymous closure>':.
    //     0xaf2c90: add             x1, PP, #0x17, lsl #12  ; [pp+0x17ef8] AnonymousClosure: (0x7f7bbc), in [IUk] dkb::<anonymous closure> (0xaf2a74)
    //     0xaf2c94: ldr             x1, [x1, #0xef8]
    // 0xaf2c98: stur            x0, [fp, #-0x10]
    // 0xaf2c9c: r0 = AllocateClosure()
    //     0xaf2c9c: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xaf2ca0: ldur            x1, [fp, #-0x10]
    // 0xaf2ca4: mov             x2, x0
    // 0xaf2ca8: r4 = const [0, 0x2, 0, 0x2, null]
    //     0xaf2ca8: ldr             x4, [PP, #0x78]  ; [pp+0x78] List(5) [0, 0x2, 0, 0x2, Null]
    // 0xaf2cac: r0 = call 0x9eb7e8
    //     0xaf2cac: bl              #0x9eb7e8
    // 0xaf2cb0: r0 = Null
    //     0xaf2cb0: mov             x0, NULL
    // 0xaf2cb4: r0 = ReturnAsyncNotFuture()
    //     0xaf2cb4: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xaf2cb8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaf2cb8: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaf2cbc: b               #0xaf2aa8
  }
  [closure] void RFh(dynamic, UC?) {
    // ** addr: 0x7f745c, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x7f7b34, size: -0x1
  }
  [closure] ckb <anonymous closure>(dynamic, Lx<Map<String, dynamic>>, Kx?) {
    // ** addr: 0x7f775c, size: -0x1
  }
  [closure] Map<String, dynamic> <anonymous closure>(dynamic, ckb, Hy?) {
    // ** addr: 0x7f772c, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x7f7bbc, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, Vbb) {
    // ** addr: 0x62c2d8, size: -0x1
  }
}
