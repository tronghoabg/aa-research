package androidx.compose.foundation.pager;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.ac;
import h.a.c;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i2, List<MeasuredPage> list, int i3, int i4, int i5, SnapPosition snapPosition, int i6) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f2 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i2, i3, i4, i5, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i6));
            x.f(list, "<this>");
            int size = list.size() - 1;
            if (size > 0) {
                int i7 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i7);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f3 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i2, i3, i4, i5, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i6));
                    int iCompare = Float.compare(f2, f3);
                    if (iCompare < 0) {
                        measuredPage2 = measuredPage4;
                    }
                    if (i7 == size) {
                        break;
                    }
                    if (iCompare < 0) {
                        f2 = f3;
                    }
                    i7++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i2, int i3, int i4, int i5, int i6, Orientation orientation, boolean z, Density density, int i7, int i8) {
        int i9;
        int i10 = i6;
        int i11 = orientation == Orientation.Vertical ? i3 : i2;
        boolean z2 = i4 < Math.min(i11, i5);
        if (z2 && i10 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i10);
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z2) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = i8;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical horizontalOrVerticalM2443spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m2443spacedBy0680j_4(lazyLayoutMeasureScope.mo2124toDpu2uoSUM(i7));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM2443spacedBy0680j_4.arrange(density, i11, iArr, iArr2);
            } else {
                horizontalOrVerticalM2443spacedBy0680j_4.arrange(density, i11, iArr, LayoutDirection.Ltr, iArr2);
            }
            j jVarAe = !z ? c.ae(iArr2) : n.s(c.ae(iArr2));
            int iA = jVarAe.a();
            int iB = jVarAe.b();
            int iC = jVarAe.c();
            if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
                while (true) {
                    int size2 = iArr2[iA];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(iA, z, size));
                    if (z) {
                        size2 = (i11 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i2, i3);
                    arrayList.add(measuredPage);
                    if (iA == iB) {
                        break;
                    }
                    iA += iC;
                }
            }
        } else {
            int size3 = list2.size();
            int i13 = i10;
            int i14 = 0;
            while (true) {
                i9 = i8 + i7;
                if (i14 >= size3) {
                    break;
                }
                MeasuredPage measuredPage2 = list2.get(i14);
                i13 -= i9;
                measuredPage2.position(i13, i2, i3);
                arrayList.add(measuredPage2);
                i14++;
            }
            int size4 = list.size();
            for (int i15 = 0; i15 < size4; i15++) {
                MeasuredPage measuredPage3 = list.get(i15);
                measuredPage3.position(i10, i2, i3);
                arrayList.add(measuredPage3);
                i10 += i9;
            }
            int size5 = list3.size();
            for (int i16 = 0; i16 < size5; i16++) {
                MeasuredPage measuredPage4 = list3.get(i16);
                measuredPage4.position(i10, i2, i3);
                arrayList.add(measuredPage4);
                i10 += i9;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i2, boolean z, int i3) {
        return !z ? i2 : (i3 - i2) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i2, int i3, int i4, List<Integer> list, l<? super Integer, MeasuredPage> lVar) {
        int iMin = Math.min(i4, (i3 - i2) - 1) + i2;
        int i5 = i2 + 1;
        ArrayList arrayList = null;
        if (i5 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i5)));
                if (i5 == iMin) {
                    break;
                }
                i5++;
            }
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iIntValue = list.get(i6).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? ac.f47967a : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i2, int i3, List<Integer> list, l<? super Integer, MeasuredPage> lVar) {
        int iMax = Math.max(0, i2 - i3);
        int i4 = i2 - 1;
        ArrayList arrayList = null;
        if (iMax <= i4) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i4)));
                if (i4 == iMax) {
                    break;
                }
                i4--;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? ac.f47967a : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-G5IdpRk, reason: not valid java name */
    public static final MeasuredPage m3037getAndMeasureG5IdpRk(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, int i3, MutableIntObjectMap<List<Placeable>> mutableIntObjectMap) {
        Object key = pagerLazyLayoutItemProvider.getKey(i2);
        ArrayList arrayList = mutableIntObjectMap.get(i2);
        if (arrayList == null) {
            List<Measurable> listCompose = lazyLayoutMeasureScope.compose(i2);
            int size = listCompose.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(listCompose.get(i4).mo9741measureBRTryo0(j2));
            }
            arrayList = arrayList2;
            mutableIntObjectMap.set(i2, arrayList);
        }
        return new MeasuredPage(i2, i3, arrayList, j3, key, orientation, horizontal, vertical, layoutDirection, z, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03c4 A[PHI: r1
  0x03c4: PHI (r1v18 float) = (r1v16 float), (r1v17 float) binds: [B:158:0x03c2, B:161:0x03ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: measurePager-7L1iB3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.pager.PagerMeasureResult m3038measurePager7L1iB3k(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope r35, int r36, final androidx.compose.foundation.pager.PagerLazyLayoutItemProvider r37, int r38, int r39, int r40, int r41, int r42, int r43, long r44, final androidx.compose.foundation.gestures.Orientation r46, final androidx.compose.ui.Alignment.Vertical r47, final androidx.compose.ui.Alignment.Horizontal r48, final boolean r49, final long r50, final int r52, int r53, java.util.List<java.lang.Integer> r54, androidx.compose.foundation.gestures.snapping.SnapPosition r55, final androidx.compose.runtime.MutableState<h.ab> r56, kotlinx.coroutines.af r57, androidx.compose.ui.unit.Density r58, h.g.a.q<? super java.lang.Integer, ? super java.lang.Integer, ? super h.g.a.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, h.ab>, ? extends androidx.compose.ui.layout.MeasureResult> r59, final androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.ui.layout.Placeable>> r60) {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerMeasureKt.m3038measurePager7L1iB3k(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, int, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider, int, int, int, int, int, int, long, androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.Alignment$Vertical, androidx.compose.ui.Alignment$Horizontal, boolean, long, int, int, java.util.List, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.runtime.MutableState, kotlinx.coroutines.af, androidx.compose.ui.unit.Density, h.g.a.q, androidx.collection.MutableIntObjectMap):androidx.compose.foundation.pager.PagerMeasureResult");
    }

    static final ab measurePager_7L1iB3k$lambda$18(MutableState mutableState, final List list, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new l() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PagerMeasureKt.measurePager_7L1iB3k$lambda$18$0(list, (Placeable.PlacementScope) obj);
            }
        });
        ObservableScopeInvalidator.m2964attachToScopeimpl(mutableState);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measurePager_7L1iB3k$lambda$18$0(List list, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((MeasuredPage) list.get(i2)).place(placementScope);
        }
        return ab.f48028a;
    }

    private static final void debugLog(a<String> aVar) {
    }
}
