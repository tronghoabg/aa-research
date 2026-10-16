package com.waze.map.isolated;

import android.content.Context;
import com.waze.map.ap;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeMapWidgetNativeRenderer {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.v f29199a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f29200b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f29201c;

    /* renamed from: d, reason: collision with root package name */
    private final ap f29202d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29203e;

    /* renamed from: f, reason: collision with root package name */
    private final h.c.j f29204f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f29205g;

    /* renamed from: h, reason: collision with root package name */
    private br f29206h;

    public WazeMapWidgetNativeRenderer(com.waze.map.v vVar, Context context, kotlinx.coroutines.b.k kVar, ap apVar, com.waze.shared_infra.i.e eVar, h.c.j jVar, h.c.j jVar2) {
        h.g.b.x.f(vVar, "renderThread");
        h.g.b.x.f(context, "androidContext");
        h.g.b.x.f(kVar, "mapContextFlow");
        h.g.b.x.f(apVar, "bitmapResolver");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(jVar2, "bitmapCoroutineContext");
        this.f29199a = vVar;
        this.f29200b = context;
        this.f29201c = kVar;
        this.f29202d = apVar;
        this.f29203e = eVar;
        this.f29204f = jVar2;
        this.f29205g = aj.e(jVar);
        this.f29206h = h.g.b.o.i();
    }

    public final void g(com.waze.bk.a.c cVar) {
        h.g.b.x.f(cVar, "widgets");
        this.f29206h.s(null);
        this.f29206h = aj.z(this.f29205g, null, null, new aa(this, cVar, null), 3);
    }

    public final native void nativeRender(String str, byte[] bArr);
}
