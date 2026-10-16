package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f18666a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f18667b;

    public h(h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar, "onDismissed");
        h.g.b.x.f(aVar2, "onShown");
        this.f18666a = aVar;
        this.f18667b = aVar2;
    }

    public final h.g.a.a a() {
        return this.f18666a;
    }

    public final h.g.a.a b() {
        return this.f18667b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return h.g.b.x.n(this.f18666a, hVar.f18666a) && h.g.b.x.n(this.f18667b, hVar.f18667b);
    }

    public final int hashCode() {
        return (this.f18666a.hashCode() * 31) + this.f18667b.hashCode();
    }

    public final String toString() {
        return "AlternateRoutesFTETooltipState(onDismissed=" + this.f18666a + ", onShown=" + this.f18667b + ")";
    }
}
