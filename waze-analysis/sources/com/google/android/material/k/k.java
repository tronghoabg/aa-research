package com.google.android.material.k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.BitSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class k extends Drawable implements TintAwareDrawable, ac {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6666b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f6667c;

    /* renamed from: d, reason: collision with root package name */
    private static final j[] f6668d;
    private boolean A;
    private r B;
    private SpringForce C;
    private float[] D;
    private float[] E;
    private com.google.firebase.messaging.l F;

    /* renamed from: a, reason: collision with root package name */
    SpringAnimation[] f6669a;

    /* renamed from: e, reason: collision with root package name */
    private final q f6670e;

    /* renamed from: f, reason: collision with root package name */
    private i f6671f;

    /* renamed from: g, reason: collision with root package name */
    private final aa[] f6672g;

    /* renamed from: h, reason: collision with root package name */
    private final aa[] f6673h;

    /* renamed from: i, reason: collision with root package name */
    private final BitSet f6674i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6675j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6676k;

    /* renamed from: l, reason: collision with root package name */
    private final Matrix f6677l;
    private final Path m;
    private final Path n;
    private final RectF o;
    private final RectF p;
    private final Region q;
    private final Region r;
    private final Paint s;
    private final Paint t;
    private final com.google.android.material.j.a u;
    private final t v;
    private final u w;
    private PorterDuffColorFilter x;
    private PorterDuffColorFilter y;
    private final RectF z;

    static {
        p pVar = new p();
        int i2 = 0;
        f fVarF = f.f(0);
        pVar.D(fVarF);
        pVar.E(fVarF);
        pVar.C(fVarF);
        pVar.B(fVarF);
        pVar.s(0.0f);
        Paint paint = new Paint(1);
        f6667c = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f6668d = new j[4];
        while (true) {
            j[] jVarArr = f6668d;
            int length = jVarArr.length;
            if (i2 >= 4) {
                return;
            }
            jVarArr[i2] = new j(i2);
            i2++;
        }
    }

    protected k(i iVar) {
        this.f6670e = new g(this);
        this.f6672g = new aa[4];
        this.f6673h = new aa[4];
        this.f6674i = new BitSet(8);
        this.f6677l = new Matrix();
        this.m = new Path();
        this.n = new Path();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new Region();
        this.r = new Region();
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.t = paint2;
        this.u = new com.google.android.material.j.a();
        this.w = u.a();
        this.z = new RectF();
        this.A = true;
        this.f6669a = new SpringAnimation[4];
        this.f6671f = iVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        aa();
        Z(getState());
        this.v = new h(this);
    }

    private final float O(RectF rectF, r rVar, float[] fArr) {
        if (fArr == null) {
            if (rVar.o(rectF)) {
                return rVar.f6694a.a(rectF);
            }
            return -1.0f;
        }
        if (this.A) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float P() {
        if (X()) {
            return this.t.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private static int Q(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter R(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iK;
        if (colorStateList == null || mode == null) {
            if (!z || (iK = k((color = paint.getColor()))) == color) {
                return null;
            }
            return new PorterDuffColorFilter(iK, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private final RectF S() {
        RectF rectF = this.p;
        rectF.set(n());
        float fP = P();
        rectF.inset(fP, fP);
        return rectF;
    }

    private final void T(RectF rectF, Path path) {
        this.w.b(this.f6671f.f6653a.a(), this.D, this.f6671f.f6663k, rectF, this.v, path);
        if (this.f6671f.f6662j != 1.0f) {
            Matrix matrix = this.f6677l;
            matrix.reset();
            float f2 = this.f6671f.f6662j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.z, true);
    }

    private final void U(Canvas canvas, Paint paint, Path path, r rVar, float[] fArr, RectF rectF) {
        float fO = O(rectF, rVar, fArr);
        if (fO < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f2 = fO * this.f6671f.f6663k;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    private final void V(int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        RectF rectFN = n();
        if (!this.f6671f.f6653a.d() || rectFN.isEmpty()) {
            return;
        }
        boolean z4 = z | (this.C == null);
        if (this.D == null) {
            this.D = new float[4];
        }
        r rVarB = this.f6671f.f6653a.b(iArr);
        float[] fArr = this.D;
        int length = fArr.length;
        float f2 = fArr[0];
        int i2 = 1;
        while (true) {
            int length2 = fArr.length;
            if (i2 < 4) {
                if (fArr[i2] != f2) {
                    break;
                } else {
                    i2++;
                }
            } else if (rVarB.o(n())) {
                z2 = true;
            }
        }
        z2 = false;
        this.A = z2;
        if (!z2) {
            this.f6675j = true;
            this.f6676k = true;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            float fA = u.c(i3, rVarB).a(rectFN);
            if (z4) {
                this.D[i3] = fA;
                z3 = true;
            } else {
                z3 = false;
            }
            SpringAnimation springAnimation = this.f6669a[i3];
            if (springAnimation != null) {
                springAnimation.animateToFinalPosition(fA);
                if (z3) {
                    this.f6669a[i3].skipToEnd();
                }
            }
        }
        if (z4) {
            invalidateSelf();
        }
    }

    private final void W() {
        float fJ = j();
        this.f6671f.r = (int) Math.ceil(0.75f * fJ);
        this.f6671f.s = (int) Math.ceil(fJ * 0.25f);
        aa();
        if (Y()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    private final boolean X() {
        return (this.f6671f.v == Paint.Style.FILL_AND_STROKE || this.f6671f.v == Paint.Style.STROKE) && this.t.getStrokeWidth() > 0.0f;
    }

    private final boolean Y() {
        ab();
        return !E();
    }

    private final boolean Z(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.f6671f.f6656d != null && color2 != (colorForState2 = this.f6671f.f6656d.getColorForState(iArr, (color2 = (paint2 = this.s).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f6671f.f6657e == null || color == (colorForState = this.f6671f.f6657e.getColorForState(iArr, (color = (paint = this.t).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean aa() {
        PorterDuffColorFilter porterDuffColorFilter = this.x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        i iVar = this.f6671f;
        this.x = R(iVar.f6659g, iVar.f6660h, this.s, true);
        i iVar2 = this.f6671f;
        ColorStateList colorStateList = iVar2.f6658f;
        this.y = R(null, iVar2.f6660h, this.t, false);
        boolean z = this.f6671f.u;
        return (ObjectsCompat.equals(porterDuffColorFilter, this.x) && ObjectsCompat.equals(porterDuffColorFilter2, this.y)) ? false : true;
    }

    private final void ab() {
        i iVar = this.f6671f;
        int i2 = iVar.q;
        if (iVar.r <= 0 || E()) {
            return;
        }
        this.m.isConvex();
    }

    public final void A(float f2, ColorStateList colorStateList) {
        C(f2);
        B(colorStateList);
    }

    public final void B(ColorStateList colorStateList) {
        i iVar = this.f6671f;
        if (iVar.f6657e != colorStateList) {
            iVar.f6657e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void C(float f2) {
        this.f6671f.f6664l = f2;
        invalidateSelf();
    }

    public final boolean D() {
        com.google.android.material.e.a aVar = this.f6671f.f6654b;
        return aVar != null && aVar.b();
    }

    public final boolean E() {
        if (this.f6671f.f6653a.b(getState()).o(n())) {
            return this.D == null || this.A;
        }
        return false;
    }

    public final void K(int i2, int i3) {
        i iVar = this.f6671f;
        if (iVar.f6661i == null) {
            iVar.f6661i = new Rect();
        }
        this.f6671f.f6661i.set(0, i2, 0, i3);
        invalidateSelf();
    }

    public final void L() {
        this.u.a(-12303292);
        this.f6671f.u = false;
        super.invalidateSelf();
    }

    public final void N(com.google.firebase.messaging.l lVar) {
        this.F = lVar;
    }

    public final float b() {
        float fO = O(n(), this.f6671f.f6653a.a(), this.D);
        return fO >= 0.0f ? fO * this.f6671f.f6663k : fO;
    }

    public final float c() {
        float[] fArr = this.D;
        return fArr != null ? fArr[2] : this.f6671f.f6653a.a().f6697d.a(n());
    }

    public final float d() {
        float[] fArr = this.D;
        return fArr != null ? fArr[1] : this.f6671f.f6653a.a().f6696c.a(n());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.s;
        paint.setColorFilter(this.x);
        int alpha = paint.getAlpha();
        paint.setAlpha(Q(alpha, this.f6671f.m));
        Paint paint2 = this.t;
        paint2.setColorFilter(this.y);
        paint2.setStrokeWidth(this.f6671f.f6664l);
        int alpha2 = paint2.getAlpha();
        paint2.setAlpha(Q(alpha2, this.f6671f.m));
        boolean zY = Y();
        if (this.f6671f.v == Paint.Style.FILL_AND_STROKE || this.f6671f.v == Paint.Style.FILL) {
            if (this.f6675j) {
                if (zY) {
                    T(n(), this.m);
                }
                this.f6675j = false;
            }
            ab();
            U(canvas, paint, this.m, this.f6671f.f6653a.a(), this.D, n());
        }
        if (X()) {
            if (this.f6676k) {
                this.B = o().n(this.f6670e);
                if (this.D != null) {
                    if (this.E == null) {
                        this.E = new float[4];
                    }
                    float fP = P();
                    int i2 = 0;
                    while (true) {
                        float[] fArr = this.D;
                        int length = fArr.length;
                        if (i2 >= 4) {
                            break;
                        }
                        this.E[i2] = Math.max(0.0f, fArr[i2] - fP);
                        i2++;
                    }
                } else {
                    this.E = null;
                }
                if (zY) {
                    this.w.b(this.B, this.E, this.f6671f.f6663k, S(), null, this.n);
                }
                this.f6676k = false;
            }
            q(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // com.google.android.material.k.ac
    public final void e(r rVar) {
        this.f6671f.f6653a = rVar;
        this.D = null;
        this.E = null;
        invalidateSelf();
    }

    public final float f() {
        float[] fArr = this.D;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFN = n();
        return (((o().f6694a.a(rectFN) + o().f6697d.a(rectFN)) - o().f6696c.a(rectFN)) - u.c(0, o()).a(rectFN)) / 2.0f;
    }

    public final float g() {
        return this.f6671f.f6663k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f6671f.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6671f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i2 = this.f6671f.q;
        RectF rectFN = n();
        if (rectFN.isEmpty()) {
            return;
        }
        float fO = O(rectFN, this.f6671f.f6653a.a(), this.D);
        if (fO >= 0.0f) {
            outline.setRoundRect(getBounds(), fO * this.f6671f.f6663k);
            return;
        }
        if (this.f6675j) {
            T(rectFN, this.m);
            this.f6675j = false;
        }
        com.google.android.material.d.c.b(outline, this.m);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f6671f.f6661i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.q;
        region.set(getBounds());
        RectF rectFN = n();
        Path path = this.m;
        T(rectFN, path);
        Region region2 = this.r;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.D;
        return fArr != null ? fArr[3] : this.f6671f.f6653a.a().f6694a.a(n());
    }

    public final float i() {
        float[] fArr = this.D;
        return fArr != null ? fArr[0] : this.f6671f.f6653a.a().f6695b.a(n());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6675j = true;
        this.f6676k = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f6671f.f6659g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        i iVar = this.f6671f;
        ColorStateList colorStateList2 = iVar.f6658f;
        ColorStateList colorStateList3 = iVar.f6657e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f6671f.f6656d;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.f6671f.f6653a.d();
    }

    public final float j() {
        i iVar = this.f6671f;
        float f2 = iVar.o;
        float f3 = iVar.p;
        return f2 + 0.0f;
    }

    protected final int k(int i2) {
        float fJ = j();
        i iVar = this.f6671f;
        float f2 = fJ + iVar.n;
        com.google.android.material.e.a aVar = iVar.f6654b;
        return aVar != null ? aVar.a(i2, f2) : i2;
    }

    public final ColorStateList l() {
        return this.f6671f.f6656d;
    }

    public final Path m() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6671f = new i(this.f6671f);
        return this;
    }

    protected final RectF n() {
        RectF rectF = this.o;
        rectF.set(getBounds());
        return rectF;
    }

    public final r o() {
        return this.f6671f.f6653a.a();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f6675j = true;
        this.f6676k = true;
        super.onBoundsChange(rect);
        if (!this.f6671f.f6653a.d() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        SpringAnimation[] springAnimationArr = this.f6669a;
        int length = springAnimationArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < 4) {
                SpringAnimation springAnimation = springAnimationArr[i2];
                if (springAnimation != null && springAnimation.isRunning()) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        V(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.f6671f.f6653a.d()) {
            V(iArr, false);
        }
        boolean z = Z(iArr) || aa();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    protected void q(Canvas canvas) {
        U(canvas, this.t, this.n, this.B, this.E, S());
    }

    public final void r(Context context) {
        this.f6671f.f6654b = new com.google.android.material.e.a(context);
        W();
    }

    public final void s(float f2) {
        e(this.f6671f.f6653a.c(f2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        i iVar = this.f6671f;
        if (iVar.m != i2) {
            iVar.m = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6671f.f6655c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f6671f.f6659g = colorStateList;
        aa();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        i iVar = this.f6671f;
        if (iVar.f6660h != mode) {
            iVar.f6660h = mode;
            aa();
            super.invalidateSelf();
        }
    }

    public final void t(SpringForce springForce) {
        if (this.C == springForce) {
            return;
        }
        this.C = springForce;
        int i2 = 0;
        while (true) {
            SpringAnimation[] springAnimationArr = this.f6669a;
            int length = springAnimationArr.length;
            if (i2 >= 4) {
                V(getState(), true);
                invalidateSelf();
                return;
            }
            if (springAnimationArr[i2] == null) {
                springAnimationArr[i2] = new SpringAnimation(this, f6668d[i2]);
            }
            SpringAnimation springAnimation = this.f6669a[i2];
            SpringForce springForce2 = new SpringForce();
            springForce2.setDampingRatio(springForce.getDampingRatio());
            springForce2.setStiffness(springForce.getStiffness());
            springAnimation.setSpring(springForce2);
            i2++;
        }
    }

    public final void u(float f2) {
        i iVar = this.f6671f;
        if (iVar.o != f2) {
            iVar.o = f2;
            W();
        }
    }

    public final void v(ColorStateList colorStateList) {
        i iVar = this.f6671f;
        if (iVar.f6656d != colorStateList) {
            iVar.f6656d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void w(float f2) {
        i iVar = this.f6671f;
        if (iVar.f6663k != f2) {
            iVar.f6663k = f2;
            this.f6675j = true;
            this.f6676k = true;
            invalidateSelf();
        }
    }

    public final void x(float f2) {
        i iVar = this.f6671f;
        if (iVar.n != f2) {
            iVar.n = f2;
            W();
        }
    }

    public final void y(o oVar) {
        if (oVar instanceof r) {
            e((r) oVar);
            return;
        }
        ae aeVar = (ae) oVar;
        i iVar = this.f6671f;
        if (iVar.f6653a != aeVar) {
            iVar.f6653a = aeVar;
            V(getState(), true);
            invalidateSelf();
        }
    }

    public final void z(float f2, int i2) {
        C(f2);
        B(ColorStateList.valueOf(i2));
    }

    public k(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(new r(r.m(context, attributeSet, i2, i3), null));
    }

    public k() {
        this(new r());
    }

    public k(o oVar) {
        this(new i(oVar));
    }

    public k(r rVar) {
        this(new i(rVar));
    }
}
