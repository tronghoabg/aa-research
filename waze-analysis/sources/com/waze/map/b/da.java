package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class da implements dj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28181a;

    public da(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f28181a = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f28181a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da) && h.g.b.x.n(this.f28181a, ((da) obj).f28181a);
    }

    public final int hashCode() {
        return this.f28181a.hashCode();
    }

    public final String toString() {
        return "MapLongClick(coordinate=" + this.f28181a + ")";
    }
}
