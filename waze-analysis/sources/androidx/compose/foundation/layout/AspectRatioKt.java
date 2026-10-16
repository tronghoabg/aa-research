package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AspectRatioKt {
    public static final Modifier aspectRatio(Modifier modifier, float f2, boolean z) {
        return modifier.then(new AspectRatioElement(f2, z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(f2, z) : InspectableValueKt.getNoInspectorInfo()));
    }

    /* renamed from: isSatisfiedBy-NN6Ew-U, reason: not valid java name */
    public static final boolean m2460isSatisfiedByNN6EwU(long j2, int i2, int i3) {
        if (i2 > Constraints.m11107getMaxWidthimpl(j2) || Constraints.m11109getMinWidthimpl(j2) > i2) {
            return false;
        }
        return i3 <= Constraints.m11106getMaxHeightimpl(j2) && Constraints.m11108getMinHeightimpl(j2) <= i3;
    }
}
