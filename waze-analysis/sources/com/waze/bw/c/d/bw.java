package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw implements cc {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.b.a f18004a;

    public bw(com.waze.br.b.a aVar) {
        h.g.b.x.f(aVar, "pendingAction");
        this.f18004a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw) && h.g.b.x.n(this.f18004a, ((bw) obj).f18004a);
    }

    public final int hashCode() {
        return this.f18004a.hashCode();
    }

    public final String toString() {
        return "HandleAction(pendingAction=" + this.f18004a + ")";
    }
}
