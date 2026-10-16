package C0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f1754a;

    public c(float f10) {
        this.f1754a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC3340k.e(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f1754a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        AbstractC3340k.e(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f1754a);
    }
}
