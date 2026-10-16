package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShadowKt {
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f2) {
        return new Shadow(ColorKt.m8279lerpjxsXWHM(shadow.m8602getColor0d7_KjU(), shadow2.m8602getColor0d7_KjU(), f2), OffsetKt.m8003lerpWko1d7g(shadow.m8603getOffsetF1C5BW0(), shadow2.m8603getOffsetF1C5BW0(), f2), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f2), null);
    }
}
