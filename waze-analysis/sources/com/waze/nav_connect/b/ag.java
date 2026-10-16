package com.waze.nav_connect.b;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class ag implements com.waze.app_nav.hub.b.j, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f30785a;

    ag(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "function");
        this.f30785a = lVar;
    }

    @Override // com.waze.app_nav.hub.b.j
    public final /* synthetic */ com.waze.app_nav.hub.b.i create(Context context) {
        return (com.waze.app_nav.hub.b.i) this.f30785a.invoke(context);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.app_nav.hub.b.j) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f30785a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
