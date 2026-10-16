package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {
    private CharSequence A;
    private CharSequence B;
    private boolean C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private int J;
    private int[] K;
    private boolean L;
    private final TextPaint M;
    private final TextPaint N;
    private TimeInterpolator O;
    private TimeInterpolator P;
    private float Q;
    private float R;
    private float S;
    private ColorStateList T;
    private float U;
    private float V;
    private float W;
    private StaticLayout X;
    private float Y;
    private float Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f6581a;
    private float aa;
    private CharSequence ab;
    private boolean ag;
    private com.google.android.material.h.e ah;

    /* renamed from: b, reason: collision with root package name */
    private float f6582b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f6583c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6584d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f6585e;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f6590j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f6591k;

    /* renamed from: l, reason: collision with root package name */
    private int f6592l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private Typeface v;
    private Typeface w;
    private Typeface x;
    private Typeface y;

    /* renamed from: f, reason: collision with root package name */
    private int f6586f = 16;

    /* renamed from: g, reason: collision with root package name */
    private int f6587g = 16;

    /* renamed from: h, reason: collision with root package name */
    private float f6588h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f6589i = 15.0f;
    private final TextUtils.TruncateAt z = TextUtils.TruncateAt.END;
    private int ac = 1;
    private int ad = 1;
    private int ae = -1;
    private int af = -1;

    public f(View view) {
        this.f6581a = view;
        TextPaint textPaint = new TextPaint(129);
        this.M = textPaint;
        this.N = new TextPaint(textPaint);
        this.f6584d = new Rect();
        this.f6583c = new Rect();
        this.f6585e = new RectF();
        m(view.getContext().getResources().getConfiguration());
    }

    private static float I(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        TimeInterpolator timeInterpolator2 = com.google.android.material.a.a.f6173a;
        return f2 + (f4 * (f3 - f2));
    }

    private static int J(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f3) + (Color.alpha(i3) * f2)), Math.round((Color.red(i2) * f3) + (Color.red(i3) * f2)), Math.round((Color.green(i2) * f3) + (Color.green(i3) * f2)), Math.round((Color.blue(i2) * f3) + (Color.blue(i3) * f2)));
    }

    private final int K(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.K;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final StaticLayout L(int i2, TextPaint textPaint, CharSequence charSequence, float f2, boolean z) {
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        StaticLayout staticLayoutA = null;
        int i3 = 1;
        try {
            if (i2 == 1) {
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f6586f, this.C ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.C;
                    if (absoluteGravity != 5) {
                        alignment = z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        if (z2) {
                        }
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                Layout.Alignment alignment3 = alignment;
                i3 = i2;
                alignment2 = alignment3;
            }
            l lVarB = l.b(charSequence, textPaint, (int) f2);
            lVarB.d(this.z);
            lVarB.f(z);
            lVarB.c(alignment2);
            lVarB.e(false);
            lVarB.h(i3);
            lVarB.g(0.0f, 1.0f);
            lVarB.i();
            lVarB.j(null);
            staticLayoutA = lVarB.a();
        } catch (k e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
        }
        Preconditions.checkNotNull(staticLayoutA);
        return staticLayoutA;
    }

    private final void M() {
        Rect rect = this.f6583c;
        float f2 = this.f6582b;
        float f3 = rect.left;
        Rect rect2 = this.f6584d;
        float fI = I(f3, rect2.left, f2, this.O);
        RectF rectF = this.f6585e;
        rectF.left = fI;
        rectF.top = I(this.m, this.n, f2, this.O);
        rectF.right = I(rect.right, rect2.right, f2, this.O);
        rectF.bottom = I(rect.bottom, rect2.bottom, f2, this.O);
        this.q = I(this.o, this.p, f2, this.O);
        this.r = I(this.m, this.n, f2, this.O);
        Q(f2);
        float f4 = this.U;
        float f5 = this.V;
        TextPaint textPaint = this.M;
        if (f4 != f5) {
            textPaint.setLetterSpacing(I(f5, f4, f2, com.google.android.material.a.a.f6174b));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        TimeInterpolator timeInterpolator = com.google.android.material.a.a.f6174b;
        this.Z = 1.0f - I(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.f6581a;
        view.postInvalidateOnAnimation();
        this.aa = I(1.0f, 0.0f, f2, timeInterpolator);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f6591k;
        ColorStateList colorStateList2 = this.f6590j;
        TextPaint textPaint2 = this.M;
        if (colorStateList != colorStateList2) {
            textPaint2.setColor(J(K(colorStateList2), g(), f2));
        } else {
            textPaint2.setColor(g());
        }
        this.F = I(0.0f, this.Q, f2, null);
        this.G = I(0.0f, this.R, f2, null);
        this.H = I(0.0f, this.S, f2, null);
        int iJ = J(K(null), K(this.T), f2);
        this.I = iJ;
        this.M.setShadowLayer(this.F, this.G, this.H, iJ);
        view.postInvalidateOnAnimation();
    }

    private final void N(float f2, boolean z) {
        Typeface typeface;
        float f3;
        float f4;
        if (this.A == null) {
            return;
        }
        float fWidth = this.f6584d.width();
        float fWidth2 = this.f6583c.width();
        if (S(f2, 1.0f)) {
            f3 = W() ? this.f6589i : this.f6588h;
            f4 = W() ? this.U : this.V;
            this.D = W() ? 1.0f : I(this.f6588h, this.f6589i, f2, this.P) / this.f6588h;
            if (true != W()) {
                fWidth = fWidth2;
            }
            typeface = this.s;
            fWidth2 = fWidth;
        } else {
            float f5 = this.f6588h;
            float f6 = this.V;
            typeface = this.v;
            if (S(f2, 0.0f)) {
                this.D = 1.0f;
            } else {
                this.D = I(this.f6588h, this.f6589i, f2, this.P) / this.f6588h;
            }
            float f7 = this.f6589i / this.f6588h;
            float f8 = fWidth2 * f7;
            if (!z && f8 > fWidth && W()) {
                fWidth2 = Math.min(fWidth / f7, fWidth2);
            }
            f3 = f5;
            f4 = f6;
        }
        int i2 = f2 < 0.5f ? this.ac : this.ad;
        if (fWidth2 > 0.0f) {
            float f9 = this.E;
            float f10 = this.W;
            Typeface typeface2 = this.y;
            StaticLayout staticLayout = this.X;
            boolean z2 = (f9 == f3 && f10 == f4 && !(staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.J == i2 && !this.L) ? false : true;
            this.E = f3;
            this.W = f4;
            this.y = typeface;
            this.L = false;
            this.J = i2;
            this.M.setLinearText(this.D != 1.0f);
            z = z2;
        }
        if (this.B == null || z) {
            TextPaint textPaint = this.M;
            textPaint.setTextSize(this.E);
            textPaint.setTypeface(this.y);
            textPaint.setLetterSpacing(this.W);
            boolean zR = R(this.A);
            this.C = zR;
            StaticLayout staticLayoutL = L(true != V() ? 1 : i2, textPaint, this.A, fWidth2 * (W() ? 1.0f : this.D), zR);
            this.X = staticLayoutL;
            this.B = staticLayoutL.getText();
        }
    }

    private final void O(TextPaint textPaint) {
        textPaint.setTextSize(this.f6589i);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.U);
    }

    private final void P(TextPaint textPaint) {
        textPaint.setTextSize(this.f6588h);
        textPaint.setTypeface(this.v);
        textPaint.setLetterSpacing(this.V);
    }

    private final void Q(float f2) {
        N(f2, false);
        this.f6581a.postInvalidateOnAnimation();
    }

    private final boolean R(CharSequence charSequence) {
        return (this.f6581a.getLayoutDirection() == 1 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private static boolean S(float f2, float f3) {
        return Math.abs(f2 - f3) < 1.0E-5f;
    }

    private static boolean T(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private final boolean U(Typeface typeface) {
        com.google.android.material.h.e eVar = this.ah;
        if (eVar != null) {
            eVar.a();
        }
        if (this.u == typeface) {
            return false;
        }
        this.u = typeface;
        Typeface typefaceL = t.l(this.f6581a.getContext().getResources().getConfiguration(), typeface);
        this.t = typefaceL;
        if (typefaceL == null) {
            typefaceL = this.u;
        }
        this.s = typefaceL;
        return true;
    }

    private final boolean V() {
        return (this.ac > 1 || this.ad > 1) && !this.C;
    }

    private final boolean W() {
        return this.ad == 1;
    }

    private static final float X(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void A(float f2) {
        if (this.f6588h != f2) {
            this.f6588h = f2;
            n();
        }
    }

    public final void B(float f2) {
        float fClamp = MathUtils.clamp(f2, 0.0f, 1.0f);
        if (fClamp != this.f6582b) {
            this.f6582b = fClamp;
            M();
        }
    }

    public final void C(TimeInterpolator timeInterpolator) {
        this.O = timeInterpolator;
        n();
    }

    public final void D(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.A, charSequence)) {
            this.A = charSequence;
            this.B = null;
            n();
        }
    }

    public final void E(TimeInterpolator timeInterpolator) {
        this.P = timeInterpolator;
        n();
    }

    public final void F(Typeface typeface) {
        boolean z;
        boolean zU = U(typeface);
        if (this.x != typeface) {
            this.x = typeface;
            Typeface typefaceL = t.l(this.f6581a.getContext().getResources().getConfiguration(), typeface);
            this.w = typefaceL;
            if (typefaceL == null) {
                typefaceL = this.x;
            }
            this.v = typefaceL;
            z = true;
        } else {
            z = false;
        }
        if (zU || z) {
            n();
        }
    }

    public final void G(int i2) {
        TextPaint textPaint = this.N;
        O(textPaint);
        float f2 = i2;
        this.ae = L(this.ad, textPaint, this.A, f2 * (this.f6589i / this.f6588h), this.C).getHeight();
        P(textPaint);
        this.af = L(this.ac, textPaint, this.A, f2, this.C).getHeight();
    }

    public final boolean H(int[] iArr) {
        ColorStateList colorStateList;
        this.K = iArr;
        ColorStateList colorStateList2 = this.f6591k;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f6590j) == null || !colorStateList.isStateful())) {
            return false;
        }
        n();
        return true;
    }

    public final float a() {
        TextPaint textPaint = this.N;
        O(textPaint);
        return -textPaint.ascent();
    }

    public final float b() {
        int i2 = this.ae;
        return i2 != -1 ? i2 : a();
    }

    public final float c() {
        TextPaint textPaint = this.N;
        P(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float d() {
        int i2 = this.af;
        return i2 != -1 ? i2 : e();
    }

    public final float e() {
        TextPaint textPaint = this.N;
        P(textPaint);
        return -textPaint.ascent();
    }

    public final float f() {
        return this.f6582b;
    }

    public final int g() {
        return K(this.f6591k);
    }

    public final int h() {
        return this.f6592l;
    }

    public final int i() {
        return this.ac;
    }

    public final ColorStateList j() {
        return this.f6591k;
    }

    public final void k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.B != null) {
            RectF rectF = this.f6585e;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.M;
            textPaint.setTextSize(this.E);
            float f2 = this.q;
            float f3 = this.r;
            float f4 = this.D;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (V() && W()) {
                float lineStart = this.q - this.X.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f3);
                float f5 = alpha;
                textPaint.setAlpha((int) (this.aa * f5));
                if (Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.F, this.G, this.H, com.google.android.material.focus.d.a(this.I, textPaint.getAlpha()));
                }
                this.X.draw(canvas);
                textPaint.setAlpha((int) (this.Z * f5));
                if (Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.F, this.G, this.H, com.google.android.material.focus.d.a(this.I, textPaint.getAlpha()));
                }
                int lineBaseline = this.X.getLineBaseline(0);
                CharSequence charSequence = this.ab;
                float f6 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
                if (Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.F, this.G, this.H, this.I);
                }
                String strTrim = this.ab.toString().trim();
                if (strTrim.endsWith("…")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                String str = strTrim;
                textPaint.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.X.getLineEnd(0), str.length()), 0.0f, f6, (Paint) textPaint);
                canvas = canvas;
            } else {
                canvas.translate(f2, f3);
                this.X.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.RectF r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.f.l(android.graphics.RectF, int, int):void");
    }

    public final void m(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.u;
            if (typeface != null) {
                this.t = t.l(configuration, typeface);
            }
            Typeface typeface2 = this.x;
            if (typeface2 != null) {
                this.w = t.l(configuration, typeface2);
            }
            Typeface typeface3 = this.t;
            if (typeface3 == null) {
                typeface3 = this.u;
            }
            this.s = typeface3;
            Typeface typeface4 = this.w;
            if (typeface4 == null) {
                typeface4 = this.x;
            }
            this.v = typeface4;
            o(true);
        }
    }

    public final void n() {
        o(false);
    }

    public final void o(boolean z) {
        float fX;
        StaticLayout staticLayout;
        View view = this.f6581a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        N(1.0f, z);
        CharSequence charSequenceEllipsize = this.B;
        if (charSequenceEllipsize != null && (staticLayout = this.X) != null) {
            if (W()) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.M, staticLayout.getWidth(), this.z);
            }
            this.ab = charSequenceEllipsize;
        }
        CharSequence charSequence = this.ab;
        if (charSequence != null) {
            this.Y = X(this.M, charSequence);
        } else {
            this.Y = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f6587g, this.C ? 1 : 0);
        Rect rect = this.f6584d;
        int i2 = absoluteGravity & 112;
        if (i2 == 48) {
            this.n = rect.top;
        } else if (i2 != 80) {
            TextPaint textPaint = this.M;
            this.n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.n = rect.bottom + this.M.ascent();
        }
        int i3 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i3 == 1) {
            this.p = rect.centerX() - (this.Y / 2.0f);
        } else if (i3 != 5) {
            this.p = rect.left;
        } else {
            this.p = rect.right - this.Y;
        }
        if (this.Y <= rect.width()) {
            float fMax = this.p + Math.max(0.0f, rect.left - this.p);
            this.p = fMax;
            this.p = fMax + Math.min(0.0f, rect.right - (this.p + this.Y));
        }
        TextPaint textPaint2 = this.N;
        O(textPaint2);
        if ((-textPaint2.ascent()) + textPaint2.descent() <= rect.height()) {
            float fMax2 = this.n + Math.max(0.0f, rect.top - this.n);
            this.n = fMax2;
            this.n = fMax2 + Math.min(0.0f, rect.bottom - (this.n + b()));
        }
        N(0.0f, z);
        float height = this.X != null ? r13.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.X;
        if (staticLayout2 == null || this.ac <= 1) {
            CharSequence charSequence2 = this.B;
            fX = charSequence2 != null ? X(this.M, charSequence2) : 0.0f;
        } else {
            fX = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.X;
        this.f6592l = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f6586f, this.C ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        if (i4 != 48) {
            Rect rect2 = this.f6583c;
            if (i4 != 80) {
                this.m = rect2.centerY() - (height / 2.0f);
            } else {
                this.m = (rect2.bottom - height) + (this.ag ? this.M.descent() : 0.0f);
            }
        } else {
            this.m = this.f6583c.top;
        }
        int i5 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i5 != 1) {
            Rect rect3 = this.f6583c;
            if (i5 != 5) {
                this.o = rect3.left;
            } else {
                this.o = rect3.right - fX;
            }
        } else {
            this.o = this.f6583c.centerX() - (fX / 2.0f);
        }
        Q(this.f6582b);
        M();
    }

    public final void p(ColorStateList colorStateList) {
        if (this.f6591k == colorStateList && this.f6590j == colorStateList) {
            return;
        }
        this.f6591k = colorStateList;
        this.f6590j = colorStateList;
        n();
    }

    public final void q(Rect rect) {
        Rect rect2 = this.f6584d;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (T(rect2, i2, i3, i4, i5)) {
            return;
        }
        rect2.set(i2, i3, i4, i5);
        this.L = true;
    }

    public final void r(int i2) {
        if (i2 != this.ad) {
            this.ad = i2;
            n();
        }
    }

    public final void s(int i2) {
        View view = this.f6581a;
        com.google.android.material.h.d dVar = new com.google.android.material.h.d(view.getContext(), i2);
        if (dVar.b() != null) {
            this.f6591k = dVar.b();
        }
        if (dVar.a() != 0.0f) {
            this.f6589i = dVar.a();
        }
        ColorStateList colorStateList = dVar.f6548a;
        if (colorStateList != null) {
            this.T = colorStateList;
        }
        this.R = dVar.f6552e;
        this.S = dVar.f6553f;
        this.Q = dVar.f6554g;
        this.U = dVar.f6555h;
        com.google.android.material.h.e eVar = this.ah;
        if (eVar != null) {
            eVar.a();
        }
        this.ah = new com.google.android.material.h.e(new e(this), dVar.d());
        dVar.f(view.getContext(), this.ah);
        n();
    }

    public final void t(ColorStateList colorStateList) {
        if (this.f6591k != colorStateList) {
            this.f6591k = colorStateList;
            n();
        }
    }

    public final void u(int i2) {
        if (this.f6587g != i2) {
            this.f6587g = i2;
            n();
        }
    }

    public final void v(Typeface typeface) {
        if (U(typeface)) {
            n();
        }
    }

    public final void w(int i2, int i3, int i4, int i5) {
        Rect rect = this.f6583c;
        if (T(rect, i2, i3, i4, i5) && this.ag) {
            return;
        }
        rect.set(i2, i3, i4, i5);
        this.L = true;
        this.ag = true;
    }

    public final void x(float f2) {
        if (this.V != f2) {
            this.V = f2;
            n();
        }
    }

    public final void y(int i2) {
        if (i2 != this.ac) {
            this.ac = i2;
            n();
        }
    }

    public final void z(int i2) {
        if (this.f6586f != i2) {
            this.f6586f = i2;
            n();
        }
    }
}
