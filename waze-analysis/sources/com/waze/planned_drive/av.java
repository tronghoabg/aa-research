package com.waze.planned_drive;

import androidx.lifecycle.Observer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class av implements Observer, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f33206a;

    av(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "function");
        this.f33206a = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return this.f33206a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f33206a.invoke(obj);
    }
}
