package com.waze.br.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.a.i f17394a;

    public g(com.waze.br.a.i iVar) {
        h.g.b.x.f(iVar, "searchMateAgentAction");
        this.f17394a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && h.g.b.x.n(this.f17394a, ((g) obj).f17394a);
    }

    public final int hashCode() {
        return this.f17394a.hashCode();
    }

    public final String toString() {
        return "HandlingAction(searchMateAgentAction=" + this.f17394a + ")";
    }
}
