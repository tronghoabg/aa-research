package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fa extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.aj f19575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.waze.car_lib.p.aj ajVar) {
        super(null);
        h.g.b.x.f(ajVar, "popup");
        this.f19575a = ajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa) && h.g.b.x.n(this.f19575a, ((fa) obj).f19575a);
    }

    public final com.waze.car_lib.p.aj g() {
        return this.f19575a;
    }

    public final int hashCode() {
        return this.f19575a.hashCode();
    }

    public final String toString() {
        return "ShowRoutingPopup(popup=" + this.f19575a + ")";
    }
}
