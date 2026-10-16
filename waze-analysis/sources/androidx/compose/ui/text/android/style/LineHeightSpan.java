package androidx.compose.ui.text.android.style;

import android.graphics.Paint;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 0;
    private final float lineHeight;

    public LineHeightSpan(float f2) {
        this.lineHeight = f2;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        fontMetricsInt.descent = (int) Math.ceil(fontMetricsInt.descent * (r0 / r1));
        fontMetricsInt.ascent = fontMetricsInt.descent - ((int) Math.ceil(this.lineHeight));
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}
