package R7;

import W7.h;
import W7.i;
import a8.AbstractC1340a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import b1.AbstractC1492a;
import c1.InterfaceC1545a;
import c8.C1577a;
import c8.C1582f;
import c8.C1583g;
import c8.C1586j;
import com.google.android.material.chip.Chip;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class f extends C1583g implements Drawable.Callback, h {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f10376F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f10377G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f10378A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f10379A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f10380B;
    public TextUtils.TruncateAt B0;

    /* renamed from: C, reason: collision with root package name */
    public float f10381C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f10382C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f10383D;

    /* renamed from: D0, reason: collision with root package name */
    public int f10384D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f10385E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f10386E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f10387F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f10388G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f10389H;

    /* renamed from: I, reason: collision with root package name */
    public float f10390I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10391J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10392K;
    public Drawable L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f10393M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f10394N;

    /* renamed from: O, reason: collision with root package name */
    public float f10395O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f10396P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f10397Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f10398R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f10399S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f10400T;

    /* renamed from: U, reason: collision with root package name */
    public J7.b f10401U;

    /* renamed from: V, reason: collision with root package name */
    public J7.b f10402V;

    /* renamed from: W, reason: collision with root package name */
    public float f10403W;

    /* renamed from: X, reason: collision with root package name */
    public float f10404X;

    /* renamed from: Y, reason: collision with root package name */
    public float f10405Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f10406Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f10407a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f10408b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f10409c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f10410d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f10411e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f10412f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f10413g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f10414h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f10415i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f10416j0;

    /* renamed from: k0, reason: collision with root package name */
    public final i f10417k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f10418l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f10419m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f10420n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f10421o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f10422p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f10423q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f10424r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f10425s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f10426t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f10427u0;
    public PorterDuffColorFilter v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f10428w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f10429x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f10430x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f10431y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f10432y0;

    /* renamed from: z, reason: collision with root package name */
    public float f10433z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f10434z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action);
        this.f10378A = -1.0f;
        this.f10412f0 = new Paint(1);
        this.f10413g0 = new Paint.FontMetrics();
        this.f10414h0 = new RectF();
        this.f10415i0 = new PointF();
        this.f10416j0 = new Path();
        this.f10426t0 = 255;
        this.f10430x0 = PorterDuff.Mode.SRC_IN;
        this.f10379A0 = new WeakReference(null);
        h(context);
        this.f10411e0 = context;
        i iVar = new i(this);
        this.f10417k0 = iVar;
        this.f10385E = "";
        iVar.f15270a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f10376F0;
        setState(iArr);
        if (!Arrays.equals(this.f10432y0, iArr)) {
            this.f10432y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f10382C0 = true;
        int[] iArr2 = AbstractC1340a.f17397a;
        f10377G0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f10) {
        if (this.f10378A != f10) {
            this.f10378A = f10;
            C1586j c1586jE = this.f19729a.f19713a.e();
            c1586jE.f19755e = new C1577a(f10);
            c1586jE.f19756f = new C1577a(f10);
            c1586jE.f19757g = new C1577a(f10);
            c1586jE.f19758h = new C1577a(f10);
            setShapeAppearanceModel(c1586jE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f10388G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC1545a;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fP = p();
            this.f10388G = drawable != null ? drawable.mutate() : null;
            float fP2 = p();
            U(drawable2);
            if (S()) {
                n(this.f10388G);
            }
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void C(float f10) {
        if (this.f10390I != f10) {
            float fP = p();
            this.f10390I = f10;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f10391J = true;
        if (this.f10389H != colorStateList) {
            this.f10389H = colorStateList;
            if (S()) {
                this.f10388G.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.f10387F != z2) {
            boolean zS = S();
            this.f10387F = z2;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    n(this.f10388G);
                } else {
                    U(this.f10388G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f10380B != colorStateList) {
            this.f10380B = colorStateList;
            if (this.f10386E0) {
                C1582f c1582f = this.f19729a;
                if (c1582f.f19716d != colorStateList) {
                    c1582f.f19716d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f10) {
        if (this.f10381C != f10) {
            this.f10381C = f10;
            this.f10412f0.setStrokeWidth(f10);
            if (this.f10386E0) {
                this.f19729a.f19722j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC1545a;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fQ = q();
            this.L = drawable != null ? drawable.mutate() : null;
            int[] iArr = AbstractC1340a.f17397a;
            this.f10393M = new RippleDrawable(AbstractC1340a.a(this.f10383D), this.L, f10377G0);
            float fQ2 = q();
            U(drawable2);
            if (T()) {
                n(this.L);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public final void I(float f10) {
        if (this.f10409c0 != f10) {
            this.f10409c0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f10) {
        if (this.f10395O != f10) {
            this.f10395O = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f10) {
        if (this.f10408b0 != f10) {
            this.f10408b0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f10394N != colorStateList) {
            this.f10394N = colorStateList;
            if (T()) {
                this.L.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f10392K != z2) {
            boolean zT = T();
            this.f10392K = z2;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    n(this.L);
                } else {
                    U(this.L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f10) {
        if (this.f10405Y != f10) {
            float fP = p();
            this.f10405Y = f10;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void O(float f10) {
        if (this.f10404X != f10) {
            float fP = p();
            this.f10404X = f10;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f10383D != colorStateList) {
            this.f10383D = colorStateList;
            this.f10434z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(Z7.d dVar) {
        i iVar = this.f10417k0;
        if (iVar.f15275f != dVar) {
            iVar.f15275f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f15270a;
                Context context = this.f10411e0;
                b bVar = iVar.f15271b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f15274e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.f15273d = true;
            }
            h hVar2 = (h) iVar.f15274e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f10398R && this.f10399S != null && this.f10424r0;
    }

    public final boolean S() {
        return this.f10387F && this.f10388G != null;
    }

    public final boolean T() {
        return this.f10392K && this.L != null;
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i5;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float fMeasureText;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i5 = this.f10426t0) == 0) {
            return;
        }
        if (i5 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i5);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z2 = this.f10386E0;
        Paint paint = this.f10412f0;
        RectF rectF = this.f10414h0;
        if (!z2) {
            paint.setColor(this.f10418l0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.f10386E0) {
            paint.setColor(this.f10419m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f10427u0;
            if (colorFilter == null) {
                colorFilter = this.v0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.f10386E0) {
            super.draw(canvas);
        }
        if (this.f10381C > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.f10386E0) {
            paint.setColor(this.f10421o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f10386E0) {
                ColorFilter colorFilter2 = this.f10427u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f10 = bounds.left;
            float f11 = this.f10381C / 2.0f;
            rectF.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
            float f12 = this.f10378A - (this.f10381C / 2.0f);
            canvas2.drawRoundRect(rectF, f12, f12, paint);
        }
        paint.setColor(this.f10422p0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f10386E0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f10416j0;
            C1582f c1582f = this.f19729a;
            this.f19745r.c(c1582f.f19713a, c1582f.f19721i, rectF2, this.f19744q, path);
            d(canvas2, paint, path, this.f19729a.f19713a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f10388G.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f10388G.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (R()) {
            o(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f10399S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f10399S.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f10382C0 && this.f10385E != null) {
            PointF pointF = this.f10415i0;
            pointF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f10385E;
            i iVar = this.f10417k0;
            if (charSequence != null) {
                float fP = p() + this.f10403W + this.f10406Z;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fP;
                } else {
                    pointF.x = bounds.right - fP;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = iVar.f15270a;
                Paint.FontMetrics fontMetrics = this.f10413g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f10385E != null) {
                float fP2 = p() + this.f10403W + this.f10406Z;
                float fQ = q() + this.f10410d0 + this.f10407a0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fP2;
                    rectF.right = bounds.right - fQ;
                } else {
                    rectF.left = bounds.left + fQ;
                    rectF.right = bounds.right - fP2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            Z7.d dVar = iVar.f15275f;
            TextPaint textPaint2 = iVar.f15270a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f15275f.e(this.f10411e0, textPaint2, iVar.f15271b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f10385E.toString();
            if (iVar.f15273d) {
                fMeasureText = string == null ? 0.0f : textPaint2.measureText((CharSequence) string, 0, string.length());
                iVar.f15272c = fMeasureText;
                iVar.f15273d = false;
            } else {
                fMeasureText = iVar.f15272c;
            }
            boolean z10 = Math.round(fMeasureText) > Math.round(rectF.width());
            if (z10) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i10 = iSave;
            } else {
                i10 = 0;
            }
            CharSequence charSequenceEllipsize = this.f10385E;
            if (z10 && this.B0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.B0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z10) {
                canvas2.restoreToCount(i10);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f17 = this.f10410d0 + this.f10409c0;
                if (getLayoutDirection() == 0) {
                    float f18 = bounds.right - f17;
                    rectF.right = f18;
                    rectF.left = f18 - this.f10395O;
                } else {
                    float f19 = bounds.left + f17;
                    rectF.left = f19;
                    rectF.right = f19 + this.f10395O;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f20 = this.f10395O;
                float f21 = fExactCenterY - (f20 / 2.0f);
                rectF.top = f21;
                rectF.bottom = f21 + f20;
            }
            float f22 = rectF.left;
            float f23 = rectF.top;
            canvas2.translate(f22, f23);
            this.L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC1340a.f17397a;
            this.f10393M.setBounds(this.L.getBounds());
            this.f10393M.jumpToCurrentState();
            this.f10393M.draw(canvas2);
            canvas2.translate(-f22, -f23);
        }
        if (this.f10426t0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10426t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f10427u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f10433z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fMeasureText;
        float fP = p() + this.f10403W + this.f10406Z;
        String string = this.f10385E.toString();
        i iVar = this.f10417k0;
        if (iVar.f15273d) {
            fMeasureText = string == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : iVar.f15270a.measureText((CharSequence) string, 0, string.length());
            iVar.f15272c = fMeasureText;
            iVar.f15273d = false;
        } else {
            fMeasureText = iVar.f15272c;
        }
        return Math.min(Math.round(q() + fMeasureText + fP + this.f10407a0 + this.f10410d0), this.f10384D0);
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f10386E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f10433z, this.f10378A);
        } else {
            outline.setRoundRect(bounds, this.f10378A);
            outline2 = outline;
        }
        outline2.setAlpha(this.f10426t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f10429x) || s(this.f10431y) || s(this.f10380B)) {
            return true;
        }
        Z7.d dVar = this.f10417k0.f15275f;
        if (dVar == null || (colorStateList = dVar.f17028j) == null || !colorStateList.isStateful()) {
            return (this.f10398R && this.f10399S != null && this.f10397Q) || t(this.f10388G) || t(this.f10399S) || s(this.f10428w0);
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f10432y0);
            }
            drawable.setTintList(this.f10394N);
            return;
        }
        Drawable drawable2 = this.f10388G;
        if (drawable == drawable2 && this.f10391J) {
            drawable2.setTintList(this.f10389H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f10 = this.f10403W + this.f10404X;
            Drawable drawable = this.f10424r0 ? this.f10399S : this.f10388G;
            float intrinsicWidth = this.f10390I;
            if (intrinsicWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.f10424r0 ? this.f10399S : this.f10388G;
            float fCeil = this.f10390I;
            if (fCeil <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f10411e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i5) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i5);
        if (S()) {
            zOnLayoutDirectionChanged |= this.f10388G.setLayoutDirection(i5);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= this.f10399S.setLayoutDirection(i5);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= this.L.setLayoutDirection(i5);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        boolean zOnLevelChange = super.onLevelChange(i5);
        if (S()) {
            zOnLevelChange |= this.f10388G.setLevel(i5);
        }
        if (R()) {
            zOnLevelChange |= this.f10399S.setLevel(i5);
        }
        if (T()) {
            zOnLevelChange |= this.L.setLevel(i5);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f10386E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f10432y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = this.f10404X;
        Drawable drawable = this.f10424r0 ? this.f10399S : this.f10388G;
        float intrinsicWidth = this.f10390I;
        if (intrinsicWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f10405Y;
    }

    public final float q() {
        return T() ? this.f10408b0 + this.f10395O + this.f10409c0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float r() {
        return this.f10386E0 ? this.f19729a.f19713a.f19766e.a(f()) : this.f10378A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (this.f10426t0 != i5) {
            this.f10426t0 = i5;
            invalidateSelf();
        }
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f10427u0 != colorFilter) {
            this.f10427u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f10428w0 != colorStateList) {
            this.f10428w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // c8.C1583g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f10430x0 != mode) {
            this.f10430x0 = mode;
            ColorStateList colorStateList = this.f10428w0;
            this.v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        boolean visible = super.setVisible(z2, z10);
        if (S()) {
            visible |= this.f10388G.setVisible(z2, z10);
        }
        if (R()) {
            visible |= this.f10399S.setVisible(z2, z10);
        }
        if (T()) {
            visible |= this.L.setVisible(z2, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f10379A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f26882p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z10;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f10429x;
        int iB = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f10418l0) : 0);
        if (this.f10418l0 != iB) {
            this.f10418l0 = iB;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f10431y;
        int iB2 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f10419m0) : 0);
        if (this.f10419m0 != iB2) {
            this.f10419m0 = iB2;
            zOnStateChange = true;
        }
        int iB3 = AbstractC1492a.b(iB2, iB);
        if ((this.f10420n0 != iB3) | (this.f19729a.f19715c == null)) {
            this.f10420n0 = iB3;
            j(ColorStateList.valueOf(iB3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f10380B;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f10421o0) : 0;
        if (this.f10421o0 != colorForState) {
            this.f10421o0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f10434z0 == null || !AbstractC1340a.b(iArr)) ? 0 : this.f10434z0.getColorForState(iArr, this.f10422p0);
        if (this.f10422p0 != colorForState2) {
            this.f10422p0 = colorForState2;
        }
        Z7.d dVar = this.f10417k0.f15275f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f17028j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f10423q0);
        if (this.f10423q0 != colorForState3) {
            this.f10423q0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z2 = false;
        } else {
            int length = state2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (state2[i5] != 16842912) {
                    i5++;
                } else if (this.f10397Q) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (this.f10424r0 == z2 || this.f10399S == null) {
            z10 = false;
        } else {
            float fP = p();
            this.f10424r0 = z2;
            if (fP != p()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                zOnStateChange = true;
                z10 = false;
            }
        }
        ColorStateList colorStateList5 = this.f10428w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f10425s0) : 0;
        if (this.f10425s0 != colorForState4) {
            this.f10425s0 = colorForState4;
            ColorStateList colorStateList6 = this.f10428w0;
            PorterDuff.Mode mode = this.f10430x0;
            this.v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (t(this.f10388G)) {
            state |= this.f10388G.setState(iArr);
        }
        if (t(this.f10399S)) {
            state |= this.f10399S.setState(iArr);
        }
        if (t(this.L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.L.setState(iArr3);
        }
        int[] iArr4 = AbstractC1340a.f17397a;
        if (t(this.f10393M)) {
            state |= this.f10393M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            u();
        }
        return state;
    }

    public final void w(boolean z2) {
        if (this.f10397Q != z2) {
            this.f10397Q = z2;
            float fP = p();
            if (!z2 && this.f10424r0) {
                this.f10424r0 = false;
            }
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f10399S != drawable) {
            float fP = p();
            this.f10399S = drawable;
            float fP2 = p();
            U(this.f10399S);
            n(this.f10399S);
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f10400T != colorStateList) {
            this.f10400T = colorStateList;
            if (this.f10398R && (drawable = this.f10399S) != null && this.f10397Q) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f10398R != z2) {
            boolean zR = R();
            this.f10398R = z2;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    n(this.f10399S);
                } else {
                    U(this.f10399S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
