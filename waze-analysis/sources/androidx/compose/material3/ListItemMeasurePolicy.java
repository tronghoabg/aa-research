package androidx.compose.material3;

import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.a.i;
import h.g.a.p;
import h.g.b.u;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        int iIntValue;
        int iIntValue2;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasureScope.mo2121roundToPx0680j_4(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding()));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) i.R(list5);
        if (intrinsicMeasurable != null) {
            iIntValue = pVar.invoke(intrinsicMeasurable, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) i.R(list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = pVar.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) i.R(list3);
        int iIntValue3 = intrinsicMeasurable3 != null ? pVar.invoke(intrinsicMeasurable3, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) i.R(list2);
        int iIntValue4 = intrinsicMeasurable4 != null ? pVar.invoke(intrinsicMeasurable4, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) i.R(list4);
        int iIntValue5 = intrinsicMeasurable5 != null ? pVar.invoke(intrinsicMeasurable5, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        int iM5170invokeZLSjz4$material3 = ListItemType.Companion.m5170invokeZLSjz4$material3(iIntValue3 > 0, iIntValue5 > 0, ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, iIntValue5));
        float fM5157verticalPaddingyh95HIg = ListItemKt.m5157verticalPaddingyh95HIg(iM5170invokeZLSjz4$material3);
        return ListItemKt.m5155calculateHeightN4Jib3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iM5170invokeZLSjz4$material3, intrinsicMeasureScope.mo2121roundToPx0680j_4(fM5157verticalPaddingyh95HIg + fM5157verticalPaddingyh95HIg), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) i.R(list5);
        int iIntValue = intrinsicMeasurable != null ? pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) i.R(list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? pVar.invoke(intrinsicMeasurable2, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) i.R(list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) i.R(list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) i.R(list4);
        return ListItemKt.m5156calculateWidthyeHjK3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue() : 0, intrinsicMeasureScope.mo2121roundToPx0680j_4(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding()), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i2, AnonymousClass1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i2, C03471.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo2625measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        List<? extends Measurable> list2;
        Placeable placeableMo9741measureBRTryo0;
        int i2;
        Placeable placeableMo9741measureBRTryo02;
        List<? extends Measurable> list3 = list.get(0);
        List<? extends Measurable> list4 = list.get(1);
        List<? extends Measurable> list5 = list.get(2);
        List<? extends Measurable> list6 = list.get(3);
        List<? extends Measurable> list7 = list.get(4);
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int i3 = measureScope.mo2121roundToPx0680j_4(listItemStartPadding + listItemEndPadding);
        Measurable measurable = (Measurable) i.R(list6);
        int iMinIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2)) : 0;
        Measurable measurable2 = (Measurable) i.R(list7);
        int iMinIntrinsicWidth2 = measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2)) : 0;
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(jM11097copyZbe2FdA$default);
        int i4 = iMinIntrinsicWidth + iMinIntrinsicWidth2 + i3;
        Measurable measurable3 = (Measurable) i.R(list5);
        float fM5157verticalPaddingyh95HIg = ListItemKt.m5157verticalPaddingyh95HIg(ListItemType.Companion.m5170invokeZLSjz4$material3(i.R(list4) != null, i.R(list5) != null, ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(LayoutUtilKt.subtractConstraintSafely(iM11107getMaxWidthimpl, i4)) : 0)));
        long jM11126offsetNN6EwU = ConstraintsKt.m11126offsetNN6EwU(jM11097copyZbe2FdA$default, -i3, -measureScope.mo2121roundToPx0680j_4(fM5157verticalPaddingyh95HIg + fM5157verticalPaddingyh95HIg));
        Measurable measurable4 = (Measurable) i.R(list6);
        Placeable placeableMo9741measureBRTryo03 = measurable4 != null ? measurable4.mo9741measureBRTryo0(jM11126offsetNN6EwU) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo03);
        Measurable measurable5 = (Measurable) i.R(list7);
        if (measurable5 != null) {
            list2 = list4;
            placeableMo9741measureBRTryo0 = measurable5.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11126offsetNN6EwU, -widthOrZero, 0, 2, null));
        } else {
            list2 = list4;
            placeableMo9741measureBRTryo0 = null;
        }
        int widthOrZero2 = widthOrZero + LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo0);
        Measurable measurable6 = (Measurable) i.R(list3);
        if (measurable6 != null) {
            i2 = i3;
            placeableMo9741measureBRTryo02 = measurable6.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11126offsetNN6EwU, -widthOrZero2, 0, 2, null));
        } else {
            i2 = i3;
            placeableMo9741measureBRTryo02 = null;
        }
        int heightOrZero = LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo02);
        Measurable measurable7 = (Measurable) i.R(list5);
        Placeable placeableMo9741measureBRTryo04 = measurable7 != null ? measurable7.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(jM11126offsetNN6EwU, -widthOrZero2, -heightOrZero)) : null;
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo04);
        boolean z = (placeableMo9741measureBRTryo04 == null || placeableMo9741measureBRTryo04.get(AlignmentLineKt.getFirstBaseline()) == placeableMo9741measureBRTryo04.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) i.R(list2);
        Placeable placeableMo9741measureBRTryo05 = measurable8 != null ? measurable8.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(jM11126offsetNN6EwU, -widthOrZero2, -heightOrZero2)) : null;
        int iM5170invokeZLSjz4$material3 = ListItemType.Companion.m5170invokeZLSjz4$material3(placeableMo9741measureBRTryo05 != null, placeableMo9741measureBRTryo04 != null, z);
        float fM5157verticalPaddingyh95HIg2 = ListItemKt.m5157verticalPaddingyh95HIg(iM5170invokeZLSjz4$material3);
        MeasureScope measureScope2 = measureScope;
        return ListItemKt.place(measureScope, ListItemKt.m5156calculateWidthyeHjK3Y(measureScope2, LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo03), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo02), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo05), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo04), i2, j2), ListItemKt.m5155calculateHeightN4Jib3Y(measureScope2, LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo03), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo0), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo02), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo05), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo04), iM5170invokeZLSjz4$material3, measureScope.mo2121roundToPx0680j_4(fM5157verticalPaddingyh95HIg2 + fM5157verticalPaddingyh95HIg2), j2), placeableMo9741measureBRTryo03, placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo02, placeableMo9741measureBRTryo05, placeableMo9741measureBRTryo04, ListItemType.m5162equalsimpl0(iM5170invokeZLSjz4$material3, ListItemType.Companion.m5168getThreeLineAlXitO8()), measureScope.mo2121roundToPx0680j_4(listItemStartPadding), measureScope.mo2121roundToPx0680j_4(listItemEndPadding), measureScope.mo2121roundToPx0680j_4(fM5157verticalPaddingyh95HIg2));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i2, C03481.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i2, C03491.INSTANCE);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends u implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03471 extends u implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final C03471 INSTANCE = new C03471();

        C03471() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03481 extends u implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final C03481 INSTANCE = new C03481();

        C03481() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03491 extends u implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final C03491 INSTANCE = new C03491();

        C03491() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
        }
    }
}
