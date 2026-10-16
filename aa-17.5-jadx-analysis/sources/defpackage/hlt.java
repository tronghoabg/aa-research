package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class hlt extends ImageSpan {
    private WeakReference a;
    private final int b;

    public hlt(Context context, Bitmap bitmap, int i) {
        super(context, bitmap, i);
        this.b = i;
    }

    private final Drawable a() {
        WeakReference weakReference = this.a;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.a = new WeakReference(drawable2);
        return drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawableA = a();
        canvas.save();
        int iHeight = i5 - drawableA.getBounds().bottom;
        int i6 = this.b;
        if (i6 == 1) {
            iHeight -= paint.getFontMetricsInt().descent;
        } else if (i6 == 2) {
            iHeight = (i3 + ((i5 - i3) / 2)) - (drawableA.getBounds().height() / 2);
        }
        canvas.translate(f, iHeight);
        drawableA.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = a().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = -bounds.bottom;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
