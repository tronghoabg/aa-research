package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.u7;
import defpackage.xa;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedRuler extends SpeedBubble {
    public final xa M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final Path Q;
    public final Paint R;
    public float S;

    public SpeedRuler(Context context) {
        super(context);
        this.M = new xa(320L, SpeedBubble.K);
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new Path();
        this.R = new Paint(1);
        this.S = Float.NaN;
    }

    public final float O(Canvas canvas, float f, float f2, u7 u7Var, String str, int i) {
        Paint paint = this.i;
        paint.setColor(i);
        paint.setTextSize(I(11.0f));
        float fMeasureText = paint.measureText(str);
        float f3 = f(36.0f);
        float f4 = f - fMeasureText;
        float f5 = (f4 - f(7.0f)) - f3;
        float f6 = f3 / 2.0f;
        float f7 = ((f2 - f(11.0f)) - f6) - f(2.0f);
        float f8 = f(4.0f) + (f2 - f(11.0f)) + f6;
        RectF rectF = this.P;
        rectF.set(f5, f7, f, f8);
        int iH = H(canvas, u7Var, rectF);
        canvas.drawText(str, f4, f2 - f(6.0f), paint);
        g(canvas, f6 + f5, f2 - f(11.0f), f3, u7Var);
        canvas.restoreToCount(iH);
        return f5 - f(12.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    @Override // com.carstream.tech.core.speed.SpeedBubble
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.graphics.Canvas r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.core.speed.SpeedRuler.i(android.graphics.Canvas, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = f(66.0f) + f(16.0f);
        if (!this.G) {
            f += f(62.0f);
        }
        if (G()) {
            f += f(58.0f) + f(12.0f);
        }
        float f2 = f(16.0f) + f;
        setMeasuredDimension(Math.round((f(2.0f) * 2.0f) + f(380.0f)), Math.round(f2));
    }
}
