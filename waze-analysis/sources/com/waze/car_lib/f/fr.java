package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fr extends com.waze.car_lib.m.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.screens.bd f19591a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(com.waze.car_lib.screens.bd bdVar) {
        super(null, null);
        h.g.b.x.f(bdVar, "launchParams");
        this.f19591a = bdVar;
    }

    public final com.waze.car_lib.screens.bd a() {
        return this.f19591a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr) && h.g.b.x.n(this.f19591a, ((fr) obj).f19591a);
    }

    public final int hashCode() {
        return this.f19591a.hashCode();
    }

    public final String toString() {
        return "OpenPredictionCardScreen(launchParams=" + this.f19591a + ")";
    }
}
