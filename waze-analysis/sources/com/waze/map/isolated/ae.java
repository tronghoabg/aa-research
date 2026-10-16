package com.waze.map.isolated;

import android.view.MotionEvent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ae implements ab {

    /* renamed from: a, reason: collision with root package name */
    private final CompletableDeferred f29215a = bo.j();

    @Override // com.waze.map.isolated.ab
    public final void A() {
    }

    public final CompletableDeferred a() {
        return this.f29215a;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    @Override // com.waze.map.isolated.ab
    public final void q() {
    }

    @Override // com.waze.map.isolated.ab
    public final void r(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "aEvent");
    }

    @Override // com.waze.map.isolated.ab
    public final void s() {
    }

    @Override // com.waze.map.isolated.ab
    public final void t() {
    }

    @Override // com.waze.map.isolated.ab
    public final void u() {
        this.f29215a.a(h.ab.f48028a);
    }

    @Override // com.waze.map.isolated.ab
    public final void v() {
    }
}
