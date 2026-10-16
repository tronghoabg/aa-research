package com.waze.trip_overview;

import androidx.core.view.ViewCompat;
import i.b.l.ps;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41130a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f41131b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.modules.navigation.ak f41132c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.modules.c.dk f41133d;

    /* renamed from: e, reason: collision with root package name */
    private final long f41134e;

    /* renamed from: f, reason: collision with root package name */
    private final f f41135f;

    /* renamed from: g, reason: collision with root package name */
    private final long f41136g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f41137h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.modules.navigation.ah f41138i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f41139j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f41140k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.bo.a.e f41141l;
    private final h m;
    private final boolean n;
    private final long o;
    private final kotlinx.coroutines.br p;
    private final long q;
    private final com.waze.ui.ab.m r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final com.waze.modules.navigation.j v;
    private final com.waze.uid.c.al w;
    private final com.waze.speech.k x;

    public /* synthetic */ bw(long j2, boolean z, boolean z2, int i2) {
        com.waze.modules.c.dk dkVar;
        byte[] bArr = null;
        if ((i2 & 16) != 0) {
            ps defaultInstance = ps.getDefaultInstance();
            h.g.b.x.e(defaultInstance, "getDefaultInstance(...)");
            dkVar = new com.waze.modules.c.dk(defaultInstance, h.a.i.h(), -1L, null, 56);
        } else {
            dkVar = null;
        }
        this(1 == (i2 & 1), (i2 & 2) != 0, null, null, dkVar, (i2 & 32) != 0 ? -1L : 0L, (i2 & 64) != 0 ? f.f41451a : null, 0L, (i2 & 256) != 0 ? h.a.r.j() : null, null, false, (i2 & 2048) != 0 ? h.a.r.j() : null, null, (i2 & 8192) != 0 ? new h(bArr) : null, null, false, 0L, null, (262144 & i2) != 0 ? 0L : j2, null, null, ((2097152 & i2) == 0) & z, ((i2 & 4194304) == 0) & z2, false);
    }

    public static /* synthetic */ bw y(bw bwVar, boolean z, boolean z2, com.waze.modules.navigation.j jVar, com.waze.modules.navigation.ak akVar, com.waze.modules.c.dk dkVar, long j2, f fVar, long j3, Map map, com.waze.modules.navigation.ah ahVar, boolean z3, Map map2, com.waze.bo.a.e eVar, h hVar, com.waze.uid.c.al alVar, boolean z4, long j4, kotlinx.coroutines.br brVar, long j5, com.waze.speech.k kVar, com.waze.ui.ab.m mVar, boolean z5, int i2) {
        boolean z6;
        long j6;
        boolean z7 = (i2 & 1) != 0 ? bwVar.f41130a : z;
        boolean z8 = (i2 & 2) != 0 ? bwVar.f41131b : z2;
        com.waze.modules.navigation.j jVar2 = (i2 & 4) != 0 ? bwVar.v : jVar;
        com.waze.modules.navigation.ak akVar2 = (i2 & 8) != 0 ? bwVar.f41132c : akVar;
        com.waze.modules.c.dk dkVar2 = (i2 & 16) != 0 ? bwVar.f41133d : dkVar;
        long j7 = (i2 & 32) != 0 ? bwVar.f41134e : j2;
        f fVar2 = (i2 & 64) != 0 ? bwVar.f41135f : fVar;
        long j8 = (i2 & 128) != 0 ? bwVar.f41136g : j3;
        Map map3 = (i2 & 256) != 0 ? bwVar.f41137h : map;
        com.waze.modules.navigation.ah ahVar2 = (i2 & 512) != 0 ? bwVar.f41138i : ahVar;
        boolean z9 = (i2 & 1024) != 0 ? bwVar.f41139j : z3;
        Map map4 = (i2 & 2048) != 0 ? bwVar.f41140k : map2;
        com.waze.bo.a.e eVar2 = (i2 & 4096) != 0 ? bwVar.f41141l : eVar;
        h hVar2 = (i2 & 8192) != 0 ? bwVar.m : hVar;
        boolean z10 = z7;
        com.waze.uid.c.al alVar2 = (i2 & 16384) != 0 ? bwVar.w : alVar;
        boolean z11 = (32768 & i2) != 0 ? bwVar.n : z4;
        if ((65536 & i2) != 0) {
            z6 = z8;
            j6 = bwVar.o;
        } else {
            z6 = z8;
            j6 = j4;
        }
        kotlinx.coroutines.br brVar2 = (131072 & i2) != 0 ? bwVar.p : brVar;
        long j9 = (262144 & i2) != 0 ? bwVar.q : j5;
        com.waze.speech.k kVar2 = (524288 & i2) != 0 ? bwVar.x : kVar;
        com.waze.ui.ab.m mVar2 = (1048576 & i2) != 0 ? bwVar.r : mVar;
        boolean z12 = (2097152 & i2) != 0 ? bwVar.s : false;
        boolean z13 = (4194304 & i2) != 0 ? bwVar.t : false;
        boolean z14 = (i2 & 8388608) != 0 ? bwVar.u : z5;
        h.g.b.x.f(dkVar2, "routingResponse");
        h.g.b.x.f(fVar2, "displayMode");
        h.g.b.x.f(map3, "mapUuidToRouteId");
        h.g.b.x.f(map4, "labels");
        h.g.b.x.f(hVar2, "timer");
        return new bw(z10, z6, jVar2, akVar2, dkVar2, j7, fVar2, j8, map3, ahVar2, z9, map4, eVar2, hVar2, alVar2, z11, j6, brVar2, j9, kVar2, mVar2, z12, z13, z14);
    }

    public final long a() {
        return this.o;
    }

    public final long b() {
        return this.f41136g;
    }

    public final long c() {
        return this.f41133d.c();
    }

    public final long d() {
        return this.q;
    }

    public final long e() {
        return this.f41134e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return this.f41130a == bwVar.f41130a && this.f41131b == bwVar.f41131b && h.g.b.x.n(this.v, bwVar.v) && h.g.b.x.n(this.f41132c, bwVar.f41132c) && h.g.b.x.n(this.f41133d, bwVar.f41133d) && this.f41134e == bwVar.f41134e && this.f41135f == bwVar.f41135f && this.f41136g == bwVar.f41136g && h.g.b.x.n(this.f41137h, bwVar.f41137h) && this.f41138i == bwVar.f41138i && this.f41139j == bwVar.f41139j && h.g.b.x.n(this.f41140k, bwVar.f41140k) && h.g.b.x.n(this.f41141l, bwVar.f41141l) && h.g.b.x.n(this.m, bwVar.m) && h.g.b.x.n(this.w, bwVar.w) && this.n == bwVar.n && this.o == bwVar.o && h.g.b.x.n(this.p, bwVar.p) && this.q == bwVar.q && h.g.b.x.n(this.x, bwVar.x) && this.r == bwVar.r && this.s == bwVar.s && this.t == bwVar.t && this.u == bwVar.u;
    }

    public final com.waze.modules.navigation.ah f() {
        return this.f41138i;
    }

    public final com.waze.modules.navigation.ak g() {
        return this.f41132c;
    }

    public final com.waze.modules.c.dk h() {
        return this.f41133d;
    }

    public final int hashCode() {
        com.waze.modules.navigation.j jVar = this.v;
        int iHashCode = jVar == null ? 0 : jVar.hashCode();
        boolean z = this.f41131b;
        boolean z2 = this.f41130a;
        com.waze.modules.navigation.ak akVar = this.f41132c;
        int iA = (((((((((((((((a.a.a(z2) * 31) + a.a.a(z)) * 31) + iHashCode) * 31) + (akVar == null ? 0 : akVar.hashCode())) * 31) + this.f41133d.hashCode()) * 31) + a.a.b(this.f41134e)) * 31) + this.f41135f.hashCode()) * 31) + a.a.b(this.f41136g)) * 31) + this.f41137h.hashCode();
        com.waze.modules.navigation.ah ahVar = this.f41138i;
        int iHashCode2 = ((((((iA * 31) + (ahVar == null ? 0 : ahVar.hashCode())) * 31) + a.a.a(this.f41139j)) * 31) + this.f41140k.hashCode()) * 31;
        com.waze.bo.a.e eVar = this.f41141l;
        int iHashCode3 = (((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.m.hashCode()) * 31;
        com.waze.uid.c.al alVar = this.w;
        int iHashCode4 = (((((iHashCode3 + (alVar == null ? 0 : alVar.hashCode())) * 31) + a.a.a(this.n)) * 31) + a.a.b(this.o)) * 31;
        kotlinx.coroutines.br brVar = this.p;
        int iHashCode5 = (((iHashCode4 + (brVar == null ? 0 : brVar.hashCode())) * 31) + a.a.b(this.q)) * 31;
        com.waze.speech.k kVar = this.x;
        int iHashCode6 = (iHashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        com.waze.ui.ab.m mVar = this.r;
        return ((((((iHashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31) + a.a.a(this.s)) * 31) + a.a.a(this.t)) * 31) + a.a.a(this.u);
    }

    public final com.waze.bo.a.e i() {
        return this.f41141l;
    }

    public final f j() {
        return this.f41135f;
    }

    public final h k() {
        return this.m;
    }

    public final com.waze.ui.ab.m l() {
        return this.r;
    }

    public final Map m() {
        return this.f41140k;
    }

    public final Map n() {
        return this.f41137h;
    }

    public final kotlinx.coroutines.br o() {
        return this.p;
    }

    public final boolean p() {
        return this.s;
    }

    public final boolean q() {
        return this.t;
    }

    public final boolean r() {
        return this.f41131b;
    }

    public final boolean s() {
        return this.n;
    }

    public final boolean t() {
        return this.f41130a;
    }

    public final String toString() {
        return "TripOverviewDataModel(isScreenPortrait=" + this.f41130a + ", isDayMode=" + this.f41131b + ", origin=" + this.v + ", destination=" + this.f41132c + ", routingResponse=" + this.f41133d + ", selectedRouteId=" + this.f41134e + ", displayMode=" + this.f41135f + ", departureTimeInSeconds=" + this.f41136g + ", mapUuidToRouteId=" + this.f41137h + ", source=" + this.f41138i + ", reportedMapDataShown=" + this.f41139j + ", labels=" + this.f41140k + ", routeSettingsState=" + this.f41141l + ", timer=" + this.m + ", dialog=" + this.w + ", isRouteSettingsBottomSheetShown=" + this.n + ", boundsRefreshCounter=" + this.o + ", observeRoamingJob=" + this.p + ", screenFirstShownUtcMs=" + this.q + ", routesNotification=" + this.x + ", routesNotificationPopup=" + this.r + ", preferredRouteIsBestMessageFteShown=" + this.s + ", preferredRouteIsSlowerMessageFteShown=" + this.t + ", isVehicleTypeSelectorTooltipDismissedInSession=" + this.u + ")";
    }

    public final boolean u() {
        return this.u;
    }

    public final com.waze.modules.navigation.j v() {
        return this.v;
    }

    public final com.waze.uid.c.al w() {
        return this.w;
    }

    public final com.waze.speech.k x() {
        return this.x;
    }

    public bw(boolean z, boolean z2, com.waze.modules.navigation.j jVar, com.waze.modules.navigation.ak akVar, com.waze.modules.c.dk dkVar, long j2, f fVar, long j3, Map map, com.waze.modules.navigation.ah ahVar, boolean z3, Map map2, com.waze.bo.a.e eVar, h hVar, com.waze.uid.c.al alVar, boolean z4, long j4, kotlinx.coroutines.br brVar, long j5, com.waze.speech.k kVar, com.waze.ui.ab.m mVar, boolean z5, boolean z6, boolean z7) {
        h.g.b.x.f(dkVar, "routingResponse");
        h.g.b.x.f(fVar, "displayMode");
        h.g.b.x.f(map, "mapUuidToRouteId");
        h.g.b.x.f(map2, "labels");
        h.g.b.x.f(hVar, "timer");
        this.f41130a = z;
        this.f41131b = z2;
        this.v = jVar;
        this.f41132c = akVar;
        this.f41133d = dkVar;
        this.f41134e = j2;
        this.f41135f = fVar;
        this.f41136g = j3;
        this.f41137h = map;
        this.f41138i = ahVar;
        this.f41139j = z3;
        this.f41140k = map2;
        this.f41141l = eVar;
        this.m = hVar;
        this.w = alVar;
        this.n = z4;
        this.o = j4;
        this.p = brVar;
        this.q = j5;
        this.x = kVar;
        this.r = mVar;
        this.s = z5;
        this.t = z6;
        this.u = z7;
    }

    public bw() {
        this(0L, false, false, ViewCompat.MEASURED_SIZE_MASK);
    }
}
