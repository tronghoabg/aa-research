package com.waze.car_lib.b;

import androidx.car.app.CarContext;
import androidx.car.app.CarToast;
import androidx.car.app.model.CarColor;
import com.waze.AlerterController$Alerter$Type;
import com.waze.ConfigManager;
import com.waze.MessageBoxNativeManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.car_lib.p.dc;
import com.waze.car_lib.p.dd;
import com.waze.car_lib.p.dg;
import com.waze.config.ConfigValues;
import com.waze.gb;
import com.waze.iv;
import com.waze.iw;
import com.waze.jh;
import com.waze.ji;
import com.waze.jk;
import com.waze.jl;
import com.waze.jm;
import com.waze.jn;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.jo;
import com.waze.jp;
import com.waze.jq;
import com.waze.jr;
import com.waze.js;
import com.waze.jt;
import com.waze.ju;
import com.waze.jv;
import com.waze.jw;
import com.waze.jx;
import com.waze.jy;
import com.waze.jz;
import com.waze.ka;
import com.waze.kd;
import com.waze.mo;
import com.waze.modules.c.dj;
import com.waze.settings.ds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap implements org.a.d.a.a {
    private r A;

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18981a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.b.g f18982b;

    /* renamed from: c, reason: collision with root package name */
    private final kd f18983c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f18984d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigManager f18985e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.navigate.b.g f18986f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.l.d f18987g;

    /* renamed from: h, reason: collision with root package name */
    private final MessageBoxNativeManager f18988h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.i.a.ac f18989i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.map.b.n f18990j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.car_lib.a f18991k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.car_lib.g.j f18992l;
    private final com.waze.navigate.a.f m;
    private final NativeManager n;
    private final s o;
    private final com.waze.ac.r p;
    private final com.waze.ac.b.e q;
    private final com.waze.ac.b.b r;
    private final h.f s;
    private final kotlinx.coroutines.b.bn t;
    private final kotlinx.coroutines.b.bm u;
    private final kotlinx.coroutines.b.bn v;
    private final kotlinx.coroutines.b.bm w;
    private int x;
    private com.waze.car_lib.i.a.aa y;
    private Float z;

    public ap(com.waze.shared_infra.i.e eVar, com.waze.an.b.g gVar, kd kdVar, com.waze.shared_infra.o.a aVar, ConfigManager configManager, com.waze.navigate.b.g gVar2, com.waze.car_lib.l.d dVar, MessageBoxNativeManager messageBoxNativeManager, com.waze.car_lib.i.a.ac acVar, com.waze.map.b.n nVar, com.waze.car_lib.a aVar2, com.waze.car_lib.g.j jVar, com.waze.navigate.a.f fVar, NativeManager nativeManager, s sVar, com.waze.ac.r rVar, com.waze.ac.b.e eVar2, com.waze.ac.b.b bVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(gVar, "insightPolicy");
        h.g.b.x.f(kdVar, "popupController");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(gVar2, "navigationStatsSender");
        h.g.b.x.f(dVar, "errorController");
        h.g.b.x.f(messageBoxNativeManager, "msgBox");
        h.g.b.x.f(acVar, "mapLoaderController");
        h.g.b.x.f(nVar, "mainMapController");
        h.g.b.x.f(aVar2, "aaHost");
        h.g.b.x.f(jVar, "lcvController");
        h.g.b.x.f(fVar, "inCarDeeplinkActionsController");
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(sVar, "config");
        h.g.b.x.f(rVar, "encouragementsStatsSender");
        h.g.b.x.f(eVar2, "engagementDisplayedSender");
        h.g.b.x.f(bVar, "engagementButtonClickedSender");
        this.f18981a = eVar;
        this.f18982b = gVar;
        this.f18983c = kdVar;
        this.f18984d = aVar;
        this.f18985e = configManager;
        this.f18986f = gVar2;
        this.f18987g = dVar;
        this.f18988h = messageBoxNativeManager;
        this.f18989i = acVar;
        this.f18990j = nVar;
        this.f18991k = aVar2;
        this.f18992l = jVar;
        this.m = fVar;
        this.n = nativeManager;
        this.o = sVar;
        this.p = rVar;
        this.q = eVar2;
        this.r = bVar;
        this.s = h.g.b(h.h.f48130a, new m((org.a.d.a.a) this, 6));
        this.t = ck.b(null);
        this.u = bu.e(1, 32, null, 4);
        this.v = ck.b(null);
        this.w = bu.c(1, 32, kotlinx.coroutines.a.a.f51272b);
    }

    public static final /* synthetic */ void F(ap apVar, r rVar) {
        if (rVar == null) {
            apVar.P(new u(com.waze.alerters.a.a.f14135d));
            apVar.t.e(null);
        } else {
            apVar.t.e(rVar.i().isEmpty() ? r.m(rVar, h.a.i.d(new q(apVar.f18984d.c(R.string.AAOS_ALERTER_CLOSE, new Object[0]), (p) null, (CarColor) null, new u(com.waze.alerters.a.a.f14140i), rVar.c(), 38))) : rVar);
            apVar.A = rVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void I(final ap apVar, ka kaVar, CarContext carContext) {
        String strC;
        String strC2;
        boolean z;
        final boolean z2;
        jt jtVar;
        com.waze.car_lib.p.af afVar;
        final int i2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (kaVar instanceof jr) {
            CarToast.makeText(carContext, apVar.f18984d.c(true != ((jr) kaVar).a() ? R.string.AAOS_REPORT_LOGS_FAILED : R.string.AAOS_REPORT_LOGS_SUCCEEDED, new Object[0]), 1).show();
            return;
        }
        int i3 = 7;
        int i4 = 5;
        if (kaVar instanceof jp) {
            jp jpVar = (jp) kaVar;
            apVar.S(jpVar.a() == DriveTo.DangerZoneType.ISRAEL ? apVar.f18984d.c(R.string.AAOS_DANGER_ZONE_DESTINATION_POPUP_ISRAEL_MESSAGE, new Object[0]) : apVar.f18984d.c(R.string.AAOS_DANGER_ZONE_DESTINATION_POPUP_MESSAGE, new Object[0]), new com.waze.b.g(jpVar, i4), new com.waze.b.g(jpVar, 6), new com.waze.b.g(jpVar, i3));
            return;
        }
        int i5 = 20;
        int i6 = 19;
        int i7 = 3;
        int i8 = 4;
        if (kaVar instanceof jz) {
            jz jzVar = (jz) kaVar;
            if (jzVar.c() == DriveTo.DangerZoneType.ISRAEL) {
                apVar.S(apVar.f18984d.c(R.string.AAOS_DANGER_ZONE_ROUTE_POPUP_ISRAEL_MESSAGE, new Object[0]), new com.waze.ads.b(jzVar, i6), new com.waze.ads.b(jzVar, i5), new com.waze.b.g(jzVar, i8));
                return;
            }
            com.waze.shared_infra.i.e eVar = apVar.f18981a;
            DriveTo.DangerZoneType dangerZoneTypeC = jzVar.c();
            Objects.toString(dangerZoneTypeC);
            eVar.g("Trying to show via danger zone popup for non-israel danger zone ".concat(String.valueOf(dangerZoneTypeC)));
            jzVar.b().a(3);
            return;
        }
        if (h.g.b.x.n(kaVar, jo.f24960a)) {
            ConfigManager configManager = apVar.f18985e;
            if (configManager.getConfigValueBool(ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_ENABLED)) {
                com.waze.shared_infra.o.a aVar = apVar.f18984d;
                final String strC3 = aVar.c(R.string.AAOS_ROUTING_ALERT_CHILD_REMINDER_ROW_TITLE, new Object[0]);
                final String strH = com.waze.speech.k.h(aVar);
                configManager.setConfigValueBool(ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_ENCOURAGEMENT_SHOWN, true);
                apVar.f18986f.c(strC3, strH);
                apVar.v.c(new com.waze.car_lib.p.aj(new com.waze.car_lib.p.ak(strC3, strH, new com.waze.car_lib.p.ai(aVar.c(R.string.AAOS_ROUTING_ALERT_CHILD_REMINDER_TITLE, new Object[0])), new com.waze.car_lib.p.af(aVar.c(R.string.END_OF_DRIVE_GOT_IT, new Object[0]), false, false), null, null, 48), new h.g.a.a() { // from class: com.waze.car_lib.b.o
                    @Override // h.g.a.a
                    public final Object invoke() {
                        int i9 = i2;
                        if (i9 == 0) {
                            return ap.s((jt) apVar, (ap) strC3, strH);
                        }
                        String str = strH;
                        if (i9 != 1) {
                            return ap.t((jt) apVar, (ap) strC3, str);
                        }
                        return ap.n((ap) apVar, (String) strC3, str);
                    }
                }, new iw(19), new m((Object) apVar, i2)));
                return;
            }
            return;
        }
        if (kaVar instanceof jm) {
            com.waze.shared_infra.o.a aVar2 = apVar.f18984d;
            String strC4 = aVar2.c(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_TITLE, new Object[0]);
            String strC5 = aVar2.c(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_TEXT, new Object[0]);
            apVar.f18986f.c(strC4, strC5);
            apVar.v.c(new com.waze.car_lib.p.aj(new com.waze.car_lib.p.ak(strC4, strC5, com.waze.car_lib.p.ag.f20542a, new com.waze.car_lib.p.af(aVar2.c(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_DECLINE, new Object[0]), false, false), new com.waze.car_lib.p.af(aVar2.c(R.string.AAOS_ROUTING_ALERT_BLUETOOTH_ACCEPT, new Object[0]), true, true), null, 32), new l(i3), new l(8), new m((Object) apVar, i4)));
            return;
        }
        final int i9 = 2;
        if (kaVar instanceof jt) {
            final jt jtVar2 = (jt) kaVar;
            if (!com.waze.car_lib.r.bq.i(carContext)) {
                com.waze.shared_infra.i.e eVar2 = apVar.f18981a;
                eVar2.a("inCar popupRevamp triggered, but apiLevelAtLeast7=false, falling back to legacy presentation.");
                final String strL = jtVar2.l();
                if (strL.length() == 0) {
                    eVar2.b("Cannot display popup with empty title");
                    return;
                }
                boolean zI = com.waze.car_lib.r.bq.i(carContext);
                eVar2.a("apiLevelAtLeast7: " + zI);
                apVar.f18986f.c(strL, jtVar2.k());
                final String strI = jtVar2.i();
                String strJ = jtVar2.j();
                if (!zI || strI.length() <= 0) {
                    z = zI;
                    z2 = false;
                } else {
                    z = zI;
                    z2 = true;
                }
                boolean z3 = z && strJ.length() > 0;
                kotlinx.coroutines.b.bn bnVar = apVar.v;
                String strK = jtVar2.k();
                com.waze.car_lib.p.ah ahVar = com.waze.car_lib.p.ah.f20543a;
                if (z2) {
                    afVar = new com.waze.car_lib.p.af(strI, true, false);
                    jtVar = jtVar2;
                } else {
                    jtVar = jtVar2;
                    afVar = new com.waze.car_lib.p.af(apVar.f18984d.c(R.string.AAOS_ROUTING_ALERT_DRIVE_ANYWAY, new Object[0]), true, false);
                }
                final jt jtVar3 = jtVar;
                bnVar.c(new com.waze.car_lib.p.aj(new com.waze.car_lib.p.ak(strL, strK, ahVar, afVar, z3 ? new com.waze.car_lib.p.af(strJ, false, false) : null, null, 32), new h.g.a.a() { // from class: com.waze.car_lib.b.i
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ap.p(z2, apVar, jtVar3, strI, strL);
                    }
                }, new j(z3, apVar, jtVar3, strL, 0), new iw(18)));
                return;
            }
            String strH2 = jtVar2.h();
            final String str = true == h.n.o.G(strH2) ? null : strH2;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                apVar.f18981a.b("Cannot display routing popup with empty title");
                return;
            }
            String strE = jtVar2.e();
            if (strE.length() <= 0) {
                strE = null;
            }
            String str3 = strE;
            if (str3 == null || str3.length() == 0) {
                apVar.f18981a.b("Cannot display routing popup with empty primary action text");
                return;
            }
            String strG = jtVar2.g();
            String strA = jtVar2.b().a();
            com.waze.ac.q qVar = new com.waze.ac.q(strA, jtVar2.b().b());
            com.waze.ac.k kVar = new com.waze.ac.k(com.waze.ac.o.f13867a, null);
            apVar.f18981a.a("emit routing popup");
            kotlinx.coroutines.b.bn bnVar2 = apVar.v;
            com.waze.car_lib.p.ah ahVar2 = com.waze.car_lib.p.ah.f20543a;
            com.waze.car_lib.p.af afVar2 = new com.waze.car_lib.p.af(strE, true, false);
            String strF = jtVar2.f();
            if (true == h.n.o.G(strF)) {
                strF = null;
            }
            com.waze.car_lib.p.ak akVar = new com.waze.car_lib.p.ak(str, strG, ahVar2, afVar2, strF != null ? new com.waze.car_lib.p.af(jtVar2.f(), false, false) : null, null, 32);
            final Object[] objArr5 = objArr4 == true ? 1 : 0;
            bnVar2.c(new com.waze.car_lib.p.aj(akVar, new h.g.a.a() { // from class: com.waze.car_lib.b.o
                @Override // h.g.a.a
                public final Object invoke() {
                    int i92 = objArr5;
                    if (i92 == 0) {
                        return ap.s((jt) jtVar2, (ap) apVar, str);
                    }
                    String str4 = str;
                    if (i92 != 1) {
                        return ap.t((jt) jtVar2, (ap) apVar, str4);
                    }
                    return ap.n((ap) jtVar2, (String) apVar, str4);
                }
            }, new h.g.a.a() { // from class: com.waze.car_lib.b.o
                @Override // h.g.a.a
                public final Object invoke() {
                    int i92 = i9;
                    if (i92 == 0) {
                        return ap.s((jt) jtVar2, (ap) apVar, str);
                    }
                    String str4 = str;
                    if (i92 != 1) {
                        return ap.t((jt) jtVar2, (ap) apVar, str4);
                    }
                    return ap.n((ap) jtVar2, (String) apVar, str4);
                }
            }, new m((Object) apVar, i8)));
            apVar.p.c(qVar, kVar);
            apVar.q.a(strA);
            return;
        }
        if (kaVar instanceof jx) {
            jx jxVar = (jx) kaVar;
            apVar.u.c(new dd(new dg(jxVar.c(), jxVar.b(), null, false, null, null, 60), new l(objArr3 == true ? 1 : 0), new l(i9), null, null, 24));
            return;
        }
        if (kaVar instanceof jn) {
            jn jnVar = (jn) kaVar;
            apVar.u.c(new dd(new dg(jnVar.c(), jnVar.b(), null, false, new dc(apVar.f18984d.c(R.string.GOT_IT, new Object[0]), true), null, 36), new k(jnVar, apVar, objArr2 == true ? 1 : 0), new l(i2), null, null, 24));
            return;
        }
        if (kaVar instanceof ju) {
            ju juVar = (ju) kaVar;
            int iB = juVar.b();
            if (iB == 500) {
                strC = apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_INTERNAL_SERVER_ERROR_TITLE, new Object[0]);
            } else if (iB != 501) {
                switch (iB) {
                    case 401:
                    case 403:
                        strC = apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_CANT_FIND_ROUTE_TITLE, new Object[0]);
                        break;
                    case 402:
                        strC = apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_ROUTE_TOO_LONG_TITLE, new Object[0]);
                        break;
                    default:
                        strC = juVar.d();
                        break;
                }
            } else {
                strC = apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_NO_INTERNET_TITLE, new Object[0]);
            }
            String str4 = strC;
            if (h.n.o.G(str4)) {
                apVar.f18981a.b("Cannot display popup with empty title, description: ".concat(String.valueOf(juVar.c())));
                return;
            }
            kotlinx.coroutines.b.bn bnVar3 = apVar.v;
            int iB2 = juVar.b();
            if (iB2 != 501) {
                switch (iB2) {
                    case 401:
                    case 403:
                        strC2 = apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_CANT_FIND_ROUTE_MESSAGE, new Object[0]);
                        break;
                    case 402:
                        com.waze.shared_infra.o.a aVar3 = apVar.f18984d;
                        strC2 = String.format(aVar3.c(R.string.AAOS_ROUTING_RESPONSE_ROUTE_TOO_LONG_MESSAGE_PS, new Object[0]), Arrays.copyOf(new Object[]{aVar3.c(true != ((ds) apVar.s.getValue()).ac() ? R.string.AAOS_ROUTING_RESPONSE_ROUTE_TOO_LONG_MILES_MESSAGE : R.string.AAOS_ROUTING_RESPONSE_ROUTE_TOO_LONG_METRIC_MESSAGE, new Object[0])}, 1));
                        h.g.b.x.e(strC2, "format(...)");
                        break;
                    default:
                        strC2 = juVar.c();
                        break;
                }
            } else {
                strC2 = apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_NO_INTERNET_MESSAGE, new Object[0]);
            }
            bnVar3.c(new com.waze.car_lib.p.aj(new com.waze.car_lib.p.ak(str4, strC2, com.waze.car_lib.p.ag.f20542a, new com.waze.car_lib.p.af(apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_ERROR_BUTTON, new Object[0]), true, false), null, null, 48), new l(i7), new l(i8), new m((Object) apVar, (int) (objArr == true ? 1 : 0))));
            return;
        }
        if (kaVar instanceof js) {
            js jsVar = (js) kaVar;
            String strC6 = jsVar.c();
            if (h.n.o.G(strC6)) {
                apVar.f18981a.b("Cannot display popup with empty title, message: ".concat(String.valueOf(jsVar.b())));
                return;
            } else {
                apVar.v.c(new com.waze.car_lib.p.aj(new com.waze.car_lib.p.ak(strC6, jsVar.b(), com.waze.car_lib.p.ag.f20542a, new com.waze.car_lib.p.af(apVar.f18984d.c(R.string.AAOS_ROUTING_RESPONSE_ERROR_BUTTON, new Object[0]), true, jsVar.a() > 0), null, null, 48), new iw(20), new l(i4), new m((Object) apVar, 3)));
                return;
            }
        }
        if (kaVar instanceof jy) {
            jy jyVar = (jy) kaVar;
            com.waze.shared_infra.o.a aVar4 = apVar.f18984d;
            String strC7 = aVar4.c(R.string.VENUE_FRESHNESS_POPUP_TITLE_AA, new Object[0]);
            String strB = jyVar.b();
            apVar.u.c(new dd(new dg(strC7, (strB == null || strB.length() == 0) ? aVar4.c(R.string.VENUE_FRESHNESS_POPUP_MESSAGE_NO_ADDRESS_AA_PS, jyVar.c()) : aVar4.c(R.string.VENUE_FRESHNESS_POPUP_MESSAGE_WITH_ADDRESS_AA_PS_PS, jyVar.c(), jyVar.b()), Integer.valueOf(R.drawable.icon_tier3_venue_info_96px), false, new dc(aVar4.c(R.string.VENUE_FRESHNESS_POPUP_CANCEL_BUTTON_AA, new Object[0]), false), new dc(aVar4.c(R.string.VENUE_FRESHNESS_POPUP_CONFIRM_BUTTON_AA, new Object[0]), true), 8), jyVar.f(), jyVar.e(), null, jyVar.d(), 8));
            return;
        }
        if (kaVar instanceof jw) {
            apVar.f18981a.g("ShareDriveViewerSameDestinationInterceptionPopup not supported in car mode, auto-proceeding navigation");
            ((jw) kaVar).a().invoke();
            return;
        }
        if (kaVar instanceof jv) {
            apVar.f18981a.g("ShareDriveDifferentDestinationInterceptionPopup not supported in car mode, auto-proceeding navigation");
            ((jv) kaVar).a().invoke();
            return;
        }
        if (h.g.b.x.n(kaVar, jq.f24964a)) {
            return;
        }
        if (h.g.b.x.n(kaVar, jh.f24940a)) {
            apVar.Q();
        } else if (kaVar instanceof ji) {
            apVar.T();
        } else {
            if (!(kaVar instanceof jl)) {
                throw new h.i();
            }
            apVar.U((jl) kaVar);
        }
    }

    public static final /* synthetic */ r M(ap apVar) {
        int iO = apVar.O();
        com.waze.k kVar = new com.waze.k("PassAdded", String.valueOf(iO), "PassAdded:" + iO);
        com.waze.shared_infra.o.a aVar = apVar.f18984d;
        String strC = aVar.c(R.string.HOV_PERMITS_ADDED, new Object[0]);
        Long lValueOf = Long.valueOf(com.waze.settings.h.c.h(apVar.o.a()));
        u uVar = new u(com.waze.alerters.a.a.f14132a);
        List listB = h.a.i.b();
        listB.add(new q(aVar.c(R.string.HOV_PERMITS_ADDED_ALERT_CTA_TITLE, new Object[0]), (p) null, (CarColor) null, new u(com.waze.alerters.a.a.f14134c), kVar, 32));
        listB.add(new q(aVar.c(R.string.AAOS_ALERTER_CLOSE, new Object[0]), p.f19118b, (CarColor) null, new u(com.waze.alerters.a.a.f14135d), kVar, 36));
        return new r(iO, kVar, strC, lValueOf, uVar, null, null, h.a.i.a(listB), AlerterController$Alerter$Type.UNSPECIFIED, new l(6), new n(apVar, 0), new m((Object) apVar, 2));
    }

    public static final /* synthetic */ void N(ap apVar, CarContext carContext, com.waze.car_lib.r.bq bqVar) {
        int i2;
        if (h.g.b.x.n(bqVar, com.waze.car_lib.l.b.f20294a)) {
            i2 = R.string.AAOS_NOTIFICATION_POPUP_NO_GPS;
        } else if (h.g.b.x.n(bqVar, com.waze.car_lib.l.a.f20293a)) {
            i2 = R.string.ALT_ROUTES_V2_ERROR_CALCULATING_ROUTES;
        } else {
            if (!h.g.b.x.n(bqVar, com.waze.car_lib.l.c.f20295a)) {
                throw new h.i();
            }
            i2 = R.string.ALT_ROUTES_V2_ONLY_ONE_ROUTE_FOUND;
        }
        CarToast.makeText(carContext, apVar.f18984d.c(i2, new Object[0]), 1).show();
    }

    private final int O() {
        int i2 = this.x;
        this.x = i2 + 1;
        return i2;
    }

    private final void P(v vVar) {
        r rVar = this.A;
        if (rVar != null) {
            rVar.l().invoke(vVar);
            rVar.j().invoke();
        }
        this.A = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        com.waze.car_lib.i.a.aa aaVar = this.y;
        if (aaVar != null) {
            aaVar.a();
        }
    }

    private final void R(com.waze.ac.i iVar, dj djVar) {
        String strA;
        String strD;
        this.p.b(new com.waze.ac.q(djVar.a(), djVar.b()), iVar, null, new com.waze.ac.k(com.waze.ac.o.f13867a, null));
        com.waze.ac.g gVar = com.waze.ac.g.f13851a;
        if (h.g.b.x.n(iVar, gVar)) {
            strA = com.waze.ac.j.f13854b.a();
        } else {
            if (!h.g.b.x.n(iVar, com.waze.ac.h.f13852a)) {
                throw new h.i();
            }
            strA = com.waze.ac.j.f13857e.a();
        }
        this.r.a(djVar.a(), strA, null);
        if (h.g.b.x.n(iVar, gVar)) {
            strD = djVar.c();
        } else {
            if (!h.g.b.x.n(iVar, com.waze.ac.h.f13852a)) {
                throw new h.i();
            }
            strD = djVar.d();
        }
        this.n.handleDeepLink(strD, new mo(18));
    }

    private final void S(String str, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        com.waze.shared_infra.o.a aVar4 = this.f18984d;
        String strC = aVar4.c(R.string.AAOS_DANGER_ZONE_POPUP_TITLE, new Object[0]);
        this.f18986f.c(strC, str);
        this.u.c(new dd(new dg(strC, str, Integer.valueOf(R.drawable.t3_critical_alert_64px), false, new dc(aVar4.c(R.string.AAOS_DANGER_ZONE_POPUP_CONFIRM_BUTTON, new Object[0]), false), new dc(aVar4.c(R.string.AAOS_DANGER_ZONE_POPUP_CANCEL_BUTTON, new Object[0]), true), 8), aVar, aVar2, aVar3, null, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        Q();
        this.y = this.f18989i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(jl jlVar) {
        String strC;
        if (h.n.o.G(jlVar.b())) {
            return;
        }
        jk jkVarA = jlVar.a();
        com.waze.h hVar = com.waze.h.f24304a;
        com.waze.alerters.a.a aVar = com.waze.alerters.a.a.f14132a;
        AlerterController$Alerter$Type alerterController$Alerter$Type = AlerterController$Alerter$Type.UNSPECIFIED;
        jk jkVar = jk.f24942a;
        switch (jkVarA.ordinal()) {
            case 0:
                strC = this.f18984d.c(R.string.AAOS_NOTIFICATION_POPUP_NO_GPS, new Object[0]);
                break;
            case 1:
                strC = this.f18984d.c(R.string.AAOS_NOTIFICATION_POPUP_NO_INTERNET, new Object[0]);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return;
            default:
                throw new h.i();
        }
        this.w.c(strC);
    }

    private final boolean V(com.waze.j jVar, String str) {
        if (jVar.q()) {
            return true;
        }
        AlerterController$Alerter$Type alerterController$Alerter$TypeE = jVar.e();
        com.waze.h hVar = com.waze.h.f24304a;
        com.waze.alerters.a.a aVar = com.waze.alerters.a.a.f14132a;
        AlerterController$Alerter$Type alerterController$Alerter$Type = AlerterController$Alerter$Type.UNSPECIFIED;
        jk jkVar = jk.f24942a;
        int iOrdinal = alerterController$Alerter$TypeE.ordinal();
        return iOrdinal != 15 ? iOrdinal != 23 ? iOrdinal == 28 || (iOrdinal == 29 && !h.n.o.G(jVar.m())) : this.f18985e.getConfigValueBool(ConfigValues.CONFIG_VALUE_ALERTS_PERSONAL_SAFETY_ALERT_ALT_ROUTES_IN_CAR_ENABLED) && !h.n.o.G(str) : !h.n.o.G(str);
    }

    private final boolean W() {
        Float f2 = this.z;
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            float configValueLong = this.f18985e.getConfigValueLong(ConfigValues.CONFIG_VALUE_CAR_LIB_CONSISTENT_ALERTER_ID_MIN_HOST_VERSION_TIMES_1000) / 1000.0f;
            if (configValueLong >= 0.0f && configValueLong <= fFloatValue + 1.0E-4f) {
                return true;
            }
        }
        return false;
    }

    private static final String X(com.waze.j jVar, com.waze.shared_infra.o.a aVar, boolean z) {
        AlerterController$Alerter$Type alerterController$Alerter$TypeE = jVar.e();
        com.waze.h hVar = com.waze.h.f24304a;
        com.waze.alerters.a.a aVar2 = com.waze.alerters.a.a.f14132a;
        AlerterController$Alerter$Type alerterController$Alerter$Type = AlerterController$Alerter$Type.UNSPECIFIED;
        jk jkVar = jk.f24942a;
        switch (alerterController$Alerter$TypeE.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
                return aVar.c(true != z ? R.string.ANDROID_AUTO_NOT_THERE : R.string.AAOS_ALERTER_STILL_THERE, new Object[0]);
            case 15:
                return z ? jVar.m() : jVar.n();
            case 20:
            case 21:
                return aVar.c(R.string.AAOS_ALERTER_CLOSE, new Object[0]);
            case 23:
                return z ? jVar.m() : jVar.n();
            case 28:
                return z ? jVar.m() : jVar.n();
            case 29:
                return z ? jVar.m() : jVar.n();
            case 30:
                return z ? jVar.m() : jVar.n();
            default:
                throw new h.i();
        }
    }

    private static final Long Y(com.waze.j jVar, com.waze.h hVar) {
        com.waze.i iVarD = jVar.d();
        if (iVarD != null) {
            Long lValueOf = Long.valueOf(h.o.a.m(iVarD.a()));
            lValueOf.longValue();
            com.waze.i iVarD2 = jVar.d();
            if ((iVarD2 != null ? iVarD2.b() : null) == hVar) {
                return lValueOf;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.car_lib.b.r b(com.waze.car_lib.b.ap r27, com.waze.j r28, h.g.a.a r29, h.g.a.l r30, h.g.a.a r31) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.b.ap.b(com.waze.car_lib.b.ap, com.waze.j, h.g.a.a, h.g.a.l, h.g.a.a):com.waze.car_lib.b.r");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [androidx.car.app.model.CarColor] */
    public static final /* synthetic */ r c(ap apVar, com.waze.an.a.l lVar, com.waze.an.a.k kVar, h.g.a.a aVar, h.g.a.a aVar2) {
        h.k kVar2;
        List list;
        apVar.f18981a.a("createAlertUiState called with notification title: ".concat(String.valueOf(kVar.d())));
        int iHashCode = apVar.W() ? lVar.m().hashCode() : apVar.O();
        com.waze.k kVar3 = new com.waze.k(lVar.m().b().name(), lVar.m().c(), lVar.m().b().name() + ":" + lVar.m().c());
        com.waze.an.a.j jVarA = kVar.a();
        p pVar = null;
        if (jVarA != null) {
            kVar2 = new h.k(jVarA, new u(com.waze.alerters.a.a.f14132a));
        } else {
            List listE = kVar.e();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : listE) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.i.p();
                }
                com.waze.an.a.j jVarF = ((com.waze.an.a.i) obj).f();
                h.k kVar4 = jVarF != null ? new h.k(jVarF, new t(i2)) : null;
                if (kVar4 != null) {
                    arrayList.add(kVar4);
                }
                i2 = i3;
            }
            kVar2 = (h.k) h.a.i.R(arrayList);
            if (kVar2 == null) {
                kVar2 = new h.k(null, null);
            }
        }
        com.waze.an.a.j jVar = (com.waze.an.a.j) kVar2.a();
        v vVar = (v) kVar2.b();
        String strD = kVar.d();
        Long lValueOf = jVar != null ? Long.valueOf(h.o.a.m(jVar.a())) : null;
        String strC = kVar.c();
        Integer numB = kVar.b();
        List listB = h.a.i.b();
        int i4 = 0;
        for (Object obj2 : kVar.e()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                h.a.i.p();
            }
            com.waze.an.a.i iVar = (com.waze.an.a.i) obj2;
            String strG = iVar.g();
            com.waze.an.a.c cVarC = iVar.c();
            com.waze.an.a.j jVarE = iVar.e();
            com.waze.design_components.b.d dVarA = iVar.a();
            p pVar2 = p.f19118b;
            if (jVarE == null || kVar.a() != null) {
                list = listB;
                pVar2 = pVar;
            } else {
                list = listB;
            }
            CarColor carColor = cVarC.d() ? CarColor.BLUE : pVar;
            List list2 = list;
            list2.add(new q(strG, pVar2, carColor, new t(i4), kVar3, dVarA));
            listB = list2;
            i4 = i5;
            pVar = null;
        }
        List list3 = listB;
        if (list3.isEmpty()) {
            list3.add(new q(apVar.f18984d.c(R.string.AAOS_ALERTER_CLOSE, new Object[0]), (p) null, (CarColor) null, new u(com.waze.alerters.a.a.f14135d), kVar3, 38));
        }
        return new r(iHashCode, kVar3, strD, lValueOf, vVar, strC, numB, h.a.i.ai(h.a.i.a(list3)), AlerterController$Alerter$Type.OTHER, aVar, new iv(kVar, 12), aVar2);
    }

    public static final /* synthetic */ Object k(ap apVar, kotlinx.coroutines.a.ad adVar, com.waze.an.a.l lVar, h.c.e eVar) {
        if (lVar.m().b() != com.waze.an.a.ae.f14553i) {
            h.g.b.am amVar = new h.g.b.am();
            Object objCollect = new ac(kotlinx.coroutines.b.ai.J(lVar.b(), new ad(amVar, lVar, (h.c.e) null, 0)), apVar, lVar, amVar).collect(new af(adVar, 1), eVar);
            return objCollect != h.c.a.a.f48038a ? h.ab.f48028a : objCollect;
        }
        com.waze.shared_infra.i.e eVar2 = apVar.f18981a;
        com.waze.an.a.u uVarM = lVar.m();
        Objects.toString(uVarM);
        eVar2.a("Not displaying notification, Insight feedback is not supported on in-car, id: ".concat(String.valueOf(uVarM)));
        lVar.e();
        return h.ab.f48028a;
    }

    static final h.ab l(ap apVar) {
        apVar.f18983c.d(true);
        return h.ab.f48028a;
    }

    static final h.ab m(jn jnVar, ap apVar) {
        if (jnVar.a() != -1) {
            gb.MsgBoxCallback$default(apVar.f18988h, jnVar.a(), null, 2, null);
        }
        return h.ab.f48028a;
    }

    static final h.ab n(ap apVar, String str, String str2) {
        apVar.f18986f.b(com.waze.navigate.b.c.f31040a, str, str2);
        return h.ab.f48028a;
    }

    static final h.ab o(ap apVar) {
        apVar.f18983c.d(true);
        return h.ab.f48028a;
    }

    static final h.ab p(boolean z, ap apVar, jt jtVar, String str, String str2) {
        if (z) {
            apVar.R(com.waze.ac.g.f13851a, jtVar.b());
        }
        apVar.f18986f.b((!z || str.length() == 0) ? com.waze.navigate.b.c.f31045f : com.waze.navigate.b.c.f31043d, str2, jtVar.k());
        return h.ab.f48028a;
    }

    static final h.ab q(boolean z, ap apVar, jt jtVar, String str) {
        if (z) {
            apVar.R(com.waze.ac.h.f13852a, jtVar.b());
            apVar.f18986f.b(com.waze.navigate.b.c.f31044e, str, jtVar.k());
        }
        return h.ab.f48028a;
    }

    static final h.ab r(ap apVar) {
        apVar.f18983c.d(true);
        return h.ab.f48028a;
    }

    static final h.ab s(jt jtVar, ap apVar, String str) {
        if (!h.n.o.G(jtVar.e())) {
            apVar.R(com.waze.ac.g.f13851a, jtVar.b());
            apVar.f18986f.b(com.waze.navigate.b.c.f31043d, str, jtVar.g());
        }
        return h.ab.f48028a;
    }

    static final h.ab t(jt jtVar, ap apVar, String str) {
        if (!h.n.o.G(jtVar.f())) {
            apVar.R(com.waze.ac.h.f13852a, jtVar.b());
            apVar.f18986f.b(com.waze.navigate.b.c.f31044e, str, jtVar.g());
        }
        return h.ab.f48028a;
    }

    static final h.ab u(ap apVar) {
        apVar.f18983c.d(true);
        return h.ab.f48028a;
    }

    static final h.ab v(ap apVar) {
        apVar.f18983c.d(true);
        return h.ab.f48028a;
    }

    static final h.ab w(ap apVar, v vVar) {
        h.g.b.x.f(vVar, "action");
        apVar.t.e(null);
        apVar.A = null;
        if (h.g.b.x.n(vVar, new u(com.waze.alerters.a.a.f14134c))) {
            apVar.n.OpenHOVSettings(true);
        }
        return h.ab.f48028a;
    }

    static final h.ab x(ap apVar) {
        apVar.t.e(null);
        apVar.A = null;
        return h.ab.f48028a;
    }

    public final kotlinx.coroutines.b.bq A() {
        return this.u;
    }

    public final kotlinx.coroutines.b.bq B() {
        return this.w;
    }

    public final ch C() {
        return this.t;
    }

    public final ch D() {
        return this.v;
    }

    public final void J(v vVar, com.waze.k kVar) {
        h.g.b.x.f(vVar, "intentAction");
        h.g.b.x.f(kVar, "alertId");
        r rVar = this.A;
        if (!h.g.b.x.n(rVar != null ? rVar.c() : null, kVar) || h.g.b.x.n(vVar, new u(com.waze.alerters.a.a.f14140i))) {
            return;
        }
        P(vVar);
    }

    public final void K() {
        this.w.b();
    }

    public final void L(CarContext carContext, kotlinx.coroutines.af afVar) {
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(afVar, "scope");
        this.z = this.f18991k.a(carContext);
        kotlinx.coroutines.aj.z(afVar, null, null, new ak(this, null, 0), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ak(this, (h.c.e) null, 2, (char[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new an(this, carContext, null, 1, null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ak(this, (h.c.e) null, 3, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ak(this, (h.c.e) null, 4, (int[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new an(this, carContext, (h.c.e) null, 0), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ak(this, (h.c.e) null, 5, (boolean[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ak(this, (h.c.e) null, 1, (byte[]) null), 3);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
