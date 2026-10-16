package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

@afdo
/* loaded from: classes.dex */
public final class cwi {
    public static final int a(long j, long j2) {
        boolean zC = c(j);
        if (zC != c(j2)) {
            return zC ? -1 : 1;
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (j >> 32);
        return (Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i)) >= BitmapDescriptorFactory.HUE_RED && b(j) != b(j2)) ? b(j) ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat(i2) - Float.intBitsToFloat(i));
    }

    public static final boolean b(long j) {
        return (j & 2) != 0;
    }

    public static final boolean c(long j) {
        return (j & 1) != 0;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
