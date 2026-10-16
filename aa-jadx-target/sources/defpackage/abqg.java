package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abqg {
    public static final defpackage.abqg a = new defpackage.abqg();
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    private abqg() {
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:198:0x0420  */
    private <T extends defpackage.abox> defpackage.abqn<T> c(java.lang.Class<T> cls) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        abqc abqbVar;
        int i16;
        int i17;
        java.lang.Object[] objArr;
        int i18;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        java.lang.reflect.Field fieldF;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        java.lang.Object obj;
        java.lang.reflect.Field fieldF2;
        int i28;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldF3;
        int i29;
        char cCharAt9;
        int i30;
        int i31;
        char cCharAt10;
        int i32;
        int i33;
        char cCharAt11;
        int i34;
        int i35;
        char cCharAt12;
        if (!defpackage.abox.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            abqt abqtVar = (defpackage.abpw) defpackage.abox.r(cls.asSubclass(defpackage.abox.class)).a(3, null);
            if (abqtVar.b()) {
                abqbVar = new abqc(defpackage.abqo.a, abqtVar.a());
            } else {
                defpackage.abqx abqxVar = defpackage.abqo.a;
                defpackage.ysr ysrVar = abqtVar.c() + (-1) != 1 ? defpackage.abom.a : null;
                sun.misc.Unsafe unsafe = defpackage.abqb.b;
                if (unsafe == null) {
                    throw new java.lang.RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(abqtVar instanceof defpackage.abqi)) {
                    throw null;
                }
                defpackage.abqi abqiVar = (defpackage.abqi) abqtVar;
                java.lang.String str = abqiVar.b;
                int length = str.length();
                int iCharAt3 = 0;
                if (str.charAt(0) >= 55296) {
                    int i36 = 1;
                    while (true) {
                        i = i36 + 1;
                        if (str.charAt(i36) < 55296) {
                            break;
                        }
                        i36 = i;
                    }
                } else {
                    i = 1;
                }
                int i37 = i + 1;
                int iCharAt4 = str.charAt(i);
                if (iCharAt4 >= 55296) {
                    int i38 = iCharAt4 & 8191;
                    int i39 = 13;
                    while (true) {
                        i35 = i37 + 1;
                        cCharAt12 = str.charAt(i37);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i38 |= (cCharAt12 & 8191) << i39;
                        i39 += 13;
                        i37 = i35;
                    }
                    iCharAt4 = i38 | (cCharAt12 << i39);
                    i37 = i35;
                }
                if (iCharAt4 == 0) {
                    i7 = 0;
                    i6 = 0;
                    iCharAt = 0;
                    iCharAt2 = 0;
                    i4 = 0;
                    iArr = defpackage.abqb.a;
                    i5 = 0;
                } else {
                    int i40 = i37 + 1;
                    int iCharAt5 = str.charAt(i37);
                    if (iCharAt5 >= 55296) {
                        int i41 = iCharAt5 & 8191;
                        int i42 = 13;
                        while (true) {
                            i15 = i40 + 1;
                            cCharAt7 = str.charAt(i40);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i41 |= (cCharAt7 & 8191) << i42;
                            i42 += 13;
                            i40 = i15;
                        }
                        iCharAt5 = i41 | (cCharAt7 << i42);
                        i40 = i15;
                    }
                    int i43 = i40 + 1;
                    int iCharAt6 = str.charAt(i40);
                    if (iCharAt6 >= 55296) {
                        int i44 = iCharAt6 & 8191;
                        int i45 = 13;
                        while (true) {
                            i14 = i43 + 1;
                            cCharAt6 = str.charAt(i43);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i44 |= (cCharAt6 & 8191) << i45;
                            i45 += 13;
                            i43 = i14;
                        }
                        iCharAt6 = i44 | (cCharAt6 << i45);
                        i43 = i14;
                    }
                    int i46 = i43 + 1;
                    int iCharAt7 = str.charAt(i43);
                    if (iCharAt7 >= 55296) {
                        int i47 = iCharAt7 & 8191;
                        int i48 = 13;
                        while (true) {
                            i13 = i46 + 1;
                            cCharAt5 = str.charAt(i46);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i47 |= (cCharAt5 & 8191) << i48;
                            i48 += 13;
                            i46 = i13;
                        }
                        iCharAt7 = i47 | (cCharAt5 << i48);
                        i46 = i13;
                    }
                    int i49 = i46 + 1;
                    iCharAt = str.charAt(i46);
                    if (iCharAt >= 55296) {
                        int i50 = iCharAt & 8191;
                        int i51 = 13;
                        while (true) {
                            i12 = i49 + 1;
                            cCharAt4 = str.charAt(i49);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i50 |= (cCharAt4 & 8191) << i51;
                            i51 += 13;
                            i49 = i12;
                        }
                        iCharAt = i50 | (cCharAt4 << i51);
                        i49 = i12;
                    }
                    int i52 = i49 + 1;
                    iCharAt2 = str.charAt(i49);
                    if (iCharAt2 >= 55296) {
                        int i53 = iCharAt2 & 8191;
                        int i54 = i52;
                        int i55 = 13;
                        while (true) {
                            i11 = i54 + 1;
                            cCharAt3 = str.charAt(i54);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i53 |= (cCharAt3 & 8191) << i55;
                            i55 += 13;
                            i54 = i11;
                        }
                        iCharAt2 = i53 | (cCharAt3 << i55);
                        i2 = i11;
                    } else {
                        i2 = i52;
                    }
                    int i56 = i2 + 1;
                    iCharAt3 = str.charAt(i2);
                    if (iCharAt3 >= 55296) {
                        int i57 = iCharAt3 & 8191;
                        int i58 = i56;
                        int i59 = 13;
                        while (true) {
                            i10 = i58 + 1;
                            cCharAt2 = str.charAt(i58);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i57 |= (cCharAt2 & 8191) << i59;
                            i59 += 13;
                            i58 = i10;
                        }
                        iCharAt3 = i57 | (cCharAt2 << i59);
                        i3 = i10;
                    } else {
                        i3 = i56;
                    }
                    int i60 = i3 + 1;
                    if (str.charAt(i3) >= 55296) {
                        do {
                            i9 = i60;
                            i60 = i9 + 1;
                        } while (str.charAt(i9) >= 55296);
                    }
                    int i61 = i60;
                    int i62 = i61 + 1;
                    int iCharAt8 = str.charAt(i61);
                    if (iCharAt8 >= 55296) {
                        int i63 = iCharAt8 & 8191;
                        int i64 = i62;
                        int i65 = 13;
                        while (true) {
                            i8 = i64 + 1;
                            cCharAt = str.charAt(i64);
                            if (cCharAt < 55296) {
                                break;
                            }
                            i63 |= (cCharAt & 8191) << i65;
                            i65 += 13;
                            i64 = i8;
                        }
                        iCharAt8 = i63 | (cCharAt << i65);
                        i62 = i8;
                    }
                    i4 = iCharAt5 + iCharAt5 + iCharAt6;
                    int i66 = iCharAt8;
                    iArr = new int[iCharAt8 + iCharAt3 + iCharAt5];
                    i5 = iCharAt7;
                    i6 = i66;
                    i7 = iCharAt5;
                    i37 = i62;
                }
                java.lang.Object[] objArr2 = abqiVar.c;
                int i67 = i37;
                int i68 = i5;
                defpackage.abpy abpyVar = abqiVar.a;
                java.lang.Class<?> cls2 = abpyVar.getClass();
                int i69 = i7;
                int i70 = iCharAt3 + i6;
                int[] iArr2 = new int[iCharAt2 * 3];
                java.lang.Object[] objArr3 = new java.lang.Object[iCharAt2 + iCharAt2];
                int i71 = i70;
                int i72 = i6;
                int i73 = i67;
                int i74 = 0;
                int i75 = 0;
                while (i73 < length) {
                    int i76 = i73 + 1;
                    int iCharAt9 = str.charAt(i73);
                    int i77 = length;
                    if (iCharAt9 >= 55296) {
                        int i78 = iCharAt9 & 8191;
                        int i79 = i76;
                        int i80 = 13;
                        while (true) {
                            i33 = i79 + 1;
                            cCharAt11 = str.charAt(i79);
                            i34 = i78;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i78 = i34 | ((cCharAt11 & 8191) << i80);
                            i80 += 13;
                            i79 = i33;
                        }
                        iCharAt9 = i34 | (cCharAt11 << i80);
                        i16 = i33;
                    } else {
                        i16 = i76;
                    }
                    int i81 = i16 + 1;
                    int iCharAt10 = str.charAt(i16);
                    int i82 = iCharAt9;
                    if (iCharAt10 >= 55296) {
                        int i83 = iCharAt10 & 8191;
                        int i84 = i81;
                        int i85 = 13;
                        while (true) {
                            i31 = i84 + 1;
                            cCharAt10 = str.charAt(i84);
                            i32 = i83;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i83 = i32 | ((cCharAt10 & 8191) << i85);
                            i85 += 13;
                            i84 = i31;
                        }
                        iCharAt10 = i32 | (cCharAt10 << i85);
                        i17 = i31;
                    } else {
                        i17 = i81;
                    }
                    int i86 = i70;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i74] = i75;
                        i74++;
                    }
                    int i87 = iCharAt10 & 255;
                    int i88 = i68;
                    int i89 = iCharAt10 & 2048;
                    if (i87 >= 51) {
                        int i90 = i17 + 1;
                        int iCharAt11 = str.charAt(i17);
                        if (iCharAt11 >= 55296) {
                            int i91 = iCharAt11 & 8191;
                            int i92 = i90;
                            int i93 = 13;
                            while (true) {
                                i29 = i92 + 1;
                                cCharAt9 = str.charAt(i92);
                                i30 = i91;
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i91 = i30 | ((cCharAt9 & 8191) << i93);
                                i93 += 13;
                                i92 = i29;
                            }
                            iCharAt11 = i30 | (cCharAt9 << i93);
                            i24 = i29;
                        } else {
                            i24 = i90;
                        }
                        int i94 = iCharAt11;
                        int i95 = i87 - 51;
                        i19 = i24;
                        if (i95 == 9 || i95 == 17) {
                            i25 = i4 + 1;
                            int i96 = i75 / 3;
                            objArr3[i96 + i96 + 1] = objArr2[i4];
                        } else {
                            if (i95 != 12) {
                                i26 = i89;
                            } else if (abqiVar.c() == 1 || i89 != 0) {
                                i25 = i4 + 1;
                                int i97 = i75 / 3;
                                objArr3[i97 + i97 + 1] = objArr2[i4];
                            } else {
                                i26 = 0;
                            }
                            i27 = i94 + i94;
                            obj = objArr2[i27];
                            int i98 = i26;
                            if (obj instanceof java.lang.reflect.Field) {
                                fieldF2 = (java.lang.reflect.Field) obj;
                            } else {
                                fieldF2 = defpackage.abqb.f(cls2, (java.lang.String) obj);
                                objArr2[i27] = fieldF2;
                                iArr[i71] = i75;
                                i71++;
                            }
                            objArr = objArr2;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                            i28 = i27 + 1;
                            obj2 = objArr[i28];
                            if (obj2 instanceof java.lang.reflect.Field) {
                                fieldF3 = (java.lang.reflect.Field) obj2;
                            } else {
                                fieldF3 = defpackage.abqb.f(cls2, (java.lang.String) obj2);
                                objArr[i28] = fieldF3;
                            }
                            abpyVar = abpyVar;
                            iArr = iArr;
                            i18 = i98;
                            i21 = 0;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                            i20 = iObjectFieldOffset3;
                        }
                        i4 = i25;
                        i26 = i89;
                        i27 = i94 + i94;
                        obj = objArr2[i27];
                        int i99 = i26;
                        if (obj instanceof java.lang.reflect.Field) {
                            fieldF2 = (java.lang.reflect.Field) obj;
                        } else {
                            fieldF2 = defpackage.abqb.f(cls2, (java.lang.String) obj);
                            objArr2[i27] = fieldF2;
                            iArr[i71] = i75;
                            i71++;
                        }
                        objArr = objArr2;
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF2);
                        i28 = i27 + 1;
                        obj2 = objArr[i28];
                        if (obj2 instanceof java.lang.reflect.Field) {
                            fieldF3 = (java.lang.reflect.Field) obj2;
                        } else {
                            fieldF3 = defpackage.abqb.f(cls2, (java.lang.String) obj2);
                            objArr[i28] = fieldF3;
                        }
                        abpyVar = abpyVar;
                        iArr = iArr;
                        i18 = i99;
                        i21 = 0;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                        i20 = iObjectFieldOffset4;
                    } else {
                        objArr = objArr2;
                        int i100 = i4 + 1;
                        java.lang.reflect.Field fieldF4 = defpackage.abqb.f(cls2, (java.lang.String) objArr[i4]);
                        if (i87 == 9 || i87 == 17) {
                            int i101 = i75 / 3;
                            objArr3[i101 + i101 + 1] = fieldF4.getType();
                        } else {
                            if (i87 != 27) {
                                if (i87 == 49) {
                                    i4 += 2;
                                    i23 = 1;
                                } else if (i87 == 12 || i87 == 30 || i87 == 44) {
                                    abpyVar = abpyVar;
                                    if (abqiVar.c() == 1 || i89 != 0) {
                                        i4 += 2;
                                        int i102 = i75 / 3;
                                        objArr3[i102 + i102 + 1] = objArr[i100];
                                        iArr = iArr;
                                        i18 = i89;
                                    } else {
                                        iArr = iArr;
                                        i4 = i100;
                                        i18 = 0;
                                    }
                                } else if (i87 == 50) {
                                    int i103 = i4 + 2;
                                    i72++;
                                    iArr[i72] = i75;
                                    int i104 = i75 / 3;
                                    int i105 = i104 + i104;
                                    objArr3[i105] = objArr[i100];
                                    if (i89 != 0) {
                                        i4 += 3;
                                        objArr3[i105 + 1] = objArr[i103];
                                        i18 = i89;
                                    } else {
                                        i4 = i103;
                                        i18 = 0;
                                    }
                                    abpyVar = abpyVar;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt10 & 4096) != 0 || i87 > 17) {
                                    i19 = i17;
                                    i20 = iObjectFieldOffset;
                                    i21 = 0;
                                } else {
                                    int i106 = i17 + 1;
                                    int iCharAt12 = str.charAt(i17);
                                    if (iCharAt12 >= 55296) {
                                        int i107 = iCharAt12 & 8191;
                                        int i108 = 13;
                                        while (true) {
                                            i22 = i106 + 1;
                                            cCharAt8 = str.charAt(i106);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i107 |= (cCharAt8 & 8191) << i108;
                                            i108 += 13;
                                            i106 = i22;
                                        }
                                        iCharAt12 = i107 | (cCharAt8 << i108);
                                        i106 = i22;
                                    }
                                    int i109 = i69 + i69 + (iCharAt12 / 32);
                                    java.lang.Object obj3 = objArr[i109];
                                    if (obj3 instanceof java.lang.reflect.Field) {
                                        fieldF = (java.lang.reflect.Field) obj3;
                                    } else {
                                        fieldF = defpackage.abqb.f(cls2, (java.lang.String) obj3);
                                        objArr[i109] = fieldF;
                                    }
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                                    i19 = i106;
                                    i18 = i18;
                                    i21 = iCharAt12 % 32;
                                    i20 = iObjectFieldOffset;
                                }
                            } else {
                                i23 = 1;
                                i4 += 2;
                            }
                            int i110 = i75 / 3;
                            objArr3[i110 + i110 + i23] = objArr[i100];
                            iArr = iArr;
                            i18 = i89;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0) {
                                i19 = i17;
                                i20 = iObjectFieldOffset;
                                i21 = 0;
                            } else {
                                i19 = i17;
                                i20 = iObjectFieldOffset;
                                i21 = 0;
                            }
                        }
                        iArr = iArr;
                        i18 = i89;
                        i4 = i100;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                            i19 = i17;
                            i20 = iObjectFieldOffset;
                            i21 = 0;
                        } else {
                            i19 = i17;
                            i20 = iObjectFieldOffset;
                            i21 = 0;
                        }
                    }
                    int i111 = i75 + 1;
                    iArr2[i75] = i82;
                    int i112 = i75 + 2;
                    java.lang.Class<?> cls3 = cls2;
                    iArr2[i111] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i18 != 0 ? Integer.MIN_VALUE : 0) | (i87 << 20) | i20;
                    i75 += 3;
                    iArr2[i112] = (i21 << 20) | iObjectFieldOffset2;
                    cls2 = cls3;
                    iArr = iArr;
                    i70 = i86;
                    length = i77;
                    i68 = i88;
                    abpyVar = abpyVar;
                    str = str;
                    i73 = i19;
                    objArr2 = objArr;
                }
                abqbVar = new defpackage.abqb(iArr2, objArr3, i68, iCharAt, abpyVar, iArr, i6, i70, abqxVar, ysrVar);
            }
            defpackage.abqn<T> abqnVar = (defpackage.abqn) this.b.putIfAbsent(cls, abqbVar);
            return abqnVar != null ? abqnVar : abqbVar;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    final defpackage.abqn a(defpackage.abox aboxVar) {
        return b(aboxVar.getClass());
    }

    public final defpackage.abqn b(java.lang.Class cls) {
        java.lang.Object obj = this.b.get(cls);
        return obj == null ? c(cls) : (defpackage.abqn) obj;
    }
}
