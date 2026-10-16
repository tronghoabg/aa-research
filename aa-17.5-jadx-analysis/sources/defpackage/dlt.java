package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dlt {
    public static final dlu[] a = {new dlu(0), new dlu(4294967296L), new dlu(8589934592L)};

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return a[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static String c(long j) {
        long j2 = a[(int) ((1095216660480L & j) >>> 32)].a;
        if (j2 == 0) {
            return "Unspecified";
        }
        if (j2 == 4294967296L) {
            return Float.intBitsToFloat((int) (j & 4294967295L)) + ".sp";
        }
        if (j2 != 8589934592L) {
            return "Invalid";
        }
        return Float.intBitsToFloat((int) (j & 4294967295L)) + ".em";
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
