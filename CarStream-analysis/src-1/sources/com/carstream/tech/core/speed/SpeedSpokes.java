package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.u7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedSpokes extends SpeedBubble {
    public static final int P = Math.round(30.714287f);
    public final RectF M;
    public final RectF N;
    public final RectF O;

    public SpeedSpokes(Context context) {
        super(context);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
    }

    public final void O(Canvas canvas, float f, float f2, u7 u7Var, String str, int i) {
        float f3 = f(118.0f) + f;
        float f4 = f(56.0f) + f2;
        RectF rectF = this.O;
        rectF.set(f, f2, f3, f4);
        int iH = H(canvas, u7Var, rectF);
        float f5 = f(56.0f) / 2.0f;
        Paint paint = this.f;
        paint.setColor(-13883081);
        canvas.drawRoundRect(rectF, f5, f5, paint);
        Paint paint2 = this.g;
        paint2.setColor(-12041131);
        paint2.setStrokeWidth(f(1.0f));
        canvas.drawRoundRect(rectF, f5, f5, paint2);
        float f6 = f(38.0f);
        g(canvas, (f6 / 2.0f) + f(9.0f) + rectF.left, rectF.centerY(), f6, u7Var);
        Paint.Align align = Paint.Align.LEFT;
        Paint paint3 = this.i;
        paint3.setTextAlign(align);
        paint3.setLetterSpacing(0.0f);
        paint3.setColor(i);
        paint3.setTextSize(I(12.0f));
        canvas.drawText(str, f(9.0f) + f(9.0f) + rectF.left + f6, SpeedBubble.c(paint3, rectF.centerY()), paint3);
        canvas.restoreToCount(iH);
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final void i(Canvas canvas, int i, int i2) {
        boolean z;
        float f;
        int i3;
        float f2;
        float f3 = 2.0f;
        float f4 = f(2.0f);
        float F = F();
        RectF rectF = this.M;
        rectF.set(f4 + F, 0.0f, (i - f4) + F, i2);
        int i4 = this.n.c;
        int iS = s(-349822161);
        Paint paint = this.f;
        paint.setColor(iS);
        canvas.drawRoundRect(rectF, f(28.0f), f(28.0f), paint);
        k(canvas, rectF, f(28.0f));
        int i5 = this.o.c;
        Paint paint2 = this.g;
        paint2.setColor(i5);
        paint2.setStrokeWidth(f(1.0f));
        paint2.setAlpha((int) (l() * 255.0f));
        canvas.drawRoundRect(rectF, f(28.0f), f(28.0f), paint2);
        paint2.setAlpha(255);
        float fCenterX = rectF.centerX();
        float f5 = f(14.0f) + rectF.top;
        boolean z2 = this.G;
        Paint paint3 = this.i;
        float f6 = 16.0f;
        if (z2) {
            z = false;
        } else {
            float f7 = (f(170.0f) / 2.0f) + f5;
            float f8 = f(74.0f);
            float f9 = f(1.5f);
            int i6 = 0;
            while (i6 < 44) {
                int i7 = this.b;
                float f10 = f3;
                boolean z3 = i7 > 0 && i6 == P;
                boolean z4 = i7 > 0 && ((float) i6) / 43.0f <= this.k.e;
                float f11 = z3 ? f(22.0f) : z4 ? f(f6) : f(10.0f);
                int iSave = canvas.save();
                float f12 = f5;
                canvas.rotate((i6 * 6.27907f) - 135.0f, fCenterX, f7);
                paint.setColor(z3 ? -328966 : z4 ? i4 : -11909549);
                float f13 = f7 - f8;
                float f14 = f11 / f10;
                float f15 = f13 + f14;
                RectF rectF2 = this.N;
                rectF2.set(fCenterX - f9, f13 - f14, fCenterX + f9, f15);
                canvas.drawRoundRect(rectF2, f(f10), f(f10), paint);
                canvas.restoreToCount(iSave);
                i6++;
                f5 = f12;
                f6 = 16.0f;
                f3 = 2.0f;
            }
            float f16 = f5;
            paint.setColor(-14014669);
            canvas.drawCircle(fCenterX, f7, f(60.0f), paint);
            Paint.Align align = Paint.Align.CENTER;
            Paint paint4 = this.h;
            paint4.setTextAlign(align);
            paint4.setColor(this.p.c);
            paint4.setTextSize(I(36.0f));
            canvas.drawText(J(), fCenterX, I(12.0f) + f7, paint4);
            paint3.setTextAlign(align);
            paint3.setLetterSpacing(0.16f);
            paint3.setColor(-5989200);
            paint3.setTextSize(I(10.0f));
            canvas.drawText("KM/H", fCenterX, I(32.0f) + f7, paint3);
            f5 = f(170.0f) + f16;
            z = true;
        }
        if (G()) {
            if (z) {
                f2 = 16.0f;
                f5 += f(16.0f);
            } else {
                f2 = 16.0f;
            }
            float f17 = f5;
            float f18 = fCenterX - (f(220.0f) / 2.0f);
            float f19 = (f(220.0f) / 2.0f) + fCenterX;
            float f20 = f(84.0f) + f17;
            RectF rectF3 = this.O;
            rectF3.set(f18, f17, f19, f20);
            float f21 = f(84.0f) / 2.0f;
            paint.setColor(-13883081);
            canvas.drawRoundRect(rectF3, f21, f21, paint);
            paint2.setColor(-12041131);
            paint2.setStrokeWidth(f(1.0f));
            canvas.drawRoundRect(rectF3, f21, f21, paint2);
            float f22 = f(66.0f);
            float f23 = f22 / 2.0f;
            float f24 = f(8.0f) + rectF3.left + f23;
            f = f2;
            j(canvas, f24, rectF3.centerY(), f22, f(9.0f), q(), 27.0f);
            float f25 = f(12.0f) + f24 + f23;
            paint3.setTextAlign(Paint.Align.LEFT);
            paint3.setLetterSpacing(0.14f);
            paint3.setColor(-4409657);
            paint3.setTextSize(I(11.0f));
            canvas.drawText("GIỚI HẠN", f25, rectF3.centerY() - f(3.0f), paint3);
            paint3.setLetterSpacing(0.0f);
            paint3.setColor(i4);
            canvas.drawText(K(), f25, f(14.0f) + rectF3.centerY(), paint3);
            f5 = f(84.0f) + f17;
            z = true;
        } else {
            f = 16.0f;
        }
        if (M() > 0) {
            if (z) {
                f5 += f(f);
            }
            float f26 = fCenterX - (((f(10.0f) * (r2 - 1)) + (f(118.0f) * M())) / 2.0f);
            int iR = r(this.d);
            u7 u7Var = this.d;
            if (u7Var == null || iR <= 0) {
                i3 = 0;
            } else {
                O(canvas, f26, f5, u7Var, SpeedBubble.e(iR), SpeedBubble.d(iR));
                i3 = 1;
            }
            if (w() != null) {
                O(canvas, f26 + ((f(10.0f) + f(118.0f)) * i3), f5, w(), y(), x());
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f = 0.0f;
        float fMax = !this.G ? Math.max(0.0f, f(170.0f)) : 0.0f;
        if (G()) {
            fMax = Math.max(fMax, f(220.0f));
        }
        int iM = M();
        boolean z2 = true;
        if (iM > 0) {
            fMax = Math.max(fMax, (f(10.0f) * (iM - 1)) + (f(118.0f) * iM));
        }
        int iRound = Math.round((f(2.0f) * 2.0f) + (f(14.0f) * 2.0f) + fMax);
        if (this.G) {
            z = false;
        } else {
            f = 0.0f + f(170.0f);
            z = true;
        }
        if (G()) {
            if (z) {
                f += f(16.0f);
            }
            f += f(84.0f);
        } else {
            z2 = z;
        }
        if (M() > 0) {
            if (z2) {
                f += f(16.0f);
            }
            f += f(56.0f);
        }
        setMeasuredDimension(iRound, Math.round((f(14.0f) * 2.0f) + f));
    }
}
