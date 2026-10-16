package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class cmp implements cml {
    private static final Canvas a = new cmo();
    private float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private ckr F;
    private final kgx G;
    private final cms b;
    private final cmr c;
    private final Resources d;
    private final Rect e;
    private Paint f;
    private int g;
    private int h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private long q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private long w;
    private long x;
    private float y;
    private float z;

    public /* synthetic */ cmp(cms cmsVar) {
        kgx kgxVar = new kgx((char[]) null);
        cmb cmbVar = new cmb();
        this.b = cmsVar;
        this.G = kgxVar;
        cmr cmrVar = new cmr(cmsVar, kgxVar, cmbVar);
        this.c = cmrVar;
        this.d = cmsVar.getResources();
        this.e = new Rect();
        cmsVar.addView(cmrVar);
        cmrVar.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.m = 3;
        this.n = 0;
        this.o = 1.0f;
        this.q = 9205357640488583168L;
        this.r = 1.0f;
        this.s = 1.0f;
        this.w = -72057594037927936L;
        this.x = -72057594037927936L;
    }

    private final void P(int i) {
        cmr cmrVar = this.c;
        Paint paint = this.f;
        if (i == 1) {
            cmrVar.setLayerType(2, paint);
        } else {
            cmrVar.setLayerType(0, paint);
        }
        if (!cmrVar.c) {
            cmrVar.c = true;
            cmrVar.invalidate();
        }
    }

    private final void Q() {
        if (O()) {
            this.j = true;
        }
        cmr cmrVar = this.c;
        int i = this.g;
        int i2 = i - this.B;
        int i3 = this.h;
        int i4 = i3 - this.C;
        long j = this.i;
        cmrVar.layout(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    private final void R() {
        if (this.n != 1 && this.m == 3) {
            P(0);
        } else {
            P(1);
        }
    }

    private final void S() {
        if (!this.p) {
            long j = this.q;
            if (j != 9205357640488583168L) {
                cmr cmrVar = this.c;
                cmrVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
                cmrVar.setPivotY(Float.intBitsToFloat((int) (4294967295L & this.q)) + this.C);
                return;
            }
        }
        cmr cmrVar2 = this.c;
        cmrVar2.setPivotX((((int) (this.i >> 32)) / 2.0f) + this.B);
        cmrVar2.setPivotY((((int) (4294967295L & this.i)) / 2.0f) + this.C);
    }

    @Override // defpackage.cml
    public final void A(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            ckf.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = true;
        if (i == i5 && i2 == this.C) {
            z = false;
        }
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        Q();
        if (z) {
            S();
        }
    }

    @Override // defpackage.cml
    public final void B(long j) {
        this.q = j;
        this.p = (j & 9223372034707292159L) == 9205357640488583168L;
        S();
    }

    @Override // defpackage.cml
    public final void C(int i, int i2, long j) {
        if (this.i != j) {
            this.g = i;
            this.h = i2;
            this.i = j;
            Q();
            return;
        }
        int i3 = this.g;
        if (i3 != i) {
            this.c.offsetLeftAndRight(i - i3);
        }
        int i4 = this.h;
        if (i4 != i2) {
            this.c.offsetTopAndBottom(i2 - i4);
        }
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.cml
    public final void D(ckr ckrVar) {
        this.F = ckrVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.c.setRenderEffect(ckrVar != null ? ckrVar.a() : null);
        }
    }

    @Override // defpackage.cml
    public final void E(float f) {
        this.y = f;
        this.c.setRotationX(f);
    }

    @Override // defpackage.cml
    public final void F(float f) {
        this.z = f;
        this.c.setRotationY(f);
    }

    @Override // defpackage.cml
    public final void G(float f) {
        this.A = f;
        this.c.setRotation(f);
    }

    @Override // defpackage.cml
    public final void H(float f) {
        this.r = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.cml
    public final void I(float f) {
        this.s = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.cml
    public final void J(float f) {
        this.v = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.cml
    public final void K(long j) {
        this.x = j;
        float[] fArr = clj.a;
        this.c.setOutlineSpotShadowColor((int) (cjv.e(j, clj.e) >>> 32));
    }

    @Override // defpackage.cml
    public final void L(float f) {
        this.t = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.cml
    public final void M(float f) {
        this.u = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.cml
    public final /* synthetic */ boolean N() {
        return true;
    }

    public final boolean O() {
        return this.l || this.c.getClipToOutline();
    }

    @Override // defpackage.cml
    public final float a() {
        return this.o;
    }

    @Override // defpackage.cml
    public final float b() {
        return this.c.getCameraDistance() / this.d.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.cml
    public final float c() {
        return this.y;
    }

    @Override // defpackage.cml
    public final float d() {
        return this.z;
    }

    @Override // defpackage.cml
    public final float e() {
        return this.A;
    }

    @Override // defpackage.cml
    public final float f() {
        return this.r;
    }

    @Override // defpackage.cml
    public final float g() {
        return this.s;
    }

    @Override // defpackage.cml
    public final float h() {
        return this.v;
    }

    @Override // defpackage.cml
    public final float i() {
        return this.t;
    }

    @Override // defpackage.cml
    public final float j() {
        return this.u;
    }

    @Override // defpackage.cml
    public final int k() {
        return this.m;
    }

    @Override // defpackage.cml
    public final int l() {
        return this.n;
    }

    @Override // defpackage.cml
    public final long m() {
        return this.w;
    }

    @Override // defpackage.cml
    public final long n() {
        return this.x;
    }

    @Override // defpackage.cml
    public final Matrix o() {
        return this.c.getMatrix();
    }

    @Override // defpackage.cml
    public final ckr p() {
        return this.F;
    }

    @Override // defpackage.cml
    public final void q() {
        this.b.removeViewInLayout(this.c);
    }

    @Override // defpackage.cml
    public final void r(cju cjuVar) {
        if (this.j) {
            cmr cmrVar = this.c;
            Rect rect = null;
            if (O() && !this.k) {
                rect = this.e;
                rect.left = 0;
                rect.top = 0;
                rect.right = cmrVar.getWidth();
                rect.bottom = cmrVar.getHeight();
            }
            cmrVar.setClipBounds(rect);
        }
        Canvas canvas = cjf.a;
        cjuVar.getClass();
        if (((cje) cjuVar).a.isHardwareAccelerated()) {
            cms cmsVar = this.b;
            cmr cmrVar2 = this.c;
            cmsVar.a(cjuVar, cmrVar2, cmrVar2.getDrawingTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [cju, java.lang.Object] */
    @Override // defpackage.cml
    public final void s(dlg dlgVar, dlr dlrVar, cmi cmiVar, afec afecVar) {
        cmr cmrVar = this.c;
        if (cmrVar.getParent() == null) {
            this.b.addView(cmrVar);
        }
        float f = this.B;
        float f2 = this.C;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = (int) (jFloatToRawIntBits & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        cmrVar.d = dlgVar;
        cmrVar.e = dlrVar;
        cmrVar.f = afecVar;
        cmrVar.g = cmiVar;
        cmrVar.h = fIntBitsToFloat;
        cmrVar.i = fIntBitsToFloat2;
        if (cmrVar.isAttachedToWindow()) {
            cmrVar.setVisibility(4);
            cmrVar.setVisibility(0);
            try {
                kgx kgxVar = this.G;
                Canvas canvas = a;
                ?? r9 = kgxVar.a;
                Canvas canvas2 = ((cje) r9).a;
                ((cje) r9).a = canvas;
                this.b.a(r9, cmrVar, cmrVar.getDrawingTime());
                ((cje) r9).a = canvas2;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.cml
    public final void t(float f) {
        this.o = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.cml
    public final void u(long j) {
        this.w = j;
        float[] fArr = clj.a;
        this.c.setOutlineAmbientShadowColor((int) (cjv.e(j, clj.e) >>> 32));
    }

    @Override // defpackage.cml
    public final void v(int i) {
        this.m = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(byx.z(i)));
        R();
    }

    @Override // defpackage.cml
    public final void w(float f) {
        this.c.setCameraDistance(f * this.d.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.cml
    public final void x(boolean z) {
        this.l = z && !this.k;
        this.j = true;
        this.c.setClipToOutline(z && this.k);
    }

    @Override // defpackage.cml
    public final void y(int i) {
        this.n = i;
        R();
    }

    @Override // defpackage.cml
    public final void z(Outline outline, long j) {
        cmr cmrVar = this.c;
        cmrVar.b = outline;
        cmrVar.invalidateOutline();
        if (O() && outline != null) {
            cmrVar.setClipToOutline(true);
            if (this.l) {
                this.l = false;
                this.j = true;
            }
        }
        this.k = outline != null;
    }
}
