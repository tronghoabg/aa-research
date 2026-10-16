// lib: , url: DGk

// class id: 1049692, size: 0x8
class :: {

  [closure] static Stream<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0xaebdf8, size: 0x428
    // 0xaebdf8: EnterFrame
    //     0xaebdf8: stp             fp, lr, [SP, #-0x10]!
    //     0xaebdfc: mov             fp, SP
    // 0xaebe00: AllocStack(0xc0)
    //     0xaebe00: sub             SP, SP, #0xc0
    // 0xaebe04: SetupParameters(dynamic _ /* r0 */)
    //     0xaebe04: stur            NULL, [fp, #-8]
    //     0xaebe08: movz            x1, #0
    //     0xaebe0c: add             x0, fp, w1, sxtw #2
    //     0xaebe10: ldr             x0, [x0, #0x10]
    //     0xaebe14: ldur            w2, [x0, #0x17]
    //     0xaebe18: add             x2, x2, HEAP, lsl #32
    //     0xaebe1c: stur            x2, [fp, #-0x88]
    // 0xaebe20: CheckStackOverflow
    //     0xaebe20: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaebe24: cmp             SP, x16
    //     0xaebe28: b.ls            #0xaec210
    // 0xaebe2c: LoadField: r3 = r0->field_b
    //     0xaebe2c: ldur            w3, [x0, #0xb]
    // 0xaebe30: DecompressPointer r3
    //     0xaebe30: add             x3, x3, HEAP, lsl #32
    // 0xaebe34: mov             x0, x3
    // 0xaebe38: stur            x3, [fp, #-0x80]
    // 0xaebe3c: r0 = InitAsync()
    //     0xaebe3c: bl              #0xac651c  ; InitAsyncStub
    // 0xaebe40: r0 = Null
    //     0xaebe40: mov             x0, NULL
    // 0xaebe44: r0 = YieldAsyncStar()
    //     0xaebe44: bl              #0xac6394  ; YieldAsyncStarStub
    // 0xaebe48: ldur            x0, [fp, #-0x88]
    // 0xaebe4c: LoadField: r2 = r0->field_13
    //     0xaebe4c: ldur            w2, [x0, #0x13]
    // 0xaebe50: DecompressPointer r2
    //     0xaebe50: add             x2, x2, HEAP, lsl #32
    // 0xaebe54: stur            x2, [fp, #-0x80]
    // 0xaebe58: r1 = Null
    //     0xaebe58: mov             x1, NULL
    // 0xaebe5c: r0 = _StreamIterator()
    //     0xaebe5c: bl              #0xa9a5c0  ; Allocate_StreamIteratorStub -> _StreamIterator<X0> (size=0x18)
    // 0xaebe60: mov             x2, x0
    // 0xaebe64: r0 = false
    //     0xaebe64: add             x0, NULL, #0x30  ; false
    // 0xaebe68: stur            x2, [fp, #-0x98]
    // 0xaebe6c: StoreField: r2->field_13 = r0
    //     0xaebe6c: stur            w0, [x2, #0x13]
    // 0xaebe70: ldur            x3, [fp, #-0x80]
    // 0xaebe74: StoreField: r2->field_f = r3
    //     0xaebe74: stur            w3, [x2, #0xf]
    // 0xaebe78: ldur            x4, [fp, #-0x88]
    // 0xaebe7c: CheckStackOverflow
    //     0xaebe7c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xaebe80: cmp             SP, x16
    //     0xaebe84: b.ls            #0xaec218
    // 0xaebe88: LoadField: r5 = r2->field_b
    //     0xaebe88: ldur            w5, [x2, #0xb]
    // 0xaebe8c: DecompressPointer r5
    //     0xaebe8c: add             x5, x5, HEAP, lsl #32
    // 0xaebe90: stur            x5, [fp, #-0x90]
    // 0xaebe94: cmp             w5, NULL
    // 0xaebe98: b.eq            #0xaebf28
    // 0xaebe9c: LoadField: r1 = r2->field_13
    //     0xaebe9c: ldur            w1, [x2, #0x13]
    // 0xaebea0: DecompressPointer r1
    //     0xaebea0: add             x1, x1, HEAP, lsl #32
    // 0xaebea4: tbnz            w1, #4, #0xaec15c
    // 0xaebea8: r1 = <bool>
    //     0xaebea8: ldr             x1, [PP, #0x2e80]  ; [pp+0x2e80] TypeArguments: <bool>
    // 0xaebeac: r0 = _Future()
    //     0xaebeac: bl              #0xa6f740  ; Allocate_FutureStub -> _Future<X0> (size=0x1c)
    // 0xaebeb0: stur            x0, [fp, #-0xa0]
    // 0xaebeb4: StoreField: r0->field_b = rZR
    //     0xaebeb4: stur            xzr, [x0, #0xb]
    // 0xaebeb8: r0 = InitLateStaticField(0x3d0) // [dart:async] T::_current
    //     0xaebeb8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xaebebc: ldr             x0, [x0, #0x7a0]
    //     0xaebec0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xaebec4: cmp             w0, w16
    //     0xaebec8: b.ne            #0xaebed4
    //     0xaebecc: ldr             x2, [PP, #0x10b8]  ; [pp+0x10b8] Field <T._current@5048458>: static late (offset: 0x3d0)
    //     0xaebed0: bl              #0xb27d24  ; InitLateStaticFieldStub
    // 0xaebed4: ldur            x2, [fp, #-0xa0]
    // 0xaebed8: StoreField: r2->field_13 = r0
    //     0xaebed8: stur            w0, [x2, #0x13]
    // 0xaebedc: mov             x0, x2
    // 0xaebee0: ldur            x3, [fp, #-0x98]
    // 0xaebee4: StoreField: r3->field_f = r0
    //     0xaebee4: stur            w0, [x3, #0xf]
    //     0xaebee8: ldurb           w16, [x3, #-1]
    //     0xaebeec: ldurb           w17, [x0, #-1]
    //     0xaebef0: and             x16, x17, x16, lsr #2
    //     0xaebef4: tst             x16, HEAP, lsr #32
    //     0xaebef8: b.eq            #0xaebf00
    //     0xaebefc: bl              #0xb282a4  ; WriteBarrierWrappersStub
    // 0xaebf00: r4 = false
    //     0xaebf00: add             x4, NULL, #0x30  ; false
    // 0xaebf04: StoreField: r3->field_13 = r4
    //     0xaebf04: stur            w4, [x3, #0x13]
    // 0xaebf08: ldur            x1, [fp, #-0x90]
    // 0xaebf0c: r0 = LoadClassIdInstr(r1)
    //     0xaebf0c: ldur            x0, [x1, #-1]
    //     0xaebf10: ubfx            x0, x0, #0xc, #0x14
    // 0xaebf14: r0 = GDT[cid_x0 + -0x3f]()
    //     0xaebf14: sub             lr, x0, #0x3f
    //     0xaebf18: ldr             lr, [x21, lr, lsl #3]
    //     0xaebf1c: blr             lr
    // 0xaebf20: ldur            x1, [fp, #-0xa0]
    // 0xaebf24: b               #0xaebf34
    // 0xaebf28: ldur            x1, [fp, #-0x98]
    // 0xaebf2c: r0 = call 0x60a330
    //     0xaebf2c: bl              #0x60a330
    // 0xaebf30: mov             x1, x0
    // 0xaebf34: mov             x0, x1
    // 0xaebf38: stur            x1, [fp, #-0x90]
    // 0xaebf3c: r0 = Await()
    //     0xaebf3c: bl              #0xa75a20  ; AwaitStub
    // 0xaebf40: r16 = true
    //     0xaebf40: add             x16, NULL, #0x20  ; true
    // 0xaebf44: cmp             w0, w16
    // 0xaebf48: b.ne            #0xaec124
    // 0xaebf4c: ldur            x3, [fp, #-0x98]
    // 0xaebf50: LoadField: r0 = r3->field_13
    //     0xaebf50: ldur            w0, [x3, #0x13]
    // 0xaebf54: DecompressPointer r0
    //     0xaebf54: add             x0, x0, HEAP, lsl #32
    // 0xaebf58: tbnz            w0, #4, #0xaebf6c
    // 0xaebf5c: LoadField: r0 = r3->field_f
    //     0xaebf5c: ldur            w0, [x3, #0xf]
    // 0xaebf60: DecompressPointer r0
    //     0xaebf60: add             x0, x0, HEAP, lsl #32
    // 0xaebf64: mov             x4, x0
    // 0xaebf68: b               #0xaebf70
    // 0xaebf6c: r4 = Null
    //     0xaebf6c: mov             x4, NULL
    // 0xaebf70: stur            x4, [fp, #-0xa8]
    // 0xaebf74: ldur            x5, [fp, #-0x88]
    // 0xaebf78: r6 = 0
    //     0xaebf78: movz            x6, #0
    // 0xaebf7c: add             x0, fp, w6, sxtw #2
    // 0xaebf80: LoadField: r0 = r0->field_fffffff8
    //     0xaebf80: ldur            x0, [x0, #-8]
    // 0xaebf84: ArrayLoad: r7 = r0[0]  ; List_4
    //     0xaebf84: ldur            w7, [x0, #0x17]
    // 0xaebf88: DecompressPointer r7
    //     0xaebf88: add             x7, x7, HEAP, lsl #32
    // 0xaebf8c: stur            x7, [fp, #-0xa0]
    // 0xaebf90: LoadField: r8 = r5->field_f
    //     0xaebf90: ldur            w8, [x5, #0xf]
    // 0xaebf94: DecompressPointer r8
    //     0xaebf94: add             x8, x8, HEAP, lsl #32
    // 0xaebf98: mov             x0, x4
    // 0xaebf9c: stur            x8, [fp, #-0x90]
    // 0xaebfa0: r2 = Null
    //     0xaebfa0: mov             x2, NULL
    // 0xaebfa4: r1 = Null
    //     0xaebfa4: mov             x1, NULL
    // 0xaebfa8: r4 = 60
    //     0xaebfa8: movz            x4, #0x3c
    // 0xaebfac: branchIfSmi(r0, 0xaebfb8)
    //     0xaebfac: tbz             w0, #0, #0xaebfb8
    // 0xaebfb0: r4 = LoadClassIdInstr(r0)
    //     0xaebfb0: ldur            x4, [x0, #-1]
    //     0xaebfb4: ubfx            x4, x4, #0xc, #0x14
    // 0xaebfb8: sub             x4, x4, #0x5a
    // 0xaebfbc: cmp             x4, #2
    // 0xaebfc0: b.ls            #0xaebfd4
    // 0xaebfc4: r8 = List
    //     0xaebfc4: ldr             x8, [PP, #0x3d10]  ; [pp+0x3d10] Type: List
    // 0xaebfc8: r3 = Null
    //     0xaebfc8: add             x3, PP, #0x17, lsl #12  ; [pp+0x17710] Null
    //     0xaebfcc: ldr             x3, [x3, #0x710]
    // 0xaebfd0: r0 = List()
    //     0xaebfd0: bl              #0xb307c4  ; IsType_List_Stub
    // 0xaebfd4: ldur            x0, [fp, #-0x90]
    // 0xaebfd8: LoadField: r2 = r0->field_7
    //     0xaebfd8: ldur            w2, [x0, #7]
    // 0xaebfdc: DecompressPointer r2
    //     0xaebfdc: add             x2, x2, HEAP, lsl #32
    // 0xaebfe0: mov             x1, x2
    // 0xaebfe4: stur            x2, [fp, #-0xb0]
    // 0xaebfe8: r0 = _pKa()
    //     0xaebfe8: bl              #0xaeb788  ; Allocate_pKaStub -> _pKa<X0, X1> (size=0x14)
    // 0xaebfec: mov             x1, x0
    // 0xaebff0: ldur            x0, [fp, #-0x90]
    // 0xaebff4: stur            x1, [fp, #-0xb0]
    // 0xaebff8: StoreField: r1->field_b = r0
    //     0xaebff8: stur            w0, [x1, #0xb]
    // 0xaebffc: ldur            x2, [fp, #-0xa8]
    // 0xaec000: StoreField: r1->field_f = r2
    //     0xaec000: stur            w2, [x1, #0xf]
    // 0xaec004: r0 = LoadClassIdInstr(r2)
    //     0xaec004: ldur            x0, [x2, #-1]
    //     0xaec008: ubfx            x0, x0, #0xc, #0x14
    // 0xaec00c: stp             xzr, x2, [SP]
    // 0xaec010: r0 = GDT[cid_x0 + -0x1f6]()
    //     0xaec010: sub             lr, x0, #0x1f6
    //     0xaec014: ldr             lr, [x21, lr, lsl #3]
    //     0xaec018: blr             lr
    // 0xaec01c: mov             x3, x0
    // 0xaec020: r2 = Null
    //     0xaec020: mov             x2, NULL
    // 0xaec024: r1 = Null
    //     0xaec024: mov             x1, NULL
    // 0xaec028: stur            x3, [fp, #-0x90]
    // 0xaec02c: branchIfSmi(r0, 0xaec054)
    //     0xaec02c: tbz             w0, #0, #0xaec054
    // 0xaec030: r4 = LoadClassIdInstr(r0)
    //     0xaec030: ldur            x4, [x0, #-1]
    //     0xaec034: ubfx            x4, x4, #0xc, #0x14
    // 0xaec038: sub             x4, x4, #0x3c
    // 0xaec03c: cmp             x4, #1
    // 0xaec040: b.ls            #0xaec054
    // 0xaec044: r8 = int
    //     0xaec044: ldr             x8, [PP, #0xd20]  ; [pp+0xd20] Type: int
    // 0xaec048: r3 = Null
    //     0xaec048: add             x3, PP, #0x17, lsl #12  ; [pp+0x17720] Null
    //     0xaec04c: ldr             x3, [x3, #0x720]
    // 0xaec050: r0 = int()
    //     0xaec050: bl              #0xb2fba8  ; IsType_int_Stub
    // 0xaec054: ldur            x1, [fp, #-0xb0]
    // 0xaec058: ldur            x2, [fp, #-0x90]
    // 0xaec05c: r0 = call 0x7e1e38
    //     0xaec05c: bl              #0x7e1e38
    // 0xaec060: ldur            x16, [fp, #-0xa0]
    // 0xaec064: stp             x0, x16, [SP]
    // 0xaec068: r0 = add()
    //     0xaec068: bl              #0x70fafc  ; [dart:async] _AsyncStarStreamController::add
    // 0xaec06c: tbz             w0, #4, #0xaec094
    // 0xaec070: r0 = Null
    //     0xaec070: mov             x0, NULL
    // 0xaec074: r0 = YieldAsyncStar()
    //     0xaec074: bl              #0xac6394  ; YieldAsyncStarStub
    // 0xaec078: r16 = true
    //     0xaec078: add             x16, NULL, #0x20  ; true
    // 0xaec07c: cmp             w0, w16
    // 0xaec080: b.eq            #0xaec094
    // 0xaec084: ldur            x3, [fp, #-0x80]
    // 0xaec088: ldur            x2, [fp, #-0x98]
    // 0xaec08c: r0 = false
    //     0xaec08c: add             x0, NULL, #0x30  ; false
    // 0xaec090: b               #0xaebe78
    // 0xaec094: ldur            x0, [fp, #-0x98]
    // 0xaec098: LoadField: r1 = r0->field_b
    //     0xaec098: ldur            w1, [x0, #0xb]
    // 0xaec09c: DecompressPointer r1
    //     0xaec09c: add             x1, x1, HEAP, lsl #32
    // 0xaec0a0: cmp             w1, NULL
    // 0xaec0a4: b.eq            #0xaec0bc
    // 0xaec0a8: mov             x1, x0
    // 0xaec0ac: r0 = call 0x609ea4
    //     0xaec0ac: bl              #0x609ea4
    // 0xaec0b0: mov             x1, x0
    // 0xaec0b4: stur            x1, [fp, #-0x90]
    // 0xaec0b8: r0 = Await()
    //     0xaec0b8: bl              #0xa75a20  ; AwaitStub
    // 0xaec0bc: ldur            x1, [fp, #-0x80]
    // 0xaec0c0: r0 = call 0x614cf4
    //     0xaec0c0: bl              #0x614cf4
    // 0xaec0c4: r0 = Null
    //     0xaec0c4: mov             x0, NULL
    // 0xaec0c8: r0 = ReturnAsyncStar()
    //     0xaec0c8: b               #0xac62ec  ; ReturnAsyncStarStub
    // 0xaec0cc: sub             SP, fp, #0xc0
    // 0xaec0d0: mov             x2, x0
    // 0xaec0d4: stur            x0, [fp, #-0x90]
    // 0xaec0d8: mov             x0, x1
    // 0xaec0dc: stur            x1, [fp, #-0xa0]
    // 0xaec0e0: r1 = 60
    //     0xaec0e0: movz            x1, #0x3c
    // 0xaec0e4: branchIfSmi(r2, 0xaec0f0)
    //     0xaec0e4: tbz             w2, #0, #0xaec0f0
    // 0xaec0e8: r1 = LoadClassIdInstr(r2)
    //     0xaec0e8: ldur            x1, [x2, #-1]
    //     0xaec0ec: ubfx            x1, x1, #0xc, #0x14
    // 0xaec0f0: cmp             x1, #0x4ea
    // 0xaec0f4: b.ne            #0xaec180
    // 0xaec0f8: ldur            x3, [fp, #-0x98]
    // 0xaec0fc: LoadField: r1 = r3->field_b
    //     0xaec0fc: ldur            w1, [x3, #0xb]
    // 0xaec100: DecompressPointer r1
    //     0xaec100: add             x1, x1, HEAP, lsl #32
    // 0xaec104: cmp             w1, NULL
    // 0xaec108: b.eq            #0xaec14c
    // 0xaec10c: mov             x1, x3
    // 0xaec110: r0 = call 0x609ea4
    //     0xaec110: bl              #0x609ea4
    // 0xaec114: mov             x1, x0
    // 0xaec118: stur            x1, [fp, #-0xa8]
    // 0xaec11c: r0 = Await()
    //     0xaec11c: bl              #0xa75a20  ; AwaitStub
    // 0xaec120: b               #0xaec14c
    // 0xaec124: ldur            x0, [fp, #-0x98]
    // 0xaec128: LoadField: r1 = r0->field_b
    //     0xaec128: ldur            w1, [x0, #0xb]
    // 0xaec12c: DecompressPointer r1
    //     0xaec12c: add             x1, x1, HEAP, lsl #32
    // 0xaec130: cmp             w1, NULL
    // 0xaec134: b.eq            #0xaec14c
    // 0xaec138: mov             x1, x0
    // 0xaec13c: r0 = call 0x609ea4
    //     0xaec13c: bl              #0x609ea4
    // 0xaec140: mov             x1, x0
    // 0xaec144: stur            x1, [fp, #-0xa8]
    // 0xaec148: r0 = Await()
    //     0xaec148: bl              #0xa75a20  ; AwaitStub
    // 0xaec14c: ldur            x1, [fp, #-0x80]
    // 0xaec150: r0 = call 0x614cf4
    //     0xaec150: bl              #0x614cf4
    // 0xaec154: r0 = Null
    //     0xaec154: mov             x0, NULL
    // 0xaec158: r0 = ReturnAsyncStar()
    //     0xaec158: b               #0xac62ec  ; ReturnAsyncStarStub
    // 0xaec15c: r0 = StateError()
    //     0xaec15c: bl              #0xa6b1f4  ; AllocateStateErrorStub -> StateError (size=0x10)
    // 0xaec160: mov             x1, x0
    // 0xaec164: r0 = "Already waiting for next."
    //     0xaec164: add             x0, PP, #0x12, lsl #12  ; [pp+0x12e58] "Already waiting for next."
    //     0xaec168: ldr             x0, [x0, #0xe58]
    // 0xaec16c: stur            x1, [fp, #-0x80]
    // 0xaec170: StoreField: r1->field_b = r0
    //     0xaec170: stur            w0, [x1, #0xb]
    // 0xaec174: mov             x0, x1
    // 0xaec178: r0 = Throw()
    //     0xaec178: bl              #0xb27dfc  ; ThrowStub
    // 0xaec17c: brk             #0
    // 0xaec180: ldur            x0, [fp, #-0x90]
    // 0xaec184: ldur            x1, [fp, #-0xa0]
    // 0xaec188: r0 = ReThrow()
    //     0xaec188: bl              #0xb27dd0  ; ReThrowStub
    // 0xaec18c: brk             #0
    // 0xaec190: sub             SP, fp, #0xc0
    // 0xaec194: ldur            x2, [fp, #-0x98]
    // 0xaec198: mov             x3, x0
    // 0xaec19c: stur            x0, [fp, #-0x80]
    // 0xaec1a0: mov             x0, x1
    // 0xaec1a4: stur            x1, [fp, #-0x90]
    // 0xaec1a8: LoadField: r1 = r2->field_b
    //     0xaec1a8: ldur            w1, [x2, #0xb]
    // 0xaec1ac: DecompressPointer r1
    //     0xaec1ac: add             x1, x1, HEAP, lsl #32
    // 0xaec1b0: cmp             w1, NULL
    // 0xaec1b4: b.eq            #0xaec1cc
    // 0xaec1b8: mov             x1, x2
    // 0xaec1bc: r0 = call 0x609ea4
    //     0xaec1bc: bl              #0x609ea4
    // 0xaec1c0: mov             x1, x0
    // 0xaec1c4: stur            x1, [fp, #-0xa0]
    // 0xaec1c8: r0 = Await()
    //     0xaec1c8: bl              #0xa75a20  ; AwaitStub
    // 0xaec1cc: ldur            x0, [fp, #-0x80]
    // 0xaec1d0: ldur            x1, [fp, #-0x90]
    // 0xaec1d4: r0 = ReThrow()
    //     0xaec1d4: bl              #0xb27dd0  ; ReThrowStub
    // 0xaec1d8: brk             #0
    // 0xaec1dc: sub             SP, fp, #0xc0
    // 0xaec1e0: ldur            x2, [fp, #-0x88]
    // 0xaec1e4: mov             x3, x0
    // 0xaec1e8: stur            x0, [fp, #-0x80]
    // 0xaec1ec: mov             x0, x1
    // 0xaec1f0: stur            x1, [fp, #-0x90]
    // 0xaec1f4: LoadField: r1 = r2->field_13
    //     0xaec1f4: ldur            w1, [x2, #0x13]
    // 0xaec1f8: DecompressPointer r1
    //     0xaec1f8: add             x1, x1, HEAP, lsl #32
    // 0xaec1fc: r0 = call 0x614cf4
    //     0xaec1fc: bl              #0x614cf4
    // 0xaec200: ldur            x0, [fp, #-0x80]
    // 0xaec204: ldur            x1, [fp, #-0x90]
    // 0xaec208: r0 = ReThrow()
    //     0xaec208: bl              #0xb27dd0  ; ReThrowStub
    // 0xaec20c: brk             #0
    // 0xaec210: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaec210: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaec214: b               #0xaebe2c
    // 0xaec218: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xaec218: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xaec21c: b               #0xaebe88
  }
}

// class id: 1222, size: 0x14, field offset: 0x8
//   const constructor, 
class _fLa<X0> extends Object {
}

// class id: 1223, size: 0x10, field offset: 0x8
class eLa<X0> extends Object {
}
