package u0;

import ac.C1346a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import com.unity3d.services.UnityAdsConstants;
import e0.C2450b;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: u0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4169d0 implements N {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f46220g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f46221a;

    /* renamed from: b, reason: collision with root package name */
    public int f46222b;

    /* renamed from: c, reason: collision with root package name */
    public int f46223c;

    /* renamed from: d, reason: collision with root package name */
    public int f46224d;

    /* renamed from: e, reason: collision with root package name */
    public int f46225e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46226f;

    public C4169d0(C4188n c4188n) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", c4188n);
        AbstractC3340k.d(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.f46221a = renderNodeCreate;
        if (f46220g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                C4183k0 c4183k0 = C4183k0.f46249a;
                c4183k0.c(renderNodeCreate, c4183k0.a(renderNodeCreate));
                c4183k0.d(renderNodeCreate, c4183k0.b(renderNodeCreate));
            }
            if (i5 >= 24) {
                C4181j0.f46246a.a(renderNodeCreate);
            } else {
                C4179i0.f46243a.a(renderNodeCreate);
            }
            f46220g = false;
        }
    }

    @Override // u0.N
    public final void A(float f10) {
        this.f46221a.setScaleY(f10);
    }

    @Override // u0.N
    public final void B(Outline outline) {
        this.f46221a.setOutline(outline);
    }

    @Override // u0.N
    public final void C(float f10) {
        this.f46221a.setAlpha(f10);
    }

    @Override // u0.N
    public final void D() {
        this.f46221a.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final void E(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            C4183k0.f46249a.c(this.f46221a, i5);
        }
    }

    @Override // u0.N
    public final void F() {
        this.f46221a.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final void G(boolean z2) {
        this.f46221a.setClipToOutline(z2);
    }

    @Override // u0.N
    public final void H(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            C4183k0.f46249a.d(this.f46221a, i5);
        }
    }

    @Override // u0.N
    public final float I() {
        return this.f46221a.getElevation();
    }

    @Override // u0.N
    public final int a() {
        return this.f46222b;
    }

    @Override // u0.N
    public final int b() {
        return this.f46224d;
    }

    @Override // u0.N
    public final void c(Canvas canvas) {
        AbstractC3340k.e(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f46221a);
    }

    @Override // u0.N
    public final void d(boolean z2) {
        this.f46226f = z2;
        this.f46221a.setClipToBounds(z2);
    }

    @Override // u0.N
    public final boolean e(int i5, int i10, int i11, int i12) {
        this.f46222b = i5;
        this.f46223c = i10;
        this.f46224d = i11;
        this.f46225e = i12;
        return this.f46221a.setLeftTopRightBottom(i5, i10, i11, i12);
    }

    @Override // u0.N
    public final void f() {
        if (Build.VERSION.SDK_INT >= 24) {
            C4181j0.f46246a.a(this.f46221a);
        } else {
            C4179i0.f46243a.a(this.f46221a);
        }
    }

    @Override // u0.N
    public final void g(C1346a canvasHolder, e0.x xVar, t0.y drawBlock) {
        AbstractC3340k.e(canvasHolder, "canvasHolder");
        AbstractC3340k.e(drawBlock, "drawBlock");
        Canvas canvasStart = this.f46221a.start(getWidth(), getHeight());
        AbstractC3340k.d(canvasStart, "renderNode.start(width, height)");
        C2450b c2450b = (C2450b) canvasHolder.f17489b;
        Canvas canvas = c2450b.f34357a;
        c2450b.f34357a = canvasStart;
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
        this.f46221a.end(canvasStart);
    }

    @Override // u0.N
    public final int getHeight() {
        return this.f46225e - this.f46223c;
    }

    @Override // u0.N
    public final int getWidth() {
        return this.f46224d - this.f46222b;
    }

    @Override // u0.N
    public final void h(float f10) {
        this.f46221a.setElevation(f10);
    }

    @Override // u0.N
    public final void i(int i5) {
        this.f46223c += i5;
        this.f46225e += i5;
        this.f46221a.offsetTopAndBottom(i5);
    }

    @Override // u0.N
    public final boolean j() {
        return this.f46221a.isValid();
    }

    @Override // u0.N
    public final boolean k() {
        return this.f46221a.setHasOverlappingRendering(true);
    }

    @Override // u0.N
    public final void l() {
        this.f46221a.setRotationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final boolean m() {
        return this.f46226f;
    }

    @Override // u0.N
    public final int n() {
        return this.f46223c;
    }

    @Override // u0.N
    public final void o() {
        this.f46221a.setRotationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final void p(float f10) {
        this.f46221a.setScaleX(f10);
    }

    @Override // u0.N
    public final void q() {
        this.f46221a.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // u0.N
    public final boolean r() {
        return this.f46221a.getClipToOutline();
    }

    @Override // u0.N
    public final float s() {
        return this.f46221a.getAlpha();
    }

    @Override // u0.N
    public final void t(float f10) {
        this.f46221a.setCameraDistance(-f10);
    }

    @Override // u0.N
    public final void u(Matrix matrix) {
        AbstractC3340k.e(matrix, "matrix");
        this.f46221a.getMatrix(matrix);
    }

    @Override // u0.N
    public final void v(int i5) {
        this.f46222b += i5;
        this.f46224d += i5;
        this.f46221a.offsetLeftAndRight(i5);
    }

    @Override // u0.N
    public final int w() {
        return this.f46225e;
    }

    @Override // u0.N
    public final void y(float f10) {
        this.f46221a.setPivotX(f10);
    }

    @Override // u0.N
    public final void z(float f10) {
        this.f46221a.setPivotY(f10);
    }

    @Override // u0.N
    public final void x() {
    }
}
