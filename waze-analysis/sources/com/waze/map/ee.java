package com.waze.map;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ee implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final eh f28821a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f28822b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f28823c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ NativeCanvasRenderer f28824d;

    ee(NativeCanvasRenderer nativeCanvasRenderer, int i2, int i3) {
        this.f28822b = i2;
        this.f28823c = i3;
        Objects.requireNonNull(nativeCanvasRenderer);
        this.f28824d = nativeCanvasRenderer;
        this.f28821a = nativeCanvasRenderer.t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCanvasRenderer nativeCanvasRenderer = this.f28824d;
        eh ehVar = this.f28821a;
        if (ehVar != nativeCanvasRenderer.t || (nativeCanvasRenderer.t != null && nativeCanvasRenderer.t.b())) {
            nativeCanvasRenderer.f27908g.a("surfaceCreatedEvent dropped - out of events frame or already destroyed. Posted: " + String.valueOf(ehVar) + " Current: " + String.valueOf(nativeCanvasRenderer.t));
            return;
        }
        String strCreateSurfaceNTV = nativeCanvasRenderer.CreateSurfaceNTV(nativeCanvasRenderer.m, nativeCanvasRenderer.q, this.f28822b, this.f28823c);
        nativeCanvasRenderer.q = strCreateSurfaceNTV;
        nativeCanvasRenderer.D();
        nativeCanvasRenderer.n.f(strCreateSurfaceNTV);
        nativeCanvasRenderer.f27908g.a("surfaceCreatedEvent execution finished, new canvasId: ".concat(String.valueOf(strCreateSurfaceNTV)));
    }
}
