package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ea extends gh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.aj f19517a;

    public ea(com.waze.car_lib.p.aj ajVar) {
        h.g.b.x.f(ajVar, "popupUiState");
        this.f19517a = ajVar;
    }

    public final com.waze.car_lib.p.aj a() {
        return this.f19517a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea) && h.g.b.x.n(this.f19517a, ((ea) obj).f19517a);
    }

    public final int hashCode() {
        return this.f19517a.hashCode();
    }

    public final String toString() {
        return "ShowNewCoordinator(popupUiState=" + this.f19517a + ")";
    }
}
