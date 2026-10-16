package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cq extends com.waze.destination_cell.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28158a;

    /* renamed from: b, reason: collision with root package name */
    private final ct f28159b;

    /* renamed from: c, reason: collision with root package name */
    private final float f28160c;

    /* renamed from: d, reason: collision with root package name */
    private final Float f28161d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq(com.waze.shared_infra.h.c cVar, ct ctVar, float f2, Float f3, com.waze.destination_cell.b.e eVar, int i2) {
        super(null);
        ctVar = (i2 & 2) != 0 ? ct.f28165a : ctVar;
        f2 = (i2 & 4) != 0 ? 0.0f : f2;
        f3 = (i2 & 8) != 0 ? null : f3;
        eVar = (i2 & 16) != 0 ? new dt((byte[]) null) : eVar;
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(ctVar, "displayState");
        h.g.b.x.f(eVar, "positionInViewport");
        this.f28158a = cVar;
        this.f28159b = ctVar;
        this.f28160c = f2;
        this.f28161d = f3;
        this.f28162e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return h.g.b.x.n(this.f28158a, cqVar.f28158a) && this.f28159b == cqVar.f28159b && ff.b(this.f28160c, cqVar.f28160c) && h.g.b.x.n(this.f28161d, cqVar.f28161d) && h.g.b.x.n(this.f28162e, cqVar.f28162e);
    }

    public final float h() {
        return this.f28160c;
    }

    public final int hashCode() {
        int iHashCode = (((this.f28158a.hashCode() * 31) + this.f28159b.hashCode()) * 31) + Float.floatToIntBits(this.f28160c);
        Float f2 = this.f28161d;
        return (((iHashCode * 31) + (f2 == null ? 0 : f2.hashCode())) * 31) + this.f28162e.hashCode();
    }

    public final ct i() {
        return this.f28159b;
    }

    public final com.waze.shared_infra.h.c j() {
        return this.f28158a;
    }

    public final Float k() {
        return this.f28161d;
    }

    public final com.waze.destination_cell.b.e l() {
        return this.f28162e;
    }

    public final String toString() {
        return "FitToCoordinate(coordinate=" + this.f28158a + ", displayState=" + this.f28159b + ", zoom=" + ff.a(this.f28160c) + ", orientationDegrees=" + this.f28161d + ", positionInViewport=" + this.f28162e + ")";
    }
}
