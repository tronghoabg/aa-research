package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgk {
    public final java.lang.CharSequence a;
    public final android.text.TextPaint b;
    private final int d;
    private android.text.BoringLayout.Metrics f;
    private boolean g;
    private java.lang.CharSequence h;
    private float e = Float.NaN;
    public float c = Float.NaN;

    public dgk(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.d = i;
    }

    private final java.lang.CharSequence d() {
        java.lang.CharSequence charSequence = this.h;
        if (charSequence == null) {
            charSequence = this.a;
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                if (defpackage.day.l(spanned, android.text.style.CharacterStyle.class)) {
                    android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) spanned.getSpans(0, charSequence.length(), android.text.style.CharacterStyle.class);
                    if (characterStyleArr != null && (characterStyleArr.length) != 0) {
                        android.text.SpannableString spannableString = null;
                        for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof android.text.style.MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new android.text.SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.h = charSequence;
        }
        return charSequence;
    }

    public final float a(int i, int i2) {
        return android.text.Layout.getDesiredWidth(d(), i, i2, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    public final float b() {
        if (!java.lang.Float.isNaN(this.e)) {
            return this.e;
        }
        android.text.BoringLayout.Metrics metricsC = c();
        float fCeil = metricsC != null ? metricsC.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) java.lang.Math.ceil(a(0, d().length()));
        }
        java.lang.CharSequence charSequence = this.a;
        android.text.TextPaint textPaint = this.b;
        if (fCeil != 0.0f) {
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                if (defpackage.day.l(spanned, defpackage.dhd.class) || defpackage.day.l(spanned, defpackage.dhc.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.e = fCeil;
        return fCeil;
    }

    public final android.text.BoringLayout.Metrics c() {
        if (!this.g) {
            int i = this.d;
            java.lang.CharSequence charSequence = this.a;
            android.text.TextPaint textPaint = this.b;
            android.text.TextDirectionHeuristic textDirectionHeuristicA = defpackage.dgq.a(i);
            android.text.BoringLayout.Metrics metricsIsBoring = null;
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                metricsIsBoring = ag$.ExternalSyntheticApiModelOutline0.m(charSequence, textPaint, textDirectionHeuristicA, true, (android.text.BoringLayout.Metrics) null);
            } else if (!textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length())) {
                metricsIsBoring = android.text.BoringLayout.isBoring(charSequence, textPaint, null);
            }
            this.f = metricsIsBoring;
            this.g = true;
        }
        return this.f;
    }
}
