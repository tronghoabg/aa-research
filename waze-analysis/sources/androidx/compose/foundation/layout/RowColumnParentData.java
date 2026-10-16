package androidx.compose.foundation.layout;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RowColumnParentData {
    public static final int $stable = 8;
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private FlowLayoutData flowLayoutData;
    private float weight;

    public /* synthetic */ RowColumnParentData(float f2, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i2, o oVar) {
        this(1 == (i2 & 1) ? 0.0f : f2, z | (!((i2 & 2) == 0)), (i2 & 4) != 0 ? null : crossAxisAlignment, (i2 & 8) != 0 ? null : flowLayoutData);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f2, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = rowColumnParentData.weight;
        }
        if ((i2 & 2) != 0) {
            z = rowColumnParentData.fill;
        }
        if ((i2 & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        if ((i2 & 8) != 0) {
            flowLayoutData = rowColumnParentData.flowLayoutData;
        }
        return rowColumnParentData.copy(f2, z, crossAxisAlignment, flowLayoutData);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    public final FlowLayoutData component4() {
        return this.flowLayoutData;
    }

    public final RowColumnParentData copy(float f2, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        return new RowColumnParentData(f2, z, crossAxisAlignment, flowLayoutData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && x.n(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && x.n(this.flowLayoutData, rowColumnParentData.flowLayoutData);
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.weight) * 31;
        int iM = RowColumnParentData$$ExternalSyntheticBackport0.m(this.fill);
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int iHashCode = (((iFloatToIntBits + iM) * 31) + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.flowLayoutData;
        return iHashCode + (flowLayoutData != null ? flowLayoutData.hashCode() : 0);
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final void setFlowLayoutData(FlowLayoutData flowLayoutData) {
        this.flowLayoutData = flowLayoutData;
    }

    public final void setWeight(float f2) {
        this.weight = f2;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
    }

    public RowColumnParentData(float f2, boolean z, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        this.weight = f2;
        this.fill = z;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }
}
