package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dmd {
    public final long a;

    public static final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long c(long j, float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static java.lang.String d(long j) {
        int i = (int) (4294967295L & j);
        return "(" + java.lang.Float.intBitsToFloat((int) (j >> 32)) + ", " + java.lang.Float.intBitsToFloat(i) + ") px/sec";
    }

    public static /* synthetic */ long e(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return defpackage.a.ag(f, f2);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dmd) && this.a == ((defpackage.dmd) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return d(this.a);
    }
}
