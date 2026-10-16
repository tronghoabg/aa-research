package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17295a;

    /* renamed from: b, reason: collision with root package name */
    private final i f17296b;

    public l(boolean z, i iVar) {
        h.g.b.x.f(iVar, "searchMateAgentAction");
        this.f17295a = z;
        this.f17296b = iVar;
    }

    @Override // com.waze.br.a.m
    public final i a() {
        return this.f17296b;
    }

    @Override // com.waze.br.a.m, com.waze.t.b.cb
    public final boolean e() {
        return this.f17295a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f17295a == lVar.f17295a && h.g.b.x.n(this.f17296b, lVar.f17296b);
    }

    public final int hashCode() {
        return (a.a.a(this.f17295a) * 31) + this.f17296b.hashCode();
    }

    public final String toString() {
        return "SearchResults(success=" + this.f17295a + ", searchMateAgentAction=" + this.f17296b + ")";
    }
}
