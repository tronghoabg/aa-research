package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import h.m.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CornerSizeKt$ZeroCornerSize$1 implements CornerSize, InspectableValue {
    CornerSizeKt$ZeroCornerSize$1() {
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ h getInspectableElements() {
        return InspectableValue.CC.$default$getInspectableElements(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return null;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo3077toPxTmRCtEA(long j2, Density density) {
        return 0.0f;
    }

    public String toString() {
        return "ZeroCornerSize";
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        return "ZeroCornerSize";
    }
}
