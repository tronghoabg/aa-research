package com.waze.uid.b;

import android.content.Context;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class l implements com.waze.app_nav.hub.e, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f44160a;

    l(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "function");
        this.f44160a = lVar;
    }

    @Override // com.waze.app_nav.hub.e
    public final /* synthetic */ Intent a(Context context) {
        return (Intent) this.f44160a.invoke(context);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.app_nav.hub.e) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f44160a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
