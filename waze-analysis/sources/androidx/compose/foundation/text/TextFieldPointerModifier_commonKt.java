package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.input.OffsetMapping;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldPointerModifier_commonKt {
    public static final Modifier defaultTextFieldPointer(Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, MutableInteractionSource mutableInteractionSource, final LegacyTextFieldState legacyTextFieldState, final FocusRequester focusRequester, final boolean z2, final OffsetMapping offsetMapping) {
        return PointerIconKt.pointerHoverIcon(SuspendingPointerInputFilterKt.pointerInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(SelectionGesturesKt.updateSelectionTouchMode(modifier, new l() { // from class: androidx.compose.foundation.text.TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldPointerModifier_commonKt.defaultTextFieldPointer$lambda$0(legacyTextFieldState, ((Boolean) obj).booleanValue());
            }
        }), mutableInteractionSource, z, new l() { // from class: androidx.compose.foundation.text.TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldPointerModifier_commonKt.defaultTextFieldPointer$lambda$1(legacyTextFieldState, focusRequester, z2, z, textFieldSelectionManager, offsetMapping, (Offset) obj);
            }
        }), textFieldSelectionManager.getMouseSelectionObserver$foundation(), textFieldSelectionManager.getTouchSelectionObserver$foundation(), new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.TextFieldPointerModifier_commonKt.defaultTextFieldPointer.3
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                Object objAwaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, textFieldSelectionManager2.getMouseSelectionObserver$foundation(), textFieldSelectionManager2.getTouchSelectionObserver$foundation(), eVar);
                return objAwaitSelectionGestures == a.f48038a ? objAwaitSelectionGestures : ab.f48028a;
            }
        }), PointerIcon.Companion.getText(), false & ((2 & 2) == 0));
    }

    static final ab defaultTextFieldPointer$lambda$0(LegacyTextFieldState legacyTextFieldState, boolean z) {
        legacyTextFieldState.setInTouchMode(z);
        return ab.f48028a;
    }

    static final ab defaultTextFieldPointer$lambda$1(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z, boolean z2, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, Offset offset) {
        CoreTextFieldKt.requestFocusAndShowKeyboardIfNeeded(legacyTextFieldState, focusRequester, !z);
        if (legacyTextFieldState.getHasFocus() && z2) {
            if (legacyTextFieldState.getHandleState() != HandleState.Selection) {
                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldDelegate.Companion.m3396setCursorOffsetULxng0E$foundation(offset.m7990unboximpl(), layoutResult, legacyTextFieldState.getProcessor(), offsetMapping, legacyTextFieldState.getOnValueChange());
                    if (legacyTextFieldState.getTextDelegate().getText().length() > 0) {
                        legacyTextFieldState.setHandleState(HandleState.Cursor);
                    }
                }
            } else {
                textFieldSelectionManager.m3922deselect_kEHs6E$foundation(offset);
            }
        }
        return ab.f48028a;
    }
}
