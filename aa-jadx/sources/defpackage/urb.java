package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class urb extends android.text.style.ReplacementSpan {
    private final int a;
    private final float b;
    private final android.graphics.Paint c;

    public urb(int i, float f, android.graphics.Paint paint) {
        this.a = i;
        this.b = f;
        this.c = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        android.graphics.Paint paint2 = this.c;
        int i6 = this.a;
        int color = paint2.getColor();
        paint2.setColor(i6);
        paint2.setStrokeWidth(this.b);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint2);
        paint2.setColor(color);
        paint2.setStrokeWidth(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawText(charSequence, i, i2, f, f2, paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        android.graphics.Paint paint2 = this.c;
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint2.getFontMetricsInt();
        if (fontMetricsInt2 != null && fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
            fontMetricsInt.top = fontMetricsInt2.top;
        }
        return (int) paint2.measureText(charSequence, i, i2);
    }
}
