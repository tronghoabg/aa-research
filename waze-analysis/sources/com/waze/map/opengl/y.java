package com.waze.map.opengl;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f29578a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f29579b;

    y(z zVar, aa aaVar) {
        this.f29578a = zVar;
        this.f29579b = aaVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        h.g.b.x.f(surfaceHolder, "holder");
        int i5 = this.f29579b.getResources().getDisplayMetrics().densityDpi;
        z zVar = this.f29578a;
        zVar.f(Integer.valueOf(i3));
        zVar.d(Integer.valueOf(i4));
        zVar.c(Integer.valueOf(i5));
        Iterator it = zVar.a().iterator();
        while (it.hasNext()) {
            ((com.waze.bk.j) it.next()).a(i3, i4, i5);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        h.g.b.x.f(surfaceHolder, "holder");
        z zVar = this.f29578a;
        zVar.e(surfaceHolder);
        int iWidth = surfaceHolder.getSurfaceFrame().width();
        int iHeight = surfaceHolder.getSurfaceFrame().height();
        int i2 = this.f29579b.getResources().getDisplayMetrics().densityDpi;
        zVar.f(Integer.valueOf(iWidth));
        zVar.d(Integer.valueOf(iHeight));
        zVar.c(Integer.valueOf(i2));
        for (com.waze.bk.j jVar : zVar.a()) {
            Surface surface = surfaceHolder.getSurface();
            h.g.b.x.e(surface, "getSurface(...)");
            jVar.b(surface, iWidth, iHeight, i2);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h.g.b.x.f(surfaceHolder, "holder");
        z zVar = this.f29578a;
        zVar.e(null);
        zVar.f(null);
        zVar.d(null);
        Iterator it = zVar.a().iterator();
        while (it.hasNext()) {
            ((com.waze.bk.j) it.next()).c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        h.g.b.x.f(surfaceHolder, "holder");
        Iterator it = this.f29578a.a().iterator();
        while (it.hasNext()) {
            ((com.waze.bk.j) it.next()).d();
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        h.g.b.x.f(surfaceHolder, "holder");
        h.g.b.x.f(runnable, "drawingFinished");
        z zVar = this.f29578a;
        if (zVar.a().isEmpty()) {
            zVar.b().add(runnable);
            return;
        }
        Iterator it = zVar.a().iterator();
        while (it.hasNext()) {
            ((com.waze.bk.j) it.next()).e(runnable);
        }
    }
}
