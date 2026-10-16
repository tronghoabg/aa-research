package com.waze.main_screen.a.a;

import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.map.b.o;
import h.g.b.r;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class l implements com.waze.main_screen.l.b.h, r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f25552a;

    l(n nVar) {
        this.f25552a = nVar;
    }

    @Override // com.waze.main_screen.l.b.h
    public final void a(RtAlertItem rtAlertItem) {
        x.f(rtAlertItem, "p0");
        this.f25552a.f25555b.r(new o(new com.waze.shared_infra.h.c(rtAlertItem.getLatitude(), rtAlertItem.getLongitude()), null, 0.0f, false, null, 28), true);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.main_screen.l.b.h) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new u(1, this.f25552a, n.class, "handleRouteEventClicked", "handleRouteEventClicked(Lcom/waze/jni/protos/rtalerts/RtAlertItem;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
