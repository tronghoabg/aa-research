package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class BaselineShiftSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final float multiplier;

    public BaselineShiftSpan(float f2) {
        this.multiplier = f2;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.multiplier);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.multiplier);
    }
}
