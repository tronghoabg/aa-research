package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import h.ab;
import h.g.a.l;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1 implements MeasurePolicy {
    final /* synthetic */ float $collapsedShadowElevation;
    final /* synthetic */ State<Float> $expandedProgress;
    final /* synthetic */ float $expandedShadowElevation;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ Shape $toolbarShape;
    final /* synthetic */ float $toolbarToFabGap;

    FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1(State<Float> state, float f2, int i2, float f3, float f4, Shape shape) {
        this.$expandedProgress = state;
        this.$toolbarToFabGap = f2;
        this.$fabPosition = i2;
        this.$collapsedShadowElevation = f3;
        this.$expandedShadowElevation = f4;
        this.$toolbarShape = shape;
    }

    static final ab measure_3p2s80s$lambda$0(float f2, float f3, State state, Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, final Shape shape, Placeable.PlacementScope placementScope) {
        final float fM11207lerpMdfbLM = DpKt.m11207lerpMdfbLM(f2, f3, n.f(((Number) state.getValue()).floatValue(), 1.0f));
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i2, i3, 0.0f, new l() { // from class: androidx.compose.material3.FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1.measure_3p2s80s$lambda$0$0(fM11207lerpMdfbLM, shape, (GraphicsLayerScope) obj);
            }
        }, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i4, i5, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure_3p2s80s$lambda$0$0(float f2, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo2127toPx0680j_4(f2));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
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
        Measurable measurable = list.get(0);
        Measurable measurable2 = list.get(1);
        int i2 = measureScope.mo2121roundToPx0680j_4(FloatingToolbarKt.lerp(FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3(), 1.0f - this.$expandedProgress.getValue().floatValue()));
        final Placeable placeableMo9741measureBRTryo0 = measurable2.mo9741measureBRTryo0(Constraints.m11096copyZbe2FdA(j2, i2, i2, i2, i2));
        int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(measureScope.mo2121roundToPx0680j_4(FloatingToolbarDefaults.INSTANCE.m4905getContainerSizeD9Ej5fM()));
        final Placeable placeableMo9741measureBRTryo02 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, n.j((int) (iMaxIntrinsicWidth * this.$expandedProgress.getValue().floatValue()), 0, Constraints.m11107getMaxWidthimpl(j2)), n.j(measureScope.mo2121roundToPx0680j_4(FloatingToolbarDefaults.INSTANCE.m4905getContainerSizeD9Ej5fM()), 0, Constraints.m11108getMinHeightimpl(j2)), 0, 9, null));
        int i3 = measureScope.mo2121roundToPx0680j_4(this.$toolbarToFabGap) + iMaxIntrinsicWidth + measureScope.mo2121roundToPx0680j_4(((Dp) FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3().getStart()).m11178unboximpl());
        int height = placeableMo9741measureBRTryo02.getHeight();
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        int i4 = iM11108getMinHeightimpl - height;
        int height2 = iM11108getMinHeightimpl - placeableMo9741measureBRTryo0.getHeight();
        final int width = FloatingToolbarHorizontalFabPosition.m4932equalsimpl0(this.$fabPosition, FloatingToolbarHorizontalFabPosition.Companion.m4936getEndEdPuMIg()) ? i3 - placeableMo9741measureBRTryo0.getWidth() : 0;
        final int width2 = FloatingToolbarHorizontalFabPosition.m4932equalsimpl0(this.$fabPosition, FloatingToolbarHorizontalFabPosition.Companion.m4936getEndEdPuMIg()) ? iMaxIntrinsicWidth - placeableMo9741measureBRTryo02.getWidth() : i3 - iMaxIntrinsicWidth;
        final int i5 = height2 / 2;
        final int i6 = i4 / 2;
        final float f2 = this.$collapsedShadowElevation;
        final float f3 = this.$expandedShadowElevation;
        final State<Float> state = this.$expandedProgress;
        final Shape shape = this.$toolbarShape;
        return MeasureScope.CC.layout$default(measureScope, i3, iM11108getMinHeightimpl, null, new l() { // from class: androidx.compose.material3.FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1.measure_3p2s80s$lambda$0(f2, f3, state, placeableMo9741measureBRTryo02, width2, i6, placeableMo9741measureBRTryo0, width, i5, shape, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
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
