package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wcc {
    public static final defpackage.wcc a = new defpackage.wcc(defpackage.yne.c);
    public final defpackage.yii b;

    public wcc(defpackage.yii yiiVar) {
        this.b = yiiVar;
    }

    public static defpackage.wcc a(defpackage.abny abnyVar) throws java.io.IOException {
        long j;
        java.lang.String strX;
        defpackage.wcb wcbVar;
        byte[] bArrG;
        int iK = abnyVar.k();
        if (iK < 0) {
            throw new defpackage.abpp("Negative number of flags");
        }
        defpackage.yig yigVar = new defpackage.yig(defpackage.ymn.a);
        long j2 = 0;
        for (int i = 0; i < iK; i++) {
            long jS = abnyVar.s();
            int i2 = (int) jS;
            long j3 = jS >>> 3;
            if (j3 == 0) {
                j = 0;
                strX = abnyVar.x();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    throw new defpackage.abpp("Flag name larger than max size");
                }
                j = j4;
                strX = null;
            }
            int i3 = i2 & 7;
            if (i3 == 0 || i3 == 1) {
                wcbVar = new defpackage.wcb(j, strX, i3, 0L, null);
            } else if (i3 == 2) {
                wcbVar = new defpackage.wcb(j, strX, i3, abnyVar.s(), null);
            } else if (i3 == 3) {
                wcbVar = new defpackage.wcb(j, strX, i3, java.lang.Double.doubleToRawLongBits(abnyVar.b()), null);
            } else if (i3 == 4) {
                wcbVar = new defpackage.wcb(j, strX, i3, 0L, abnyVar.x());
            } else {
                if (i3 != 5) {
                    throw new defpackage.abpp(defpackage.a.bo(i3, "Unrecognized flag type "));
                }
                defpackage.abnx abnxVar = (defpackage.abnx) abnyVar;
                int iK2 = abnxVar.k();
                int i4 = abnxVar.c;
                int i5 = abnxVar.d;
                if (iK2 <= i4 - i5 && iK2 > 0) {
                    bArrG = java.util.Arrays.copyOfRange(abnxVar.b, i5, i5 + iK2);
                    abnxVar.d += iK2;
                } else {
                    if (iK2 < 0) {
                        throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    bArrG = abnxVar.G(iK2);
                }
                wcbVar = new defpackage.wcb(j, strX, i3, 0L, bArrG);
            }
            long j5 = wcbVar.a;
            if (j5 != 0) {
                j2 = j5;
            }
            yigVar.n(wcbVar);
        }
        return new defpackage.wcc(yigVar.g());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.wcc) {
            return this.b.equals(((defpackage.wcc) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.ysr.m(this.b);
    }
}
