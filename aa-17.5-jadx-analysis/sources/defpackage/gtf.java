package defpackage;

/* loaded from: classes2.dex */
public final class gtf implements gmo {
    public final gth a;
    private final gtg b;

    public gtf(gtg gtgVar, gth gthVar) {
        this.b = gtgVar;
        this.a = gthVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtf)) {
            return false;
        }
        gtf gtfVar = (gtf) obj;
        return affa.f(this.b, gtfVar.b) && affa.f(this.a, gtfVar.a);
    }

    public final int hashCode() {
        gtg gtgVar = this.b;
        return ((gtgVar == null ? 0 : gtgVar.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "DestinationInternal(locationInfo=" + this.b + ", travelEstimate=" + this.a + ")";
    }
}
