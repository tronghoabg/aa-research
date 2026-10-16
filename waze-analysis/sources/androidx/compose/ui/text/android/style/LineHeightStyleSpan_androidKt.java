package androidx.compose.ui.text.android.style;

import android.graphics.Paint;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LineHeightStyleSpan_androidKt {
    public static final int lineHeight(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
