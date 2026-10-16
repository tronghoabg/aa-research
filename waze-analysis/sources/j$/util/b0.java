package j$.util;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f50134c = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50135a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50136b;

    public b0() {
        this.f50135a = false;
        this.f50136b = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        boolean z = b0Var.f50135a;
        boolean z2 = this.f50135a;
        return (z2 && z) ? this.f50136b == b0Var.f50136b : z2 == z;
    }

    public final int hashCode() {
        if (!this.f50135a) {
            return 0;
        }
        long j2 = this.f50136b;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        if (!this.f50135a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.f50136b + "]";
    }

    public b0(long j2) {
        this.f50135a = true;
        this.f50136b = j2;
    }
}
