package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    public static final float estimatedLazyMaxScrollOffset(int i2, int i3, boolean z) {
        float fEstimatedLazyScrollOffset = estimatedLazyScrollOffset(i2, i3);
        return z ? fEstimatedLazyScrollOffset + 100.0f : fEstimatedLazyScrollOffset;
    }

    public static final float estimatedLazyScrollOffset(int i2, int i3) {
        return i3 + (i2 * 500);
    }

    public static final Modifier lazyLayoutSemantics(Modifier modifier, a<? extends LazyLayoutItemProvider> aVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i2, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        Modifier modifierThen = modifier.then(new LazyLayoutSemanticsModifier(aVar, lazyLayoutSemanticState, orientation, z, z2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }
}
