package com.waze.car_lib.o;

import android.content.Context;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ItemList;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.R;
import com.waze.asks.ak;
import com.waze.car_lib.p.cc;
import com.waze.car_lib.p.cd;
import com.waze.car_lib.p.cf;
import com.waze.car_lib.p.cg;
import com.waze.car_lib.p.ch;
import com.waze.car_lib.p.ci;
import com.waze.car_lib.p.cj;
import com.waze.car_lib.p.cl;
import com.waze.car_lib.p.cm;
import com.waze.car_lib.p.cn;
import com.waze.car_lib.p.cy;
import com.waze.car_lib.p.cz;
import com.waze.car_lib.p.dc;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.co;
import com.waze.car_lib.screens.cp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ae {
    public /* synthetic */ ae(byte[] bArr) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.waze.o.d.b.b.c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.waze.o.d.b.b.c] */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.waze.o.d.b.b.c] */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.waze.o.d.b.b.c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.waze.o.d.b.b.c] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.waze.o.d.b.b.c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.waze.o.d.b.b.c] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.waze.o.d.b.b.c] */
    private static List a(com.waze.settings.tree.g gVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.l lVar3, final h.g.a.l lVar4, h.g.a.l lVar5) {
        byte[] cjVar;
        byte[] bArr;
        byte[] cjVar2;
        List listI = gVar.i();
        ArrayList arrayList = new ArrayList();
        Iterator it = listI.iterator();
        while (true) {
            byte[] clVar = null;
            cj cjVar3 = null;
            byte[] cjVar4 = null;
            if (!it.hasNext()) {
                break;
            }
            com.waze.settings.tree.f fVar = (com.waze.settings.tree.f) it.next();
            if (fVar.z()) {
                if (fVar instanceof y) {
                    final y yVar = (y) fVar;
                    final boolean zQ = yVar.B().Q();
                    y yVar2 = yVar;
                    final com.waze.settings.tree.f fVarN = com.waze.nightmode.e.n(yVar2);
                    clVar = new cj(c(yVar2), zQ ? yVar.j() : yVar.g(), new h.g.a.a() { // from class: com.waze.car_lib.o.aa
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return ae.e(zQ, yVar, lVar4, fVarN);
                        }
                    });
                } else if (fVar instanceof com.waze.settings.tree.d.s) {
                    com.waze.settings.tree.d.s sVar = (com.waze.settings.tree.d.s) fVar;
                    com.waze.settings.tree.d.s sVar2 = sVar;
                    clVar = new cl(c(sVar2), b(sVar2), sVar.B().Q(), new ak(sVar, com.waze.nightmode.e.n(sVar2), 1, clVar));
                } else {
                    int i2 = 17;
                    if (fVar instanceof com.waze.settings.tree.d.d) {
                        com.waze.settings.tree.d.d dVar = (com.waze.settings.tree.d.d) fVar;
                        dVar.e(dVar.f37539b);
                        com.waze.settings.tree.d.d dVar2 = dVar;
                        cjVar2 = new cj(c(dVar2), b(dVar2), new com.waze.app_nav.hub.n(lVar, dVar, i2, clVar));
                        bArr = cjVar2;
                        cjVar = bArr;
                        cjVar4 = cjVar;
                    } else {
                        int i3 = 16;
                        if (fVar instanceof com.waze.settings.tree.d.n) {
                            com.waze.settings.tree.d.n nVar = (com.waze.settings.tree.d.n) fVar;
                            if (m(nVar, new com.waze.alerters.h(13), new com.waze.alerters.h(14), new com.waze.alerters.h(15), new com.waze.alerters.h(i3), new com.waze.alerters.h(i2)) != null) {
                                com.waze.settings.tree.d.n nVar2 = nVar;
                                cjVar3 = new cj(c(nVar2), b(nVar2), new com.waze.app_nav.hub.n(lVar2, nVar, 18, clVar));
                            }
                            bArr = cjVar3;
                            cjVar = bArr;
                            cjVar4 = cjVar;
                        } else if (fVar instanceof v) {
                            v vVar = (v) fVar;
                            v vVar2 = vVar;
                            cjVar = new cj(c(vVar2), b(vVar2), new com.waze.app_nav.hub.n(lVar3, vVar, 19, clVar));
                            cjVar4 = cjVar;
                        } else if (fVar instanceof com.waze.settings.tree.d.h) {
                            com.waze.settings.tree.d.h hVar = (com.waze.settings.tree.d.h) fVar;
                            com.waze.settings.tree.d.h hVar2 = hVar;
                            cjVar4 = new ch(c(hVar2), b(hVar2), hVar instanceof t, new com.waze.app_nav.hub.n(lVar5, hVar, i3, clVar));
                        } else if (fVar instanceof w) {
                            w wVar = (w) fVar;
                            cjVar4 = new ci(c(wVar), b(wVar));
                        } else if (fVar instanceof x) {
                            x xVar = (x) fVar;
                            x xVar2 = xVar;
                            cjVar4 = new cj(c(xVar2), b(xVar2), new com.waze.app_nav.hub.n(lVar4, xVar, 20, clVar));
                        }
                    }
                }
                cjVar2 = clVar;
                bArr = cjVar2;
                cjVar = bArr;
                cjVar4 = cjVar;
            } else {
                cjVar2 = clVar;
                bArr = cjVar2;
                cjVar = bArr;
                cjVar4 = cjVar;
            }
            if (cjVar4 != null) {
                arrayList.add(cjVar4);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    private static String b(com.waze.settings.tree.f fVar) {
        String strP = fVar.P();
        return strP == null ? "" : strP;
    }

    private static String c(com.waze.settings.tree.f fVar) {
        String strT = fVar.t();
        String str = strT;
        if (str == null || str.length() == 0) {
            strT = null;
        }
        return strT == null ? "-" : strT;
    }

    static h.ab e(boolean z, y yVar, h.g.a.l lVar, com.waze.settings.tree.f fVar) {
        x xVar = new x(yVar.s(), null, null, yVar.r(), c(yVar), z ? yVar.i() : yVar.f(), true, new dc(yVar.d(), false), new dc(z ? yVar.h() : yVar.e(), true), new cp(13), new z(yVar, z, fVar, 0), yVar.c(), 4100);
        xVar.x(yVar.n());
        lVar.invoke(xVar);
        return h.ab.f48028a;
    }

    public static cd f(com.waze.settings.tree.d.d dVar) {
        String strC;
        h.g.a.a aVarB;
        h.g.b.x.f(dVar, "<this>");
        List listH = dVar.H();
        ArrayList arrayList = new ArrayList(h.a.i.q(listH, 10));
        Iterator it = listH.iterator();
        while (true) {
            Integer numValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            com.waze.settings.tree.d.g gVar = (com.waze.settings.tree.d.g) it.next();
            String strC2 = c(gVar);
            String strP = gVar.P();
            com.waze.settings.tree.d dVarM = gVar.m();
            com.waze.settings.tree.a aVar = dVarM instanceof com.waze.settings.tree.a ? (com.waze.settings.tree.a) dVarM : null;
            if (aVar != null) {
                numValueOf = Integer.valueOf(aVar.a());
            }
            arrayList.add(new cc(strC2, strP, numValueOf));
        }
        ArrayList arrayList2 = arrayList;
        if (true == arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            return null;
        }
        u uVar = dVar instanceof u ? (u) dVar : null;
        if (uVar == null || (aVarB = uVar.b()) == null || (strC = (String) aVarB.invoke()) == null) {
            strC = c(dVar);
        }
        Iterator it2 = dVar.H().iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = 0;
                break;
            }
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                h.a.i.p();
            }
            if (((com.waze.settings.tree.d.g) next).g()) {
                break;
            }
            i3 = i4;
        }
        return new cd(strC, i3, arrayList2, new ab(dVar, i2));
    }

    public static GridTemplate g(Context context, com.waze.o.d.b.b.c cVar, h.g.a.a aVar, h.g.a.l lVar) {
        h.g.b.x.f(context, "carContext");
        h.g.b.x.f(cVar, "state");
        h.g.b.x.f(aVar, "closeClicked");
        h.g.b.x.f(lVar, "itemClicked");
        int i2 = 1;
        if (cVar instanceof cz) {
            GridTemplate.Builder builder = new GridTemplate.Builder();
            builder.setLoading(true);
            GridTemplate gridTemplateBuild = builder.build();
            h.g.b.x.e(gridTemplateBuild, "build(...)");
            return gridTemplateBuild;
        }
        if (!(cVar instanceof cy)) {
            throw new h.i();
        }
        GridTemplate.Builder builder2 = new GridTemplate.Builder();
        ItemList.Builder builder3 = new ItemList.Builder();
        cy cyVar = (cy) cVar;
        for (com.waze.car_lib.p.t tVar : cyVar.b()) {
            GridItem.Builder builder4 = new GridItem.Builder();
            builder4.setTitle(tVar.d());
            builder4.setImage(new CarIcon.Builder(IconCompat.createWithResource(context, tVar.a())).build());
            builder4.setOnClickListener(new com.waze.car_lib.p.w(lVar, tVar, i2));
            builder3.addItem(builder4.build());
        }
        builder2.setSingleList(builder3.build());
        builder2.setTitle(cyVar.a());
        if (cyVar.c()) {
            builder2.setHeaderAction(Action.BACK);
        }
        if (cyVar.d()) {
            ActionStrip.Builder builder5 = new ActionStrip.Builder();
            builder5.addAction(dh.G(R.drawable.ic_icon_outline_close_88px, context, false, aVar, 12));
            builder2.setActionStrip(builder5.build());
        }
        GridTemplate gridTemplateBuild2 = builder2.build();
        h.g.b.x.e(gridTemplateBuild2, "build(...)");
        return gridTemplateBuild2;
    }

    public static com.waze.settings.tree.d.n h(final com.waze.car_lib.r.b.b bVar, com.waze.shared_infra.o.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(bVar, "hncSettingsStateHolder");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "onOpenLicensePlateClicked");
        if (!bVar.j()) {
            return null;
        }
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.HNC_HOY_NO_CIRCULA));
        m mVar = new m(bVar, 1, null);
        com.waze.settings.tree.f[] fVarArr = new com.waze.settings.tree.f[3];
        int i2 = 2;
        int i3 = 4;
        fVarArr[0] = new w("hnc_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.HNC_IN_CAR_HOY_NO_CIRCULA_DESCRIPTION_TITLE)), new com.waze.asks.ad(aVar, i2), i3);
        String str = "hnc_license_plate_row";
        String str2 = "LICENSE_PLATE_SETTINGS";
        fVarArr[1] = new t(str, str2, com.waze.ui.ad.b.c(Integer.valueOf(R.string.HNC_IN_CAR_LICENSE_PLATE_IN_MENU_TITLE)), new com.waze.asks.ad(bVar, 3), null, new j(aVar2, i2), 16);
        com.waze.ui.ac.n nVarC2 = com.waze.ui.ad.b.c(Integer.valueOf(R.string.HNC_IN_CAR_PERMIT_IN_MENU_TITLE));
        com.waze.settings.tree.c.h hVarB = bVar.b();
        List<com.waze.car_lib.r.b.a> listD = bVar.d();
        ArrayList arrayList = new ArrayList(h.a.i.q(listD, 10));
        for (com.waze.car_lib.r.b.a aVar3 : listD) {
            arrayList.add(new com.waze.settings.tree.d.g(aVar3.c(), aVar3.b(), aVar3.a(), null, null, null, 56));
        }
        ArrayList arrayList2 = arrayList;
        com.waze.app_nav.hub.n nVar = new com.waze.app_nav.hub.n(bVar, aVar, 15);
        com.waze.asks.ad adVar = new com.waze.asks.ad(aVar, i3);
        com.waze.settings.tree.c cVar = com.waze.settings.tree.c.f37530a;
        fVarArr[2] = new u(nVarC2, cVar, hVarB, arrayList2, nVar, adVar);
        return new s(nVarC, cVar, h.a.i.i(fVarArr), new h.g.a.a() { // from class: com.waze.car_lib.o.l
            @Override // h.g.a.a
            public final Object invoke() {
                com.waze.car_lib.r.b.b bVar2 = bVar;
                return bVar2.k() ? new r(new m(bVar2, 0)) : new r(null);
            }
        }, new com.waze.asks.ad(bVar, 5), mVar);
    }

    public static String i(com.waze.car_lib.n.v vVar) {
        h.g.b.x.f(vVar, "<this>");
        com.waze.car_lib.n.t tVar = vVar instanceof com.waze.car_lib.n.t ? (com.waze.car_lib.n.t) vVar : null;
        if (tVar != null) {
            if (true != tVar.d()) {
                tVar = null;
            }
            if (tVar != null) {
                return tVar.b();
            }
        }
        return null;
    }

    public static String j(com.waze.car_lib.n.v vVar) {
        h.g.b.x.f(vVar, "<this>");
        com.waze.car_lib.n.t tVar = vVar instanceof com.waze.car_lib.n.t ? (com.waze.car_lib.n.t) vVar : null;
        if (tVar != null) {
            if (true == tVar.d()) {
                tVar = null;
            }
            if (tVar != null) {
                return tVar.b();
            }
        }
        return null;
    }

    public static boolean k(com.waze.car_lib.n.v vVar) {
        h.g.b.x.f(vVar, "<this>");
        return h.g.b.x.n(i(vVar), "gas_station") || h.g.b.x.n(j(vVar), "GAS_STATION");
    }

    public static boolean l(com.waze.car_lib.n.v vVar) {
        h.g.b.x.f(vVar, "<this>");
        return h.g.b.x.n(i(vVar), "parking") || h.g.b.x.n(j(vVar), "PARKING_LOT");
    }

    public static co m(com.waze.settings.tree.d.n nVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.l lVar3, h.g.a.l lVar4, h.g.a.l lVar5) {
        List listA;
        h.g.a.a aVarC;
        h.g.b.x.f(nVar, "<this>");
        h.g.b.x.f(lVar, "onOptionsPageClicked");
        h.g.b.x.f(lVar2, "onPageClicked");
        h.g.b.x.f(lVar3, "onCustomPageClicked");
        h.g.b.x.f(lVar4, "onMessagePageClicked");
        h.g.a.l lVar6 = lVar5;
        h.g.b.x.f(lVar6, "onButtonClicked");
        s sVar = nVar instanceof s ? (s) nVar : null;
        cm cmVar = (sVar == null || (aVarC = sVar.c()) == null) ? null : new cm(((r) aVarC.invoke()).a());
        if (!(((com.waze.settings.tree.f) h.a.i.R(nVar.i())) instanceof com.waze.settings.tree.d.m)) {
            List listA2 = a(nVar, lVar, lVar2, lVar3, lVar4, lVar5);
            return listA2 != null ? new cf(c(nVar), cmVar, listA2) : null;
        }
        List<com.waze.settings.tree.f> listI = nVar.i();
        ArrayList arrayList = new ArrayList();
        for (com.waze.settings.tree.f fVar : listI) {
            cn cnVar = ((fVar instanceof com.waze.settings.tree.d.m) && ((com.waze.settings.tree.d.m) fVar).z() && (listA = a((com.waze.settings.tree.g) fVar, lVar, lVar2, lVar3, lVar4, lVar6)) != null) ? new cn(c(fVar), listA) : null;
            if (cnVar != null) {
                arrayList.add(cnVar);
            }
            lVar6 = lVar5;
        }
        ArrayList arrayList2 = arrayList;
        if (true == arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        return arrayList2 != null ? new cg(c(nVar), cmVar, arrayList2) : null;
    }

    private ae() {
        throw null;
    }
}
