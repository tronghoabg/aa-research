package com.waze.navigate;

import com.waze.NativeManager;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.jt;
import com.waze.kd;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dz extends dg implements dj, bc {
    private final kotlinx.coroutines.b.bm A;
    private final kotlinx.coroutines.b.bq B;
    private final kotlinx.coroutines.b.bn C;
    private final kotlinx.coroutines.b.ch D;
    private final kotlinx.coroutines.b.bn E;
    private final kotlinx.coroutines.b.ch F;
    private final kotlinx.coroutines.b.bn G;
    private final kotlinx.coroutines.b.ch H;
    private boolean I;
    private final kotlinx.coroutines.b.ch J;

    /* renamed from: a, reason: collision with root package name */
    private final kd f31271a;

    /* renamed from: b, reason: collision with root package name */
    private final DriveToNativeManager f31272b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f31273c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31274d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f31275e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31276f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f31277g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31278h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31279i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31280j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31281k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31282l;
    private final kotlinx.coroutines.b.bn m;
    private final kotlinx.coroutines.b.bn n;
    private final kotlinx.coroutines.b.bn o;
    private final kotlinx.coroutines.b.bn p;
    private final kotlinx.coroutines.b.bn q;
    private final kotlinx.coroutines.b.bn r;
    private final kotlinx.coroutines.b.bn s;
    private final kotlinx.coroutines.b.bn t;
    private final kotlinx.coroutines.b.bn u;
    private final kotlinx.coroutines.b.bn v;
    private final kotlinx.coroutines.b.bn w;
    private final kotlinx.coroutines.b.bn x;
    private final kotlinx.coroutines.b.bn y;
    private final kotlinx.coroutines.b.ch z;

    public dz(NativeManager nativeManager, kd kdVar, DriveToNativeManager driveToNativeManager) {
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(kdVar, "popupController");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        this.f31271a = kdVar;
        this.f31272b = driveToNativeManager;
        this.f31273c = h.g.a(new com.waze.main_screen.ac.k(19));
        this.f31274d = kotlinx.coroutines.b.ck.b(bv.f31145a);
        kotlinx.coroutines.b.ch<Boolean> nearingDestination = NavigationInfoNativeManager.getInstance().getNearingDestination();
        h.g.b.x.e(nearingDestination, "getNearingDestination(...)");
        this.f31275e = nearingDestination;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new el(ek.f31314a));
        this.f31276f = bnVarB;
        this.f31277g = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f31278h = kotlinx.coroutines.b.ck.b(ei.f31310a);
        this.f31279i = kotlinx.coroutines.b.ck.b(ec.f31300a);
        this.f31280j = kotlinx.coroutines.b.ck.b(null);
        this.f31281k = kotlinx.coroutines.b.ck.b(false);
        this.f31282l = kotlinx.coroutines.b.ck.b(null);
        this.m = kotlinx.coroutines.b.ck.b(null);
        this.n = kotlinx.coroutines.b.ck.b(null);
        this.o = kotlinx.coroutines.b.ck.b(null);
        this.p = kotlinx.coroutines.b.ck.b(null);
        this.q = kotlinx.coroutines.b.ck.b(null);
        this.r = kotlinx.coroutines.b.ck.b(null);
        this.s = kotlinx.coroutines.b.ck.b(null);
        this.t = kotlinx.coroutines.b.ck.b(null);
        this.u = kotlinx.coroutines.b.ck.b(null);
        this.v = kotlinx.coroutines.b.ck.b(gh.f31428a);
        this.w = kotlinx.coroutines.b.ck.b(an.f30997a);
        this.x = kotlinx.coroutines.b.ck.b(cd.f31163a);
        kotlinx.coroutines.b.bn bnVarB2 = kotlinx.coroutines.b.ck.b(null);
        this.y = bnVarB2;
        this.z = kotlinx.coroutines.b.ai.U(bnVarB2);
        kotlinx.coroutines.b.bm bmVarC = kotlinx.coroutines.b.bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.A = bmVarC;
        this.B = kotlinx.coroutines.b.ai.S(bmVarC);
        kotlinx.coroutines.b.bn bnVarB3 = kotlinx.coroutines.b.ck.b(null);
        this.C = bnVarB3;
        this.D = bnVarB3;
        kotlinx.coroutines.b.bn bnVarB4 = kotlinx.coroutines.b.ck.b(null);
        this.E = bnVarB4;
        this.F = bnVarB4;
        kotlinx.coroutines.b.bn bnVarB5 = kotlinx.coroutines.b.ck.b(false);
        this.G = bnVarB5;
        this.H = bnVarB5;
        this.J = nativeManager.getNavResultDataFlow();
        NativeManager.runOnNativeManagerReady(new e(this, 12));
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void A(String str, String str2, int i2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void B(int i2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void C() {
    }

    @Override // com.waze.navigate.dj
    public final void D(com.waze.modules.c.eb ebVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        com.waze.modules.c.eb ebVar2;
        h.g.b.x.f(ebVar, "route");
        do {
            bnVar = this.y;
            objD = bnVar.d();
            ebVar2 = (com.waze.modules.c.eb) objD;
        } while (!bnVar.f(objD, ebVar));
        if (ebVar instanceof com.waze.modules.c.du) {
            U().a("Offline reroute detected");
            this.A.c(ebVar);
            return;
        }
        if (!(ebVar instanceof com.waze.modules.c.dv)) {
            throw new h.i();
        }
        com.waze.modules.c.ar arVarA = ((com.waze.modules.c.dv) ebVar).a();
        com.waze.modules.c.dv dvVar = ebVar2 instanceof com.waze.modules.c.dv ? (com.waze.modules.c.dv) ebVar2 : null;
        com.waze.modules.c.ar arVarA2 = dvVar != null ? dvVar.a() : null;
        if (arVarA2 != null && !h.g.b.x.n(arVarA.j(), arVarA2.j())) {
            U().a("Reroute detected, oldRoute:" + arVarA2.j() + ", newRoute:" + arVarA.j());
            this.A.c(ebVar);
        }
        com.waze.modules.c.di diVarG = arVarA.g();
        if (diVarG != null) {
            kd kdVar = this.f31271a;
            String strL = diVarG.l();
            String strH = diVarG.h();
            String strK = diVarG.k();
            String strG = diVarG.g();
            String strI = diVarG.i();
            String strE = diVarG.e();
            String strJ = diVarG.j();
            String strF = diVarG.f();
            com.waze.modules.c.dj djVarA = diVarG.a();
            com.waze.modules.c.dj djVarB = diVarG.b();
            String strD = diVarG.d();
            String strC = diVarG.c();
            kdVar.e(new jt(strL, strK, strI, strJ, strD, strH, strG, djVarA, djVarB, strE, strF, strC.length() <= 0 ? null : strC));
        }
    }

    @Override // com.waze.navigate.dj
    public final void E(com.waze.realtime_report_feedback.c cVar) {
        h.g.b.x.f(cVar, "trafficState");
        this.v.e(cVar);
    }

    @Override // com.waze.navigate.dj
    public final void F(com.waze.realtime_report_feedback.c cVar) {
        h.g.b.x.f(cVar, "enforcementZoneStaet");
        this.x.e(cVar);
    }

    @Override // com.waze.navigate.dj
    public final void G(com.waze.realtime_report_feedback.c cVar) {
        h.g.b.x.f(cVar, "averageSpeedCameraState");
        this.w.e(cVar);
    }

    @Override // com.waze.navigate.b
    public final kotlinx.coroutines.b.ch H() {
        return this.t;
    }

    @Override // com.waze.navigate.ao
    public final kotlinx.coroutines.b.ch I() {
        return this.w;
    }

    @Override // com.waze.navigate.aq
    public final kotlinx.coroutines.b.ch J() {
        return this.s;
    }

    @Override // com.waze.navigate.bw
    public final kotlinx.coroutines.b.k K() {
        return this.f31274d;
    }

    @Override // com.waze.navigate.cf
    public final /* synthetic */ kotlinx.coroutines.b.k L() {
        return this.D;
    }

    @Override // com.waze.navigate.cg
    public final /* synthetic */ kotlinx.coroutines.b.k M() {
        return this.J;
    }

    @Override // com.waze.navigate.ch
    public final kotlinx.coroutines.b.ch N() {
        return this.F;
    }

    @Override // com.waze.navigate.ch
    public final void O() {
        NavigationInfoNativeManager navigationInfoNativeManager = NavigationInfoNativeManager.getInstance();
        h.g.b.x.e(navigationInfoNativeManager, "getInstance(...)");
        ds.updateNavigationResult$default(navigationInfoNativeManager, null, 1, null);
    }

    @Override // com.waze.navigate.cj
    public final kotlinx.coroutines.b.ch P() {
        return this.p;
    }

    @Override // com.waze.navigate.co
    public final kotlinx.coroutines.b.ch Q() {
        kotlinx.coroutines.b.ch<String> hovTextFlow = NavigationInfoNativeManager.getInstance().getHovTextFlow();
        h.g.b.x.e(hovTextFlow, "getHovTextFlow(...)");
        return hovTextFlow;
    }

    @Override // com.waze.navigate.cr
    public final kotlinx.coroutines.b.k R() {
        return this.q;
    }

    @Override // com.waze.navigate.dg
    public final void S() {
        if (this.I) {
            return;
        }
        this.I = true;
        NavigationInfoNativeManager.getInstance().addNavigationUpdateListener(this);
        this.f31272b.addCurrentStreetUpdateListener(this);
    }

    public final com.waze.shared_infra.i.e U() {
        Object value = this.f31273c.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return (com.waze.shared_infra.i.e) value;
    }

    @Override // com.waze.navigate.eu
    public final /* synthetic */ kotlinx.coroutines.b.k V() {
        return this.f31275e;
    }

    @Override // com.waze.navigate.gb
    public final kotlinx.coroutines.b.k W() {
        return this.r;
    }

    public final kotlinx.coroutines.b.bn X() {
        return this.f31281k;
    }

    @Override // com.waze.navigate.fr
    public final kotlinx.coroutines.b.bq Y() {
        return this.B;
    }

    @Override // com.waze.navigate.gx
    public final kotlinx.coroutines.b.ch Z() {
        return this.z;
    }

    @Override // com.waze.navigate.dj
    public final void a(a aVar) {
        this.t.e(aVar);
    }

    @Override // com.waze.navigate.eo
    public final /* synthetic */ kotlinx.coroutines.b.ch aa() {
        return this.o;
    }

    public final kotlinx.coroutines.b.ch ab() {
        return this.J;
    }

    @Override // com.waze.navigate.eo
    public final /* synthetic */ kotlinx.coroutines.b.ch ac() {
        return this.f31281k;
    }

    @Override // com.waze.navigate.eo
    public final /* synthetic */ kotlinx.coroutines.b.ch ad() {
        return this.f31282l;
    }

    @Override // com.waze.navigate.eo
    public final /* synthetic */ kotlinx.coroutines.b.ch ae() {
        return this.f31279i;
    }

    @Override // com.waze.navigate.eo
    public final /* synthetic */ kotlinx.coroutines.b.ch af() {
        return this.m;
    }

    @Override // com.waze.navigate.en
    public final kotlinx.coroutines.b.ch ag() {
        return this.f31277g;
    }

    @Override // com.waze.navigate.en
    public final /* synthetic */ kotlinx.coroutines.b.ch ah() {
        return this.f31278h;
    }

    @Override // com.waze.navigate.eo
    public final /* synthetic */ kotlinx.coroutines.b.ch ai() {
        return this.n;
    }

    @Override // com.waze.navigate.fs
    public final kotlinx.coroutines.b.ch aj() {
        return this.u;
    }

    @Override // com.waze.navigate.eo
    public final /* synthetic */ kotlinx.coroutines.b.ch ak() {
        return this.f31280j;
    }

    @Override // com.waze.navigate.gj
    public final kotlinx.coroutines.b.ch al() {
        return this.v;
    }

    @Override // com.waze.navigate.eo
    public final kotlinx.coroutines.b.ch am() {
        return this.H;
    }

    @Override // com.waze.navigate.dj
    public final void b(int i2) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        cq cqVar;
        do {
            bnVar = this.q;
            objD = bnVar.d();
            cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
        } while (!bnVar.f(objD, cq.d(cqVar, cp.g(cqVar.a(), null, null, Long.valueOf(i2), null, null, null, 59), null, false, 6)));
    }

    @Override // com.waze.navigate.dj
    public final void bB(com.waze.main_screen.bottom_bars.scrollable_eta.i iVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.g.b.x.f(iVar, "etaScreenNavData");
        do {
            bnVar = this.E;
            objD = bnVar.d();
        } while (!bnVar.f(objD, iVar));
    }

    @Override // com.waze.navigate.bc
    public final void bC(String str, boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        String str2;
        do {
            bnVar = this.s;
            objD = bnVar.d();
            if (str != null) {
                String str3 = str;
                str2 = true != h.n.o.G(str3) ? str3 : null;
            }
        } while (!bnVar.f(objD, new ap(str2, z)));
    }

    @Override // com.waze.navigate.dj
    public final void c(ea eaVar) {
        h.g.b.x.f(eaVar, "instruction");
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.q;
            Object objD = bnVar.d();
            cq cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
            ea eaVar2 = eaVar;
            if (bnVar.f(objD, cq.d(cqVar, cp.g(cqVar.a(), eaVar2, null, null, null, null, null, 62), null, false, 6))) {
                return;
            } else {
                eaVar = eaVar2;
            }
        }
    }

    @Override // com.waze.navigate.dj
    public final void d(de deVar) {
        h.g.b.x.f(deVar, "distanceState");
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.q;
            Object objD = bnVar.d();
            cq cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
            de deVar2 = deVar;
            if (bnVar.f(objD, cq.d(cqVar, cp.g(cqVar.a(), null, deVar2, null, null, null, null, 61), null, false, 6))) {
                return;
            } else {
                deVar = deVar2;
            }
        }
    }

    @Override // com.waze.navigate.dj
    public final void e(com.waze.av.b.n nVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f31282l;
            objD = bnVar.d();
        } while (!bnVar.f(objD, nVar));
    }

    @Override // com.waze.navigate.dj
    public final void f(com.waze.br brVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.g.b.x.f(brVar, "etaCardData");
        do {
            bnVar = this.C;
            objD = bnVar.d();
        } while (!bnVar.f(objD, brVar));
    }

    @Override // com.waze.navigate.dj
    public final void g(de deVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        ci ciVar;
        h.g.b.x.f(deVar, "distanceState");
        do {
            bnVar = this.p;
            objD = bnVar.d();
            ciVar = (ci) objD;
            if (ciVar == null) {
                ciVar = new ci(null);
            }
        } while (!bnVar.f(objD, ci.d(ciVar, null, deVar, null, 5)));
    }

    @Override // com.waze.navigate.dj
    public final void h(String str, String str2, int i2) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        ci ciVar;
        ck ckVar;
        do {
            bnVar = this.p;
            objD = bnVar.d();
            ciVar = (ci) objD;
            if (ciVar == null) {
                ciVar = new ci(null);
            }
            ckVar = new ck(str == null ? "" : str, str2 != null ? str2 : "", i2);
            String str3 = str;
            boolean z = false;
            if ((str3 == null || str3.length() == 0) && i2 == 0) {
                z = true;
            }
            Boolean.valueOf(z).getClass();
            if (true == z) {
                ckVar = null;
            }
        } while (!bnVar.f(objD, ci.d(ciVar, ckVar, null, null, 6)));
    }

    @Override // com.waze.navigate.ce
    public final kotlinx.coroutines.b.ch i() {
        return this.x;
    }

    @Override // com.waze.navigate.dj
    public final void j(int i2) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        cq cqVar;
        do {
            bnVar = this.q;
            objD = bnVar.d();
            cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
        } while (!bnVar.f(objD, cq.d(cqVar, cp.g(cqVar.a(), null, null, null, null, null, Integer.valueOf(i2), 31), null, false, 6)));
    }

    @Override // com.waze.navigate.dj
    public final void k(di diVar) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.q;
            Object objD = bnVar.d();
            cq cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
            di diVar2 = diVar;
            if (bnVar.f(objD, cq.d(cqVar, cp.g(cqVar.a(), null, null, null, null, diVar2, null, 47), null, false, 6))) {
                return;
            } else {
                diVar = diVar2;
            }
        }
    }

    @Override // com.waze.navigate.dj
    public final void l(com.waze.shared_infra.l.a aVar, long j2) {
        this.o.e(aVar != null ? new gk(aVar, j2) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    @Override // com.waze.navigate.dj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(boolean r7, int r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.dz.m(boolean, int):void");
    }

    @Override // com.waze.navigate.dj
    public final void n(int i2) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        cq cqVar;
        do {
            bnVar = this.q;
            objD = bnVar.d();
            cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
        } while (!bnVar.f(objD, cq.d(cqVar, null, cp.g(cqVar.b(), null, null, null, null, null, Integer.valueOf(i2), 31), false, 5)));
    }

    @Override // com.waze.navigate.dj
    public final void o(ea eaVar) {
        h.g.b.x.f(eaVar, "instruction");
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.q;
            Object objD = bnVar.d();
            cq cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
            ea eaVar2 = eaVar;
            if (bnVar.f(objD, cq.d(cqVar, null, cp.g(cqVar.b(), eaVar2, null, null, null, null, null, 62), false, 5))) {
                return;
            } else {
                eaVar = eaVar2;
            }
        }
    }

    @Override // com.waze.navigate.dj
    public final void p(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        cq cqVar;
        do {
            bnVar = this.q;
            objD = bnVar.d();
            cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
        } while (!bnVar.f(objD, cq.d(cqVar, null, cp.g(cqVar.b(), null, null, null, new es(i2, str == null ? "" : str, navigationRoadSign != null ? et.u(navigationRoadSign) : null, null), null, null, 55), z, 1)));
    }

    @Override // com.waze.navigate.dj
    public final void q(com.waze.shared_infra.l.a aVar) {
        this.n.e(aVar);
    }

    @Override // com.waze.navigate.dj
    public final void r(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f31279i;
            objD = bnVar.d();
        } while (!bnVar.f(objD, z ? ec.f31301b : ec.f31300a));
    }

    @Override // com.waze.navigate.dj
    public final void s(PolylineGeometry polylineGeometry) {
        this.u.e(polylineGeometry);
    }

    @Override // com.waze.navigate.dj
    public final void t(Long l2) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.m;
            objD = bnVar.d();
        } while (!bnVar.f(objD, l2));
    }

    @Override // com.waze.navigate.dj
    public final void u(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.G;
            objD = bnVar.d();
            ((Boolean) objD).booleanValue();
        } while (!bnVar.f(objD, Boolean.valueOf(z)));
    }

    @Override // com.waze.navigate.dj
    public final void v(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        cq cqVar;
        do {
            bnVar = this.q;
            objD = bnVar.d();
            cqVar = (cq) objD;
            if (cqVar == null) {
                cqVar = new cq(null);
            }
        } while (!bnVar.f(objD, cq.d(cqVar, cp.g(cqVar.a(), null, null, null, new es(i2, str == null ? "" : str, navigationRoadSign != null ? et.u(navigationRoadSign) : null, Boolean.valueOf(z)), null, null, 55), null, false, 6)));
    }

    @Override // com.waze.navigate.dj
    public final void w(String str) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        ci ciVar;
        do {
            bnVar = this.p;
            objD = bnVar.d();
            ciVar = (ci) objD;
            if (ciVar == null) {
                ciVar = new ci(null);
            }
        } while (!bnVar.f(objD, ci.d(ciVar, null, null, new ag(str == null ? "" : str), 3)));
    }

    @Override // com.waze.navigate.dj
    public final void x(ga gaVar) {
        this.r.e(gaVar);
    }

    @Override // com.waze.navigate.dj
    public final void y(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f31274d;
            objD = bnVar.d();
        } while (!bnVar.f(objD, z ? bv.f31146b : bv.f31145a));
    }

    @Override // com.waze.navigate.dj
    public final void z(Position.IntPosition intPosition) {
        Object objD;
        com.waze.shared_infra.h.c cVar = intPosition != null ? new com.waze.shared_infra.h.c(intPosition.getLatitude(), intPosition.getLongitude()) : null;
        kotlinx.coroutines.b.bn bnVar = this.f31280j;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, cVar));
    }
}
