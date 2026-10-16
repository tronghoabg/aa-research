package androidx.compose.material3;

import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.Alignment;
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
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.u;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class InteractiveListItemMeasurePolicy implements MultiContentMeasurePolicy {
    private final Alignment.Vertical verticalAlignment;

    public InteractiveListItemMeasurePolicy(Alignment.Vertical vertical) {
        this.verticalAlignment = vertical;
    }

    /* renamed from: calculateHeight-VsPV1Ek, reason: not valid java name */
    private final int m5076calculateHeightVsPV1Ek(int i2, int i3, int i4, int i5, int i6, long j2) {
        return ConstraintsKt.m11123constrainHeightK40F9xA(j2, Math.max(i2, Math.max(i6 + i4 + i5, i3)));
    }

    private final int calculateIntrinsicHeight(List<? extends List<? extends IntrinsicMeasurable>> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        int iSubtractConstraintSafely;
        int i3;
        int i4;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) i.R(list2);
        if (intrinsicMeasurable != null) {
            int iIntValue = pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = iIntValue;
        } else {
            iSubtractConstraintSafely = i2;
            i3 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) i.R(list3);
        if (intrinsicMeasurable2 != null) {
            int iIntValue2 = pVar.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = iIntValue2;
        } else {
            i4 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) i.R(list4);
        int iIntValue3 = intrinsicMeasurable3 != null ? pVar.invoke(intrinsicMeasurable3, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) i.R(list5);
        int iIntValue4 = intrinsicMeasurable4 != null ? pVar.invoke(intrinsicMeasurable4, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) i.R(list6);
        return m5076calculateHeightVsPV1Ek(i3, i4, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? pVar.invoke(intrinsicMeasurable5, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicWidth(List<? extends List<? extends IntrinsicMeasurable>> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) i.R(list2);
        int iIntValue = intrinsicMeasurable != null ? pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) i.R(list3);
        int iIntValue2 = intrinsicMeasurable2 != null ? pVar.invoke(intrinsicMeasurable2, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) i.R(list4);
        int iIntValue3 = intrinsicMeasurable3 != null ? pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) i.R(list5);
        int iIntValue4 = intrinsicMeasurable4 != null ? pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) i.R(list6);
        return m5077calculateWidthVsPV1Ek(iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    private final int m5077calculateWidthVsPV1Ek(int i2, int i3, int i4, int i5, int i6, long j2) {
        return Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.m11107getMaxWidthimpl(j2) : i2 + Math.max(i6, Math.max(i4, i5)) + i3;
    }

    private final MeasureResult place(MeasureScope measureScope, final int i2, final int i3, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5) {
        return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new l() { // from class: androidx.compose.material3.InteractiveListItemMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return InteractiveListItemMeasurePolicy.place$lambda$0(placeable, this, i3, placeable3, placeable4, placeable5, placeable2, i2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final ab place$lambda$0(Placeable placeable, InteractiveListItemMeasurePolicy interactiveListItemMeasurePolicy, int i2, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, int i3, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, interactiveListItemMeasurePolicy.verticalAlignment.align(placeable.getHeight(), i2), 0.0f, 4, null);
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable);
        int iAlign = interactiveListItemMeasurePolicy.verticalAlignment.align(LayoutUtilKt.getHeightOrZero(placeable2) + LayoutUtilKt.getHeightOrZero(placeable3) + LayoutUtilKt.getHeightOrZero(placeable4), i2);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, iAlign, 0.0f, 4, null);
        }
        int heightOrZero = iAlign + LayoutUtilKt.getHeightOrZero(placeable3);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, heightOrZero, 0.0f, 4, null);
        }
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(placeable2);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, widthOrZero, heightOrZero2, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i3 - placeable5.getWidth(), interactiveListItemMeasurePolicy.verticalAlignment.align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    public final Alignment.Vertical getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(list, i2, AnonymousClass1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(list, i2, C03441.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo2625measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        List<? extends Measurable> list6 = list.get(4);
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        Measurable measurable = (Measurable) i.R(list2);
        Placeable placeableMo9741measureBRTryo0 = measurable != null ? measurable.mo9741measureBRTryo0(jM11097copyZbe2FdA$default) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo0);
        Measurable measurable2 = (Measurable) i.R(list3);
        Placeable placeableMo9741measureBRTryo02 = measurable2 != null ? measurable2.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = widthOrZero + LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo02);
        Measurable measurable3 = (Measurable) i.R(list4);
        Placeable placeableMo9741measureBRTryo03 = measurable3 != null ? measurable3.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, -widthOrZero2, 0, 2, null)) : null;
        int heightOrZero = LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo03);
        Measurable measurable4 = (Measurable) i.R(list6);
        Placeable placeableMo9741measureBRTryo04 = measurable4 != null ? measurable4.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(jM11097copyZbe2FdA$default, -widthOrZero2, -heightOrZero)) : null;
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo04);
        Measurable measurable5 = (Measurable) i.R(list5);
        Placeable placeableMo9741measureBRTryo05 = measurable5 != null ? measurable5.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(jM11097copyZbe2FdA$default, -widthOrZero2, -heightOrZero2)) : null;
        return place(measureScope, m5077calculateWidthVsPV1Ek(LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo02), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo03), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo05), LayoutUtilKt.getWidthOrZero(placeableMo9741measureBRTryo04), j2), m5076calculateHeightVsPV1Ek(LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo0), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo02), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo03), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo05), LayoutUtilKt.getHeightOrZero(placeableMo9741measureBRTryo04), j2), placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo02, placeableMo9741measureBRTryo04, placeableMo9741measureBRTryo03, placeableMo9741measureBRTryo05);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(list, i2, C03451.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(list, i2, C03461.INSTANCE);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.InteractiveListItemMeasurePolicy$maxIntrinsicHeight$1, reason: invalid class name */
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
    /* renamed from: androidx.compose.material3.InteractiveListItemMeasurePolicy$maxIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03441 extends u implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final C03441 INSTANCE = new C03441();

        C03441() {
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
    /* renamed from: androidx.compose.material3.InteractiveListItemMeasurePolicy$minIntrinsicHeight$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03451 extends u implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final C03451 INSTANCE = new C03451();

        C03451() {
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
    /* renamed from: androidx.compose.material3.InteractiveListItemMeasurePolicy$minIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    final /* synthetic */ class C03461 extends u implements p<IntrinsicMeasurable, Integer, Integer> {
        public static final C03461 INSTANCE = new C03461();

        C03461() {
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
