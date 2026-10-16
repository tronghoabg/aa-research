package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bt extends bv {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        this.f28447a = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f28447a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt) && h.g.b.x.n(this.f28447a, ((bt) obj).f28447a);
    }

    public final int hashCode() {
        return this.f28447a.hashCode();
    }

    public final String toString() {
        return "GeoPosition(coordinate=" + this.f28447a + ")";
    }
}
