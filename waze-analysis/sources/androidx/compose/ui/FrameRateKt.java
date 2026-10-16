package androidx.compose.ui;

import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameRateKt {
    private static final Modifier frameRate(Modifier modifier, float f2) {
        return modifier.then(new FrameRateElement(f2));
    }

    public static final Modifier preferredFrameRate(Modifier modifier, float f2) {
        return frameRate(GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, null, 1048575, null), f2);
    }

    /* renamed from: preferredFrameRate-kI47g10, reason: not valid java name */
    public static final Modifier m7659preferredFrameRatekI47g10(Modifier modifier, float f2) {
        return frameRate(GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, null, 1048575, null), f2);
    }
}
