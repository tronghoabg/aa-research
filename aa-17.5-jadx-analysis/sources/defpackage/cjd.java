package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

@afdo
/* loaded from: classes.dex */
public final class cjd {
    public final long a;

    public /* synthetic */ cjd(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static String c(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + byx.G(Float.intBitsToFloat((int) (j >> 32))) + ", " + byx.G(Float.intBitsToFloat((int) (j & 4294967295L))) + ")";
    }

    public static final boolean d(long j) {
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        return (fIntBitsToFloat <= BitmapDescriptorFactory.HUE_RED) | (j == 9205357640488583168L) | (fIntBitsToFloat2 <= BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cjd) && this.a == ((cjd) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return c(this.a);
    }
}
