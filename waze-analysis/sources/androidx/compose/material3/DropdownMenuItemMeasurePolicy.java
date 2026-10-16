package androidx.compose.material3;

import androidx.compose.ui.Alignment;
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
import h.e;
import h.g.a.l;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DropdownMenuItemMeasurePolicy implements MeasurePolicy {
    private final boolean hasLeadingIcon;
    private final boolean hasTrailingIcon;

    public DropdownMenuItemMeasurePolicy(boolean z, boolean z2) {
        this.hasLeadingIcon = z;
        this.hasTrailingIcon = z2;
    }

    static final ab DefaultMeasureResult_3p2s80s$lambda$4(Placeable placeable, int i2, Placeable placeable2, Placeable placeable3, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeable.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i3 - placeable3.getWidth(), Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab JustTextMeasureResult_3p2s80s$lambda$1(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2), 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab NoLeadingIconMeasureResult_3p2s80s$lambda$2(Placeable placeable, int i2, Placeable placeable2, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2), 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab NoTrailingIconMeasureResult_3p2s80s$lambda$3(Placeable placeable, int i2, Placeable placeable2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeable.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2), 0.0f, 4, null);
        return ab.f48028a;
    }

    /* renamed from: DefaultMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m4792DefaultMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                        final Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                        int size3 = list2.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Measurable measurable3 = list.get(i4);
                            if (x.n(LayoutIdKt.getLayoutId(measurable3), "ghostLeadingIcon")) {
                                Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                                long jM11119fixedWidthOenEA2s = Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.Companion.m11119fixedWidthOenEA2s(n.h((Constraints.m11107getMaxWidthimpl(j2) - placeableMo9741measureBRTryo03.getWidth()) - placeableMo9741measureBRTryo02.getWidth(), 0)) : Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null);
                                int size4 = list2.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    Measurable measurable4 = list.get(i5);
                                    if (x.n(LayoutIdKt.getLayoutId(measurable4), "text")) {
                                        final Placeable placeableMo9741measureBRTryo04 = measurable4.mo9741measureBRTryo0(jM11119fixedWidthOenEA2s);
                                        final int iM11107getMaxWidthimpl = Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.m11107getMaxWidthimpl(j2) : placeableMo9741measureBRTryo03.getWidth() + placeableMo9741measureBRTryo04.getWidth() + placeableMo9741measureBRTryo02.getWidth();
                                        final int iMax = Math.max(Constraints.m11108getMinHeightimpl(j2), Math.max(placeableMo9741measureBRTryo0.getHeight(), Math.max(placeableMo9741measureBRTryo04.getHeight(), placeableMo9741measureBRTryo02.getHeight())));
                                        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iMax, null, new l() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda2
                                            @Override // h.g.a.l
                                            public final Object invoke(Object obj) {
                                                return DropdownMenuItemMeasurePolicy.DefaultMeasureResult_3p2s80s$lambda$4(placeableMo9741measureBRTryo0, iMax, placeableMo9741measureBRTryo04, placeableMo9741measureBRTryo02, iM11107getMaxWidthimpl, (Placeable.PlacementScope) obj);
                                            }
                                        }, 4, null);
                                    }
                                }
                                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new e();
                            }
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new e();
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    /* renamed from: JustTextMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m4793JustTextMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "text")) {
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                int iM11107getMaxWidthimpl = Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.m11107getMaxWidthimpl(j2) : placeableMo9741measureBRTryo0.getWidth();
                final int iMax = Math.max(Constraints.m11108getMinHeightimpl(j2), placeableMo9741measureBRTryo0.getHeight());
                return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iMax, null, new l() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda3
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DropdownMenuItemMeasurePolicy.JustTextMeasureResult_3p2s80s$lambda$1(placeableMo9741measureBRTryo0, iMax, (Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    /* renamed from: NoLeadingIconMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m4794NoLeadingIconMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "trailingIcon")) {
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                long jM11119fixedWidthOenEA2s = Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.Companion.m11119fixedWidthOenEA2s(n.h(Constraints.m11107getMaxWidthimpl(j2) - placeableMo9741measureBRTryo0.getWidth(), 0)) : Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "text")) {
                        final Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(jM11119fixedWidthOenEA2s);
                        final int iM11107getMaxWidthimpl = Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.m11107getMaxWidthimpl(j2) : placeableMo9741measureBRTryo0.getWidth() + placeableMo9741measureBRTryo02.getWidth();
                        final int iMax = Math.max(Constraints.m11108getMinHeightimpl(j2), Math.max(placeableMo9741measureBRTryo0.getHeight(), placeableMo9741measureBRTryo02.getHeight()));
                        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iMax, null, new l() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return DropdownMenuItemMeasurePolicy.NoLeadingIconMeasureResult_3p2s80s$lambda$2(placeableMo9741measureBRTryo02, iMax, placeableMo9741measureBRTryo0, iM11107getMaxWidthimpl, (Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    /* renamed from: NoTrailingIconMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m4795NoTrailingIconMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "ghostLeadingIcon")) {
                        Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
                        long jM11119fixedWidthOenEA2s = Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.Companion.m11119fixedWidthOenEA2s(n.h(Constraints.m11107getMaxWidthimpl(j2) - placeableMo9741measureBRTryo02.getWidth(), 0)) : Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null);
                        int size3 = list2.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Measurable measurable3 = list.get(i4);
                            if (x.n(LayoutIdKt.getLayoutId(measurable3), "text")) {
                                final Placeable placeableMo9741measureBRTryo03 = measurable3.mo9741measureBRTryo0(jM11119fixedWidthOenEA2s);
                                int iM11107getMaxWidthimpl = Constraints.m11103getHasBoundedWidthimpl(j2) ? Constraints.m11107getMaxWidthimpl(j2) : placeableMo9741measureBRTryo02.getWidth() + placeableMo9741measureBRTryo03.getWidth();
                                final int iMax = Math.max(Constraints.m11108getMinHeightimpl(j2), Math.max(placeableMo9741measureBRTryo0.getHeight(), placeableMo9741measureBRTryo03.getHeight()));
                                return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iMax, null, new l() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda1
                                    @Override // h.g.a.l
                                    public final Object invoke(Object obj) {
                                        return DropdownMenuItemMeasurePolicy.NoTrailingIconMeasureResult_3p2s80s$lambda$3(placeableMo9741measureBRTryo0, iMax, placeableMo9741measureBRTryo03, (Placeable.PlacementScope) obj);
                                    }
                                }, 4, null);
                            }
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new e();
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    public final boolean getHasLeadingIcon() {
        return this.hasLeadingIcon;
    }

    public final boolean getHasTrailingIcon() {
        return this.hasTrailingIcon;
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
        boolean z = this.hasLeadingIcon;
        return (z || this.hasTrailingIcon) ? !this.hasTrailingIcon ? m4795NoTrailingIconMeasureResult3p2s80s(measureScope, list, j2) : !z ? m4794NoLeadingIconMeasureResult3p2s80s(measureScope, list, j2) : m4792DefaultMeasureResult3p2s80s(measureScope, list, j2) : m4793JustTextMeasureResult3p2s80s(measureScope, list, j2);
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
