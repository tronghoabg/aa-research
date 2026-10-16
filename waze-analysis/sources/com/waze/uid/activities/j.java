package com.waze.uid.activities;

import androidx.lifecycle.Observer;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class j implements Observer, r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f44096a;

    j(h.g.a.l lVar) {
        x.f(lVar, "function");
        this.f44096a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f44096a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f44096a.invoke(obj);
    }
}
