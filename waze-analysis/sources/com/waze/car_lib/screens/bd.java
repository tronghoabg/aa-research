package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.u.a f21873a;

    public bd(com.waze.main_screen.u.a aVar) {
        h.g.b.x.f(aVar, "predictionCardParams");
        this.f21873a = aVar;
    }

    public final com.waze.main_screen.u.a a() {
        return this.f21873a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd) && h.g.b.x.n(this.f21873a, ((bd) obj).f21873a);
    }

    public final int hashCode() {
        return this.f21873a.hashCode();
    }

    public final String toString() {
        return "LaunchParams(predictionCardParams=" + this.f21873a + ")";
    }
}
