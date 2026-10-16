package com.waze.map.main;

import android.app.Application;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.map.b.cg;
import com.waze.map.b.dm;
import com.waze.map.ds;
import com.waze.map.gu;
import com.waze.navigate.eh;
import com.waze.navigate.eo;
import com.waze.navigate.et;
import com.waze.navigate.ex;
import com.waze.navigate.fj;
import com.waze.navigate.fk;
import java.util.Map;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bm extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Application f29389a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f29390b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.view.popups.a.aa f29391c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.external_poi.a f29392d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.rtalerts.a f29393e;

    /* renamed from: f, reason: collision with root package name */
    private final eh f29394f;

    /* renamed from: g, reason: collision with root package name */
    private final fk f29395g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.stats.b.a f29396h;

    /* renamed from: i, reason: collision with root package name */
    private final ds f29397i;

    /* renamed from: j, reason: collision with root package name */
    private final eo f29398j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.modules.navigation.bp f29399k;

    /* renamed from: l, reason: collision with root package name */
    private final b f29400l;
    private final ex m;
    private final com.waze.bk n;
    private final ar o;
    private final com.waze.shared_infra.i.e p;
    private final kotlinx.coroutines.b.bn q;
    private final kotlinx.coroutines.b.bn r;
    private com.waze.shared_infra.s.d s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(Application application, ah ahVar, com.waze.view.popups.a.aa aaVar, com.waze.external_poi.a aVar, com.waze.rtalerts.a aVar2, eh ehVar, fk fkVar, com.waze.stats.b.a aVar3, ds dsVar, eo eoVar, com.waze.modules.navigation.bp bpVar, b bVar, ex exVar, com.waze.bk bkVar, ar arVar, com.waze.shared_infra.i.e eVar) {
        super(application);
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        h.g.b.x.f(ahVar, "mainMapStateHolder");
        h.g.b.x.f(aaVar, "mapPopupsStateHolder");
        h.g.b.x.f(aVar, "externalPoiManager");
        h.g.b.x.f(aVar2, "realtimeAlertsManager");
        h.g.b.x.f(ehVar, "startPointRepository");
        h.g.b.x.f(fkVar, "parkedHereRepository");
        h.g.b.x.f(aVar3, "startWalkingRequestSender");
        h.g.b.x.f(dsVar, "mapVenueSelectionRepo");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(bpVar, "startNavigationCoordinatorFactory");
        h.g.b.x.f(bVar, "configuration");
        h.g.b.x.f(exVar, "newVenuePinRepository");
        h.g.b.x.f(bkVar, "deeplinkUpdatesDataSource");
        h.g.b.x.f(arVar, "mainMapStatsSender");
        h.g.b.x.f(eVar, "logger");
        this.f29389a = application;
        this.f29390b = ahVar;
        this.f29391c = aaVar;
        this.f29392d = aVar;
        this.f29393e = aVar2;
        this.f29394f = ehVar;
        this.f29395g = fkVar;
        this.f29396h = aVar3;
        this.f29397i = dsVar;
        this.f29398j = eoVar;
        this.f29399k = bpVar;
        this.f29400l = bVar;
        this.m = exVar;
        this.n = bkVar;
        this.o = arVar;
        this.p = eVar;
        this.q = ck.b(false);
        this.r = ck.b(null);
        int i2 = 7;
        ahVar.e(new com.waze.main_screen.ag.a(i2), new at(this, 1), new at(this, 0), new at(this, 2), new at(this, 3), new at(this, 4), new at(this, 5), new at(this, 6), new at(this, i2));
        addCloseable((AutoCloseable) ahVar);
        bm bmVar = this;
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 0), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 2, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 3, (char[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 4, (short[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 5, (int[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 6, (boolean[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 7, (float[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 8, (byte[][]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bmVar), null, null, new bl(this, (h.c.e) null, 9, (char[][]) null), 3);
    }

    public static final /* synthetic */ void A(bm bmVar, com.waze.shared_infra.h.c cVar) {
        String str;
        fk fkVar = bmVar.f29395g;
        long jCurrentTimeMillis = System.currentTimeMillis();
        h.g.b.x.f(fkVar, "<this>");
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f("", TtmlNode.ATTR_ID);
        fkVar.setParking(cVar.d(), cVar.c(), jCurrentTimeMillis, "", false);
        Map mapI = com.waze.ab.a.l.i(bmVar.f29389a);
        String str2 = (String) mapI.get("dest_lat");
        String str3 = (String) mapI.get("dest_lon");
        String str4 = str2;
        com.waze.shared_infra.h.c cVar2 = null;
        if (str4 != null && str4.length() != 0 && (str = str3) != null && str.length() != 0) {
            cVar2 = new com.waze.shared_infra.h.c((int) Double.parseDouble(str2), (int) Double.parseDouble(str3));
        }
        com.waze.shared_infra.h.c cVar3 = cVar2;
        bmVar.f29396h.a(cVar, cVar3, (String) mapI.get("dest_venueId"), System.currentTimeMillis());
        com.waze.parking.d.f32954a.a().e((String) mapI.get("dest_venueId"), cVar3, cVar);
    }

    private final float I() {
        dm dmVar = (dm) this.f29390b.d().d();
        if (dmVar != null) {
            return dmVar.c();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        com.waze.shared_infra.s.d dVar = this.s;
        if (dVar != null) {
            dVar.a();
        }
        this.s = null;
        this.f29391c.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(com.waze.shared_infra.h.c r10, com.waze.view.popups.a.u r11) {
        /*
            r9 = this;
            kotlinx.coroutines.b.bn r0 = r9.r
            com.waze.map.b.o r1 = new com.waze.map.b.o
            float r4 = r9.I()
            com.waze.map.b.dt r2 = new com.waze.map.b.dt
            java.lang.Object r0 = r0.d()
            android.util.DisplayMetrics r0 = (android.util.DisplayMetrics) r0
            if (r0 != 0) goto L14
            r0 = 0
            goto L3f
        L14:
            boolean r3 = r11 instanceof com.waze.view.popups.a.t
            if (r3 == 0) goto L1b
            r3 = 140(0x8c, float:1.96E-43)
            goto L38
        L1b:
            boolean r3 = r11 instanceof com.waze.view.popups.a.o
            r5 = 220(0xdc, float:3.08E-43)
            if (r3 == 0) goto L37
            r3 = r11
            com.waze.view.popups.a.o r3 = (com.waze.view.popups.a.o) r3
            com.waze.map.gu r3 = r3.a()
            com.waze.map.b.cg r6 = com.waze.map.b.cg.f28139a
            com.waze.map.gu r6 = com.waze.map.gu.f29181a
            int r3 = r3.ordinal()
            r6 = 4
            if (r3 == r6) goto L34
            goto L37
        L34:
            r3 = 120(0x78, float:1.68E-43)
            goto L38
        L37:
            r3 = r5
        L38:
            r5 = 1
            float r3 = (float) r3
            float r0 = android.util.TypedValue.applyDimension(r5, r3, r0)
            int r0 = (int) r0
        L3f:
            com.waze.map.main.ah r8 = r9.f29390b
            r2.<init>(r0)
            r6 = r2
            com.waze.destination_cell.b.e r6 = (com.waze.destination_cell.b.e) r6
            r7 = 10
            r3 = 0
            r5 = 0
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.waze.ap.b.o r1 = (com.waze.ap.b.o) r1
            r8.g(r1)
            com.waze.view.popups.a.aa r9 = r9.f29391c
            r9.l(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.main.bm.K(com.waze.shared_infra.h.c, com.waze.view.popups.a.u):void");
    }

    public static final /* synthetic */ gu c(bm bmVar) {
        com.waze.map.bl blVarB;
        com.waze.view.popups.a.n nVar = (com.waze.view.popups.a.n) bmVar.f29391c.i().d();
        if (nVar == null || (blVarB = nVar.b()) == null) {
            return null;
        }
        return blVarB.a();
    }

    public static final /* synthetic */ Object j(bm bmVar, h.c.e eVar) {
        if (!bmVar.f29400l.b()) {
            return h.ab.f48028a;
        }
        Object objCollect = new u(kotlinx.coroutines.b.ai.y(new u(bmVar.f29398j.ak(), 13)), 12).collect(new l(bmVar, 10), eVar);
        return objCollect != h.c.a.a.f48038a ? h.ab.f48028a : objCollect;
    }

    public static final /* synthetic */ Object k(bm bmVar, h.c.e eVar) {
        Object objCollect = bmVar.n.getLocationSharing().collect(new l(bmVar, 11), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object l(com.waze.map.main.bm r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.map.main.bg
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.main.bg r0 = (com.waze.map.main.bg) r0
            int r1 = r0.f29373c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29373c = r1
            goto L18
        L13:
            com.waze.map.main.bg r0 = new com.waze.map.main.bg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f29371a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29373c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            e.b.c.b(r7)
            goto L4e
        L2f:
            e.b.c.b(r7)
            h.g.b.aq r7 = new h.g.b.aq
            r7.<init>()
            com.waze.navigate.ex r2 = r6.m
            kotlinx.coroutines.b.ch r2 = r2.getNewVenueState()
            com.waze.map.main.bh r4 = new com.waze.map.main.bh
            r5 = 0
            r4.<init>(r7, r6, r5)
            kotlinx.coroutines.b.l r4 = (kotlinx.coroutines.b.l) r4
            r0.f29373c = r3
            java.lang.Object r6 = r2.collect(r4, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            h.e r6 = new h.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.main.bm.l(com.waze.map.main.bm, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object m(com.waze.map.main.bm r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.map.main.bi
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.map.main.bi r0 = (com.waze.map.main.bi) r0
            int r1 = r0.f29379c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29379c = r1
            goto L18
        L13:
            com.waze.map.main.bi r0 = new com.waze.map.main.bi
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f29377a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29379c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            e.b.c.b(r6)
            goto L4a
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.fk r6 = r5.f29395g
            kotlinx.coroutines.b.ch r6 = r6.getParkedState()
            com.waze.map.main.l r2 = new com.waze.map.main.l
            r4 = 12
            r2.<init>(r5, r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f29379c = r3
            java.lang.Object r5 = r6.collect(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            h.e r5 = new h.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.main.bm.m(com.waze.map.main.bm, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Object n(bm bmVar, h.c.e eVar) {
        if (!bmVar.f29400l.b()) {
            return h.ab.f48028a;
        }
        Object objCollect = new u(kotlinx.coroutines.b.ai.y(et.b(bmVar.f29398j)), 14).collect(new l(bmVar, 13), eVar);
        return objCollect != h.c.a.a.f48038a ? h.ab.f48028a : objCollect;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object o(com.waze.map.main.bm r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.map.main.bk
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.map.main.bk r0 = (com.waze.map.main.bk) r0
            int r1 = r0.f29385c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29385c = r1
            goto L18
        L13:
            com.waze.map.main.bk r0 = new com.waze.map.main.bk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f29383a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29385c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            e.b.c.b(r6)
            goto L4a
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.eh r6 = r5.f29394f
            kotlinx.coroutines.b.ch r6 = r6.getNavigationStartPointState()
            com.waze.map.main.l r2 = new com.waze.map.main.l
            r4 = 14
            r2.<init>(r5, r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f29385c = r3
            java.lang.Object r5 = r6.collect(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            h.e r5 = new h.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.main.bm.o(com.waze.map.main.bm, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Object p(bm bmVar, h.c.e eVar) {
        Object objCollect = bmVar.f29397i.a().collect(new l(bmVar, 15), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    static final h.ab q(bm bmVar, com.waze.map.b.v vVar) {
        h.g.b.x.f(vVar, "it");
        bmVar.f29390b.g(new com.waze.map.b.o(vVar.g(), null, 0.0f, true, null, 22));
        bmVar.f29392d.handleExternalPoiClicked(vVar.f());
        return h.ab.f48028a;
    }

    static final h.ab r(bm bmVar, com.waze.map.b.s sVar) {
        h.g.b.x.f(sVar, "it");
        bmVar.f29390b.g(new com.waze.map.b.o(sVar.g(), null, bmVar.I(), true, null, 18));
        bmVar.f29393e.handleAlertClicked(sVar.f());
        return h.ab.f48028a;
    }

    static final h.ab s(bm bmVar, com.waze.map.b.af afVar) {
        h.g.b.x.f(afVar, "it");
        bmVar.o.a(aq.f29342d);
        com.waze.shared_infra.h.c cVarG = afVar.g();
        com.waze.view.popups.a.t tVar = new com.waze.view.popups.a.t(afVar.g(), gu.f29191k, afVar.f());
        bmVar.I();
        bmVar.K(cVarG, tVar);
        return h.ab.f48028a;
    }

    static final h.ab t(bm bmVar, com.waze.map.b.aa aaVar) {
        aq aqVar;
        gu guVar;
        h.g.b.x.f(aaVar, "it");
        cg cgVarF = aaVar.f();
        cg cgVar = cg.f28139a;
        int iOrdinal = cgVarF.ordinal();
        if (iOrdinal == 0) {
            aqVar = aq.f29340b;
        } else if (iOrdinal == 1) {
            aqVar = aq.f29341c;
        } else if (iOrdinal == 2) {
            aqVar = aq.f29343e;
        } else {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            aqVar = aq.f29349k;
        }
        bmVar.o.a(aqVar);
        cg cgVarF2 = aaVar.f();
        gu guVar2 = gu.f29181a;
        int iOrdinal2 = cgVarF2.ordinal();
        if (iOrdinal2 == 0) {
            guVar = gu.f29186f;
        } else if (iOrdinal2 == 1) {
            guVar = gu.f29187g;
        } else if (iOrdinal2 == 2) {
            guVar = gu.f29188h;
        } else {
            if (iOrdinal2 != 3) {
                throw new h.i();
            }
            guVar = gu.f29185e;
        }
        bmVar.K(aaVar.g(), new com.waze.view.popups.a.o(aaVar.g(), guVar));
        return h.ab.f48028a;
    }

    static final h.ab u(bm bmVar, com.waze.map.b.z zVar) {
        h.g.b.x.f(zVar, "it");
        bmVar.o.a(aq.f29344f);
        bmVar.K(zVar.g(), new com.waze.view.popups.a.r(zVar.g(), zVar.f()));
        return h.ab.f48028a;
    }

    static final h.ab v(bm bmVar, com.waze.map.b.ae aeVar) {
        h.g.b.x.f(aeVar, "it");
        bmVar.o.a(aq.f29339a);
        bmVar.f29391c.l(com.waze.view.popups.a.p.f45220a);
        return h.ab.f48028a;
    }

    static final h.ab w(bm bmVar, com.waze.map.b.y yVar) {
        h.g.b.x.f(yVar, "it");
        if (bmVar.s == null) {
            bmVar.o.a(aq.f29346h);
            bmVar.s = bmVar.f29390b.b(yVar.f(), true);
            com.waze.shared_infra.h.c cVarF = yVar.f();
            com.waze.view.popups.a.o oVar = new com.waze.view.popups.a.o(yVar.f(), gu.f29183c);
            bmVar.I();
            bmVar.K(cVarF, oVar);
        } else {
            bmVar.J();
        }
        return h.ab.f48028a;
    }

    static final h.ab x(bm bmVar, com.waze.map.b.w wVar) {
        h.g.b.x.f(wVar, "it");
        bmVar.J();
        return h.ab.f48028a;
    }

    public final void C(bc bcVar) {
        h.g.b.x.f(bcVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(bcVar, ay.f29358a) || h.g.b.x.n(bcVar, ba.f29360a) || h.g.b.x.n(bcVar, ax.f29357a) || h.g.b.x.n(bcVar, av.f29355a)) {
            J();
            return;
        }
        if (bcVar instanceof aw) {
            if (((aw) bcVar).a() == Lifecycle.Event.ON_PAUSE) {
                J();
            }
        } else if (bcVar instanceof az) {
            J();
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bd(this, bcVar, null), 3);
        } else if (bcVar instanceof bb) {
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new m(this, bcVar, (h.c.e) null, 13), 3);
        } else {
            if (!h.g.b.x.n(bcVar, au.f29354a)) {
                throw new h.i();
            }
            J();
            this.f29394f.clearNavigationStartPoint();
        }
    }

    public final void D(com.waze.parking.a aVar) {
        h.g.b.x.f(aVar, "reason");
        this.f29395g.removeParking(aVar);
    }

    public final void E(DisplayMetrics displayMetrics) {
        h.g.b.x.f(displayMetrics, "displayMetrics");
        this.r.e(displayMetrics);
    }

    public final void F(boolean z) {
        this.q.e(Boolean.valueOf(z));
    }

    public final com.waze.shared_infra.h.c g() {
        fj fjVar = (fj) this.f29395g.getParkedState().d();
        if (fjVar != null) {
            return fjVar.a();
        }
        return null;
    }
}
