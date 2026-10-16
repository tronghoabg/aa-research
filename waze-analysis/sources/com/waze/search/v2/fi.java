package com.waze.search.v2;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.kd;
import com.waze.la;
import com.waze.navigate.AddressItem;
import com.waze.settings.SettingsNativeManager;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fi extends ViewModel {
    private final kotlinx.coroutines.b.bn A;
    private final kotlinx.coroutines.b.ch B;
    private final kotlinx.coroutines.b.bn C;
    private final kotlinx.coroutines.b.ch D;
    private final kotlinx.coroutines.b.bn E;
    private final kotlinx.coroutines.b.ch F;
    private final kotlinx.coroutines.b.bm G;
    private final kotlinx.coroutines.b.bm H;
    private List I;
    private final kotlinx.coroutines.af J;
    private kotlinx.coroutines.br K;
    private kotlinx.coroutines.br L;
    private final h.f M;
    private final h.f N;
    private final com.waze.br.b.w O;

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f36517a;

    /* renamed from: b, reason: collision with root package name */
    private final p f36518b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.location.o f36519c;

    /* renamed from: d, reason: collision with root package name */
    private final di f36520d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ev.n f36521e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f36522f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.search.bd f36523g;

    /* renamed from: h, reason: collision with root package name */
    private final fs f36524h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.search.a.a.a f36525i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.navigate.dg f36526j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.sharedui.j f36527k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.s.b f36528l;
    private final com.waze.navigate.location_preview.o m;
    private final la n;
    private final kd o;
    private final com.waze.favorites.k p;
    private final com.waze.bf q;
    private final ft r;
    private final com.waze.navigate.location_preview.s s;
    private final com.waze.shared_infra.q.r t;
    private final bu u;
    private final com.waze.favorites.q v;
    private final SettingsNativeManager w;
    private final com.waze.modules.navigation.bp x;
    private final kotlinx.coroutines.b.ch y;
    private final kotlinx.coroutines.b.bm z;

    public fi(com.waze.shared_infra.o.a aVar, p pVar, com.waze.location.o oVar, di diVar, com.waze.ev.n nVar, com.waze.shared_infra.q.e eVar, com.waze.search.bd bdVar, fs fsVar, com.waze.search.a.a.a aVar2, com.waze.navigate.dg dgVar, com.waze.sharedui.j jVar, com.waze.shared_infra.s.b bVar, com.waze.navigate.location_preview.o oVar2, la laVar, kd kdVar, com.waze.favorites.k kVar, com.waze.bf bfVar, ft ftVar, com.waze.navigate.location_preview.s sVar, com.waze.navigate.cj cjVar, com.waze.shared_infra.q.j jVar2, com.waze.navigate.location_preview.p pVar2, com.waze.shared_infra.q.r rVar, bu buVar, com.waze.favorites.q qVar, com.waze.search.b.d dVar, SettingsNativeManager settingsNativeManager, com.waze.br.b.p pVar3, com.waze.br.c.e eVar2, com.waze.modules.navigation.bp bpVar) {
        com.waze.av.c.l lVarA;
        com.waze.av.d.k kVarA;
        com.waze.av.a.p pVarE;
        com.waze.shared_infra.h.c cVarD;
        q qVarB;
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(pVar, "config");
        h.g.b.x.f(oVar, "locationSensorListener");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(bdVar, "searchOperation");
        h.g.b.x.f(fsVar, "statefulSearchStatsSender");
        h.g.b.x.f(aVar2, "categoriesRepository");
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(jVar, "dayOfWeekFormat");
        h.g.b.x.f(bVar, "localeData");
        h.g.b.x.f(oVar2, "lppAnalytics");
        h.g.b.x.f(laVar, "servicesRepository");
        h.g.b.x.f(kdVar, "popupController");
        h.g.b.x.f(kVar, "favoritesManager");
        h.g.b.x.f(bfVar, "dangerZoneProvider");
        h.g.b.x.f(ftVar, "venueToLocationModelTransformer");
        h.g.b.x.f(sVar, "locationPreviewEventHandler");
        h.g.b.x.f(cjVar, "etaStateInterface");
        h.g.b.x.f(jVar2, "dateFormat");
        h.g.b.x.f(pVar2, "locationPreviewConfig");
        h.g.b.x.f(rVar, "wazeTimeUtil");
        h.g.b.x.f(buVar, "filterRepository");
        h.g.b.x.f(qVar, "favoritesStatsReporter");
        h.g.b.x.f(dVar, "productsSource");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(pVar3, "searchMateControllerFactory");
        h.g.b.x.f(eVar2, "searchMateSessionStateHolderFactory");
        h.g.b.x.f(bpVar, "navigationCoordinatorFactory");
        this.f36517a = aVar;
        this.f36518b = pVar;
        this.f36519c = oVar;
        this.f36520d = diVar;
        this.f36521e = nVar;
        this.f36522f = eVar;
        this.f36523g = bdVar;
        this.f36524h = fsVar;
        this.f36525i = aVar2;
        this.f36526j = dgVar;
        this.f36527k = jVar;
        this.f36528l = bVar;
        this.m = oVar2;
        this.n = laVar;
        this.o = kdVar;
        this.p = kVar;
        this.q = bfVar;
        this.r = ftVar;
        this.s = sVar;
        this.t = rVar;
        this.u = buVar;
        this.v = qVar;
        this.w = settingsNativeManager;
        this.x = bpVar;
        com.waze.br.b.w wVarA = pVar3.a();
        this.O = wVarA;
        kotlinx.coroutines.b.k kVarA2 = eVar2.a();
        fi fiVar = this;
        kotlinx.coroutines.af viewModelScope = ViewModelKt.getViewModelScope(fiVar);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.y = kotlinx.coroutines.b.ai.V(kVarA2, viewModelScope, kotlinx.coroutines.b.by.c(), null);
        this.z = kotlinx.coroutines.b.bu.e(0, 16, null, 5);
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.E = bnVarB;
        this.F = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.a.a aVar3 = kotlinx.coroutines.a.a.f51272b;
        this.G = kotlinx.coroutines.b.bu.e(0, 1, aVar3, 1);
        this.H = kotlinx.coroutines.b.bu.e(0, 1, aVar3, 1);
        this.J = ViewModelKt.getViewModelScope(fiVar);
        this.M = h.g.a(new bv(this, 7));
        this.N = h.g.a(new bv(this, 8));
        if (diVar == null) {
            bt.a().d("SearchV2ViewModel.init params == null, searching for nothing?");
        }
        com.waze.br.a.i iVarAA = wVarA != null ? aA(wVarA) : null;
        if (iVarAA instanceof com.waze.br.a.h) {
            lVarA = ((com.waze.br.a.h) iVarAA).a();
        } else {
            if (!(iVarAA instanceof com.waze.br.a.c) && !(iVarAA instanceof com.waze.br.a.g) && iVarAA != null) {
                throw new h.i();
            }
            lVarA = null;
        }
        com.waze.search.bc bcVar = lVarA != null ? new com.waze.search.bc(lVarA) : null;
        com.waze.br.a.i iVarAA2 = wVarA != null ? aA(wVarA) : null;
        if (iVarAA2 instanceof com.waze.br.a.c) {
            kVarA = ((com.waze.br.a.c) iVarAA2).a();
        } else {
            if (!(iVarAA2 instanceof com.waze.br.a.h) && !(iVarAA2 instanceof com.waze.br.a.g) && iVarAA2 != null) {
                throw new h.i();
            }
            kVarA = null;
        }
        com.waze.search.bc bcVar2 = bcVar;
        com.waze.navigate.location_preview.ay ayVarAb = kVarA != null ? ab(kVarA) : null;
        dd ddVar = new dd(dc.f36339c, fj.g(diVar, bcVar2), buVar.a(diVar != null ? diVar.d() : null, diVar != null ? diVar.c() : null), pVar, oVar, bcVar2, ayVarAb, false, null, h.a.r.j(), (PolylineGeometry) dgVar.aj().d(), W(), (diVar == null || (qVarB = diVar.b()) == null) ? q.f36607a : qVarB, -1, 0L, false, false, null, null, false, h.a.i.h());
        kotlinx.coroutines.b.bn bnVarB2 = kotlinx.coroutines.b.ck.b(ddVar);
        this.A = bnVarB2;
        this.B = bnVarB2;
        bw bwVar = new bw(this, 3);
        kotlinx.coroutines.b.bn bnVar = bnVarB2;
        kotlinx.coroutines.b.bn bnVarB3 = kotlinx.coroutines.b.ck.b(ddVar.i(aVar, am(), aVar2.b(), aVar2.a(), com.waze.navigate.et.v(cjVar), com.waze.navigate.et.c(dgVar), eVar, jVar2, nVar, null, pVar, rVar, bwVar));
        this.C = bnVarB3;
        this.D = bnVarB3;
        ay();
        if (bcVar == null && ayVarAb == null) {
            as();
        }
        if (ayVarAb != null) {
            com.waze.br.a.i iVarAA3 = wVarA != null ? aA(wVarA) : null;
            com.waze.av.d.k kVarA3 = iVarAA3 instanceof com.waze.br.a.c ? ((com.waze.br.a.c) iVarAA3).a() : null;
            if (kVarA3 != null && kVarA3.M()) {
                ar(kVarA3);
            }
        }
        com.waze.av.b.n nVar2 = (com.waze.av.b.n) dgVar.ad().d();
        if (nVar2 != null && (pVarE = nVar2.e()) != null && (cVarD = pVarE.d()) != null) {
            while (true) {
                Object objD = bnVar.d();
                kotlinx.coroutines.b.bn bnVar2 = bnVar;
                if (bnVar2.f(objD, dd.s((dd) objD, null, null, null, null, null, null, null, false, cVarD, null, null, null, null, 0, 0L, false, false, null, null, false, null, 4193791))) {
                    break;
                } else {
                    bnVar = bnVar2;
                }
            }
        }
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(this.B, 13)), new cj(this, (h.c.e) null, 3, (byte[]) null)), this.J);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(this.B, 14)), new ec(this, cjVar, jVar2, bwVar, null)), this.J);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(this.B, 15)), new eb(this, bwVar, (h.c.e) null, 2)), this.J);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(this.B, 16)), new cj(this, (h.c.e) null, 4, (char[]) null)), this.J);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(this.B, 17)), new dz(this, jVar2, cjVar, pVar2, null)), this.J);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(new cc(new cc(kotlinx.coroutines.b.ai.y(new cc(this.B, 18)), 12), 11), new ea(this, null)), this.J);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(this.B, 19)), new ch(this, (h.c.e) null, 2)), this.J);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.f36526j.aj(), new cj(this, (h.c.e) null, 2)), this.J);
        kotlinx.coroutines.aj.z(this.J, null, null, new eb(dVar, this, (h.c.e) null, 0), 3);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.z, new cj(this, (h.c.e) null, 5, (short[]) null)), this.J);
    }

    static final void J(fi fiVar, AddressItem addressItem, IsHomeWorkSetResult isHomeWorkSetResult) {
        com.waze.favorites.q qVar;
        IsHomeWorkSetResult isHomeWorkSetResult2;
        AddressItem addressItem2;
        boolean z = isHomeWorkSetResult != null ? !isHomeWorkSetResult.getIsHomeSet() : false;
        boolean z2 = isHomeWorkSetResult != null ? !isHomeWorkSetResult.getIsWorkSet() : false;
        com.waze.favorites.q qVar2 = fiVar.v;
        qVar2.b(z, z2);
        kotlinx.coroutines.b.bn bnVar = fiVar.E;
        while (true) {
            Object objD = bnVar.d();
            com.waze.ui.m.dl dlVar = (com.waze.ui.m.dl) objD;
            com.waze.ui.m.dl dlVarY = null;
            if (dlVar != null) {
                AddressItem addressItem3 = addressItem;
                IsHomeWorkSetResult isHomeWorkSetResult3 = isHomeWorkSetResult;
                com.waze.ui.m.ad adVarE = gb.e(addressItem3, qVar2, isHomeWorkSetResult3, fiVar.p, new com.waze.bi.a(fiVar, 19), new y(fiVar, 3, (short[]) null));
                addressItem2 = addressItem3;
                qVar = qVar2;
                isHomeWorkSetResult2 = isHomeWorkSetResult3;
                dlVarY = com.waze.ui.m.dl.y(dlVar, null, null, adVarE, false, 16711679);
            } else {
                qVar = qVar2;
                isHomeWorkSetResult2 = isHomeWorkSetResult;
                addressItem2 = addressItem;
            }
            if (bnVar.f(objD, dlVarY)) {
                return;
            }
            addressItem = addressItem2;
            isHomeWorkSetResult = isHomeWorkSetResult2;
            qVar2 = qVar;
        }
    }

    static /* synthetic */ Object U(fi fiVar, com.waze.av.d.k kVar, h.c.e eVar) {
        return fiVar.ak(kVar, false, eVar);
    }

    static final com.waze.speech.k X(fi fiVar) {
        di diVar = fiVar.f36520d;
        return com.waze.ad.c.b.s(diVar != null ? diVar.d() : null, diVar != null ? diVar.c() : null) ? p.f() : dp.f36380a;
    }

    public static final /* synthetic */ com.waze.sdk.bq Y(fi fiVar, com.waze.sdk.bq bqVar) {
        com.waze.search.bc bcVar = bqVar instanceof com.waze.search.bc ? (com.waze.search.bc) bqVar : null;
        if (bcVar != null) {
            if (true != bcVar.e().f()) {
                bcVar = null;
            }
            if (bcVar != null) {
                return com.waze.search.bc.f(com.waze.av.c.l.g(((com.waze.search.bc) bqVar).e(), null, ((dd) fiVar.B.d()).e() == q.f36607a, 31));
            }
        }
        return bqVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0192  */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.waze.search.ao] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.waze.search.ao] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object Z(com.waze.search.v2.fi r36, com.waze.speech.k r37, h.c.e r38) {
        /*
            Method dump skipped, instructions count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fi.Z(com.waze.search.v2.fi, com.waze.speech.k, h.c.e):java.lang.Object");
    }

    private static final com.waze.br.a.i aA(com.waze.br.b.w wVar) {
        com.waze.br.b.o oVarA = ((com.waze.br.b.q) wVar.g().d()).a();
        if (oVarA instanceof com.waze.br.b.g) {
            return ((com.waze.br.b.g) oVarA).a().a();
        }
        if (oVarA instanceof com.waze.br.b.i) {
            return ((com.waze.br.b.i) oVarA).a();
        }
        if (h.g.b.x.n(oVarA, com.waze.br.b.h.f17333a) || h.g.b.x.n(oVarA, com.waze.br.b.j.f17335a) || (oVarA instanceof com.waze.br.b.k) || (oVarA instanceof com.waze.br.b.l) || h.g.b.x.n(oVarA, com.waze.br.b.m.f17338a) || h.g.b.x.n(oVarA, com.waze.br.b.n.f17339a) || oVarA == null) {
            return null;
        }
        throw new h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e aB(List list) {
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((com.waze.shared_infra.h.c) it.next()).a()));
        }
        double dG = h.a.i.G(arrayList);
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((com.waze.shared_infra.h.c) it2.next()).b()));
        }
        com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(dG, h.a.i.G(arrayList2));
        Iterator it3 = list2.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fB = com.waze.sharedui.utils.f.b((com.waze.shared_infra.h.c) it3.next(), cVar);
        while (it3.hasNext()) {
            fB = Math.max(fB, com.waze.sharedui.utils.f.b((com.waze.shared_infra.h.c) it3.next(), cVar));
        }
        return new e(cVar, fB);
    }

    private final void aC(com.waze.speech.k kVar) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.C;
            Object objD = bnVar.d();
            com.waze.speech.k kVar2 = kVar;
            if (bnVar.f(objD, dt.j((dt) objD, null, kVar2, null, false, null, false, false, 503))) {
                return;
            } else {
                kVar = kVar2;
            }
        }
    }

    private final com.waze.navigate.location_preview.ay ab(com.waze.av.d.k kVar) {
        com.waze.av.d.r rVarE = kVar.e();
        return com.waze.search.e.g.g(this.r, kVar, null, rVarE != null ? fj.a(rVarE, ((dd) this.B.d()).c()) : null, 0, null, false, null, null, false, 506);
    }

    private final com.waze.ui.a ac(List list) {
        h.k.j jVar = new h.k.j(1, 4);
        ArrayList arrayList = new ArrayList(h.a.i.q(jVar, 10));
        Iterator<Integer> it = jVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((h.a.aj) it).nextInt();
            arrayList.add(new com.waze.ui.d(new com.waze.ui.ac.m(h.n.o.j("$", iNextInt)), list.contains(Integer.valueOf(iNextInt)), new ej(this, iNextInt, null)));
        }
        return new com.waze.ui.a(new com.waze.ui.ac.j(R.string.CATEGORY_SEARCH_PRICE_FILTER), arrayList);
    }

    private final com.waze.ui.c ad(List list, boolean z, boolean z2) {
        fi fiVar;
        boolean z3;
        boolean z4;
        com.waze.ui.d dVar;
        List<String> listK = h.a.i.k("WHEELCHAIR_ACCESSIBLE", "DISABILITY_PARKING", "RESTROOMS", true != z ? null : "PARKING_FOR_CUSTOMERS", true != z2 ? null : "EV_CHARGING_STATION");
        ArrayList arrayList = new ArrayList();
        for (String str : listK) {
            Integer num = (Integer) fj.f36530b.get(str);
            if (num != null) {
                fiVar = this;
                z3 = z;
                z4 = z2;
                dVar = new com.waze.ui.d(new com.waze.ui.ac.j(num.intValue()), list.contains(str), new eg(fiVar, str, z3, z4, null));
            } else {
                fiVar = this;
                z3 = z;
                z4 = z2;
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
            this = fiVar;
            z = z3;
            z2 = z4;
        }
        return new com.waze.ui.a(new com.waze.ui.ac.j(R.string.CATEGORY_SEARCH_AMENITIES_FILTER_TITLE), arrayList);
    }

    private final com.waze.ui.c ae(Collection collection) {
        ArrayList arrayListH;
        com.waze.ev.n nVar = this.f36521e;
        List list = (List) nVar.f().d();
        if (collection == null) {
            collection = ((com.waze.ev.m) nVar.g().d()).a();
        }
        Collection collection2 = collection;
        if (list != null) {
            List<com.waze.ev.g> list2 = list;
            ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
            for (com.waze.ev.g gVar : list2) {
                arrayList.add(new com.waze.ui.d(new com.waze.ui.ac.m(gVar.a()), collection2.contains(gVar.a()), new ei(this, gVar, collection2, (h.c.e) null, 1)));
            }
            arrayListH = arrayList;
        } else {
            arrayListH = null;
        }
        com.waze.ui.ac.j jVar = new com.waze.ui.ac.j(R.string.CATEGORY_SEARCH_NETWORKS_FILTER);
        if (arrayListH == null) {
            arrayListH = h.a.i.h();
        }
        return new com.waze.ui.a(jVar, arrayListH);
    }

    private final com.waze.ui.c af(Set set) {
        com.waze.ev.n nVar = this.f36521e;
        List listD = nVar.d();
        if (set == null) {
            set = ((com.waze.ev.m) nVar.g().d()).b();
        }
        Set set2 = set;
        List<com.waze.ev.f> list = listD;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (com.waze.ev.f fVar : list) {
            arrayList.add(new com.waze.ui.d(fVar.b(), set2.contains(fVar.d()), new com.waze.ui.ac.b(fVar.a()), new ei(this, fVar, set2, (h.c.e) null, 0)));
        }
        return new com.waze.ui.a(new com.waze.ui.ac.j(R.string.CATEGORY_SEARCH_PLUGS_FILTER), arrayList);
    }

    private final com.waze.ui.c ag(boolean z, String str) {
        com.waze.ui.ac.j jVar = new com.waze.ui.ac.j(R.string.SEARCH_RESULTS_FAV_GAS_SHEET_TITLE);
        List<com.waze.av.c.c> listK = ((dd) this.B.d()).k();
        ArrayList arrayList = new ArrayList(h.a.i.q(listK, 10));
        for (com.waze.av.c.c cVar : listK) {
            arrayList.add(new com.waze.ui.e(new com.waze.ui.ac.m(cVar.c()), h.g.b.x.n(cVar.b(), str), new ex(this, cVar, z, null), 4));
        }
        return new com.waze.ui.b(jVar, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ah(final com.waze.navigate.AddressItem r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.search.v2.ee
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.search.v2.ee r0 = (com.waze.search.v2.ee) r0
            int r1 = r0.f36420d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36420d = r1
            goto L18
        L13:
            com.waze.search.v2.ee r0 = new com.waze.search.v2.ee
            r0.<init>(r7, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.f36418b
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f36420d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r6.f36417a
            com.waze.navigate.AddressItem r8 = (com.waze.navigate.AddressItem) r8
            e.b.c.b(r9)
            goto L51
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            e.b.c.b(r9)
            com.waze.bf r1 = r7.q
            com.waze.shared_infra.h.c r3 = r8.getCoordinate()
            java.lang.String r9 = "getCoordinate(...)"
            h.g.b.x.e(r3, r9)
            com.waze.kd r4 = r7.o
            com.waze.navigate.ar r5 = com.waze.navigate.ar.f31001b
            r6.f36417a = r8
            r6.f36420d = r2
            r2 = 0
            java.lang.Object r9 = com.waze.navigate.ax.a(r1, r2, r3, r4, r5, r6)
            if (r9 == r0) goto L69
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5c
            h.ab r7 = h.ab.f48028a
            return r7
        L5c:
            com.waze.favorites.k r9 = r7.p
            com.waze.search.v2.dx r0 = new com.waze.search.v2.dx
            r0.<init>()
            r9.d(r0)
            h.ab r7 = h.ab.f48028a
            return r7
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fi.ah(com.waze.navigate.AddressItem, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ai(com.waze.search.v2.al r34, h.c.e r35) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fi.ai(com.waze.search.v2.al, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r9.collect(r10, r6) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aj(com.waze.search.v2.am r9, h.c.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.waze.search.v2.el
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.search.v2.el r0 = (com.waze.search.v2.el) r0
            int r1 = r0.f36444d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36444d = r1
            goto L18
        L13:
            com.waze.search.v2.el r0 = new com.waze.search.v2.el
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f36442b
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f36444d
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L33
            if (r1 == r7) goto L2f
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            e.b.c.b(r10)
            goto L85
        L33:
            java.lang.Object r9 = r6.f36441a
            kotlinx.coroutines.b.bn r9 = (kotlinx.coroutines.b.bn) r9
            e.b.c.b(r10)
            goto L71
        L3b:
            e.b.c.b(r10)
            kotlinx.coroutines.b.bn r10 = r8.A
            java.lang.Object r10 = r10.d()
            com.waze.search.v2.dd r10 = (com.waze.search.v2.dd) r10
            com.waze.navigate.location_preview.ay r4 = r10.b()
            if (r4 != 0) goto L4d
            goto L8c
        L4d:
            kotlinx.coroutines.b.bn r10 = r8.E
            java.lang.Object r10 = r10.d()
            com.waze.ui.m.dl r10 = (com.waze.ui.m.dl) r10
            if (r10 == 0) goto L8c
            com.waze.navigate.location_preview.s r1 = r8.s
            kotlinx.coroutines.b.bn r3 = kotlinx.coroutines.b.ck.b(r10)
            r10 = r2
            com.waze.ui.m.cb r2 = r9.a()
            kotlinx.coroutines.b.bm r5 = r9.b()
            r6.f36441a = r3
            r6.f36444d = r10
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)
            if (r9 == r0) goto L8b
            r9 = r3
        L71:
            com.waze.search.v2.em r10 = new com.waze.search.v2.em
            r1 = 0
            r10.<init>(r8, r1)
            kotlinx.coroutines.b.l r10 = (kotlinx.coroutines.b.l) r10
            r8 = 0
            r6.f36441a = r8
            r6.f36444d = r7
            java.lang.Object r8 = r9.collect(r10, r6)
            if (r8 != r0) goto L85
            goto L8b
        L85:
            h.e r8 = new h.e
            r8.<init>()
            throw r8
        L8b:
            return r0
        L8c:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fi.aj(com.waze.search.v2.am, h.c.e):java.lang.Object");
    }

    private final Object ak(com.waze.av.d.k kVar, boolean z, h.c.e eVar) {
        com.waze.navigate.location_preview.ay ayVar;
        dd ddVar = (dd) this.B.d();
        int i2 = fj.f36529a;
        com.waze.search.aw awVarI = ddVar.c().i();
        com.waze.av.d.k kVarP = awVarI != null ? awVarI.p() : null;
        ft ftVar = this.r;
        com.waze.navigate.location_preview.ay ayVarG = com.waze.search.e.g.g(ftVar, kVar, kVarP, null, 0, null, false, null, null, z, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5);
        kotlinx.coroutines.b.bn bnVar = this.A;
        while (true) {
            Object objD = bnVar.d();
            ayVar = ayVarG;
            if (bnVar.f(objD, dd.s((dd) objD, null, null, null, null, null, null, ayVarG, false, null, null, null, null, null, 0, 0L, false, false, null, null, false, null, 3145663))) {
                break;
            }
            ayVarG = ayVar;
        }
        Object objB = gb.b(ftVar, ayVar, kVar, this.m, new dy(this, ayVar, 0), eVar);
        return objB == h.c.a.a.f48038a ? objB : h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b4, code lost:
    
        if (ah(r1, r3) == r4) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object al(boolean r38, int r39, java.lang.String r40, h.g.a.l r41, h.c.e r42) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fi.al(boolean, int, java.lang.String, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String am() {
        return (String) this.M.getValue();
    }

    private final void an() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.C;
            objD = bnVar.d();
        } while (!bnVar.f(objD, dt.j((dt) objD, null, null, null, false, null, false, false, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_INCORRECT_JUNCTION)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ao() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        com.waze.ui.m.dl dlVar;
        do {
            bnVar = this.E;
            objD = bnVar.d();
            dlVar = (com.waze.ui.m.dl) objD;
        } while (!bnVar.f(objD, dlVar != null ? com.waze.ui.m.dl.y(dlVar, null, null, null, false, 16711679) : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ap(dw dwVar) {
        this.H.c(dwVar);
    }

    private final void aq(com.waze.av.d.k kVar, int i2, h.g.a.l lVar) {
        AddressItem addressItemJ = gb.j(kVar, 0, null, false, 15);
        addressItemJ.setCategory(Integer.valueOf(i2));
        if (lVar != null) {
            lVar.invoke(addressItemJ);
        }
        aC(new dh(-1, new Intent().putExtra("ai", addressItemJ), 4));
    }

    private final void ar(com.waze.av.d.k kVar) {
        kotlinx.coroutines.br brVar = this.L;
        if (brVar != null) {
            brVar.s(null);
        }
        this.L = kotlinx.coroutines.aj.z(this.J, null, null, new x(this, kVar, (h.c.e) null, 3), 3);
    }

    private final void as() {
        Object objD;
        kotlinx.coroutines.b.bn bnVar = this.A;
        dc dcVarH = ((dd) bnVar.d()).h();
        dc dcVar = dc.f36338b;
        if (dcVarH == dcVar) {
            bt.a().b("Asked to re-run search while already performing search. Nope.");
            return;
        }
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, dd.s((dd) objD, dcVar, null, null, null, null, null, null, false, null, null, null, null, null, 0, 0L, false, false, null, null, false, null, 4194270)));
        c cVarC = ((dd) this.B.d()).c();
        kotlinx.coroutines.br brVar = this.K;
        if (brVar != null) {
            brVar.s(null);
        }
        this.K = kotlinx.coroutines.aj.z(this.J, null, null, new ew(this, cVarC, null), 3);
    }

    private final void at(com.waze.ui.c cVar) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.C;
            Object objD = bnVar.d();
            com.waze.ui.c cVar2 = cVar;
            if (bnVar.f(objD, dt.j((dt) objD, null, null, cVar2, false, null, false, false, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL))) {
                return;
            } else {
                cVar = cVar2;
            }
        }
    }

    private final void au(Cdo cdo) {
        int i2;
        Object objD;
        Cdo cdo2;
        h.g.b.x.f(cdo, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        boolean z = cdo instanceof dl;
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_PROVIDER_SEARCH_GAS_STATIONS_SORT;
        if (z) {
            i2 = 2;
        } else if (cdo instanceof dn) {
            i2 = 0;
        } else if (cdo instanceof dm) {
            i2 = 1;
        } else {
            if (!(cdo instanceof dk)) {
                throw new h.i();
            }
            i2 = 3;
        }
        cVar.d(Long.valueOf(i2));
        kotlinx.coroutines.b.bn bnVar = this.A;
        do {
            objD = bnVar.d();
            cdo2 = cdo;
        } while (!bnVar.f(objD, dd.s((dd) objD, null, null, null, null, null, null, null, false, null, null, null, cdo2, null, 0, 0L, false, false, null, null, false, null, 4190207)));
        this.f36524h.l(cdo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void av() {
        List list;
        e eVarAB;
        e eVarD;
        Object objD;
        List listC;
        Object objD2;
        kotlinx.coroutines.b.bn bnVar = this.A;
        if (((dd) bnVar.d()).n() || (list = this.I) == null || (eVarAB = aB(list)) == null) {
            return;
        }
        kotlinx.coroutines.b.ch chVar = this.B;
        com.waze.sdk.bq bqVarQ = ((dd) chVar.d()).q();
        com.waze.search.bc bcVar = bqVarQ instanceof com.waze.search.bc ? (com.waze.search.bc) bqVarQ : null;
        if (bcVar != null && (listC = bcVar.e().c()) != null && listC.isEmpty()) {
            bt.a().a("showSearchInAreaIfNeeded: showing button since there are no results");
            do {
                objD2 = bnVar.d();
            } while (!bnVar.f(objD2, dd.s((dd) objD2, null, null, null, null, null, null, null, false, null, null, null, null, null, 0, 0L, true, false, null, null, false, null, 4128767)));
            this.f36524h.e();
            return;
        }
        if (((dd) chVar.d()).q() == null || (eVarD = ((dd) chVar.d()).d()) == null) {
            return;
        }
        com.waze.shared_infra.h.c cVarB = eVarAB.b();
        float fA = eVarAB.a();
        bt.a().a("MLC: original=(" + eVarD.b().a() + "," + eVarD.b().b() + "):" + eVarD.a() + " curr=(" + cVarB.a() + "," + cVarB.b() + "):" + fA);
        float fA2 = fA / eVarD.a();
        if (fA2 > ConfigValues.CONFIG_VALUE_SEARCH_AGAIN_ZOOM_OUT_PC.b().longValue() / 100.0f || fA2 < ConfigValues.CONFIG_VALUE_SEARCH_AGAIN_ZOOM_IN_PC.b().longValue() / 100.0f || com.waze.sharedui.utils.f.b(cVarB, eVarD.b()) > eVarD.a() * (ConfigValues.CONFIG_VALUE_SEARCH_AGAIN_DISTANCE_MULT_PC.b().longValue() / 100.0f)) {
            this.f36524h.e();
            bt.a().a("showSearchInAreaIfNeeded: showing button since map location changed");
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, dd.s((dd) objD, null, null, null, null, null, null, null, false, null, null, null, null, null, 0, 0L, true, false, null, null, false, null, 4128767)));
        }
    }

    private final void aw(com.waze.ui.c cVar) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.C;
            Object objD = bnVar.d();
            com.waze.ui.c cVar2 = cVar;
            if (bnVar.f(objD, dt.j((dt) objD, null, null, cVar2, true, null, false, false, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_INCORRECT_JUNCTION))) {
                return;
            } else {
                cVar = cVar2;
            }
        }
    }

    private final void ax(c cVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        String strD;
        String strA;
        do {
            bnVar = this.A;
            objD = bnVar.d();
        } while (!bnVar.f(objD, dd.s((dd) objD, null, null, cVar, null, null, null, null, false, null, null, null, null, null, 0, 0L, false, false, null, null, false, null, 4194299)));
        kotlinx.coroutines.b.ch chVar = this.B;
        com.waze.search.bc bcVarB = fj.b(chVar);
        String strC = null;
        if (bcVarB == null || (strD = bcVarB.e().b()) == null) {
            di diVar = this.f36520d;
            strD = diVar != null ? diVar.d() : null;
        }
        com.waze.search.bc bcVarB2 = fj.b(chVar);
        if (bcVarB2 == null || (strA = bcVarB2.e().a()) == null) {
            di diVar2 = this.f36520d;
            if (diVar2 != null) {
                strC = diVar2.c();
            }
        } else {
            strC = strA;
        }
        this.u.b(strD, strC, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ay() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fi.ay():void");
    }

    private final boolean az() {
        kotlinx.coroutines.b.ch chVar = this.B;
        com.waze.sdk.bq bqVarQ = ((dd) chVar.d()).q();
        if (bqVarQ instanceof com.waze.search.bc) {
            com.waze.search.bc bcVar = (com.waze.search.bc) bqVarQ;
            String strA = bcVar.e().a();
            if (strA != null && strA.length() != 0) {
                return true;
            }
            String strB = bcVar.e().b();
            if (strB != null && strB.length() != 0) {
                return true;
            }
        }
        return (((dd) chVar.d()).r() instanceof com.waze.av.c.e) || (((dd) chVar.d()).r() instanceof com.waze.av.c.d);
    }

    static final com.waze.navigate.location_preview.ay e(fi fiVar, com.waze.navigate.location_preview.ay ayVar, h.g.a.l lVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        dd ddVar;
        com.waze.navigate.location_preview.ay ayVarB;
        h.g.b.x.f(lVar, "updater");
        do {
            bnVar = fiVar.A;
            objD = bnVar.d();
            ddVar = (dd) objD;
            ayVarB = ddVar.b();
            if (ayVarB == null) {
                ayVarB = ayVar;
            }
        } while (!bnVar.f(objD, dd.s(ddVar, null, null, null, null, null, null, (com.waze.navigate.location_preview.ay) lVar.invoke(ayVarB), false, null, null, null, null, null, 0, 0L, false, false, null, null, false, null, 4194239)));
        com.waze.navigate.location_preview.ay ayVarB2 = ((dd) bnVar.d()).b();
        return ayVarB2 == null ? ayVar : ayVarB2;
    }

    public static final /* synthetic */ Object p(fi fiVar, com.waze.av.d.k kVar, h.c.e eVar) {
        Object objAk = fiVar.ak(kVar, true, eVar);
        return objAk == h.c.a.a.f48038a ? objAk : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:4:0x000e, B:8:0x002b, B:11:0x0039, B:10:0x0035, B:6:0x0018), top: B:18:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final java.lang.String s(com.waze.search.v2.fi r2) {
        /*
            com.waze.shared_infra.s.b r2 = r2.f36528l
            java.util.Locale r2 = r2.getLocale()
            com.waze.lx r0 = com.waze.mg.f29780a
            android.content.Context r0 = r0.a()
            if (r2 == 0) goto L18
            java.lang.String r1 = r2.getCountry()     // Catch: java.lang.Exception -> L42
            boolean r1 = com.google.d.b.an.f(r1)     // Catch: java.lang.Exception -> L42
            if (r1 == 0) goto L29
        L18:
            android.content.res.Resources r2 = r0.getResources()     // Catch: java.lang.Exception -> L42
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Exception -> L42
            android.os.LocaleList r2 = a.a$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: java.lang.Exception -> L42
            r0 = 0
            java.util.Locale r2 = a.a$$ExternalSyntheticApiModelOutline0.m(r2, r0)     // Catch: java.lang.Exception -> L42
        L29:
            if (r2 == 0) goto L35
            java.lang.String r0 = r2.getCountry()     // Catch: java.lang.Exception -> L42
            boolean r0 = com.google.d.b.an.f(r0)     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L39
        L35:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L42
        L39:
            java.util.Currency r0 = java.util.Currency.getInstance(r2)     // Catch: java.lang.Exception -> L42
            java.lang.String r2 = r0.getSymbol(r2)     // Catch: java.lang.Exception -> L42
            goto L43
        L42:
            r2 = 0
        L43:
            boolean r0 = com.google.d.b.an.f(r2)
            if (r0 == 0) goto L4b
            java.lang.String r2 = "$"
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fi.s(com.waze.search.v2.fi):java.lang.String");
    }

    public static /* synthetic */ h.ab t(fi fiVar) {
        fiVar.ao();
        fiVar.aC(new dh(-1, (Intent) null, 6));
        return h.ab.f48028a;
    }

    static final h.ab u(fi fiVar, String str) {
        h.g.b.x.f(str, "markerTag");
        h.g.b.x.f(str, "markerId");
        fiVar.z.c(ed.a(str));
        return h.ab.f48028a;
    }

    static final h.ab v(fi fiVar, AddressItem addressItem) {
        h.g.b.x.f(addressItem, "it");
        addressItem.setTitle(((dd) fiVar.B.d()).e() == q.f36609c ? fiVar.f36517a.c(R.string.HOME, new Object[0]) : fiVar.f36517a.c(R.string.WORK, new Object[0]));
        return h.ab.f48028a;
    }

    public final kotlinx.coroutines.b.ch C() {
        return this.F;
    }

    public final kotlinx.coroutines.b.ch D() {
        return this.B;
    }

    public final kotlinx.coroutines.b.ch E() {
        return this.y;
    }

    public final kotlinx.coroutines.b.ch F() {
        return this.D;
    }

    public final void K(kotlinx.coroutines.af afVar, h.g.a.l lVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(lVar, "uiRequestHandler");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(this.G, new en(this, lVar, null)), afVar);
    }

    public final void L(com.waze.av.d.k kVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        dd ddVar;
        com.waze.av.d.k kVar2;
        List listC;
        Object next;
        h.g.b.x.f(kVar, "venueExtendedData");
        do {
            bnVar = this.A;
            objD = bnVar.d();
            ddVar = (dd) objD;
            com.waze.sdk.bq bqVarQ = ddVar.q();
            com.waze.search.bc bcVar = bqVarQ instanceof com.waze.search.bc ? (com.waze.search.bc) bqVarQ : null;
            com.waze.av.c.l lVarE = bcVar != null ? bcVar.e() : null;
            if (lVarE == null || (listC = lVarE.c()) == null) {
                kVar2 = null;
            } else {
                Iterator it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (h.g.b.x.n(((com.waze.av.d.k) next).A(), kVar.A())) {
                            break;
                        }
                    }
                }
                kVar2 = (com.waze.av.d.k) next;
            }
        } while (!bnVar.f(objD, dd.s(ddVar, null, null, null, null, null, kVar2 != null ? (com.waze.search.bc) ddVar.q() : null, ab(kVar), false, null, null, null, null, null, 0, 0L, false, false, null, null, false, null, 4194207)));
        ar(kVar);
    }

    public final void M(com.waze.av.c.l lVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        dd ddVar;
        e eVarAB;
        com.waze.search.bc bcVar;
        com.waze.ad.c.b bVarG;
        dc dcVar;
        c cVarA;
        PolylineGeometry polylineGeometry;
        q qVarB;
        h.g.b.x.f(lVar, "searchV2ResultsResponse");
        do {
            bnVar = this.A;
            objD = bnVar.d();
            ddVar = (dd) objD;
            com.waze.search.bc bcVar2 = new com.waze.search.bc(lVar);
            com.waze.navigate.dg dgVar = this.f36526j;
            boolean zK = df.k(bcVar2, dgVar.ah().d() == com.waze.navigate.ei.f31311b);
            if (bcVar2.e().c().isEmpty()) {
                eVarAB = null;
            } else {
                List listI = df.i(this.f36518b, bcVar2.e().c(), zK);
                ArrayList arrayList = new ArrayList(h.a.i.q(listI, 10));
                Iterator it = listI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.waze.av.d.k) it.next()).h());
                }
                eVarAB = aB(arrayList);
            }
            di diVar = this.f36520d;
            bcVar = bcVar2;
            bVarG = fj.g(diVar, bcVar);
            bu buVar = this.u;
            dcVar = dc.f36339c;
            cVarA = buVar.a(diVar != null ? diVar.d() : null, diVar != null ? diVar.c() : null);
            polylineGeometry = (PolylineGeometry) dgVar.aj().d();
            if (diVar == null || (qVarB = diVar.b()) == null) {
                qVarB = q.f36607a;
            }
        } while (!bnVar.f(objD, dd.s(ddVar, dcVar, bVarG, cVarA, this.f36518b, this.f36519c, bcVar, null, false, null, null, polylineGeometry, W(), qVarB, 0, 0L, false, false, null, eVarAB, false, null, 2344832)));
    }

    public final void N(kotlinx.coroutines.af afVar, h.g.a.l lVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(lVar, "updateBounds");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.D(kotlinx.coroutines.b.ai.y(new cc(this.D, 6))), new by((Object) lVar, 3, (short[]) null)), afVar);
    }

    public final void O(kotlinx.coroutines.af afVar, h.g.a.l lVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(lVar, "updateMapData");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(this.D, 7)), new by(lVar, 4, (int[]) null)), afVar);
    }

    public final boolean P() {
        return this.F.d() != null;
    }

    public final com.waze.speech.k W() {
        return (com.waze.speech.k) this.N.getValue();
    }

    public final void aa(com.waze.speech.k kVar) {
        String str;
        h.g.b.x.f(kVar, "inEvent");
        com.waze.shared_infra.i.e eVarA = bt.a();
        h.g.b.x.f(kVar, "<this>");
        if (h.g.b.x.n(kVar, ag.f36146a)) {
            str = "BackButtonPressed";
        } else if (h.g.b.x.n(kVar, ah.f36147a)) {
            str = "BottomMenuClosed";
        } else if (h.g.b.x.n(kVar, ai.f36148a)) {
            str = "CloseButtonPressed";
        } else if (h.g.b.x.n(kVar, aj.f36149a)) {
            str = "HeaderClicked";
        } else if (kVar instanceof ak) {
            str = "ListItemClicked";
        } else if (kVar instanceof al) {
            str = "ListItemShown";
        } else if (kVar instanceof am) {
            str = "LocationPreviewEventWrapper (" + com.waze.ui.m.dc.J(((am) kVar).a()) + ")";
        } else if (h.g.b.x.n(kVar, an.f36156a)) {
            str = "MapClicked";
        } else if (kVar instanceof ao) {
            str = "MapDragged";
        } else if (kVar instanceof ap) {
            str = "MapPinClicked";
        } else if (kVar instanceof aq) {
            str = "MapViewportPolygonChanged";
        } else if (kVar instanceof ar) {
            str = "PinBitmapsUpdated";
        } else if (h.g.b.x.n(kVar, as.f36161a)) {
            str = "RecenterClicked";
        } else if (h.g.b.x.n(kVar, at.f36162a)) {
            str = "Retry";
        } else if (kVar instanceof au) {
            str = "ReturnToMap";
        } else if (h.g.b.x.n(kVar, av.f36164a)) {
            str = "SearchAreaClicked";
        } else if (kVar instanceof aw) {
            str = "SetFavGasType";
        } else if (kVar instanceof ay) {
            str = "SetPreferredGasBrand";
        } else if (kVar instanceof ax) {
            str = "SetGasSortBy";
        } else if (kVar instanceof ba) {
            str = "ShowAmenitiesFilterSheet";
        } else if (h.g.b.x.n(kVar, bb.f36176a)) {
            str = "ShowGasBrandFilterSheet";
        } else if (h.g.b.x.n(kVar, bc.f36177a)) {
            str = "ShowGasProductFilterSheet";
        } else if (kVar instanceof be) {
            str = "ShowLegalPopup";
        } else if (h.g.b.x.n(kVar, bf.f36180a)) {
            str = "ShowNetworksFilterSheet";
        } else if (h.g.b.x.n(kVar, bg.f36181a)) {
            str = "ShowPlugsFilterSheet";
        } else if (h.g.b.x.n(kVar, bh.f36182a)) {
            str = "ShowPriceFilterSheet";
        } else if (h.g.b.x.n(kVar, bd.f36178a)) {
            str = "ShowGasSortSheet";
        } else if (h.g.b.x.n(kVar, bj.f36184a)) {
            str = "ToggleDriveThruFilter";
        } else if (h.g.b.x.n(kVar, bk.f36185a)) {
            str = "ToggleFastChargeFilter";
        } else if (h.g.b.x.n(kVar, bl.f36186a)) {
            str = "ToggleOpenNowFilter";
        } else if (h.g.b.x.n(kVar, bm.f36187a)) {
            str = "ToggleSecurityFilter";
        } else if (h.g.b.x.n(kVar, bn.f36188a)) {
            str = "ToggleTopRatedFilter";
        } else if (h.g.b.x.n(kVar, bo.f36189a)) {
            str = "UiRequestHandled";
        } else if (kVar instanceof bp) {
            str = "UpdateAmenityFilter";
        } else if (kVar instanceof bq) {
            str = "UpdateNetworkFilter";
        } else if (kVar instanceof br) {
            str = "UpdatePlugFilter";
        } else if (kVar instanceof bs) {
            str = "UpdatePriceRangeFilter";
        } else if (kVar instanceof az) {
            str = "SetSortBy";
        } else {
            if (!(kVar instanceof bi)) {
                throw new h.i();
            }
            str = "ShowSortSheet";
        }
        eVarA.a("handleEvent, event = " + str + ", lpp open == " + P());
        am amVar = kVar instanceof am ? (am) kVar : null;
        if (h.g.b.x.n(amVar != null ? amVar.a() : null, com.waze.ui.m.az.f42803a)) {
            kVar = aj.f36149a;
        }
        fs fsVar = this.f36524h;
        kotlinx.coroutines.b.ch chVar = this.B;
        fsVar.m(kVar, fj.f((dd) chVar.d()), ((dd) chVar.d()).c());
        kotlinx.coroutines.aj.z(this.J, null, null, new x(this, kVar, (h.c.e) null, 2), 3);
    }

    public final p h() {
        return this.f36518b;
    }

    public final di i() {
        return this.f36520d;
    }

    public final com.waze.shared_infra.q.e l() {
        return this.f36522f;
    }

    public final Object q(com.waze.br.a.f fVar, h.c.e eVar) {
        com.waze.av.b.n nVarE;
        if (fVar instanceof com.waze.br.a.d) {
            nVarE = com.waze.bw.c.d.v.v(((com.waze.br.a.d) fVar).a(), null, null, null, null, 15);
        } else {
            if (!(fVar instanceof com.waze.br.a.e)) {
                throw new h.i();
            }
            nVarE = com.waze.ad.c.b.e(((com.waze.br.a.e) fVar).a());
        }
        Object objC = this.x.b(new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.o, new com.waze.modules.navigation.ai(nVarE), null, true, com.waze.modules.navigation.at.f30321a, null, false, null, 224)).a().c(eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }

    public final kotlinx.coroutines.b.bm x() {
        return this.G;
    }

    public final kotlinx.coroutines.b.bm y() {
        return this.H;
    }
}
