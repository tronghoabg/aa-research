package W7;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f15196A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f15197B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15198C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f15200E;

    /* renamed from: F, reason: collision with root package name */
    public float f15201F;

    /* renamed from: G, reason: collision with root package name */
    public float f15202G;

    /* renamed from: H, reason: collision with root package name */
    public float f15203H;

    /* renamed from: I, reason: collision with root package name */
    public float f15204I;

    /* renamed from: J, reason: collision with root package name */
    public float f15205J;

    /* renamed from: K, reason: collision with root package name */
    public int f15206K;
    public int[] L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f15207M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f15208N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f15209O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f15210P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f15211Q;

    /* renamed from: R, reason: collision with root package name */
    public float f15212R;

    /* renamed from: S, reason: collision with root package name */
    public float f15213S;

    /* renamed from: T, reason: collision with root package name */
    public float f15214T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f15215U;

    /* renamed from: V, reason: collision with root package name */
    public float f15216V;

    /* renamed from: W, reason: collision with root package name */
    public float f15217W;

    /* renamed from: X, reason: collision with root package name */
    public float f15218X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f15219Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f15220Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f15221a;

    /* renamed from: a0, reason: collision with root package name */
    public float f15222a0;

    /* renamed from: b, reason: collision with root package name */
    public float f15223b;

    /* renamed from: b0, reason: collision with root package name */
    public float f15224b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f15225c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f15226c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f15227d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f15229e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f15236j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public float f15237l;

    /* renamed from: m, reason: collision with root package name */
    public float f15238m;

    /* renamed from: n, reason: collision with root package name */
    public float f15239n;

    /* renamed from: o, reason: collision with root package name */
    public float f15240o;

    /* renamed from: p, reason: collision with root package name */
    public float f15241p;

    /* renamed from: q, reason: collision with root package name */
    public float f15242q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f15243r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f15244s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f15245t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f15246u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f15247v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f15248w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f15249x;

    /* renamed from: y, reason: collision with root package name */
    public Z7.a f15250y;

    /* renamed from: f, reason: collision with root package name */
    public int f15231f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f15233g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f15234h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f15235i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f15251z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f15199D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f15228d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f15230e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f15232f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f15221a = textInputLayout;
        TextPaint textPaint = new TextPaint(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
        this.f15208N = textPaint;
        this.f15209O = new TextPaint(textPaint);
        this.f15227d = new Rect();
        this.f15225c = new Rect();
        this.f15229e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i5, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f10) + (Color.alpha(i5) * f11)), Math.round((Color.red(i10) * f10) + (Color.red(i5) * f11)), Math.round((Color.green(i10) * f10) + (Color.green(i5) * f11)), Math.round((Color.blue(i10) * f10) + (Color.blue(i5) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return J7.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f38779a;
        boolean z2 = this.f15221a.getLayoutDirection() == 1;
        if (this.f15199D) {
            return (z2 ? i1.f.f36719d : i1.f.f36718c).h(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f10, boolean z2) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z10;
        Layout.Alignment alignment;
        if (this.f15196A == null) {
            return;
        }
        float fWidth = this.f15227d.width();
        float fWidth2 = this.f15225c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.f15235i;
            f12 = this.f15216V;
            this.f15201F = 1.0f;
            typeface = this.f15243r;
        } else {
            float f13 = this.f15234h;
            float f14 = this.f15217W;
            Typeface typeface2 = this.f15246u;
            if (Math.abs(f10 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 1.0E-5f) {
                this.f15201F = 1.0f;
            } else {
                this.f15201F = f(this.f15234h, this.f15235i, f10, this.f15211Q) / this.f15234h;
            }
            float f15 = this.f15235i / this.f15234h;
            fWidth = (!z2 && fWidth2 * f15 > fWidth) ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f15208N;
        if (fWidth > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            boolean z11 = this.f15202G != f11;
            boolean z12 = this.f15218X != f12;
            boolean z13 = this.f15249x != typeface;
            StaticLayout staticLayout = this.f15219Y;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f15207M;
            this.f15202G = f11;
            this.f15218X = f12;
            this.f15249x = typeface;
            this.f15207M = false;
            textPaint.setLinearText(this.f15201F != 1.0f);
            z10 = z14;
        } else {
            z10 = false;
        }
        if (this.f15197B == null || z10) {
            textPaint.setTextSize(this.f15202G);
            textPaint.setTypeface(this.f15249x);
            textPaint.setLetterSpacing(this.f15218X);
            boolean zB = b(this.f15196A);
            this.f15198C = zB;
            int i5 = this.f15228d0;
            if (i5 <= 1 || zB) {
                i5 = 1;
            }
            if (i5 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f15231f, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f15198C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f15198C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g((int) fWidth, textPaint, this.f15196A);
            gVar.k = this.f15251z;
            gVar.f15269j = zB;
            gVar.f15264e = alignment;
            gVar.f15268i = false;
            gVar.f15265f = i5;
            gVar.f15266g = this.f15230e0;
            gVar.f15267h = this.f15232f0;
            StaticLayout staticLayoutA = gVar.a();
            staticLayoutA.getClass();
            this.f15219Y = staticLayoutA;
            this.f15197B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f15209O;
        textPaint.setTextSize(this.f15235i);
        textPaint.setTypeface(this.f15243r);
        textPaint.setLetterSpacing(this.f15216V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f15245t;
            if (typeface != null) {
                this.f15244s = Fe.c.A(configuration, typeface);
            }
            Typeface typeface2 = this.f15248w;
            if (typeface2 != null) {
                this.f15247v = Fe.c.A(configuration, typeface2);
            }
            Typeface typeface3 = this.f15244s;
            if (typeface3 == null) {
                typeface3 = this.f15245t;
            }
            this.f15243r = typeface3;
            Typeface typeface4 = this.f15247v;
            if (typeface4 == null) {
                typeface4 = this.f15248w;
            }
            this.f15246u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f15221a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f15197B;
        TextPaint textPaint = this.f15208N;
        if (charSequence != null && (staticLayout = this.f15219Y) != null) {
            this.f15226c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f15251z);
        }
        CharSequence charSequence2 = this.f15226c0;
        if (charSequence2 != null) {
            this.f15220Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f15220Z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f15233g, this.f15198C ? 1 : 0);
        int i5 = absoluteGravity & 112;
        Rect rect = this.f15227d;
        if (i5 == 48) {
            this.f15238m = rect.top;
        } else if (i5 != 80) {
            this.f15238m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f15238m = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f15240o = rect.centerX() - (this.f15220Z / 2.0f);
        } else if (i10 != 5) {
            this.f15240o = rect.left;
        } else {
            this.f15240o = rect.right - this.f15220Z;
        }
        c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2);
        float height = this.f15219Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f15219Y;
        if (staticLayout2 == null || this.f15228d0 <= 1) {
            CharSequence charSequence3 = this.f15197B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f15219Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f15231f, this.f15198C ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f15225c;
        if (i11 == 48) {
            this.f15237l = rect2.top;
        } else if (i11 != 80) {
            this.f15237l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f15237l = textPaint.descent() + (rect2.bottom - height);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f15239n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i12 != 5) {
            this.f15239n = rect2.left;
        } else {
            this.f15239n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f15200E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f15200E = null;
        }
        l(this.f15223b);
        float f10 = this.f15223b;
        float f11 = f(rect2.left, rect.left, f10, this.f15210P);
        RectF rectF = this.f15229e;
        rectF.left = f11;
        rectF.top = f(this.f15237l, this.f15238m, f10, this.f15210P);
        rectF.right = f(rect2.right, rect.right, f10, this.f15210P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.f15210P);
        this.f15241p = f(this.f15239n, this.f15240o, f10, this.f15210P);
        this.f15242q = f(this.f15237l, this.f15238m, f10, this.f15210P);
        l(f10);
        E1.a aVar = J7.a.f5720b;
        this.f15222a0 = 1.0f - f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f - f10, aVar);
        WeakHashMap weakHashMap = S.f38779a;
        textInputLayout.postInvalidateOnAnimation();
        this.f15224b0 = f(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.f15236j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, e(colorStateList2), e(this.k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f12 = this.f15216V;
        float f13 = this.f15217W;
        if (f12 != f13) {
            textPaint.setLetterSpacing(f(f13, f12, f10, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.f15203H = J7.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f15212R, f10);
        this.f15204I = J7.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f15213S, f10);
        this.f15205J = J7.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f15214T, f10);
        int iA = a(f10, 0, e(this.f15215U));
        this.f15206K = iA;
        textPaint.setShadowLayer(this.f15203H, this.f15204I, this.f15205J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.f15236j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.f15236j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        Z7.a aVar = this.f15250y;
        if (aVar != null) {
            aVar.f17012d = true;
        }
        if (this.f15245t == typeface) {
            return false;
        }
        this.f15245t = typeface;
        Typeface typefaceA = Fe.c.A(this.f15221a.getContext().getResources().getConfiguration(), typeface);
        this.f15244s = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f15245t;
        }
        this.f15243r = typefaceA;
        return true;
    }

    public final void k(float f10) {
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f15223b) {
            this.f15223b = f10;
            float f11 = this.f15225c.left;
            Rect rect = this.f15227d;
            float f12 = f(f11, rect.left, f10, this.f15210P);
            RectF rectF = this.f15229e;
            rectF.left = f12;
            rectF.top = f(this.f15237l, this.f15238m, f10, this.f15210P);
            rectF.right = f(r1.right, rect.right, f10, this.f15210P);
            rectF.bottom = f(r1.bottom, rect.bottom, f10, this.f15210P);
            this.f15241p = f(this.f15239n, this.f15240o, f10, this.f15210P);
            this.f15242q = f(this.f15237l, this.f15238m, f10, this.f15210P);
            l(f10);
            E1.a aVar = J7.a.f5720b;
            this.f15222a0 = 1.0f - f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f - f10, aVar);
            WeakHashMap weakHashMap = S.f38779a;
            TextInputLayout textInputLayout = this.f15221a;
            textInputLayout.postInvalidateOnAnimation();
            this.f15224b0 = f(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.f15236j;
            TextPaint textPaint = this.f15208N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.f15216V;
            float f14 = this.f15217W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f10, aVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.f15203H = J7.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f15212R, f10);
            this.f15204I = J7.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f15213S, f10);
            this.f15205J = J7.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f15214T, f10);
            int iA = a(f10, 0, e(this.f15215U));
            this.f15206K = iA;
            textPaint.setShadowLayer(this.f15203H, this.f15204I, this.f15205J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap weakHashMap = S.f38779a;
        this.f15221a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean zJ = j(typeface);
        if (this.f15248w != typeface) {
            this.f15248w = typeface;
            Typeface typefaceA = Fe.c.A(this.f15221a.getContext().getResources().getConfiguration(), typeface);
            this.f15247v = typefaceA;
            if (typefaceA == null) {
                typefaceA = this.f15248w;
            }
            this.f15246u = typefaceA;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zJ || z2) {
            h(false);
        }
    }
}
