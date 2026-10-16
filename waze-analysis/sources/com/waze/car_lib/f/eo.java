package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eo extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.a.d f19560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(com.waze.navigate.a.d dVar) {
        super(null);
        h.g.b.x.f(dVar, "inCarDeeplinkAction");
        this.f19560a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo) && h.g.b.x.n(this.f19560a, ((eo) obj).f19560a);
    }

    public final com.waze.navigate.a.d g() {
        return this.f19560a;
    }

    public final int hashCode() {
        return this.f19560a.hashCode();
    }

    public final String toString() {
        return "InCarDeeplinkAction(inCarDeeplinkAction=" + this.f19560a + ")";
    }
}
