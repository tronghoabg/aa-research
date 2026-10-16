package androidx.compose.material.internal;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import h.a.i;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1 INSTANCE = new ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1();

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
        int i2;
        int i3;
        int size = list.size();
        if (size == 0) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new l<Placeable.PlacementScope, ab>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }
            }, 4, null);
        }
        int iMax = 0;
        if (size == 1) {
            final Placeable placeableMo9741measureBRTryo0 = list.get(0).mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, ab>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo9741measureBRTryo0, 0, 0, 0.0f, 4, null);
                }

                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return ab.f48028a;
                }
            }, 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(list.get(i4).mo9741measureBRTryo0(j2));
        }
        final ArrayList arrayList2 = arrayList;
        int iE = i.e(arrayList2);
        if (iE >= 0) {
            int iMax2 = 0;
            int i5 = 0;
            while (true) {
                Placeable placeable = (Placeable) arrayList2.get(i5);
                iMax2 = Math.max(iMax2, placeable.getWidth());
                iMax = Math.max(iMax, placeable.getHeight());
                if (i5 == iE) {
                    break;
                }
                i5++;
            }
            i2 = iMax2;
            i3 = iMax;
        } else {
            i2 = 0;
            i3 = 0;
        }
        return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new l<Placeable.PlacementScope, ab>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                int iE2 = i.e(arrayList2);
                if (iE2 < 0) {
                    return;
                }
                int i6 = 0;
                while (true) {
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, arrayList2.get(i6), 0, 0, 0.0f, 4, null);
                    if (i6 == iE2) {
                        return;
                    }
                    i6++;
                    placementScope = placementScope2;
                }
            }

            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return ab.f48028a;
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
