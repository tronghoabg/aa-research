package androidx.compose.foundation.text;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldScroll_androidKt {
    public static final OverscrollEffect rememberTextFieldOverscrollEffect(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-73012098, i2, -1, "androidx.compose.foundation.text.rememberTextFieldOverscrollEffect (TextFieldScroll.android.kt:39)");
        }
        if (!ComposerKt.isTraceInProgress()) {
            return null;
        }
        ComposerKt.traceEventEnd();
        return null;
    }

    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, OverscrollEffect overscrollEffect, a<TextLayoutResultProxy> aVar) {
        return TextFieldScrollKt.defaultTextFieldScroll(modifier, textFieldScrollerPosition, textFieldValue, visualTransformation, overscrollEffect, aVar);
    }
}
