package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bg extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.screens.bd f19421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(com.waze.car_lib.screens.bd bdVar) {
        super(null);
        h.g.b.x.f(bdVar, "launchParams");
        this.f19421a = bdVar;
    }

    public final com.waze.car_lib.screens.bd a() {
        return this.f19421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg) && h.g.b.x.n(this.f19421a, ((bg) obj).f19421a);
    }

    public final int hashCode() {
        return this.f19421a.hashCode();
    }

    public final String toString() {
        return "PredictionCard(launchParams=" + this.f19421a + ")";
    }
}
