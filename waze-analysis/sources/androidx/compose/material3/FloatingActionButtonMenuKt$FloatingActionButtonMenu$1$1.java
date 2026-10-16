package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.l;
import h.g.b.aq;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1 implements MeasurePolicy {
    final /* synthetic */ MutableIntState $buttonHeight$delegate;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;

    FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1(MutableIntState mutableIntState, Alignment.Horizontal horizontal) {
        this.$buttonHeight$delegate = mutableIntState;
        this.$horizontalAlignment = horizontal;
    }

    static final ab measure_3p2s80s$lambda$0(Alignment.Horizontal horizontal, Placeable placeable, int i2, MeasureScope measureScope, aq aqVar, int i3, int i4, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, horizontal.align(placeable.getWidth(), i2, measureScope.getLayoutDirection()), 0, 0.0f, 4, null);
        Object obj = aqVar.f48105a;
        if (obj != null) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) aqVar.f48105a, horizontal.align(((Placeable) obj).getWidth(), i2, measureScope.getLayoutDirection()), (i3 - ((Placeable) aqVar.f48105a).getHeight()) - i4, 0.0f, 4, null);
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
    public final MeasureResult mo1704measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        int width;
        int height;
        final Placeable placeableMo9741measureBRTryo0 = list.get(0).mo9741measureBRTryo0(j2);
        final int i2 = measureScope.mo2121roundToPx0680j_4(FloatingActionButtonMenuKt.FabMenuButtonPaddingBottom);
        final aq aqVar = new aq();
        if (list.size() > 1) {
            aqVar.f48105a = list.get(1).mo9741measureBRTryo0(j2);
            this.$buttonHeight$delegate.setIntValue(((Placeable) aqVar.f48105a).getHeight());
            width = Math.max(((Placeable) aqVar.f48105a).getWidth(), placeableMo9741measureBRTryo0.getWidth());
            height = Math.max(((Placeable) aqVar.f48105a).getHeight() + i2, placeableMo9741measureBRTryo0.getHeight());
        } else {
            width = placeableMo9741measureBRTryo0.getWidth();
            height = placeableMo9741measureBRTryo0.getHeight();
        }
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        final Alignment.Horizontal horizontal = this.$horizontalAlignment;
        final int iMin = Math.min(width, iM11107getMaxWidthimpl);
        final int iMin2 = Math.min(height, iM11106getMaxHeightimpl);
        return MeasureScope.CC.layout$default(measureScope, iMin, iMin2, null, new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1.measure_3p2s80s$lambda$0(horizontal, placeableMo9741measureBRTryo0, iMin, measureScope, aqVar, iMin2, i2, (Placeable.PlacementScope) obj);
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
