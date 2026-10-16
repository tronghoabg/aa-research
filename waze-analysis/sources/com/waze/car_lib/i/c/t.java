package com.waze.car_lib.i.c;

import com.waze.car_lib.b.as;
import com.waze.car_lib.j.ak;
import com.waze.car_lib.p.dh;
import com.waze.navigate.am;
import com.waze.navigate.an;
import com.waze.navigate.ao;
import com.waze.navigate.ap;
import com.waze.navigate.aq;
import com.waze.navigate.gh;
import com.waze.navigate.gi;
import com.waze.navigate.gj;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.aa f20129a;

    /* renamed from: b, reason: collision with root package name */
    private final aq f20130b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.g f20131c;

    /* renamed from: d, reason: collision with root package name */
    private final gj f20132d;

    /* renamed from: e, reason: collision with root package name */
    private final ao f20133e;

    /* renamed from: f, reason: collision with root package name */
    private final ak f20134f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.j.y f20135g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.c.f f20136h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f20137i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f20138j;

    /* renamed from: k, reason: collision with root package name */
    private l f20139k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20140l;
    private boolean m;
    private final as n;
    private com.waze.realtime_report_feedback.c o;
    private com.waze.realtime_report_feedback.c p;

    public t(com.waze.map.aa aaVar, aq aqVar, com.waze.car_lib.g gVar, gj gjVar, ao aoVar, ak akVar, com.waze.car_lib.j.y yVar, as asVar, com.waze.car_lib.c.f fVar) {
        h.g.b.x.f(aaVar, "mapColorProvider");
        h.g.b.x.f(aqVar, "currentStreetState");
        h.g.b.x.f(gVar, "bottomPillVisibilityController");
        h.g.b.x.f(gjVar, "trafficStateInterface");
        h.g.b.x.f(aoVar, "averageSpeedCameraStateInterface");
        h.g.b.x.f(akVar, "trafficMeterSelector");
        h.g.b.x.f(yVar, "trafficMeterConfigRepository");
        h.g.b.x.f(asVar, "speedZoneConfig");
        h.g.b.x.f(fVar, "bottomPillAnalyticsSender");
        this.f20129a = aaVar;
        this.f20130b = aqVar;
        this.f20131c = gVar;
        this.f20132d = gjVar;
        this.f20133e = aoVar;
        this.f20134f = akVar;
        this.f20135g = yVar;
        this.n = asVar;
        this.f20136h = fVar;
        bn bnVarB = ck.b(null);
        this.f20137i = bnVarB;
        this.f20138j = kotlinx.coroutines.b.ai.U(bnVarB);
        this.o = gh.f31428a;
        this.p = an.f30997a;
    }

    public static final /* synthetic */ dh j(t tVar, l lVar) {
        if (lVar instanceof j) {
            j jVar = (j) lVar;
            return new d(jVar.a(), jVar.b(), jVar.c());
        }
        if (lVar instanceof k) {
            h.o.c cVar = h.o.a.f48264a;
            return new f(h.o.a.n(com.waze.settings.h.c.e(h.o.c.i(((k) lVar).a().b(), h.o.d.f48273d))));
        }
        if (!(lVar instanceof i)) {
            throw new h.i();
        }
        i iVar = (i) lVar;
        com.waze.sharedui.utils.c cVar2 = null;
        if (((int) iVar.a()) > 0 && tVar.n.e()) {
            cVar2 = new com.waze.sharedui.utils.c(com.waze.sharedui.utils.f.c(), (int) iVar.a(), true, true);
        }
        return new c(cVar2);
    }

    public static final /* synthetic */ l m(t tVar, ap apVar, com.waze.map.z zVar, boolean z, m mVar, com.waze.realtime_report_feedback.c cVar) {
        tVar.o = mVar.b();
        tVar.p = cVar;
        String strA = apVar != null ? apVar.a() : null;
        if (z) {
            if (tVar.f20135g.c() && mVar.a() && (mVar.b() instanceof gi)) {
                return new k((gi) mVar.b());
            }
            if (cVar instanceof am) {
                if (((am) cVar).a() > 0) {
                    return new i(r7.a());
                }
            }
            if (strA == null || strA.length() <= 0 || zVar == null) {
                return null;
            }
            return new j(zVar, strA, apVar.b());
        }
        return null;
    }

    public static final /* synthetic */ void o(t tVar, l lVar, com.waze.realtime_report_feedback.c cVar, com.waze.realtime_report_feedback.c cVar2) {
        boolean z = cVar instanceof gi;
        if (!z) {
            tVar.f20140l = false;
        }
        if (!(cVar2 instanceof am)) {
            tVar.m = false;
        }
        if (lVar != null) {
            if (lVar instanceof j) {
                if ((tVar.f20139k instanceof k) && z) {
                    gi giVar = (gi) cVar;
                    tVar.f20136h.c(false, giVar.b(), giVar.c());
                }
            } else if (lVar instanceof k) {
                if (tVar.f20140l) {
                    l lVar2 = tVar.f20139k;
                    if ((lVar2 instanceof j) || (lVar2 instanceof i)) {
                        k kVar = (k) lVar;
                        tVar.f20136h.c(true, kVar.a().b(), kVar.a().c());
                    }
                } else {
                    k kVar2 = (k) lVar;
                    tVar.f20136h.b(kVar2.a().b(), kVar2.a().c());
                    tVar.f20140l = true;
                }
            } else {
                if (!(lVar instanceof i)) {
                    throw new h.i();
                }
                if ((tVar.f20139k instanceof k) && z) {
                    gi giVar2 = (gi) cVar;
                    tVar.f20136h.c(false, giVar2.b(), giVar2.c());
                }
                if (!tVar.m) {
                    tVar.f20136h.a(tVar.n.g(), ((i) lVar).a());
                    tVar.m = true;
                }
            }
        }
        tVar.f20139k = lVar;
    }

    @Override // com.waze.car_lib.i.c.h
    public final Object a(kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        Object objD = aj.d(new ah(this, kVar, (h.c.e) null, 1), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    @Override // com.waze.car_lib.i.c.h
    public final ch b() {
        return this.f20138j;
    }
}
