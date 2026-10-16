package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CursorAnchorInfoApi34Helper {
    public static final CursorAnchorInfoApi34Helper INSTANCE = new CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    public static final CursorAnchorInfo.Builder addVisibleLineBounds(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect rect) {
        if (!rect.isEmpty()) {
            int lineCount = textLayoutResult.getLineCount() - 1;
            int lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(rect.getTop());
            int iH = n.h(lineCount, 0);
            int iJ = n.j(lineForVerticalPosition, 0, iH);
            int iJ2 = n.j(textLayoutResult.getLineForVerticalPosition(rect.getBottom()), 0, iH);
            if (iJ <= iJ2) {
                while (true) {
                    builder.addVisibleLineBounds(textLayoutResult.getLineLeft(iJ), textLayoutResult.getLineTop(iJ), textLayoutResult.getLineRight(iJ), textLayoutResult.getLineBottom(iJ));
                    if (iJ == iJ2) {
                        break;
                    }
                    iJ++;
                }
            }
        }
        return builder;
    }
}
