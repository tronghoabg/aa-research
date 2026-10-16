package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajap {
    public static final defpackage.ajdz a = new defpackage.ajdz("NO_VALUE");

    public static final java.lang.Object a(java.lang.Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(java.lang.Object[] objArr, long j, java.lang.Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final defpackage.aizj c(defpackage.ajal ajalVar, defpackage.afdo afdoVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? ajalVar : new defpackage.ajbm(ajalVar, afdoVar, i, i2);
    }

    public static final defpackage.ajaj d(int i, int i2, int i3) {
        if (i > 0 || i2 > 0 || i3 == 1) {
            return new defpackage.ajao(i, i2 + i, i3);
        }
        defpackage.afqt.r(i3);
        throw new java.lang.IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(defpackage.afqt.r(i3)));
    }

    public static /* synthetic */ defpackage.ajaj e(int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return d(i & ((i4 & 1) ^ 1), i2, i3);
    }
}
