package com.waze.an.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final e f14771a;

    public f(e eVar) {
        h.g.b.x.f(eVar, "ftePhase");
        this.f14771a = eVar;
    }

    public final e a() {
        return this.f14771a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.g.b.x.n(this.f14771a, ((f) obj).f14771a);
    }

    public final int hashCode() {
        return this.f14771a.hashCode();
    }

    public final String toString() {
        return "State(ftePhase=" + this.f14771a + ")";
    }
}
