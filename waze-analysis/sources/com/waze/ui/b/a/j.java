package com.waze.ui.b.a;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements MultiContentMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f41989a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f41990b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f41991c;

    j(c cVar, List list, List list2) {
        this.f41989a = cVar;
        this.f41990b = list;
        this.f41991c = list2;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo2625measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, final long j2) {
        x.f(measureScope, "$this$Layout");
        x.f(list, "<destruct>");
        final List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        final List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list3;
        ArrayList arrayList = new ArrayList(h.a.i.q(list5, 10));
        Iterator<T> it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo9741measureBRTryo0(j2));
        }
        final List listAq = h.a.i.aq(arrayList);
        final ArrayList arrayList2 = new ArrayList();
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        final c cVar = this.f41989a;
        final List list6 = this.f41990b;
        final List list7 = this.f41991c;
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, null, new h.g.a.l() { // from class: com.waze.ui.b.a.i
            /* JADX WARN: Removed duplicated region for block: B:22:0x0151  */
            @Override // h.g.a.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 674
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.b.a.i.invoke(java.lang.Object):java.lang.Object");
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
