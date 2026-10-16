package com.waze.car_lib.i.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bv.h f20025a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20026b;

    public s(com.waze.bv.h hVar, boolean z) {
        h.g.b.x.f(hVar, "controllerState");
        this.f20025a = hVar;
        this.f20026b = z;
    }

    public final com.waze.bv.h a() {
        return this.f20025a;
    }

    public final boolean b() {
        return this.f20026b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return h.g.b.x.n(this.f20025a, sVar.f20025a) && this.f20026b == sVar.f20026b;
    }

    public final int hashCode() {
        return (this.f20025a.hashCode() * 31) + a.a.a(this.f20026b);
    }

    public final String toString() {
        return "State(controllerState=" + this.f20025a + ", shouldAdjustBottomOffset=" + this.f20026b + ")";
    }
}
