package L0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final long f6796b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6797c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f6798a;

    static {
        float f10 = 0;
        A6.c.a(f10, f10);
        f6796b = A6.c.a(Float.NaN, Float.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6798a == ((e) obj).f6798a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f6798a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        long j8 = this.f6798a;
        long j10 = f6796b;
        if (j8 == j10) {
            return "DpOffset.Unspecified";
        }
        StringBuilder sb2 = new StringBuilder("(");
        if (j8 == j10) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        sb2.append((Object) d.b(Float.intBitsToFloat((int) (j8 >> 32))));
        sb2.append(", ");
        if (j8 == j10) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        sb2.append((Object) d.b(Float.intBitsToFloat((int) (j8 & 4294967295L))));
        sb2.append(')');
        return sb2.toString();
    }
}
