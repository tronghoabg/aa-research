package com.waze.stats;

import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final gc f40615a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.n.t f40616b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.n.p f40617c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.n.m f40618d;

    public x(gc gcVar, com.waze.n.t tVar, com.waze.n.p pVar, com.waze.n.m mVar) {
        h.g.b.x.f(gcVar, "eventClientTimestamp");
        h.g.b.x.f(tVar, "projectedPlatform");
        h.g.b.x.f(pVar, "drivingInfo");
        h.g.b.x.f(mVar, "displayInfo");
        this.f40615a = gcVar;
        this.f40616b = tVar;
        this.f40617c = pVar;
        this.f40618d = mVar;
    }

    public final gc a() {
        return this.f40615a;
    }

    public final com.waze.n.m b() {
        return this.f40618d;
    }

    public final com.waze.n.p c() {
        return this.f40617c;
    }

    public final com.waze.n.t d() {
        return this.f40616b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h.g.b.x.n(this.f40615a, xVar.f40615a) && this.f40616b == xVar.f40616b && h.g.b.x.n(this.f40617c, xVar.f40617c) && h.g.b.x.n(this.f40618d, xVar.f40618d);
    }

    public final int hashCode() {
        return (((((this.f40615a.hashCode() * 31) + this.f40616b.hashCode()) * 31) + this.f40617c.hashCode()) * 31) + this.f40618d.hashCode();
    }

    public final String toString() {
        return "SharedEventMetadata(eventClientTimestamp=" + this.f40615a + ", projectedPlatform=" + this.f40616b + ", drivingInfo=" + this.f40617c + ", displayInfo=" + this.f40618d + ")";
    }
}
