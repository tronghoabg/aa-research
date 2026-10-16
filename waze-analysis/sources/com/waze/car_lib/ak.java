package com.waze.car_lib;

import androidx.autofill.HintConstants;
import com.waze.NativeManager;
import com.waze.car_lib.f.bv;
import com.waze.car_lib.f.bw;
import com.waze.car_lib.f.ca;
import com.waze.car_lib.f.cd;
import com.waze.car_lib.f.ci;
import com.waze.car_lib.f.ck;
import com.waze.car_lib.f.cl;
import com.waze.car_lib.f.cn;
import com.waze.car_lib.f.co;
import com.waze.car_lib.f.cv;
import com.waze.car_lib.f.cw;
import com.waze.car_lib.f.dm;
import com.waze.car_lib.f.dn;
import com.waze.car_lib.f.dt;
import com.waze.car_lib.f.dw;
import com.waze.car_lib.f.fo;
import com.waze.car_lib.f.ft;
import com.waze.car_lib.f.fv;
import com.waze.car_lib.f.fw;
import com.waze.car_lib.f.gf;
import com.waze.car_lib.f.gg;
import com.waze.car_lib.f.gq;
import com.waze.car_lib.f.gr;
import com.waze.car_lib.f.gs;
import com.waze.car_lib.f.gt;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.f.hk;
import com.waze.car_lib.f.hm;
import com.waze.car_lib.f.ic;
import com.waze.car_lib.f.id;
import com.waze.car_lib.f.ih;
import com.waze.car_lib.f.il;
import com.waze.car_lib.f.iu;
import com.waze.car_lib.f.iv;
import com.waze.car_lib.f.jd;
import com.waze.car_lib.f.jg;
import com.waze.car_lib.f.jk;
import com.waze.car_lib.f.jl;
import com.waze.config.ConfigValues;
import com.waze.ct;
import com.waze.kd;
import com.waze.modules.c.ch;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.db;
import com.waze.navigate.eh;
import com.waze.navigate.en;
import com.waze.navigate.eo;
import com.waze.navigate.gm;
import com.waze.places.PlacesNativeManager;
import com.waze.reports_v2.c.Cdo;
import com.waze.settings.ds;
import com.waze.settings.eb;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cb;
import com.waze.trip_overview.dq;
import e.a.dx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.cj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ak implements h.g.a.l {
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        org.a.d.g.a aVar = (org.a.d.g.a) obj;
        int i2 = ap.f18896a;
        h.g.b.x.f(aVar, "$this$module");
        int i3 = h.g.b.ar.f48106a;
        org.a.d.i.c cVar = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar = new dx(cVar, aVar);
        org.a.d.i.c cVar2 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar2 = new dx(cVar2, aVar);
        final int i4 = 18;
        h.g.a.p pVar = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i4) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i5 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i6 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar2 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar2, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i7 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i8 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i13 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ = dxVar2.j();
        org.a.d.i.a aVarK = dxVar2.k();
        org.a.d.c.c cVar3 = org.a.d.c.c.f56383b;
        org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(aVarK, new h.g.b.m(com.waze.car_lib.f.au.class), null, pVar, cVar3, h.a.i.h()));
        aVarJ.f(aVar2);
        new org.a.d.c.d(aVarJ, aVar2);
        final int i5 = 0;
        h.g.a.p pVar2 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i6 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar22 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar22, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i7 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i8 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i13 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ2 = dxVar2.j();
        org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.car_lib.f.ax.class), null, pVar2, cVar3, h.a.i.h()));
        aVarJ2.f(aVar3);
        new org.a.d.c.d(aVarJ2, aVar3);
        final int i6 = 12;
        h.g.a.p pVar3 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar22 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar22, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i7 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i8 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i9 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i11 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i13 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ3 = dxVar2.j();
        org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.car_lib.f.am.class), null, pVar3, cVar3, h.a.i.h()));
        aVarJ3.f(aVar4);
        new org.a.d.c.d(aVarJ3, aVar4);
        aVar.c().add(cVar2);
        org.a.d.i.c cVar4 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar3 = new dx(cVar4, aVar);
        final int i7 = 3;
        h.g.a.p pVar4 = new h.g.a.p() { // from class: com.waze.car_lib.al
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                int i8 = i7;
                if (i8 == 0) {
                    org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                    int i9 = ap.f18896a;
                    h.g.b.x.f(bVar, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i10 = h.g.b.ar.f48106a;
                    kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                    com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinatorController"));
                    h.g.b.x.e(eVarA, "provide(...)");
                    return new jl(afVar, eVarA);
                }
                if (i8 == 1) {
                    org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                    int i11 = ap.f18896a;
                    h.g.b.x.f(bVar2, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i12 = h.g.b.ar.f48106a;
                    gg ggVar = (gg) bVar2.a(new h.g.b.m(gg.class), null, null);
                    com.waze.shared_infra.i.e eVarA2 = ((com.waze.shared_infra.i.g) bVar2.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("ReportAlertCoordinator"));
                    h.g.b.x.e(eVarA2, "provide(...)");
                    return new gf(ggVar, eVarA2);
                }
                if (i8 == 2) {
                    org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                    int i13 = ap.f18896a;
                    h.g.b.x.f(bVar3, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i14 = h.g.b.ar.f48106a;
                    jl jlVar = (jl) bVar3.a(new h.g.b.m(jl.class), null, null);
                    com.waze.shared_infra.i.e eVarA3 = ((com.waze.shared_infra.i.g) bVar3.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinator"));
                    h.g.b.x.e(eVarA3, "provide(...)");
                    return new jk(jlVar, eVarA3);
                }
                if (i8 != 3) {
                    org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                    int i15 = ap.f18896a;
                    h.g.b.x.f(bVar4, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i16 = h.g.b.ar.f48106a;
                    return new iv((com.waze.shared_infra.i.i) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.i.class), null, null), (kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                int i17 = ap.f18896a;
                h.g.b.x.f(bVar5, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj3, "it");
                int i18 = h.g.b.ar.f48106a;
                com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar5.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                com.waze.authentication.l lVar = (com.waze.authentication.l) bVar5.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.car_lib.login.a aVar5 = (com.waze.car_lib.login.a) bVar5.a(new h.g.b.m(com.waze.car_lib.login.a.class), null, null);
                Boolean boolB = ConfigValues.CONFIG_VALUE_SIGNUP_VALUE_AAOS_KILL_SWITCH.b();
                h.g.b.x.e(boolB, "getValue(...)");
                return new il(mVar, lVar, aVar5, boolB.booleanValue(), (com.waze.install.a) bVar5.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.mywaze.n) bVar5.a(new h.g.b.m(com.waze.mywaze.n.class), null, null), ao.f18895a, (kotlinx.coroutines.af) bVar5.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_TITLE);
            }
        };
        org.a.d.g.a aVarJ4 = dxVar3.j();
        org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(dxVar3.k(), new h.g.b.m(il.class), null, pVar4, cVar3, h.a.i.h()));
        aVarJ4.f(aVar5);
        new org.a.d.c.d(aVarJ4, aVar5);
        final int i8 = 10;
        h.g.a.p pVar5 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i8) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i9 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i11 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i13 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i15 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i16 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i17 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i18 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i19 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i20 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i22 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i23 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar6 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar7 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar6, kdVar, aVar7, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar8 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar8, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar9 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar9, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar9.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ5 = dxVar3.j();
        org.a.d.e.a aVar6 = new org.a.d.e.a(new org.a.d.c.a(dxVar3.k(), new h.g.b.m(ih.class), null, pVar5, cVar3, h.a.i.h()));
        aVarJ5.f(aVar6);
        new org.a.d.c.d(aVarJ5, aVar6);
        aVar.c().add(cVar4);
        org.a.d.i.c cVar5 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar4 = new dx(cVar5, aVar);
        an anVar = new an(i5);
        org.a.d.g.a aVarJ6 = dxVar4.j();
        org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(dxVar4.k(), new h.g.b.m(gr.class), null, anVar, cVar3, h.a.i.h()));
        aVarJ6.f(aVar7);
        new org.a.d.c.d(aVarJ6, aVar7);
        final int i9 = 9;
        an anVar2 = new an(i9);
        org.a.d.g.a aVarJ7 = dxVar4.j();
        org.a.d.e.a aVar8 = new org.a.d.e.a(new org.a.d.c.a(dxVar4.k(), new h.g.b.m(gq.class), null, anVar2, cVar3, h.a.i.h()));
        aVarJ7.f(aVar8);
        new org.a.d.c.d(aVarJ7, aVar8);
        aVar.c().add(cVar5);
        org.a.d.i.c cVar6 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar5 = new dx(cVar6, aVar);
        an anVar3 = new an(i8);
        org.a.d.g.a aVarJ8 = dxVar5.j();
        org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(cw.class), null, anVar3, cVar3, h.a.i.h()));
        aVarJ8.f(aVar9);
        new org.a.d.c.d(aVarJ8, aVar9);
        an anVar4 = new an(11);
        org.a.d.g.a aVarJ9 = dxVar5.j();
        org.a.d.e.a aVar10 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.uid.stats.s.class), null, anVar4, cVar3, h.a.i.h()));
        aVarJ9.f(aVar10);
        new org.a.d.c.d(aVarJ9, aVar10);
        an anVar5 = new an(i6);
        org.a.d.g.a aVarJ10 = dxVar5.j();
        org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(cv.class), null, anVar5, cVar3, h.a.i.h()));
        aVarJ10.f(aVar11);
        new org.a.d.c.d(aVarJ10, aVar11);
        h.g.a.p pVar6 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i7) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i10 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i11 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i13 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i15 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i16 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i17 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i18 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i19 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i20 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i22 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i23 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ11 = dxVar5.j();
        org.a.d.e.a aVar12 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.car_lib.m.c.class), null, pVar6, cVar3, h.a.i.h()));
        aVarJ11.f(aVar12);
        new org.a.d.c.d(aVarJ11, aVar12);
        final int i10 = 14;
        h.g.a.p pVar7 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i10) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i11 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i12 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i13 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i15 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i16 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i17 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i18 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i19 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i20 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i21 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i22 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i23 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ12 = dxVar5.j();
        org.a.d.e.a aVar13 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(fw.class), null, pVar7, cVar3, h.a.i.h()));
        aVarJ12.f(aVar13);
        new org.a.d.c.d(aVarJ12, aVar13);
        final int i11 = 4;
        an anVar6 = new an(i11);
        org.a.d.g.a aVarJ13 = dxVar5.j();
        org.a.d.e.a aVar14 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.car_lib.f.cj.class), null, anVar6, cVar3, h.a.i.h()));
        aVarJ13.f(aVar14);
        new org.a.d.c.d(aVarJ13, aVar14);
        an anVar7 = new an(13);
        org.a.d.g.a aVarJ14 = dxVar5.j();
        org.a.d.e.a aVar15 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.car_lib.screens.l.class), null, anVar7, cVar3, h.a.i.h()));
        aVarJ14.f(aVar15);
        new org.a.d.c.d(aVarJ14, aVar15);
        an anVar8 = new an(i10);
        org.a.d.g.a aVarJ15 = dxVar5.j();
        org.a.d.e.a aVar16 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.car_lib.screens.k.class), null, anVar8, cVar3, h.a.i.h()));
        aVarJ15.f(aVar16);
        new org.a.d.c.d(aVarJ15, aVar16);
        an anVar9 = new an(15);
        org.a.d.g.a aVarJ16 = dxVar5.j();
        org.a.d.e.a aVar17 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(ci.class), null, anVar9, cVar3, h.a.i.h()));
        aVarJ16.f(aVar17);
        new org.a.d.c.d(aVarJ16, aVar17);
        an anVar10 = new an(16);
        org.a.d.g.a aVarJ17 = dxVar5.j();
        org.a.d.e.a aVar18 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.o.d.a.d.class), null, anVar10, cVar3, h.a.i.h()));
        aVarJ17.f(aVar18);
        new org.a.d.c.d(aVarJ17, aVar18);
        v vVar = new v(19);
        org.a.d.g.a aVarJ18 = dxVar5.j();
        org.a.d.e.a aVar19 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.o.d.a.c.class), null, vVar, cVar3, h.a.i.h()));
        aVarJ18.f(aVar19);
        new org.a.d.c.d(aVarJ18, aVar19);
        v vVar2 = new v(20);
        org.a.d.g.a aVarJ19 = dxVar5.j();
        org.a.d.e.a aVar20 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.o.d.a.b.class), null, vVar2, cVar3, h.a.i.h()));
        aVarJ19.f(aVar20);
        new org.a.d.c.d(aVarJ19, aVar20);
        aVar.c().add(cVar6);
        org.a.d.i.c cVar7 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar6 = new dx(cVar7, aVar);
        final int i12 = 1;
        h.g.a.p pVar8 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i12) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar22 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar22, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i13 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ20 = dxVar6.j();
        org.a.d.e.a aVar21 = new org.a.d.e.a(new org.a.d.c.a(dxVar6.k(), new h.g.b.m(jg.class), null, pVar8, cVar3, h.a.i.h()));
        aVarJ20.f(aVar21);
        new org.a.d.c.d(aVarJ20, aVar21);
        final int i13 = 2;
        h.g.a.p pVar9 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i13) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar22 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar22, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ21 = dxVar6.j();
        org.a.d.e.a aVar22 = new org.a.d.e.a(new org.a.d.c.a(dxVar6.k(), new h.g.b.m(jd.class), null, pVar9, cVar3, h.a.i.h()));
        aVarJ21.f(aVar22);
        new org.a.d.c.d(aVarJ21, aVar22);
        aVar.c().add(cVar7);
        org.a.d.i.c cVar8 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar7 = new dx(cVar8, aVar);
        h.g.a.p pVar10 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i7) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ22 = dxVar7.j();
        org.a.d.e.a aVar23 = new org.a.d.e.a(new org.a.d.c.a(dxVar7.k(), new h.g.b.m(dw.class), null, pVar10, cVar3, h.a.i.h()));
        aVarJ22.f(aVar23);
        new org.a.d.c.d(aVarJ22, aVar23);
        h.g.a.p pVar11 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i11) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i14 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ23 = dxVar7.j();
        org.a.d.e.a aVar24 = new org.a.d.e.a(new org.a.d.c.a(dxVar7.k(), new h.g.b.m(dt.class), null, pVar11, cVar3, h.a.i.h()));
        aVarJ23.f(aVar24);
        new org.a.d.c.d(aVarJ23, aVar24);
        aVar.c().add(cVar8);
        org.a.d.i.c cVar9 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar8 = new dx(cVar9, aVar);
        final int i14 = 5;
        h.g.a.p pVar12 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i14) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i15 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ24 = dxVar8.j();
        org.a.d.e.a aVar25 = new org.a.d.e.a(new org.a.d.c.a(dxVar8.k(), new h.g.b.m(com.waze.car_lib.r.a.c.class), null, pVar12, cVar3, h.a.i.h()));
        aVarJ24.f(aVar25);
        new org.a.d.c.d(aVarJ24, aVar25);
        final int i15 = 6;
        h.g.a.p pVar13 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i15) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i16 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ25 = dxVar8.j();
        org.a.d.e.a aVar26 = new org.a.d.e.a(new org.a.d.c.a(dxVar8.k(), new h.g.b.m(com.waze.car_lib.f.a.f.class), null, pVar13, cVar3, h.a.i.h()));
        aVarJ25.f(aVar26);
        new org.a.d.c.d(aVarJ25, aVar26);
        final int i16 = 7;
        h.g.a.p pVar14 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i16) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i17 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ26 = dxVar8.j();
        org.a.d.e.a aVar27 = new org.a.d.e.a(new org.a.d.c.a(dxVar8.k(), new h.g.b.m(com.waze.car_lib.f.a.c.class), null, pVar14, cVar3, h.a.i.h()));
        aVarJ26.f(aVar27);
        new org.a.d.c.d(aVarJ26, aVar27);
        aVar.c().add(cVar9);
        org.a.d.i.c cVar10 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar9 = new dx(cVar10, aVar);
        final int i17 = 8;
        h.g.a.p pVar15 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i17) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.i.a aVarK2 = dxVar9.k();
        org.a.d.c.c cVar11 = org.a.d.c.c.f56384c;
        org.a.d.e.c cVar12 = new org.a.d.e.c(new org.a.d.c.a(aVarK2, new h.g.b.m(com.waze.car_lib.o.n.class), null, pVar15, cVar11, h.a.i.h()));
        dxVar9.j().f(cVar12);
        new org.a.d.c.d(dxVar9.j(), cVar12);
        h.g.a.p pVar16 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i9) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ27 = dxVar9.j();
        org.a.d.e.a aVar28 = new org.a.d.e.a(new org.a.d.c.a(dxVar9.k(), new h.g.b.m(hm.class), null, pVar16, cVar3, h.a.i.h()));
        aVarJ27.f(aVar28);
        new org.a.d.c.d(aVarJ27, aVar28);
        h.g.a.p pVar17 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i8) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i18 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ28 = dxVar9.j();
        org.a.d.e.a aVar29 = new org.a.d.e.a(new org.a.d.c.a(dxVar9.k(), new h.g.b.m(hk.class), null, pVar17, cVar3, h.a.i.h()));
        aVarJ28.f(aVar29);
        new org.a.d.c.d(aVarJ28, aVar29);
        aVar.c().add(cVar10);
        org.a.d.i.c cVar13 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar10 = new dx(cVar13, aVar);
        final int i18 = 11;
        h.g.a.p pVar18 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i18) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i19 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ29 = dxVar10.j();
        org.a.d.e.a aVar30 = new org.a.d.e.a(new org.a.d.c.a(dxVar10.k(), new h.g.b.m(com.waze.car_lib.c.m.class), null, pVar18, cVar3, h.a.i.h()));
        aVarJ29.f(aVar30);
        new org.a.d.c.d(aVarJ29, aVar30);
        final int i19 = 13;
        h.g.a.p pVar19 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i19) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ30 = dxVar10.j();
        org.a.d.e.a aVar31 = new org.a.d.e.a(new org.a.d.c.a(dxVar10.k(), new h.g.b.m(gw.class), null, pVar19, cVar3, h.a.i.h()));
        aVarJ30.f(aVar31);
        new org.a.d.c.d(aVarJ30, aVar31);
        h.g.a.p pVar20 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i10) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i20 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ31 = dxVar10.j();
        org.a.d.e.a aVar32 = new org.a.d.e.a(new org.a.d.c.a(dxVar10.k(), new h.g.b.m(gs.class), null, pVar20, cVar3, h.a.i.h()));
        aVarJ31.f(aVar32);
        new org.a.d.c.d(aVarJ31, aVar32);
        aVar.c().add(cVar13);
        org.a.d.i.c cVar14 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar11 = new dx(cVar14, aVar);
        final int i20 = 15;
        h.g.a.p pVar21 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i20) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i21 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ32 = dxVar11.j();
        org.a.d.e.a aVar33 = new org.a.d.e.a(new org.a.d.c.a(dxVar11.k(), new h.g.b.m(dn.class), null, pVar21, cVar3, h.a.i.h()));
        aVarJ32.f(aVar33);
        new org.a.d.c.d(aVarJ32, aVar33);
        final int i21 = 16;
        h.g.a.p pVar22 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i22 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ33 = dxVar11.j();
        org.a.d.e.a aVar34 = new org.a.d.e.a(new org.a.d.c.a(dxVar11.k(), new h.g.b.m(dm.class), null, pVar22, cVar3, h.a.i.h()));
        aVarJ33.f(aVar34);
        new org.a.d.c.d(aVarJ33, aVar34);
        aVar.c().add(cVar14);
        org.a.d.i.c cVar15 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar12 = new dx(cVar15, aVar);
        final int i22 = 17;
        h.g.a.p pVar23 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i222 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i23 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ34 = dxVar12.j();
        org.a.d.e.a aVar35 = new org.a.d.e.a(new org.a.d.c.a(dxVar12.k(), new h.g.b.m(com.waze.car_lib.f.z.class), null, pVar23, cVar3, h.a.i.h()));
        aVarJ34.f(aVar35);
        new org.a.d.c.d(aVarJ34, aVar35);
        final int i23 = 19;
        h.g.a.p pVar24 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i23) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i222 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i232 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i24 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ35 = dxVar12.j();
        org.a.d.e.a aVar36 = new org.a.d.e.a(new org.a.d.c.a(dxVar12.k(), new h.g.b.m(com.waze.car_lib.f.y.class), null, pVar24, cVar3, h.a.i.h()));
        aVarJ35.f(aVar36);
        new org.a.d.c.d(aVarJ35, aVar36);
        aVar.c().add(cVar15);
        org.a.d.i.c cVar16 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar13 = new dx(cVar16, aVar);
        final int i24 = 20;
        h.g.a.p pVar25 = new h.g.a.p() { // from class: com.waze.car_lib.aj
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i24) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i52 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i62 = h.g.b.ar.f48106a;
                        db dbVar = (db) bVar.a(new h.g.b.m(db.class), null, null);
                        com.waze.car_lib.b.br brVar = (com.waze.car_lib.b.br) bVar.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null);
                        com.waze.main_screen.af.a.i iVar = (com.waze.main_screen.af.a.i) bVar.a(new h.g.b.m(com.waze.main_screen.af.a.i.class), null, null);
                        com.waze.car_lib.b.ap apVar = (com.waze.car_lib.b.ap) bVar.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null);
                        com.waze.shared_infra.r.a aVar222 = (com.waze.shared_infra.r.a) bVar.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                        com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                        com.waze.map.isolated.i iVar2 = (com.waze.map.isolated.i) bVar.a(new h.g.b.m(com.waze.map.isolated.i.class), null, null);
                        com.waze.search.bn bnVar = (com.waze.search.bn) bVar.a(new h.g.b.m(com.waze.search.bn.class), null, null);
                        com.waze.bj bjVar = (com.waze.bj) bVar.a(new h.g.b.m(com.waze.bj.class), null, null);
                        com.waze.car_lib.n.z zVar = (com.waze.car_lib.n.z) bVar.a(new h.g.b.m(com.waze.car_lib.n.z.class), null, null);
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("AppCoordinatorController"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        return new com.waze.car_lib.f.ax(dbVar, brVar, iVar, apVar, aVar222, mVar, iVar2, bnVar, bjVar, zVar, eVarA, (com.waze.car_lib.g.j) bVar.a(new h.g.b.m(com.waze.car_lib.g.j.class), null, null), (com.waze.car_lib.f.au) bVar.a(new h.g.b.m(com.waze.car_lib.f.au.class), null, null), (com.waze.z) bVar.a(new h.g.b.m(com.waze.z.class), null, null), (com.waze.cg.b.e) bVar.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.map.b.n) bVar.a(new h.g.b.m(com.waze.map.b.n.class), null, null), (ct) bVar.a(new h.g.b.m(ct.class), null, null), (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i72 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i82 = h.g.b.ar.f48106a;
                        return new jg((com.waze.car_lib.login.m) bVar2.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null), (kotlinx.coroutines.af) bVar2.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new jd((jg) bVar3.a(new h.g.b.m(jg.class), null, null));
                    case 3:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new dw((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.b.ap) bVar4.a(new h.g.b.m(com.waze.car_lib.b.ap.class), null, null), com.waze.settings.tree.c.f.g(bVar4, "MapMessagePopupCoordinatorController"));
                    case 4:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new dt((dw) bVar5.a(new h.g.b.m(dw.class), null, null));
                    case 5:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i152 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i162 = h.g.b.ar.f48106a;
                        com.waze.map.b.n nVar = (com.waze.map.b.n) bVar6.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar6.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.c.d.h hVar = (com.waze.c.d.h) bVar6.a(new h.g.b.m(com.waze.c.d.h.class), null, null);
                        com.waze.c.e.a.b bVar7 = (com.waze.c.e.a.b) bVar6.a(new h.g.b.m(com.waze.c.e.a.b.class), null, null);
                        com.waze.car_lib.l.d dVar = (com.waze.car_lib.l.d) bVar6.a(new h.g.b.m(com.waze.car_lib.l.d.class), null, null);
                        com.waze.c.d.am amVar = (com.waze.c.d.am) bVar6.a(new h.g.b.m(com.waze.c.d.am.class), com.waze.ch.a.a.f.e(com.waze.c.d.bc.f18343b), null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AlternateRoutesV2ScreenViewModel");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.a.c(nVar, fVar, hVar, bVar7, amVar, dVar, (com.waze.perf.tracer.g) bVar6.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null), eVarD);
                    case 6:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i172 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i182 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.f((kotlinx.coroutines.af) bVar8.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i192 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i202 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a.c((com.waze.car_lib.f.a.f) bVar9.a(new h.g.b.m(com.waze.car_lib.f.a.f.class), null, null), (com.waze.car_lib.r.a.c) bVar9.a(new h.g.b.m(com.waze.car_lib.r.a.c.class), null, null), (com.waze.map.b.n) bVar9.a(new h.g.b.m(com.waze.map.b.n.class), null, null));
                    case 8:
                        org.a.d.k.b bVar10 = (org.a.d.k.b) obj2;
                        int i212 = ap.f18896a;
                        h.g.b.x.f(bVar10, "$this$scoped");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i222 = h.g.b.ar.f48106a;
                        en enVar = (en) bVar10.a(new h.g.b.m(en.class), null, null);
                        List listI = h.a.i.i(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
                        ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.google.firebase.messaging.l((com.waze.config.d) it.next()));
                        }
                        int i232 = kotlinx.coroutines.av.f51370a;
                        cj cjVarC = kotlinx.coroutines.e.ac.f51860a.c();
                        com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InCarRoutingSettingsChangeMonitor");
                        h.g.b.x.e(eVarD2, "create(...)");
                        return new com.waze.car_lib.o.q(enVar, arrayList, cjVarC, eVarD2);
                    case 9:
                        org.a.d.k.b bVar11 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar11, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i25 = h.g.b.ar.f48106a;
                        return new hm((com.waze.av.b.ah) bVar11.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (MyWazeNativeManager) bVar11.a(new h.g.b.m(MyWazeNativeManager.class), null, null), (com.waze.car_lib.c.a) bVar11.a(new h.g.b.m(com.waze.car_lib.c.a.class), null, null), (ds) bVar11.a(new h.g.b.m(ds.class), null, null), com.waze.car_lib.o.i.f20472a, (com.waze.car_lib.r.b.b) bVar11.a(new h.g.b.m(com.waze.car_lib.r.b.b.class), null, null), (kotlinx.coroutines.af) bVar11.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i26 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i27 = h.g.b.ar.f48106a;
                        return new hk((hm) bVar12.a(new h.g.b.m(hm.class), null, null), (DriveToNativeManager) bVar12.a(new h.g.b.m(DriveToNativeManager.class), null, null), (com.waze.car_lib.o.n) bVar12.a(new h.g.b.m(com.waze.car_lib.o.n.class), null, null), (com.waze.car_lib.c.n) bVar12.a(new h.g.b.m(com.waze.car_lib.c.n.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.c.m((com.waze.search.stats.s) bVar13.a(new h.g.b.m(com.waze.search.stats.s.class), null, null), (com.waze.z) bVar13.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.am((com.waze.car_lib.f.ax) bVar14.a(new h.g.b.m(com.waze.car_lib.f.ax.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
                    case 13:
                        org.a.d.k.b bVar15 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar15, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        return new gw((com.waze.car_lib.j.a) bVar15.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (com.waze.car_lib.n.r) bVar15.a(new h.g.b.m(com.waze.car_lib.n.r.class), null, null), (com.waze.search.b.a) bVar15.a(new h.g.b.m(com.waze.search.b.a.class), null, null), (com.waze.car_lib.c.m) bVar15.a(new h.g.b.m(com.waze.car_lib.c.m.class), null, null), (com.waze.av.b.ah) bVar15.a(new h.g.b.m(com.waze.av.b.ah.class), null, null), (kotlinx.coroutines.af) bVar15.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), new gt());
                    case 14:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i34 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i35 = h.g.b.ar.f48106a;
                        return new gs((gw) bVar16.a(new h.g.b.m(gw.class), null, null));
                    case 15:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        int i36 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i37 = h.g.b.ar.f48106a;
                        return new dn((kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i38 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i39 = h.g.b.ar.f48106a;
                        return new dm((dn) bVar18.a(new h.g.b.m(dn.class), null, null));
                    case 17:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i40 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i41 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.z((com.waze.car_lib.c.b) bVar19.a(new h.g.b.m(com.waze.car_lib.c.b.class), null, null), (com.waze.car_lib.j.a) bVar19.a(new h.g.b.m(com.waze.car_lib.j.a.class), null, null), (kotlinx.coroutines.af) bVar19.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.navigate.location_preview.bh) bVar19.a(new h.g.b.m(com.waze.navigate.location_preview.bh.class), null, null), (com.waze.z) bVar19.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 18:
                        int i42 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.f.au();
                    case 19:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.y((com.waze.car_lib.f.z) bVar20.a(new h.g.b.m(com.waze.car_lib.f.z.class), null, null));
                    default:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new gg((com.waze.car_lib.b.br) bVar21.a(new h.g.b.m(com.waze.car_lib.b.br.class), null, null), (Cdo) bVar21.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar21.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (kotlinx.coroutines.af) bVar21.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ36 = dxVar13.j();
        org.a.d.e.a aVar37 = new org.a.d.e.a(new org.a.d.c.a(dxVar13.k(), new h.g.b.m(gg.class), null, pVar25, cVar3, h.a.i.h()));
        aVarJ36.f(aVar37);
        new org.a.d.c.d(aVarJ36, aVar37);
        final int i25 = 1;
        h.g.a.p pVar26 = new h.g.a.p() { // from class: com.waze.car_lib.al
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                int i82 = i25;
                if (i82 == 0) {
                    org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                    int i92 = ap.f18896a;
                    h.g.b.x.f(bVar, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i102 = h.g.b.ar.f48106a;
                    kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                    com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinatorController"));
                    h.g.b.x.e(eVarA, "provide(...)");
                    return new jl(afVar, eVarA);
                }
                if (i82 == 1) {
                    org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                    int i112 = ap.f18896a;
                    h.g.b.x.f(bVar2, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i122 = h.g.b.ar.f48106a;
                    gg ggVar = (gg) bVar2.a(new h.g.b.m(gg.class), null, null);
                    com.waze.shared_infra.i.e eVarA2 = ((com.waze.shared_infra.i.g) bVar2.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("ReportAlertCoordinator"));
                    h.g.b.x.e(eVarA2, "provide(...)");
                    return new gf(ggVar, eVarA2);
                }
                if (i82 == 2) {
                    org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                    int i132 = ap.f18896a;
                    h.g.b.x.f(bVar3, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i142 = h.g.b.ar.f48106a;
                    jl jlVar = (jl) bVar3.a(new h.g.b.m(jl.class), null, null);
                    com.waze.shared_infra.i.e eVarA3 = ((com.waze.shared_infra.i.g) bVar3.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinator"));
                    h.g.b.x.e(eVarA3, "provide(...)");
                    return new jk(jlVar, eVarA3);
                }
                if (i82 != 3) {
                    org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                    int i152 = ap.f18896a;
                    h.g.b.x.f(bVar4, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i162 = h.g.b.ar.f48106a;
                    return new iv((com.waze.shared_infra.i.i) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.i.class), null, null), (kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                int i172 = ap.f18896a;
                h.g.b.x.f(bVar5, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj3, "it");
                int i182 = h.g.b.ar.f48106a;
                com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar5.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                com.waze.authentication.l lVar = (com.waze.authentication.l) bVar5.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.car_lib.login.a aVar52 = (com.waze.car_lib.login.a) bVar5.a(new h.g.b.m(com.waze.car_lib.login.a.class), null, null);
                Boolean boolB = ConfigValues.CONFIG_VALUE_SIGNUP_VALUE_AAOS_KILL_SWITCH.b();
                h.g.b.x.e(boolB, "getValue(...)");
                return new il(mVar, lVar, aVar52, boolB.booleanValue(), (com.waze.install.a) bVar5.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.mywaze.n) bVar5.a(new h.g.b.m(com.waze.mywaze.n.class), null, null), ao.f18895a, (kotlinx.coroutines.af) bVar5.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_TITLE);
            }
        };
        org.a.d.g.a aVarJ37 = dxVar13.j();
        org.a.d.e.a aVar38 = new org.a.d.e.a(new org.a.d.c.a(dxVar13.k(), new h.g.b.m(gf.class), null, pVar26, cVar3, h.a.i.h()));
        aVarJ37.f(aVar38);
        new org.a.d.c.d(aVarJ37, aVar38);
        aVar.c().add(cVar16);
        org.a.d.i.c cVar17 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar14 = new dx(cVar17, aVar);
        final int i26 = 0;
        h.g.a.p pVar27 = new h.g.a.p() { // from class: com.waze.car_lib.al
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                int i82 = i26;
                if (i82 == 0) {
                    org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                    int i92 = ap.f18896a;
                    h.g.b.x.f(bVar, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i102 = h.g.b.ar.f48106a;
                    kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                    com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinatorController"));
                    h.g.b.x.e(eVarA, "provide(...)");
                    return new jl(afVar, eVarA);
                }
                if (i82 == 1) {
                    org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                    int i112 = ap.f18896a;
                    h.g.b.x.f(bVar2, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i122 = h.g.b.ar.f48106a;
                    gg ggVar = (gg) bVar2.a(new h.g.b.m(gg.class), null, null);
                    com.waze.shared_infra.i.e eVarA2 = ((com.waze.shared_infra.i.g) bVar2.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("ReportAlertCoordinator"));
                    h.g.b.x.e(eVarA2, "provide(...)");
                    return new gf(ggVar, eVarA2);
                }
                if (i82 == 2) {
                    org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                    int i132 = ap.f18896a;
                    h.g.b.x.f(bVar3, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i142 = h.g.b.ar.f48106a;
                    jl jlVar = (jl) bVar3.a(new h.g.b.m(jl.class), null, null);
                    com.waze.shared_infra.i.e eVarA3 = ((com.waze.shared_infra.i.g) bVar3.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinator"));
                    h.g.b.x.e(eVarA3, "provide(...)");
                    return new jk(jlVar, eVarA3);
                }
                if (i82 != 3) {
                    org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                    int i152 = ap.f18896a;
                    h.g.b.x.f(bVar4, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i162 = h.g.b.ar.f48106a;
                    return new iv((com.waze.shared_infra.i.i) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.i.class), null, null), (kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                int i172 = ap.f18896a;
                h.g.b.x.f(bVar5, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj3, "it");
                int i182 = h.g.b.ar.f48106a;
                com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar5.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                com.waze.authentication.l lVar = (com.waze.authentication.l) bVar5.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.car_lib.login.a aVar52 = (com.waze.car_lib.login.a) bVar5.a(new h.g.b.m(com.waze.car_lib.login.a.class), null, null);
                Boolean boolB = ConfigValues.CONFIG_VALUE_SIGNUP_VALUE_AAOS_KILL_SWITCH.b();
                h.g.b.x.e(boolB, "getValue(...)");
                return new il(mVar, lVar, aVar52, boolB.booleanValue(), (com.waze.install.a) bVar5.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.mywaze.n) bVar5.a(new h.g.b.m(com.waze.mywaze.n.class), null, null), ao.f18895a, (kotlinx.coroutines.af) bVar5.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_TITLE);
            }
        };
        org.a.d.g.a aVarJ38 = dxVar14.j();
        org.a.d.e.a aVar39 = new org.a.d.e.a(new org.a.d.c.a(dxVar14.k(), new h.g.b.m(jl.class), null, pVar27, cVar3, h.a.i.h()));
        aVarJ38.f(aVar39);
        new org.a.d.c.d(aVarJ38, aVar39);
        h.g.a.p pVar28 = new h.g.a.p() { // from class: com.waze.car_lib.al
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                int i82 = i13;
                if (i82 == 0) {
                    org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                    int i92 = ap.f18896a;
                    h.g.b.x.f(bVar, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i102 = h.g.b.ar.f48106a;
                    kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                    com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinatorController"));
                    h.g.b.x.e(eVarA, "provide(...)");
                    return new jl(afVar, eVarA);
                }
                if (i82 == 1) {
                    org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                    int i112 = ap.f18896a;
                    h.g.b.x.f(bVar2, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i122 = h.g.b.ar.f48106a;
                    gg ggVar = (gg) bVar2.a(new h.g.b.m(gg.class), null, null);
                    com.waze.shared_infra.i.e eVarA2 = ((com.waze.shared_infra.i.g) bVar2.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("ReportAlertCoordinator"));
                    h.g.b.x.e(eVarA2, "provide(...)");
                    return new gf(ggVar, eVarA2);
                }
                if (i82 == 2) {
                    org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                    int i132 = ap.f18896a;
                    h.g.b.x.f(bVar3, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i142 = h.g.b.ar.f48106a;
                    jl jlVar = (jl) bVar3.a(new h.g.b.m(jl.class), null, null);
                    com.waze.shared_infra.i.e eVarA3 = ((com.waze.shared_infra.i.g) bVar3.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinator"));
                    h.g.b.x.e(eVarA3, "provide(...)");
                    return new jk(jlVar, eVarA3);
                }
                if (i82 != 3) {
                    org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                    int i152 = ap.f18896a;
                    h.g.b.x.f(bVar4, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i162 = h.g.b.ar.f48106a;
                    return new iv((com.waze.shared_infra.i.i) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.i.class), null, null), (kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                int i172 = ap.f18896a;
                h.g.b.x.f(bVar5, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj3, "it");
                int i182 = h.g.b.ar.f48106a;
                com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar5.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                com.waze.authentication.l lVar = (com.waze.authentication.l) bVar5.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.car_lib.login.a aVar52 = (com.waze.car_lib.login.a) bVar5.a(new h.g.b.m(com.waze.car_lib.login.a.class), null, null);
                Boolean boolB = ConfigValues.CONFIG_VALUE_SIGNUP_VALUE_AAOS_KILL_SWITCH.b();
                h.g.b.x.e(boolB, "getValue(...)");
                return new il(mVar, lVar, aVar52, boolB.booleanValue(), (com.waze.install.a) bVar5.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.mywaze.n) bVar5.a(new h.g.b.m(com.waze.mywaze.n.class), null, null), ao.f18895a, (kotlinx.coroutines.af) bVar5.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_TITLE);
            }
        };
        org.a.d.g.a aVarJ39 = dxVar14.j();
        org.a.d.e.a aVar40 = new org.a.d.e.a(new org.a.d.c.a(dxVar14.k(), new h.g.b.m(jk.class), null, pVar28, cVar3, h.a.i.h()));
        aVarJ39.f(aVar40);
        new org.a.d.c.d(aVarJ39, aVar40);
        aVar.c().add(cVar17);
        org.a.d.i.c cVar18 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar15 = new dx(cVar18, aVar);
        h.g.a.p pVar29 = new h.g.a.p() { // from class: com.waze.car_lib.al
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                int i82 = i11;
                if (i82 == 0) {
                    org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                    int i92 = ap.f18896a;
                    h.g.b.x.f(bVar, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i102 = h.g.b.ar.f48106a;
                    kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                    com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinatorController"));
                    h.g.b.x.e(eVarA, "provide(...)");
                    return new jl(afVar, eVarA);
                }
                if (i82 == 1) {
                    org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                    int i112 = ap.f18896a;
                    h.g.b.x.f(bVar2, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i122 = h.g.b.ar.f48106a;
                    gg ggVar = (gg) bVar2.a(new h.g.b.m(gg.class), null, null);
                    com.waze.shared_infra.i.e eVarA2 = ((com.waze.shared_infra.i.g) bVar2.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("ReportAlertCoordinator"));
                    h.g.b.x.e(eVarA2, "provide(...)");
                    return new gf(ggVar, eVarA2);
                }
                if (i82 == 2) {
                    org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                    int i132 = ap.f18896a;
                    h.g.b.x.f(bVar3, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i142 = h.g.b.ar.f48106a;
                    jl jlVar = (jl) bVar3.a(new h.g.b.m(jl.class), null, null);
                    com.waze.shared_infra.i.e eVarA3 = ((com.waze.shared_infra.i.g) bVar3.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("WazeAsksInCarCoordinator"));
                    h.g.b.x.e(eVarA3, "provide(...)");
                    return new jk(jlVar, eVarA3);
                }
                if (i82 != 3) {
                    org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                    int i152 = ap.f18896a;
                    h.g.b.x.f(bVar4, "$this$factory");
                    h.g.b.x.f((org.a.d.h.a) obj3, "it");
                    int i162 = h.g.b.ar.f48106a;
                    return new iv((com.waze.shared_infra.i.i) bVar4.a(new h.g.b.m(com.waze.shared_infra.i.i.class), null, null), (kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                }
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                int i172 = ap.f18896a;
                h.g.b.x.f(bVar5, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj3, "it");
                int i182 = h.g.b.ar.f48106a;
                com.waze.car_lib.login.m mVar = (com.waze.car_lib.login.m) bVar5.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null);
                com.waze.authentication.l lVar = (com.waze.authentication.l) bVar5.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.car_lib.login.a aVar52 = (com.waze.car_lib.login.a) bVar5.a(new h.g.b.m(com.waze.car_lib.login.a.class), null, null);
                Boolean boolB = ConfigValues.CONFIG_VALUE_SIGNUP_VALUE_AAOS_KILL_SWITCH.b();
                h.g.b.x.e(boolB, "getValue(...)");
                return new il(mVar, lVar, aVar52, boolB.booleanValue(), (com.waze.install.a) bVar5.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.mywaze.n) bVar5.a(new h.g.b.m(com.waze.mywaze.n.class), null, null), ao.f18895a, (kotlinx.coroutines.af) bVar5.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_TITLE);
            }
        };
        org.a.d.g.a aVarJ40 = dxVar15.j();
        org.a.d.e.a aVar41 = new org.a.d.e.a(new org.a.d.c.a(dxVar15.k(), new h.g.b.m(iv.class), null, pVar29, cVar3, h.a.i.h()));
        aVarJ40.f(aVar41);
        new org.a.d.c.d(aVarJ40, aVar41);
        final int i27 = 1;
        h.g.a.p pVar30 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i27) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i28 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ41 = dxVar15.j();
        org.a.d.e.a aVar42 = new org.a.d.e.a(new org.a.d.c.a(dxVar15.k(), new h.g.b.m(iu.class), null, pVar30, cVar3, h.a.i.h()));
        aVarJ41.f(aVar42);
        new org.a.d.c.d(aVarJ41, aVar42);
        aVar.c().add(cVar18);
        org.a.d.i.c cVar19 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar16 = new dx(cVar19, aVar);
        final int i28 = 0;
        h.g.a.p pVar31 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i28) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ42 = dxVar16.j();
        org.a.d.e.a aVar43 = new org.a.d.e.a(new org.a.d.c.a(dxVar16.k(), new h.g.b.m(cl.class), null, pVar31, cVar3, h.a.i.h()));
        aVarJ42.f(aVar43);
        new org.a.d.c.d(aVarJ42, aVar43);
        h.g.a.p pVar32 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i13) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ43 = dxVar16.j();
        org.a.d.e.a aVar44 = new org.a.d.e.a(new org.a.d.c.a(dxVar16.k(), new h.g.b.m(ck.class), null, pVar32, cVar3, h.a.i.h()));
        aVarJ43.f(aVar44);
        new org.a.d.c.d(aVarJ43, aVar44);
        aVar.c().add(cVar19);
        org.a.d.i.c cVar20 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar17 = new dx(cVar20, aVar);
        h.g.a.p pVar33 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i11) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i29 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ44 = dxVar17.j();
        org.a.d.e.a aVar45 = new org.a.d.e.a(new org.a.d.c.a(dxVar17.k(), new h.g.b.m(co.class), null, pVar33, cVar3, h.a.i.h()));
        aVarJ44.f(aVar45);
        new org.a.d.c.d(aVarJ44, aVar45);
        final int i29 = 5;
        h.g.a.p pVar34 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i29) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i30 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ45 = dxVar17.j();
        org.a.d.e.a aVar46 = new org.a.d.e.a(new org.a.d.c.a(dxVar17.k(), new h.g.b.m(cn.class), null, pVar34, cVar3, h.a.i.h()));
        aVarJ45.f(aVar46);
        new org.a.d.c.d(aVarJ45, aVar46);
        aVar.c().add(cVar20);
        org.a.d.i.c cVar21 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar18 = new dx(cVar21, aVar);
        final int i30 = 6;
        h.g.a.p pVar35 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i30) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i31 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ46 = dxVar18.j();
        org.a.d.e.a aVar47 = new org.a.d.e.a(new org.a.d.c.a(dxVar18.k(), new h.g.b.m(id.class), null, pVar35, cVar3, h.a.i.h()));
        aVarJ46.f(aVar47);
        new org.a.d.c.d(aVarJ46, aVar47);
        final int i31 = 7;
        h.g.a.p pVar36 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i31) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ47 = dxVar18.j();
        org.a.d.e.a aVar48 = new org.a.d.e.a(new org.a.d.c.a(dxVar18.k(), new h.g.b.m(ic.class), null, pVar36, cVar3, h.a.i.h()));
        aVarJ47.f(aVar48);
        new org.a.d.c.d(aVarJ47, aVar48);
        aVar.c().add(cVar21);
        org.a.d.i.c cVar22 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar19 = new dx(cVar22, aVar);
        h.g.a.p pVar37 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i17) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i32 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ48 = dxVar19.j();
        org.a.d.e.a aVar49 = new org.a.d.e.a(new org.a.d.c.a(dxVar19.k(), new h.g.b.m(com.waze.car_lib.f.a.class), null, pVar37, cVar3, h.a.i.h()));
        aVarJ48.f(aVar49);
        new org.a.d.c.d(aVarJ48, aVar49);
        final int i32 = 9;
        h.g.a.p pVar38 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i33 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ49 = dxVar19.j();
        org.a.d.e.a aVar50 = new org.a.d.e.a(new org.a.d.c.a(dxVar19.k(), new h.g.b.m(com.waze.modules.navigation.bk.class), null, pVar38, cVar3, h.a.i.h()));
        aVarJ49.f(aVar50);
        com.waze.web.r.q(new org.a.d.c.d(aVarJ49, aVar50), new h.g.b.m(com.waze.modules.navigation.ag.class));
        aVar.c().add(cVar22);
        org.a.d.i.c cVar23 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar20 = new dx(cVar23, aVar);
        final int i33 = 11;
        h.g.a.p pVar39 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i34 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ50 = dxVar20.j();
        org.a.d.e.a aVar51 = new org.a.d.e.a(new org.a.d.c.a(dxVar20.k(), new h.g.b.m(com.waze.car_lib.f.h.class), null, pVar39, cVar3, h.a.i.h()));
        aVarJ50.f(aVar51);
        new org.a.d.c.d(aVarJ50, aVar51);
        final int i34 = 12;
        h.g.a.p pVar40 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i34) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i35 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ51 = dxVar20.j();
        org.a.d.e.a aVar52 = new org.a.d.e.a(new org.a.d.c.a(dxVar20.k(), new h.g.b.m(com.waze.car_lib.r.d.i.class), null, pVar40, cVar3, h.a.i.h()));
        aVarJ51.f(aVar52);
        new org.a.d.c.d(aVarJ51, aVar52);
        final int i35 = 13;
        h.g.a.p pVar41 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i35) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i352 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i36 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ52 = dxVar20.j();
        org.a.d.e.a aVar53 = new org.a.d.e.a(new org.a.d.c.a(dxVar20.k(), new h.g.b.m(com.waze.car_lib.f.e.class), null, pVar41, cVar3, h.a.i.h()));
        aVarJ52.f(aVar53);
        new org.a.d.c.d(aVarJ52, aVar53);
        aVar.c().add(cVar23);
        org.a.d.i.c cVar24 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar21 = new dx(cVar24, aVar);
        final int i36 = 15;
        h.g.a.p pVar42 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i36) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i352 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i362 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i37 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ53 = dxVar21.j();
        org.a.d.e.a aVar54 = new org.a.d.e.a(new org.a.d.c.a(dxVar21.k(), new h.g.b.m(ft.class), null, pVar42, cVar3, h.a.i.h()));
        aVarJ53.f(aVar54);
        new org.a.d.c.d(aVarJ53, aVar54);
        final int i37 = 16;
        h.g.a.p pVar43 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i37) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i352 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i362 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i372 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ54 = dxVar21.j();
        org.a.d.e.a aVar55 = new org.a.d.e.a(new org.a.d.c.a(dxVar21.k(), new h.g.b.m(fo.class), null, pVar43, cVar3, h.a.i.h()));
        aVarJ54.f(aVar55);
        new org.a.d.c.d(aVarJ54, aVar55);
        aVar.c().add(cVar24);
        org.a.d.i.c cVar25 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar22 = new dx(cVar25, aVar);
        h.g.a.p pVar44 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i352 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i362 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i372 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i38 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ55 = dxVar22.j();
        org.a.d.e.a aVar56 = new org.a.d.e.a(new org.a.d.c.a(dxVar22.k(), new h.g.b.m(com.waze.car_lib.f.ch.class), null, pVar44, cVar3, h.a.i.h()));
        aVarJ55.f(aVar56);
        new org.a.d.c.d(aVarJ55, aVar56);
        final int i38 = 18;
        h.g.a.p pVar45 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i38) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i352 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i362 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i372 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i382 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i39 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ56 = dxVar22.j();
        org.a.d.e.a aVar57 = new org.a.d.e.a(new org.a.d.c.a(dxVar22.k(), new h.g.b.m(cd.class), null, pVar45, cVar3, h.a.i.h()));
        aVarJ56.f(aVar57);
        new org.a.d.c.d(aVarJ56, aVar57);
        aVar.c().add(cVar25);
        org.a.d.i.c cVar26 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar23 = new dx(cVar26, aVar);
        final int i39 = 19;
        h.g.a.p pVar46 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i39) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i352 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i362 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i372 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i382 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i392 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i40 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ57 = dxVar23.j();
        org.a.d.e.a aVar58 = new org.a.d.e.a(new org.a.d.c.a(dxVar23.k(), new h.g.b.m(com.waze.car_lib.f.cb.class), null, pVar46, cVar3, h.a.i.h()));
        aVarJ57.f(aVar58);
        new org.a.d.c.d(aVarJ57, aVar58);
        final int i40 = 20;
        h.g.a.p pVar47 = new h.g.a.p() { // from class: com.waze.car_lib.am
            @Override // h.g.a.p
            public final Object invoke(Object obj2, Object obj3) {
                switch (i40) {
                    case 0:
                        org.a.d.k.b bVar = (org.a.d.k.b) obj2;
                        int i92 = ap.f18896a;
                        h.g.b.x.f(bVar, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i102 = h.g.b.ar.f48106a;
                        return new cl((kotlinx.coroutines.af) bVar.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 1:
                        org.a.d.k.b bVar2 = (org.a.d.k.b) obj2;
                        int i112 = ap.f18896a;
                        h.g.b.x.f(bVar2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i122 = h.g.b.ar.f48106a;
                        return new iu((iv) bVar2.a(new h.g.b.m(iv.class), null, null));
                    case 2:
                        org.a.d.k.b bVar3 = (org.a.d.k.b) obj2;
                        int i132 = ap.f18896a;
                        h.g.b.x.f(bVar3, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i142 = h.g.b.ar.f48106a;
                        return new ck((cl) bVar3.a(new h.g.b.m(cl.class), null, null), (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 3:
                        int i152 = ap.f18896a;
                        h.g.b.x.f((org.a.d.k.b) obj2, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        return new com.waze.car_lib.m.c();
                    case 4:
                        org.a.d.k.b bVar4 = (org.a.d.k.b) obj2;
                        int i162 = ap.f18896a;
                        h.g.b.x.f(bVar4, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i172 = h.g.b.ar.f48106a;
                        return new co((kotlinx.coroutines.af) bVar4.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 5:
                        org.a.d.k.b bVar5 = (org.a.d.k.b) obj2;
                        int i182 = ap.f18896a;
                        h.g.b.x.f(bVar5, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i192 = h.g.b.ar.f48106a;
                        return new cn((co) bVar5.a(new h.g.b.m(co.class), null, null));
                    case 6:
                        org.a.d.k.b bVar6 = (org.a.d.k.b) obj2;
                        int i202 = ap.f18896a;
                        h.g.b.x.f(bVar6, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i212 = h.g.b.ar.f48106a;
                        return new id((eb) bVar6.a(new h.g.b.m(eb.class), null, null), (kotlinx.coroutines.af) bVar6.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 7:
                        org.a.d.k.b bVar7 = (org.a.d.k.b) obj2;
                        int i222 = ap.f18896a;
                        h.g.b.x.f(bVar7, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i232 = h.g.b.ar.f48106a;
                        return new ic((id) bVar7.a(new h.g.b.m(id.class), null, null));
                    case 8:
                        org.a.d.k.b bVar8 = (org.a.d.k.b) obj2;
                        int i242 = ap.f18896a;
                        h.g.b.x.f(bVar8, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i252 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.a((com.waze.modules.navigation.bk) bVar8.a(new h.g.b.m(com.waze.modules.navigation.bk.class), null, null));
                    case 9:
                        org.a.d.k.b bVar9 = (org.a.d.k.b) obj2;
                        int i262 = ap.f18896a;
                        h.g.b.x.f(bVar9, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i272 = h.g.b.ar.f48106a;
                        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("NavigationServiceImpl"));
                        h.g.b.x.e(eVarA, "provide(...)");
                        DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                        NativeManager nativeManager = (NativeManager) bVar9.a(new h.g.b.m(NativeManager.class), null, null);
                        eh ehVar = (eh) bVar9.a(new h.g.b.m(eh.class), null, null);
                        com.waze.shared_infra.r.n nVar = (com.waze.shared_infra.r.n) bVar9.a(new h.g.b.m(com.waze.shared_infra.r.n.class), null, null);
                        com.waze.trip_overview.ac acVar = (com.waze.trip_overview.ac) bVar9.a(new h.g.b.m(com.waze.trip_overview.ac.class), null, null);
                        com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                        cb cbVar = (cb) bVar9.a(new h.g.b.m(cb.class), null, null);
                        ch chVar = (ch) bVar9.a(new h.g.b.m(ch.class), null, null);
                        com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar9.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        com.waze.modules.navigation.a.a aVar62 = (com.waze.modules.navigation.a.a) bVar9.a(new h.g.b.m(com.waze.modules.navigation.a.a.class), null, null);
                        kd kdVar = (kd) bVar9.a(new h.g.b.m(kd.class), null, null);
                        com.waze.av.b.o oVar = (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
                        com.waze.places.a.b bVar10 = new com.waze.places.a.b((PlacesNativeManager) bVar9.a(new h.g.b.m(PlacesNativeManager.class), null, null));
                        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) bVar9.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null);
                        com.waze.shared_infra.o.a aVar72 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        dq dqVar = (dq) bVar9.a(new h.g.b.m(dq.class), null, null);
                        eo eoVar = (eo) bVar9.a(new h.g.b.m(eo.class), null, null);
                        com.waze.shared_infra.i.b bVar11 = (com.waze.shared_infra.i.b) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                        return new com.waze.modules.navigation.bk(eVarA, driveToNativeManager, nativeManager, oVar, ehVar, bVar10, nVar, (com.waze.search.b.a) bVar9.a(new h.g.b.m(com.waze.search.b.a.class), null, null), acVar, gVar, cbVar, chVar, blVar, aVar62, kdVar, aVar72, dqVar, eoVar, new com.waze.main_screen.l.b.d(false), bVar11, (com.waze.av.b.o) bVar9.a(new h.g.b.m(com.waze.av.b.o.class), null, null), (ct) bVar9.a(new h.g.b.m(ct.class), null, null), (gm) bVar9.a(new h.g.b.m(gm.class), null, null), (com.waze.ao) bVar9.a(new h.g.b.m(com.waze.ao.class), null, null), afVar, ((com.waze.sharedrive.e.bf) bVar9.a(new h.g.b.m(com.waze.sharedrive.e.bf.class), null, null)).a());
                    case 10:
                        org.a.d.k.b bVar12 = (org.a.d.k.b) obj2;
                        int i282 = ap.f18896a;
                        h.g.b.x.f(bVar12, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i292 = h.g.b.ar.f48106a;
                        return new ih((il) bVar12.a(new h.g.b.m(il.class), null, null), (com.waze.install.a) bVar12.a(new h.g.b.m(com.waze.install.a.class), null, null), (com.waze.shared_infra.o.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
                    case 11:
                        org.a.d.k.b bVar13 = (org.a.d.k.b) obj2;
                        int i302 = ap.f18896a;
                        h.g.b.x.f(bVar13, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i312 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.h((kotlinx.coroutines.af) bVar13.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 12:
                        org.a.d.k.b bVar14 = (org.a.d.k.b) obj2;
                        int i322 = ap.f18896a;
                        h.g.b.x.f(bVar14, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i332 = h.g.b.ar.f48106a;
                        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) bVar14.a(new h.g.b.m(com.waze.sharedui.utils.f.class), null, null);
                        com.waze.modules.navigation.af afVar2 = (com.waze.modules.navigation.af) bVar14.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                        com.waze.shared_infra.o.a aVar82 = (com.waze.shared_infra.o.a) bVar14.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                        com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar14.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                        com.waze.car_lib.j.w wVar = (com.waze.car_lib.j.w) bVar14.a(new h.g.b.m(com.waze.car_lib.j.w.class), null, null);
                        com.waze.bp.i iVar = (com.waze.bp.i) bVar14.a(new h.g.b.m(com.waze.bp.i.class), null, null);
                        com.waze.trip_overview.bl blVar2 = (com.waze.trip_overview.bl) bVar14.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                        h.g.b.x.f("TripOverviewStateHolderScope", HintConstants.AUTOFILL_HINT_NAME);
                        int i342 = kotlinx.coroutines.av.f51370a;
                        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("TripOverviewStateHolderScope")));
                        com.waze.car_lib.j.x xVar = (com.waze.car_lib.j.x) bVar14.a(new h.g.b.m(com.waze.car_lib.j.x.class), null, null);
                        com.waze.bn.b bVar15 = (com.waze.bn.b) bVar14.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TripOverviewStateHolder");
                        h.g.b.x.e(eVarD, "create(...)");
                        return new com.waze.car_lib.r.d.i(fVar, afVar2, aVar82, blVar2, zVar, wVar, iVar, afVarE, xVar, bVar15, eVarD, (com.waze.z) bVar14.a(new h.g.b.m(com.waze.z.class), null, null));
                    case 13:
                        org.a.d.k.b bVar16 = (org.a.d.k.b) obj2;
                        int i352 = ap.f18896a;
                        h.g.b.x.f(bVar16, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i362 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.e((com.waze.car_lib.f.h) bVar16.a(new h.g.b.m(com.waze.car_lib.f.h.class), null, null), (com.waze.car_lib.r.d.i) bVar16.a(new h.g.b.m(com.waze.car_lib.r.d.i.class), null, null), (bd) bVar16.a(new h.g.b.m(bd.class), null, null));
                    case 14:
                        org.a.d.k.b bVar17 = (org.a.d.k.b) obj2;
                        org.a.d.h.a aVar92 = (org.a.d.h.a) obj3;
                        int i372 = ap.f18896a;
                        h.g.b.x.f(bVar17, "$this$factory");
                        h.g.b.x.f(aVar92, "<destruct>");
                        int i382 = h.g.b.ar.f48106a;
                        return new fw((com.waze.car_lib.m.c) bVar17.a(new h.g.b.m(com.waze.car_lib.m.c.class), null, null), (fv) aVar92.c(new h.g.b.m(fv.class)), (kotlinx.coroutines.af) bVar17.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 15:
                        org.a.d.k.b bVar18 = (org.a.d.k.b) obj2;
                        int i392 = ap.f18896a;
                        h.g.b.x.f(bVar18, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i402 = h.g.b.ar.f48106a;
                        return new ft((kotlinx.coroutines.af) bVar18.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    case 16:
                        org.a.d.k.b bVar19 = (org.a.d.k.b) obj2;
                        int i41 = ap.f18896a;
                        h.g.b.x.f(bVar19, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i42 = h.g.b.ar.f48106a;
                        return new fo((ft) bVar19.a(new h.g.b.m(ft.class), null, null));
                    case 17:
                        org.a.d.k.b bVar20 = (org.a.d.k.b) obj2;
                        int i43 = ap.f18896a;
                        h.g.b.x.f(bVar20, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i44 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.ch((kotlinx.coroutines.af) bVar20.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null), (com.waze.car_lib.r.k) bVar20.a(new h.g.b.m(com.waze.car_lib.r.k.class), null, null));
                    case 18:
                        org.a.d.k.b bVar21 = (org.a.d.k.b) obj2;
                        int i45 = ap.f18896a;
                        h.g.b.x.f(bVar21, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i46 = h.g.b.ar.f48106a;
                        return new cd((com.waze.car_lib.f.ch) bVar21.a(new h.g.b.m(com.waze.car_lib.f.ch.class), null, null));
                    case 19:
                        org.a.d.k.b bVar22 = (org.a.d.k.b) obj2;
                        int i47 = ap.f18896a;
                        h.g.b.x.f(bVar22, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i48 = h.g.b.ar.f48106a;
                        return new com.waze.car_lib.f.cb((kotlinx.coroutines.af) bVar22.a(new h.g.b.m(kotlinx.coroutines.af.class), null, null));
                    default:
                        org.a.d.k.b bVar23 = (org.a.d.k.b) obj2;
                        int i49 = ap.f18896a;
                        h.g.b.x.f(bVar23, "$this$factory");
                        h.g.b.x.f((org.a.d.h.a) obj3, "it");
                        int i50 = h.g.b.ar.f48106a;
                        return new ca((com.waze.car_lib.f.cb) bVar23.a(new h.g.b.m(com.waze.car_lib.f.cb.class), null, null));
                }
            }
        };
        org.a.d.g.a aVarJ58 = dxVar23.j();
        org.a.d.e.a aVar59 = new org.a.d.e.a(new org.a.d.c.a(dxVar23.k(), new h.g.b.m(ca.class), null, pVar47, cVar3, h.a.i.h()));
        aVarJ58.f(aVar59);
        new org.a.d.c.d(aVarJ58, aVar59);
        aVar.c().add(cVar26);
        org.a.d.i.c cVar27 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar24 = new dx(cVar27, aVar);
        an anVar11 = new an(1);
        org.a.d.g.a aVarJ59 = dxVar24.j();
        org.a.d.e.a aVar60 = new org.a.d.e.a(new org.a.d.c.a(dxVar24.k(), new h.g.b.m(com.waze.car_lib.a.e.class), null, anVar11, cVar3, h.a.i.h()));
        aVarJ59.f(aVar60);
        new org.a.d.c.d(aVarJ59, aVar60);
        an anVar12 = new an(i13);
        org.a.d.g.a aVarJ60 = dxVar24.j();
        org.a.d.e.a aVar61 = new org.a.d.e.a(new org.a.d.c.a(dxVar24.k(), new h.g.b.m(com.waze.car_lib.a.d.class), null, anVar12, cVar3, h.a.i.h()));
        aVarJ60.f(aVar61);
        new org.a.d.c.d(aVarJ60, aVar61);
        aVar.c().add(cVar27);
        org.a.d.i.c cVar28 = new org.a.d.i.c(new h.g.b.m(bl.class));
        dx dxVar25 = new dx(cVar28, aVar);
        an anVar13 = new an(3);
        org.a.d.g.a aVarJ61 = dxVar25.j();
        org.a.d.e.a aVar62 = new org.a.d.e.a(new org.a.d.c.a(dxVar25.k(), new h.g.b.m(bw.class), null, anVar13, cVar3, h.a.i.h()));
        aVarJ61.f(aVar62);
        new org.a.d.c.d(aVarJ61, aVar62);
        an anVar14 = new an(5);
        org.a.d.g.a aVarJ62 = dxVar25.j();
        org.a.d.e.a aVar63 = new org.a.d.e.a(new org.a.d.c.a(dxVar25.k(), new h.g.b.m(bv.class), null, anVar14, cVar3, h.a.i.h()));
        aVarJ62.f(aVar63);
        new org.a.d.c.d(aVarJ62, aVar63);
        an anVar15 = new an(6);
        org.a.d.e.c cVar29 = new org.a.d.e.c(new org.a.d.c.a(dxVar25.k(), new h.g.b.m(com.waze.o.d.a.j.class), null, anVar15, cVar11, h.a.i.h()));
        dxVar25.j().f(cVar29);
        new org.a.d.c.d(dxVar25.j(), cVar29);
        aVar.c().add(cVar28);
        an anVar16 = new an(7);
        org.a.d.e.c cVar30 = new org.a.d.e.c(new org.a.d.c.a(dxVar.k(), new h.g.b.m(com.waze.car_lib.r.k.class), null, anVar16, cVar11, h.a.i.h()));
        dxVar.j().f(cVar30);
        new org.a.d.c.d(dxVar.j(), cVar30);
        an anVar17 = new an(i17);
        org.a.d.g.a aVarJ63 = dxVar.j();
        org.a.d.e.a aVar64 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(com.waze.car_lib.r.h.class), null, anVar17, cVar3, h.a.i.h()));
        aVarJ63.f(aVar64);
        new org.a.d.c.d(aVarJ63, aVar64);
        aVar.c().add(cVar);
        return h.ab.f48028a;
    }
}
