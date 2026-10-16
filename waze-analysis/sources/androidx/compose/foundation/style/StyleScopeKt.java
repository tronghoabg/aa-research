package androidx.compose.foundation.style;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleScopeKt {
    public static final void apply(StyleScope styleScope, Style style) {
        style.applyStyle(styleScope);
    }

    public static final void contentPadding(StyleScope styleScope, PaddingValues paddingValues) {
        styleScope.mo3099contentPaddinga9UjIt4(PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) styleScope.getCurrentValue(CompositionLocalsKt.getLocalLayoutDirection())), paddingValues.mo2707calculateTopPaddingD9Ej5fM(), PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) styleScope.getCurrentValue(CompositionLocalsKt.getLocalLayoutDirection())), paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
    }

    public static final void externalPadding(StyleScope styleScope, PaddingValues paddingValues) {
        styleScope.mo3108externalPaddinga9UjIt4(PaddingKt.calculateStartPadding(paddingValues, (LayoutDirection) styleScope.getCurrentValue(CompositionLocalsKt.getLocalLayoutDirection())), paddingValues.mo2707calculateTopPaddingD9Ej5fM(), PaddingKt.calculateEndPadding(paddingValues, (LayoutDirection) styleScope.getCurrentValue(CompositionLocalsKt.getLocalLayoutDirection())), paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
    }

    public static final void fillHeight(StyleScope styleScope) {
        styleScope.height(1.0f);
    }

    public static final void fillSize(StyleScope styleScope) {
        styleScope.width(1.0f);
        styleScope.height(1.0f);
    }

    public static final void fillWidth(StyleScope styleScope) {
        styleScope.width(1.0f);
    }
}
