package com.waze.trip_overview;

import androidx.lifecycle.Observer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class k implements Observer, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f41483a;

    k(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "function");
        this.f41483a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f41483a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f41483a.invoke(obj);
    }
}
