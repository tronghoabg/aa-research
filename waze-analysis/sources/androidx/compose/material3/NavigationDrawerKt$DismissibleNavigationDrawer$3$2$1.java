package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import h.ab;
import h.g.a.l;
import h.h.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1 implements MeasurePolicy {
    final /* synthetic */ MutableState<Boolean> $anchorsInitialized$delegate;
    final /* synthetic */ DrawerState $drawerState;

    NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1(DrawerState drawerState, MutableState<Boolean> mutableState) {
        this.$drawerState = drawerState;
        this.$anchorsInitialized$delegate = mutableState;
    }

    static final ab measure_3p2s80s$lambda$0(DrawerState drawerState, Placeable placeable, Placeable placeable2, MutableState mutableState, Placeable.PlacementScope placementScope) {
        float fPositionOf = drawerState.getAnchoredDraggableState$material3().getAnchors().positionOf(DrawerValue.Closed);
        final float f2 = -placeable.getWidth();
        if (!NavigationDrawerKt.DismissibleNavigationDrawer$lambda$1(mutableState) || fPositionOf != f2) {
            if (!NavigationDrawerKt.DismissibleNavigationDrawer$lambda$1(mutableState)) {
                NavigationDrawerKt.DismissibleNavigationDrawer$lambda$2(mutableState, true);
            }
            AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material3(), AnchoredDraggableKt.DraggableAnchors(new l() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1.measure_3p2s80s$lambda$0$0(f2, (DraggableAnchorsConfig) obj);
                }
            }), null, 2, null);
        }
        int width = placeable.getWidth() + a.b(drawerState.requireOffset$material3());
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
        if (width != 0) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, a.b(drawerState.requireOffset$material3()), 0, 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure_3p2s80s$lambda$0$0(float f2, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(DrawerValue.Closed, f2);
        draggableAnchorsConfig.at(DrawerValue.Open, 0.0f);
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
        final Placeable placeableMo9741measureBRTryo0 = list.get(0).mo9741measureBRTryo0(j2);
        final Placeable placeableMo9741measureBRTryo02 = list.get(1).mo9741measureBRTryo0(j2);
        int width = placeableMo9741measureBRTryo02.getWidth();
        int height = placeableMo9741measureBRTryo02.getHeight();
        final MutableState<Boolean> mutableState = this.$anchorsInitialized$delegate;
        final DrawerState drawerState = this.$drawerState;
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new l() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1.measure_3p2s80s$lambda$0(drawerState, placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo02, mutableState, (Placeable.PlacementScope) obj);
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
