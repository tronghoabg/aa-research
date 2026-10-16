package com.carstream.tech.core.speed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.ViewCompat;
import defpackage.d8;
import defpackage.k1;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedGauge extends View {
    public static final int l = Color.parseColor("#3B82F6");
    public static final int m = Color.parseColor("#FF3B30");
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final int j;
    public final int k;

    public SpeedGauge(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        Paint paint4 = new Paint(1);
        this.d = paint4;
        Paint paint5 = new Paint(1);
        this.e = paint5;
        this.f = new RectF();
        Paint paint6 = new Paint(1);
        this.g = paint6;
        Paint paint7 = new Paint(1);
        this.h = paint7;
        Paint paint8 = new Paint(1);
        this.i = paint8;
        this.j = -1;
        this.k = -1;
        float fG = k1.g(context, 6.0f);
        paint3.setColor(k1.h ? -652602608 : -218764584);
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        paint.setColor(k1.h ? 872411622 : 866334486);
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        paint.setStrokeWidth(fG);
        paint2.setColor(l);
        paint2.setStyle(style2);
        paint2.setStrokeWidth(fG);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint6.setColor(m);
        paint6.setStyle(style);
        paint7.setColor(-1);
        paint7.setStyle(style);
        paint8.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint.Align align = Paint.Align.CENTER;
        paint8.setTextAlign(align);
        paint8.setFakeBoldText(true);
        paint4.setColor(d8.o());
        paint4.setTextAlign(align);
        paint4.setFakeBoldText(true);
        paint5.setColor(d8.p());
        paint5.setTextAlign(align);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2;
        float width = getWidth();
        float height = getHeight();
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        float fMin = Math.min(width, height / 1.0f);
        float f = width / 2.0f;
        float f2 = fMin / 2.0f;
        canvas.drawCircle(f, f2, f2 - (strokeWidth / 2.0f), this.c);
        RectF rectF = this.f;
        rectF.set((f - f2) + strokeWidth, strokeWidth, (f + f2) - strokeWidth, fMin - strokeWidth);
        canvas.drawArc(rectF, 130.0f, 280.0f, false, paint);
        int i2 = this.k;
        int i3 = this.j;
        if (i3 > 0) {
            boolean z = i2 > 0;
            float fMin2 = Math.min(i3 / (z ? i2 : 140.0f), 1.0f);
            int i4 = (!z || i3 <= i2) ? l : m;
            Paint paint2 = this.b;
            paint2.setColor(i4);
            i = i3;
            canvas2 = canvas;
            canvas2.drawArc(rectF, 130.0f, fMin2 * 280.0f, false, paint2);
        } else {
            i = i3;
            canvas2 = canvas;
        }
        Paint paint3 = this.d;
        paint3.setTextSize(fMin * 0.36f);
        Paint paint4 = this.e;
        paint4.setTextSize(0.11f * fMin);
        canvas2.drawText(i < 0 ? "--" : String.valueOf(i), f, (paint3.getTextSize() * 0.28f) + f2, paint3);
        float f3 = 0.17f * fMin;
        float f4 = 1.02f * f3;
        float f5 = width - f4;
        float f6 = height - f4;
        float f7 = f5 - f3;
        float f8 = (fMin * 0.3f) + f2;
        float strokeWidth2 = f2 - paint.getStrokeWidth();
        float fSqrt = Math.abs(f8 - f2) >= strokeWidth2 ? 0.0f : (float) Math.sqrt((strokeWidth2 * strokeWidth2) - (r13 * r13));
        canvas2.drawText("km/h", ((f - fSqrt) + (i2 > 0 ? Math.min(f7, f + fSqrt) : f + fSqrt)) / 2.0f, f8, paint4);
        if (i2 <= 0) {
            return;
        }
        canvas2.drawCircle(f5, f6, f3, this.g);
        canvas2.drawCircle(f5, f6, 0.74f * f3, this.h);
        Paint paint5 = this.i;
        paint5.setTextSize(1.0f * f3);
        canvas2.drawText(String.valueOf(i2), f5, (f3 * 0.36f) + f6, paint5);
    }
}
