package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ClipKt {
    public static final Modifier clip(Modifier modifier, Shape shape) {
        return GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, true, null, 0L, 0L, 0, 0, null, null, 1042431, null);
    }

    public static final Modifier clipToBounds(Modifier modifier) {
        return GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0, null, null, 1044479, null);
    }
}
