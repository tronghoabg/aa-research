package com.waze.sharedui.e;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f38869a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38870b;

    /* renamed from: c, reason: collision with root package name */
    private final float f38871c;

    /* renamed from: d, reason: collision with root package name */
    private final float f38872d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38873e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f38874f;

    /* renamed from: g, reason: collision with root package name */
    private final a f38875g;

    /* renamed from: h, reason: collision with root package name */
    private final d f38876h;

    public /* synthetic */ c(com.waze.shared_infra.h.c cVar, int i2, float f2, float f3, int i3, Long l2, d dVar, int i4) {
        this(cVar, i2, f2, f3, i3, (i4 & 32) != 0 ? null : l2, (a) null, (i4 & 128) != 0 ? d.f38877a : dVar);
    }

    public static /* synthetic */ c j(c cVar, a aVar) {
        com.waze.shared_infra.h.c cVar2 = cVar.f38869a;
        x.f(cVar2, "location");
        d dVar = cVar.f38876h;
        x.f(dVar, "provider");
        return new c(cVar2, cVar.f38870b, cVar.f38871c, cVar.f38872d, cVar.f38873e, cVar.f38874f, aVar, dVar);
    }

    public final float a() {
        return this.f38872d;
    }

    public final float b() {
        return this.f38871c;
    }

    public final int c() {
        return this.f38873e;
    }

    public final int d() {
        return this.f38870b;
    }

    public final int e() {
        return (int) Math.rint(this.f38871c * 3.5999999046325684d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f38869a, cVar.f38869a) && this.f38870b == cVar.f38870b && Float.compare(this.f38871c, cVar.f38871c) == 0 && Float.compare(this.f38872d, cVar.f38872d) == 0 && this.f38873e == cVar.f38873e && x.n(this.f38874f, cVar.f38874f) && x.n(this.f38875g, cVar.f38875g) && this.f38876h == cVar.f38876h;
    }

    public final com.waze.shared_infra.h.c f() {
        return this.f38869a;
    }

    public final a g() {
        return this.f38875g;
    }

    public final d h() {
        return this.f38876h;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f38869a.hashCode() * 31) + this.f38870b) * 31) + Float.floatToIntBits(this.f38871c)) * 31) + Float.floatToIntBits(this.f38872d);
        Long l2 = this.f38874f;
        int iHashCode2 = ((((iHashCode * 31) + this.f38873e) * 31) + (l2 == null ? 0 : l2.hashCode())) * 31;
        a aVar = this.f38875g;
        return ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f38876h.hashCode();
    }

    public final Long i() {
        return this.f38874f;
    }

    public final String toString() {
        return "WazeLocation(location=" + this.f38869a + ", altitude=" + this.f38870b + ", speedMetersPerSecond=" + this.f38871c + ", bearingDegrees=" + this.f38872d + ", accuracyMeters=" + this.f38873e + ", lastUpdateTimeEpochSec=" + this.f38874f + ", matcherInfo=" + this.f38875g + ", provider=" + this.f38876h + ")";
    }

    public c(com.waze.shared_infra.h.c cVar, int i2, float f2, float f3, int i3, Long l2, a aVar, d dVar) {
        x.f(cVar, "location");
        x.f(dVar, "provider");
        this.f38869a = cVar;
        this.f38870b = i2;
        this.f38871c = f2;
        this.f38872d = f3;
        this.f38873e = i3;
        this.f38874f = l2;
        this.f38875g = aVar;
        this.f38876h = dVar;
    }
}
