package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.r.p f19419a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(com.waze.shared_infra.r.p pVar, boolean z) {
        super(null);
        h.g.b.x.f(pVar, "appType");
        this.f19419a = pVar;
        this.f19420b = z;
    }

    public final com.waze.shared_infra.r.p a() {
        return this.f19419a;
    }

    public final boolean b() {
        return this.f19420b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return this.f19419a == bfVar.f19419a && this.f19420b == bfVar.f19420b;
    }

    public final int hashCode() {
        return (this.f19419a.hashCode() * 31) + a.a.a(this.f19420b);
    }

    public final String toString() {
        return "OpenLoggedInFromAnotherDeviceScreen(appType=" + this.f19419a + ", isLoggedInCurrentSession=" + this.f19420b + ")";
    }
}
