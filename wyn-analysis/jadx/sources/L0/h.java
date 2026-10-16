package L0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f6805a;

    public static final boolean a(long j8, long j10) {
        return j8 == j10;
    }

    public static String b(long j8) {
        return ((int) (j8 >> 32)) + " x " + ((int) (j8 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6805a == ((h) obj).f6805a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f6805a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return b(this.f6805a);
    }
}
