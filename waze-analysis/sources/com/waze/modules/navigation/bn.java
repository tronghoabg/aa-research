package com.waze.modules.navigation;

import com.waze.trip_overview.bv;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bn extends bo {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f30411a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f30412b;

    /* renamed from: c, reason: collision with root package name */
    private final bv f30413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(h.g.a.l lVar, ao aoVar, bv bvVar) {
        super(null);
        h.g.b.x.f(lVar, "fallback");
        h.g.b.x.f(aoVar, "params");
        h.g.b.x.f(bvVar, "routeSelectorEvent");
        this.f30411a = lVar;
        this.f30412b = aoVar;
        this.f30413c = bvVar;
    }

    public final ao a() {
        return this.f30412b;
    }

    public final bv b() {
        return this.f30413c;
    }

    public final h.g.a.l c() {
        return this.f30411a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return h.g.b.x.n(this.f30411a, bnVar.f30411a) && h.g.b.x.n(this.f30412b, bnVar.f30412b) && h.g.b.x.n(this.f30413c, bnVar.f30413c);
    }

    public final int hashCode() {
        return (((this.f30411a.hashCode() * 31) + this.f30412b.hashCode()) * 31) + this.f30413c.hashCode();
    }

    public final String toString() {
        return "TripOverview(fallback=" + this.f30411a + ", params=" + this.f30412b + ", routeSelectorEvent=" + this.f30413c + ")";
    }
}
