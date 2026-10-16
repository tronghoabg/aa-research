package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bq extends com.waze.av.d.t {

    /* renamed from: a, reason: collision with root package name */
    private final ao f30414a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.google_assistant.an f30415b;

    public bq(ao aoVar, com.waze.google_assistant.an anVar) {
        h.g.b.x.f(aoVar, "params");
        h.g.b.x.f(anVar, "futureNavigationTime");
        this.f30414a = aoVar;
        this.f30415b = anVar;
    }

    @Override // com.waze.av.d.t
    public final ao e() {
        return this.f30414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        return h.g.b.x.n(this.f30414a, bqVar.f30414a) && h.g.b.x.n(this.f30415b, bqVar.f30415b);
    }

    public final int hashCode() {
        return (this.f30414a.hashCode() * 31) + this.f30415b.hashCode();
    }

    public final com.waze.google_assistant.an i() {
        return this.f30415b;
    }

    public final String toString() {
        return "Future(params=" + this.f30414a + ", futureNavigationTime=" + this.f30415b + ")";
    }
}
