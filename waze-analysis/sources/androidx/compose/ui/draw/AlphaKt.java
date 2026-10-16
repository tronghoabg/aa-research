package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AlphaKt {
    public static final Modifier alpha(Modifier modifier, float f2) {
        return f2 == 1.0f ? modifier : GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(modifier, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0, null, null, 1044475, null);
    }
}
