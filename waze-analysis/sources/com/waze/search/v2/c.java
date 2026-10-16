package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.aq f36210a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.search.ap f36211b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.as f36212c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.search.at f36213d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.search.ba f36214e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.search.aw f36215f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.search.au f36216g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.search.av f36217h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.search.ar f36218i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.search.az f36219j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.search.ay f36220k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.search.ao f36221l;
    private final com.waze.search.ax m;

    public c(com.waze.search.aq aqVar, com.waze.search.ap apVar, com.waze.search.as asVar, com.waze.search.at atVar, com.waze.search.ba baVar, com.waze.search.aw awVar, com.waze.search.au auVar, com.waze.search.av avVar, com.waze.search.ar arVar, com.waze.search.az azVar, com.waze.search.ay ayVar, com.waze.search.ao aoVar, com.waze.search.ax axVar) {
        this.f36210a = aqVar;
        this.f36211b = apVar;
        this.f36212c = asVar;
        this.f36213d = atVar;
        this.f36214e = baVar;
        this.f36215f = awVar;
        this.f36216g = auVar;
        this.f36217h = avVar;
        this.f36218i = arVar;
        this.f36219j = azVar;
        this.f36220k = ayVar;
        this.f36221l = aoVar;
        this.m = axVar;
    }

    public static /* synthetic */ c n(c cVar, com.waze.search.aq aqVar, com.waze.search.ap apVar, com.waze.search.as asVar, com.waze.search.at atVar, com.waze.search.ba baVar, com.waze.search.aw awVar, com.waze.search.au auVar, com.waze.search.av avVar, com.waze.search.ar arVar, com.waze.search.az azVar, com.waze.search.ay ayVar, com.waze.search.ao aoVar, com.waze.search.ax axVar, int i2) {
        if ((i2 & 1) != 0) {
            aqVar = cVar.f36210a;
        }
        return new c(aqVar, (i2 & 2) != 0 ? cVar.f36211b : apVar, (i2 & 4) != 0 ? cVar.f36212c : asVar, (i2 & 8) != 0 ? cVar.f36213d : atVar, (i2 & 16) != 0 ? cVar.f36214e : baVar, (i2 & 32) != 0 ? cVar.f36215f : awVar, (i2 & 64) != 0 ? cVar.f36216g : auVar, (i2 & 128) != 0 ? cVar.f36217h : avVar, (i2 & 256) != 0 ? cVar.f36218i : arVar, (i2 & 512) != 0 ? cVar.f36219j : azVar, (i2 & 1024) != 0 ? cVar.f36220k : ayVar, (i2 & 2048) != 0 ? cVar.f36221l : aoVar, (i2 & 4096) != 0 ? cVar.m : axVar);
    }

    public final com.waze.search.ao a() {
        return this.f36221l;
    }

    public final com.waze.search.ap b() {
        return this.f36211b;
    }

    public final com.waze.search.aq c() {
        return this.f36210a;
    }

    public final com.waze.search.ar d() {
        return this.f36218i;
    }

    public final com.waze.search.as e() {
        return this.f36212c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f36210a, cVar.f36210a) && h.g.b.x.n(this.f36211b, cVar.f36211b) && h.g.b.x.n(this.f36212c, cVar.f36212c) && h.g.b.x.n(this.f36213d, cVar.f36213d) && h.g.b.x.n(this.f36214e, cVar.f36214e) && h.g.b.x.n(this.f36215f, cVar.f36215f) && h.g.b.x.n(this.f36216g, cVar.f36216g) && h.g.b.x.n(this.f36217h, cVar.f36217h) && h.g.b.x.n(this.f36218i, cVar.f36218i) && h.g.b.x.n(this.f36219j, cVar.f36219j) && h.g.b.x.n(this.f36220k, cVar.f36220k) && h.g.b.x.n(this.f36221l, cVar.f36221l) && h.g.b.x.n(this.m, cVar.m);
    }

    public final com.waze.search.at f() {
        return this.f36213d;
    }

    public final com.waze.search.au g() {
        return this.f36216g;
    }

    public final com.waze.search.av h() {
        return this.f36217h;
    }

    public final int hashCode() {
        com.waze.search.aq aqVar = this.f36210a;
        int iHashCode = aqVar == null ? 0 : aqVar.hashCode();
        com.waze.search.ap apVar = this.f36211b;
        int iHashCode2 = apVar == null ? 0 : apVar.hashCode();
        int i2 = iHashCode * 31;
        com.waze.search.as asVar = this.f36212c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (asVar == null ? 0 : asVar.hashCode())) * 31;
        com.waze.search.at atVar = this.f36213d;
        int iHashCode4 = (iHashCode3 + (atVar == null ? 0 : atVar.hashCode())) * 31;
        com.waze.search.ba baVar = this.f36214e;
        int iHashCode5 = (iHashCode4 + (baVar == null ? 0 : baVar.hashCode())) * 31;
        com.waze.search.aw awVar = this.f36215f;
        int iHashCode6 = (iHashCode5 + (awVar == null ? 0 : awVar.hashCode())) * 31;
        com.waze.search.au auVar = this.f36216g;
        int iHashCode7 = (((((((((((iHashCode6 + (auVar == null ? 0 : auVar.hashCode())) * 31) + (this.f36217h == null ? 0 : 1400698079)) * 31) + (this.f36218i == null ? 0 : 742526109)) * 31) + (this.f36219j == null ? 0 : -1786660)) * 31) + (this.f36220k == null ? 0 : 1925908717)) * 31) + (this.f36221l == null ? 0 : -1151587244)) * 31;
        com.waze.search.ax axVar = this.m;
        return iHashCode7 + (axVar != null ? axVar.hashCode() : 0);
    }

    public final com.waze.search.aw i() {
        return this.f36215f;
    }

    public final com.waze.search.ax j() {
        return this.m;
    }

    public final com.waze.search.ay k() {
        return this.f36220k;
    }

    public final com.waze.search.az l() {
        return this.f36219j;
    }

    public final com.waze.search.ba m() {
        return this.f36214e;
    }

    public final String toString() {
        return "FilterState(evPlug=" + this.f36210a + ", evNetwork=" + this.f36211b + ", fuelBrand=" + this.f36212c + ", fuelProduct=" + this.f36213d + ", viewRectangle=" + this.f36214e + ", parkNearVenue=" + this.f36215f + ", amenities=" + this.f36216g + ", openNow=" + this.f36217h + ", fastCharge=" + this.f36218i + ", topRated=" + this.f36219j + ", security=" + this.f36220k + ", drivethru=" + this.f36221l + ", price=" + this.m + ")";
    }

    public c() {
        this(null);
    }

    public /* synthetic */ c(byte[] bArr) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
