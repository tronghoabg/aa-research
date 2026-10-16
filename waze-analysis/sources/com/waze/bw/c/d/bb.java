package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb implements x, bl {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.z.a.b.ad f17981a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17982b;

    public bb(com.waze.z.a.b.ad adVar, boolean z) {
        h.g.b.x.f(adVar, "expansionMode");
        this.f17981a = adVar;
        this.f17982b = z;
    }

    public final com.waze.z.a.b.ad a() {
        return this.f17981a;
    }

    public final boolean b() {
        return this.f17982b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.f17981a == bbVar.f17981a && this.f17982b == bbVar.f17982b;
    }

    public final int hashCode() {
        return (this.f17981a.hashCode() * 31) + a.a.a(this.f17982b);
    }

    public final String toString() {
        return "SheetExpansionChanged(expansionMode=" + this.f17981a + ", isPortrait=" + this.f17982b + ")";
    }
}
