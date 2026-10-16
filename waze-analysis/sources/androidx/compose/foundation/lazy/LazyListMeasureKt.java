package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.ac;
import h.a.c;
import h.a.i;
import h.ab;
import h.e;
import h.g.a.l;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i2, int i3, int i4, int i5, int i6, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i7 = true != z ? i2 : i3;
        int i8 = 0;
        boolean z3 = i4 < Math.min(i7, i5);
        if (z3 && i6 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i8 < size) {
                iArr[i8] = list.get(calculateItemsOffsets$reverseAware(i8, z2, size)).getSize();
                i8++;
            }
            int[] iArr2 = new int[size];
            if (z) {
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                    throw new e();
                }
                vertical.arrange(density, i7, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
                    throw new e();
                }
                horizontal.arrange(density, i7, iArr, LayoutDirection.Ltr, iArr2);
            }
            j jVarAe = !z2 ? c.ae(iArr2) : n.s(c.ae(iArr2));
            int iA = jVarAe.a();
            int iB = jVarAe.b();
            int iC = jVarAe.c();
            if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
                while (true) {
                    int size2 = iArr2[iA];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(iA, z2, size));
                    if (z2) {
                        size2 = (i7 - size2) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(size2, i2, i3);
                    arrayList.add(lazyListMeasuredItem);
                    if (iA == iB) {
                        break;
                    }
                    iA += iC;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i6;
            for (int i9 = 0; i9 < size3; i9++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i9);
                mainAxisSizeWithSpacings -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(mainAxisSizeWithSpacings, i2, i3);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i6;
            for (int i10 = 0; i10 < size4; i10++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i10);
                lazyListMeasuredItem3.position(mainAxisSizeWithSpacings2, i2, i3);
                arrayList.add(lazyListMeasuredItem3);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            while (i8 < size5) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i8);
                lazyListMeasuredItem4.position(mainAxisSizeWithSpacings2, i2, i3);
                arrayList.add(lazyListMeasuredItem4);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
                i8++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i2, boolean z, int i3) {
        return !z ? i2 : (i3 - i2) - 1;
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, List<Integer> list2) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider3;
        int iMin = Math.min(((LazyListMeasuredItem) i.T(list)).getIndex() + i3, i2 - 1);
        int index = ((LazyListMeasuredItem) i.T(list)).getIndex() + 1;
        ArrayList arrayList = null;
        if (index <= iMin) {
            int i4 = index;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m2889getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i4, 0L, 2, null));
                if (i4 == iMin) {
                    break;
                }
                i4++;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        if (arrayList != null && ((LazyListMeasuredItem) i.T(arrayList)).getIndex() > iMin) {
            iMin = ((LazyListMeasuredItem) i.T(arrayList)).getIndex();
        }
        int size = list2.size();
        int i5 = 0;
        while (i5 < size) {
            int iIntValue = list2.get(i5).intValue();
            if (iIntValue > iMin) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider3 = lazyListMeasuredItemProvider2;
                arrayList.add(LazyListMeasuredItemProvider.m2889getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider3, iIntValue, 0L, 2, null));
            } else {
                lazyListMeasuredItemProvider3 = lazyListMeasuredItemProvider2;
            }
            i5++;
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider3;
        }
        return arrayList == null ? ac.f47967a : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i2, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i3, List<Integer> list) {
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider2;
        int iMax = Math.max(0, i2 - i3);
        int i4 = i2 - 1;
        ArrayList arrayList = null;
        if (iMax <= i4) {
            int i5 = i4;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
                arrayList.add(LazyListMeasuredItemProvider.m2889getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, i5, 0L, 2, null));
                if (i5 == iMax) {
                    break;
                }
                i5--;
                lazyListMeasuredItemProvider = lazyListMeasuredItemProvider2;
            }
        } else {
            lazyListMeasuredItemProvider2 = lazyListMeasuredItemProvider;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i6 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m2889getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider2, iIntValue, 0L, 2, null));
                }
                if (i6 < 0) {
                    break;
                }
                size = i6;
            }
        }
        return arrayList == null ? ac.f47967a : arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a0, code lost:
    
        r48 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x042c  */
    /* renamed from: measureLazyList-pIk1_oM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m2883measureLazyListpIk1_oM(int r41, final androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r42, int r43, int r44, int r45, int r46, int r47, int r48, float r49, long r50, boolean r52, androidx.compose.foundation.layout.Arrangement.Vertical r53, androidx.compose.foundation.layout.Arrangement.Horizontal r54, boolean r55, androidx.compose.ui.unit.Density r56, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> r57, int r58, java.util.List<java.lang.Integer> r59, boolean r60, boolean r61, kotlinx.coroutines.af r62, final androidx.compose.runtime.MutableState<h.ab> r63, androidx.compose.ui.graphics.GraphicsContext r64, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r65, boolean r66, h.g.a.q<? super java.lang.Integer, ? super java.lang.Integer, ? super h.g.a.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, h.ab>, ? extends androidx.compose.ui.layout.MeasureResult> r67) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m2883measureLazyListpIk1_oM(int, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, kotlinx.coroutines.af, androidx.compose.runtime.MutableState, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, boolean, h.g.a.q):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }

    static final ab measureLazyList_pIk1_oM$lambda$8(MutableState mutableState, final List list, final List list2, final boolean z, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new l() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LazyListMeasureKt.measureLazyList_pIk1_oM$lambda$8$0(list, list2, z, (Placeable.PlacementScope) obj);
            }
        });
        ObservableScopeInvalidator.m2964attachToScopeimpl(mutableState);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measureLazyList_pIk1_oM$lambda$8$0(List list, List list2, boolean z, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((LazyListMeasuredItem) list.get(i2)).place(placementScope, z);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((LazyListMeasuredItem) list2.get(i3)).place(placementScope, z);
        }
        return ab.f48028a;
    }
}
