package com.waze.car_lib.i.b;

import android.content.Context;
import com.waze.map.canvas.MainCanvasDelegatorImpl;
import com.waze.map.opengl.WazeRenderer;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.n f20012a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.i.c.g f20013b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.nightmode.j f20014c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.i.c.a f20015d;

    /* renamed from: e, reason: collision with root package name */
    private final u f20016e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.i.a.ac f20017f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.map.canvas.u f20018g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.map.canvas.v f20019h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.map.opengl.p f20020i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f20021j;

    /* renamed from: k, reason: collision with root package name */
    private final p f20022k;

    public o(com.waze.map.b.n nVar, com.waze.car_lib.i.c.g gVar, com.waze.nightmode.j jVar, com.waze.car_lib.i.c.a aVar, u uVar, com.waze.car_lib.i.a.ac acVar, com.waze.map.canvas.u uVar2, com.waze.map.canvas.v vVar, com.waze.map.opengl.p pVar) {
        h.g.b.x.f(nVar, "mapController");
        h.g.b.x.f(gVar, "bottomPillWidgetStateHolderFactory");
        h.g.b.x.f(jVar, "nightModeManager");
        h.g.b.x.f(aVar, "bottomPillWidgetBitmapResolver");
        h.g.b.x.f(uVar, "speedometerWidgetStateHolder");
        h.g.b.x.f(acVar, "loaderController");
        h.g.b.x.f(uVar2, "canvasBuilder");
        h.g.b.x.f(vVar, "swapFactoryBuilder");
        h.g.b.x.f(pVar, "externalDependencies");
        this.f20012a = nVar;
        this.f20013b = gVar;
        this.f20014c = jVar;
        this.f20015d = aVar;
        this.f20016e = uVar;
        this.f20017f = acVar;
        this.f20018g = uVar2;
        this.f20019h = vVar;
        this.f20020i = pVar;
        this.f20021j = ck.b(null);
        com.waze.map.opengl.ae aeVar = com.waze.map.opengl.ae.f29536b;
        String strA = com.waze.map.canvas.q.f28654a.a();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("renderer:mainCanvas");
        h.g.b.x.e(eVarD, "create(...)");
        this.f20022k = new p(new WazeRenderer(aeVar, "mainCanvas", strA, pVar, eVarD));
    }

    static final h.ab f(com.waze.car_lib.i.a.a aVar, o oVar) {
        aVar.f(oVar.f20022k);
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.i.b.r
    public final void a() {
        this.f20021j.e(null);
        this.f20022k.a().f();
    }

    @Override // com.waze.car_lib.i.b.r
    public final /* bridge */ /* synthetic */ void c(Context context, kotlinx.coroutines.af afVar, com.waze.car_lib.i.a.a aVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(aVar, "presentableController");
        int i2 = context.getResources().getConfiguration().densityDpi;
        WeakReference weakReference = new WeakReference(context);
        com.waze.map.g gVar = new com.waze.map.g();
        ch chVarE = aVar.e(this.f20022k);
        com.waze.map.g gVar2 = gVar;
        MainCanvasDelegatorImpl mainCanvasDelegatorImplA = this.f20018g.a(afVar, aVar.d(), chVarE, new com.waze.ui.p.h(aVar.d(), 1), this.f20019h.a(new n(weakReference, aVar), gVar2), gVar2);
        this.f20012a.j(mainCanvasDelegatorImplA);
        this.f20021j.e(mainCanvasDelegatorImplA);
        com.waze.ad.c.b.a(afVar, new d(aVar, this, 0));
        com.waze.car_lib.i.c.h hVarA = this.f20013b.a();
        aj.z(afVar, null, null, new z(hVarA, mainCanvasDelegatorImplA, (h.c.e) null, 1), 3);
        aj.z(afVar, null, null, new e(hVarA, this, context, mainCanvasDelegatorImplA, null), 3);
        aj.z(afVar, null, null, new l(this.f20016e.a(), chVarE, mainCanvasDelegatorImplA, (h.c.e) null, 1), 3);
        aj.z(afVar, null, null, new l(this, chVarE, mainCanvasDelegatorImplA, (h.c.e) null, 0), 3);
    }
}
