package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends com.waze.copilot.data.b.k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19774a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19775b;

    public q(boolean z, boolean z2) {
        super(null);
        this.f19774a = z;
        this.f19775b = z2;
    }

    public final boolean a() {
        return this.f19775b;
    }

    public final boolean b() {
        return this.f19774a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f19774a == qVar.f19774a && this.f19775b == qVar.f19775b;
    }

    public final int hashCode() {
        return (a.a.a(this.f19774a) * 31) + a.a.a(this.f19775b);
    }

    public final String toString() {
        return "ShowRouteInfo(hasToll=" + this.f19774a + ", hasCarbonEmission=" + this.f19775b + ")";
    }
}
