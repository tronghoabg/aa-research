package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class boh {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.cgf b = defpackage.awj.i(defpackage.cgf.e, 24.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x017f  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x013c  */
    /* JADX WARN: Code duplicated, block: B:97:0x015f  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0084, please report this as an issue */
    public static final void a(final defpackage.cne cneVar, final java.lang.String str, defpackage.cgf cgfVar, long j, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        long j2;
        boolean z;
        final defpackage.cgf cgfVar3;
        final long j3;
        defpackage.bxl bxlVarJ;
        int i4;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        long j4;
        defpackage.cgf cgfVar5;
        boolean z2;
        java.lang.Object objS;
        defpackage.cgf ddoVar;
        defpackage.cgf cgfVar6;
        long jA;
        int i5;
        java.lang.Object objS2;
        int i6;
        int i7 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-2142239481);
        if (i7 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(str) ? 16 : 32;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i6 = 1024;
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (bveVarC.B(j2)) {
                        i6 = 2048;
                    }
                } else {
                    j2 = j;
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i4 = i2 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i8 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        i3 &= -7169;
                        j4 = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
                    } else {
                        j4 = j2;
                    }
                    cgfVar5 = cgfVar4;
                } else {
                    bveVarC.s();
                    if (i4 != 0) {
                        i3 &= -7169;
                    }
                    long j5 = j2;
                    cgfVar5 = cgfVar2;
                    j4 = j5;
                }
                bveVarC.l();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && bveVarC.B(j4)) || (i3 & 3072) == 2048;
                objS = bwcVar.S();
                if (z2 || objS == defpackage.bvd.a) {
                    float[] fArr = defpackage.clr.a;
                    defpackage.cjx cjxVar = j4 != defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u) ? new defpackage.cjx(j4, 5) : null;
                    bwcVar.ad(cjxVar);
                    objS = cjxVar;
                }
                defpackage.cke ckeVar = (defpackage.cke) objS;
                if (str != null) {
                    bveVarC.v(-537002883);
                    i5 = i3 & 112;
                    objS2 = bwcVar.S();
                    if (i5 != 32 || objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.bmp(str, 3);
                        bwcVar.ad(objS2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
                    ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-536844101);
                    bwcVar.Y(false);
                    ddoVar = defpackage.cgf.e;
                }
                defpackage.cgf cgfVar7 = ddoVar;
                if (cneVar.a() == 9205357640488583168L) {
                    cgfVar6 = b;
                } else {
                    jA = cneVar.a();
                    if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (jA >> 32))) || !java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)))) {
                        cgfVar6 = defpackage.cgf.e;
                    } else {
                        cgfVar6 = b;
                    }
                }
                defpackage.atp.c(defpackage.bzd.v(cgfVar5.a(cgfVar6), cneVar, null, defpackage.csq.b, 0.0f, ckeVar, 22).a(cgfVar7), bveVarC, 0);
                cgfVar3 = cgfVar5;
                j3 = j4;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                j3 = j2;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bog
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        int i9 = i | 1;
                        int i10 = 306783378 & i9;
                        int i11 = 613566756 & i9;
                        defpackage.boh.a(cneVar, str, cgfVar3, j3, bveVar2, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 + i10) & i11), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 384;
        cgfVar2 = cgfVar;
        if ((i & 3072) == 0) {
            i6 = 1024;
            if ((i2 & 8) == 0) {
                j2 = j;
                if (bveVarC.B(j2)) {
                    i6 = 2048;
                }
            } else {
                j2 = j;
            }
            i3 |= i6;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            i4 = i2 & 8;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    i3 &= -7169;
                    j4 = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
                } else {
                    j4 = j2;
                }
                cgfVar5 = cgfVar4;
            } else {
                if (i8 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    i3 &= -7169;
                    j4 = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
                } else {
                    j4 = j2;
                }
                cgfVar5 = cgfVar4;
            }
            bveVarC.l();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objS = bwcVar.S();
            if (z2) {
                float[] fArr2 = defpackage.clr.a;
                if (j4 != defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u)) {
                }
                bwcVar.ad(cjxVar);
                objS = cjxVar;
            } else {
                float[] fArr3 = defpackage.clr.a;
                if (j4 != defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u)) {
                }
                bwcVar.ad(cjxVar);
                objS = cjxVar;
            }
            defpackage.cke ckeVar2 = (defpackage.cke) objS;
            if (str != null) {
                bveVarC.v(-537002883);
                i5 = i3 & 112;
                objS2 = bwcVar.S();
                if (i5 != 32) {
                    objS2 = new defpackage.bmp(str, 3);
                    bwcVar.ad(objS2);
                } else {
                    objS2 = new defpackage.bmp(str, 3);
                    bwcVar.ad(objS2);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger2 = defpackage.dea.a;
                ddoVar = new defpackage.ddo(false, (defpackage.affc) objS2);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-536844101);
                bwcVar.Y(false);
                ddoVar = defpackage.cgf.e;
            }
            defpackage.cgf cgfVar8 = ddoVar;
            if (cneVar.a() == 9205357640488583168L) {
                cgfVar6 = b;
            } else {
                jA = cneVar.a();
                if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (jA >> 32)))) {
                }
                cgfVar6 = defpackage.cgf.e;
            }
            defpackage.atp.c(defpackage.bzd.v(cgfVar5.a(cgfVar6), cneVar, null, defpackage.csq.b, 0.0f, ckeVar2, 22).a(cgfVar8), bveVarC, 0);
            cgfVar3 = cgfVar5;
            j3 = j4;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            j3 = j2;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bog
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i9 = i | 1;
                    int i10 = 306783378 & i9;
                    int i11 = 613566756 & i9;
                    defpackage.boh.a(cneVar, str, cgfVar3, j3, bveVar2, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 + i10) & i11), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void b(defpackage.cno cnoVar, defpackage.cgf cgfVar, long j, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        long j2;
        long j3;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-126890956);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cnoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(null) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if (bveVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                cgfVar = defpackage.cgf.e;
                j3 = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
            } else {
                bveVarC.s();
                j3 = j;
            }
            defpackage.cgf cgfVar3 = cgfVar;
            bveVarC.l();
            a(defpackage.dai.P(cnoVar, bveVarC), null, cgfVar3, j3, bveVarC, (i4 & 112) | 8 | (i4 & 896), 0);
            cgfVar2 = cgfVar3;
            j2 = j3;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            j2 = j;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gbc(cnoVar, cgfVar2, j2, i, 1);
        }
    }
}
