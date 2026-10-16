package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private final int f30001a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.gas.a f30002b;

    public cs(com.waze.gas.a aVar, int i2) {
        h.g.b.x.f(aVar, "instruction");
        this.f30002b = aVar;
        this.f30001a = i2;
    }

    public final int a() {
        return this.f30001a;
    }

    public final com.waze.gas.a b() {
        return this.f30002b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return h.g.b.x.n(this.f30002b, csVar.f30002b) && this.f30001a == csVar.f30001a;
    }

    public final int hashCode() {
        return (this.f30002b.hashCode() * 31) + this.f30001a;
    }

    public final String toString() {
        return "RouteSegmentData(instruction=" + this.f30002b + ", lengthMeters=" + this.f30001a + ")";
    }
}
