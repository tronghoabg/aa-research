package com.waze.shared_infra.coordinators;

import com.waze.shared_infra.coordinators.f;
import h.g.b.ar;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class o<CustomEndResult, Event, Presentable extends f> implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final p f37825a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37826b;

    /* renamed from: c, reason: collision with root package name */
    public g f37827c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f37828d;

    /* renamed from: e, reason: collision with root package name */
    private final CompletableDeferred f37829e;

    /* renamed from: f, reason: collision with root package name */
    private final List f37830f;

    /* renamed from: g, reason: collision with root package name */
    private final List f37831g;

    /* renamed from: h, reason: collision with root package name */
    private final b f37832h;

    /* renamed from: i, reason: collision with root package name */
    private br f37833i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37834j;

    public /* synthetic */ o(p pVar, int i2) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        pVar = (i2 & 1) != 0 ? t.a() : pVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeCoordinator");
        x.e(eVarD, "create(...)");
        x.f(pVar, "coordinatorConfig");
        x.f(eVarD, "logger");
        this.f37825a = pVar;
        this.f37826b = eVarD;
        o<CustomEndResult, Event, Presentable> oVar = this;
        boolean z = oVar instanceof org.a.d.a.b;
        if (z) {
            bVarC = ((org.a.d.a.b) oVar).l();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.i.b.class);
        } else {
            bVarC = oVar.getKoin().a().c();
            int i4 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.i.b.class);
        }
        this.f37828d = (com.waze.shared_infra.i.b) bVarC.a(mVar, null, null);
        this.f37829e = bo.j();
        this.f37830f = new ArrayList();
        this.f37831g = new ArrayList();
        new ArrayList();
        if (z) {
            bVarC2 = ((org.a.d.a.b) oVar).l();
            mVar2 = new h.g.b.m(b.class);
        } else {
            bVarC2 = oVar.getKoin().a().c();
            mVar2 = new h.g.b.m(b.class);
        }
        this.f37832h = (b) bVarC2.a(mVar2, null, null);
    }

    public static final /* synthetic */ void C(o oVar, h hVar) {
        if (!oVar.f37834j && oVar.f37830f.isEmpty() && oVar.f37831g.isEmpty()) {
            oVar.c(new e(hVar));
        }
    }

    private final void a(h.g.a.l lVar) {
        lVar.invoke(this.f37831g);
        b().I(G());
    }

    private final void c(com.waze.settings.tree.a.d dVar) {
        bu(dVar);
        B();
        List list = this.f37830f;
        Iterator it = h.a.i.ao(list).iterator();
        while (it.hasNext()) {
            ((com.waze.sharedui.profile.b) it.next()).p();
        }
        list.clear();
        aj.h(A(), null);
        this.f37829e.a(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object w(com.waze.shared_infra.coordinators.o r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.shared_infra.coordinators.k
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.shared_infra.coordinators.k r0 = (com.waze.shared_infra.coordinators.k) r0
            int r1 = r0.f37816d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37816d = r1
            goto L18
        L13:
            com.waze.shared_infra.coordinators.k r0 = new com.waze.shared_infra.coordinators.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f37814b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f37816d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f37813a
            com.waze.shared_infra.coordinators.o r6 = (com.waze.shared_infra.coordinators.o) r6
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L68
        L2b:
            r7 = move-exception
            goto L91
        L2d:
            r7 = move-exception
            goto L6c
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            e.b.c.b(r7)
            kotlinx.coroutines.af r7 = r6.A()
            com.waze.shared_infra.coordinators.m r2 = new com.waze.shared_infra.coordinators.m
            r4 = 0
            r5 = 0
            r2.<init>(r6, r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r4 = 3
            kotlinx.coroutines.br r7 = kotlinx.coroutines.aj.z(r7, r5, r5, r2, r4)
            r6.f37833i = r7
            kotlinx.coroutines.af r7 = r6.A()
            com.waze.shared_infra.coordinators.m r2 = new com.waze.shared_infra.coordinators.m
            r2.<init>(r6, r5, r3, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.aj.z(r7, r5, r5, r2, r4)
            kotlinx.coroutines.CompletableDeferred r7 = r6.f37829e     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f37813a = r6     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.f37816d = r3     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.Object r7 = r7.c(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r7 == r1) goto L6b
        L68:
            com.waze.settings.tree.a.d r7 = (com.waze.settings.tree.a.d) r7     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L7e
        L6b:
            return r1
        L6c:
            com.waze.shared_infra.i.e r0 = r6.f37826b     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "Could not wait for coordinator's result"
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> L2b
            r0.c(r1, r7)     // Catch: java.lang.Throwable -> L2b
            com.waze.shared_infra.coordinators.e r7 = new com.waze.shared_infra.coordinators.e     // Catch: java.lang.Throwable -> L2b
            com.waze.shared_infra.coordinators.h r0 = com.waze.shared_infra.coordinators.h.f37806a     // Catch: java.lang.Throwable -> L2b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            com.waze.settings.tree.a.d r7 = (com.waze.settings.tree.a.d) r7     // Catch: java.lang.Throwable -> L2b
        L7e:
            kotlinx.coroutines.br r0 = r6.f37833i
            if (r0 == 0) goto L85
            h.g.b.o.o(r0)
        L85:
            com.waze.shared_infra.coordinators.s r6 = r6.b()
            kotlinx.coroutines.af r6 = r6.G()
            kotlinx.coroutines.aj.l(r6)
            return r7
        L91:
            kotlinx.coroutines.br r0 = r6.f37833i
            if (r0 == 0) goto L98
            h.g.b.o.o(r0)
        L98:
            com.waze.shared_infra.coordinators.s r6 = r6.b()
            kotlinx.coroutines.af r6 = r6.G()
            kotlinx.coroutines.aj.l(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.coordinators.o.w(com.waze.shared_infra.coordinators.o, h.c.e):java.lang.Object");
    }

    public final af A() {
        return b().G();
    }

    protected final void B() {
        Iterator it = h.a.i.ao(this.f37831g).iterator();
        while (it.hasNext()) {
            ((o) it.next()).c(new e(h.f37806a));
        }
        a(new com.waze.perf.p(10));
    }

    public final void D(Object obj) {
        Objects.toString(obj);
        this.f37826b.a("end with ".concat(String.valueOf(obj)));
        c(new d(obj));
    }

    public final void E(g gVar) {
        x.f(gVar, "<set-?>");
        this.f37827c = gVar;
    }

    public final boolean F() {
        return !G() || this.f37825a.a();
    }

    public final boolean G() {
        return !this.f37831g.isEmpty();
    }

    protected final void H() {
        this.f37834j = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.waze.sharedui.profile.b J(f fVar, boolean z) {
        x.f(fVar, "presentable");
        Objects.toString(fVar);
        this.f37826b.a("present: ".concat(String.valueOf(fVar)));
        com.waze.sharedui.profile.b bVar = new com.waze.sharedui.profile.b(t(), fVar.getUuid());
        this.f37830f.add(bVar);
        fVar.getAndroidLifecycle().addObserver(new i(this, bVar));
        t().b(fVar, z, b().F());
        return bVar;
    }

    public abstract s b();

    public void bu(com.waze.settings.tree.a.d dVar) {
        x.f(dVar, "endEvent");
    }

    protected abstract void g(Object obj);

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    protected void p() {
    }

    public final g t() {
        g gVar = this.f37827c;
        if (gVar != null) {
            return gVar;
        }
        x.j("presentableManager");
        return null;
    }

    public final Object v(h.c.e eVar) {
        return w(this, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(com.waze.shared_infra.coordinators.o r6, h.g.a.l r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.waze.shared_infra.coordinators.n
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.shared_infra.coordinators.n r0 = (com.waze.shared_infra.coordinators.n) r0
            int r1 = r0.f37824d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37824d = r1
            goto L18
        L13:
            com.waze.shared_infra.coordinators.n r0 = new com.waze.shared_infra.coordinators.n
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f37822b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f37824d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f37821a
            com.waze.shared_infra.coordinators.o r6 = (com.waze.shared_infra.coordinators.o) r6
            e.b.c.b(r8)
            goto L8f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.b.c.b(r8)
            com.waze.shared_infra.i.e r8 = r5.f37826b
            java.util.Objects.toString(r6)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "startSubCoordinator: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            boolean r2 = r5.F()
            if (r2 != 0) goto L78
            java.util.List r6 = r5.f37831g
            java.util.Objects.toString(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "startSubCoordinator: cannot start another sub-coordinator. Current coordinators: "
            java.lang.String r7 = r0.concat(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8.g(r7)
            com.waze.shared_infra.i.b r5 = r5.f37828d
            com.waze.shared_infra.coordinators.AapCoordinatorNonFatalException$StartSubCoordinatorBlocked r7 = new com.waze.shared_infra.coordinators.AapCoordinatorNonFatalException$StartSubCoordinatorBlocked
            r7.<init>(r6)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.waze.shared_infra.h.b.f(r5, r7)
            com.waze.shared_infra.coordinators.e r5 = new com.waze.shared_infra.coordinators.e
            com.waze.shared_infra.coordinators.h r6 = com.waze.shared_infra.coordinators.h.f37808c
            r5.<init>(r6)
            return r5
        L78:
            r7.invoke(r6)
            com.waze.r.d r7 = new com.waze.r.d
            r8 = 6
            r7.<init>(r6, r8)
            r5.a(r7)
            r0.f37821a = r6
            r0.f37824d = r3
            java.lang.Object r8 = w(r6, r0)
            if (r8 != r1) goto L8f
            return r1
        L8f:
            com.waze.settings.tree.a.d r8 = (com.waze.settings.tree.a.d) r8
            com.waze.r.d r7 = new com.waze.r.d
            r0 = 7
            r7.<init>(r6, r0)
            r5.a(r7)
            r5.p()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.coordinators.o.x(com.waze.shared_infra.coordinators.o, h.g.a.l, h.c.e):java.lang.Object");
    }

    public final List z() {
        return h.a.i.ao(this.f37831g);
    }

    public o() {
        this(null, 3);
    }
}
