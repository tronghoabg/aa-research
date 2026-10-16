package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.view.animation.PathInterpolator;
import defpackage.u7;
import defpackage.xa;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedLiquid extends SpeedBubble {
    public static final PathInterpolator S = new PathInterpolator(0.4f, 0.8f, 0.3f, 1.0f);
    public final xa M;
    public final Path N;
    public final RectF O;
    public final RectF P;
    public final Paint Q;
    public final Paint R;

    public SpeedLiquid(Context context) {
        super(context);
        this.M = new xa(420L, S);
        this.N = new Path();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new Paint(1);
        Paint paint = new Paint(1);
        this.R = paint;
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode unused = BlendMode.DIFFERENCE;
            paint.setBlendMode(BlendMode.DIFFERENCE);
        }
        paint.setColor(-1);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setTextAlign(Paint.Align.CENTER);
    }

    public final float O() {
        float f;
        if (G()) {
            f = f(10.0f) + f(72.0f);
        } else {
            f = 0.0f;
        }
        return (S() * M()) + f;
    }

    public final void P(Canvas canvas, float f, float f2) {
        SpeedLiquid speedLiquid;
        Canvas canvas2;
        float fO = O();
        if (fO <= 0.0f) {
            return;
        }
        float f3 = (f(72.0f) / 2.0f) + f;
        float f4 = f2 - (fO / 2.0f);
        if (G()) {
            speedLiquid = this;
            canvas2 = canvas;
            speedLiquid.j(canvas2, f3, (f(72.0f) / 2.0f) + f4, f(72.0f), f(10.0f), q(), 30.0f);
            f4 += f(10.0f) + f(72.0f);
        } else {
            speedLiquid = this;
            canvas2 = canvas;
        }
        float fQ = f4;
        int iR = r(speedLiquid.d);
        u7 u7Var = speedLiquid.d;
        if (u7Var != null && iR > 0) {
            fQ = speedLiquid.Q(canvas2, f3, fQ, u7Var, SpeedBubble.e(iR), SpeedBubble.d(iR));
        }
        if (w() != null) {
            Q(canvas2, f3, fQ, w(), y(), x());
        }
    }

    public final float Q(Canvas canvas, float f, float f2, u7 u7Var, String str, int i) {
        float f3 = f - f(40.0f);
        float f4 = f(40.0f) + f;
        float fS = S() + f2;
        RectF rectF = this.P;
        rectF.set(f3, f2, f4, fS);
        int iH = H(canvas, u7Var, rectF);
        g(canvas, f, (f(40.0f) / 2.0f) + f2, f(40.0f), u7Var);
        Paint.Align align = Paint.Align.CENTER;
        Paint paint = this.i;
        paint.setTextAlign(align);
        paint.setLetterSpacing(0.0f);
        paint.setColor(i);
        paint.setTextSize(I(11.0f));
        canvas.drawText(str, f, I(13.0f) + f(40.0f) + f2, paint);
        canvas.restoreToCount(iH);
        return S() + f2;
    }

    public final void R(Canvas canvas, float f, float f2, float f3, int i, int i2, float f4, long j, float f5, float f6, float f7) {
        float fSin = (float) Math.sin(SpeedBubble.t(j) * 3.141592653589793d * 2.0d);
        Paint paint = this.Q;
        paint.setColor(i);
        paint.setAlpha(i2);
        float f8 = 2.1f * f2;
        float f9 = f5 * f2 * fSin;
        float f10 = f4 / 2.0f;
        float f11 = f6 * fSin;
        RectF rectF = this.O;
        rectF.set((f - f8) + f9, (f3 - f10) + f11, f8 + f + f9, f10 + f3 + f11);
        int iSave = canvas.save();
        canvas.rotate(f7 * fSin, f, f3);
        canvas.drawOval(rectF, paint);
        canvas.restoreToCount(iSave);
    }

    public final float S() {
        return f(10.0f) + I(11.0f) + f(3.0f) + f(40.0f);
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final boolean b() {
        return !this.G || super.b();
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final void i(Canvas canvas, int i, int i2) {
        float fMin;
        Canvas canvas2;
        float f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = this.b;
        if (i3 <= 0) {
            fMin = 0.0f;
        } else {
            int i4 = this.a;
            fMin = Math.min(1.0f, i4 <= 0 ? 0.0f : i4 / i3) * 0.71f;
        }
        xa xaVar = this.M;
        xaVar.b(fMin, jElapsedRealtime);
        xaVar.a(jElapsedRealtime);
        float F = F();
        float f2 = f(150.0f) / 2.0f;
        float f3 = f(2.0f) + F + f2;
        float f4 = i2 / 2.0f;
        int i5 = this.n.c;
        if (this.G) {
            P(canvas, f(18.0f) + f(2.0f) + F, f4);
            return;
        }
        float f5 = f3 - f2;
        float f6 = f3 + f2;
        float f7 = f4 + f2;
        int iSaveLayer = canvas.saveLayer(f5, f4 - f2, f6, f7, null);
        int iS = s(-14012877);
        Paint paint = this.f;
        paint.setColor(iS);
        canvas.drawCircle(f3, f4, f2, paint);
        int iSave = canvas.save();
        Path path = this.N;
        path.reset();
        path.addCircle(f3, f4, f2 - f(1.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float f8 = (f7 - (f(150.0f) * xaVar.e)) + (f(3.0f) * ((float) Math.sin(SpeedBubble.t(2700L) * 3.141592653589793d * 2.0d)));
        paint.setColor(i5);
        canvas.drawRect(f5, f8, f6, f7, paint);
        R(canvas, f3, f2, f8, i5, 235, f(32.0f), 2100L, 0.18f, f(7.0f), 5.0f);
        R(canvas, f3, f2, f8, i5, 128, f(34.0f), 1500L, -0.16f, f(7.0f), -6.0f);
        R(canvas, f3, f2, f8, -1, 46, f(26.0f), 1100L, 0.1f, f(5.0f), 4.0f);
        if (this.b > 0) {
            paint.setColor(-1929379841);
            float f9 = f7 - (f(150.0f) * 0.71f);
            canvas2 = canvas;
            canvas2.drawRect(f5, f9 - f(1.0f), f6, f(1.0f) + f9, paint);
            f = f6;
        } else {
            canvas2 = canvas;
            f = f6;
        }
        canvas2.restoreToCount(iSave);
        int i6 = this.o.c;
        Paint paint2 = this.g;
        paint2.setColor(i6);
        paint2.setStrokeWidth(f(2.0f));
        paint2.setAlpha((int) (l() * 255.0f));
        canvas2.drawCircle(f3, f4, f2 - f(1.0f), paint2);
        paint2.setAlpha(255);
        float fI = I(38.0f);
        Paint paint3 = this.R;
        paint3.setTextSize(fI);
        paint3.setLetterSpacing(0.0f);
        canvas2.drawText(J(), f3, I(8.0f) + f4, paint3);
        paint3.setTextSize(I(10.0f));
        paint3.setLetterSpacing(0.16f);
        canvas2.drawText("KM/H", f3, I(34.0f) + f4, paint3);
        canvas2.restoreToCount(iSaveLayer);
        P(canvas2, f(18.0f) + f, f4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float fO;
        float f2;
        if (this.G) {
            f = f(72.0f) + f(18.0f);
            fO = O();
        } else {
            float f3 = f(150.0f);
            if (this.b > 0 || M() > 0) {
                f2 = f(72.0f) + f(18.0f);
            } else {
                f2 = 0.0f;
            }
            f = f3 + f2;
            fO = Math.max(f(150.0f), O());
        }
        setMeasuredDimension(Math.round((f(2.0f) * 2.0f) + f), Math.round(fO));
    }
}
