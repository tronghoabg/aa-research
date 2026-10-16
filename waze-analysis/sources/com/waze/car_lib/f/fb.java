package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fb extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.asks.as f19576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(com.waze.asks.as asVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        this.f19576a = asVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb) && h.g.b.x.n(this.f19576a, ((fb) obj).f19576a);
    }

    public final com.waze.asks.as g() {
        return this.f19576a;
    }

    public final int hashCode() {
        return this.f19576a.hashCode();
    }

    public final String toString() {
        return "ShowWazeAsks(question=" + this.f19576a + ")";
    }
}
