package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import h.m.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PxCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public PxCornerSize(float f2) {
        this.size = f2;
    }

    private final float component1() {
        return this.size;
    }

    public static /* synthetic */ PxCornerSize copy$default(PxCornerSize pxCornerSize, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = pxCornerSize.size;
        }
        return pxCornerSize.copy(f2);
    }

    public final PxCornerSize copy(float f2) {
        return new PxCornerSize(f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PxCornerSize) && Float.compare(this.size, ((PxCornerSize) obj).size) == 0;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ h getInspectableElements() {
        return InspectableValue.CC.$default$getInspectableElements(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return null;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        return this.size + "px";
    }

    public int hashCode() {
        return Float.floatToIntBits(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo3077toPxTmRCtEA(long j2, Density density) {
        return this.size;
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".px)";
    }
}
