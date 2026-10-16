package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17293a;

    /* renamed from: b, reason: collision with root package name */
    private final i f17294b;

    public k(boolean z, i iVar) {
        h.g.b.x.f(iVar, "searchMateAgentAction");
        this.f17293a = z;
        this.f17294b = iVar;
    }

    @Override // com.waze.br.a.m
    public final i a() {
        return this.f17294b;
    }

    @Override // com.waze.br.a.m, com.waze.t.b.cb
    public final boolean e() {
        return this.f17293a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f17293a == kVar.f17293a && h.g.b.x.n(this.f17294b, kVar.f17294b);
    }

    public final int hashCode() {
        return (a.a.a(this.f17293a) * 31) + this.f17294b.hashCode();
    }

    public final String toString() {
        return "RoutesSelection(success=" + this.f17293a + ", searchMateAgentAction=" + this.f17294b + ")";
    }
}
