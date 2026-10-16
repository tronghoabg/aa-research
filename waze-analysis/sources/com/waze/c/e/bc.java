package com.waze.c.e;

import android.content.Context;
import androidx.compose.ui.geometry.Rect;
import com.waze.ConfigManager;
import com.waze.modules.c.eb;
import com.waze.navigate.fy;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f18567a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.b.aj f18568b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.c.d.ae f18569c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.c.e.a.b f18570d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.c.d.am f18571e;

    /* renamed from: f, reason: collision with root package name */
    private final fy f18572f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigManager f18573g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f18574h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18575i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.af f18576j;

    /* renamed from: k, reason: collision with root package name */
    private final ci f18577k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.c.e.a.t f18578l;
    private final kotlinx.coroutines.b.bn m;
    private final kotlinx.coroutines.b.ch n;
    private final kotlinx.coroutines.b.bm o;
    private final com.waze.bz.b p;

    public bc(h.c.j jVar, com.waze.map.b.aj ajVar, com.waze.c.d.ae aeVar, com.waze.c.e.a.b bVar, bm bmVar, com.waze.bz.a aVar, com.waze.c.d.am amVar, fy fyVar, ConfigManager configManager, Context context, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(ajVar, "mainMapController");
        h.g.b.x.f(aeVar, "alternateRoutesController");
        h.g.b.x.f(bVar, "alternateRoutesMapStateHolderFactory");
        h.g.b.x.f(bmVar, "alternativeRouteCardTransformerFactory");
        h.g.b.x.f(aVar, "tollInfoDialogStateHolderFactory");
        h.g.b.x.f(amVar, "alternateRoutesStatsSender");
        h.g.b.x.f(fyVar, "tollInfoStatSender");
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(context, "appContext");
        h.g.b.x.f(eVar, "logger");
        this.f18567a = jVar;
        this.f18568b = ajVar;
        this.f18569c = aeVar;
        this.f18570d = bVar;
        this.f18571e = amVar;
        this.f18572f = fyVar;
        this.f18573g = configManager;
        this.f18574h = context;
        this.f18575i = eVar;
        this.f18576j = kotlinx.coroutines.aj.e(jVar);
        ci ciVar = new ci(new av(this), new aw(this), new ax(this), amVar, bmVar.a(new ay(this), new az(this)));
        this.f18577k = ciVar;
        com.waze.c.e.a.t tVarA = bVar.a(jVar, ajVar, new at(this), amVar, true);
        this.f18578l = tVarA;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new g(d.f18660a, (com.waze.ui.b.bd) ciVar.b().d(), (com.waze.c.e.a.c) tVarA.n().d()));
        this.m = bnVarB;
        this.n = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.b.bm bmVarC = kotlinx.coroutines.b.bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.o = bmVarC;
        kotlinx.coroutines.b.ai.S(bmVarC);
        this.p = com.waze.bz.a.c(fyVar, configManager, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.c.e.bc r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.c.e.ar
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.c.e.ar r0 = (com.waze.c.e.ar) r0
            int r1 = r0.f18546c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18546c = r1
            goto L18
        L13:
            com.waze.c.e.ar r0 = new com.waze.c.e.ar
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f18544a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18546c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            com.waze.c.d.ae r7 = r6.f18569c
            kotlinx.coroutines.b.ch r7 = r7.o()
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.c.e.as r2 = new com.waze.c.e.as
            r4 = 0
            r5 = 0
            r2.<init>(r4, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f18546c = r3
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r7, r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            kotlinx.coroutines.b.bm r6 = r6.o
            com.waze.c.e.ao r7 = com.waze.c.e.ao.f18529a
            r6.c(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.bc.f(com.waze.c.e.bc, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (kotlinx.coroutines.b.ai.i(r7, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.c.e.bc r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.c.e.au
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.c.e.au r0 = (com.waze.c.e.au) r0
            int r1 = r0.f18552c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18552c = r1
            goto L18
        L13:
            com.waze.c.e.au r0 = new com.waze.c.e.au
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f18550a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18552c
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            e.b.c.b(r7)
            goto L67
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            e.b.c.b(r7)
            goto L4d
        L37:
            e.b.c.b(r7)
            kotlinx.coroutines.b.bn r7 = r6.m
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.c.e.as r2 = new com.waze.c.e.as
            r2.<init>(r5, r4, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f18552c = r3
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r7, r2, r0)
            if (r7 == r1) goto L6f
        L4d:
            com.waze.c.d.am r7 = r6.f18571e
            r7.f()
            kotlinx.coroutines.b.bn r7 = r6.m
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.c.e.as r2 = new com.waze.c.e.as
            r3 = 3
            r2.<init>(r5, r3, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f18552c = r4
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r7, r2, r0)
            if (r7 != r1) goto L67
            goto L6f
        L67:
            com.waze.c.d.am r6 = r6.f18571e
            r6.e()
            h.ab r6 = h.ab.f48028a
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.bc.g(com.waze.c.e.bc, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ h.k h(bc bcVar, long j2) {
        Object next;
        com.waze.c.d.ae aeVar = bcVar.f18569c;
        Iterator it = ((com.waze.c.d.t) aeVar.o().d()).f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (com.waze.a.af.m((com.waze.c.d.m) next).a() == j2) {
                break;
            }
        }
        com.waze.c.d.m mVar = (com.waze.c.d.m) next;
        if (mVar == null) {
            return null;
        }
        aeVar.r(mVar);
        return new h.k(mVar, com.waze.a.af.l((com.waze.c.d.t) aeVar.o().d()));
    }

    public static final /* synthetic */ void k(bc bcVar, com.waze.c.d.m mVar) {
        Objects.toString(mVar);
        bcVar.f18575i.a("onAltRouteSelected: ".concat(String.valueOf(mVar)));
        bcVar.f18569c.r(mVar);
        kotlinx.coroutines.aj.z(bcVar.f18576j, null, null, new ah(bcVar, (h.c.e) null, 2), 3);
    }

    public static final /* synthetic */ void l(bc bcVar, com.waze.c.d.l lVar, boolean z, int i2) {
        com.waze.c.d.ae aeVar = bcVar.f18569c;
        com.waze.c.d.t tVar = (com.waze.c.d.t) aeVar.o().d();
        com.waze.c.d.l lVarB = aeVar.b(lVar, z);
        com.waze.c.d.m mVarL = com.waze.a.af.l(tVar);
        com.waze.shared_infra.h.c cVarE = tVar.e();
        com.waze.c.d.ai aiVar = com.waze.c.d.ai.m;
        com.waze.c.d.aj ajVar = com.waze.c.d.aj.f18303b;
        bcVar.f18571e.b(lVarB, mVarL, cVarE != null, aiVar, ajVar, Integer.valueOf(i2));
    }

    public static final /* synthetic */ void m(bc bcVar) {
        bcVar.o.c(ao.f18529a);
        bcVar.f18575i.a("resuming the drive with no navigation changes");
    }

    public static final /* synthetic */ void n(bc bcVar, com.waze.c.d.l lVar) {
        Objects.toString(lVar);
        bcVar.f18575i.a("startNavigation on route, closing alt routes, ".concat(String.valueOf(lVar)));
        bcVar.f18569c.q(lVar);
        bcVar.o.c(ao.f18529a);
    }

    static final h.ab t(bc bcVar) {
        bcVar.f18575i.a("Jobs completed ");
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void u(bc bcVar, eb ebVar) {
        if (ebVar instanceof com.waze.modules.c.by) {
            bcVar.p.b((com.waze.modules.c.by) ebVar);
        }
    }

    private final void v() {
        h.g.b.o.l(this.f18576j.getCoroutineContext());
    }

    public final kotlinx.coroutines.b.ch j() {
        return this.n;
    }

    public final void o(Rect rect) {
        h.g.b.x.f(rect, "rect");
        this.f18578l.q(rect);
    }

    public final void p(boolean z) {
        this.f18571e.a(z ? com.waze.c.d.ai.f18300k : com.waze.c.d.ai.f18301l, com.waze.c.d.aj.f18306e);
    }

    public final void q(String str) {
        Object next;
        h.g.b.x.f(str, "alternativeRouteUuid");
        Iterator it = ((com.waze.c.d.t) this.f18569c.o().d()).f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (h.g.b.x.n(((com.waze.c.d.m) next).c().j(), str)) {
                    break;
                }
            }
        }
        com.waze.c.d.m mVar = (com.waze.c.d.m) next;
        if (mVar != null) {
            this.f18571e.c(mVar);
        }
    }

    public final void r(boolean z) {
        v();
        ba baVar = new ba(this, z, null);
        kotlinx.coroutines.af afVar = this.f18576j;
        kotlinx.coroutines.aj.z(afVar, null, null, baVar, 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ah(this, (h.c.e) null, 3, (byte[]) null), 3);
        this.f18571e.h();
        this.f18578l.r();
        kotlinx.coroutines.aj.z(afVar, null, null, new ah(this, (h.c.e) null, 4, (char[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ah(this, (h.c.e) null, 5, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ah(this, (h.c.e) null, 6, (int[]) null), 3).bY(new an(this, 0));
    }

    public final void s() {
        v();
        this.f18578l.s();
        this.f18575i.a("Stopped AltRoutesStateHolder");
    }
}
