package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.IntOffset;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimationKt {
    private static final SpringSpec<IntOffset> InterruptionSpec;

    static {
        int i2 = VisibilityThresholdsKt.f1650a;
        InterruptionSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
    }
}
