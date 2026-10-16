package com.waze.map;

import com.waze.R;
import com.waze.lm;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ef implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final eh f28825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f28826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f28827c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ NativeCanvasRenderer f28828d;

    ef(NativeCanvasRenderer nativeCanvasRenderer, int i2, int i3) {
        this.f28826b = i2;
        this.f28827c = i3;
        Objects.requireNonNull(nativeCanvasRenderer);
        this.f28828d = nativeCanvasRenderer;
        this.f28825a = nativeCanvasRenderer.t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeCanvasRenderer nativeCanvasRenderer = this.f28828d;
        eh ehVar = this.f28825a;
        if (ehVar != nativeCanvasRenderer.t || (nativeCanvasRenderer.t != null && nativeCanvasRenderer.t.b())) {
            nativeCanvasRenderer.f27908g.a("surfaceResizedEvent dropped - out of events frame or already destroyed. Posted: " + String.valueOf(ehVar) + " Current: " + String.valueOf(nativeCanvasRenderer.t));
            return;
        }
        com.waze.sharedui.a.e eVarE = lm.d().e();
        int dimension = 0;
        if ((eVarE instanceof com.waze.ifs.ui.a) && ((com.waze.ifs.ui.a) eVarE).aC()) {
            dimension = (int) eVarE.getResources().getDimension(R.dimen.typing_while_driving_bar_height);
        }
        nativeCanvasRenderer.ResizeSurfaceNTV(nativeCanvasRenderer.q, this.f28826b, this.f28827c + dimension);
        nativeCanvasRenderer.f27908g.a("surfaceResizedEvent execution finished");
    }
}
