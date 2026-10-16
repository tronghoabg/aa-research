package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17291a;

    /* renamed from: b, reason: collision with root package name */
    private final i f17292b;

    public j(boolean z, i iVar) {
        h.g.b.x.f(iVar, "searchMateAgentAction");
        this.f17291a = z;
        this.f17292b = iVar;
    }

    @Override // com.waze.br.a.m
    public final i a() {
        return this.f17292b;
    }

    @Override // com.waze.br.a.m, com.waze.t.b.cb
    public final boolean e() {
        return this.f17291a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f17291a == jVar.f17291a && h.g.b.x.n(this.f17292b, jVar.f17292b);
    }

    public final int hashCode() {
        return (a.a.a(this.f17291a) * 31) + this.f17292b.hashCode();
    }

    public final String toString() {
        return "LocationDetails(success=" + this.f17291a + ", searchMateAgentAction=" + this.f17292b + ")";
    }
}
