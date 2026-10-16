package androidx.compose.material;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ListItemKt$OffsetToBaselineOrCenter$1$1 implements MeasurePolicy {
    final /* synthetic */ float $offset;

    ListItemKt$OffsetToBaselineOrCenter$1$1(float f2) {
        this.$offset = f2;
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i2, 0.0f, 4, null);
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
        int iMax;
        final int iM11297getYimpl;
        final Placeable placeableMo9741measureBRTryo0 = list.get(0).mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
        int i2 = placeableMo9741measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
        if (i2 != Integer.MIN_VALUE) {
            iM11297getYimpl = measureScope.mo2121roundToPx0680j_4(this.$offset) - i2;
            iMax = Math.max(Constraints.m11108getMinHeightimpl(j2), placeableMo9741measureBRTryo0.getHeight() + iM11297getYimpl);
        } else {
            iMax = Math.max(Constraints.m11108getMinHeightimpl(j2), placeableMo9741measureBRTryo0.getHeight());
            iM11297getYimpl = IntOffset.m11297getYimpl(Alignment.Companion.getCenter().mo7648alignKFBX0sM(IntSize.Companion.m11344getZeroYbymL2g(), (iMax - placeableMo9741measureBRTryo0.getHeight()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE, measureScope.getLayoutDirection()));
        }
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), iMax, null, new l() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ListItemKt$OffsetToBaselineOrCenter$1$1.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, iM11297getYimpl, (Placeable.PlacementScope) obj);
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
