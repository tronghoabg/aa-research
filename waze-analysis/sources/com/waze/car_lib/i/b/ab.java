package com.waze.car_lib.i.b;

import android.content.Context;
import com.waze.gw.Gateway;
import com.waze.map.b.ed;
import com.waze.map.dr;
import com.waze.map.el;
import com.waze.map.isolated.WazeMapWidgetNativeRenderer;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ae f19944a;

    /* renamed from: b, reason: collision with root package name */
    private final ed f19945b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.g.g f19946c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.b.n f19947d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.i.c.g f19948e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.nightmode.j f19949f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.i.c.a f19950g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.i.a.ac f19951h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bk.a.b f19952i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f19953j;

    public ab(ae aeVar, ed edVar, com.waze.map.g.g gVar, com.waze.map.b.n nVar, com.waze.car_lib.i.c.g gVar2, com.waze.nightmode.j jVar, com.waze.car_lib.i.c.a aVar, com.waze.car_lib.i.a.ac acVar, com.waze.bk.a.b bVar, ch chVar) {
        h.g.b.x.f(aeVar, "presenterFactory");
        h.g.b.x.f(edVar, "mapViewController");
        h.g.b.x.f(gVar, "mapDelegatorFactory");
        h.g.b.x.f(nVar, "mainMapController");
        h.g.b.x.f(gVar2, "bottomPillWidgetStateHolderFactory");
        h.g.b.x.f(jVar, "nightModeManager");
        h.g.b.x.f(aVar, "bottomPillWidgetBitmapResolver");
        h.g.b.x.f(acVar, "mapLoaderController");
        h.g.b.x.f(bVar, "widgetsRendererFactory");
        h.g.b.x.f(chVar, "widgetsConfiguration");
        this.f19944a = aeVar;
        this.f19945b = edVar;
        this.f19946c = gVar;
        this.f19947d = nVar;
        this.f19948e = gVar2;
        this.f19949f = jVar;
        this.f19950g = aVar;
        this.f19951h = acVar;
        this.f19952i = bVar;
        this.f19953j = chVar;
    }

    @Override // com.waze.car_lib.i.b.r
    public final void a() {
    }

    @Override // com.waze.car_lib.i.b.r
    public final /* bridge */ /* synthetic */ void c(Context context, kotlinx.coroutines.af afVar, com.waze.car_lib.i.a.a aVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(aVar, "presentableController");
        com.waze.map.g.s sVarA = this.f19946c.a(afVar, new j(aVar.d(), 4), this.f19945b);
        com.waze.map.b.n nVar = this.f19947d;
        nVar.j(sVarA);
        WazeMapWidgetNativeRenderer wazeMapWidgetNativeRendererA = this.f19952i.a(context, ai.D(new j(this.f19944a.b(sVarA.m(), dr.f28765b).c(context, afVar, aVar), 3)));
        Gateway.cacheAaStreetRenderer(context, wazeMapWidgetNativeRendererA);
        kotlinx.coroutines.b.k kVarB = el.b(nVar.g());
        com.waze.car_lib.i.c.h hVarA = this.f19948e.a();
        aj.z(afVar, null, null, new z(hVarA, kVarB, (h.c.e) null, 0), 3);
        aj.z(afVar, null, null, new l(this, ai.q(hVarA.b(), this.f19949f.a(), new aa(this, context, (h.c.e) null, 0)), wazeMapWidgetNativeRendererA, (h.c.e) null, 2), 3);
    }
}
