package com.waze.car_lib;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.car.app.CarContext;
import androidx.lifecycle.Lifecycle;
import com.waze.NativeManager;
import com.waze.map.NativeCanvasRenderer;
import com.waze.map.b.ed;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bd implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19166a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.i.a.p f19167b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.i.a.z f19168c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.i.b.o f19169d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.isolated.n f19170e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.i.b.x f19171f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.map.main.b f19172g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.map.b.n f19173h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.i.b.b f19174i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.car_lib.i.b.ae f19175j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.map.opengl.g f19176k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.z f19177l;
    private final com.waze.map.main.ab m;
    private final com.waze.car_lib.i.d n;
    private final h.f o;
    private final kotlinx.coroutines.b.bn p;
    private final Stack q;
    private final List r;
    private final kotlinx.coroutines.b.bn s;
    private final h.f t;

    public bd(com.waze.shared_infra.i.e eVar, com.waze.car_lib.i.a.ac acVar, com.waze.car_lib.i.a.p pVar, com.waze.car_lib.i.a.z zVar, com.waze.car_lib.i.b.o oVar, com.waze.map.isolated.n nVar, com.waze.car_lib.i.b.x xVar, com.waze.map.main.b bVar, com.waze.map.b.n nVar2, com.waze.car_lib.i.b.b bVar2, com.waze.car_lib.i.b.ae aeVar, com.waze.map.opengl.g gVar, com.waze.z zVar2, com.waze.map.main.ab abVar, com.waze.car_lib.i.d dVar, h.c.j jVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(acVar, "loaderController");
        h.g.b.x.f(pVar, "scaleFactorGetter");
        h.g.b.x.f(zVar, "mapDisplayManager");
        h.g.b.x.f(oVar, "mainCanvas");
        h.g.b.x.f(nVar, "mobileScreenCanvasRenderingService");
        h.g.b.x.f(xVar, "mainWazeMapFactory");
        h.g.b.x.f(bVar, "mainMapConfiguration");
        h.g.b.x.f(nVar2, "mainMapController");
        h.g.b.x.f(bVar2, "genericCanvasPresenterFactory");
        h.g.b.x.f(aeVar, "wazeMapPresenterFactory");
        h.g.b.x.f(gVar, "godotInitializer");
        h.g.b.x.f(zVar2, "appType");
        h.g.b.x.f(abVar, "mapGeometryController");
        h.g.b.x.f(dVar, "viewModel");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f19166a = eVar;
        this.f19167b = pVar;
        this.f19168c = zVar;
        this.f19169d = oVar;
        this.f19170e = nVar;
        this.f19171f = xVar;
        this.f19172g = bVar;
        this.f19173h = nVar2;
        this.f19174i = bVar2;
        this.f19175j = aeVar;
        this.f19176k = gVar;
        this.f19177l = zVar2;
        this.m = abVar;
        this.n = dVar;
        this.o = h.g.a(new com.waze.ads.b(jVar, 16));
        this.p = ck.b(null);
        this.q = new Stack();
        this.r = new ArrayList();
        this.s = ck.b(new com.waze.bk.a.a(true, true, true));
        this.t = h.g.a(new au(this, 0));
        kotlinx.coroutines.aj.z(x(), null, null, new bi(this, (h.c.e) null, 1), 3);
    }

    public static final /* synthetic */ com.waze.car_lib.i.b.r e(bd bdVar) {
        return (com.waze.car_lib.i.b.r) bdVar.t.getValue();
    }

    static final com.waze.car_lib.i.b.r f(bd bdVar) {
        return bdVar.f19171f.a(bdVar.s);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object j(com.waze.car_lib.bd r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof com.waze.car_lib.bb
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.car_lib.bb r0 = (com.waze.car_lib.bb) r0
            int r1 = r0.f19162c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19162c = r1
            goto L18
        L13:
            com.waze.car_lib.bb r0 = new com.waze.car_lib.bb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19160a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f19162c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            com.waze.shared_infra.i.e r5 = r4.f19166a
            java.lang.String r2 = "will awaitAllMobileCanvasesDestroyed()"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r5.a(r2)
            com.waze.map.isolated.n r5 = r4.f19170e
            com.waze.map.isolated.ag r5 = r5.b()
            r0.f19162c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            com.waze.shared_infra.i.e r4 = r4.f19166a
            java.lang.String r5 = "done awaitAllMobileCanvasesDestroyed()"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.a(r5)
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.bd.j(com.waze.car_lib.bd, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object k(com.waze.car_lib.bd r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.car_lib.bc
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.bc r0 = (com.waze.car_lib.bc) r0
            int r1 = r0.f19165c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19165c = r1
            goto L18
        L13:
            com.waze.car_lib.bc r0 = new com.waze.car_lib.bc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f19163a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f19165c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            com.waze.shared_infra.i.e r6 = r5.f19166a
            java.lang.String r2 = "will awaitNativeManagerReady()"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.a(r2)
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.bo.j()
            com.google.android.material.internal.o r2 = new com.google.android.material.internal.o
            r4 = 10
            r2.<init>(r6, r4)
            com.waze.NativeManager.runOnNativeManagerReady(r2)
            r0.f19165c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            com.waze.shared_infra.i.e r5 = r5.f19166a
            java.lang.String r6 = "done awaitNativeManagerReady()"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.a(r6)
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.bd.k(com.waze.car_lib.bd, h.c.e):java.lang.Object");
    }

    static final h.ab m(bd bdVar, com.waze.car_lib.i.b.r rVar) {
        bdVar.y(rVar);
        return h.ab.f48028a;
    }

    static final h.ab n(bd bdVar, com.waze.car_lib.i.b.r rVar) {
        Stack stack = bdVar.q;
        if (stack.size() == 1) {
            bdVar.f19166a.b("Invalid operation, tried to remove last canvas state");
        } else if (h.g.b.x.n(((com.waze.car_lib.c.f) stack.pop()).d(), rVar)) {
            bdVar.r.add(rVar);
            bdVar.p.e(stack.peek());
        } else {
            bdVar.f19166a.g("Invalid operation, tried to remove presenter that is not at top of the stack");
        }
        return h.ab.f48028a;
    }

    static final h.ab o(h.g.b.aq aqVar, bd bdVar, ed edVar) {
        aqVar.f48105a = bdVar.f19173h.p(edVar);
        return h.ab.f48028a;
    }

    static final h.ab p(bd bdVar, com.waze.bk.a.a aVar) {
        bdVar.s.e(aVar);
        return h.ab.f48028a;
    }

    static final h.ab q(bd bdVar, com.waze.bk.a.a aVar) {
        bdVar.s.e(aVar);
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.af x() {
        return (kotlinx.coroutines.af) this.o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(com.waze.car_lib.i.b.r rVar) {
        com.waze.car_lib.c.f fVar = new com.waze.car_lib.c.f(rVar);
        this.q.push(fVar);
        this.p.e(fVar);
    }

    @Override // com.waze.car_lib.aq
    public final void a(final com.waze.car_lib.i.a.a aVar, final kotlinx.coroutines.af afVar, CarContext carContext) {
        h.g.b.x.f(aVar, "presentableController");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(carContext, "context");
        this.f19167b.a();
        final Context contextB = com.waze.beacons.n.b(this.f19166a, aVar, carContext);
        final DisplayMetrics displayMetrics = contextB.getResources().getDisplayMetrics();
        h.g.b.x.e(displayMetrics, "getDisplayMetrics(...)");
        final h.g.a.a aVar2 = new h.g.a.a() { // from class: com.waze.car_lib.as
            @Override // h.g.a.a
            public final Object invoke() {
                com.waze.car_lib.i.a.a aVar3 = aVar;
                bd bdVar = this;
                kotlinx.coroutines.af afVar2 = afVar;
                kotlinx.coroutines.aj.z(afVar2, null, null, new ay(bdVar, afVar2, contextB, aVar3, null), 3);
                kotlinx.coroutines.aj.z(afVar2, null, null, new ba(aVar3, bdVar, null), 3);
                return h.ab.f48028a;
            }
        };
        h.g.b.x.f(displayMetrics, "displayMetrics");
        h.g.b.x.f(aVar2, "callback");
        NativeCanvasRenderer.x(displayMetrics);
        final com.waze.car_lib.i.a.z zVar = this.f19168c;
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.car_lib.i.a.y
            @Override // java.lang.Runnable
            public final void run() {
                z.a(zVar, displayMetrics, aVar2);
            }
        });
    }

    public final void u(com.waze.bk.a.a aVar, Lifecycle lifecycle) {
        h.g.b.x.f(aVar, "screenWidgets");
        h.g.b.x.f(lifecycle, "lifecycle");
        com.waze.bk.a.a aVar2 = (com.waze.bk.a.a) this.s.d();
        com.waze.ad.a.j.q(lifecycle, Lifecycle.Event.ON_CREATE, new ar(this, aVar, 2));
        com.waze.ad.a.j.q(lifecycle, Lifecycle.Event.ON_DESTROY, new ar(this, aVar2, 3));
    }

    public final void v(final ed edVar, Lifecycle lifecycle, String str, com.waze.bk.a.a aVar, aw awVar) {
        com.waze.car_lib.i.b.c cVarA;
        h.g.b.x.f(edVar, "mapController");
        h.g.b.x.f(lifecycle, "lifecycle");
        h.g.b.x.f(str, "description");
        h.g.b.x.f(aVar, "widgetsConfiguration");
        h.g.b.x.f(awVar, "legacyMainMapPresenter");
        if (this.f19172g.a()) {
            final h.g.b.aq aqVar = new h.g.b.aq();
            com.waze.ad.a.j.q(lifecycle, Lifecycle.Event.ON_CREATE, new h.g.a.a() { // from class: com.waze.car_lib.at
                @Override // h.g.a.a
                public final Object invoke() {
                    return bd.o(aqVar, this, edVar);
                }
            });
            com.waze.ad.a.j.q(lifecycle, Lifecycle.Event.ON_DESTROY, new com.waze.ads.b(aqVar, 15));
            u(aVar, lifecycle);
            return;
        }
        this.f19166a.a("Creating a new presenter: ".concat(String.valueOf(awVar.name())));
        int iOrdinal = awVar.ordinal();
        int i2 = 1;
        if (iOrdinal == 0) {
            cVarA = this.f19174i.a(str, edVar);
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            cVarA = this.f19175j.a(edVar);
        }
        com.waze.ad.a.j.q(lifecycle, Lifecycle.Event.ON_CREATE, new ar(this, cVarA, i2));
        com.waze.ad.a.j.q(lifecycle, Lifecycle.Event.ON_DESTROY, new ar(this, cVarA, 0));
    }
}
