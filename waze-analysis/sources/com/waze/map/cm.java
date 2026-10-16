package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28681a;

    public cm(com.waze.shared_infra.h.c cVar) {
        this.f28681a = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f28681a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm) && h.g.b.x.n(this.f28681a, ((cm) obj).f28681a);
    }

    public final int hashCode() {
        com.waze.shared_infra.h.c cVar = this.f28681a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "DarkenHightlightRequestForPresenter(coordinate=" + this.f28681a + ")";
    }
}
