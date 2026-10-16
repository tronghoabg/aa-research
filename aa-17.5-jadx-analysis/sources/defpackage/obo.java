package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class obo extends ImageSpan {
    private WeakReference a;
    private final int b;

    public obo(Context context, int i) {
        super(context, i);
        this.b = 2;
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
        int i6 = i5 - i3;
        drawableA.setBounds(0, 0, (drawableA.getIntrinsicWidth() / drawableA.getIntrinsicHeight()) * i6, i6);
        canvas.save();
        int i7 = i5 - drawableA.getBounds().bottom;
        int i8 = this.b;
        if (i8 == 1) {
            i3 = i7 - paint.getFontMetricsInt().descent;
        } else if (i8 != 2) {
            i3 = i7;
        }
        canvas.translate(f, i3);
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

    public obo(Context context, Uri uri) {
        super(context, uri);
        this.b = 2;
    }
}
