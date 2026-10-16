package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScaleKt {
    public static final Modifier scale(Modifier modifier, float f2, float f3) {
        return (f2 == 1.0f && f3 == 1.0f) ? modifier : GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(modifier, f2, f3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, null, 1048572, null);
    }

    public static final Modifier scale(Modifier modifier, float f2) {
        return scale(modifier, f2, f2);
    }
}
