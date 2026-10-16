package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.o.d.b.a.d f26258a;

    public m(com.waze.o.d.b.a.d dVar) {
        h.g.b.x.f(dVar, "companinioButtonStateHolder");
        this.f26258a = dVar;
    }

    public final com.waze.o.d.b.a.d b() {
        return this.f26258a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f26258a, ((m) obj).f26258a);
    }

    public final int hashCode() {
        return this.f26258a.hashCode();
    }

    public final String toString() {
        return "Companinio(companinioButtonStateHolder=" + this.f26258a + ")";
    }
}
