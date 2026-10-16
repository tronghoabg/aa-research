package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.l.a f31432a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31433b;

    public gk(com.waze.shared_infra.l.a aVar, long j2) {
        h.g.b.x.f(aVar, "segment");
        this.f31432a = aVar;
        this.f31433b = j2;
    }

    public final long a() {
        return this.f31433b;
    }

    public final com.waze.shared_infra.l.a b() {
        return this.f31432a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return h.g.b.x.n(this.f31432a, gkVar.f31432a) && this.f31433b == gkVar.f31433b;
    }

    public final int hashCode() {
        return (this.f31432a.hashCode() * 31) + a.a.b(this.f31433b);
    }

    public final String toString() {
        return "UserDeviationSegment(segment=" + this.f31432a + ", timestampMillis=" + this.f31433b + ")";
    }
}
