package com.waze.c.e.a;

import android.content.Context;
import androidx.activity.result.ActivityResult;
import androidx.car.app.model.Action;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.SectionedItemList;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Density;
import androidx.core.app.NotificationCompat;
import com.waze.car_lib.ac;
import com.waze.car_lib.ae;
import com.waze.car_lib.af;
import com.waze.car_lib.b.aw;
import com.waze.car_lib.b.ay;
import com.waze.car_lib.b.bc;
import com.waze.car_lib.b.be;
import com.waze.car_lib.b.bs;
import com.waze.car_lib.b.bt;
import com.waze.car_lib.i.a.aa;
import com.waze.car_lib.p.db;
import com.waze.car_lib.p.dj;
import com.waze.car_lib.p.dk;
import com.waze.car_lib.r.bk;
import com.waze.car_lib.r.cq;
import com.waze.o.ad;
import com.waze.reports.di;
import com.waze.reports.dr;
import com.waze.reports_v2.c.ar;
import com.waze.sharedui.web.WazeWebView;
import com.waze.z.a.b.y;
import h.ab;
import h.g.b.aq;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18412a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18413b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f18413b = i2;
        this.f18412a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v22, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r8v59, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r8v61, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        com.waze.bw.a.b.h hVar;
        bt btVar;
        ay ayVar;
        di diVarL;
        int i2 = 1;
        switch (this.f18413b) {
            case 0:
                return Boolean.valueOf(t.v((t) this.f18412a, (Rect) obj));
            case 1:
                aa aaVar = (aa) ((aq) this.f18412a).f48105a;
                if (aaVar != null) {
                    aaVar.a();
                }
                return ab.f48028a;
            case 2:
                com.waze.sound.e.h hVar2 = (com.waze.sound.e.h) obj;
                x.f(hVar2, "it");
                boolean z = hVar2 instanceof com.waze.bw.a.c.p;
                com.waze.bw.a.b.v vVarX = ((bk) this.f18412a).x();
                if (z) {
                    hVar = new com.waze.bw.a.b.g(((com.waze.bw.a.c.p) hVar2).m());
                } else {
                    if (!(hVar2 instanceof com.waze.bw.a.c.q)) {
                        throw new h.i();
                    }
                    hVar = new com.waze.bw.a.b.h(((com.waze.bw.a.c.q) hVar2).m());
                }
                vVarX.o(hVar);
                return ab.f48028a;
            case 3:
                ad adVar = (ad) obj;
                x.f(adVar, NotificationCompat.CATEGORY_EVENT);
                ((com.waze.car_lib.r.c.c.i) this.f18412a).j(adVar);
                return ab.f48028a;
            case 4:
                cq cqVar = (cq) obj;
                x.c(cqVar);
                x.f(cqVar, "state");
                ListTemplate.Builder builder = new ListTemplate.Builder();
                builder.setTitle(cqVar.m());
                builder.setHeaderAction(Action.BACK);
                if (cqVar instanceof dk) {
                    builder.setLoading(true);
                } else {
                    if (!(cqVar instanceof dj)) {
                        throw new h.i();
                    }
                    dj djVar = (dj) cqVar;
                    if (djVar.d().isEmpty()) {
                        ItemList.Builder builder2 = new ItemList.Builder();
                        builder2.setNoItemsMessage(djVar.a());
                        builder.setSingleList(builder2.build());
                    } else {
                        ItemList.Builder builder3 = new ItemList.Builder();
                        for (com.waze.car_lib.p.di diVar : djVar.d()) {
                            Row.Builder builder4 = new Row.Builder();
                            builder4.setBrowsable(true);
                            builder4.setTitle(diVar.a());
                            builder4.setOnClickListener(new db(diVar.b(), 5));
                            builder3.addItem(builder4.build());
                        }
                        builder.addSectionedList(SectionedItemList.create(builder3.build(), djVar.c()));
                    }
                }
                Object obj2 = this.f18412a;
                ListTemplate listTemplateBuild = builder.build();
                x.e(listTemplateBuild, "build(...)");
                ((com.waze.car_lib.screens.core.n) obj2).q(listTemplateBuild);
                return ab.f48028a;
            case 5:
                String str = (String) obj;
                x.f(str, "it");
                return this.f18412a.b(str);
            case 6:
                com.waze.beacons.n nVar = (com.waze.beacons.n) obj;
                x.f(nVar, NotificationCompat.CATEGORY_EVENT);
                boolean z2 = nVar instanceof com.waze.car_lib.ab;
                Object obj3 = this.f18412a;
                if (z2) {
                    com.waze.car_lib.ab abVar = (com.waze.car_lib.ab) nVar;
                    if (abVar.g() == com.waze.car_lib.aa.f18871d) {
                        ayVar = new aw(bs.f19060b);
                    } else {
                        com.waze.car_lib.aa aaVarG = abVar.g();
                        x.f(aaVarG, "<this>");
                        bs bsVar = bs.f19059a;
                        bt btVar2 = bt.f19065a;
                        com.waze.reports_v2.c.aq aqVar = com.waze.reports_v2.c.aq.f34202a;
                        ar arVar = ar.f34210a;
                        int iOrdinal = aaVarG.ordinal();
                        if (iOrdinal == 0) {
                            btVar = bt.f19067c;
                        } else if (iOrdinal == 1) {
                            btVar = bt.f19065a;
                        } else if (iOrdinal == 2) {
                            btVar = bt.f19068d;
                        } else {
                            if (iOrdinal != 3) {
                                throw new h.i();
                            }
                            btVar = bt.f19070f;
                        }
                        ayVar = new ay(btVar);
                    }
                    ((com.waze.car_lib.r.u) obj3).l(ayVar);
                } else if (!(nVar instanceof ac)) {
                    if (nVar instanceof ae) {
                        ((com.waze.car_lib.r.u) obj3).l(new be(((ae) nVar).g()));
                    } else if (nVar instanceof com.waze.car_lib.ad) {
                        ((com.waze.car_lib.r.u) obj3).l(bc.f19024a);
                    } else {
                        if (!x.n(nVar, af.f18876a)) {
                            throw new h.i();
                        }
                        ((com.waze.car_lib.r.u) obj3).l(new aw(bs.f19059a));
                    }
                }
                return ab.f48028a;
            case 7:
                com.waze.beacons.n nVar2 = (com.waze.beacons.n) obj;
                x.f(nVar2, NotificationCompat.CATEGORY_EVENT);
                this.f18412a.invoke(nVar2);
                return ab.f48028a;
            case 8:
                x.f((Context) obj, "it");
                return ((com.waze.search.v2.g) this.f18412a).a();
            case 9:
                List list = (List) obj;
                x.f(list, "categoryProducts");
                this.f18412a.a(list);
                return ab.f48028a;
            case 10:
                com.waze.car_lib.r.d.x.t((com.waze.car_lib.r.d.x) this.f18412a, ((com.waze.modules.c.ar) obj).a());
                return ab.f48028a;
            case 11:
                this.f18412a.a((byte[][]) obj);
                return ab.f48028a;
            case 12:
                ActivityResult activityResult = (ActivityResult) obj;
                x.f(activityResult, "it");
                dr drVar = (dr) ((State) this.f18412a).getValue();
                if (drVar != null && (diVarL = drVar.l()) != null) {
                    diVarL.D(activityResult.getResultCode(), activityResult.getData());
                }
                return ab.f48028a;
            case 13:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                int i3 = com.waze.closure.d.e.f22495a;
                x.f(layoutCoordinates, "coordinates");
                Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates, 1 == ((false ? 1 : 0) | (1 & 1)));
                ((com.waze.closure.c.i) this.f18412a).h(new android.graphics.Rect((int) rectBoundsInWindow.getLeft(), (int) rectBoundsInWindow.getTop(), (int) rectBoundsInWindow.getRight(), (int) rectBoundsInWindow.getBottom()));
                return ab.f48028a;
            case 14:
                com.waze.t.c.o oVar = (com.waze.t.c.o) obj;
                x.f(oVar, NotificationCompat.CATEGORY_STATUS);
                com.waze.t.c.o oVar2 = com.waze.t.c.o.f40868a;
                int iOrdinal2 = oVar.ordinal();
                if (iOrdinal2 == 0) {
                    ((com.waze.o.d.b.a.d) this.f18412a).b();
                } else if (iOrdinal2 != 1) {
                    throw new h.i();
                }
                return ab.f48028a;
            case 15:
                Context context = (Context) obj;
                x.f(context, "context");
                WazeWebView wazeWebView = new WazeWebView(context);
                wazeWebView.E(new com.waze.r.e(this.f18412a, i2));
                return wazeWebView;
            case 16:
                this.f18412a.a(Boolean.valueOf(x.n((Boolean) obj, true)));
                return ab.f48028a;
            case 17:
                this.f18412a.a(Boolean.valueOf(x.n((Boolean) obj, true)));
                return ab.f48028a;
            case 18:
                return com.waze.copilot.presentation.n.i((com.waze.copilot.presentation.n) this.f18412a, (com.waze.ui.g.s) obj);
            case 19:
                String str2 = (String) obj;
                String str3 = str2 == null ? "" : str2;
                com.waze.crash.c cVar = (com.waze.crash.c) this.f18412a;
                cVar.f23215a.setCustomKey("ENVIROMENT", str3);
                if (str2 == null) {
                    str2 = "";
                }
                cVar.f23215a.setCustomKey("ENVIRONMENT", str2);
                return ab.f48028a;
            default:
                return y.h((com.waze.z.a.b.ab) this.f18412a, (Density) obj);
        }
    }
}
