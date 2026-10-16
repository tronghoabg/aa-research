package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class cmm implements cml {
    private static final AtomicBoolean a = new AtomicBoolean(true);
    private int A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private ckr H;
    private final kgx I;
    private final cmb b;
    private final RenderNode c;
    private long d;
    private Paint e;
    private Matrix f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private float k;
    private boolean l;
    private long m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private long s;
    private long t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private int z;

    public cmm(View view, kgx kgxVar, cmb cmbVar) {
        this.I = kgxVar;
        this.b = cmbVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.c = renderNodeCreate;
        this.d = 0L;
        this.h = 0L;
        if (a.getAndSet(false)) {
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
            renderNodeCreate.setAmbientShadowColor(renderNodeCreate.getAmbientShadowColor());
            renderNodeCreate.setSpotShadowColor(renderNodeCreate.getSpotShadowColor());
            O();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.i = 0;
        this.j = 3;
        this.k = 1.0f;
        this.m = 9205357640488583168L;
        this.n = 1.0f;
        this.o = 1.0f;
        this.s = -72057594037927936L;
        this.t = -72057594037927936L;
        this.x = 8.0f;
    }

    private final void P() {
        boolean z = this.y;
        boolean z2 = z && !this.g;
        boolean z3 = z && this.g;
        if (z2 != this.D) {
            this.D = z2;
            this.c.setClipToBounds(z2);
        }
        if (z3 != this.E) {
            this.E = z3;
            this.c.setClipToOutline(z3);
        }
    }

    private final void Q(int i) {
        RenderNode renderNode = this.c;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.e);
            renderNode.setHasOverlappingRendering(true);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.e);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void R() {
        if (this.i != 1 && this.j == 3) {
            Q(0);
        } else {
            Q(1);
        }
    }

    private final void S() {
        long j = this.m;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            this.l = false;
            RenderNode renderNode = this.c;
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.z);
            renderNode.setPivotY(Float.intBitsToFloat((int) (this.m & 4294967295L)) + this.A);
            return;
        }
        this.l = true;
        RenderNode renderNode2 = this.c;
        renderNode2.setPivotX((((int) (this.d >> 32)) / 2.0f) + this.z);
        renderNode2.setPivotY((((int) (4294967295L & this.d)) / 2.0f) + this.A);
    }

    private final void T() {
        int i = this.F;
        int i2 = i - this.z;
        int i3 = this.G;
        int i4 = i3 - this.A;
        long j = this.d;
        this.c.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.B, i3 + ((int) (j & 4294967295L)) + this.C);
    }

    @Override // defpackage.cml
    public final void A(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            ckf.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.z;
        if (i == i5 && i2 == this.A && i3 == this.B && i4 == this.C) {
            return;
        }
        boolean z = true;
        if (i == i5 && i2 == this.A) {
            z = false;
        }
        this.z = i;
        this.A = i2;
        this.B = i3;
        this.C = i4;
        T();
        if (z) {
            S();
        }
    }

    @Override // defpackage.cml
    public final void B(long j) {
        this.m = j;
        S();
    }

    @Override // defpackage.cml
    public final void C(int i, int i2, long j) {
        this.F = i;
        this.G = i2;
        long j2 = this.d;
        this.d = j;
        T();
        if (j2 == j) {
            return;
        }
        if (this.l || this.m == 9205357640488583168L) {
            RenderNode renderNode = this.c;
            renderNode.setPivotX((((int) (j >> 32)) / 2.0f) + this.z);
            renderNode.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.A);
        }
    }

    @Override // defpackage.cml
    public final void D(ckr ckrVar) {
        this.H = ckrVar;
    }

    @Override // defpackage.cml
    public final void E(float f) {
        this.u = f;
        this.c.setRotationX(f);
    }

    @Override // defpackage.cml
    public final void F(float f) {
        this.v = f;
        this.c.setRotationY(f);
    }

    @Override // defpackage.cml
    public final void G(float f) {
        this.w = f;
        this.c.setRotation(f);
    }

    @Override // defpackage.cml
    public final void H(float f) {
        this.n = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.cml
    public final void I(float f) {
        this.o = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.cml
    public final void J(float f) {
        this.r = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.cml
    public final void K(long j) {
        this.t = j;
        float[] fArr = clj.a;
        this.c.setSpotShadowColor((int) (cjv.e(j, clj.e) >>> 32));
    }

    @Override // defpackage.cml
    public final void L(float f) {
        this.p = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.cml
    public final void M(float f) {
        this.q = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.cml
    public final boolean N() {
        return this.c.isValid();
    }

    public final void O() {
        this.c.discardDisplayList();
    }

    @Override // defpackage.cml
    public final float a() {
        return this.k;
    }

    @Override // defpackage.cml
    public final float b() {
        return this.x;
    }

    @Override // defpackage.cml
    public final float c() {
        return this.u;
    }

    @Override // defpackage.cml
    public final float d() {
        return this.v;
    }

    @Override // defpackage.cml
    public final float e() {
        return this.w;
    }

    @Override // defpackage.cml
    public final float f() {
        return this.n;
    }

    @Override // defpackage.cml
    public final float g() {
        return this.o;
    }

    @Override // defpackage.cml
    public final float h() {
        return this.r;
    }

    @Override // defpackage.cml
    public final float i() {
        return this.p;
    }

    @Override // defpackage.cml
    public final float j() {
        return this.q;
    }

    @Override // defpackage.cml
    public final int k() {
        return this.j;
    }

    @Override // defpackage.cml
    public final int l() {
        return this.i;
    }

    @Override // defpackage.cml
    public final long m() {
        return this.s;
    }

    @Override // defpackage.cml
    public final long n() {
        return this.t;
    }

    @Override // defpackage.cml
    public final Matrix o() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.c.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.cml
    public final ckr p() {
        return this.H;
    }

    @Override // defpackage.cml
    public final void q() {
        O();
    }

    @Override // defpackage.cml
    public final void r(cju cjuVar) {
        Canvas canvas = cjf.a;
        cjuVar.getClass();
        DisplayListCanvas displayListCanvas = ((cje) cjuVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [cju, java.lang.Object] */
    @Override // defpackage.cml
    public final void s(dlg dlgVar, dlr dlrVar, cmi cmiVar, afec afecVar) throws Throwable {
        DisplayListCanvas displayListCanvas;
        cmb cmbVar;
        dlg dlgVarC;
        dlr dlrVarD;
        cju cjuVarB;
        kgx kgxVar;
        long jA;
        Canvas canvas;
        cmi cmiVar2;
        int i;
        int i2;
        DisplayListCanvas displayListCanvasStart = this.c.start(Math.max(((int) (this.d >> 32)) + this.z + this.B, (int) (this.h >> 32)), Math.max(((int) (this.d & 4294967295L)) + this.A + this.C, (int) (this.h & 4294967295L)));
        float f = this.z;
        float f2 = this.A;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        try {
            kgx kgxVar2 = this.I;
            ?? r14 = kgxVar2.a;
            Canvas canvas2 = ((cje) r14).a;
            ((cje) r14).a = displayListCanvasStart;
            DisplayListCanvas displayListCanvas2 = null;
            try {
                try {
                    if (this.z <= BitmapDescriptorFactory.HUE_RED) {
                        try {
                            if (this.A <= BitmapDescriptorFactory.HUE_RED) {
                                cmbVar = this.b;
                                long jK = dln.k(this.d);
                                cma cmaVar = cmbVar.b;
                                dlgVarC = cmaVar.c();
                                dlrVarD = cmaVar.d();
                                cjuVarB = cmaVar.b();
                                displayListCanvas2 = displayListCanvasStart;
                                kgxVar = kgxVar2;
                                jA = cmaVar.a();
                                canvas = canvas2;
                                cmiVar2 = cmaVar.a;
                                cmaVar.f(dlgVar);
                                cmaVar.g(dlrVar);
                                cmaVar.e(r14);
                                cmaVar.h(jK);
                                cmaVar.a = cmiVar;
                                r14.g();
                                try {
                                    afecVar.invoke(cmbVar);
                                    ((cje) kgxVar.a).a = canvas;
                                    this.c.end(displayListCanvas2);
                                    return;
                                } finally {
                                    r14.e();
                                    cma cmaVar2 = cmbVar.b;
                                    cmaVar2.f(dlgVarC);
                                    cmaVar2.g(dlrVarD);
                                    cmaVar2.e(cjuVarB);
                                    cmaVar2.h(jA);
                                    cmaVar2.a = cmiVar2;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            displayListCanvas2 = displayListCanvasStart;
                            displayListCanvas = displayListCanvas2;
                            this.c.end(displayListCanvas);
                            throw th;
                        }
                    }
                    afecVar.invoke(cmbVar);
                    r14.e();
                    cma cmaVar3 = cmbVar.b;
                    cmaVar3.f(dlgVarC);
                    cmaVar3.g(dlrVarD);
                    cmaVar3.e(cjuVarB);
                    cmaVar3.h(jA);
                    cmaVar3.a = cmiVar2;
                    r14.i(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    ((cje) kgxVar.a).a = canvas;
                    this.c.end(displayListCanvas2);
                    return;
                } catch (Throwable th2) {
                    displayListCanvas = displayListCanvas2;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        this.c.end(displayListCanvas);
                        throw th;
                    }
                }
                displayListCanvas2 = displayListCanvasStart;
                kgxVar = kgxVar2;
                canvas = canvas2;
                long j = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                i = (int) (j >> 32);
                i2 = (int) (j & 4294967295L);
                r14.i(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                cmbVar = this.b;
                long jK2 = dln.k(this.d);
                cma cmaVar4 = cmbVar.b;
                dlgVarC = cmaVar4.c();
                dlrVarD = cmaVar4.d();
                cjuVarB = cmaVar4.b();
                jA = cmaVar4.a();
                cmiVar2 = cmaVar4.a;
                cmaVar4.f(dlgVar);
                cmaVar4.g(dlrVar);
                cmaVar4.e(r14);
                cmaVar4.h(jK2);
                cmaVar4.a = cmiVar;
                r14.g();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // defpackage.cml
    public final void t(float f) {
        this.k = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.cml
    public final void u(long j) {
        this.s = j;
        float[] fArr = clj.a;
        this.c.setAmbientShadowColor((int) (cjv.e(j, clj.e) >>> 32));
    }

    @Override // defpackage.cml
    public final void v(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        Paint paint = this.e;
        if (paint == null) {
            paint = new Paint();
            this.e = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(byx.z(i)));
        R();
    }

    @Override // defpackage.cml
    public final void w(float f) {
        this.x = f;
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.cml
    public final void x(boolean z) {
        this.y = z;
        P();
    }

    @Override // defpackage.cml
    public final void y(int i) {
        this.i = i;
        R();
    }

    @Override // defpackage.cml
    public final void z(Outline outline, long j) {
        this.h = j;
        this.c.setOutline(outline);
        this.g = outline != null;
        P();
    }
}
