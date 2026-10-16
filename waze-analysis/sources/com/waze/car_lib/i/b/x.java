package com.waze.car_lib.i.b;

import com.waze.map.b.ed;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final ae f20038a;

    /* renamed from: b, reason: collision with root package name */
    private final ed f20039b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.g.g f20040c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.b.n f20041d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.i.c.g f20042e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.nightmode.j f20043f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.i.c.a f20044g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.i.a.ac f20045h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bk.a.b f20046i;

    public x(ae aeVar, ed edVar, com.waze.map.g.g gVar, com.waze.map.b.n nVar, com.waze.car_lib.i.c.g gVar2, com.waze.nightmode.j jVar, com.waze.car_lib.i.c.a aVar, com.waze.car_lib.i.a.ac acVar, com.waze.bk.a.b bVar) {
        h.g.b.x.f(aeVar, "presenterFactory");
        h.g.b.x.f(edVar, "mapViewController");
        h.g.b.x.f(gVar, "mapDelegatorFactory");
        h.g.b.x.f(nVar, "mainMapController");
        h.g.b.x.f(gVar2, "bottomPillWidgetStateHolderFactory");
        h.g.b.x.f(jVar, "nightModeManager");
        h.g.b.x.f(aVar, "bottomPillWidgetBitmapResolver");
        h.g.b.x.f(acVar, "mapLoaderController");
        h.g.b.x.f(bVar, "widgetsRendererFactory");
        this.f20038a = aeVar;
        this.f20039b = edVar;
        this.f20040c = gVar;
        this.f20041d = nVar;
        this.f20042e = gVar2;
        this.f20043f = jVar;
        this.f20044g = aVar;
        this.f20045h = acVar;
        this.f20046i = bVar;
    }

    public final r a(ch chVar) {
        h.g.b.x.f(chVar, "widgetsConfiguration");
        return new ab(this.f20038a, this.f20039b, this.f20040c, this.f20041d, this.f20042e, this.f20043f, this.f20044g, this.f20045h, this.f20046i, chVar);
    }
}
