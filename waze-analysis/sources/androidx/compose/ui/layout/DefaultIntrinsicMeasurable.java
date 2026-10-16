package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {
    public static final int $stable = 8;
    private final IntrinsicMeasurable measurable;
    private final IntrinsicMinMax minMax;
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return this.measurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return this.measurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0, reason: not valid java name */
    public Placeable mo9741measureBRTryo0(long j2) {
        IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
        IntrinsicMinMax intrinsicMinMax = this.minMax;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            IntrinsicMinMax intrinsicMinMax2 = IntrinsicMinMax.Max;
            IntrinsicMeasurable intrinsicMeasurable = this.measurable;
            return new FixedSizeIntrinsicsPlaceable(intrinsicMinMax == intrinsicMinMax2 ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2)), Constraints.m11102getHasBoundedHeightimpl(j2) ? Constraints.m11106getMaxHeightimpl(j2) : 32767);
        }
        IntrinsicMinMax intrinsicMinMax3 = IntrinsicMinMax.Max;
        IntrinsicMeasurable intrinsicMeasurable2 = this.measurable;
        return new FixedSizeIntrinsicsPlaceable(Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.m11107getMaxWidthimpl(j2) : 32767, intrinsicMinMax == intrinsicMinMax3 ? intrinsicMeasurable2.maxIntrinsicHeight(Constraints.m11107getMaxWidthimpl(j2)) : intrinsicMeasurable2.minIntrinsicHeight(Constraints.m11107getMaxWidthimpl(j2)));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return this.measurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return this.measurable.minIntrinsicWidth(i2);
    }
}
