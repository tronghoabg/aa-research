package com.waze.navbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f30869a;

    private final Drawable a() {
        WeakReference weakReference = this.f30869a;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f30869a = new WeakReference(drawable2);
        return drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Drawable drawableA = a();
        canvas.save();
        canvas.translate(f2, i4 + (((i6 - i4) - drawableA.getBounds().height()) / 2));
        drawableA.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = a().getBounds();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            int iHeight = bounds.height() - (fontMetricsInt2.descent - fontMetricsInt2.ascent);
            if (iHeight <= 0) {
                return super.getSize(paint, charSequence, i2, i3, fontMetricsInt);
            }
            fontMetricsInt.descent = fontMetricsInt2.descent + (iHeight >> 1);
            fontMetricsInt.ascent = -(bounds.height() - fontMetricsInt.descent);
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.top = fontMetricsInt.ascent;
        }
        return bounds.width();
    }
}
