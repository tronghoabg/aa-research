package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends com.waze.ae.e {

    /* renamed from: a, reason: collision with root package name */
    private final d f30142a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ae.e f30143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, com.waze.ae.e eVar) {
        super(null);
        h.g.b.x.f(dVar, "impact");
        h.g.b.x.f(eVar, "impactType");
        this.f30142a = dVar;
        this.f30143b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f30142a == fVar.f30142a && h.g.b.x.n(this.f30143b, fVar.f30143b);
    }

    @Override // com.waze.ae.e
    public final d f() {
        return this.f30142a;
    }

    @Override // com.waze.ae.e
    public final com.waze.ae.e h() {
        return this.f30143b;
    }

    public final int hashCode() {
        return (this.f30142a.hashCode() * 31) + this.f30143b.hashCode();
    }

    public final String toString() {
        return "V2(impact=" + this.f30142a + ", impactType=" + this.f30143b + ")";
    }
}
