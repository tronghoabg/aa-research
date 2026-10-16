package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import com.waze.R;
import com.waze.car_lib.f.gw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dp {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21417a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.coordinators.s f21418b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21419c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21420d;

    public dp(gw gwVar, com.waze.av.b.ah ahVar, ds dsVar, com.waze.car_lib.screens.core.l lVar, com.waze.shared_infra.o.a aVar) {
        List<com.waze.av.b.aa> listAl;
        h.g.b.x.f(gwVar, "searchCoordinatorController");
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        h.g.b.x.f(dsVar, "filterType");
        h.g.b.x.f(lVar, "screenThrottleCallback");
        h.g.b.x.f(aVar, "stringProvider");
        this.f21418b = gwVar;
        this.f21420d = lVar;
        this.f21419c = aVar;
        ds dsVar2 = ds.f21434a;
        int iOrdinal = dsVar.ordinal();
        if (iOrdinal == 0) {
            listAl = h.a.i.al(com.waze.av.b.at.j(ahVar), new com.google.firebase.crashlytics.a.c.h(11));
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            List listK = com.waze.av.b.at.k(ahVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                List<com.waze.av.b.h> listC = ((com.waze.av.b.aa) obj).c();
                if (!(listC instanceof Collection) || !listC.isEmpty()) {
                    for (com.waze.av.b.h hVar : listC) {
                        if ((hVar instanceof com.waze.av.b.e) || (hVar instanceof com.waze.av.b.g)) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            }
            listAl = h.a.i.al(arrayList, new com.google.firebase.crashlytics.a.c.h(12));
        }
        ArrayList arrayList2 = new ArrayList();
        for (com.waze.av.b.aa aaVar : listAl) {
            eq eqVar = new eq(this, aaVar, 1);
            com.waze.av.b.h hVar2 = (com.waze.av.b.h) h.a.i.U(aaVar.c());
            com.waze.car_lib.p.bp bpVar = null;
            if (!(hVar2 instanceof com.waze.av.b.e) && !(hVar2 instanceof com.waze.av.b.g)) {
                if (hVar2 instanceof com.waze.av.b.f) {
                    bpVar = new com.waze.car_lib.p.bo(((com.waze.av.b.f) hVar2).d(), eqVar);
                } else {
                    if (hVar2 != null) {
                        throw new h.i();
                    }
                    bpVar = new com.waze.car_lib.p.bp(aaVar.a(), eqVar);
                }
            }
            if (bpVar != null) {
                arrayList2.add(bpVar);
            }
        }
        this.f21417a = arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    public static /* synthetic */ h.ab e(dp dpVar, com.waze.av.b.aa aaVar) {
        Object obj;
        com.waze.av.b.m mVarU;
        h.g.b.x.f(aaVar, "<this>");
        ?? r0 = dpVar.f21419c;
        h.g.b.x.f(r0, "stringProvider");
        com.waze.av.b.h hVar = (com.waze.av.b.h) h.a.i.R(aaVar.c());
        if (hVar != null) {
            mVarU = com.waze.bw.c.d.v.q(aaVar, hVar);
        } else {
            Iterator it = aaVar.d().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long jA = ((com.waze.av.b.y) next).a();
                    do {
                        Object next2 = it.next();
                        long jA2 = ((com.waze.av.b.y) next2).a();
                        if (jA < jA2) {
                            jA = jA2;
                        }
                        if (jA < jA2) {
                            next = next2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            com.waze.av.b.y yVar = (com.waze.av.b.y) obj;
            mVarU = yVar != null ? com.waze.bw.c.d.v.u(aaVar, r0, yVar) : new com.waze.av.b.m(aaVar.a());
        }
        ((gw) dpVar.f21418b).g(mVarU, false);
        return h.ab.f48028a;
    }

    static final h.ab f(dp dpVar, com.waze.av.b.aa aaVar) {
        ((com.waze.car_lib.screens.core.l) dpVar.f21420d).a(new com.waze.car_lib.ar(dpVar, aaVar, 7));
        return h.ab.f48028a;
    }

    public final com.waze.car_lib.p.dg a() {
        return (com.waze.car_lib.p.dg) this.f21420d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h.g.a.a, java.lang.Object] */
    public final void b() {
        boolean zBooleanValue = ((Boolean) this.f21417a.invoke()).booleanValue();
        com.waze.shared_infra.coordinators.s sVar = this.f21418b;
        if (zBooleanValue) {
            ((com.waze.car_lib.f.cw) sVar).h();
        } else {
            ((com.waze.car_lib.f.cw) sVar).k();
        }
    }

    public final void c(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        ((com.waze.car_lib.f.cw) this.f21418b).n(carContext);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List d() {
        return this.f21417a;
    }

    public dp(com.waze.shared_infra.o.a aVar, h.g.a.a aVar2, com.waze.car_lib.f.cw cwVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "isGuestSignupEnabled");
        h.g.b.x.f(cwVar, "coordinatorController");
        this.f21417a = aVar2;
        this.f21418b = cwVar;
        String strC = aVar.c(true != ((Boolean) aVar2.invoke()).booleanValue() ? R.string.AAOS_REQUEST_PERMISSION_SCREEN_PRIVACY_BUTTON : R.string.AAOS_REQUEST_PERMISSION_SCREEN_LEGAL_NOTICES_BUTTON, new Object[0]);
        this.f21419c = strC;
        this.f21420d = new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_REQUEST_PERMISSION_SCREEN_TITLE, new Object[0]), aVar.c(R.string.AAOS_REQUEST_PERMISSION_SCREEN_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_REQUEST_PERMISSION_SCREEN_CONTINUE_BUTTON, new Object[0]), true), new com.waze.car_lib.p.dc(strC, false));
    }
}
