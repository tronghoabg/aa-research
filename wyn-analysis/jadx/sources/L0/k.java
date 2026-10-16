package L0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f6812a;

    public static final boolean a(long j8, long j10) {
        return j8 == j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6812a == ((k) obj).f6812a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f6812a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        long j8 = this.f6812a;
        return a(j8, 0L) ? "Unspecified" : a(j8, 4294967296L) ? "Sp" : a(j8, 8589934592L) ? "Em" : "Invalid";
    }
}
