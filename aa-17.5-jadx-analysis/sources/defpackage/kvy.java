package defpackage;

/* loaded from: classes.dex */
public final class kvy implements kvx {
    private final /* synthetic */ int e;
    public static final kvy d = new kvy(3);
    public static final kvy c = new kvy(2);
    public static final kvy b = new kvy(1);
    public static final kvy a = new kvy(0);

    public kvy(int i) {
        this.e = i;
    }

    @Override // defpackage.kvx
    public final void a(cmw cmwVar, String str, ksy ksyVar, long j, long j2, afdr afdrVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        int i3;
        bux buxVar3;
        int i4;
        bux buxVar4;
        int i5;
        bux buxVar5;
        int i6 = this.e;
        if (i6 == 0) {
            ksyVar.getClass();
            afdrVar.getClass();
            bux buxVarC = buxVar.c(-1885765097);
            if ((i & 6) == 0) {
                i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= true == buxVarC.C(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 128 : 256;
            }
            if ((i & 196608) == 0) {
                i2 |= true == buxVarC.E(afdrVar) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i2 |= true != buxVarC.C(this) ? 524288 : 1048576;
            }
            if (!buxVarC.I((i2 & 589971) != 589970, i2 & 1)) {
                buxVar2 = buxVarC;
                buxVar2.s();
            } else if (str == null) {
                buxVarC.v(-655703388);
                if (cmwVar == null) {
                    throw new IllegalArgumentException("Outlined button must have at least one of icon or label");
                }
                buxVar2 = buxVarC;
                khc.o(cmwVar, afdrVar, null, ksyVar, false, null, null, null, null, null, buxVar2, (i2 & 14) | 8 | ((i2 >> 12) & 112) | ((i2 << 3) & 7168), 0, 4084);
                ((bvv) buxVar2).Y(false);
            } else {
                buxVarC.v(-655534562);
                khc.n(cmwVar, str, afdrVar, null, ksyVar, false, null, null, null, null, null, buxVarC, (i2 & 14) | 8 | (i2 & 112) | ((i2 >> 9) & 896) | (57344 & (i2 << 6)), 0, 8168);
                buxVar2 = buxVarC;
                ((bvv) buxVar2).Y(false);
            }
            bxf bxfVarJ = buxVar2.J();
            if (bxfVarJ != null) {
                bxfVarJ.c = new bny(this, cmwVar, str, ksyVar, j, j2, afdrVar, i, 3);
                return;
            }
            return;
        }
        if (i6 == 1) {
            ksyVar.getClass();
            afdrVar.getClass();
            bux buxVarC2 = buxVar.c(2127377696);
            if ((i & 6) == 0) {
                i3 = i | (true != ((i & 8) == 0 ? buxVarC2.C(cmwVar) : buxVarC2.E(cmwVar)) ? 2 : 4);
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= true == buxVarC2.C(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC2.C(ksyVar) : buxVarC2.E(ksyVar)) ? 128 : 256;
            }
            if ((i & 196608) == 0) {
                i3 |= true == buxVarC2.E(afdrVar) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i3 |= true != buxVarC2.C(this) ? 524288 : 1048576;
            }
            if (!buxVarC2.I((i3 & 589971) != 589970, i3 & 1)) {
                buxVar3 = buxVarC2;
                buxVar3.s();
            } else {
                if (str != null) {
                    throw new IllegalArgumentException("Can't show label with icon style");
                }
                if (cmwVar == null) {
                    throw new IllegalArgumentException("Icon style must have an icon");
                }
                buxVar3 = buxVarC2;
                khc.l(cmwVar, afdrVar, null, ksyVar, false, null, null, null, null, buxVar3, (i3 & 14) | 8 | ((i3 >> 12) & 112) | ((i3 << 3) & 7168), 0, 4084);
            }
            bxf bxfVarJ2 = buxVar3.J();
            if (bxfVarJ2 != null) {
                bxfVarJ2.c = new bny(this, cmwVar, str, ksyVar, j, j2, afdrVar, i, 2);
                return;
            }
            return;
        }
        if (i6 != 2) {
            ksyVar.getClass();
            afdrVar.getClass();
            bux buxVarC3 = buxVar.c(1002083799);
            if ((i & 6) == 0) {
                i5 = i | (true != ((i & 8) == 0 ? buxVarC3.C(cmwVar) : buxVarC3.E(cmwVar)) ? 2 : 4);
            } else {
                i5 = i;
            }
            if ((i & 48) == 0) {
                i5 |= true == buxVarC3.C(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i5 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC3.C(ksyVar) : buxVarC3.E(ksyVar)) ? 128 : 256;
            }
            if ((i & 196608) == 0) {
                i5 |= true == buxVarC3.E(afdrVar) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i5 |= true != buxVarC3.C(this) ? 524288 : 1048576;
            }
            if (!buxVarC3.I((i5 & 589971) != 589970, i5 & 1)) {
                buxVar5 = buxVarC3;
                buxVar5.s();
            } else if (str == null) {
                buxVarC3.v(-1239148952);
                if (cmwVar == null) {
                    throw new IllegalArgumentException("Filled button must have at least one of icon or label");
                }
                khc.i(cmwVar, afdrVar, null, ksyVar, false, false, null, null, null, null, null, null, buxVarC3, (i5 & 14) | 8 | ((i5 >> 12) & 112) | ((i5 << 3) & 7168), 0, 4084);
                buxVar5 = buxVarC3;
                ((bvv) buxVar5).Y(false);
            } else {
                buxVar5 = buxVarC3;
                buxVar5.v(-1238984032);
                khc.k(cmwVar, str, afdrVar, null, ksyVar, false, null, null, null, null, buxVar5, (i5 & 14) | 8 | (i5 & 112) | ((i5 >> 9) & 896) | (57344 & (i5 << 6)), 0, 8168);
                ((bvv) buxVar5).Y(false);
            }
            bxf bxfVarJ3 = buxVar5.J();
            if (bxfVarJ3 != null) {
                bxfVarJ3.c = new bny(this, cmwVar, str, ksyVar, j, j2, afdrVar, i, 5);
                return;
            }
            return;
        }
        ksyVar.getClass();
        afdrVar.getClass();
        bux buxVarC4 = buxVar.c(1631196469);
        if ((i & 6) == 0) {
            i4 = i | (true != ((i & 8) == 0 ? buxVarC4.C(cmwVar) : buxVarC4.E(cmwVar)) ? 2 : 4);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true == buxVarC4.C(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC4.C(ksyVar) : buxVarC4.E(ksyVar)) ? 128 : 256;
        }
        if ((i & 196608) == 0) {
            i4 |= true == buxVarC4.E(afdrVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= true != buxVarC4.C(this) ? 524288 : 1048576;
        }
        if (!buxVarC4.I((i4 & 589971) != 589970, i4 & 1)) {
            buxVar4 = buxVarC4;
            buxVar4.s();
        } else if (str == null) {
            buxVarC4.v(1714090508);
            if (cmwVar == null) {
                throw new IllegalArgumentException("Tonal button must have at least one of icon or label");
            }
            buxVar4 = buxVarC4;
            khc.r(cmwVar, afdrVar, null, ksyVar, false, false, null, null, null, null, null, buxVar4, (i4 & 14) | 8 | ((i4 >> 12) & 112) | ((i4 << 3) & 7168), 0, 4084);
            ((bvv) buxVar4).Y(false);
        } else {
            buxVarC4.v(1714253475);
            khc.q(cmwVar, str, afdrVar, null, ksyVar, false, false, null, null, null, null, null, buxVarC4, (i4 & 14) | 8 | (i4 & 112) | ((i4 >> 9) & 896) | (57344 & (i4 << 6)), 0, 8168);
            buxVar4 = buxVarC4;
            ((bvv) buxVar4).Y(false);
        }
        bxf bxfVarJ4 = buxVar4.J();
        if (bxfVarJ4 != null) {
            bxfVarJ4.c = new bny(this, cmwVar, str, ksyVar, j, j2, afdrVar, i, 4);
        }
    }
}
