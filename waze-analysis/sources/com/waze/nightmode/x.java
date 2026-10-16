package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final k f32509a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32510b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32511c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32512d;

    /* renamed from: e, reason: collision with root package name */
    private final n f32513e;

    public x(k kVar, boolean z, boolean z2, boolean z3, n nVar) {
        h.g.b.x.f(kVar, "settings");
        this.f32509a = kVar;
        this.f32510b = z;
        this.f32511c = z2;
        this.f32512d = z3;
        this.f32513e = nVar;
    }

    public final k a() {
        return this.f32509a;
    }

    public final n b() {
        return this.f32513e;
    }

    public final boolean c() {
        return this.f32511c;
    }

    public final boolean d() {
        return this.f32510b;
    }

    public final boolean e() {
        return this.f32512d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f32509a == xVar.f32509a && this.f32510b == xVar.f32510b && this.f32511c == xVar.f32511c && this.f32512d == xVar.f32512d && this.f32513e == xVar.f32513e;
    }

    public final int hashCode() {
        int iHashCode = this.f32509a.hashCode() * 31;
        n nVar = this.f32513e;
        return ((((((iHashCode + a.a.a(this.f32510b)) * 31) + a.a.a(this.f32511c)) * 31) + a.a.a(this.f32512d)) * 31) + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "State(settings=" + this.f32509a + ", currentMobileNightMode=" + this.f32510b + ", currentCarNightMode=" + this.f32511c + ", daytime=" + this.f32512d + ", overrideValue=" + this.f32513e + ")";
    }
}
