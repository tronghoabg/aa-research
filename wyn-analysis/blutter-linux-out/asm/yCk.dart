// lib: , url: YCk

// class id: 1049493, size: 0x8
class :: {
}

// class id: 1795, size: 0xc, field offset: 0x8
abstract class _ura<X0, X1 bound Zba> extends Object
    implements vda<X0 bound Zba>, wda {
}

// class id: 1796, size: 0xc, field offset: 0xc
abstract class tra<X0, X1 bound Zba> extends _ura<X0, X1 bound Zba> {
}

// class id: 2162, size: 0x58, field offset: 0x54
//   transformed mixin,
abstract class _yra extends _Zea
     with wda {

  [closure] void <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x3d4c18, size: -0x1
  }
}

// class id: 2163, size: 0x5c, field offset: 0x58
//   transformed mixin,
abstract class _xra extends _yra
     with tra<X0, X1 bound Zba> {
}

// class id: 2164, size: 0x5c, field offset: 0x5c
class _wra extends _xra {
}

// class id: 3602, size: 0x5c, field offset: 0x44
class _sra<X0> extends lI {

  late final bqa _vve; // offset: 0x4c

  [closure] void Iuj(dynamic) {
    // ** addr: 0xa88b08, size: 0x560
    // 0xa88b08: EnterFrame
    //     0xa88b08: stp             fp, lr, [SP, #-0x10]!
    //     0xa88b0c: mov             fp, SP
    // 0xa88b10: AllocStack(0xc0)
    //     0xa88b10: sub             SP, SP, #0xc0
    // 0xa88b14: SetupParameters([dynamic _ /* r0 */])
    //     0xa88b14: ldr             x0, [fp, #0x10]
    //     0xa88b18: ldur            w3, [x0, #0x17]
    //     0xa88b1c: add             x3, x3, HEAP, lsl #32
    //     0xa88b20: stur            x3, [fp, #-0x90]
    // 0xa88b24: CheckStackOverflow
    //     0xa88b24: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xa88b28: cmp             SP, x16
    //     0xa88b2c: b.ls            #0xa89050
    // 0xa88b30: LoadField: r4 = r3->field_f
    //     0xa88b30: ldur            w4, [x3, #0xf]
    // 0xa88b34: DecompressPointer r4
    //     0xa88b34: add             x4, x4, HEAP, lsl #32
    // 0xa88b38: stur            x4, [fp, #-0x88]
    // 0xa88b3c: ArrayLoad: r5 = r4[0]  ; List_4
    //     0xa88b3c: ldur            w5, [x4, #0x17]
    // 0xa88b40: DecompressPointer r5
    //     0xa88b40: add             x5, x5, HEAP, lsl #32
    // 0xa88b44: stur            x5, [fp, #-0x80]
    // 0xa88b48: cmp             w5, NULL
    // 0xa88b4c: b.eq            #0xa89058
    // 0xa88b50: LoadField: r6 = r4->field_43
    //     0xa88b50: ldur            w6, [x4, #0x43]
    // 0xa88b54: DecompressPointer r6
    //     0xa88b54: add             x6, x6, HEAP, lsl #32
    // 0xa88b58: mov             x0, x5
    // 0xa88b5c: mov             x2, x6
    // 0xa88b60: stur            x6, [fp, #-0x78]
    // 0xa88b64: r1 = Null
    //     0xa88b64: mov             x1, NULL
    // 0xa88b68: r8 = ora<X0>
    //     0xa88b68: add             x8, PP, #0x31, lsl #12  ; [pp+0x318a0] Type: ora<X0>
    //     0xa88b6c: ldr             x8, [x8, #0x8a0]
    // 0xa88b70: LoadField: r9 = r8->field_7
    //     0xa88b70: ldur            x9, [x8, #7]
    // 0xa88b74: r3 = Null
    //     0xa88b74: add             x3, PP, #0x31, lsl #12  ; [pp+0x318a8] Null
    //     0xa88b78: ldr             x3, [x3, #0x8a8]
    // 0xa88b7c: blr             x9
    // 0xa88b80: ldur            x3, [fp, #-0x90]
    // 0xa88b84: LoadField: r4 = r3->field_13
    //     0xa88b84: ldur            w4, [x3, #0x13]
    // 0xa88b88: DecompressPointer r4
    //     0xa88b88: add             x4, x4, HEAP, lsl #32
    // 0xa88b8c: ldur            x5, [fp, #-0x80]
    // 0xa88b90: stur            x4, [fp, #-0xa0]
    // 0xa88b94: LoadField: r6 = r5->field_f
    //     0xa88b94: ldur            w6, [x5, #0xf]
    // 0xa88b98: DecompressPointer r6
    //     0xa88b98: add             x6, x6, HEAP, lsl #32
    // 0xa88b9c: mov             x0, x6
    // 0xa88ba0: ldur            x2, [fp, #-0x78]
    // 0xa88ba4: stur            x6, [fp, #-0x98]
    // 0xa88ba8: r1 = Null
    //     0xa88ba8: mov             x1, NULL
    // 0xa88bac: r8 = (dynamic this, aqa, X0) => tW
    //     0xa88bac: add             x8, PP, #0x31, lsl #12  ; [pp+0x318b8] FunctionType: (dynamic this, aqa, X0) => tW
    //     0xa88bb0: ldr             x8, [x8, #0x8b8]
    // 0xa88bb4: LoadField: r9 = r8->field_7
    //     0xa88bb4: ldur            x9, [x8, #7]
    // 0xa88bb8: r3 = Null
    //     0xa88bb8: add             x3, PP, #0x31, lsl #12  ; [pp+0x318c0] Null
    //     0xa88bbc: ldr             x3, [x3, #0x8c0]
    // 0xa88bc0: blr             x9
    // 0xa88bc4: ldur            x16, [fp, #-0x98]
    // 0xa88bc8: ldur            lr, [fp, #-0x88]
    // 0xa88bcc: stp             lr, x16, [SP, #8]
    // 0xa88bd0: ldur            x16, [fp, #-0xa0]
    // 0xa88bd4: str             x16, [SP]
    // 0xa88bd8: ldur            x0, [fp, #-0x98]
    // 0xa88bdc: ClosureCall
    //     0xa88bdc: ldr             x4, [PP, #0x1270]  ; [pp+0x1270] List(5) [0, 0x3, 0x3, 0x3, Null]
    //     0xa88be0: ldur            x2, [x0, #0x1f]
    //     0xa88be4: blr             x2
    // 0xa88be8: ldur            x2, [fp, #-0x90]
    // 0xa88bec: LoadField: r1 = r2->field_f
    //     0xa88bec: ldur            w1, [x2, #0xf]
    // 0xa88bf0: DecompressPointer r1
    //     0xa88bf0: add             x1, x1, HEAP, lsl #32
    // 0xa88bf4: ArrayLoad: r3 = r1[0]  ; List_4
    //     0xa88bf4: ldur            w3, [x1, #0x17]
    // 0xa88bf8: DecompressPointer r3
    //     0xa88bf8: add             x3, x3, HEAP, lsl #32
    // 0xa88bfc: cmp             w3, NULL
    // 0xa88c00: b.eq            #0xa8905c
    // 0xa88c04: mov             x4, x0
    // 0xa88c08: r3 = Null
    //     0xa88c08: mov             x3, NULL
    // 0xa88c0c: r0 = Null
    //     0xa88c0c: mov             x0, NULL
    // 0xa88c10: b               #0xa88ce0
    // 0xa88c14: sub             SP, fp, #0xc0
    // 0xa88c18: ldur            x2, [fp, #-0x90]
    // 0xa88c1c: mov             x3, x1
    // 0xa88c20: stur            x0, [fp, #-0x78]
    // 0xa88c24: stur            x1, [fp, #-0x80]
    // 0xa88c28: r0 = InitLateStaticField(0x970) // [sCk] gqa::Hcc
    //     0xa88c28: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xa88c2c: ldr             x0, [x0, #0x12e0]
    //     0xa88c30: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xa88c34: cmp             w0, w16
    //     0xa88c38: b.ne            #0xa88c48
    //     0xa88c3c: add             x2, PP, #0xf, lsl #12  ; [pp+0xfbb8] Field <gqa.Hcc>: static late (offset: 0x970)
    //     0xa88c40: ldr             x2, [x2, #0xbb8]
    //     0xa88c44: bl              #0xb27d24  ; InitLateStaticFieldStub
    // 0xa88c48: r1 = Null
    //     0xa88c48: mov             x1, NULL
    // 0xa88c4c: r2 = 4
    //     0xa88c4c: movz            x2, #0x4
    // 0xa88c50: r0 = AllocateArray()
    //     0xa88c50: bl              #0xb29b38  ; AllocateArrayStub
    // 0xa88c54: r16 = "building "
    //     0xa88c54: add             x16, PP, #0xf, lsl #12  ; [pp+0xfbc0] "building "
    //     0xa88c58: ldr             x16, [x16, #0xbc0]
    // 0xa88c5c: StoreField: r0->field_f = r16
    //     0xa88c5c: stur            w16, [x0, #0xf]
    // 0xa88c60: ldur            x1, [fp, #-0x90]
    // 0xa88c64: LoadField: r2 = r1->field_f
    //     0xa88c64: ldur            w2, [x1, #0xf]
    // 0xa88c68: DecompressPointer r2
    //     0xa88c68: add             x2, x2, HEAP, lsl #32
    // 0xa88c6c: ArrayLoad: r3 = r2[0]  ; List_4
    //     0xa88c6c: ldur            w3, [x2, #0x17]
    // 0xa88c70: DecompressPointer r3
    //     0xa88c70: add             x3, x3, HEAP, lsl #32
    // 0xa88c74: cmp             w3, NULL
    // 0xa88c78: b.eq            #0xa89060
    // 0xa88c7c: StoreField: r0->field_13 = r3
    //     0xa88c7c: stur            w3, [x0, #0x13]
    // 0xa88c80: str             x0, [SP]
    // 0xa88c84: r0 = _interpolate()
    //     0xa88c84: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xa88c88: r1 = <List<Object>>
    //     0xa88c88: ldr             x1, [PP, #0xe50]  ; [pp+0xe50] TypeArguments: <List<Object>>
    // 0xa88c8c: stur            x0, [fp, #-0x88]
    // 0xa88c90: r0 = SI()
    //     0xa88c90: bl              #0xa6bfc8  ; AllocateSIStub -> SI (size=0x2c)
    // 0xa88c94: mov             x1, x0
    // 0xa88c98: ldur            x2, [fp, #-0x88]
    // 0xa88c9c: r3 = Instance_KI
    //     0xa88c9c: ldr             x3, [PP, #0xe58]  ; [pp+0xe58] Obj!KI@5776f1
    // 0xa88ca0: stur            x0, [fp, #-0x88]
    // 0xa88ca4: r0 = call 0x2eecac
    //     0xa88ca4: bl              #0x2eecac
    // 0xa88ca8: r1 = Function '<anonymous closure>':.
    //     0xa88ca8: add             x1, PP, #0x31, lsl #12  ; [pp+0x318d0] AnonymousClosure: (0x3d568c), of [sCk] hqa
    //     0xa88cac: ldr             x1, [x1, #0x8d0]
    // 0xa88cb0: r2 = Null
    //     0xa88cb0: mov             x2, NULL
    // 0xa88cb4: r0 = AllocateClosure()
    //     0xa88cb4: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xa88cb8: ldur            x1, [fp, #-0x88]
    // 0xa88cbc: ldur            x2, [fp, #-0x78]
    // 0xa88cc0: ldur            x3, [fp, #-0x80]
    // 0xa88cc4: mov             x5, x0
    // 0xa88cc8: r0 = call 0x3d5610
    //     0xa88cc8: bl              #0x3d5610
    // 0xa88ccc: mov             x1, x0
    // 0xa88cd0: r0 = call 0x3d55d4
    //     0xa88cd0: bl              #0x3d55d4
    // 0xa88cd4: mov             x4, x0
    // 0xa88cd8: ldur            x3, [fp, #-0x78]
    // 0xa88cdc: ldur            x0, [fp, #-0x80]
    // 0xa88ce0: stur            x4, [fp, #-0x80]
    // 0xa88ce4: stur            x3, [fp, #-0x88]
    // 0xa88ce8: stur            x0, [fp, #-0x98]
    // 0xa88cec: ldur            x5, [fp, #-0x90]
    // 0xa88cf0: LoadField: r6 = r5->field_f
    //     0xa88cf0: ldur            w6, [x5, #0xf]
    // 0xa88cf4: DecompressPointer r6
    //     0xa88cf4: add             x6, x6, HEAP, lsl #32
    // 0xa88cf8: stur            x6, [fp, #-0x78]
    // 0xa88cfc: LoadField: r2 = r6->field_47
    //     0xa88cfc: ldur            w2, [x6, #0x47]
    // 0xa88d00: DecompressPointer r2
    //     0xa88d00: add             x2, x2, HEAP, lsl #32
    // 0xa88d04: stur            x2, [fp, #-0xa0]
    // 0xa88d08: cmp             w4, NULL
    // 0xa88d0c: b.ne            #0xa88d28
    // 0xa88d10: cmp             w2, NULL
    // 0xa88d14: b.eq            #0xa88d20
    // 0xa88d18: mov             x1, x6
    // 0xa88d1c: r0 = call 0x3d5438
    //     0xa88d1c: bl              #0x3d5438
    // 0xa88d20: r0 = Null
    //     0xa88d20: mov             x0, NULL
    // 0xa88d24: b               #0xa88e70
    // 0xa88d28: cmp             w2, NULL
    // 0xa88d2c: b.eq            #0xa88e60
    // 0xa88d30: ldur            x3, [fp, #-0x80]
    // 0xa88d34: r0 = LoadClassIdInstr(r2)
    //     0xa88d34: ldur            x0, [x2, #-1]
    //     0xa88d38: ubfx            x0, x0, #0xc, #0x14
    // 0xa88d3c: mov             x1, x2
    // 0xa88d40: r0 = GDT[cid_x0 + -0xeff]()
    //     0xa88d40: sub             lr, x0, #0xeff
    //     0xa88d44: ldr             lr, [x21, lr, lsl #3]
    //     0xa88d48: blr             lr
    // 0xa88d4c: ldur            x2, [fp, #-0x80]
    // 0xa88d50: cmp             w0, w2
    // 0xa88d54: b.ne            #0xa88da4
    // 0xa88d58: ldur            x1, [fp, #-0xa0]
    // 0xa88d5c: LoadField: r0 = r1->field_f
    //     0xa88d5c: ldur            w0, [x1, #0xf]
    // 0xa88d60: DecompressPointer r0
    //     0xa88d60: add             x0, x0, HEAP, lsl #32
    // 0xa88d64: r3 = 60
    //     0xa88d64: movz            x3, #0x3c
    // 0xa88d68: branchIfSmi(r0, 0xa88d74)
    //     0xa88d68: tbz             w0, #0, #0xa88d74
    // 0xa88d6c: r3 = LoadClassIdInstr(r0)
    //     0xa88d6c: ldur            x3, [x0, #-1]
    //     0xa88d70: ubfx            x3, x3, #0xc, #0x14
    // 0xa88d74: stp             NULL, x0, [SP]
    // 0xa88d78: mov             x0, x3
    // 0xa88d7c: mov             lr, x0
    // 0xa88d80: ldr             lr, [x21, lr, lsl #3]
    // 0xa88d84: blr             lr
    // 0xa88d88: tbz             w0, #4, #0xa88d9c
    // 0xa88d8c: ldur            x1, [fp, #-0x78]
    // 0xa88d90: ldur            x2, [fp, #-0xa0]
    // 0xa88d94: r3 = Null
    //     0xa88d94: mov             x3, NULL
    // 0xa88d98: r0 = call 0x3d51f8
    //     0xa88d98: bl              #0x3d51f8
    // 0xa88d9c: ldur            x0, [fp, #-0xa0]
    // 0xa88da0: b               #0xa88e70
    // 0xa88da4: ldur            x2, [fp, #-0xa0]
    // 0xa88da8: r0 = LoadClassIdInstr(r2)
    //     0xa88da8: ldur            x0, [x2, #-1]
    //     0xa88dac: ubfx            x0, x0, #0xc, #0x14
    // 0xa88db0: mov             x1, x2
    // 0xa88db4: r0 = GDT[cid_x0 + -0xeff]()
    //     0xa88db4: sub             lr, x0, #0xeff
    //     0xa88db8: ldr             lr, [x21, lr, lsl #3]
    //     0xa88dbc: blr             lr
    // 0xa88dc0: mov             x1, x0
    // 0xa88dc4: ldur            x2, [fp, #-0x80]
    // 0xa88dc8: r0 = call 0x3d5180
    //     0xa88dc8: bl              #0x3d5180
    // 0xa88dcc: tbnz            w0, #4, #0xa88e40
    // 0xa88dd0: ldur            x2, [fp, #-0xa0]
    // 0xa88dd4: LoadField: r0 = r2->field_f
    //     0xa88dd4: ldur            w0, [x2, #0xf]
    // 0xa88dd8: DecompressPointer r0
    //     0xa88dd8: add             x0, x0, HEAP, lsl #32
    // 0xa88ddc: r1 = 60
    //     0xa88ddc: movz            x1, #0x3c
    // 0xa88de0: branchIfSmi(r0, 0xa88dec)
    //     0xa88de0: tbz             w0, #0, #0xa88dec
    // 0xa88de4: r1 = LoadClassIdInstr(r0)
    //     0xa88de4: ldur            x1, [x0, #-1]
    //     0xa88de8: ubfx            x1, x1, #0xc, #0x14
    // 0xa88dec: stp             NULL, x0, [SP]
    // 0xa88df0: mov             x0, x1
    // 0xa88df4: mov             lr, x0
    // 0xa88df8: ldr             lr, [x21, lr, lsl #3]
    // 0xa88dfc: blr             lr
    // 0xa88e00: tbz             w0, #4, #0xa88e14
    // 0xa88e04: ldur            x1, [fp, #-0x78]
    // 0xa88e08: ldur            x2, [fp, #-0xa0]
    // 0xa88e0c: r3 = Null
    //     0xa88e0c: mov             x3, NULL
    // 0xa88e10: r0 = call 0x3d51f8
    //     0xa88e10: bl              #0x3d51f8
    // 0xa88e14: ldur            x3, [fp, #-0xa0]
    // 0xa88e18: r0 = LoadClassIdInstr(r3)
    //     0xa88e18: ldur            x0, [x3, #-1]
    //     0xa88e1c: ubfx            x0, x0, #0xc, #0x14
    // 0xa88e20: mov             x1, x3
    // 0xa88e24: ldur            x2, [fp, #-0x80]
    // 0xa88e28: r0 = GDT[cid_x0 + 0x9978]()
    //     0xa88e28: movz            x17, #0x9978
    //     0xa88e2c: add             lr, x0, x17
    //     0xa88e30: ldr             lr, [x21, lr, lsl #3]
    //     0xa88e34: blr             lr
    // 0xa88e38: ldur            x0, [fp, #-0xa0]
    // 0xa88e3c: b               #0xa88e70
    // 0xa88e40: ldur            x1, [fp, #-0x78]
    // 0xa88e44: ldur            x2, [fp, #-0xa0]
    // 0xa88e48: r0 = call 0x3d5438
    //     0xa88e48: bl              #0x3d5438
    // 0xa88e4c: ldur            x1, [fp, #-0x78]
    // 0xa88e50: ldur            x2, [fp, #-0x80]
    // 0xa88e54: r3 = Null
    //     0xa88e54: mov             x3, NULL
    // 0xa88e58: r0 = __unknown_function__()
    //     0xa88e58: bl              #0xa8f654  ; [] ::__unknown_function__
    // 0xa88e5c: b               #0xa88e70
    // 0xa88e60: ldur            x1, [fp, #-0x78]
    // 0xa88e64: ldur            x2, [fp, #-0x80]
    // 0xa88e68: r3 = Null
    //     0xa88e68: mov             x3, NULL
    // 0xa88e6c: r0 = __unknown_function__()
    //     0xa88e6c: bl              #0xa8f654  ; [] ::__unknown_function__
    // 0xa88e70: ldur            x1, [fp, #-0x78]
    // 0xa88e74: StoreField: r1->field_47 = r0
    //     0xa88e74: stur            w0, [x1, #0x47]
    //     0xa88e78: ldurb           w16, [x1, #-1]
    //     0xa88e7c: ldurb           w17, [x0, #-1]
    //     0xa88e80: and             x16, x17, x16, lsr #2
    //     0xa88e84: tst             x16, HEAP, lsr #32
    //     0xa88e88: b.eq            #0xa88e90
    //     0xa88e8c: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xa88e90: b               #0xa88fb4
    // 0xa88e94: sub             SP, fp, #0xc0
    // 0xa88e98: ldur            x2, [fp, #-0x90]
    // 0xa88e9c: mov             x3, x1
    // 0xa88ea0: stur            x0, [fp, #-0x78]
    // 0xa88ea4: stur            x1, [fp, #-0x80]
    // 0xa88ea8: r0 = InitLateStaticField(0x970) // [sCk] gqa::Hcc
    //     0xa88ea8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0xa88eac: ldr             x0, [x0, #0x12e0]
    //     0xa88eb0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0xa88eb4: cmp             w0, w16
    //     0xa88eb8: b.ne            #0xa88ec8
    //     0xa88ebc: add             x2, PP, #0xf, lsl #12  ; [pp+0xfbb8] Field <gqa.Hcc>: static late (offset: 0x970)
    //     0xa88ec0: ldr             x2, [x2, #0xbb8]
    //     0xa88ec4: bl              #0xb27d24  ; InitLateStaticFieldStub
    // 0xa88ec8: r1 = <List<Object>>
    //     0xa88ec8: ldr             x1, [PP, #0xe50]  ; [pp+0xe50] TypeArguments: <List<Object>>
    // 0xa88ecc: r0 = SI()
    //     0xa88ecc: bl              #0xa6bfc8  ; AllocateSIStub -> SI (size=0x2c)
    // 0xa88ed0: r1 = Null
    //     0xa88ed0: mov             x1, NULL
    // 0xa88ed4: r2 = 4
    //     0xa88ed4: movz            x2, #0x4
    // 0xa88ed8: stur            x0, [fp, #-0x88]
    // 0xa88edc: r0 = AllocateArray()
    //     0xa88edc: bl              #0xb29b38  ; AllocateArrayStub
    // 0xa88ee0: r16 = "building "
    //     0xa88ee0: add             x16, PP, #0xf, lsl #12  ; [pp+0xfbc0] "building "
    //     0xa88ee4: ldr             x16, [x16, #0xbc0]
    // 0xa88ee8: StoreField: r0->field_f = r16
    //     0xa88ee8: stur            w16, [x0, #0xf]
    // 0xa88eec: ldur            x1, [fp, #-0x90]
    // 0xa88ef0: LoadField: r2 = r1->field_f
    //     0xa88ef0: ldur            w2, [x1, #0xf]
    // 0xa88ef4: DecompressPointer r2
    //     0xa88ef4: add             x2, x2, HEAP, lsl #32
    // 0xa88ef8: ArrayLoad: r3 = r2[0]  ; List_4
    //     0xa88ef8: ldur            w3, [x2, #0x17]
    // 0xa88efc: DecompressPointer r3
    //     0xa88efc: add             x3, x3, HEAP, lsl #32
    // 0xa88f00: cmp             w3, NULL
    // 0xa88f04: b.eq            #0xa89064
    // 0xa88f08: StoreField: r0->field_13 = r3
    //     0xa88f08: stur            w3, [x0, #0x13]
    // 0xa88f0c: str             x0, [SP]
    // 0xa88f10: r0 = _interpolate()
    //     0xa88f10: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xa88f14: ldur            x1, [fp, #-0x88]
    // 0xa88f18: mov             x2, x0
    // 0xa88f1c: r3 = Instance_KI
    //     0xa88f1c: ldr             x3, [PP, #0xe58]  ; [pp+0xe58] Obj!KI@5776f1
    // 0xa88f20: r0 = call 0x2eecac
    //     0xa88f20: bl              #0x2eecac
    // 0xa88f24: r1 = Function '<anonymous closure>':.
    //     0xa88f24: add             x1, PP, #0x31, lsl #12  ; [pp+0x318d8] AnonymousClosure: (0x3d568c), of [sCk] hqa
    //     0xa88f28: ldr             x1, [x1, #0x8d8]
    // 0xa88f2c: r2 = Null
    //     0xa88f2c: mov             x2, NULL
    // 0xa88f30: r0 = AllocateClosure()
    //     0xa88f30: bl              #0xb28e6c  ; AllocateClosureStub
    // 0xa88f34: ldur            x1, [fp, #-0x88]
    // 0xa88f38: ldur            x2, [fp, #-0x78]
    // 0xa88f3c: ldur            x3, [fp, #-0x80]
    // 0xa88f40: mov             x5, x0
    // 0xa88f44: stur            x0, [fp, #-0x98]
    // 0xa88f48: r0 = call 0x3d5610
    //     0xa88f48: bl              #0x3d5610
    // 0xa88f4c: mov             x1, x0
    // 0xa88f50: r0 = Closure: (WI) => tW from Function '_hse@340042623': static.
    //     0xa88f50: add             x0, PP, #0xf, lsl #12  ; [pp+0xfbd0] Closure: (WI) => tW from Function '_hse@340042623': static. (0x77683a5d76c0)
    //     0xa88f54: ldr             x0, [x0, #0xbd0]
    // 0xa88f58: ArrayLoad: r2 = r0[0]  ; List_4
    //     0xa88f58: ldur            w2, [x0, #0x17]
    // 0xa88f5c: DecompressPointer r2
    //     0xa88f5c: add             x2, x2, HEAP, lsl #32
    // 0xa88f60: stur            x2, [fp, #-0xa0]
    // 0xa88f64: r0 = call 0x3d55d4
    //     0xa88f64: bl              #0x3d55d4
    // 0xa88f68: mov             x4, x0
    // 0xa88f6c: ldur            x0, [fp, #-0x90]
    // 0xa88f70: stur            x4, [fp, #-0xa8]
    // 0xa88f74: LoadField: r5 = r0->field_f
    //     0xa88f74: ldur            w5, [x0, #0xf]
    // 0xa88f78: DecompressPointer r5
    //     0xa88f78: add             x5, x5, HEAP, lsl #32
    // 0xa88f7c: stur            x5, [fp, #-0xa0]
    // 0xa88f80: LoadField: r3 = r5->field_f
    //     0xa88f80: ldur            w3, [x5, #0xf]
    // 0xa88f84: DecompressPointer r3
    //     0xa88f84: add             x3, x3, HEAP, lsl #32
    // 0xa88f88: mov             x1, x5
    // 0xa88f8c: mov             x2, x4
    // 0xa88f90: r0 = __unknown_function__()
    //     0xa88f90: bl              #0xa8f654  ; [] ::__unknown_function__
    // 0xa88f94: ldur            x1, [fp, #-0xa0]
    // 0xa88f98: StoreField: r1->field_47 = r0
    //     0xa88f98: stur            w0, [x1, #0x47]
    //     0xa88f9c: ldurb           w16, [x1, #-1]
    //     0xa88fa0: ldurb           w17, [x0, #-1]
    //     0xa88fa4: and             x16, x17, x16, lsr #2
    //     0xa88fa8: tst             x16, HEAP, lsr #32
    //     0xa88fac: b.eq            #0xa88fb4
    //     0xa88fb0: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xa88fb4: ldur            x2, [fp, #-0x90]
    // 0xa88fb8: r3 = false
    //     0xa88fb8: add             x3, NULL, #0x30  ; false
    // 0xa88fbc: LoadField: r1 = r2->field_f
    //     0xa88fbc: ldur            w1, [x2, #0xf]
    // 0xa88fc0: DecompressPointer r1
    //     0xa88fc0: add             x1, x1, HEAP, lsl #32
    // 0xa88fc4: StoreField: r1->field_57 = r3
    //     0xa88fc4: stur            w3, [x1, #0x57]
    // 0xa88fc8: LoadField: r0 = r2->field_13
    //     0xa88fc8: ldur            w0, [x2, #0x13]
    // 0xa88fcc: DecompressPointer r0
    //     0xa88fcc: add             x0, x0, HEAP, lsl #32
    // 0xa88fd0: StoreField: r1->field_53 = r0
    //     0xa88fd0: stur            w0, [x1, #0x53]
    //     0xa88fd4: tbz             w0, #0, #0xa88ff0
    //     0xa88fd8: ldurb           w16, [x1, #-1]
    //     0xa88fdc: ldurb           w17, [x0, #-1]
    //     0xa88fe0: and             x16, x17, x16, lsr #2
    //     0xa88fe4: tst             x16, HEAP, lsr #32
    //     0xa88fe8: b.eq            #0xa88ff0
    //     0xa88fec: bl              #0xb28264  ; WriteBarrierWrappersStub
    // 0xa88ff0: r0 = Null
    //     0xa88ff0: mov             x0, NULL
    // 0xa88ff4: LeaveFrame
    //     0xa88ff4: mov             SP, fp
    //     0xa88ff8: ldp             fp, lr, [SP], #0x10
    // 0xa88ffc: ret
    //     0xa88ffc: ret             
    // 0xa89000: sub             SP, fp, #0xc0
    // 0xa89004: ldur            x2, [fp, #-0x90]
    // 0xa89008: r3 = false
    //     0xa89008: add             x3, NULL, #0x30  ; false
    // 0xa8900c: mov             x4, x0
    // 0xa89010: LoadField: r5 = r2->field_f
    //     0xa89010: ldur            w5, [x2, #0xf]
    // 0xa89014: DecompressPointer r5
    //     0xa89014: add             x5, x5, HEAP, lsl #32
    // 0xa89018: StoreField: r5->field_57 = r3
    //     0xa89018: stur            w3, [x5, #0x57]
    // 0xa8901c: LoadField: r0 = r2->field_13
    //     0xa8901c: ldur            w0, [x2, #0x13]
    // 0xa89020: DecompressPointer r0
    //     0xa89020: add             x0, x0, HEAP, lsl #32
    // 0xa89024: StoreField: r5->field_53 = r0
    //     0xa89024: stur            w0, [x5, #0x53]
    //     0xa89028: tbz             w0, #0, #0xa89044
    //     0xa8902c: ldurb           w16, [x5, #-1]
    //     0xa89030: ldurb           w17, [x0, #-1]
    //     0xa89034: and             x16, x17, x16, lsr #2
    //     0xa89038: tst             x16, HEAP, lsr #32
    //     0xa8903c: b.eq            #0xa89044
    //     0xa89040: bl              #0xb282e4  ; WriteBarrierWrappersStub
    // 0xa89044: mov             x0, x4
    // 0xa89048: r0 = ReThrow()
    //     0xa89048: bl              #0xb27dd0  ; ReThrowStub
    // 0xa8904c: brk             #0
    // 0xa89050: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xa89050: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xa89054: b               #0xa88b30
    // 0xa89058: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xa89058: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xa8905c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xa8905c: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xa89060: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xa89060: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
    // 0xa89064: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0xa89064: bl              #0xb2a1e8  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] void _Ave(dynamic, ka) {
    // ** addr: 0x663604, size: -0x1
  }
  [closure] void _Bve(dynamic, Sba) {
    // ** addr: 0x845e7c, size: -0x1
  }
  [closure] void _zve(dynamic) {
    // ** addr: 0xa05f94, size: -0x1
  }
}

// class id: 3713, size: 0x10, field offset: 0xc
//   const constructor, 
abstract class ora<X0> extends jI {
}

// class id: 3714, size: 0x14, field offset: 0x10
//   const constructor, 
abstract class qra<X0 bound Sba> extends ora<X0 bound Sba> {
}

// class id: 3715, size: 0x14, field offset: 0x14
//   const constructor, 
class vra extends qra<dynamic> {
}
