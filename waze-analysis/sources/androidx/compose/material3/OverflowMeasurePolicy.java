package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OverflowMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private final boolean isVertical;
    private final int maxItemCount;
    private final AppBarOverflowState overflowState;

    public /* synthetic */ OverflowMeasurePolicy(AppBarOverflowState appBarOverflowState, int i2, boolean z, int i3, o oVar) {
        this(appBarOverflowState, i2, z & ((i3 & 4) == 0));
    }

    static final ab measure_3p2s80s$lambda$10(List list, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i2 = 0;
        int width = 0;
        while (i2 < size) {
            Placeable placeable = (Placeable) list.get(i2);
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, 0, 0.0f, 4, null);
            width += placeable.getWidth();
            i2++;
            placementScope = placementScope2;
        }
        Placeable.PlacementScope placementScope3 = placementScope;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Placeable.PlacementScope.placeRelative$default(placementScope3, (Placeable) list2.get(i3), width, 0, 0.0f, 4, null);
            }
        }
        return ab.f48028a;
    }

    static final ab measure_3p2s80s$lambda$9(List list, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i2 = 0;
        int height = 0;
        while (i2 < size) {
            Placeable placeable = (Placeable) list.get(i2);
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, 0, height, 0.0f, 4, null);
            height += placeable.getHeight();
            i2++;
            placementScope = placementScope2;
        }
        Placeable.PlacementScope placementScope3 = placementScope;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Placeable.PlacementScope.placeRelative$default(placementScope3, (Placeable) list2.get(i3), 0, height, 0.0f, 4, null);
            }
        }
        return ab.f48028a;
    }

    public final int getMaxItemCount() {
        return this.maxItemCount;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0215  */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.MeasureResult mo2625measure3p2s80s(androidx.compose.ui.layout.MeasureScope r20, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> r21, long r22) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OverflowMeasurePolicy.mo2625measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    public OverflowMeasurePolicy(AppBarOverflowState appBarOverflowState, int i2, boolean z) {
        this.overflowState = appBarOverflowState;
        this.maxItemCount = i2;
        this.isVertical = z;
    }
}
