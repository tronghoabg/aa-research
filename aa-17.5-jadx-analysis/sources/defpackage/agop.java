package defpackage;

/* loaded from: classes3.dex */
public final class agop {
    public static final agoo Companion = new agoo(null);
    public static final agop STAR = new agop(null, null);
    private agol type;
    private agor variance;

    public agop(agor agorVar, agol agolVar) {
        this.variance = agorVar;
        this.type = agolVar;
    }

    public final agor component1() {
        return this.variance;
    }

    public final agol component2() {
        return this.type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agop)) {
            return false;
        }
        agop agopVar = (agop) obj;
        return this.variance == agopVar.variance && affa.f(this.type, agopVar.type);
    }

    public final agol getType() {
        return this.type;
    }

    public final agor getVariance() {
        return this.variance;
    }

    public int hashCode() {
        agor agorVar = this.variance;
        int iHashCode = agorVar == null ? 0 : agorVar.hashCode();
        agol agolVar = this.type;
        return (iHashCode * 31) + (agolVar != null ? agolVar.hashCode() : 0);
    }

    public String toString() {
        return "KmTypeProjection(variance=" + this.variance + ", type=" + this.type + ')';
    }
}
