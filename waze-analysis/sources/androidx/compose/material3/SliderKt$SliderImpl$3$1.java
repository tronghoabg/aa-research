package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
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
import h.g.b.ao;
import h.g.b.x;
import h.h.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SliderKt$SliderImpl$3$1 implements MeasurePolicy {
    final /* synthetic */ boolean $isInsetFocusRing;
    final /* synthetic */ SliderState $state;

    SliderKt$SliderImpl$3$1(boolean z, SliderState sliderState) {
        this.$isInsetFocusRing = z;
        this.$state = sliderState;
    }

    static final ab measure_3p2s80s$lambda$3(Placeable placeable, int i2, int i3, Placeable placeable2, ao aoVar, ao aoVar2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i2, i3, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, aoVar.f48103a, aoVar2.f48103a, 0.0f, 4, null);
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
        int i2;
        int width;
        int iMax;
        int width2;
        int height;
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
            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                long j3 = j2;
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j3);
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = list.get(i4);
                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                        int i5 = i2 + i2;
                        final Placeable placeableMo9741measureBRTryo02 = this.$state.getOrientation$material3() == Orientation.Vertical ? measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(ConstraintsKt.m11127offsetNN6EwU$default(j3, 0, -(placeableMo9741measureBRTryo0.getHeight() - i5), 1, null), 0, 0, 0, 0, 14, null)) : measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(ConstraintsKt.m11127offsetNN6EwU$default(j2, -(placeableMo9741measureBRTryo0.getWidth() - i5), 0, 2, null), 0, 0, 0, 0, 11, null));
                        final ao aoVar = new ao();
                        final ao aoVar2 = new ao();
                        SliderState sliderState = this.$state;
                        float coercedValueAsFraction = sliderState.getCoercedValueAsFraction();
                        boolean z = true;
                        if (!x.k(coercedValueAsFraction, c.F(sliderState.getTickFractions$material3())) && !x.k(coercedValueAsFraction, c.G(this.$state.getTickFractions$material3()))) {
                            z = false;
                        }
                        int i6 = placeableMo9741measureBRTryo02.get(SliderKt.getCornerSizeAlignmentLine());
                        int i7 = i6 != Integer.MIN_VALUE ? i6 : 0;
                        if (this.$state.getOrientation$material3() == Orientation.Vertical) {
                            width = Math.max(placeableMo9741measureBRTryo02.getWidth(), placeableMo9741measureBRTryo0.getWidth() - i5);
                            iMax = (placeableMo9741measureBRTryo0.getHeight() - i5) + placeableMo9741measureBRTryo02.getHeight();
                            width2 = (width - placeableMo9741measureBRTryo02.getWidth()) / 2;
                            height = (placeableMo9741measureBRTryo0.getHeight() - i5) / 2;
                            aoVar.f48103a = (width - placeableMo9741measureBRTryo0.getWidth()) / 2;
                            int iB = (this.$state.getSteps() <= 0 || z) ? a.b(placeableMo9741measureBRTryo02.getHeight() * coercedValueAsFraction) : a.b((placeableMo9741measureBRTryo02.getHeight() - (i7 + i7)) * coercedValueAsFraction) + i7;
                            aoVar2.f48103a = iB;
                            aoVar2.f48103a = iB + (height - (placeableMo9741measureBRTryo0.getHeight() / 2));
                            if (this.$state.getReverseVerticalDirection$material3()) {
                                aoVar2.f48103a = placeableMo9741measureBRTryo02.getHeight() - aoVar2.f48103a;
                            }
                        } else {
                            width = (placeableMo9741measureBRTryo0.getWidth() - i5) + placeableMo9741measureBRTryo02.getWidth();
                            iMax = Math.max(placeableMo9741measureBRTryo02.getHeight(), placeableMo9741measureBRTryo0.getHeight() - i5);
                            width2 = (placeableMo9741measureBRTryo0.getWidth() - i5) / 2;
                            height = (iMax - placeableMo9741measureBRTryo02.getHeight()) / 2;
                            int iB2 = (this.$state.getSteps() <= 0 || z) ? a.b(placeableMo9741measureBRTryo02.getWidth() * coercedValueAsFraction) : a.b((placeableMo9741measureBRTryo02.getWidth() - (i7 + i7)) * coercedValueAsFraction) + i7;
                            aoVar.f48103a = iB2;
                            aoVar.f48103a = iB2 + (width2 - (placeableMo9741measureBRTryo0.getWidth() / 2));
                            aoVar2.f48103a = (iMax - placeableMo9741measureBRTryo0.getHeight()) / 2;
                        }
                        final int i8 = height;
                        final int i9 = width2;
                        this.$state.updateDimensions$material3(width, iMax);
                        return MeasureScope.CC.layout$default(measureScope2, width, iMax, null, new l() { // from class: androidx.compose.material3.SliderKt$SliderImpl$3$1$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return SliderKt$SliderImpl$3$1.measure_3p2s80s$lambda$3(placeableMo9741measureBRTryo02, i9, i8, placeableMo9741measureBRTryo0, aoVar, aoVar2, (Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
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
