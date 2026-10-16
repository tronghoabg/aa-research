package com.waze.r;

import androidx.lifecycle.Observer;
import h.g.a.l;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class g implements Observer, r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ l f33505a;

    g(l lVar) {
        x.f(lVar, "function");
        this.f33505a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f33505a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f33505a.invoke(obj);
    }
}
