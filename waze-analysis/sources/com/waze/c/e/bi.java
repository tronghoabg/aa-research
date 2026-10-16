package com.waze.c.e;

import com.waze.navigate.ek;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final g f18588a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.l.b.j f18589b;

    /* renamed from: c, reason: collision with root package name */
    private final r f18590c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.c.a.a f18591d;

    /* renamed from: e, reason: collision with root package name */
    private final ek f18592e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.p.b.a.b.t f18593f;

    public bi(g gVar, com.waze.main_screen.p.b.a.b.t tVar, com.waze.main_screen.l.b.j jVar, r rVar, com.waze.c.a.a aVar, ek ekVar) {
        h.g.b.x.f(gVar, "alternativeRoutesState");
        h.g.b.x.f(tVar, "navigationBarStateHolder");
        h.g.b.x.f(rVar, "alternateRoutesLoadingState");
        h.g.b.x.f(aVar, "displayPreference");
        this.f18588a = gVar;
        this.f18593f = tVar;
        this.f18589b = jVar;
        this.f18590c = rVar;
        this.f18591d = aVar;
        this.f18592e = ekVar;
    }

    public static /* synthetic */ bi g(bi biVar, g gVar, com.waze.main_screen.l.b.j jVar, r rVar, com.waze.c.a.a aVar, ek ekVar, int i2) {
        if ((i2 & 1) != 0) {
            gVar = biVar.f18588a;
        }
        g gVar2 = gVar;
        com.waze.main_screen.p.b.a.b.t tVar = (i2 & 2) != 0 ? biVar.f18593f : null;
        if ((i2 & 4) != 0) {
            jVar = biVar.f18589b;
        }
        com.waze.main_screen.l.b.j jVar2 = jVar;
        if ((i2 & 8) != 0) {
            rVar = biVar.f18590c;
        }
        r rVar2 = rVar;
        if ((i2 & 16) != 0) {
            aVar = biVar.f18591d;
        }
        com.waze.c.a.a aVar2 = aVar;
        if ((i2 & 32) != 0) {
            ekVar = biVar.f18592e;
        }
        h.g.b.x.f(gVar2, "alternativeRoutesState");
        h.g.b.x.f(tVar, "navigationBarStateHolder");
        h.g.b.x.f(rVar2, "alternateRoutesLoadingState");
        h.g.b.x.f(aVar2, "displayPreference");
        return new bi(gVar2, tVar, jVar2, rVar2, aVar2, ekVar);
    }

    public final com.waze.c.a.a a() {
        return this.f18591d;
    }

    public final g b() {
        return this.f18588a;
    }

    public final r c() {
        return this.f18590c;
    }

    public final com.waze.main_screen.l.b.j d() {
        return this.f18589b;
    }

    public final ek e() {
        return this.f18592e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return h.g.b.x.n(this.f18588a, biVar.f18588a) && h.g.b.x.n(this.f18593f, biVar.f18593f) && h.g.b.x.n(this.f18589b, biVar.f18589b) && h.g.b.x.n(this.f18590c, biVar.f18590c) && this.f18591d == biVar.f18591d && this.f18592e == biVar.f18592e;
    }

    public final com.waze.main_screen.p.b.a.b.t f() {
        return this.f18593f;
    }

    public final int hashCode() {
        int iHashCode = (this.f18588a.hashCode() * 31) + this.f18593f.hashCode();
        com.waze.main_screen.l.b.j jVar = this.f18589b;
        int iHashCode2 = ((((((iHashCode * 31) + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.f18590c.hashCode()) * 31) + this.f18591d.hashCode()) * 31;
        ek ekVar = this.f18592e;
        return iHashCode2 + (ekVar != null ? ekVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(alternativeRoutesState=" + this.f18588a + ", navigationBarStateHolder=" + this.f18593f + ", navigationInstructionsListStateHolder=" + this.f18589b + ", alternateRoutesLoadingState=" + this.f18590c + ", displayPreference=" + this.f18591d + ", stoppedNavigationReason=" + this.f18592e + ")";
    }
}
