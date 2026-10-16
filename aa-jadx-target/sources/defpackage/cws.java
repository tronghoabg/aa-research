package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class cws {
    public static final int a(long j, long j2) {
        boolean zC = c(j);
        if (zC != c(j2)) {
            return zC ? -1 : 1;
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (j >> 32);
        int iSignum = (int) java.lang.Math.signum(java.lang.Float.intBitsToFloat(i2) - java.lang.Float.intBitsToFloat(i));
        if (java.lang.Math.min(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i)) >= 0.0f && b(j) != b(j2)) {
            return b(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static final boolean b(long j) {
        return (j & 2) != 0;
    }

    public static final boolean c(long j) {
        return (j & 1) != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
