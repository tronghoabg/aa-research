package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmn implements cml {
    private boolean A;
    private int B;
    private int C;
    private ckr D;
    private int E;
    private final kgx F;
    private final cmb a;
    private final RenderNode b;
    private long c;
    private Paint d;
    private Matrix e;
    private boolean f;
    private float g;
    private int h;
    private long i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private long o;
    private long p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public cmn(kgx kgxVar, cmb cmbVar) {
        this.F = kgxVar;
        this.a = cmbVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.b = renderNode;
        this.c = 0L;
        renderNode.setClipToBounds(false);
        P(renderNode, 0);
        this.g = 1.0f;
        this.h = 3;
        this.i = 9205357640488583168L;
        this.j = 1.0f;
        this.k = 1.0f;
        this.o = -72057594037927936L;
        this.p = -72057594037927936L;
        this.t = 8.0f;
        this.E = 0;
    }

    private final void O() {
        boolean z = this.u;
        boolean z2 = z && !this.f;
        boolean z3 = z && this.f;
        if (z2 != this.z) {
            this.z = z2;
            this.b.setClipToBounds(z2);
        }
        if (z3 != this.A) {
            this.A = z3;
            this.b.setClipToOutline(z3);
        }
    }

    private final void P(RenderNode renderNode, int i) {
        Paint paint = this.d;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void Q() {
        if (this.E != 1 && this.h == 3 && this.D == null) {
            P(this.b, 0);
        } else {
            P(this.b, 1);
        }
    }

    private final void R() {
        long j = this.i;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.b;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.c >> 32)) / 2.0f) + this.v);
            renderNode.setPivotY((Float.intBitsToFloat((int) (4294967295L & this.c)) / 2.0f) + this.w);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.v);
            renderNode.setPivotY(Float.intBitsToFloat((int) (this.i & 4294967295L)) + this.w);
        }
    }

    private final void S() {
        int i = this.B;
        this.b.setPosition(i - this.v, this.C - this.w, i + ((int) Float.intBitsToFloat((int) (this.c >> 32))) + this.x, this.C + ((int) Float.intBitsToFloat((int) (this.c & 4294967295L))) + this.y);
    }

    @Override // defpackage.cml
    public final void A(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            ckf.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.v;
        if (i == i5 && i2 == this.w && i3 == this.x && i4 == this.y) {
            return;
        }
        boolean z = true;
        if (i == i5 && i2 == this.w) {
            z = false;
        }
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.cml
    public final void B(long j) {
        this.i = j;
        R();
    }

    @Override // defpackage.cml
    public final void C(int i, int i2, long j) {
        this.B = i;
        this.C = i2;
        long j2 = this.c;
        long jK = dln.k(j);
        this.c = dln.k(j);
        S();
        if ((j2 == jK) || this.i != 9205357640488583168L) {
            return;
        }
        RenderNode renderNode = this.b;
        renderNode.setPivotX((((int) (j >> 32)) / 2.0f) + this.v);
        renderNode.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.w);
    }

    @Override // defpackage.cml
    public final void D(ckr ckrVar) {
        this.D = ckrVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.b.setRenderEffect(ckrVar != null ? ckrVar.a() : null);
        }
    }

    @Override // defpackage.cml
    public final void E(float f) {
        this.q = f;
        this.b.setRotationX(f);
    }

    @Override // defpackage.cml
    public final void F(float f) {
        this.r = f;
        this.b.setRotationY(f);
    }

    @Override // defpackage.cml
    public final void G(float f) {
        this.s = f;
        this.b.setRotationZ(f);
    }

    @Override // defpackage.cml
    public final void H(float f) {
        this.j = f;
        this.b.setScaleX(f);
    }

    @Override // defpackage.cml
    public final void I(float f) {
        this.k = f;
        this.b.setScaleY(f);
    }

    @Override // defpackage.cml
    public final void J(float f) {
        this.n = f;
        this.b.setElevation(f);
    }

    @Override // defpackage.cml
    public final void K(long j) {
        this.p = j;
        float[] fArr = clj.a;
        this.b.setSpotShadowColor((int) (cjv.e(j, clj.e) >>> 32));
    }

    @Override // defpackage.cml
    public final void L(float f) {
        this.l = f;
        this.b.setTranslationX(f);
    }

    @Override // defpackage.cml
    public final void M(float f) {
        this.m = f;
        this.b.setTranslationY(f);
    }

    @Override // defpackage.cml
    public final boolean N() {
        return this.b.hasDisplayList();
    }

    @Override // defpackage.cml
    public final float a() {
        return this.g;
    }

    @Override // defpackage.cml
    public final float b() {
        return this.t;
    }

    @Override // defpackage.cml
    public final float c() {
        return this.q;
    }

    @Override // defpackage.cml
    public final float d() {
        return this.r;
    }

    @Override // defpackage.cml
    public final float e() {
        return this.s;
    }

    @Override // defpackage.cml
    public final float f() {
        return this.j;
    }

    @Override // defpackage.cml
    public final float g() {
        return this.k;
    }

    @Override // defpackage.cml
    public final float h() {
        return this.n;
    }

    @Override // defpackage.cml
    public final float i() {
        return this.l;
    }

    @Override // defpackage.cml
    public final float j() {
        return this.m;
    }

    @Override // defpackage.cml
    public final int k() {
        return this.h;
    }

    @Override // defpackage.cml
    public final int l() {
        return this.E;
    }

    @Override // defpackage.cml
    public final long m() {
        return this.o;
    }

    @Override // defpackage.cml
    public final long n() {
        return this.p;
    }

    @Override // defpackage.cml
    public final Matrix o() {
        Matrix matrix = this.e;
        if (matrix == null) {
            matrix = new Matrix();
            this.e = matrix;
        }
        this.b.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.cml
    public final ckr p() {
        return this.D;
    }

    @Override // defpackage.cml
    public final void q() {
        this.b.discardDisplayList();
    }

    @Override // defpackage.cml
    public final void r(cju cjuVar) {
        Canvas canvas = cjf.a;
        cjuVar.getClass();
        ((cje) cjuVar).a.drawRenderNode(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [cju, java.lang.Object] */
    @Override // defpackage.cml
    public final void s(dlg dlgVar, dlr dlrVar, cmi cmiVar, afec afecVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.b.beginRecording();
        float f = this.v;
        float f2 = this.w;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        try {
            ?? r5 = this.F.a;
            Canvas canvas = ((cje) r5).a;
            ((cje) r5).a = recordingCanvasBeginRecording;
            cmb cmbVar = this.a;
            cma cmaVar = cmbVar.b;
            cmaVar.f(dlgVar);
            cmaVar.g(dlrVar);
            cmaVar.a = cmiVar;
            cmaVar.h(this.c);
            cmaVar.e(r5);
            if (this.v > BitmapDescriptorFactory.HUE_RED || this.w > BitmapDescriptorFactory.HUE_RED) {
                long j = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                int i = (int) (j >> 32);
                int i2 = (int) (4294967295L & j);
                r5.i(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                afecVar.invoke(cmbVar);
                r5.i(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                afecVar.invoke(cmbVar);
            }
            ((cje) r5).a = canvas;
        } finally {
            this.b.endRecording();
        }
    }

    @Override // defpackage.cml
    public final void t(float f) {
        this.g = f;
        this.b.setAlpha(f);
    }

    @Override // defpackage.cml
    public final void u(long j) {
        this.o = j;
        float[] fArr = clj.a;
        this.b.setAmbientShadowColor((int) (cjv.e(j, clj.e) >>> 32));
    }

    @Override // defpackage.cml
    public final void v(int i) {
        this.h = i;
        Paint paint = this.d;
        if (paint == null) {
            paint = new Paint();
            this.d = paint;
        }
        paint.setBlendMode(byx.y(i));
        Q();
    }

    @Override // defpackage.cml
    public final void w(float f) {
        this.t = f;
        this.b.setCameraDistance(f);
    }

    @Override // defpackage.cml
    public final void x(boolean z) {
        this.u = z;
        O();
    }

    @Override // defpackage.cml
    public final void y(int i) {
        this.E = i;
        Q();
    }

    @Override // defpackage.cml
    public final void z(Outline outline, long j) {
        this.b.setOutline(outline);
        this.f = outline != null;
        O();
    }
}
