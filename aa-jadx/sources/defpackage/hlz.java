package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hlz extends android.text.style.ImageSpan {
    private java.lang.ref.WeakReference a;
    private final int b;

    public hlz(android.content.Context context, android.graphics.Bitmap bitmap, int i) {
        super(context, bitmap, i);
        this.b = i;
    }

    private final android.graphics.drawable.Drawable a() {
        java.lang.ref.WeakReference weakReference = this.a;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = getDrawable();
        this.a = new java.lang.ref.WeakReference(drawable2);
        return drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        android.graphics.drawable.Drawable drawableA = a();
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
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        android.graphics.Rect bounds = a().getBounds();
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = -bounds.bottom;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
