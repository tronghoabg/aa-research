package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f36604a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.speech.k f36605b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.speech.k f36606c;

    public n(com.waze.ui.ac.n nVar, com.waze.speech.k kVar, com.waze.speech.k kVar2) {
        h.g.b.x.f(nVar, "text");
        h.g.b.x.f(kVar, "state");
        this.f36604a = nVar;
        this.f36606c = kVar;
        this.f36605b = kVar2;
    }

    public static /* synthetic */ n b(n nVar) {
        com.waze.ui.ac.n nVar2 = nVar.f36604a;
        com.waze.speech.k kVar = nVar.f36606c;
        h.g.b.x.f(nVar2, "text");
        h.g.b.x.f(kVar, "state");
        return new n(nVar2, kVar, null);
    }

    public final com.waze.ui.ac.n a() {
        return this.f36604a;
    }

    public final com.waze.speech.k c() {
        return this.f36605b;
    }

    public final com.waze.speech.k d() {
        return this.f36606c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f36604a, nVar.f36604a) && h.g.b.x.n(this.f36606c, nVar.f36606c) && h.g.b.x.n(this.f36605b, nVar.f36605b);
    }

    public final int hashCode() {
        int iHashCode = (this.f36604a.hashCode() * 31) + this.f36606c.hashCode();
        com.waze.speech.k kVar = this.f36605b;
        return (iHashCode * 31) + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "SearchChip(text=" + this.f36604a + ", state=" + this.f36606c + ", eventOnClick=" + this.f36605b + ")";
    }
}
