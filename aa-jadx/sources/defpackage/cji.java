package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class cji {
    public final long a;

    public /* synthetic */ cji(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) java.lang.Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final long b(long j, float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long c(long j, float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static java.lang.String d(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + defpackage.bzd.p(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.bzd.p(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ")";
    }

    public static /* synthetic */ long e(long j, float f, int i) {
        float fIntBitsToFloat = (i & 1) != 0 ? java.lang.Float.intBitsToFloat((int) (j >> 32)) : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if ((i & 2) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return defpackage.a.ag(fIntBitsToFloat, f);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cji) && this.a == ((defpackage.cji) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return d(this.a);
    }
}
