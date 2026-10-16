package com.waze.app_nav;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final p f15422a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f15423b;

    public m(p pVar, ah ahVar) {
        h.g.b.x.f(pVar, "flow");
        h.g.b.x.f(ahVar, "options");
        this.f15422a = pVar;
        this.f15423b = ahVar;
    }

    public final long a() {
        return this.f15422a.a();
    }

    public final p b() {
        return this.f15422a;
    }

    public final ah c() {
        return this.f15423b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.g.b.x.n(this.f15422a, mVar.f15422a) && h.g.b.x.n(this.f15423b, mVar.f15423b);
    }

    public final int hashCode() {
        return (this.f15422a.hashCode() * 31) + this.f15423b.hashCode();
    }

    public final String toString() {
        return "WazeFlowDestination(flow=" + this.f15422a + ", options=" + this.f15423b + ")";
    }
}
