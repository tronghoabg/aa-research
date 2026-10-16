package defpackage;

/* loaded from: classes2.dex */
public final class plh {
    public final boolean a;
    public final aaok b;
    private final Integer c = null;
    private final Integer d;

    public plh(boolean z, aaok aaokVar, Integer num) {
        this.a = z;
        this.b = aaokVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plh)) {
            return false;
        }
        plh plhVar = (plh) obj;
        if (this.a != plhVar.a || this.b != plhVar.b) {
            return false;
        }
        Integer num = plhVar.c;
        return affa.f(null, null) && affa.f(this.d, plhVar.d);
    }

    public final int hashCode() {
        int iF = (a.f(this.a) * 31) + this.b.hashCode();
        Integer num = this.d;
        return (iF * 961) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ConnectivityState(connected=" + this.a + ", networkType=" + this.b + ", downstreamBandwidthKbps=null, legacySubtype=" + this.d + ")";
    }
}
