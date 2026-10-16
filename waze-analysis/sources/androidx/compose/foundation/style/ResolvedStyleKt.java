package androidx.compose.foundation.style;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ResolvedStyleKt {
    private static final SpringSpec<Float> DefaultSpringSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    public static final SpringSpec<Float> getDefaultSpringSpec() {
        return DefaultSpringSpec;
    }
}
