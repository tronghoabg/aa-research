package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class lxy {
    public lxy() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x015d  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    public static void A(defpackage.cne cneVar, float f, java.lang.String str, boolean z, defpackage.affc affcVar, defpackage.cgf cgfVar, boolean z2, defpackage.ktz ktzVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        java.lang.String str2;
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        defpackage.ktz ktzVar2;
        boolean z4;
        defpackage.bve bveVar2;
        float f2;
        boolean z5;
        java.lang.String str3;
        defpackage.ktz ktzVar3;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        int i8;
        int i9;
        int i10;
        float f3;
        int i11;
        boolean z6;
        boolean z7;
        int i12;
        defpackage.ktz ktzVarH;
        int i13;
        int i14;
        int i15;
        cneVar.getClass();
        affcVar.getClass();
        int i16 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1586167625);
        if (i16 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i17 = 16;
            if ((i2 & 2) == 0 && bveVarC.z(f)) {
                i17 = 32;
            }
            i3 |= i17;
        }
        int i18 = i2 & 4;
        if (i18 == 0) {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= true != bveVarC.C(str2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                if (true != bveVarC.D(z)) {
                    i15 = 1024;
                } else {
                    i15 = 2048;
                }
                i3 |= i15;
            }
            if ((i & 24576) == 0) {
                if (true != bveVarC.E(affcVar)) {
                    i14 = 8192;
                } else {
                    i14 = 16384;
                }
                i3 |= i14;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    cgfVar2 = cgfVar;
                    if (true != bveVarC.C(cgfVar2)) {
                        i5 = 65536;
                    } else {
                        i5 = 131072;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (true != bveVarC.D(z2)) {
                        i7 = 524288;
                    } else {
                        i7 = 1048576;
                    }
                    i3 |= i7;
                }
                if ((12582912 & i) == 0) {
                    i13 = 4194304;
                    if ((i2 & 128) == 0) {
                        ktzVar2 = ktzVar;
                        if (bveVarC.C(ktzVar2)) {
                            i13 = 8388608;
                        }
                    } else {
                        ktzVar2 = ktzVar;
                    }
                    i3 |= i13;
                } else {
                    ktzVar2 = ktzVar;
                }
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bveVarC.I(z4, i3 & 1)) {
                    i8 = i2 & 128;
                    i9 = i2 & 2;
                    i10 = i3;
                    ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i9 != 0) {
                            i11 = i10 & (-113);
                            defpackage.ktf ktfVar = nmt.a;
                            f3 = 32.0f;
                        } else {
                            f3 = f;
                            i11 = i10;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i4 != 0) {
                            cgfVar2 = defpackage.cgf.e;
                        }
                        z6 = (!z3) | z2;
                        if (i8 != 0) {
                            defpackage.afar afarVar = defpackage.ktz.a;
                            java.lang.String str4 = str2;
                            z7 = z6;
                            f2 = f3;
                            str3 = str4;
                            i12 = i11 & (-29360129);
                            ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                        } else {
                            java.lang.String str5 = str2;
                            z7 = z6;
                            f2 = f3;
                            str3 = str5;
                            i12 = i11;
                            ktzVarH = ktzVar2;
                        }
                    } else {
                        bveVarC.s();
                        int i19 = i9 != 0 ? i10 & (-113) : i10;
                        if (i8 != 0) {
                            i19 &= -29360129;
                        }
                        i12 = i19;
                        str3 = str2;
                        ktzVarH = ktzVar2;
                        f2 = f;
                        z7 = z2;
                    }
                    bveVarC.l();
                    bveVar2 = bveVarC;
                    defpackage.jxs.f(z, affcVar, cgfVar2, null, null, z7, defpackage.kfn.m(), ktzVarH, null, null, true, defpackage.dai.as(-1980950547, true, new nmn(cneVar, f2, str3, z, z7, ktzVarH), bveVarC), bveVar2, ((i12 >> 9) & 1022) | ((i12 >> 3) & 458752) | (29360128 & i12), 432, 1816);
                    z5 = z7;
                    ktzVar3 = ktzVarH;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    ktzVar3 = ktzVar2;
                }
                cgfVar3 = cgfVar2;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new nmo(cneVar, f2, str3, z, affcVar, cgfVar3, z5, ktzVar3, i, i2);
                }
            }
            i3 |= 196608;
            cgfVar2 = cgfVar;
            i6 = i2 & 64;
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(z2)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i3 |= i7;
            }
            if ((12582912 & i) == 0) {
                i13 = 4194304;
                if ((i2 & 128) == 0) {
                    ktzVar2 = ktzVar;
                    if (bveVarC.C(ktzVar2)) {
                        i13 = 8388608;
                    }
                } else {
                    ktzVar2 = ktzVar;
                }
                i3 |= i13;
            } else {
                ktzVar2 = ktzVar;
            }
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i3 & 1)) {
                i8 = i2 & 128;
                i9 = i2 & 2;
                i10 = i3;
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        i11 = i10 & (-113);
                        defpackage.ktf ktfVar2 = nmt.a;
                        f3 = 32.0f;
                    } else {
                        f3 = f;
                        i11 = i10;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    z6 = (!z3) | z2;
                    if (i8 != 0) {
                        defpackage.afar afarVar2 = defpackage.ktz.a;
                        java.lang.String str6 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str6;
                        i12 = i11 & (-29360129);
                        ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    } else {
                        java.lang.String str7 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str7;
                        i12 = i11;
                        ktzVarH = ktzVar2;
                    }
                } else {
                    if (i9 != 0) {
                        i11 = i10 & (-113);
                        defpackage.ktf ktfVar3 = nmt.a;
                        f3 = 32.0f;
                    } else {
                        f3 = f;
                        i11 = i10;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    z6 = (!z3) | z2;
                    if (i8 != 0) {
                        defpackage.afar afarVar3 = defpackage.ktz.a;
                        java.lang.String str8 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str8;
                        i12 = i11 & (-29360129);
                        ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    } else {
                        java.lang.String str9 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str9;
                        i12 = i11;
                        ktzVarH = ktzVar2;
                    }
                }
                bveVarC.l();
                bveVar2 = bveVarC;
                defpackage.jxs.f(z, affcVar, cgfVar2, null, null, z7, defpackage.kfn.m(), ktzVarH, null, null, true, defpackage.dai.as(-1980950547, true, new nmn(cneVar, f2, str3, z, z7, ktzVarH), bveVarC), bveVar2, ((i12 >> 9) & 1022) | ((i12 >> 3) & 458752) | (29360128 & i12), 432, 1816);
                z5 = z7;
                ktzVar3 = ktzVarH;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                f2 = f;
                z5 = z2;
                str3 = str2;
                ktzVar3 = ktzVar2;
            }
            cgfVar3 = cgfVar2;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nmo(cneVar, f2, str3, z, affcVar, cgfVar3, z5, ktzVar3, i, i2);
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i & 3072) == 0) {
            if (true != bveVarC.D(z)) {
                i15 = 1024;
            } else {
                i15 = 2048;
            }
            i3 |= i15;
        }
        if ((i & 24576) == 0) {
            if (true != bveVarC.E(affcVar)) {
                i14 = 8192;
            } else {
                i14 = 16384;
            }
            i3 |= i14;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                cgfVar2 = cgfVar;
                if (true != bveVarC.C(cgfVar2)) {
                    i5 = 65536;
                } else {
                    i5 = 131072;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.D(z2)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i3 |= i7;
            }
            if ((12582912 & i) == 0) {
                i13 = 4194304;
                if ((i2 & 128) == 0) {
                    ktzVar2 = ktzVar;
                    if (bveVarC.C(ktzVar2)) {
                        i13 = 8388608;
                    }
                } else {
                    ktzVar2 = ktzVar;
                }
                i3 |= i13;
            } else {
                ktzVar2 = ktzVar;
            }
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i3 & 1)) {
                i8 = i2 & 128;
                i9 = i2 & 2;
                i10 = i3;
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        i11 = i10 & (-113);
                        defpackage.ktf ktfVar4 = nmt.a;
                        f3 = 32.0f;
                    } else {
                        f3 = f;
                        i11 = i10;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    z6 = (!z3) | z2;
                    if (i8 != 0) {
                        defpackage.afar afarVar4 = defpackage.ktz.a;
                        java.lang.String str10 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str10;
                        i12 = i11 & (-29360129);
                        ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    } else {
                        java.lang.String str11 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str11;
                        i12 = i11;
                        ktzVarH = ktzVar2;
                    }
                } else {
                    if (i9 != 0) {
                        i11 = i10 & (-113);
                        defpackage.ktf ktfVar5 = nmt.a;
                        f3 = 32.0f;
                    } else {
                        f3 = f;
                        i11 = i10;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    z6 = (!z3) | z2;
                    if (i8 != 0) {
                        defpackage.afar afarVar5 = defpackage.ktz.a;
                        java.lang.String str12 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str12;
                        i12 = i11 & (-29360129);
                        ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    } else {
                        java.lang.String str13 = str2;
                        z7 = z6;
                        f2 = f3;
                        str3 = str13;
                        i12 = i11;
                        ktzVarH = ktzVar2;
                    }
                }
                bveVarC.l();
                bveVar2 = bveVarC;
                defpackage.jxs.f(z, affcVar, cgfVar2, null, null, z7, defpackage.kfn.m(), ktzVarH, null, null, true, defpackage.dai.as(-1980950547, true, new nmn(cneVar, f2, str3, z, z7, ktzVarH), bveVarC), bveVar2, ((i12 >> 9) & 1022) | ((i12 >> 3) & 458752) | (29360128 & i12), 432, 1816);
                z5 = z7;
                ktzVar3 = ktzVarH;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                f2 = f;
                z5 = z2;
                str3 = str2;
                ktzVar3 = ktzVar2;
            }
            cgfVar3 = cgfVar2;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nmo(cneVar, f2, str3, z, affcVar, cgfVar3, z5, ktzVar3, i, i2);
            }
        }
        i3 |= 196608;
        cgfVar2 = cgfVar;
        i6 = i2 & 64;
        if (i6 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.D(z2)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i3 |= i7;
        }
        if ((12582912 & i) == 0) {
            i13 = 4194304;
            if ((i2 & 128) == 0) {
                ktzVar2 = ktzVar;
                if (bveVarC.C(ktzVar2)) {
                    i13 = 8388608;
                }
            } else {
                ktzVar2 = ktzVar;
            }
            i3 |= i13;
        } else {
            ktzVar2 = ktzVar;
        }
        if ((i3 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bveVarC.I(z4, i3 & 1)) {
            i8 = i2 & 128;
            i9 = i2 & 2;
            i10 = i3;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    i11 = i10 & (-113);
                    defpackage.ktf ktfVar6 = nmt.a;
                    f3 = 32.0f;
                } else {
                    f3 = f;
                    i11 = i10;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if (i4 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                z6 = (!z3) | z2;
                if (i8 != 0) {
                    defpackage.afar afarVar6 = defpackage.ktz.a;
                    java.lang.String str14 = str2;
                    z7 = z6;
                    f2 = f3;
                    str3 = str14;
                    i12 = i11 & (-29360129);
                    ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                } else {
                    java.lang.String str15 = str2;
                    z7 = z6;
                    f2 = f3;
                    str3 = str15;
                    i12 = i11;
                    ktzVarH = ktzVar2;
                }
            } else {
                if (i9 != 0) {
                    i11 = i10 & (-113);
                    defpackage.ktf ktfVar7 = nmt.a;
                    f3 = 32.0f;
                } else {
                    f3 = f;
                    i11 = i10;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if (i4 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                z6 = (!z3) | z2;
                if (i8 != 0) {
                    defpackage.afar afarVar7 = defpackage.ktz.a;
                    java.lang.String str16 = str2;
                    z7 = z6;
                    f2 = f3;
                    str3 = str16;
                    i12 = i11 & (-29360129);
                    ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                } else {
                    java.lang.String str17 = str2;
                    z7 = z6;
                    f2 = f3;
                    str3 = str17;
                    i12 = i11;
                    ktzVarH = ktzVar2;
                }
            }
            bveVarC.l();
            bveVar2 = bveVarC;
            defpackage.jxs.f(z, affcVar, cgfVar2, null, null, z7, defpackage.kfn.m(), ktzVarH, null, null, true, defpackage.dai.as(-1980950547, true, new nmn(cneVar, f2, str3, z, z7, ktzVarH), bveVarC), bveVar2, ((i12 >> 9) & 1022) | ((i12 >> 3) & 458752) | (29360128 & i12), 432, 1816);
            z5 = z7;
            ktzVar3 = ktzVarH;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            f2 = f;
            z5 = z2;
            str3 = str2;
            ktzVar3 = ktzVar2;
        }
        cgfVar3 = cgfVar2;
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nmo(cneVar, f2, str3, z, affcVar, cgfVar3, z5, ktzVar3, i, i2);
        }
    }

    public static /* synthetic */ defpackage.afbk B(java.lang.String str, boolean z, boolean z2, defpackage.ktz ktzVar, defpackage.atx atxVar, defpackage.bve bveVar, int i) {
        atxVar.getClass();
        if (bveVar.I((i & 17) != 16, i & 1)) {
            w(str, z, z2, ktzVar, bveVar, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static void C(defpackage.cne cneVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.afer aferVar2;
        cneVar.getClass();
        aferVar.getClass();
        defpackage.bve bveVarC = bveVar.c(-404269023);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aferVar2 = aferVar;
            i2 |= true != bveVarC.E(aferVar2) ? 16 : 32;
        } else {
            aferVar2 = aferVar;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i3 = (i2 & 112) | (i2 & 14) | 392;
            defpackage.afer aferVar3 = aferVar2;
            defpackage.khg.m(cneVar, aferVar3, defpackage.awj.k(defpackage.cgf.e, 72.0f, 42.0f), new defpackage.ktf(42.0f, 32.0f, new defpackage.dlr(32.0f), null, null, 504), false, defpackage.bcw.a, defpackage.kfn.k(false, bveVarC, 1), null, null, bveVarC, i3, 0, 3760);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nau(cneVar, aferVar, i, 18, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0176  */
    /* JADX WARN: Code duplicated, block: B:126:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x0185  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:160:0x0201  */
    /* JADX WARN: Code duplicated, block: B:161:0x020e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0212  */
    /* JADX WARN: Code duplicated, block: B:164:0x0214  */
    /* JADX WARN: Code duplicated, block: B:167:0x021c  */
    /* JADX WARN: Code duplicated, block: B:168:0x021e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0259  */
    /* JADX WARN: Code duplicated, block: B:174:0x028e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0292  */
    /* JADX WARN: Code duplicated, block: B:177:0x0318  */
    /* JADX WARN: Code duplicated, block: B:179:0x0354  */
    /* JADX WARN: Code duplicated, block: B:180:0x0358  */
    /* JADX WARN: Code duplicated, block: B:183:0x03df  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    public static void D(defpackage.afer aferVar, defpackage.afer aferVar2, boolean z, boolean z2, defpackage.afer aferVar3, defpackage.cgf cgfVar, boolean z3, defpackage.affg affgVar, defpackage.cne cneVar, defpackage.cne cneVar2, defpackage.ckd ckdVar, defpackage.ckd ckdVar2, defpackage.affg affgVar2, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.afer aferVar4;
        boolean z4;
        defpackage.afer aferVar5;
        defpackage.affg affgVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        boolean z6;
        defpackage.cne cneVar3;
        defpackage.cne cneVar4;
        defpackage.ckd ckdVar3;
        defpackage.ckd ckdVar4;
        defpackage.bxl bxlVarJ;
        int i12;
        int i13;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar3;
        boolean z7;
        int i14;
        defpackage.cne cneVarH;
        defpackage.cne cneVarH2;
        defpackage.ckd ckdVar5;
        defpackage.ckd ckdVar6;
        defpackage.cne cneVar5;
        defpackage.ckd ckdVar7;
        defpackage.cne cneVar6;
        defpackage.cgf cgfVar4;
        int i15;
        int i16;
        int i17;
        defpackage.cne cneVar7;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        defpackage.afer aferVar6;
        defpackage.ckd ckdVar8;
        defpackage.ckd ckdVar9;
        defpackage.cne cneVar8;
        defpackage.afer aferVar7;
        int i24;
        boolean zE;
        int i25;
        boolean zE2;
        aferVar.getClass();
        aferVar2.getClass();
        affgVar2.getClass();
        int i26 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1387808166);
        if (i26 == 0) {
            i4 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            aferVar4 = aferVar2;
            i4 |= true != bveVarC.E(aferVar4) ? 16 : 32;
        } else {
            aferVar4 = aferVar2;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i4 |= true != bveVarC.D(z4) ? 1024 : 2048;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            aferVar5 = aferVar3;
            i4 |= true != bveVarC.E(aferVar5) ? 8192 : 16384;
        } else {
            aferVar5 = aferVar3;
        }
        int i27 = i3 & 32;
        if (i27 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= true != bveVarC.C(cgfVar) ? 65536 : 131072;
        }
        int i28 = i3 & 64;
        boolean z8 = i28 == 0;
        if (i28 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= true != bveVarC.D(z3) ? 524288 : 1048576;
        }
        int i29 = i3 & 128;
        if (i29 == 0) {
            if ((12582912 & i) == 0) {
                affgVar3 = affgVar;
                i4 |= true != bveVarC.E(affgVar3) ? 4194304 : 8388608;
            }
            if ((100663296 & i) == 0) {
                i25 = 33554432;
                if ((i3 & 256) == 0) {
                    if ((134217728 & i) == 0) {
                        zE2 = bveVarC.C(cneVar);
                    } else {
                        zE2 = bveVarC.E(cneVar);
                    }
                    if (zE2) {
                        i25 = 67108864;
                    }
                }
                i4 |= i25;
            }
            if ((805306368 & i) == 0) {
                i24 = 268435456;
                if ((i3 & 512) == 0) {
                    if ((1073741824 & i) == 0) {
                        zE = bveVarC.C(cneVar2);
                    } else {
                        zE = bveVarC.E(cneVar2);
                    }
                    if (zE) {
                        i24 = 536870912;
                    }
                }
                i4 |= i24;
            }
            i5 = i3 & 1024;
            if (i5 != 0) {
                i6 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(ckdVar)) {
                    i7 = 2;
                } else {
                    i7 = 4;
                }
                i6 = i7 | i2;
            } else {
                i6 = i2;
            }
            i8 = i3 & 2048;
            if (i8 != 0) {
                i10 = i6 | 48;
            } else {
                i9 = i6;
                if ((i2 & 48) == 0) {
                    if (true != bveVarC.C(ckdVar2)) {
                        i11 = 16;
                    } else {
                        i11 = 32;
                    }
                    i10 = i9 | i11;
                } else {
                    i10 = i9;
                }
            }
            if ((i2 & 384) == 0) {
                i10 |= true == bveVarC.E(affgVar2) ? 256 : 128;
            }
            if ((306783379 & i4) == 306783378 || (i10 & 147) != 146) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i12 = i3 & 512;
                i13 = i3 & 256;
                int i30 = i10 << 6;
                int i31 = i10 << 9;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i27 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar;
                    }
                    z7 = z8 & z3;
                    if (i29 != 0) {
                        affgVar3 = nmf.a;
                    }
                    if (i13 != 0) {
                        i4 &= -234881025;
                        i14 = 0;
                        cneVarH = defpackage.day.h(2131231565, bveVarC, 0);
                    } else {
                        i14 = 0;
                        cneVarH = cneVar;
                    }
                    defpackage.cgf cgfVar5 = cgfVar3;
                    if (i12 != 0) {
                        cneVarH2 = defpackage.day.h(2131231762, bveVarC, i14);
                        i4 = (-1879048193) & i4;
                    } else {
                        cneVarH2 = cneVar2;
                    }
                    if (i5 != 0) {
                        ckdVar5 = null;
                    } else {
                        ckdVar5 = ckdVar;
                    }
                    ckdVar6 = ckdVar5;
                    cneVar5 = cneVarH;
                    if (i8 != 0) {
                        ckdVar7 = null;
                    } else {
                        ckdVar7 = ckdVar2;
                    }
                    cneVar6 = cneVarH2;
                    cgfVar4 = cgfVar5;
                } else {
                    bveVarC.s();
                    if (i13 != 0) {
                        i4 &= -234881025;
                    }
                    if (i12 != 0) {
                        i4 &= -1879048193;
                    }
                    cgfVar4 = cgfVar;
                    z7 = z3;
                    cneVar5 = cneVar;
                    cneVar6 = cneVar2;
                    ckdVar6 = ckdVar;
                    ckdVar7 = ckdVar2;
                }
                i15 = i31 & 7168;
                i16 = i30 & 7168;
                int i32 = i4 >> 6;
                int i33 = i4 >> 3;
                i17 = (i33 & 14) | 196608;
                bveVarC.l();
                cneVar7 = cneVar6;
                i18 = (i4 & 14) | 196608 | (i33 & 112);
                i19 = (i4 >> 18) & 896;
                i20 = ((i4 >> 12) & 14) | 3456;
                i21 = (i4 >> 21) & 896;
                i22 = i32 & 112;
                i23 = i32 & 57344;
                if (z7) {
                    bveVarC.v(838449312);
                    defpackage.cgf cgfVarAn = defpackage.ca.an(cgfVar4);
                    ckdVar8 = ckdVar7;
                    defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
                    int iF = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh = bwcVar.ah();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarAn);
                    aferVar7 = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar7);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                    int i34 = i17 | i22;
                    E(aferVar, z, cneVar5, ckdVar6, true, "increment", bveVarC, i18 | 512 | i19 | i15 | i23);
                    I(aferVar5, null, "clickTarget", defpackage.dai.as(1743833036, true, new myl(affgVar2, affgVar3, 5), bveVarC), bveVarC, i20, 2);
                    bveVar2 = bveVarC;
                    E(aferVar4, z4, cneVar7, ckdVar8, true, "decrement", bveVar2, i34 | 512 | i21 | i16 | i23);
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                    ckdVar9 = ckdVar6;
                    cneVar8 = cneVar5;
                } else {
                    defpackage.ckd ckdVar10 = ckdVar6;
                    defpackage.ckd ckdVar11 = ckdVar7;
                    defpackage.cne cneVar9 = cneVar5;
                    bveVarC.v(839085990);
                    defpackage.cgf cgfVarAm = defpackage.ca.am(cgfVar4, 2);
                    defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                    int iF2 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh2 = bwcVar.ah();
                    defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarAm);
                    aferVar6 = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar6);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA2, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                    E(aferVar2, z2, cneVar7, ckdVar11, false, "decrement", bveVarC, i17 | i22 | 512 | i21 | i16 | i23);
                    cneVar7 = cneVar7;
                    ckdVar8 = ckdVar11;
                    I(aferVar3, null, "clickTarget", defpackage.dai.as(168398723, true, new myl(affgVar2, affgVar3, 6), bveVarC), bveVarC, i20, 2);
                    bveVar2 = bveVarC;
                    ckdVar9 = ckdVar10;
                    cneVar8 = cneVar9;
                    E(aferVar, z, cneVar8, ckdVar9, false, "increment", bveVar2, i18 | 512 | i19 | i15 | i23);
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                }
                cgfVar2 = cgfVar4;
                cneVar3 = cneVar8;
                ckdVar3 = ckdVar9;
                cneVar4 = cneVar7;
                ckdVar4 = ckdVar8;
                z6 = z7;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar2 = cgfVar;
                z6 = z3;
                cneVar3 = cneVar;
                cneVar4 = cneVar2;
                ckdVar3 = ckdVar;
                ckdVar4 = ckdVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nml(aferVar, aferVar2, z, z2, aferVar3, cgfVar2, z6, affgVar3, cneVar3, cneVar4, ckdVar3, ckdVar4, affgVar2, i, i2, i3);
            }
        }
        i4 |= 12582912;
        affgVar3 = affgVar;
        if ((100663296 & i) == 0) {
            i25 = 33554432;
            if ((i3 & 256) == 0) {
                if ((134217728 & i) == 0) {
                    zE2 = bveVarC.C(cneVar);
                } else {
                    zE2 = bveVarC.E(cneVar);
                }
                if (zE2) {
                    i25 = 67108864;
                }
            }
            i4 |= i25;
        }
        if ((805306368 & i) == 0) {
            i24 = 268435456;
            if ((i3 & 512) == 0) {
                if ((1073741824 & i) == 0) {
                    zE = bveVarC.C(cneVar2);
                } else {
                    zE = bveVarC.E(cneVar2);
                }
                if (zE) {
                    i24 = 536870912;
                }
            }
            i4 |= i24;
        }
        i5 = i3 & 1024;
        if (i5 != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.C(ckdVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i6 = i7 | i2;
        } else {
            i6 = i2;
        }
        i8 = i3 & 2048;
        if (i8 != 0) {
            i10 = i6 | 48;
        } else {
            i9 = i6;
            if ((i2 & 48) == 0) {
                if (true != bveVarC.C(ckdVar2)) {
                    i11 = 16;
                } else {
                    i11 = 32;
                }
                i10 = i9 | i11;
            } else {
                i10 = i9;
            }
        }
        if ((i2 & 384) == 0) {
            i10 |= true == bveVarC.E(affgVar2) ? 256 : 128;
        }
        if ((306783379 & i4) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bveVarC.I(z5, i4 & 1)) {
            i12 = i3 & 512;
            i13 = i3 & 256;
            int i35 = i10 << 6;
            int i36 = i10 << 9;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i27 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                z7 = z8 & z3;
                if (i29 != 0) {
                    affgVar3 = nmf.a;
                }
                if (i13 != 0) {
                    i4 &= -234881025;
                    i14 = 0;
                    cneVarH = defpackage.day.h(2131231565, bveVarC, 0);
                } else {
                    i14 = 0;
                    cneVarH = cneVar;
                }
                defpackage.cgf cgfVar6 = cgfVar3;
                if (i12 != 0) {
                    cneVarH2 = defpackage.day.h(2131231762, bveVarC, i14);
                    i4 = (-1879048193) & i4;
                } else {
                    cneVarH2 = cneVar2;
                }
                if (i5 != 0) {
                    ckdVar5 = null;
                } else {
                    ckdVar5 = ckdVar;
                }
                ckdVar6 = ckdVar5;
                cneVar5 = cneVarH;
                if (i8 != 0) {
                    ckdVar7 = null;
                } else {
                    ckdVar7 = ckdVar2;
                }
                cneVar6 = cneVarH2;
                cgfVar4 = cgfVar6;
            } else {
                if (i27 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar;
                }
                z7 = z8 & z3;
                if (i29 != 0) {
                    affgVar3 = nmf.a;
                }
                if (i13 != 0) {
                    i4 &= -234881025;
                    i14 = 0;
                    cneVarH = defpackage.day.h(2131231565, bveVarC, 0);
                } else {
                    i14 = 0;
                    cneVarH = cneVar;
                }
                defpackage.cgf cgfVar7 = cgfVar3;
                if (i12 != 0) {
                    cneVarH2 = defpackage.day.h(2131231762, bveVarC, i14);
                    i4 = (-1879048193) & i4;
                } else {
                    cneVarH2 = cneVar2;
                }
                if (i5 != 0) {
                    ckdVar5 = null;
                } else {
                    ckdVar5 = ckdVar;
                }
                ckdVar6 = ckdVar5;
                cneVar5 = cneVarH;
                if (i8 != 0) {
                    ckdVar7 = null;
                } else {
                    ckdVar7 = ckdVar2;
                }
                cneVar6 = cneVarH2;
                cgfVar4 = cgfVar7;
            }
            i15 = i36 & 7168;
            i16 = i35 & 7168;
            int i37 = i4 >> 6;
            int i38 = i4 >> 3;
            i17 = (i38 & 14) | 196608;
            bveVarC.l();
            cneVar7 = cneVar6;
            i18 = (i4 & 14) | 196608 | (i38 & 112);
            i19 = (i4 >> 18) & 896;
            i20 = ((i4 >> 12) & 14) | 3456;
            i21 = (i4 >> 21) & 896;
            i22 = i37 & 112;
            i23 = i37 & 57344;
            if (z7) {
                bveVarC.v(838449312);
                defpackage.cgf cgfVarAn2 = defpackage.ca.an(cgfVar4);
                ckdVar8 = ckdVar7;
                defpackage.cty ctyVarA3 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
                int iF3 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh3 = bwcVar.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarAn2);
                aferVar7 = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar7);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA3, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                int i39 = i17 | i22;
                E(aferVar, z, cneVar5, ckdVar6, true, "increment", bveVarC, i18 | 512 | i19 | i15 | i23);
                I(aferVar5, null, "clickTarget", defpackage.dai.as(1743833036, true, new myl(affgVar2, affgVar3, 5), bveVarC), bveVarC, i20, 2);
                bveVar2 = bveVarC;
                E(aferVar4, z4, cneVar7, ckdVar8, true, "decrement", bveVar2, i39 | 512 | i21 | i16 | i23);
                bwcVar.Y(true);
                bwcVar.Y(false);
                ckdVar9 = ckdVar6;
                cneVar8 = cneVar5;
            } else {
                defpackage.ckd ckdVar12 = ckdVar6;
                defpackage.ckd ckdVar13 = ckdVar7;
                defpackage.cne cneVar10 = cneVar5;
                bveVarC.v(839085990);
                defpackage.cgf cgfVarAm2 = defpackage.ca.am(cgfVar4, 2);
                defpackage.cty ctyVarA4 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
                int iF4 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh4 = bwcVar.ah();
                defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarAm2);
                aferVar6 = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar6);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA4, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh4, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN4, defpackage.cwl.c);
                E(aferVar2, z2, cneVar7, ckdVar13, false, "decrement", bveVarC, i17 | i22 | 512 | i21 | i16 | i23);
                cneVar7 = cneVar7;
                ckdVar8 = ckdVar13;
                I(aferVar3, null, "clickTarget", defpackage.dai.as(168398723, true, new myl(affgVar2, affgVar3, 6), bveVarC), bveVarC, i20, 2);
                bveVar2 = bveVarC;
                ckdVar9 = ckdVar12;
                cneVar8 = cneVar10;
                E(aferVar, z, cneVar8, ckdVar9, false, "increment", bveVar2, i18 | 512 | i19 | i15 | i23);
                bwcVar.Y(true);
                bwcVar.Y(false);
            }
            cgfVar2 = cgfVar4;
            cneVar3 = cneVar8;
            ckdVar3 = ckdVar9;
            cneVar4 = cneVar7;
            ckdVar4 = ckdVar8;
            z6 = z7;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
            z6 = z3;
            cneVar3 = cneVar;
            cneVar4 = cneVar2;
            ckdVar3 = ckdVar;
            ckdVar4 = ckdVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nml(aferVar, aferVar2, z, z2, aferVar3, cgfVar2, z6, affgVar3, cneVar3, cneVar4, ckdVar3, ckdVar4, affgVar2, i, i2, i3);
        }
    }

    public static void E(defpackage.afer aferVar, boolean z, defpackage.cne cneVar, defpackage.ckd ckdVar, boolean z2, java.lang.String str, defpackage.bve bveVar, int i) {
        int i2;
        boolean z3;
        defpackage.bve bveVar2;
        defpackage.ktf ktfVarA;
        defpackage.ktl ktlVarG;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-15405346);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= true != bveVarC.D(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(ckdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(str) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2 >> 6;
            defpackage.bcr bcrVar = defpackage.bxi.o(bveVarC).b;
            if (z2) {
                defpackage.ktf ktfVar = nmt.a;
                ktfVarA = defpackage.ktf.a(nmt.a, defpackage.ktf.b.h, 0.0f, null, 0.0f, 510);
            } else {
                defpackage.ktf ktfVar2 = nmt.a;
                ktfVarA = nmt.a;
            }
            defpackage.cgf cgfVarR = defpackage.cgf.e;
            defpackage.cgf cgfVarY = defpackage.dai.y(cgfVarR, str);
            if (z2) {
                cgfVarR = defpackage.awj.r(cgfVarR);
            }
            defpackage.cgf cgfVarA = cgfVarY.a(cgfVarR);
            if (ckdVar == null) {
                bveVarC.v(621416944);
                defpackage.afar afarVar = defpackage.ktl.a;
                bveVar2 = bveVarC;
                ktlVarG = defpackage.kgu.g(0L, 0L, 0L, 0L, bveVar2, 255);
                ((defpackage.bwc) bveVar2).Y(false);
            } else {
                bveVarC.v(621475999);
                defpackage.afar afarVar2 = defpackage.ktl.a;
                long j = ckdVar.a;
                bveVar2 = bveVarC;
                ktlVarG = defpackage.kgu.g(0L, j, 0L, j, bveVar2, 221);
                ((defpackage.bwc) bveVar2).Y(false);
            }
            defpackage.khg.m(cneVar, aferVar, cgfVarA, ktfVarA, z3, bcrVar, ktlVarG, null, null, bveVar2, (i4 & 14) | 8 | ((i2 << 3) & 112) | ((i2 << 9) & 57344), 0, 3744);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mxz(aferVar, z, cneVar, ckdVar, z2, str, i, 4);
        }
    }

    public static /* synthetic */ defpackage.afbk F(defpackage.affg affgVar, defpackage.affg affgVar2, defpackage.bve bveVar, int i) {
        if (bveVar.I((i & 3) != 2, i & 1)) {
            affgVar.invoke(bveVar, 0);
            affgVar2.invoke(bveVar, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0169  */
    /* JADX WARN: Code duplicated, block: B:114:0x016d  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    public static void G(defpackage.cne cneVar, int i, int i2, defpackage.afer aferVar, defpackage.cgf cgfVar, boolean z, boolean z2, defpackage.ktz ktzVar, defpackage.bve bveVar, int i3, int i4) {
        int i5;
        defpackage.cgf cgfVar2;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        defpackage.ktz ktzVar2;
        boolean z5;
        defpackage.bve bveVar2;
        boolean z6;
        defpackage.cgf cgfVar3;
        boolean z7;
        defpackage.ktz ktzVar3;
        defpackage.bxl bxlVarJ;
        int i8;
        int i9;
        defpackage.bwc bwcVar;
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        defpackage.ktz ktzVarL;
        boolean z10;
        java.lang.Object objS;
        int i12;
        int i13;
        cneVar.getClass();
        aferVar.getClass();
        defpackage.bve bveVarC = bveVar.c(1921121113);
        if ((i3 & 6) == 0) {
            i5 = (true != ((i3 & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != bveVarC.A(i2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true != bveVarC.E(aferVar) ? 1024 : 2048;
        }
        int i14 = i4 & 16;
        if (i14 == 0) {
            if ((i3 & 24576) == 0) {
                cgfVar2 = cgfVar;
                i5 |= true != bveVarC.C(cgfVar2) ? 8192 : 16384;
            }
            if ((196608 & i3) == 0) {
                i13 = 65536;
                if ((i4 & 32) == 0) {
                    z3 = z;
                    if (bveVarC.D(z3)) {
                        i13 = 131072;
                    }
                } else {
                    z3 = z;
                }
                i5 |= i13;
            } else {
                z3 = z;
            }
            i6 = i4 & 64;
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i6 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (true != bveVarC.D(z2)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i5 |= i7;
            }
            if ((12582912 & i3) == 0) {
                i12 = 4194304;
                if ((i4 & 128) == 0) {
                    ktzVar2 = ktzVar;
                    if (bveVarC.C(ktzVar2)) {
                        i12 = 8388608;
                    }
                } else {
                    ktzVar2 = ktzVar;
                }
                i5 |= i12;
            } else {
                ktzVar2 = ktzVar;
            }
            if ((i5 & 4793491) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bveVarC.I(z5, i5 & 1)) {
                i8 = i4 & 128;
                i9 = i4 & 32;
                bwcVar = (defpackage.bwc) bveVarC;
                i10 = i5;
                bwcVar.ab(-127, null, 0, null);
                if ((i3 & 1) != 0 || bveVarC.F()) {
                    if (i14 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i9 != 0) {
                        i11 = i10 & (-458753);
                        if (i != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i11 = i10;
                    }
                    z8 = (!z4) | z2;
                    if (i8 != 0) {
                        i11 &= -29360129;
                        z9 = z8;
                        ktzVarL = defpackage.kfn.l(false, bveVarC, 1);
                        z10 = z3;
                    } else {
                        z9 = z8;
                    }
                    defpackage.cgf cgfVar4 = cgfVar2;
                    bveVarC.l();
                    defpackage.ktf ktfVar = nmt.a;
                    defpackage.ktf ktfVar2 = nmt.a;
                    defpackage.bsd bsdVarM = defpackage.kfn.m();
                    objS = bwcVar.S();
                    if ((i11 & 7168) != 2048 || objS == defpackage.bvd.a) {
                        objS = new defpackage.njt(aferVar, 19);
                        bwcVar.ad(objS);
                    }
                    defpackage.ccz cczVarAs = defpackage.dai.as(864439293, true, new nmh(cneVar, i, i2), bveVarC);
                    defpackage.ktf ktfVar3 = defpackage.ktf.a;
                    bveVar2 = bveVarC;
                    defpackage.jxs.f(z10, (defpackage.affc) objS, cgfVar4, ktfVar2, null, z9, bsdVarM, ktzVarL, null, null, true, cczVarAs, bveVar2, ((i11 >> 15) & 14) | ((i11 >> 6) & 896) | (458752 & (i11 >> 3)) | (i11 & 29360128), 432, 1808);
                    z7 = z10;
                    cgfVar3 = cgfVar4;
                    z6 = z9;
                    ktzVar3 = ktzVarL;
                } else {
                    bveVarC.s();
                    i11 = i9 != 0 ? i10 & (-458753) : i10;
                    if (i8 != 0) {
                        i11 &= -29360129;
                    }
                    z9 = z2;
                }
                z10 = z3;
                ktzVarL = ktzVar2;
                defpackage.cgf cgfVar5 = cgfVar2;
                bveVarC.l();
                defpackage.ktf ktfVar4 = nmt.a;
                defpackage.ktf ktfVar5 = nmt.a;
                defpackage.bsd bsdVarM2 = defpackage.kfn.m();
                objS = bwcVar.S();
                if ((i11 & 7168) != 2048) {
                    objS = new defpackage.njt(aferVar, 19);
                    bwcVar.ad(objS);
                } else {
                    objS = new defpackage.njt(aferVar, 19);
                    bwcVar.ad(objS);
                }
                defpackage.ccz cczVarAs2 = defpackage.dai.as(864439293, true, new nmh(cneVar, i, i2), bveVarC);
                defpackage.ktf ktfVar6 = defpackage.ktf.a;
                bveVar2 = bveVarC;
                defpackage.jxs.f(z10, (defpackage.affc) objS, cgfVar5, ktfVar5, null, z9, bsdVarM2, ktzVarL, null, null, true, cczVarAs2, bveVar2, ((i11 >> 15) & 14) | ((i11 >> 6) & 896) | (458752 & (i11 >> 3)) | (i11 & 29360128), 432, 1808);
                z7 = z10;
                cgfVar3 = cgfVar5;
                z6 = z9;
                ktzVar3 = ktzVarL;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                z6 = z2;
                cgfVar3 = cgfVar2;
                z7 = z3;
                ktzVar3 = ktzVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nmi(cneVar, i, i2, aferVar, cgfVar3, z7, z6, ktzVar3, i3, i4);
            }
        }
        i5 |= 24576;
        cgfVar2 = cgfVar;
        if ((196608 & i3) == 0) {
            i13 = 65536;
            if ((i4 & 32) == 0) {
                z3 = z;
                if (bveVarC.D(z3)) {
                    i13 = 131072;
                }
            } else {
                z3 = z;
            }
            i5 |= i13;
        } else {
            z3 = z;
        }
        i6 = i4 & 64;
        if (i6 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i6 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (true != bveVarC.D(z2)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i5 |= i7;
        }
        if ((12582912 & i3) == 0) {
            i12 = 4194304;
            if ((i4 & 128) == 0) {
                ktzVar2 = ktzVar;
                if (bveVarC.C(ktzVar2)) {
                    i12 = 8388608;
                }
            } else {
                ktzVar2 = ktzVar;
            }
            i5 |= i12;
        } else {
            ktzVar2 = ktzVar;
        }
        if ((i5 & 4793491) != 4793490) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bveVarC.I(z5, i5 & 1)) {
            i8 = i4 & 128;
            i9 = i4 & 32;
            bwcVar = (defpackage.bwc) bveVarC;
            i10 = i5;
            bwcVar.ab(-127, null, 0, null);
            if ((i3 & 1) != 0) {
                if (i14 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i9 != 0) {
                    i11 = i10 & (-458753);
                    if (i != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    i11 = i10;
                }
                z8 = (!z4) | z2;
                if (i8 != 0) {
                    i11 &= -29360129;
                    z9 = z8;
                    ktzVarL = defpackage.kfn.l(false, bveVarC, 1);
                    z10 = z3;
                } else {
                    z9 = z8;
                    z10 = z3;
                    ktzVarL = ktzVar2;
                }
            } else {
                if (i14 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i9 != 0) {
                    i11 = i10 & (-458753);
                    if (i != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    i11 = i10;
                }
                z8 = (!z4) | z2;
                if (i8 != 0) {
                    i11 &= -29360129;
                    z9 = z8;
                    ktzVarL = defpackage.kfn.l(false, bveVarC, 1);
                    z10 = z3;
                } else {
                    z9 = z8;
                    z10 = z3;
                    ktzVarL = ktzVar2;
                }
            }
            defpackage.cgf cgfVar6 = cgfVar2;
            bveVarC.l();
            defpackage.ktf ktfVar7 = nmt.a;
            defpackage.ktf ktfVar8 = nmt.a;
            defpackage.bsd bsdVarM3 = defpackage.kfn.m();
            objS = bwcVar.S();
            if ((i11 & 7168) != 2048) {
                objS = new defpackage.njt(aferVar, 19);
                bwcVar.ad(objS);
            } else {
                objS = new defpackage.njt(aferVar, 19);
                bwcVar.ad(objS);
            }
            defpackage.ccz cczVarAs3 = defpackage.dai.as(864439293, true, new nmh(cneVar, i, i2), bveVarC);
            defpackage.ktf ktfVar9 = defpackage.ktf.a;
            bveVar2 = bveVarC;
            defpackage.jxs.f(z10, (defpackage.affc) objS, cgfVar6, ktfVar8, null, z9, bsdVarM3, ktzVarL, null, null, true, cczVarAs3, bveVar2, ((i11 >> 15) & 14) | ((i11 >> 6) & 896) | (458752 & (i11 >> 3)) | (i11 & 29360128), 432, 1808);
            z7 = z10;
            cgfVar3 = cgfVar6;
            z6 = z9;
            ktzVar3 = ktzVarL;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z6 = z2;
            cgfVar3 = cgfVar2;
            z7 = z3;
            ktzVar3 = ktzVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nmi(cneVar, i, i2, aferVar, cgfVar3, z7, z6, ktzVar3, i3, i4);
        }
    }

    public static void H(int i, int i2, defpackage.cgf cgfVar, long j, float f, float f2, float f3, defpackage.bve bveVar, int i3) {
        defpackage.cgf cgfVar2;
        long j2;
        float f4;
        float f5;
        float f6;
        defpackage.cgf cgfVar3;
        long j3;
        float f7;
        float f8;
        float f9;
        int i4 = i3 & 6;
        defpackage.bve bveVarC = bveVar.c(1897666570);
        int i5 = i4 == 0 ? (true != bveVarC.A(i) ? 2 : 4) | i3 : i3;
        if ((i3 & 48) == 0) {
            i5 |= true != bveVarC.A(i2) ? 16 : 32;
        }
        int i6 = i5 | 384;
        if ((i3 & 3072) == 0) {
            i6 = i5 | 1408;
        }
        int i7 = 1794048 | i6;
        if (bveVarC.I((599187 & i7) != 599186, i7 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i3 & 1) == 0 || bveVarC.F()) {
                cgfVar3 = defpackage.cgf.e;
                j3 = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
                f7 = 4.0f;
                f8 = 6.0f;
                f9 = 0.4f;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar;
                j3 = j;
                f8 = f;
                f7 = f2;
                f9 = f3;
            }
            bveVarC.l();
            long jH = defpackage.ckd.h(j3, defpackage.ckd.a(j3) * f9);
            defpackage.cgf cgfVarD = defpackage.awj.d(cgfVar3, 16.0f);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.g(f7), defpackage.cfs.n, bveVarC, 48);
            defpackage.cgf cgfVar4 = cgfVar3;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarD);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bveVarC.v(318417641);
            for (int i8 = 0; i8 < i2; i8++) {
                defpackage.cgf cgfVarI = defpackage.awj.i(defpackage.cgf.e, f8);
                boolean zA = bveVarC.A(i8) | ((i7 & 14) == 4) | bveVarC.B(j3) | bveVarC.B(jH);
                java.lang.Object objS = bwcVar.S();
                if (zA || objS == defpackage.bvd.a) {
                    objS = new nmj(i8, i, j3, jH);
                    bwcVar.ad(objS);
                }
                defpackage.afw.z(cgfVarI, (defpackage.affc) objS, bveVarC, 0);
            }
            bwcVar.Y(false);
            bwcVar.Y(true);
            j2 = j3;
            f5 = f7;
            f4 = f8;
            f6 = f9;
            cgfVar2 = cgfVar4;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            j2 = j;
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nmk(i, i2, cgfVar2, j2, f4, f5, f6, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static void I(defpackage.afer aferVar, defpackage.cgf cgfVar, java.lang.String str, defpackage.affg affgVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        java.lang.String str2;
        int i5;
        boolean z;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        java.lang.String str3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        java.lang.String str4;
        defpackage.cft cftVar;
        defpackage.atc atcVar;
        defpackage.cgf cgfVarL;
        defpackage.cgf cgfVar5;
        java.lang.String str5;
        defpackage.atc atcVar2;
        defpackage.cft cftVar2;
        defpackage.bwc bwcVar;
        defpackage.afer aferVar2;
        int i6;
        affgVar.getClass();
        int i7 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-565139390);
        if (i7 == 0) {
            i3 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str2 = str;
                    if (true != bveVarC.C(str2)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (true != bveVarC.E(affgVar)) {
                        i6 = 1024;
                    } else {
                        i6 = 2048;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    if (i8 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    cftVar = defpackage.cfs.k;
                    atcVar = defpackage.ati.e;
                    bveVarC.v(-1933057213);
                    defpackage.ktf ktfVar = nmt.a;
                    float f = nmt.a.h;
                    cgfVarL = defpackage.awj.l(cgfVar4, f, f, Float.NaN, Float.NaN);
                    if (str4 != null) {
                        cgfVarL = defpackage.dai.y(cgfVarL, str4);
                    }
                    if (aferVar != null) {
                        defpackage.bcr bcrVar = defpackage.bxi.o(bveVarC).b;
                        str5 = str4;
                        atcVar2 = atcVar;
                        cgfVar5 = cgfVar4;
                        cftVar2 = cftVar;
                        bveVar2 = bveVarC;
                        cgfVarL = defpackage.afw.x(defpackage.kvi.a(cgfVarL, bcrVar, 0L, 0L, null, null, null, true, true, bveVarC, 113246208, 62), true, null, null, aferVar);
                    } else {
                        cgfVar5 = cgfVar4;
                        str5 = str4;
                        atcVar2 = atcVar;
                        bveVar2 = bveVarC;
                        cftVar2 = cftVar;
                    }
                    bwcVar = (defpackage.bwc) bveVar2;
                    bwcVar.Y(false);
                    defpackage.cty ctyVarA = defpackage.atu.a(atcVar2, cftVar2, bveVar2, 54);
                    int iF = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh = bwcVar.ah();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarL);
                    aferVar2 = defpackage.cwl.a;
                    bveVar2.w();
                    if (bwcVar.t) {
                        bveVar2.j(aferVar2);
                    } else {
                        bveVar2.y();
                    }
                    defpackage.byw.c(bveVar2, ctyVarA, defpackage.cwl.e);
                    defpackage.byw.c(bveVar2, cddVarAh, defpackage.cwl.d);
                    defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVar2, defpackage.cwl.g);
                    defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                    affgVar.invoke(bveVar2, java.lang.Integer.valueOf((i3 >> 9) & 14));
                    bwcVar.Y(true);
                    cgfVar3 = cgfVar5;
                    str3 = str5;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar3 = cgfVar2;
                    str3 = str2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new dnd(aferVar, cgfVar3, str3, affgVar, i, i2, 10, (byte[]) null);
                }
            }
            i3 |= 384;
            str2 = str;
            if ((i & 3072) == 0) {
                if (true != bveVarC.E(affgVar)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i8 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                cftVar = defpackage.cfs.k;
                atcVar = defpackage.ati.e;
                bveVarC.v(-1933057213);
                defpackage.ktf ktfVar2 = nmt.a;
                float f2 = nmt.a.h;
                cgfVarL = defpackage.awj.l(cgfVar4, f2, f2, Float.NaN, Float.NaN);
                if (str4 != null) {
                    cgfVarL = defpackage.dai.y(cgfVarL, str4);
                }
                if (aferVar != null) {
                    defpackage.bcr bcrVar2 = defpackage.bxi.o(bveVarC).b;
                    str5 = str4;
                    atcVar2 = atcVar;
                    cgfVar5 = cgfVar4;
                    cftVar2 = cftVar;
                    bveVar2 = bveVarC;
                    cgfVarL = defpackage.afw.x(defpackage.kvi.a(cgfVarL, bcrVar2, 0L, 0L, null, null, null, true, true, bveVarC, 113246208, 62), true, null, null, aferVar);
                } else {
                    cgfVar5 = cgfVar4;
                    str5 = str4;
                    atcVar2 = atcVar;
                    bveVar2 = bveVarC;
                    cftVar2 = cftVar;
                }
                bwcVar = (defpackage.bwc) bveVar2;
                bwcVar.Y(false);
                defpackage.cty ctyVarA2 = defpackage.atu.a(atcVar2, cftVar2, bveVar2, 54);
                int iF2 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh2 = bwcVar.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar2, cgfVarL);
                aferVar2 = defpackage.cwl.a;
                bveVar2.w();
                if (bwcVar.t) {
                    bveVar2.j(aferVar2);
                } else {
                    bveVar2.y();
                }
                defpackage.byw.c(bveVar2, ctyVarA2, defpackage.cwl.e);
                defpackage.byw.c(bveVar2, cddVarAh2, defpackage.cwl.d);
                defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                defpackage.byw.b(bveVar2, defpackage.cwl.g);
                defpackage.byw.c(bveVar2, cgfVarN2, defpackage.cwl.c);
                affgVar.invoke(bveVar2, java.lang.Integer.valueOf((i3 >> 9) & 14));
                bwcVar.Y(true);
                cgfVar3 = cgfVar5;
                str3 = str5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                str3 = str2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new dnd(aferVar, cgfVar3, str3, affgVar, i, i2, 10, (byte[]) null);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                str2 = str;
                if (true != bveVarC.C(str2)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (true != bveVarC.E(affgVar)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i8 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                cftVar = defpackage.cfs.k;
                atcVar = defpackage.ati.e;
                bveVarC.v(-1933057213);
                defpackage.ktf ktfVar3 = nmt.a;
                float f3 = nmt.a.h;
                cgfVarL = defpackage.awj.l(cgfVar4, f3, f3, Float.NaN, Float.NaN);
                if (str4 != null) {
                    cgfVarL = defpackage.dai.y(cgfVarL, str4);
                }
                if (aferVar != null) {
                    defpackage.bcr bcrVar3 = defpackage.bxi.o(bveVarC).b;
                    str5 = str4;
                    atcVar2 = atcVar;
                    cgfVar5 = cgfVar4;
                    cftVar2 = cftVar;
                    bveVar2 = bveVarC;
                    cgfVarL = defpackage.afw.x(defpackage.kvi.a(cgfVarL, bcrVar3, 0L, 0L, null, null, null, true, true, bveVarC, 113246208, 62), true, null, null, aferVar);
                } else {
                    cgfVar5 = cgfVar4;
                    str5 = str4;
                    atcVar2 = atcVar;
                    bveVar2 = bveVarC;
                    cftVar2 = cftVar;
                }
                bwcVar = (defpackage.bwc) bveVar2;
                bwcVar.Y(false);
                defpackage.cty ctyVarA3 = defpackage.atu.a(atcVar2, cftVar2, bveVar2, 54);
                int iF3 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh3 = bwcVar.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVar2, cgfVarL);
                aferVar2 = defpackage.cwl.a;
                bveVar2.w();
                if (bwcVar.t) {
                    bveVar2.j(aferVar2);
                } else {
                    bveVar2.y();
                }
                defpackage.byw.c(bveVar2, ctyVarA3, defpackage.cwl.e);
                defpackage.byw.c(bveVar2, cddVarAh3, defpackage.cwl.d);
                defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                defpackage.byw.b(bveVar2, defpackage.cwl.g);
                defpackage.byw.c(bveVar2, cgfVarN3, defpackage.cwl.c);
                affgVar.invoke(bveVar2, java.lang.Integer.valueOf((i3 >> 9) & 14));
                bwcVar.Y(true);
                cgfVar3 = cgfVar5;
                str3 = str5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                str3 = str2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new dnd(aferVar, cgfVar3, str3, affgVar, i, i2, 10, (byte[]) null);
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i & 3072) == 0) {
            if (true != bveVarC.E(affgVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i3 |= i6;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            if (i8 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            cftVar = defpackage.cfs.k;
            atcVar = defpackage.ati.e;
            bveVarC.v(-1933057213);
            defpackage.ktf ktfVar4 = nmt.a;
            float f4 = nmt.a.h;
            cgfVarL = defpackage.awj.l(cgfVar4, f4, f4, Float.NaN, Float.NaN);
            if (str4 != null) {
                cgfVarL = defpackage.dai.y(cgfVarL, str4);
            }
            if (aferVar != null) {
                defpackage.bcr bcrVar4 = defpackage.bxi.o(bveVarC).b;
                str5 = str4;
                atcVar2 = atcVar;
                cgfVar5 = cgfVar4;
                cftVar2 = cftVar;
                bveVar2 = bveVarC;
                cgfVarL = defpackage.afw.x(defpackage.kvi.a(cgfVarL, bcrVar4, 0L, 0L, null, null, null, true, true, bveVarC, 113246208, 62), true, null, null, aferVar);
            } else {
                cgfVar5 = cgfVar4;
                str5 = str4;
                atcVar2 = atcVar;
                bveVar2 = bveVarC;
                cftVar2 = cftVar;
            }
            bwcVar = (defpackage.bwc) bveVar2;
            bwcVar.Y(false);
            defpackage.cty ctyVarA4 = defpackage.atu.a(atcVar2, cftVar2, bveVar2, 54);
            int iF4 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh4 = bwcVar.ah();
            defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVar2, cgfVarL);
            aferVar2 = defpackage.cwl.a;
            bveVar2.w();
            if (bwcVar.t) {
                bveVar2.j(aferVar2);
            } else {
                bveVar2.y();
            }
            defpackage.byw.c(bveVar2, ctyVarA4, defpackage.cwl.e);
            defpackage.byw.c(bveVar2, cddVarAh4, defpackage.cwl.d);
            defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF4), defpackage.cwl.f);
            defpackage.byw.b(bveVar2, defpackage.cwl.g);
            defpackage.byw.c(bveVar2, cgfVarN4, defpackage.cwl.c);
            affgVar.invoke(bveVar2, java.lang.Integer.valueOf((i3 >> 9) & 14));
            bwcVar.Y(true);
            cgfVar3 = cgfVar5;
            str3 = str5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar3 = cgfVar2;
            str3 = str2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new dnd(aferVar, cgfVar3, str3, affgVar, i, i2, 10, (byte[]) null);
        }
    }

    public static defpackage.lxy e() {
        return (defpackage.lxy) defpackage.mkp.a.b(defpackage.lxy.class, new defpackage.lqb(15));
    }

    public static void f(defpackage.zbe zbeVar, defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar);
        if (componentName != null) {
            rrvVarH.p(componentName);
            rrvVarH.g(componentName.getPackageName());
        }
        defpackage.oio.a().b((defpackage.rrw) rrvVarH.l());
    }

    public static void g(defpackage.zbe zbeVar, defpackage.zbd zbdVar, android.content.ComponentName componentName, long j) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar);
        if (componentName != null) {
            rrvVarH.p(componentName);
            rrvVarH.g(componentName.getPackageName());
        }
        if (j > 0) {
            rrvVarH.u(j);
        }
        defpackage.omf.u().F(rrvVarH.l());
    }

    public static void h(defpackage.zbe zbeVar, defpackage.zbd zbdVar, java.lang.String str) {
        f(zbeVar, zbdVar, str != null ? new android.content.ComponentName(str, "") : null);
    }

    public static void i(defpackage.zbe zbeVar, defpackage.zbd zbdVar, java.lang.String str, long j) {
        g(zbeVar, zbdVar, str != null ? new android.content.ComponentName(str, "") : null, j);
    }

    public static void j(defpackage.zbe zbeVar, defpackage.zbd zbdVar, defpackage.zaa zaaVar, java.lang.String str) {
        i(zbeVar, zbdVar, str, 0L);
        defpackage.omf.u().C(zaaVar, str);
    }

    public static defpackage.mbb l() {
        return (defpackage.mbb) defpackage.mkp.a.i(defpackage.mbb.class);
    }

    public static defpackage.mny m() {
        return (defpackage.mny) defpackage.mkp.a.i(defpackage.mny.class);
    }

    public static defpackage.mnx n() {
        return (defpackage.mnx) defpackage.mkp.a.i(defpackage.mnx.class);
    }

    public static defpackage.mnw o() {
        return (defpackage.mnw) defpackage.mkp.a.i(defpackage.mnw.class);
    }

    public static defpackage.mnu p() {
        return (defpackage.mnu) defpackage.mkp.a.i(defpackage.mnu.class);
    }

    public static boolean q(android.content.ComponentName componentName, defpackage.nod nodVar) {
        componentName.getClass();
        return (nodVar == null || defpackage.afga.f(nodVar, defpackage.nod.a) || j$.util.Objects.equals(nodVar.r, componentName)) ? false : true;
    }

    public static boolean r(defpackage.nod nodVar) {
        java.lang.CharSequence charSequence = nodVar.l;
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        java.lang.CharSequence charSequence2 = nodVar.m;
        return charSequence2 == null || charSequence2.length() == 0;
    }

    public static boolean s(defpackage.nod nodVar) {
        if (nodVar != null) {
            return nodVar.b.a == null && nodVar.o == null && nodVar.p == null && nodVar.q == null && r(nodVar);
        }
        return true;
    }

    public static defpackage.noc t(defpackage.nxj nxjVar) {
        int i = nxjVar.d;
        if (i != 0) {
            return new defpackage.noc(nxjVar.b, i, new defpackage.niw(nxjVar, 13));
        }
        throw null;
    }

    public static /* synthetic */ defpackage.acf u(defpackage.abo aboVar) {
        aboVar.getClass();
        return new defpackage.acf(defpackage.acs.a(defpackage.ca.F(150, 0, null, 6), 0.75f).a(defpackage.acs.q(defpackage.ca.F(150, 0, null, 6), 0.85f, 0L, 4)), defpackage.acs.f(defpackage.ca.F(150, 0, null, 6), 0.75f).a(defpackage.acs.r(defpackage.ca.F(150, 0, null, 6), 0.85f, 0L, 4)), 0.0f, 12);
    }

    public static /* synthetic */ defpackage.afbk v(defpackage.bwx bwxVar, defpackage.cja cjaVar) {
        cjaVar.getClass();
        if (cjaVar.b()) {
            bwxVar.b(defpackage.nnk.b);
        }
        return defpackage.afbk.a;
    }

    public static void w(java.lang.String str, boolean z, boolean z2, defpackage.ktz ktzVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1405555901);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(ktzVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.lwz.i(str, null, null, null, defpackage.dai.as(-12027117, true, new nmp(ktzVar, z2, z, 0), bveVarC), bveVarC, (i2 & 14) | 24576, 14);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bqz(str, z, z2, ktzVar, i, 4);
        }
    }

    public static void x(defpackage.affh affhVar, defpackage.affh affhVar2, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1518294106);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(affhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affhVar2) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.atc atcVar = defpackage.ati.e;
            defpackage.cft cftVar = defpackage.cfs.k;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cty ctyVarA = defpackage.atu.a(atcVar, cftVar, bveVarC, 54);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgcVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.atx atxVar = defpackage.atx.a;
            affhVar.invoke(atxVar, bveVarC, java.lang.Integer.valueOf(((i2 << 3) & 112) | 6));
            affhVar2.invoke(atxVar, bveVarC, java.lang.Integer.valueOf((i2 & 112) | 6));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nau(affhVar, affhVar2, i, 19, null);
        }
    }

    public static void y(defpackage.cne cneVar, float f, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        affhVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1652372735);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if ((i2 & 2) == 0 && bveVarC.z(f)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(affhVar) ? 128 : 256;
        }
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            int i6 = i2 & 2;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
                if (i6 != 0) {
                    i3 &= -113;
                }
            } else if (i6 != 0) {
                i3 &= -113;
                defpackage.ktf ktfVar = nmt.a;
                f = 32.0f;
            }
            bveVarC.l();
            x(defpackage.dai.as(-391747018, true, new defpackage.hcz(f, cneVar, 3), bveVarC), affhVar, bveVarC, ((i3 >> 3) & 112) | 6);
        } else {
            bveVarC.s();
        }
        float f2 = f;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hcx(cneVar, f2, affhVar, i, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x0136  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00b3, please report this as an issue */
    public static void z(java.lang.String str, java.lang.String str2, boolean z, defpackage.affc affcVar, defpackage.cgf cgfVar, boolean z2, defpackage.ktz ktzVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        java.lang.String str3;
        defpackage.affc affcVar2;
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z3;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        defpackage.ktz ktzVar2;
        java.lang.String str4;
        defpackage.bxl bxlVarJ;
        defpackage.ktz ktzVarH;
        java.lang.String str5;
        int i6;
        int i7;
        int i8;
        str.getClass();
        affcVar.getClass();
        int i9 = i & 6;
        defpackage.bve bveVarC = bveVar.c(6965925);
        if (i9 == 0) {
            i3 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                str3 = str2;
                i3 |= true != bveVarC.C(str3) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                if (true != bveVarC.D(z)) {
                    i8 = 128;
                } else {
                    i8 = 256;
                }
                i3 |= i8;
            }
            if ((i & 3072) == 0) {
                affcVar2 = affcVar;
                if (true != bveVarC.E(affcVar2)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            } else {
                affcVar2 = affcVar;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    cgfVar2 = cgfVar;
                    if (true != bveVarC.C(cgfVar2)) {
                        i5 = 8192;
                    } else {
                        i5 = 16384;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if (true != bveVarC.D(z2)) {
                        i6 = 65536;
                    } else {
                        i6 = 131072;
                    }
                    i3 |= i6;
                }
                if ((1572864 & i) == 0) {
                    i3 |= 524288;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bveVarC.I(z3, i3 & 1)) {
                    int i11 = i3 & (-3670017);
                    ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        java.lang.String str6 = i10 == 0 ? str3 : null;
                        if (i4 != 0) {
                            cgfVar2 = defpackage.cgf.e;
                        }
                        defpackage.afar afarVar = defpackage.ktz.a;
                        ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                        str5 = str6;
                    } else {
                        bveVarC.s();
                        ktzVarH = ktzVar;
                        str5 = str3;
                    }
                    bveVarC.l();
                    str3 = str5;
                    int i12 = (i11 >> 6) & 1022;
                    bveVar2 = bveVarC;
                    defpackage.cgf cgfVar4 = cgfVar2;
                    defpackage.ktz ktzVar3 = ktzVarH;
                    defpackage.jxs.f(z, affcVar2, cgfVar4, null, null, z2, defpackage.kfn.m(), ktzVar3, null, null, true, defpackage.dai.as(-841329335, true, new nmm(str, str5, z, z2, ktzVarH, 0), bveVarC), bveVar2, i12 | (i3 & 458752), 432, 1816);
                    cgfVar3 = cgfVar4;
                    ktzVar2 = ktzVar3;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar3 = cgfVar2;
                    ktzVar2 = ktzVar;
                }
                str4 = str3;
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new mcp(str, str4, z, affcVar, cgfVar3, z2, ktzVar2, i, i2, 3);
                }
            }
            i3 |= 24576;
            cgfVar2 = cgfVar;
            if ((196608 & i) == 0) {
                if (true != bveVarC.D(z2)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                int i13 = i3 & (-3670017);
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i10 == 0) {
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    defpackage.afar afarVar2 = defpackage.ktz.a;
                    ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    str5 = str6;
                } else {
                    if (i10 == 0) {
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    defpackage.afar afarVar3 = defpackage.ktz.a;
                    ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    str5 = str6;
                }
                bveVarC.l();
                str3 = str5;
                int i14 = (i13 >> 6) & 1022;
                bveVar2 = bveVarC;
                defpackage.cgf cgfVar5 = cgfVar2;
                defpackage.ktz ktzVar4 = ktzVarH;
                defpackage.jxs.f(z, affcVar2, cgfVar5, null, null, z2, defpackage.kfn.m(), ktzVar4, null, null, true, defpackage.dai.as(-841329335, true, new nmm(str, str5, z, z2, ktzVarH, 0), bveVarC), bveVar2, i14 | (i3 & 458752), 432, 1816);
                cgfVar3 = cgfVar5;
                ktzVar2 = ktzVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                ktzVar2 = ktzVar;
            }
            str4 = str3;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcp(str, str4, z, affcVar, cgfVar3, z2, ktzVar2, i, i2, 3);
            }
        }
        i3 |= 48;
        str3 = str2;
        if ((i & 384) == 0) {
            if (true != bveVarC.D(z)) {
                i8 = 128;
            } else {
                i8 = 256;
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            affcVar2 = affcVar;
            if (true != bveVarC.E(affcVar2)) {
                i7 = 1024;
            } else {
                i7 = 2048;
            }
            i3 |= i7;
        } else {
            affcVar2 = affcVar;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                cgfVar2 = cgfVar;
                if (true != bveVarC.C(cgfVar2)) {
                    i5 = 8192;
                } else {
                    i5 = 16384;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if (true != bveVarC.D(z2)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                int i15 = i3 & (-3670017);
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i10 == 0) {
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    defpackage.afar afarVar4 = defpackage.ktz.a;
                    ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    str5 = str6;
                } else {
                    if (i10 == 0) {
                    }
                    if (i4 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    defpackage.afar afarVar5 = defpackage.ktz.a;
                    ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                    str5 = str6;
                }
                bveVarC.l();
                str3 = str5;
                int i16 = (i15 >> 6) & 1022;
                bveVar2 = bveVarC;
                defpackage.cgf cgfVar6 = cgfVar2;
                defpackage.ktz ktzVar5 = ktzVarH;
                defpackage.jxs.f(z, affcVar2, cgfVar6, null, null, z2, defpackage.kfn.m(), ktzVar5, null, null, true, defpackage.dai.as(-841329335, true, new nmm(str, str5, z, z2, ktzVarH, 0), bveVarC), bveVar2, i16 | (i3 & 458752), 432, 1816);
                cgfVar3 = cgfVar6;
                ktzVar2 = ktzVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                ktzVar2 = ktzVar;
            }
            str4 = str3;
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mcp(str, str4, z, affcVar, cgfVar3, z2, ktzVar2, i, i2, 3);
            }
        }
        i3 |= 24576;
        cgfVar2 = cgfVar;
        if ((196608 & i) == 0) {
            if (true != bveVarC.D(z2)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i3 & 1)) {
            int i17 = i3 & (-3670017);
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i10 == 0) {
                }
                if (i4 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                defpackage.afar afarVar6 = defpackage.ktz.a;
                ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                str5 = str6;
            } else {
                if (i10 == 0) {
                }
                if (i4 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                defpackage.afar afarVar7 = defpackage.ktz.a;
                ktzVarH = defpackage.jxh.h(0L, bveVarC, 32767);
                str5 = str6;
            }
            bveVarC.l();
            str3 = str5;
            int i18 = (i17 >> 6) & 1022;
            bveVar2 = bveVarC;
            defpackage.cgf cgfVar7 = cgfVar2;
            defpackage.ktz ktzVar6 = ktzVarH;
            defpackage.jxs.f(z, affcVar2, cgfVar7, null, null, z2, defpackage.kfn.m(), ktzVar6, null, null, true, defpackage.dai.as(-841329335, true, new nmm(str, str5, z, z2, ktzVarH, 0), bveVarC), bveVar2, i18 | (i3 & 458752), 432, 1816);
            cgfVar3 = cgfVar7;
            ktzVar2 = ktzVar6;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar3 = cgfVar2;
            ktzVar2 = ktzVar;
        }
        str4 = str3;
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mcp(str, str4, z, affcVar, cgfVar3, z2, ktzVar2, i, i2, 3);
        }
    }

    public void a() {
        throw null;
    }

    public void b(android.service.notification.StatusBarNotification statusBarNotification) {
        throw null;
    }

    public lxy(char[] cArr) {
    }

    public void k(android.service.notification.StatusBarNotification statusBarNotification) {
    }
}
