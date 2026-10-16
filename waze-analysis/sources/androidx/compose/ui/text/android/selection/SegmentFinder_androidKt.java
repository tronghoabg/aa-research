package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SegmentFinder_androidKt {
    public static final SegmentFinder createGraphemeClusterSegmentFinder(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinderApi29(charSequence, textPaint);
    }
}
