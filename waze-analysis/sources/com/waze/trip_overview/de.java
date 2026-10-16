package com.waze.trip_overview;

import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ResultStruct;
import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public CompletableDeferred f41332a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.modules.c.ch f41333b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.f.k f41334c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f41335d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.c.d f41336e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bn.b f41337f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f41338g;

    /* renamed from: h, reason: collision with root package name */
    private final bl f41339h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.settings.eb f41340i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.af f41341j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.bo.a.c f41342k;

    /* renamed from: l, reason: collision with root package name */
    private final z f41343l;
    private final com.waze.modules.c.dx m;
    private final com.waze.shared_infra.q.e n;
    private final com.waze.trip_overview.a.d o;
    private final com.waze.modules.navigation.af p;
    private final com.waze.shared_infra.i.e q;
    private bw r;
    private final kotlinx.coroutines.b.bn s;
    private final kotlinx.coroutines.b.ch t;

    public de(com.waze.modules.c.ch chVar, com.waze.sharedui.f.k kVar, com.waze.sharedui.e.g gVar, com.waze.map.c.d dVar, com.waze.bn.b bVar, com.waze.shared_infra.o.a aVar, bl blVar, com.waze.settings.eb ebVar, kotlinx.coroutines.af afVar, com.waze.bo.a.c cVar, z zVar, com.waze.modules.c.dx dxVar, com.waze.shared_infra.q.e eVar, com.waze.trip_overview.a.d dVar2, com.waze.modules.navigation.af afVar2, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(chVar, "routeCalculator");
        h.g.b.x.f(kVar, "networkGateway");
        h.g.b.x.f(gVar, "locationService");
        h.g.b.x.f(dVar, "mapMarkerCreator");
        h.g.b.x.f(bVar, "roamingProvider");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(blVar, "stats");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(cVar, "routeSettingsRepository");
        h.g.b.x.f(zVar, "configuration");
        h.g.b.x.f(dxVar, "visualImpactConfiguration");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(dVar2, "getVisualImpactMapDataUseCase");
        h.g.b.x.f(afVar2, "selectRouteController");
        h.g.b.x.f(eVar2, "logger");
        this.f41333b = chVar;
        this.f41334c = kVar;
        this.f41335d = gVar;
        this.f41336e = dVar;
        this.f41337f = bVar;
        this.f41338g = aVar;
        this.f41339h = blVar;
        this.f41340i = ebVar;
        this.f41341j = afVar;
        this.f41342k = cVar;
        this.f41343l = zVar;
        this.m = dxVar;
        this.n = eVar;
        this.o = dVar2;
        this.p = afVar2;
        this.q = eVar2;
        this.r = new bw(0L, false, false, ViewCompat.MEASURED_SIZE_MASK);
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.s = bnVarB;
        this.t = bnVarB;
    }

    private final bjz A(com.waze.modules.navigation.ah ahVar) {
        if (ahVar == null) {
            this.q.b("source is null, defaulting to MOBILE_ANDROID");
            return bjz.MOBILE_ANDROID;
        }
        g gVar = g.f41463a;
        cx cxVar = cx.f41309a;
        com.waze.map.b.dx dxVar = com.waze.map.b.dx.f28228a;
        f fVar = f.f41451a;
        switch (ahVar.ordinal()) {
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
            case 15:
            case 17:
            case 18:
            case 19:
            case 25:
            case 26:
            case 27:
                return bjz.MOBILE_ANDROID;
            case 16:
                return bjz.AAP;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return bjz.AAOS;
            default:
                throw new h.i();
        }
    }

    private final void B(boolean z) throws IOException {
        H(true, new com.waze.bw.c.d.a(6));
        H(z, new com.waze.bw.c.d.a(10));
    }

    private final void C() throws IOException {
        Object next;
        H(true, new com.waze.bw.c.d.a(9));
        this.f41339h.u();
        com.waze.modules.navigation.ak akVarG = this.r.g();
        if (akVarG == null) {
            H(true, new cj(1));
            return;
        }
        Iterator it = this.r.n().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Number) ((Map.Entry) next).getValue()).longValue() == this.r.e()) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getKey() : null;
        com.waze.modules.navigation.af afVar = this.p;
        com.waze.modules.navigation.j jVarV = this.r.v();
        com.waze.modules.navigation.an anVar = jVarV instanceof com.waze.modules.navigation.an ? (com.waze.modules.navigation.an) jVarV : null;
        com.waze.modules.c.dk dkVarH = this.r.h();
        com.waze.av.b.n nVarA = akVarG.a();
        long jE = this.r.e();
        com.waze.modules.navigation.aj ajVar = akVarG instanceof com.waze.modules.navigation.aj ? (com.waze.modules.navigation.aj) akVarG : null;
        afVar.a(str, anVar, dkVarH, nVarA, jE, ajVar != null ? ajVar.d() : null, com.waze.modules.navigation.i.f30438a, new com.waze.ads.j(this, 2));
    }

    private final void D() {
        bb bbVar = bb.n;
        bc bcVar = bc.f41056a;
        bw bwVar = this.r;
        this.f41339h.n(bbVar, bcVar, null, bwVar, bwVar.d(), bjz.MOBILE_ANDROID);
    }

    private final void E(cx cxVar, boolean z) {
        com.waze.modules.navigation.am amVar;
        this.f41339h.x();
        if (cxVar == cx.f41310b || !(this.r.v() instanceof com.waze.modules.navigation.an)) {
            com.waze.sharedui.e.c cVarA = this.f41335d.a();
            amVar = cVarA != null ? new com.waze.modules.navigation.am(cVarA) : null;
        } else {
            amVar = this.r.v();
        }
        com.waze.modules.navigation.j jVar = amVar;
        com.waze.modules.navigation.ak akVarG = this.r.g();
        if (jVar == null || com.waze.av.d.t.f(jVar).g() || akVarG == null || akVarG.a().e().d().g()) {
            this.q.b("recalculateForNow with bad origin or destination");
        } else {
            kotlinx.coroutines.aj.z(this.f41341j, null, null, new da(this, jVar, akVarG, z, cxVar, null), 3);
        }
    }

    private final void F(bb bbVar) {
        bc bcVar = bc.f41057b;
        bw bwVar = this.r;
        com.waze.sharedui.views.ap.l(this.f41339h, bbVar, bcVar, bwVar, bwVar.d(), bjz.MOBILE_ANDROID, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(long j2) throws IOException {
        g gVarB = this.r.k().b();
        g gVar = g.f41463a;
        cx cxVar = cx.f41309a;
        com.waze.map.b.dx dxVar = com.waze.map.b.dx.f28228a;
        f fVar = f.f41451a;
        com.waze.modules.navigation.ah ahVar = com.waze.modules.navigation.ah.f30285a;
        int iOrdinal = gVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new h.i();
            }
        } else {
            long jA = this.n.a();
            H(true, new com.waze.sound.e.i(new com.waze.shared_infra.q.a(jA, com.waze.settings.h.c.h(j2) + jA), 18));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0731  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(boolean r46, h.g.a.l r47) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.de.H(boolean, h.g.a.l):void");
    }

    private final void I(bw bwVar) throws IOException {
        Object next;
        H(true, new cj(4));
        com.waze.modules.c.ar arVar = (com.waze.modules.c.ar) h.a.i.R(bwVar.h().f());
        long jA = arVar != null ? arVar.a() : bwVar.e();
        Iterator it = bwVar.h().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.waze.modules.c.ar) next).a() == jA) {
                    break;
                }
            }
        }
        com.waze.modules.c.ar arVar2 = (com.waze.modules.c.ar) next;
        if (jA != -1 && jA != this.r.e() && arVar2 != null) {
            this.f41339h.m(bk.f41093a, K(arVar2), h.a.i.h());
        }
        H(true, new com.waze.stats.storage.d(bwVar, jA, 3));
    }

    private static /* synthetic */ bw J(bw bwVar) {
        h.g.b.x.f(bwVar, "it");
        return bw.y(bwVar, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, null, false, 0L, null, 0L, null, null, false, 16760831);
    }

    private static final bi K(com.waze.modules.c.ar arVar) {
        return new bi(String.valueOf(arVar.a()), arVar.j());
    }

    private static final boolean L(com.waze.modules.c.d dVar) {
        return (dVar == null || dVar == com.waze.modules.c.d.f30033a) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0264 A[LOOP:2: B:93:0x025e->B:95:0x0264, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(boolean r31, boolean r32, long r33, com.waze.modules.navigation.j r35, com.waze.modules.navigation.ak r36, com.waze.modules.navigation.ah r37, com.waze.modules.c.dk r38, com.waze.trip_overview.cx r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.de.M(boolean, boolean, long, com.waze.modules.navigation.j, com.waze.modules.navigation.ak, com.waze.modules.navigation.ah, com.waze.modules.c.dk, com.waze.trip_overview.cx):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(com.waze.sharedui.views.ap apVar) {
        cf cfVar;
        if (apVar instanceof cp) {
            kotlinx.coroutines.aj.z(this.f41341j, null, null, new db(this, (int) this.r.c(), null), 3);
        }
        if (h.g.b.x.n(apVar, cn.f41301a)) {
            cfVar = cc.f41285a;
        } else if (h.g.b.x.n(apVar, co.f41302a)) {
            cfVar = ce.f41287a;
        } else if (h.g.b.x.n(apVar, cq.f41303a)) {
            cfVar = cd.f41286a;
        } else {
            if (!h.g.b.x.n(apVar, cr.f41304a)) {
                throw new h.i();
            }
            cfVar = cf.f41288a;
        }
        com.waze.shared_infra.i.e eVar = this.q;
        Objects.toString(cfVar);
        eVar.a("RoutesController complete with reason: ".concat(cfVar.toString()));
        o().a(cfVar);
    }

    static final bw d(bw bwVar) {
        return J(bwVar);
    }

    static final bw e(bw bwVar) {
        return J(bwVar);
    }

    static final bw f(bw bwVar) {
        return J(bwVar);
    }

    static final bw g(bw bwVar) {
        return J(bwVar);
    }

    static final bw h(bw bwVar) {
        return J(bwVar);
    }

    static final bw i(bw bwVar, Map map, de deVar, bw bwVar2) {
        h.g.b.x.f(bwVar2, "it");
        return bw.y(bwVar, false, false, null, null, null, 0L, null, 0L, map, null, false, null, deVar.f41342k.b(), null, null, false, 0L, null, 0L, null, null, false, 16772863);
    }

    static final bw j(de deVar, bw bwVar) {
        h.g.b.x.f(bwVar, "it");
        return bw.y(bwVar, false, false, null, null, null, 0L, null, 0L, null, null, false, null, null, null, null, false, 0L, null, deVar.n.a(), null, null, false, 16515071);
    }

    public static final /* synthetic */ Object k(de deVar, h.c.e eVar) {
        Object objI = kotlinx.coroutines.b.ai.i(deVar.f41337f.a(), new cy(null), eVar);
        return objI == h.c.a.a.f48038a ? objI : h.ab.f48028a;
    }

    static final h.ab m(de deVar) {
        deVar.N(cn.f41301a);
        return h.ab.f48028a;
    }

    static final h.ab n(de deVar) {
        deVar.N(co.f41302a);
        return h.ab.f48028a;
    }

    public static /* synthetic */ void q(de deVar, StartNavigationResponse startNavigationResponse) throws IOException {
        if ((startNavigationResponse == null || startNavigationResponse.getCode() != 0) && startNavigationResponse != null) {
            deVar.q.g("Navigation request failed " + startNavigationResponse.getCode() + ": " + startNavigationResponse.getServerDesc());
            bl blVar = deVar.f41339h;
            be beVar = be.f41067b;
            int code = startNavigationResponse.getCode();
            String serverDesc = startNavigationResponse.getServerDesc();
            h.g.b.x.e(serverDesc, "getServerDesc(...)");
            blVar.y(beVar, code, serverDesc, deVar.r.f());
            dq.f41415a.a().b(com.waze.sharedui.web.at.i(deVar.r.f()), dp.f41412a, String.valueOf(startNavigationResponse.getCode()), startNavigationResponse.getServerDesc());
        }
        deVar.H(true, new cj(5));
        kotlinx.coroutines.aj.z(deVar.f41341j, null, null, new cz(deVar, null), 3);
    }

    public static final /* synthetic */ void r(de deVar, com.waze.sharedui.b bVar) throws IOException {
        ag ajVar;
        ResultStruct resultStruct = bVar instanceof ResultStruct ? (ResultStruct) bVar : null;
        bl blVar = deVar.f41339h;
        be beVar = be.f41066a;
        int code = resultStruct != null ? resultStruct.code : bVar.getCode();
        bVar.getCode();
        String errorCode = bVar.getErrorCode();
        h.g.b.x.e(errorCode, "getErrorCode(...)");
        blVar.y(beVar, code, errorCode, deVar.r.f());
        dq.f41415a.a().b(com.waze.sharedui.web.at.i(deVar.r.f()), dp.f41413b, String.valueOf(resultStruct != null ? resultStruct.code : bVar.getCode()), bVar.getErrorCode());
        switch (bVar.getCode()) {
            case 401:
                ajVar = ag.f40996a;
                break;
            case 402:
                ajVar = new aj(bVar.getErrorMessage());
                break;
            case 403:
                ajVar = ah.f40997a;
                break;
            default:
                if (resultStruct != null && resultStruct.isNetworkError()) {
                    ajVar = ai.f40998a;
                    break;
                } else {
                    ajVar = ak.f41000a;
                    break;
                }
                break;
        }
        deVar.H(true, new com.waze.sound.e.i(ajVar, 19));
    }

    static /* synthetic */ void v(de deVar, boolean z, h.g.a.a aVar, int i2) throws IOException {
        if ((i2 & 2) != 0) {
            aVar = new com.waze.bx.a(11);
        }
        if (deVar.r.k().e()) {
            bl blVar = deVar.f41339h;
            bb bbVar = bb.f41046c;
            bw bwVar = deVar.r;
            com.waze.sharedui.views.ap.l(blVar, bbVar, null, bwVar, bwVar.d(), deVar.A(deVar.r.f()), 6);
        }
        boolean z2 = 1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1));
        aVar.invoke();
        deVar.B(z2);
    }

    public final com.waze.modules.c.ch a() {
        return this.f41333b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.trip_overview.dc
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.trip_overview.dc r0 = (com.waze.trip_overview.dc) r0
            int r1 = r0.f41327c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41327c = r1
            goto L18
        L13:
            com.waze.trip_overview.dc r0 = new com.waze.trip_overview.dc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f41325a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f41327c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L61
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            i.b.l.cc r6 = i.b.l.cd.newBuilder()
            i.b.s.a r2 = i.b.s.b.newBuilder()
            r2.a(r5)
            com.google.v.du r5 = r2.build()
            i.b.s.b r5 = (i.b.s.b) r5
            r6.k(r5)
            com.google.v.du r5 = r6.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            i.b.l.cd r5 = (i.b.l.cd) r5
            com.waze.sharedui.f.k r4 = r4.f41334c
            int r6 = com.waze.sharedui.api.a.f38785a
            com.waze.sharedui.f.d r6 = com.waze.sharedui.api.a.g()
            r0.f41327c = r3
            java.lang.Object r6 = com.waze.sharedui.f.n.b(r4, r6, r5, r0)
            if (r6 == r1) goto L80
        L61:
            com.waze.sharedui.f.n r6 = (com.waze.sharedui.f.n) r6
            boolean r4 = r6 instanceof com.waze.sharedui.f.i
            if (r4 == 0) goto L6a
            h.ab r4 = h.ab.f48028a
            return r4
        L6a:
            boolean r4 = r6 instanceof com.waze.sharedui.f.j
            if (r4 == 0) goto L7a
            com.waze.sharedui.f.b r4 = new com.waze.sharedui.f.b
            com.waze.sharedui.f.j r6 = (com.waze.sharedui.f.j) r6
            com.waze.sharedui.b r5 = r6.a()
            r4.<init>(r5)
            throw r4
        L7a:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.de.l(int, h.c.e):java.lang.Object");
    }

    public final CompletableDeferred o() {
        CompletableDeferred completableDeferred = this.f41332a;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        h.g.b.x.j("completable");
        return null;
    }

    public final kotlinx.coroutines.b.ch p() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x04c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.waze.trip_overview.fh r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.de.t(com.waze.trip_overview.fh):void");
    }

    public final void u(eq eqVar) throws IOException {
        Object next;
        h.g.b.x.f(eqVar, "onRouteSelected");
        if (eqVar.b() == i.f41471a) {
            this.q.b("onRouteSelectedFromMap: invalid source supplied");
            return;
        }
        long jA = eqVar.a();
        if (this.r.e() != jA) {
            H(true, new com.waze.main_screen.c.f(jA, 6));
        }
        bl blVar = this.f41339h;
        bb bbVar = bb.f41047d;
        bc bcVarA = eqVar.b().a();
        bd bdVarB = eqVar.b().b();
        bw bwVar = this.r;
        blVar.n(bbVar, bcVarA, bdVarB, bwVar, bwVar.d(), A(this.r.f()));
        Iterator it = this.r.h().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.waze.modules.c.ar) next).a() == jA) {
                    break;
                }
            }
        }
        com.waze.modules.c.ar arVar = (com.waze.modules.c.ar) next;
        if (arVar != null) {
            blVar.m(bk.f41094b, K(arVar), h.a.i.h());
        }
    }

    public final kotlinx.coroutines.am x(boolean z, long j2, com.waze.modules.navigation.j jVar, com.waze.modules.navigation.ak akVar, com.waze.modules.navigation.ah ahVar, com.waze.modules.c.dk dkVar, long j3) throws IOException {
        h.g.b.x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(ahVar, "source");
        h.g.b.x.f(dkVar, "routingResponse");
        this.q.a("RoutesController starting TripOverview");
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        h.g.b.x.f(completableDeferredJ, "<set-?>");
        this.f41332a = completableDeferredJ;
        z zVar = this.f41343l;
        this.r = new bw(j3, zVar.g(), zVar.h(), 10223615);
        this.f41339h.w();
        M(z, z, j2, jVar, akVar, ahVar, dkVar, cx.f41309a);
        return o();
    }
}
