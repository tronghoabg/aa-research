package androidx.compose.animation;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import h.f;
import h.g;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionLocalsKt {
    private static final f LocalLookaheadAnimationVisualDebugConfig$delegate = g.a(CompositionLocalsKt$LocalLookaheadAnimationVisualDebugConfig$2.INSTANCE);
    private static final f LocalLookaheadAnimationVisualDebugColor$delegate = g.a(CompositionLocalsKt$LocalLookaheadAnimationVisualDebugColor$2.INSTANCE);

    public static final ProvidableCompositionLocal<Color> getLocalLookaheadAnimationVisualDebugColor() {
        return (ProvidableCompositionLocal) LocalLookaheadAnimationVisualDebugColor$delegate.getValue();
    }

    public static final ProvidableCompositionLocal<LookaheadAnimationVisualDebugConfig> getLocalLookaheadAnimationVisualDebugConfig() {
        return (ProvidableCompositionLocal) LocalLookaheadAnimationVisualDebugConfig$delegate.getValue();
    }

    public static /* synthetic */ void getLocalLookaheadAnimationVisualDebugColor$annotations() {
    }

    public static /* synthetic */ void getLocalLookaheadAnimationVisualDebugConfig$annotations() {
    }
}
