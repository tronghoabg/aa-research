package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.ac;
import h.a.c;
import h.ab;
import h.e;
import h.g.a.l;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, l<? super Integer, Boolean> lVar) {
        LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider2;
        int size = list.size();
        ArrayList arrayList = null;
        int i2 = 0;
        while (i2 < size) {
            int iIntValue = list.get(i2).intValue();
            if (lVar.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
                LazyGridMeasuredItem lazyGridMeasuredItemMo2890getAndMeasurehBUhpc = lazyGridMeasuredItemProvider2.mo2890getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m2919childConstraintsJhjzzOo$foundation(0, iSpanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemMo2890getAndMeasurehBUhpc);
            } else {
                lazyGridMeasuredItemProvider2 = lazyGridMeasuredItemProvider;
            }
            i2++;
            lazyGridMeasuredItemProvider = lazyGridMeasuredItemProvider2;
        }
        return arrayList == null ? ac.f47967a : arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i2, int i3, int i4, int i5, int i6, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i7 = true != z ? i2 : i3;
        boolean z3 = i4 < Math.min(i7, i5);
        if (z3 && i6 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
        }
        List<LazyGridMeasuredLine> list4 = list;
        int size = list4.size();
        int length = 0;
        for (int i8 = 0; i8 < size; i8++) {
            length += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
                    throw new e();
                }
                vertical.arrange(density, i7, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
                    throw new e();
                }
                horizontal.arrange(density, i7, iArr, LayoutDirection.Ltr, iArr2);
            }
            j jVarS = z2 ? n.s(c.ae(iArr2)) : c.ae(iArr2);
            int iA = jVarS.a();
            int iB = jVarS.b();
            int iC = jVarS.c();
            if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
                while (true) {
                    int mainAxisSize = iArr2[iA];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(iA, z2, size2));
                    if (z2) {
                        mainAxisSize = (i7 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i2, i3));
                    if (iA == iB) {
                        break;
                    }
                    iA += iC;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i6;
                while (true) {
                    int i10 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i2, i3);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i10 < 0) {
                        break;
                    }
                    size3 = i10;
                }
            }
            int size4 = list4.size();
            int mainAxisSizeWithSpacings2 = i6;
            for (int i11 = 0; i11 < size4; i11++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i11);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i2, i3));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i12 = 0; i12 < size5; i12++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i12);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings2, 0, i2, i3);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i2, boolean z, int i3) {
        return !z ? i2 : (i3 - i2) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[LOOP:1: B:24:0x006e->B:38:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[EDGE_INSN: B:50:0x00af->B:39:0x00af BREAK  A[LOOP:1: B:24:0x006e->B:38:0x00ac], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> linesRetainedForLookahead(int r6, int r7, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r8, boolean r9, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> r10, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r11) {
        /*
            r0 = 0
            if (r9 == 0) goto Laf
            if (r11 == 0) goto Laf
            java.util.List r9 = r11.getVisibleItemsInfo()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Laf
            java.util.List r9 = r11.getVisibleItemsInfo()
            int r1 = r9.size()
        L19:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L40
            java.lang.Object r2 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r6) goto L19
            if (r1 == 0) goto L39
            int r2 = r1 + (-1)
            java.lang.Object r2 = r9.get(r2)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r6) goto L19
        L39:
            java.lang.Object r6 = r9.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r6 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r6
            goto L41
        L40:
            r6 = r0
        L41:
            java.util.List r9 = r11.getVisibleItemsInfo()
            java.lang.Object r9 = h.a.i.T(r9)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r9 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r9
            java.lang.Object r10 = h.a.i.U(r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r10
            r11 = 0
            if (r10 == 0) goto L5b
            int r10 = r10.getIndex()
            int r10 = r10 + 1
            goto L5c
        L5b:
            r10 = r11
        L5c:
            if (r6 == 0) goto Laf
            int r6 = r6.getIndex()
            int r9 = r9.getIndex()
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r9, r7)
            if (r6 > r7) goto Laf
        L6e:
            if (r0 == 0) goto L97
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r1 = r11
        L78:
            if (r1 >= r9) goto L97
            java.lang.Object r2 = r0.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r2
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r2 = r2.getItems()
            int r3 = r2.length
            r4 = r11
        L86:
            if (r4 >= r3) goto L94
            r5 = r2[r4]
            int r5 = r5.getIndex()
            if (r5 != r6) goto L91
            goto Laa
        L91:
            int r4 = r4 + 1
            goto L86
        L94:
            int r1 = r1 + 1
            goto L78
        L97:
            if (r0 != 0) goto La1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = r9
            java.util.List r0 = (java.util.List) r0
        La1:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r9 = r8.getAndMeasure(r10)
            r0.add(r9)
            int r10 = r10 + 1
        Laa:
            if (r6 == r7) goto Laf
            int r6 = r6 + 1
            goto L6e
        Laf:
            if (r0 != 0) goto Lb6
            h.a.ac r6 = h.a.ac.f47967a
            java.util.List r6 = (java.util.List) r6
            return r6
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.linesRetainedForLookahead(int, int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, boolean, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0226, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0227, code lost:
    
        r7 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r6.d();
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022f, code lost:
    
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0231, code lost:
    
        r7 = r7.getItems();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0235, code lost:
    
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0237, code lost:
    
        h.g.b.x.f(r7, "<this>");
        r8 = r7.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023b, code lost:
    
        if (r8 != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023d, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0240, code lost:
    
        r7 = r7[r8 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0247, code lost:
    
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0249, code lost:
    
        r18 = r0;
        r0 = r7.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0251, code lost:
    
        r18 = r0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0254, code lost:
    
        r19 = r61;
        r7 = r19.size();
        r20 = null;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x025f, code lost:
    
        if (r8 >= r7) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0261, code lost:
    
        r51 = r0;
        r0 = r61.get(r8).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x026d, code lost:
    
        if (r0 < 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x026f, code lost:
    
        if (r0 >= r3) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0271, code lost:
    
        r21 = r6;
        r6 = r43.spanOf(r0);
        r23 = r7;
        r24 = r8;
        r38 = r3;
        r13 = r4;
        r9 = r21;
        r21 = r12;
        r12 = r5;
        r4 = r44.mo2890getAndMeasurehBUhpc(r0, 0, r6, r43.m2919childConstraintsJhjzzOo$foundation(0, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0296, code lost:
    
        if (r20 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0298, code lost:
    
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a0, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a2, code lost:
    
        r3.add(r4);
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a8, code lost:
    
        r38 = r3;
        r13 = r4;
        r9 = r6;
        r23 = r7;
        r24 = r8;
        r21 = r12;
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b4, code lost:
    
        r8 = r24 + 1;
        r0 = r51;
        r6 = r9;
        r5 = r12;
        r4 = r13;
        r12 = r21;
        r7 = r23;
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c6, code lost:
    
        r51 = r0;
        r38 = r3;
        r13 = r4;
        r9 = r6;
        r21 = r12;
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d0, code lost:
    
        if (r20 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d2, code lost:
    
        r20 = h.a.ac.f47967a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d8, code lost:
    
        r4 = r9;
        r6 = 0;
        r8 = linesRetainedForLookahead(r51, r42, r43, r63, r4, r64);
        r0 = r42;
        r1 = r43;
        r2 = r19.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f2, code lost:
    
        if (r3 >= r2) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02f4, code lost:
    
        r5 = r61.get(r3).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0300, code lost:
    
        if ((r51 + 1) > r5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0302, code lost:
    
        if (r5 >= r0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0304, code lost:
    
        if (r63 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0306, code lost:
    
        r6 = r8.size();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x030e, code lost:
    
        if (r0 >= r6) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0310, code lost:
    
        r22 = r0;
        r0 = r8.get(r0).getItems();
        r51 = r2;
        r2 = r0.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0322, code lost:
    
        if (r0 >= r2) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0324, code lost:
    
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x032c, code lost:
    
        if (r0[r0].getIndex() != r5) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x032e, code lost:
    
        r19 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0331, code lost:
    
        r0 = r23 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0334, code lost:
    
        r0 = r22 + 1;
        r2 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0339, code lost:
    
        r6 = r3;
        r3 = r1.spanOf(r5);
        r22 = r6;
        r6 = r4;
        r23 = 0;
        r19 = r2;
        r1 = r44.mo2890getAndMeasurehBUhpc(r5, 0, r3, r1.m2919childConstraintsJhjzzOo$foundation(0, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x035c, code lost:
    
        if (r17 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x035e, code lost:
    
        r17 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0367, code lost:
    
        r0 = r17;
        r0.add(r1);
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x036f, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0371, code lost:
    
        r22 = r3;
        r6 = r4;
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0376, code lost:
    
        r3 = r22 + 1;
        r0 = r42;
        r1 = r43;
        r4 = r6;
        r2 = r19;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0383, code lost:
    
        r23 = r6;
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0386, code lost:
    
        if (r17 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0388, code lost:
    
        r17 = h.a.ac.f47967a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x038e, code lost:
    
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0390, code lost:
    
        if (r46 > 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0392, code lost:
    
        if (r48 >= 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0395, code lost:
    
        r27 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0398, code lost:
    
        r0 = r9.size();
        r1 = r18;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03a3, code lost:
    
        if (r4 >= r0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03a5, code lost:
    
        r3 = ((androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r9.get(r4)).getMainAxisSizeWithSpacings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03af, code lost:
    
        if (r1 == 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03b1, code lost:
    
        if (r3 > r1) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03b3, code lost:
    
        h.g.b.x.f(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03bc, code lost:
    
        if (r4 == (r6.size() - 1)) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03be, code lost:
    
        r1 = r1 - r3;
        r4 = r4 + 1;
        r16 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r9.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03ca, code lost:
    
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03cc, code lost:
    
        r40 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ce, code lost:
    
        if (r54 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03d0, code lost:
    
        r0 = androidx.compose.ui.unit.Constraints.m11107getMaxWidthimpl(r52);
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03d6, code lost:
    
        r0 = androidx.compose.ui.unit.ConstraintsKt.m11124constrainWidthK40F9xA(r52, r11);
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03dc, code lost:
    
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03de, code lost:
    
        if (r4 == 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03e0, code lost:
    
        r0 = androidx.compose.ui.unit.ConstraintsKt.m11123constrainHeightK40F9xA(r52, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03e5, code lost:
    
        r0 = androidx.compose.ui.unit.Constraints.m11106getMaxHeightimpl(r52);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03e9, code lost:
    
        r19 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03ef, code lost:
    
        if (r8.isEmpty() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03f1, code lost:
    
        r0 = r6;
        r14 = r44;
        r9 = r55;
        r10 = r56;
        r12 = r58;
        r8 = r4;
        r5 = r11;
        r3 = r18;
        r4 = r19;
        r1 = r20;
        r49 = r21;
        r41 = r23;
        r15 = 1;
        r6 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x040a, code lost:
    
        r0 = h.a.i.af(r9, r8);
        r14 = r44;
        r6 = r45;
        r9 = r55;
        r10 = r56;
        r12 = r58;
        r8 = r4;
        r5 = r11;
        r3 = r18;
        r4 = r19;
        r1 = r20;
        r49 = r21;
        r41 = r23;
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x042a, code lost:
    
        r20 = calculateItemsOffsets(r0, r1, r2, r3, r4, r5, r6, r1, r8, r9, r10, r57, r12);
        r11 = r6;
        r59.onMeasured((int) r13, r3, r4, r20, r14.getKeyIndexMap(), r14, r8, r63, r60, r62, r27, r5, r65, r67);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0457, code lost:
    
        if (r63 != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0459, code lost:
    
        r1 = r59.m2945getMinSizeToFitDisappearingItemsYbymL2g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0467, code lost:
    
        if (androidx.compose.ui.unit.IntSize.m11337equalsimpl0(r1, androidx.compose.ui.unit.IntSize.Companion.m11344getZeroYbymL2g()) != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0469, code lost:
    
        if (r15 == r8) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x046b, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x046d, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x046e, code lost:
    
        r18 = androidx.compose.ui.unit.ConstraintsKt.m11124constrainWidthK40F9xA(r52, java.lang.Math.max(r3, (int) (r1 >> 32)));
        r19 = androidx.compose.ui.unit.ConstraintsKt.m11123constrainHeightK40F9xA(r52, java.lang.Math.max(r4, (int) (r1 & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0486, code lost:
    
        if (r15 == r8) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0488, code lost:
    
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x048b, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x048d, code lost:
    
        if (r1 == r6) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x048f, code lost:
    
        r2 = r20.size();
        r4 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0499, code lost:
    
        if (r4 >= r2) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x049b, code lost:
    
        r20.get(r4).updateMainAxisLayoutSize(r1);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04a7, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04aa, code lost:
    
        r7 = r3;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04ad, code lost:
    
        r4 = r14.getHeaderIndices();
        r10 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda2(r43, r14);
        r14 = r5;
        r9 = r8;
        r8 = r19;
        r0 = androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.applyStickyItems(r70, r38, r51, r20, r4, r46, r47, r7, r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04d1, code lost:
    
        if (r51 != r49) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04d3, code lost:
    
        if (r14 <= r11) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04d6, code lost:
    
        r15 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04d8, code lost:
    
        r5 = r71.invoke(java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r8), new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda3(r66, r20, r0, r63));
        r0 = androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.updatedVisibleItems(r38, r51, r20, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04f4, code lost:
    
        if (r9 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04f6, code lost:
    
        r1 = androidx.compose.foundation.gestures.Orientation.Vertical;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04f9, code lost:
    
        r1 = androidx.compose.foundation.gestures.Orientation.Horizontal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0523, code lost:
    
        return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(r40, r27, r15, r13, r5, r37, r36, r65, r58, r60, r68, r69, r0, r0, r3, r42, r57, r1, r47, r48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a0, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a2, code lost:
    
        if (r0 >= r45) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a4, code lost:
    
        r1 = r45 - r0;
        r7 = r16 - r1;
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ac, code lost:
    
        if (r7 >= r46) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ae, code lost:
    
        if (r4 <= 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b0, code lost:
    
        r4 = r4 - 1;
        r8 = r43.getAndMeasure(r4);
        r6.add(0, r8);
        r7 = r7 + r8.getMainAxisSizeWithSpacings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c0, code lost:
    
        r0 = r0 + r1;
        r1 = r1 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
    
        if (r7 >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c4, code lost:
    
        r1 = r1 + r7;
        r11 = r0 + r7;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c9, code lost:
    
        r11 = r0;
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cc, code lost:
    
        r11 = r0;
        r1 = r3;
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01dc, code lost:
    
        if (java.lang.Integer.signum(java.lang.Math.round(r51)) != java.lang.Integer.signum(r1)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ea, code lost:
    
        if (java.lang.Math.abs(java.lang.Math.round(r51)) < java.lang.Math.abs(r1)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ec, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ee, code lost:
    
        r4 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f0, code lost:
    
        r7 = r51 - r4;
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f3, code lost:
    
        if (r63 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f5, code lost:
    
        if (r1 <= r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f9, code lost:
    
        if (r7 > 0.0f) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01fb, code lost:
    
        r8 = (r1 - r3) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ff, code lost:
    
        r37 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0201, code lost:
    
        if (r0 >= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0203, code lost:
    
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative initial offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0208, code lost:
    
        r1 = -r0;
        r16 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r6.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0211, code lost:
    
        if (r16 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0213, code lost:
    
        r3 = r16.getItems();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0217, code lost:
    
        if (r3 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        r3 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) h.a.c.N(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021f, code lost:
    
        if (r3 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0221, code lost:
    
        r3 = r3.getIndex();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureLazyGrid-t1x4au0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m2915measureLazyGridt1x4au0(int r42, final androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r43, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r44, int r45, int r46, int r47, int r48, int r49, int r50, float r51, long r52, boolean r54, androidx.compose.foundation.layout.Arrangement.Vertical r55, androidx.compose.foundation.layout.Arrangement.Horizontal r56, boolean r57, androidx.compose.ui.unit.Density r58, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r59, int r60, java.util.List<java.lang.Integer> r61, boolean r62, final boolean r63, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r64, kotlinx.coroutines.af r65, final androidx.compose.runtime.MutableState<h.ab> r66, androidx.compose.ui.graphics.GraphicsContext r67, h.g.a.l<? super java.lang.Integer, ? extends java.util.List<h.k<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> r68, h.g.a.l<? super java.lang.Integer, java.lang.Integer> r69, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r70, h.g.a.q<? super java.lang.Integer, ? super java.lang.Integer, ? super h.g.a.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, h.ab>, ? extends androidx.compose.ui.layout.MeasureResult> r71) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m2915measureLazyGridt1x4au0(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo, kotlinx.coroutines.af, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, h.g.a.l, h.g.a.l, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, h.g.a.q):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }

    static final LazyGridMeasuredItem measureLazyGrid_t1x4au0$lambda$7(LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2) {
        int iSpanOf = lazyGridMeasuredLineProvider.spanOf(i2);
        return lazyGridMeasuredItemProvider.mo2890getAndMeasurehBUhpc(i2, 0, iSpanOf, lazyGridMeasuredLineProvider.m2919childConstraintsJhjzzOo$foundation(0, iSpanOf));
    }

    static final ab measureLazyGrid_t1x4au0$lambda$8(MutableState mutableState, final List list, final List list2, final boolean z, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$8$0(list, list2, z, (Placeable.PlacementScope) obj);
            }
        });
        ObservableScopeInvalidator.m2964attachToScopeimpl(mutableState);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measureLazyGrid_t1x4au0$lambda$8$0(List list, List list2, boolean z, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((LazyGridMeasuredItem) list.get(i2)).place(placementScope, z);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((LazyGridMeasuredItem) list2.get(i3)).place(placementScope, z);
        }
        return ab.f48028a;
    }
}
