package com.waze.trip_overview;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.bi f41099a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.canvas.a.b f41100b;

    /* renamed from: c, reason: collision with root package name */
    private final ax f41101c;

    /* renamed from: d, reason: collision with root package name */
    private final as f41102d;

    /* renamed from: e, reason: collision with root package name */
    private final long f41103e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f41104f;

    /* renamed from: g, reason: collision with root package name */
    private final List f41105g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.q.a f41106h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.av.b.n f41107i;

    /* renamed from: j, reason: collision with root package name */
    private final aq f41108j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.ui.ab.m f41109k;

    /* renamed from: l, reason: collision with root package name */
    private final bs f41110l;
    private final com.waze.uid.r m;
    private final com.waze.uid.c.al n;
    private final com.waze.speech.k o;

    public bp(com.waze.map.b.bi biVar, com.waze.map.canvas.a.b bVar, com.waze.uid.r rVar, ax axVar, as asVar, long j2, boolean z, List list, com.waze.shared_infra.q.a aVar, com.waze.av.b.n nVar, aq aqVar, com.waze.uid.c.al alVar, com.waze.speech.k kVar, com.waze.ui.ab.m mVar, bs bsVar) {
        h.g.b.x.f(biVar, "mapContent");
        h.g.b.x.f(bVar, "mapBounds");
        h.g.b.x.f(rVar, "tripOverviewButtonSetup");
        h.g.b.x.f(axVar, "routeSettings");
        h.g.b.x.f(list, "routes");
        h.g.b.x.f(bsVar, "vehicleTypeSelectorState");
        this.f41099a = biVar;
        this.f41100b = bVar;
        this.m = rVar;
        this.f41101c = axVar;
        this.f41102d = asVar;
        this.f41103e = j2;
        this.f41104f = z;
        this.f41105g = list;
        this.f41106h = aVar;
        this.f41107i = nVar;
        this.f41108j = aqVar;
        this.n = alVar;
        this.o = kVar;
        this.f41109k = mVar;
        this.f41110l = bsVar;
    }

    public final long a() {
        return this.f41103e;
    }

    public final com.waze.map.canvas.a.b b() {
        return this.f41100b;
    }

    public final com.waze.map.b.bi c() {
        return this.f41099a;
    }

    public final com.waze.av.b.n d() {
        return this.f41107i;
    }

    public final com.waze.shared_infra.q.a e() {
        return this.f41106h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return h.g.b.x.n(this.f41099a, bpVar.f41099a) && h.g.b.x.n(this.f41100b, bpVar.f41100b) && h.g.b.x.n(this.m, bpVar.m) && h.g.b.x.n(this.f41101c, bpVar.f41101c) && h.g.b.x.n(this.f41102d, bpVar.f41102d) && this.f41103e == bpVar.f41103e && this.f41104f == bpVar.f41104f && h.g.b.x.n(this.f41105g, bpVar.f41105g) && h.g.b.x.n(this.f41106h, bpVar.f41106h) && h.g.b.x.n(this.f41107i, bpVar.f41107i) && h.g.b.x.n(this.f41108j, bpVar.f41108j) && h.g.b.x.n(this.n, bpVar.n) && h.g.b.x.n(this.o, bpVar.o) && this.f41109k == bpVar.f41109k && h.g.b.x.n(this.f41110l, bpVar.f41110l);
    }

    public final aq f() {
        return this.f41108j;
    }

    public final as g() {
        return this.f41102d;
    }

    public final ax h() {
        return this.f41101c;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((this.f41099a.hashCode() * 31) + this.f41100b.hashCode()) * 31) + this.m.hashCode()) * 31) + this.f41101c.hashCode()) * 31) + this.f41102d.hashCode()) * 31) + a.a.b(this.f41103e)) * 31) + a.a.a(this.f41104f)) * 31) + this.f41105g.hashCode();
        com.waze.shared_infra.q.a aVar = this.f41106h;
        int iHashCode2 = ((iHashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.waze.av.b.n nVar = this.f41107i;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        aq aqVar = this.f41108j;
        int iHashCode4 = (iHashCode3 + (aqVar == null ? 0 : aqVar.hashCode())) * 31;
        com.waze.uid.c.al alVar = this.n;
        int iHashCode5 = (iHashCode4 + (alVar == null ? 0 : alVar.hashCode())) * 31;
        com.waze.speech.k kVar = this.o;
        int iHashCode6 = (iHashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        com.waze.ui.ab.m mVar = this.f41109k;
        return ((iHashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31) + this.f41110l.hashCode();
    }

    public final bs i() {
        return this.f41110l;
    }

    public final com.waze.ui.ab.m j() {
        return this.f41109k;
    }

    public final List k() {
        return this.f41105g;
    }

    public final boolean l() {
        return this.f41104f;
    }

    public final com.waze.uid.r m() {
        return this.m;
    }

    public final com.waze.uid.c.al n() {
        return this.n;
    }

    public final com.waze.speech.k o() {
        return this.o;
    }

    public final String toString() {
        return "TripOverviewData(mapContent=" + this.f41099a + ", mapBounds=" + this.f41100b + ", tripOverviewButtonSetup=" + this.m + ", routeSettings=" + this.f41101c + ", headerData=" + this.f41102d + ", selectedRouteId=" + this.f41103e + ", isNow=" + this.f41104f + ", routes=" + this.f41105g + ", timeout=" + this.f41106h + ", destination=" + this.f41107i + ", generateEtaLabelsRequest=" + this.f41108j + ", dialog=" + this.n + ", routesNotification=" + this.o + ", routesNotificationPopup=" + this.f41109k + ", vehicleTypeSelectorState=" + this.f41110l + ")";
    }
}
