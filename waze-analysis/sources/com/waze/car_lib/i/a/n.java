package com.waze.car_lib.i.a;

import android.util.Size;
import android.view.Surface;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements com.waze.bk.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f19892a;

    n(o oVar) {
        this.f19892a = oVar;
    }

    @Override // com.waze.bk.j
    public final void a(int i2, int i3, int i4) {
        Size size = new Size(i2, i3);
        o oVar = this.f19892a;
        oVar.f19894b = size;
        oVar.f19895c = oVar.j();
    }

    @Override // com.waze.bk.j
    public final void b(Surface surface, int i2, int i3, int i4) {
        h.g.b.x.f(surface, "surface");
        Size size = new Size(i2, i3);
        o oVar = this.f19892a;
        oVar.f19894b = size;
        oVar.f19895c = oVar.j();
    }

    @Override // com.waze.bk.j
    public final void c() {
        o oVar = this.f19892a;
        oVar.f19894b = null;
        oVar.f19895c = null;
    }

    @Override // com.waze.bk.j
    public final /* synthetic */ void d() {
    }

    @Override // com.waze.bk.j
    public final /* synthetic */ void e(Runnable runnable) {
        h.g.b.x.f(runnable, "drawingFinished");
    }
}
