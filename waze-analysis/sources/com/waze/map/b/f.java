package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends com.waze.an.c.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28304a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "highlight");
        this.f28304a = cVar;
    }

    public final com.waze.shared_infra.h.c d() {
        return this.f28304a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.g.b.x.n(this.f28304a, ((f) obj).f28304a);
    }

    public final int hashCode() {
        return this.f28304a.hashCode();
    }

    public final String toString() {
        return "DarkWithHighlight(highlight=" + this.f28304a + ")";
    }
}
