package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class dlt {
    public final long a;

    public static final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f;
    }

    public static final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dlt) && this.a == ((defpackage.dlt) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return defpackage.dlr.b(java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f) + " x " + defpackage.dlr.b(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f);
    }
}
