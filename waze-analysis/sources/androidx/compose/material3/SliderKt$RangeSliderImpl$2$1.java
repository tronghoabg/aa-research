package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import h.a.c;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import h.h.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SliderKt$RangeSliderImpl$2$1 implements MeasurePolicy {
    final /* synthetic */ boolean $isInsetFocusRing;
    final /* synthetic */ RangeSliderState $state;

    SliderKt$RangeSliderImpl$2$1(boolean z, RangeSliderState rangeSliderState) {
        this.$isInsetFocusRing = z;
        this.$state = rangeSliderState;
    }

    static final ab measure_3p2s80s$lambda$4(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, int i6, Placeable placeable3, int i7, int i8, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i2, i3, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i4 - i5, i6, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i7 - i5, i8, 0.0f, 4, null);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        MeasureScope measureScope2;
        final int i2;
        long j3 = j2;
        if (this.$isInsetFocusRing) {
            measureScope2 = measureScope;
            i2 = measureScope2.mo2121roundToPx0680j_4(SliderKt.insetFocusRingPadding);
        } else {
            measureScope2 = measureScope;
            i2 = 0;
        }
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = list.get(i3);
            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j3);
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = list.get(i4);
                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                        final Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(j3);
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Measurable measurable3 = list.get(i5);
                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                int i6 = i2 * 4;
                                final Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(ConstraintsKt.m11127offsetNN6EwU$default(j3, (-((placeableMo9741measureBRTryo0.getWidth() + placeableMo9741measureBRTryo02.getWidth()) - i6)) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                int width = placeableMo9741measureBRTryo03.getWidth() + (((placeableMo9741measureBRTryo0.getWidth() + placeableMo9741measureBRTryo02.getWidth()) - i6) / 2);
                                int i7 = i2 + i2;
                                int iMax = Math.max(placeableMo9741measureBRTryo03.getHeight(), Math.max(placeableMo9741measureBRTryo0.getHeight() - i7, placeableMo9741measureBRTryo02.getHeight() - i7));
                                this.$state.setTotalWidth$material3(width);
                                this.$state.updateMinMaxPx$material3();
                                RangeSliderState rangeSliderState = this.$state;
                                float coercedActiveRangeStartAsFraction$material3 = rangeSliderState.getCoercedActiveRangeStartAsFraction$material3();
                                boolean z = true;
                                boolean z2 = x.k(coercedActiveRangeStartAsFraction$material3, c.F(rangeSliderState.getTickFractions$material3())) || x.k(coercedActiveRangeStartAsFraction$material3, c.G(this.$state.getTickFractions$material3()));
                                RangeSliderState rangeSliderState2 = this.$state;
                                float coercedActiveRangeEndAsFraction$material3 = rangeSliderState2.getCoercedActiveRangeEndAsFraction$material3();
                                if (!x.k(coercedActiveRangeEndAsFraction$material3, c.F(rangeSliderState2.getTickFractions$material3())) && !x.k(coercedActiveRangeEndAsFraction$material3, c.G(this.$state.getTickFractions$material3()))) {
                                    z = false;
                                }
                                final int width2 = (placeableMo9741measureBRTryo0.getWidth() / 2) - i2;
                                int i8 = placeableMo9741measureBRTryo03.get(SliderKt.getCornerSizeAlignmentLine());
                                int i9 = i8 != Integer.MIN_VALUE ? i8 : 0;
                                final int iB = (this.$state.getSteps() <= 0 || z2) ? a.b(placeableMo9741measureBRTryo03.getWidth() * coercedActiveRangeStartAsFraction$material3) : a.b((placeableMo9741measureBRTryo03.getWidth() - (i9 + i9)) * coercedActiveRangeStartAsFraction$material3) + i9;
                                float width3 = (placeableMo9741measureBRTryo0.getWidth() - placeableMo9741measureBRTryo02.getWidth()) / 2;
                                final int iB2 = (this.$state.getSteps() <= 0 || z) ? a.b((placeableMo9741measureBRTryo03.getWidth() * coercedActiveRangeEndAsFraction$material3) + width3) : a.b(((placeableMo9741measureBRTryo03.getWidth() - (i9 + i9)) * coercedActiveRangeEndAsFraction$material3) + width3) + i9;
                                final int height = (iMax - placeableMo9741measureBRTryo03.getHeight()) / 2;
                                final int height2 = (iMax - placeableMo9741measureBRTryo0.getHeight()) / 2;
                                final int height3 = (iMax - placeableMo9741measureBRTryo02.getHeight()) / 2;
                                return MeasureScope.CC.layout$default(measureScope2, width, iMax, null, new l() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1$$ExternalSyntheticLambda0
                                    @Override // h.g.a.l
                                    public final Object invoke(Object obj) {
                                        return SliderKt$RangeSliderImpl$2$1.measure_3p2s80s$lambda$4(placeableMo9741measureBRTryo03, width2, height, placeableMo9741measureBRTryo0, iB, i2, height2, placeableMo9741measureBRTryo02, iB2, height3, (Placeable.PlacementScope) obj);
                                    }
                                }, 4, null);
                            }
                            i5++;
                            measureScope2 = measureScope;
                            j3 = j2;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new e();
                    }
                    i4++;
                    measureScope2 = measureScope;
                    j3 = j2;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
            i3++;
            measureScope2 = measureScope;
            j3 = j2;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
