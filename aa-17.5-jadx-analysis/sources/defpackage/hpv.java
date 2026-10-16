package defpackage;

/* loaded from: classes2.dex */
public final class hpv {
    public final String a;
    public final Double b;
    public final Double c;

    public hpv(String str, Double d, Double d2) {
        this.a = str;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpv)) {
            return false;
        }
        hpv hpvVar = (hpv) obj;
        return affa.f(this.a, hpvVar.a) && affa.f(this.b, hpvVar.b) && affa.f(this.c, hpvVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.b;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        int i = iHashCode * 31;
        Double d2 = this.c;
        return ((i + iHashCode2) * 31) + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "LocationInfo(locationPrimaryName=" + this.a + ", locationLatitude=" + this.b + ", locationLongitude=" + this.c + ")";
    }
}
