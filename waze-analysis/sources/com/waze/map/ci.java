package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ci extends com.waze.google_assistant.an {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.cn f28678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(com.waze.map.b.cn cnVar) {
        super(null);
        h.g.b.x.f(cnVar, "original");
        this.f28678a = cnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci) && h.g.b.x.n(this.f28678a, ((ci) obj).f28678a);
    }

    public final int hashCode() {
        return this.f28678a.hashCode();
    }

    public final com.waze.map.b.cn i() {
        return this.f28678a;
    }

    public final String toString() {
        return "TrackUserLocation(original=" + this.f28678a + ")";
    }
}
