package y1;

import Va.X7;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import j1.AbstractC3076d;
import java.nio.ByteBuffer;
import z1.C4608a;

/* renamed from: y1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4534o extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final C4528i f47956b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f47955a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f47957c = 1.0f;

    public C4534o(C4528i c4528i) {
        AbstractC3076d.d(c4528i, "metadata cannot be null");
        this.f47956b = c4528i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        C4526g.a().getClass();
        C4528i c4528i = this.f47956b;
        X7 x72 = c4528i.f47935b;
        Typeface typeface = (Typeface) x72.f13844d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) x72.f13842b, c4528i.f47934a * 2, 2, f10, i12, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i5, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f47955a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C4528i c4528i = this.f47956b;
        this.f47957c = fAbs / (c4528i.b().a(14) != 0 ? ((ByteBuffer) r8.f35893d).getShort(r1 + r8.f35890a) : (short) 0);
        C4608a c4608aB = c4528i.b();
        int iA = c4608aB.a(14);
        if (iA != 0) {
            ((ByteBuffer) c4608aB.f35893d).getShort(iA + c4608aB.f35890a);
        }
        short s10 = (short) ((c4528i.b().a(12) != 0 ? ((ByteBuffer) r5.f35893d).getShort(r7 + r5.f35890a) : (short) 0) * this.f47957c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
