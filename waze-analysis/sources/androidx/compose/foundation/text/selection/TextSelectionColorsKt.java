package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextSelectionColorsKt {
    private static final ProvidableCompositionLocal<TextSelectionColors> LocalTextSelectionColors = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.foundation.text.selection.TextSelectionColorsKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultTextSelectionColors_androidKt.getDefaultTextSelectionColors();
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return LocalTextSelectionColors;
    }
}
