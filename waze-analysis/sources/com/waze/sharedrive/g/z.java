package com.waze.sharedrive.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.l.b.j f38757a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.p.b.a.b.t f38758b;

    public z(com.waze.main_screen.p.b.a.b.t tVar, com.waze.main_screen.l.b.j jVar) {
        h.g.b.x.f(tVar, "navigationBarStateHolder");
        this.f38758b = tVar;
        this.f38757a = jVar;
    }

    public static /* synthetic */ z c(z zVar, com.waze.main_screen.l.b.j jVar) {
        com.waze.main_screen.p.b.a.b.t tVar = zVar.f38758b;
        h.g.b.x.f(tVar, "navigationBarStateHolder");
        return new z(tVar, jVar);
    }

    public final com.waze.main_screen.l.b.j a() {
        return this.f38757a;
    }

    public final com.waze.main_screen.p.b.a.b.t b() {
        return this.f38758b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return h.g.b.x.n(this.f38758b, zVar.f38758b) && h.g.b.x.n(this.f38757a, zVar.f38757a);
    }

    public final int hashCode() {
        int iHashCode = this.f38758b.hashCode() * 31;
        com.waze.main_screen.l.b.j jVar = this.f38757a;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "NavigationBar(navigationBarStateHolder=" + this.f38758b + ", navigationInstructionsListStateHolder=" + this.f38757a + ")";
    }
}
