package defpackage;

/* loaded from: classes.dex */
final class kwa implements kvx {
    public static final kwa a = new kwa();

    @Override // defpackage.kvx
    public final void a(final cmw cmwVar, final String str, final ksy ksyVar, long j, final long j2, final afdr afdrVar, bux buxVar, final int i) {
        int i2;
        final long j3;
        boolean z;
        ktf ktfVarE;
        long j4;
        ktf ktfVar;
        ksyVar.getClass();
        afdrVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-730554127);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.B(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.B(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(this) ? 524288 : 1048576;
        }
        int i4 = i2;
        if (!buxVarC.I((i4 & 599187) != 599186, i4 & 1)) {
            buxVarC.s();
            j3 = j;
        } else {
            if (j2 != 16 && j == 16) {
                throw new IllegalArgumentException("If the content color is specified then the container color must also be specified.");
            }
            if (j == 16) {
                buxVarC.v(-1982835547);
                aezr aezrVar = ktf.a;
                ktf ktfVarF = kgq.f(0L, 0L, 0L, 0L, buxVarC, 255);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
                z = false;
                ktfVar = ktfVarF;
                j4 = 16;
            } else {
                if (j2 == 16) {
                    buxVarC.v(-1982833004);
                    aezr aezrVar2 = ktf.a;
                    z = false;
                    ktfVarE = kgq.e(j, 0L, 0L, 0L, 0L, 0L, 0L, buxVarC, 254);
                    buxVarC = buxVarC;
                    ((bvv) buxVarC).Y(false);
                } else {
                    z = false;
                    buxVarC.v(-1982830686);
                    aezr aezrVar3 = ktf.a;
                    ktfVarE = kgq.e(j, j2, 0L, 0L, 0L, 0L, 0L, buxVarC, 252);
                    buxVarC = buxVarC;
                    ((bvv) buxVarC).Y(false);
                }
                j4 = j;
                ktfVar = ktfVarE;
            }
            if (str == null) {
                buxVarC.v(-1338115593);
                if (cmwVar == null) {
                    throw new IllegalArgumentException("Filled button must have at least one of icon or label");
                }
                bux buxVar2 = buxVarC;
                khc.i(cmwVar, afdrVar, null, ksyVar, false, false, null, null, ktfVar, null, null, null, buxVar2, (i4 & 14) | 8 | ((i4 >> 12) & 112) | ((i4 << 3) & 7168), 0, 3828);
                buxVarC = buxVar2;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1337927857);
                khc.k(cmwVar, str, afdrVar, null, ksyVar, false, null, ktfVar, null, null, buxVarC, (i4 & 14) | 8 | (i4 & 112) | ((i4 >> 9) & 896) | (57344 & (i4 << 6)), 0, 7656);
                ((bvv) buxVarC).Y(z);
            }
            j3 = j4;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: kvz
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    kwa kwaVar = this.a;
                    cmw cmwVar2 = cmwVar;
                    String str2 = str;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    kwaVar.a(cmwVar2, str2, ksyVar, j3, j2, afdrVar, buxVar3, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }
}
