package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vx {
    /* JADX WARN: Code duplicated, block: B:102:0x0175  */
    /* JADX WARN: Code duplicated, block: B:105:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public static final void a(final defpackage.afer aferVar, final defpackage.affg affgVar, defpackage.cgf cgfVar, defpackage.affg affgVar2, final defpackage.affg affgVar3, final defpackage.affg affgVar4, final defpackage.affg affgVar5, defpackage.cld cldVar, long j, long j2, long j3, long j4, defpackage.dns dnsVar, defpackage.bve bveVar, final int i, final int i2, final int i3) {
        defpackage.afer aferVar2;
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        defpackage.affg affgVar6;
        int i6;
        defpackage.affg affgVar7;
        int i7;
        int i8;
        boolean z;
        defpackage.bve bveVar2;
        final long j5;
        final long j6;
        final long j7;
        final defpackage.dns dnsVar2;
        final defpackage.cgf cgfVar3;
        final defpackage.affg affgVar8;
        final defpackage.cld cldVar2;
        final long j8;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        long jF;
        long jF2;
        long jF3;
        defpackage.dns dnsVar3;
        long j9;
        defpackage.affg affgVar9;
        defpackage.cld cldVar3;
        int i9;
        int i10;
        int i11;
        int i12 = i & 6;
        defpackage.bve bveVarC = bveVar.c(94478519);
        if (i12 == 0) {
            aferVar2 = aferVar;
            i4 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            aferVar2 = aferVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    affgVar6 = affgVar2;
                    if (true != bveVarC.E(affgVar6)) {
                        i6 = 1024;
                    } else {
                        i6 = 2048;
                    }
                    i4 |= i6;
                }
                if ((i & 24576) != 0) {
                    if (true != bveVarC.E(affgVar3)) {
                        i11 = 8192;
                    } else {
                        i11 = 16384;
                    }
                    i4 |= i11;
                }
                if ((196608 & i) != 0) {
                    if (true != bveVarC.E(affgVar4)) {
                        i10 = 65536;
                    } else {
                        i10 = 131072;
                    }
                    i4 |= i10;
                }
                if ((1572864 & i) == 0) {
                    affgVar7 = affgVar5;
                    if (true != bveVarC.E(affgVar7)) {
                        i9 = 524288;
                    } else {
                        i9 = 1048576;
                    }
                    i4 |= i9;
                } else {
                    affgVar7 = affgVar5;
                }
                if ((12582912 & i) == 0) {
                    i4 |= 4194304;
                }
                if ((100663296 & i) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i) == 0) {
                    i4 |= 268435456;
                }
                if ((i2 & 6) == 0) {
                    i7 = i2 | 2;
                } else {
                    i7 = i2;
                }
                if ((i2 & 48) == 0) {
                    i7 |= 16;
                }
                i8 = i7 | 3456;
                if ((306783379 & i4) == 306783378 || (i8 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i4 & 1)) {
                    ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i13 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i5 != 0) {
                            affgVar6 = null;
                        }
                        defpackage.cld cldVarB = defpackage.bqa.b(2, bveVarC);
                        long jF4 = defpackage.bnl.f(38, bveVarC);
                        jF = defpackage.bnl.f(31, bveVarC);
                        jF2 = defpackage.bnl.f(18, bveVarC);
                        jF3 = defpackage.bnl.f(19, bveVarC);
                        dnsVar3 = new defpackage.dns(null);
                        j9 = jF4;
                        affgVar9 = affgVar6;
                        cldVar3 = cldVarB;
                    } else {
                        bveVarC.s();
                        j9 = j;
                        jF = j2;
                        jF2 = j3;
                        jF3 = j4;
                        dnsVar3 = dnsVar;
                        cgfVar4 = cgfVar2;
                        affgVar9 = affgVar6;
                        cldVar3 = cldVar;
                    }
                    bveVarC.l();
                    long j10 = jF3;
                    defpackage.dns dnsVar4 = dnsVar3;
                    defpackage.affg affgVar10 = affgVar7;
                    long j11 = jF;
                    long j12 = jF2;
                    bveVar2 = bveVarC;
                    defpackage.cgf cgfVar5 = cgfVar4;
                    defpackage.bmj.d(aferVar2, affgVar, cgfVar5, affgVar9, affgVar3, affgVar4, affgVar10, cldVar3, j9, j11, j12, j10, dnsVar4, bveVar2, i4 & 4194302, i8 & 8064);
                    cgfVar3 = cgfVar5;
                    affgVar8 = affgVar9;
                    cldVar2 = cldVar3;
                    j8 = j9;
                    j5 = j11;
                    j6 = j12;
                    j7 = j10;
                    dnsVar2 = dnsVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    j5 = j2;
                    j6 = j3;
                    j7 = j4;
                    dnsVar2 = dnsVar;
                    cgfVar3 = cgfVar2;
                    affgVar8 = affgVar6;
                    cldVar2 = cldVar;
                    j8 = j;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: bmk
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            ((java.lang.Integer) obj2).intValue();
                            defpackage.afer aferVar3 = aferVar;
                            defpackage.affg affgVar11 = affgVar;
                            defpackage.cgf cgfVar6 = cgfVar3;
                            defpackage.affg affgVar12 = affgVar8;
                            defpackage.affg affgVar13 = affgVar3;
                            defpackage.affg affgVar14 = affgVar4;
                            defpackage.affg affgVar15 = affgVar5;
                            defpackage.cld cldVar4 = cldVar2;
                            long j13 = j8;
                            int i14 = i;
                            long j14 = j5;
                            int i15 = i2;
                            int i16 = i14 | 1;
                            int i17 = i15 & 306783378;
                            int i18 = i16 & 306783378;
                            int i19 = i18 + i18;
                            long j15 = j7;
                            int i20 = i15 & 613566756;
                            int i21 = i16 & 613566756;
                            defpackage.dns dnsVar5 = dnsVar2;
                            defpackage.vx.a(aferVar3, affgVar11, cgfVar6, affgVar12, affgVar13, affgVar14, affgVar15, cldVar4, j13, j14, j6, j15, dnsVar5, (defpackage.bve) obj, (i16 & (-920350135)) | i18 | (i21 >> 1) | (i19 & i21), (i15 & (-920350135)) | i17 | (i20 >> 1) | ((i17 + i17) & i20), i3);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            affgVar6 = affgVar2;
            if ((i & 24576) != 0) {
                if (true != bveVarC.E(affgVar3)) {
                    i11 = 8192;
                } else {
                    i11 = 16384;
                }
                i4 |= i11;
            }
            if ((196608 & i) != 0) {
                if (true != bveVarC.E(affgVar4)) {
                    i10 = 65536;
                } else {
                    i10 = 131072;
                }
                i4 |= i10;
            }
            if ((1572864 & i) == 0) {
                affgVar7 = affgVar5;
                if (true != bveVarC.E(affgVar7)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i4 |= i9;
            } else {
                affgVar7 = affgVar5;
            }
            if ((12582912 & i) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i4 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                i7 = i2 | 2;
            } else {
                i7 = i2;
            }
            if ((i2 & 48) == 0) {
                i7 |= 16;
            }
            i8 = i7 | 3456;
            if ((306783379 & i4) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bveVarC.I(z, i4 & 1)) {
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        affgVar6 = null;
                    }
                    defpackage.cld cldVarB2 = defpackage.bqa.b(2, bveVarC);
                    long jF5 = defpackage.bnl.f(38, bveVarC);
                    jF = defpackage.bnl.f(31, bveVarC);
                    jF2 = defpackage.bnl.f(18, bveVarC);
                    jF3 = defpackage.bnl.f(19, bveVarC);
                    dnsVar3 = new defpackage.dns(null);
                    j9 = jF5;
                    affgVar9 = affgVar6;
                    cldVar3 = cldVarB2;
                } else {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        affgVar6 = null;
                    }
                    defpackage.cld cldVarB3 = defpackage.bqa.b(2, bveVarC);
                    long jF6 = defpackage.bnl.f(38, bveVarC);
                    jF = defpackage.bnl.f(31, bveVarC);
                    jF2 = defpackage.bnl.f(18, bveVarC);
                    jF3 = defpackage.bnl.f(19, bveVarC);
                    dnsVar3 = new defpackage.dns(null);
                    j9 = jF6;
                    affgVar9 = affgVar6;
                    cldVar3 = cldVarB3;
                }
                bveVarC.l();
                long j13 = jF3;
                defpackage.dns dnsVar5 = dnsVar3;
                defpackage.affg affgVar11 = affgVar7;
                long j14 = jF;
                long j15 = jF2;
                bveVar2 = bveVarC;
                defpackage.cgf cgfVar6 = cgfVar4;
                defpackage.bmj.d(aferVar2, affgVar, cgfVar6, affgVar9, affgVar3, affgVar4, affgVar11, cldVar3, j9, j14, j15, j13, dnsVar5, bveVar2, i4 & 4194302, i8 & 8064);
                cgfVar3 = cgfVar6;
                affgVar8 = affgVar9;
                cldVar2 = cldVar3;
                j8 = j9;
                j5 = j14;
                j6 = j15;
                j7 = j13;
                dnsVar2 = dnsVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                j5 = j2;
                j6 = j3;
                j7 = j4;
                dnsVar2 = dnsVar;
                cgfVar3 = cgfVar2;
                affgVar8 = affgVar6;
                cldVar2 = cldVar;
                j8 = j;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bmk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.afer aferVar3 = aferVar;
                        defpackage.affg affgVar12 = affgVar;
                        defpackage.cgf cgfVar7 = cgfVar3;
                        defpackage.affg affgVar13 = affgVar8;
                        defpackage.affg affgVar14 = affgVar3;
                        defpackage.affg affgVar15 = affgVar4;
                        defpackage.affg affgVar16 = affgVar5;
                        defpackage.cld cldVar4 = cldVar2;
                        long j16 = j8;
                        int i14 = i;
                        long j17 = j5;
                        int i15 = i2;
                        int i16 = i14 | 1;
                        int i17 = i15 & 306783378;
                        int i18 = i16 & 306783378;
                        int i19 = i18 + i18;
                        long j18 = j7;
                        int i20 = i15 & 613566756;
                        int i21 = i16 & 613566756;
                        defpackage.dns dnsVar6 = dnsVar2;
                        defpackage.vx.a(aferVar3, affgVar12, cgfVar7, affgVar13, affgVar14, affgVar15, affgVar16, cldVar4, j16, j17, j6, j18, dnsVar6, (defpackage.bve) obj, (i16 & (-920350135)) | i18 | (i21 >> 1) | (i19 & i21), (i15 & (-920350135)) | i17 | (i20 >> 1) | ((i17 + i17) & i20), i3);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i4 |= 384;
        cgfVar2 = cgfVar;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                affgVar6 = affgVar2;
                if (true != bveVarC.E(affgVar6)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i4 |= i6;
            }
            if ((i & 24576) != 0) {
                if (true != bveVarC.E(affgVar3)) {
                    i11 = 8192;
                } else {
                    i11 = 16384;
                }
                i4 |= i11;
            }
            if ((196608 & i) != 0) {
                if (true != bveVarC.E(affgVar4)) {
                    i10 = 65536;
                } else {
                    i10 = 131072;
                }
                i4 |= i10;
            }
            if ((1572864 & i) == 0) {
                affgVar7 = affgVar5;
                if (true != bveVarC.E(affgVar7)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i4 |= i9;
            } else {
                affgVar7 = affgVar5;
            }
            if ((12582912 & i) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i4 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                i7 = i2 | 2;
            } else {
                i7 = i2;
            }
            if ((i2 & 48) == 0) {
                i7 |= 16;
            }
            i8 = i7 | 3456;
            if ((306783379 & i4) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bveVarC.I(z, i4 & 1)) {
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        affgVar6 = null;
                    }
                    defpackage.cld cldVarB4 = defpackage.bqa.b(2, bveVarC);
                    long jF7 = defpackage.bnl.f(38, bveVarC);
                    jF = defpackage.bnl.f(31, bveVarC);
                    jF2 = defpackage.bnl.f(18, bveVarC);
                    jF3 = defpackage.bnl.f(19, bveVarC);
                    dnsVar3 = new defpackage.dns(null);
                    j9 = jF7;
                    affgVar9 = affgVar6;
                    cldVar3 = cldVarB4;
                } else {
                    if (i13 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i5 != 0) {
                        affgVar6 = null;
                    }
                    defpackage.cld cldVarB5 = defpackage.bqa.b(2, bveVarC);
                    long jF8 = defpackage.bnl.f(38, bveVarC);
                    jF = defpackage.bnl.f(31, bveVarC);
                    jF2 = defpackage.bnl.f(18, bveVarC);
                    jF3 = defpackage.bnl.f(19, bveVarC);
                    dnsVar3 = new defpackage.dns(null);
                    j9 = jF8;
                    affgVar9 = affgVar6;
                    cldVar3 = cldVarB5;
                }
                bveVarC.l();
                long j16 = jF3;
                defpackage.dns dnsVar6 = dnsVar3;
                defpackage.affg affgVar12 = affgVar7;
                long j17 = jF;
                long j18 = jF2;
                bveVar2 = bveVarC;
                defpackage.cgf cgfVar7 = cgfVar4;
                defpackage.bmj.d(aferVar2, affgVar, cgfVar7, affgVar9, affgVar3, affgVar4, affgVar12, cldVar3, j9, j17, j18, j16, dnsVar6, bveVar2, i4 & 4194302, i8 & 8064);
                cgfVar3 = cgfVar7;
                affgVar8 = affgVar9;
                cldVar2 = cldVar3;
                j8 = j9;
                j5 = j17;
                j6 = j18;
                j7 = j16;
                dnsVar2 = dnsVar6;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                j5 = j2;
                j6 = j3;
                j7 = j4;
                dnsVar2 = dnsVar;
                cgfVar3 = cgfVar2;
                affgVar8 = affgVar6;
                cldVar2 = cldVar;
                j8 = j;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bmk
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.afer aferVar3 = aferVar;
                        defpackage.affg affgVar13 = affgVar;
                        defpackage.cgf cgfVar8 = cgfVar3;
                        defpackage.affg affgVar14 = affgVar8;
                        defpackage.affg affgVar15 = affgVar3;
                        defpackage.affg affgVar16 = affgVar4;
                        defpackage.affg affgVar17 = affgVar5;
                        defpackage.cld cldVar4 = cldVar2;
                        long j19 = j8;
                        int i14 = i;
                        long j110 = j5;
                        int i15 = i2;
                        int i16 = i14 | 1;
                        int i17 = i15 & 306783378;
                        int i18 = i16 & 306783378;
                        int i19 = i18 + i18;
                        long j111 = j7;
                        int i20 = i15 & 613566756;
                        int i21 = i16 & 613566756;
                        defpackage.dns dnsVar7 = dnsVar2;
                        defpackage.vx.a(aferVar3, affgVar13, cgfVar8, affgVar14, affgVar15, affgVar16, affgVar17, cldVar4, j19, j110, j6, j111, dnsVar7, (defpackage.bve) obj, (i16 & (-920350135)) | i18 | (i21 >> 1) | (i19 & i21), (i15 & (-920350135)) | i17 | (i20 >> 1) | ((i17 + i17) & i20), i3);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i4 |= 3072;
        affgVar6 = affgVar2;
        if ((i & 24576) != 0) {
            if (true != bveVarC.E(affgVar3)) {
                i11 = 8192;
            } else {
                i11 = 16384;
            }
            i4 |= i11;
        }
        if ((196608 & i) != 0) {
            if (true != bveVarC.E(affgVar4)) {
                i10 = 65536;
            } else {
                i10 = 131072;
            }
            i4 |= i10;
        }
        if ((1572864 & i) == 0) {
            affgVar7 = affgVar5;
            if (true != bveVarC.E(affgVar7)) {
                i9 = 524288;
            } else {
                i9 = 1048576;
            }
            i4 |= i9;
        } else {
            affgVar7 = affgVar5;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            i7 = i2 | 2;
        } else {
            i7 = i2;
        }
        if ((i2 & 48) == 0) {
            i7 |= 16;
        }
        i8 = i7 | 3456;
        if ((306783379 & i4) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (bveVarC.I(z, i4 & 1)) {
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i5 != 0) {
                    affgVar6 = null;
                }
                defpackage.cld cldVarB6 = defpackage.bqa.b(2, bveVarC);
                long jF9 = defpackage.bnl.f(38, bveVarC);
                jF = defpackage.bnl.f(31, bveVarC);
                jF2 = defpackage.bnl.f(18, bveVarC);
                jF3 = defpackage.bnl.f(19, bveVarC);
                dnsVar3 = new defpackage.dns(null);
                j9 = jF9;
                affgVar9 = affgVar6;
                cldVar3 = cldVarB6;
            } else {
                if (i13 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i5 != 0) {
                    affgVar6 = null;
                }
                defpackage.cld cldVarB7 = defpackage.bqa.b(2, bveVarC);
                long jF10 = defpackage.bnl.f(38, bveVarC);
                jF = defpackage.bnl.f(31, bveVarC);
                jF2 = defpackage.bnl.f(18, bveVarC);
                jF3 = defpackage.bnl.f(19, bveVarC);
                dnsVar3 = new defpackage.dns(null);
                j9 = jF10;
                affgVar9 = affgVar6;
                cldVar3 = cldVarB7;
            }
            bveVarC.l();
            long j19 = jF3;
            defpackage.dns dnsVar7 = dnsVar3;
            defpackage.affg affgVar13 = affgVar7;
            long j110 = jF;
            long j111 = jF2;
            bveVar2 = bveVarC;
            defpackage.cgf cgfVar8 = cgfVar4;
            defpackage.bmj.d(aferVar2, affgVar, cgfVar8, affgVar9, affgVar3, affgVar4, affgVar13, cldVar3, j9, j110, j111, j19, dnsVar7, bveVar2, i4 & 4194302, i8 & 8064);
            cgfVar3 = cgfVar8;
            affgVar8 = affgVar9;
            cldVar2 = cldVar3;
            j8 = j9;
            j5 = j110;
            j6 = j111;
            j7 = j19;
            dnsVar2 = dnsVar7;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            j5 = j2;
            j6 = j3;
            j7 = j4;
            dnsVar2 = dnsVar;
            cgfVar3 = cgfVar2;
            affgVar8 = affgVar6;
            cldVar2 = cldVar;
            j8 = j;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bmk
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.afer aferVar3 = aferVar;
                    defpackage.affg affgVar14 = affgVar;
                    defpackage.cgf cgfVar9 = cgfVar3;
                    defpackage.affg affgVar15 = affgVar8;
                    defpackage.affg affgVar16 = affgVar3;
                    defpackage.affg affgVar17 = affgVar4;
                    defpackage.affg affgVar18 = affgVar5;
                    defpackage.cld cldVar4 = cldVar2;
                    long j112 = j8;
                    int i14 = i;
                    long j113 = j5;
                    int i15 = i2;
                    int i16 = i14 | 1;
                    int i17 = i15 & 306783378;
                    int i18 = i16 & 306783378;
                    int i19 = i18 + i18;
                    long j114 = j7;
                    int i20 = i15 & 613566756;
                    int i21 = i16 & 613566756;
                    defpackage.dns dnsVar8 = dnsVar2;
                    defpackage.vx.a(aferVar3, affgVar14, cgfVar9, affgVar15, affgVar16, affgVar17, affgVar18, cldVar4, j112, j113, j6, j114, dnsVar8, (defpackage.bve) obj, (i16 & (-920350135)) | i18 | (i21 >> 1) | (i19 & i21), (i15 & (-920350135)) | i17 | (i20 >> 1) | ((i17 + i17) & i20), i3);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final defpackage.cgf b(defpackage.cgf cgfVar, float f) {
        return cgfVar.a(new defpackage.cgj(f));
    }

    public static final void c(java.lang.String str, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.os.Trace.setCounter(str, j);
        }
    }

    public static final boolean d(defpackage.dec decVar) {
        return decVar.g().f(defpackage.def.C);
    }

    public static final defpackage.affg e(defpackage.dec decVar) {
        return (defpackage.affg) decVar.b.g(defpackage.ddy.e);
    }

    public static final void f(defpackage.dec decVar, int i, defpackage.affc affcVar) {
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.dec[16]);
        java.util.List listK = decVar.k(false, false);
        int i2 = bzcVar.b;
        while (true) {
            bzcVar.p(i2, listK);
            while (true) {
                int i3 = bzcVar.b;
                if (i3 == 0) {
                    return;
                }
                defpackage.dec decVar2 = (defpackage.dec) bzcVar.c(i3 - 1);
                if (!defpackage.ded.a(decVar2)) {
                    defpackage.ddz ddzVar = decVar2.b;
                    if (ddzVar.f(defpackage.def.j)) {
                        continue;
                    } else {
                        defpackage.cyl cylVarF = decVar2.f();
                        if (cylVarF == null) {
                            defpackage.csc.a("Expected semantics node to have a coordinator.");
                            throw new defpackage.afap();
                        }
                        defpackage.dlx dlxVarI = defpackage.dlv.i(defpackage.csc.f(cylVarF, true));
                        if (dlxVarI.b < dlxVarI.d && dlxVarI.c < dlxVarI.e) {
                            defpackage.affg affgVarE = e(decVar2);
                            defpackage.ddx ddxVar = (defpackage.ddx) ddzVar.g(defpackage.def.x);
                            if (affgVarE == null || ddxVar == null || ((java.lang.Number) ddxVar.b.invoke()).floatValue() <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                                listK = decVar2.k(false, false);
                                i2 = bzcVar.b;
                            } else {
                                int i4 = 1 + i;
                                affcVar.invoke(new defpackage.ddm(decVar2, i4, dlxVarI, cylVarF));
                                f(decVar2, i4, affcVar);
                            }
                        }
                    }
                }
            }
        }
    }
}
