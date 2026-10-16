package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f23245a;

    public cv(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f23245a = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f23245a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv) && h.g.b.x.n(this.f23245a, ((cv) obj).f23245a);
    }

    public final int hashCode() {
        return this.f23245a.hashCode();
    }

    public final String toString() {
        return "LocationSharingUpdate(coordinate=" + this.f23245a + ")";
    }
}
