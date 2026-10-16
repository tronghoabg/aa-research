// lib: , url: pFk

// class id: 1049614, size: 0x8
class :: {
}

// class id: 1650, size: 0x14, field offset: 0x8
//   transformed mixin,
abstract class _gCa extends eCa
     with hCa {
}

// class id: 1652, size: 0x20, field offset: 0x14
class fCa extends _gCa {

  [closure] Future<void> <anonymous closure>(dynamic, Fdb, int, int) async {
    // ** addr: 0xb10198, size: 0x208
    // 0xb10198: EnterFrame
    //     0xb10198: stp             fp, lr, [SP, #-0x10]!
    //     0xb1019c: mov             fp, SP
    // 0xb101a0: AllocStack(0xc0)
    //     0xb101a0: sub             SP, SP, #0xc0
    // 0xb101a4: SetupParameters(fCa this /* r1 */, dynamic _ /* r2, fp-0x88 */, dynamic _ /* r3, fp-0x80 */)
    //     0xb101a4: stur            NULL, [fp, #-8]
    //     0xb101a8: movz            x0, #0
    //     0xb101ac: add             x1, fp, w0, sxtw #2
    //     0xb101b0: ldr             x1, [x1, #0x28]
    //     0xb101b4: add             x2, fp, w0, sxtw #2
    //     0xb101b8: ldr             x2, [x2, #0x20]
    //     0xb101bc: stur            x2, [fp, #-0x88]
    //     0xb101c0: add             x3, fp, w0, sxtw #2
    //     0xb101c4: ldr             x3, [x3, #0x18]
    //     0xb101c8: stur            x3, [fp, #-0x80]
    //     0xb101cc: ldur            w4, [x1, #0x17]
    //     0xb101d0: add             x4, x4, HEAP, lsl #32
    //     0xb101d4: stur            x4, [fp, #-0x78]
    // 0xb101d8: CheckStackOverflow
    //     0xb101d8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb101dc: cmp             SP, x16
    //     0xb101e0: b.ls            #0xb10398
    // 0xb101e4: InitAsync() -> Future<void?>
    //     0xb101e4: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xb101e8: bl              #0xa75e10  ; InitAsyncStub
    // 0xb101ec: ldur            x0, [fp, #-0x80]
    // 0xb101f0: r3 = LoadInt32Instr(r0)
    //     0xb101f0: sbfx            x3, x0, #1, #0x1f
    //     0xb101f4: tbz             w0, #0, #0xb101fc
    //     0xb101f8: ldur            x3, [x0, #7]
    // 0xb101fc: stur            x3, [fp, #-0x90]
    // 0xb10200: cmp             x3, #1
    // 0xb10204: b.gt            #0xb102d4
    // 0xb10208: ldur            x1, [fp, #-0x88]
    // 0xb1020c: r2 = "            alter table cacheObject\n            add key text;\n            "
    //     0xb1020c: add             x2, PP, #0x43, lsl #12  ; [pp+0x43c68] "            alter table cacheObject\n            add key text;\n            "
    //     0xb10210: ldr             x2, [x2, #0xc68]
    // 0xb10214: r0 = call 0x7df9b8
    //     0xb10214: bl              #0x7df9b8
    // 0xb10218: mov             x1, x0
    // 0xb1021c: stur            x1, [fp, #-0x98]
    // 0xb10220: r0 = Await()
    //     0xb10220: bl              #0xa75a20  ; AwaitStub
    // 0xb10224: r4 = false
    //     0xb10224: add             x4, NULL, #0x30  ; false
    // 0xb10228: r3 = Null
    //     0xb10228: mov             x3, NULL
    // 0xb1022c: r0 = Null
    //     0xb1022c: mov             x0, NULL
    // 0xb10230: b               #0xb1027c
    // 0xb10234: sub             SP, fp, #0xc0
    // 0xb10238: mov             x3, x0
    // 0xb1023c: stur            x0, [fp, #-0x98]
    // 0xb10240: mov             x0, x1
    // 0xb10244: stur            x1, [fp, #-0xa0]
    // 0xb10248: r1 = 60
    //     0xb10248: movz            x1, #0x3c
    // 0xb1024c: branchIfSmi(r3, 0xb10258)
    //     0xb1024c: tbz             w3, #0, #0xb10258
    // 0xb10250: r1 = LoadClassIdInstr(r3)
    //     0xb10250: ldur            x1, [x3, #-1]
    //     0xb10254: ubfx            x1, x1, #0xc, #0x14
    // 0xb10258: cmp             x1, #0x1f3
    // 0xb1025c: b.ne            #0xb10368
    // 0xb10260: mov             x1, x3
    // 0xb10264: r2 = "key"
    //     0xb10264: ldr             x2, [PP, #0x18d0]  ; [pp+0x18d0] "key"
    // 0xb10268: r0 = call 0x98d1c8
    //     0xb10268: bl              #0x98d1c8
    // 0xb1026c: tbnz            w0, #4, #0xb10358
    // 0xb10270: ldur            x3, [fp, #-0x98]
    // 0xb10274: ldur            x0, [fp, #-0xa0]
    // 0xb10278: r4 = true
    //     0xb10278: add             x4, NULL, #0x20  ; true
    // 0xb1027c: ldur            x1, [fp, #-0x88]
    // 0xb10280: stur            x4, [fp, #-0xa8]
    // 0xb10284: stur            x3, [fp, #-0xb0]
    // 0xb10288: stur            x0, [fp, #-0xb8]
    // 0xb1028c: r2 = "          update cacheObject\n            set key = url\n            where key is null;\n          "
    //     0xb1028c: add             x2, PP, #0x43, lsl #12  ; [pp+0x43c70] "          update cacheObject\n            set key = url\n            where key is null;\n          "
    //     0xb10290: ldr             x2, [x2, #0xc70]
    // 0xb10294: r0 = call 0x7df9b8
    //     0xb10294: bl              #0x7df9b8
    // 0xb10298: mov             x1, x0
    // 0xb1029c: stur            x1, [fp, #-0xc0]
    // 0xb102a0: r0 = Await()
    //     0xb102a0: bl              #0xa75a20  ; AwaitStub
    // 0xb102a4: ldur            x0, [fp, #-0xa8]
    // 0xb102a8: tbz             w0, #4, #0xb102c8
    // 0xb102ac: ldur            x1, [fp, #-0x88]
    // 0xb102b0: r2 = "            create index cacheObjectkey\n              on cacheObject (key);\n            "
    //     0xb102b0: add             x2, PP, #0x43, lsl #12  ; [pp+0x43c78] "            create index cacheObjectkey\n              on cacheObject (key);\n            "
    //     0xb102b4: ldr             x2, [x2, #0xc78]
    // 0xb102b8: r0 = call 0x7df9b8
    //     0xb102b8: bl              #0x7df9b8
    // 0xb102bc: mov             x1, x0
    // 0xb102c0: stur            x1, [fp, #-0xa8]
    // 0xb102c4: r0 = Await()
    //     0xb102c4: bl              #0xa75a20  ; AwaitStub
    // 0xb102c8: ldur            x4, [fp, #-0xb8]
    // 0xb102cc: ldur            x3, [fp, #-0xb0]
    // 0xb102d0: b               #0xb102dc
    // 0xb102d4: r4 = Null
    //     0xb102d4: mov             x4, NULL
    // 0xb102d8: r3 = Null
    //     0xb102d8: mov             x3, NULL
    // 0xb102dc: ldur            x0, [fp, #-0x90]
    // 0xb102e0: stur            x4, [fp, #-0x80]
    // 0xb102e4: stur            x3, [fp, #-0xa8]
    // 0xb102e8: cmp             x0, #2
    // 0xb102ec: b.gt            #0xb10350
    // 0xb102f0: ldur            x1, [fp, #-0x88]
    // 0xb102f4: r2 = "        alter table cacheObject\n        add length integer;\n        "
    //     0xb102f4: add             x2, PP, #0x43, lsl #12  ; [pp+0x43c80] "        alter table cacheObject\n        add length integer;\n        "
    //     0xb102f8: ldr             x2, [x2, #0xc80]
    // 0xb102fc: r0 = call 0x7df9b8
    //     0xb102fc: bl              #0x7df9b8
    // 0xb10300: mov             x1, x0
    // 0xb10304: stur            x1, [fp, #-0xb0]
    // 0xb10308: r0 = Await()
    //     0xb10308: bl              #0xa75a20  ; AwaitStub
    // 0xb1030c: b               #0xb10350
    // 0xb10310: sub             SP, fp, #0xc0
    // 0xb10314: mov             x3, x0
    // 0xb10318: stur            x0, [fp, #-0x78]
    // 0xb1031c: mov             x0, x1
    // 0xb10320: stur            x1, [fp, #-0x80]
    // 0xb10324: r1 = 60
    //     0xb10324: movz            x1, #0x3c
    // 0xb10328: branchIfSmi(r3, 0xb10334)
    //     0xb10328: tbz             w3, #0, #0xb10334
    // 0xb1032c: r1 = LoadClassIdInstr(r3)
    //     0xb1032c: ldur            x1, [x3, #-1]
    //     0xb10330: ubfx            x1, x1, #0xc, #0x14
    // 0xb10334: cmp             x1, #0x1f3
    // 0xb10338: b.ne            #0xb10388
    // 0xb1033c: mov             x1, x3
    // 0xb10340: r2 = "length"
    //     0xb10340: add             x2, PP, #0x38, lsl #12  ; [pp+0x38db8] "length"
    //     0xb10344: ldr             x2, [x2, #0xdb8]
    // 0xb10348: r0 = call 0x98d1c8
    //     0xb10348: bl              #0x98d1c8
    // 0xb1034c: tbnz            w0, #4, #0xb10378
    // 0xb10350: r0 = Null
    //     0xb10350: mov             x0, NULL
    // 0xb10354: r0 = ReturnAsyncNotFuture()
    //     0xb10354: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xb10358: ldur            x0, [fp, #-0x98]
    // 0xb1035c: ldur            x1, [fp, #-0xa0]
    // 0xb10360: r0 = ReThrow()
    //     0xb10360: bl              #0xb27dd0  ; ReThrowStub
    // 0xb10364: brk             #0
    // 0xb10368: ldur            x0, [fp, #-0x98]
    // 0xb1036c: ldur            x1, [fp, #-0xa0]
    // 0xb10370: r0 = ReThrow()
    //     0xb10370: bl              #0xb27dd0  ; ReThrowStub
    // 0xb10374: brk             #0
    // 0xb10378: ldur            x0, [fp, #-0x78]
    // 0xb1037c: ldur            x1, [fp, #-0x80]
    // 0xb10380: r0 = ReThrow()
    //     0xb10380: bl              #0xb27dd0  ; ReThrowStub
    // 0xb10384: brk             #0
    // 0xb10388: ldur            x0, [fp, #-0x78]
    // 0xb1038c: ldur            x1, [fp, #-0x80]
    // 0xb10390: r0 = ReThrow()
    //     0xb10390: bl              #0xb27dd0  ; ReThrowStub
    // 0xb10394: brk             #0
    // 0xb10398: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb10398: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb1039c: b               #0xb101e4
  }
  [closure] Future<void> <anonymous closure>(dynamic, Fdb, int) async {
    // ** addr: 0xb103a0, size: 0x74
    // 0xb103a0: EnterFrame
    //     0xb103a0: stp             fp, lr, [SP, #-0x10]!
    //     0xb103a4: mov             fp, SP
    // 0xb103a8: AllocStack(0x18)
    //     0xb103a8: sub             SP, SP, #0x18
    // 0xb103ac: SetupParameters(fCa this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0xb103ac: stur            NULL, [fp, #-8]
    //     0xb103b0: movz            x0, #0
    //     0xb103b4: add             x1, fp, w0, sxtw #2
    //     0xb103b8: ldr             x1, [x1, #0x20]
    //     0xb103bc: add             x2, fp, w0, sxtw #2
    //     0xb103c0: ldr             x2, [x2, #0x18]
    //     0xb103c4: stur            x2, [fp, #-0x18]
    //     0xb103c8: ldur            w3, [x1, #0x17]
    //     0xb103cc: add             x3, x3, HEAP, lsl #32
    //     0xb103d0: stur            x3, [fp, #-0x10]
    // 0xb103d4: CheckStackOverflow
    //     0xb103d4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb103d8: cmp             SP, x16
    //     0xb103dc: b.ls            #0xb1040c
    // 0xb103e0: InitAsync() -> Future<void?>
    //     0xb103e0: ldr             x0, [PP, #0x10b0]  ; [pp+0x10b0] TypeArguments: <void?>
    //     0xb103e4: bl              #0xa75e10  ; InitAsyncStub
    // 0xb103e8: ldur            x1, [fp, #-0x18]
    // 0xb103ec: r2 = "      create table cacheObject (\n        _id integer primary key,\n        url text,\n        key text,\n        relativePath text,\n        eTag text,\n        validTill integer,\n        touched integer,\n        length integer\n        );\n        create unique index cacheObjectkey\n        ON cacheObject (key);\n      "
    //     0xb103ec: add             x2, PP, #0x43, lsl #12  ; [pp+0x43c90] "      create table cacheObject (\n        _id integer primary key,\n        url text,\n        key text,\n        relativePath text,\n        eTag text,\n        validTill integer,\n        touched integer,\n        length integer\n        );\n        create unique index cacheObjectkey\n        ON cacheObject (key);\n      "
    //     0xb103f0: ldr             x2, [x2, #0xc90]
    // 0xb103f4: r0 = call 0x7df9b8
    //     0xb103f4: bl              #0x7df9b8
    // 0xb103f8: mov             x1, x0
    // 0xb103fc: stur            x1, [fp, #-0x18]
    // 0xb10400: r0 = Await()
    //     0xb10400: bl              #0xa75a20  ; AwaitStub
    // 0xb10404: r0 = Null
    //     0xb10404: mov             x0, NULL
    // 0xb10408: r0 = ReturnAsyncNotFuture()
    //     0xb10408: b               #0xa75de4  ; ReturnAsyncNotFutureStub
    // 0xb1040c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb1040c: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb10410: b               #0xb103e0
  }
}
