package androidx.compose.material3;

import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScrimDefaults {
    public static final int $stable = 0;
    public static final ScrimDefaults INSTANCE = new ScrimDefaults();

    private ScrimDefaults() {
    }

    public final long getColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1410314537, i2, -1, "androidx.compose.material3.ScrimDefaults.<get-color> (Scrim.kt:86)");
        }
        long jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM8227copywmQWz5c$default;
    }
}
