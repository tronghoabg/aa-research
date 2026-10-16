package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

@Deprecated
/* loaded from: classes3.dex */
public final class uqe extends ReplacementSpan {
    private final int a;
    private final float b;
    private final Paint c;

    public uqe(int i, float f, Paint paint) {
        this.a = i;
        this.b = f;
        this.c = paint;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = this.c;
        int i6 = this.a;
        int color = paint2.getColor();
        paint2.setColor(i6);
        paint2.setStrokeWidth(this.b);
        paint2.setStyle(Paint.Style.STROKE);
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint2);
        paint2.setColor(color);
        paint2.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawText(charSequence, i, i2, f, f2, paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint paint2 = this.c;
        Paint.FontMetricsInt fontMetricsInt2 = paint2.getFontMetricsInt();
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
