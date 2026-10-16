package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import h.a.r;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import h.k;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BadgeKt$BadgedBox$2$1 implements MeasurePolicy {
    public static final BadgeKt$BadgedBox$2$1 INSTANCE = new BadgeKt$BadgedBox$2$1();

    BadgeKt$BadgedBox$2$1() {
    }

    static final ab measure_3p2s80s$lambda$2(Placeable placeable, MeasureScope measureScope, Placeable placeable2, Placeable.PlacementScope placementScope) {
        int width = placeable.getWidth();
        int i2 = measureScope.mo2121roundToPx0680j_4(BadgeKt.getBadgeRadius());
        float badgeWithContentHorizontalOffset = width > i2 + i2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placeable2.getWidth() + measureScope.mo2121roundToPx0680j_4(badgeWithContentHorizontalOffset), (-placeable.getHeight()) / 2, 0.0f, 4, null);
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
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "badge")) {
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                        final Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(j2);
                        return measureScope.layout(placeableMo9741measureBRTryo02.getWidth(), placeableMo9741measureBRTryo02.getHeight(), r.k(new k(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(placeableMo9741measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()))), new k(AlignmentLineKt.getLastBaseline(), Integer.valueOf(placeableMo9741measureBRTryo02.get(AlignmentLineKt.getLastBaseline())))), new l() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$1$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return BadgeKt$BadgedBox$2$1.measure_3p2s80s$lambda$2(placeableMo9741measureBRTryo0, measureScope, placeableMo9741measureBRTryo02, (Placeable.PlacementScope) obj);
                            }
                        });
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
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
