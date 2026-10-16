package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Density;
import com.waze.strings.DisplayStrings;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldCoreModifierKt {
    private static final float DefaultCursorThickness = 2.0f;

    public static final void drawDefaultCursor(TextFieldCoreModifierNode textFieldCoreModifierNode, DrawScope drawScope, Brush brush, boolean z, CursorAnimationState cursorAnimationState, TextFieldSelectionState textFieldSelectionState) {
        float cursorAlpha = cursorAnimationState != null ? cursorAnimationState.getCursorAlpha() : 0.0f;
        if (cursorAlpha != 0.0f && z) {
            Rect cursorRect = textFieldSelectionState.getCursorRect();
            DrawScope.CC.m8827drawLine1RTmtNc$default(drawScope, brush, cursorRect.m8014getTopCenterF1C5BW0(), cursorRect.m8007getBottomCenterF1C5BW0(), cursorRect.getRight() - cursorRect.getLeft(), 0, null, cursorAlpha, null, 0, DisplayStrings.DS_DIRT_ROADS, null);
        }
    }

    /* renamed from: drawDefaultSelectionHighlight-YmzfRxQ, reason: not valid java name */
    public static final void m3661drawDefaultSelectionHighlightYmzfRxQ(TextFieldCoreModifierNode textFieldCoreModifierNode, DrawScope drawScope, long j2, TextLayoutResult textLayoutResult) {
        int iM10544getMinimpl = TextRange.m10544getMinimpl(j2);
        int iM10543getMaximpl = TextRange.m10543getMaximpl(j2);
        if (iM10544getMinimpl != iM10543getMaximpl) {
            DrawScope.CC.m8832drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(iM10544getMinimpl, iM10543getMaximpl), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, TextSelectionColorsKt.getLocalTextSelectionColors())).m3938getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, Rect rect, boolean z, int i2) {
        float f2 = i2;
        return Rect.copy$default(rect, z ? f2 - rect.getRight() : rect.getLeft(), 0.0f, n.f((z ? f2 - rect.getRight() : rect.getLeft()) + density.mo2121roundToPx0680j_4(DefaultCursorThickness), f2), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).m8614getValue0d7_KjU() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return f2;
        }
        double d2 = f2;
        return (float) (f2 > 0.0f ? Math.ceil(d2) : Math.floor(d2));
    }
}
