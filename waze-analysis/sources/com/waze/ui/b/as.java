package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final int f42017a;

    /* renamed from: b, reason: collision with root package name */
    private final long f42018b;

    /* renamed from: c, reason: collision with root package name */
    private final long f42019c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42020d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.p f42021e;

    public /* synthetic */ as(int i2, long j2, long j3, boolean z, h.g.a.p pVar) {
        h.g.b.x.f(pVar, "onToggleChanged");
        this.f42017a = i2;
        this.f42018b = j2;
        this.f42019c = j3;
        this.f42020d = z;
        this.f42021e = pVar;
    }

    public final int a() {
        return this.f42017a;
    }

    public final long b() {
        return this.f42018b;
    }

    public final long c() {
        return this.f42019c;
    }

    public final h.g.a.p d() {
        return this.f42021e;
    }

    public final boolean e() {
        return this.f42020d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return this.f42017a == asVar.f42017a && h.o.a.A(this.f42018b, asVar.f42018b) && h.o.a.A(this.f42019c, asVar.f42019c) && this.f42020d == asVar.f42020d && h.g.b.x.n(this.f42021e, asVar.f42021e);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        int i2 = this.f42017a * 31;
        h.g.a.p pVar = this.f42021e;
        boolean z = this.f42020d;
        return ((((((i2 + a.a.b(this.f42018b)) * 31) + a.a.b(this.f42019c)) * 31) + a.a.a(z)) * 31) + pVar.hashCode();
    }

    public final String toString() {
        long j2 = this.f42019c;
        return "HovLaneState(minPassengers=" + this.f42017a + ", durationSaving=" + h.o.a.y(this.f42018b) + ", durationSavingThreshold=" + h.o.a.y(j2) + ", enabled=" + this.f42020d + ", onToggleChanged=" + this.f42021e + ")";
    }
}
