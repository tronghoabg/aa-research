package androidx.compose.foundation.text;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CoreTextField_androidKt {
    public static final Modifier textFieldCursor(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Brush brush, boolean z) {
        return TextFieldCursorKt.cursor(modifier, legacyTextFieldState, textFieldValue, offsetMapping, brush, z);
    }

    public static final Modifier textFieldDraw(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        return CoreTextFieldKt.defaultTextFieldDraw(modifier, legacyTextFieldState, textFieldValue, offsetMapping);
    }
}
