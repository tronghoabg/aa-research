package com.waze.br.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements o {

    /* renamed from: a, reason: collision with root package name */
    private final a f17332a;

    public g(a aVar) {
        h.g.b.x.f(aVar, "pendingAction");
        this.f17332a = aVar;
    }

    public final a a() {
        return this.f17332a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && h.g.b.x.n(this.f17332a, ((g) obj).f17332a);
    }

    public final int hashCode() {
        return this.f17332a.hashCode();
    }

    public final String toString() {
        return "DeferredAction(pendingAction=" + this.f17332a + ")";
    }
}
