package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.util.MathHelpersKt;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import h.h.a;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$SearchBarLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<BackEventCompat> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<BackEventCompat> $firstBackEvent;
    final /* synthetic */ MutableWindowInsets $unconsumedInsets;

    SearchBarKt$SearchBarLayout$2$1(Animatable<Float, AnimationVector1D> animatable, MutableWindowInsets mutableWindowInsets, MutableState<BackEventCompat> mutableState, MutableFloatState mutableFloatState, MutableState<BackEventCompat> mutableState2) {
        this.$animationProgress = animatable;
        this.$unconsumedInsets = mutableWindowInsets;
        this.$currentBackEvent = mutableState;
        this.$finalBackProgress = mutableFloatState;
        this.$firstBackEvent = mutableState2;
    }

    static final ab measure_3p2s80s$lambda$3(long j2, MutableState mutableState, MeasureScope measureScope, float f2, float f3, MutableState mutableState2, int i2, Placeable placeable, int i3, Placeable placeable2, int i4, Placeable placeable3, int i5, Placeable.PlacementScope placementScope) {
        int iMo2121roundToPx0680j_4 = placementScope.mo2121roundToPx0680j_4(SearchBarKt.SearchBarPredictiveBackMinMargin);
        int iM5494calculatePredictiveBackOffsetXrOvwMX4 = SearchBarKt.m5494calculatePredictiveBackOffsetXrOvwMX4(j2, iMo2121roundToPx0680j_4, (BackEventCompat) mutableState.getValue(), measureScope.getLayoutDirection(), f2, f3);
        int iM5495calculatePredictiveBackOffsetYdzo92Q0 = SearchBarKt.m5495calculatePredictiveBackOffsetYdzo92Q0(j2, iMo2121roundToPx0680j_4, (BackEventCompat) mutableState.getValue(), (BackEventCompat) mutableState2.getValue(), i2, placementScope.mo2121roundToPx0680j_4(SearchBarKt.SearchBarPredictiveBackMaxOffsetY), f3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iM5494calculatePredictiveBackOffsetXrOvwMX4, iM5495calculatePredictiveBackOffsetYdzo92Q0 + i3, 0.0f, 4, null);
        int i6 = iM5495calculatePredictiveBackOffsetYdzo92Q0 + i4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iM5494calculatePredictiveBackOffsetXrOvwMX4, i6, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iM5494calculatePredictiveBackOffsetXrOvwMX4, i6 + placeable2.getHeight() + i5, 0.0f, 4, null);
        }
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
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j2) {
        Measurable measurable;
        final Placeable placeableMo9741measureBRTryo0;
        int i2;
        int iM11106getMaxHeightimpl;
        final MeasureScope measureScope2 = measureScope;
        long j3 = j2;
        final float fFloatValue = this.$animationProgress.getValue().floatValue();
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable2 = list.get(i3);
            if (x.n(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable3 = list.get(i4);
                    if (x.n(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                        int size3 = list2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i5);
                            if (x.n(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                break;
                            }
                            i5++;
                        }
                        Measurable measurable4 = measurable;
                        final int top = this.$unconsumedInsets.getTop(measureScope2) + measureScope2.mo2121roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding());
                        int i6 = measureScope2.mo2121roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding());
                        int iM11124constrainWidthK40F9xA = ConstraintsKt.m11124constrainWidthK40F9xA(j3, measurable2.maxIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j3)));
                        int iM11123constrainHeightK40F9xA = ConstraintsKt.m11123constrainHeightK40F9xA(j3, measurable2.minIntrinsicHeight(Constraints.m11107getMaxWidthimpl(j3)));
                        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j3);
                        int iM11106getMaxHeightimpl2 = Constraints.m11106getMaxHeightimpl(j3);
                        MutableState<BackEventCompat> mutableState = this.$currentBackEvent;
                        int iB = a.b(iM11107getMaxWidthimpl * 0.9f);
                        int iB2 = a.b(iM11106getMaxHeightimpl2 * 0.9f);
                        final float fCalculatePredictiveBackMultiplier = SearchBarKt.calculatePredictiveBackMultiplier(mutableState.getValue(), fFloatValue, this.$finalBackProgress.getFloatValue());
                        int iLerp = MathHelpersKt.lerp(iM11124constrainWidthK40F9xA, iB, fCalculatePredictiveBackMultiplier);
                        int i7 = top + iM11123constrainHeightK40F9xA;
                        int iLerp2 = MathHelpersKt.lerp(i7, iB2, fCalculatePredictiveBackMultiplier);
                        int iM11107getMaxWidthimpl2 = Constraints.m11107getMaxWidthimpl(j3);
                        int iM11106getMaxHeightimpl3 = Constraints.m11106getMaxHeightimpl(j2);
                        int iLerp3 = MathHelpersKt.lerp(iLerp, iM11107getMaxWidthimpl2, fFloatValue);
                        final int iLerp4 = MathHelpersKt.lerp(iLerp2, iM11106getMaxHeightimpl3, fFloatValue);
                        final int iLerp5 = MathHelpersKt.lerp(top, 0, fFloatValue);
                        final int iLerp6 = MathHelpersKt.lerp(0, i6, fFloatValue);
                        final Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(ConstraintsKt.Constraints(iLerp3, iM11107getMaxWidthimpl2, iM11123constrainHeightK40F9xA, iM11123constrainHeightK40F9xA));
                        int width = placeableMo9741measureBRTryo02.getWidth();
                        final Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(width, iLerp4 - iLerp5));
                        if (measurable4 != null) {
                            if (Constraints.m11102getHasBoundedHeightimpl(j2)) {
                                i2 = 0;
                                iM11106getMaxHeightimpl = n.h(Constraints.m11106getMaxHeightimpl(j2) - (i7 + i6), 0);
                            } else {
                                i2 = 0;
                                iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
                            }
                            placeableMo9741measureBRTryo0 = measurable4.mo9741measureBRTryo0(ConstraintsKt.Constraints(width, width, i2, iM11106getMaxHeightimpl));
                        } else {
                            placeableMo9741measureBRTryo0 = null;
                        }
                        final MutableState<BackEventCompat> mutableState2 = this.$currentBackEvent;
                        final MutableState<BackEventCompat> mutableState3 = this.$firstBackEvent;
                        return MeasureScope.CC.layout$default(measureScope, width, iLerp4, null, new l() { // from class: androidx.compose.material3.SearchBarKt$SearchBarLayout$2$1$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return SearchBarKt$SearchBarLayout$2$1.measure_3p2s80s$lambda$3(j2, mutableState2, measureScope2, fFloatValue, fCalculatePredictiveBackMultiplier, mutableState3, iLerp4, placeableMo9741measureBRTryo03, iLerp5, placeableMo9741measureBRTryo02, top, placeableMo9741measureBRTryo0, iLerp6, (Placeable.PlacementScope) obj);
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
