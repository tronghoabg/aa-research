package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.l.f;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldKeyInputKt {
    /* renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m3408textFieldKeyInput2WJ9YEU(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager, final TextFieldValue textFieldValue, final l<? super TextFieldValue, ab> lVar, final boolean z, final boolean z2, final OffsetMapping offsetMapping, final UndoManager undoManager, final int i2) {
        return ComposedModifierKt.composed$default(modifier, null, new q() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldKeyInputKt.textFieldKeyInput_2WJ9YEU$lambda$1(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z, z2, offsetMapping, undoManager, lVar, i2, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* renamed from: textFieldKeyInput-2WJ9YEU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3409textFieldKeyInput2WJ9YEU$default(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, l lVar, boolean z, boolean z2, OffsetMapping offsetMapping, UndoManager undoManager, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            lVar = new l() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        return m3408textFieldKeyInput2WJ9YEU(modifier, legacyTextFieldState, textFieldSelectionManager, textFieldValue, lVar, z, z2, offsetMapping, undoManager, i2);
    }

    static final Modifier textFieldKeyInput_2WJ9YEU$lambda$1(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, OffsetMapping offsetMapping, UndoManager undoManager, l lVar, int i2, Modifier modifier, Composer composer, int i3) {
        composer.startReplaceGroup(851809892);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(851809892, i3, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new TextPreparedSelectionState();
            composer.updateRememberedValue(objRememberedValue);
        }
        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new DeadKeyCombiner();
            composer.updateRememberedValue(objRememberedValue2);
        }
        TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) objRememberedValue2, null, lVar, i2, 512, null);
        Modifier.Companion companion = Modifier.Companion;
        boolean zChangedInstance = composer.changedInstance(textFieldKeyInput);
        TextFieldKeyInputKt$textFieldKeyInput$2$1$1 textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue == Composer.Companion.getEmpty()) {
            textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(textFieldKeyInput);
            composer.updateRememberedValue(textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue);
        }
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (l) ((f) textFieldKeyInputKt$textFieldKeyInput$2$1$1RememberedValue));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierOnKeyEvent;
    }
}
