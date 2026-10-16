package androidx.compose.foundation.layout;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GridMeasurePolicy implements MeasurePolicy {
    public static final int $stable = 0;
    private final State<l<GridConfigurationScope, ab>> configState;

    /* JADX WARN: Multi-variable type inference failed */
    public GridMeasurePolicy(State<? extends l<? super GridConfigurationScope, ab>> state) {
        this.configState = state;
    }

    static final ab measure_3p2s80s$lambda$0(GridTrackSizes gridTrackSizes, ResolvedGridItemIndicesResult resolvedGridItemIndicesResult, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int[] iArrCalculateTrackOffsets = GridKt.calculateTrackOffsets(gridTrackSizes.getColumnWidths(), gridTrackSizes.getColumnGapPx());
        int[] iArrCalculateTrackOffsets2 = GridKt.calculateTrackOffsets(gridTrackSizes.getRowHeights(), gridTrackSizes.getRowGapPx());
        MutableObjectList<GridItem> gridItems = resolvedGridItemIndicesResult.getGridItems();
        Object[] objArr = gridItems.content;
        int i2 = gridItems._size;
        int i3 = 0;
        while (i3 < i2) {
            GridItem gridItem = (GridItem) objArr[i3];
            Placeable placeable = gridItem.getPlaceable();
            if (placeable != null) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.place$default(placementScope2, placeable, gridItem.getOffsetX() + iArrCalculateTrackOffsets[gridItem.getColumn()], iArrCalculateTrackOffsets2[gridItem.getRow()] + gridItem.getOffsetY(), 0.0f, 4, null);
            } else {
                placementScope2 = placementScope;
            }
            i3++;
            placementScope = placementScope2;
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
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        MeasureScope measureScope2 = measureScope;
        GridConfigurationScopeImpl gridConfigurationScopeImpl = new GridConfigurationScopeImpl(measureScope2, j2, null);
        this.configState.getValue().invoke(gridConfigurationScopeImpl);
        final ResolvedGridItemIndicesResult resolvedGridItemIndicesResultM2682resolveGridItemIndicespclAfdo = GridKt.m2682resolveGridItemIndicespclAfdo(list, gridConfigurationScopeImpl.getColumnSpecs(), gridConfigurationScopeImpl.getRowSpecs(), gridConfigurationScopeImpl.mo2644getFlowITJdzs4());
        MutableObjectList<GridItem> gridItems = resolvedGridItemIndicesResultM2682resolveGridItemIndicespclAfdo.getGridItems();
        MutableLongList columnSpecs = gridConfigurationScopeImpl.getColumnSpecs();
        MutableLongList rowSpecs = gridConfigurationScopeImpl.getRowSpecs();
        long jM2800getGridSizeYbymL2g = resolvedGridItemIndicesResultM2682resolveGridItemIndicespclAfdo.m2800getGridSizeYbymL2g() >> 32;
        final GridTrackSizes gridTrackSizesM2679calculateGridTrackSizescMe430U = GridKt.m2679calculateGridTrackSizescMe430U(measureScope2, gridItems, columnSpecs, rowSpecs, (int) jM2800getGridSizeYbymL2g, (int) (resolvedGridItemIndicesResultM2682resolveGridItemIndicespclAfdo.m2800getGridSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE), j2, gridConfigurationScopeImpl.m2661getColumnGapD9Ej5fM(), gridConfigurationScopeImpl.m2662getRowGapD9Ej5fM());
        GridKt.measureItems(resolvedGridItemIndicesResultM2682resolveGridItemIndicespclAfdo.getGridItems(), gridTrackSizesM2679calculateGridTrackSizescMe430U, measureScope.getLayoutDirection());
        return MeasureScope.CC.layout$default(measureScope, ConstraintsKt.m11124constrainWidthK40F9xA(j2, gridTrackSizesM2679calculateGridTrackSizescMe430U.getTotalWidth()), ConstraintsKt.m11123constrainHeightK40F9xA(j2, gridTrackSizesM2679calculateGridTrackSizescMe430U.getTotalHeight()), null, new l() { // from class: androidx.compose.foundation.layout.GridMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return GridMeasurePolicy.measure_3p2s80s$lambda$0(gridTrackSizesM2679calculateGridTrackSizescMe430U, resolvedGridItemIndicesResultM2682resolveGridItemIndicespclAfdo, (Placeable.PlacementScope) obj);
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
