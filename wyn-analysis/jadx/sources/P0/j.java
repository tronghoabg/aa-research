package p0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f43140a;

    public static String a(long j8) {
        return "PointerId(value=" + j8 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f43140a == ((j) obj).f43140a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f43140a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return a(this.f43140a);
    }
}
