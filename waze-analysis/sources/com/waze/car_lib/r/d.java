package com.waze.car_lib.r;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21254a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.j.a f21255b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.navigate.af f21256c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.modules.navigation.a.a f21257d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ev.n f21258e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.map.b.cj f21259f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.navigate.fl f21260g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.q.j f21261h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f21262i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.navigate.location_preview.bh f21263j;

    /* renamed from: k, reason: collision with root package name */
    private final long f21264k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.z f21265l;
    private com.waze.car_lib.f.z m;
    private final kotlinx.coroutines.b.bn n;

    public /* synthetic */ d(com.waze.shared_infra.o.a aVar, com.waze.car_lib.j.a aVar2, com.waze.navigate.af afVar, com.waze.modules.navigation.a.a aVar3, com.waze.ev.n nVar, com.waze.map.b.cj cjVar, com.waze.navigate.fl flVar, com.waze.shared_infra.q.j jVar, com.waze.shared_infra.q.e eVar, com.waze.navigate.location_preview.bh bhVar, long j2, com.waze.navigate.location_preview.p pVar, com.waze.z zVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "drivingStatusProvider");
        h.g.b.x.f(afVar, "addressPreviewController");
        h.g.b.x.f(aVar3, "navigationWaypointHelper");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(cjVar, "mapControllerFactory");
        h.g.b.x.f(flVar, "parkingManager");
        h.g.b.x.f(jVar, "dateFormat");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(bhVar, "locationPreviewStatsSender");
        h.g.b.x.f(pVar, "locationPreviewConfig");
        h.g.b.x.f(zVar, "appType");
        this.f21254a = aVar;
        this.f21255b = aVar2;
        this.f21256c = afVar;
        this.f21257d = aVar3;
        this.f21258e = nVar;
        this.f21259f = cjVar;
        this.f21260g = flVar;
        this.f21261h = jVar;
        this.f21262i = eVar;
        this.f21263j = bhVar;
        this.f21264k = j2;
        this.f21265l = zVar;
        this.n = kotlinx.coroutines.b.ck.b(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.waze.car_lib.p.a] */
    public static final /* synthetic */ com.waze.car_lib.p.b d(d dVar, com.waze.av.d.k kVar) throws IOException {
        String strC;
        List listF = kVar.F();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((com.waze.av.d.f) obj).b() > 0) {
                arrayList.add(obj);
            }
        }
        List listAi = h.a.i.ai(h.a.i.al(arrayList, h.b.a.b(new fl(dVar, 1), new com.waze.alerters.h(18), new com.waze.alerters.h(19))));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAi.iterator();
        while (true) {
            strC = null;
            if (!it.hasNext()) {
                break;
            }
            com.waze.av.d.f fVar = (com.waze.av.d.f) it.next();
            com.waze.ev.n nVar = dVar.f21258e;
            com.waze.ev.f fVarA = nVar.a(fVar.d());
            if (fVarA != null) {
                com.waze.ev.l lVarC = nVar.c(fVar.a());
                String strA = lVarC != null ? com.waze.sharedui.utils.o.a(dVar.f21254a, lVarC.a()) : null;
                boolean zContains = nVar.e().contains(fVar.d());
                com.waze.shared_infra.o.a aVar = dVar.f21254a;
                int iA = fVarA.a();
                String strA2 = com.waze.sharedui.utils.o.a(aVar, fVarA.c());
                Integer numValueOf = Integer.valueOf((int) fVar.a());
                strC = new com.waze.car_lib.p.a(iA, strA2, numValueOf.intValue() <= 0 ? null : numValueOf, strA, fVar.b(), fVar.c(), zContains);
            }
            if (strC != null) {
                arrayList2.add(strC);
            }
        }
        ArrayList arrayList3 = arrayList2;
        String strT = kVar.t();
        List listE = kVar.E();
        com.waze.shared_infra.o.a aVar2 = dVar.f21254a;
        String strAM = h.a.i.aM(listE, ", ", null, null, 0, new com.waze.c.e.a.a(aVar2, 5), 30);
        if (true == h.n.o.G(strAM)) {
            strAM = null;
        }
        com.waze.ev.n nVar2 = dVar.f21258e;
        String str = strAM;
        if (((com.waze.ev.m) nVar2.g().d()).d()) {
            List listF2 = kVar.F();
            if ((listF2 instanceof Collection) && listF2.isEmpty()) {
                strC = aVar2.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_NO_MATCHING_PLUGS, new Object[0]);
            } else {
                Iterator it2 = listF2.iterator();
                while (it2.hasNext()) {
                    if (nVar2.e().contains(((com.waze.av.d.f) it2.next()).d())) {
                        break;
                    }
                }
                strC = aVar2.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_NO_MATCHING_PLUGS, new Object[0]);
            }
        }
        return new com.waze.car_lib.p.b(arrayList3, strT, str, strC);
    }

    public static final /* synthetic */ com.waze.car_lib.p.co e(d dVar, com.waze.av.b.n nVar, boolean z, com.waze.car_lib.screens.core.l lVar) {
        return new com.waze.car_lib.p.co(dVar.f21254a.c(R.string.AAOS_ADDRESS_PREVIEW_ADD_STOP, new Object[0]), true, new com.waze.car_lib.b.j(lVar, dVar, nVar, z, 1));
    }

    public static final /* synthetic */ com.waze.car_lib.p.co f(d dVar, com.waze.av.b.n nVar, boolean z, com.waze.car_lib.screens.core.l lVar) {
        return new com.waze.car_lib.p.co(dVar.f21254a.c(R.string.AAOS_ADDRESS_PREVIEW_GO_NOW, new Object[0]), true, new com.waze.car_lib.b.j(lVar, dVar, nVar, z, 2));
    }

    public static final /* synthetic */ com.waze.car_lib.p.co g(d dVar, com.waze.av.b.n nVar, boolean z, com.waze.car_lib.screens.core.l lVar) {
        return new com.waze.car_lib.p.co(dVar.f21254a.c(R.string.AAOS_ADDRESS_PREVIEW_NEW_DRIVE, new Object[0]), false, new com.waze.car_lib.b.j(lVar, dVar, nVar, z, 3));
    }

    static final Comparable o(d dVar, com.waze.av.d.f fVar) {
        h.g.b.x.f(fVar, "it");
        return Boolean.valueOf(dVar.f21258e.e().contains(fVar.d()));
    }

    public static final /* synthetic */ String p(d dVar, com.waze.navigate.n nVar) {
        if (!h.n.o.G(nVar.m())) {
            return nVar.m();
        }
        String strValueOf = String.valueOf(nVar.b().a());
        return !h.n.o.G(strValueOf) ? strValueOf : dVar.f21254a.c(R.string.AAOS_ADDRESS_PREVIEW_ADDRESS_INFO, new Object[0]);
    }

    public static final /* synthetic */ String q(d dVar, com.waze.navigate.o oVar) {
        int iOrdinal = oVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        return iOrdinal != 3 ? dVar.f21254a.c(R.string.AAOS_DANGEROUS_ADDRESS_PREVIEW_TITLE, new Object[0]) : dVar.f21254a.c(R.string.AAOS_DANGEROUS_ADDRESS_PREVIEW_ISRAEL_TITLE, new Object[0]);
    }

    public static /* synthetic */ h.ab s(d dVar, com.waze.av.b.n nVar, boolean z) {
        com.waze.car_lib.f.z zVar = dVar.m;
        if (zVar == null) {
            h.g.b.x.j("addressPreviewCoordinatorController");
            zVar = null;
        }
        zVar.b(nVar, z, com.waze.modules.navigation.at.f30322b);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab t(d dVar, com.waze.av.b.n nVar, boolean z) {
        com.waze.car_lib.f.z zVar = dVar.m;
        if (zVar == null) {
            h.g.b.x.j("addressPreviewCoordinatorController");
            zVar = null;
        }
        zVar.b(nVar, z, null);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab u(d dVar, com.waze.av.b.n nVar, boolean z) {
        com.waze.car_lib.f.z zVar = dVar.m;
        if (zVar == null) {
            h.g.b.x.j("addressPreviewCoordinatorController");
            zVar = null;
        }
        zVar.b(nVar, z, com.waze.modules.navigation.at.f30321a);
        return h.ab.f48028a;
    }

    public final h.k r(Context context, kotlinx.coroutines.af afVar, com.waze.car_lib.f.z zVar, com.waze.av.b.n nVar, com.waze.av.d.k kVar, com.waze.car_lib.screens.core.l lVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(zVar, "addressPreviewCoordinatorController");
        h.g.b.x.f(nVar, "place");
        h.g.b.x.f(lVar, "screenThrottleCallback");
        long jA = this.f21262i.a();
        this.m = zVar;
        MutableLiveData mutableLiveData = new MutableLiveData(new com.waze.car_lib.p.d(((Boolean) this.n.d()).booleanValue()));
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AddressPreviewVmMap");
        h.g.b.x.e(eVarD, "create(...)");
        com.waze.map.b.ed edVarA = this.f21259f.a(eVarD, com.waze.map.b.ch.f28144a);
        h.g.b.am amVar = new h.g.b.am();
        com.waze.install.ah.d(edVarA, null, null, h.a.i.d(com.waze.map.c.b(new com.waze.map.bc(nVar.e().d(), new com.waze.map.az(R.drawable.search_result_pin), com.waze.map.as.f27963e, com.waze.map.aw.f27972b, null, 0.0f, null, 1008))), null, null, null, 251);
        com.waze.install.ah.e(edVarA, null, new com.waze.map.b.co(h.a.i.d(nVar.e().d()), null, 0.0f, 6), false, 13);
        kotlinx.coroutines.aj.z(afVar, null, null, new c(this, nVar, kVar, mutableLiveData, amVar, jA, context, lVar, null), 3);
        return new h.k(mutableLiveData, edVarA);
    }

    public final void w() {
        com.waze.car_lib.f.z zVar = this.m;
        if (zVar == null) {
            h.g.b.x.j("addressPreviewCoordinatorController");
            zVar = null;
        }
        zVar.c();
    }

    public final void x() {
        com.waze.car_lib.f.z zVar = this.m;
        if (zVar == null) {
            h.g.b.x.j("addressPreviewCoordinatorController");
            zVar = null;
        }
        zVar.a();
    }

    public final void y(boolean z) {
        this.n.e(Boolean.valueOf(z));
    }
}
