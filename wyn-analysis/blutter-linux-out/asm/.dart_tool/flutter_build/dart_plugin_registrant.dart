// lib: , url: file:///Users/builder/clone/.dart_tool/flutter_build/dart_plugin_registrant.dart

// class id: 1048595, size: 0x8
class :: {
}

// class id: 4842, size: 0x8, field offset: 0x8
class _PluginRegistrant extends Object {

  static void register() {
    // ** addr: 0xb2a76c, size: 0x3ec
    // 0xb2a76c: EnterFrame
    //     0xb2a76c: stp             fp, lr, [SP, #-0x10]!
    //     0xb2a770: mov             fp, SP
    // 0xb2a774: AllocStack(0x48)
    //     0xb2a774: sub             SP, SP, #0x48
    // 0xb2a778: CheckStackOverflow
    //     0xb2a778: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0xb2a77c: cmp             SP, x16
    //     0xb2a780: b.ls            #0xb2ab50
    // 0xb2a784: r0 = call 0xa663cc
    //     0xb2a784: bl              #0xa663cc
    // 0xb2a788: r0 = Null
    //     0xb2a788: mov             x0, NULL
    // 0xb2a78c: b               #0xb2a7d8
    // 0xb2a790: sub             SP, fp, #0x48
    // 0xb2a794: stur            x0, [fp, #-0x40]
    // 0xb2a798: r1 = Null
    //     0xb2a798: mov             x1, NULL
    // 0xb2a79c: r2 = 6
    //     0xb2a79c: movz            x2, #0x6
    // 0xb2a7a0: r0 = AllocateArray()
    //     0xb2a7a0: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2a7a4: r16 = "`camera_android` threw an error: "
    //     0xb2a7a4: add             x16, PP, #8, lsl #12  ; [pp+0x8b60] "`camera_android` threw an error: "
    //     0xb2a7a8: ldr             x16, [x16, #0xb60]
    // 0xb2a7ac: StoreField: r0->field_f = r16
    //     0xb2a7ac: stur            w16, [x0, #0xf]
    // 0xb2a7b0: ldur            x1, [fp, #-0x40]
    // 0xb2a7b4: StoreField: r0->field_13 = r1
    //     0xb2a7b4: stur            w1, [x0, #0x13]
    // 0xb2a7b8: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a7b8: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a7bc: ldr             x16, [x16, #0xb68]
    // 0xb2a7c0: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2a7c0: stur            w16, [x0, #0x17]
    // 0xb2a7c4: str             x0, [SP]
    // 0xb2a7c8: r0 = _interpolate()
    //     0xb2a7c8: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2a7cc: mov             x1, x0
    // 0xb2a7d0: r0 = call 0x33fce0
    //     0xb2a7d0: bl              #0x33fce0
    // 0xb2a7d4: ldur            x0, [fp, #-0x40]
    // 0xb2a7d8: stur            x0, [fp, #-0x40]
    // 0xb2a7dc: r0 = call 0xa662c8
    //     0xb2a7dc: bl              #0xa662c8
    // 0xb2a7e0: ldur            x0, [fp, #-0x40]
    // 0xb2a7e4: b               #0xb2a830
    // 0xb2a7e8: sub             SP, fp, #0x48
    // 0xb2a7ec: stur            x0, [fp, #-0x40]
    // 0xb2a7f0: r1 = Null
    //     0xb2a7f0: mov             x1, NULL
    // 0xb2a7f4: r2 = 6
    //     0xb2a7f4: movz            x2, #0x6
    // 0xb2a7f8: r0 = AllocateArray()
    //     0xb2a7f8: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2a7fc: r16 = "`file_picker` threw an error: "
    //     0xb2a7fc: add             x16, PP, #8, lsl #12  ; [pp+0x8b70] "`file_picker` threw an error: "
    //     0xb2a800: ldr             x16, [x16, #0xb70]
    // 0xb2a804: StoreField: r0->field_f = r16
    //     0xb2a804: stur            w16, [x0, #0xf]
    // 0xb2a808: ldur            x1, [fp, #-0x40]
    // 0xb2a80c: StoreField: r0->field_13 = r1
    //     0xb2a80c: stur            w1, [x0, #0x13]
    // 0xb2a810: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a810: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a814: ldr             x16, [x16, #0xb68]
    // 0xb2a818: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2a818: stur            w16, [x0, #0x17]
    // 0xb2a81c: str             x0, [SP]
    // 0xb2a820: r0 = _interpolate()
    //     0xb2a820: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2a824: mov             x1, x0
    // 0xb2a828: r0 = call 0x33fce0
    //     0xb2a828: bl              #0x33fce0
    // 0xb2a82c: ldur            x0, [fp, #-0x40]
    // 0xb2a830: stur            x0, [fp, #-0x40]
    // 0xb2a834: r0 = call 0xa66190
    //     0xb2a834: bl              #0xa66190
    // 0xb2a838: ldur            x0, [fp, #-0x40]
    // 0xb2a83c: b               #0xb2a888
    // 0xb2a840: sub             SP, fp, #0x48
    // 0xb2a844: stur            x0, [fp, #-0x40]
    // 0xb2a848: r1 = Null
    //     0xb2a848: mov             x1, NULL
    // 0xb2a84c: r2 = 6
    //     0xb2a84c: movz            x2, #0x6
    // 0xb2a850: r0 = AllocateArray()
    //     0xb2a850: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2a854: r16 = "`flutter_local_notifications` threw an error: "
    //     0xb2a854: add             x16, PP, #8, lsl #12  ; [pp+0x8b78] "`flutter_local_notifications` threw an error: "
    //     0xb2a858: ldr             x16, [x16, #0xb78]
    // 0xb2a85c: StoreField: r0->field_f = r16
    //     0xb2a85c: stur            w16, [x0, #0xf]
    // 0xb2a860: ldur            x1, [fp, #-0x40]
    // 0xb2a864: StoreField: r0->field_13 = r1
    //     0xb2a864: stur            w1, [x0, #0x13]
    // 0xb2a868: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a868: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a86c: ldr             x16, [x16, #0xb68]
    // 0xb2a870: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2a870: stur            w16, [x0, #0x17]
    // 0xb2a874: str             x0, [SP]
    // 0xb2a878: r0 = _interpolate()
    //     0xb2a878: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2a87c: mov             x1, x0
    // 0xb2a880: r0 = call 0x33fce0
    //     0xb2a880: bl              #0x33fce0
    // 0xb2a884: ldur            x0, [fp, #-0x40]
    // 0xb2a888: stur            x0, [fp, #-0x40]
    // 0xb2a88c: r0 = call 0xa6608c
    //     0xb2a88c: bl              #0xa6608c
    // 0xb2a890: ldur            x0, [fp, #-0x40]
    // 0xb2a894: b               #0xb2a8e0
    // 0xb2a898: sub             SP, fp, #0x48
    // 0xb2a89c: stur            x0, [fp, #-0x40]
    // 0xb2a8a0: r1 = Null
    //     0xb2a8a0: mov             x1, NULL
    // 0xb2a8a4: r2 = 6
    //     0xb2a8a4: movz            x2, #0x6
    // 0xb2a8a8: r0 = AllocateArray()
    //     0xb2a8a8: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2a8ac: r16 = "`geolocator_android` threw an error: "
    //     0xb2a8ac: add             x16, PP, #8, lsl #12  ; [pp+0x8b80] "`geolocator_android` threw an error: "
    //     0xb2a8b0: ldr             x16, [x16, #0xb80]
    // 0xb2a8b4: StoreField: r0->field_f = r16
    //     0xb2a8b4: stur            w16, [x0, #0xf]
    // 0xb2a8b8: ldur            x1, [fp, #-0x40]
    // 0xb2a8bc: StoreField: r0->field_13 = r1
    //     0xb2a8bc: stur            w1, [x0, #0x13]
    // 0xb2a8c0: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a8c0: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a8c4: ldr             x16, [x16, #0xb68]
    // 0xb2a8c8: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2a8c8: stur            w16, [x0, #0x17]
    // 0xb2a8cc: str             x0, [SP]
    // 0xb2a8d0: r0 = _interpolate()
    //     0xb2a8d0: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2a8d4: mov             x1, x0
    // 0xb2a8d8: r0 = call 0x33fce0
    //     0xb2a8d8: bl              #0x33fce0
    // 0xb2a8dc: ldur            x0, [fp, #-0x40]
    // 0xb2a8e0: stur            x0, [fp, #-0x40]
    // 0xb2a8e4: r0 = call 0xa65f6c
    //     0xb2a8e4: bl              #0xa65f6c
    // 0xb2a8e8: ldur            x0, [fp, #-0x40]
    // 0xb2a8ec: b               #0xb2a938
    // 0xb2a8f0: sub             SP, fp, #0x48
    // 0xb2a8f4: stur            x0, [fp, #-0x40]
    // 0xb2a8f8: r1 = Null
    //     0xb2a8f8: mov             x1, NULL
    // 0xb2a8fc: r2 = 6
    //     0xb2a8fc: movz            x2, #0x6
    // 0xb2a900: r0 = AllocateArray()
    //     0xb2a900: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2a904: r16 = "`google_sign_in_android` threw an error: "
    //     0xb2a904: add             x16, PP, #8, lsl #12  ; [pp+0x8b88] "`google_sign_in_android` threw an error: "
    //     0xb2a908: ldr             x16, [x16, #0xb88]
    // 0xb2a90c: StoreField: r0->field_f = r16
    //     0xb2a90c: stur            w16, [x0, #0xf]
    // 0xb2a910: ldur            x1, [fp, #-0x40]
    // 0xb2a914: StoreField: r0->field_13 = r1
    //     0xb2a914: stur            w1, [x0, #0x13]
    // 0xb2a918: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a918: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a91c: ldr             x16, [x16, #0xb68]
    // 0xb2a920: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2a920: stur            w16, [x0, #0x17]
    // 0xb2a924: str             x0, [SP]
    // 0xb2a928: r0 = _interpolate()
    //     0xb2a928: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2a92c: mov             x1, x0
    // 0xb2a930: r0 = call 0x33fce0
    //     0xb2a930: bl              #0x33fce0
    // 0xb2a934: ldur            x0, [fp, #-0x40]
    // 0xb2a938: stur            x0, [fp, #-0x40]
    // 0xb2a93c: r0 = call 0xa65e4c
    //     0xb2a93c: bl              #0xa65e4c
    // 0xb2a940: ldur            x0, [fp, #-0x40]
    // 0xb2a944: b               #0xb2a990
    // 0xb2a948: sub             SP, fp, #0x48
    // 0xb2a94c: stur            x0, [fp, #-0x40]
    // 0xb2a950: r1 = Null
    //     0xb2a950: mov             x1, NULL
    // 0xb2a954: r2 = 6
    //     0xb2a954: movz            x2, #0x6
    // 0xb2a958: r0 = AllocateArray()
    //     0xb2a958: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2a95c: r16 = "`path_provider_android` threw an error: "
    //     0xb2a95c: add             x16, PP, #8, lsl #12  ; [pp+0x8b90] "`path_provider_android` threw an error: "
    //     0xb2a960: ldr             x16, [x16, #0xb90]
    // 0xb2a964: StoreField: r0->field_f = r16
    //     0xb2a964: stur            w16, [x0, #0xf]
    // 0xb2a968: ldur            x1, [fp, #-0x40]
    // 0xb2a96c: StoreField: r0->field_13 = r1
    //     0xb2a96c: stur            w1, [x0, #0x13]
    // 0xb2a970: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a970: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a974: ldr             x16, [x16, #0xb68]
    // 0xb2a978: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2a978: stur            w16, [x0, #0x17]
    // 0xb2a97c: str             x0, [SP]
    // 0xb2a980: r0 = _interpolate()
    //     0xb2a980: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2a984: mov             x1, x0
    // 0xb2a988: r0 = call 0x33fce0
    //     0xb2a988: bl              #0x33fce0
    // 0xb2a98c: ldur            x0, [fp, #-0x40]
    // 0xb2a990: stur            x0, [fp, #-0x40]
    // 0xb2a994: r0 = call 0xa65d3c
    //     0xb2a994: bl              #0xa65d3c
    // 0xb2a998: ldur            x0, [fp, #-0x40]
    // 0xb2a99c: b               #0xb2a9e8
    // 0xb2a9a0: sub             SP, fp, #0x48
    // 0xb2a9a4: stur            x0, [fp, #-0x40]
    // 0xb2a9a8: r1 = Null
    //     0xb2a9a8: mov             x1, NULL
    // 0xb2a9ac: r2 = 6
    //     0xb2a9ac: movz            x2, #0x6
    // 0xb2a9b0: r0 = AllocateArray()
    //     0xb2a9b0: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2a9b4: r16 = "`shared_preferences_android` threw an error: "
    //     0xb2a9b4: add             x16, PP, #8, lsl #12  ; [pp+0x8b98] "`shared_preferences_android` threw an error: "
    //     0xb2a9b8: ldr             x16, [x16, #0xb98]
    // 0xb2a9bc: StoreField: r0->field_f = r16
    //     0xb2a9bc: stur            w16, [x0, #0xf]
    // 0xb2a9c0: ldur            x1, [fp, #-0x40]
    // 0xb2a9c4: StoreField: r0->field_13 = r1
    //     0xb2a9c4: stur            w1, [x0, #0x13]
    // 0xb2a9c8: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a9c8: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2a9cc: ldr             x16, [x16, #0xb68]
    // 0xb2a9d0: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2a9d0: stur            w16, [x0, #0x17]
    // 0xb2a9d4: str             x0, [SP]
    // 0xb2a9d8: r0 = _interpolate()
    //     0xb2a9d8: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2a9dc: mov             x1, x0
    // 0xb2a9e0: r0 = call 0x33fce0
    //     0xb2a9e0: bl              #0x33fce0
    // 0xb2a9e4: ldur            x0, [fp, #-0x40]
    // 0xb2a9e8: stur            x0, [fp, #-0x40]
    // 0xb2a9ec: r0 = call 0xa65c38
    //     0xb2a9ec: bl              #0xa65c38
    // 0xb2a9f0: ldur            x0, [fp, #-0x40]
    // 0xb2a9f4: b               #0xb2aa40
    // 0xb2a9f8: sub             SP, fp, #0x48
    // 0xb2a9fc: stur            x0, [fp, #-0x40]
    // 0xb2aa00: r1 = Null
    //     0xb2aa00: mov             x1, NULL
    // 0xb2aa04: r2 = 6
    //     0xb2aa04: movz            x2, #0x6
    // 0xb2aa08: r0 = AllocateArray()
    //     0xb2aa08: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2aa0c: r16 = "`sqflite_android` threw an error: "
    //     0xb2aa0c: add             x16, PP, #8, lsl #12  ; [pp+0x8ba0] "`sqflite_android` threw an error: "
    //     0xb2aa10: ldr             x16, [x16, #0xba0]
    // 0xb2aa14: StoreField: r0->field_f = r16
    //     0xb2aa14: stur            w16, [x0, #0xf]
    // 0xb2aa18: ldur            x1, [fp, #-0x40]
    // 0xb2aa1c: StoreField: r0->field_13 = r1
    //     0xb2aa1c: stur            w1, [x0, #0x13]
    // 0xb2aa20: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2aa20: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2aa24: ldr             x16, [x16, #0xb68]
    // 0xb2aa28: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2aa28: stur            w16, [x0, #0x17]
    // 0xb2aa2c: str             x0, [SP]
    // 0xb2aa30: r0 = _interpolate()
    //     0xb2aa30: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2aa34: mov             x1, x0
    // 0xb2aa38: r0 = call 0x33fce0
    //     0xb2aa38: bl              #0x33fce0
    // 0xb2aa3c: ldur            x0, [fp, #-0x40]
    // 0xb2aa40: stur            x0, [fp, #-0x40]
    // 0xb2aa44: r0 = call 0xa65b18
    //     0xb2aa44: bl              #0xa65b18
    // 0xb2aa48: ldur            x0, [fp, #-0x40]
    // 0xb2aa4c: b               #0xb2aa98
    // 0xb2aa50: sub             SP, fp, #0x48
    // 0xb2aa54: stur            x0, [fp, #-0x40]
    // 0xb2aa58: r1 = Null
    //     0xb2aa58: mov             x1, NULL
    // 0xb2aa5c: r2 = 6
    //     0xb2aa5c: movz            x2, #0x6
    // 0xb2aa60: r0 = AllocateArray()
    //     0xb2aa60: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2aa64: r16 = "`url_launcher_android` threw an error: "
    //     0xb2aa64: add             x16, PP, #8, lsl #12  ; [pp+0x8ba8] "`url_launcher_android` threw an error: "
    //     0xb2aa68: ldr             x16, [x16, #0xba8]
    // 0xb2aa6c: StoreField: r0->field_f = r16
    //     0xb2aa6c: stur            w16, [x0, #0xf]
    // 0xb2aa70: ldur            x1, [fp, #-0x40]
    // 0xb2aa74: StoreField: r0->field_13 = r1
    //     0xb2aa74: stur            w1, [x0, #0x13]
    // 0xb2aa78: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2aa78: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2aa7c: ldr             x16, [x16, #0xb68]
    // 0xb2aa80: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2aa80: stur            w16, [x0, #0x17]
    // 0xb2aa84: str             x0, [SP]
    // 0xb2aa88: r0 = _interpolate()
    //     0xb2aa88: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2aa8c: mov             x1, x0
    // 0xb2aa90: r0 = call 0x33fce0
    //     0xb2aa90: bl              #0x33fce0
    // 0xb2aa94: ldur            x0, [fp, #-0x40]
    // 0xb2aa98: stur            x0, [fp, #-0x40]
    // 0xb2aa9c: r0 = call 0xa65934
    //     0xb2aa9c: bl              #0xa65934
    // 0xb2aaa0: ldur            x0, [fp, #-0x40]
    // 0xb2aaa4: b               #0xb2aaf0
    // 0xb2aaa8: sub             SP, fp, #0x48
    // 0xb2aaac: stur            x0, [fp, #-0x40]
    // 0xb2aab0: r1 = Null
    //     0xb2aab0: mov             x1, NULL
    // 0xb2aab4: r2 = 6
    //     0xb2aab4: movz            x2, #0x6
    // 0xb2aab8: r0 = AllocateArray()
    //     0xb2aab8: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2aabc: r16 = "`video_player_android` threw an error: "
    //     0xb2aabc: add             x16, PP, #8, lsl #12  ; [pp+0x8bb0] "`video_player_android` threw an error: "
    //     0xb2aac0: ldr             x16, [x16, #0xbb0]
    // 0xb2aac4: StoreField: r0->field_f = r16
    //     0xb2aac4: stur            w16, [x0, #0xf]
    // 0xb2aac8: ldur            x1, [fp, #-0x40]
    // 0xb2aacc: StoreField: r0->field_13 = r1
    //     0xb2aacc: stur            w1, [x0, #0x13]
    // 0xb2aad0: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2aad0: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2aad4: ldr             x16, [x16, #0xb68]
    // 0xb2aad8: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2aad8: stur            w16, [x0, #0x17]
    // 0xb2aadc: str             x0, [SP]
    // 0xb2aae0: r0 = _interpolate()
    //     0xb2aae0: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2aae4: mov             x1, x0
    // 0xb2aae8: r0 = call 0x33fce0
    //     0xb2aae8: bl              #0x33fce0
    // 0xb2aaec: ldur            x0, [fp, #-0x40]
    // 0xb2aaf0: stur            x0, [fp, #-0x40]
    // 0xb2aaf4: r0 = call 0xa6583c
    //     0xb2aaf4: bl              #0xa6583c
    // 0xb2aaf8: b               #0xb2ab40
    // 0xb2aafc: sub             SP, fp, #0x48
    // 0xb2ab00: stur            x0, [fp, #-0x40]
    // 0xb2ab04: r1 = Null
    //     0xb2ab04: mov             x1, NULL
    // 0xb2ab08: r2 = 6
    //     0xb2ab08: movz            x2, #0x6
    // 0xb2ab0c: r0 = AllocateArray()
    //     0xb2ab0c: bl              #0xb29b38  ; AllocateArrayStub
    // 0xb2ab10: r16 = "`webview_flutter_android` threw an error: "
    //     0xb2ab10: add             x16, PP, #8, lsl #12  ; [pp+0x8bb8] "`webview_flutter_android` threw an error: "
    //     0xb2ab14: ldr             x16, [x16, #0xbb8]
    // 0xb2ab18: StoreField: r0->field_f = r16
    //     0xb2ab18: stur            w16, [x0, #0xf]
    // 0xb2ab1c: ldur            x1, [fp, #-0x40]
    // 0xb2ab20: StoreField: r0->field_13 = r1
    //     0xb2ab20: stur            w1, [x0, #0x13]
    // 0xb2ab24: r16 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2ab24: add             x16, PP, #8, lsl #12  ; [pp+0x8b68] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0xb2ab28: ldr             x16, [x16, #0xb68]
    // 0xb2ab2c: ArrayStore: r0[0] = r16  ; List_4
    //     0xb2ab2c: stur            w16, [x0, #0x17]
    // 0xb2ab30: str             x0, [SP]
    // 0xb2ab34: r0 = _interpolate()
    //     0xb2ab34: bl              #0x2e80cc  ; [dart:core] _StringBase::_interpolate
    // 0xb2ab38: mov             x1, x0
    // 0xb2ab3c: r0 = call 0x33fce0
    //     0xb2ab3c: bl              #0x33fce0
    // 0xb2ab40: r0 = Null
    //     0xb2ab40: mov             x0, NULL
    // 0xb2ab44: LeaveFrame
    //     0xb2ab44: mov             SP, fp
    //     0xb2ab48: ldp             fp, lr, [SP], #0x10
    // 0xb2ab4c: ret
    //     0xb2ab4c: ret             
    // 0xb2ab50: r0 = StackOverflowSharedWithoutFPURegs()
    //     0xb2ab50: bl              #0xb29c40  ; StackOverflowSharedWithoutFPURegsStub
    // 0xb2ab54: b               #0xb2a784
  }
}
