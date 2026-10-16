package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dmb {
    public static final defpackage.dmc[] a = {new defpackage.dmc(0), new defpackage.dmc(4294967296L), new defpackage.dmc(8589934592L)};

    public static final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return a[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static java.lang.String c(long j) {
        long j2 = a[(int) ((1095216660480L & j) >>> 32)].a;
        if (j2 == 0) {
            return "Unspecified";
        }
        if (j2 == 4294967296L) {
            return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ".sp";
        }
        if (j2 != 8589934592L) {
            return "Invalid";
        }
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ".em";
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
