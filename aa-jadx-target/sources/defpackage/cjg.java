package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class cjg {
    public static java.lang.String a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i2) == java.lang.Float.intBitsToFloat(i)) {
            return "CornerRadius.circular(" + defpackage.bzd.p(java.lang.Float.intBitsToFloat(i2)) + ")";
        }
        return "CornerRadius.elliptical(" + defpackage.bzd.p(java.lang.Float.intBitsToFloat(i2)) + ", " + defpackage.bzd.p(java.lang.Float.intBitsToFloat(i)) + ")";
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
