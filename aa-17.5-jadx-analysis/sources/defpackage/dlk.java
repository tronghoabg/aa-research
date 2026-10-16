package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

@afdo
/* loaded from: classes.dex */
public final class dlk {
    public final long a;

    public static String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + dlj.b(Float.intBitsToFloat((int) (j >> 32)) + BitmapDescriptorFactory.HUE_RED) + ", " + dlj.b(Float.intBitsToFloat((int) (j & 4294967295L)) + BitmapDescriptorFactory.HUE_RED) + ")";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dlk) && this.a == ((dlk) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return a(this.a);
    }
}
