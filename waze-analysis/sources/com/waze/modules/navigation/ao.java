package com.waze.modules.navigation;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final ah f30307a;

    /* renamed from: b, reason: collision with root package name */
    private final ak f30308b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30309c;

    /* renamed from: d, reason: collision with root package name */
    private final at f30310d;

    /* renamed from: e, reason: collision with root package name */
    private final as f30311e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30312f;

    /* renamed from: g, reason: collision with root package name */
    private final ar f30313g;

    /* renamed from: h, reason: collision with root package name */
    private final j f30314h;

    public /* synthetic */ ao(ah ahVar, ak akVar, j jVar, boolean z, at atVar, as asVar, boolean z2, ar arVar, int i2) {
        this(ahVar, akVar, (i2 & 4) != 0 ? null : jVar, (!((i2 & 8) == 0)) | z, (i2 & 16) != 0 ? at.f30323c : atVar, (i2 & 32) != 0 ? as.f30319c : asVar, ((i2 & 64) == 0) & z2, (i2 & 128) != 0 ? ap.f30315a : arVar);
    }

    public static /* synthetic */ ao i(ao aoVar, boolean z, at atVar, as asVar, int i2) {
        ah ahVar = (i2 & 1) != 0 ? aoVar.f30307a : null;
        ak akVar = (i2 & 2) != 0 ? aoVar.f30308b : null;
        j jVar = (i2 & 4) != 0 ? aoVar.f30314h : null;
        if ((i2 & 8) != 0) {
            z = aoVar.f30309c;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            atVar = aoVar.f30310d;
        }
        at atVar2 = atVar;
        if ((i2 & 32) != 0) {
            asVar = aoVar.f30311e;
        }
        as asVar2 = asVar;
        boolean z3 = aoVar.f30312f;
        ar arVar = aoVar.f30313g;
        h.g.b.x.f(ahVar, "caller");
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(atVar2, "navigateToWaypoint");
        h.g.b.x.f(asVar2, "showRouteSelectionUi");
        h.g.b.x.f(arVar, "routingSource");
        return new ao(ahVar, akVar, jVar, z2, atVar2, asVar2, z3, arVar);
    }

    public final ah a() {
        return this.f30307a;
    }

    public final ak b() {
        return this.f30308b;
    }

    public final ao c(boolean z) {
        return i(this, z, null, null, 247);
    }

    public final ar d() {
        return this.f30313g;
    }

    public final as e() {
        return this.f30311e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return this.f30307a == aoVar.f30307a && h.g.b.x.n(this.f30308b, aoVar.f30308b) && h.g.b.x.n(this.f30314h, aoVar.f30314h) && this.f30309c == aoVar.f30309c && this.f30310d == aoVar.f30310d && this.f30311e == aoVar.f30311e && this.f30312f == aoVar.f30312f && h.g.b.x.n(this.f30313g, aoVar.f30313g);
    }

    public final at f() {
        return this.f30310d;
    }

    public final boolean g() {
        return this.f30312f;
    }

    public final boolean h() {
        return this.f30309c;
    }

    public final int hashCode() {
        int iHashCode = (this.f30307a.hashCode() * 31) + this.f30308b.hashCode();
        j jVar = this.f30314h;
        return (((((((((((iHashCode * 31) + (jVar == null ? 0 : jVar.hashCode())) * 31) + a.a.a(this.f30309c)) * 31) + this.f30310d.hashCode()) * 31) + this.f30311e.hashCode()) * 31) + a.a.a(this.f30312f)) * 31) + this.f30313g.hashCode();
    }

    public final j j() {
        return this.f30314h;
    }

    public final String toString() {
        return "Params(caller=" + this.f30307a + ", destination=" + this.f30308b + ", origin=" + this.f30314h + ", storeDestination=" + this.f30309c + ", navigateToWaypoint=" + this.f30310d + ", showRouteSelectionUi=" + this.f30311e + ", resumeNavigation=" + this.f30312f + ", routingSource=" + this.f30313g + ")";
    }

    public ao(ah ahVar, ak akVar, j jVar, boolean z, at atVar, as asVar, boolean z2, ar arVar) {
        h.g.b.x.f(ahVar, "caller");
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(atVar, "navigateToWaypoint");
        h.g.b.x.f(asVar, "showRouteSelectionUi");
        h.g.b.x.f(arVar, "routingSource");
        this.f30307a = ahVar;
        this.f30308b = akVar;
        this.f30314h = jVar;
        this.f30309c = z;
        this.f30310d = atVar;
        this.f30311e = asVar;
        this.f30312f = z2;
        this.f30313g = arVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ao(ah ahVar, ak akVar) {
        this(ahVar, akVar, null, false, null, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5);
        h.g.b.x.f(ahVar, "caller");
        h.g.b.x.f(akVar, "destination");
    }
}
