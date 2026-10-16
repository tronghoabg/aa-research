package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ca {
    public static boolean a;
    public static java.lang.reflect.Method b;

    public ca() {
    }

    public static defpackage.aep A(defpackage.aep aepVar) {
        defpackage.aep aepVarC = aepVar.c();
        int iB = aepVarC.b();
        for (int i = 0; i < iB; i++) {
            aepVarC.e(i, aepVar.a(i));
        }
        return aepVarC;
    }

    public static defpackage.aek B(float f, float f2) {
        return new defpackage.aek(defpackage.agt.a, java.lang.Float.valueOf(f), new defpackage.ael(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ defpackage.aek C(defpackage.aek aekVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((java.lang.Number) aekVar.a()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((defpackage.ael) aekVar.a).a;
        }
        return new defpackage.aek(aekVar.e, java.lang.Float.valueOf(f), new defpackage.ael(f2), aekVar.b, aekVar.c, aekVar.d);
    }

    public static /* synthetic */ defpackage.aek D(defpackage.aek aekVar, java.lang.Object obj, long j, int i) {
        if ((i & 1) != 0) {
            obj = aekVar.a();
        }
        java.lang.Object obj2 = obj;
        defpackage.aep aepVarA = (i & 2) != 0 ? A(aekVar.a) : null;
        long j2 = (i & 4) != 0 ? aekVar.b : 0L;
        if ((i & 8) != 0) {
            j = aekVar.c;
        }
        return new defpackage.aek(aekVar.e, obj2, aepVarA, j2, j, aekVar.d);
    }

    public static defpackage.afr E(defpackage.affc affcVar) {
        defpackage.skb skbVar = new defpackage.skb(null, null);
        affcVar.invoke(skbVar);
        return new defpackage.afr(skbVar);
    }

    public static /* synthetic */ defpackage.ags F(int i, int i2, defpackage.aez aezVar, int i3) {
        if ((i3 & 4) != 0) {
            aezVar = defpackage.afc.a;
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            i2 = 0;
        }
        if (1 == i5) {
            i = 300;
        }
        return new defpackage.ags(i, i2, aezVar);
    }

    public static /* synthetic */ defpackage.afj G(defpackage.aey aeyVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return new defpackage.afj(aeyVar, i);
    }

    public static boolean H(defpackage.aeg aegVar, long j) {
        return j >= aegVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static void I(final java.lang.Object obj, defpackage.cgf cgfVar, defpackage.afd afdVar, java.lang.String str, final defpackage.affh affhVar, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.afd afdVar2;
        int i5;
        int i6;
        int i7;
        final defpackage.cgf cgfVar3;
        final defpackage.afd afdVar3;
        final java.lang.String str2;
        defpackage.bxl bxlVarJ;
        int i8;
        defpackage.cgf cgfVar4;
        defpackage.afd afdVarF;
        java.lang.String str3;
        int i9;
        int i10 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-513216493);
        if (i10 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(obj) : bveVarC.E(obj)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    afdVar2 = afdVar;
                    if (true != bveVarC.E(afdVar2)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        if (true != bveVarC.C(str)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                        if (i11 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i8 = i6;
                        } else {
                            i8 = i6;
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            afdVarF = F(0, 0, null, 7);
                        } else {
                            afdVarF = afdVar2;
                        }
                        if (i8 != 0) {
                            str3 = "Crossfade";
                        } else {
                            str3 = str;
                        }
                        J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        afdVar3 = afdVarF;
                    } else {
                        bveVarC.s();
                        cgfVar3 = cgfVar2;
                        afdVar3 = afdVar2;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: ach
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                int i12 = i | 1;
                                int i13 = 306783378 & i12;
                                int i14 = 613566756 & i12;
                                defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i8 = i6;
                    } else {
                        i8 = i6;
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        afdVarF = F(0, 0, null, 7);
                    } else {
                        afdVarF = afdVar2;
                    }
                    if (i8 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    afdVar3 = afdVarF;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    afdVar3 = afdVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: ach
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            int i12 = i | 1;
                            int i13 = 306783378 & i12;
                            int i14 = 613566756 & i12;
                            defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 384;
            afdVar2 = afdVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (true != bveVarC.C(str)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i8 = i6;
                    } else {
                        i8 = i6;
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        afdVarF = F(0, 0, null, 7);
                    } else {
                        afdVarF = afdVar2;
                    }
                    if (i8 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    afdVar3 = afdVarF;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    afdVar3 = afdVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: ach
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            int i12 = i | 1;
                            int i13 = 306783378 & i12;
                            int i14 = 613566756 & i12;
                            defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i8 = i6;
                } else {
                    i8 = i6;
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    afdVarF = F(0, 0, null, 7);
                } else {
                    afdVarF = afdVar2;
                }
                if (i8 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
                str2 = str3;
                cgfVar3 = cgfVar4;
                afdVar3 = afdVarF;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                afdVar3 = afdVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: ach
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        int i12 = i | 1;
                        int i13 = 306783378 & i12;
                        int i14 = 613566756 & i12;
                        defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                afdVar2 = afdVar;
                if (true != bveVarC.E(afdVar2)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (true != bveVarC.C(str)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i8 = i6;
                    } else {
                        i8 = i6;
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        afdVarF = F(0, 0, null, 7);
                    } else {
                        afdVarF = afdVar2;
                    }
                    if (i8 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    afdVar3 = afdVarF;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    afdVar3 = afdVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: ach
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            int i12 = i | 1;
                            int i13 = 306783378 & i12;
                            int i14 = 613566756 & i12;
                            defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i8 = i6;
                } else {
                    i8 = i6;
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    afdVarF = F(0, 0, null, 7);
                } else {
                    afdVarF = afdVar2;
                }
                if (i8 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
                str2 = str3;
                cgfVar3 = cgfVar4;
                afdVar3 = afdVarF;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                afdVar3 = afdVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: ach
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        int i12 = i | 1;
                        int i13 = 306783378 & i12;
                        int i14 = 613566756 & i12;
                        defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 384;
        afdVar2 = afdVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                if (true != bveVarC.C(str)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i8 = i6;
                } else {
                    i8 = i6;
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    afdVarF = F(0, 0, null, 7);
                } else {
                    afdVarF = afdVar2;
                }
                if (i8 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
                str2 = str3;
                cgfVar3 = cgfVar4;
                afdVar3 = afdVarF;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                afdVar3 = afdVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: ach
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        int i12 = i | 1;
                        int i13 = 306783378 & i12;
                        int i14 = 613566756 & i12;
                        defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 3072;
        if ((i & 24576) == 0) {
            if (true != bveVarC.E(affhVar)) {
                i9 = 8192;
            } else {
                i9 = 16384;
            }
            i3 |= i9;
        }
        if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            if (i11 != 0) {
                cgfVar4 = defpackage.cgf.e;
                i8 = i6;
            } else {
                i8 = i6;
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                afdVarF = F(0, 0, null, 7);
            } else {
                afdVarF = afdVar2;
            }
            if (i8 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str;
            }
            J(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 6) & 112) | (i3 & 14), 0), cgfVar4, afdVarF, null, affhVar, bveVarC, i3 & 58352);
            str2 = str3;
            cgfVar3 = cgfVar4;
            afdVar3 = afdVarF;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            afdVar3 = afdVar2;
            str2 = str;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: ach
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    java.lang.Object obj4 = obj;
                    int i12 = i | 1;
                    int i13 = 306783378 & i12;
                    int i14 = 613566756 & i12;
                    defpackage.ca.I(obj4, cgfVar3, afdVar3, str2, affhVar, bveVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static void J(final defpackage.agn agnVar, defpackage.cgf cgfVar, final defpackage.afd afdVar, defpackage.affc affcVar, final defpackage.affh affhVar, defpackage.bve bveVar, int i) {
        defpackage.affc affcVar2;
        boolean z;
        int i2 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1877370462);
        int i3 = i2 == 0 ? (true != bveVarC.C(agnVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(afdVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= true != bveVarC.E(affhVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.abj(11);
                bwcVar.ad(objS);
            }
            affcVar2 = (defpackage.affc) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = defpackage.afga.ae(agnVar.e());
                bwcVar.ad(objS2);
            }
            java.util.List list = (java.util.List) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                long[] jArr = defpackage.aav.a;
                objS3 = new defpackage.aau(6);
                bwcVar.ad(objS3);
            }
            defpackage.aau aauVar = (defpackage.aau) objS3;
            java.lang.Object objG = agnVar.g();
            if (defpackage.afga.f(agnVar.e(), objG)) {
                bveVarC.v(321155112);
                if (list.size() == 1 && defpackage.afga.f(list.get(0), objG)) {
                    bveVarC.v(321479744);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(321289466);
                    boolean zE = bveVarC.E(objG);
                    java.lang.Object objS4 = bwcVar.S();
                    if (zE || objS4 == obj) {
                        objS4 = new defpackage.aap(objG, 10);
                        bwcVar.ad(objS4);
                    }
                    defpackage.afga.bq(list, (defpackage.affc) objS4);
                    aauVar.k();
                    bwcVar.Y(false);
                }
                bwcVar.Y(false);
            } else {
                bveVarC.v(321485696);
                bwcVar.Y(false);
            }
            if (defpackage.aau.f(aauVar, objG)) {
                z = false;
                bveVarC.v(322289216);
                bwcVar.Y(false);
            } else {
                bveVarC.v(321546363);
                java.util.Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (defpackage.afga.f(affcVar2.invoke(it.next()), affcVar2.invoke(objG))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    list.add(objG);
                } else {
                    list.set(i5, objG);
                }
                aauVar.k();
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    final java.lang.Object obj2 = list.get(i6);
                    aauVar.m(obj2, defpackage.dai.as(-934471669, true, new defpackage.affg() { // from class: acg
                        /* JADX WARN: Type inference failed for: r14v8, types: [afd, java.lang.Object] */
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            java.lang.Object objE;
                            defpackage.bve bveVar2 = (defpackage.bve) obj3;
                            int iIntValue = ((java.lang.Integer) obj4).intValue();
                            int i7 = iIntValue & 3;
                            int i8 = 1;
                            if (bveVar2.I(i7 != 2, iIntValue & 1)) {
                                defpackage.afd afdVar2 = afdVar;
                                defpackage.agn agnVar2 = agnVar;
                                defpackage.akm akmVar = new defpackage.akm(afdVar2, i8);
                                defpackage.bil bilVar = defpackage.agt.a;
                                if (agnVar2.w()) {
                                    bveVar2.v(1666827533);
                                    bveVar2.o();
                                    objE = agnVar2.e();
                                } else {
                                    bveVar2.v(1666573488);
                                    boolean zC = bveVar2.C(agnVar2);
                                    objE = bveVar2.g();
                                    if (zC || objE == defpackage.bvd.a) {
                                        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
                                        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
                                        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
                                        try {
                                            java.lang.Object objE2 = agnVar2.e();
                                            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                                            bveVar2.x(objE2);
                                            objE = objE2;
                                        } catch (java.lang.Throwable th) {
                                            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                                            throw th;
                                        }
                                    }
                                    bveVar2.o();
                                }
                                java.lang.Object obj5 = obj2;
                                bveVar2.v(1378811975);
                                float f = true != defpackage.afga.f(objE, obj5) ? 0.0f : 1.0f;
                                bveVar2.o();
                                java.lang.Float fValueOf = java.lang.Float.valueOf(f);
                                boolean zC2 = bveVar2.C(agnVar2);
                                java.lang.Object objG2 = bveVar2.g();
                                if (zC2 || objG2 == defpackage.bvd.a) {
                                    defpackage.nz nzVar = new defpackage.nz(agnVar2, 6, null);
                                    defpackage.lam lamVar = defpackage.byp.a;
                                    objG2 = new defpackage.bvr(nzVar, null);
                                    bveVar2.x(objG2);
                                }
                                java.lang.Object objA = ((defpackage.bys) objG2).a();
                                bveVar2.v(1378811975);
                                float f2 = true == defpackage.afga.f(objA, obj5) ? 1.0f : 0.0f;
                                bveVar2.o();
                                java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
                                boolean zC3 = bveVar2.C(agnVar2);
                                java.lang.Object objG3 = bveVar2.g();
                                if (zC3 || objG3 == defpackage.bvd.a) {
                                    defpackage.bwf bwfVar = new defpackage.bwf(agnVar2, 1);
                                    defpackage.lam lamVar2 = defpackage.byp.a;
                                    objG3 = new defpackage.bvr(bwfVar, null);
                                    bveVar2.x(objG3);
                                }
                                defpackage.bys bysVarAf = defpackage.afw.af(agnVar2, fValueOf, fValueOf2, akmVar.invoke(((defpackage.bys) objG3).a(), bveVar2, 0), bilVar, bveVar2, 0);
                                boolean zC4 = bveVar2.C(bysVarAf);
                                java.lang.Object objG4 = bveVar2.g();
                                if (zC4 || objG4 == defpackage.bvd.a) {
                                    objG4 = new defpackage.aap(bysVarAf, 11);
                                    bveVar2.x(objG4);
                                }
                                defpackage.cjy cjyVar = new defpackage.cjy((defpackage.affc) objG4);
                                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                                long jB = bveVar2.b();
                                long j = jB ^ (jB >>> 32);
                                defpackage.cdd cddVarN = bveVar2.N();
                                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cjyVar);
                                defpackage.afer aferVar = defpackage.cwl.a;
                                bveVar2.M();
                                bveVar2.w();
                                if (bveVar2.G()) {
                                    bveVar2.j(aferVar);
                                } else {
                                    bveVar2.y();
                                }
                                defpackage.affh affhVar2 = affhVar;
                                defpackage.byw.c(bveVar2, ctyVarB, defpackage.cwl.e);
                                defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
                                defpackage.byw.a(bveVar2, java.lang.Integer.valueOf((int) j), defpackage.cwl.f);
                                bveVar2.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                                defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                                affhVar2.invoke(obj5, bveVar2, 0);
                                bveVar2.n();
                            } else {
                                bveVar2.s();
                            }
                            return defpackage.afbk.a;
                        }
                    }, bveVarC));
                }
                z = false;
                bwcVar.Y(false);
            }
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, z);
            long j = bwcVar.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.a(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bveVarC.v(-1312707512);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                java.lang.Object obj3 = list.get(i7);
                bwcVar.ab(1171574969, affcVar2.invoke(obj3), 0, null);
                defpackage.affg affgVar = (defpackage.affg) aauVar.a(obj3);
                if (affgVar == null) {
                    bveVarC.v(1959122128);
                } else {
                    bveVarC.v(1171576145);
                    affgVar.invoke(bveVarC, 0);
                }
                bwcVar.Y(false);
                bwcVar.Y(false);
            }
            bwcVar.Y(false);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
            affcVar2 = affcVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.ago(agnVar, cgfVar, afdVar, affcVar2, affhVar, i, 1);
        }
    }

    public static /* synthetic */ defpackage.cgf K(defpackage.cgf cgfVar, defpackage.afd afdVar, defpackage.affg affgVar, int i) {
        if ((i & 1) != 0) {
            afdVar = new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L));
        }
        if ((i & 2) != 0) {
            affgVar = null;
        }
        return defpackage.cjv.h(cgfVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479).a(new defpackage.adk(afdVar, defpackage.cfs.a, affgVar));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static void L(defpackage.aft aftVar, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, java.lang.String str, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.affh affhVar2;
        java.lang.String str2;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        int i5;
        int i6;
        int i7;
        int i8 = i & 6;
        defpackage.bve bveVarC = bveVar.c(657024243);
        if (i8 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(aftVar) : bveVarC.E(aftVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                if (true != bveVarC.C(acwVar)) {
                    i7 = 128;
                } else {
                    i7 = 256;
                }
                i3 |= i7;
            }
            if ((i & 3072) == 0) {
                if (true != bveVarC.C(acxVar)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i3 |= i6;
            }
            i4 = i3 | 24576;
            if ((196608 & i) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i5 = 65536;
                } else {
                    i5 = 131072;
                }
                i4 |= i5;
            } else {
                affhVar2 = affhVar;
            }
            if (bveVarC.I((74899 & i4) != 74898, i4 & 1)) {
                if (i9 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                defpackage.agn agnVarR = defpackage.afw.r(aftVar, "AnimatedVisibility", bveVarC, (i4 & 14) | ((i4 >> 9) & 112));
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(7);
                    bwcVar.ad(objS);
                }
                int i10 = i4 << 3;
                Q(agnVarR, (defpackage.affc) objS, cgfVar4, acwVar, acxVar, affhVar2, bveVarC, (i10 & 896) | 48 | (i10 & 7168) | (57344 & i10) | (i10 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                str2 = str;
                cgfVar3 = cgfVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abx(aftVar, cgfVar3, acwVar, acxVar, str2, affhVar, i, i2, 2);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        if ((i & 384) == 0) {
            if (true != bveVarC.C(acwVar)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i3 |= i7;
        }
        if ((i & 3072) == 0) {
            if (true != bveVarC.C(acxVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i3 |= i6;
        }
        i4 = i3 | 24576;
        if ((196608 & i) == 0) {
            affhVar2 = affhVar;
            if (true != bveVarC.E(affhVar2)) {
                i5 = 65536;
            } else {
                i5 = 131072;
            }
            i4 |= i5;
        } else {
            affhVar2 = affhVar;
        }
        if (bveVarC.I((74899 & i4) != 74898, i4 & 1)) {
            if (i9 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            defpackage.agn agnVarR2 = defpackage.afw.r(aftVar, "AnimatedVisibility", bveVarC, (i4 & 14) | ((i4 >> 9) & 112));
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.abj(7);
                bwcVar.ad(objS);
            }
            int i11 = i4 << 3;
            Q(agnVarR2, (defpackage.affc) objS, cgfVar4, acwVar, acxVar, affhVar2, bveVarC, (i11 & 896) | 48 | (i11 & 7168) | (57344 & i11) | (i11 & 3670016), 32);
            str2 = "AnimatedVisibility";
            cgfVar3 = cgfVar4;
        } else {
            bveVarC.s();
            str2 = str;
            cgfVar3 = cgfVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.abx(aftVar, cgfVar3, acwVar, acxVar, str2, affhVar, i, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0170  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static void M(final boolean z, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, java.lang.String str, final defpackage.affh affhVar, defpackage.bve bveVar, final int i, final int i2) {
        boolean z2;
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.acw acwVar2;
        int i5;
        int i6;
        defpackage.acx acxVar2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        final java.lang.String str2;
        final defpackage.cgf cgfVar3;
        final defpackage.acw acwVar3;
        final defpackage.acx acxVar3;
        defpackage.bxl bxlVarJ;
        int i10;
        defpackage.cgf cgfVar4;
        defpackage.acw acwVarA;
        defpackage.acx acxVarA;
        java.lang.String str3;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        int i11;
        int i12 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1448730565);
        if (i12 == 0) {
            z2 = z;
            i3 = (true != bveVarC.D(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    acwVar2 = acwVar;
                    if (true != bveVarC.C(acwVar2)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        acxVar2 = acxVar;
                        if (true != bveVarC.C(acxVar2)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            if (true != bveVarC.C(str)) {
                                i9 = 8192;
                            } else {
                                i9 = 16384;
                            }
                            i3 |= i9;
                        }
                        if ((196608 & i) == 0) {
                            if (true != bveVarC.E(affhVar)) {
                                i11 = 65536;
                            } else {
                                i11 = 131072;
                            }
                            i3 |= i11;
                        }
                        if ((74899 & i3) != 74898) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bveVarC.I(z3, i3 & 1)) {
                            if (i13 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                                i10 = i8;
                            } else {
                                i10 = i8;
                                cgfVar4 = cgfVar2;
                            }
                            int i14 = i3;
                            if (i4 != 0) {
                                acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                            } else {
                                acwVarA = acwVar2;
                            }
                            if (i6 != 0) {
                                defpackage.aga agaVar = defpackage.acs.a;
                                acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                            } else {
                                acxVarA = acxVar2;
                            }
                            if (i10 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            defpackage.agn agnVarP = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i14 & 14) | ((i14 >> 9) & 112), 0);
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(6);
                                bwcVar.ad(objS);
                            }
                            int i15 = i14 << 3;
                            Q(agnVarP, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016), 32);
                            str2 = str3;
                            cgfVar3 = cgfVar4;
                            acwVar3 = acwVarA;
                            acxVar3 = acxVarA;
                        } else {
                            bveVarC.s();
                            str2 = str;
                            cgfVar3 = cgfVar2;
                            acwVar3 = acwVar2;
                            acxVar3 = acxVar2;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: abv
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    boolean z4 = z;
                                    defpackage.cgf cgfVar5 = cgfVar3;
                                    int i16 = i | 1;
                                    int i17 = 306783378 & i16;
                                    int i18 = 613566756 & i16;
                                    defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 + i17) & i18), i2);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    if ((196608 & i) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bveVarC.I(z3, i3 & 1)) {
                        if (i13 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        int i16 = i3;
                        if (i4 != 0) {
                            acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                        } else {
                            acwVarA = acwVar2;
                        }
                        if (i6 != 0) {
                            defpackage.aga agaVar2 = defpackage.acs.a;
                            acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                        } else {
                            acxVarA = acxVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        defpackage.agn agnVarP2 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i16 & 14) | ((i16 >> 9) & 112), 0);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(6);
                            bwcVar.ad(objS);
                        }
                        int i17 = i16 << 3;
                        Q(agnVarP2, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016), 32);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        acwVar3 = acwVarA;
                        acxVar3 = acxVarA;
                    } else {
                        bveVarC.s();
                        str2 = str;
                        cgfVar3 = cgfVar2;
                        acwVar3 = acwVar2;
                        acxVar3 = acxVar2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abv
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                boolean z4 = z;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                int i18 = i | 1;
                                int i19 = 306783378 & i18;
                                int i110 = 613566756 & i18;
                                defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i18 & (-920350135)) | i19 | (i110 >> 1) | ((i19 + i19) & i110), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                acxVar2 = acxVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.C(str)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bveVarC.I(z3, i3 & 1)) {
                        if (i13 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        int i18 = i3;
                        if (i4 != 0) {
                            acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                        } else {
                            acwVarA = acwVar2;
                        }
                        if (i6 != 0) {
                            defpackage.aga agaVar3 = defpackage.acs.a;
                            acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                        } else {
                            acxVarA = acxVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        defpackage.agn agnVarP3 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i18 & 14) | ((i18 >> 9) & 112), 0);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(6);
                            bwcVar.ad(objS);
                        }
                        int i19 = i18 << 3;
                        Q(agnVarP3, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i19 & 896) | 48 | (i19 & 7168) | (57344 & i19) | (i19 & 3670016), 32);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        acwVar3 = acwVarA;
                        acxVar3 = acxVarA;
                    } else {
                        bveVarC.s();
                        str2 = str;
                        cgfVar3 = cgfVar2;
                        acwVar3 = acwVar2;
                        acxVar3 = acxVar2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abv
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                boolean z4 = z;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                int i110 = i | 1;
                                int i111 = 306783378 & i110;
                                int i112 = 613566756 & i110;
                                defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i110 & (-920350135)) | i111 | (i112 >> 1) | ((i111 + i111) & i112), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    int i110 = i3;
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                    } else {
                        acwVarA = acwVar2;
                    }
                    if (i6 != 0) {
                        defpackage.aga agaVar4 = defpackage.acs.a;
                        acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                    } else {
                        acxVarA = acxVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.agn agnVarP4 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i110 & 14) | ((i110 >> 9) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(6);
                        bwcVar.ad(objS);
                    }
                    int i111 = i110 << 3;
                    Q(agnVarP4, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i111 & 896) | 48 | (i111 & 7168) | (57344 & i111) | (i111 & 3670016), 32);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    acwVar3 = acwVarA;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    str2 = str;
                    cgfVar3 = cgfVar2;
                    acwVar3 = acwVar2;
                    acxVar3 = acxVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abv
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z4 = z;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            int i112 = i | 1;
                            int i113 = 306783378 & i112;
                            int i114 = 613566756 & i112;
                            defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i112 & (-920350135)) | i113 | (i114 >> 1) | ((i113 + i113) & i114), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 384;
            acwVar2 = acwVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    acxVar2 = acxVar;
                    if (true != bveVarC.C(acxVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.C(str)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bveVarC.I(z3, i3 & 1)) {
                        if (i13 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        int i112 = i3;
                        if (i4 != 0) {
                            acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                        } else {
                            acwVarA = acwVar2;
                        }
                        if (i6 != 0) {
                            defpackage.aga agaVar5 = defpackage.acs.a;
                            acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                        } else {
                            acxVarA = acxVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        defpackage.agn agnVarP5 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i112 & 14) | ((i112 >> 9) & 112), 0);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(6);
                            bwcVar.ad(objS);
                        }
                        int i113 = i112 << 3;
                        Q(agnVarP5, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i113 & 896) | 48 | (i113 & 7168) | (57344 & i113) | (i113 & 3670016), 32);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        acwVar3 = acwVarA;
                        acxVar3 = acxVarA;
                    } else {
                        bveVarC.s();
                        str2 = str;
                        cgfVar3 = cgfVar2;
                        acwVar3 = acwVar2;
                        acxVar3 = acxVar2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abv
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                boolean z4 = z;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                int i114 = i | 1;
                                int i115 = 306783378 & i114;
                                int i116 = 613566756 & i114;
                                defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i114 & (-920350135)) | i115 | (i116 >> 1) | ((i115 + i115) & i116), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    int i114 = i3;
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                    } else {
                        acwVarA = acwVar2;
                    }
                    if (i6 != 0) {
                        defpackage.aga agaVar6 = defpackage.acs.a;
                        acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                    } else {
                        acxVarA = acxVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.agn agnVarP6 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i114 & 14) | ((i114 >> 9) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(6);
                        bwcVar.ad(objS);
                    }
                    int i115 = i114 << 3;
                    Q(agnVarP6, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i115 & 896) | 48 | (i115 & 7168) | (57344 & i115) | (i115 & 3670016), 32);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    acwVar3 = acwVarA;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    str2 = str;
                    cgfVar3 = cgfVar2;
                    acwVar3 = acwVar2;
                    acxVar3 = acxVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abv
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z4 = z;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            int i116 = i | 1;
                            int i117 = 306783378 & i116;
                            int i118 = 613566756 & i116;
                            defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i116 & (-920350135)) | i117 | (i118 >> 1) | ((i117 + i117) & i118), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            acxVar2 = acxVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (true != bveVarC.C(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    int i116 = i3;
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                    } else {
                        acwVarA = acwVar2;
                    }
                    if (i6 != 0) {
                        defpackage.aga agaVar7 = defpackage.acs.a;
                        acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                    } else {
                        acxVarA = acxVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.agn agnVarP7 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i116 & 14) | ((i116 >> 9) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(6);
                        bwcVar.ad(objS);
                    }
                    int i117 = i116 << 3;
                    Q(agnVarP7, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i117 & 896) | 48 | (i117 & 7168) | (57344 & i117) | (i117 & 3670016), 32);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    acwVar3 = acwVarA;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    str2 = str;
                    cgfVar3 = cgfVar2;
                    acwVar3 = acwVar2;
                    acxVar3 = acxVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abv
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z4 = z;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            int i118 = i | 1;
                            int i119 = 306783378 & i118;
                            int i1110 = 613566756 & i118;
                            defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i118 & (-920350135)) | i119 | (i1110 >> 1) | ((i119 + i119) & i1110), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i10 = i8;
                } else {
                    i10 = i8;
                    cgfVar4 = cgfVar2;
                }
                int i118 = i3;
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                } else {
                    acwVarA = acwVar2;
                }
                if (i6 != 0) {
                    defpackage.aga agaVar8 = defpackage.acs.a;
                    acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                } else {
                    acxVarA = acxVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                defpackage.agn agnVarP8 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i118 & 14) | ((i118 >> 9) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(6);
                    bwcVar.ad(objS);
                }
                int i119 = i118 << 3;
                Q(agnVarP8, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i119 & 896) | 48 | (i119 & 7168) | (57344 & i119) | (i119 & 3670016), 32);
                str2 = str3;
                cgfVar3 = cgfVar4;
                acwVar3 = acwVarA;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                str2 = str;
                cgfVar3 = cgfVar2;
                acwVar3 = acwVar2;
                acxVar3 = acxVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abv
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        boolean z4 = z;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        int i1110 = i | 1;
                        int i1111 = 306783378 & i1110;
                        int i1112 = 613566756 & i1110;
                        defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i1110 & (-920350135)) | i1111 | (i1112 >> 1) | ((i1111 + i1111) & i1112), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                acwVar2 = acwVar;
                if (true != bveVarC.C(acwVar2)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    acxVar2 = acxVar;
                    if (true != bveVarC.C(acxVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.C(str)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bveVarC.I(z3, i3 & 1)) {
                        if (i13 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        int i1110 = i3;
                        if (i4 != 0) {
                            acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                        } else {
                            acwVarA = acwVar2;
                        }
                        if (i6 != 0) {
                            defpackage.aga agaVar9 = defpackage.acs.a;
                            acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                        } else {
                            acxVarA = acxVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        defpackage.agn agnVarP9 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i1110 & 14) | ((i1110 >> 9) & 112), 0);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(6);
                            bwcVar.ad(objS);
                        }
                        int i1111 = i1110 << 3;
                        Q(agnVarP9, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i1111 & 896) | 48 | (i1111 & 7168) | (57344 & i1111) | (i1111 & 3670016), 32);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        acwVar3 = acwVarA;
                        acxVar3 = acxVarA;
                    } else {
                        bveVarC.s();
                        str2 = str;
                        cgfVar3 = cgfVar2;
                        acwVar3 = acwVar2;
                        acxVar3 = acxVar2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abv
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                boolean z4 = z;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                int i1112 = i | 1;
                                int i1113 = 306783378 & i1112;
                                int i1114 = 613566756 & i1112;
                                defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i1112 & (-920350135)) | i1113 | (i1114 >> 1) | ((i1113 + i1113) & i1114), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    int i1112 = i3;
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                    } else {
                        acwVarA = acwVar2;
                    }
                    if (i6 != 0) {
                        defpackage.aga agaVar10 = defpackage.acs.a;
                        acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                    } else {
                        acxVarA = acxVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.agn agnVarP10 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i1112 & 14) | ((i1112 >> 9) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(6);
                        bwcVar.ad(objS);
                    }
                    int i1113 = i1112 << 3;
                    Q(agnVarP10, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i1113 & 896) | 48 | (i1113 & 7168) | (57344 & i1113) | (i1113 & 3670016), 32);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    acwVar3 = acwVarA;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    str2 = str;
                    cgfVar3 = cgfVar2;
                    acwVar3 = acwVar2;
                    acxVar3 = acxVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abv
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z4 = z;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            int i1114 = i | 1;
                            int i1115 = 306783378 & i1114;
                            int i1116 = 613566756 & i1114;
                            defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i1114 & (-920350135)) | i1115 | (i1116 >> 1) | ((i1115 + i1115) & i1116), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            acxVar2 = acxVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (true != bveVarC.C(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    int i1114 = i3;
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                    } else {
                        acwVarA = acwVar2;
                    }
                    if (i6 != 0) {
                        defpackage.aga agaVar11 = defpackage.acs.a;
                        acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                    } else {
                        acxVarA = acxVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.agn agnVarP11 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i1114 & 14) | ((i1114 >> 9) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(6);
                        bwcVar.ad(objS);
                    }
                    int i1115 = i1114 << 3;
                    Q(agnVarP11, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i1115 & 896) | 48 | (i1115 & 7168) | (57344 & i1115) | (i1115 & 3670016), 32);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    acwVar3 = acwVarA;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    str2 = str;
                    cgfVar3 = cgfVar2;
                    acwVar3 = acwVar2;
                    acxVar3 = acxVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abv
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z4 = z;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            int i1116 = i | 1;
                            int i1117 = 306783378 & i1116;
                            int i1118 = 613566756 & i1116;
                            defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i1116 & (-920350135)) | i1117 | (i1118 >> 1) | ((i1117 + i1117) & i1118), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i10 = i8;
                } else {
                    i10 = i8;
                    cgfVar4 = cgfVar2;
                }
                int i1116 = i3;
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                } else {
                    acwVarA = acwVar2;
                }
                if (i6 != 0) {
                    defpackage.aga agaVar12 = defpackage.acs.a;
                    acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                } else {
                    acxVarA = acxVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                defpackage.agn agnVarP12 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i1116 & 14) | ((i1116 >> 9) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(6);
                    bwcVar.ad(objS);
                }
                int i1117 = i1116 << 3;
                Q(agnVarP12, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i1117 & 896) | 48 | (i1117 & 7168) | (57344 & i1117) | (i1117 & 3670016), 32);
                str2 = str3;
                cgfVar3 = cgfVar4;
                acwVar3 = acwVarA;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                str2 = str;
                cgfVar3 = cgfVar2;
                acwVar3 = acwVar2;
                acxVar3 = acxVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abv
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        boolean z4 = z;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        int i1118 = i | 1;
                        int i1119 = 306783378 & i1118;
                        int i11110 = 613566756 & i1118;
                        defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i1118 & (-920350135)) | i1119 | (i11110 >> 1) | ((i1119 + i1119) & i11110), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 384;
        acwVar2 = acwVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                acxVar2 = acxVar;
                if (true != bveVarC.C(acxVar2)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (true != bveVarC.C(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    int i1118 = i3;
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                    } else {
                        acwVarA = acwVar2;
                    }
                    if (i6 != 0) {
                        defpackage.aga agaVar13 = defpackage.acs.a;
                        acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                    } else {
                        acxVarA = acxVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    defpackage.agn agnVarP13 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i1118 & 14) | ((i1118 >> 9) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(6);
                        bwcVar.ad(objS);
                    }
                    int i1119 = i1118 << 3;
                    Q(agnVarP13, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i1119 & 896) | 48 | (i1119 & 7168) | (57344 & i1119) | (i1119 & 3670016), 32);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    acwVar3 = acwVarA;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    str2 = str;
                    cgfVar3 = cgfVar2;
                    acwVar3 = acwVar2;
                    acxVar3 = acxVar2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abv
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            boolean z4 = z;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            int i11110 = i | 1;
                            int i11111 = 306783378 & i11110;
                            int i11112 = 613566756 & i11110;
                            defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i11110 & (-920350135)) | i11111 | (i11112 >> 1) | ((i11111 + i11111) & i11112), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i10 = i8;
                } else {
                    i10 = i8;
                    cgfVar4 = cgfVar2;
                }
                int i11110 = i3;
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                } else {
                    acwVarA = acwVar2;
                }
                if (i6 != 0) {
                    defpackage.aga agaVar14 = defpackage.acs.a;
                    acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                } else {
                    acxVarA = acxVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                defpackage.agn agnVarP14 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i11110 & 14) | ((i11110 >> 9) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(6);
                    bwcVar.ad(objS);
                }
                int i11111 = i11110 << 3;
                Q(agnVarP14, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i11111 & 896) | 48 | (i11111 & 7168) | (57344 & i11111) | (i11111 & 3670016), 32);
                str2 = str3;
                cgfVar3 = cgfVar4;
                acwVar3 = acwVarA;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                str2 = str;
                cgfVar3 = cgfVar2;
                acwVar3 = acwVar2;
                acxVar3 = acxVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abv
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        boolean z4 = z;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        int i11112 = i | 1;
                        int i11113 = 306783378 & i11112;
                        int i11114 = 613566756 & i11112;
                        defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i11112 & (-920350135)) | i11113 | (i11114 >> 1) | ((i11113 + i11113) & i11114), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 3072;
        acxVar2 = acxVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                if (true != bveVarC.C(str)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i10 = i8;
                } else {
                    i10 = i8;
                    cgfVar4 = cgfVar2;
                }
                int i11112 = i3;
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
                } else {
                    acwVarA = acwVar2;
                }
                if (i6 != 0) {
                    defpackage.aga agaVar15 = defpackage.acs.a;
                    acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
                } else {
                    acxVarA = acxVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                defpackage.agn agnVarP15 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i11112 & 14) | ((i11112 >> 9) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(6);
                    bwcVar.ad(objS);
                }
                int i11113 = i11112 << 3;
                Q(agnVarP15, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i11113 & 896) | 48 | (i11113 & 7168) | (57344 & i11113) | (i11113 & 3670016), 32);
                str2 = str3;
                cgfVar3 = cgfVar4;
                acwVar3 = acwVarA;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                str2 = str;
                cgfVar3 = cgfVar2;
                acwVar3 = acwVar2;
                acxVar3 = acxVar2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abv
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        boolean z4 = z;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        int i11114 = i | 1;
                        int i11115 = 306783378 & i11114;
                        int i11116 = 613566756 & i11114;
                        defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i11114 & (-920350135)) | i11115 | (i11116 >> 1) | ((i11115 + i11115) & i11116), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 24576;
        if ((196608 & i) == 0) {
            if (true != bveVarC.E(affhVar)) {
                i11 = 65536;
            } else {
                i11 = 131072;
            }
            i3 |= i11;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i3 & 1)) {
            if (i13 != 0) {
                cgfVar4 = defpackage.cgf.e;
                i10 = i8;
            } else {
                i10 = i8;
                cgfVar4 = cgfVar2;
            }
            int i11114 = i3;
            if (i4 != 0) {
                acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.o(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.acq(1)));
            } else {
                acwVarA = acwVar2;
            }
            if (i6 != 0) {
                defpackage.aga agaVar16 = defpackage.acs.a;
                acxVarA = defpackage.acs.t(new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)), defpackage.cfs.i, new defpackage.abj(12)).a(defpackage.acs.A(null, 3));
            } else {
                acxVarA = acxVar2;
            }
            if (i10 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            defpackage.agn agnVarP16 = defpackage.afw.p(java.lang.Boolean.valueOf(z2), str3, bveVarC, (i11114 & 14) | ((i11114 >> 9) & 112), 0);
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.abj(6);
                bwcVar.ad(objS);
            }
            int i11115 = i11114 << 3;
            Q(agnVarP16, (defpackage.affc) objS, cgfVar4, acwVarA, acxVarA, affhVar, bveVarC, (i11115 & 896) | 48 | (i11115 & 7168) | (57344 & i11115) | (i11115 & 3670016), 32);
            str2 = str3;
            cgfVar3 = cgfVar4;
            acwVar3 = acwVarA;
            acxVar3 = acxVarA;
        } else {
            bveVarC.s();
            str2 = str;
            cgfVar3 = cgfVar2;
            acwVar3 = acwVar2;
            acxVar3 = acxVar2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: abv
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    boolean z4 = z;
                    defpackage.cgf cgfVar5 = cgfVar3;
                    int i11116 = i | 1;
                    int i11117 = 306783378 & i11116;
                    int i11118 = 613566756 & i11116;
                    defpackage.ca.M(z4, cgfVar5, acwVar3, acxVar3, str2, affhVar, bveVar2, (i11116 & (-920350135)) | i11117 | (i11118 >> 1) | ((i11117 + i11117) & i11118), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static void N(defpackage.awd awdVar, boolean z, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, java.lang.String str, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.acw acwVarA;
        int i5;
        int i6;
        defpackage.acx acxVar2;
        int i7;
        int i8;
        defpackage.affh affhVar2;
        defpackage.cgf cgfVar3;
        defpackage.acw acwVar2;
        defpackage.acx acxVar3;
        java.lang.String str2;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        defpackage.acx acxVarA;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        int i9;
        int i10 = i & 48;
        defpackage.bve bveVarC = bveVar.c(234057107);
        if (i10 == 0) {
            i3 = (true != bveVarC.D(z) ? 16 : 32) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    acwVarA = acwVar;
                    if (true != bveVarC.C(acwVarA)) {
                        i5 = 1024;
                    } else {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        acxVar2 = acxVar;
                        if (true != bveVarC.C(acxVar2)) {
                            i7 = 8192;
                        } else {
                            i7 = 16384;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 196608;
                    if ((1572864 & i) == 0) {
                        affhVar2 = affhVar;
                        if (true != bveVarC.E(affhVar2)) {
                            i9 = 524288;
                        } else {
                            i9 = 1048576;
                        }
                        i8 |= i9;
                    } else {
                        affhVar2 = affhVar;
                    }
                    if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                        if (i11 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
                        }
                        if (i6 != 0) {
                            acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
                        } else {
                            acxVarA = acxVar2;
                        }
                        defpackage.agn agnVarP = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(8);
                            bwcVar.ad(objS);
                        }
                        defpackage.affc affcVar = (defpackage.affc) objS;
                        defpackage.acw acwVar3 = acwVarA;
                        Q(agnVarP, affcVar, cgfVar4, acwVar3, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                        str2 = "AnimatedVisibility";
                        cgfVar3 = cgfVar4;
                        acwVar2 = acwVar3;
                        acxVar3 = acxVarA;
                    } else {
                        bveVarC.s();
                        cgfVar3 = cgfVar2;
                        acwVar2 = acwVarA;
                        acxVar3 = acxVar2;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
                    }
                }
                i3 |= 24576;
                acxVar2 = acxVar;
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    affhVar2 = affhVar;
                    if (true != bveVarC.E(affhVar2)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i8 |= i9;
                } else {
                    affhVar2 = affhVar;
                }
                if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
                    }
                    if (i6 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
                    } else {
                        acxVarA = acxVar2;
                    }
                    defpackage.agn agnVarP2 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(8);
                        bwcVar.ad(objS);
                    }
                    defpackage.affc affcVar2 = (defpackage.affc) objS;
                    defpackage.acw acwVar4 = acwVarA;
                    Q(agnVarP2, affcVar2, cgfVar4, acwVar4, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVar4;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    acwVar2 = acwVarA;
                    acxVar3 = acxVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
                }
            }
            i3 |= 3072;
            acwVarA = acwVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    acxVar2 = acxVar;
                    if (true != bveVarC.C(acxVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    affhVar2 = affhVar;
                    if (true != bveVarC.E(affhVar2)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i8 |= i9;
                } else {
                    affhVar2 = affhVar;
                }
                if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
                    }
                    if (i6 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
                    } else {
                        acxVarA = acxVar2;
                    }
                    defpackage.agn agnVarP3 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(8);
                        bwcVar.ad(objS);
                    }
                    defpackage.affc affcVar3 = (defpackage.affc) objS;
                    defpackage.acw acwVar5 = acwVarA;
                    Q(agnVarP3, affcVar3, cgfVar4, acwVar5, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVar5;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    acwVar2 = acwVarA;
                    acxVar3 = acxVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
                }
            }
            i3 |= 24576;
            acxVar2 = acxVar;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i8 |= i9;
            } else {
                affhVar2 = affhVar;
            }
            if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
                }
                if (i6 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
                } else {
                    acxVarA = acxVar2;
                }
                defpackage.agn agnVarP4 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(8);
                    bwcVar.ad(objS);
                }
                defpackage.affc affcVar4 = (defpackage.affc) objS;
                defpackage.acw acwVar6 = acwVarA;
                Q(agnVarP4, affcVar4, cgfVar4, acwVar6, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cgfVar3 = cgfVar4;
                acwVar2 = acwVar6;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                acwVar2 = acwVarA;
                acxVar3 = acxVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
            }
        }
        i3 |= 384;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                acwVarA = acwVar;
                if (true != bveVarC.C(acwVarA)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    acxVar2 = acxVar;
                    if (true != bveVarC.C(acxVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    affhVar2 = affhVar;
                    if (true != bveVarC.E(affhVar2)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i8 |= i9;
                } else {
                    affhVar2 = affhVar;
                }
                if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
                    }
                    if (i6 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
                    } else {
                        acxVarA = acxVar2;
                    }
                    defpackage.agn agnVarP5 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(8);
                        bwcVar.ad(objS);
                    }
                    defpackage.affc affcVar5 = (defpackage.affc) objS;
                    defpackage.acw acwVar7 = acwVarA;
                    Q(agnVarP5, affcVar5, cgfVar4, acwVar7, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVar7;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    acwVar2 = acwVarA;
                    acxVar3 = acxVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
                }
            }
            i3 |= 24576;
            acxVar2 = acxVar;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i8 |= i9;
            } else {
                affhVar2 = affhVar;
            }
            if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
                }
                if (i6 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
                } else {
                    acxVarA = acxVar2;
                }
                defpackage.agn agnVarP6 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(8);
                    bwcVar.ad(objS);
                }
                defpackage.affc affcVar6 = (defpackage.affc) objS;
                defpackage.acw acwVar8 = acwVarA;
                Q(agnVarP6, affcVar6, cgfVar4, acwVar8, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cgfVar3 = cgfVar4;
                acwVar2 = acwVar8;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                acwVar2 = acwVarA;
                acxVar3 = acxVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
            }
        }
        i3 |= 3072;
        acwVarA = acwVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                acxVar2 = acxVar;
                if (true != bveVarC.C(acxVar2)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i8 |= i9;
            } else {
                affhVar2 = affhVar;
            }
            if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
                }
                if (i6 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
                } else {
                    acxVarA = acxVar2;
                }
                defpackage.agn agnVarP7 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(8);
                    bwcVar.ad(objS);
                }
                defpackage.affc affcVar7 = (defpackage.affc) objS;
                defpackage.acw acwVar9 = acwVarA;
                Q(agnVarP7, affcVar7, cgfVar4, acwVar9, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cgfVar3 = cgfVar4;
                acwVar2 = acwVar9;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                acwVar2 = acwVarA;
                acxVar3 = acxVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
            }
        }
        i3 |= 24576;
        acxVar2 = acxVar;
        i8 = i3 | 196608;
        if ((1572864 & i) == 0) {
            affhVar2 = affhVar;
            if (true != bveVarC.E(affhVar2)) {
                i9 = 524288;
            } else {
                i9 = 1048576;
            }
            i8 |= i9;
        } else {
            affhVar2 = affhVar;
        }
        if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
            if (i11 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.n(null, null, 15));
            }
            if (i6 != 0) {
                acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.s(null, null, 15));
            } else {
                acxVarA = acxVar2;
            }
            defpackage.agn agnVarP8 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.abj(8);
                bwcVar.ad(objS);
            }
            defpackage.affc affcVar8 = (defpackage.affc) objS;
            defpackage.acw acwVar10 = acwVarA;
            Q(agnVarP8, affcVar8, cgfVar4, acwVar10, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
            str2 = "AnimatedVisibility";
            cgfVar3 = cgfVar4;
            acwVar2 = acwVar10;
            acxVar3 = acxVarA;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            acwVar2 = acwVarA;
            acxVar3 = acxVar2;
            str2 = str;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.abz(awdVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 1);
        }
    }

    public static boolean O(defpackage.agn agnVar) {
        java.lang.Object objE = agnVar.e();
        defpackage.acj acjVar = defpackage.acj.c;
        return objE == acjVar && agnVar.g() == acjVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static void P(defpackage.atx atxVar, boolean z, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, java.lang.String str, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.acw acwVarA;
        int i5;
        int i6;
        defpackage.acx acxVar2;
        int i7;
        int i8;
        defpackage.affh affhVar2;
        defpackage.cgf cgfVar3;
        defpackage.acw acwVar2;
        defpackage.acx acxVar3;
        java.lang.String str2;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        defpackage.acx acxVarA;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        int i9;
        int i10 = i & 48;
        defpackage.bve bveVarC = bveVar.c(1799879339);
        if (i10 == 0) {
            i3 = (true != bveVarC.D(z) ? 16 : 32) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    acwVarA = acwVar;
                    if (true != bveVarC.C(acwVarA)) {
                        i5 = 1024;
                    } else {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        acxVar2 = acxVar;
                        if (true != bveVarC.C(acxVar2)) {
                            i7 = 8192;
                        } else {
                            i7 = 16384;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 196608;
                    if ((1572864 & i) == 0) {
                        affhVar2 = affhVar;
                        if (true != bveVarC.E(affhVar2)) {
                            i9 = 524288;
                        } else {
                            i9 = 1048576;
                        }
                        i8 |= i9;
                    } else {
                        affhVar2 = affhVar;
                    }
                    if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                        if (i11 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
                        }
                        if (i6 != 0) {
                            acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
                        } else {
                            acxVarA = acxVar2;
                        }
                        defpackage.agn agnVarP = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(9);
                            bwcVar.ad(objS);
                        }
                        defpackage.affc affcVar = (defpackage.affc) objS;
                        defpackage.acw acwVar3 = acwVarA;
                        Q(agnVarP, affcVar, cgfVar4, acwVar3, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                        str2 = "AnimatedVisibility";
                        cgfVar3 = cgfVar4;
                        acwVar2 = acwVar3;
                        acxVar3 = acxVarA;
                    } else {
                        bveVarC.s();
                        cgfVar3 = cgfVar2;
                        acwVar2 = acwVarA;
                        acxVar3 = acxVar2;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
                    }
                }
                i3 |= 24576;
                acxVar2 = acxVar;
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    affhVar2 = affhVar;
                    if (true != bveVarC.E(affhVar2)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i8 |= i9;
                } else {
                    affhVar2 = affhVar;
                }
                if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
                    }
                    if (i6 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
                    } else {
                        acxVarA = acxVar2;
                    }
                    defpackage.agn agnVarP2 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(9);
                        bwcVar.ad(objS);
                    }
                    defpackage.affc affcVar2 = (defpackage.affc) objS;
                    defpackage.acw acwVar4 = acwVarA;
                    Q(agnVarP2, affcVar2, cgfVar4, acwVar4, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVar4;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    acwVar2 = acwVarA;
                    acxVar3 = acxVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
                }
            }
            i3 |= 3072;
            acwVarA = acwVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    acxVar2 = acxVar;
                    if (true != bveVarC.C(acxVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    affhVar2 = affhVar;
                    if (true != bveVarC.E(affhVar2)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i8 |= i9;
                } else {
                    affhVar2 = affhVar;
                }
                if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
                    }
                    if (i6 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
                    } else {
                        acxVarA = acxVar2;
                    }
                    defpackage.agn agnVarP3 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(9);
                        bwcVar.ad(objS);
                    }
                    defpackage.affc affcVar3 = (defpackage.affc) objS;
                    defpackage.acw acwVar5 = acwVarA;
                    Q(agnVarP3, affcVar3, cgfVar4, acwVar5, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVar5;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    acwVar2 = acwVarA;
                    acxVar3 = acxVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
                }
            }
            i3 |= 24576;
            acxVar2 = acxVar;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i8 |= i9;
            } else {
                affhVar2 = affhVar;
            }
            if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
                }
                if (i6 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
                } else {
                    acxVarA = acxVar2;
                }
                defpackage.agn agnVarP4 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(9);
                    bwcVar.ad(objS);
                }
                defpackage.affc affcVar4 = (defpackage.affc) objS;
                defpackage.acw acwVar6 = acwVarA;
                Q(agnVarP4, affcVar4, cgfVar4, acwVar6, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cgfVar3 = cgfVar4;
                acwVar2 = acwVar6;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                acwVar2 = acwVarA;
                acxVar3 = acxVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
            }
        }
        i3 |= 384;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                acwVarA = acwVar;
                if (true != bveVarC.C(acwVarA)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    acxVar2 = acxVar;
                    if (true != bveVarC.C(acxVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    affhVar2 = affhVar;
                    if (true != bveVarC.E(affhVar2)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i8 |= i9;
                } else {
                    affhVar2 = affhVar;
                }
                if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                    if (i11 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
                    }
                    if (i6 != 0) {
                        acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
                    } else {
                        acxVarA = acxVar2;
                    }
                    defpackage.agn agnVarP5 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(9);
                        bwcVar.ad(objS);
                    }
                    defpackage.affc affcVar5 = (defpackage.affc) objS;
                    defpackage.acw acwVar7 = acwVarA;
                    Q(agnVarP5, affcVar5, cgfVar4, acwVar7, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                    str2 = "AnimatedVisibility";
                    cgfVar3 = cgfVar4;
                    acwVar2 = acwVar7;
                    acxVar3 = acxVarA;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    acwVar2 = acwVarA;
                    acxVar3 = acxVar2;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
                }
            }
            i3 |= 24576;
            acxVar2 = acxVar;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i8 |= i9;
            } else {
                affhVar2 = affhVar;
            }
            if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
                }
                if (i6 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
                } else {
                    acxVarA = acxVar2;
                }
                defpackage.agn agnVarP6 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(9);
                    bwcVar.ad(objS);
                }
                defpackage.affc affcVar6 = (defpackage.affc) objS;
                defpackage.acw acwVar8 = acwVarA;
                Q(agnVarP6, affcVar6, cgfVar4, acwVar8, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cgfVar3 = cgfVar4;
                acwVar2 = acwVar8;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                acwVar2 = acwVarA;
                acxVar3 = acxVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
            }
        }
        i3 |= 3072;
        acwVarA = acwVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                acxVar2 = acxVar;
                if (true != bveVarC.C(acxVar2)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                affhVar2 = affhVar;
                if (true != bveVarC.E(affhVar2)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i8 |= i9;
            } else {
                affhVar2 = affhVar;
            }
            if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
                if (i11 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
                }
                if (i6 != 0) {
                    acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
                } else {
                    acxVarA = acxVar2;
                }
                defpackage.agn agnVarP7 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(9);
                    bwcVar.ad(objS);
                }
                defpackage.affc affcVar7 = (defpackage.affc) objS;
                defpackage.acw acwVar9 = acwVarA;
                Q(agnVarP7, affcVar7, cgfVar4, acwVar9, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
                str2 = "AnimatedVisibility";
                cgfVar3 = cgfVar4;
                acwVar2 = acwVar9;
                acxVar3 = acxVarA;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                acwVar2 = acwVarA;
                acxVar3 = acxVar2;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
            }
        }
        i3 |= 24576;
        acxVar2 = acxVar;
        i8 = i3 | 196608;
        if ((1572864 & i) == 0) {
            affhVar2 = affhVar;
            if (true != bveVarC.E(affhVar2)) {
                i9 = 524288;
            } else {
                i9 = 1048576;
            }
            i8 |= i9;
        } else {
            affhVar2 = affhVar;
        }
        if (bveVarC.I((599185 & i8) != 599184, i8 & 1)) {
            if (i11 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                acwVarA = defpackage.acs.z(null, 3).a(defpackage.acs.p(null, 15));
            }
            if (i6 != 0) {
                acxVarA = defpackage.acs.A(null, 3).a(defpackage.acs.u(null, 15));
            } else {
                acxVarA = acxVar2;
            }
            defpackage.agn agnVarP8 = defpackage.afw.p(java.lang.Boolean.valueOf(z), "AnimatedVisibility", bveVarC, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.abj(9);
                bwcVar.ad(objS);
            }
            defpackage.affc affcVar8 = (defpackage.affc) objS;
            defpackage.acw acwVar10 = acwVarA;
            Q(agnVarP8, affcVar8, cgfVar4, acwVar10, acxVarA, affhVar2, bveVarC, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
            str2 = "AnimatedVisibility";
            cgfVar3 = cgfVar4;
            acwVar2 = acwVar10;
            acxVar3 = acxVarA;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            acwVar2 = acwVarA;
            acxVar3 = acxVar2;
            str2 = str;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.abz(atxVar, z, cgfVar3, acwVar2, acxVar3, str2, affhVar, i, i2, 0);
        }
    }

    public static void Q(defpackage.agn agnVar, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.acw acwVar2;
        defpackage.affh affhVar2;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-497872534);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != bveVarC.C(agnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            acwVar2 = acwVar;
            i3 |= true != bveVarC.C(acwVar2) ? 1024 : 2048;
        } else {
            acwVar2 = acwVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.C(acxVar) ? 8192 : 16384;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != bveVarC.E(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            affhVar2 = affhVar;
            i3 |= true != bveVarC.E(affhVar2) ? 524288 : 1048576;
        } else {
            affhVar2 = affhVar;
        }
        if (bveVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int i6 = i3 & 112;
            boolean z = i6 == 32;
            int i7 = i3 & 14;
            boolean z2 = i7 == 4;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if ((z2 | z) || objS == defpackage.bvd.a) {
                objS = new defpackage.aly(affcVar, agnVar, i5);
                bwcVar.ad(objS);
            }
            defpackage.cgf cgfVarA = cgfVar.a(new defpackage.ctd((defpackage.affh) objS));
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.abw(0);
                bwcVar.ad(objS2);
            }
            int i8 = i7 | 196608;
            defpackage.affg affgVar = (defpackage.affg) objS2;
            defpackage.acw acwVar3 = acwVar2;
            ai(agnVar, affcVar, cgfVarA, acwVar3, acxVar, affgVar, null, false, affhVar2, bveVarC, i8 | i6 | (i3 & 7168) | (57344 & i3) | (29360128 & (i3 << 6)) | ((i3 << 9) & 1879048192), 320);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.abx(agnVar, affcVar, cgfVar, acwVar, acxVar, affhVar, i, i2, 0);
        }
    }

    public static defpackage.acj R(defpackage.agn agnVar, defpackage.affc affcVar, java.lang.Object obj, defpackage.bve bveVar) {
        defpackage.acj acjVar;
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        bwcVar.ab(-422486566, agnVar, 0, null);
        if (agnVar.w()) {
            bveVar.v(-212166497);
            bwcVar.Y(false);
            if (((java.lang.Boolean) affcVar.invoke(obj)).booleanValue()) {
                acjVar = defpackage.acj.b;
            } else {
                acjVar = ((java.lang.Boolean) affcVar.invoke(agnVar.e())).booleanValue() ? defpackage.acj.c : defpackage.acj.a;
            }
        } else {
            bveVar.v(-211886815);
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            java.lang.Object objF = agnVar.f();
            if (((java.lang.Boolean) affcVar.invoke(agnVar.e())).booleanValue() || (objF != null && ((java.lang.Boolean) affcVar.invoke(objF)).booleanValue())) {
                bwxVar.b(java.lang.Boolean.TRUE);
            }
            if (((java.lang.Boolean) affcVar.invoke(obj)).booleanValue()) {
                acjVar = defpackage.acj.b;
            } else {
                acjVar = ((objF == null || !((java.lang.Boolean) affcVar.invoke(objF)).booleanValue()) && ((java.lang.Boolean) bwxVar.a()).booleanValue()) ? defpackage.acj.c : defpackage.acj.a;
            }
            bwcVar.Y(false);
        }
        bwcVar.Y(false);
        return acjVar;
    }

    public static void S(final defpackage.agn agnVar, final defpackage.affc affcVar, defpackage.cgf cgfVar, final defpackage.acw acwVar, final defpackage.acx acxVar, final defpackage.affh affhVar, defpackage.bve bveVar, final int i) {
        defpackage.agn agnVar2;
        int i2;
        defpackage.acw acwVar2;
        final defpackage.cgf cgfVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1699747442);
        if (i3 == 0) {
            agnVar2 = agnVar;
            i2 = (true != bveVarC.C(agnVar2) ? 2 : 4) | i;
        } else {
            agnVar2 = agnVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            acwVar2 = acwVar;
            i4 |= true != bveVarC.C(acwVar2) ? 1024 : 2048;
        } else {
            acwVar2 = acwVar;
        }
        if ((i & 24576) == 0) {
            i4 |= true != bveVarC.C(acxVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i4 |= true != bveVarC.E(affhVar) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i4) != 74898, i4 & 1)) {
            int i5 = i4 & 7168;
            int i6 = 57344 & i4;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            Q(agnVar2, affcVar, cgcVar, acwVar2, acxVar, affhVar, bveVarC, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | i5 | i6 | ((i4 << 3) & 3670016), 0);
            cgfVar2 = cgcVar;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: aby
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.agn agnVar3 = agnVar;
                    defpackage.affc affcVar2 = affcVar;
                    int i7 = i | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    defpackage.ca.S(agnVar3, affcVar2, cgfVar2, acwVar, acxVar, affhVar, bveVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static void U(defpackage.agn agnVar, defpackage.cgf cgfVar, defpackage.affc affcVar, defpackage.cfu cfuVar, defpackage.affc affcVar2, defpackage.affi affiVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.agn agnVar2;
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.affc affcVar3;
        int i5;
        int i6;
        int i7;
        boolean z;
        defpackage.cfu cfuVar2;
        defpackage.cgf cgfVar3;
        defpackage.affc affcVar4;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        int i8;
        defpackage.affc affcVar5;
        defpackage.cfu cfuVar3;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        defpackage.bwc bwcVar2;
        java.lang.Object objS2;
        int i9;
        int i10;
        int i11 = i & 6;
        defpackage.bve bveVarC = bveVar.c(511725103);
        int i12 = 1;
        if (i11 == 0) {
            agnVar2 = agnVar;
            i3 = (true != bveVarC.C(agnVar2) ? 2 : 4) | i;
        } else {
            agnVar2 = agnVar;
            i3 = i;
        }
        int i13 = i2 & 1;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    affcVar3 = affcVar;
                    if (true != bveVarC.E(affcVar3)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 4;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        if (true != bveVarC.C(cfuVar)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.E(affcVar2)) {
                            i10 = 8192;
                        } else {
                            i10 = 16384;
                        }
                        i3 |= i10;
                    }
                    if ((i & 196608) == 0) {
                        if (true != bveVarC.E(affiVar)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i3 |= i9;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i13 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        i8 = 3;
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i8);
                                bwcVar2.ad(objS2);
                            }
                            affcVar5 = (defpackage.affc) objS2;
                        } else {
                            affcVar5 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(i12);
                            bwcVar.ad(objS);
                        }
                        int i14 = 57344 & i3;
                        X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i14 | ((i3 << 3) & 3670016));
                        cgfVar3 = cgfVar4;
                        affcVar4 = affcVar5;
                        cfuVar2 = cfuVar3;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar4 = affcVar3;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
                    }
                }
                i3 |= 3072;
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affcVar2)) {
                        i10 = 8192;
                    } else {
                        i10 = 16384;
                    }
                    i3 |= i10;
                }
                if ((i & 196608) == 0) {
                    if (true != bveVarC.E(affiVar)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    i8 = 3;
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i8);
                            bwcVar2.ad(objS2);
                        }
                        affcVar5 = (defpackage.affc) objS2;
                    } else {
                        affcVar5 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(i12);
                        bwcVar.ad(objS);
                    }
                    int i15 = 57344 & i3;
                    X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i15 | ((i3 << 3) & 3670016));
                    cgfVar3 = cgfVar4;
                    affcVar4 = affcVar5;
                    cfuVar2 = cfuVar3;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar4 = affcVar3;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
                }
            }
            i3 |= 384;
            affcVar3 = affcVar;
            i6 = i2 & 4;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (true != bveVarC.C(cfuVar)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affcVar2)) {
                        i10 = 8192;
                    } else {
                        i10 = 16384;
                    }
                    i3 |= i10;
                }
                if ((i & 196608) == 0) {
                    if (true != bveVarC.E(affiVar)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    i8 = 3;
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i8);
                            bwcVar2.ad(objS2);
                        }
                        affcVar5 = (defpackage.affc) objS2;
                    } else {
                        affcVar5 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(i12);
                        bwcVar.ad(objS);
                    }
                    int i16 = 57344 & i3;
                    X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i16 | ((i3 << 3) & 3670016));
                    cgfVar3 = cgfVar4;
                    affcVar4 = affcVar5;
                    cfuVar2 = cfuVar3;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar4 = affcVar3;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
                }
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affcVar2)) {
                    i10 = 8192;
                } else {
                    i10 = 16384;
                }
                i3 |= i10;
            }
            if ((i & 196608) == 0) {
                if (true != bveVarC.E(affiVar)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i3 |= i9;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                i8 = 3;
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i8);
                        bwcVar2.ad(objS2);
                    }
                    affcVar5 = (defpackage.affc) objS2;
                } else {
                    affcVar5 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(i12);
                    bwcVar.ad(objS);
                }
                int i17 = 57344 & i3;
                X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i17 | ((i3 << 3) & 3670016));
                cgfVar3 = cgfVar4;
                affcVar4 = affcVar5;
                cfuVar2 = cfuVar3;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar4 = affcVar3;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 2;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                affcVar3 = affcVar;
                if (true != bveVarC.E(affcVar3)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 4;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (true != bveVarC.C(cfuVar)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != bveVarC.E(affcVar2)) {
                        i10 = 8192;
                    } else {
                        i10 = 16384;
                    }
                    i3 |= i10;
                }
                if ((i & 196608) == 0) {
                    if (true != bveVarC.E(affiVar)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    i8 = 3;
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i8);
                            bwcVar2.ad(objS2);
                        }
                        affcVar5 = (defpackage.affc) objS2;
                    } else {
                        affcVar5 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(i12);
                        bwcVar.ad(objS);
                    }
                    int i18 = 57344 & i3;
                    X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i18 | ((i3 << 3) & 3670016));
                    cgfVar3 = cgfVar4;
                    affcVar4 = affcVar5;
                    cfuVar2 = cfuVar3;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar4 = affcVar3;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
                }
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affcVar2)) {
                    i10 = 8192;
                } else {
                    i10 = 16384;
                }
                i3 |= i10;
            }
            if ((i & 196608) == 0) {
                if (true != bveVarC.E(affiVar)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i3 |= i9;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                i8 = 3;
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i8);
                        bwcVar2.ad(objS2);
                    }
                    affcVar5 = (defpackage.affc) objS2;
                } else {
                    affcVar5 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(i12);
                    bwcVar.ad(objS);
                }
                int i19 = 57344 & i3;
                X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i19 | ((i3 << 3) & 3670016));
                cgfVar3 = cgfVar4;
                affcVar4 = affcVar5;
                cfuVar2 = cfuVar3;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar4 = affcVar3;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
            }
        }
        i3 |= 384;
        affcVar3 = affcVar;
        i6 = i2 & 4;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                if (true != bveVarC.C(cfuVar)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affcVar2)) {
                    i10 = 8192;
                } else {
                    i10 = 16384;
                }
                i3 |= i10;
            }
            if ((i & 196608) == 0) {
                if (true != bveVarC.E(affiVar)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i3 |= i9;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                i8 = 3;
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i8);
                        bwcVar2.ad(objS2);
                    }
                    affcVar5 = (defpackage.affc) objS2;
                } else {
                    affcVar5 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(i12);
                    bwcVar.ad(objS);
                }
                int i110 = 57344 & i3;
                X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i110 | ((i3 << 3) & 3670016));
                cgfVar3 = cgfVar4;
                affcVar4 = affcVar5;
                cfuVar2 = cfuVar3;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar4 = affcVar3;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
            }
        }
        i3 |= 3072;
        if ((i & 24576) == 0) {
            if (true != bveVarC.E(affcVar2)) {
                i10 = 8192;
            } else {
                i10 = 16384;
            }
            i3 |= i10;
        }
        if ((i & 196608) == 0) {
            if (true != bveVarC.E(affiVar)) {
                i9 = 65536;
            } else {
                i9 = 131072;
            }
            i3 |= i9;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            if (i13 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            i8 = 3;
            if (i4 != 0) {
                bwcVar2 = (defpackage.bwc) bveVarC;
                objS2 = bwcVar2.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.abj(i8);
                    bwcVar2.ad(objS2);
                }
                affcVar5 = (defpackage.affc) objS2;
            } else {
                affcVar5 = affcVar3;
            }
            if (i6 != 0) {
                cfuVar3 = defpackage.cfs.a;
            } else {
                cfuVar3 = cfuVar;
            }
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.abj(i12);
                bwcVar.ad(objS);
            }
            int i111 = 57344 & i3;
            X(agnVar2, cgfVar4, affcVar5, cfuVar3, affcVar2, (defpackage.affc) objS, affiVar, bveVarC, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | i111 | ((i3 << 3) & 3670016));
            cgfVar3 = cgfVar4;
            affcVar4 = affcVar5;
            cfuVar2 = cfuVar3;
        } else {
            bveVarC.s();
            cfuVar2 = cfuVar;
            cgfVar3 = cgfVar2;
            affcVar4 = affcVar3;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.abx(agnVar, cgfVar3, affcVar4, cfuVar2, affcVar2, affiVar, i, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:107:0x0169  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public static void V(final java.lang.Object obj, defpackage.cgf cgfVar, defpackage.affc affcVar, defpackage.cfu cfuVar, java.lang.String str, defpackage.affc affcVar2, final defpackage.affi affiVar, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.affc affcVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        defpackage.affc affcVar4;
        int i11;
        int i12;
        boolean z;
        final defpackage.cfu cfuVar2;
        final defpackage.cgf cgfVar3;
        final defpackage.affc affcVar5;
        final defpackage.affc affcVar6;
        final java.lang.String str2;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        defpackage.affc affcVar7;
        defpackage.cfu cfuVar3;
        java.lang.String str3;
        defpackage.affc affcVar8;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        defpackage.bwc bwcVar2;
        java.lang.Object objS2;
        int i13;
        int i14 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1501828832);
        if (i14 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(obj) : bveVarC.E(obj)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    affcVar3 = affcVar;
                    if (true != bveVarC.E(affcVar3)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        if (true != bveVarC.C(cfuVar)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            if (true != bveVarC.C(str)) {
                                i9 = 8192;
                            } else {
                                i9 = 16384;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((196608 & i) == 0) {
                                affcVar4 = affcVar2;
                                if (true != bveVarC.E(affcVar4)) {
                                    i11 = 65536;
                                } else {
                                    i11 = 131072;
                                }
                                i3 |= i11;
                            }
                            if ((1572864 & i) == 0) {
                                int i16 = i3;
                                if (true != bveVarC.E(affiVar)) {
                                    i13 = 524288;
                                } else {
                                    i13 = 1048576;
                                }
                                i3 = i16 | i13;
                            }
                            i12 = 0;
                            if ((i3 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (bveVarC.I(z, i3 & 1)) {
                                if (i15 != 0) {
                                    cgfVar4 = defpackage.cgf.e;
                                } else {
                                    cgfVar4 = cgfVar2;
                                }
                                if (i4 != 0) {
                                    bwcVar2 = (defpackage.bwc) bveVarC;
                                    objS2 = bwcVar2.S();
                                    if (objS2 == defpackage.bvd.a) {
                                        objS2 = new defpackage.abj(i12);
                                        bwcVar2.ad(objS2);
                                    }
                                    affcVar7 = (defpackage.affc) objS2;
                                } else {
                                    affcVar7 = affcVar3;
                                }
                                if (i6 != 0) {
                                    cfuVar3 = defpackage.cfs.a;
                                } else {
                                    cfuVar3 = cfuVar;
                                }
                                if (i8 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i10 != 0) {
                                    bwcVar = (defpackage.bwc) bveVarC;
                                    objS = bwcVar.S();
                                    if (objS == defpackage.bvd.a) {
                                        objS = new defpackage.abj(2);
                                        bwcVar.ad(objS);
                                    }
                                    affcVar8 = (defpackage.affc) objS;
                                } else {
                                    affcVar8 = affcVar4;
                                }
                                int i17 = i3 >> 3;
                                U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i17) | (i17 & 458752), 0);
                                str2 = str3;
                                cgfVar3 = cgfVar4;
                                affcVar5 = affcVar7;
                                cfuVar2 = cfuVar3;
                                affcVar6 = affcVar8;
                            } else {
                                bveVarC.s();
                                cfuVar2 = cfuVar;
                                cgfVar3 = cgfVar2;
                                affcVar5 = affcVar3;
                                affcVar6 = affcVar4;
                                str2 = str;
                            }
                            bxlVarJ = bveVarC.J();
                            if (bxlVarJ != null) {
                                bxlVarJ.c = new defpackage.affg() { // from class: abk
                                    @Override // defpackage.affg
                                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                        ((java.lang.Integer) obj3).intValue();
                                        java.lang.Object obj4 = obj;
                                        defpackage.cgf cgfVar5 = cgfVar3;
                                        defpackage.affc affcVar9 = affcVar5;
                                        int i18 = i | 1;
                                        int i19 = 306783378 & i18;
                                        int i20 = 613566756 & i18;
                                        defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i18 & (-920350135)) | i19 | (i20 >> 1) | ((i19 + i19) & i20), i2);
                                        return defpackage.afbk.a;
                                    }
                                };
                            }
                        }
                        i3 |= 196608;
                        affcVar4 = affcVar2;
                        if ((1572864 & i) == 0) {
                            int i18 = i3;
                            if (true != bveVarC.E(affiVar)) {
                                i13 = 524288;
                            } else {
                                i13 = 1048576;
                            }
                            i3 = i18 | i13;
                        }
                        i12 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i3 & 1)) {
                            if (i15 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i4 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.abj(i12);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar7 = (defpackage.affc) objS2;
                            } else {
                                affcVar7 = affcVar3;
                            }
                            if (i6 != 0) {
                                cfuVar3 = defpackage.cfs.a;
                            } else {
                                cfuVar3 = cfuVar;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i10 != 0) {
                                bwcVar = (defpackage.bwc) bveVarC;
                                objS = bwcVar.S();
                                if (objS == defpackage.bvd.a) {
                                    objS = new defpackage.abj(2);
                                    bwcVar.ad(objS);
                                }
                                affcVar8 = (defpackage.affc) objS;
                            } else {
                                affcVar8 = affcVar4;
                            }
                            int i19 = i3 >> 3;
                            U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i19) | (i19 & 458752), 0);
                            str2 = str3;
                            cgfVar3 = cgfVar4;
                            affcVar5 = affcVar7;
                            cfuVar2 = cfuVar3;
                            affcVar6 = affcVar8;
                        } else {
                            bveVarC.s();
                            cfuVar2 = cfuVar;
                            cgfVar3 = cgfVar2;
                            affcVar5 = affcVar3;
                            affcVar6 = affcVar4;
                            str2 = str;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: abk
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                    ((java.lang.Integer) obj3).intValue();
                                    java.lang.Object obj4 = obj;
                                    defpackage.cgf cgfVar5 = cgfVar3;
                                    defpackage.affc affcVar9 = affcVar5;
                                    int i110 = i | 1;
                                    int i111 = 306783378 & i110;
                                    int i20 = 613566756 & i110;
                                    defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i110 & (-920350135)) | i111 | (i20 >> 1) | ((i111 + i111) & i20), i2);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            affcVar4 = affcVar2;
                            if (true != bveVarC.E(affcVar4)) {
                                i11 = 65536;
                            } else {
                                i11 = 131072;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            int i110 = i3;
                            if (true != bveVarC.E(affiVar)) {
                                i13 = 524288;
                            } else {
                                i13 = 1048576;
                            }
                            i3 = i110 | i13;
                        }
                        i12 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i3 & 1)) {
                            if (i15 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i4 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.abj(i12);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar7 = (defpackage.affc) objS2;
                            } else {
                                affcVar7 = affcVar3;
                            }
                            if (i6 != 0) {
                                cfuVar3 = defpackage.cfs.a;
                            } else {
                                cfuVar3 = cfuVar;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i10 != 0) {
                                bwcVar = (defpackage.bwc) bveVarC;
                                objS = bwcVar.S();
                                if (objS == defpackage.bvd.a) {
                                    objS = new defpackage.abj(2);
                                    bwcVar.ad(objS);
                                }
                                affcVar8 = (defpackage.affc) objS;
                            } else {
                                affcVar8 = affcVar4;
                            }
                            int i111 = i3 >> 3;
                            U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i111) | (i111 & 458752), 0);
                            str2 = str3;
                            cgfVar3 = cgfVar4;
                            affcVar5 = affcVar7;
                            cfuVar2 = cfuVar3;
                            affcVar6 = affcVar8;
                        } else {
                            bveVarC.s();
                            cfuVar2 = cfuVar;
                            cgfVar3 = cgfVar2;
                            affcVar5 = affcVar3;
                            affcVar6 = affcVar4;
                            str2 = str;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: abk
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                    ((java.lang.Integer) obj3).intValue();
                                    java.lang.Object obj4 = obj;
                                    defpackage.cgf cgfVar5 = cgfVar3;
                                    defpackage.affc affcVar9 = affcVar5;
                                    int i112 = i | 1;
                                    int i113 = 306783378 & i112;
                                    int i20 = 613566756 & i112;
                                    defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i112 & (-920350135)) | i113 | (i20 >> 1) | ((i113 + i113) & i20), i2);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    affcVar4 = affcVar2;
                    if ((1572864 & i) == 0) {
                        int i112 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i112 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i113 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i113) | (i113 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i114 = i | 1;
                                int i115 = 306783378 & i114;
                                int i20 = 613566756 & i114;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i114 & (-920350135)) | i115 | (i20 >> 1) | ((i115 + i115) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.C(str)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            affcVar4 = affcVar2;
                            if (true != bveVarC.E(affcVar4)) {
                                i11 = 65536;
                            } else {
                                i11 = 131072;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            int i114 = i3;
                            if (true != bveVarC.E(affiVar)) {
                                i13 = 524288;
                            } else {
                                i13 = 1048576;
                            }
                            i3 = i114 | i13;
                        }
                        i12 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i3 & 1)) {
                            if (i15 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i4 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.abj(i12);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar7 = (defpackage.affc) objS2;
                            } else {
                                affcVar7 = affcVar3;
                            }
                            if (i6 != 0) {
                                cfuVar3 = defpackage.cfs.a;
                            } else {
                                cfuVar3 = cfuVar;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i10 != 0) {
                                bwcVar = (defpackage.bwc) bveVarC;
                                objS = bwcVar.S();
                                if (objS == defpackage.bvd.a) {
                                    objS = new defpackage.abj(2);
                                    bwcVar.ad(objS);
                                }
                                affcVar8 = (defpackage.affc) objS;
                            } else {
                                affcVar8 = affcVar4;
                            }
                            int i115 = i3 >> 3;
                            U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i115) | (i115 & 458752), 0);
                            str2 = str3;
                            cgfVar3 = cgfVar4;
                            affcVar5 = affcVar7;
                            cfuVar2 = cfuVar3;
                            affcVar6 = affcVar8;
                        } else {
                            bveVarC.s();
                            cfuVar2 = cfuVar;
                            cgfVar3 = cgfVar2;
                            affcVar5 = affcVar3;
                            affcVar6 = affcVar4;
                            str2 = str;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: abk
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                    ((java.lang.Integer) obj3).intValue();
                                    java.lang.Object obj4 = obj;
                                    defpackage.cgf cgfVar5 = cgfVar3;
                                    defpackage.affc affcVar9 = affcVar5;
                                    int i116 = i | 1;
                                    int i117 = 306783378 & i116;
                                    int i20 = 613566756 & i116;
                                    defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i116 & (-920350135)) | i117 | (i20 >> 1) | ((i117 + i117) & i20), i2);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    affcVar4 = affcVar2;
                    if ((1572864 & i) == 0) {
                        int i116 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i116 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i117 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i117) | (i117 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i118 = i | 1;
                                int i119 = 306783378 & i118;
                                int i20 = 613566756 & i118;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i118 & (-920350135)) | i119 | (i20 >> 1) | ((i119 + i119) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        affcVar4 = affcVar2;
                        if (true != bveVarC.E(affcVar4)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        int i118 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i118 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i119 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i119) | (i119 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i1110 = i | 1;
                                int i1111 = 306783378 & i1110;
                                int i20 = 613566756 & i1110;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1110 & (-920350135)) | i1111 | (i20 >> 1) | ((i1111 + i1111) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                affcVar4 = affcVar2;
                if ((1572864 & i) == 0) {
                    int i1110 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i1110 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i1111 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1111) | (i1111 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i1112 = i | 1;
                            int i1113 = 306783378 & i1112;
                            int i20 = 613566756 & i1112;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1112 & (-920350135)) | i1113 | (i20 >> 1) | ((i1113 + i1113) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 384;
            affcVar3 = affcVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (true != bveVarC.C(cfuVar)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.C(str)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            affcVar4 = affcVar2;
                            if (true != bveVarC.E(affcVar4)) {
                                i11 = 65536;
                            } else {
                                i11 = 131072;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            int i1112 = i3;
                            if (true != bveVarC.E(affiVar)) {
                                i13 = 524288;
                            } else {
                                i13 = 1048576;
                            }
                            i3 = i1112 | i13;
                        }
                        i12 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i3 & 1)) {
                            if (i15 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i4 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.abj(i12);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar7 = (defpackage.affc) objS2;
                            } else {
                                affcVar7 = affcVar3;
                            }
                            if (i6 != 0) {
                                cfuVar3 = defpackage.cfs.a;
                            } else {
                                cfuVar3 = cfuVar;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i10 != 0) {
                                bwcVar = (defpackage.bwc) bveVarC;
                                objS = bwcVar.S();
                                if (objS == defpackage.bvd.a) {
                                    objS = new defpackage.abj(2);
                                    bwcVar.ad(objS);
                                }
                                affcVar8 = (defpackage.affc) objS;
                            } else {
                                affcVar8 = affcVar4;
                            }
                            int i1113 = i3 >> 3;
                            U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1113) | (i1113 & 458752), 0);
                            str2 = str3;
                            cgfVar3 = cgfVar4;
                            affcVar5 = affcVar7;
                            cfuVar2 = cfuVar3;
                            affcVar6 = affcVar8;
                        } else {
                            bveVarC.s();
                            cfuVar2 = cfuVar;
                            cgfVar3 = cgfVar2;
                            affcVar5 = affcVar3;
                            affcVar6 = affcVar4;
                            str2 = str;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: abk
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                    ((java.lang.Integer) obj3).intValue();
                                    java.lang.Object obj4 = obj;
                                    defpackage.cgf cgfVar5 = cgfVar3;
                                    defpackage.affc affcVar9 = affcVar5;
                                    int i1114 = i | 1;
                                    int i1115 = 306783378 & i1114;
                                    int i20 = 613566756 & i1114;
                                    defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1114 & (-920350135)) | i1115 | (i20 >> 1) | ((i1115 + i1115) & i20), i2);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    affcVar4 = affcVar2;
                    if ((1572864 & i) == 0) {
                        int i1114 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i1114 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i1115 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1115) | (i1115 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i1116 = i | 1;
                                int i1117 = 306783378 & i1116;
                                int i20 = 613566756 & i1116;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1116 & (-920350135)) | i1117 | (i20 >> 1) | ((i1117 + i1117) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        affcVar4 = affcVar2;
                        if (true != bveVarC.E(affcVar4)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        int i1116 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i1116 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i1117 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1117) | (i1117 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i1118 = i | 1;
                                int i1119 = 306783378 & i1118;
                                int i20 = 613566756 & i1118;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1118 & (-920350135)) | i1119 | (i20 >> 1) | ((i1119 + i1119) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                affcVar4 = affcVar2;
                if ((1572864 & i) == 0) {
                    int i1118 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i1118 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i1119 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1119) | (i1119 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i11110 = i | 1;
                            int i11111 = 306783378 & i11110;
                            int i20 = 613566756 & i11110;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11110 & (-920350135)) | i11111 | (i20 >> 1) | ((i11111 + i11111) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (true != bveVarC.C(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        affcVar4 = affcVar2;
                        if (true != bveVarC.E(affcVar4)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        int i11110 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i11110 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i11111 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11111) | (i11111 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i11112 = i | 1;
                                int i11113 = 306783378 & i11112;
                                int i20 = 613566756 & i11112;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11112 & (-920350135)) | i11113 | (i20 >> 1) | ((i11113 + i11113) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                affcVar4 = affcVar2;
                if ((1572864 & i) == 0) {
                    int i11112 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i11112 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i11113 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11113) | (i11113 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i11114 = i | 1;
                            int i11115 = 306783378 & i11114;
                            int i20 = 613566756 & i11114;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11114 & (-920350135)) | i11115 | (i20 >> 1) | ((i11115 + i11115) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    affcVar4 = affcVar2;
                    if (true != bveVarC.E(affcVar4)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    int i11114 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i11114 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i11115 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11115) | (i11115 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i11116 = i | 1;
                            int i11117 = 306783378 & i11116;
                            int i20 = 613566756 & i11116;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11116 & (-920350135)) | i11117 | (i20 >> 1) | ((i11117 + i11117) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            affcVar4 = affcVar2;
            if ((1572864 & i) == 0) {
                int i11116 = i3;
                if (true != bveVarC.E(affiVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 = i11116 | i13;
            }
            i12 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i12);
                        bwcVar2.ad(objS2);
                    }
                    affcVar7 = (defpackage.affc) objS2;
                } else {
                    affcVar7 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(2);
                        bwcVar.ad(objS);
                    }
                    affcVar8 = (defpackage.affc) objS;
                } else {
                    affcVar8 = affcVar4;
                }
                int i11117 = i3 >> 3;
                U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11117) | (i11117 & 458752), 0);
                str2 = str3;
                cgfVar3 = cgfVar4;
                affcVar5 = affcVar7;
                cfuVar2 = cfuVar3;
                affcVar6 = affcVar8;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar5 = affcVar3;
                affcVar6 = affcVar4;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        defpackage.affc affcVar9 = affcVar5;
                        int i11118 = i | 1;
                        int i11119 = 306783378 & i11118;
                        int i20 = 613566756 & i11118;
                        defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11118 & (-920350135)) | i11119 | (i20 >> 1) | ((i11119 + i11119) & i20), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                affcVar3 = affcVar;
                if (true != bveVarC.E(affcVar3)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (true != bveVarC.C(cfuVar)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (true != bveVarC.C(str)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            affcVar4 = affcVar2;
                            if (true != bveVarC.E(affcVar4)) {
                                i11 = 65536;
                            } else {
                                i11 = 131072;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            int i11118 = i3;
                            if (true != bveVarC.E(affiVar)) {
                                i13 = 524288;
                            } else {
                                i13 = 1048576;
                            }
                            i3 = i11118 | i13;
                        }
                        i12 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i3 & 1)) {
                            if (i15 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i4 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.abj(i12);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar7 = (defpackage.affc) objS2;
                            } else {
                                affcVar7 = affcVar3;
                            }
                            if (i6 != 0) {
                                cfuVar3 = defpackage.cfs.a;
                            } else {
                                cfuVar3 = cfuVar;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i10 != 0) {
                                bwcVar = (defpackage.bwc) bveVarC;
                                objS = bwcVar.S();
                                if (objS == defpackage.bvd.a) {
                                    objS = new defpackage.abj(2);
                                    bwcVar.ad(objS);
                                }
                                affcVar8 = (defpackage.affc) objS;
                            } else {
                                affcVar8 = affcVar4;
                            }
                            int i11119 = i3 >> 3;
                            U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11119) | (i11119 & 458752), 0);
                            str2 = str3;
                            cgfVar3 = cgfVar4;
                            affcVar5 = affcVar7;
                            cfuVar2 = cfuVar3;
                            affcVar6 = affcVar8;
                        } else {
                            bveVarC.s();
                            cfuVar2 = cfuVar;
                            cgfVar3 = cgfVar2;
                            affcVar5 = affcVar3;
                            affcVar6 = affcVar4;
                            str2 = str;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: abk
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                    ((java.lang.Integer) obj3).intValue();
                                    java.lang.Object obj4 = obj;
                                    defpackage.cgf cgfVar5 = cgfVar3;
                                    defpackage.affc affcVar9 = affcVar5;
                                    int i111110 = i | 1;
                                    int i111111 = 306783378 & i111110;
                                    int i20 = 613566756 & i111110;
                                    defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i111110 & (-920350135)) | i111111 | (i20 >> 1) | ((i111111 + i111111) & i20), i2);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    affcVar4 = affcVar2;
                    if ((1572864 & i) == 0) {
                        int i111110 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i111110 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i111111 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i111111) | (i111111 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i111112 = i | 1;
                                int i111113 = 306783378 & i111112;
                                int i20 = 613566756 & i111112;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i111112 & (-920350135)) | i111113 | (i20 >> 1) | ((i111113 + i111113) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        affcVar4 = affcVar2;
                        if (true != bveVarC.E(affcVar4)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        int i111112 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i111112 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i111113 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i111113) | (i111113 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i111114 = i | 1;
                                int i111115 = 306783378 & i111114;
                                int i20 = 613566756 & i111114;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i111114 & (-920350135)) | i111115 | (i20 >> 1) | ((i111115 + i111115) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                affcVar4 = affcVar2;
                if ((1572864 & i) == 0) {
                    int i111114 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i111114 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i111115 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i111115) | (i111115 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i111116 = i | 1;
                            int i111117 = 306783378 & i111116;
                            int i20 = 613566756 & i111116;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i111116 & (-920350135)) | i111117 | (i20 >> 1) | ((i111117 + i111117) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (true != bveVarC.C(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        affcVar4 = affcVar2;
                        if (true != bveVarC.E(affcVar4)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        int i111116 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i111116 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i111117 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i111117) | (i111117 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i111118 = i | 1;
                                int i111119 = 306783378 & i111118;
                                int i20 = 613566756 & i111118;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i111118 & (-920350135)) | i111119 | (i20 >> 1) | ((i111119 + i111119) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                affcVar4 = affcVar2;
                if ((1572864 & i) == 0) {
                    int i111118 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i111118 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i111119 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i111119) | (i111119 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i1111110 = i | 1;
                            int i1111111 = 306783378 & i1111110;
                            int i20 = 613566756 & i1111110;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1111110 & (-920350135)) | i1111111 | (i20 >> 1) | ((i1111111 + i1111111) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    affcVar4 = affcVar2;
                    if (true != bveVarC.E(affcVar4)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    int i1111110 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i1111110 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i1111111 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1111111) | (i1111111 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i1111112 = i | 1;
                            int i1111113 = 306783378 & i1111112;
                            int i20 = 613566756 & i1111112;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1111112 & (-920350135)) | i1111113 | (i20 >> 1) | ((i1111113 + i1111113) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            affcVar4 = affcVar2;
            if ((1572864 & i) == 0) {
                int i1111112 = i3;
                if (true != bveVarC.E(affiVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 = i1111112 | i13;
            }
            i12 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i12);
                        bwcVar2.ad(objS2);
                    }
                    affcVar7 = (defpackage.affc) objS2;
                } else {
                    affcVar7 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(2);
                        bwcVar.ad(objS);
                    }
                    affcVar8 = (defpackage.affc) objS;
                } else {
                    affcVar8 = affcVar4;
                }
                int i1111113 = i3 >> 3;
                U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1111113) | (i1111113 & 458752), 0);
                str2 = str3;
                cgfVar3 = cgfVar4;
                affcVar5 = affcVar7;
                cfuVar2 = cfuVar3;
                affcVar6 = affcVar8;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar5 = affcVar3;
                affcVar6 = affcVar4;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        defpackage.affc affcVar9 = affcVar5;
                        int i1111114 = i | 1;
                        int i1111115 = 306783378 & i1111114;
                        int i20 = 613566756 & i1111114;
                        defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1111114 & (-920350135)) | i1111115 | (i20 >> 1) | ((i1111115 + i1111115) & i20), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 384;
        affcVar3 = affcVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                if (true != bveVarC.C(cfuVar)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (true != bveVarC.C(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        affcVar4 = affcVar2;
                        if (true != bveVarC.E(affcVar4)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        int i1111114 = i3;
                        if (true != bveVarC.E(affiVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 = i1111114 | i13;
                    }
                    i12 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i3 & 1)) {
                        if (i15 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new defpackage.abj(i12);
                                bwcVar2.ad(objS2);
                            }
                            affcVar7 = (defpackage.affc) objS2;
                        } else {
                            affcVar7 = affcVar3;
                        }
                        if (i6 != 0) {
                            cfuVar3 = defpackage.cfs.a;
                        } else {
                            cfuVar3 = cfuVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.abj(2);
                                bwcVar.ad(objS);
                            }
                            affcVar8 = (defpackage.affc) objS;
                        } else {
                            affcVar8 = affcVar4;
                        }
                        int i1111115 = i3 >> 3;
                        U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1111115) | (i1111115 & 458752), 0);
                        str2 = str3;
                        cgfVar3 = cgfVar4;
                        affcVar5 = affcVar7;
                        cfuVar2 = cfuVar3;
                        affcVar6 = affcVar8;
                    } else {
                        bveVarC.s();
                        cfuVar2 = cfuVar;
                        cgfVar3 = cgfVar2;
                        affcVar5 = affcVar3;
                        affcVar6 = affcVar4;
                        str2 = str;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: abk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cgf cgfVar5 = cgfVar3;
                                defpackage.affc affcVar9 = affcVar5;
                                int i1111116 = i | 1;
                                int i1111117 = 306783378 & i1111116;
                                int i20 = 613566756 & i1111116;
                                defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1111116 & (-920350135)) | i1111117 | (i20 >> 1) | ((i1111117 + i1111117) & i20), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                affcVar4 = affcVar2;
                if ((1572864 & i) == 0) {
                    int i1111116 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i1111116 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i1111117 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1111117) | (i1111117 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i1111118 = i | 1;
                            int i1111119 = 306783378 & i1111118;
                            int i20 = 613566756 & i1111118;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i1111118 & (-920350135)) | i1111119 | (i20 >> 1) | ((i1111119 + i1111119) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    affcVar4 = affcVar2;
                    if (true != bveVarC.E(affcVar4)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    int i1111118 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i1111118 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i1111119 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i1111119) | (i1111119 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i11111110 = i | 1;
                            int i11111111 = 306783378 & i11111110;
                            int i20 = 613566756 & i11111110;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11111110 & (-920350135)) | i11111111 | (i20 >> 1) | ((i11111111 + i11111111) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            affcVar4 = affcVar2;
            if ((1572864 & i) == 0) {
                int i11111110 = i3;
                if (true != bveVarC.E(affiVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 = i11111110 | i13;
            }
            i12 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i12);
                        bwcVar2.ad(objS2);
                    }
                    affcVar7 = (defpackage.affc) objS2;
                } else {
                    affcVar7 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(2);
                        bwcVar.ad(objS);
                    }
                    affcVar8 = (defpackage.affc) objS;
                } else {
                    affcVar8 = affcVar4;
                }
                int i11111111 = i3 >> 3;
                U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11111111) | (i11111111 & 458752), 0);
                str2 = str3;
                cgfVar3 = cgfVar4;
                affcVar5 = affcVar7;
                cfuVar2 = cfuVar3;
                affcVar6 = affcVar8;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar5 = affcVar3;
                affcVar6 = affcVar4;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        defpackage.affc affcVar9 = affcVar5;
                        int i11111112 = i | 1;
                        int i11111113 = 306783378 & i11111112;
                        int i20 = 613566756 & i11111112;
                        defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11111112 & (-920350135)) | i11111113 | (i20 >> 1) | ((i11111113 + i11111113) & i20), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 3072;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                if (true != bveVarC.C(str)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    affcVar4 = affcVar2;
                    if (true != bveVarC.E(affcVar4)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    int i11111112 = i3;
                    if (true != bveVarC.E(affiVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 = i11111112 | i13;
                }
                i12 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new defpackage.abj(i12);
                            bwcVar2.ad(objS2);
                        }
                        affcVar7 = (defpackage.affc) objS2;
                    } else {
                        affcVar7 = affcVar3;
                    }
                    if (i6 != 0) {
                        cfuVar3 = defpackage.cfs.a;
                    } else {
                        cfuVar3 = cfuVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.abj(2);
                            bwcVar.ad(objS);
                        }
                        affcVar8 = (defpackage.affc) objS;
                    } else {
                        affcVar8 = affcVar4;
                    }
                    int i11111113 = i3 >> 3;
                    U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11111113) | (i11111113 & 458752), 0);
                    str2 = str3;
                    cgfVar3 = cgfVar4;
                    affcVar5 = affcVar7;
                    cfuVar2 = cfuVar3;
                    affcVar6 = affcVar8;
                } else {
                    bveVarC.s();
                    cfuVar2 = cfuVar;
                    cgfVar3 = cgfVar2;
                    affcVar5 = affcVar3;
                    affcVar6 = affcVar4;
                    str2 = str;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: abk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cgf cgfVar5 = cgfVar3;
                            defpackage.affc affcVar9 = affcVar5;
                            int i11111114 = i | 1;
                            int i11111115 = 306783378 & i11111114;
                            int i20 = 613566756 & i11111114;
                            defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11111114 & (-920350135)) | i11111115 | (i20 >> 1) | ((i11111115 + i11111115) & i20), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            affcVar4 = affcVar2;
            if ((1572864 & i) == 0) {
                int i11111114 = i3;
                if (true != bveVarC.E(affiVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 = i11111114 | i13;
            }
            i12 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i12);
                        bwcVar2.ad(objS2);
                    }
                    affcVar7 = (defpackage.affc) objS2;
                } else {
                    affcVar7 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(2);
                        bwcVar.ad(objS);
                    }
                    affcVar8 = (defpackage.affc) objS;
                } else {
                    affcVar8 = affcVar4;
                }
                int i11111115 = i3 >> 3;
                U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11111115) | (i11111115 & 458752), 0);
                str2 = str3;
                cgfVar3 = cgfVar4;
                affcVar5 = affcVar7;
                cfuVar2 = cfuVar3;
                affcVar6 = affcVar8;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar5 = affcVar3;
                affcVar6 = affcVar4;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        defpackage.affc affcVar9 = affcVar5;
                        int i11111116 = i | 1;
                        int i11111117 = 306783378 & i11111116;
                        int i20 = 613566756 & i11111116;
                        defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11111116 & (-920350135)) | i11111117 | (i20 >> 1) | ((i11111117 + i11111117) & i20), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 24576;
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((196608 & i) == 0) {
                affcVar4 = affcVar2;
                if (true != bveVarC.E(affcVar4)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if ((1572864 & i) == 0) {
                int i11111116 = i3;
                if (true != bveVarC.E(affiVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 = i11111116 | i13;
            }
            i12 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.abj(i12);
                        bwcVar2.ad(objS2);
                    }
                    affcVar7 = (defpackage.affc) objS2;
                } else {
                    affcVar7 = affcVar3;
                }
                if (i6 != 0) {
                    cfuVar3 = defpackage.cfs.a;
                } else {
                    cfuVar3 = cfuVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.abj(2);
                        bwcVar.ad(objS);
                    }
                    affcVar8 = (defpackage.affc) objS;
                } else {
                    affcVar8 = affcVar4;
                }
                int i11111117 = i3 >> 3;
                U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11111117) | (i11111117 & 458752), 0);
                str2 = str3;
                cgfVar3 = cgfVar4;
                affcVar5 = affcVar7;
                cfuVar2 = cfuVar3;
                affcVar6 = affcVar8;
            } else {
                bveVarC.s();
                cfuVar2 = cfuVar;
                cgfVar3 = cgfVar2;
                affcVar5 = affcVar3;
                affcVar6 = affcVar4;
                str2 = str;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: abk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        defpackage.affc affcVar9 = affcVar5;
                        int i11111118 = i | 1;
                        int i11111119 = 306783378 & i11111118;
                        int i20 = 613566756 & i11111118;
                        defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i11111118 & (-920350135)) | i11111119 | (i20 >> 1) | ((i11111119 + i11111119) & i20), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 196608;
        affcVar4 = affcVar2;
        if ((1572864 & i) == 0) {
            int i11111118 = i3;
            if (true != bveVarC.E(affiVar)) {
                i13 = 524288;
            } else {
                i13 = 1048576;
            }
            i3 = i11111118 | i13;
        }
        i12 = 0;
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            if (i15 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                bwcVar2 = (defpackage.bwc) bveVarC;
                objS2 = bwcVar2.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.abj(i12);
                    bwcVar2.ad(objS2);
                }
                affcVar7 = (defpackage.affc) objS2;
            } else {
                affcVar7 = affcVar3;
            }
            if (i6 != 0) {
                cfuVar3 = defpackage.cfs.a;
            } else {
                cfuVar3 = cfuVar;
            }
            if (i8 != 0) {
                str3 = "AnimatedContent";
            } else {
                str3 = str;
            }
            if (i10 != 0) {
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.abj(2);
                    bwcVar.ad(objS);
                }
                affcVar8 = (defpackage.affc) objS;
            } else {
                affcVar8 = affcVar4;
            }
            int i11111119 = i3 >> 3;
            U(defpackage.afw.p(obj, str3, bveVarC, ((i3 >> 9) & 112) | (i3 & 14), 0), cgfVar4, affcVar7, cfuVar3, affcVar8, affiVar, bveVarC, (i3 & 8176) | (57344 & i11111119) | (i11111119 & 458752), 0);
            str2 = str3;
            cgfVar3 = cgfVar4;
            affcVar5 = affcVar7;
            cfuVar2 = cfuVar3;
            affcVar6 = affcVar8;
        } else {
            bveVarC.s();
            cfuVar2 = cfuVar;
            cgfVar3 = cgfVar2;
            affcVar5 = affcVar3;
            affcVar6 = affcVar4;
            str2 = str;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: abk
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    java.lang.Object obj4 = obj;
                    defpackage.cgf cgfVar5 = cgfVar3;
                    defpackage.affc affcVar9 = affcVar5;
                    int i111111110 = i | 1;
                    int i111111111 = 306783378 & i111111110;
                    int i20 = 613566756 & i111111110;
                    defpackage.ca.V(obj4, cgfVar5, affcVar9, cfuVar2, str2, affcVar6, affiVar, bveVar2, (i111111110 & (-920350135)) | i111111111 | (i20 >> 1) | ((i111111111 + i111111111) & i20), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static /* synthetic */ defpackage.acf W() {
        return new defpackage.acf(defpackage.acs.z(F(220, 90, null, 4), 2).a(defpackage.acs.q(F(220, 90, null, 4), 0.92f, 0L, 4)), defpackage.acs.A(F(90, 0, null, 6), 2), 0.0f, 12);
    }

    public static void X(final defpackage.agn agnVar, defpackage.cgf cgfVar, final defpackage.affc affcVar, defpackage.cfu cfuVar, final defpackage.affc affcVar2, defpackage.affc affcVar3, defpackage.affi affiVar, defpackage.bve bveVar, int i) {
        java.lang.Object obj;
        java.lang.Object bilVar;
        defpackage.aau aauVar;
        defpackage.ade adeVar;
        boolean z;
        defpackage.abr abrVar;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar2;
        defpackage.agi agiVarAg;
        int i2;
        int i3;
        defpackage.affc affcVar4 = affcVar;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1935038908);
        int i5 = i4 == 0 ? (true != bveVarC.C(agnVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i5 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i5 |= true != bveVarC.E(affcVar4) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i5 |= true != bveVarC.C(cfuVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i5 |= true != bveVarC.E(affcVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i5 |= true != bveVarC.E(affcVar3) ? 65536 : 131072;
        }
        final defpackage.affi affiVar2 = affiVar;
        if ((1572864 & i) == 0) {
            i5 |= true != bveVarC.E(affiVar2) ? 524288 : 1048576;
        }
        if (bveVarC.I((599187 & i5) != 599186, i5 & 1)) {
            defpackage.dlz dlzVar = (defpackage.dlz) bveVarC.f(defpackage.dbl.i);
            int i6 = i5 & 14;
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            if (i6 == 4 || objS == defpackage.bvd.a) {
                objS = new defpackage.abr(agnVar, cfuVar, dlzVar);
                bwcVar2.ad(objS);
            }
            defpackage.abr abrVar2 = (defpackage.abr) objS;
            java.lang.Object objS2 = bwcVar2.S();
            if (i6 == 4 || objS2 == defpackage.bvd.a) {
                java.lang.Object[] objArr = {agnVar.e()};
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = new androidx.compose.runtime.snapshots.SnapshotStateList();
                snapshotStateList.addAll(defpackage.afga.bZ(objArr));
                bwcVar2.ad(snapshotStateList);
                obj = snapshotStateList;
            } else {
                obj = objS2;
            }
            final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
            boolean zC = bveVarC.C(agnVar.f()) | (i6 == 4);
            java.lang.Object objS3 = bwcVar2.S();
            if (zC || objS3 == defpackage.bvd.a) {
                long[] jArr = defpackage.aav.a;
                objS3 = new defpackage.aau(6);
                bwcVar2.ad(objS3);
            }
            defpackage.aau aauVar2 = (defpackage.aau) objS3;
            if (!snapshotStateList2.contains(agnVar.e())) {
                snapshotStateList2.clear();
                snapshotStateList2.add(agnVar.e());
            }
            if (defpackage.afga.f(agnVar.e(), agnVar.g()) && agnVar.f() == null) {
                if (snapshotStateList2.a() != 1 || !defpackage.afga.f(snapshotStateList2.get(0), agnVar.e())) {
                    snapshotStateList2.clear();
                    snapshotStateList2.add(agnVar.e());
                }
                if (aauVar2.e != 1 || defpackage.aau.f(aauVar2, agnVar.e())) {
                    aauVar2.k();
                }
                abrVar2.b = cfuVar;
                abrVar2.c = dlzVar;
            }
            java.lang.Object objF = agnVar.f();
            if (objF != null && !defpackage.afga.f(objF, agnVar.e())) {
                java.lang.Object objInvoke = affcVar2.invoke(objF);
                if (!defpackage.afga.f(objInvoke, affcVar2.invoke(agnVar.g()))) {
                    defpackage.cfa cfaVar = new defpackage.cfa(snapshotStateList2, 0);
                    int i7 = 0;
                    while (true) {
                        if (!cfaVar.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        int i8 = i7;
                        if (defpackage.afga.f(affcVar2.invoke(cfaVar.next()), objInvoke)) {
                            i3 = i8;
                            break;
                        }
                        i7 = i8 + 1;
                    }
                    if (i3 == -1) {
                        snapshotStateList2.add(objF);
                    } else if (!defpackage.afga.f(snapshotStateList2.get(i3), objF)) {
                        snapshotStateList2.set(i3, objF);
                    }
                }
            }
            if (!defpackage.afga.f(agnVar.e(), agnVar.g())) {
                defpackage.cfa cfaVar2 = new defpackage.cfa(snapshotStateList2, 0);
                int i9 = 0;
                while (true) {
                    if (!cfaVar2.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (defpackage.afga.f(affcVar2.invoke(cfaVar2.next()), affcVar2.invoke(agnVar.g()))) {
                            i2 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i2 == -1) {
                    snapshotStateList2.add(agnVar.g());
                } else if (!defpackage.afga.f(snapshotStateList2.get(i2), agnVar.g()) || i2 != snapshotStateList2.a() - 1) {
                    defpackage.afga.f(agnVar.g(), snapshotStateList2.get(i2));
                    snapshotStateList2.b(i2);
                    snapshotStateList2.add(agnVar.g());
                }
            }
            final java.lang.Object objF2 = agnVar.f();
            boolean zC2 = bveVarC.C(objF2);
            java.lang.Object objS4 = bwcVar2.S();
            if (zC2 || objS4 == defpackage.bvd.a) {
                objS4 = objF2 != null ? new defpackage.ade(abrVar2, agnVar.g(), objF2) : null;
                bwcVar2.ad(objS4);
            }
            defpackage.ade adeVar2 = (defpackage.ade) objS4;
            boolean zC3 = bveVarC.C(adeVar2) | ((i5 & 458752) == 131072);
            java.lang.Object objS5 = bwcVar2.S();
            if (zC3 || objS5 == defpackage.bvd.a) {
                bilVar = adeVar2 != null ? !defpackage.afga.f(affcVar2.invoke(adeVar2.a), affcVar2.invoke(adeVar2.b)) ? (defpackage.bil) affcVar3.invoke(adeVar2) : new defpackage.bil((short[]) null, (byte[]) null) : null;
                bwcVar2.ad(bilVar);
            } else {
                bilVar = objS5;
            }
            defpackage.bil bilVar2 = (defpackage.bil) bilVar;
            if (defpackage.aau.f(aauVar2, agnVar.g()) && defpackage.aau.f(aauVar2, agnVar.e()) && (objF2 == null || defpackage.aau.f(aauVar2, objF2))) {
                bveVarC.v(-296475066);
                bwcVar2.Y(false);
                aauVar = aauVar2;
                adeVar = adeVar2;
                bwcVar = bwcVar2;
                z = true;
                abrVar = abrVar2;
            } else {
                bveVarC.v(-301762488);
                aauVar2.k();
                java.util.List listE = snapshotStateList2.e();
                int i10 = 0;
                defpackage.bwc bwcVar3 = bwcVar2;
                for (int size = listE.size(); i10 < size; size = size) {
                    final defpackage.bil bilVar3 = bilVar2;
                    final java.lang.Object obj2 = listE.get(i10);
                    defpackage.aau aauVar3 = aauVar2;
                    java.util.List list = listE;
                    int i11 = i10;
                    final defpackage.ade adeVar3 = adeVar2;
                    defpackage.bwc bwcVar4 = bwcVar3;
                    final defpackage.abr abrVar3 = abrVar2;
                    defpackage.affg affgVar = new defpackage.affg() { // from class: abl
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            defpackage.acf acfVar;
                            defpackage.acx acxVar;
                            int iIndexOf;
                            defpackage.bve bveVar2 = (defpackage.bve) obj3;
                            int iIntValue = ((java.lang.Integer) obj4).intValue();
                            boolean z2 = false;
                            if (bveVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                                defpackage.abr abrVar4 = abrVar3;
                                defpackage.affc affcVar5 = affcVar;
                                defpackage.ade adeVar4 = adeVar3;
                                defpackage.agn agnVar2 = agnVar;
                                java.lang.Object obj5 = obj2;
                                boolean zD = bveVar2.D(defpackage.afga.f(obj5, agnVar2.f()));
                                java.lang.Object objG = bveVar2.g();
                                if (zD || objG == defpackage.bvd.a) {
                                    if (!defpackage.afga.f(obj5, agnVar2.f()) || adeVar4 == null) {
                                        acfVar = (defpackage.afga.f(obj5, agnVar2.d().f()) || defpackage.afga.f(obj5, agnVar2.d().g())) ? (defpackage.acf) affcVar5.invoke(abrVar4) : (defpackage.acf) affcVar5.invoke(new defpackage.ade(abrVar4, agnVar2.d().f(), obj5));
                                    } else {
                                        acfVar = (defpackage.acf) affcVar5.invoke(adeVar4);
                                    }
                                    objG = acfVar;
                                    bveVar2.x(objG);
                                }
                                defpackage.acf acfVar2 = (defpackage.acf) objG;
                                boolean zD2 = bveVar2.D(defpackage.afga.f(agnVar2.d().g(), obj5)) | bveVar2.D(defpackage.afga.f(obj5, agnVar2.f()));
                                java.lang.Object objG2 = bveVar2.g();
                                if (zD2 || objG2 == defpackage.bvd.a) {
                                    if (defpackage.afga.f(agnVar2.d().g(), obj5) || (defpackage.afga.f(obj5, agnVar2.f()) && adeVar4 != null)) {
                                        acxVar = defpackage.acx.a;
                                    } else {
                                        acxVar = (defpackage.afga.f(obj5, agnVar2.d().f()) || defpackage.afga.f(obj5, agnVar2.d().g())) ? ((defpackage.acf) affcVar5.invoke(abrVar4)).b : ((defpackage.acf) affcVar5.invoke(new defpackage.ade(abrVar4, obj5, agnVar2.d().f()))).b;
                                    }
                                    objG2 = acxVar;
                                    bveVar2.x(objG2);
                                }
                                defpackage.acx acxVar2 = (defpackage.acx) objG2;
                                java.lang.Object objG3 = bveVar2.g();
                                java.lang.Object obj6 = defpackage.bvd.a;
                                if (objG3 == obj6) {
                                    objG3 = new defpackage.abq(defpackage.afga.f(obj5, agnVar2.g()));
                                    bveVar2.x(objG3);
                                }
                                java.lang.Object obj7 = objF2;
                                defpackage.affc affcVar6 = affcVar2;
                                defpackage.acw acwVar = acfVar2.a;
                                defpackage.abq abqVar = (defpackage.abq) objG3;
                                defpackage.cgf adxVar = new defpackage.adx(acfVar2.c.e(), obj5);
                                abqVar.a.b(java.lang.Boolean.valueOf(defpackage.afga.f(obj5, agnVar2.g())));
                                java.lang.Object objInvoke2 = affcVar6.invoke(obj5);
                                abqVar.b.b(java.lang.Boolean.valueOf((obj7 == null || !defpackage.afga.f(objInvoke2, affcVar6.invoke(obj7)) || defpackage.afga.f(objInvoke2, affcVar6.invoke(agnVar2.g())) || defpackage.afga.f(objInvoke2, affcVar6.invoke(agnVar2.e()))) ? false : true));
                                if (abqVar != defpackage.cgf.e) {
                                    adxVar = new defpackage.cga(adxVar, abqVar);
                                }
                                defpackage.bil bilVar4 = bilVar3;
                                java.lang.Object obj8 = null;
                                if (bilVar4 != null) {
                                    if (defpackage.afga.f(obj5, agnVar2.f())) {
                                        obj8 = bilVar4.a;
                                    } else if (defpackage.afga.f(obj5, agnVar2.g())) {
                                        obj8 = bilVar4.b;
                                    }
                                }
                                java.lang.Object obj9 = obj8;
                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                if ((agnVar2 instanceof defpackage.aex) && (iIndexOf = snapshotStateList3.indexOf(obj5)) >= 0 && iIndexOf >= snapshotStateList3.a() - 3) {
                                    z2 = true;
                                }
                                boolean zE = bveVar2.E(obj5);
                                java.lang.Object objG4 = bveVar2.g();
                                if (zE || objG4 == obj6) {
                                    objG4 = new defpackage.aap(obj5, 3);
                                    bveVar2.x(objG4);
                                }
                                defpackage.affc affcVar7 = (defpackage.affc) objG4;
                                boolean zC4 = bveVar2.C(acxVar2);
                                java.lang.Object objG5 = bveVar2.g();
                                if (zC4 || objG5 == obj6) {
                                    objG5 = new defpackage.amc(acxVar2, 1);
                                    bveVar2.x(objG5);
                                }
                                defpackage.ca.ai(agnVar2, affcVar7, adxVar, acwVar, acxVar2, (defpackage.affg) objG5, (defpackage.ca) obj9, z2, defpackage.dai.as(-519005224, true, new defpackage.aca(obj5, snapshotStateList3, abrVar4, affiVar2, 1), bveVar2), bveVar2, 805306368, 64);
                            } else {
                                bveVar2.s();
                            }
                            return defpackage.afbk.a;
                        }
                    };
                    bilVar2 = bilVar3;
                    affcVar4 = affcVar;
                    aauVar3.m(obj2, defpackage.dai.as(427839334, true, affgVar, bveVarC));
                    affiVar2 = affiVar;
                    adeVar2 = adeVar3;
                    abrVar2 = abrVar3;
                    bwcVar3 = bwcVar4;
                    listE = list;
                    i10 = i11 + 1;
                    aauVar2 = aauVar3;
                }
                aauVar = aauVar2;
                adeVar = adeVar2;
                defpackage.bwc bwcVar5 = bwcVar3;
                z = true;
                abrVar = abrVar2;
                bwcVar5.Y(false);
                bwcVar = bwcVar5;
            }
            boolean zC4 = bveVarC.C(agnVar.d()) | bveVarC.C(adeVar) | bveVarC.C(abrVar);
            java.lang.Object objS6 = bwcVar.S();
            if (zC4 || objS6 == defpackage.bvd.a) {
                objS6 = (defpackage.acf) affcVar4.invoke(adeVar != null ? adeVar : abrVar);
                bwcVar.ad(objS6);
            }
            defpackage.acf acfVar = (defpackage.acf) objS6;
            boolean zC5 = bveVarC.C(abrVar);
            java.lang.Object objS7 = bwcVar.S();
            if (zC5 || objS7 == defpackage.bvd.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS7 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS7;
            defpackage.bys bysVarC = defpackage.bzd.c(acfVar.d, bveVarC);
            defpackage.agn agnVar2 = abrVar.a;
            if (defpackage.afga.f(agnVar2.e(), agnVar2.g())) {
                bwxVar.b(java.lang.Boolean.FALSE);
            } else if (bysVarC.a() != null) {
                bwxVar.b(java.lang.Boolean.TRUE);
            }
            if (((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                bveVarC.v(1353077497);
                agiVarAg = defpackage.afw.ag(agnVar2, defpackage.agt.h, bveVarC, 0);
                boolean zC6 = bveVarC.C(agiVarAg);
                java.lang.Object objS8 = bwcVar.S();
                if (zC6 || objS8 == defpackage.bvd.a) {
                    defpackage.adp adpVar = (defpackage.adp) bysVarC.a();
                    objS8 = (adpVar == null || adpVar.a) ? defpackage.cjv.h(defpackage.cgf.e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479) : defpackage.cgf.e;
                    bwcVar.ad(objS8);
                }
                cgfVar2 = (defpackage.cgf) objS8;
                bwcVar.Y(false);
            } else {
                bveVarC.v(1353343539);
                bwcVar.Y(false);
                abrVar.e = null;
                cgfVar2 = defpackage.cgf.e;
                agiVarAg = null;
            }
            defpackage.cgf cgfVarA = cgfVar.a(cgfVar2.a(new abr.a(agiVarAg, bysVarC, abrVar)));
            java.lang.Object objS9 = bwcVar.S();
            if (objS9 == defpackage.bvd.a) {
                objS9 = new defpackage.abm(abrVar);
                bwcVar.ad(objS9);
            }
            defpackage.abm abmVar = (defpackage.abm) objS9;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, abmVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.a(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bveVarC.v(758586511);
            java.util.List listE2 = snapshotStateList2.e();
            int size2 = listE2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                java.lang.Object obj3 = listE2.get(i12);
                bwcVar.ab(1420120067, affcVar2.invoke(obj3), 0, null);
                defpackage.affg affgVar2 = (defpackage.affg) aauVar.a(obj3);
                if (affgVar2 == null) {
                    bveVarC.v(1074085574);
                } else {
                    bveVarC.v(1420121243);
                    affgVar2.invoke(bveVarC, 0);
                }
                bwcVar.Y(false);
                bwcVar.Y(false);
            }
            bwcVar.Y(false);
            bwcVar.Y(z);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.ccy(agnVar, cgfVar, affcVar4, cfuVar, affcVar2, affcVar3, affiVar, i, 1);
        }
    }

    public static void Y(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static void Z(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static void a(java.lang.Runnable runnable) {
        defpackage.fdr fdrVar = defpackage.fdr.a;
        fdrVar.a("androidx.fragment");
        defpackage.fdm fdmVar = defpackage.fdm.b;
        try {
            runnable.run();
            defpackage.acmj.o(fdmVar);
        } catch (java.lang.Throwable th) {
            try {
                defpackage.edd.n(fdrVar, th);
                throw new defpackage.afap();
            } catch (java.lang.Throwable th2) {
                defpackage.acmj.o(fdmVar);
                throw th2;
            }
        }
    }

    public static boolean aA(defpackage.cqu cquVar) {
        return cquVar.b == 2;
    }

    public static defpackage.aor aB(defpackage.bve bveVar) {
        defpackage.kwv kwvVarA = defpackage.ads.a(bveVar);
        boolean zC = bveVar.C(kwvVarA);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zC || objS == defpackage.bvd.a) {
            objS = new defpackage.anm(kwvVarA);
            bwcVar.ad(objS);
        }
        return (defpackage.anm) objS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object aC(defpackage.aqk aqkVar, float f, defpackage.aej aejVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.apr aprVar;
        afgs afgsVar;
        if (afdkVar instanceof defpackage.apr) {
            aprVar = (defpackage.apr) afdkVar;
            int i = aprVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aprVar.b = i - Integer.MIN_VALUE;
            } else {
                aprVar = new defpackage.apr(afdkVar);
            }
        } else {
            aprVar = new defpackage.apr(afdkVar);
        }
        java.lang.Object obj = aprVar.a;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i2 = aprVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            afgs afgsVar2 = new afgs();
            defpackage.affg aptVar = new defpackage.apt(f, aejVar, afgsVar2, null);
            aprVar.c = afgsVar2;
            aprVar.b = 1;
            if (aqkVar.e(defpackage.akv.a, aptVar, aprVar) == obj2) {
                return obj2;
            }
            afgsVar = afgsVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgsVar = aprVar.c;
            defpackage.afga.cz(obj);
        }
        return new java.lang.Float(afgsVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object aD(defpackage.aqk aqkVar, float f, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.apu apuVar;
        afgs afgsVar;
        if (afdkVar instanceof defpackage.apu) {
            apuVar = (defpackage.apu) afdkVar;
            int i = apuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                apuVar.b = i - Integer.MIN_VALUE;
            } else {
                apuVar = new defpackage.apu(afdkVar);
            }
        } else {
            apuVar = new defpackage.apu(afdkVar);
        }
        java.lang.Object obj = apuVar.a;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i2 = apuVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            afgs afgsVar2 = new afgs();
            defpackage.affg apvVar = new defpackage.apv(afgsVar2, f, null);
            apuVar.c = afgsVar2;
            apuVar.b = 1;
            if (aqkVar.e(defpackage.akv.a, apvVar, apuVar) == obj2) {
                return obj2;
            }
            afgsVar = afgsVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgsVar = apuVar.c;
            defpackage.afga.cz(obj);
        }
        return new java.lang.Float(afgsVar.a);
    }

    public static boolean aF(defpackage.aqp aqpVar, float f) {
        float fA = aqpVar.a(f);
        if (fA < 0.0f) {
            return aqpVar.a.g();
        }
        if (fA <= 0.0f) {
            return false;
        }
        return aqpVar.a.h();
    }

    public static long aG(cpu cpuVar, defpackage.apn apnVar, defpackage.cpt cptVar) {
        float fIntBitsToFloat;
        if (apnVar != null) {
            int i = cptVar.a;
            if (i == 1) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cpuVar.c >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cpuVar.c & 4294967295L));
            }
            return apnVar == defpackage.apn.b ? ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32 : ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
        }
        return cpuVar.c;
    }

    public static long aH(cpu cpuVar, defpackage.apn apnVar, defpackage.cpt cptVar) {
        float fIntBitsToFloat;
        if (apnVar != null) {
            int i = cptVar.a;
            if (i == 1) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cpuVar.e >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cpuVar.e & 4294967295L));
            }
            return apnVar == defpackage.apn.b ? ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32 : ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
        }
        return cpuVar.e;
    }

    public static boolean aI(cpu cpuVar) {
        return !cpuVar.f && cpuVar.d;
    }

    public static boolean aJ(cpu cpuVar) {
        return cpuVar.f && !cpuVar.d;
    }

    public static java.lang.Object aK(defpackage.cri criVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        java.lang.Object objR = criVar.r(new defpackage.aou(afdkVar.gT(), affgVar, null), afdkVar);
        return objR == defpackage.afdr.a ? objR : defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:22:0x0067->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[EDGE_INSN: B:31:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:22:0x0067->B:26:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object aL(defpackage.cru r8, defpackage.cqv r9, defpackage.afdk r10) {
        /*
            boolean r0 = r10 instanceof defpackage.aot
            if (r0 == 0) goto L13
            r0 = r10
            aot r0 = (defpackage.aot) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aot r0 = new aot
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            cqv r8 = r0.c
            cru r9 = r0.d
            defpackage.afga.cz(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.afga.cz(r10)
            cqu r10 = r8.p()
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            crd r6 = (defpackage.crd) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L77
        L51:
            r0.d = r8
            r0.c = r9
            r0.b = r4
            java.lang.Object r10 = r8.r(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            cqu r10 = (defpackage.cqu) r10
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            crd r6 = (defpackage.crd) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            afbk r8 = defpackage.afbk.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aL(cru, cqv, afdk):java.lang.Object");
    }

    public static float aM(defpackage.dck dckVar, int i) {
        return i == 2 ? dckVar.d() * 0.0069444445f : dckVar.d();
    }

    public static java.lang.Object aN(defpackage.cri criVar, defpackage.affc affcVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        defpackage.akm akmVar = new defpackage.akm(affcVar, 2);
        int i = 12;
        java.lang.Object objAK = aK(criVar, new defpackage.aob(new defpackage.acm(i), akmVar, affgVar, aferVar2, new defpackage.act(aferVar, i), null), afdkVar);
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (objAK != afdrVar) {
            objAK = defpackage.afbk.a;
        }
        return objAK == afdrVar ? objAK : defpackage.afbk.a;
    }

    public static boolean aO(defpackage.cqu cquVar, long j) {
        java.lang.Object obj;
        java.util.List list = cquVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((defpackage.crd) obj).a == j) {
                break;
            }
            i++;
        }
        defpackage.crd crdVar = (defpackage.crd) obj;
        return crdVar == null || !crdVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [afgv] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static java.lang.Object aP(defpackage.cru cruVar, long j, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.anx anxVar;
        java.lang.Object obj;
        defpackage.crd crdVar;
        defpackage.afgq afgqVar;
        if (afdkVar instanceof defpackage.anx) {
            anxVar = (defpackage.anx) afdkVar;
            int i = anxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anxVar.b = i - Integer.MIN_VALUE;
            } else {
                anxVar = new defpackage.anx(afdkVar);
            }
        } else {
            anxVar = new defpackage.anx(afdkVar);
        }
        java.lang.Object obj2 = anxVar.a;
        java.lang.Object obj3 = defpackage.afdr.a;
        int i2 = anxVar.b;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj2);
                if (aO(cruVar.p(), j)) {
                    return null;
                }
                java.util.List list = cruVar.p().a;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((defpackage.crd) obj).a == j) {
                        break;
                    }
                    i3++;
                }
                crdVar = (defpackage.crd) obj;
                if (crdVar == null) {
                    return null;
                }
                defpackage.afgv afgvVar = new defpackage.afgv();
                defpackage.afgv afgvVar2 = new defpackage.afgv();
                afgvVar2.a = crdVar;
                long jF = cruVar.q().f();
                defpackage.afgq afgqVar2 = new defpackage.afgq();
                defpackage.affg anyVar = new defpackage.any(afgqVar2, afgvVar2, afgvVar, null);
                anxVar.c = crdVar;
                anxVar.d = afgvVar;
                anxVar.e = afgqVar2;
                anxVar.b = 1;
                if (cruVar.s(jF, anyVar, anxVar) == obj3) {
                    return obj3;
                }
                afgqVar = afgqVar2;
                j = afgvVar;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                afgqVar = anxVar.e;
                defpackage.afgv afgvVar3 = anxVar.d;
                crdVar = anxVar.c;
                defpackage.afga.cz(obj2);
                j = afgvVar3;
            }
            if (!afgqVar.a) {
                return null;
            }
            defpackage.crd crdVar2 = (defpackage.crd) j.a;
            return crdVar2 != null ? crdVar2 : crdVar;
        } catch (defpackage.cqw unused) {
            defpackage.crd crdVar3 = (defpackage.crd) j.a;
            return crdVar3 != null ? crdVar3 : crdVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd A[LOOP:0: B:24:0x00b8->B:28:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4 A[EDGE_INSN: B:67:0x00d4->B:30:0x00d4 BREAK  A[LOOP:0: B:24:0x00b8->B:28:0x00cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x015a -> B:59:0x015c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object aQ(defpackage.cru r18, long r19, defpackage.affg r21, defpackage.afdk r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aQ(cru, long, affg, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[LOOP:0: B:23:0x0068->B:27:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007e A[EDGE_INSN: B:54:0x007e->B:29:0x007e BREAK  A[LOOP:0: B:23:0x0068->B:27:0x007a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:22:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object aR(defpackage.cru r12, long r13, defpackage.afdk r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.aoa
            if (r0 == 0) goto L13
            r0 = r15
            aoa r0 = (defpackage.aoa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aoa r0 = new aoa
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            afgu r12 = r0.c
            cru r13 = r0.d
            defpackage.afga.cz(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5e
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.afga.cz(r15)
            cqu r15 = r12.p()
            boolean r15 = aO(r15, r13)
            if (r15 == 0) goto L45
            return r4
        L45:
            afgu r15 = new afgu
            r15.<init>()
            r15.a = r13
        L4c:
            r0.d = r12
            r0.c = r15
            r0.b = r3
            cqv r13 = defpackage.cqv.b
            java.lang.Object r13 = r12.r(r13, r0)
            if (r13 != r1) goto L5b
            return r1
        L5b:
            r11 = r15
            r15 = r13
            r13 = r11
        L5e:
            cqu r15 = (defpackage.cqu) r15
            java.util.List r14 = r15.a
            int r15 = r14.size()
            r2 = 0
            r5 = r2
        L68:
            if (r5 >= r15) goto L7d
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            crd r7 = (defpackage.crd) r7
            long r7 = r7.a
            long r9 = r13.a
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L7a
            goto L7e
        L7a:
            int r5 = r5 + 1
            goto L68
        L7d:
            r6 = r4
        L7e:
            crd r6 = (defpackage.crd) r6
            if (r6 != 0) goto L84
            r6 = r4
            goto Lb0
        L84:
            boolean r15 = defpackage.tq.l(r6)
            if (r15 == 0) goto Laa
            int r15 = r14.size()
        L8e:
            if (r2 >= r15) goto L9f
            java.lang.Object r5 = r14.get(r2)
            r7 = r5
            crd r7 = (defpackage.crd) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L9c
            goto La0
        L9c:
            int r2 = r2 + 1
            goto L8e
        L9f:
            r5 = r4
        La0:
            crd r5 = (defpackage.crd) r5
            if (r5 != 0) goto La5
            goto Lb0
        La5:
            long r14 = r5.a
            r13.a = r14
            goto Lba
        Laa:
            boolean r14 = defpackage.tq.n(r6)
            if (r14 == 0) goto Lba
        Lb0:
            if (r6 == 0) goto Lb9
            boolean r12 = r6.c()
            if (r12 != 0) goto Lb9
            return r6
        Lb9:
            return r4
        Lba:
            r15 = r13
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aR(cru, long, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [affc] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object aS(defpackage.cru r4, long r5, defpackage.affc r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.aod
            if (r0 == 0) goto L13
            r0 = r8
            aod r0 = (defpackage.aod) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aod r0 = new aod
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            cru r5 = r0.d
            defpackage.afga.cz(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.afga.cz(r8)
        L38:
            r0.d = r4
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = aR(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            crd r8 = (defpackage.crd) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = defpackage.tq.l(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aS(cru, long, affc, afdk):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object aT(defpackage.cri criVar, defpackage.affc affcVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        if ((i & 1) != 0) {
            affcVar = new defpackage.ajg(13);
        }
        return aN(criVar, affcVar, new defpackage.acm(10), new defpackage.acm(11), affgVar, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:233:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0297  */
    /* JADX WARN: Code duplicated, block: B:38:0x02ae A[LOOP:8: B:34:0x0295->B:38:0x02ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0451 -> B:156:0x05a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x04d9 -> B:82:0x03a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x053d -> B:82:0x03a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0589 -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05b4 -> B:157:0x05a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x061a -> B:171:0x061c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0233 -> B:73:0x0386). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x02bd -> B:73:0x0386). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0321 -> B:74:0x0387). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x036e -> B:70:0x0378). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0414 -> B:88:0x03c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object aU(defpackage.cru r23, defpackage.crd r24, defpackage.affh r25, defpackage.affg r26, defpackage.afer r27, defpackage.affc r28, defpackage.afdk r29) {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.aU(cru, crd, affh, affg, afer, affc, afdk):java.lang.Object");
    }

    public static int aV(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return bo(i2, i3, z);
        }
        boolean z2 = !z;
        if (bp(i, i2, i3, z2)) {
            return bn(i, i2, z);
        }
        return bp(i, i2, i3, z) ? bn(i, i2, z2) : bo(i2, i3, z2);
    }

    public static defpackage.cgf aW(defpackage.cgf cgfVar, defpackage.aqk aqkVar, defpackage.apn apnVar, defpackage.aiz aizVar, boolean z, defpackage.aor aorVar, defpackage.ask askVar, defpackage.and andVar) {
        return defpackage.afw.t(cgfVar, apnVar).a(new defpackage.alm(aqkVar, apnVar, z, aorVar, askVar, andVar, false, aizVar));
    }

    public static defpackage.all aX(defpackage.bve bveVar) {
        java.lang.Object[] objArr = new java.lang.Object[0];
        defpackage.cdz cdzVar = defpackage.all.g;
        boolean zA = bveVar.A(0);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zA || objS == defpackage.bvd.a) {
            objS = new defpackage.acm(9);
            bwcVar.ad(objS);
        }
        return (defpackage.all) defpackage.bxi.i(objArr, cdzVar, (defpackage.afer) objS, bveVar, 0);
    }

    public static defpackage.cgf aY(defpackage.cgf cgfVar, defpackage.all allVar) {
        defpackage.apn apnVar = defpackage.apn.a;
        return defpackage.afw.t(cgfVar, apnVar).a(new defpackage.alm(allVar, apnVar, true, null, allVar.b, null, true, null)).a(new defpackage.alp(allVar));
    }

    public static defpackage.cgf aZ(defpackage.cgf cgfVar) {
        return defpackage.dea.a(cgfVar, true, new defpackage.ajg(5));
    }

    public static void aa(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static void ab(java.lang.String str) {
        throw new java.util.NoSuchElementException(str);
    }

    public static java.util.Iterator ac(defpackage.abb abbVar) {
        abbVar.getClass();
        return new defpackage.abe(abbVar);
    }

    public static int ad(defpackage.zf zfVar, int i) {
        try {
            return defpackage.abg.a(zfVar.a, zfVar.c, i);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public static int ae(defpackage.zf zfVar, java.lang.Object obj, int i) {
        int i2 = zfVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iAd = ad(zfVar, i);
        if (iAd < 0 || defpackage.afga.f(obj, zfVar.b[iAd])) {
            return iAd;
        }
        int i3 = iAd + 1;
        while (i3 < i2 && zfVar.a[i3] == i) {
            if (defpackage.afga.f(obj, zfVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iAd - 1; i4 >= 0 && zfVar.a[i4] == i; i4--) {
            if (defpackage.afga.f(obj, zfVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static float af(defpackage.yu yuVar) {
        return ((defpackage.yv) yuVar.a).b;
    }

    public static float ag(defpackage.yu yuVar) {
        return ((defpackage.yv) yuVar.a).a;
    }

    public static void ah(defpackage.yu yuVar) {
        if (!yuVar.c()) {
            yuVar.a(0, 0, 0, 0);
            return;
        }
        float fAf = af(yuVar);
        float fAg = ag(yuVar);
        int iCeil = (int) java.lang.Math.ceil(yw.a(fAf, fAg, yuVar.b()));
        int iCeil2 = (int) java.lang.Math.ceil(yw.b(fAf, fAg, yuVar.b()));
        yuVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static void ai(defpackage.agn agnVar, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.affg affgVar, defpackage.ca caVar, boolean z, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.ca caVar2;
        defpackage.bve bveVar2;
        boolean z2;
        defpackage.ca caVar3;
        boolean z3;
        boolean z4;
        defpackage.acj acjVarR;
        defpackage.affh affhVar2 = affhVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(978633943);
        int i4 = i3 == 0 ? (true != bveVarC.C(agnVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != bveVarC.C(acwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != bveVarC.C(acxVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != bveVarC.E(affgVar) ? 65536 : 131072;
        }
        if ((i2 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= true != ((2097152 & i) == 0 ? bveVarC.C(null) : bveVarC.E(null)) ? 524288 : 1048576;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
            caVar2 = caVar;
        } else {
            caVar2 = caVar;
            if ((i & 12582912) == 0) {
                i4 |= true != bveVarC.E(caVar2) ? 4194304 : 8388608;
            }
        }
        int i6 = i2 & 256;
        boolean z5 = i6 == 0;
        if (i6 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= true != bveVarC.D(z) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != bveVarC.E(affhVar2) ? 268435456 : 536870912;
        }
        if (bveVarC.I((306783379 & i4) != 306783378, i4 & 1)) {
            defpackage.ca caVar4 = i5 != 0 ? null : caVar2;
            boolean z6 = z5 & z;
            java.lang.Object objF = agnVar.f();
            if (z6 || ((java.lang.Boolean) affcVar.invoke(agnVar.g())).booleanValue() || ((java.lang.Boolean) affcVar.invoke(agnVar.e())).booleanValue() || ((objF != null && ((java.lang.Boolean) affcVar.invoke(objF)).booleanValue()) || agnVar.w() || agnVar.u())) {
                bveVarC.v(246708267);
                int i7 = i4 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                int i10 = i4;
                boolean z7 = ((i9 ^ 6) > 4 && bveVarC.C(agnVar)) || (i8 & 6) == 4;
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (z7 || objS == defpackage.bvd.a) {
                    objS = agnVar.e();
                    bwcVar.ad(objS);
                }
                if (agnVar.w()) {
                    objS = agnVar.e();
                }
                bveVarC.v(-1260162954);
                defpackage.acj acjVarR2 = R(agnVar, affcVar, objS, bveVarC);
                bwcVar.Y(false);
                java.lang.Object objG = agnVar.g();
                bveVarC.v(-1260162954);
                defpackage.acj acjVarR3 = R(agnVar, affcVar, objG, bveVarC);
                bwcVar.Y(false);
                int i11 = i9 | 3072;
                int i12 = (i11 & 14) ^ 6;
                boolean z8 = (i12 > 4 && bveVarC.C(agnVar)) || (i11 & 6) == 4;
                java.lang.Object objS2 = bwcVar.S();
                if (z8 || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.agn(new defpackage.aft(acjVarR2), agnVar, java.lang.String.valueOf(agnVar.b).concat(" > EnterExitTransition"));
                    bwcVar.ad(objS2);
                }
                defpackage.agn agnVar2 = (defpackage.agn) objS2;
                boolean zC = ((i12 > 4 && bveVarC.C(agnVar)) || (i11 & 6) == 4) | bveVarC.C(agnVar2);
                java.lang.Object objS3 = bwcVar.S();
                if (zC || objS3 == defpackage.bvd.a) {
                    objS3 = new defpackage.abp(agnVar, agnVar2, 16, null);
                    bwcVar.ad(objS3);
                }
                defpackage.bvx.c(agnVar2, (defpackage.affc) objS3, bveVarC);
                if (agnVar.w()) {
                    long j = agnVar.g;
                    agnVar2.y(acjVarR2, acjVarR3);
                    z3 = false;
                } else {
                    agnVar2.t(acjVarR3);
                    z3 = false;
                    agnVar2.o(false);
                }
                if (agnVar.w()) {
                    bveVarC.v(782538635);
                    bwcVar.Y(z3);
                } else {
                    bveVarC.v(782386797);
                    java.lang.Object objF2 = agnVar.f();
                    if (objF2 == null) {
                        bveVarC.v(782437481);
                        bwcVar.Y(z3);
                        acjVarR = null;
                    } else {
                        bveVarC.v(782437482);
                        bveVarC.v(-1260162954);
                        acjVarR = R(agnVar, affcVar, objF2, bveVarC);
                        bwcVar.Y(z3);
                        bwcVar.Y(z3);
                    }
                    java.lang.Object objF3 = agnVar2.f();
                    boolean z9 = objF3 != null && acjVarR == null && defpackage.afga.f(agnVar2.g(), agnVar2.e());
                    agnVar2.c.b(acjVarR);
                    if (z9) {
                        agnVar2.p(new defpackage.agk(objF3, agnVar2.g()));
                        agnVar2.a.c(objF3);
                        if (!agnVar2.v()) {
                            agnVar2.s(true);
                        }
                        java.util.List listE = agnVar2.e.e();
                        int size = listE.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            ((defpackage.agl) listE.get(i13)).h(-2.0f);
                        }
                    }
                    bwcVar.Y(false);
                }
                java.lang.Object objS4 = bwcVar.S();
                if (i7 == 4 || objS4 == defpackage.bvd.a) {
                    objS4 = new defpackage.adi();
                    bwcVar.ad(objS4);
                }
                defpackage.adi adiVar = (defpackage.adi) objS4;
                adiVar.j(caVar4);
                defpackage.adi adiVarK = defpackage.acs.k(agnVar2, adiVar, bveVarC, 0);
                defpackage.acw acwVarX = defpackage.acs.x(agnVar2, acwVar, adiVarK, bveVarC, (i10 >> 6) & 112);
                defpackage.acx acxVarY = defpackage.acs.y(agnVar2, acxVar, adiVarK, bveVarC, (i10 >> 9) & 112);
                defpackage.bys bysVarC = defpackage.bzd.c(affgVar, bveVarC);
                java.lang.Object objInvoke = affgVar.invoke(agnVar2.e(), agnVar2.g());
                boolean zC2 = bveVarC.C(agnVar2) | bveVarC.C(bysVarC);
                java.lang.Object objS5 = bwcVar.S();
                if (zC2 || objS5 == defpackage.bvd.a) {
                    objS5 = new defpackage.blf(agnVar2, bysVarC, (defpackage.afdk) null, 1);
                    bwcVar.ad(objS5);
                }
                defpackage.affg affgVar2 = (defpackage.affg) objS5;
                java.lang.Object objS6 = bwcVar.S();
                java.lang.Object obj = defpackage.bvd.a;
                if (objS6 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(objInvoke, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState);
                    objS6 = parcelableSnapshotMutableState;
                }
                defpackage.bwx bwxVar = (defpackage.bwx) objS6;
                defpackage.afbk afbkVar = defpackage.afbk.a;
                boolean zE = bveVarC.E(affgVar2);
                java.lang.Object objS7 = bwcVar.S();
                if (zE || objS7 == obj) {
                    objS7 = new defpackage.amx(affgVar2, bwxVar, (defpackage.afdk) null, 6);
                    bwcVar.ad(objS7);
                }
                defpackage.bvx.g(afbkVar, (defpackage.affg) objS7, bveVarC);
                if (O(agnVar2) && ((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                    bveVarC.v(250085035);
                    bwcVar.Y(false);
                    affhVar2 = affhVar;
                    z4 = false;
                    bveVar2 = bveVarC;
                } else {
                    bveVarC.v(248647379);
                    java.lang.Object objS8 = bwcVar.S();
                    if (i7 == 4 || objS8 == obj) {
                        objS8 = new defpackage.acc(agnVar2);
                        bwcVar.ad(objS8);
                    }
                    defpackage.acc accVar = (defpackage.acc) objS8;
                    int i14 = 16;
                    defpackage.cgf cgfVarM = defpackage.acs.m(agnVar2, acwVarX, acxVarY, adiVarK, "Built-in", bveVarC, 1575936, 8);
                    bveVar2 = bveVarC;
                    bveVar2.v(-130485473);
                    bwcVar.Y(false);
                    defpackage.cgf cgfVarA = cgfVar.a(cgfVarM.a(defpackage.cgf.e));
                    java.lang.Object objS9 = bwcVar.S();
                    if (objS9 == obj) {
                        objS9 = new defpackage.abu(accVar);
                        bwcVar.ad(objS9);
                    }
                    defpackage.abu abuVar = (defpackage.abu) objS9;
                    long j2 = bwcVar.u;
                    long j3 = j2 ^ (j2 >>> 32);
                    defpackage.cdd cddVarAh = bwcVar.ah();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarA);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar2.w();
                    if (bwcVar.t) {
                        bveVar2.j(aferVar);
                    } else {
                        bveVar2.y();
                    }
                    defpackage.byw.c(bveVar2, abuVar, defpackage.cwl.e);
                    defpackage.byw.c(bveVar2, cddVarAh, defpackage.cwl.d);
                    defpackage.byw.a(bveVar2, java.lang.Integer.valueOf((int) j3), defpackage.cwl.f);
                    bveVar2.i(afbkVar, new defpackage.amc(defpackage.cwl.g, i14));
                    defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                    affhVar2 = affhVar;
                    affhVar2.invoke(accVar, bveVar2, java.lang.Integer.valueOf((i10 >> 24) & 112));
                    bwcVar.Y(true);
                    z4 = false;
                    bwcVar.Y(false);
                }
                bwcVar.Y(z4);
            } else {
                bveVarC.v(250090987);
                ((defpackage.bwc) bveVarC).Y(false);
                bveVar2 = bveVarC;
                caVar4 = caVar4;
            }
            z2 = z6;
            caVar3 = caVar4;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z2 = z;
            caVar3 = caVar2;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.axf(agnVar, affcVar, cgfVar, acwVar, acxVar, affgVar, caVar3, z2, affhVar2, i, i2, 1);
        }
    }

    public static float aj(defpackage.kwv kwvVar, float f) {
        return ((defpackage.ael) kwvVar.T().a(new defpackage.ael(0.0f), new defpackage.ael(f))).a;
    }

    public static defpackage.cgf ak(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.avo(affcVar));
    }

    public static defpackage.cgf al(defpackage.cgf cgfVar, float f, float f2) {
        return cgfVar.a(new defpackage.avm(f, f2));
    }

    public static defpackage.cgf am(defpackage.cgf cgfVar, int i) {
        return cgfVar.a(new defpackage.avf(i));
    }

    public static defpackage.cgf an(defpackage.cgf cgfVar) {
        return cgfVar.a(new defpackage.avi());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x0158  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    public static void ao(defpackage.cgf cgfVar, defpackage.atb atbVar, defpackage.ath athVar, defpackage.cfy cfyVar, int i, int i2, final defpackage.affh affhVar, defpackage.bve bveVar, final int i3, final int i4) {
        int i5;
        defpackage.atb atbVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        defpackage.bve bveVar2;
        final defpackage.cgf cgfVar2;
        final defpackage.ath athVar2;
        final defpackage.cfy cfyVar2;
        final defpackage.atb atbVar3;
        final int i16;
        final int i17;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar3;
        int i18;
        defpackage.atb atbVar4;
        defpackage.ath athVar3;
        int i19;
        defpackage.cfy cfyVar3;
        int i20;
        int i21;
        int i22 = i4 & 1;
        defpackage.bve bveVarC = bveVar.c(-1303174015);
        if (i22 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        int i23 = i4 & 2;
        if (i23 == 0) {
            if ((i3 & 48) == 0) {
                atbVar2 = atbVar;
                i5 |= true != bveVarC.C(atbVar2) ? 16 : 32;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    if (true != bveVarC.C(athVar)) {
                        i7 = 128;
                    } else {
                        i7 = 256;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        if (true != bveVarC.C(cfyVar)) {
                            i9 = 1024;
                        } else {
                            i9 = 2048;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            i11 = i;
                            if (true != bveVarC.A(i11)) {
                                i12 = 8192;
                            } else {
                                i12 = 16384;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            if ((196608 & i3) == 0) {
                                i14 = i2;
                                if (true != bveVarC.A(i14)) {
                                    i15 = 65536;
                                } else {
                                    i15 = 131072;
                                }
                                i5 |= i15;
                            }
                            if ((i3 & 1572864) == 0) {
                                if (true != bveVarC.E(affhVar)) {
                                    i21 = 524288;
                                } else {
                                    i21 = 1048576;
                                }
                                i5 |= i21;
                            }
                            if ((599187 & i5) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (bveVarC.I(z, i5 & 1)) {
                                if (i22 != 0) {
                                    cgfVar3 = defpackage.cgf.e;
                                } else {
                                    cgfVar3 = cgfVar;
                                }
                                if (i23 != 0) {
                                    atbVar4 = defpackage.ati.a;
                                    i18 = i8;
                                } else {
                                    i18 = i8;
                                    atbVar4 = atbVar2;
                                }
                                if (i6 != 0) {
                                    athVar3 = defpackage.ati.c;
                                } else {
                                    athVar3 = athVar;
                                }
                                if (i18 != 0) {
                                    cfyVar3 = defpackage.cfs.m;
                                    i19 = i10;
                                } else {
                                    i19 = i10;
                                    cfyVar3 = cfyVar;
                                }
                                if (i19 != 0) {
                                    i11 = Integer.MAX_VALUE;
                                }
                                if (i13 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                } else {
                                    i20 = i14;
                                }
                                int i24 = 57344 & i5;
                                int i25 = 458752 & i5;
                                bveVar2 = bveVarC;
                                ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i24 | i25 | (29360128 & (i5 << 3)));
                                cgfVar2 = cgfVar3;
                                atbVar3 = atbVar4;
                                athVar2 = athVar3;
                                cfyVar2 = cfyVar3;
                                i16 = i20;
                            } else {
                                bveVar2 = bveVarC;
                                bveVar2.s();
                                cgfVar2 = cgfVar;
                                athVar2 = athVar;
                                cfyVar2 = cfyVar;
                                atbVar3 = atbVar2;
                                i16 = i14;
                            }
                            i17 = i11;
                            bxlVarJ = bveVar2.J();
                            if (bxlVarJ != null) {
                                bxlVarJ.c = new defpackage.affg() { // from class: aup
                                    @Override // defpackage.affg
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        defpackage.bve bveVar3 = (defpackage.bve) obj;
                                        ((java.lang.Integer) obj2).intValue();
                                        defpackage.cgf cgfVar4 = cgfVar2;
                                        defpackage.atb atbVar5 = atbVar3;
                                        defpackage.ath athVar4 = athVar2;
                                        int i26 = i3 | 1;
                                        int i27 = 306783378 & i26;
                                        int i28 = 613566756 & i26;
                                        defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i26 & (-920350135)) | i27 | (i28 >> 1) | ((i27 + i27) & i28), i4);
                                        return defpackage.afbk.a;
                                    }
                                };
                            }
                        }
                        i5 |= 196608;
                        i14 = i2;
                        if ((i3 & 1572864) == 0) {
                            if (true != bveVarC.E(affhVar)) {
                                i21 = 524288;
                            } else {
                                i21 = 1048576;
                            }
                            i5 |= i21;
                        }
                        if ((599187 & i5) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i5 & 1)) {
                            if (i22 != 0) {
                                cgfVar3 = defpackage.cgf.e;
                            } else {
                                cgfVar3 = cgfVar;
                            }
                            if (i23 != 0) {
                                atbVar4 = defpackage.ati.a;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                atbVar4 = atbVar2;
                            }
                            if (i6 != 0) {
                                athVar3 = defpackage.ati.c;
                            } else {
                                athVar3 = athVar;
                            }
                            if (i18 != 0) {
                                cfyVar3 = defpackage.cfs.m;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cfyVar3 = cfyVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            int i26 = 57344 & i5;
                            int i27 = 458752 & i5;
                            bveVar2 = bveVarC;
                            ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i26 | i27 | (29360128 & (i5 << 3)));
                            cgfVar2 = cgfVar3;
                            atbVar3 = atbVar4;
                            athVar2 = athVar3;
                            cfyVar2 = cfyVar3;
                            i16 = i20;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            cgfVar2 = cgfVar;
                            athVar2 = athVar;
                            cfyVar2 = cfyVar;
                            atbVar3 = atbVar2;
                            i16 = i14;
                        }
                        i17 = i11;
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: aup
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    defpackage.cgf cgfVar4 = cgfVar2;
                                    defpackage.atb atbVar5 = atbVar3;
                                    defpackage.ath athVar4 = athVar2;
                                    int i28 = i3 | 1;
                                    int i29 = 306783378 & i28;
                                    int i210 = 613566756 & i28;
                                    defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i28 & (-920350135)) | i29 | (i210 >> 1) | ((i29 + i29) & i210), i4);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (true != bveVarC.A(i14)) {
                                i15 = 65536;
                            } else {
                                i15 = 131072;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (true != bveVarC.E(affhVar)) {
                                i21 = 524288;
                            } else {
                                i21 = 1048576;
                            }
                            i5 |= i21;
                        }
                        if ((599187 & i5) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i5 & 1)) {
                            if (i22 != 0) {
                                cgfVar3 = defpackage.cgf.e;
                            } else {
                                cgfVar3 = cgfVar;
                            }
                            if (i23 != 0) {
                                atbVar4 = defpackage.ati.a;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                atbVar4 = atbVar2;
                            }
                            if (i6 != 0) {
                                athVar3 = defpackage.ati.c;
                            } else {
                                athVar3 = athVar;
                            }
                            if (i18 != 0) {
                                cfyVar3 = defpackage.cfs.m;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cfyVar3 = cfyVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            int i28 = 57344 & i5;
                            int i29 = 458752 & i5;
                            bveVar2 = bveVarC;
                            ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i28 | i29 | (29360128 & (i5 << 3)));
                            cgfVar2 = cgfVar3;
                            atbVar3 = atbVar4;
                            athVar2 = athVar3;
                            cfyVar2 = cfyVar3;
                            i16 = i20;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            cgfVar2 = cgfVar;
                            athVar2 = athVar;
                            cfyVar2 = cfyVar;
                            atbVar3 = atbVar2;
                            i16 = i14;
                        }
                        i17 = i11;
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: aup
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    defpackage.cgf cgfVar4 = cgfVar2;
                                    defpackage.atb atbVar5 = atbVar3;
                                    defpackage.ath athVar4 = athVar2;
                                    int i210 = i3 | 1;
                                    int i211 = 306783378 & i210;
                                    int i212 = 613566756 & i210;
                                    defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i210 & (-920350135)) | i211 | (i212 >> 1) | ((i211 + i211) & i212), i4);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i210 = 57344 & i5;
                        int i211 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i210 | i211 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i212 = i3 | 1;
                                int i213 = 306783378 & i212;
                                int i214 = 613566756 & i212;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i212 & (-920350135)) | i213 | (i214 >> 1) | ((i213 + i213) & i214), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 3072;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (true != bveVarC.A(i11)) {
                            i12 = 8192;
                        } else {
                            i12 = 16384;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (true != bveVarC.A(i14)) {
                                i15 = 65536;
                            } else {
                                i15 = 131072;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (true != bveVarC.E(affhVar)) {
                                i21 = 524288;
                            } else {
                                i21 = 1048576;
                            }
                            i5 |= i21;
                        }
                        if ((599187 & i5) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i5 & 1)) {
                            if (i22 != 0) {
                                cgfVar3 = defpackage.cgf.e;
                            } else {
                                cgfVar3 = cgfVar;
                            }
                            if (i23 != 0) {
                                atbVar4 = defpackage.ati.a;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                atbVar4 = atbVar2;
                            }
                            if (i6 != 0) {
                                athVar3 = defpackage.ati.c;
                            } else {
                                athVar3 = athVar;
                            }
                            if (i18 != 0) {
                                cfyVar3 = defpackage.cfs.m;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cfyVar3 = cfyVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            int i212 = 57344 & i5;
                            int i213 = 458752 & i5;
                            bveVar2 = bveVarC;
                            ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i212 | i213 | (29360128 & (i5 << 3)));
                            cgfVar2 = cgfVar3;
                            atbVar3 = atbVar4;
                            athVar2 = athVar3;
                            cfyVar2 = cfyVar3;
                            i16 = i20;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            cgfVar2 = cgfVar;
                            athVar2 = athVar;
                            cfyVar2 = cfyVar;
                            atbVar3 = atbVar2;
                            i16 = i14;
                        }
                        i17 = i11;
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: aup
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    defpackage.cgf cgfVar4 = cgfVar2;
                                    defpackage.atb atbVar5 = atbVar3;
                                    defpackage.ath athVar4 = athVar2;
                                    int i214 = i3 | 1;
                                    int i215 = 306783378 & i214;
                                    int i216 = 613566756 & i214;
                                    defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i214 & (-920350135)) | i215 | (i216 >> 1) | ((i215 + i215) & i216), i4);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i214 = 57344 & i5;
                        int i215 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i214 | i215 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i216 = i3 | 1;
                                int i217 = 306783378 & i216;
                                int i218 = 613566756 & i216;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i216 & (-920350135)) | i217 | (i218 >> 1) | ((i217 + i217) & i218), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (true != bveVarC.A(i14)) {
                            i15 = 65536;
                        } else {
                            i15 = 131072;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i216 = 57344 & i5;
                        int i217 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i216 | i217 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i218 = i3 | 1;
                                int i219 = 306783378 & i218;
                                int i2110 = 613566756 & i218;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i218 & (-920350135)) | i219 | (i2110 >> 1) | ((i219 + i219) & i2110), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i218 = 57344 & i5;
                    int i219 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i218 | i219 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i2110 = i3 | 1;
                            int i2111 = 306783378 & i2110;
                            int i2112 = 613566756 & i2110;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2110 & (-920350135)) | i2111 | (i2112 >> 1) | ((i2111 + i2111) & i2112), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 384;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (true != bveVarC.C(cfyVar)) {
                        i9 = 1024;
                    } else {
                        i9 = 2048;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (true != bveVarC.A(i11)) {
                            i12 = 8192;
                        } else {
                            i12 = 16384;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (true != bveVarC.A(i14)) {
                                i15 = 65536;
                            } else {
                                i15 = 131072;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (true != bveVarC.E(affhVar)) {
                                i21 = 524288;
                            } else {
                                i21 = 1048576;
                            }
                            i5 |= i21;
                        }
                        if ((599187 & i5) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i5 & 1)) {
                            if (i22 != 0) {
                                cgfVar3 = defpackage.cgf.e;
                            } else {
                                cgfVar3 = cgfVar;
                            }
                            if (i23 != 0) {
                                atbVar4 = defpackage.ati.a;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                atbVar4 = atbVar2;
                            }
                            if (i6 != 0) {
                                athVar3 = defpackage.ati.c;
                            } else {
                                athVar3 = athVar;
                            }
                            if (i18 != 0) {
                                cfyVar3 = defpackage.cfs.m;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cfyVar3 = cfyVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            int i2110 = 57344 & i5;
                            int i2111 = 458752 & i5;
                            bveVar2 = bveVarC;
                            ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2110 | i2111 | (29360128 & (i5 << 3)));
                            cgfVar2 = cgfVar3;
                            atbVar3 = atbVar4;
                            athVar2 = athVar3;
                            cfyVar2 = cfyVar3;
                            i16 = i20;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            cgfVar2 = cgfVar;
                            athVar2 = athVar;
                            cfyVar2 = cfyVar;
                            atbVar3 = atbVar2;
                            i16 = i14;
                        }
                        i17 = i11;
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: aup
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    defpackage.cgf cgfVar4 = cgfVar2;
                                    defpackage.atb atbVar5 = atbVar3;
                                    defpackage.ath athVar4 = athVar2;
                                    int i2112 = i3 | 1;
                                    int i2113 = 306783378 & i2112;
                                    int i2114 = 613566756 & i2112;
                                    defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2112 & (-920350135)) | i2113 | (i2114 >> 1) | ((i2113 + i2113) & i2114), i4);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i2112 = 57344 & i5;
                        int i2113 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2112 | i2113 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i2114 = i3 | 1;
                                int i2115 = 306783378 & i2114;
                                int i2116 = 613566756 & i2114;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2114 & (-920350135)) | i2115 | (i2116 >> 1) | ((i2115 + i2115) & i2116), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (true != bveVarC.A(i14)) {
                            i15 = 65536;
                        } else {
                            i15 = 131072;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i2114 = 57344 & i5;
                        int i2115 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2114 | i2115 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i2116 = i3 | 1;
                                int i2117 = 306783378 & i2116;
                                int i2118 = 613566756 & i2116;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2116 & (-920350135)) | i2117 | (i2118 >> 1) | ((i2117 + i2117) & i2118), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i2116 = 57344 & i5;
                    int i2117 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2116 | i2117 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i2118 = i3 | 1;
                            int i2119 = 306783378 & i2118;
                            int i21110 = 613566756 & i2118;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2118 & (-920350135)) | i2119 | (i21110 >> 1) | ((i2119 + i2119) & i21110), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (true != bveVarC.A(i11)) {
                        i12 = 8192;
                    } else {
                        i12 = 16384;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (true != bveVarC.A(i14)) {
                            i15 = 65536;
                        } else {
                            i15 = 131072;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i2118 = 57344 & i5;
                        int i2119 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2118 | i2119 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i21110 = i3 | 1;
                                int i21111 = 306783378 & i21110;
                                int i21112 = 613566756 & i21110;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21110 & (-920350135)) | i21111 | (i21112 >> 1) | ((i21111 + i21111) & i21112), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i21110 = 57344 & i5;
                    int i21111 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21110 | i21111 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i21112 = i3 | 1;
                            int i21113 = 306783378 & i21112;
                            int i21114 = 613566756 & i21112;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21112 & (-920350135)) | i21113 | (i21114 >> 1) | ((i21113 + i21113) & i21114), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (true != bveVarC.A(i14)) {
                        i15 = 65536;
                    } else {
                        i15 = 131072;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i21112 = 57344 & i5;
                    int i21113 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21112 | i21113 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i21114 = i3 | 1;
                            int i21115 = 306783378 & i21114;
                            int i21116 = 613566756 & i21114;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21114 & (-920350135)) | i21115 | (i21116 >> 1) | ((i21115 + i21115) & i21116), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i21 = 524288;
                } else {
                    i21 = 1048576;
                }
                i5 |= i21;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i5 & 1)) {
                if (i22 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                if (i23 != 0) {
                    atbVar4 = defpackage.ati.a;
                    i18 = i8;
                } else {
                    i18 = i8;
                    atbVar4 = atbVar2;
                }
                if (i6 != 0) {
                    athVar3 = defpackage.ati.c;
                } else {
                    athVar3 = athVar;
                }
                if (i18 != 0) {
                    cfyVar3 = defpackage.cfs.m;
                    i19 = i10;
                } else {
                    i19 = i10;
                    cfyVar3 = cfyVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                int i21114 = 57344 & i5;
                int i21115 = 458752 & i5;
                bveVar2 = bveVarC;
                ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21114 | i21115 | (29360128 & (i5 << 3)));
                cgfVar2 = cgfVar3;
                atbVar3 = atbVar4;
                athVar2 = athVar3;
                cfyVar2 = cfyVar3;
                i16 = i20;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar2 = cgfVar;
                athVar2 = athVar;
                cfyVar2 = cfyVar;
                atbVar3 = atbVar2;
                i16 = i14;
            }
            i17 = i11;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: aup
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cgf cgfVar4 = cgfVar2;
                        defpackage.atb atbVar5 = atbVar3;
                        defpackage.ath athVar4 = athVar2;
                        int i21116 = i3 | 1;
                        int i21117 = 306783378 & i21116;
                        int i21118 = 613566756 & i21116;
                        defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21116 & (-920350135)) | i21117 | (i21118 >> 1) | ((i21117 + i21117) & i21118), i4);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i5 |= 48;
        atbVar2 = atbVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                if (true != bveVarC.C(athVar)) {
                    i7 = 128;
                } else {
                    i7 = 256;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    if (true != bveVarC.C(cfyVar)) {
                        i9 = 1024;
                    } else {
                        i9 = 2048;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (true != bveVarC.A(i11)) {
                            i12 = 8192;
                        } else {
                            i12 = 16384;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        if ((196608 & i3) == 0) {
                            i14 = i2;
                            if (true != bveVarC.A(i14)) {
                                i15 = 65536;
                            } else {
                                i15 = 131072;
                            }
                            i5 |= i15;
                        }
                        if ((i3 & 1572864) == 0) {
                            if (true != bveVarC.E(affhVar)) {
                                i21 = 524288;
                            } else {
                                i21 = 1048576;
                            }
                            i5 |= i21;
                        }
                        if ((599187 & i5) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i5 & 1)) {
                            if (i22 != 0) {
                                cgfVar3 = defpackage.cgf.e;
                            } else {
                                cgfVar3 = cgfVar;
                            }
                            if (i23 != 0) {
                                atbVar4 = defpackage.ati.a;
                                i18 = i8;
                            } else {
                                i18 = i8;
                                atbVar4 = atbVar2;
                            }
                            if (i6 != 0) {
                                athVar3 = defpackage.ati.c;
                            } else {
                                athVar3 = athVar;
                            }
                            if (i18 != 0) {
                                cfyVar3 = defpackage.cfs.m;
                                i19 = i10;
                            } else {
                                i19 = i10;
                                cfyVar3 = cfyVar;
                            }
                            if (i19 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i13 != 0) {
                                i20 = Integer.MAX_VALUE;
                            } else {
                                i20 = i14;
                            }
                            int i21116 = 57344 & i5;
                            int i21117 = 458752 & i5;
                            bveVar2 = bveVarC;
                            ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21116 | i21117 | (29360128 & (i5 << 3)));
                            cgfVar2 = cgfVar3;
                            atbVar3 = atbVar4;
                            athVar2 = athVar3;
                            cfyVar2 = cfyVar3;
                            i16 = i20;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            cgfVar2 = cgfVar;
                            athVar2 = athVar;
                            cfyVar2 = cfyVar;
                            atbVar3 = atbVar2;
                            i16 = i14;
                        }
                        i17 = i11;
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: aup
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    defpackage.cgf cgfVar4 = cgfVar2;
                                    defpackage.atb atbVar5 = atbVar3;
                                    defpackage.ath athVar4 = athVar2;
                                    int i21118 = i3 | 1;
                                    int i21119 = 306783378 & i21118;
                                    int i211110 = 613566756 & i21118;
                                    defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21118 & (-920350135)) | i21119 | (i211110 >> 1) | ((i21119 + i21119) & i211110), i4);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i5 |= 196608;
                    i14 = i2;
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i21118 = 57344 & i5;
                        int i21119 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21118 | i21119 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i211110 = i3 | 1;
                                int i211111 = 306783378 & i211110;
                                int i211112 = 613566756 & i211110;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i211110 & (-920350135)) | i211111 | (i211112 >> 1) | ((i211111 + i211111) & i211112), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (true != bveVarC.A(i14)) {
                            i15 = 65536;
                        } else {
                            i15 = 131072;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i211110 = 57344 & i5;
                        int i211111 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i211110 | i211111 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i211112 = i3 | 1;
                                int i211113 = 306783378 & i211112;
                                int i211114 = 613566756 & i211112;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i211112 & (-920350135)) | i211113 | (i211114 >> 1) | ((i211113 + i211113) & i211114), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i211112 = 57344 & i5;
                    int i211113 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i211112 | i211113 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i211114 = i3 | 1;
                            int i211115 = 306783378 & i211114;
                            int i211116 = 613566756 & i211114;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i211114 & (-920350135)) | i211115 | (i211116 >> 1) | ((i211115 + i211115) & i211116), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 3072;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (true != bveVarC.A(i11)) {
                        i12 = 8192;
                    } else {
                        i12 = 16384;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (true != bveVarC.A(i14)) {
                            i15 = 65536;
                        } else {
                            i15 = 131072;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i211114 = 57344 & i5;
                        int i211115 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i211114 | i211115 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i211116 = i3 | 1;
                                int i211117 = 306783378 & i211116;
                                int i211118 = 613566756 & i211116;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i211116 & (-920350135)) | i211117 | (i211118 >> 1) | ((i211117 + i211117) & i211118), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i211116 = 57344 & i5;
                    int i211117 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i211116 | i211117 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i211118 = i3 | 1;
                            int i211119 = 306783378 & i211118;
                            int i2111110 = 613566756 & i211118;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i211118 & (-920350135)) | i211119 | (i2111110 >> 1) | ((i211119 + i211119) & i2111110), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (true != bveVarC.A(i14)) {
                        i15 = 65536;
                    } else {
                        i15 = 131072;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i211118 = 57344 & i5;
                    int i211119 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i211118 | i211119 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i2111110 = i3 | 1;
                            int i2111111 = 306783378 & i2111110;
                            int i2111112 = 613566756 & i2111110;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2111110 & (-920350135)) | i2111111 | (i2111112 >> 1) | ((i2111111 + i2111111) & i2111112), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i21 = 524288;
                } else {
                    i21 = 1048576;
                }
                i5 |= i21;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i5 & 1)) {
                if (i22 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                if (i23 != 0) {
                    atbVar4 = defpackage.ati.a;
                    i18 = i8;
                } else {
                    i18 = i8;
                    atbVar4 = atbVar2;
                }
                if (i6 != 0) {
                    athVar3 = defpackage.ati.c;
                } else {
                    athVar3 = athVar;
                }
                if (i18 != 0) {
                    cfyVar3 = defpackage.cfs.m;
                    i19 = i10;
                } else {
                    i19 = i10;
                    cfyVar3 = cfyVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                int i2111110 = 57344 & i5;
                int i2111111 = 458752 & i5;
                bveVar2 = bveVarC;
                ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2111110 | i2111111 | (29360128 & (i5 << 3)));
                cgfVar2 = cgfVar3;
                atbVar3 = atbVar4;
                athVar2 = athVar3;
                cfyVar2 = cfyVar3;
                i16 = i20;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar2 = cgfVar;
                athVar2 = athVar;
                cfyVar2 = cfyVar;
                atbVar3 = atbVar2;
                i16 = i14;
            }
            i17 = i11;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: aup
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cgf cgfVar4 = cgfVar2;
                        defpackage.atb atbVar5 = atbVar3;
                        defpackage.ath athVar4 = athVar2;
                        int i2111112 = i3 | 1;
                        int i2111113 = 306783378 & i2111112;
                        int i2111114 = 613566756 & i2111112;
                        defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2111112 & (-920350135)) | i2111113 | (i2111114 >> 1) | ((i2111113 + i2111113) & i2111114), i4);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i5 |= 384;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                if (true != bveVarC.C(cfyVar)) {
                    i9 = 1024;
                } else {
                    i9 = 2048;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (true != bveVarC.A(i11)) {
                        i12 = 8192;
                    } else {
                        i12 = 16384;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    if ((196608 & i3) == 0) {
                        i14 = i2;
                        if (true != bveVarC.A(i14)) {
                            i15 = 65536;
                        } else {
                            i15 = 131072;
                        }
                        i5 |= i15;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i21 = 524288;
                        } else {
                            i21 = 1048576;
                        }
                        i5 |= i21;
                    }
                    if ((599187 & i5) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i5 & 1)) {
                        if (i22 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar;
                        }
                        if (i23 != 0) {
                            atbVar4 = defpackage.ati.a;
                            i18 = i8;
                        } else {
                            i18 = i8;
                            atbVar4 = atbVar2;
                        }
                        if (i6 != 0) {
                            athVar3 = defpackage.ati.c;
                        } else {
                            athVar3 = athVar;
                        }
                        if (i18 != 0) {
                            cfyVar3 = defpackage.cfs.m;
                            i19 = i10;
                        } else {
                            i19 = i10;
                            cfyVar3 = cfyVar;
                        }
                        if (i19 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i13 != 0) {
                            i20 = Integer.MAX_VALUE;
                        } else {
                            i20 = i14;
                        }
                        int i2111112 = 57344 & i5;
                        int i2111113 = 458752 & i5;
                        bveVar2 = bveVarC;
                        ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2111112 | i2111113 | (29360128 & (i5 << 3)));
                        cgfVar2 = cgfVar3;
                        atbVar3 = atbVar4;
                        athVar2 = athVar3;
                        cfyVar2 = cfyVar3;
                        i16 = i20;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        cgfVar2 = cgfVar;
                        athVar2 = athVar;
                        cfyVar2 = cfyVar;
                        atbVar3 = atbVar2;
                        i16 = i14;
                    }
                    i17 = i11;
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: aup
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar3 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar4 = cgfVar2;
                                defpackage.atb atbVar5 = atbVar3;
                                defpackage.ath athVar4 = athVar2;
                                int i2111114 = i3 | 1;
                                int i2111115 = 306783378 & i2111114;
                                int i2111116 = 613566756 & i2111114;
                                defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2111114 & (-920350135)) | i2111115 | (i2111116 >> 1) | ((i2111115 + i2111115) & i2111116), i4);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i5 |= 196608;
                i14 = i2;
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i2111114 = 57344 & i5;
                    int i2111115 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2111114 | i2111115 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i2111116 = i3 | 1;
                            int i2111117 = 306783378 & i2111116;
                            int i2111118 = 613566756 & i2111116;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2111116 & (-920350135)) | i2111117 | (i2111118 >> 1) | ((i2111117 + i2111117) & i2111118), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (true != bveVarC.A(i14)) {
                        i15 = 65536;
                    } else {
                        i15 = 131072;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i2111116 = 57344 & i5;
                    int i2111117 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2111116 | i2111117 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i2111118 = i3 | 1;
                            int i2111119 = 306783378 & i2111118;
                            int i21111110 = 613566756 & i2111118;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i2111118 & (-920350135)) | i2111119 | (i21111110 >> 1) | ((i2111119 + i2111119) & i21111110), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i21 = 524288;
                } else {
                    i21 = 1048576;
                }
                i5 |= i21;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i5 & 1)) {
                if (i22 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                if (i23 != 0) {
                    atbVar4 = defpackage.ati.a;
                    i18 = i8;
                } else {
                    i18 = i8;
                    atbVar4 = atbVar2;
                }
                if (i6 != 0) {
                    athVar3 = defpackage.ati.c;
                } else {
                    athVar3 = athVar;
                }
                if (i18 != 0) {
                    cfyVar3 = defpackage.cfs.m;
                    i19 = i10;
                } else {
                    i19 = i10;
                    cfyVar3 = cfyVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                int i2111118 = 57344 & i5;
                int i2111119 = 458752 & i5;
                bveVar2 = bveVarC;
                ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i2111118 | i2111119 | (29360128 & (i5 << 3)));
                cgfVar2 = cgfVar3;
                atbVar3 = atbVar4;
                athVar2 = athVar3;
                cfyVar2 = cfyVar3;
                i16 = i20;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar2 = cgfVar;
                athVar2 = athVar;
                cfyVar2 = cfyVar;
                atbVar3 = atbVar2;
                i16 = i14;
            }
            i17 = i11;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: aup
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cgf cgfVar4 = cgfVar2;
                        defpackage.atb atbVar5 = atbVar3;
                        defpackage.ath athVar4 = athVar2;
                        int i21111110 = i3 | 1;
                        int i21111111 = 306783378 & i21111110;
                        int i21111112 = 613566756 & i21111110;
                        defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21111110 & (-920350135)) | i21111111 | (i21111112 >> 1) | ((i21111111 + i21111111) & i21111112), i4);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i5 |= 3072;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                i11 = i;
                if (true != bveVarC.A(i11)) {
                    i12 = 8192;
                } else {
                    i12 = 16384;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                if ((196608 & i3) == 0) {
                    i14 = i2;
                    if (true != bveVarC.A(i14)) {
                        i15 = 65536;
                    } else {
                        i15 = 131072;
                    }
                    i5 |= i15;
                }
                if ((i3 & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i5 |= i21;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i5 & 1)) {
                    if (i22 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    if (i23 != 0) {
                        atbVar4 = defpackage.ati.a;
                        i18 = i8;
                    } else {
                        i18 = i8;
                        atbVar4 = atbVar2;
                    }
                    if (i6 != 0) {
                        athVar3 = defpackage.ati.c;
                    } else {
                        athVar3 = athVar;
                    }
                    if (i18 != 0) {
                        cfyVar3 = defpackage.cfs.m;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        cfyVar3 = cfyVar;
                    }
                    if (i19 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i13 != 0) {
                        i20 = Integer.MAX_VALUE;
                    } else {
                        i20 = i14;
                    }
                    int i21111110 = 57344 & i5;
                    int i21111111 = 458752 & i5;
                    bveVar2 = bveVarC;
                    ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21111110 | i21111111 | (29360128 & (i5 << 3)));
                    cgfVar2 = cgfVar3;
                    atbVar3 = atbVar4;
                    athVar2 = athVar3;
                    cfyVar2 = cfyVar3;
                    i16 = i20;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar2 = cgfVar;
                    athVar2 = athVar;
                    cfyVar2 = cfyVar;
                    atbVar3 = atbVar2;
                    i16 = i14;
                }
                i17 = i11;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: aup
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar3 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cgf cgfVar4 = cgfVar2;
                            defpackage.atb atbVar5 = atbVar3;
                            defpackage.ath athVar4 = athVar2;
                            int i21111112 = i3 | 1;
                            int i21111113 = 306783378 & i21111112;
                            int i21111114 = 613566756 & i21111112;
                            defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21111112 & (-920350135)) | i21111113 | (i21111114 >> 1) | ((i21111113 + i21111113) & i21111114), i4);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i14 = i2;
            if ((i3 & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i21 = 524288;
                } else {
                    i21 = 1048576;
                }
                i5 |= i21;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i5 & 1)) {
                if (i22 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                if (i23 != 0) {
                    atbVar4 = defpackage.ati.a;
                    i18 = i8;
                } else {
                    i18 = i8;
                    atbVar4 = atbVar2;
                }
                if (i6 != 0) {
                    athVar3 = defpackage.ati.c;
                } else {
                    athVar3 = athVar;
                }
                if (i18 != 0) {
                    cfyVar3 = defpackage.cfs.m;
                    i19 = i10;
                } else {
                    i19 = i10;
                    cfyVar3 = cfyVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                int i21111112 = 57344 & i5;
                int i21111113 = 458752 & i5;
                bveVar2 = bveVarC;
                ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21111112 | i21111113 | (29360128 & (i5 << 3)));
                cgfVar2 = cgfVar3;
                atbVar3 = atbVar4;
                athVar2 = athVar3;
                cfyVar2 = cfyVar3;
                i16 = i20;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar2 = cgfVar;
                athVar2 = athVar;
                cfyVar2 = cfyVar;
                atbVar3 = atbVar2;
                i16 = i14;
            }
            i17 = i11;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: aup
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cgf cgfVar4 = cgfVar2;
                        defpackage.atb atbVar5 = atbVar3;
                        defpackage.ath athVar4 = athVar2;
                        int i21111114 = i3 | 1;
                        int i21111115 = 306783378 & i21111114;
                        int i21111116 = 613566756 & i21111114;
                        defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21111114 & (-920350135)) | i21111115 | (i21111116 >> 1) | ((i21111115 + i21111115) & i21111116), i4);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i5 |= 24576;
        i11 = i;
        i13 = i4 & 32;
        if (i13 != 0) {
            if ((196608 & i3) == 0) {
                i14 = i2;
                if (true != bveVarC.A(i14)) {
                    i15 = 65536;
                } else {
                    i15 = 131072;
                }
                i5 |= i15;
            }
            if ((i3 & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i21 = 524288;
                } else {
                    i21 = 1048576;
                }
                i5 |= i21;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i5 & 1)) {
                if (i22 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                if (i23 != 0) {
                    atbVar4 = defpackage.ati.a;
                    i18 = i8;
                } else {
                    i18 = i8;
                    atbVar4 = atbVar2;
                }
                if (i6 != 0) {
                    athVar3 = defpackage.ati.c;
                } else {
                    athVar3 = athVar;
                }
                if (i18 != 0) {
                    cfyVar3 = defpackage.cfs.m;
                    i19 = i10;
                } else {
                    i19 = i10;
                    cfyVar3 = cfyVar;
                }
                if (i19 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                if (i13 != 0) {
                    i20 = Integer.MAX_VALUE;
                } else {
                    i20 = i14;
                }
                int i21111114 = 57344 & i5;
                int i21111115 = 458752 & i5;
                bveVar2 = bveVarC;
                ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21111114 | i21111115 | (29360128 & (i5 << 3)));
                cgfVar2 = cgfVar3;
                atbVar3 = atbVar4;
                athVar2 = athVar3;
                cfyVar2 = cfyVar3;
                i16 = i20;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar2 = cgfVar;
                athVar2 = athVar;
                cfyVar2 = cfyVar;
                atbVar3 = atbVar2;
                i16 = i14;
            }
            i17 = i11;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: aup
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cgf cgfVar4 = cgfVar2;
                        defpackage.atb atbVar5 = atbVar3;
                        defpackage.ath athVar4 = athVar2;
                        int i21111116 = i3 | 1;
                        int i21111117 = 306783378 & i21111116;
                        int i21111118 = 613566756 & i21111116;
                        defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21111116 & (-920350135)) | i21111117 | (i21111118 >> 1) | ((i21111117 + i21111117) & i21111118), i4);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i5 |= 196608;
        i14 = i2;
        if ((i3 & 1572864) == 0) {
            if (true != bveVarC.E(affhVar)) {
                i21 = 524288;
            } else {
                i21 = 1048576;
            }
            i5 |= i21;
        }
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i5 & 1)) {
            if (i22 != 0) {
                cgfVar3 = defpackage.cgf.e;
            } else {
                cgfVar3 = cgfVar;
            }
            if (i23 != 0) {
                atbVar4 = defpackage.ati.a;
                i18 = i8;
            } else {
                i18 = i8;
                atbVar4 = atbVar2;
            }
            if (i6 != 0) {
                athVar3 = defpackage.ati.c;
            } else {
                athVar3 = athVar;
            }
            if (i18 != 0) {
                cfyVar3 = defpackage.cfs.m;
                i19 = i10;
            } else {
                i19 = i10;
                cfyVar3 = cfyVar;
            }
            if (i19 != 0) {
                i11 = Integer.MAX_VALUE;
            }
            if (i13 != 0) {
                i20 = Integer.MAX_VALUE;
            } else {
                i20 = i14;
            }
            int i21111116 = 57344 & i5;
            int i21111117 = 458752 & i5;
            bveVar2 = bveVarC;
            ap(cgfVar3, atbVar4, athVar3, cfyVar3, i11, i20, defpackage.auv.c, affhVar, bveVar2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | i21111116 | i21111117 | (29360128 & (i5 << 3)));
            cgfVar2 = cgfVar3;
            atbVar3 = atbVar4;
            athVar2 = athVar3;
            cfyVar2 = cfyVar3;
            i16 = i20;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
            athVar2 = athVar;
            cfyVar2 = cfyVar;
            atbVar3 = atbVar2;
            i16 = i14;
        }
        i17 = i11;
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: aup
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cgf cgfVar4 = cgfVar2;
                    defpackage.atb atbVar5 = atbVar3;
                    defpackage.ath athVar4 = athVar2;
                    int i21111118 = i3 | 1;
                    int i21111119 = 306783378 & i21111118;
                    int i211111110 = 613566756 & i21111118;
                    defpackage.ca.ao(cgfVar4, atbVar5, athVar4, cfyVar2, i17, i16, affhVar, bveVar3, (i21111118 & (-920350135)) | i21111119 | (i211111110 >> 1) | ((i21111119 + i21111119) & i211111110), i4);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static void ap(final defpackage.cgf cgfVar, final defpackage.atb atbVar, final defpackage.ath athVar, final defpackage.cfy cfyVar, final int i, final int i2, final defpackage.auv auvVar, final defpackage.affh affhVar, defpackage.bve bveVar, final int i3) {
        int i4;
        int i5;
        char c;
        defpackage.bwc bwcVar;
        boolean z;
        java.lang.Object obj;
        int i6 = i3 & 6;
        defpackage.bve bveVarC = bveVar.c(-1956591841);
        if (i6 == 0) {
            i4 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != bveVarC.C(atbVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != bveVarC.C(athVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != bveVarC.C(cfyVar) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != bveVarC.A(i) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != bveVarC.A(i2) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != bveVarC.C(auvVar) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i4 |= true != bveVarC.E(affhVar) ? 4194304 : 8388608;
        }
        int i7 = i4;
        if (bveVarC.I((i7 & 4793491) != 4793490, i7 & 1)) {
            int i8 = i7 & 3670016;
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            if (i8 == 1048576 || objS == defpackage.bvd.a) {
                objS = new defpackage.aus();
                bwcVar2.ad(objS);
            }
            int i9 = i7 >> 3;
            defpackage.aus ausVar = (defpackage.aus) objS;
            boolean zC = ((((i9 & 896) ^ 384) > 256 && bveVarC.C(cfyVar)) || (i9 & 384) == 256) | ((((i9 & 14) ^ 6) > 4 && bveVarC.C(atbVar)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && bveVarC.C(athVar)) || (i9 & 48) == 32) | ((((i9 & 7168) ^ 3072) > 2048 && bveVarC.A(i)) || (i9 & 3072) == 2048) | ((((57344 & i9) ^ 24576) > 16384 && bveVarC.A(i2)) || (i9 & 24576) == 16384) | bveVarC.C(ausVar);
            java.lang.Object objS2 = bwcVar2.S();
            if (zC || objS2 == defpackage.bvd.a) {
                defpackage.bwc bwcVar3 = bwcVar2;
                i5 = 8388608;
                c = ' ';
                defpackage.auu auuVar = new defpackage.auu(atbVar, athVar, atbVar.a(), new defpackage.aud(cfyVar), athVar.a(), i, i2, ausVar);
                bwcVar3.ad(auuVar);
                objS2 = auuVar;
                bwcVar = bwcVar3;
            } else {
                bwcVar = bwcVar2;
                i5 = 8388608;
                c = ' ';
            }
            boolean z2 = i8 == 1048576;
            boolean z3 = (i7 & 29360128) == i5;
            boolean z4 = (i7 & 458752) == 131072;
            defpackage.auu auuVar2 = (defpackage.auu) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (((z3 | z2) || z4) || objS3 == defpackage.bvd.a) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                z = true;
                arrayList.add(new defpackage.ccz(-1192950673, true, new defpackage.amc(affhVar, 2)));
                int[] iArr = defpackage.aur.a;
                bwcVar.ad(arrayList);
                obj = arrayList;
            } else {
                z = true;
                obj = objS3;
            }
            defpackage.ccz cczVar = new defpackage.ccz(1271844412, z, new defpackage.bmc((java.util.List) obj, 9));
            boolean zC2 = bveVarC.C(auuVar2);
            java.lang.Object objS4 = bwcVar.S();
            if (zC2 || objS4 == defpackage.bvd.a) {
                objS4 = new defpackage.cug(auuVar2);
                bwcVar.ad(objS4);
            }
            defpackage.cty ctyVar = (defpackage.cty) objS4;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> c);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            cczVar.invoke(bveVarC, 0);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: auo
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.atb atbVar2 = atbVar;
                    defpackage.ath athVar2 = athVar;
                    defpackage.cfy cfyVar2 = cfyVar;
                    int i10 = i3 | 1;
                    int i11 = 306783378 & i10;
                    int i12 = 613566756 & i10;
                    defpackage.ca.ap(cgfVar2, atbVar2, athVar2, cfyVar2, i, i2, auvVar, affhVar, bveVar2, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static long aq(defpackage.ctx ctxVar, long j, defpackage.affc affcVar) {
        defpackage.awa awaVarC = defpackage.asq.C(ctxVar);
        if ((awaVarC != null ? awaVarC.a : 0.0f) != 0.0f) {
            int iF = ctxVar.f(Integer.MAX_VALUE);
            return defpackage.zl.c(iF, ctxVar.e(iF));
        }
        defpackage.asq.C(ctxVar);
        defpackage.cux cuxVarV = ctxVar.v(j);
        affcVar.invoke(cuxVarV);
        return defpackage.zl.c(cuxVarV.x(), cuxVarV.dK());
    }

    public static defpackage.aul ar(boolean z, int i, long j, defpackage.zl zlVar, int i2, int i3, int i4, boolean z2, boolean z3, int i5, defpackage.aus ausVar, long j2, int i6, int i7, int i8) {
        boolean z4 = true;
        if (zlVar != null) {
            int i9 = ausVar.c;
            if (i2 < i6) {
                int iB = defpackage.zl.b(j);
                long j3 = zlVar.a;
                if (iB - defpackage.zl.b(j3) >= 0) {
                    if (i == 0 || (i < i5 && defpackage.zl.a(j) - defpackage.zl.a(j3) >= 0)) {
                        defpackage.zl.b(j3);
                        z4 = false;
                    } else if (!z2) {
                        int iB2 = defpackage.dlm.b(j2);
                        int iB3 = (defpackage.zl.b(j) - i8) - i4;
                        defpackage.zl zlVar2 = new defpackage.zl(defpackage.zl.c(defpackage.zl.a(j3) - i7, defpackage.zl.b(j3)));
                        return new defpackage.aul(true, ar(z, 0, defpackage.zl.c(iB2, iB3), zlVar2, i2 + 1, i3 + i4, 0, true, false, i5, ausVar, j2, i6, i7, i8).b);
                    }
                }
            }
        }
        return new defpackage.aul(z4, z4);
    }

    public static defpackage.auk as(defpackage.aul aulVar, defpackage.aus ausVar) {
        if (!aulVar.b) {
            return null;
        }
        int i = ausVar.c;
        return null;
    }

    public static void at(defpackage.cgf cgfVar, defpackage.cfu cfuVar, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        int i4 = i2 & 1;
        defpackage.bve bveVarC = bveVar.c(380139498);
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(cfuVar) ? 16 : 32;
        }
        int i7 = i3 | 384;
        if ((i & 3072) == 0) {
            i7 |= true != bveVarC.E(affhVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i7 & 1171) != 1170, i7 & 1)) {
            if (i4 != 0) {
                cgfVar = defpackage.cgf.e;
            }
            if (i6 != 0) {
                cfuVar = defpackage.cfs.a;
            }
            defpackage.cty ctyVarB = defpackage.atp.b(cfuVar, false);
            boolean zC = ((i7 & 7168) == 2048) | bveVarC.C(ctyVarB);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new defpackage.aps(ctyVarB, affhVar, i5, null);
                bwcVar.ad(objS);
            }
            defpackage.cvh.a(cgfVar, (defpackage.affg) objS, bveVarC, i7 & 14, 0);
        } else {
            bveVarC.s();
        }
        defpackage.cfu cfuVar2 = cfuVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.azl(cgfVar, cfuVar2, affhVar, i, i2, 1);
        }
    }

    public static boolean au(long j, int i, int i2) {
        if (i > defpackage.dlm.b(j) || defpackage.dlm.d(j) > i) {
            return false;
        }
        return i2 <= defpackage.dlm.a(j) && defpackage.dlm.c(j) <= i2;
    }

    public static defpackage.cgf av(defpackage.cgf cgfVar, boolean z) {
        return cgfVar.a(new defpackage.atj(z));
    }

    public static int aw(defpackage.dlo dloVar, float f) {
        if (java.lang.Math.abs(f) < dloVar.dI(400.0f)) {
            return 0;
        }
        return f > 0.0f ? 1 : 2;
    }

    public static int ax(defpackage.axo axoVar) {
        return (int) (axoVar.n == defpackage.apn.a ? axoVar.d() & 4294967295L : axoVar.d() >> 32);
    }

    public static float ay(defpackage.cqu cquVar, boolean z) {
        long jAz = az(cquVar, z, new defpackage.ajg(17));
        float fA = 0.0f;
        if (jAz == 9205357640488583168L) {
            return 0.0f;
        }
        java.util.List list = cquVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.crd crdVar = (defpackage.crd) list.get(i2);
            if (crdVar.d && crdVar.h) {
                fA += defpackage.cji.a(defpackage.acmj.r(z ? crdVar.c : crdVar.g, jAz));
                i++;
            }
        }
        return fA / i;
    }

    public static long az(defpackage.cqu cquVar, boolean z, defpackage.affc affcVar) {
        java.util.List list = cquVar.a;
        int size = list.size();
        long jAh = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.crd crdVar = (defpackage.crd) list.get(i2);
            if (((java.lang.Boolean) affcVar.invoke(crdVar)).booleanValue()) {
                jAh = defpackage.a.ah(jAh, z ? crdVar.c : crdVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return defpackage.cji.b(jAh, i);
    }

    public static /* synthetic */ java.lang.String b(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static defpackage.akz ba(defpackage.bve bveVar) {
        bveVar.v(1257603829);
        defpackage.akz akzVar = defpackage.akz.a;
        bveVar.o();
        return akzVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x016e  */
    /* JADX WARN: Code duplicated, block: B:108:0x018d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0191  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    public static void bb(final defpackage.cne cneVar, final java.lang.String str, defpackage.cgf cgfVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        final defpackage.cgf cgfVar2;
        int i4;
        defpackage.cfu cfuVar2;
        int i5;
        int i6;
        defpackage.csr csrVar2;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        defpackage.cke ckeVar2;
        int i11;
        int i12;
        int i13;
        boolean z;
        final defpackage.cfu cfuVar3;
        final defpackage.cke ckeVar3;
        final defpackage.csr csrVar3;
        final float f3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar3;
        defpackage.cfu cfuVar4;
        defpackage.csr csrVar4;
        float f4;
        defpackage.cke ckeVar4;
        defpackage.cgf ddoVar;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        defpackage.afer aferVar;
        int i14;
        defpackage.bwc bwcVar2;
        java.lang.Object objS2;
        int i15 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1142754848);
        if (i15 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(str) ? 16 : 32;
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    cfuVar2 = cfuVar;
                    if (true != bveVarC.C(cfuVar2)) {
                        i5 = 1024;
                    } else {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        csrVar2 = csrVar;
                        if (true != bveVarC.C(csrVar2)) {
                            i7 = 8192;
                        } else {
                            i7 = 16384;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            f2 = f;
                            if (true != bveVarC.z(f2)) {
                                i9 = 65536;
                            } else {
                                i9 = 131072;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i3 |= 1572864;
                            ckeVar2 = ckeVar;
                        } else {
                            ckeVar2 = ckeVar;
                            i11 = i3;
                            if ((i & 1572864) == 0) {
                                if (true != bveVarC.C(ckeVar2)) {
                                    i12 = 524288;
                                } else {
                                    i12 = 1048576;
                                }
                                i3 = i11 | i12;
                            }
                        }
                        i13 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bveVarC.I(z, i13 & 1)) {
                            if (i16 != 0) {
                                cgfVar3 = defpackage.cgf.e;
                            } else {
                                cgfVar3 = cgfVar2;
                            }
                            if (i4 != 0) {
                                cfuVar4 = defpackage.cfs.e;
                            } else {
                                cfuVar4 = cfuVar2;
                            }
                            if (i6 != 0) {
                                csrVar4 = defpackage.csq.b;
                            } else {
                                csrVar4 = csrVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                ckeVar4 = null;
                            } else {
                                ckeVar4 = ckeVar2;
                            }
                            if (str != null) {
                                bveVarC.v(1899222916);
                                i14 = i13 & 112;
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (i14 != 32 || objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.act(str, 10);
                                    bwcVar2.ad(objS2);
                                }
                                java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
                                ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                                bwcVar2.Y(false);
                            } else {
                                bveVarC.v(1899381698);
                                ((defpackage.bwc) bveVarC).Y(false);
                                ddoVar = defpackage.cgf.e;
                            }
                            defpackage.cgf cgfVarV = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = defpackage.ato.b;
                                bwcVar.ad(objS);
                            }
                            defpackage.cty ctyVar = (defpackage.cty) objS;
                            long j = bwcVar.u;
                            long j2 = j ^ (j >>> 32);
                            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarV);
                            defpackage.cdd cddVarAh = bwcVar.ah();
                            aferVar = defpackage.cwl.a;
                            bveVarC.w();
                            if (bwcVar.t) {
                                bveVarC.j(aferVar);
                            } else {
                                bveVarC.y();
                            }
                            defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
                            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
                            bwcVar.Y(true);
                            f3 = f4;
                            ckeVar3 = ckeVar4;
                            cfuVar3 = cfuVar4;
                            csrVar3 = csrVar4;
                            cgfVar2 = cgfVar3;
                        } else {
                            bveVarC.s();
                            cfuVar3 = cfuVar2;
                            ckeVar3 = ckeVar2;
                            csrVar3 = csrVar2;
                            f3 = f2;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: akk
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    defpackage.cne cneVar2 = cneVar;
                                    java.lang.String str2 = str;
                                    defpackage.cgf cgfVar4 = cgfVar2;
                                    int i17 = i | 1;
                                    int i18 = 306783378 & i17;
                                    int i19 = 613566756 & i17;
                                    defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    f2 = f;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        ckeVar2 = ckeVar;
                    } else {
                        ckeVar2 = ckeVar;
                        i11 = i3;
                        if ((i & 1572864) == 0) {
                            if (true != bveVarC.C(ckeVar2)) {
                                i12 = 524288;
                            } else {
                                i12 = 1048576;
                            }
                            i3 = i11 | i12;
                        }
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i13 & 1)) {
                        if (i16 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar2;
                        }
                        if (i4 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i6 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            ckeVar4 = null;
                        } else {
                            ckeVar4 = ckeVar2;
                        }
                        if (str != null) {
                            bveVarC.v(1899222916);
                            i14 = i13 & 112;
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (i14 != 32) {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = defpackage.dea.a;
                            ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                            bwcVar2.Y(false);
                        } else {
                            bveVarC.v(1899381698);
                            ((defpackage.bwc) bveVarC).Y(false);
                            ddoVar = defpackage.cgf.e;
                        }
                        defpackage.cgf cgfVarV2 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = defpackage.ato.b;
                            bwcVar.ad(objS);
                        }
                        defpackage.cty ctyVar2 = (defpackage.cty) objS;
                        long j3 = bwcVar.u;
                        long j4 = j3 ^ (j3 >>> 32);
                        defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarV2);
                        defpackage.cdd cddVarAh2 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVar2, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j4), defpackage.cwl.f);
                        bwcVar.Y(true);
                        f3 = f4;
                        ckeVar3 = ckeVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        cgfVar2 = cgfVar3;
                    } else {
                        bveVarC.s();
                        cfuVar3 = cfuVar2;
                        ckeVar3 = ckeVar2;
                        csrVar3 = csrVar2;
                        f3 = f2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: akk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cne cneVar2 = cneVar;
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar4 = cgfVar2;
                                int i17 = i | 1;
                                int i18 = 306783378 & i17;
                                int i19 = 613566756 & i17;
                                defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                csrVar2 = csrVar;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (true != bveVarC.z(f2)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        ckeVar2 = ckeVar;
                    } else {
                        ckeVar2 = ckeVar;
                        i11 = i3;
                        if ((i & 1572864) == 0) {
                            if (true != bveVarC.C(ckeVar2)) {
                                i12 = 524288;
                            } else {
                                i12 = 1048576;
                            }
                            i3 = i11 | i12;
                        }
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i13 & 1)) {
                        if (i16 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar2;
                        }
                        if (i4 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i6 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            ckeVar4 = null;
                        } else {
                            ckeVar4 = ckeVar2;
                        }
                        if (str != null) {
                            bveVarC.v(1899222916);
                            i14 = i13 & 112;
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (i14 != 32) {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger3 = defpackage.dea.a;
                            ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                            bwcVar2.Y(false);
                        } else {
                            bveVarC.v(1899381698);
                            ((defpackage.bwc) bveVarC).Y(false);
                            ddoVar = defpackage.cgf.e;
                        }
                        defpackage.cgf cgfVarV3 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = defpackage.ato.b;
                            bwcVar.ad(objS);
                        }
                        defpackage.cty ctyVar3 = (defpackage.cty) objS;
                        long j5 = bwcVar.u;
                        long j6 = j5 ^ (j5 >>> 32);
                        defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarV3);
                        defpackage.cdd cddVarAh3 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVar3, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j6), defpackage.cwl.f);
                        bwcVar.Y(true);
                        f3 = f4;
                        ckeVar3 = ckeVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        cgfVar2 = cgfVar3;
                    } else {
                        bveVarC.s();
                        cfuVar3 = cfuVar2;
                        ckeVar3 = ckeVar2;
                        csrVar3 = csrVar2;
                        f3 = f2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: akk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cne cneVar2 = cneVar;
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar4 = cgfVar2;
                                int i17 = i | 1;
                                int i18 = 306783378 & i17;
                                int i19 = 613566756 & i17;
                                defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    ckeVar2 = ckeVar;
                } else {
                    ckeVar2 = ckeVar;
                    i11 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.C(ckeVar2)) {
                            i12 = 524288;
                        } else {
                            i12 = 1048576;
                        }
                        i3 = i11 | i12;
                    }
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i13 & 1)) {
                    if (i16 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i6 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        ckeVar4 = null;
                    } else {
                        ckeVar4 = ckeVar2;
                    }
                    if (str != null) {
                        bveVarC.v(1899222916);
                        i14 = i13 & 112;
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (i14 != 32) {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = defpackage.dea.a;
                        ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                        bwcVar2.Y(false);
                    } else {
                        bveVarC.v(1899381698);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ddoVar = defpackage.cgf.e;
                    }
                    defpackage.cgf cgfVarV4 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = defpackage.ato.b;
                        bwcVar.ad(objS);
                    }
                    defpackage.cty ctyVar4 = (defpackage.cty) objS;
                    long j7 = bwcVar.u;
                    long j8 = j7 ^ (j7 >>> 32);
                    defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarV4);
                    defpackage.cdd cddVarAh4 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVar4, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh4, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN4, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j8), defpackage.cwl.f);
                    bwcVar.Y(true);
                    f3 = f4;
                    ckeVar3 = ckeVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    cgfVar2 = cgfVar3;
                } else {
                    bveVarC.s();
                    cfuVar3 = cfuVar2;
                    ckeVar3 = ckeVar2;
                    csrVar3 = csrVar2;
                    f3 = f2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: akk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cne cneVar2 = cneVar;
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar4 = cgfVar2;
                            int i17 = i | 1;
                            int i18 = 306783378 & i17;
                            int i19 = 613566756 & i17;
                            defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            cfuVar2 = cfuVar;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    csrVar2 = csrVar;
                    if (true != bveVarC.C(csrVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (true != bveVarC.z(f2)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        ckeVar2 = ckeVar;
                    } else {
                        ckeVar2 = ckeVar;
                        i11 = i3;
                        if ((i & 1572864) == 0) {
                            if (true != bveVarC.C(ckeVar2)) {
                                i12 = 524288;
                            } else {
                                i12 = 1048576;
                            }
                            i3 = i11 | i12;
                        }
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i13 & 1)) {
                        if (i16 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar2;
                        }
                        if (i4 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i6 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            ckeVar4 = null;
                        } else {
                            ckeVar4 = ckeVar2;
                        }
                        if (str != null) {
                            bveVarC.v(1899222916);
                            i14 = i13 & 112;
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (i14 != 32) {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger5 = defpackage.dea.a;
                            ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                            bwcVar2.Y(false);
                        } else {
                            bveVarC.v(1899381698);
                            ((defpackage.bwc) bveVarC).Y(false);
                            ddoVar = defpackage.cgf.e;
                        }
                        defpackage.cgf cgfVarV5 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = defpackage.ato.b;
                            bwcVar.ad(objS);
                        }
                        defpackage.cty ctyVar5 = (defpackage.cty) objS;
                        long j9 = bwcVar.u;
                        long j10 = j9 ^ (j9 >>> 32);
                        defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarV5);
                        defpackage.cdd cddVarAh5 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVar5, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh5, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN5, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j10), defpackage.cwl.f);
                        bwcVar.Y(true);
                        f3 = f4;
                        ckeVar3 = ckeVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        cgfVar2 = cgfVar3;
                    } else {
                        bveVarC.s();
                        cfuVar3 = cfuVar2;
                        ckeVar3 = ckeVar2;
                        csrVar3 = csrVar2;
                        f3 = f2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: akk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cne cneVar2 = cneVar;
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar4 = cgfVar2;
                                int i17 = i | 1;
                                int i18 = 306783378 & i17;
                                int i19 = 613566756 & i17;
                                defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    ckeVar2 = ckeVar;
                } else {
                    ckeVar2 = ckeVar;
                    i11 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.C(ckeVar2)) {
                            i12 = 524288;
                        } else {
                            i12 = 1048576;
                        }
                        i3 = i11 | i12;
                    }
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i13 & 1)) {
                    if (i16 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i6 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        ckeVar4 = null;
                    } else {
                        ckeVar4 = ckeVar2;
                    }
                    if (str != null) {
                        bveVarC.v(1899222916);
                        i14 = i13 & 112;
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (i14 != 32) {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = defpackage.dea.a;
                        ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                        bwcVar2.Y(false);
                    } else {
                        bveVarC.v(1899381698);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ddoVar = defpackage.cgf.e;
                    }
                    defpackage.cgf cgfVarV6 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = defpackage.ato.b;
                        bwcVar.ad(objS);
                    }
                    defpackage.cty ctyVar6 = (defpackage.cty) objS;
                    long j11 = bwcVar.u;
                    long j12 = j11 ^ (j11 >>> 32);
                    defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVarC, cgfVarV6);
                    defpackage.cdd cddVarAh6 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVar6, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh6, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN6, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j12), defpackage.cwl.f);
                    bwcVar.Y(true);
                    f3 = f4;
                    ckeVar3 = ckeVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    cgfVar2 = cgfVar3;
                } else {
                    bveVarC.s();
                    cfuVar3 = cfuVar2;
                    ckeVar3 = ckeVar2;
                    csrVar3 = csrVar2;
                    f3 = f2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: akk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cne cneVar2 = cneVar;
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar4 = cgfVar2;
                            int i17 = i | 1;
                            int i18 = 306783378 & i17;
                            int i19 = 613566756 & i17;
                            defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            csrVar2 = csrVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (true != bveVarC.z(f2)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    ckeVar2 = ckeVar;
                } else {
                    ckeVar2 = ckeVar;
                    i11 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.C(ckeVar2)) {
                            i12 = 524288;
                        } else {
                            i12 = 1048576;
                        }
                        i3 = i11 | i12;
                    }
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i13 & 1)) {
                    if (i16 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i6 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        ckeVar4 = null;
                    } else {
                        ckeVar4 = ckeVar2;
                    }
                    if (str != null) {
                        bveVarC.v(1899222916);
                        i14 = i13 & 112;
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (i14 != 32) {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = defpackage.dea.a;
                        ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                        bwcVar2.Y(false);
                    } else {
                        bveVarC.v(1899381698);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ddoVar = defpackage.cgf.e;
                    }
                    defpackage.cgf cgfVarV7 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = defpackage.ato.b;
                        bwcVar.ad(objS);
                    }
                    defpackage.cty ctyVar7 = (defpackage.cty) objS;
                    long j13 = bwcVar.u;
                    long j14 = j13 ^ (j13 >>> 32);
                    defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVarC, cgfVarV7);
                    defpackage.cdd cddVarAh7 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVar7, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh7, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN7, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j14), defpackage.cwl.f);
                    bwcVar.Y(true);
                    f3 = f4;
                    ckeVar3 = ckeVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    cgfVar2 = cgfVar3;
                } else {
                    bveVarC.s();
                    cfuVar3 = cfuVar2;
                    ckeVar3 = ckeVar2;
                    csrVar3 = csrVar2;
                    f3 = f2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: akk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cne cneVar2 = cneVar;
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar4 = cgfVar2;
                            int i17 = i | 1;
                            int i18 = 306783378 & i17;
                            int i19 = 613566756 & i17;
                            defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                ckeVar2 = ckeVar;
            } else {
                ckeVar2 = ckeVar;
                i11 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.C(ckeVar2)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i3 = i11 | i12;
                }
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i13 & 1)) {
                if (i16 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i4 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i6 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    ckeVar4 = null;
                } else {
                    ckeVar4 = ckeVar2;
                }
                if (str != null) {
                    bveVarC.v(1899222916);
                    i14 = i13 & 112;
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (i14 != 32) {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger8 = defpackage.dea.a;
                    ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                    bwcVar2.Y(false);
                } else {
                    bveVarC.v(1899381698);
                    ((defpackage.bwc) bveVarC).Y(false);
                    ddoVar = defpackage.cgf.e;
                }
                defpackage.cgf cgfVarV8 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = defpackage.ato.b;
                    bwcVar.ad(objS);
                }
                defpackage.cty ctyVar8 = (defpackage.cty) objS;
                long j15 = bwcVar.u;
                long j16 = j15 ^ (j15 >>> 32);
                defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVarC, cgfVarV8);
                defpackage.cdd cddVarAh8 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVar8, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh8, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN8, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j16), defpackage.cwl.f);
                bwcVar.Y(true);
                f3 = f4;
                ckeVar3 = ckeVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                cgfVar2 = cgfVar3;
            } else {
                bveVarC.s();
                cfuVar3 = cfuVar2;
                ckeVar3 = ckeVar2;
                csrVar3 = csrVar2;
                f3 = f2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: akk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cne cneVar2 = cneVar;
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar4 = cgfVar2;
                        int i17 = i | 1;
                        int i18 = 306783378 & i17;
                        int i19 = 613566756 & i17;
                        defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 384;
        cgfVar2 = cgfVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                cfuVar2 = cfuVar;
                if (true != bveVarC.C(cfuVar2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    csrVar2 = csrVar;
                    if (true != bveVarC.C(csrVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (true != bveVarC.z(f2)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        ckeVar2 = ckeVar;
                    } else {
                        ckeVar2 = ckeVar;
                        i11 = i3;
                        if ((i & 1572864) == 0) {
                            if (true != bveVarC.C(ckeVar2)) {
                                i12 = 524288;
                            } else {
                                i12 = 1048576;
                            }
                            i3 = i11 | i12;
                        }
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bveVarC.I(z, i13 & 1)) {
                        if (i16 != 0) {
                            cgfVar3 = defpackage.cgf.e;
                        } else {
                            cgfVar3 = cgfVar2;
                        }
                        if (i4 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i6 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            ckeVar4 = null;
                        } else {
                            ckeVar4 = ckeVar2;
                        }
                        if (str != null) {
                            bveVarC.v(1899222916);
                            i14 = i13 & 112;
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (i14 != 32) {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.act(str, 10);
                                bwcVar2.ad(objS2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger9 = defpackage.dea.a;
                            ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                            bwcVar2.Y(false);
                        } else {
                            bveVarC.v(1899381698);
                            ((defpackage.bwc) bveVarC).Y(false);
                            ddoVar = defpackage.cgf.e;
                        }
                        defpackage.cgf cgfVarV9 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = defpackage.ato.b;
                            bwcVar.ad(objS);
                        }
                        defpackage.cty ctyVar9 = (defpackage.cty) objS;
                        long j17 = bwcVar.u;
                        long j18 = j17 ^ (j17 >>> 32);
                        defpackage.cgf cgfVarN9 = defpackage.bzo.n(bveVarC, cgfVarV9);
                        defpackage.cdd cddVarAh9 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVar9, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh9, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN9, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j18), defpackage.cwl.f);
                        bwcVar.Y(true);
                        f3 = f4;
                        ckeVar3 = ckeVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        cgfVar2 = cgfVar3;
                    } else {
                        bveVarC.s();
                        cfuVar3 = cfuVar2;
                        ckeVar3 = ckeVar2;
                        csrVar3 = csrVar2;
                        f3 = f2;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: akk
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cne cneVar2 = cneVar;
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar4 = cgfVar2;
                                int i17 = i | 1;
                                int i18 = 306783378 & i17;
                                int i19 = 613566756 & i17;
                                defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    ckeVar2 = ckeVar;
                } else {
                    ckeVar2 = ckeVar;
                    i11 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.C(ckeVar2)) {
                            i12 = 524288;
                        } else {
                            i12 = 1048576;
                        }
                        i3 = i11 | i12;
                    }
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i13 & 1)) {
                    if (i16 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i6 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        ckeVar4 = null;
                    } else {
                        ckeVar4 = ckeVar2;
                    }
                    if (str != null) {
                        bveVarC.v(1899222916);
                        i14 = i13 & 112;
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (i14 != 32) {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = defpackage.dea.a;
                        ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                        bwcVar2.Y(false);
                    } else {
                        bveVarC.v(1899381698);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ddoVar = defpackage.cgf.e;
                    }
                    defpackage.cgf cgfVarV10 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = defpackage.ato.b;
                        bwcVar.ad(objS);
                    }
                    defpackage.cty ctyVar10 = (defpackage.cty) objS;
                    long j19 = bwcVar.u;
                    long j110 = j19 ^ (j19 >>> 32);
                    defpackage.cgf cgfVarN10 = defpackage.bzo.n(bveVarC, cgfVarV10);
                    defpackage.cdd cddVarAh10 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVar10, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh10, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN10, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j110), defpackage.cwl.f);
                    bwcVar.Y(true);
                    f3 = f4;
                    ckeVar3 = ckeVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    cgfVar2 = cgfVar3;
                } else {
                    bveVarC.s();
                    cfuVar3 = cfuVar2;
                    ckeVar3 = ckeVar2;
                    csrVar3 = csrVar2;
                    f3 = f2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: akk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cne cneVar2 = cneVar;
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar4 = cgfVar2;
                            int i17 = i | 1;
                            int i18 = 306783378 & i17;
                            int i19 = 613566756 & i17;
                            defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            csrVar2 = csrVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (true != bveVarC.z(f2)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    ckeVar2 = ckeVar;
                } else {
                    ckeVar2 = ckeVar;
                    i11 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.C(ckeVar2)) {
                            i12 = 524288;
                        } else {
                            i12 = 1048576;
                        }
                        i3 = i11 | i12;
                    }
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i13 & 1)) {
                    if (i16 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i6 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        ckeVar4 = null;
                    } else {
                        ckeVar4 = ckeVar2;
                    }
                    if (str != null) {
                        bveVarC.v(1899222916);
                        i14 = i13 & 112;
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (i14 != 32) {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = defpackage.dea.a;
                        ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                        bwcVar2.Y(false);
                    } else {
                        bveVarC.v(1899381698);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ddoVar = defpackage.cgf.e;
                    }
                    defpackage.cgf cgfVarV11 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = defpackage.ato.b;
                        bwcVar.ad(objS);
                    }
                    defpackage.cty ctyVar11 = (defpackage.cty) objS;
                    long j111 = bwcVar.u;
                    long j112 = j111 ^ (j111 >>> 32);
                    defpackage.cgf cgfVarN11 = defpackage.bzo.n(bveVarC, cgfVarV11);
                    defpackage.cdd cddVarAh11 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVar11, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh11, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN11, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j112), defpackage.cwl.f);
                    bwcVar.Y(true);
                    f3 = f4;
                    ckeVar3 = ckeVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    cgfVar2 = cgfVar3;
                } else {
                    bveVarC.s();
                    cfuVar3 = cfuVar2;
                    ckeVar3 = ckeVar2;
                    csrVar3 = csrVar2;
                    f3 = f2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: akk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cne cneVar2 = cneVar;
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar4 = cgfVar2;
                            int i17 = i | 1;
                            int i18 = 306783378 & i17;
                            int i19 = 613566756 & i17;
                            defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                ckeVar2 = ckeVar;
            } else {
                ckeVar2 = ckeVar;
                i11 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.C(ckeVar2)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i3 = i11 | i12;
                }
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i13 & 1)) {
                if (i16 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i4 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i6 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    ckeVar4 = null;
                } else {
                    ckeVar4 = ckeVar2;
                }
                if (str != null) {
                    bveVarC.v(1899222916);
                    i14 = i13 & 112;
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (i14 != 32) {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger12 = defpackage.dea.a;
                    ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                    bwcVar2.Y(false);
                } else {
                    bveVarC.v(1899381698);
                    ((defpackage.bwc) bveVarC).Y(false);
                    ddoVar = defpackage.cgf.e;
                }
                defpackage.cgf cgfVarV12 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = defpackage.ato.b;
                    bwcVar.ad(objS);
                }
                defpackage.cty ctyVar12 = (defpackage.cty) objS;
                long j113 = bwcVar.u;
                long j114 = j113 ^ (j113 >>> 32);
                defpackage.cgf cgfVarN12 = defpackage.bzo.n(bveVarC, cgfVarV12);
                defpackage.cdd cddVarAh12 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVar12, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh12, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN12, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j114), defpackage.cwl.f);
                bwcVar.Y(true);
                f3 = f4;
                ckeVar3 = ckeVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                cgfVar2 = cgfVar3;
            } else {
                bveVarC.s();
                cfuVar3 = cfuVar2;
                ckeVar3 = ckeVar2;
                csrVar3 = csrVar2;
                f3 = f2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: akk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cne cneVar2 = cneVar;
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar4 = cgfVar2;
                        int i17 = i | 1;
                        int i18 = 306783378 & i17;
                        int i19 = 613566756 & i17;
                        defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 3072;
        cfuVar2 = cfuVar;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                csrVar2 = csrVar;
                if (true != bveVarC.C(csrVar2)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (true != bveVarC.z(f2)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    ckeVar2 = ckeVar;
                } else {
                    ckeVar2 = ckeVar;
                    i11 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.C(ckeVar2)) {
                            i12 = 524288;
                        } else {
                            i12 = 1048576;
                        }
                        i3 = i11 | i12;
                    }
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i13 & 1)) {
                    if (i16 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i4 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i6 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        ckeVar4 = null;
                    } else {
                        ckeVar4 = ckeVar2;
                    }
                    if (str != null) {
                        bveVarC.v(1899222916);
                        i14 = i13 & 112;
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (i14 != 32) {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.act(str, 10);
                            bwcVar2.ad(objS2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = defpackage.dea.a;
                        ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                        bwcVar2.Y(false);
                    } else {
                        bveVarC.v(1899381698);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ddoVar = defpackage.cgf.e;
                    }
                    defpackage.cgf cgfVarV13 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = defpackage.ato.b;
                        bwcVar.ad(objS);
                    }
                    defpackage.cty ctyVar13 = (defpackage.cty) objS;
                    long j115 = bwcVar.u;
                    long j116 = j115 ^ (j115 >>> 32);
                    defpackage.cgf cgfVarN13 = defpackage.bzo.n(bveVarC, cgfVarV13);
                    defpackage.cdd cddVarAh13 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVar13, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh13, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN13, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j116), defpackage.cwl.f);
                    bwcVar.Y(true);
                    f3 = f4;
                    ckeVar3 = ckeVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    cgfVar2 = cgfVar3;
                } else {
                    bveVarC.s();
                    cfuVar3 = cfuVar2;
                    ckeVar3 = ckeVar2;
                    csrVar3 = csrVar2;
                    f3 = f2;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: akk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.cne cneVar2 = cneVar;
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar4 = cgfVar2;
                            int i17 = i | 1;
                            int i18 = 306783378 & i17;
                            int i19 = 613566756 & i17;
                            defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                ckeVar2 = ckeVar;
            } else {
                ckeVar2 = ckeVar;
                i11 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.C(ckeVar2)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i3 = i11 | i12;
                }
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i13 & 1)) {
                if (i16 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i4 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i6 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    ckeVar4 = null;
                } else {
                    ckeVar4 = ckeVar2;
                }
                if (str != null) {
                    bveVarC.v(1899222916);
                    i14 = i13 & 112;
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (i14 != 32) {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger14 = defpackage.dea.a;
                    ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                    bwcVar2.Y(false);
                } else {
                    bveVarC.v(1899381698);
                    ((defpackage.bwc) bveVarC).Y(false);
                    ddoVar = defpackage.cgf.e;
                }
                defpackage.cgf cgfVarV14 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = defpackage.ato.b;
                    bwcVar.ad(objS);
                }
                defpackage.cty ctyVar14 = (defpackage.cty) objS;
                long j117 = bwcVar.u;
                long j118 = j117 ^ (j117 >>> 32);
                defpackage.cgf cgfVarN14 = defpackage.bzo.n(bveVarC, cgfVarV14);
                defpackage.cdd cddVarAh14 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVar14, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh14, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN14, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j118), defpackage.cwl.f);
                bwcVar.Y(true);
                f3 = f4;
                ckeVar3 = ckeVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                cgfVar2 = cgfVar3;
            } else {
                bveVarC.s();
                cfuVar3 = cfuVar2;
                ckeVar3 = ckeVar2;
                csrVar3 = csrVar2;
                f3 = f2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: akk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cne cneVar2 = cneVar;
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar4 = cgfVar2;
                        int i17 = i | 1;
                        int i18 = 306783378 & i17;
                        int i19 = 613566756 & i17;
                        defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 24576;
        csrVar2 = csrVar;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (true != bveVarC.z(f2)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                ckeVar2 = ckeVar;
            } else {
                ckeVar2 = ckeVar;
                i11 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.C(ckeVar2)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i3 = i11 | i12;
                }
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i13 & 1)) {
                if (i16 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i4 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i6 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    ckeVar4 = null;
                } else {
                    ckeVar4 = ckeVar2;
                }
                if (str != null) {
                    bveVarC.v(1899222916);
                    i14 = i13 & 112;
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (i14 != 32) {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.act(str, 10);
                        bwcVar2.ad(objS2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger15 = defpackage.dea.a;
                    ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                    bwcVar2.Y(false);
                } else {
                    bveVarC.v(1899381698);
                    ((defpackage.bwc) bveVarC).Y(false);
                    ddoVar = defpackage.cgf.e;
                }
                defpackage.cgf cgfVarV15 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = defpackage.ato.b;
                    bwcVar.ad(objS);
                }
                defpackage.cty ctyVar15 = (defpackage.cty) objS;
                long j119 = bwcVar.u;
                long j1110 = j119 ^ (j119 >>> 32);
                defpackage.cgf cgfVarN15 = defpackage.bzo.n(bveVarC, cgfVarV15);
                defpackage.cdd cddVarAh15 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVar15, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh15, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN15, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j1110), defpackage.cwl.f);
                bwcVar.Y(true);
                f3 = f4;
                ckeVar3 = ckeVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                cgfVar2 = cgfVar3;
            } else {
                bveVarC.s();
                cfuVar3 = cfuVar2;
                ckeVar3 = ckeVar2;
                csrVar3 = csrVar2;
                f3 = f2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: akk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.cne cneVar2 = cneVar;
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar4 = cgfVar2;
                        int i17 = i | 1;
                        int i18 = 306783378 & i17;
                        int i19 = 613566756 & i17;
                        defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 196608;
        f2 = f;
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
            ckeVar2 = ckeVar;
        } else {
            ckeVar2 = ckeVar;
            i11 = i3;
            if ((i & 1572864) == 0) {
                if (true != bveVarC.C(ckeVar2)) {
                    i12 = 524288;
                } else {
                    i12 = 1048576;
                }
                i3 = i11 | i12;
            }
        }
        i13 = i3;
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i13 & 1)) {
            if (i16 != 0) {
                cgfVar3 = defpackage.cgf.e;
            } else {
                cgfVar3 = cgfVar2;
            }
            if (i4 != 0) {
                cfuVar4 = defpackage.cfs.e;
            } else {
                cfuVar4 = cfuVar2;
            }
            if (i6 != 0) {
                csrVar4 = defpackage.csq.b;
            } else {
                csrVar4 = csrVar2;
            }
            if (i8 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if (i10 != 0) {
                ckeVar4 = null;
            } else {
                ckeVar4 = ckeVar2;
            }
            if (str != null) {
                bveVarC.v(1899222916);
                i14 = i13 & 112;
                bwcVar2 = (defpackage.bwc) bveVarC;
                objS2 = bwcVar2.S();
                if (i14 != 32) {
                    objS2 = new defpackage.act(str, 10);
                    bwcVar2.ad(objS2);
                } else {
                    objS2 = new defpackage.act(str, 10);
                    bwcVar2.ad(objS2);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger16 = defpackage.dea.a;
                ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                bwcVar2.Y(false);
            } else {
                bveVarC.v(1899381698);
                ((defpackage.bwc) bveVarC).Y(false);
                ddoVar = defpackage.cgf.e;
            }
            defpackage.cgf cgfVarV16 = defpackage.bzd.v(defpackage.cjv.h(cgfVar3.a(ddoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cneVar, cfuVar4, csrVar4, f4, ckeVar4, 2);
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = defpackage.ato.b;
                bwcVar.ad(objS);
            }
            defpackage.cty ctyVar16 = (defpackage.cty) objS;
            long j1111 = bwcVar.u;
            long j1112 = j1111 ^ (j1111 >>> 32);
            defpackage.cgf cgfVarN16 = defpackage.bzo.n(bveVarC, cgfVarV16);
            defpackage.cdd cddVarAh16 = bwcVar.ah();
            aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVar16, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh16, defpackage.cwl.d);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN16, defpackage.cwl.c);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j1112), defpackage.cwl.f);
            bwcVar.Y(true);
            f3 = f4;
            ckeVar3 = ckeVar4;
            cfuVar3 = cfuVar4;
            csrVar3 = csrVar4;
            cgfVar2 = cgfVar3;
        } else {
            bveVarC.s();
            cfuVar3 = cfuVar2;
            ckeVar3 = ckeVar2;
            csrVar3 = csrVar2;
            f3 = f2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: akk
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cne cneVar2 = cneVar;
                    java.lang.String str2 = str;
                    defpackage.cgf cgfVar4 = cgfVar2;
                    int i17 = i | 1;
                    int i18 = 306783378 & i17;
                    int i19 = 613566756 & i17;
                    defpackage.ca.bb(cneVar2, str2, cgfVar4, cfuVar3, csrVar3, f3, ckeVar3, bveVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 + i18) & i19), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static void bc(defpackage.cjr cjrVar, defpackage.cgf cgfVar, defpackage.csr csrVar, defpackage.bve bveVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            cgfVar = defpackage.cgf.e;
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.cfu cfuVar = (i2 & 8) != 0 ? defpackage.cfs.e : null;
        if ((i2 & 16) != 0) {
            csrVar = defpackage.csq.b;
        }
        defpackage.csr csrVar2 = csrVar;
        boolean zC = bveVar.C(cjrVar);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = defpackage.rq.r(cjrVar, 1);
            bveVar.x(objG);
        }
        defpackage.cnc cncVar = (defpackage.cnc) objG;
        bb(cncVar, null, cgfVar2, cfuVar, csrVar2, 1.0f, null, bveVar, (i & 112) | 8 | (i & 896) | (i & 7168) | (i & 57344), 0);
    }

    public static void bd(defpackage.cwn cwnVar, defpackage.affc affcVar) {
        defpackage.dai.o(cwnVar, defpackage.akd.b, new defpackage.act(affcVar, 9));
    }

    public static defpackage.cgf be(defpackage.cgf cgfVar) {
        return cgfVar.a(defpackage.ajw.a);
    }

    public static defpackage.cgf bf(defpackage.cgf cgfVar, boolean z, defpackage.ask askVar) {
        return cgfVar.a(z ? new defpackage.ajx(askVar) : defpackage.cgf.e);
    }

    public static float bg(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                return a$.ExternalSyntheticApiModelOutline0.m(edgeEffect);
            } catch (java.lang.Throwable unused) {
            }
        }
        return 0.0f;
    }

    public static void bh(android.widget.EdgeEffect edgeEffect, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static float bi(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        try {
            return a$.ExternalSyntheticApiModelOutline0.m(edgeEffect, f, f2);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void bj(android.widget.EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof defpackage.ake)) {
            edgeEffect.onRelease();
            return;
        }
        defpackage.ake akeVar = (defpackage.ake) edgeEffect;
        float f2 = akeVar.b + f;
        akeVar.b = f2;
        if (java.lang.Math.abs(f2) > akeVar.a) {
            akeVar.onRelease();
        }
    }

    public static float bk(android.widget.EdgeEffect edgeEffect, float f, float f2, defpackage.dlo dloVar) {
        float f3 = defpackage.aju.a;
        float fA = dloVar.a() * 386.0878f;
        float fAbs = java.lang.Math.abs(f) * 0.35f;
        double d = ((double) defpackage.aju.a) * ((double) (fA * 160.0f * 0.84f));
        double dExp = d * java.lang.Math.exp((defpackage.aju.b / defpackage.aju.c) * java.lang.Math.log(((double) fAbs) / d));
        if (((float) dExp) > bg(edgeEffect) * f2) {
            return 0.0f;
        }
        bh(edgeEffect, defpackage.afhi.k(f));
        return f;
    }

    public static boolean bl(defpackage.bve bveVar) {
        return (((android.content.res.Configuration) bveVar.f(defpackage.daj.a)).uiMode & 48) == 32;
    }

    public static defpackage.ctx bm(java.util.Iterator it, defpackage.ca caVar) {
        try {
            if (!(it instanceof defpackage.aua)) {
                return (defpackage.ctx) it.next();
            }
            caVar.getClass();
            throw null;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static int bn(int i, int i2, boolean z) {
        return z ? i : i - i2;
    }

    private static int bo(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static boolean bp(int i, int i2, int i3, boolean z) {
        if (z) {
            return i2 <= i;
        }
        return i3 - i2 > i;
    }

    public static defpackage.cq c(android.view.ViewGroup viewGroup, defpackage.bt btVar) {
        viewGroup.getClass();
        defpackage.ca caVarAp = btVar.ap();
        caVarAp.getClass();
        return d(viewGroup, caVarAp);
    }

    public static defpackage.cq d(android.view.ViewGroup viewGroup, defpackage.ca caVar) {
        caVar.getClass();
        java.lang.Object tag = viewGroup.getTag(2131429549);
        if (tag instanceof defpackage.cq) {
            return (defpackage.cq) tag;
        }
        defpackage.cq cqVar = new defpackage.cq(viewGroup);
        viewGroup.setTag(2131429549, cqVar);
        return cqVar;
    }

    public static android.graphics.drawable.Drawable e(android.content.Context context, int i) {
        return defpackage.mu.e().c(context, i);
    }

    public static void f(android.content.res.Configuration configuration, defpackage.dwh dwhVar) {
        a$.ExternalSyntheticApiModelOutline2.m(configuration, a$.ExternalSyntheticApiModelOutline2.m(dwhVar.d()));
    }

    public static /* synthetic */ java.lang.String g(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static void h(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i2 = i - 1;
        if (i2 == 0) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bs(viewGroup2, view, "SpecialEffectsController: Removing view ", " from container "));
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bl(view, "SpecialEffectsController: Setting view ", " to INVISIBLE"));
                }
                view.setVisibility(4);
                return;
            } else {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bl(view, "SpecialEffectsController: Setting view ", " to GONE"));
                }
                view.setVisibility(8);
                return;
            }
        }
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", defpackage.a.bl(view, "SpecialEffectsController: Setting view ", " to VISIBLE"));
        }
        android.view.ViewParent parent2 = view.getParent();
        if ((parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null) == null) {
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bs(viewGroup, view, "SpecialEffectsController: Adding view ", " to Container "));
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static int i(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unknown visibility "));
    }

    public static int j(android.view.View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return i(view.getVisibility());
    }

    public static /* synthetic */ defpackage.ov k(int i, int i2) {
        return new defpackage.ov(i, i2, (defpackage.affc) new defpackage.bmo(1));
    }

    public static boolean l(android.view.View view) {
        return view.getLayoutDirection() == 1;
    }

    public static int m(defpackage.mo moVar, defpackage.lr lrVar, android.view.View view, android.view.View view2, defpackage.mc mcVar, boolean z) {
        if (mcVar.av() == 0 || moVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return java.lang.Math.abs(((defpackage.md) view.getLayoutParams()).eX() - ((defpackage.md) view2.getLayoutParams()).eX()) + 1;
        }
        return java.lang.Math.min(lrVar.k(), lrVar.a(view2) - lrVar.d(view));
    }

    public static int n(defpackage.mo moVar, defpackage.lr lrVar, android.view.View view, android.view.View view2, defpackage.mc mcVar, boolean z, boolean z2) {
        if (mcVar.av() == 0 || moVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? java.lang.Math.max(0, (moVar.a() - java.lang.Math.max(((defpackage.md) view.getLayoutParams()).eX(), ((defpackage.md) view2.getLayoutParams()).eX())) - 1) : java.lang.Math.max(0, java.lang.Math.min(((defpackage.md) view.getLayoutParams()).eX(), ((defpackage.md) view2.getLayoutParams()).eX()));
        if (z) {
            return java.lang.Math.round((iMax * (java.lang.Math.abs(lrVar.a(view2) - lrVar.d(view)) / (java.lang.Math.abs(((defpackage.md) view.getLayoutParams()).eX() - ((defpackage.md) view2.getLayoutParams()).eX()) + 1))) + (lrVar.j() - lrVar.d(view)));
        }
        return iMax;
    }

    public static int o(defpackage.mo moVar, defpackage.lr lrVar, android.view.View view, android.view.View view2, defpackage.mc mcVar, boolean z) {
        if (mcVar.av() == 0 || moVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return moVar.a();
        }
        return (int) (((lrVar.a(view2) - lrVar.d(view)) / (java.lang.Math.abs(((defpackage.md) view.getLayoutParams()).eX() - ((defpackage.md) view2.getLayoutParams()).eX()) + 1)) * moVar.a());
    }

    public static int y(android.content.Context context) {
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static void z(android.content.Context context) {
        context.getResources().getBoolean(2131034112);
    }

    public android.widget.EdgeEffect r(android.support.v7.widget.RecyclerView recyclerView) {
        throw null;
    }

    public void t(int i, int i2, java.lang.Object obj) {
        w();
    }

    public ca(char[] cArr) {
    }

    public void s() {
    }

    public void w() {
    }

    public void p(android.support.v7.widget.RecyclerView recyclerView, int i) {
    }

    public void u(int i, int i2) {
    }

    public void v(int i, int i2) {
    }

    public void x(int i, int i2) {
    }

    public void q(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
    }
}
