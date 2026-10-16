package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kwg implements defpackage.kwd {
    public static final defpackage.kwg a = new defpackage.kwg();

    @Override // defpackage.kwd
    public final void a(final defpackage.cne cneVar, final java.lang.String str, final defpackage.ktf ktfVar, long j, final long j2, final defpackage.afer aferVar, defpackage.bve bveVar, final int i) {
        int i2;
        final long j3;
        boolean z;
        defpackage.ktl ktlVarE;
        long j4;
        defpackage.ktl ktlVar;
        ktfVar.getClass();
        aferVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-730554127);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? bveVarC.C(ktfVar) : bveVarC.E(ktfVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.B(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.B(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.C(this) ? 524288 : 1048576;
        }
        int i4 = i2;
        if (!bveVarC.I((i4 & 599187) != 599186, i4 & 1)) {
            bveVarC.s();
            j3 = j;
        } else {
            if (j2 != 16 && j == 16) {
                throw new java.lang.IllegalArgumentException("If the content color is specified then the container color must also be specified.");
            }
            if (j == 16) {
                bveVarC.v(-1982835547);
                defpackage.afar afarVar = defpackage.ktl.a;
                defpackage.ktl ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVarC, 255);
                ((defpackage.bwc) bveVarC).Y(false);
                z = false;
                ktlVar = ktlVarF;
                j4 = 16;
            } else {
                if (j2 == 16) {
                    bveVarC.v(-1982833004);
                    defpackage.afar afarVar2 = defpackage.ktl.a;
                    z = false;
                    ktlVarE = defpackage.kgu.e(j, 0L, 0L, 0L, 0L, 0L, 0L, bveVarC, 254);
                    bveVarC = bveVarC;
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    z = false;
                    bveVarC.v(-1982830686);
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    ktlVarE = defpackage.kgu.e(j, j2, 0L, 0L, 0L, 0L, 0L, bveVarC, 252);
                    bveVarC = bveVarC;
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                j4 = j;
                ktlVar = ktlVarE;
            }
            if (str == null) {
                bveVarC.v(-1338115593);
                if (cneVar == null) {
                    bveVarC = bveVarC;
                    throw new java.lang.IllegalArgumentException("Filled button must have at least one of icon or label");
                }
                bveVarC = bveVarC;
                defpackage.bve bveVar2 = bveVarC;
                defpackage.khg.j(cneVar, aferVar, null, ktfVar, false, false, null, null, ktlVar, null, null, null, bveVar2, (i4 & 14) | 8 | ((i4 >> 12) & 112) | ((i4 << 3) & 7168), 0, 3828);
                bveVarC = bveVar2;
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC = bveVarC;
                bveVarC.v(-1337927857);
                defpackage.khg.l(cneVar, str, aferVar, null, ktfVar, false, null, ktlVar, null, null, bveVarC, (i4 & 14) | 8 | (i4 & 112) | ((i4 >> 9) & 896) | (57344 & (i4 << 6)), 0, 7656);
                ((defpackage.bwc) bveVarC).Y(z);
            }
            j3 = j4;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: kwf
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.kwg kwgVar = this.a;
                    defpackage.cne cneVar2 = cneVar;
                    java.lang.String str2 = str;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    kwgVar.a(cneVar2, str2, ktfVar, j3, j2, aferVar, bveVar3, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
                    return defpackage.afbk.a;
                }
            };
        }
    }
}
