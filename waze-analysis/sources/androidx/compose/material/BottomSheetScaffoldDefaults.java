package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldDefaults {
    public static final BottomSheetScaffoldDefaults INSTANCE = new BottomSheetScaffoldDefaults();
    private static final float SheetElevation = 8.0f;
    private static final float SheetPeekHeight = 56.0f;
    private static final AnimationSpec<Float> AnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    public static final int $stable = 8;

    private BottomSheetScaffoldDefaults() {
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getSheetElevation-D9Ej5fM, reason: not valid java name */
    public final float m3981getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m3982getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }
}
