package androidx.compose.foundation.layout;

import androidx.compose.runtime.State;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FlexBoxMeasurePolicy implements MeasurePolicy {
    private final State<FlexBoxConfig> flexBoxConfigState;
    private final ResolvedFlexBoxConfig resolvedFlexBoxConfig = new ResolvedFlexBoxConfig();

    /* JADX WARN: Multi-variable type inference failed */
    public FlexBoxMeasurePolicy(State<? extends FlexBoxConfig> state) {
        this.flexBoxConfigState = state;
    }

    /* renamed from: applyAlignContentStretch-WWvErGg, reason: not valid java name */
    private final int m2548applyAlignContentStretchWWvErGg(ResolvedFlexBoxConfig resolvedFlexBoxConfig, ArrayList<FlexLine> arrayList, long j2, int i2, int i3) {
        if (FlexAlignContent.m2489equalsimpl0(resolvedFlexBoxConfig.m2780getAlignContentd9B3MrI$foundation_layout(), 3) && !arrayList.isEmpty() && arrayList.size() != 1) {
            int size = (arrayList.size() - 1) * i3;
            int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
            if (i2 + size < iM11108getMinHeightimpl) {
                int i4 = (iM11108getMinHeightimpl - i2) - size;
                if (i4 < 0) {
                    i4 = 0;
                }
                int size2 = i4 / arrayList.size();
                ArrayList<FlexLine> arrayList2 = arrayList;
                int size3 = arrayList2.size();
                int crossAxisSize = 0;
                for (int i5 = 0; i5 < size3; i5++) {
                    FlexLine flexLine = arrayList2.get(i5);
                    flexLine.setCrossStart(crossAxisSize);
                    flexLine.setCrossAxisSize(flexLine.getCrossAxisSize() + size2);
                    crossAxisSize += flexLine.getCrossAxisSize() + i3;
                    i2 += size2;
                }
            }
        }
        return i2;
    }

    /* renamed from: buildFlexLines-JlE-8fw, reason: not valid java name */
    private final ArrayList<FlexLine> m2549buildFlexLinesJlE8fw(ResolvedFlexBoxConfig resolvedFlexBoxConfig, ArrayList<ResolvedFlexItemInfo> arrayList, long j2, int i2, int i3, boolean z, l<? super Integer, ab> lVar) {
        ArrayList<FlexLine> arrayList2 = new ArrayList<>(8);
        FlexLine flexLine = new FlexLine();
        ArrayList<ResolvedFlexItemInfo> arrayList3 = arrayList;
        int size = arrayList3.size();
        FlexLine flexLine2 = flexLine;
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        int i4 = 0;
        int hypotheticalMainSize = 0;
        int crossAxisSize = 0;
        int crossAxisSize2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList3.get(i5);
            if ((FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 2)) && i5 > i4 && resolvedFlexItemInfo.getHypotheticalMainSize() + hypotheticalMainSize > Constraints.m11107getMaxWidthimpl(j2)) {
                flexLine2.setStartIndex(i4);
                flexLine2.setEndIndex(i5);
                int i6 = crossAxisSize;
                m2555processFlexLine7gjidqw(flexLine2, arrayList, resolvedFlexBoxConfig, hypotheticalMainSize - i2, z, j2, iM11106getMaxHeightimpl);
                crossAxisSize2 += flexLine2.getCrossAxisSize();
                flexLine2.setCrossStart(i6);
                crossAxisSize = i6 + flexLine2.getCrossAxisSize() + i3;
                iM11106getMaxHeightimpl -= flexLine2.getCrossAxisSize() + i3;
                if (iM11106getMaxHeightimpl < 0) {
                    iM11106getMaxHeightimpl = 0;
                }
                arrayList2.add(flexLine2);
                FlexLine flexLine3 = new FlexLine();
                hypotheticalMainSize = resolvedFlexItemInfo.getHypotheticalMainSize() + i2;
                flexLine2 = flexLine3;
                i4 = i5;
            } else {
                hypotheticalMainSize += resolvedFlexItemInfo.getHypotheticalMainSize() + i2;
            }
        }
        if (i4 < arrayList.size()) {
            flexLine2.setStartIndex(i4);
            flexLine2.setEndIndex(arrayList.size());
            m2555processFlexLine7gjidqw(flexLine2, arrayList, resolvedFlexBoxConfig, hypotheticalMainSize - i2, z, j2, iM11106getMaxHeightimpl);
            crossAxisSize2 += flexLine2.getCrossAxisSize();
            flexLine2.setCrossStart(crossAxisSize);
            arrayList2.add(flexLine2);
        }
        lVar.invoke(Integer.valueOf(crossAxisSize2));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: calculateItemCrossPosition-sT6f14c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m2550calculateItemCrossPositionsT6f14c(androidx.compose.foundation.layout.ResolvedFlexItemInfo r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            r6 = this;
            int r6 = r7.m2795getAlignSelf_ov7Qcc$foundation_layout()
            r0 = 0
            boolean r6 = androidx.compose.foundation.layout.FlexAlignSelf.m2514equalsimpl0(r6, r0)
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r6 != 0) goto L15
            int r6 = r7.m2795getAlignSelf_ov7Qcc$foundation_layout()
            goto L3c
        L15:
            boolean r6 = androidx.compose.foundation.layout.FlexAlignItems.m2502equalsimpl0(r12, r0)
            if (r6 == 0) goto L1d
        L1b:
            r6 = r5
            goto L3c
        L1d:
            boolean r6 = androidx.compose.foundation.layout.FlexAlignItems.m2502equalsimpl0(r12, r5)
            if (r6 == 0) goto L25
            r6 = r4
            goto L3c
        L25:
            boolean r6 = androidx.compose.foundation.layout.FlexAlignItems.m2502equalsimpl0(r12, r4)
            if (r6 == 0) goto L2d
            r6 = r3
            goto L3c
        L2d:
            boolean r6 = androidx.compose.foundation.layout.FlexAlignItems.m2502equalsimpl0(r12, r3)
            if (r6 == 0) goto L35
            r6 = r2
            goto L3c
        L35:
            boolean r6 = androidx.compose.foundation.layout.FlexAlignItems.m2502equalsimpl0(r12, r2)
            if (r6 == 0) goto L1b
            r6 = r1
        L3c:
            boolean r7 = androidx.compose.foundation.layout.FlexAlignSelf.m2514equalsimpl0(r6, r5)
            if (r7 == 0) goto L43
            return r0
        L43:
            boolean r7 = androidx.compose.foundation.layout.FlexAlignSelf.m2514equalsimpl0(r6, r4)
            if (r7 == 0) goto L4b
            int r11 = r11 - r10
            return r11
        L4b:
            boolean r7 = androidx.compose.foundation.layout.FlexAlignSelf.m2514equalsimpl0(r6, r3)
            if (r7 == 0) goto L54
            int r11 = r11 - r10
            int r11 = r11 / r4
            return r11
        L54:
            boolean r7 = androidx.compose.foundation.layout.FlexAlignSelf.m2514equalsimpl0(r6, r2)
            if (r7 == 0) goto L5b
            return r0
        L5b:
            boolean r6 = androidx.compose.foundation.layout.FlexAlignSelf.m2514equalsimpl0(r6, r1)
            if (r6 == 0) goto L68
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r6) goto L66
            return r0
        L66:
            int r9 = r9 - r8
            return r9
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlexBoxMeasurePolicy.m2550calculateItemCrossPositionsT6f14c(androidx.compose.foundation.layout.ResolvedFlexItemInfo, int, int, int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void calculateLineCrossAxisSize(java.util.ArrayList<androidx.compose.foundation.layout.ResolvedFlexItemInfo> r17, androidx.compose.foundation.layout.ResolvedFlexBoxConfig r18, androidx.compose.foundation.layout.FlexLine r19, int r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r19
            int r2 = r18.m2783getDirectionT4wFHC8$foundation_layout()
            r3 = 0
            boolean r2 = androidx.compose.foundation.layout.FlexDirection.m2563equalsimpl0(r2, r3)
            r4 = 1
            if (r2 != 0) goto L1d
            int r2 = r18.m2783getDirectionT4wFHC8$foundation_layout()
            r5 = 2
            boolean r2 = androidx.compose.foundation.layout.FlexDirection.m2563equalsimpl0(r2, r5)
            if (r2 == 0) goto L1c
            goto L1d
        L1c:
            r4 = r3
        L1d:
            int r2 = r1.getStartIndex()
            int r5 = r1.getEndIndex()
            r6 = 93
            if (r2 < 0) goto Ld1
            int r7 = r0.size()
            if (r2 > r7) goto Ld1
            if (r5 < 0) goto Lc5
            int r7 = r0.size()
            if (r5 > r7) goto Lc5
            r6 = r3
            r7 = r6
            r8 = r7
        L3a:
            if (r2 >= r5) goto Lbe
            java.lang.Object r9 = r0.get(r2)
            r11 = r9
            androidx.compose.foundation.layout.ResolvedFlexItemInfo r11 = (androidx.compose.foundation.layout.ResolvedFlexItemInfo) r11
            boolean r9 = r11.getHasBaseline()
            if (r9 != 0) goto L8a
            int r9 = r18.m2781getAlignItems20X20zU$foundation_layout()
            r10 = 4
            boolean r9 = androidx.compose.foundation.layout.FlexAlignItems.m2502equalsimpl0(r9, r10)
            if (r9 == 0) goto L5f
            int r9 = r11.m2795getAlignSelf_ov7Qcc$foundation_layout()
            boolean r9 = androidx.compose.foundation.layout.FlexAlignSelf.m2514equalsimpl0(r9, r3)
            if (r9 == 0) goto L5f
            goto L8a
        L5f:
            if (r4 == 0) goto L70
            androidx.compose.ui.layout.Measurable r9 = r11.getMeasurable()
            if (r9 == 0) goto L7f
            int r10 = r11.getTargetMainSize()
            int r9 = r9.maxIntrinsicHeight(r10)
            goto L80
        L70:
            androidx.compose.ui.layout.Measurable r9 = r11.getMeasurable()
            if (r9 == 0) goto L7f
            int r10 = r11.getTargetMainSize()
            int r9 = r9.maxIntrinsicWidth(r10)
            goto L80
        L7f:
            r9 = r3
        L80:
            r11.setCrossAxisSize(r9)
            int r9 = r11.getCrossAxisSize()
            r12 = r18
            goto Lb6
        L8a:
            r13 = 0
            r14 = 0
            r10 = r16
            r12 = r18
            r15 = r20
            r10.measureItem(r11, r12, r13, r14, r15)
            androidx.compose.ui.layout.Placeable r9 = r11.getPlaceable()
            if (r9 != 0) goto L9e
            h.g.b.x.g()
        L9e:
            r12 = r18
            int r9 = r11.getBaseline(r9, r12)
            r11.setBaseline(r9)
            int r6 = java.lang.Math.max(r6, r9)
            int r10 = r11.getCrossAxisSize()
            int r10 = r10 - r9
            int r8 = java.lang.Math.max(r8, r10)
            int r9 = r6 + r8
        Lb6:
            int r7 = java.lang.Math.max(r7, r9)
            int r2 = r2 + 1
            goto L3a
        Lbe:
            r1.setMaxAboveBaseline(r6)
            r1.setCrossAxisSize(r7)
            return
        Lc5:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "toIndex ("
            java.lang.String r0 = androidx.compose.foundation.layout.a.a(r6, r0, r5, r2)
            r1.<init>(r0)
            throw r1
        Ld1:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "fromIndex ("
            java.lang.String r0 = androidx.compose.foundation.layout.a.a(r6, r0, r2, r3)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlexBoxMeasurePolicy.calculateLineCrossAxisSize(java.util.ArrayList, androidx.compose.foundation.layout.ResolvedFlexBoxConfig, androidx.compose.foundation.layout.FlexLine, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void calculateLineCrossPositions(androidx.compose.foundation.layout.ResolvedFlexBoxConfig r5, int r6, java.util.ArrayList<androidx.compose.foundation.layout.FlexLine> r7, int r8, int r9) {
        /*
            r4 = this;
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto Lb9
            int r4 = r7.size()
            r0 = 1
            if (r4 != r0) goto Lf
            goto Lb9
        Lf:
            int r4 = r7.size()
            int r4 = r4 + (-1)
            int r4 = r4 * r9
            int r6 = r6 - r8
            int r8 = r5.m2780getAlignContentd9B3MrI$foundation_layout()
            r1 = 5
            boolean r2 = androidx.compose.foundation.layout.FlexAlignContent.m2489equalsimpl0(r8, r1)
            int r6 = r6 - r4
            r4 = 0
            if (r2 == 0) goto L2b
            int r8 = r7.size()
            int r8 = r6 / r8
            goto L3c
        L2b:
            r2 = 4
            boolean r8 = androidx.compose.foundation.layout.FlexAlignContent.m2489equalsimpl0(r8, r2)
            if (r8 == 0) goto L3b
            int r8 = r7.size()
            int r8 = r8 + (-1)
            int r8 = r6 / r8
            goto L3c
        L3b:
            r8 = r4
        L3c:
            int r2 = r5.m2780getAlignContentd9B3MrI$foundation_layout()
            boolean r0 = androidx.compose.foundation.layout.FlexAlignContent.m2489equalsimpl0(r2, r0)
            r3 = 2
            if (r0 == 0) goto L53
            int r0 = r5.m2786getWrap7ziDAWk$foundation_layout()
            boolean r0 = androidx.compose.foundation.layout.FlexWrap.m2587equalsimpl0(r0, r3)
            if (r0 == 0) goto L70
        L51:
            r6 = r4
            goto L70
        L53:
            boolean r0 = androidx.compose.foundation.layout.FlexAlignContent.m2489equalsimpl0(r2, r3)
            if (r0 == 0) goto L5c
            int r6 = r6 / 2
            goto L70
        L5c:
            boolean r0 = androidx.compose.foundation.layout.FlexAlignContent.m2489equalsimpl0(r2, r1)
            if (r0 == 0) goto L65
            int r6 = r8 / 2
            goto L70
        L65:
            int r0 = r5.m2786getWrap7ziDAWk$foundation_layout()
            boolean r0 = androidx.compose.foundation.layout.FlexWrap.m2587equalsimpl0(r0, r3)
            if (r0 != 0) goto L70
            goto L51
        L70:
            int r4 = r5.m2786getWrap7ziDAWk$foundation_layout()
            boolean r4 = androidx.compose.foundation.layout.FlexWrap.m2587equalsimpl0(r4, r3)
            if (r4 == 0) goto L88
            r4 = r7
            java.util.Collection r4 = (java.util.Collection) r4
            h.k.j r4 = h.a.i.n(r4)
            h.k.h r4 = (h.k.h) r4
            h.k.h r4 = h.k.n.s(r4)
            goto L91
        L88:
            r4 = r7
            java.util.Collection r4 = (java.util.Collection) r4
            h.k.j r4 = h.a.i.n(r4)
            h.k.h r4 = (h.k.h) r4
        L91:
            int r5 = r4.a()
            int r0 = r4.b()
            int r4 = r4.c()
            if (r4 <= 0) goto La1
            if (r5 <= r0) goto La5
        La1:
            if (r4 >= 0) goto Lb9
            if (r0 > r5) goto Lb9
        La5:
            java.lang.Object r1 = r7.get(r5)
            androidx.compose.foundation.layout.FlexLine r1 = (androidx.compose.foundation.layout.FlexLine) r1
            r1.setCrossStart(r6)
            int r1 = r1.getCrossAxisSize()
            int r1 = r1 + r8
            int r1 = r1 + r9
            if (r5 == r0) goto Lb9
            int r6 = r6 + r1
            int r5 = r5 + r4
            goto La5
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlexBoxMeasurePolicy.calculateLineCrossPositions(androidx.compose.foundation.layout.ResolvedFlexBoxConfig, int, java.util.ArrayList, int, int):void");
    }

    /* renamed from: createFlexItem-XsoA538, reason: not valid java name */
    private final ResolvedFlexItemInfo m2551createFlexItemXsoA538(MeasureScope measureScope, Measurable measurable, boolean z, long j2) {
        Object parentData = measurable.getParentData();
        FlexBoxChildDataNode flexBoxChildDataNode = parentData instanceof FlexBoxChildDataNode ? (FlexBoxChildDataNode) parentData : null;
        ResolvedFlexItemInfo resolvedFlexItemInfo = new ResolvedFlexItemInfo();
        if (flexBoxChildDataNode != null) {
            resolvedFlexItemInfo.m2797prepareRMq0m1M(measureScope, j2);
            flexBoxChildDataNode.getConfig().configure(resolvedFlexItemInfo);
        }
        resolvedFlexItemInfo.setMeasurable(measurable);
        int minMainAxisSize$foundation_layout = resolvedFlexItemInfo.getMinMainAxisSize$foundation_layout(z);
        int i2 = FlexBasis.m2531isDpimpl$foundation_layout(resolvedFlexItemInfo.m2796getBasisdlZNVs$foundation_layout()) ? measureScope.mo2121roundToPx0680j_4(FlexBasis.m2528getValueimpl$foundation_layout(resolvedFlexItemInfo.m2796getBasisdlZNVs$foundation_layout())) : FlexBasis.m2532isPercentimpl$foundation_layout(resolvedFlexItemInfo.m2796getBasisdlZNVs$foundation_layout()) ? (Constraints.m11107getMaxWidthimpl(j2) == Integer.MAX_VALUE || Float.isNaN(FlexBasis.m2528getValueimpl$foundation_layout(resolvedFlexItemInfo.m2796getBasisdlZNVs$foundation_layout()))) ? resolvedFlexItemInfo.getMaxContentSize$foundation_layout(z) : (int) (Constraints.m11107getMaxWidthimpl(j2) * FlexBasis.m2528getValueimpl$foundation_layout(resolvedFlexItemInfo.m2796getBasisdlZNVs$foundation_layout())) : FlexBasis.m2530isAutoimpl$foundation_layout(resolvedFlexItemInfo.m2796getBasisdlZNVs$foundation_layout()) ? resolvedFlexItemInfo.getMaxContentSize$foundation_layout(z) : resolvedFlexItemInfo.getMaxContentSize$foundation_layout(z);
        resolvedFlexItemInfo.setFlexBaseSize(i2);
        if (i2 >= minMainAxisSize$foundation_layout) {
            minMainAxisSize$foundation_layout = i2;
        }
        resolvedFlexItemInfo.setHypotheticalMainSize(minMainAxisSize$foundation_layout);
        resolvedFlexItemInfo.setTargetMainSize(resolvedFlexItemInfo.getHypotheticalMainSize());
        return resolvedFlexItemInfo;
    }

    private final boolean isMainAxisReversedForLayout(ResolvedFlexBoxConfig resolvedFlexBoxConfig, LayoutDirection layoutDirection) {
        boolean z = FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfig.m2783getDirectionT4wFHC8$foundation_layout(), 2) || FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfig.m2783getDirectionT4wFHC8$foundation_layout(), 3);
        return ((FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfig.m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfig.m2783getDirectionT4wFHC8$foundation_layout(), 2)) && layoutDirection == LayoutDirection.Rtl) ? !z : z;
    }

    /* renamed from: measureFlexBox-w1Onq5I, reason: not valid java name */
    private final MeasureResult m2552measureFlexBoxw1Onq5I(final MeasureScope measureScope, final ResolvedFlexBoxConfig resolvedFlexBoxConfig, List<? extends Measurable> list, long j2, final boolean z) {
        int i2;
        ArrayList<ResolvedFlexItemInfo> arrayList;
        boolean z2;
        int i3;
        FlexLine flexLine;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        ArrayList<ResolvedFlexItemInfo> arrayList2;
        int i8;
        FlexBoxMeasurePolicy flexBoxMeasurePolicy = this;
        ArrayList<ResolvedFlexItemInfo> arrayList3 = new ArrayList<>(list.size());
        long j3 = j2;
        boolean zM2554needUpfrontCrossAxisCalculationRMq0m1M = flexBoxMeasurePolicy.m2554needUpfrontCrossAxisCalculationRMq0m1M(resolvedFlexBoxConfig, j3);
        int size = list.size();
        boolean z4 = zM2554needUpfrontCrossAxisCalculationRMq0m1M;
        int i9 = 0;
        boolean z5 = false;
        while (true) {
            i2 = 1;
            if (i9 >= size) {
                break;
            }
            ResolvedFlexItemInfo resolvedFlexItemInfoM2551createFlexItemXsoA538 = flexBoxMeasurePolicy.m2551createFlexItemXsoA538(measureScope, list.get(i9), z, j3);
            z5 |= !(resolvedFlexItemInfoM2551createFlexItemXsoA538.getOrder$foundation_layout() == 0);
            if (FlexAlignSelf.m2514equalsimpl0(resolvedFlexItemInfoM2551createFlexItemXsoA538.m2795getAlignSelf_ov7Qcc$foundation_layout(), 5) || FlexAlignSelf.m2514equalsimpl0(resolvedFlexItemInfoM2551createFlexItemXsoA538.m2795getAlignSelf_ov7Qcc$foundation_layout(), 4)) {
                z4 = true;
            }
            arrayList3.add(resolvedFlexItemInfoM2551createFlexItemXsoA538);
            i9++;
            flexBoxMeasurePolicy = this;
            j3 = j2;
        }
        if (z5) {
            ArrayList<ResolvedFlexItemInfo> arrayList4 = arrayList3;
            if (arrayList4.size() > 1) {
                i.t(arrayList4, new Comparator() { // from class: androidx.compose.foundation.layout.FlexBoxMeasurePolicy$measureFlexBox-w1Onq5I$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return h.b.a.a(Integer.valueOf(((ResolvedFlexItemInfo) t).getOrder$foundation_layout()), Integer.valueOf(((ResolvedFlexItemInfo) t2).getOrder$foundation_layout()));
                    }
                });
            }
        }
        final int iMainAxisGap = resolvedFlexBoxConfig.mainAxisGap();
        int iCrossAxisGap = resolvedFlexBoxConfig.crossAxisGap();
        final ArrayList<FlexLine> arrayList5 = new ArrayList<>(8);
        FlexLine flexLine2 = new FlexLine();
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        ArrayList<ResolvedFlexItemInfo> arrayList6 = arrayList3;
        int size2 = arrayList6.size();
        int i10 = iM11106getMaxHeightimpl;
        int i11 = 0;
        int hypotheticalMainSize = 0;
        int i12 = 0;
        int crossAxisSize = 0;
        FlexLine flexLine3 = flexLine2;
        int i13 = 0;
        while (i13 < size2) {
            ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList6.get(i13);
            if ((FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 2)) && i13 > i11 && resolvedFlexItemInfo.getHypotheticalMainSize() + hypotheticalMainSize > Constraints.m11107getMaxWidthimpl(j2)) {
                flexLine3.setStartIndex(i11);
                flexLine3.setEndIndex(i13);
                boolean z6 = z4;
                int i14 = i12;
                z3 = z6;
                i6 = i13;
                i7 = size2;
                arrayList2 = arrayList3;
                m2555processFlexLine7gjidqw(flexLine3, arrayList2, resolvedFlexBoxConfig, hypotheticalMainSize - iMainAxisGap, z3, j2, i10);
                crossAxisSize += flexLine3.getCrossAxisSize();
                flexLine3.setCrossStart(i14);
                int crossAxisSize2 = flexLine3.getCrossAxisSize() + iCrossAxisGap + i14;
                int crossAxisSize3 = i10 - (flexLine3.getCrossAxisSize() + iCrossAxisGap);
                if (crossAxisSize3 < 0) {
                    crossAxisSize3 = 0;
                }
                arrayList5.add(flexLine3);
                flexLine3 = new FlexLine();
                hypotheticalMainSize = resolvedFlexItemInfo.getHypotheticalMainSize() + iMainAxisGap;
                i8 = crossAxisSize2;
                i10 = crossAxisSize3;
                i11 = i6;
            } else {
                boolean z7 = z4;
                i8 = i12;
                z3 = z7;
                i6 = i13;
                i7 = size2;
                arrayList2 = arrayList3;
                hypotheticalMainSize += resolvedFlexItemInfo.getHypotheticalMainSize() + iMainAxisGap;
            }
            i13 = i6 + 1;
            int i15 = i8;
            z4 = z3;
            i12 = i15;
            arrayList3 = arrayList2;
            size2 = i7;
        }
        boolean z8 = z4;
        int i16 = i12;
        ArrayList<ResolvedFlexItemInfo> arrayList7 = arrayList3;
        if (i11 < arrayList7.size()) {
            flexLine3.setStartIndex(i11);
            flexLine3.setEndIndex(arrayList7.size());
            i3 = 2;
            m2555processFlexLine7gjidqw(flexLine3, arrayList7, resolvedFlexBoxConfig, hypotheticalMainSize - iMainAxisGap, z8, j2, i10);
            arrayList = arrayList7;
            z2 = z8;
            crossAxisSize += flexLine3.getCrossAxisSize();
            flexLine3.setCrossStart(i16);
            arrayList5.add(flexLine3);
        } else {
            arrayList = arrayList7;
            z2 = z8;
            i3 = 2;
        }
        int i17 = crossAxisSize;
        if (arrayList5.size() == 1) {
            arrayList5.get(0).setCrossAxisSize(Math.max(arrayList5.get(0).getCrossAxisSize(), Constraints.m11108getMinHeightimpl(j2)));
        }
        final ArrayList<ResolvedFlexItemInfo> arrayList8 = arrayList;
        int iM2553measureFlexItemsHjG58DU = m2553measureFlexItemsHjG58DU(arrayList5, arrayList8, resolvedFlexBoxConfig, m2548applyAlignContentStretchWWvErGg(resolvedFlexBoxConfig, arrayList5, j2, i17, iCrossAxisGap), z2, j2);
        calculateLineCrossPositions(resolvedFlexBoxConfig, Math.max(iM2553measureFlexItemsHjG58DU, Constraints.m11108getMinHeightimpl(j2)), arrayList5, iM2553measureFlexItemsHjG58DU, iCrossAxisGap);
        int iMax = Math.max(totalCrossAxisSize(arrayList5, FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), i3)), Constraints.m11108getMinHeightimpl(j2));
        ArrayList<FlexLine> arrayList9 = arrayList5;
        if (arrayList9.isEmpty()) {
            flexLine = null;
        } else {
            flexLine = arrayList9.get(0);
            int mainAxisSize = flexLine.getMainAxisSize();
            x.f(arrayList9, "<this>");
            int size3 = arrayList9.size() - 1;
            if (size3 > 0) {
                while (true) {
                    FlexLine flexLine4 = arrayList9.get(i2);
                    int mainAxisSize2 = flexLine4.getMainAxisSize();
                    int i18 = mainAxisSize < mainAxisSize2 ? mainAxisSize2 : mainAxisSize;
                    if (mainAxisSize < mainAxisSize2) {
                        flexLine = flexLine4;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                    mainAxisSize = i18;
                }
            }
        }
        FlexLine flexLine5 = flexLine;
        int mainAxisSize3 = flexLine5 != null ? flexLine5.getMainAxisSize() : Constraints.m11109getMinWidthimpl(j2);
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        int iM11109getMinWidthimpl2 = Constraints.m11109getMinWidthimpl(j2);
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int iMax2 = Math.max(mainAxisSize3, iM11109getMinWidthimpl);
        if (iMax2 >= iM11109getMinWidthimpl2) {
            iM11109getMinWidthimpl2 = iMax2;
        }
        if (iM11109getMinWidthimpl2 <= iM11107getMaxWidthimpl) {
            iM11107getMaxWidthimpl = iM11109getMinWidthimpl2;
        }
        if (z) {
            int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
            int iM11106getMaxHeightimpl2 = Constraints.m11106getMaxHeightimpl(j2);
            if (iMax < iM11108getMinHeightimpl) {
                iMax = iM11108getMinHeightimpl;
            }
            i5 = iMax > iM11106getMaxHeightimpl2 ? iM11106getMaxHeightimpl2 : iMax;
            i4 = iM11107getMaxWidthimpl;
        } else {
            int iM11108getMinHeightimpl2 = Constraints.m11108getMinHeightimpl(j2);
            int iM11106getMaxHeightimpl3 = Constraints.m11106getMaxHeightimpl(j2);
            if (iMax < iM11108getMinHeightimpl2) {
                iMax = iM11108getMinHeightimpl2;
            }
            if (iMax <= iM11106getMaxHeightimpl3) {
                iM11106getMaxHeightimpl3 = iMax;
            }
            i4 = iM11106getMaxHeightimpl3;
            i5 = iM11107getMaxWidthimpl;
        }
        final int i19 = i4;
        final int i20 = i5;
        return MeasureScope.CC.layout$default(measureScope, i4, i5, null, new l() { // from class: androidx.compose.foundation.layout.FlexBoxMeasurePolicy$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FlexBoxMeasurePolicy.measureFlexBox_w1Onq5I$lambda$4(this.f$0, arrayList5, arrayList8, measureScope, resolvedFlexBoxConfig, i19, i20, iMainAxisGap, z, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final ab measureFlexBox_w1Onq5I$lambda$4(FlexBoxMeasurePolicy flexBoxMeasurePolicy, ArrayList arrayList, ArrayList arrayList2, MeasureScope measureScope, ResolvedFlexBoxConfig resolvedFlexBoxConfig, int i2, int i3, int i4, boolean z, Placeable.PlacementScope placementScope) {
        flexBoxMeasurePolicy.placeFlexItems(placementScope, arrayList, arrayList2, measureScope.getLayoutDirection(), resolvedFlexBoxConfig, i2, i3, i4, z);
        return ab.f48028a;
    }

    /* renamed from: measureFlexItems-HjG58DU, reason: not valid java name */
    private final int m2553measureFlexItemsHjG58DU(ArrayList<FlexLine> arrayList, ArrayList<ResolvedFlexItemInfo> arrayList2, ResolvedFlexBoxConfig resolvedFlexBoxConfig, int i2, boolean z, long j2) {
        int iMax;
        int i3;
        int i4;
        ArrayList<FlexLine> arrayList3 = arrayList;
        int size = arrayList3.size();
        int i5 = 0;
        int i6 = i2;
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        int i7 = 0;
        while (i7 < size) {
            FlexLine flexLine = arrayList3.get(i7);
            if (z) {
                iMax = flexLine.getCrossAxisSize();
                i3 = 1;
            } else {
                iMax = i5;
                i3 = iMax;
            }
            int startIndex = flexLine.getStartIndex();
            int endIndex = flexLine.getEndIndex();
            if (startIndex < 0 || startIndex > arrayList2.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList2, startIndex, "fromIndex ("));
            }
            if (endIndex < 0 || endIndex > arrayList2.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList2, endIndex, "toIndex ("));
            }
            while (startIndex < endIndex) {
                ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList2.get(startIndex);
                if (resolvedFlexItemInfo.getPlaceable() != null) {
                    if (i3 == 0) {
                        iMax = Math.max(iMax, resolvedFlexItemInfo.getCrossAxisSize());
                    }
                    i4 = startIndex;
                } else {
                    boolean z2 = (FlexAlignSelf.m2514equalsimpl0(resolvedFlexItemInfo.m2795getAlignSelf_ov7Qcc$foundation_layout(), 4) || (FlexAlignSelf.m2514equalsimpl0(resolvedFlexItemInfo.m2795getAlignSelf_ov7Qcc$foundation_layout(), i5) && (FlexAlignItems.m2502equalsimpl0(resolvedFlexBoxConfig.m2781getAlignItems20X20zU$foundation_layout(), 3) || FlexAlignContent.m2489equalsimpl0(resolvedFlexBoxConfig.m2780getAlignContentd9B3MrI$foundation_layout(), 3)))) ? true : i5;
                    int crossAxisSize = z2 ? flexLine.getCrossAxisSize() : i5;
                    int i8 = iMax;
                    i4 = startIndex;
                    iMax = i3 == 0 ? Math.max(i8, measureItem(resolvedFlexItemInfo, resolvedFlexBoxConfig, crossAxisSize, z2, iM11106getMaxHeightimpl)) : i8;
                    if (arrayList.size() == 1) {
                        iMax = Math.max(iMax, Constraints.m11108getMinHeightimpl(j2));
                    }
                }
                startIndex = i4 + 1;
                i5 = 0;
            }
            int i9 = iMax;
            if (i3 == 0) {
                flexLine.setCrossAxisSize(i9);
                i6 += i9;
            }
            iM11106getMaxHeightimpl = (iM11106getMaxHeightimpl - flexLine.getCrossAxisSize()) - resolvedFlexBoxConfig.crossAxisGap();
            if (iM11106getMaxHeightimpl < 0) {
                iM11106getMaxHeightimpl = 0;
            }
            i7++;
            i5 = 0;
        }
        return z ? i2 : i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int measureItem(androidx.compose.foundation.layout.ResolvedFlexItemInfo r3, androidx.compose.foundation.layout.ResolvedFlexBoxConfig r4, int r5, boolean r6, int r7) {
        /*
            r2 = this;
            int r2 = r4.m2783getDirectionT4wFHC8$foundation_layout()
            r0 = 0
            boolean r2 = androidx.compose.foundation.layout.FlexDirection.m2563equalsimpl0(r2, r0)
            r1 = 1
            if (r2 != 0) goto L1a
            int r2 = r4.m2783getDirectionT4wFHC8$foundation_layout()
            r4 = 2
            boolean r2 = androidx.compose.foundation.layout.FlexDirection.m2563equalsimpl0(r2, r4)
            if (r2 == 0) goto L18
            goto L1a
        L18:
            r2 = r0
            goto L1b
        L1a:
            r2 = r1
        L1b:
            if (r6 == 0) goto L3e
            if (r5 <= 0) goto L3e
            androidx.compose.ui.unit.Constraints$Companion r4 = androidx.compose.ui.unit.Constraints.Companion
            if (r2 == 0) goto L28
            int r2 = r3.getTargetMainSize()
            goto L2e
        L28:
            if (r5 <= r7) goto L2c
            r2 = r7
            goto L2d
        L2c:
            r2 = r5
        L2d:
            r1 = r0
        L2e:
            if (r1 == 0) goto L35
            if (r5 > r7) goto L33
            goto L39
        L33:
            r5 = r7
            goto L39
        L35:
            int r5 = r3.getTargetMainSize()
        L39:
            long r4 = r4.m11117fixedJhjzzOo(r2, r5)
            goto L5e
        L3e:
            if (r2 == 0) goto L4f
            androidx.compose.ui.unit.Constraints$Companion r2 = androidx.compose.ui.unit.Constraints.Companion
            int r4 = r3.getTargetMainSize()
            int r5 = r3.getTargetMainSize()
            long r4 = r2.m11116fitPrioritizingWidthZbe2FdA(r4, r5, r0, r7)
            goto L5e
        L4f:
            androidx.compose.ui.unit.Constraints$Companion r2 = androidx.compose.ui.unit.Constraints.Companion
            int r4 = r3.getTargetMainSize()
            int r5 = r3.getTargetMainSize()
            long r4 = r2.m11115fitPrioritizingHeightZbe2FdA(r0, r7, r4, r5)
            r1 = r0
        L5e:
            androidx.compose.ui.layout.Measurable r2 = r3.getMeasurable()
            if (r2 == 0) goto L69
            androidx.compose.ui.layout.Placeable r2 = r2.mo9741measureBRTryo0(r4)
            goto L6a
        L69:
            r2 = 0
        L6a:
            r3.setPlaceable(r2)
            if (r1 == 0) goto L7a
            androidx.compose.ui.layout.Placeable r2 = r3.getPlaceable()
            if (r2 == 0) goto L85
            int r2 = r2.getHeight()
            goto L86
        L7a:
            androidx.compose.ui.layout.Placeable r2 = r3.getPlaceable()
            if (r2 == 0) goto L85
            int r2 = r2.getWidth()
            goto L86
        L85:
            r2 = r0
        L86:
            r3.setCrossAxisSize(r2)
            if (r1 == 0) goto L96
            androidx.compose.ui.layout.Placeable r2 = r3.getPlaceable()
            if (r2 == 0) goto La0
            int r0 = r2.getWidth()
            goto La0
        L96:
            androidx.compose.ui.layout.Placeable r2 = r3.getPlaceable()
            if (r2 == 0) goto La0
            int r0 = r2.getHeight()
        La0:
            r3.setMainAxisSize(r0)
            int r2 = r3.getCrossAxisSize()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlexBoxMeasurePolicy.measureItem(androidx.compose.foundation.layout.ResolvedFlexItemInfo, androidx.compose.foundation.layout.ResolvedFlexBoxConfig, int, boolean, int):int");
    }

    /* renamed from: needUpfrontCrossAxisCalculation-RMq0m1M, reason: not valid java name */
    private final boolean m2554needUpfrontCrossAxisCalculationRMq0m1M(ResolvedFlexBoxConfig resolvedFlexBoxConfig, long j2) {
        if (FlexAlignItems.m2502equalsimpl0(resolvedFlexBoxConfig.m2781getAlignItems20X20zU$foundation_layout(), 3) || FlexAlignItems.m2502equalsimpl0(resolvedFlexBoxConfig.m2781getAlignItems20X20zU$foundation_layout(), 4)) {
            return true;
        }
        return (FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 2)) && FlexAlignContent.m2489equalsimpl0(resolvedFlexBoxConfig.m2780getAlignContentd9B3MrI$foundation_layout(), 3) && Constraints.m11106getMaxHeightimpl(j2) != Integer.MAX_VALUE;
    }

    private final void placeFlexItems(Placeable.PlacementScope placementScope, ArrayList<FlexLine> arrayList, ArrayList<ResolvedFlexItemInfo> arrayList2, LayoutDirection layoutDirection, ResolvedFlexBoxConfig resolvedFlexBoxConfig, int i2, int i3, int i4, boolean z) {
        ArrayList<FlexLine> arrayList3 = arrayList;
        int size = arrayList3.size();
        for (int i5 = 0; i5 < size; i5++) {
            FlexLine flexLine = arrayList3.get(i5);
            positionItemsOnMainAxis(arrayList2, resolvedFlexBoxConfig, true != z ? i3 : i2, flexLine, i4, isMainAxisReversedForLayout(resolvedFlexBoxConfig, layoutDirection));
            int startIndex = flexLine.getStartIndex();
            int endIndex = flexLine.getEndIndex();
            if (startIndex < 0 || startIndex > arrayList2.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList2, startIndex, "fromIndex ("));
            }
            if (endIndex < 0 || endIndex > arrayList2.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList2, endIndex, "toIndex ("));
            }
            while (startIndex < endIndex) {
                ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList2.get(startIndex);
                int mainPosition = z ? resolvedFlexItemInfo.getMainPosition() : resolvedFlexItemInfo.getCrossPosition();
                int crossPosition = z ? resolvedFlexItemInfo.getCrossPosition() : resolvedFlexItemInfo.getMainPosition();
                Placeable placeable = resolvedFlexItemInfo.getPlaceable();
                if (placeable != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, mainPosition, crossPosition, 0.0f, 4, null);
                }
                startIndex++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void positionItemsOnMainAxis(java.util.ArrayList<androidx.compose.foundation.layout.ResolvedFlexItemInfo> r16, androidx.compose.foundation.layout.ResolvedFlexBoxConfig r17, int r18, androidx.compose.foundation.layout.FlexLine r19, int r20, boolean r21) {
        /*
            r15 = this;
            int r0 = r19.getEndIndex()
            int r1 = r19.getStartIndex()
            int r0 = r0 - r1
            if (r0 != 0) goto Ld
            goto Lde
        Ld:
            int r1 = r19.getMainAxisSize()
            int r1 = r18 - r1
            int r2 = r17.m2784getJustifyContentGomtQF4$foundation_layout()
            r3 = 4
            boolean r4 = androidx.compose.foundation.layout.FlexJustifyContent.m2574equalsimpl0(r2, r3)
            r5 = 5
            r6 = -1
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L25
            int r0 = r1 / r0
            goto L3d
        L25:
            r4 = 3
            boolean r4 = androidx.compose.foundation.layout.FlexJustifyContent.m2574equalsimpl0(r2, r4)
            if (r4 == 0) goto L32
            if (r0 <= r7) goto L3c
            int r0 = r0 + r6
            int r0 = r1 / r0
            goto L3d
        L32:
            boolean r2 = androidx.compose.foundation.layout.FlexJustifyContent.m2574equalsimpl0(r2, r5)
            if (r2 == 0) goto L3c
            int r0 = r0 + r7
            int r0 = r1 / r0
            goto L3d
        L3c:
            r0 = r8
        L3d:
            int r2 = r17.m2784getJustifyContentGomtQF4$foundation_layout()
            boolean r4 = androidx.compose.foundation.layout.FlexJustifyContent.m2574equalsimpl0(r2, r7)
            if (r4 == 0) goto L4d
            if (r21 == 0) goto L4b
            r1 = r8
            goto L71
        L4b:
            r7 = r8
            goto L71
        L4d:
            r4 = 2
            boolean r4 = androidx.compose.foundation.layout.FlexJustifyContent.m2574equalsimpl0(r2, r4)
            if (r4 == 0) goto L59
            int r1 = r1 / 2
        L56:
            r7 = r21
            goto L71
        L59:
            boolean r3 = androidx.compose.foundation.layout.FlexJustifyContent.m2574equalsimpl0(r2, r3)
            if (r3 == 0) goto L62
            int r1 = r0 / 2
            goto L56
        L62:
            boolean r2 = androidx.compose.foundation.layout.FlexJustifyContent.m2574equalsimpl0(r2, r5)
            if (r2 == 0) goto L6c
            r7 = r21
            r1 = r0
            goto L71
        L6c:
            if (r21 == 0) goto L6f
            goto L71
        L6f:
            r1 = r8
            r7 = r1
        L71:
            if (r7 == 0) goto L82
            int r2 = r19.getEndIndex()
            int r2 = r2 + r6
            int r3 = r19.getStartIndex()
            h.k.h r4 = new h.k.h
            r4.<init>(r2, r3, r6)
            goto L91
        L82:
            int r2 = r19.getStartIndex()
            int r3 = r19.getEndIndex()
            h.k.j r2 = h.k.n.u(r2, r3)
            r4 = r2
            h.k.h r4 = (h.k.h) r4
        L91:
            int r2 = r4.a()
            int r3 = r4.b()
            int r4 = r4.c()
            if (r4 <= 0) goto La1
            if (r2 <= r3) goto La5
        La1:
            if (r4 >= 0) goto Lde
            if (r3 > r2) goto Lde
        La5:
            r5 = r16
        La7:
            java.lang.Object r6 = r5.get(r2)
            r8 = r6
            androidx.compose.foundation.layout.ResolvedFlexItemInfo r8 = (androidx.compose.foundation.layout.ResolvedFlexItemInfo) r8
            r8.setMainPosition(r1)
            int r6 = r8.getTargetMainSize()
            int r6 = r6 + r0
            int r6 = r6 + r20
            int r11 = r8.getCrossAxisSize()
            int r14 = r19.getCrossStart()
            int r9 = r8.getBaseline()
            int r10 = r19.getMaxAboveBaseline()
            int r12 = r19.getCrossAxisSize()
            int r13 = r17.m2781getAlignItems20X20zU$foundation_layout()
            r7 = r15
            int r9 = r7.m2550calculateItemCrossPositionsT6f14c(r8, r9, r10, r11, r12, r13)
            int r14 = r14 + r9
            r8.setCrossPosition(r14)
            if (r2 == r3) goto Lde
            int r1 = r1 + r6
            int r2 = r2 + r4
            goto La7
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlexBoxMeasurePolicy.positionItemsOnMainAxis(java.util.ArrayList, androidx.compose.foundation.layout.ResolvedFlexBoxConfig, int, androidx.compose.foundation.layout.FlexLine, int, boolean):void");
    }

    /* renamed from: processFlexLine-7gjidqw, reason: not valid java name */
    private final void m2555processFlexLine7gjidqw(FlexLine flexLine, ArrayList<ResolvedFlexItemInfo> arrayList, ResolvedFlexBoxConfig resolvedFlexBoxConfig, int i2, boolean z, long j2, int i3) {
        flexLine.setMainAxisSize(resolveFlexibleLengths(FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfig.m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfig.m2783getDirectionT4wFHC8$foundation_layout(), 2), arrayList, resolvedFlexBoxConfig, flexLine.getStartIndex(), flexLine.getEndIndex(), i2, Constraints.m11107getMaxWidthimpl(j2)));
        if (z) {
            calculateLineCrossAxisSize(arrayList, resolvedFlexBoxConfig, flexLine, i3);
        }
    }

    /* renamed from: resolveFlexBoxConfig-3p2s80s, reason: not valid java name */
    private final ResolvedFlexBoxConfig m2556resolveFlexBoxConfig3p2s80s(FlexBoxConfig flexBoxConfig, Density density, long j2) {
        this.resolvedFlexBoxConfig.m2787prepare0kLqBqw(density, j2);
        flexBoxConfig.configure(this.resolvedFlexBoxConfig);
        return this.resolvedFlexBoxConfig;
    }

    private final int resolveFlexibleLengths(boolean z, ArrayList<ResolvedFlexItemInfo> arrayList, ResolvedFlexBoxConfig resolvedFlexBoxConfig, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        float shrink$foundation_layout;
        boolean z2;
        int i10 = i2;
        int i11 = i5;
        int i12 = i3 - i10;
        int iMainAxisGap = i12 > 0 ? (i12 - 1) * resolvedFlexBoxConfig.mainAxisGap() : 0;
        if (i11 == Integer.MAX_VALUE) {
            if (i10 < 0 || i10 > arrayList.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i10, "fromIndex ("));
            }
            if (i3 < 0 || i3 > arrayList.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i3, "toIndex ("));
            }
            while (i10 < i3) {
                ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList.get(i10);
                resolvedFlexItemInfo.setTargetMainSize(resolvedFlexItemInfo.getHypotheticalMainSize());
                iMainAxisGap += resolvedFlexItemInfo.getTargetMainSize();
                i10++;
            }
            return iMainAxisGap;
        }
        if (i10 < 0 || i10 > arrayList.size()) {
            throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i10, "fromIndex ("));
        }
        if (i3 < 0 || i3 > arrayList.size()) {
            throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i3, "toIndex ("));
        }
        int targetMainSize = 0;
        int flexBaseSize = 0;
        float f2 = 0.0f;
        int i13 = 0;
        float grow$foundation_layout = 0.0f;
        float shrink$foundation_layout2 = 0.0f;
        for (int i14 = i10; i14 < i3; i14++) {
            ResolvedFlexItemInfo resolvedFlexItemInfo2 = arrayList.get(i14);
            if (i4 < i11) {
                shrink$foundation_layout = resolvedFlexItemInfo2.getGrow$foundation_layout();
                z2 = true;
            } else {
                shrink$foundation_layout = resolvedFlexItemInfo2.getShrink$foundation_layout();
                z2 = false;
            }
            if (shrink$foundation_layout != 0.0f && (z2 || resolvedFlexItemInfo2.getFlexBaseSize() >= resolvedFlexItemInfo2.getHypotheticalMainSize())) {
                resolvedFlexItemInfo2.setFrozen(false);
                i13++;
                flexBaseSize += resolvedFlexItemInfo2.getFlexBaseSize();
                f2 += shrink$foundation_layout;
                if (z2) {
                    grow$foundation_layout += resolvedFlexItemInfo2.getGrow$foundation_layout();
                } else {
                    shrink$foundation_layout2 += resolvedFlexItemInfo2.getShrink$foundation_layout() * resolvedFlexItemInfo2.getFlexBaseSize();
                }
            } else {
                resolvedFlexItemInfo2.setTargetMainSize(resolvedFlexItemInfo2.getHypotheticalMainSize());
                resolvedFlexItemInfo2.setFrozen(true);
                targetMainSize += resolvedFlexItemInfo2.getTargetMainSize();
            }
        }
        int targetMainSize2 = 0;
        float f3 = ((i11 - iMainAxisGap) - targetMainSize) - flexBaseSize;
        float f4 = 1.0f;
        if (i4 < i11) {
            float f5 = i11 - ((iMainAxisGap + targetMainSize) + flexBaseSize);
            if (f2 < 1.0f) {
                float f6 = f3 * f2;
                if (Math.abs(f6) < Math.abs(f5)) {
                    f5 = f6;
                }
            }
            if (i10 > arrayList.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i10, "fromIndex ("));
            }
            if (i3 > arrayList.size()) {
                throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i3, "toIndex ("));
            }
            while (i10 < i3) {
                ResolvedFlexItemInfo resolvedFlexItemInfo3 = arrayList.get(i10);
                if (!resolvedFlexItemInfo3.isFrozen()) {
                    int iRound = Math.round((grow$foundation_layout > 0.0f ? resolvedFlexItemInfo3.getGrow$foundation_layout() / grow$foundation_layout : 0.0f) * f5);
                    f5 -= iRound;
                    grow$foundation_layout -= resolvedFlexItemInfo3.getGrow$foundation_layout();
                    resolvedFlexItemInfo3.setTargetMainSize(resolvedFlexItemInfo3.getFlexBaseSize() + iRound);
                    targetMainSize2 += resolvedFlexItemInfo3.getTargetMainSize();
                }
                i10++;
            }
            i6 = iMainAxisGap;
        } else {
            int i15 = 0;
            boolean z3 = true;
            while (z3 && targetMainSize2 < i12) {
                targetMainSize2++;
                if (i13 == 0) {
                    i6 = iMainAxisGap;
                    targetMainSize2 = 0;
                    break;
                }
                float f7 = i11 - ((iMainAxisGap + targetMainSize) + flexBaseSize);
                if (f2 < f4) {
                    float f8 = f3 * f2;
                    if (Math.abs(f8) < Math.abs(f7)) {
                        f7 = f8;
                    }
                }
                float fAbs = Math.abs(f7);
                if (i10 > arrayList.size()) {
                    throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i10, "fromIndex ("));
                }
                if (i3 > arrayList.size()) {
                    throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i3, "toIndex ("));
                }
                int i16 = i10;
                float flexBaseSize2 = fAbs;
                int i17 = i13;
                float f9 = shrink$foundation_layout2;
                z3 = false;
                float shrink$foundation_layout3 = f2;
                int flexBaseSize3 = flexBaseSize;
                int i18 = targetMainSize;
                int targetMainSize3 = 0;
                while (i16 < i3) {
                    boolean z4 = z3;
                    ResolvedFlexItemInfo resolvedFlexItemInfo4 = arrayList.get(i16);
                    if (resolvedFlexItemInfo4.isFrozen()) {
                        i7 = i12;
                        i8 = targetMainSize2;
                        i9 = iMainAxisGap;
                        z3 = z4;
                    } else {
                        float shrink$foundation_layout4 = resolvedFlexItemInfo4.getShrink$foundation_layout() * resolvedFlexItemInfo4.getFlexBaseSize();
                        float f10 = f9 - shrink$foundation_layout4;
                        int iRound2 = Math.round((f9 > 0.0f ? shrink$foundation_layout4 / f9 : 0.0f) * flexBaseSize2);
                        i7 = i12;
                        int flexBaseSize4 = resolvedFlexItemInfo4.getFlexBaseSize() - iRound2;
                        i8 = targetMainSize2;
                        i9 = iMainAxisGap;
                        int minMainAxisSize$foundation_layout = resolvedFlexItemInfo4.getMinMainAxisSize$foundation_layout(z);
                        if (flexBaseSize4 < minMainAxisSize$foundation_layout) {
                            resolvedFlexItemInfo4.setFrozen(true);
                            flexBaseSize2 -= resolvedFlexItemInfo4.getFlexBaseSize() - minMainAxisSize$foundation_layout;
                            resolvedFlexItemInfo4.setTargetMainSize(minMainAxisSize$foundation_layout);
                            i17--;
                            i18 += minMainAxisSize$foundation_layout;
                            flexBaseSize3 -= resolvedFlexItemInfo4.getFlexBaseSize();
                            shrink$foundation_layout2 -= shrink$foundation_layout4;
                            shrink$foundation_layout3 -= resolvedFlexItemInfo4.getShrink$foundation_layout();
                            z3 = true;
                        } else {
                            flexBaseSize2 -= iRound2;
                            resolvedFlexItemInfo4.setTargetMainSize(flexBaseSize4);
                            targetMainSize3 += resolvedFlexItemInfo4.getTargetMainSize();
                            z3 = z4;
                        }
                        f9 = f10;
                    }
                    i16++;
                    i12 = i7;
                    targetMainSize2 = i8;
                    iMainAxisGap = i9;
                }
                i11 = i5;
                i15 = targetMainSize3;
                targetMainSize = i18;
                flexBaseSize = flexBaseSize3;
                f2 = shrink$foundation_layout3;
                i13 = i17;
                f4 = 1.0f;
            }
            i6 = iMainAxisGap;
            targetMainSize2 = i15;
        }
        return i6 + targetMainSize + targetMainSize2;
    }

    private final int totalCrossAxisSize(ArrayList<FlexLine> arrayList, boolean z) {
        int size = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (!z) {
            ArrayList<FlexLine> arrayList2 = arrayList;
            x.f(arrayList2, "<this>");
            size = arrayList2.size() - 1;
        }
        return arrayList.get(size).getCrossStart() + arrayList.get(size).getCrossAxisSize();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        ResolvedFlexBoxConfig resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s = m2556resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        if (!FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 0) && !FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 2)) {
            if (list.isEmpty()) {
                return 0;
            }
            int iMainAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
            if (FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) {
                int size = list.size();
                int iMax = 0;
                while (i < size) {
                    iMax = Math.max(iMax, list.get(i).maxIntrinsicHeight(i2));
                    i++;
                }
                return iMax;
            }
            int size2 = list.size();
            int iMaxIntrinsicHeight = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                iMaxIntrinsicHeight += list.get(i3).maxIntrinsicHeight(i2);
            }
            int size3 = list.size() - 1;
            return iMaxIntrinsicHeight + ((size3 >= 0 ? size3 : 0) * iMainAxisGap);
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iMainAxisGap2 = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int iCrossAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.crossAxisGap();
        int size4 = list.size();
        int i4 = 0;
        int iMax2 = 0;
        int i5 = 0;
        while (i < size4) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i);
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
            int i6 = iMaxIntrinsicWidth + iMainAxisGap2;
            int iMaxIntrinsicHeight2 = intrinsicMeasurable.maxIntrinsicHeight(iMaxIntrinsicWidth);
            if ((FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) && i5 != 0 && iMaxIntrinsicWidth + i5 > i2) {
                i4 += iMax2 + iCrossAxisGap;
                iMax2 = iMaxIntrinsicHeight2;
                i5 = i6;
            } else {
                iMax2 = Math.max(iMax2, iMaxIntrinsicHeight2);
                i5 += i6;
            }
            i++;
        }
        return i4 + iMax2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        ResolvedFlexBoxConfig resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s = m2556resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        if (FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 2)) {
            if (list.isEmpty()) {
                return 0;
            }
            int iMainAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
            if (FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) {
                int size = list.size();
                int iMax = 0;
                while (i < size) {
                    iMax = Math.max(iMax, list.get(i).maxIntrinsicWidth(i2));
                    i++;
                }
                return iMax;
            }
            int size2 = list.size();
            int iMaxIntrinsicWidth = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                iMaxIntrinsicWidth += list.get(i3).maxIntrinsicWidth(i2);
            }
            int size3 = list.size() - 1;
            return iMaxIntrinsicWidth + ((size3 >= 0 ? size3 : 0) * iMainAxisGap);
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iMainAxisGap2 = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int iCrossAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.crossAxisGap();
        int size4 = list.size();
        int i4 = 0;
        int iMax2 = 0;
        int i5 = 0;
        while (i < size4) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i);
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
            int i6 = iMaxIntrinsicHeight + iMainAxisGap2;
            int iMaxIntrinsicWidth2 = intrinsicMeasurable.maxIntrinsicWidth(iMaxIntrinsicHeight);
            if ((FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) && i5 != 0 && iMaxIntrinsicHeight + i5 > i2) {
                i4 += iMax2 + iCrossAxisGap;
                iMax2 = iMaxIntrinsicWidth2;
                i5 = i6;
            } else {
                iMax2 = Math.max(iMax2, iMaxIntrinsicWidth2);
                i5 += i6;
            }
            i++;
        }
        return i4 + iMax2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        FlexBoxMeasurePolicy flexBoxMeasurePolicy;
        List<? extends Measurable> list2;
        boolean z;
        if (list.isEmpty()) {
            return MeasureScope.CC.layout$default(measureScope, Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2), null, new l() { // from class: androidx.compose.foundation.layout.FlexBoxMeasurePolicy$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        ResolvedFlexBoxConfig resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s = m2556resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), measureScope, j2);
        long jM2724constructorimpl = OrientationIndependentConstraints.m2724constructorimpl(j2, (FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 2)) ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 2)) {
            flexBoxMeasurePolicy = this;
            list2 = list;
            z = true;
        } else {
            list2 = list;
            z = false;
            flexBoxMeasurePolicy = this;
        }
        return flexBoxMeasurePolicy.m2552measureFlexBoxw1Onq5I(measureScope, resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s, list2, jM2724constructorimpl, z);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        ResolvedFlexBoxConfig resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s = m2556resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        if (!FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 0) && !FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 2)) {
            if (list.isEmpty()) {
                return 0;
            }
            int iMainAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
            if (FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) {
                int size = list.size();
                int iMax = 0;
                while (i < size) {
                    iMax = Math.max(iMax, list.get(i).minIntrinsicHeight(i2));
                    i++;
                }
                return iMax;
            }
            int size2 = list.size();
            int iMinIntrinsicHeight = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                iMinIntrinsicHeight += list.get(i3).minIntrinsicHeight(i2);
            }
            int size3 = list.size() - 1;
            return iMinIntrinsicHeight + ((size3 >= 0 ? size3 : 0) * iMainAxisGap);
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iMainAxisGap2 = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int iCrossAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.crossAxisGap();
        int size4 = list.size();
        int i4 = 0;
        int iMax2 = 0;
        int i5 = 0;
        while (i < size4) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i);
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Integer.MAX_VALUE);
            int i6 = iMinIntrinsicWidth + iMainAxisGap2;
            int iMinIntrinsicHeight2 = intrinsicMeasurable.minIntrinsicHeight(iMinIntrinsicWidth);
            if ((FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) && i5 != 0 && iMinIntrinsicWidth + i5 > i2) {
                i4 += iMax2 + iCrossAxisGap;
                iMax2 = iMinIntrinsicHeight2;
                i5 = i6;
            } else {
                iMax2 = Math.max(iMax2, iMinIntrinsicHeight2);
                i5 += i6;
            }
            i++;
        }
        return i4 + iMax2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        ResolvedFlexBoxConfig resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s = m2556resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        if (FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2783getDirectionT4wFHC8$foundation_layout(), 2)) {
            if (list.isEmpty()) {
                return 0;
            }
            int iMainAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
            if (FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) {
                int size = list.size();
                int iMax = 0;
                while (i < size) {
                    iMax = Math.max(iMax, list.get(i).minIntrinsicWidth(i2));
                    i++;
                }
                return iMax;
            }
            int size2 = list.size();
            int iMinIntrinsicWidth = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                iMinIntrinsicWidth += list.get(i3).minIntrinsicWidth(i2);
            }
            int size3 = list.size() - 1;
            return iMinIntrinsicWidth + ((size3 >= 0 ? size3 : 0) * iMainAxisGap);
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iMainAxisGap2 = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int iCrossAxisGap = resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.crossAxisGap();
        int size4 = list.size();
        int i4 = 0;
        int iMax2 = 0;
        int i5 = 0;
        while (i < size4) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i);
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
            int i6 = iMinIntrinsicHeight + iMainAxisGap2;
            int iMinIntrinsicWidth2 = intrinsicMeasurable.minIntrinsicWidth(iMinIntrinsicHeight);
            if ((FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfigM2556resolveFlexBoxConfig3p2s80s.m2786getWrap7ziDAWk$foundation_layout(), 2)) && i5 != 0 && iMinIntrinsicHeight + i5 > i2) {
                i4 += iMax2 + iCrossAxisGap;
                iMax2 = iMinIntrinsicWidth2;
                i5 = i6;
            } else {
                iMax2 = Math.max(iMax2, iMinIntrinsicWidth2);
                i5 += i6;
            }
            i++;
        }
        return i4 + iMax2;
    }
}
