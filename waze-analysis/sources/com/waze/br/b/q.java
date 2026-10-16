package com.waze.br.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final o f17340a;

    public q(o oVar) {
        this.f17340a = oVar;
    }

    public final o a() {
        return this.f17340a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && h.g.b.x.n(this.f17340a, ((q) obj).f17340a);
    }

    public final int hashCode() {
        o oVar = this.f17340a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    public final String toString() {
        return "State(conversationState=" + this.f17340a + ")";
    }
}
