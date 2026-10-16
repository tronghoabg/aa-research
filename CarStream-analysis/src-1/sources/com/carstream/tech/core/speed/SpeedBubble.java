package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewCompat;
import defpackage.u7;
import defpackage.va;
import defpackage.w7;
import defpackage.wa;
import defpackage.xa;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class SpeedBubble extends View {
    public static final PathInterpolator J = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
    public static final PathInterpolator K = new PathInterpolator(0.3f, 0.9f, 0.3f, 1.0f);
    public static final PathInterpolator L = new PathInterpolator(0.2f, 0.8f, 0.2f, 1.0f);
    public long A;
    public boolean B;
    public String C;
    public String D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public final va I;
    public int a;
    public int b;
    public u7 c;
    public u7 d;
    public u7 e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final RectF j;
    public final xa k;
    public final xa l;
    public final xa m;
    public final wa n;
    public final wa o;
    public final wa p;
    public final SparseArray q;
    public final Paint r;
    public float s;
    public final Paint t;
    public RadialGradient u;
    public float v;
    public RadialGradient w;
    public float x;
    public long y;
    public long z;

    public SpeedBubble(Context context) {
        super(context);
        this.a = -1;
        this.b = -1;
        this.f = new Paint(1);
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Paint paint3 = new Paint(1);
        this.i = paint3;
        this.j = new RectF();
        PathInterpolator pathInterpolator = J;
        this.k = new xa(260L, pathInterpolator);
        this.l = new xa(200L, pathInterpolator);
        this.m = new xa(300L, K);
        this.n = new wa(-13250420);
        this.o = new wa(-12696758);
        this.p = new wa(-13250420);
        this.q = new SparseArray();
        this.r = new Paint(2);
        this.s = 1.0f;
        this.t = new Paint(1);
        this.v = -1.0f;
        this.x = -1.0f;
        this.E = -1.0f;
        this.F = 1.0f;
        this.I = new va(this);
        paint.setStyle(Paint.Style.STROKE);
        Typeface typeface = Typeface.SANS_SERIF;
        paint2.setTypeface(Typeface.create(typeface, 1));
        paint3.setTypeface(Typeface.create(typeface, 1));
    }

    public static float N(long j) {
        return (float) (0.5d - (Math.cos((t(j) * 3.141592653589793d) * 2.0d) * 0.5d));
    }

    public static int a(int i, int i2, float f) {
        return Math.max(0, Math.min(255, Math.round(((i2 - i) * f) + i)));
    }

    public static float c(Paint paint, float f) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
    }

    public static int d(int i) {
        if (i < 150) {
            return -308162;
        }
        return i < 320 ? -677572 : -13250420;
    }

    public static String e(int i) {
        if (i <= 0) {
            return "";
        }
        if (i >= 1000) {
            return String.format(Locale.US, "%.1f km", Float.valueOf(i / 1000.0f));
        }
        return i + " m";
    }

    public static float m(long j) {
        if (j == 0) {
            return 1.0f;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (jElapsedRealtime >= 420) {
            return 1.0f;
        }
        return L.getInterpolation(jElapsedRealtime / 420.0f);
    }

    public static float t(long j) {
        return (SystemClock.elapsedRealtime() % j) / j;
    }

    public static boolean u(u7 u7Var, u7 u7Var2) {
        String str;
        if (u7Var == null || u7Var2 == null) {
            return u7Var == u7Var2;
        }
        String str2 = u7Var.d;
        if (str2 != null && (str = u7Var2.d) != null) {
            return str2.equals(str);
        }
        Bitmap bitmap = u7Var.c;
        if (bitmap != null || u7Var2.c != null) {
            return bitmap == u7Var2.c;
        }
        String str3 = u7Var.a;
        return str3 == null ? u7Var2.a == null : str3.equals(u7Var2.a);
    }

    public final void A(int i) {
        int i2 = this.b;
        if (i != i2) {
            boolean z = (i2 > 0) != (i > 0);
            this.b = i;
            if (z || i > 0) {
                requestLayout();
            }
            invalidate();
            v();
        }
    }

    public final void B(float f) {
        float fMax = Math.max(0.3f, Math.min(3.0f, f));
        if (fMax != this.F) {
            this.F = fMax;
            requestLayout();
            invalidate();
        }
    }

    public final void C(u7 u7Var, ArrayList arrayList) {
        int iM = M();
        u7 u7Var2 = arrayList.size() > 0 ? (u7) arrayList.get(0) : null;
        u7 u7Var3 = arrayList.size() > 1 ? (u7) arrayList.get(1) : null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (u7Var != null && !u(this.c, u7Var)) {
            this.y = jElapsedRealtime;
        }
        if (u7Var2 != null && !u(this.d, u7Var2)) {
            this.z = jElapsedRealtime;
        }
        if (u7Var3 != null && !u(this.e, u7Var3)) {
            this.A = jElapsedRealtime;
        }
        this.c = u7Var;
        this.d = u7Var2;
        this.e = u7Var3;
        if (iM == M()) {
            invalidate();
        } else {
            requestLayout();
            invalidate();
        }
        v();
    }

    public final void D(int i) {
        if (i != this.a) {
            this.a = i;
            requestLayout();
            invalidate();
            v();
        }
    }

    public final void E() {
        this.y = 0L;
        this.z = 0L;
        this.A = 0L;
        float fN = n();
        xa xaVar = this.k;
        xaVar.e = fN;
        xaVar.d = fN;
        xaVar.c = fN;
        xaVar.f = -1L;
        xa xaVar2 = this.l;
        xaVar2.e = fN;
        xaVar2.d = fN;
        xaVar2.c = fN;
        xaVar2.f = -1L;
        xa xaVar3 = this.m;
        xaVar3.e = fN;
        xaVar3.d = fN;
        xaVar3.c = fN;
        xaVar3.f = -1L;
        int iL = L();
        wa waVar = this.n;
        waVar.c = iL;
        waVar.b = iL;
        waVar.a = iL;
        waVar.d = -1L;
        int iL2 = (p() || o()) ? L() : -12696758;
        wa waVar2 = this.o;
        waVar2.c = iL2;
        waVar2.b = iL2;
        waVar2.a = iL2;
        waVar2.d = -1L;
        int iL3 = this.a < 0 ? -6643286 : this.b <= 0 ? -855051 : L();
        wa waVar3 = this.p;
        waVar3.c = iL3;
        waVar3.b = iL3;
        waVar3.a = iL3;
        waVar3.d = -1L;
    }

    public final float F() {
        if (!p()) {
            return 0.0f;
        }
        return f(2.0f) * ((float) Math.sin(t(550L) * 3.141592653589793d * 2.0d));
    }

    public final boolean G() {
        return this.b > 0 || this.G;
    }

    public final int H(Canvas canvas, u7 u7Var, RectF rectF) {
        long j = 0;
        if (u7Var != null) {
            if (u7Var == this.c) {
                j = this.y;
            } else if (u7Var == this.d) {
                j = this.z;
            } else if (u7Var == this.e) {
                j = this.A;
            }
        }
        float fM = m(j);
        if (fM >= 1.0f) {
            return canvas.save();
        }
        int iSaveLayerAlpha = canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, (int) (255.0f * fM));
        float f = (0.1f * fM) + 0.9f;
        canvas.translate(0.0f, f(10.0f) * (1.0f - fM));
        canvas.scale(f, f, rectF.centerX(), rectF.centerY());
        return iSaveLayerAlpha;
    }

    public final float I(float f) {
        return TypedValue.applyDimension(2, f, getResources().getDisplayMetrics()) * this.F;
    }

    public final String J() {
        int i = this.a;
        return i < 0 ? "--" : String.valueOf(i);
    }

    public final String K() {
        return this.b <= 0 ? "Chưa rõ giới hạn" : p() ? "Quá tốc độ" : o() ? "Gần giới hạn" : "Bình thường";
    }

    public final int L() {
        if (p()) {
            return -308162;
        }
        return o() ? -677572 : -13250420;
    }

    public final int M() {
        u7 u7Var = this.d;
        int i = (u7Var == null || r(u7Var) <= 0) ? 0 : 1;
        if (w() != null) {
            i++;
        }
        return Math.min(2, i);
    }

    public boolean b() {
        return p() || o() || m(this.y) < 1.0f || m(this.z) < 1.0f || m(this.A) < 1.0f || this.k.f >= 0 || this.l.f >= 0 || this.m.f >= 0 || this.n.d >= 0 || this.o.d >= 0 || this.p.d >= 0;
    }

    public final float f(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()) * this.F;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.graphics.Canvas r5, float r6, float r7, float r8, defpackage.u7 r9) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.core.speed.SpeedBubble.g(android.graphics.Canvas, float, float, float, u7):boolean");
    }

    public final void h(Canvas canvas, RectF rectF, float f, int i) {
        float fHeight = rectF.height() / 2.0f;
        Paint paint = this.f;
        paint.setColor(-12959931);
        canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
        if (f <= 0.0f) {
            return;
        }
        float f2 = rectF.left;
        float f3 = rectF.top;
        float fWidth = (rectF.width() * f) + f2;
        float f4 = rectF.bottom;
        RectF rectF2 = this.j;
        rectF2.set(f2, f3, fWidth, f4);
        paint.setColor(i);
        canvas.drawRoundRect(rectF2, fHeight, fHeight, paint);
    }

    public abstract void i(Canvas canvas, int i, int i2);

    public final void j(Canvas canvas, float f, float f2, float f3, float f4, String str, float f5) {
        float f6 = f3 / 2.0f;
        Paint paint = this.f;
        paint.setColor(-657673);
        canvas.drawCircle(f, f2, f6, paint);
        Paint paint2 = this.g;
        paint2.setColor(-2082002);
        paint2.setStrokeWidth(f4);
        canvas.drawCircle(f, f2, f6 - (f4 / 2.0f), paint2);
        Paint paint3 = this.h;
        paint3.setColor(-14671063);
        paint3.setTextSize(I(f5));
        paint3.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, f, c(paint3, f2), paint3);
    }

    public final void k(Canvas canvas, RectF rectF, float f) {
        float fN = (!p() ? 0.0f : (N(1600L) * 0.42f) + 0.18f) * this.s;
        if (fN <= 0.0f) {
            return;
        }
        float fMax = Math.max(rectF.width(), rectF.height()) / 2.0f;
        if (this.u == null || fMax != this.v) {
            this.u = new RadialGradient(0.0f, 0.0f, fMax, new int[]{16469054, 16469054, -308162}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP);
            this.v = fMax;
        }
        int iSave = canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        RadialGradient radialGradient = this.u;
        Paint paint = this.t;
        paint.setShader(radialGradient);
        paint.setAlpha((int) (fN * 255.0f));
        canvas.drawRoundRect(rectF.left - rectF.centerX(), rectF.top - rectF.centerY(), rectF.right - rectF.centerX(), rectF.bottom - rectF.centerY(), f, f, paint);
        canvas.restoreToCount(iSave);
    }

    public final float l() {
        return (p() || o()) ? ((N(1800L) * 0.5f) + 0.35f) * this.s : this.s;
    }

    public final float n() {
        int i;
        int i2 = this.b;
        if (i2 <= 0 || (i = this.a) <= 0) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, i / (i2 * 1.4f)));
    }

    public final boolean o() {
        int i = this.b;
        if (i <= 0) {
            return false;
        }
        int i2 = this.a;
        return ((float) i2) >= ((float) i) * 0.95f && i2 <= i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        E();
        v();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Choreographer.getInstance().removeFrameCallback(this.I);
        this.H = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        float fN = n();
        xa xaVar = this.k;
        xaVar.b(fN, jElapsedRealtime);
        xa xaVar2 = this.l;
        xaVar2.b(fN, jElapsedRealtime);
        xa xaVar3 = this.m;
        xaVar3.b(fN, jElapsedRealtime);
        int iL = L();
        wa waVar = this.n;
        if (iL != waVar.b) {
            waVar.a = waVar.c;
            waVar.b = iL;
            waVar.d = jElapsedRealtime;
        }
        int iL2 = (p() || o()) ? L() : -12696758;
        wa waVar2 = this.o;
        if (iL2 != waVar2.b) {
            waVar2.a = waVar2.c;
            waVar2.b = iL2;
            waVar2.d = jElapsedRealtime;
        }
        int iL3 = this.a < 0 ? -6643286 : this.b <= 0 ? -855051 : L();
        wa waVar3 = this.p;
        if (iL3 != waVar3.b) {
            waVar3.a = waVar3.c;
            waVar3.b = iL3;
            waVar3.d = jElapsedRealtime;
        }
        xaVar.a(jElapsedRealtime);
        xaVar2.a(jElapsedRealtime);
        xaVar3.a(jElapsedRealtime);
        waVar.a(jElapsedRealtime);
        waVar2.a(jElapsedRealtime);
        waVar3.a(jElapsedRealtime);
        i(canvas, getWidth(), getHeight());
        v();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            E();
            v();
        }
    }

    public final boolean p() {
        int i = this.b;
        return i > 0 && this.a > i;
    }

    public final String q() {
        int i = this.b;
        return i <= 0 ? "--" : String.valueOf(i);
    }

    public final int r(u7 u7Var) {
        if (u7Var == null) {
            return 0;
        }
        return this.B ? u7Var.b : w7.h(u7Var);
    }

    public final int s(int i) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (((i >>> 24) & 255) * this.s)) << 24);
    }

    public final void v() {
        if (!this.H && isAttachedToWindow() && getVisibility() == 0) {
            boolean zB = b();
            va vaVar = this.I;
            if (zB) {
                this.H = true;
                Choreographer.getInstance().postFrameCallback(vaVar);
            } else {
                if (this.d == null && this.e == null) {
                    return;
                }
                this.H = true;
                Choreographer.getInstance().postFrameCallbackDelayed(vaVar, 200L);
            }
        }
    }

    public final u7 w() {
        u7 u7Var = this.c;
        return u7Var != null ? u7Var : this.e;
    }

    public final int x() {
        if (this.c != null) {
            return -13250420;
        }
        return d(r(this.e));
    }

    public final String y() {
        return this.c != null ? "Hiệu lực" : e(r(this.e));
    }

    public final void z(boolean z) {
        if (z != this.G) {
            this.G = z;
            requestLayout();
            invalidate();
            v();
        }
    }
}
