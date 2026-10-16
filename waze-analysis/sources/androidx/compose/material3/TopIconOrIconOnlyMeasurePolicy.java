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
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {
    private final boolean hasLabel;
    private final a<Float> indicatorAnimationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorToLabelVerticalPadding;
    private final float indicatorVerticalPadding;
    private final float topIconItemVerticalPadding;

    private TopIconOrIconOnlyMeasurePolicy(boolean z, a<Float> aVar, float f2, float f3, float f4, float f5) {
        this.hasLabel = z;
        this.indicatorAnimationProgress = aVar;
        this.indicatorHorizontalPadding = f2;
        this.indicatorVerticalPadding = f3;
        this.indicatorToLabelVerticalPadding = f4;
        this.topIconItemVerticalPadding = f5;
    }

    public final boolean getHasLabel() {
        return this.hasLabel;
    }

    public final a<Float> getIndicatorAnimationProgress() {
        return this.indicatorAnimationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m6093getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m6094getIndicatorToLabelVerticalPaddingD9Ej5fM() {
        return this.indicatorToLabelVerticalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m6095getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getTopIconItemVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m6096getTopIconItemVerticalPaddingD9Ej5fM() {
        return this.topIconItemVerticalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        IntrinsicMeasurable intrinsicMeasurable;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable2.maxIntrinsicHeight(i2);
                int size2 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        intrinsicMeasurable = null;
                        break;
                    }
                    intrinsicMeasurable = list.get(i4);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "label")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable;
                int iMaxIntrinsicHeight2 = intrinsicMeasurable3 != null ? intrinsicMeasurable3.maxIntrinsicHeight(i2) : 0;
                float f2 = this.topIconItemVerticalPadding;
                float f3 = this.indicatorVerticalPadding;
                return iMaxIntrinsicHeight + iMaxIntrinsicHeight2 + intrinsicMeasureScope.mo2121roundToPx0680j_4(f2 + f2 + f3 + f3 + this.indicatorToLabelVerticalPadding);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
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
                float f2 = this.indicatorHorizontalPadding;
                int i3 = -measureScope2.mo2121roundToPx0680j_4(f2 + f2);
                float f3 = this.indicatorVerticalPadding;
                Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(jM11097copyZbe2FdA$default, i3, -measureScope2.mo2121roundToPx0680j_4(f3 + f3)));
                int width = placeableMo9741measureBRTryo0.getWidth();
                float f4 = this.indicatorHorizontalPadding;
                int i4 = width + measureScope2.mo2121roundToPx0680j_4(f4 + f4);
                int height = placeableMo9741measureBRTryo0.getHeight();
                float f5 = this.indicatorVerticalPadding;
                int i5 = height + measureScope2.mo2121roundToPx0680j_4(f5 + f5);
                int iB = h.h.a.b(i4 * fFloatValue);
                int size2 = list2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Measurable measurable2 = list.get(i6);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(jM11097copyZbe2FdA$default, Constraints.Companion.m11117fixedJhjzzOo(i4, i5)));
                        int size3 = list2.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Measurable measurable3 = list.get(i7);
                            if (x.n(LayoutIdKt.getLayoutId(measurable3), "indicator")) {
                                Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(jM11097copyZbe2FdA$default, Constraints.Companion.m11117fixedJhjzzOo(iB, i5)));
                                if (!this.hasLabel) {
                                    return NavigationItemKt.m5317placeIconX9ElhV4(measureScope2, placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo02, placeableMo9741measureBRTryo03, j2);
                                }
                                int size4 = list2.size();
                                int i8 = 0;
                                while (i8 < size4) {
                                    Measurable measurable4 = list.get(i8);
                                    if (x.n(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        return NavigationItemKt.m5319placeLabelAndTopIconqoqLrGI(measureScope2, measurable4.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, 0, -(placeableMo9741measureBRTryo03.getHeight() + measureScope2.mo2121roundToPx0680j_4(this.indicatorToLabelVerticalPadding)), 1, null)), placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo02, placeableMo9741measureBRTryo03, j2, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
                                    }
                                    i8++;
                                    placeableMo9741measureBRTryo03 = placeableMo9741measureBRTryo03;
                                    placeableMo9741measureBRTryo0 = placeableMo9741measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new e();
                            }
                            i7++;
                            placeableMo9741measureBRTryo0 = placeableMo9741measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new e();
                    }
                    i6++;
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

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z, a aVar, float f2, float f3, float f4, float f5, o oVar) {
        this(z, aVar, f2, f3, f4, f5);
    }
}
