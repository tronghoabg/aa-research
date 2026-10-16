package com.waze.bl.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.waze.R;
import h.g.b.x;
import h.k;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends View {

    /* renamed from: a, reason: collision with root package name */
    private static final WeakHashMap f17046a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f17047b;

    /* renamed from: c, reason: collision with root package name */
    private float f17048c;

    /* renamed from: d, reason: collision with root package name */
    private b f17049d;

    /* renamed from: e, reason: collision with root package name */
    private final float f17050e;

    /* renamed from: f, reason: collision with root package name */
    private final float f17051f;

    /* renamed from: g, reason: collision with root package name */
    private final float f17052g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f17053h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f17054i;

    /* renamed from: j, reason: collision with root package name */
    private final Matrix f17055j;

    /* renamed from: k, reason: collision with root package name */
    private final Paint f17056k;

    /* renamed from: l, reason: collision with root package name */
    private final Paint f17057l;
    private final Paint m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i2, float f2, b bVar) {
        super(context, null, 0);
        x.f(context, "context");
        x.f(bVar, "pillPosition");
        x.f(context, "context");
        this.f17049d = b.f17043a;
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f17050e = f3;
        this.f17051f = f3 * 4.0f;
        this.f17052g = 12.0f * f3;
        this.f17053h = new RectF();
        this.f17054i = new RectF();
        this.f17055j = new Matrix();
        this.f17056k = new Paint(1);
        Paint paint = new Paint(1);
        paint.setShadowLayer(8.0f * f3, 0.0f, 4.0f * f3, ContextCompat.getColor(context, R.color.shadowGrey));
        this.f17057l = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ContextCompat.getColor(context, R.color.content_default));
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f3 * 14.0f);
        this.m = paint2;
        setLayerType(1, null);
        this.f17047b = i2;
        invalidate();
        if (this.f17048c != f2) {
            this.f17048c = f2;
            requestLayout();
            invalidate();
        }
        x.f(bVar, "value");
        if (this.f17049d != bVar) {
            this.f17049d = bVar;
            requestLayout();
            invalidate();
        }
    }

    private final k b(float f2, float f3, float f4, float f5) {
        double dSqrt;
        b bVar = this.f17049d;
        b bVar2 = b.f17044b;
        if (this.f17049d != bVar2) {
            f2 += 180.0f;
        }
        double d2 = f4;
        double d3 = f5;
        float fAbs = Math.abs((f2 + 180.0f) % 360.0f);
        if (fAbs > 180.0f) {
            fAbs = 360.0f - fAbs;
        }
        if (fAbs > 90.0f) {
            fAbs = 180.0f - fAbs;
        }
        double d4 = d3 / 2.0d;
        double radians = Math.toRadians(fAbs);
        double d5 = (d2 / 2.0d) - d4;
        if (radians < Math.atan2(d5, d4)) {
            dSqrt = d4 / Math.cos(radians);
        } else {
            dSqrt = Math.sqrt(Math.pow(d4, 2.0d) - Math.pow(d5 * Math.cos(radians), 2.0d)) + (Math.sin(radians) * d5);
        }
        if (bVar != bVar2) {
            f3 = 0.0f;
        }
        float f6 = this.f17051f;
        double radians2 = Math.toRadians(f2);
        double d6 = f3 + f6 + dSqrt;
        return new k(Float.valueOf((float) (Math.sin(radians2) * d6)), Float.valueOf((float) ((-d6) * Math.cos(radians2))));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        x.f(canvas, "canvas");
        Context context = getContext();
        x.e(context, "getContext(...)");
        a aVarC = d.c(context);
        if (aVarC == null || !aVarC.d()) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        int iSave = canvas.save();
        try {
            canvas.translate(width / 2.0f, height / 2.0f);
            Bitmap bitmapC = aVarC.c();
            Bitmap bitmapB = aVarC.b();
            float f2 = this.f17048c;
            iSave = canvas.save();
            canvas.rotate(f2);
            canvas.drawBitmap(bitmapB, (-bitmapB.getWidth()) / 2.0f, -bitmapB.getHeight(), this.f17056k);
            canvas.restoreToCount(iSave);
            k kVarB = b(f2, bitmapB.getHeight(), bitmapC.getWidth(), bitmapC.getHeight());
            float fFloatValue = ((Number) kVarB.a()).floatValue();
            float fFloatValue2 = ((Number) kVarB.b()).floatValue();
            iSave = canvas.save();
            canvas.translate(fFloatValue, fFloatValue2);
            float width2 = bitmapC.getWidth() / 2.0f;
            float height2 = bitmapC.getHeight() / 2.0f;
            RectF rectF = this.f17054i;
            float f3 = -width2;
            float f4 = -height2;
            rectF.set(f3, f4, width2, height2);
            canvas.drawRoundRect(rectF, height2, height2, this.f17057l);
            canvas.drawBitmap(bitmapC, f3, f4, this.f17056k);
            float width3 = bitmapC.getWidth() / 4.5f;
            Paint paint = this.m;
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(String.valueOf(this.f17047b), width3, ((-(fontMetrics.descent + fontMetrics.ascent)) / 2.0f) + 0.0f, paint);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        Context context = getContext();
        x.e(context, "getContext(...)");
        a aVarC = d.c(context);
        if (aVarC == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        RectF rectF = this.f17053h;
        float width = aVarC.b().getWidth();
        float height = aVarC.b().getHeight();
        float width2 = aVarC.c().getWidth();
        float height2 = aVarC.c().getHeight();
        float f2 = this.f17048c;
        RectF rectF2 = new RectF((-width) / 2.0f, -height, width / 2.0f, 0.0f);
        Matrix matrix = this.f17055j;
        matrix.reset();
        matrix.setRotate(f2);
        matrix.mapRect(rectF2);
        rectF.set(rectF2);
        k kVarB = b(f2, height, width2, height2);
        float fFloatValue = ((Number) kVarB.a()).floatValue();
        float fFloatValue2 = ((Number) kVarB.b()).floatValue();
        float f3 = width2 / 2.0f;
        float f4 = this.f17052g;
        float f5 = height2 / 2.0f;
        rectF.union(new RectF((fFloatValue - f3) - f4, (fFloatValue2 - f5) - f4, fFloatValue + f3 + f4, fFloatValue2 + f5 + f4));
        float fMax = Math.max(Math.abs(rectF.left), Math.abs(rectF.right));
        float fMax2 = Math.max(Math.abs(rectF.top), Math.abs(rectF.bottom));
        setMeasuredDimension((int) Math.ceil(fMax + fMax), (int) Math.ceil(fMax2 + fMax2));
    }
}
