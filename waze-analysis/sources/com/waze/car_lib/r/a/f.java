package com.waze.car_lib.r.a;

import com.waze.c.e.a.w;
import h.g.b.r;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class f implements w, r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f20886a;

    f(p pVar) {
        this.f20886a = pVar;
    }

    @Override // com.waze.c.e.a.w
    public final h.k a(long j2) {
        return p.e(this.f20886a, j2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new u(1, this.f20886a, p.class, "onAltRouteMapRouteClicked", "onAltRouteMapRouteClicked(J)Lkotlin/Pair;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
