package com.waze.map.isolated;

import android.content.Context;
import com.waze.map.ap;
import kotlinx.coroutines.av;
import kotlinx.coroutines.cj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w implements com.waze.bk.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.v f29264a;

    /* renamed from: b, reason: collision with root package name */
    private final ap f29265b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29266c;

    public w(com.waze.map.v vVar, ap apVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(vVar, "renderThread");
        h.g.b.x.f(apVar, "bitmapResolver");
        h.g.b.x.f(eVar, "logger");
        this.f29264a = vVar;
        this.f29265b = apVar;
        this.f29266c = eVar;
    }

    @Override // com.waze.bk.a.b
    public final /* bridge */ /* synthetic */ WazeMapWidgetNativeRenderer a(Context context, kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(context, "androidContext");
        h.g.b.x.f(kVar, "renderContextFlow");
        int i2 = av.f51370a;
        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
        kotlinx.coroutines.ab abVarA = av.a();
        return new WazeMapWidgetNativeRenderer(this.f29264a, context, kVar, this.f29265b, this.f29266c, cjVar, abVarA);
    }
}
