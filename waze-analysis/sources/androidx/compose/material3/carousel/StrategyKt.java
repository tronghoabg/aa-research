package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.ui.util.MathHelpersKt;
import h.a.aj;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StrategyKt {
    private static final KeylineList createShiftedKeylineListForContentPadding(final KeylineList keylineList, float f2, float f3, float f4, Keyline keyline, int i2) {
        KeylineList keylineList2 = keylineList;
        ArrayList arrayList = new ArrayList(keylineList2.size());
        int size = keylineList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Keyline keyline2 = keylineList2.get(i3);
            if (!keyline2.isAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f4 / arrayList.size();
        KeylineList keylineListKeylineListOf = KeylineListKt.keylineListOf(f2, f3, i2, (keyline.getOffset() - (size2 / 2.0f)) + f4, new l() { // from class: androidx.compose.material3.carousel.StrategyKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StrategyKt.createShiftedKeylineListForContentPadding$lambda$1(keylineList, size2, (KeylineListScope) obj);
            }
        });
        ArrayList arrayList2 = new ArrayList(keylineListKeylineListOf.size());
        int size3 = keylineListKeylineListOf.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList2.add(Keyline.copy$default(keylineListKeylineListOf.get(i4), 0.0f, 0.0f, keylineList.get(i4).getUnadjustedOffset(), false, false, false, 0.0f, 123, null));
        }
        return new KeylineList(arrayList2);
    }

    static final ab createShiftedKeylineListForContentPadding$lambda$1(KeylineList keylineList, float f2, KeylineListScope keylineListScope) {
        KeylineList keylineList2 = keylineList;
        int size = keylineList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keyline keyline = keylineList2.get(i2);
            keylineListScope.add(keyline.getSize() - Math.abs(f2), keyline.isAnchor());
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getEndKeylineSteps(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return i.h();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (!keylineList.isLastFocalItemAtEndOfContainer(f2)) {
            int lastFocalIndex = keylineList.getLastFocalIndex();
            int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
            int i2 = lastNonAnchorIndex - lastFocalIndex;
            if (i2 <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f2, f3));
                return arrayList;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                KeylineList keylineList2 = (KeylineList) i.T(arrayList);
                int i4 = lastNonAnchorIndex - i3;
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getLastNonAnchorIndex(), i4 < i.e(keylineList) ? keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i4 + 1).getSize()) + 1 : 0, f2, f3));
            }
            if (f4 != 0.0f) {
                arrayList.set(i.e(arrayList), createShiftedKeylineListForContentPadding((KeylineList) i.T(arrayList), f2, f3, -f4, ((KeylineList) i.T(arrayList)).getLastFocal(), ((KeylineList) i.T(arrayList)).getLastFocalIndex()));
            }
        } else if (f4 != 0.0f) {
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f2, f3, -f4, keylineList.getLastFocal(), keylineList.getLastFocalIndex()));
            return arrayList;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getEndShiftDistance(List<KeylineList> list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) i.T((List) i.P(list))).getUnadjustedOffset() - ((Keyline) i.T((List) i.T(list))).getUnadjustedOffset(), f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShiftPointRange getShiftPointRange(int i2, FloatList floatList, float f2) {
        float f3 = floatList.get(0);
        Iterator<Integer> it = n.u(1, i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((aj) it).nextInt();
            float f4 = floatList.get(iNextInt);
            if (f2 <= f4) {
                return new ShiftPointRange(iNextInt - 1, iNextInt, lerp(0.0f, 1.0f, f3, f4, f2));
            }
            f3 = f4;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getStartKeylineSteps(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return i.h();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (!keylineList.isFirstFocalItemAtStartOfContainer()) {
            int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
            int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
            if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f2, f3));
                return arrayList;
            }
            for (int i2 = 0; i2 < firstFocalIndex; i2++) {
                KeylineList keylineList2 = (KeylineList) i.T(arrayList);
                int i3 = firstNonAnchorIndex + i2;
                int iE = i.e(keylineList);
                if (i3 > 0) {
                    iE = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i3 - 1).getSize()) - 1;
                }
                arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getFirstNonAnchorIndex(), iE, f2, f3));
            }
            if (f4 != 0.0f) {
                arrayList.set(i.e(arrayList), createShiftedKeylineListForContentPadding((KeylineList) i.T(arrayList), f2, f3, f4, ((KeylineList) i.T(arrayList)).getFirstFocal(), ((KeylineList) i.T(arrayList)).getFirstFocalIndex()));
            }
        } else if (f4 != 0.0f) {
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f2, f3, f4, keylineList.getFirstFocal(), keylineList.getFirstFocalIndex()));
            return arrayList;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getStartShiftDistance(List<KeylineList> list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) i.P((List) i.T(list))).getUnadjustedOffset() - ((Keyline) i.P((List) i.P(list))).getUnadjustedOffset(), f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatList getStepInterpolationPoints(float f2, List<KeylineList> list, boolean z) {
        MutableFloatList mutableFloatListMutableFloatListOf = FloatListKt.mutableFloatListOf(0.0f);
        if (f2 == 0.0f || list.isEmpty()) {
            return mutableFloatListMutableFloatListOf;
        }
        j jVarU = n.u(1, list.size());
        ArrayList arrayList = new ArrayList(i.q(jVarU, 10));
        Iterator<Integer> it = jVarU.iterator();
        while (it.hasNext()) {
            int iNextInt = ((aj) it).nextInt();
            int i2 = iNextInt - 1;
            KeylineList keylineList = list.get(i2);
            KeylineList keylineList2 = list.get(iNextInt);
            mutableFloatListMutableFloatListOf.add(iNextInt == i.e(list) ? 1.0f : mutableFloatListMutableFloatListOf.get(i2) + ((z ? ((Keyline) i.P(keylineList2)).getUnadjustedOffset() - ((Keyline) i.P(keylineList)).getUnadjustedOffset() : ((Keyline) i.T(keylineList)).getUnadjustedOffset() - ((Keyline) i.T(keylineList2)).getUnadjustedOffset()) / f2));
            arrayList.add(true);
        }
        return mutableFloatListMutableFloatListOf;
    }

    public static final float lerp(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : MathHelpersKt.lerp(f2, f3, (f6 - f4) / (f5 - f4));
    }

    private static final List<Keyline> move(List<Keyline> list, int i2, int i3) {
        Keyline keyline = list.get(i2);
        list.remove(i2);
        list.add(i3, keyline);
        return list;
    }

    private static final KeylineList moveKeylineAndCreateShiftedKeylineList(final KeylineList keylineList, final int i2, final int i3, float f2, float f3) {
        float size = keylineList.get(i2).getSize() - keylineList.get(i2).getCutoff();
        int i4 = i2 > i3 ? 1 : -1;
        return KeylineListKt.keylineListOf(f2, f3, keylineList.getPivotIndex() + i4, keylineList.getPivot().getOffset() + ((size + f3) * i4), new l() { // from class: androidx.compose.material3.carousel.StrategyKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return StrategyKt.moveKeylineAndCreateShiftedKeylineList$lambda$0(keylineList, i2, i3, (KeylineListScope) obj);
            }
        });
    }

    static final ab moveKeylineAndCreateShiftedKeylineList$lambda$0(KeylineList keylineList, int i2, int i3, KeylineListScope keylineListScope) {
        List listAq = i.aq(keylineList);
        move(listAq, i2, i3);
        int size = listAq.size();
        for (int i4 = 0; i4 < size; i4++) {
            Keyline keyline = (Keyline) listAq.get(i4);
            keylineListScope.add(keyline.getSize(), keyline.isAnchor());
        }
        return ab.f48028a;
    }
}
