package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
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
import h.e;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AnimatedMeasurePolicy implements MeasurePolicy {
    private final int iconPosition;
    private final a<Float> iconPositionProgress;
    private final a<Float> indicatorAnimationProgress;
    private final PaddingValues indicatorPadding;
    private final float itemHorizontalPadding;
    private final float startIconToLabelHorizontalPadding;
    private final float topIconIndicatorToLabelVerticalPadding;

    private AnimatedMeasurePolicy(int i2, a<Float> aVar, a<Float> aVar2, PaddingValues paddingValues, float f2, float f3, float f4) {
        this.iconPosition = i2;
        this.iconPositionProgress = aVar;
        this.indicatorAnimationProgress = aVar2;
        this.indicatorPadding = paddingValues;
        this.topIconIndicatorToLabelVerticalPadding = f2;
        this.startIconToLabelHorizontalPadding = f3;
        this.itemHorizontalPadding = f4;
    }

    /* renamed from: getIconPosition--xw1Ddg, reason: not valid java name */
    public final int m4339getIconPositionxw1Ddg() {
        return this.iconPosition;
    }

    public final a<Float> getIconPositionProgress() {
        return this.iconPositionProgress;
    }

    public final a<Float> getIndicatorAnimationProgress() {
        return this.indicatorAnimationProgress;
    }

    public final PaddingValues getIndicatorPadding() {
        return this.indicatorPadding;
    }

    /* renamed from: getItemHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m4340getItemHorizontalPaddingD9Ej5fM() {
        return this.itemHorizontalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m4341getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    /* renamed from: getTopIconIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m4342getTopIconIndicatorToLabelVerticalPaddingD9Ej5fM() {
        return this.topIconIndicatorToLabelVerticalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i2);
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i4);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        int iMaxIntrinsicWidth2 = intrinsicMeasurable2.maxIntrinsicWidth(i2);
                        int i5 = intrinsicMeasureScope.mo2121roundToPx0680j_4(PaddingKt.calculateStartPadding(this.indicatorPadding, intrinsicMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(this.indicatorPadding, intrinsicMeasureScope.getLayoutDirection()));
                        if (NavigationItemIconPosition.m5299equalsimpl0(this.iconPosition, NavigationItemIconPosition.Companion.m5304getTopxw1Ddg())) {
                            float f2 = this.itemHorizontalPadding;
                            return Math.max(iMaxIntrinsicWidth2, iMaxIntrinsicWidth + i5 + intrinsicMeasureScope.mo2121roundToPx0680j_4(f2 + f2));
                        }
                        return iMaxIntrinsicWidth + iMaxIntrinsicWidth2 + i5 + intrinsicMeasureScope.mo2121roundToPx0680j_4(this.startIconToLabelHorizontalPadding + this.itemHorizontalPadding);
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = this.indicatorAnimationProgress.invoke().floatValue();
        float fFloatValue2 = this.iconPositionProgress.invoke().floatValue();
        int i2 = 0;
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            Measurable measurable = list.get(i3);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(jM11097copyZbe2FdA$default);
                int size2 = list2.size();
                int i4 = i2;
                while (i4 < size2) {
                    Measurable measurable2 = list.get(i4);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(jM11097copyZbe2FdA$default);
                        PaddingValues paddingValues = this.indicatorPadding;
                        if (paddingValues instanceof DynamicPaddingValues) {
                            ((DynamicPaddingValues) paddingValues).setProgress(fFloatValue2);
                        }
                        float fCalculateStartPadding = PaddingKt.calculateStartPadding(this.indicatorPadding, measureScope2.getLayoutDirection()) + PaddingKt.calculateEndPadding(this.indicatorPadding, measureScope2.getLayoutDirection());
                        PaddingValues paddingValues2 = this.indicatorPadding;
                        float fMo2707calculateTopPaddingD9Ej5fM = paddingValues2.mo2707calculateTopPaddingD9Ej5fM() + paddingValues2.mo2704calculateBottomPaddingD9Ej5fM();
                        int width = placeableMo9741measureBRTryo0.getWidth();
                        int height = placeableMo9741measureBRTryo0.getHeight();
                        int width2 = placeableMo9741measureBRTryo0.getWidth() + placeableMo9741measureBRTryo02.getWidth() + measureScope2.mo2121roundToPx0680j_4(this.startIconToLabelHorizontalPadding);
                        int iMax = Math.max(placeableMo9741measureBRTryo0.getHeight(), placeableMo9741measureBRTryo02.getHeight());
                        int iLerp = MathHelpersKt.lerp(width, width2, fFloatValue2) + measureScope2.mo2121roundToPx0680j_4(fCalculateStartPadding);
                        int iB = h.h.a.b(iLerp * fFloatValue);
                        int iLerp2 = MathHelpersKt.lerp(height, iMax, fFloatValue2) + measureScope2.mo2121roundToPx0680j_4(fMo2707calculateTopPaddingD9Ej5fM);
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Measurable measurable3 = list.get(i5);
                            if (x.n(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(jM11097copyZbe2FdA$default, Constraints.Companion.m11117fixedJhjzzOo(iLerp, iLerp2)));
                                int size4 = list2.size();
                                int i6 = 0;
                                while (i6 < size4) {
                                    Measurable measurable4 = list.get(i6);
                                    if (x.n(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m5316placeAnimatedLabelAndIconPXWvyXQ(measureScope, this.iconPosition, this.iconPositionProgress, placeableMo9741measureBRTryo02, placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo03, measurable4.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(jM11097copyZbe2FdA$default, Constraints.Companion.m11117fixedJhjzzOo(iB, iLerp2))), width, jM11097copyZbe2FdA$default, this.topIconIndicatorToLabelVerticalPadding, this.indicatorPadding, this.startIconToLabelHorizontalPadding, this.itemHorizontalPadding);
                                    }
                                    i6++;
                                    placeableMo9741measureBRTryo02 = placeableMo9741measureBRTryo02;
                                    width = width;
                                }
                                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new e();
                            }
                            i5++;
                            placeableMo9741measureBRTryo02 = placeableMo9741measureBRTryo02;
                            width = width;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new e();
                    }
                    i4++;
                    measureScope2 = measureScope;
                    i2 = 0;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
            i3++;
            measureScope2 = measureScope;
            i2 = 0;
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

    public /* synthetic */ AnimatedMeasurePolicy(int i2, a aVar, a aVar2, PaddingValues paddingValues, float f2, float f3, float f4, o oVar) {
        this(i2, aVar, aVar2, paddingValues, f2, f3, f4);
    }
}
