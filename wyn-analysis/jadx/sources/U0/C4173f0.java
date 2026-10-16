package u0;

import ac.C1346a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import e0.C2450b;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: u0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4173f0 implements N {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f46228a = AbstractC4171e0.e();

    public C4173f0(C4188n c4188n) {
    }

    @Override // u0.N
    public final void A(float f10) {
        this.f46228a.setScaleY(f10);
    }

    @Override // u0.N
    public final void B(Outline outline) {
        this.f46228a.setOutline(outline);
    }

    @Override // u0.N
    public final void C(float f10) {
        this.f46228a.setAlpha(f10);
    }

    @Override // u0.N
    public final void D() {
        this.f46228a.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final void E(int i5) {
        this.f46228a.setAmbientShadowColor(i5);
    }

    @Override // u0.N
    public final void F() {
        this.f46228a.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final void G(boolean z2) {
        this.f46228a.setClipToOutline(z2);
    }

    @Override // u0.N
    public final void H(int i5) {
        this.f46228a.setSpotShadowColor(i5);
    }

    @Override // u0.N
    public final float I() {
        return this.f46228a.getElevation();
    }

    @Override // u0.N
    public final int a() {
        return this.f46228a.getLeft();
    }

    @Override // u0.N
    public final int b() {
        return this.f46228a.getRight();
    }

    @Override // u0.N
    public final void c(Canvas canvas) {
        AbstractC3340k.e(canvas, "canvas");
        canvas.drawRenderNode(this.f46228a);
    }

    @Override // u0.N
    public final void d(boolean z2) {
        this.f46228a.setClipToBounds(z2);
    }

    @Override // u0.N
    public final boolean e(int i5, int i10, int i11, int i12) {
        return this.f46228a.setPosition(i5, i10, i11, i12);
    }

    @Override // u0.N
    public final void f() {
        this.f46228a.discardDisplayList();
    }

    @Override // u0.N
    public final void g(C1346a canvasHolder, e0.x xVar, t0.y drawBlock) {
        AbstractC3340k.e(canvasHolder, "canvasHolder");
        AbstractC3340k.e(drawBlock, "drawBlock");
        RecordingCanvas recordingCanvasBeginRecording = this.f46228a.beginRecording();
        AbstractC3340k.d(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        C2450b c2450b = (C2450b) canvasHolder.f17489b;
        Canvas canvas = c2450b.f34357a;
        c2450b.f34357a = recordingCanvasBeginRecording;
        if (xVar != null) {
            c2450b.m();
            c2450b.l(xVar);
        }
        drawBlock.invoke(c2450b);
        if (xVar != null) {
            c2450b.restore();
        }
        AbstractC3340k.e(canvas, "<set-?>");
        c2450b.f34357a = canvas;
        this.f46228a.endRecording();
    }

    @Override // u0.N
    public final int getHeight() {
        return this.f46228a.getHeight();
    }

    @Override // u0.N
    public final int getWidth() {
        return this.f46228a.getWidth();
    }

    @Override // u0.N
    public final void h(float f10) {
        this.f46228a.setElevation(f10);
    }

    @Override // u0.N
    public final void i(int i5) {
        this.f46228a.offsetTopAndBottom(i5);
    }

    @Override // u0.N
    public final boolean j() {
        return this.f46228a.hasDisplayList();
    }

    @Override // u0.N
    public final boolean k() {
        return this.f46228a.setHasOverlappingRendering(true);
    }

    @Override // u0.N
    public final void l() {
        this.f46228a.setRotationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final boolean m() {
        return this.f46228a.getClipToBounds();
    }

    @Override // u0.N
    public final int n() {
        return this.f46228a.getTop();
    }

    @Override // u0.N
    public final void o() {
        this.f46228a.setRotationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final void p(float f10) {
        this.f46228a.setScaleX(f10);
    }

    @Override // u0.N
    public final void q() {
        this.f46228a.setRotationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final boolean r() {
        return this.f46228a.getClipToOutline();
    }

    @Override // u0.N
    public final float s() {
        return this.f46228a.getAlpha();
    }

    @Override // u0.N
    public final void t(float f10) {
        this.f46228a.setCameraDistance(f10);
    }

    @Override // u0.N
    public final void u(Matrix matrix) {
        AbstractC3340k.e(matrix, "matrix");
        this.f46228a.getMatrix(matrix);
    }

    @Override // u0.N
    public final void v(int i5) {
        this.f46228a.offsetLeftAndRight(i5);
    }

    @Override // u0.N
    public final int w() {
        return this.f46228a.getBottom();
    }

    @Override // u0.N
    public final void x() {
        if (Build.VERSION.SDK_INT >= 31) {
            C4175g0.f46229a.a(this.f46228a, null);
        }
    }

    @Override // u0.N
    public final void y(float f10) {
        this.f46228a.setPivotX(f10);
    }

    @Override // u0.N
    public final void z(float f10) {
        this.f46228a.setPivotY(f10);
    }
}
