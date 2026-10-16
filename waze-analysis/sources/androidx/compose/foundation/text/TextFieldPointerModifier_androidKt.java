package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.OffsetMapping;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldPointerModifier_androidKt {
    public static final Modifier textFieldPointer(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, boolean z, MutableInteractionSource mutableInteractionSource, LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z2, OffsetMapping offsetMapping, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2147130620, i2, -1, "androidx.compose.foundation.text.textFieldPointer (TextFieldPointerModifier.android.kt:35)");
        }
        Modifier modifierDefaultTextFieldPointer = TextFieldPointerModifier_commonKt.defaultTextFieldPointer(modifier, textFieldSelectionManager, z, mutableInteractionSource, legacyTextFieldState, focusRequester, z2, offsetMapping);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierDefaultTextFieldPointer;
    }
}
