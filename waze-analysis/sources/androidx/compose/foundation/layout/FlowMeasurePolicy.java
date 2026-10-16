package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.FlowLineMeasurePolicy;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.ac;
import h.a.c;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final Arrangement.Vertical verticalArrangement;

    private FlowMeasurePolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f2;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f3;
        this.maxItemsInMainAxis = i2;
        this.maxLines = i3;
        this.overflow = flowLayoutOverflowState;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m2621component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m2622component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.maxItemsInMainAxis;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final FlowLayoutOverflowState component9() {
        return this.overflow;
    }

    /* renamed from: copy-QuyCDyQ$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasurePolicy m2623copyQuyCDyQ$default(FlowMeasurePolicy flowMeasurePolicy, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = flowMeasurePolicy.isHorizontal;
        }
        if ((i4 & 2) != 0) {
            horizontal = flowMeasurePolicy.horizontalArrangement;
        }
        if ((i4 & 4) != 0) {
            vertical = flowMeasurePolicy.verticalArrangement;
        }
        if ((i4 & 8) != 0) {
            f2 = flowMeasurePolicy.mainAxisSpacing;
        }
        if ((i4 & 16) != 0) {
            crossAxisAlignment = flowMeasurePolicy.crossAxisAlignment;
        }
        if ((i4 & 32) != 0) {
            f3 = flowMeasurePolicy.crossAxisArrangementSpacing;
        }
        if ((i4 & 64) != 0) {
            i2 = flowMeasurePolicy.maxItemsInMainAxis;
        }
        if ((i4 & 128) != 0) {
            i3 = flowMeasurePolicy.maxLines;
        }
        if ((i4 & 256) != 0) {
            flowLayoutOverflowState = flowMeasurePolicy.overflow;
        }
        int i5 = i3;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        float f4 = f3;
        int i6 = i2;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        Arrangement.Vertical vertical2 = vertical;
        return flowMeasurePolicy.m2624copyQuyCDyQ(z, horizontal, vertical2, f2, crossAxisAlignment2, f4, i6, i5, flowLayoutOverflowState2);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m2624copyQuyCDyQ(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        return new FlowMeasurePolicy(z, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, flowLayoutOverflowState, null);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public /* synthetic */ long mo2475createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z) {
        return FlowLineMeasurePolicy.CC.m2615$default$createConstraintsxF2OJ5Q(this, i2, i3, i4, i5, z);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ int crossAxisSize(Placeable placeable) {
        return FlowLineMeasurePolicy.CC.$default$crossAxisSize(this, placeable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && x.n(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && x.n(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && Dp.m11169equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && x.n(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && Dp.m11169equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && x.n(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public /* synthetic */ int getCrossAxisPosition(Placeable placeable, int i2, LayoutDirection layoutDirection, int i3) {
        return FlowLineMeasurePolicy.CC.$default$getCrossAxisPosition(this, placeable, i2, layoutDirection, i3);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((FlowMeasurePolicy$$ExternalSyntheticBackport0.m(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + this.maxItemsInMainAxis) * 31) + this.maxLines) * 31) + this.overflow.hashCode();
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        long jM1687constructorimpl;
        boolean z;
        if (list.isEmpty()) {
            jM1687constructorimpl = IntIntPair.m1687constructorimpl(0, 0);
        } else {
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i5, flowLayoutOverflowState, OrientationIndependentConstraints.m2722constructorimpl(0, i2, 0, Integer.MAX_VALUE), i6, i3, i4, null);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) i.S(list, 0);
            int iMinCrossAxisIntrinsicItemSize = intrinsicMeasurable != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable, i2) : 0;
            boolean z2 = intrinsicMeasurable == null;
            int iMinMainAxisIntrinsicItemSize = intrinsicMeasurable != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable, iMinCrossAxisIntrinsicItemSize) : 0;
            if (flowLayoutBuildingBlocks.m2598getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m1687constructorimpl(i2, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m1684boximpl(IntIntPair.m1687constructorimpl(iMinMainAxisIntrinsicItemSize, iMinCrossAxisIntrinsicItemSize)), 0, 0, 0, false, false).isLastItemInContainer()) {
                IntIntPair intIntPairM2606ellipsisSizeF35zmw$foundation_layout = flowLayoutOverflowState.m2606ellipsisSizeF35zmw$foundation_layout(!z2, 0, 0);
                jM1687constructorimpl = IntIntPair.m1687constructorimpl(intIntPairM2606ellipsisSizeF35zmw$foundation_layout != null ? IntIntPair.m1692getSecondimpl(intIntPairM2606ellipsisSizeF35zmw$foundation_layout.m1695unboximpl()) : 0, 0);
            } else {
                int size = list.size();
                int i7 = i2;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    int i14 = i7 - iMinMainAxisIntrinsicItemSize;
                    int i15 = i8 + 1;
                    int iMax = Math.max(i9, iMinCrossAxisIntrinsicItemSize);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) i.S(list, i15);
                    int iMinCrossAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minCrossAxisIntrinsicItemSize(intrinsicMeasurable2, i2) : 0;
                    boolean z3 = intrinsicMeasurable2 == null;
                    int iMinMainAxisIntrinsicItemSize2 = intrinsicMeasurable2 != null ? minMainAxisIntrinsicItemSize(intrinsicMeasurable2, iMinCrossAxisIntrinsicItemSize2) + i3 : 0;
                    if (i8 + 2 < list.size()) {
                        i8 = i15;
                        z = true;
                    } else {
                        i8 = i15;
                        z = false;
                    }
                    int i16 = i8 - i13;
                    long jM1687constructorimpl2 = IntIntPair.m1687constructorimpl(i14, Integer.MAX_VALUE);
                    IntIntPair intIntPairM1684boximpl = intrinsicMeasurable2 == null ? null : IntIntPair.m1684boximpl(IntIntPair.m1687constructorimpl(iMinMainAxisIntrinsicItemSize2, iMinCrossAxisIntrinsicItemSize2));
                    int i17 = iMinMainAxisIntrinsicItemSize2;
                    int i18 = iMinCrossAxisIntrinsicItemSize2;
                    int i19 = i10;
                    FlowLayoutBuildingBlocks.WrapInfo wrapInfoM2598getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m2598getWrapInfoOpUlnko(z, i16, jM1687constructorimpl2, intIntPairM1684boximpl, i19, i12, iMax, false, false);
                    if (wrapInfoM2598getWrapInfoOpUlnko.isLastItemInLine()) {
                        int iM1692getSecondimpl = i12 + iMax + i4;
                        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM2598getWrapInfoOpUlnko, !z3, i19, iM1692getSecondimpl, i14, i16);
                        i17 -= i3;
                        i10 = i19 + 1;
                        if (wrapInfoM2598getWrapInfoOpUlnko.isLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long jM2599getEllipsisSizeOO21N7I = wrapEllipsisInfo.m2599getEllipsisSizeOO21N7I();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    iM1692getSecondimpl += IntIntPair.m1692getSecondimpl(jM2599getEllipsisSizeOO21N7I) + i4;
                                }
                            }
                            i12 = iM1692getSecondimpl;
                            i11 = i8;
                        } else {
                            i7 = i2;
                            i9 = 0;
                            i13 = i8;
                            i12 = iM1692getSecondimpl;
                        }
                    } else {
                        i7 = i14;
                        i10 = i19;
                        i9 = iMax;
                    }
                    iMinMainAxisIntrinsicItemSize = i17;
                    i11 = i8;
                    iMinCrossAxisIntrinsicItemSize = i18;
                }
                jM1687constructorimpl = IntIntPair.m1687constructorimpl(i12 - i4, i11);
            }
        }
        return IntIntPair.m1691getFirstimpl(jM1687constructorimpl);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ int mainAxisSize(Placeable placeable) {
        return FlowLineMeasurePolicy.CC.$default$mainAxisSize(this, placeable);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        List list2 = (List) i.S(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) i.R(list2) : null;
        List list3 = (List) i.S(list, 2);
        this.overflow.m2608setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) i.R(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        if (isHorizontal()) {
            ac acVar = (List) i.R(list);
            if (acVar == null) {
                acVar = ac.f47967a;
            }
            return intrinsicCrossAxisSize(acVar, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo2121roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        ac acVar2 = (List) i.R(list);
        if (acVar2 == null) {
            acVar2 = ac.f47967a;
        }
        return maxIntrinsicMainAxisSize(acVar2, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing));
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int iMax = 0;
        int iMaxMainAxisIntrinsicItemSize = 0;
        int i5 = 0;
        while (i4 < size) {
            int i6 = this.maxItemsInMainAxis;
            iMaxMainAxisIntrinsicItemSize += maxMainAxisIntrinsicItemSize(list.get(i4), i2) + i3;
            int i7 = i4 + 1;
            if (i7 - i5 == i6 || i7 == list.size()) {
                iMax = Math.max(iMax, iMaxMainAxisIntrinsicItemSize - i3);
                iMaxMainAxisIntrinsicItemSize = 0;
                i5 = i4;
            }
            i4 = i7;
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        List list2 = (List) i.S(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) i.R(list2) : null;
        List list3 = (List) i.S(list, 2);
        this.overflow.m2608setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) i.R(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        if (isHorizontal()) {
            ac acVar = (List) i.R(list);
            if (acVar == null) {
                acVar = ac.f47967a;
            }
            return maxIntrinsicMainAxisSize(acVar, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing));
        }
        ac acVar2 = (List) i.R(list);
        if (acVar2 == null) {
            acVar2 = ac.f47967a;
        }
        return intrinsicCrossAxisSize(acVar2, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo2121roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int maxMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return isHorizontal() ? intrinsicMeasurable.maxIntrinsicWidth(i2) : intrinsicMeasurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo2625measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m11106getMaxHeightimpl(j2) == 0 && this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new l() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        List list2 = (List) i.P(list);
        if (list2.isEmpty()) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new l() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        List list3 = (List) i.S(list, 1);
        Measurable measurable = list3 != null ? (Measurable) i.R(list3) : null;
        List list4 = (List) i.S(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) i.R(list4) : null;
        this.overflow.setItemCount$foundation_layout(list2.size());
        FlowMeasurePolicy flowMeasurePolicy = this;
        this.overflow.m2607setOverflowMeasurableshBUhpc$foundation_layout(flowMeasurePolicy, measurable, measurable2, j2);
        return FlowLayoutKt.m2601breakDownItemsdi9J0FM(measureScope, flowMeasurePolicy, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m2724constructorimpl(j2, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minCrossAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicHeight(i2) : intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        List list2 = (List) i.S(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) i.R(list2) : null;
        List list3 = (List) i.S(list, 2);
        this.overflow.m2608setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) i.R(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        if (isHorizontal()) {
            ac acVar = (List) i.R(list);
            if (acVar == null) {
                acVar = ac.f47967a;
            }
            return intrinsicCrossAxisSize(acVar, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo2121roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        ac acVar2 = (List) i.R(list);
        if (acVar2 == null) {
            acVar2 = ac.f47967a;
        }
        return minIntrinsicMainAxisSize(acVar2, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo2121roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i7 = i5;
        int i8 = i6;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i9);
            int iMinMainAxisIntrinsicItemSize = minMainAxisIntrinsicItemSize(intrinsicMeasurable, i2);
            iArr[i9] = iMinMainAxisIntrinsicItemSize;
            iArr2[i9] = minCrossAxisIntrinsicItemSize(intrinsicMeasurable, iMinMainAxisIntrinsicItemSize);
        }
        int i10 = Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE && i7 != Integer.MAX_VALUE) {
            i10 = i7 * i8;
        }
        int i11 = 1;
        int iMin = Math.min(i10 - (((i10 >= list.size() || !(flowLayoutOverflowState.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i10 < list.size() || i8 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout() || flowLayoutOverflowState.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iE = c.E(iArr) + ((list.size() - 1) * i3);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iM1691getFirstimpl = iArr2[0];
        int iY = c.y(iArr2);
        if (iY > 0) {
            int i12 = 1;
            while (true) {
                int i13 = iArr2[i12];
                if (iM1691getFirstimpl < i13) {
                    iM1691getFirstimpl = i13;
                }
                if (i12 == iY) {
                    break;
                }
                i12++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i14 = iArr[0];
        int iY2 = c.y(iArr);
        if (iY2 > 0) {
            while (true) {
                int i15 = iArr[i11];
                if (i14 < i15) {
                    i14 = i15;
                }
                if (i11 == iY2) {
                    break;
                }
                i11++;
            }
        }
        int i16 = i14;
        int i17 = iE;
        while (i16 <= i17 && iM1691getFirstimpl != i2) {
            int i18 = (i16 + i17) / 2;
            long jIntrinsicCrossAxisSize = FlowLayoutKt.intrinsicCrossAxisSize(list, iArr, iArr2, i18, i3, i4, i7, i8, flowLayoutOverflowState);
            iM1691getFirstimpl = IntIntPair.m1691getFirstimpl(jIntrinsicCrossAxisSize);
            int iM1692getSecondimpl = IntIntPair.m1692getSecondimpl(jIntrinsicCrossAxisSize);
            if (iM1691getFirstimpl > i2 || iM1692getSecondimpl < iMin) {
                i16 = i18 + 1;
                if (i16 > i17) {
                    return i16;
                }
            } else {
                if (iM1691getFirstimpl >= i2) {
                    return i18;
                }
                i17 = i18 - 1;
            }
            i7 = i5;
            i8 = i6;
            iE = i18;
        }
        return iE;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        List list2 = (List) i.S(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) i.R(list2) : null;
        List list3 = (List) i.S(list, 2);
        this.overflow.m2608setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) i.R(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        if (isHorizontal()) {
            ac acVar = (List) i.R(list);
            if (acVar == null) {
                acVar = ac.f47967a;
            }
            return minIntrinsicMainAxisSize(acVar, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo2121roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        ac acVar2 = (List) i.R(list);
        if (acVar2 == null) {
            acVar2 = ac.f47967a;
        }
        return intrinsicCrossAxisSize(acVar2, i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo2121roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minMainAxisIntrinsicItemSize(IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return isHorizontal() ? intrinsicMeasurable.minIntrinsicWidth(i2) : intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        return FlowLineMeasurePolicy.CC.$default$placeHelper(this, placeableArr, measureScope, i2, iArr, i3, i4, iArr2, i5, i6, i7);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        FlowLineMeasurePolicy.CC.$default$populateMainAxisPositions(this, i2, iArr, iArr2, measureScope);
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) Dp.m11175toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.m11175toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    public /* synthetic */ FlowMeasurePolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, o oVar) {
        this(z, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, flowLayoutOverflowState);
    }
}
