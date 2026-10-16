package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.ae.a.d f26262a;

    public q(com.waze.main_screen.ae.a.d dVar) {
        h.g.b.x.f(dVar, "transportSdkButtonStateHolder");
        this.f26262a = dVar;
    }

    public final com.waze.main_screen.ae.a.d b() {
        return this.f26262a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && h.g.b.x.n(this.f26262a, ((q) obj).f26262a);
    }

    public final int hashCode() {
        return this.f26262a.hashCode();
    }

    public final String toString() {
        return "TransportSdk(transportSdkButtonStateHolder=" + this.f26262a + ")";
    }
}
