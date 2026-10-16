package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseArray;
import defpackage.u7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedNeon extends SpeedBubble {
    public final RectF M;
    public final Paint N;
    public final SparseArray O;

    public SpeedNeon(Context context) {
        super(context);
        this.M = new RectF();
        Paint paint = new Paint(1);
        this.N = paint;
        this.O = new SparseArray();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void O(Canvas canvas, float f, float f2, u7 u7Var, String str, int i) {
        float f3 = f(78.0f) + f;
        float f4 = f(80.0f) + f2;
        RectF rectF = this.M;
        rectF.set(f, f2, f3, f4);
        int iH = H(canvas, u7Var, rectF);
        Paint paint = this.f;
        paint.setColor(-14868697);
        canvas.drawRoundRect(rectF, f(14.0f), f(14.0f), paint);
        Paint paint2 = this.g;
        paint2.setColor(-13420993);
        paint2.setStrokeWidth(f(1.0f));
        canvas.drawRoundRect(rectF, f(14.0f), f(14.0f), paint2);
        g(canvas, rectF.centerX(), (f(38.0f) / 2.0f) + f(8.0f) + rectF.top, f(38.0f), u7Var);
        Paint.Align align = Paint.Align.CENTER;
        Paint paint3 = this.i;
        paint3.setTextAlign(align);
        paint3.setLetterSpacing(0.0f);
        paint3.setColor(i);
        paint3.setTextSize(I(11.0f));
        canvas.drawText(str, rectF.centerX(), rectF.bottom - f(11.0f), paint3);
        canvas.restoreToCount(iH);
    }

    @Override // com.carstream.tech.core.speed.SpeedBubble
    public final void i(Canvas canvas, int i, int i2) {
        float f;
        BlurMaskFilter blurMaskFilter;
        Paint paint;
        Paint paint2;
        float f2;
        float fN;
        int i3;
        float F = F() + f(2.0f) + f(26.0f);
        float f3 = i2 / 2.0f;
        int i4 = this.n.c;
        float F2 = F() + (i / 2.0f);
        float fMax = Math.max(i, i2) / 2.0f;
        float fN2 = !p() ? 0.0f : (SpeedBubble.N(1600L) * 0.42f) + 0.18f;
        if (fN2 > 0.0f) {
            if (this.w == null || fMax != this.x) {
                this.w = new RadialGradient(0.0f, 0.0f, fMax, new int[]{-308162, 16469054}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.x = fMax;
            }
            int iSave = canvas.save();
            canvas.translate(F2, f3);
            RadialGradient radialGradient = this.w;
            Paint paint3 = this.t;
            paint3.setShader(radialGradient);
            paint3.setAlpha((int) (fN2 * 255.0f));
            canvas.drawCircle(0.0f, 0.0f, fMax, paint3);
            canvas.restoreToCount(iSave);
        }
        boolean zG = G();
        SparseArray sparseArray = this.O;
        Paint paint4 = this.N;
        Paint paint5 = this.i;
        if (zG) {
            float f4 = f(78.0f);
            float f5 = f4 / 2.0f;
            float f6 = F + f5;
            float f7 = f3 - f(8.0f);
            f = 2.0f;
            paint4.setColor(-2082002);
            paint4.setAlpha(115);
            paint4.setStrokeWidth(f(10.0f));
            BlurMaskFilter blurMaskFilter2 = (BlurMaskFilter) sparseArray.get(13);
            if (blurMaskFilter2 == null) {
                blurMaskFilter = new BlurMaskFilter(f(13), BlurMaskFilter.Blur.NORMAL);
                sparseArray.put(13, blurMaskFilter);
            } else {
                blurMaskFilter = blurMaskFilter2;
            }
            paint4.setMaskFilter(blurMaskFilter);
            canvas.drawCircle(f6, f7, f5 - f(5.0f), paint4);
            paint4.setMaskFilter(null);
            paint = paint5;
            paint2 = paint4;
            j(canvas, f6, f7, f4, f(11.0f), q(), 32.0f);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setLetterSpacing(0.16f);
            paint.setColor(-6643286);
            paint.setTextSize(I(9.0f));
            canvas.drawText("GIỚI HẠN", f6, f(9.0f) + f3 + f5, paint);
            f2 = f(18.0f) + f4;
        } else {
            f2 = 0.0f;
            paint2 = paint4;
            f = 2.0f;
            paint = paint5;
        }
        float f8 = F + f2;
        if (!this.G) {
            float f9 = f(120.0f);
            float f10 = f9 / f;
            float f11 = f8 + f10;
            paint2.setColor(i4);
            if (p()) {
                fN = (SpeedBubble.N(1600L) * 0.3f) + 0.45f;
            } else {
                int i5 = this.b;
                fN = (i5 <= 0 || ((float) this.a) < ((float) i5) * 0.95f) ? 0.4f : 0.55f;
            }
            paint2.setAlpha((int) (fN * 255.0f));
            paint2.setStrokeWidth(f(3.0f));
            if (p()) {
                i3 = 34;
            } else {
                int i6 = this.b;
                i3 = (i6 <= 0 || ((float) this.a) < ((float) i6) * 0.95f) ? 20 : 26;
            }
            BlurMaskFilter blurMaskFilter3 = (BlurMaskFilter) sparseArray.get(i3);
            if (blurMaskFilter3 == null) {
                blurMaskFilter3 = new BlurMaskFilter(f(i3), BlurMaskFilter.Blur.NORMAL);
                sparseArray.put(i3, blurMaskFilter3);
            }
            paint2.setMaskFilter(blurMaskFilter3);
            canvas.drawCircle(f11, f3, f10, paint2);
            paint2.setMaskFilter(null);
            paint2.setAlpha(255);
            int iS = s(-14802904);
            Paint paint6 = this.f;
            paint6.setColor(iS);
            canvas.drawCircle(f11, f3, f10, paint6);
            Paint paint7 = this.g;
            paint7.setColor(i4);
            paint7.setStrokeWidth(f(f));
            paint7.setAlpha((int) (l() * 255.0f));
            canvas.drawCircle(f11, f3, f10 - f(1.0f), paint7);
            paint7.setAlpha(255);
            Paint.Align align = Paint.Align.CENTER;
            Paint paint8 = this.h;
            paint8.setTextAlign(align);
            paint8.setColor(this.a < 0 ? -6643286 : -328708);
            paint8.setTextSize(I(36.0f));
            canvas.drawText(J(), f11, I(14.0f) + f3, paint8);
            paint.setTextAlign(align);
            paint.setLetterSpacing(0.1f);
            if (this.b <= 0) {
                i4 = -6643286;
            }
            paint.setColor(i4);
            paint.setTextSize(I(10.0f));
            canvas.drawText("KM/H", f11, I(34.0f) + f3, paint);
            f8 += f(18.0f) + f9;
        }
        float f12 = f8;
        int iM = M();
        if (iM == 0) {
            return;
        }
        float f13 = f(80.0f);
        int i7 = 1;
        float f14 = f3 - (((f(10.0f) * (iM - 1)) + (iM * f13)) / 2.0f);
        int iR = r(this.d);
        u7 u7Var = this.d;
        if (u7Var == null || iR <= 0) {
            i7 = 0;
        } else {
            O(canvas, f12, f14, u7Var, SpeedBubble.e(iR), SpeedBubble.d(iR));
        }
        if (w() != null) {
            O(canvas, f12, f14 + ((f(10.0f) + f13) * i7), w(), y(), x());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f = 0.0f;
        if (G()) {
            f = 0.0f + f(78.0f);
            z = true;
        } else {
            z = false;
        }
        if (!this.G) {
            if (z) {
                f += f(18.0f);
            }
            f += f(120.0f);
            z = true;
        }
        if (M() > 0) {
            if (z) {
                f += f(18.0f);
            }
            f += f(78.0f);
        }
        float f2 = f(78.0f) / 2.0f;
        if (!this.G) {
            f2 = Math.max(f2, f(120.0f) / 2.0f);
        }
        int iM = M();
        if (iM > 0) {
            f2 = Math.max(f2, ((f(10.0f) * (iM - 1)) + (f(80.0f) * iM)) / 2.0f);
        }
        setMeasuredDimension(Math.round((f(2.0f) * 2.0f) + (f(26.0f) * 2.0f) + f), Math.round((f(26.0f) * 2.0f) + (f2 * 2.0f)));
    }
}
