package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bkr {
    public static final defpackage.bks a;
    public static final defpackage.bks b;
    public static final defpackage.bks c;
    public static final defpackage.bks d;

    static {
        final int i = 1;
        a = new defpackage.bks() { // from class: bkp
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blk blkVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarT;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                int i2 = i;
                if (i2 == 0) {
                    return defpackage.bkr.a(blkVar);
                }
                if (i2 == 1) {
                    defpackage.bkl bklVar = blkVar.c;
                    return new defpackage.bko(bklVar.a(bklVar.a), bklVar.a(bklVar.b), blkVar.a() == 1);
                }
                if (i2 == 2) {
                    return defpackage.axd.u(blkVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVar = blkVar.b;
                if (bkoVar == null) {
                    return defpackage.bkr.a(blkVar);
                }
                boolean z = blkVar.a;
                if (z) {
                    bknVar = bkoVar.a;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar3 = bkoVar.b;
                    bknVar2 = bknVarT;
                } else {
                    bknVar = bkoVar.b;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar2 = bkoVar.a;
                    bknVar3 = bknVarT;
                }
                if (defpackage.afga.f(bknVarT, bknVar)) {
                    return bkoVar;
                }
                defpackage.bko bkoVar2 = new defpackage.bko(bknVar2, bknVar3, blkVar.a() == 1 || (blkVar.a() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar2.b;
                long j = bknVar4.b;
                defpackage.bkn bknVar5 = bkoVar2.a;
                long j2 = bknVar5.b;
                if (bknVar5.a == bknVar4.a) {
                    defpackage.bkl bklVar2 = blkVar.c;
                    if (bklVar2.b().length() != 0) {
                        java.lang.String strB = bklVar2.b();
                        int i3 = bklVar2.a;
                        int length = strB.length();
                        if (i3 == 0) {
                            int iY = defpackage.asq.Y(strB, 0);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iY), null, true, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iY), false, 1);
                        }
                        if (i3 == length) {
                            int iZ = defpackage.asq.Z(strB, length);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ), null, false, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ), true, 1);
                        }
                        boolean z2 = bkoVar.c;
                        int iZ2 = z ^ z2 ? defpackage.asq.Z(strB, i3) : defpackage.asq.Y(strB, i3);
                        return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ2), null, z2, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ2), z2, 1);
                    }
                }
                return bkoVar2;
            }
        };
        final int i2 = 0;
        b = new defpackage.bks() { // from class: bkp
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blk blkVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarT;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                int i3 = i2;
                if (i3 == 0) {
                    return defpackage.bkr.a(blkVar);
                }
                if (i3 == 1) {
                    defpackage.bkl bklVar = blkVar.c;
                    return new defpackage.bko(bklVar.a(bklVar.a), bklVar.a(bklVar.b), blkVar.a() == 1);
                }
                if (i3 == 2) {
                    return defpackage.axd.u(blkVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVar = blkVar.b;
                if (bkoVar == null) {
                    return defpackage.bkr.a(blkVar);
                }
                boolean z = blkVar.a;
                if (z) {
                    bknVar = bkoVar.a;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar3 = bkoVar.b;
                    bknVar2 = bknVarT;
                } else {
                    bknVar = bkoVar.b;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar2 = bkoVar.a;
                    bknVar3 = bknVarT;
                }
                if (defpackage.afga.f(bknVarT, bknVar)) {
                    return bkoVar;
                }
                defpackage.bko bkoVar2 = new defpackage.bko(bknVar2, bknVar3, blkVar.a() == 1 || (blkVar.a() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar2.b;
                long j = bknVar4.b;
                defpackage.bkn bknVar5 = bkoVar2.a;
                long j2 = bknVar5.b;
                if (bknVar5.a == bknVar4.a) {
                    defpackage.bkl bklVar2 = blkVar.c;
                    if (bklVar2.b().length() != 0) {
                        java.lang.String strB = bklVar2.b();
                        int i4 = bklVar2.a;
                        int length = strB.length();
                        if (i4 == 0) {
                            int iY = defpackage.asq.Y(strB, 0);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iY), null, true, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iY), false, 1);
                        }
                        if (i4 == length) {
                            int iZ = defpackage.asq.Z(strB, length);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ), null, false, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ), true, 1);
                        }
                        boolean z2 = bkoVar.c;
                        int iZ2 = z ^ z2 ? defpackage.asq.Z(strB, i4) : defpackage.asq.Y(strB, i4);
                        return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ2), null, z2, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ2), z2, 1);
                    }
                }
                return bkoVar2;
            }
        };
        final int i3 = 2;
        c = new defpackage.bks() { // from class: bkp
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blk blkVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarT;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                int i4 = i3;
                if (i4 == 0) {
                    return defpackage.bkr.a(blkVar);
                }
                if (i4 == 1) {
                    defpackage.bkl bklVar = blkVar.c;
                    return new defpackage.bko(bklVar.a(bklVar.a), bklVar.a(bklVar.b), blkVar.a() == 1);
                }
                if (i4 == 2) {
                    return defpackage.axd.u(blkVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVar = blkVar.b;
                if (bkoVar == null) {
                    return defpackage.bkr.a(blkVar);
                }
                boolean z = blkVar.a;
                if (z) {
                    bknVar = bkoVar.a;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar3 = bkoVar.b;
                    bknVar2 = bknVarT;
                } else {
                    bknVar = bkoVar.b;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar2 = bkoVar.a;
                    bknVar3 = bknVarT;
                }
                if (defpackage.afga.f(bknVarT, bknVar)) {
                    return bkoVar;
                }
                defpackage.bko bkoVar2 = new defpackage.bko(bknVar2, bknVar3, blkVar.a() == 1 || (blkVar.a() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar2.b;
                long j = bknVar4.b;
                defpackage.bkn bknVar5 = bkoVar2.a;
                long j2 = bknVar5.b;
                if (bknVar5.a == bknVar4.a) {
                    defpackage.bkl bklVar2 = blkVar.c;
                    if (bklVar2.b().length() != 0) {
                        java.lang.String strB = bklVar2.b();
                        int i5 = bklVar2.a;
                        int length = strB.length();
                        if (i5 == 0) {
                            int iY = defpackage.asq.Y(strB, 0);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iY), null, true, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iY), false, 1);
                        }
                        if (i5 == length) {
                            int iZ = defpackage.asq.Z(strB, length);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ), null, false, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ), true, 1);
                        }
                        boolean z2 = bkoVar.c;
                        int iZ2 = z ^ z2 ? defpackage.asq.Z(strB, i5) : defpackage.asq.Y(strB, i5);
                        return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ2), null, z2, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ2), z2, 1);
                    }
                }
                return bkoVar2;
            }
        };
        final int i4 = 3;
        d = new defpackage.bks() { // from class: bkp
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blk blkVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarT;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                int i5 = i4;
                if (i5 == 0) {
                    return defpackage.bkr.a(blkVar);
                }
                if (i5 == 1) {
                    defpackage.bkl bklVar = blkVar.c;
                    return new defpackage.bko(bklVar.a(bklVar.a), bklVar.a(bklVar.b), blkVar.a() == 1);
                }
                if (i5 == 2) {
                    return defpackage.axd.u(blkVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVar = blkVar.b;
                if (bkoVar == null) {
                    return defpackage.bkr.a(blkVar);
                }
                boolean z = blkVar.a;
                if (z) {
                    bknVar = bkoVar.a;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar3 = bkoVar.b;
                    bknVar2 = bknVarT;
                } else {
                    bknVar = bkoVar.b;
                    bknVarT = defpackage.axd.t(blkVar, blkVar.c, bknVar);
                    bknVar2 = bkoVar.a;
                    bknVar3 = bknVarT;
                }
                if (defpackage.afga.f(bknVarT, bknVar)) {
                    return bkoVar;
                }
                defpackage.bko bkoVar2 = new defpackage.bko(bknVar2, bknVar3, blkVar.a() == 1 || (blkVar.a() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar2.b;
                long j = bknVar4.b;
                defpackage.bkn bknVar5 = bkoVar2.a;
                long j2 = bknVar5.b;
                if (bknVar5.a == bknVar4.a) {
                    defpackage.bkl bklVar2 = blkVar.c;
                    if (bklVar2.b().length() != 0) {
                        java.lang.String strB = bklVar2.b();
                        int i6 = bklVar2.a;
                        int length = strB.length();
                        if (i6 == 0) {
                            int iY = defpackage.asq.Y(strB, 0);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iY), null, true, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iY), false, 1);
                        }
                        if (i6 == length) {
                            int iZ = defpackage.asq.Z(strB, length);
                            return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ), null, false, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ), true, 1);
                        }
                        boolean z2 = bkoVar.c;
                        int iZ2 = z ^ z2 ? defpackage.asq.Z(strB, i6) : defpackage.asq.Y(strB, i6);
                        return z ? defpackage.bko.a(bkoVar2, defpackage.axd.s(bknVar5, bklVar2, iZ2), null, z2, 2) : defpackage.bko.a(bkoVar2, null, defpackage.axd.s(bknVar4, bklVar2, iZ2), z2, 1);
                    }
                }
                return bkoVar2;
            }
        };
    }

    static final defpackage.bko a(defpackage.blk blkVar) {
        return defpackage.axd.u(blkVar, defpackage.bkq.a);
    }
}
