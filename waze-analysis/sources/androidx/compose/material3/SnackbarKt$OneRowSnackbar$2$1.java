package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import h.ab;
import h.b.a;
import h.e;
import h.g.a.l;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $dismissActionTag;
    final /* synthetic */ String $textTag;

    SnackbarKt$OneRowSnackbar$2$1(String str, String str2, String str3) {
        this.$actionTag = str;
        this.$dismissActionTag = str2;
        this.$textTag = str3;
    }

    static final ab measure_3p2s80s$lambda$3(Placeable placeable, int i2, Placeable placeable2, int i3, Placeable placeable3, int i4, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, (i2 - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i4, (i2 - placeable3.getHeight()) / 2, 0.0f, 4, null);
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
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        Measurable measurable;
        Measurable measurable2;
        int i2;
        int i3;
        MeasureScope measureScope2 = measureScope;
        int i4 = measureScope2.mo2121roundToPx0680j_4(SnackbarTokens.INSTANCE.m7090getSingleLineContainerHeightD9Ej5fM());
        int iMin = Math.min(Constraints.m11107getMaxWidthimpl(j2), measureScope2.mo2121roundToPx0680j_4(SnackbarKt.ContainerMaxWidth));
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                measurable = null;
                break;
            }
            String str = this.$actionTag;
            measurable = list.get(i5);
            if (x.n(LayoutIdKt.getLayoutId(measurable), str)) {
                break;
            }
            i5++;
        }
        Measurable measurable3 = measurable;
        final Placeable placeableMo9741measureBRTryo0 = measurable3 != null ? measurable3.mo9741measureBRTryo0(j2) : null;
        String str2 = this.$dismissActionTag;
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i6);
            if (x.n(LayoutIdKt.getLayoutId(measurable2), str2)) {
                break;
            }
            i6++;
        }
        Measurable measurable4 = measurable2;
        final Placeable placeableMo9741measureBRTryo02 = measurable4 != null ? measurable4.mo9741measureBRTryo0(j2) : null;
        int width = placeableMo9741measureBRTryo0 != null ? placeableMo9741measureBRTryo0.getWidth() : 0;
        int width2 = placeableMo9741measureBRTryo02 != null ? placeableMo9741measureBRTryo02.getWidth() : 0;
        if (width2 == 0) {
            i3 = measureScope2.mo2121roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing);
            i2 = 0;
        } else {
            i2 = width2;
            i3 = 0;
        }
        int i7 = iMin - width;
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        String str3 = this.$textTag;
        int size3 = list2.size();
        int i8 = 0;
        while (i8 < size3) {
            Measurable measurable5 = list.get(i8);
            if (x.n(LayoutIdKt.getLayoutId(measurable5), str3)) {
                final Placeable placeableMo9741measureBRTryo03 = measurable5.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, n.h((i7 - i2) - i3, iM11109getMinWidthimpl), 0, 0, 9, null));
                final int iG = a.g(i4, placeableMo9741measureBRTryo03.getHeight(), placeableMo9741measureBRTryo0 != null ? placeableMo9741measureBRTryo0.getHeight() : 0, placeableMo9741measureBRTryo02 != null ? placeableMo9741measureBRTryo02.getHeight() : 0);
                final int i9 = iMin - i2;
                final int i10 = i9 - width;
                return MeasureScope.CC.layout$default(measureScope2, iMin, iG, null, new l() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SnackbarKt$OneRowSnackbar$2$1.measure_3p2s80s$lambda$3(placeableMo9741measureBRTryo03, iG, placeableMo9741measureBRTryo0, i10, placeableMo9741measureBRTryo02, i9, (Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
            i8++;
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
}
