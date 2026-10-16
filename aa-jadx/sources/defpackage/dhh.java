package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dhh extends android.text.style.MetricAffectingSpan {
    private final float a;

    public dhh(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setTextSkewX(this.a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.setTextSkewX(this.a + textPaint.getTextSkewX());
    }
}
