package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dhj extends android.text.style.MetricAffectingSpan {
    private final android.graphics.Typeface a;

    public dhj(android.graphics.Typeface typeface) {
        this.a = typeface;
    }

    private final void a(android.graphics.Paint paint) {
        paint.setTypeface(this.a);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        a(textPaint);
    }
}
