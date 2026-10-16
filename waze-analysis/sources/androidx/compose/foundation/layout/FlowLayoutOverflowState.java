package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlowLayoutOverflowState {
    public static final int $stable = 8;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private IntIntPair collapseSize;
    private p<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
    private int itemCount;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private IntIntPair seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int itemShown = -1;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i2;
        this.minCrossAxisSizeToShowCollapse = i3;
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i4 & 2) != 0) {
            i2 = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i4 & 4) != 0) {
            i3 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab setOverflowMeasurables__hBUhpc$lambda$2$0(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        int iMainAxisSize;
        int iCrossAxisSize;
        if (placeable != null) {
            iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
            iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            iMainAxisSize = 0;
            iCrossAxisSize = 0;
        }
        flowLayoutOverflowState.seeMoreSize = IntIntPair.m1684boximpl(IntIntPair.m1687constructorimpl(iMainAxisSize, iCrossAxisSize));
        flowLayoutOverflowState.seeMorePlaceable = placeable;
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab setOverflowMeasurables__hBUhpc$lambda$3$0(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        int iMainAxisSize;
        int iCrossAxisSize;
        if (placeable != null) {
            iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
            iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            iMainAxisSize = 0;
            iCrossAxisSize = 0;
        }
        flowLayoutOverflowState.collapseSize = IntIntPair.m1684boximpl(IntIntPair.m1687constructorimpl(iMainAxisSize, iCrossAxisSize));
        flowLayoutOverflowState.collapsePlaceable = placeable;
        return ab.f48028a;
    }

    public final FlowLayoutOverflow.OverflowType component1$foundation_layout() {
        return this.type;
    }

    public final int component2$foundation_layout() {
        return this.minLinesToShowCollapse;
    }

    public final int component3$foundation_layout() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3) {
        return new FlowLayoutOverflowState(overflowType, i2, i3);
    }

    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout(boolean z, int i2, int i3) {
        Measurable measurableInvoke;
        IntIntPair intIntPair;
        Placeable placeable;
        Measurable measurable;
        Placeable placeable2;
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.Visible;
        int iOrdinal = this.type.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal != 2 && iOrdinal != 3) {
            throw new i();
        }
        if (z) {
            p<? super Boolean, ? super Integer, ? extends Measurable> pVar = this.getOverflowMeasurable;
            if (pVar == null || (measurableInvoke = pVar.invoke(true, Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                measurableInvoke = this.seeMoreMeasurable;
            }
            intIntPair = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.seeMorePlaceable;
                placeable2 = placeable;
                measurable = measurableInvoke;
            }
            measurable = measurableInvoke;
            placeable2 = null;
        } else {
            if (i2 < this.minLinesToShowCollapse - 1 || i3 < this.minCrossAxisSizeToShowCollapse) {
                measurableInvoke = null;
            } else {
                p<? super Boolean, ? super Integer, ? extends Measurable> pVar2 = this.getOverflowMeasurable;
                if (pVar2 == null || (measurableInvoke = pVar2.invoke(false, Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                    measurableInvoke = this.collapseMeasurable;
                }
            }
            intIntPair = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.collapsePlaceable;
                placeable2 = placeable;
                measurable = measurableInvoke;
            }
            measurable = measurableInvoke;
            placeable2 = null;
        }
        if (measurable == null) {
            return null;
        }
        if (intIntPair == null) {
            x.g();
        }
        return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable, placeable2, intIntPair.m1695unboximpl(), false, 8, null);
    }

    /* renamed from: ellipsisSize-F35zm-w$foundation_layout, reason: not valid java name */
    public final IntIntPair m2606ellipsisSizeF35zmw$foundation_layout(boolean z, int i2, int i3) {
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.Visible;
        int iOrdinal = this.type.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            if (z) {
                return this.seeMoreSize;
            }
            return null;
        }
        if (iOrdinal != 3) {
            throw new i();
        }
        if (z) {
            return this.seeMoreSize;
        }
        if (i2 + 1 < this.minLinesToShowCollapse || i3 < this.minCrossAxisSizeToShowCollapse) {
            return null;
        }
        return this.collapseSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final int getItemCount$foundation_layout() {
        return this.itemCount;
    }

    public final int getItemShown$foundation_layout() {
        return this.itemShown;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getMinLinesToShowCollapse$foundation_layout() {
        return this.minLinesToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout() {
        int i2 = this.itemShown;
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalStateException(this.shownItemLazyErrorMessage);
    }

    public final String getShownItemLazyErrorMessage$foundation_layout() {
        return this.shownItemLazyErrorMessage;
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.minLinesToShowCollapse) * 31) + this.minCrossAxisSizeToShowCollapse;
    }

    public final void setItemCount$foundation_layout(int i2) {
        this.itemCount = i2;
    }

    public final void setItemShown$foundation_layout(int i2) {
        this.itemShown = i2;
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m2608setOverflowMeasurableshBUhpc$foundation_layout(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z, long j2) {
        long jM2724constructorimpl = OrientationIndependentConstraints.m2724constructorimpl(j2, z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (intrinsicMeasurable != null) {
            int iMainAxisMin = FlowLayoutKt.mainAxisMin(intrinsicMeasurable, z, Constraints.m11106getMaxHeightimpl(jM2724constructorimpl));
            this.seeMoreSize = IntIntPair.m1684boximpl(IntIntPair.m1687constructorimpl(iMainAxisMin, FlowLayoutKt.crossAxisMin(intrinsicMeasurable, z, iMainAxisMin)));
            this.seeMoreMeasurable = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (intrinsicMeasurable2 != null) {
            int iMainAxisMin2 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable2, z, Constraints.m11106getMaxHeightimpl(jM2724constructorimpl));
            this.collapseSize = IntIntPair.m1684boximpl(IntIntPair.m1687constructorimpl(iMainAxisMin2, FlowLayoutKt.crossAxisMin(intrinsicMeasurable2, z, iMainAxisMin2)));
            this.collapseMeasurable = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.collapsePlaceable = null;
        }
    }

    /* renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout, reason: not valid java name */
    public final void m2609setOverflowMeasurablesVKLhPVY$foundation_layout(FlowLineMeasurePolicy flowLineMeasurePolicy, long j2, p<? super Boolean, ? super Integer, ? extends Measurable> pVar) {
        this.itemShown = 0;
        this.getOverflowMeasurable = pVar;
        m2607setOverflowMeasurableshBUhpc$foundation_layout(flowLineMeasurePolicy, pVar.invoke(true, 0), pVar.invoke(false, 0), j2);
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m2607setOverflowMeasurableshBUhpc$foundation_layout(final FlowLineMeasurePolicy flowLineMeasurePolicy, Measurable measurable, Measurable measurable2, long j2) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jM2737toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m2737toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m2726copyyUG9Ft0$default(OrientationIndependentConstraints.m2724constructorimpl(j2, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (measurable != null) {
            FlowLayoutKt.m2602measureAndCacherqJ1uqs(measurable, flowLineMeasurePolicy, jM2737toBoxConstraintsOenEA2s, new l() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$2$0(this.f$0, flowLineMeasurePolicy, (Placeable) obj);
                }
            });
            this.seeMoreMeasurable = measurable;
        }
        if (measurable2 != null) {
            FlowLayoutKt.m2602measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy, jM2737toBoxConstraintsOenEA2s, new l() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$3$0(this.f$0, flowLineMeasurePolicy, (Placeable) obj);
                }
            });
            this.collapseMeasurable = measurable2;
        }
    }
}
