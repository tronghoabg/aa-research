package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28622a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f28623b;

    public bn(com.waze.shared_infra.h.c cVar, h.g.a.a aVar) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(aVar, "onClick");
        this.f28622a = cVar;
        this.f28623b = aVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f28622a;
    }

    public final h.g.a.a b() {
        return this.f28623b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return h.g.b.x.n(this.f28622a, bnVar.f28622a) && h.g.b.x.n(this.f28623b, bnVar.f28623b);
    }

    public final int hashCode() {
        return (this.f28622a.hashCode() * 31) + this.f28623b.hashCode();
    }

    public final String toString() {
        return "NewVenuePin(coordinate=" + this.f28622a + ", onClick=" + this.f28623b + ")";
    }
}
