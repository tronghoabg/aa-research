package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class cjl {
    public final long a;

    public static final float a(long j) {
        return java.lang.Math.max(java.lang.Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), java.lang.Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float b(long j) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), java.lang.Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static java.lang.String c(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + defpackage.bzd.p(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.bzd.p(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ")";
    }

    public static final boolean d(long j) {
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
        return (fIntBitsToFloat <= 0.0f) | (j == 9205357640488583168L) | (fIntBitsToFloat2 <= 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cjl) && this.a == ((defpackage.cjl) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return c(this.a);
    }
}
