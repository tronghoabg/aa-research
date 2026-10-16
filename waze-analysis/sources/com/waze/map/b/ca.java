package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28124a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28125b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28126c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28127d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f28128e;

    /* renamed from: f, reason: collision with root package name */
    private final dy f28129f;

    /* renamed from: g, reason: collision with root package name */
    private final dl f28130g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28131h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f28132i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.map.g.t f28133j;

    public /* synthetic */ ca(boolean z, com.waze.map.g.t tVar, boolean z2, dy dyVar, dl dlVar, int i2) {
        this(1 == (((i2 & 1) ^ 1) & (z ? 1 : 0)), (i2 & 2) != 0 ? du.f28224a : tVar, ((i2 & 4) == 0) & z2, false, false, false, (i2 & 64) != 0 ? null : dyVar, (i2 & 128) != 0 ? new dl(false, false, false, false, 63) : dlVar, false, false);
    }

    public static /* synthetic */ ca j(ca caVar, boolean z, boolean z2, int i2) {
        boolean z3 = (i2 & 1) != 0 ? caVar.f28124a : false;
        com.waze.map.g.t tVar = (i2 & 2) != 0 ? caVar.f28133j : null;
        boolean z4 = (i2 & 4) != 0 ? caVar.f28125b : false;
        boolean z5 = (i2 & 8) != 0 ? caVar.f28126c : false;
        boolean z6 = (i2 & 16) != 0 ? caVar.f28127d : z;
        boolean z7 = (i2 & 32) != 0 ? caVar.f28128e : false;
        dy dyVar = (i2 & 64) != 0 ? caVar.f28129f : null;
        dl dlVar = (i2 & 128) != 0 ? caVar.f28130g : null;
        boolean z8 = (i2 & 256) != 0 ? caVar.f28131h : false;
        boolean z9 = (i2 & 512) != 0 ? caVar.f28132i : z2;
        h.g.b.x.f(tVar, "showRealtimeAlerts");
        h.g.b.x.f(dlVar, "mapPois");
        return new ca(z3, tVar, z4, z5, z6, z7, dyVar, dlVar, z8, z9);
    }

    public final dl a() {
        return this.f28130g;
    }

    public final dy b() {
        return this.f28129f;
    }

    public final boolean c() {
        return this.f28131h;
    }

    public final boolean d() {
        return this.f28127d;
    }

    public final boolean e() {
        return this.f28132i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return this.f28124a == caVar.f28124a && h.g.b.x.n(this.f28133j, caVar.f28133j) && this.f28125b == caVar.f28125b && this.f28126c == caVar.f28126c && this.f28127d == caVar.f28127d && this.f28128e == caVar.f28128e && h.g.b.x.n(this.f28129f, caVar.f28129f) && h.g.b.x.n(this.f28130g, caVar.f28130g) && this.f28131h == caVar.f28131h && this.f28132i == caVar.f28132i;
    }

    public final boolean f() {
        return this.f28126c;
    }

    public final boolean g() {
        return this.f28125b;
    }

    public final boolean h() {
        return this.f28124a;
    }

    public final int hashCode() {
        int iA = (a.a.a(this.f28124a) * 31) + this.f28133j.hashCode();
        dy dyVar = this.f28129f;
        int iHashCode = dyVar == null ? 0 : dyVar.hashCode();
        boolean z = this.f28128e;
        return (((((((((((((((iA * 31) + a.a.a(this.f28125b)) * 31) + a.a.a(this.f28126c)) * 31) + a.a.a(this.f28127d)) * 31) + a.a.a(z)) * 31) + iHashCode) * 31) + this.f28130g.hashCode()) * 31) + a.a.a(this.f28131h)) * 31) + a.a.a(this.f28132i);
    }

    public final boolean i() {
        return this.f28128e;
    }

    public final com.waze.map.g.t k() {
        return this.f28133j;
    }

    public final String toString() {
        return "AdditionalContent(showUserLocation=" + this.f28124a + ", showRealtimeAlerts=" + this.f28133j + ", showRealtimeTraffic=" + this.f28125b + ", showRealtimeExternalPoi=" + this.f28126c + ", showAds=" + this.f28127d + ", showWazers=" + this.f28128e + ", showTileAlerts=" + this.f28129f + ", mapPois=" + this.f28130g + ", enableObjectSampler=" + this.f28131h + ", showCyclists=" + this.f28132i + ")";
    }

    public ca(boolean z, com.waze.map.g.t tVar, boolean z2, boolean z3, boolean z4, boolean z5, dy dyVar, dl dlVar, boolean z6, boolean z7) {
        h.g.b.x.f(tVar, "showRealtimeAlerts");
        h.g.b.x.f(dlVar, "mapPois");
        this.f28124a = z;
        this.f28133j = tVar;
        this.f28125b = z2;
        this.f28126c = z3;
        this.f28127d = z4;
        this.f28128e = z5;
        this.f28129f = dyVar;
        this.f28130g = dlVar;
        this.f28131h = z6;
        this.f28132i = z7;
    }

    public ca() {
        this(false, null, false, null, null, 1023);
    }
}
