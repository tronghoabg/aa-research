package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.k f14605a;

    public s(com.waze.k kVar) {
        h.g.b.x.f(kVar, "alertId");
        this.f14605a = kVar;
    }

    public final com.waze.k b() {
        return this.f14605a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && h.g.b.x.n(this.f14605a, ((s) obj).f14605a);
    }

    public final int hashCode() {
        return this.f14605a.hashCode();
    }

    public final String toString() {
        return "Alert(alertId=" + this.f14605a + ")";
    }
}
