package com.waze.main_screen.p.b.a.b;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private final o f27138a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27139b;

    /* renamed from: c, reason: collision with root package name */
    private final g f27140c;

    /* renamed from: d, reason: collision with root package name */
    private final j f27141d;

    public n(o oVar, g gVar) {
        x.f(oVar, "navigationState");
        x.f(gVar, "currentInstruction");
        this.f27138a = oVar;
        this.f27139b = null;
        this.f27140c = gVar;
        this.f27141d = null;
    }

    public static /* synthetic */ n b(n nVar, o oVar) {
        List list = nVar.f27139b;
        g gVar = nVar.f27140c;
        j jVar = nVar.f27141d;
        x.f(oVar, "navigationState");
        x.f(gVar, "currentInstruction");
        return new n(oVar, gVar);
    }

    public final o a() {
        return this.f27138a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!x.n(this.f27138a, nVar.f27138a)) {
            return false;
        }
        List list = nVar.f27139b;
        if (!x.n(null, null) || !x.n(this.f27140c, nVar.f27140c)) {
            return false;
        }
        j jVar = nVar.f27141d;
        return x.n(null, null);
    }

    public final int hashCode() {
        return ((this.f27138a.hashCode() * 961) + this.f27140c.hashCode()) * 31;
    }

    public final String toString() {
        return "InternalState(navigationState=" + this.f27138a + ", laneGuidance=null, currentInstruction=" + this.f27140c + ", nextInstruction=null)";
    }
}
