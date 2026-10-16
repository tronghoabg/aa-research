package com.waze.trip_overview.c.a;

import com.waze.trip_overview.aq;
import com.waze.trip_overview.as;
import com.waze.trip_overview.ax;
import com.waze.trip_overview.bs;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af {

    /* renamed from: a, reason: collision with root package name */
    private final as f41172a;

    /* renamed from: b, reason: collision with root package name */
    private final ac f41173b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f41174c;

    /* renamed from: d, reason: collision with root package name */
    private final ad f41175d;

    /* renamed from: e, reason: collision with root package name */
    private final ax f41176e;

    /* renamed from: f, reason: collision with root package name */
    private final aq f41177f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.ui.ab.m f41178g;

    /* renamed from: h, reason: collision with root package name */
    private final bs f41179h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.uid.c.al f41180i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.speech.k f41181j;

    public af(as asVar, ac acVar, ae aeVar, ad adVar, ax axVar, com.waze.uid.c.al alVar, aq aqVar, com.waze.speech.k kVar, com.waze.ui.ab.m mVar, bs bsVar) {
        h.g.b.x.f(asVar, "header");
        h.g.b.x.f(acVar, "mainButton");
        h.g.b.x.f(aeVar, "routeDetails");
        h.g.b.x.f(adVar, "mapData");
        h.g.b.x.f(axVar, "routeSettings");
        h.g.b.x.f(bsVar, "vehicleTypeSelectorState");
        this.f41172a = asVar;
        this.f41173b = acVar;
        this.f41174c = aeVar;
        this.f41175d = adVar;
        this.f41176e = axVar;
        this.f41180i = alVar;
        this.f41177f = aqVar;
        this.f41181j = kVar;
        this.f41178g = mVar;
        this.f41179h = bsVar;
    }

    public final aq a() {
        return this.f41177f;
    }

    public final as b() {
        return this.f41172a;
    }

    public final ax c() {
        return this.f41176e;
    }

    public final bs d() {
        return this.f41179h;
    }

    public final ac e() {
        return this.f41173b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return h.g.b.x.n(this.f41172a, afVar.f41172a) && h.g.b.x.n(this.f41173b, afVar.f41173b) && h.g.b.x.n(this.f41174c, afVar.f41174c) && h.g.b.x.n(this.f41175d, afVar.f41175d) && h.g.b.x.n(this.f41176e, afVar.f41176e) && h.g.b.x.n(this.f41180i, afVar.f41180i) && h.g.b.x.n(this.f41177f, afVar.f41177f) && h.g.b.x.n(this.f41181j, afVar.f41181j) && this.f41178g == afVar.f41178g && h.g.b.x.n(this.f41179h, afVar.f41179h);
    }

    public final ad f() {
        return this.f41175d;
    }

    public final ae g() {
        return this.f41174c;
    }

    public final com.waze.ui.ab.m h() {
        return this.f41178g;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f41172a.hashCode() * 31) + this.f41173b.hashCode()) * 31) + this.f41174c.hashCode()) * 31) + this.f41175d.hashCode()) * 31) + this.f41176e.hashCode();
        com.waze.uid.c.al alVar = this.f41180i;
        int iHashCode2 = ((iHashCode * 31) + (alVar == null ? 0 : alVar.hashCode())) * 31;
        aq aqVar = this.f41177f;
        int iHashCode3 = (iHashCode2 + (aqVar == null ? 0 : aqVar.hashCode())) * 31;
        com.waze.speech.k kVar = this.f41181j;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        com.waze.ui.ab.m mVar = this.f41178g;
        return ((iHashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31) + this.f41179h.hashCode();
    }

    public final com.waze.uid.c.al i() {
        return this.f41180i;
    }

    public final com.waze.speech.k j() {
        return this.f41181j;
    }

    public final String toString() {
        return "ScreenData(header=" + this.f41172a + ", mainButton=" + this.f41173b + ", routeDetails=" + this.f41174c + ", mapData=" + this.f41175d + ", routeSettings=" + this.f41176e + ", dialog=" + this.f41180i + ", generateEtaLabelsRequest=" + this.f41177f + ", routesNotification=" + this.f41181j + ", routesNotificationPopup=" + this.f41178g + ", vehicleTypeSelectorState=" + this.f41179h + ")";
    }
}
