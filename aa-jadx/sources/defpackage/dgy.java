package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dgy extends android.text.style.MetricAffectingSpan {
    private final float a;

    public dgy(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.a);
    }
}
