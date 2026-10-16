package defpackage;

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
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wpx {
    private ColorStateList B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private Typeface I;
    private Typeface J;
    private Typeface K;
    private Typeface L;
    private Typeface M;
    private Typeface N;
    private Typeface O;
    private wta P;
    private wta Q;
    private CharSequence R;
    private float T;
    private float U;
    private float V;
    private float W;
    private float X;
    private int Y;
    private int Z;
    public float a;
    private int[] aa;
    private boolean ab;
    private final TextPaint ac;
    private TimeInterpolator ad;
    private TimeInterpolator ae;
    private float af;
    private float ag;
    private float ah;
    private ColorStateList ai;
    private float aj;
    private float ak;
    private float al;
    private ColorStateList am;
    private float an;
    private float ao;
    private float ap;
    private float aq;
    private CharSequence ar;
    private boolean as;
    public boolean b;
    public float c;
    public int d;
    public final Rect e;
    public ColorStateList h;
    public int i;
    public CharSequence k;
    public boolean l;
    public final TextPaint m;
    public float n;
    public StaticLayout o;
    public float p;
    private final View u;
    private float v;
    private final Rect w;
    private Rect x;
    private final RectF y;
    private int z = 16;
    private int A = 16;
    public float f = 15.0f;
    public float g = 15.0f;
    public TextUtils.TruncateAt j = TextUtils.TruncateAt.END;
    private boolean S = true;
    public int q = 1;
    public int r = 1;
    public int s = -1;
    public int t = -1;

    public wpx(View view) {
        this.u = view;
        TextPaint textPaint = new TextPaint(129);
        this.ac = textPaint;
        this.m = new TextPaint(textPaint);
        this.e = new Rect();
        this.w = new Rect();
        this.y = new RectF();
        this.c = K();
        k(view.getContext().getResources().getConfiguration());
    }

    private final float K() {
        float f = this.v;
        return f + ((1.0f - f) * 0.5f);
    }

    private static float L(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = wkn.a;
        return f + (f3 * (f2 - f));
    }

    private static int M(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int N(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.aa;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final void O() {
        float f;
        float f2 = this.a;
        boolean z = this.b;
        RectF rectF = this.y;
        if (z) {
            rectF.set(f2 < this.c ? this.w : this.e);
        } else {
            float f3 = this.w.left;
            Rect rect = this.e;
            rectF.left = L(f3, rect.left, f2, this.ad);
            rectF.top = L(this.C, this.D, f2, this.ad);
            rectF.right = L(r1.right, rect.right, f2, this.ad);
            rectF.bottom = L(r1.bottom, rect.bottom, f2, this.ad);
        }
        if (!this.b) {
            this.G = L(this.E, this.F, f2, this.ad);
            this.H = L(this.C, this.D, f2, this.ad);
            Q(f2);
            float f4 = this.an;
            float f5 = this.n;
            TextPaint textPaint = this.ac;
            if (f4 != f5) {
                textPaint.setLetterSpacing(L(f5, f4, f2, wkn.b));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            f = f2;
        } else if (f2 < this.c) {
            this.G = this.E;
            this.H = this.C;
            Q(BitmapDescriptorFactory.HUE_RED);
            f = 0.0f;
        } else {
            this.G = this.F;
            this.H = this.D - Math.max(0, this.d);
            Q(1.0f);
            f = 1.0f;
        }
        TimeInterpolator timeInterpolator = wkn.b;
        this.ap = 1.0f - L(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.u;
        view.postInvalidateOnAnimation();
        this.aq = L(1.0f, BitmapDescriptorFactory.HUE_RED, f2, timeInterpolator);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.h;
        ColorStateList colorStateList2 = this.B;
        TextPaint textPaint2 = this.ac;
        if (colorStateList != colorStateList2) {
            textPaint2.setColor(M(N(colorStateList2), f(), f));
        } else {
            textPaint2.setColor(f());
        }
        this.V = L(this.aj, this.af, f2, null);
        this.W = L(this.ak, this.ag, f2, null);
        this.X = L(this.al, this.ah, f2, null);
        int iM = M(N(this.am), N(this.ai), f2);
        this.Y = iM;
        TextPaint textPaint3 = this.ac;
        textPaint3.setShadowLayer(this.V, this.W, this.X, iM);
        if (this.b) {
            int alpha = textPaint3.getAlpha();
            float f6 = this.c;
            textPaint3.setAlpha((int) ((f2 <= f6 ? wkn.a(1.0f, BitmapDescriptorFactory.HUE_RED, this.v, f6, f2) : wkn.a(BitmapDescriptorFactory.HUE_RED, 1.0f, f6, 1.0f, f2)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                textPaint3.setShadowLayer(this.V, this.W, this.X, woy.l(this.Y, textPaint3.getAlpha()));
            }
        }
        view.postInvalidateOnAnimation();
    }

    private final void P(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        if (this.k == null) {
            return;
        }
        float fWidth = this.e.width();
        float fWidth2 = this.w.width();
        if (R(f, 1.0f)) {
            f2 = I() ? this.g : this.f;
            f3 = I() ? this.an : this.n;
            this.T = I() ? 1.0f : L(this.f, this.g, f, this.ae) / this.f;
            if (true != I()) {
                fWidth = fWidth2;
            }
            typeface = this.I;
            fWidth2 = fWidth;
        } else {
            float f4 = this.f;
            float f5 = this.n;
            typeface = this.L;
            if (R(f, BitmapDescriptorFactory.HUE_RED)) {
                this.T = 1.0f;
            } else {
                this.T = L(this.f, this.g, f, this.ae) / this.f;
            }
            float f6 = this.g / this.f;
            float f7 = fWidth2 * f6;
            if (!z && !this.b && f7 > fWidth && I()) {
                fWidth2 = Math.min(fWidth / f6, fWidth2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i = f < 0.5f ? this.q : this.r;
        if (fWidth2 > BitmapDescriptorFactory.HUE_RED) {
            float f8 = this.U;
            float f9 = this.ao;
            Typeface typeface2 = this.O;
            StaticLayout staticLayout = this.o;
            boolean z2 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.Z == i && !this.ab) ? false : true;
            this.U = f2;
            this.ao = f3;
            this.O = typeface;
            this.ab = false;
            this.Z = i;
            this.ac.setLinearText(this.T != 1.0f);
            z = z2;
        }
        if (this.R == null || z) {
            TextPaint textPaint = this.ac;
            textPaint.setTextSize(this.U);
            textPaint.setTypeface(this.O);
            textPaint.setLetterSpacing(this.ao);
            boolean zE = E(this.k);
            this.l = zE;
            StaticLayout staticLayoutG = g(true != T() ? 1 : i, textPaint, this.k, fWidth2 * (I() ? 1.0f : this.T), zE);
            this.o = staticLayoutG;
            this.R = staticLayoutG.getText();
        }
    }

    private final void Q(float f) {
        P(f, false);
        this.u.postInvalidateOnAnimation();
    }

    private static boolean R(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private static boolean S(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final boolean T() {
        if (this.q > 1 || this.r > 1) {
            return !this.l || this.b;
        }
        return false;
    }

    private static final float U(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void A(float f) {
        this.v = f;
        this.c = K();
    }

    public final void B(TimeInterpolator timeInterpolator) {
        this.ad = timeInterpolator;
        l(false);
    }

    public final void C(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.k, charSequence)) {
            this.k = charSequence;
            this.R = null;
            l(false);
        }
    }

    public final void D(TimeInterpolator timeInterpolator) {
        this.ae = timeInterpolator;
        l(false);
    }

    public final boolean E(CharSequence charSequence) {
        int layoutDirection = this.u.getLayoutDirection();
        boolean z = this.S;
        boolean z2 = layoutDirection == 1;
        if (z) {
            return (z2 ? dze.d : dze.c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final boolean F(Typeface typeface) {
        wta wtaVar = this.Q;
        if (wtaVar != null) {
            wtaVar.c();
        }
        if (this.K == typeface) {
            return false;
        }
        this.K = typeface;
        Typeface typefaceD = wpq.d(this.u.getContext().getResources().getConfiguration(), typeface);
        this.J = typefaceD;
        if (typefaceD == null) {
            typefaceD = this.K;
        }
        this.I = typefaceD;
        return true;
    }

    public final boolean G(Typeface typeface) {
        wta wtaVar = this.P;
        if (wtaVar != null) {
            wtaVar.c();
        }
        if (this.N == typeface) {
            return false;
        }
        this.N = typeface;
        Typeface typefaceD = wpq.d(this.u.getContext().getResources().getConfiguration(), typeface);
        this.M = typefaceD;
        if (typefaceD == null) {
            typefaceD = this.N;
        }
        this.L = typefaceD;
        return true;
    }

    public final boolean H(int[] iArr) {
        ColorStateList colorStateList;
        this.aa = iArr;
        ColorStateList colorStateList2 = this.h;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.B) == null || !colorStateList.isStateful())) {
            return false;
        }
        l(false);
        return true;
    }

    public final boolean I() {
        return this.r == 1;
    }

    public final void J() {
        this.S = false;
    }

    public final float a() {
        TextPaint textPaint = this.m;
        i(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float b() {
        TextPaint textPaint = this.m;
        i(textPaint);
        return -textPaint.ascent();
    }

    public final float c() {
        int i = this.s;
        return i != -1 ? i : b();
    }

    public final float d() {
        TextPaint textPaint = this.m;
        j(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float e() {
        TextPaint textPaint = this.m;
        j(textPaint);
        return -textPaint.ascent();
    }

    public final int f() {
        return N(this.h);
    }

    public final StaticLayout g(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        int i2;
        Layout.Alignment alignment2;
        StaticLayout staticLayoutA = null;
        try {
            if (i == 1) {
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
                i2 = 1;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.z, this.l ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.l;
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
                i2 = i;
                alignment2 = alignment3;
            }
            wqm wqmVar = new wqm(charSequence, textPaint, (int) f);
            wqmVar.f = this.j;
            wqmVar.e = z;
            wqmVar.a = alignment2;
            wqmVar.d = false;
            wqmVar.b = i2;
            wqmVar.b(BitmapDescriptorFactory.HUE_RED, 1.0f);
            wqmVar.c = 1;
            wqmVar.g = null;
            staticLayoutA = wqmVar.a();
        } catch (wql e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        ebe.m(staticLayoutA);
        return staticLayoutA;
    }

    public final void h(Canvas canvas) {
        int iSave = canvas.save();
        if (this.R != null) {
            RectF rectF = this.y;
            if (rectF.width() <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            TextPaint textPaint = this.ac;
            textPaint.setTextSize(this.U);
            float f = this.G;
            float f2 = this.H;
            float f3 = this.T;
            if (f3 != 1.0f && !this.b) {
                canvas.scale(f3, f3, f, f2);
            }
            if (T() && I() && (!this.b || this.a > this.c)) {
                float lineStart = this.G - this.o.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f2);
                if (!this.b) {
                    textPaint.setAlpha((int) (this.aq * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.V, this.W, this.X, woy.l(this.Y, textPaint.getAlpha()));
                    }
                    this.o.draw(canvas);
                }
                if (!this.b) {
                    textPaint.setAlpha((int) (this.ap * alpha));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.V, this.W, this.X, woy.l(this.Y, textPaint.getAlpha()));
                }
                int lineBaseline = this.o.getLineBaseline(0);
                CharSequence charSequence = this.ar;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), BitmapDescriptorFactory.HUE_RED, f4, textPaint);
                if (Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.V, this.W, this.X, this.Y);
                }
                if (!this.b) {
                    String strTrim = this.ar.toString().trim();
                    if (strTrim.endsWith(UIHandler.ContinuousWritingQueue.PLACEHOLDER)) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.o.getLineEnd(0), str.length()), BitmapDescriptorFactory.HUE_RED, f4, (Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f, f2);
                this.o.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void i(TextPaint textPaint) {
        textPaint.setTextSize(this.g);
        textPaint.setTypeface(this.I);
        textPaint.setLetterSpacing(this.an);
    }

    public final void j(TextPaint textPaint) {
        textPaint.setTextSize(this.f);
        textPaint.setTypeface(this.L);
        textPaint.setLetterSpacing(this.n);
    }

    public final void k(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.K;
            if (typeface != null) {
                this.J = wpq.d(configuration, typeface);
            }
            Typeface typeface2 = this.N;
            if (typeface2 != null) {
                this.M = wpq.d(configuration, typeface2);
            }
            Typeface typeface3 = this.J;
            if (typeface3 == null) {
                typeface3 = this.K;
            }
            this.I = typeface3;
            Typeface typeface4 = this.M;
            if (typeface4 == null) {
                typeface4 = this.N;
            }
            this.L = typeface4;
            l(true);
        }
    }

    public final void l(boolean z) {
        float fU;
        StaticLayout staticLayout;
        View view = this.u;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        P(1.0f, z);
        CharSequence charSequenceEllipsize = this.R;
        if (charSequenceEllipsize != null && (staticLayout = this.o) != null) {
            if (I()) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.ac, staticLayout.getWidth(), this.j);
            }
            this.ar = charSequenceEllipsize;
        }
        CharSequence charSequence = this.ar;
        float fDescent = BitmapDescriptorFactory.HUE_RED;
        if (charSequence != null) {
            this.p = U(this.ac, charSequence);
        } else {
            this.p = BitmapDescriptorFactory.HUE_RED;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.A, this.l ? 1 : 0);
        Rect rect = this.x;
        if (rect == null) {
            rect = this.e;
        }
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.D = rect.top;
        } else if (i != 80) {
            TextPaint textPaint = this.ac;
            this.D = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.D = rect.bottom + this.ac.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.F = rect.centerX() - (this.p / 2.0f);
        } else if (i2 != 5) {
            this.F = rect.left;
        } else {
            this.F = rect.right - this.p;
        }
        float f = this.p;
        Rect rect2 = this.e;
        if (f <= rect2.width()) {
            float fMax = this.F + Math.max(BitmapDescriptorFactory.HUE_RED, rect2.left - this.F);
            this.F = fMax;
            this.F = fMax + Math.min(BitmapDescriptorFactory.HUE_RED, rect2.right - (this.F + this.p));
        }
        if (a() <= rect2.height()) {
            float fMax2 = this.D + Math.max(BitmapDescriptorFactory.HUE_RED, rect2.top - this.D);
            this.D = fMax2;
            this.D = fMax2 + Math.min(BitmapDescriptorFactory.HUE_RED, rect2.bottom - (this.D + c()));
        }
        P(BitmapDescriptorFactory.HUE_RED, z);
        float height = this.o != null ? r13.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.o;
        if (staticLayout2 == null || this.q <= 1) {
            CharSequence charSequence2 = this.R;
            fU = charSequence2 != null ? U(this.ac, charSequence2) : 0.0f;
        } else {
            fU = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.o;
        this.i = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.z, this.l ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 != 48) {
            Rect rect3 = this.w;
            if (i3 != 80) {
                this.C = rect3.centerY() - (height / 2.0f);
            } else {
                float f2 = rect3.bottom - height;
                if (this.as) {
                    fDescent = this.ac.descent();
                }
                this.C = f2 + fDescent;
            }
        } else {
            this.C = this.w.top;
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 != 1) {
            Rect rect4 = this.w;
            if (i4 != 5) {
                this.E = rect4.left;
            } else {
                this.E = rect4.right - fU;
            }
        } else {
            this.E = this.w.centerX() - (fU / 2.0f);
        }
        Q(this.a);
        O();
    }

    public final void m(ColorStateList colorStateList) {
        if (this.h == colorStateList && this.B == colorStateList) {
            return;
        }
        this.h = colorStateList;
        this.B = colorStateList;
        l(false);
    }

    public final void n(Rect rect) {
        o(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void o(int i, int i2, int i3, int i4) {
        Rect rect = this.e;
        if (S(rect, i, i2, i3, i4)) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.ab = true;
    }

    public final void p(int i, int i2, int i3, int i4) {
        Rect rect = this.x;
        if (rect == null) {
            rect = new Rect(i, i2, i3, i4);
            this.x = rect;
            this.ab = true;
        }
        if (S(rect, i, i2, i3, i4)) {
            return;
        }
        this.x.set(i, i2, i3, i4);
        this.ab = true;
    }

    public final void q(int i) {
        View view = this.u;
        wte wteVar = new wte(view.getContext(), i);
        ColorStateList colorStateList = wteVar.k;
        if (colorStateList != null) {
            this.h = colorStateList;
        }
        float f = wteVar.l;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.g = f;
        }
        ColorStateList colorStateList2 = wteVar.a;
        if (colorStateList2 != null) {
            this.ai = colorStateList2;
        }
        this.ag = wteVar.f;
        this.ah = wteVar.g;
        this.af = wteVar.h;
        this.an = wteVar.j;
        wta wtaVar = this.Q;
        if (wtaVar != null) {
            wtaVar.c();
        }
        this.Q = new wta(new wpw(this, 1), wteVar.a());
        wteVar.b(view.getContext(), this.Q);
        l(false);
    }

    public final void r(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            l(false);
        }
    }

    public final void s(int i) {
        if (this.A != i) {
            this.A = i;
            l(false);
        }
    }

    public final void t(int i, int i2, int i3, int i4, boolean z) {
        Rect rect = this.w;
        if (S(rect, i, i2, i3, i4) && z == this.as) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.ab = true;
        this.as = z;
    }

    public final void u(int i) {
        if (i != this.q) {
            this.q = i;
            l(false);
        }
    }

    public final void v(int i) {
        View view = this.u;
        wte wteVar = new wte(view.getContext(), i);
        ColorStateList colorStateList = wteVar.k;
        if (colorStateList != null) {
            this.B = colorStateList;
        }
        float f = wteVar.l;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f = f;
        }
        ColorStateList colorStateList2 = wteVar.a;
        if (colorStateList2 != null) {
            this.am = colorStateList2;
        }
        this.ak = wteVar.f;
        this.al = wteVar.g;
        this.aj = wteVar.h;
        this.n = wteVar.j;
        wta wtaVar = this.P;
        if (wtaVar != null) {
            wtaVar.c();
        }
        this.P = new wta(new wpw(this, 0), wteVar.a());
        wteVar.b(view.getContext(), this.P);
        l(false);
    }

    public final void w(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            l(false);
        }
    }

    public final void x(int i) {
        if (this.z != i) {
            this.z = i;
            l(false);
        }
    }

    public final void y(float f) {
        if (this.f != f) {
            this.f = f;
            l(false);
        }
    }

    public final void z(float f) {
        float fI = dlz.i(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (fI != this.a) {
            this.a = fI;
            O();
        }
    }
}
