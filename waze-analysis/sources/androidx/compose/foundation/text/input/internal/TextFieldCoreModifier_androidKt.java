package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldCoreModifier_androidKt {
    public static final void drawCursor(TextFieldCoreModifierNode textFieldCoreModifierNode, DrawScope drawScope, Brush brush, boolean z, CursorAnimationState cursorAnimationState, TextFieldSelectionState textFieldSelectionState) {
        TextFieldCoreModifierKt.drawDefaultCursor(textFieldCoreModifierNode, drawScope, brush, z, cursorAnimationState, textFieldSelectionState);
    }

    /* renamed from: drawSelectionHighlight-YmzfRxQ, reason: not valid java name */
    public static final void m3666drawSelectionHighlightYmzfRxQ(TextFieldCoreModifierNode textFieldCoreModifierNode, DrawScope drawScope, long j2, TextLayoutResult textLayoutResult) {
        TextFieldCoreModifierKt.m3661drawDefaultSelectionHighlightYmzfRxQ(textFieldCoreModifierNode, drawScope, j2, textLayoutResult);
    }
}
