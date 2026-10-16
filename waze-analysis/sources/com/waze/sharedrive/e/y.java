package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.d.d.bn f38572a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.b.bi f38573b;

    public y(com.google.d.d.bn bnVar, com.waze.map.b.bi biVar) {
        this.f38572a = bnVar;
        this.f38573b = biVar;
    }

    public static /* synthetic */ y c(y yVar, com.waze.map.b.bi biVar) {
        return new y(yVar.f38572a, biVar);
    }

    public final com.google.d.d.bn a() {
        return this.f38572a;
    }

    public final com.waze.map.b.bi b() {
        return this.f38573b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f38572a, yVar.f38572a) && h.g.b.x.n(this.f38573b, yVar.f38573b);
    }

    public final int hashCode() {
        com.google.d.d.bn bnVar = this.f38572a;
        int iHashCode = bnVar == null ? 0 : bnVar.hashCode();
        com.waze.map.b.bi biVar = this.f38573b;
        return (iHashCode * 31) + (biVar != null ? biVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(coordinates=" + this.f38572a + ", mapContentRequest=" + this.f38573b + ")";
    }
}
