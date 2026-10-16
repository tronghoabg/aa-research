package com.waze.settings.tree.d;

import androidx.lifecycle.Observer;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class c implements Observer, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f37537a;

    c(h.g.a.l lVar) {
        x.f(lVar, "function");
        this.f37537a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
            return x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f37537a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f37537a.invoke(obj);
    }
}
