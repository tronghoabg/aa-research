package androidx.compose.material3;

import androidx.collection.MutableIntList;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.b.a;
import h.g.a.l;
import h.g.b.an;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TabRowKt$ScrollableTabRowImpl$1$1$2$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ float $minTabWidth;
    final /* synthetic */ TabRowKt$ScrollableTabRowImpl$1$scope$1$1 $scope;
    final /* synthetic */ ScrollableTabData $scrollableTabData;
    final /* synthetic */ int $selectedTabIndex;

    TabRowKt$ScrollableTabRowImpl$1$1$2$1(float f2, float f3, TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1, int i2, ScrollableTabData scrollableTabData) {
        this.$edgePadding = f2;
        this.$minTabWidth = f3;
        this.$scope = tabRowKt$ScrollableTabRowImpl$1$scope$1$1;
        this.$selectedTabIndex = i2;
        this.$scrollableTabData = scrollableTabData;
    }

    static final ab measure_3p2s80s$lambda$5(an anVar, float f2, List list, List list2, ScrollableTabData scrollableTabData, MeasureScope measureScope, int i2, List list3, int i3, int i4, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        anVar.f48102a = f2;
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            Placeable.PlacementScope placementScope3 = placementScope2;
            Placeable.PlacementScope.placeRelative$default(placementScope3, (Placeable) list.get(i5), placementScope2.mo2121roundToPx0680j_4(anVar.f48102a), 0, 0.0f, 4, null);
            anVar.f48102a += ((TabPosition) list3.get(i5)).m5710getWidthD9Ej5fM();
            i5++;
            placementScope2 = placementScope3;
        }
        Placeable.PlacementScope placementScope4 = placementScope2;
        int size2 = list2.size();
        int i6 = 0;
        while (i6 < size2) {
            Placeable placeable = (Placeable) list2.get(i6);
            Placeable.PlacementScope.placeRelative$default(placementScope4, placeable, Math.max(0, (placementScope4.mo2121roundToPx0680j_4(((TabPosition) list3.get(i3)).m5710getWidthD9Ej5fM()) - placeable.getWidth()) / 2), i4 - placeable.getHeight(), 0.0f, 4, null);
            i6++;
            placementScope4 = placementScope;
        }
        scrollableTabData.onLaidOut(measureScope, i2, list3, i3);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo2625measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        final int i2 = measureScope.mo2121roundToPx0680j_4(this.$edgePadding);
        int size = list2.size();
        int iValueOf = 0;
        List<? extends Measurable> list4 = list2;
        int size2 = list4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), list2.get(i3).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        int iIntValue = iValueOf.intValue();
        int i4 = i2 + i2;
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, measureScope.mo2121roundToPx0680j_4(this.$minTabWidth), 0, iIntValue, iIntValue, 2, null);
        an anVar = new an();
        anVar.f48102a = this.$edgePadding;
        ArrayList arrayList = new ArrayList(list2.size());
        int size3 = list4.size();
        for (int i5 = 0; i5 < size3; i5++) {
            arrayList.add(list2.get(i5).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        ArrayList arrayList2 = arrayList;
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        int size4 = list4.size();
        for (int i6 = 0; i6 < size4; i6++) {
            mutableIntList.add(list2.get(i6).maxIntrinsicWidth(Integer.MAX_VALUE));
        }
        float f2 = this.$minTabWidth;
        ArrayList arrayList3 = new ArrayList(size);
        int i7 = i4;
        int i8 = 0;
        while (i8 < size) {
            float fM11178unboximpl = ((Dp) a.h(Dp.m11162boximpl(f2), Dp.m11162boximpl(measureScope.mo2124toDpu2uoSUM(((Placeable) arrayList2.get(i8)).getWidth())))).m11178unboximpl();
            i7 += measureScope.mo2121roundToPx0680j_4(fM11178unboximpl);
            float f3 = measureScope.mo2124toDpu2uoSUM(mutableIntList.get(i8));
            float horizontalTextPadding = TabKt.getHorizontalTextPadding();
            float fM11178unboximpl2 = ((Dp) a.h(Dp.m11162boximpl(f3 - (horizontalTextPadding + horizontalTextPadding)), Dp.m11162boximpl(24.0f))).m11178unboximpl();
            ArrayList arrayList4 = arrayList2;
            float f4 = anVar.f48102a;
            TabPosition tabPosition = new TabPosition(f4, fM11178unboximpl, fM11178unboximpl2, null);
            anVar.f48102a = f4 + fM11178unboximpl;
            arrayList3.add(tabPosition);
            i8++;
            arrayList2 = arrayList4;
        }
        final ArrayList arrayList5 = arrayList2;
        final ArrayList arrayList6 = arrayList3;
        this.$scope.setTabPositions(arrayList6);
        int i9 = this.$selectedTabIndex;
        ArrayList arrayList7 = new ArrayList(list3.size());
        int size5 = list3.size();
        int i10 = 0;
        while (i10 < size5) {
            int i11 = iIntValue;
            iIntValue = i11;
            arrayList7.add(list3.get(i10).mo9741measureBRTryo0(Constraints.m11096copyZbe2FdA(j2, 0, measureScope.mo2121roundToPx0680j_4(((TabPosition) arrayList6.get(i9)).m5707getContentWidthD9Ej5fM()), 0, i11)));
            i10++;
            anVar = anVar;
            list3 = list3;
            i9 = i9;
        }
        final an anVar2 = anVar;
        final ArrayList arrayList8 = arrayList7;
        final float f5 = this.$edgePadding;
        final ScrollableTabData scrollableTabData = this.$scrollableTabData;
        final int i12 = this.$selectedTabIndex;
        final int i13 = iIntValue;
        return MeasureScope.CC.layout$default(measureScope, i7, iIntValue, null, new l() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TabRowKt$ScrollableTabRowImpl$1$1$2$1.measure_3p2s80s$lambda$5(anVar2, f5, arrayList5, arrayList8, scrollableTabData, measureScope, i2, arrayList6, i12, i13, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
