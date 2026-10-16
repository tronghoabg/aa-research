package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kwe implements defpackage.kwd {
    private final /* synthetic */ int e;
    public static final defpackage.kwe d = new defpackage.kwe(3);
    public static final defpackage.kwe c = new defpackage.kwe(2);
    public static final defpackage.kwe b = new defpackage.kwe(1);
    public static final defpackage.kwe a = new defpackage.kwe(0);

    public kwe(int i) {
        this.e = i;
    }

    @Override // defpackage.kwd
    public final void a(defpackage.cne cneVar, java.lang.String str, defpackage.ktf ktfVar, long j, long j2, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        int i3;
        defpackage.bve bveVar3;
        int i4;
        defpackage.bve bveVar4;
        int i5;
        defpackage.bve bveVar5;
        int i6 = this.e;
        if (i6 == 0) {
            ktfVar.getClass();
            aferVar.getClass();
            defpackage.bve bveVarC = bveVar.c(-1885765097);
            if ((i & 6) == 0) {
                i2 = i | (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= true == bveVarC.C(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= true != ((i & 512) == 0 ? bveVarC.C(ktfVar) : bveVarC.E(ktfVar)) ? 128 : 256;
            }
            if ((i & 196608) == 0) {
                i2 |= true == bveVarC.E(aferVar) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i2 |= true != bveVarC.C(this) ? 524288 : 1048576;
            }
            if (!bveVarC.I((i2 & 589971) != 589970, i2 & 1)) {
                bveVar2 = bveVarC;
                bveVar2.s();
            } else if (str == null) {
                bveVarC.v(-655703388);
                if (cneVar == null) {
                    throw new java.lang.IllegalArgumentException("Outlined button must have at least one of icon or label");
                }
                bveVar2 = bveVarC;
                defpackage.khg.p(cneVar, aferVar, null, ktfVar, false, null, null, null, null, null, bveVar2, (i2 & 14) | 8 | ((i2 >> 12) & 112) | ((i2 << 3) & 7168), 0, 4084);
                ((defpackage.bwc) bveVar2).Y(false);
            } else {
                bveVarC.v(-655534562);
                defpackage.khg.o(cneVar, str, aferVar, null, ktfVar, false, null, null, null, null, null, bveVarC, (i2 & 14) | 8 | (i2 & 112) | ((i2 >> 9) & 896) | (57344 & (i2 << 6)), 0, 8168);
                bveVar2 = bveVarC;
                ((defpackage.bwc) bveVar2).Y(false);
            }
            defpackage.bxl bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new bod(this, cneVar, str, ktfVar, j, j2, aferVar, i, 3);
                return;
            }
            return;
        }
        if (i6 == 1) {
            ktfVar.getClass();
            aferVar.getClass();
            defpackage.bve bveVarC2 = bveVar.c(2127377696);
            if ((i & 6) == 0) {
                i3 = i | (true != ((i & 8) == 0 ? bveVarC2.C(cneVar) : bveVarC2.E(cneVar)) ? 2 : 4);
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= true == bveVarC2.C(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= true != ((i & 512) == 0 ? bveVarC2.C(ktfVar) : bveVarC2.E(ktfVar)) ? 128 : 256;
            }
            if ((i & 196608) == 0) {
                i3 |= true == bveVarC2.E(aferVar) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i3 |= true != bveVarC2.C(this) ? 524288 : 1048576;
            }
            if (!bveVarC2.I((i3 & 589971) != 589970, i3 & 1)) {
                bveVar3 = bveVarC2;
                bveVar3.s();
            } else {
                if (str != null) {
                    throw new java.lang.IllegalArgumentException("Can't show label with icon style");
                }
                if (cneVar == null) {
                    throw new java.lang.IllegalArgumentException("Icon style must have an icon");
                }
                bveVar3 = bveVarC2;
                defpackage.khg.m(cneVar, aferVar, null, ktfVar, false, null, null, null, null, bveVar3, (i3 & 14) | 8 | ((i3 >> 12) & 112) | ((i3 << 3) & 7168), 0, 4084);
            }
            defpackage.bxl bxlVarJ2 = bveVar3.J();
            if (bxlVarJ2 != null) {
                bxlVarJ2.c = new bod(this, cneVar, str, ktfVar, j, j2, aferVar, i, 2);
                return;
            }
            return;
        }
        if (i6 != 2) {
            ktfVar.getClass();
            aferVar.getClass();
            defpackage.bve bveVarC3 = bveVar.c(1002083799);
            if ((i & 6) == 0) {
                i5 = i | (true != ((i & 8) == 0 ? bveVarC3.C(cneVar) : bveVarC3.E(cneVar)) ? 2 : 4);
            } else {
                i5 = i;
            }
            if ((i & 48) == 0) {
                i5 |= true == bveVarC3.C(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i5 |= true != ((i & 512) == 0 ? bveVarC3.C(ktfVar) : bveVarC3.E(ktfVar)) ? 128 : 256;
            }
            if ((i & 196608) == 0) {
                i5 |= true == bveVarC3.E(aferVar) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i5 |= true != bveVarC3.C(this) ? 524288 : 1048576;
            }
            if (!bveVarC3.I((i5 & 589971) != 589970, i5 & 1)) {
                bveVar5 = bveVarC3;
                bveVar5.s();
            } else if (str == null) {
                bveVarC3.v(-1239148952);
                if (cneVar == null) {
                    throw new java.lang.IllegalArgumentException("Filled button must have at least one of icon or label");
                }
                defpackage.khg.j(cneVar, aferVar, null, ktfVar, false, false, null, null, null, null, null, null, bveVarC3, (i5 & 14) | 8 | ((i5 >> 12) & 112) | ((i5 << 3) & 7168), 0, 4084);
                bveVar5 = bveVarC3;
                ((defpackage.bwc) bveVar5).Y(false);
            } else {
                bveVar5 = bveVarC3;
                bveVar5.v(-1238984032);
                defpackage.khg.l(cneVar, str, aferVar, null, ktfVar, false, null, null, null, null, bveVar5, (i5 & 14) | 8 | (i5 & 112) | ((i5 >> 9) & 896) | (57344 & (i5 << 6)), 0, 8168);
                ((defpackage.bwc) bveVar5).Y(false);
            }
            defpackage.bxl bxlVarJ3 = bveVar5.J();
            if (bxlVarJ3 != null) {
                bxlVarJ3.c = new bod(this, cneVar, str, ktfVar, j, j2, aferVar, i, 5);
                return;
            }
            return;
        }
        ktfVar.getClass();
        aferVar.getClass();
        defpackage.bve bveVarC4 = bveVar.c(1631196469);
        if ((i & 6) == 0) {
            i4 = i | (true != ((i & 8) == 0 ? bveVarC4.C(cneVar) : bveVarC4.E(cneVar)) ? 2 : 4);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true == bveVarC4.C(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= true != ((i & 512) == 0 ? bveVarC4.C(ktfVar) : bveVarC4.E(ktfVar)) ? 128 : 256;
        }
        if ((i & 196608) == 0) {
            i4 |= true == bveVarC4.E(aferVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= true != bveVarC4.C(this) ? 524288 : 1048576;
        }
        if (!bveVarC4.I((i4 & 589971) != 589970, i4 & 1)) {
            bveVar4 = bveVarC4;
            bveVar4.s();
        } else if (str == null) {
            bveVarC4.v(1714090508);
            if (cneVar == null) {
                throw new java.lang.IllegalArgumentException("Tonal button must have at least one of icon or label");
            }
            bveVar4 = bveVarC4;
            defpackage.khg.s(cneVar, aferVar, null, ktfVar, false, false, null, null, null, null, null, null, bveVar4, (i4 & 14) | 8 | ((i4 >> 12) & 112) | ((i4 << 3) & 7168), 0, 8180);
            ((defpackage.bwc) bveVar4).Y(false);
        } else {
            bveVar4 = bveVarC4;
            bveVar4.v(1714253475);
            defpackage.khg.r(cneVar, str, aferVar, null, ktfVar, false, false, null, null, null, null, null, bveVar4, (i4 & 14) | 8 | (i4 & 112) | ((i4 >> 9) & 896) | (57344 & (i4 << 6)), 0, 8168);
            ((defpackage.bwc) bveVar4).Y(false);
        }
        defpackage.bxl bxlVarJ4 = bveVar4.J();
        if (bxlVarJ4 != null) {
            bxlVarJ4.c = new bod(this, cneVar, str, ktfVar, j, j2, aferVar, i, 4);
        }
    }
}
