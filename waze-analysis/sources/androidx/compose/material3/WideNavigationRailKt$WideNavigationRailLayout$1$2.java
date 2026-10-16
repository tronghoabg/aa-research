package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailKt$WideNavigationRailLayout$1$2 implements MeasurePolicy {
    final /* synthetic */ MutableIntState $actualMaxExpandedWidth$delegate;
    final /* synthetic */ Arrangement.Vertical $arrangement;
    final /* synthetic */ MutableIntState $currentWidth$delegate;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ p<Composer, Integer, ab> $header;
    final /* synthetic */ State<Dp> $itemMinHeight$delegate;
    final /* synthetic */ State<Dp> $itemVerticalSpacedBy$delegate;
    final /* synthetic */ State<Dp> $minWidth$delegate;
    final /* synthetic */ float $minimumA11ySize;
    final /* synthetic */ State<Dp> $widthFullRange$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    WideNavigationRailKt$WideNavigationRailLayout$1$2(p<? super Composer, ? super Integer, ab> pVar, boolean z, float f2, State<Dp> state, State<Dp> state2, State<Dp> state3, MutableIntState mutableIntState, MutableIntState mutableIntState2, Arrangement.Vertical vertical, State<Dp> state4) {
        this.$header = pVar;
        this.$expanded = z;
        this.$minimumA11ySize = f2;
        this.$minWidth$delegate = state;
        this.$itemMinHeight$delegate = state2;
        this.$widthFullRange$delegate = state3;
        this.$actualMaxExpandedWidth$delegate = mutableIntState;
        this.$currentWidth$delegate = mutableIntState2;
        this.$arrangement = vertical;
        this.$itemVerticalSpacedBy$delegate = state4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final h.ab measure_3p2s80s$lambda$3(h.g.b.aq r9, java.util.List r10, androidx.compose.foundation.layout.Arrangement.Vertical r11, int r12, androidx.compose.runtime.State r13, androidx.compose.ui.layout.Placeable.PlacementScope r14) {
        /*
            java.lang.Object r0 = r9.f48105a
            r7 = 0
            if (r0 == 0) goto L29
            r1 = r0
            androidx.compose.ui.layout.Placeable r1 = (androidx.compose.ui.layout.Placeable) r1
            int r0 = r1.getHeight()
            if (r0 <= 0) goto L29
            r5 = 4
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r14
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Object r9 = r9.f48105a
            androidx.compose.ui.layout.Placeable r9 = (androidx.compose.ui.layout.Placeable) r9
            int r9 = r9.getHeight()
            float r1 = androidx.compose.material3.WideNavigationRailKt.access$getWNRHeaderPadding$p()
            int r1 = r14.mo2121roundToPx0680j_4(r1)
            int r9 = r9 + r1
            goto L2a
        L29:
            r9 = r7
        L2a:
            if (r10 == 0) goto La3
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r1 = r1.getCenter()
            boolean r1 = h.g.b.x.n(r11, r1)
            if (r1 != 0) goto L39
            int r12 = r12 - r9
        L39:
            int r1 = r10.size()
            int[] r1 = new int[r1]
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r3 = r2.size()
            r4 = r7
        L47:
            if (r4 >= r3) goto L6d
            java.lang.Object r5 = r10.get(r4)
            androidx.compose.ui.layout.Placeable r5 = (androidx.compose.ui.layout.Placeable) r5
            int r5 = r5.getHeight()
            r1[r4] = r5
            int r5 = r10.size()
            int r5 = r5 + (-1)
            if (r4 >= r5) goto L6a
            r5 = r1[r4]
            float r6 = androidx.compose.material3.WideNavigationRailKt.access$WideNavigationRailLayout$lambda$8(r13)
            int r6 = r14.mo2121roundToPx0680j_4(r6)
            int r5 = r5 + r6
            r1[r4] = r5
        L6a:
            int r4 = r4 + 1
            goto L47
        L6d:
            int r3 = r10.size()
            int[] r8 = new int[r3]
            r3 = r14
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            r11.arrange(r3, r12, r1, r8)
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r12 = r12.getCenter()
            boolean r11 = h.g.b.x.n(r11, r12)
            r12 = 1
            if (r12 != r11) goto L87
            r9 = r7
        L87:
            int r11 = r2.size()
        L8b:
            if (r7 >= r11) goto La3
            java.lang.Object r12 = r10.get(r7)
            r1 = r12
            androidx.compose.ui.layout.Placeable r1 = (androidx.compose.ui.layout.Placeable) r1
            r12 = r8[r7]
            int r3 = r12 + r9
            r5 = 4
            r6 = 0
            r2 = 0
            r4 = 0
            r0 = r14
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r0, r1, r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L8b
        La3:
            h.ab r9 = h.ab.f48028a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2.measure_3p2s80s$lambda$3(h.g.b.aq, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, int, androidx.compose.runtime.State, androidx.compose.ui.layout.Placeable$PlacementScope):h.ab");
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
        int iM11109getMinWidthimpl;
        int iM11109getMinWidthimpl2;
        int height;
        aq aqVar;
        int i2;
        int i3;
        final aq aqVar2;
        List<? extends Measurable> listSubList = list;
        int iM11109getMinWidthimpl3 = Constraints.m11109getMinWidthimpl(j2);
        int size = listSubList.size();
        if (iM11109getMinWidthimpl3 == 0) {
            iM11109getMinWidthimpl = n.i(measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.ExpandedRailMinWidth), Constraints.m11107getMaxWidthimpl(j2));
            iM11109getMinWidthimpl2 = n.i(measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.WideNavigationRailLayout$lambda$6(this.$minWidth$delegate)), Constraints.m11107getMaxWidthimpl(j2));
        } else {
            iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
            iM11109getMinWidthimpl2 = Constraints.m11109getMinWidthimpl(j2);
        }
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        if (size <= 0) {
            return MeasureScope.CC.layout$default(measureScope, iM11109getMinWidthimpl2, iM11106getMaxHeightimpl, null, new l() { // from class: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        int iJ = iM11109getMinWidthimpl2;
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        aq aqVar3 = new aq();
        if (this.$header != null) {
            int size2 = listSubList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                Measurable measurable = listSubList.get(i4);
                if (x.n(LayoutIdKt.getLayoutId(measurable), "header")) {
                    aqVar3.f48105a = measurable.mo9741measureBRTryo0(jM11097copyZbe2FdA$default);
                    if (size > 1) {
                        listSubList = listSubList.subList(1, size);
                    }
                    size--;
                    height = ((Placeable) aqVar3.f48105a).getHeight();
                }
            }
            ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
            throw new e();
        }
        height = 0;
        ArrayList arrayList = size > 0 ? new ArrayList() : null;
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(jM11097copyZbe2FdA$default) - measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.getWNRItemHorizontalPadding());
        if (true != this.$expanded) {
            iM11107getMaxWidthimpl = iJ;
        }
        int iH = n.h(iM11107getMaxWidthimpl, measureScope.mo2121roundToPx0680j_4(this.$minimumA11ySize));
        int iH2 = n.h(Constraints.m11106getMaxHeightimpl(jM11097copyZbe2FdA$default), measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.WideNavigationRailLayout$lambda$9(this.$itemMinHeight$delegate)));
        if (arrayList != null) {
            float f2 = this.$minimumA11ySize;
            boolean z = this.$expanded;
            State<Dp> state = this.$itemMinHeight$delegate;
            ArrayList arrayList2 = new ArrayList(listSubList.size());
            int size3 = listSubList.size();
            i2 = iM11106getMaxHeightimpl;
            int i5 = 0;
            i3 = 0;
            while (i5 < size3) {
                Measurable measurable2 = listSubList.get(i5);
                List<? extends Measurable> list2 = listSubList;
                ArrayList arrayList3 = arrayList2;
                int i6 = i5;
                Measurable measurable3 = measurable2;
                int i7 = -height;
                boolean z2 = z;
                State<Dp> state2 = state;
                int i8 = size3;
                float f3 = f2;
                aq aqVar4 = aqVar3;
                Placeable placeableMo9741measureBRTryo0 = measurable3.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, 0, i7, 1, null), Constraints.Companion.m11116fitPrioritizingWidthZbe2FdA(measureScope.mo2121roundToPx0680j_4(f2), iH, measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.WideNavigationRailLayout$lambda$9(state2)), iH2)));
                int measuredWidth = placeableMo9741measureBRTryo0.getMeasuredWidth();
                if (z2 && i3 < measuredWidth) {
                    i3 = measuredWidth + measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.getWNRItemHorizontalPadding());
                }
                height = placeableMo9741measureBRTryo0.getHeight();
                arrayList3.add(Boolean.valueOf(arrayList.add(placeableMo9741measureBRTryo0)));
                i5 = i6 + 1;
                state = state2;
                size3 = i8;
                z = z2;
                f2 = f3;
                aqVar3 = aqVar4;
                listSubList = list2;
            }
            aqVar = aqVar3;
        } else {
            aqVar = aqVar3;
            i2 = iM11106getMaxHeightimpl;
            i3 = 0;
        }
        if (this.$expanded) {
            aqVar2 = aqVar;
            Placeable placeable = (Placeable) aqVar2.f48105a;
            int iMax = Math.max(i3, placeable != null ? placeable.getWidth() : 0);
            if (iMax > iJ && iMax > iM11109getMinWidthimpl) {
                iJ = n.i(measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.WideNavigationRailLayout$lambda$7(this.$widthFullRange$delegate)), n.i(Math.max(iMax, iM11109getMinWidthimpl), Constraints.m11107getMaxWidthimpl(j2)));
                this.$actualMaxExpandedWidth$delegate.setIntValue(iJ);
            }
        } else {
            aqVar2 = aqVar;
            if (WideNavigationRailKt.WideNavigationRailLayout$lambda$4(this.$actualMaxExpandedWidth$delegate) > 0) {
                iJ = n.j(measureScope.mo2121roundToPx0680j_4(WideNavigationRailKt.WideNavigationRailLayout$lambda$7(this.$widthFullRange$delegate)), iJ, n.h(WideNavigationRailKt.WideNavigationRailLayout$lambda$1(this.$currentWidth$delegate), iJ));
            }
        }
        this.$currentWidth$delegate.setIntValue(iJ);
        final Arrangement.Vertical vertical = this.$arrangement;
        final State<Dp> state3 = this.$itemVerticalSpacedBy$delegate;
        final ArrayList arrayList4 = arrayList;
        final int i9 = i2;
        return MeasureScope.CC.layout$default(measureScope, iJ, i9, null, new l() { // from class: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WideNavigationRailKt$WideNavigationRailLayout$1$2.measure_3p2s80s$lambda$3(aqVar2, arrayList4, vertical, i9, state3, (Placeable.PlacementScope) obj);
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
