package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dls {
    public final long a;

    public static java.lang.String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + defpackage.dlr.b(java.lang.Float.intBitsToFloat((int) (j >> 32)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ", " + defpackage.dlr.b(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + ")";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dls) && this.a == ((defpackage.dls) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
