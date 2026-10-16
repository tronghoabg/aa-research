package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f23243a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.d.k f23244b;

    public cu(com.waze.av.b.n nVar, com.waze.av.d.k kVar) {
        h.g.b.x.f(nVar, "place");
        h.g.b.x.f(kVar, "venue");
        this.f23243a = nVar;
        this.f23244b = kVar;
    }

    public final com.waze.av.b.n a() {
        return this.f23243a;
    }

    public final com.waze.av.d.k b() {
        return this.f23244b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        return h.g.b.x.n(this.f23243a, cuVar.f23243a) && h.g.b.x.n(this.f23244b, cuVar.f23244b);
    }

    public final int hashCode() {
        return (this.f23243a.hashCode() * 31) + this.f23244b.hashCode();
    }

    public final String toString() {
        return "LocationPreviewOpenEvent(place=" + this.f23243a + ", venue=" + this.f23244b + ")";
    }
}
