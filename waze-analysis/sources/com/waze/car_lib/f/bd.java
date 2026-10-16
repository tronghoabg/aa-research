package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bd extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.aj f19417a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.waze.car_lib.p.aj ajVar) {
        super(null);
        h.g.b.x.f(ajVar, "uiState");
        this.f19417a = ajVar;
    }

    public final com.waze.car_lib.p.aj a() {
        return this.f19417a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd) && h.g.b.x.n(this.f19417a, ((bd) obj).f19417a);
    }

    public final int hashCode() {
        return this.f19417a.hashCode();
    }

    public final String toString() {
        return "MapMessagePopup(uiState=" + this.f19417a + ")";
    }
}
