package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.u7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedRail extends SpeedBubble {
    public final RectF M;
    public final RectF N;
    public final RectF O;

    public SpeedRail(Context context) {
        super(context);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
    }

    public final float O(Canvas canvas, float f, float f2, u7 u7Var, String str, int i) {
        float f3 = f(10.0f) + f2;
        float f4 = f - (f(92.0f) / 2.0f);
        float f5 = (f(92.0f) / 2.0f) + f;
        float f6 = f(4.0f) + P() + f3;
        RectF rectF = this.O;
        rectF.set(f4, f3, f5, f6);
        int iH = H(canvas, u7Var, rectF);
        g(canvas, f, (f(38.0f) / 2.0f) + f3, f(38.0f), u7Var);
        Paint.Align align = Paint.Align.CENTER;
        Paint paint = this.i;
        paint.setTextAlign(align);
        paint.setLetterSpacing(0.0f);
        paint.setColor(i);
        paint.setTextSize(I(10.0f));
        canvas.drawText(str, f, I(10.0f) + f(3.0f) + f(38.0f) + f3, paint);
        canvas.restoreToCount(iH);
        return P() + f3;
    }

    public final float P() {
        return I(12.0f) + f(3.0f) + f(38.0f);
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final void i(Canvas canvas, int i, int i2) {
        float f;
        float f2 = f(2.0f);
        float F = F();
        RectF rectF = this.M;
        rectF.set(f2 + F, 0.0f, (i - f2) + F, i2);
        int i3 = this.n.c;
        int iS = s(-350215383);
        Paint paint = this.f;
        paint.setColor(iS);
        canvas.drawRoundRect(rectF, f(46.0f), f(46.0f), paint);
        k(canvas, rectF, f(46.0f));
        int i4 = this.o.c;
        Paint paint2 = this.g;
        paint2.setColor(i4);
        paint2.setStrokeWidth(f(1.0f));
        paint2.setAlpha((int) (l() * 255.0f));
        canvas.drawRoundRect(rectF, f(46.0f), f(46.0f), paint2);
        paint2.setAlpha(255);
        float fCenterX = rectF.centerX();
        float f3 = f(12.0f) + rectF.top;
        if (!this.G) {
            Paint.Align align = Paint.Align.CENTER;
            Paint paint3 = this.h;
            paint3.setTextAlign(align);
            paint3.setColor(this.p.c);
            paint3.setTextSize(I(28.0f));
            float fI = I(30.0f) + f3;
            canvas.drawText(J(), fCenterX, fI, paint3);
            Paint paint4 = this.i;
            paint4.setTextAlign(align);
            paint4.setLetterSpacing(0.14f);
            paint4.setColor(-6643286);
            paint4.setTextSize(I(9.0f));
            float fI2 = I(13.0f) + fI;
            canvas.drawText("KM/H", fCenterX, fI2, paint4);
            f3 = fI2;
        }
        float f4 = rectF.bottom - f(12.0f);
        if (G()) {
            f4 -= f(10.0f) + f(56.0f);
        }
        float fP = f4 - ((P() + f(10.0f)) * M());
        if (this.b > 0 && !this.G) {
            float f5 = f(6.0f) + f(10.0f) + f3;
            float fMax = Math.max(f(70.0f), fP - f5);
            float f6 = f(10.0f) / 2.0f;
            float f7 = fCenterX - f6;
            float f8 = fCenterX + f6;
            float f9 = f5 + fMax;
            RectF rectF2 = this.N;
            rectF2.set(f7, f5, f8, f9);
            paint.setColor(-12959931);
            canvas.drawRoundRect(rectF2, f6, f6, paint);
            rectF2.set(f7, f9 - (fMax * this.k.e), f8, f9);
            paint.setColor(i3);
            canvas.drawRoundRect(rectF2, f6, f6, paint);
            f3 = f9;
        }
        if (G()) {
            float f10 = f3 + f(10.0f);
            f = fCenterX;
            j(canvas, f, (f(56.0f) / 2.0f) + f10, f(56.0f), f(8.0f), q(), 22.0f);
            f3 = f10 + f(56.0f);
        } else {
            f = fCenterX;
        }
        float fO = f3;
        int iR = r(this.d);
        u7 u7Var = this.d;
        if (u7Var != null && iR > 0) {
            fO = O(canvas, f, fO, u7Var, SpeedBubble.e(iR), SpeedBubble.d(iR));
        }
        if (w() != null) {
            O(canvas, f, fO, w(), y(), x());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2 = f(12.0f);
        if (this.G) {
            f = 0.0f;
        } else {
            f = f(4.0f) + I(13.0f) + I(30.0f);
        }
        float fP = f2 + f;
        if (this.b > 0 && !this.G) {
            fP += f(70.0f) + f(6.0f) + f(10.0f);
        }
        if (G()) {
            fP += f(56.0f) + f(10.0f);
        }
        int iM = M();
        if (iM > 0) {
            fP += (P() + f(10.0f)) * iM;
        }
        setMeasuredDimension(Math.round((f(2.0f) * 2.0f) + f(92.0f)), Math.round(f(12.0f) + fP));
    }
}
