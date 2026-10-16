package L0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final k[] f6809b = {new k(0), new k(4294967296L), new k(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f6810c = Fe.b.M(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f6811a;

    public static final boolean a(long j8, long j10) {
        return j8 == j10;
    }

    public static final long b(long j8) {
        return f6809b[(int) ((j8 & 1095216660480L) >>> 32)].f6812a;
    }

    public static final float c(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static int d(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static String e(long j8) {
        long jB = b(j8);
        if (k.a(jB, 0L)) {
            return "Unspecified";
        }
        if (k.a(jB, 4294967296L)) {
            return c(j8) + ".sp";
        }
        if (!k.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j8) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f6811a == ((j) obj).f6811a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.f6811a);
    }

    public final String toString() {
        return e(this.f6811a);
    }
}
