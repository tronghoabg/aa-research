package androidx.compose.ui.text.android;

import android.text.Layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutCompat_androidKt {
    public static final int getLineForOffset(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i2 || layout.getLineEnd(lineForOffset) == i2) ? lineStart == i2 ? z ? lineForOffset - 1 : lineForOffset : !z ? lineForOffset + 1 : lineForOffset : lineForOffset;
    }
}
