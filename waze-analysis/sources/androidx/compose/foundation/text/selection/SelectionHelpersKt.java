package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionHelpersKt {
    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i2) {
        return isOffsetAnEmptyLine(textLayoutResult, i2) ? textLayoutResult.getParagraphDirection(i2) : textLayoutResult.getBidiRunDirection(i2);
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult textLayoutResult, int i2) {
        if (textLayoutResult.getLayoutInput().getText().length() == 0) {
            return true;
        }
        int lineForOffset = textLayoutResult.getLineForOffset(i2);
        if (i2 == 0 || lineForOffset != textLayoutResult.getLineForOffset(i2 - 1)) {
            return i2 == textLayoutResult.getLayoutInput().getText().length() || lineForOffset != textLayoutResult.getLineForOffset(i2 + 1);
        }
        return false;
    }
}
