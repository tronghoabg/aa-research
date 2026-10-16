package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dlt {
    public final long a;

    public static final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public static final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
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
        return defpackage.dlr.b(java.lang.Float.intBitsToFloat((int) (j >> 32)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + " x " + defpackage.dlr.b(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }
}
