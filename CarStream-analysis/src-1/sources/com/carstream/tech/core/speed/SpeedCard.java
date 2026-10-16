package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import defpackage.u7;
import defpackage.xc;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedCard extends SpeedBubble {
    public final RectF M;
    public final RectF N;
    public final Paint O;
    public float P;
    public float Q;
    public int R;

    public SpeedCard(Context context) {
        super(context);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Paint(1);
        this.P = Float.NaN;
    }

    public final void O(Canvas canvas, float f, float f2, float f3, u7 u7Var, String str, String str2, int i, float f4) {
        float f5;
        String strConcat;
        String str3;
        float f6;
        float f7 = f + f3;
        float f8 = f(74.0f) + f2;
        RectF rectF = this.M;
        rectF.set(f, f2, f7, f8);
        int iH = H(canvas, u7Var, rectF);
        Paint paint = this.f;
        paint.setColor(-14012877);
        canvas.drawRoundRect(rectF, f(16.0f), f(16.0f), paint);
        float f9 = f(40.0f);
        float f10 = f9 / 2.0f;
        float f11 = f(10.0f) + f + f10;
        float f12 = f(10.0f) + f2 + f10;
        g(canvas, f11, f12, f9, u7Var);
        float f13 = f(9.0f) + f11 + f10;
        float f14 = f7 - f(8.0f);
        Paint.Align align = Paint.Align.LEFT;
        Paint paint2 = this.i;
        paint2.setTextAlign(align);
        paint2.setLetterSpacing(0.0f);
        paint2.setColor(-6643286);
        paint2.setTextSize(I(10.0f));
        float f15 = f14 - f13;
        if (str == null) {
            str3 = "";
        } else {
            if (!str.equals(this.D) || f15 != this.E) {
                if (paint2.measureText(str) > f15) {
                    String strSubstring = str;
                    while (true) {
                        f5 = f12;
                        if (strSubstring.length() <= 1 || paint2.measureText(strSubstring.concat("…")) <= f15) {
                            break;
                        }
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        f12 = f5;
                    }
                    strConcat = strSubstring.concat("…");
                } else {
                    f5 = f12;
                    strConcat = str;
                }
                this.D = str;
                this.E = f15;
                this.C = strConcat;
                str3 = strConcat;
                f6 = 2.0f;
                canvas.drawText(str3, f13, f5 - f(f6), paint2);
                paint2.setColor(i);
                paint2.setTextSize(I(13.0f));
                canvas.drawText(str2, f13, f(14.0f) + f5, paint2);
                rectF.set(f(10.0f) + f, (f(74.0f) + f2) - f(13.0f), f7 - f(10.0f), (f(74.0f) + f2) - f(10.0f));
                h(canvas, rectF, f4, i);
                canvas.restoreToCount(iH);
            }
            str3 = this.C;
        }
        f5 = f12;
        f6 = 2.0f;
        canvas.drawText(str3, f13, f5 - f(f6), paint2);
        paint2.setColor(i);
        paint2.setTextSize(I(13.0f));
        canvas.drawText(str2, f13, f(14.0f) + f5, paint2);
        rectF.set(f(10.0f) + f, (f(74.0f) + f2) - f(13.0f), f7 - f(10.0f), (f(74.0f) + f2) - f(10.0f));
        h(canvas, rectF, f4, i);
        canvas.restoreToCount(iH);
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final boolean b() {
        return super.b() || this.b > 0;
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final void i(Canvas canvas, int i, int i2) {
        float f;
        int i3;
        float f2 = f(2.0f);
        float F = F();
        RectF rectF = this.N;
        rectF.set(f2 + F, 0.0f, (i - f2) + F, i2);
        float f3 = f(26.0f);
        float f4 = f(16.0f);
        int i4 = this.n.c;
        int iS = s(-350215383);
        Paint paint = this.f;
        paint.setColor(iS);
        canvas.drawRoundRect(rectF, f3, f3, paint);
        k(canvas, rectF, f3);
        int i5 = this.o.c;
        Paint paint2 = this.g;
        paint2.setColor(i5);
        paint2.setStrokeWidth(f(1.0f));
        paint2.setAlpha((int) (l() * 255.0f));
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        paint2.setAlpha(255);
        if (!this.G) {
            Paint.Align align = Paint.Align.LEFT;
            Paint paint3 = this.h;
            paint3.setTextAlign(align);
            paint3.setColor(this.p.c);
            paint3.setTextSize(I(36.0f));
            float fI = (I(36.0f) * 0.95f) + rectF.top + f4;
            canvas.drawText(J(), rectF.left + f4, fI, paint3);
            Paint paint4 = this.i;
            paint4.setTextAlign(align);
            paint4.setLetterSpacing(0.12f);
            paint4.setColor(-6643286);
            paint4.setTextSize(I(11.0f));
            canvas.drawText("KM/H · ".concat(K()), rectF.left + f4, I(16.0f) + fI, paint4);
        }
        if (G()) {
            float f5 = f(70.0f);
            float fCenterX = !this.G ? (rectF.right - f4) - (f5 / 2.0f) : rectF.centerX();
            float f6 = f5 / 2.0f;
            float f7 = rectF.top + f4 + f6;
            float f8 = this.P;
            f = 2.0f;
            Paint paint5 = this.O;
            if (fCenterX != f8 || f7 != this.Q || i4 != this.R) {
                paint5.setShader(new SweepGradient(fCenterX, f7, new int[]{i4, 0, 0, i4}, new float[]{0.0f, 0.55f, 0.99f, 1.0f}));
                this.P = fCenterX;
                this.Q = f7;
                this.R = i4;
            }
            int iSave = canvas.save();
            canvas.rotate(SpeedBubble.t(2600L) * 360.0f, fCenterX, f7);
            canvas.drawCircle(fCenterX, f7, f(5.0f) + f6, paint5);
            canvas.restoreToCount(iSave);
            paint.setColor(-14671063);
            canvas.drawCircle(fCenterX, f7, f(1.0f) + f6, paint);
            j(canvas, fCenterX, f7, f5, f(9.0f), q(), 30.0f);
        } else {
            f = 2.0f;
        }
        if (this.b > 0 && !this.G) {
            float f9 = f(84.0f) + rectF.top + f4;
            float f10 = rectF.left + f4;
            float f11 = rectF.right - f4;
            float f12 = f(6.0f) + f9;
            RectF rectF2 = this.M;
            rectF2.set(f10, f9, f11, f12);
            h(canvas, rectF2, this.k.e, i4);
        }
        float f13 = f(18.0f) + (!this.G ? f(84.0f) : f(70.0f) + f(12.0f)) + f(16.0f) + rectF.top;
        int iM = M();
        if (iM == 0) {
            return;
        }
        float f14 = f(10.0f);
        float fWidth = ((rectF.width() - (f4 * f)) - ((iM - 1) * f14)) / iM;
        int iR = r(this.d);
        u7 u7Var = this.d;
        if (u7Var == null || iR <= 0) {
            i3 = 0;
        } else {
            O(canvas, ((fWidth + f14) * 0) + rectF.left + f4, f13, fWidth, u7Var, xc.j(u7Var.a, "Sắp tới"), SpeedBubble.e(iR), SpeedBubble.d(iR), Math.min(1.0f, iR / Math.max(1, this.d.b)));
            i3 = 1;
        }
        u7 u7VarW = w();
        if (u7VarW != null) {
            float f15 = ((fWidth + f14) * i3) + rectF.left + f4;
            if (this.c != null) {
                O(canvas, f15, f13, fWidth, u7VarW, xc.j(u7VarW.a, "Đang áp dụng"), "Hiệu lực", -13250420, 1.0f);
            } else {
                int iR2 = r(u7VarW);
                O(canvas, f15, f13, fWidth, u7VarW, xc.j(u7VarW.a, "Sắp tới"), SpeedBubble.e(iR2), SpeedBubble.d(iR2), Math.min(1.0f, iR2 / Math.max(1, u7VarW.b)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        if (M() > 0) {
            float f4 = f(16.0f);
            if (this.G) {
                f3 = f(12.0f) + f(70.0f);
            } else {
                f3 = f(84.0f);
            }
            f2 = f(16.0f) + f(74.0f) + f(18.0f) + f3 + f4;
        } else {
            float f5 = f(16.0f);
            if (this.G) {
                f = f(12.0f) + f(70.0f);
            } else {
                f = f(84.0f);
            }
            f2 = f(16.0f) + f + f5;
            if (this.b > 0 && !this.G) {
                f2 += f(6.0f);
            }
        }
        setMeasuredDimension(Math.round((f(2.0f) * 2.0f) + f(300.0f)), Math.round(f2));
    }
}
