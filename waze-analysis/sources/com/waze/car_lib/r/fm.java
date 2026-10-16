package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fm {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21647a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.o.d.b.b.c f21648b;

    public fm(com.waze.o.d.b.b.c cVar, boolean z) {
        h.g.b.x.f(cVar, "templateUiData");
        this.f21648b = cVar;
        this.f21647a = z;
    }

    public final boolean a() {
        return this.f21647a;
    }

    public final com.waze.o.d.b.b.c b() {
        return this.f21648b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        return h.g.b.x.n(this.f21648b, fmVar.f21648b) && this.f21647a == fmVar.f21647a;
    }

    public final int hashCode() {
        return (this.f21648b.hashCode() * 31) + a.a.a(this.f21647a);
    }

    public final String toString() {
        return "WazeAsksUIData(templateUiData=" + this.f21648b + ", showAsList=" + this.f21647a + ")";
    }
}
