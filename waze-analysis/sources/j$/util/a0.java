package j$.util;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f50129c = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50131b;

    public a0() {
        this.f50130a = false;
        this.f50131b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        boolean z = a0Var.f50130a;
        boolean z2 = this.f50130a;
        return (z2 && z) ? this.f50131b == a0Var.f50131b : z2 == z;
    }

    public final int hashCode() {
        if (this.f50130a) {
            return this.f50131b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f50130a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.f50131b + "]";
    }

    public a0(int i2) {
        this.f50130a = true;
        this.f50131b = i2;
    }
}
