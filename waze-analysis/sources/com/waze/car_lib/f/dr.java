package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dr extends com.waze.ab.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.r.p f19499a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr(com.waze.shared_infra.r.p pVar, boolean z) {
        super(null);
        h.g.b.x.f(pVar, "appType");
        this.f19499a = pVar;
        this.f19500b = z;
    }

    public final boolean a() {
        return this.f19500b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr)) {
            return false;
        }
        dr drVar = (dr) obj;
        return this.f19499a == drVar.f19499a && this.f19500b == drVar.f19500b;
    }

    public final int hashCode() {
        return (this.f19499a.hashCode() * 31) + a.a.a(this.f19500b);
    }

    public final String toString() {
        return "LoginError(appType=" + this.f19499a + ", isLoggedInCurrentSession=" + this.f19500b + ")";
    }
}
