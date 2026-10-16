package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.u7;
import java.util.Locale;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedDial extends SpeedBubble {
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final Paint Q;
    public float R;

    public SpeedDial(Context context) {
        super(context);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        Paint paint = new Paint(1);
        this.Q = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void O(Canvas canvas, float f, float f2) {
        float f3;
        if (M() + (G() ? 1 : 0) == 0) {
            return;
        }
        Paint.Align align = Paint.Align.LEFT;
        Paint paint = this.i;
        paint.setTextAlign(align);
        if (G()) {
            j(canvas, (f(54.0f) / 2.0f) + f, (f(58.0f) / 2.0f) + f2, f(54.0f), f(7.0f), q(), 22.0f);
            paint.setLetterSpacing(0.1f);
            paint.setColor(-6643286);
            paint.setTextSize(I(10.0f));
            canvas.drawText("GIỚI HẠN", f(9.0f) + f(54.0f) + f, SpeedBubble.c(paint, (f(58.0f) / 2.0f) + f2), paint);
            f3 = f(10.0f) + f(58.0f) + f2;
        } else {
            f3 = f2;
        }
        paint.setLetterSpacing(0.0f);
        int iR = r(this.d);
        u7 u7Var = this.d;
        if (u7Var != null && iR > 0) {
            R(canvas, f, f3, u7Var, P(), SpeedBubble.d(iR));
            f3 += f(10.0f) + f(42.0f);
        }
        if (w() != null) {
            R(canvas, f, f3, w(), y(), x());
        }
    }

    public final String P() {
        int iR = r(this.d);
        if (iR >= 1000) {
            return String.format(Locale.US, "%.1f km", Float.valueOf(iR / 1000.0f));
        }
        return iR + " m";
    }

    public final float Q() {
        int iM = M();
        if ((G() ? 1 : 0) + iM == 0) {
            return 0.0f;
        }
        return (f(10.0f) * (r1 - 1)) + (f(42.0f) * iM) + (G() ? f(58.0f) : 0.0f);
    }

    public final void R(Canvas canvas, float f, float f2, u7 u7Var, String str, int i) {
        float f3 = f(9.0f) + f(54.0f) + f + this.R;
        float f4 = f(42.0f) + f2;
        RectF rectF = this.P;
        rectF.set(f, f2, f3, f4);
        int iH = H(canvas, u7Var, rectF);
        g(canvas, (f(42.0f) / 2.0f) + f, (f(42.0f) / 2.0f) + f2, f(42.0f), u7Var);
        Paint paint = this.i;
        paint.setColor(i);
        paint.setTextSize(I(12.0f));
        canvas.drawText(str, f(9.0f) + f(54.0f) + f, SpeedBubble.c(paint, (f(42.0f) / 2.0f) + f2), paint);
        canvas.restoreToCount(iH);
    }

    public final float S() {
        Paint paint = this.i;
        paint.setLetterSpacing(0.1f);
        paint.setTextSize(I(10.0f));
        float fMeasureText = G() ? paint.measureText("GIỚI HẠN") : 0.0f;
        paint.setLetterSpacing(0.0f);
        paint.setTextSize(I(12.0f));
        u7 u7Var = this.d;
        if (u7Var != null && r(u7Var) > 0) {
            fMeasureText = Math.max(fMeasureText, paint.measureText(P()));
        }
        return w() != null ? Math.max(fMeasureText, paint.measureText(y())) : fMeasureText;
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final void i(Canvas canvas, int i, int i2) {
        Canvas canvas2;
        float f = f(2.0f);
        float F = F();
        RectF rectF = this.M;
        rectF.set(f + F, 0.0f, (i - f) + F, i2);
        float f2 = f(16.0f);
        int i3 = this.n.c;
        int iS = s(-350215383);
        Paint paint = this.f;
        paint.setColor(iS);
        canvas.drawRoundRect(rectF, f(24.0f), f(24.0f), paint);
        k(canvas, rectF, f(24.0f));
        int i4 = this.o.c;
        Paint paint2 = this.g;
        paint2.setColor(i4);
        paint2.setStrokeWidth(f(1.0f));
        paint2.setAlpha((int) (l() * 255.0f));
        canvas.drawRoundRect(rectF, f(24.0f), f(24.0f), paint2);
        paint2.setAlpha(255);
        if (this.G) {
            O(canvas, rectF.left + f2, rectF.top + f2);
            return;
        }
        float f3 = rectF.left + f2;
        float f4 = rectF.bottom - f2;
        float f5 = f(140.0f) / 200.0f;
        float f6 = (100.0f * f5) + f3;
        float f7 = f4 - (10.0f * f5);
        float f8 = 86.0f * f5;
        float f9 = f7 + f8;
        RectF rectF2 = this.N;
        rectF2.set(f6 - f8, f7 - f8, f6 + f8, f9);
        Paint paint3 = this.Q;
        paint3.setStrokeWidth(11.0f * f5);
        paint3.setColor(-12959931);
        canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint3);
        if (this.b > 0) {
            paint3.setColor(i3);
            canvas2 = canvas;
            canvas2.drawArc(rectF2, 180.0f, this.k.e * 180.0f, false, paint3);
            paint.setColor(-657673);
            double d = f8;
            canvas2.drawCircle((float) ((Math.cos(0.8975979010256552d) * d) + f6), (float) (f7 - (Math.sin(0.8975979010256552d) * d)), f5 * 6.0f, paint);
            int iSave = canvas2.save();
            canvas2.rotate((this.m.e * 180.0f) - 90.0f, f6, f7);
            float f10 = f6 - f(1.5f);
            float f11 = f7 - f(74.0f);
            float f12 = f(1.5f) + f6;
            RectF rectF3 = this.O;
            rectF3.set(f10, f11, f12, f7);
            paint.setColor(i3);
            canvas2.drawRoundRect(rectF3, f(2.0f), f(2.0f), paint);
            canvas2.restoreToCount(iSave);
            paint.setColor(-657673);
            canvas2.drawCircle(f6, f7, f(7.0f), paint);
        } else {
            canvas2 = canvas;
        }
        Paint.Align align = Paint.Align.CENTER;
        Paint paint4 = this.h;
        paint4.setTextAlign(align);
        paint4.setColor(this.p.c);
        paint4.setTextSize(I(28.0f));
        canvas2.drawText(J(), f6, f4 - f(34.0f), paint4);
        O(canvas2, f(14.0f) + f(140.0f) + rectF.left + f2, rectF.top + f2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float fQ;
        int iM = M() + (G() ? 1 : 0);
        if (this.G) {
            this.R = S();
            f = f(9.0f) + f(54.0f) + f(16.0f) + this.R + f(16.0f);
            fQ = Q() + (f(16.0f) * 2.0f);
        } else {
            float f2 = f(140.0f) + f(16.0f);
            if (iM > 0) {
                this.R = S();
                f2 += f(9.0f) + f(54.0f) + f(14.0f) + this.R;
            }
            f = f(16.0f) + f2;
            fQ = f(128.0f);
            if (iM > 0) {
                fQ = Math.max(fQ, Q() + (f(16.0f) * 2.0f));
            }
        }
        setMeasuredDimension(Math.round((f(2.0f) * 2.0f) + f), Math.round(fQ));
    }
}
