package com.waze.br.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.b.a f17393a;

    public f(com.waze.br.b.a aVar) {
        h.g.b.x.f(aVar, "pendingAction");
        this.f17393a = aVar;
    }

    public final com.waze.br.b.a a() {
        return this.f17393a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.g.b.x.n(this.f17393a, ((f) obj).f17393a);
    }

    public final int hashCode() {
        return this.f17393a.hashCode();
    }

    public final String toString() {
        return "DeferredAction(pendingAction=" + this.f17393a + ")";
    }
}
