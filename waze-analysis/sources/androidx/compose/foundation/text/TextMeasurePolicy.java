package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextMeasurePolicy implements MeasurePolicy {
    private final a<List<Rect>> placements;
    private final a<Boolean> shouldMeasureLinks;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(a<Boolean> aVar, a<? extends List<Rect>> aVar2) {
        this.shouldMeasureLinks = aVar;
        this.placements = aVar2;
    }

    static final ab measure_3p2s80s$lambda$3(List list, List list2, Placeable.PlacementScope placementScope) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                k kVar = (k) list.get(i2);
                Placeable.PlacementScope.m9813place70tqf50$default(placementScope, (Placeable) kVar.a(), ((IntOffset) kVar.b()).m11305unboximpl(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k kVar2 = (k) list2.get(i3);
                Placeable placeable = (Placeable) kVar2.a();
                a aVar = (a) kVar2.b();
                Placeable.PlacementScope.m9813place70tqf50$default(placementScope, placeable, aVar != null ? ((IntOffset) aVar.invoke()).m11305unboximpl() : IntOffset.Companion.m11307getZeronOccac(), 0.0f, 2, null);
            }
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
        final ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (!(measurable.getParentData() instanceof TextRangeLayoutModifier)) {
                arrayList2.add(measurable);
            }
        }
        ArrayList arrayList3 = arrayList2;
        List<Rect> listInvoke = this.placements.invoke();
        if (listInvoke != null) {
            ArrayList arrayList4 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Rect rect = listInvoke.get(i3);
                k kVar = rect != null ? new k(((Measurable) arrayList3.get(i3)).mo9741measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getRight() - rect.getLeft()), 0, (int) Math.floor(rect.getBottom() - rect.getTop()), 5, null)), IntOffset.m11287boximpl((Math.round(rect.getTop()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Math.round(rect.getLeft()) << 32))) : null;
                if (kVar != null) {
                    arrayList4.add(kVar);
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Measurable measurable2 = list.get(i4);
            if (measurable2.getParentData() instanceof TextRangeLayoutModifier) {
                arrayList5.add(measurable2);
            }
        }
        final List listMeasureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(arrayList5, this.shouldMeasureLinks);
        return MeasureScope.CC.layout$default(measureScope, Constraints.m11107getMaxWidthimpl(j2), Constraints.m11106getMaxHeightimpl(j2), null, new l() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextMeasurePolicy.measure_3p2s80s$lambda$3(arrayList, listMeasureWithTextRangeMeasureConstraints, (Placeable.PlacementScope) obj);
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
