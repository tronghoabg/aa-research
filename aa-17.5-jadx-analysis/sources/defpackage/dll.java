package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

@afdo
/* loaded from: classes.dex */
public final class dll {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L)) + BitmapDescriptorFactory.HUE_RED;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32)) + BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dll) && this.a == ((dll) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return dlj.b(Float.intBitsToFloat((int) (j >> 32)) + BitmapDescriptorFactory.HUE_RED) + " x " + dlj.b(Float.intBitsToFloat((int) (j & 4294967295L)) + BitmapDescriptorFactory.HUE_RED);
    }
}
