package com.waze.cf.c;

import android.content.Context;
import android.content.DialogInterface;
import com.waze.MessageBoxNativeManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ab.ac;
import com.waze.ab.o;
import com.waze.ab.p;
import com.waze.ab.s;
import com.waze.ac.r;
import com.waze.app_nav.hub.b.m;
import com.waze.bd;
import com.waze.dc;
import com.waze.gb;
import com.waze.jh;
import com.waze.ji;
import com.waze.jj;
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
import com.waze.kb;
import com.waze.kd;
import com.waze.modules.c.dj;
import com.waze.modules.navigation.w;
import com.waze.navigate.as;
import com.waze.sharedrive.c.a.q;
import com.waze.sharedrive.d.aq;
import com.waze.trip_overview.cm;
import com.waze.ui.t;
import com.waze.uid.state_impl.email.n;
import h.ab;
import h.g.b.am;
import h.g.b.x;
import java.util.Locale;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final MessageBoxNativeManager f22215a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f22216b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f22217c;

    /* renamed from: d, reason: collision with root package name */
    private final kd f22218d;

    /* renamed from: e, reason: collision with root package name */
    private final r f22219e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ac.b.e f22220f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.ac.b.b f22221g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.sharedrive.d.a f22222h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22223i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f22224j;

    /* renamed from: k, reason: collision with root package name */
    private final bd f22225k;

    public l(MessageBoxNativeManager messageBoxNativeManager, com.waze.shared_infra.o.a aVar, com.waze.app_nav.hub.b.c cVar, kd kdVar, r rVar, com.waze.ac.b.e eVar, com.waze.ac.b.b bVar, kb kbVar, com.waze.sharedrive.d.a aVar2, com.waze.shared_infra.i.e eVar2) {
        x.f(messageBoxNativeManager, "msgBox");
        x.f(aVar, "stringProvider");
        x.f(cVar, "popupManager");
        x.f(kdVar, "popupController");
        x.f(rVar, "encouragementsStatsSender");
        x.f(eVar, "engagementDisplayedSender");
        x.f(bVar, "engagementButtonClickedSender");
        x.f(kbVar, "mobileToAAPPopupControllerFactory");
        x.f(aVar2, "shareDriveControllerFactory");
        x.f(eVar2, "logger");
        this.f22215a = messageBoxNativeManager;
        this.f22216b = aVar;
        this.f22217c = cVar;
        this.f22218d = kdVar;
        this.f22219e = rVar;
        this.f22220f = eVar;
        this.f22221g = bVar;
        this.f22222h = aVar2;
        this.f22223i = eVar2;
        this.f22224j = h.g.a(new n(this, 7));
        this.f22225k = kbVar.a();
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i b(String str, String str2, l lVar, final jz jzVar, Context context) {
        x.f(context, "it");
        o oVar = new o();
        oVar.Q(str);
        oVar.P(str2);
        oVar.C(false);
        com.waze.shared_infra.o.a aVar = lVar.f22216b;
        oVar.M(aVar.c(R.string.CANCEL, new Object[0]));
        oVar.N(aVar.c(R.string.KEEP_DRIVE, new Object[0]));
        oVar.R(true);
        oVar.F(R.drawable.dangerous_zone_icon);
        oVar.I(new p() { // from class: com.waze.cf.c.g
            @Override // com.waze.ab.p
            public final void a(DialogInterface dialogInterface, boolean z) {
                jzVar.b().a(3);
            }
        });
        oVar.J(new h(jzVar, 0));
        s sVar = new s(context, oVar);
        x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, (byte[]) null);
    }

    static final com.waze.app_nav.hub.b.i c(jn jnVar, l lVar, Context context) {
        x.f(context, "it");
        o oVar = new o();
        oVar.Q(jnVar.c());
        oVar.P(jnVar.b());
        oVar.M(lVar.f22216b.c(R.string.OK, new Object[0]));
        s sVar = new s(context, oVar);
        x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, new t(lVar, jnVar, 19));
    }

    static final com.waze.app_nav.hub.b.i d(l lVar, am amVar, h.g.a.a aVar, h.g.a.a aVar2, Context context) {
        x.f(context, "context");
        o oVar = new o();
        com.waze.shared_infra.o.a aVar3 = lVar.f22216b;
        oVar.Q(aVar3.c(R.string.SHARE_DRIVE_LIVE_DRIVE_NEW_DESTINATION_WHILE_SHARING_POPUP_TITLE, new Object[0]));
        oVar.P(aVar3.c(R.string.SHARE_DRIVE_LIVE_DRIVE_NEW_DESTINATION_WHILE_SHARING_POPUP_SUBTITLE, new Object[0]));
        oVar.M(aVar3.c(R.string.SHARE_DRIVE_LIVE_DRIVE_NEW_DESTINATION_WHILE_SHARING_POPUP_PRIMARY_CTA, new Object[0]));
        oVar.N(aVar3.c(R.string.SHARE_DRIVE_LIVE_DRIVE_NEW_DESTINATION_WHILE_SHARING_POPUP_SECONDARY_CTA, new Object[0]));
        oVar.R(true);
        oVar.I(new c(amVar, aVar, 1));
        oVar.J(new d(amVar, aVar, aVar2, 1));
        s sVar = new s(context, oVar);
        sVar.show();
        return m.a(sVar);
    }

    static final com.waze.app_nav.hub.b.i e(jr jrVar, l lVar, Context context) {
        x.f(context, "it");
        int i2 = true != jrVar.a() ? R.string.UHHOHE : R.string.THANKSE;
        int i3 = true != jrVar.a() ? R.string.ERROR_SENDING_FILES : R.string.LOGS_SUBMITTED_SUCCESSFULLY_TO_WAZE;
        int i4 = true != jrVar.a() ? 5 : 3;
        o oVar = new o();
        com.waze.shared_infra.o.a aVar = lVar.f22216b;
        oVar.Q(aVar.c(i2, new Object[0]));
        oVar.P(aVar.c(i3, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        oVar.w(i4);
        s sVar = new s(context, oVar);
        x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, (byte[]) null);
    }

    static final com.waze.app_nav.hub.b.i f(l lVar, Context context) {
        x.f(context, "it");
        o oVar = new o();
        com.waze.shared_infra.o.a aVar = lVar.f22216b;
        oVar.Q(aVar.c(R.string.CANNOT_REPORT_WHILE_INVISIBLE_TITLE, new Object[0]));
        oVar.P(aVar.c(R.string.CANNOT_REPORT_WHILE_INVISIBLE, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        s sVar = new s(context, oVar);
        x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, (byte[]) null);
    }

    static final com.waze.app_nav.hub.b.i g(js jsVar, l lVar, Context context) {
        x.f(context, "it");
        o oVar = new o();
        oVar.Q(jsVar.c());
        oVar.P(jsVar.b());
        oVar.M(lVar.f22216b.c(R.string.OK, new Object[0]));
        oVar.w(jsVar.a());
        s sVar = new s(context, oVar);
        x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, (byte[]) null);
    }

    static final com.waze.app_nav.hub.b.i h(ju juVar, l lVar, Context context) {
        x.f(context, "it");
        o oVar = new o();
        oVar.Q(juVar.d());
        oVar.P(juVar.c());
        oVar.M(lVar.f22216b.c(R.string.OK, new Object[0]));
        oVar.w(juVar.a());
        s sVar = new s(context, oVar);
        x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, (byte[]) null);
    }

    static final com.waze.app_nav.hub.b.i i(l lVar, String str, am amVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, Context context) {
        x.f(context, "context");
        o oVar = new o();
        com.waze.shared_infra.o.a aVar4 = lVar.f22216b;
        oVar.Q(aVar4.c(R.string.SHARE_DRIVE_VIEWER_DRIVE_TO_DESTINATION_POPUP_TITLE, new Object[0]));
        oVar.P(aVar4.c(R.string.SHARE_DRIVE_VIEWER_DRIVE_TO_DESTINATION_POPUP_SUBTITLE, str));
        oVar.M(aVar4.c(R.string.SHARE_DRIVE_VIEWER_DRIVE_TO_DESTINATION_POPUP_PRIMARY_CTA, new Object[0]));
        oVar.N(aVar4.c(R.string.SHARE_DRIVE_VIEWER_DRIVE_TO_DESTINATION_POPUP_SECONDARY_CTA, new Object[0]));
        oVar.R(true);
        oVar.I(new c(amVar, aVar, 0));
        oVar.J(new d(amVar, aVar2, aVar3, 0));
        s sVar = new s(context, oVar);
        sVar.show();
        return m.a(sVar);
    }

    static final com.waze.app_nav.hub.b.i j(jx jxVar, l lVar, Context context) {
        x.f(context, "it");
        o oVar = new o();
        oVar.Q(jxVar.c());
        oVar.P(jxVar.b());
        oVar.M(lVar.f22216b.c(R.string.OK, new Object[0]));
        s sVar = new s(context, oVar);
        x.e(sVar, "createDialog(...)");
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, (byte[]) null);
    }

    public static /* synthetic */ ab m(l lVar, dj djVar, jt jtVar, Boolean bool) {
        lVar.u(com.waze.ac.h.f13852a, bool, djVar, jtVar.d());
        return ab.f48028a;
    }

    public static /* synthetic */ ab n(l lVar, dj djVar, jt jtVar, Boolean bool) {
        lVar.u(com.waze.ac.g.f13851a, bool, djVar, jtVar.d());
        return ab.f48028a;
    }

    public static /* synthetic */ ab o(l lVar, jn jnVar) {
        gb.MsgBoxCallback$default(lVar.f22215a, jnVar.a(), null, 2, null);
        return ab.f48028a;
    }

    public static final /* synthetic */ void p(l lVar, jj jjVar) {
        if (jjVar instanceof ji) {
            lVar.v((ji) jjVar);
        } else {
            if (!(jjVar instanceof jh)) {
                throw new h.i();
            }
            lVar.t();
        }
    }

    public static final /* synthetic */ void r(final l lVar, ka kaVar) {
        com.waze.ui.ac.i iVar;
        com.waze.ui.ac.h hVar;
        q qVarA;
        com.waze.sharedrive.c.a.m mVar;
        com.waze.sharedrive.c.a.b bVarA;
        final int i2 = 1;
        if (kaVar instanceof jr) {
            final jr jrVar = (jr) kaVar;
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("showLogsReportedPopup", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.cf.c.e
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    int i3 = i2;
                    if (i3 == 0) {
                        return l.h((ju) jrVar, lVar, context);
                    }
                    if (i3 == 1) {
                        return l.e((jr) jrVar, lVar, context);
                    }
                    if (i3 == 2) {
                        return l.c((jn) jrVar, lVar, context);
                    }
                    l lVar2 = lVar;
                    return i3 != 3 ? l.g((js) jrVar, lVar2, context) : l.j((jx) jrVar, lVar2, context);
                }
            }, 6));
            return;
        }
        final int i3 = 3;
        final int i4 = 0;
        if (kaVar instanceof jp) {
            com.waze.app_nav.hub.b.c cVar = lVar.f22217c;
            jp jpVar = (jp) kaVar;
            DriveTo.DangerZoneType dangerZoneTypeA = jpVar.a();
            boolean zC = jpVar.c();
            h.g.a.l lVarB = jpVar.b();
            String strD = as.d(dangerZoneTypeA);
            String strB = zC ? as.b(dangerZoneTypeA) : as.c(dangerZoneTypeA);
            if (strD == null || strB == null) {
                lVarB.invoke(w.f30500b);
                return;
            }
            o oVar = new o();
            oVar.Q(strD);
            oVar.P(strB);
            oVar.f13808a = new dc(lVarB, 18);
            com.waze.shared_infra.o.a aVar = lVar.f22216b;
            oVar.M(aVar.c(R.string.CANCEL, new Object[0]));
            oVar.N(aVar.c(true != zC ? R.string.DANGEROUS_ADDRESS_SAVE_BUTTON : R.string.KEEP_DRIVE, new Object[0]));
            oVar.F(R.drawable.dangerous_zone_icon);
            oVar.H(new com.waze.design_components.c.f(lVarB, 14));
            oVar.R(true);
            cVar.b(new com.waze.app_nav.hub.b.k("DangerZone", null, new com.waze.sharedui.d.c(oVar, i3), 6));
            return;
        }
        if (kaVar instanceof jw) {
            com.waze.app_nav.hub.b.c cVar2 = lVar.f22217c;
            jw jwVar = (jw) kaVar;
            final h.g.a.a aVarC = jwVar.c();
            final h.g.a.a aVarA = jwVar.a();
            final h.g.a.a aVarB = jwVar.b();
            aq aqVarA = lVar.f22222h.a();
            if (aqVarA == null) {
                aVarA.invoke();
                return;
            }
            Object objD = aqVarA.n().d();
            com.waze.sharedrive.d.q qVar = objD instanceof com.waze.sharedrive.d.q ? (com.waze.sharedrive.d.q) objD : null;
            String strC = (qVar == null || (qVarA = qVar.a()) == null || (mVar = (com.waze.sharedrive.c.a.m) qVarA.b()) == null || (bVarA = mVar.a()) == null) ? null : bVarA.c();
            final am amVar = new am();
            if (strC == null) {
                strC = "";
            }
            final String str = strC;
            cVar2.b(new com.waze.app_nav.hub.b.k("ShareDriveSameDestinationViewer", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.cf.c.b
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    return l.i(this.f22184a, str, amVar, aVarC, aVarA, aVarB, context);
                }
            }, 6));
            return;
        }
        if (kaVar instanceof jv) {
            jv jvVar = (jv) kaVar;
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("ShareDriveDifferentDestination", null, new f(lVar, new am(), jvVar.b(), jvVar.a(), 2), 6));
            return;
        }
        final int i5 = 4;
        if (kaVar instanceof jz) {
            jz jzVar = (jz) kaVar;
            String strD2 = as.d(jzVar.c());
            String strE = as.e(jzVar.c(), com.waze.shared_infra.o.b.a());
            if (strD2 == null || strE == null) {
                jzVar.b().a(4);
                return;
            } else {
                lVar.f22217c.b(new com.waze.app_nav.hub.b.k("showViaDangerZonePopup", null, new f(strD2, strE, lVar, jzVar, 0), 6));
                return;
            }
        }
        final int i6 = 2;
        if (x.n(kaVar, jo.f24960a)) {
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("ChildReminder", null, new com.waze.a.b(2), 6));
            return;
        }
        if (kaVar instanceof jm) {
            return;
        }
        if (kaVar instanceof jt) {
            jt jtVar = (jt) kaVar;
            dj djVarA = jtVar.a();
            if (djVarA.c().length() == 0) {
                lVar.f22223i.b("Routing popup called with empty action, not showing popup.");
                return;
            }
            com.waze.app_nav.hub.b.c cVar3 = lVar.f22217c;
            bd bdVar = lVar.f22225k;
            com.waze.app_nav.hub.b.a aVarM = jtVar.m();
            cm cmVar = new cm(lVar, djVarA, jtVar, 7);
            cm cmVar2 = new cm(lVar, djVarA, jtVar, 8);
            x.f(cVar3, "popupManager");
            x.f(jtVar, "routingPopup");
            x.f(cmVar, "onPrimaryAction");
            x.f(cmVar2, "onSecondaryAction");
            String strD3 = jtVar.d();
            if (strD3.length() <= 0) {
                strD3 = null;
            }
            if (strD3 != null) {
                String lowerCase = strD3.toLowerCase(Locale.ROOT);
                x.e(lowerCase, "toLowerCase(...)");
                Integer numValueOf = Integer.valueOf(com.waze.resources.h.g(lowerCase));
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    hVar = new com.waze.ui.ac.f(numValueOf.intValue());
                } else {
                    Locale locale = Locale.getDefault();
                    x.e(locale, "getDefault(...)");
                    String lowerCase2 = strD3.toLowerCase(locale);
                    x.e(lowerCase2, "toLowerCase(...)");
                    hVar = new com.waze.ui.ac.h("enc/".concat(String.valueOf(lowerCase2)));
                }
                iVar = hVar;
            } else {
                iVar = null;
            }
            cVar3.b(new com.waze.app_nav.hub.b.k("RoutingPopup", aVarM, new f(bdVar != null ? bdVar.b(jtVar) : null, new com.waze.ui.t.b(jtVar.l(), jtVar.k(), jtVar.i(), jtVar.j(), iVar, jtVar.c()), cmVar, cmVar2, 1), 2));
            lVar.f22219e.c(new com.waze.ac.q(djVarA.a(), djVarA.b()), new com.waze.ac.k(com.waze.ac.o.f13867a, jtVar.d()));
            lVar.f22220f.a(djVarA.a());
            return;
        }
        if (kaVar instanceof jx) {
            final jx jxVar = (jx) kaVar;
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("showTechCodePopup", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.cf.c.e
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    int i32 = i3;
                    if (i32 == 0) {
                        return l.h((ju) jxVar, lVar, context);
                    }
                    if (i32 == 1) {
                        return l.e((jr) jxVar, lVar, context);
                    }
                    if (i32 == 2) {
                        return l.c((jn) jxVar, lVar, context);
                    }
                    l lVar2 = lVar;
                    return i32 != 3 ? l.g((js) jxVar, lVar2, context) : l.j((jx) jxVar, lVar2, context);
                }
            }, 6));
            return;
        }
        if (kaVar instanceof jn) {
            final jn jnVar = (jn) kaVar;
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("showCallbackTechCodePopup", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.cf.c.e
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    int i32 = i6;
                    if (i32 == 0) {
                        return l.h((ju) jnVar, lVar, context);
                    }
                    if (i32 == 1) {
                        return l.e((jr) jnVar, lVar, context);
                    }
                    if (i32 == 2) {
                        return l.c((jn) jnVar, lVar, context);
                    }
                    l lVar2 = lVar;
                    return i32 != 3 ? l.g((js) jnVar, lVar2, context) : l.j((jx) jnVar, lVar2, context);
                }
            }, 6));
            return;
        }
        if (kaVar instanceof ju) {
            final ju juVar = (ju) kaVar;
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("showRoutingResponseErrorPopup", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.cf.c.e
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    int i32 = i4;
                    if (i32 == 0) {
                        return l.h((ju) juVar, lVar, context);
                    }
                    if (i32 == 1) {
                        return l.e((jr) juVar, lVar, context);
                    }
                    if (i32 == 2) {
                        return l.c((jn) juVar, lVar, context);
                    }
                    l lVar2 = lVar;
                    return i32 != 3 ? l.g((js) juVar, lVar2, context) : l.j((jx) juVar, lVar2, context);
                }
            }, 6));
            return;
        }
        if (kaVar instanceof js) {
            final js jsVar = (js) kaVar;
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("showRouteCalculationErrorPopup", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.cf.c.e
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    int i32 = i5;
                    if (i32 == 0) {
                        return l.h((ju) jsVar, lVar, context);
                    }
                    if (i32 == 1) {
                        return l.e((jr) jsVar, lVar, context);
                    }
                    if (i32 == 2) {
                        return l.c((jn) jsVar, lVar, context);
                    }
                    l lVar2 = lVar;
                    return i32 != 3 ? l.g((js) jsVar, lVar2, context) : l.j((jx) jsVar, lVar2, context);
                }
            }, 6));
            return;
        }
        if (kaVar instanceof jy) {
            jy jyVar = (jy) kaVar;
            com.waze.app_nav.hub.b.c cVar4 = lVar.f22217c;
            bd bdVar2 = lVar.f22225k;
            x.f(cVar4, "<this>");
            x.f(jyVar, "updateVenueLocationPopup");
            cVar4.b(new com.waze.app_nav.hub.b.k("UpdateVenueLocationPopup", jyVar.m(), new ac(bdVar2, jyVar, i4), 2));
            return;
        }
        if (x.n(kaVar, jq.f24964a)) {
            lVar.f22217c.b(new com.waze.app_nav.hub.b.k("showReportWhileInvisiblePopup", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.cf.c.a
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    return l.f(this.f22183a, context);
                }
            }, 6));
            return;
        }
        if (x.n(kaVar, jh.f24940a)) {
            lVar.t();
        } else if (kaVar instanceof ji) {
            lVar.v((ji) kaVar);
        } else {
            if (!(kaVar instanceof jl)) {
                throw new h.i();
            }
            lVar.w((jl) kaVar);
        }
    }

    private final NativeManager s() {
        return (NativeManager) this.f22224j.getValue();
    }

    private final void t() {
        s().CloseProgressPopup();
    }

    private final void u(com.waze.ac.i iVar, Boolean bool, dj djVar, String str) {
        String strA;
        String strD;
        NativeManager nativeManager = NativeManager.getInstance();
        com.waze.ac.q qVar = new com.waze.ac.q(djVar.a(), djVar.b());
        com.waze.ac.k kVar = new com.waze.ac.k(com.waze.ac.o.f13867a, str);
        com.waze.ac.g gVar = com.waze.ac.g.f13851a;
        if (x.n(iVar, gVar)) {
            strA = com.waze.ac.j.f13854b.a();
        } else {
            if (!x.n(iVar, com.waze.ac.h.f13852a)) {
                throw new h.i();
            }
            strA = com.waze.ac.j.f13857e.a();
        }
        if (x.n(iVar, gVar)) {
            strD = djVar.c();
        } else {
            if (!x.n(iVar, com.waze.ac.h.f13852a)) {
                throw new h.i();
            }
            strD = djVar.d();
        }
        this.f22219e.b(qVar, iVar, bool, kVar);
        this.f22221g.a(djVar.a(), strA, bool);
        nativeManager.handleDeepLink(strD, new com.waze.ui.x.a(18));
    }

    private final void v(ji jiVar) {
        s().OpenProgressPopup(jiVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(jl jlVar) {
        s().showNotificationMessagePopup(jlVar.b());
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final Object l(h.c.e eVar) {
        Object objD = aj.d(new k(this, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }
}
