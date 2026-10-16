package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bj implements bn {

    /* renamed from: a, reason: collision with root package name */
    private final t f42579a;

    public bj(t tVar) {
        h.g.b.x.f(tVar, "state");
        this.f42579a = tVar;
    }

    public final t a() {
        return this.f42579a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj) && h.g.b.x.n(this.f42579a, ((bj) obj).f42579a);
    }

    public final int hashCode() {
        return this.f42579a.hashCode();
    }

    public final String toString() {
        return "Extended(state=" + this.f42579a + ")";
    }
}
