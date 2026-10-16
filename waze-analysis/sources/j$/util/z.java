package j$.util;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f50736c = new z();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50737a;

    /* renamed from: b, reason: collision with root package name */
    public final double f50738b;

    public z() {
        this.f50737a = false;
        this.f50738b = Double.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        boolean z = zVar.f50737a;
        boolean z2 = this.f50737a;
        return (z2 && z) ? Double.compare(this.f50738b, zVar.f50738b) == 0 : z2 == z;
    }

    public final int hashCode() {
        if (!this.f50737a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f50738b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f50737a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f50738b + "]";
    }

    public z(double d2) {
        this.f50737a = true;
        this.f50738b = d2;
    }
}
