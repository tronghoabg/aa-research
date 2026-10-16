package e0;

/* renamed from: e0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2447J {

    /* renamed from: b, reason: collision with root package name */
    public static final long f34353b = (Float.floatToIntBits(0.5f) << 32) | (Float.floatToIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34354c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f34355a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2447J) {
            return this.f34355a == ((C2447J) obj).f34355a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f34355a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return "TransformOrigin(packedValue=" + this.f34355a + ')';
    }
}
