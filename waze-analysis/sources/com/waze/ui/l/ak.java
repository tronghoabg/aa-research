package com.waze.ui.l;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final ad f42491a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42492b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f42493c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.p f42494d;

    public /* synthetic */ ak(ad adVar, float f2, h.g.a.a aVar, h.g.a.p pVar) {
        h.g.b.x.f(aVar, "onStart");
        h.g.b.x.f(pVar, "onDone");
        this.f42491a = adVar;
        this.f42492b = f2;
        this.f42493c = aVar;
        this.f42494d = pVar;
    }

    public final float a() {
        return this.f42492b;
    }

    public final ad b() {
        return this.f42491a;
    }

    public final h.g.a.a c() {
        return this.f42493c;
    }

    public final h.g.a.p d() {
        return this.f42494d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return h.g.b.x.n(this.f42491a, akVar.f42491a) && Dp.m11169equalsimpl0(this.f42492b, akVar.f42492b) && h.g.b.x.n(this.f42493c, akVar.f42493c) && h.g.b.x.n(this.f42494d, akVar.f42494d);
    }

    public final int hashCode() {
        ad adVar = this.f42491a;
        return ((((((adVar == null ? 0 : adVar.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.f42492b)) * 31) + this.f42493c.hashCode()) * 31) + this.f42494d.hashCode();
    }

    public final String toString() {
        return "MeasurementRequest(targetState=" + this.f42491a + ", marginEnd=" + Dp.m11175toStringimpl(this.f42492b) + ", onStart=" + this.f42493c + ", onDone=" + this.f42494d + ")";
    }
}
