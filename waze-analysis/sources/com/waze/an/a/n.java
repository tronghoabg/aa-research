package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final o f14599a;

    /* renamed from: b, reason: collision with root package name */
    private final h.o.a f14600b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14601c;

    public /* synthetic */ n(o oVar, h.o.a aVar, int i2) {
        h.g.b.x.f(oVar, "positionRelativeToSegment");
        this.f14599a = oVar;
        this.f14600b = aVar;
        this.f14601c = i2;
    }

    public final int a() {
        return this.f14601c;
    }

    public final o b() {
        return this.f14599a;
    }

    public final h.o.a c() {
        return this.f14600b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f14599a == nVar.f14599a && h.g.b.x.n(this.f14600b, nVar.f14600b) && this.f14601c == nVar.f14601c;
    }

    public final int hashCode() {
        int iHashCode = this.f14599a.hashCode() * 31;
        h.o.a aVar = this.f14600b;
        return ((iHashCode + (aVar == null ? 0 : a.a.b(aVar.w()))) * 31) + this.f14601c;
    }

    public final String toString() {
        return "State(positionRelativeToSegment=" + this.f14599a + ", remainingDuration=" + this.f14600b + ", remainingDistanceMeters=" + this.f14601c + ")";
    }
}
