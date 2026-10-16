package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.Placeable;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.a.u;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, l<? super LazyStaggeredGridMeasuredItem, ab> lVar, l<? super Integer, Boolean> lVar2, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (lVar2.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM2997getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m2997getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM3006getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m3006getAndMeasurejy6DScQ(iIntValue, jM2997getSpanRangelOCCd4c);
                        lVar.invoke(lazyStaggeredGridMeasuredItemM3006getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM3006getAndMeasurejy6DScQ);
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i3 = 0; i3 < size2; i3++) {
                int iIntValue2 = pinnedItems.get(i3).intValue();
                if (lVar2.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM2997getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m2997getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM3006getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m3006getAndMeasurejy6DScQ(iIntValue2, jM2997getSpanRangelOCCd4c2);
                    lVar.invoke(lazyStaggeredGridMeasuredItemM3006getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM3006getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? ac.f47967a : arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, u<LazyStaggeredGridMeasuredItem>[] uVarArr, int[] iArr, int i2, int i3, int i4) {
        int size = 0;
        for (u<LazyStaggeredGridMeasuredItem> uVar : uVarArr) {
            size += uVar.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (u<LazyStaggeredGridMeasuredItem> uVar2 : uVarArr) {
                if (!uVar2.isEmpty()) {
                    int length = uVarArr.length;
                    int i5 = -1;
                    int i6 = 0;
                    int i7 = Integer.MAX_VALUE;
                    while (i6 < length) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) uVarArr[i6].b();
                        int index = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : Integer.MAX_VALUE;
                        int i8 = i7 > index ? index : i7;
                        if (i7 > index) {
                            i5 = i6;
                        }
                        i6++;
                        i7 = i8;
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = uVarArr[i5].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i5) {
                        long jM3013constructorimpl = SpanRange.m3013constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM3002maxInRangejy6DScQ = m3002maxInRangejy6DScQ(iArr, jM3013constructorimpl);
                        int i9 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i5];
                        if (lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSize() + iM3002maxInRangejy6DScQ >= i3 && iM3002maxInRangejy6DScQ <= i4) {
                            lazyStaggeredGridMeasuredItemRemoveFirst.position(iM3002maxInRangejy6DScQ, i9, i2);
                            arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                        }
                        long j2 = jM3013constructorimpl >> 32;
                        long j3 = jM3013constructorimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                        for (int i10 = (int) j2; i10 < ((int) j3); i10++) {
                            iArr[i10] = lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSizeWithSpacings() + iM3002maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final String debugRender(u<LazyStaggeredGridMeasuredItem>[] uVarArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i2) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            while (true) {
                if (iArr[length] < i2 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            int i4 = iArr[length];
            if (i4 >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), i4)) {
                if (lazyStaggeredGridMeasureContext.getLaneInfo().getLane(i4) == -2) {
                    int length2 = iArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            i5 = -1;
                            break;
                        } else if (iArr[i5] == i4) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    int i6 = i5 + 1;
                    if (i6 <= length) {
                        while (true) {
                            if (iArr[i6] == i4) {
                                iArr[i6] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, i4, i6);
                            }
                            if (i6 == length) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                    length = i5;
                }
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i4, length);
            }
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, l<? super T, ab> lVar) {
        if (!z) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                lVar.invoke(list.get(i2));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            lVar.invoke(list.get(size2));
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0 || !z) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                lVar.invoke(list.get(i3));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i4 = size2 - 1;
            lVar.invoke(list.get(size2));
            if (i4 < 0) {
                return;
            } else {
                size2 = i4;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i2, int i3) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i2, i3);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m3001forEachnIS5qE8(long j2, l<? super Integer, ab> lVar) {
        for (int i2 = (int) (j2 >> 32); i2 < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)); i2++) {
            lVar.invoke(Integer.valueOf(i2));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = Integer.MIN_VALUE;
        int i4 = -1;
        while (i2 < length) {
            int i5 = iArr[i2];
            int i6 = i3 < i5 ? i5 : i3;
            if (i3 < i5) {
                i4 = i2;
            }
            i2++;
            i3 = i6;
        }
        return i4;
    }

    private static final <T> int indexOfMinBy(T[] tArr, l<? super T, Integer> lVar) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = -1;
        while (i2 < length) {
            int iIntValue = lVar.invoke(tArr[i2]).intValue();
            int i5 = i3 > iIntValue ? iIntValue : i3;
            if (i3 > iIntValue) {
                i4 = i2;
            }
            i2++;
            i3 = i5;
        }
        return i4;
    }

    public static final int indexOfMinValue(int[] iArr, int i2) {
        int length = iArr.length;
        int i3 = Integer.MAX_VALUE;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i2 + 1;
            int i7 = iArr[i5];
            if (i6 <= i7 && i7 < i3) {
                i4 = i5;
                i3 = i7;
            }
        }
        return i4;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r7, int r8, int r9, boolean r10, h.g.a.p<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem, ? super java.lang.Integer, h.ab> r11) {
        /*
            r0 = 0
            if (r10 == 0) goto Ldf
            java.util.List r10 = r7.getApproachVisibleItems()
            if (r10 == 0) goto Ldf
            java.util.List r10 = r7.getApproachVisibleItems()
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Ldf
            java.util.List r10 = r7.getApproachVisibleItems()
            int r1 = r10.size()
        L1d:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L44
            java.lang.Object r2 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r8) goto L1d
            if (r1 == 0) goto L3d
            int r2 = r1 + (-1)
            java.lang.Object r2 = r10.get(r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r8) goto L1d
        L3d:
            java.lang.Object r8 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r8 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r8
            goto L45
        L44:
            r8 = r0
        L45:
            java.util.List r10 = r7.getApproachVisibleItems()
            java.lang.Object r10 = h.a.i.T(r10)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r10 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r10
            if (r8 == 0) goto Ldf
            int r8 = r8.getIndex()
            int r10 = r10.getIndex()
            int r9 = r9 + (-1)
            int r9 = java.lang.Math.min(r10, r9)
            if (r8 > r9) goto Ldf
            r10 = r0
        L62:
            r1 = 0
            if (r10 == 0) goto L7f
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = r1
        L6d:
            if (r3 >= r2) goto L7f
            java.lang.Object r4 = r10.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r4
            int r4 = r4.getIndex()
            if (r4 != r8) goto L7c
            goto Ld9
        L7c:
            int r3 = r3 + 1
            goto L6d
        L7f:
            if (r10 != 0) goto L88
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r10 = (java.util.List) r10
        L88:
            java.util.List r2 = r7.getApproachVisibleItems()
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r1
        L94:
            if (r4 >= r3) goto La7
            java.lang.Object r5 = r2.get(r4)
            r6 = r5
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r6 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r6
            int r6 = r6.getIndex()
            if (r6 != r8) goto La4
            goto La8
        La4:
            int r4 = r4 + 1
            goto L94
        La7:
            r5 = r0
        La8:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r5
            if (r5 == 0) goto Lb1
            int r2 = r5.getLane()
            goto Lb2
        Lb1:
            r2 = r1
        Lb2:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r3 = r7.getItemProvider()
            long r3 = r7.m2997getSpanRangelOCCd4c(r3, r8, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r5 = r7.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = r5.m3006getAndMeasurejy6DScQ(r8, r3)
            r10.add(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r4 = r7.getResolvedSlots()
            int[] r4 = r4.getPositions()
            int r5 = r4.length
            if (r5 <= r2) goto Ld2
            r1 = r4[r2]
        Ld2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r3, r1)
        Ld9:
            if (r8 == r9) goto Lde
            int r8 = r8 + 1
            goto L62
        Lde:
            return r10
        Ldf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int, boolean, h.g.a.p):java.util.List");
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m3002maxInRangejy6DScQ(int[] iArr, long j2) {
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j2 >> 32); i2 < ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)); i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f9, code lost:
    
        r4 = indexOfMinValue$default(r7, 0, 1, null);
        r8 = indexOfMaxValue(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0304, code lost:
    
        if (r4 == r8) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030a, code lost:
    
        if (r7[r4] != r7[r8]) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030c, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030e, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030f, code lost:
    
        r8 = r29[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0312, code lost:
    
        if (r8 != (-1)) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0314, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0315, code lost:
    
        r8 = findPreviousItemIndex(r0, r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0319, code lost:
    
        if (r8 >= 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x031b, code lost:
    
        r10 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x031d, code lost:
    
        if (r1 != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0323, code lost:
    
        if (measure$lambda$0$misalignedStart(r10, r0, r7, r4) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0325, code lost:
    
        if (r52 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0327, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r10.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0332, code lost:
    
        if (r3 >= r1) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0334, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033b, code lost:
    
        r1 = r7.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033f, code lost:
    
        if (r5 >= r1) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0341, code lost:
    
        r3[r5] = r7[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x034f, code lost:
    
        return measure(r0, r30, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0350, code lost:
    
        r11 = r30;
        r26 = r2;
        r29 = r5;
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x035a, code lost:
    
        r10 = r29;
        r11 = r30;
        r49 = r1;
        r26 = r2;
        r1 = r0.m2997getSpanRangelOCCd4c(r0.getItemProvider(), r8, r4);
        r4 = r0.getLaneInfo();
        r29 = r5;
        r31 = r6;
        r14 = (int) (r1 & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        r5 = (int) (r1 >> r18);
        r6 = r14 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x037b, code lost:
    
        if (r6 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x037d, code lost:
    
        r15 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037f, code lost:
    
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0380, code lost:
    
        r4.setLane(r8, r15);
        r4 = r0.getMeasuredItemProvider().m3006getAndMeasurejy6DScQ(r8, r1);
        r1 = m3002maxInRangejy6DScQ(r7, r1);
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0390, code lost:
    
        if (r6 == 1) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0392, code lost:
    
        r2 = r0.getLaneInfo().getGaps(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x039b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039c, code lost:
    
        r6 = r5;
        r5 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039f, code lost:
    
        if (r6 >= r14) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a1, code lost:
    
        r49 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a5, code lost:
    
        if (r7[r6] == r1) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a7, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03a9, code lost:
    
        r15 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ab, code lost:
    
        r5 = (!r15) | r5;
        r23[r6].addFirst(r4);
        r10[r6] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03b6, code lost:
    
        if (r2 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b8, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03ba, code lost:
    
        r15 = r2[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03bc, code lost:
    
        r7[r6] = (r1 + r4.getMainAxisSizeWithSpacings()) + r15;
        r6 = r6 + 1;
        r15 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r48, int r49, int[] r50, int[] r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 2806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure$lambda$0$0(Placeable.PlacementScope placementScope) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure$lambda$0$37(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, final List list, final boolean z, final long j2, final LazyLayoutMeasureScope lazyLayoutMeasureScope, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LazyStaggeredGridMeasureKt.measure$lambda$0$37$0(list, z, j2, lazyLayoutMeasureScope, (Placeable.PlacementScope) obj);
            }
        });
        ObservableScopeInvalidator.m2964attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m3011getPlacementScopeInvalidatorzYiylxw$foundation());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure$lambda$0$37$0(List list, boolean z, long j2, LazyLayoutMeasureScope lazyLayoutMeasureScope, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((LazyStaggeredGridMeasuredItem) list.get(i2)).m3009placeGMOY1bU(placementScope, z, j2, lazyLayoutMeasureScope.isLookingAhead());
        }
        return ab.f48028a;
    }

    private static final boolean measure$lambda$0$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (iArr2[i2] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i3 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$0$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i4], i4) != -1 && iArr2[i4] >= iArr2[i2]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m3003measureStaggeredGridC6celF4(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z, boolean z2, long j3, int i2, int i3, int i4, int i5, af afVar, boolean z3, boolean z4, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        int iM3002maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z, lazyLayoutMeasureScope, i2, j3, i4, i5, z2, i3, afVar, z3, z4, lazyStaggeredGridLayoutInfo != null ? lazyStaggeredGridLayoutInfo.getVisibleItemsInfo() : null, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition$foundation().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition$foundation().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation.length || (iM3002maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation[i6]) == -1) {
                    iM3002maxInRangejy6DScQ = i6 == 0 ? 0 : m3002maxInRangejy6DScQ(iArr, SpanRange.m3013constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = iM3002maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iM3002maxInRangejy6DScQ, i6);
                i6++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                iArr2[i7] = i7 < scrollOffsets.length ? scrollOffsets[i7] : i7 == 0 ? 0 : iArr2[i7 - 1];
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation(z4)), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation, scrollOffsets, true);
    }

    private static final void offsetBy(int[] iArr, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }

    private static final int[] transform(int[] iArr, l<? super Integer, Integer> lVar) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = lVar.invoke(Integer.valueOf(iArr[i2])).intValue();
        }
        return iArr;
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, l<? super LazyLayoutMeasureScope, ? extends T> lVar) {
        return lVar.invoke(lazyLayoutMeasureScope);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
