package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wqu {
    private android.content.res.ColorStateList B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private android.graphics.Typeface I;
    private android.graphics.Typeface J;
    private android.graphics.Typeface K;
    private android.graphics.Typeface L;
    private android.graphics.Typeface M;
    private android.graphics.Typeface N;
    private android.graphics.Typeface O;
    private defpackage.wtx P;
    private defpackage.wtx Q;
    private java.lang.CharSequence R;
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
    private final android.text.TextPaint ac;
    private android.animation.TimeInterpolator ad;
    private android.animation.TimeInterpolator ae;
    private float af;
    private float ag;
    private float ah;
    private android.content.res.ColorStateList ai;
    private float aj;
    private float ak;
    private float al;
    private android.content.res.ColorStateList am;
    private float an;
    private float ao;
    private float ap;
    private float aq;
    private java.lang.CharSequence ar;
    private boolean as;
    public boolean b;
    public float c;
    public int d;
    public final android.graphics.Rect e;
    public android.content.res.ColorStateList h;
    public int i;
    public java.lang.CharSequence k;
    public boolean l;
    public final android.text.TextPaint m;
    public float n;
    public android.text.StaticLayout o;
    public float p;
    private final android.view.View u;
    private float v;
    private final android.graphics.Rect w;
    private android.graphics.Rect x;
    private final android.graphics.RectF y;
    private int z = 16;
    private int A = 16;
    public float f = 15.0f;
    public float g = 15.0f;
    public android.text.TextUtils.TruncateAt j = android.text.TextUtils.TruncateAt.END;
    private boolean S = true;
    public int q = 1;
    public int r = 1;
    public int s = -1;
    public int t = -1;

    public wqu(android.view.View view) {
        this.u = view;
        android.text.TextPaint textPaint = new android.text.TextPaint(129);
        this.ac = textPaint;
        this.m = new android.text.TextPaint(textPaint);
        this.e = new android.graphics.Rect();
        this.w = new android.graphics.Rect();
        this.y = new android.graphics.RectF();
        this.c = K();
        k(view.getContext().getResources().getConfiguration());
    }

    private final float K() {
        float f = this.v;
        return f + ((1.0f - f) * 0.5f);
    }

    private static float L(float f, float f2, float f3, android.animation.TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        android.animation.TimeInterpolator timeInterpolator2 = defpackage.wlm.a;
        return f + (f3 * (f2 - f));
    }

    private static int M(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return android.graphics.Color.argb(java.lang.Math.round((android.graphics.Color.alpha(i) * f2) + (android.graphics.Color.alpha(i2) * f)), java.lang.Math.round((android.graphics.Color.red(i) * f2) + (android.graphics.Color.red(i2) * f)), java.lang.Math.round((android.graphics.Color.green(i) * f2) + (android.graphics.Color.green(i2) * f)), java.lang.Math.round((android.graphics.Color.blue(i) * f2) + (android.graphics.Color.blue(i2) * f)));
    }

    private final int N(android.content.res.ColorStateList colorStateList) {
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
        android.graphics.RectF rectF = this.y;
        if (z) {
            rectF.set(f2 < this.c ? this.w : this.e);
        } else {
            android.graphics.Rect rect = this.w;
            float f3 = rect.left;
            android.graphics.Rect rect2 = this.e;
            rectF.left = L(f3, rect2.left, f2, this.ad);
            rectF.top = L(this.C, this.D, f2, this.ad);
            rectF.right = L(rect.right, rect2.right, f2, this.ad);
            rectF.bottom = L(rect.bottom, rect2.bottom, f2, this.ad);
        }
        if (!this.b) {
            this.G = L(this.E, this.F, f2, this.ad);
            this.H = L(this.C, this.D, f2, this.ad);
            Q(f2);
            float f4 = this.an;
            float f5 = this.n;
            android.text.TextPaint textPaint = this.ac;
            if (f4 != f5) {
                textPaint.setLetterSpacing(L(f5, f4, f2, defpackage.wlm.b));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            f = f2;
        } else if (f2 < this.c) {
            this.G = this.E;
            this.H = this.C;
            Q(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            f = 0.0f;
        } else {
            this.G = this.F;
            this.H = this.D - java.lang.Math.max(0, this.d);
            Q(1.0f);
            f = 1.0f;
        }
        android.animation.TimeInterpolator timeInterpolator = defpackage.wlm.b;
        this.ap = 1.0f - L(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f2, timeInterpolator);
        android.view.View view = this.u;
        view.postInvalidateOnAnimation();
        this.aq = L(1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f2, timeInterpolator);
        view.postInvalidateOnAnimation();
        android.content.res.ColorStateList colorStateList = this.h;
        android.content.res.ColorStateList colorStateList2 = this.B;
        android.text.TextPaint textPaint2 = this.ac;
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
        android.text.TextPaint textPaint3 = this.ac;
        textPaint3.setShadowLayer(this.V, this.W, this.X, iM);
        if (this.b) {
            int alpha = textPaint3.getAlpha();
            float f6 = this.c;
            textPaint3.setAlpha((int) ((f2 <= f6 ? defpackage.wlm.a(1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.v, f6, f2) : defpackage.wlm.a(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, f6, 1.0f, f2)) * alpha));
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                textPaint3.setShadowLayer(this.V, this.W, this.X, defpackage.sqs.bu(this.Y, textPaint3.getAlpha()));
            }
        }
        view.postInvalidateOnAnimation();
    }

    private final void P(float f, boolean z) {
        android.graphics.Typeface typeface;
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
            if (R(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) {
                this.T = 1.0f;
            } else {
                this.T = L(this.f, this.g, f, this.ae) / this.f;
            }
            float f6 = this.g / this.f;
            float f7 = fWidth2 * f6;
            if (!z && !this.b && f7 > fWidth && I()) {
                fWidth2 = java.lang.Math.min(fWidth / f6, fWidth2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i = f < 0.5f ? this.q : this.r;
        boolean z2 = false;
        if (fWidth2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            float f8 = this.U;
            float f9 = this.ao;
            android.graphics.Typeface typeface2 = this.O;
            android.text.StaticLayout staticLayout = this.o;
            boolean z3 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.Z == i && !this.ab) ? false : true;
            this.U = f2;
            this.ao = f3;
            this.O = typeface;
            this.ab = false;
            this.Z = i;
            this.ac.setLinearText(this.T != 1.0f);
            z2 = z3;
        }
        if (this.R == null || z2) {
            android.text.TextPaint textPaint = this.ac;
            textPaint.setTextSize(this.U);
            textPaint.setTypeface(this.O);
            textPaint.setLetterSpacing(this.ao);
            boolean zE = E(this.k);
            this.l = zE;
            android.text.StaticLayout staticLayoutG = g(true != T() ? 1 : i, textPaint, this.k, fWidth2 * (I() ? 1.0f : this.T), zE);
            this.o = staticLayoutG;
            this.R = staticLayoutG.getText();
        }
    }

    private final void Q(float f) {
        P(f, false);
        this.u.postInvalidateOnAnimation();
    }

    private static boolean R(float f, float f2) {
        return java.lang.Math.abs(f - f2) < 1.0E-5f;
    }

    private static boolean S(android.graphics.Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final boolean T() {
        if (this.q > 1 || this.r > 1) {
            return !this.l || this.b;
        }
        return false;
    }

    private static final float U(android.text.TextPaint textPaint, java.lang.CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void A(float f) {
        this.v = f;
        this.c = K();
    }

    public final void B(android.animation.TimeInterpolator timeInterpolator) {
        this.ad = timeInterpolator;
        l(false);
    }

    public final void C(java.lang.CharSequence charSequence) {
        if (charSequence == null || !android.text.TextUtils.equals(this.k, charSequence)) {
            this.k = charSequence;
            this.R = null;
            l(false);
        }
    }

    public final void D(android.animation.TimeInterpolator timeInterpolator) {
        this.ae = timeInterpolator;
        l(false);
    }

    public final boolean E(java.lang.CharSequence charSequence) {
        int layoutDirection = this.u.getLayoutDirection();
        boolean z = this.S;
        boolean z2 = layoutDirection == 1;
        if (z) {
            return (z2 ? defpackage.dzl.d : defpackage.dzl.c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final boolean F(android.graphics.Typeface typeface) {
        defpackage.wtx wtxVar = this.Q;
        if (wtxVar != null) {
            wtxVar.c();
        }
        if (this.K == typeface) {
            return false;
        }
        this.K = typeface;
        android.graphics.Typeface typefaceI = defpackage.wpu.i(this.u.getContext().getResources().getConfiguration(), typeface);
        this.J = typefaceI;
        if (typefaceI == null) {
            typefaceI = this.K;
        }
        this.I = typefaceI;
        return true;
    }

    public final boolean G(android.graphics.Typeface typeface) {
        defpackage.wtx wtxVar = this.P;
        if (wtxVar != null) {
            wtxVar.c();
        }
        if (this.N == typeface) {
            return false;
        }
        this.N = typeface;
        android.graphics.Typeface typefaceI = defpackage.wpu.i(this.u.getContext().getResources().getConfiguration(), typeface);
        this.M = typefaceI;
        if (typefaceI == null) {
            typefaceI = this.N;
        }
        this.L = typefaceI;
        return true;
    }

    public final boolean H(int[] iArr) {
        android.content.res.ColorStateList colorStateList;
        this.aa = iArr;
        android.content.res.ColorStateList colorStateList2 = this.h;
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
        android.text.TextPaint textPaint = this.m;
        i(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float b() {
        android.text.TextPaint textPaint = this.m;
        i(textPaint);
        return -textPaint.ascent();
    }

    public final float c() {
        int i = this.s;
        return i != -1 ? i : b();
    }

    public final float d() {
        android.text.TextPaint textPaint = this.m;
        j(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float e() {
        android.text.TextPaint textPaint = this.m;
        j(textPaint);
        return -textPaint.ascent();
    }

    public final int f() {
        return N(this.h);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: wri -> 0x004b, TRY_ENTER, TryCatch #0 {wri -> 0x004b, blocks: (B:4:0x0004, B:17:0x0029, B:5:0x0008, B:11:0x001b, B:12:0x001e, B:15:0x0024), top: B:23:0x0002 }] */
    public final android.text.StaticLayout g(int i, android.text.TextPaint textPaint, java.lang.CharSequence charSequence, float f, boolean z) {
        android.text.Layout.Alignment alignment;
        int i2;
        android.text.Layout.Alignment alignment2;
        android.text.StaticLayout staticLayoutA = null;
        try {
            if (i == 1) {
                alignment2 = android.text.Layout.Alignment.ALIGN_NORMAL;
                i2 = 1;
            } else {
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.z, this.l ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.l;
                    if (absoluteGravity != 5) {
                        if (z2) {
                            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (z2) {
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                }
                android.text.Layout.Alignment alignment3 = alignment;
                i2 = i;
                alignment2 = alignment3;
            }
            defpackage.wrj wrjVar = new defpackage.wrj(charSequence, textPaint, (int) f);
            wrjVar.f = this.j;
            wrjVar.e = z;
            wrjVar.a = alignment2;
            wrjVar.d = false;
            wrjVar.b = i2;
            wrjVar.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
            wrjVar.c = 1;
            wrjVar.g = null;
            staticLayoutA = wrjVar.a();
        } catch (defpackage.wri e) {
            android.util.Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        defpackage.ebl.q(staticLayoutA);
        return staticLayoutA;
    }

    public final void h(android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        if (this.R != null) {
            android.graphics.RectF rectF = this.y;
            if (rectF.width() <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || rectF.height() <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            android.text.TextPaint textPaint = this.ac;
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
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.V, this.W, this.X, defpackage.sqs.bu(this.Y, textPaint.getAlpha()));
                    }
                    this.o.draw(canvas);
                }
                if (!this.b) {
                    textPaint.setAlpha((int) (this.ap * alpha));
                }
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.V, this.W, this.X, defpackage.sqs.bu(this.Y, textPaint.getAlpha()));
                }
                int lineBaseline = this.o.getLineBaseline(0);
                java.lang.CharSequence charSequence = this.ar;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f4, textPaint);
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    textPaint.setShadowLayer(this.V, this.W, this.X, this.Y);
                }
                if (!this.b) {
                    java.lang.String strTrim = this.ar.toString().trim();
                    if (strTrim.endsWith(com.google.android.libraries.handwriting.gui.UIHandler.ContinuousWritingQueue.PLACEHOLDER)) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    java.lang.String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, java.lang.Math.min(this.o.getLineEnd(0), str.length()), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f4, (android.graphics.Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f, f2);
                this.o.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void i(android.text.TextPaint textPaint) {
        textPaint.setTextSize(this.g);
        textPaint.setTypeface(this.I);
        textPaint.setLetterSpacing(this.an);
    }

    public final void j(android.text.TextPaint textPaint) {
        textPaint.setTextSize(this.f);
        textPaint.setTypeface(this.L);
        textPaint.setLetterSpacing(this.n);
    }

    public final void k(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.graphics.Typeface typeface = this.K;
            if (typeface != null) {
                this.J = defpackage.wpu.i(configuration, typeface);
            }
            android.graphics.Typeface typeface2 = this.N;
            if (typeface2 != null) {
                this.M = defpackage.wpu.i(configuration, typeface2);
            }
            android.graphics.Typeface typeface3 = this.J;
            if (typeface3 == null) {
                typeface3 = this.K;
            }
            this.I = typeface3;
            android.graphics.Typeface typeface4 = this.M;
            if (typeface4 == null) {
                typeface4 = this.N;
            }
            this.L = typeface4;
            l(true);
        }
    }

    public final void l(boolean z) {
        float fU;
        android.text.StaticLayout staticLayout;
        android.view.View view = this.u;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        P(1.0f, z);
        java.lang.CharSequence charSequenceEllipsize = this.R;
        if (charSequenceEllipsize != null && (staticLayout = this.o) != null) {
            if (I()) {
                charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequenceEllipsize, this.ac, staticLayout.getWidth(), this.j);
            }
            this.ar = charSequenceEllipsize;
        }
        java.lang.CharSequence charSequence = this.ar;
        float fDescent = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (charSequence != null) {
            this.p = U(this.ac, charSequence);
        } else {
            this.p = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.A, this.l ? 1 : 0);
        android.graphics.Rect rect = this.x;
        if (rect == null) {
            rect = this.e;
        }
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.D = rect.top;
        } else if (i != 80) {
            android.text.TextPaint textPaint = this.ac;
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
        android.graphics.Rect rect2 = this.e;
        if (f <= rect2.width()) {
            float fMax = this.F + java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rect2.left - this.F);
            this.F = fMax;
            this.F = fMax + java.lang.Math.min(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rect2.right - (this.F + this.p));
        }
        if (a() <= rect2.height()) {
            float fMax2 = this.D + java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rect2.top - this.D);
            this.D = fMax2;
            this.D = fMax2 + java.lang.Math.min(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rect2.bottom - (this.D + c()));
        }
        P(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, z);
        android.text.StaticLayout staticLayout2 = this.o;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        android.text.StaticLayout staticLayout3 = this.o;
        if (staticLayout3 == null || this.q <= 1) {
            java.lang.CharSequence charSequence2 = this.R;
            fU = charSequence2 != null ? U(this.ac, charSequence2) : 0.0f;
        } else {
            fU = staticLayout3.getWidth();
        }
        android.text.StaticLayout staticLayout4 = this.o;
        this.i = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(this.z, this.l ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 != 48) {
            android.graphics.Rect rect3 = this.w;
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
            android.graphics.Rect rect4 = this.w;
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

    public final void m(android.content.res.ColorStateList colorStateList) {
        if (this.h == colorStateList && this.B == colorStateList) {
            return;
        }
        this.h = colorStateList;
        this.B = colorStateList;
        l(false);
    }

    public final void n(android.graphics.Rect rect) {
        o(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void o(int i, int i2, int i3, int i4) {
        android.graphics.Rect rect = this.e;
        if (S(rect, i, i2, i3, i4)) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.ab = true;
    }

    public final void p(int i, int i2, int i3, int i4) {
        android.graphics.Rect rect = this.x;
        if (rect == null) {
            rect = new android.graphics.Rect(i, i2, i3, i4);
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
        android.view.View view = this.u;
        defpackage.wub wubVar = new defpackage.wub(view.getContext(), i);
        android.content.res.ColorStateList colorStateList = wubVar.k;
        if (colorStateList != null) {
            this.h = colorStateList;
        }
        float f = wubVar.l;
        if (f != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            this.g = f;
        }
        android.content.res.ColorStateList colorStateList2 = wubVar.a;
        if (colorStateList2 != null) {
            this.ai = colorStateList2;
        }
        this.ag = wubVar.f;
        this.ah = wubVar.g;
        this.af = wubVar.h;
        this.an = wubVar.j;
        defpackage.wtx wtxVar = this.Q;
        if (wtxVar != null) {
            wtxVar.c();
        }
        this.Q = new defpackage.wtx(new defpackage.wqt(this, 1), wubVar.a());
        wubVar.b(view.getContext(), this.Q);
        l(false);
    }

    public final void r(android.content.res.ColorStateList colorStateList) {
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
        android.graphics.Rect rect = this.w;
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
        android.view.View view = this.u;
        defpackage.wub wubVar = new defpackage.wub(view.getContext(), i);
        android.content.res.ColorStateList colorStateList = wubVar.k;
        if (colorStateList != null) {
            this.B = colorStateList;
        }
        float f = wubVar.l;
        if (f != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            this.f = f;
        }
        android.content.res.ColorStateList colorStateList2 = wubVar.a;
        if (colorStateList2 != null) {
            this.am = colorStateList2;
        }
        this.ak = wubVar.f;
        this.al = wubVar.g;
        this.aj = wubVar.h;
        this.n = wubVar.j;
        defpackage.wtx wtxVar = this.P;
        if (wtxVar != null) {
            wtxVar.c();
        }
        this.P = new defpackage.wtx(new defpackage.wqt(this, 0), wubVar.a());
        wubVar.b(view.getContext(), this.P);
        l(false);
    }

    public final void w(android.content.res.ColorStateList colorStateList) {
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
        float fB = defpackage.duc.b(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (fB != this.a) {
            this.a = fB;
            O();
        }
    }
}
