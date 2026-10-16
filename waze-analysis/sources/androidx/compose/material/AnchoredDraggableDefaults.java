package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final int $stable = 0;
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    private AnchoredDraggableDefaults() {
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    public static /* synthetic */ void getAnimationSpec$annotations() {
    }
}
