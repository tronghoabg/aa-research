package com.waze.map.isolated;

import android.view.MotionEvent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af implements ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f29216a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29217b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f29218c;

    /* renamed from: d, reason: collision with root package name */
    private final long f29219d;

    public af(ah ahVar, String str, ab abVar) {
        h.g.b.x.f(str, "tag");
        h.g.b.x.f(abVar, "delegate");
        this.f29216a = ahVar;
        this.f29217b = str;
        this.f29218c = abVar;
        this.f29219d = ah.f29221b.incrementAndGet();
    }

    @Override // com.waze.map.isolated.ab
    public final void A() {
        this.f29218c.A();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        this.f29218c.onDrawFrame(gl10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        this.f29218c.onSurfaceChanged(gl10, i2, i3);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f29218c.onSurfaceCreated(gl10, eGLConfig);
    }

    @Override // com.waze.map.isolated.ab
    public final void q() {
        this.f29218c.q();
    }

    @Override // com.waze.map.isolated.ab
    public final void r(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "aEvent");
        this.f29218c.r(motionEvent);
    }

    @Override // com.waze.map.isolated.ab
    public final void s() {
        this.f29218c.s();
    }

    @Override // com.waze.map.isolated.ab
    public final void t() {
        this.f29218c.t();
    }

    public final String toString() {
        return "RendererWrapper(id=" + this.f29219d + ", tag=" + this.f29217b + ")";
    }

    @Override // com.waze.map.isolated.ab
    public final void u() {
        ah ahVar = this.f29216a;
        ahVar.f29223d.a("onViewSurfaceCreated: this=" + this + ", activeRendererId=" + ahVar.f29225f + ", pending=" + ahVar.f29224e);
        ahVar.i(this.f29219d, this.f29218c);
    }

    @Override // com.waze.map.isolated.ab
    public final void v() {
        ah ahVar = this.f29216a;
        ahVar.f29223d.a("onViewSurfaceDestroyed: this=" + this + ", activeRendererId=" + ahVar.f29225f + ", pending=" + ahVar.f29224e);
        ah.h(ahVar, this.f29219d, this.f29218c);
    }
}
