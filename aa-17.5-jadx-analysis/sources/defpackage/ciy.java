package defpackage;

@afdo
/* loaded from: classes.dex */
public final class ciy {
    public static String a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "CornerRadius.circular(" + byx.G(Float.intBitsToFloat(i2)) + ")";
        }
        return "CornerRadius.elliptical(" + byx.G(Float.intBitsToFloat(i2)) + ", " + byx.G(Float.intBitsToFloat(i)) + ")";
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
