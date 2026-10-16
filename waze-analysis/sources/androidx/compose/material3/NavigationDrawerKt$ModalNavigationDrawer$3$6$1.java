package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.a.i;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$3$6$1 implements MeasurePolicy {
    final /* synthetic */ MutableState<Boolean> $anchorsInitialized$delegate;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ MutableFloatState $minValue$delegate;

    NavigationDrawerKt$ModalNavigationDrawer$3$6$1(DrawerState drawerState, float f2, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState) {
        this.$drawerState = drawerState;
        this.$maxValue = f2;
        this.$anchorsInitialized$delegate = mutableState;
        this.$minValue$delegate = mutableFloatState;
    }

    static final ab measure_3p2s80s$lambda$3(DrawerState drawerState, int i2, final float f2, List list, MutableState mutableState, final MutableFloatState mutableFloatState, Placeable.PlacementScope placementScope) {
        float fPositionOf = drawerState.getAnchoredDraggableState$material3().getAnchors().positionOf(DrawerValue.Closed);
        float f3 = -i2;
        if (!NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$1(mutableState) || fPositionOf != f3) {
            if (!NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$1(mutableState)) {
                NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$2(mutableState, true);
            }
            mutableFloatState.setFloatValue(f3);
            AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material3(), AnchoredDraggableKt.DraggableAnchors(new l() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$6$1$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return NavigationDrawerKt$ModalNavigationDrawer$3$6$1.measure_3p2s80s$lambda$3$0(f2, mutableFloatState, (DraggableAnchorsConfig) obj);
                }
            }), null, 2, null);
        }
        if (NavigationDrawerKt.calculateFraction(NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$4(mutableFloatState), f2, drawerState.requireOffset$material3()) != 0.0f) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i3), 0, 0, 0.0f, 4, null);
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure_3p2s80s$lambda$3$0(float f2, MutableFloatState mutableFloatState, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(DrawerValue.Closed, NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$4(mutableFloatState));
        draggableAnchorsConfig.at(DrawerValue.Open, f2);
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
        Integer numValueOf;
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list.get(i2).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        Integer numValueOf2 = null;
        int i3 = 1;
        if (arrayList2.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
            int iE = i.e(arrayList2);
            if (iE > 0) {
                int i4 = 1;
                while (true) {
                    Integer numValueOf3 = Integer.valueOf(((Placeable) arrayList2.get(i4)).getWidth());
                    if (numValueOf3.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf3;
                    }
                    if (i4 == iE) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Integer num = numValueOf;
        int iIntValue = num != null ? num.intValue() : 0;
        if (!arrayList2.isEmpty()) {
            numValueOf2 = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
            int iE2 = i.e(arrayList2);
            if (iE2 > 0) {
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((Placeable) arrayList2.get(i3)).getHeight());
                    if (numValueOf4.compareTo(numValueOf2) > 0) {
                        numValueOf2 = numValueOf4;
                    }
                    if (i3 == iE2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Integer num2 = numValueOf2;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        final DrawerState drawerState = this.$drawerState;
        final float f2 = this.$maxValue;
        final MutableState<Boolean> mutableState = this.$anchorsInitialized$delegate;
        final MutableFloatState mutableFloatState = this.$minValue$delegate;
        final int i5 = iIntValue;
        return MeasureScope.CC.layout$default(measureScope, i5, iIntValue2, null, new l() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$6$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavigationDrawerKt$ModalNavigationDrawer$3$6$1.measure_3p2s80s$lambda$3(drawerState, i5, f2, arrayList2, mutableState, mutableFloatState, (Placeable.PlacementScope) obj);
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
