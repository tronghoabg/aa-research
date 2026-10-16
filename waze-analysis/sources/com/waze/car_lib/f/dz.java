package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dz extends gh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.aj f19513a;

    public dz(com.waze.car_lib.p.aj ajVar) {
        h.g.b.x.f(ajVar, "popupUiState");
        this.f19513a = ajVar;
    }

    public final com.waze.car_lib.p.aj a() {
        return this.f19513a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz) && h.g.b.x.n(this.f19513a, ((dz) obj).f19513a);
    }

    public final int hashCode() {
        return this.f19513a.hashCode();
    }

    public final String toString() {
        return "Show(popupUiState=" + this.f19513a + ")";
    }
}
