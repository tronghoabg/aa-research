// lib: , url: package:wyn/main.dart

// class id: 1050451, size: 0x8
class :: {

  static Future<void> main() async {
    // ** addr: 0xb2c4b4, size: 0x330
    // 0xb2c4b4: EnterFrame
    //     0xb2c4b4: stp             fp, lr, [SP, #-0x10]!
    //     0xb2c4b8: mov             fp, SP
    // 0xb2c4bc: AllocStack(0x40)
    //     0xb2c4bc: sub             SP, SP, #0x40
    // 0xb2c4c0: SetupParameters()
    //     0xb2c4c0: stur            NULL, [fp, #-8]
    // 0xb2c4c4: CheckStackOverflow
    //     0xb2c4c4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb2c4c8: cmp             SP, x16
    //     0xb2c4cc: b.ls            #0xb2c7dc
    // 0xb2c4d0: InitAsync() -> Future<void?>
    //     0xb2c4d0: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xb2c4d4: bl              #0xa75e10  ; InitAsyncStub
    // 0xb2c4d8: r1 = "AppMain"
    //     0xb2c4d8: add             x1, PP, #9, lsl #12  ; [pp+0x9c80] "AppMain"
    //     0xb2c4dc: ldr             x1, [x1, #0xc80]
    // 0xb2c4e0: r0 = call 0x342748
    //     0xb2c4e0: bl              #0x342748
    // 0xb2c4e4: stur            x0, [fp, #-0x10]
    // 0xb2c4e8: r0 = call 0x712894
    //     0xb2c4e8: bl              #0x712894
    // 0xb2c4ec: mov             x1, x0
    // 0xb2c4f0: r0 = call 0xa69060
    //     0xb2c4f0: bl              #0xa69060
    // 0xb2c4f4: ldur            x1, [fp, #-0x10]
    // 0xb2c4f8: r2 = "Wyn started! Loading configs..."
    //     0xb2c4f8: add             x2, PP, #9, lsl #12  ; [pp+0x9c88] "Wyn started! Loading configs..."
    //     0xb2c4fc: ldr             x2, [x2, #0xc88]
    // 0xb2c500: r0 = call 0x345770
    //     0xb2c500: bl              #0x345770
    // 0xb2c504: r0 = Qjb()
    //     0xb2c504: bl              #0xb2e61c  ; AllocateQjbStub -> Qjb (size=0x34)
    // 0xb2c508: mov             x1, x0
    // 0xb2c50c: stur            x0, [fp, #-0x18]
    // 0xb2c510: r0 = call 0xa68fa8
    //     0xb2c510: bl              #0xa68fa8
    // 0xb2c514: r1 = 1
    //     0xb2c514: movz            x1, #0x1
    // 0xb2c518: r0 = AllocateContext()
    //     0xb2c518: bl              #0xb28aa8  ; AllocateContextStub
    // 0xb2c51c: ldur            x1, [fp, #-0x18]
    // 0xb2c520: stur            x0, [fp, #-0x20]
    // 0xb2c524: StoreField: r0->field_f = r1
    //     0xb2c524: stur            w1, [x0, #0xf]
    // 0xb2c528: r0 = __unknown_function__()
    //     0xb2c528: bl              #0xb2e5b4  ; [] ::__unknown_function__
    // 0xb2c52c: mov             x1, x0
    // 0xb2c530: stur            x1, [fp, #-0x18]
    // 0xb2c534: r0 = Await()
    //     0xb2c534: bl              #0xa75a20  ; AwaitStub
    // 0xb2c538: r0 = InitLateStaticField(0x1454) // [nUk] ::eSg
    //     0xb2c538: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xb2c53c: ldr             x0, [x0, #0x28a8]
    //     0xb2c540: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xb2c544: cmp             w0, w16
    //     0xb2c548: b.ne            #0xb2c558
    //     0xb2c54c: add             x2, PP, #9, lsl #12  ; [pp+0x9c90] Field <::.eSg>: static late final (offset: 0x1454)
    //     0xb2c550: ldr             x2, [x2, #0xc90]
    //     0xb2c554: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xb2c558: ldur            x2, [fp, #-0x20]
    // 0xb2c55c: LoadField: r1 = r2->field_f
    //     0xb2c55c: ldur            w1, [x2, #0xf]
    // 0xb2c560: DecompressPointer r1
    //     0xb2c560: add             x1, x1, HEAP, lsl #32
    // 0xb2c564: r16 = <Qjb>
    //     0xb2c564: add             x16, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xb2c568: ldr             x16, [x16, #0xc98]
    // 0xb2c56c: stp             x0, x16, [SP, #8]
    // 0xb2c570: str             x1, [SP]
    // 0xb2c574: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0xb2c574: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0xb2c578: r0 = call 0x7dd9cc
    //     0xb2c578: bl              #0x7dd9cc
    // 0xb2c57c: r0 = __unknown_function__()
    //     0xb2c57c: bl              #0xb2db64  ; [] ::__unknown_function__
    // 0xb2c580: mov             x1, x0
    // 0xb2c584: stur            x1, [fp, #-0x18]
    // 0xb2c588: r0 = Await()
    //     0xb2c588: bl              #0xa75a20  ; AwaitStub
    // 0xb2c58c: r0 = call 0xa68c3c
    //     0xb2c58c: bl              #0xa68c3c
    // 0xb2c590: mov             x1, x0
    // 0xb2c594: r0 = call 0xa68bf8
    //     0xb2c594: bl              #0xa68bf8
    // 0xb2c598: mov             x1, x0
    // 0xb2c59c: stur            x1, [fp, #-0x18]
    // 0xb2c5a0: r0 = Await()
    //     0xb2c5a0: bl              #0xa75a20  ; AwaitStub
    // 0xb2c5a4: r4 = const [0, 0, 0, 0, null]
    //     0xb2c5a4: add             x4, PP, #9, lsl #12  ; [pp+0x9ca0] List(5) [0, 0, 0, 0, Null]
    //     0xb2c5a8: ldr             x4, [x4, #0xca0]
    // 0xb2c5ac: r0 = call 0x34043c
    //     0xb2c5ac: bl              #0x34043c
    // 0xb2c5b0: mov             x2, x0
    // 0xb2c5b4: r1 = Null
    //     0xb2c5b4: mov             x1, NULL
    // 0xb2c5b8: r0 = call 0x5f9fe8
    //     0xb2c5b8: bl              #0x5f9fe8
    // 0xb2c5bc: mov             x1, x0
    // 0xb2c5c0: r2 = "rev-px.wynauto.com"
    //     0xb2c5c0: add             x2, PP, #9, lsl #12  ; [pp+0x9ca8] "rev-px.wynauto.com"
    //     0xb2c5c4: ldr             x2, [x2, #0xca8]
    // 0xb2c5c8: r0 = call 0xa68bbc
    //     0xb2c5c8: bl              #0xa68bbc
    // 0xb2c5cc: r1 = Function '<anonymous closure>': static.
    //     0xb2c5cc: add             x1, PP, #9, lsl #12  ; [pp+0x9cb0] AnonymousClosure: static (0xa6935c), in [package:wyn/main.dart] ::main (0xb2c4b4)
    //     0xb2c5d0: ldr             x1, [x1, #0xcb0]
    // 0xb2c5d4: r2 = Null
    //     0xb2c5d4: mov             x2, NULL
    // 0xb2c5d8: r0 = AllocateClosure()
    //     0xb2c5d8: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb2c5dc: StoreStaticField(0x64c, r0)
    //     0xb2c5dc: ldr             x1, [THR, #0x68]  ; THR::field_table_values
    //     0xb2c5e0: str             x0, [x1, #0xc98]
    // 0xb2c5e4: r0 = InitLateStaticField(0x5d0) // [dart:ui] lt::_Fyc
    //     0xb2c5e4: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xb2c5e8: ldr             x0, [x0, #0xba0]
    //     0xb2c5ec: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xb2c5f0: cmp             w0, w16
    //     0xb2c5f4: b.ne            #0xb2c600
    //     0xb2c5f8: ldr             x2, [PP, #0x2310]  ; [pp+0x2310] Field <lt._Fyc@17065589>: static late final (offset: 0x5d0)
    //     0xb2c5fc: bl              #0xb27cbc  ; InitLateFinalStaticFieldStub
    // 0xb2c600: r1 = Function '<anonymous closure>': static.
    //     0xb2c600: add             x1, PP, #9, lsl #12  ; [pp+0x9cb8] AnonymousClosure: static (0xa69314), in [package:wyn/main.dart] ::main (0xb2c4b4)
    //     0xb2c604: ldr             x1, [x1, #0xcb8]
    // 0xb2c608: r2 = Null
    //     0xb2c608: mov             x2, NULL
    // 0xb2c60c: stur            x0, [fp, #-0x18]
    // 0xb2c610: r0 = AllocateClosure()
    //     0xb2c610: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb2c614: ldur            x1, [fp, #-0x18]
    // 0xb2c618: mov             x2, x0
    // 0xb2c61c: r0 = call 0xa68b2c
    //     0xb2c61c: bl              #0xa68b2c
    // 0xb2c620: ldur            x2, [fp, #-0x20]
    // 0xb2c624: LoadField: r1 = r2->field_f
    //     0xb2c624: ldur            w1, [x2, #0xf]
    // 0xb2c628: DecompressPointer r1
    //     0xb2c628: add             x1, x1, HEAP, lsl #32
    // 0xb2c62c: r0 = call 0xa68ac8
    //     0xb2c62c: bl              #0xa68ac8
    // 0xb2c630: tbnz            w0, #4, #0xb2c650
    // 0xb2c634: r4 = const [0, 0, 0, 0, null]
    //     0xb2c634: add             x4, PP, #9, lsl #12  ; [pp+0x9ca0] List(5) [0, 0, 0, 0, Null]
    //     0xb2c638: ldr             x4, [x4, #0xca0]
    // 0xb2c63c: r0 = call 0x34043c
    //     0xb2c63c: bl              #0x34043c
    // 0xb2c640: mov             x1, x0
    // 0xb2c644: r0 = call 0x73cff4
    //     0xb2c644: bl              #0x73cff4
    // 0xb2c648: mov             x1, x0
    // 0xb2c64c: r0 = call 0xa68a40
    //     0xb2c64c: bl              #0xa68a40
    // 0xb2c650: r0 = __unknown_function__()
    //     0xb2c650: bl              #0xaf4a98  ; [] ::__unknown_function__
    // 0xb2c654: mov             x1, x0
    // 0xb2c658: stur            x1, [fp, #-0x18]
    // 0xb2c65c: r0 = Await()
    //     0xb2c65c: bl              #0xa75a20  ; AwaitStub
    // 0xb2c660: r16 = true
    //     0xb2c660: add             x16, NULL, #0x20  ; true
    // 0xb2c664: cmp             w0, w16
    // 0xb2c668: b.ne            #0xb2c680
    // 0xb2c66c: r0 = call 0xa68a04
    //     0xb2c66c: bl              #0xa68a04
    // 0xb2c670: mov             x1, x0
    // 0xb2c674: r2 = Instance_Iy
    //     0xb2c674: add             x2, PP, #9, lsl #12  ; [pp+0x9cc0] Obj!Iy@568d01
    //     0xb2c678: ldr             x2, [x2, #0xcc0]
    // 0xb2c67c: r0 = call 0xa68840
    //     0xb2c67c: bl              #0xa68840
    // 0xb2c680: ldur            x0, [fp, #-0x20]
    // 0xb2c684: ldur            x1, [fp, #-0x10]
    // 0xb2c688: r2 = "Loading remote configs..."
    //     0xb2c688: add             x2, PP, #9, lsl #12  ; [pp+0x9cc8] "Loading remote configs..."
    //     0xb2c68c: ldr             x2, [x2, #0xcc8]
    // 0xb2c690: r0 = call 0x345770
    //     0xb2c690: bl              #0x345770
    // 0xb2c694: ldur            x2, [fp, #-0x20]
    // 0xb2c698: LoadField: r1 = r2->field_f
    //     0xb2c698: ldur            w1, [x2, #0xf]
    // 0xb2c69c: DecompressPointer r1
    //     0xb2c69c: add             x1, x1, HEAP, lsl #32
    // 0xb2c6a0: r0 = __unknown_function__()
    //     0xb2c6a0: bl              #0xb2cabc  ; [] ::__unknown_function__
    // 0xb2c6a4: r1 = Function '<anonymous closure>': static.
    //     0xb2c6a4: add             x1, PP, #9, lsl #12  ; [pp+0x9cd0] AnonymousClosure: static (0xb2e69c), in [package:wyn/main.dart] ::main (0xb2c4b4)
    //     0xb2c6a8: ldr             x1, [x1, #0xcd0]
    // 0xb2c6ac: r2 = Null
    //     0xb2c6ac: mov             x2, NULL
    // 0xb2c6b0: stur            x0, [fp, #-0x10]
    // 0xb2c6b4: r0 = AllocateClosure()
    //     0xb2c6b4: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb2c6b8: str             x0, [SP]
    // 0xb2c6bc: ClosureCall
    //     0xb2c6bc: ldr             x4, [PP, #0xe40]  ; [pp+0xe40] List(5) [0, 0x1, 0x1, 0x1, Null]
    //     0xb2c6c0: ldur            x2, [x0, #0x1f]
    //     0xb2c6c4: blr             x2
    // 0xb2c6c8: r1 = Null
    //     0xb2c6c8: mov             x1, NULL
    // 0xb2c6cc: r2 = 4
    //     0xb2c6cc: movz            x2, #0x4
    // 0xb2c6d0: stur            x0, [fp, #-0x18]
    // 0xb2c6d4: r0 = AllocateArray()
    //     0xb2c6d4: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2c6d8: mov             x2, x0
    // 0xb2c6dc: ldur            x0, [fp, #-0x10]
    // 0xb2c6e0: stur            x2, [fp, #-0x28]
    // 0xb2c6e4: StoreField: r2->field_f = r0
    //     0xb2c6e4: stur            w0, [x2, #0xf]
    // 0xb2c6e8: ldur            x0, [fp, #-0x18]
    // 0xb2c6ec: StoreField: r2->field_13 = r0
    //     0xb2c6ec: stur            w0, [x2, #0x13]
    // 0xb2c6f0: r1 = <Future<Qjb?>>
    //     0xb2c6f0: add             x1, PP, #9, lsl #12  ; [pp+0x9cd8] TypeArguments: <Future<Qjb?>>
    //     0xb2c6f4: ldr             x1, [x1, #0xcd8]
    // 0xb2c6f8: r0 = AllocateGrowableArray()
    //     0xb2c6f8: bl              #0xb28a6c  ; AllocateGrowableArrayStub
    // 0xb2c6fc: mov             x1, x0
    // 0xb2c700: ldur            x0, [fp, #-0x28]
    // 0xb2c704: StoreField: r1->field_f = r0
    //     0xb2c704: stur            w0, [x1, #0xf]
    // 0xb2c708: r0 = 4
    //     0xb2c708: movz            x0, #0x4
    // 0xb2c70c: StoreField: r1->field_b = r0
    //     0xb2c70c: stur            w0, [x1, #0xb]
    // 0xb2c710: r16 = <Qjb?>
    //     0xb2c710: add             x16, PP, #9, lsl #12  ; [pp+0x9ce0] TypeArguments: <Qjb?>
    //     0xb2c714: ldr             x16, [x16, #0xce0]
    // 0xb2c718: stp             x1, x16, [SP]
    // 0xb2c71c: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0xb2c71c: ldr             x4, [PP, #0x148]  ; [pp+0x148] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0xb2c720: r0 = __unknown_function__()
    //     0xb2c720: bl              #0xa77d5c  ; [] ::__unknown_function__
    // 0xb2c724: mov             x1, x0
    // 0xb2c728: stur            x1, [fp, #-0x10]
    // 0xb2c72c: r0 = Await()
    //     0xb2c72c: bl              #0xa75a20  ; AwaitStub
    // 0xb2c730: r0 = call 0xa67c00
    //     0xb2c730: bl              #0xa67c00
    // 0xb2c734: r1 = Function '<anonymous closure>': static.
    //     0xb2c734: add             x1, PP, #9, lsl #12  ; [pp+0x9ce8] AnonymousClosure: static (0xa69098), in [package:wyn/main.dart] ::main (0xb2c4b4)
    //     0xb2c738: ldr             x1, [x1, #0xce8]
    // 0xb2c73c: r2 = Null
    //     0xb2c73c: mov             x2, NULL
    // 0xb2c740: r0 = AllocateClosure()
    //     0xb2c740: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb2c744: r1 = <Qjb>
    //     0xb2c744: add             x1, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xb2c748: ldr             x1, [x1, #0xc98]
    // 0xb2c74c: stur            x0, [fp, #-0x10]
    // 0xb2c750: r0 = ubb()
    //     0xb2c750: bl              #0xb2c2d4  ; AllocateubbStub -> ubb<X0> (size=0x18)
    // 0xb2c754: mov             x3, x0
    // 0xb2c758: ldur            x0, [fp, #-0x10]
    // 0xb2c75c: stur            x3, [fp, #-0x18]
    // 0xb2c760: StoreField: r3->field_13 = r0
    //     0xb2c760: stur            w0, [x3, #0x13]
    // 0xb2c764: ldur            x2, [fp, #-0x20]
    // 0xb2c768: r1 = Function '<anonymous closure>': static.
    //     0xb2c768: add             x1, PP, #9, lsl #12  ; [pp+0x9cf0] AnonymousClosure: static (0x3a1944), in [package:wyn/main.dart] ::overlayMain (0xa66a7c)
    //     0xb2c76c: ldr             x1, [x1, #0xcf0]
    // 0xb2c770: r0 = AllocateClosure()
    //     0xb2c770: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xb2c774: r1 = <Qjb>
    //     0xb2c774: add             x1, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xb2c778: ldr             x1, [x1, #0xc98]
    // 0xb2c77c: stur            x0, [fp, #-0x10]
    // 0xb2c780: r0 = _Hbb()
    //     0xb2c780: bl              #0xad8064  ; Allocate_HbbStub -> _Hbb<X0> (size=0x20)
    // 0xb2c784: mov             x2, x0
    // 0xb2c788: ldur            x0, [fp, #-0x10]
    // 0xb2c78c: stur            x2, [fp, #-0x20]
    // 0xb2c790: StoreField: r2->field_b = r0
    //     0xb2c790: stur            w0, [x2, #0xb]
    // 0xb2c794: r0 = Closure: (Bbb<SE?>, SE?) => () => void from Function '_Tkh@1646289466': static.
    //     0xb2c794: ldr             x0, [PP, #0x2b18]  ; [pp+0x2b18] Closure: (Bbb<SE?>, SE?) => () => void from Function '_Tkh@1646289466': static. (0x77683a7f2e94)
    // 0xb2c798: ArrayStore: r2[0] = r0  ; List_4
    //     0xb2c798: stur            w0, [x2, #0x17]
    // 0xb2c79c: r0 = Closure: (aqa, mJ?) => void from Function '_Uhc@1645228938': static.
    //     0xb2c79c: ldr             x0, [PP, #0x2b20]  ; [pp+0x2b20] Closure: (aqa, mJ?) => void from Function '_Uhc@1645228938': static. (0x77683a641660)
    // 0xb2c7a0: StoreField: r2->field_1b = r0
    //     0xb2c7a0: stur            w0, [x2, #0x1b]
    // 0xb2c7a4: r1 = <Qjb>
    //     0xb2c7a4: add             x1, PP, #9, lsl #12  ; [pp+0x9c98] TypeArguments: <Qjb>
    //     0xb2c7a8: ldr             x1, [x1, #0xc98]
    // 0xb2c7ac: r0 = sbb()
    //     0xb2c7ac: bl              #0xad8058  ; AllocatesbbStub -> sbb<X0 bound mJ?> (size=0x20)
    // 0xb2c7b0: mov             x2, x0
    // 0xb2c7b4: ldur            x0, [fp, #-0x20]
    // 0xb2c7b8: stur            x2, [fp, #-0x10]
    // 0xb2c7bc: StoreField: r2->field_13 = r0
    //     0xb2c7bc: stur            w0, [x2, #0x13]
    // 0xb2c7c0: ldur            x0, [fp, #-0x18]
    // 0xb2c7c4: StoreField: r2->field_b = r0
    //     0xb2c7c4: stur            w0, [x2, #0xb]
    // 0xb2c7c8: mov             x1, x2
    // 0xb2c7cc: r0 = _NativeScene._()
    //     0xb2c7cc: bl              #0xa5c8e8  ; [dart:ui] _NativeScene::_NativeScene._
    // 0xb2c7d0: ldur            x1, [fp, #-0x10]
    // 0xb2c7d4: r0 = call 0xa66b5c
    //     0xb2c7d4: bl              #0xa66b5c
    // 0xb2c7d8: r0 = ReturnAsync()
    //     0xb2c7d8: b               #0xa6b994  ; ReturnAsyncStub
    // 0xb2c7dc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb2c7dc: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb2c7e0: b               #0xb2c4d0
  }
  static void overlayMain() {
    // ** addr: 0xa66a7c, size: -0x1
  }
  [closure] static Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0xb2e69c, size: 0x6c
    // 0xb2e69c: EnterFrame
    //     0xb2e69c: stp             fp, lr, [SP, #-0x10]!
    //     0xb2e6a0: mov             fp, SP
    // 0xb2e6a4: AllocStack(0x18)
    //     0xb2e6a4: sub             SP, SP, #0x18
    // 0xb2e6a8: SetupParameters(dynamic _ /* r1 */)
    //     0xb2e6a8: stur            NULL, [fp, #-8]
    //     0xb2e6ac: movz            x0, #0
    //     0xb2e6b0: add             x1, fp, w0, sxtw #2
    //     0xb2e6b4: ldr             x1, [x1, #0x10]
    //     0xb2e6b8: ldur            w2, [x1, #0x17]
    //     0xb2e6bc: add             x2, x2, HEAP, lsl #32
    //     0xb2e6c0: stur            x2, [fp, #-0x10]
    // 0xb2e6c4: CheckStackOverflow
    //     0xb2e6c4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb2e6c8: cmp             SP, x16
    //     0xb2e6cc: b.ls            #0xb2e700
    // 0xb2e6d0: InitAsync() -> Future<Null?>
    //     0xb2e6d0: ldr             x0, [PP, #0x13b0]  ; [pp+0x13b0] TypeArguments: <Null?>
    //     0xb2e6d4: bl              #0xa75e10  ; InitAsyncStub
    // 0xb2e6d8: r0 = __unknown_function__()
    //     0xb2e6d8: bl              #0xb2e708  ; [] ::__unknown_function__
    // 0xb2e6dc: mov             x1, x0
    // 0xb2e6e0: stur            x1, [fp, #-0x18]
    // 0xb2e6e4: r0 = Await()
    //     0xb2e6e4: bl              #0xa75a20  ; AwaitStub
    // 0xb2e6e8: r0 = __unknown_function__()
    //     0xb2e6e8: bl              #0xad4e64  ; [] ::__unknown_function__
    // 0xb2e6ec: mov             x1, x0
    // 0xb2e6f0: stur            x1, [fp, #-0x18]
    // 0xb2e6f4: r0 = Await()
    //     0xb2e6f4: bl              #0xa75a20  ; AwaitStub
    // 0xb2e6f8: r0 = Null
    //     0xb2e6f8: mov             x0, NULL
    // 0xb2e6fc: r0 = ReturnAsyncNotFuture()
    //     0xb2e6fc: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xb2e700: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb2e700: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb2e704: b               #0xb2e6d0
  }
  [closure] static void <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0xa67b88, size: -0x1
  }
  [closure] static NN <anonymous closure>(dynamic, aqa, dmb, tW?) {
    // ** addr: 0xa677d4, size: -0x1
  }
  [closure] static dmb <anonymous closure>(dynamic, aqa) {
    // ** addr: 0x3a1944, size: -0x1
  }
  [closure] static Sra <anonymous closure>(dynamic, aqa, tW?) {
    // ** addr: 0xa678d4, size: -0x1
  }
  [closure] static void <anonymous closure>(dynamic, WI) {
    // ** addr: 0xa6935c, size: -0x1
  }
  [closure] static bool <anonymous closure>(dynamic, Object, Ia) {
    // ** addr: 0xa69314, size: -0x1
  }
  [closure] static NN <anonymous closure>(dynamic, aqa, Qjb, tW?) {
    // ** addr: 0xa69098, size: -0x1
  }
}
