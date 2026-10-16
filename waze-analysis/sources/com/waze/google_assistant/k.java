package com.waze.google_assistant;

import com.waze.AppServiceBroadcastReceiver;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.cr;
import com.waze.iu;
import com.waze.lm;
import com.waze.lt;
import com.waze.modules.navigation.bp;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.bt;
import com.waze.reports.di;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final aa f24207a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f24208b;

    /* renamed from: c, reason: collision with root package name */
    private final GoogleAssistantNativeManager f24209c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.reports_v2.c.k f24210d;

    /* renamed from: e, reason: collision with root package name */
    private final NativeManager f24211e;

    /* renamed from: f, reason: collision with root package name */
    private final DriveToNativeManager f24212f;

    /* renamed from: g, reason: collision with root package name */
    private final bp f24213g;

    /* renamed from: h, reason: collision with root package name */
    private final lm f24214h;

    /* renamed from: i, reason: collision with root package name */
    private final ConfigManager f24215i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.af f24216j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24217k;

    public k(aa aaVar, ah ahVar, GoogleAssistantNativeManager googleAssistantNativeManager, com.waze.reports_v2.c.k kVar, NativeManager nativeManager, DriveToNativeManager driveToNativeManager, bp bpVar, lm lmVar, ConfigManager configManager, kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aaVar, "googleAssistantManager");
        h.g.b.x.f(ahVar, "googleAssistantStatHelper");
        h.g.b.x.f(googleAssistantNativeManager, "googleAssistantNativeManager");
        h.g.b.x.f(kVar, "addUserReportUseCase");
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(bpVar, "startNavigationCoordinatorFactory");
        h.g.b.x.f(lmVar, "wazeActivityManager");
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(afVar, "bgScope");
        h.g.b.x.f(eVar, "logger");
        this.f24207a = aaVar;
        this.f24208b = ahVar;
        this.f24209c = googleAssistantNativeManager;
        this.f24210d = kVar;
        this.f24211e = nativeManager;
        this.f24212f = driveToNativeManager;
        this.f24213g = bpVar;
        this.f24214h = lmVar;
        this.f24215i = configManager;
        this.f24216j = afVar;
        this.f24217k = eVar;
    }

    static final h.ab e(k kVar, String str, cr crVar, boolean z, String str2) {
        kVar.x(str2, str, crVar, z);
        return h.ab.f48028a;
    }

    static final h.ab f(String str, cr crVar, boolean z, k kVar, String str2) {
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            String str4 = str;
            if (str4 == null || str4.length() == 0) {
                kVar.f24217k.g("no proto and no raw query, can't continue");
            } else {
                crVar.e(str, z);
            }
        } else {
            kVar.x(str2, str, crVar, z);
        }
        return h.ab.f48028a;
    }

    static final void v(k kVar) {
        kVar.f24211e.stopNavigation();
    }

    private final void x(String str, String str2, cr crVar, boolean z) {
        if (str == null) {
            return;
        }
        String str3 = String.format("googlePlaces.%s", Arrays.copyOf(new Object[]{h.n.o.ac(h.n.o.ad(h.n.o.ad(str, '/', '_'), '+', '-'), "=", "")}, 1));
        h.g.b.x.e(str3, "format(...)");
        com.waze.shared_infra.i.e eVar = this.f24217k;
        eVar.a("venueQuery=".concat(String.valueOf(str3)));
        DriveToNativeManager driveToNativeManager = this.f24212f;
        driveToNativeManager.setUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, new i(driveToNativeManager, this.f24213g, crVar, str2, z, eVar));
        iu.venueGet$default(this.f24211e, str3, 1, false, null, 8, null);
        this.f24208b.b(e.f24165d, d.f24156b);
    }

    private final void y(com.waze.reports_v2.b.at atVar, int i2, g gVar) {
        int i3 = di.v;
        kotlinx.coroutines.aj.z(this.f24216j, null, null, new j(this, atVar, i2, gVar, i2 == 1 ? f.f24174a : f.f24175b, null), 3);
    }

    private static final int z(String str, boolean z) {
        if (com.waze.location.q.g(ba.s, str, z)) {
            int i2 = di.v;
            return 2;
        }
        int i3 = di.v;
        return 1;
    }

    public final void g() {
        com.waze.sharedui.a.e eVarE = this.f24214h.e();
        if (eVarE != null) {
            eVarE.onBackPressed();
        }
        this.f24208b.a(e.q);
    }

    public final void h(String str, String str2, cr crVar, boolean z) {
        h.g.b.x.f(str, "baseEncodedResultSetForMapsClient");
        h.g.b.x.f(crVar, "helper");
        this.f24217k.e("handling search along route result set for maps client");
        this.f24209c.getBaseEncodedPlaceIdFromBaseEncodedResultSet(str, new h(this, str2, crVar, z, 0));
    }

    public final void i(String str, String str2, cr crVar, boolean z) {
        h.g.b.x.f(str, "encodedSessionState");
        h.g.b.x.f(crVar, "helper");
        this.f24209c.getBaseEncodedPlaceIdFromJsProtoEncodedSessionState(str, new h(str2, crVar, z, this, 1));
    }

    public final void j() {
        this.f24208b.a(e.f24166e);
        this.f24207a.v(ab.RECENTER_MAP);
    }

    public final void k(String str, String str2, boolean z) {
        com.waze.reports_v2.b.at atVar;
        g gVar;
        int iZ = z(str2, z);
        int i2 = di.v;
        if (iZ != 1) {
            atVar = com.waze.reports_v2.b.at.f34081i;
            gVar = g.f24181d;
        } else if (com.waze.location.q.g(ba.f24142a, str, z)) {
            atVar = com.waze.reports_v2.b.at.E;
            gVar = g.f24179b;
        } else if (com.waze.location.q.g(ba.f24143b, str, z)) {
            atVar = com.waze.reports_v2.b.at.F;
            gVar = g.f24180c;
        } else {
            atVar = com.waze.reports_v2.b.at.f34079g;
            gVar = g.f24178a;
        }
        y(atVar, iZ, gVar);
    }

    public final void l(String str, String str2, String str3, boolean z) {
        com.waze.reports_v2.b.at atVar;
        g gVar;
        int iZ = z(str2, z);
        int i2 = di.v;
        if (iZ == 2) {
            this.f24217k.e("Ignoring other side hazard report - not supported");
            return;
        }
        if (com.waze.location.q.g(ba.f24144c, str, z)) {
            atVar = com.waze.reports_v2.b.at.A;
            gVar = g.f24189l;
        } else if (com.waze.location.q.g(ba.f24145d, str, z)) {
            atVar = com.waze.reports_v2.b.at.B;
            gVar = g.m;
        } else if (com.waze.location.q.g(ba.f24146e, str, z)) {
            atVar = com.waze.reports_v2.b.at.q;
            gVar = g.n;
        } else if (com.waze.location.q.g(ba.f24147f, str, z)) {
            atVar = com.waze.reports_v2.b.at.u;
            gVar = g.o;
        } else if (com.waze.location.q.g(ba.f24148g, str, z)) {
            atVar = com.waze.reports_v2.b.at.z;
            gVar = g.p;
        } else if (com.waze.location.q.g(ba.f24149h, str, z)) {
            atVar = com.waze.reports_v2.b.at.t;
            gVar = g.q;
        } else if (com.waze.location.q.g(ba.f24150i, str, z)) {
            atVar = com.waze.reports_v2.b.at.s;
            gVar = g.r;
        } else if (com.waze.location.q.g(ba.f24151j, str, z)) {
            atVar = com.waze.reports_v2.b.at.f34084l;
            gVar = g.s;
        } else if (com.waze.location.q.g(ba.f24152k, str, z)) {
            atVar = com.waze.reports_v2.b.at.C;
            gVar = g.t;
        } else if (com.waze.location.q.g(ba.f24153l, str, z)) {
            boolean zG = com.waze.location.q.g(ba.t, str3, z);
            com.waze.reports_v2.b.at atVar2 = zG ? com.waze.reports_v2.b.at.D : com.waze.reports_v2.b.at.n;
            gVar = zG ? g.v : g.u;
            atVar = atVar2;
        } else if (com.waze.location.q.g(ba.m, str, z)) {
            atVar = com.waze.reports_v2.b.at.o;
            gVar = g.w;
        } else if (com.waze.location.q.g(ba.n, str, z)) {
            atVar = com.waze.reports_v2.b.at.m;
            gVar = g.x;
        } else if (com.waze.location.q.g(ba.o, str, z)) {
            atVar = com.waze.reports_v2.b.at.f34083k;
            gVar = g.y;
        } else {
            atVar = com.waze.reports_v2.b.at.f34082j;
            gVar = g.f24188k;
        }
        y(atVar, 1, gVar);
    }

    public final void m(String str, boolean z) {
        com.waze.reports_v2.b.at atVar;
        g gVar;
        int iZ = z(str, z);
        int i2 = di.v;
        if (iZ == 1) {
            atVar = com.waze.reports_v2.b.at.f34075c;
            gVar = g.f24182e;
        } else {
            atVar = com.waze.reports_v2.b.at.f34078f;
            gVar = g.f24183f;
        }
        y(atVar, iZ, gVar);
    }

    public final void n(String str, String str2, boolean z) {
        com.waze.reports_v2.b.at atVar;
        g gVar;
        int iZ = z(str2, z);
        int i2 = di.v;
        if (iZ == 2) {
            this.f24217k.e("Ignoring other side traffic report - not supported");
            return;
        }
        if (com.waze.location.q.g(ba.p, str, z)) {
            atVar = com.waze.reports_v2.b.at.G;
            gVar = g.f24185h;
        } else if (com.waze.location.q.g(ba.q, str, z)) {
            atVar = com.waze.reports_v2.b.at.H;
            gVar = g.f24186i;
        } else if (com.waze.location.q.g(ba.r, str, z)) {
            atVar = com.waze.reports_v2.b.at.f34074b;
            gVar = g.f24187j;
        } else {
            atVar = com.waze.reports_v2.b.at.f34073a;
            gVar = g.f24184g;
        }
        y(atVar, 1, gVar);
    }

    public final void o() {
        this.f24208b.a(e.f24164c);
    }

    public final void p(boolean z) {
        this.f24215i.setConfigValueString(ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE, true != z ? "no" : "yes");
        this.f24208b.b(e.n, z ? d.f24158d : d.f24157c);
        this.f24207a.v(ab.NAVIGATION_GUIDANCE_CHANGED);
    }

    public final void q() {
        this.f24208b.a(e.f24163b);
        this.f24207a.v(ab.SHOW_ALTERNATE_ROUTES);
    }

    public final void r() {
        this.f24208b.a(e.f24173l);
        this.f24207a.v(ab.SHOW_DIRECTIONS);
    }

    public final void s() {
        this.f24208b.a(e.p);
        long j2 = com.waze.t.f40624a;
        AppServiceBroadcastReceiver.a(new lt(), 0L);
        this.f24207a.v(ab.SHOW_MAP);
    }

    public final void t() {
        this.f24208b.a(e.f24167f);
        this.f24207a.v(ab.SHOW_ROUTE_OVERVIEW);
    }

    public final void u() {
        NativeManager.Post(new p(this, 1));
        this.f24208b.a(e.m);
    }

    public final void w(com.waze.config.b bVar, boolean z, e eVar) {
        h.g.b.x.f(bVar, "config");
        h.g.b.x.f(eVar, "analyticsEvent");
        ConfigManager configManager = this.f24215i;
        if (configManager.getConfigValueBool(bVar) != z) {
            configManager.setConfigValueBool(bVar, z);
            bt.reroute$default(this.f24212f, false, null, 2, null);
        }
        this.f24208b.b(eVar, z ? d.f24158d : d.f24157c);
    }
}
