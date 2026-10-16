package androidx.compose.material3;

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
import h.e;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final a<Float> indicatorAnimationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    private StartIconMeasurePolicy(a<Float> aVar, float f2, float f3, float f4) {
        this.indicatorAnimationProgress = aVar;
        this.indicatorHorizontalPadding = f2;
        this.indicatorVerticalPadding = f3;
        this.startIconToLabelHorizontalPadding = f4;
    }

    public final a<Float> getIndicatorAnimationProgress() {
        return this.indicatorAnimationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m5654getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m5655getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m5656getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i2);
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i4);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        int iMaxIntrinsicHeight2 = intrinsicMeasurable2.maxIntrinsicHeight(i2);
                        float f2 = this.indicatorVerticalPadding;
                        return Math.max(iMaxIntrinsicHeight, iMaxIntrinsicHeight2) + intrinsicMeasureScope.mo2121roundToPx0680j_4(f2 + f2);
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
                        float f2 = this.indicatorHorizontalPadding;
                        return iMaxIntrinsicWidth + iMaxIntrinsicWidth2 + intrinsicMeasureScope.mo2121roundToPx0680j_4(f2 + f2 + this.startIconToLabelHorizontalPadding);
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
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(jM11097copyZbe2FdA$default);
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, -(placeableMo9741measureBRTryo0.getWidth() + measureScope2.mo2121roundToPx0680j_4(this.startIconToLabelHorizontalPadding)), 0, 2, null));
                        int width = placeableMo9741measureBRTryo0.getWidth() + placeableMo9741measureBRTryo02.getWidth();
                        float f2 = this.startIconToLabelHorizontalPadding;
                        float f3 = this.indicatorHorizontalPadding;
                        int i4 = width + measureScope2.mo2121roundToPx0680j_4(f2 + f3 + f3);
                        int iMax = Math.max(placeableMo9741measureBRTryo0.getHeight(), placeableMo9741measureBRTryo02.getHeight());
                        float f4 = this.indicatorVerticalPadding;
                        int i5 = iMax + measureScope2.mo2121roundToPx0680j_4(f4 + f4);
                        int iB = h.h.a.b(i4 * fFloatValue);
                        int size3 = list2.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            Measurable measurable3 = list.get(i6);
                            if (x.n(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(jM11097copyZbe2FdA$default, Constraints.Companion.m11117fixedJhjzzOo(i4, i5)));
                                int size4 = list2.size();
                                int i7 = 0;
                                while (i7 < size4) {
                                    Measurable measurable4 = list.get(i7);
                                    if (x.n(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m5318placeLabelAndStartIconnru01g4(measureScope, placeableMo9741measureBRTryo02, placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo03, measurable4.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(jM11097copyZbe2FdA$default, Constraints.Companion.m11117fixedJhjzzOo(iB, i5))), j2, this.startIconToLabelHorizontalPadding);
                                    }
                                    i7++;
                                    placeableMo9741measureBRTryo03 = placeableMo9741measureBRTryo03;
                                }
                                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new e();
                            }
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
            i2++;
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

    public /* synthetic */ StartIconMeasurePolicy(a aVar, float f2, float f3, float f4, o oVar) {
        this(aVar, f2, f3, f4);
    }
}
