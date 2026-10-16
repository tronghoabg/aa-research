package com.waze.br.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.a.i f17334a;

    public i(com.waze.br.a.i iVar) {
        h.g.b.x.f(iVar, "searchMateAgentAction");
        this.f17334a = iVar;
    }

    public final com.waze.br.a.i a() {
        return this.f17334a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f17334a, ((i) obj).f17334a);
    }

    public final int hashCode() {
        return this.f17334a.hashCode();
    }

    public final String toString() {
        return "HandlingAction(searchMateAgentAction=" + this.f17334a + ")";
    }
}
