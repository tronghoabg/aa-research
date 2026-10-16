package com.waze.car_lib;

import androidx.lifecycle.Observer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class bn implements Observer, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f19202a;

    bn(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "function");
        this.f19202a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f19202a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f19202a.invoke(obj);
    }
}
