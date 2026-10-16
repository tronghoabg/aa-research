package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.d f41037a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ae.e f41038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(com.waze.modules.c.d dVar, com.waze.ae.e eVar) {
        super(null);
        h.g.b.x.f(dVar, "impact");
        h.g.b.x.f(eVar, "impactType");
        this.f41037a = dVar;
        this.f41038b = eVar;
    }

    public final com.waze.modules.c.d a() {
        return this.f41037a;
    }

    public final com.waze.ae.e b() {
        return this.f41038b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return this.f41037a == ayVar.f41037a && h.g.b.x.n(this.f41038b, ayVar.f41038b);
    }

    public final int hashCode() {
        return (this.f41037a.hashCode() * 31) + this.f41038b.hashCode();
    }

    public final String toString() {
        return "ClosureImpact(impact=" + this.f41037a + ", impactType=" + this.f41038b + ")";
    }
}
