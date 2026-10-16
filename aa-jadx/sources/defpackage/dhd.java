package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dhd extends android.text.style.MetricAffectingSpan {
    private final float a;

    public dhd(float f) {
        this.a = f;
    }

    private final void a(android.text.TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        textPaint.setLetterSpacing(this.a / textSize);
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
