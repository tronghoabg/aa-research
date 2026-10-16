package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import defpackage.u7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedPill extends SpeedBubble {
    public final RectF M;
    public final RectF N;
    public final Paint O;
    public float P;
    public float Q;

    public SpeedPill(Context context) {
        super(context);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Paint(1);
        this.P = -1.0f;
    }

    public final float O(Canvas canvas, float f) {
        int iS = s(-12696758);
        Paint paint = this.f;
        paint.setColor(iS);
        RectF rectF = this.N;
        canvas.drawRect(f, f(12.0f) + rectF.top, f(1.0f) + f, rectF.bottom - f(12.0f), paint);
        return f(1.0f);
    }

    public final void P(Canvas canvas, float f, float f2, u7 u7Var, String str, int i) {
        float f3 = (f(70.0f) / 2.0f) + f;
        float f4 = f(50.0f);
        float f5 = f2 - f(8.0f);
        float f6 = f4 / 2.0f;
        float f7 = f5 - f6;
        float f8 = f(70.0f) + f;
        float f9 = f6 + f5;
        float f10 = f(22.0f) + f9;
        RectF rectF = this.M;
        rectF.set(f, f7, f8, f10);
        int iH = H(canvas, u7Var, rectF);
        if (g(canvas, f3, f5, f4, u7Var)) {
            Paint.Align align = Paint.Align.CENTER;
            Paint paint = this.i;
            paint.setTextAlign(align);
            paint.setLetterSpacing(0.0f);
            paint.setColor(i);
            paint.setTextSize(I(12.0f));
            canvas.drawText(str, f3, f(15.0f) + f9, paint);
        }
        canvas.restoreToCount(iH);
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final void i(Canvas canvas, int i, int i2) {
        float f;
        float f2;
        boolean z;
        float f3;
        int i3;
        float f4;
        Canvas canvas2 = canvas;
        float f5 = f(2.0f);
        float F = F();
        RectF rectF = this.N;
        rectF.set(f5 + F, 0.0f, (i - f5) + F, i2);
        float f6 = f(32.0f);
        int i4 = this.n.c;
        int iSave = canvas2.save();
        int iS = s(-350215383);
        Paint paint = this.f;
        paint.setColor(iS);
        canvas2.drawRoundRect(rectF, f6, f6, paint);
        if (p()) {
            int iSave2 = canvas2.save();
            canvas2.clipRect(rectF);
            k(canvas2, rectF, f6);
            float fWidth = rectF.width() * 0.22f;
            float f7 = this.P;
            Paint paint2 = this.O;
            if (fWidth != f7) {
                f4 = fWidth;
                paint2.setShader(new LinearGradient(0.0f, 0.0f, fWidth, 0.0f, new int[]{16469054, 1207651390, 16469054}, (float[]) null, Shader.TileMode.CLAMP));
                this.P = f4;
            } else {
                f4 = fWidth;
            }
            canvas2.translate((SpeedBubble.t(1500L) * ((f4 * 2.0f) + rectF.width())) + (rectF.left - f4), 0.0f);
            canvas2.drawRect(0.0f, rectF.top, f4, rectF.bottom, paint2);
            canvas2.restoreToCount(iSave2);
        }
        int i5 = this.o.c;
        Paint paint3 = this.g;
        paint3.setColor(i5);
        paint3.setStrokeWidth(f(1.0f));
        paint3.setAlpha((int) (l() * 255.0f));
        canvas2.drawRoundRect(rectF, f6, f6, paint3);
        paint3.setAlpha(255);
        float f8 = f(18.0f) + rectF.left;
        float fCenterY = rectF.centerY();
        if (this.G) {
            f = 1.0f;
            f2 = 18.0f;
            z = false;
        } else {
            Paint.Align align = Paint.Align.LEFT;
            f = 1.0f;
            Paint paint4 = this.h;
            paint4.setTextAlign(align);
            paint4.setColor(this.p.c);
            paint4.setTextSize(I(34.0f));
            float f9 = this.b > 0 ? f(2.0f) + fCenterY : SpeedBubble.c(paint4, fCenterY);
            canvas2.drawText(J(), f8, f9, paint4);
            Paint paint5 = this.i;
            paint5.setTextAlign(align);
            paint5.setColor(-6643286);
            paint5.setTextSize(I(11.0f));
            paint5.setLetterSpacing(0.1f);
            canvas2.drawText("KM/H", f(7.0f) + paint4.measureText(J()) + f8, f9, paint5);
            if (this.b > 0) {
                float f10 = rectF.bottom - f(16.0f);
                int iRound = Math.round(this.l.e * 18.0f);
                int i6 = 0;
                while (i6 < 18) {
                    boolean z2 = i6 < iRound;
                    float f11 = f(z2 ? i6 > 12 ? 14.0f : 10.0f : 6.0f);
                    float f12 = ((f(3.0f) + f(3.0f)) * i6) + f8;
                    paint.setColor(z2 ? i4 : -12367793);
                    float f13 = f10 - f11;
                    float f14 = f(3.0f) + f12;
                    RectF rectF2 = this.M;
                    rectF2.set(f12, f13, f14, f10);
                    canvas2.drawRoundRect(rectF2, f(2.0f), f(2.0f), paint);
                    i6++;
                }
            }
            f2 = 18.0f;
            f8 += f(18.0f) + this.Q;
            z = true;
        }
        if (G()) {
            if (z) {
                f8 += f(f2) + O(canvas2, f8);
            }
            float f15 = f8;
            float f16 = (f(68.0f) / 2.0f) + f15;
            if (p()) {
                float fT = SpeedBubble.t(1400L);
                paint3.setColor(-308162);
                paint3.setStrokeWidth(f(2.0f));
                paint3.setAlpha((int) ((f - fT) * 180.0f));
                canvas2.drawCircle(f16, fCenterY, ((fT * 0.75f) + 0.85f) * (f(68.0f) / 2.0f), paint3);
                paint3.setAlpha(255);
            }
            f3 = fCenterY;
            j(canvas2, f16, f3, f(68.0f), f(8.0f), q(), 29.0f);
            f2 = 18.0f;
            f8 = f(18.0f) + f(68.0f) + f15;
            z = true;
        } else {
            f3 = fCenterY;
        }
        if (M() > 0) {
            if (z) {
                f8 += f(f2) + O(canvas2, f8);
            }
            float f17 = f8;
            int iR = r(this.d);
            if (this.d == null || iR <= 0) {
                i3 = 0;
            } else {
                P(canvas2, ((f(16.0f) + f(70.0f)) * 0) + f17, f3, this.d, SpeedBubble.e(iR), SpeedBubble.d(iR));
                i3 = 1;
            }
            if (w() != null) {
                canvas2 = canvas;
                P(canvas2, ((f(16.0f) + f(70.0f)) * i3) + f17, f3, w(), y(), x());
            } else {
                canvas2 = canvas;
            }
        }
        canvas2.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f = f(18.0f);
        if (this.G) {
            this.Q = 0.0f;
            z = false;
        } else {
            float fI = I(34.0f);
            Paint paint = this.h;
            paint.setTextSize(fI);
            float fI2 = I(11.0f);
            Paint paint2 = this.i;
            paint2.setTextSize(fI2);
            paint2.setLetterSpacing(0.1f);
            float fMeasureText = paint2.measureText("KM/H") + f(7.0f) + paint.measureText(J());
            if (this.b > 0) {
                fMeasureText = Math.max(fMeasureText, (f(3.0f) * 17.0f) + (f(3.0f) * 18.0f));
            }
            this.Q = fMeasureText;
            f += f(18.0f) + fMeasureText;
            z = true;
        }
        if (G()) {
            if (z) {
                f += f(18.0f) + f(1.0f);
            }
            f += f(18.0f) + f(68.0f);
            z = true;
        }
        int iM = M();
        if (iM > 0) {
            if (z) {
                f += f(18.0f) + f(1.0f);
            }
            f += f(18.0f) + (f(16.0f) * (iM - 1)) + (f(70.0f) * iM);
        }
        setMeasuredDimension(Math.round((f(2.0f) * 2.0f) + f), Math.round(f(88.0f)));
    }
}
