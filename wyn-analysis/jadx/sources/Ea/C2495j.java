package ea;

/* renamed from: ea.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2495j {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC2494i f34557a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC2494i f34558b;

    /* renamed from: c, reason: collision with root package name */
    public final double f34559c;

    public C2495j(EnumC2494i enumC2494i, EnumC2494i enumC2494i2, double d3) {
        this.f34557a = enumC2494i;
        this.f34558b = enumC2494i2;
        this.f34559c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2495j)) {
            return false;
        }
        C2495j c2495j = (C2495j) obj;
        return this.f34557a == c2495j.f34557a && this.f34558b == c2495j.f34558b && Double.compare(this.f34559c, c2495j.f34559c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f34558b.hashCode() + (this.f34557a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f34559c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f34557a + ", crashlytics=" + this.f34558b + ", sessionSamplingRate=" + this.f34559c + ')';
    }
}
