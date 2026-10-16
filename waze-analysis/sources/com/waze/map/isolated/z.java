package com.waze.map.isolated;

import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29280a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f29281b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ WazeMapWidgetNativeRenderer f29282c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.bk.a.c f29283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer, com.waze.bk.a.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f29282c = wazeMapWidgetNativeRenderer;
        this.f29283d = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(this.f29282c, this.f29283d, eVar);
        zVar.f29281b = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((com.waze.map.ac) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f29280a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.map.ac acVar = (com.waze.map.ac) this.f29281b;
            WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer = this.f29282c;
            this.f29280a = 1;
            if (aj.v(wazeMapWidgetNativeRenderer.f29199a.b(), new y(wazeMapWidgetNativeRenderer, acVar, this.f29283d, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
