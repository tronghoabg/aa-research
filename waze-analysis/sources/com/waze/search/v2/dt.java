package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dt {

    /* renamed from: a, reason: collision with root package name */
    private final cz f36383a;

    /* renamed from: b, reason: collision with root package name */
    private final fo f36384b;

    /* renamed from: c, reason: collision with root package name */
    private final a f36385c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.c f36386d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36387e;

    /* renamed from: f, reason: collision with root package name */
    private final d f36388f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f36389g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f36390h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.speech.k f36391i;

    public dt(cz czVar, fo foVar, a aVar, com.waze.speech.k kVar, com.waze.ui.c cVar, boolean z, d dVar, boolean z2, boolean z3) {
        h.g.b.x.f(czVar, "mapData");
        h.g.b.x.f(foVar, "sheetContent");
        h.g.b.x.f(kVar, "outcome");
        this.f36383a = czVar;
        this.f36384b = foVar;
        this.f36385c = aVar;
        this.f36391i = kVar;
        this.f36386d = cVar;
        this.f36387e = z;
        this.f36388f = dVar;
        this.f36389g = z2;
        this.f36390h = z3;
    }

    public static /* synthetic */ dt j(dt dtVar, cz czVar, com.waze.speech.k kVar, com.waze.ui.c cVar, boolean z, d dVar, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            czVar = dtVar.f36383a;
        }
        cz czVar2 = czVar;
        fo foVar = (i2 & 2) != 0 ? dtVar.f36384b : null;
        a aVar = (i2 & 4) != 0 ? dtVar.f36385c : null;
        if ((i2 & 8) != 0) {
            kVar = dtVar.f36391i;
        }
        com.waze.speech.k kVar2 = kVar;
        com.waze.ui.c cVar2 = (i2 & 16) != 0 ? dtVar.f36386d : cVar;
        boolean z4 = (i2 & 32) != 0 ? dtVar.f36387e : z;
        d dVar2 = (i2 & 64) != 0 ? dtVar.f36388f : dVar;
        boolean z5 = (i2 & 128) != 0 ? dtVar.f36389g : z2;
        boolean z6 = (i2 & 256) != 0 ? dtVar.f36390h : z3;
        h.g.b.x.f(czVar2, "mapData");
        h.g.b.x.f(foVar, "sheetContent");
        h.g.b.x.f(kVar2, "outcome");
        return new dt(czVar2, foVar, aVar, kVar2, cVar2, z4, dVar2, z5, z6);
    }

    public final a a() {
        return this.f36385c;
    }

    public final d b() {
        return this.f36388f;
    }

    public final cz c() {
        return this.f36383a;
    }

    public final fo d() {
        return this.f36384b;
    }

    public final com.waze.ui.c e() {
        return this.f36386d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt)) {
            return false;
        }
        dt dtVar = (dt) obj;
        return h.g.b.x.n(this.f36383a, dtVar.f36383a) && h.g.b.x.n(this.f36384b, dtVar.f36384b) && h.g.b.x.n(this.f36385c, dtVar.f36385c) && h.g.b.x.n(this.f36391i, dtVar.f36391i) && h.g.b.x.n(this.f36386d, dtVar.f36386d) && this.f36387e == dtVar.f36387e && h.g.b.x.n(this.f36388f, dtVar.f36388f) && this.f36389g == dtVar.f36389g && this.f36390h == dtVar.f36390h;
    }

    public final boolean f() {
        return this.f36390h;
    }

    public final boolean g() {
        return this.f36389g;
    }

    public final boolean h() {
        return this.f36387e;
    }

    public final int hashCode() {
        int iHashCode = (this.f36383a.hashCode() * 31) + this.f36384b.hashCode();
        a aVar = this.f36385c;
        int iHashCode2 = ((((iHashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f36391i.hashCode()) * 31;
        com.waze.ui.c cVar = this.f36386d;
        int iHashCode3 = (((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31) + a.a.a(this.f36387e)) * 31;
        d dVar = this.f36388f;
        return ((((iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31) + a.a.a(this.f36389g)) * 31) + a.a.a(this.f36390h);
    }

    public final com.waze.speech.k i() {
        return this.f36391i;
    }

    public final String toString() {
        return "SearchV2State(mapData=" + this.f36383a + ", sheetContent=" + this.f36384b + ", actionButton=" + this.f36385c + ", outcome=" + this.f36391i + ", bottomMenu=" + this.f36386d + ", updateCurrentBottomMenu=" + this.f36387e + ", legalPopup=" + this.f36388f + ", showSearchInArea=" + this.f36389g + ", showRecenter=" + this.f36390h + ")";
    }
}
