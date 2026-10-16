package com.waze.map.isolated;

import android.graphics.Bitmap;
import com.waze.map.ax;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeMapWidgetNativeRenderer f29267a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap f29268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer, Bitmap bitmap, h.c.e eVar) {
        super(2, eVar);
        this.f29267a = wazeMapWidgetNativeRenderer;
        this.f29268b = bitmap;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new x(this.f29267a, this.f29268b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer = this.f29267a;
        return wazeMapWidgetNativeRenderer.f29202d.a(wazeMapWidgetNativeRenderer.f29200b, new ax(new com.waze.car_lib.b.n(this.f29268b, 7)));
    }
}
