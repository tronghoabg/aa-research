package com.waze.main_screen.y;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f27883a;

    public h(com.waze.shared_infra.h.c cVar) {
        x.f(cVar, "coordinate");
        this.f27883a = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f27883a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && x.n(this.f27883a, ((h) obj).f27883a);
    }

    public final int hashCode() {
        return this.f27883a.hashCode();
    }

    public final String toString() {
        return "UpdateParking(coordinate=" + this.f27883a + ")";
    }
}
