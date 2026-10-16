package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.tooling.CompositionGroup;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.k.n;
import h.n.o;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int ContainsMark_Shift = 26;
    private static final int DataAnchor_Offset = 4;
    private static final long[] EmptyLongArray = new long[0];
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int Mark_Shift = 27;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeBit_Shift = 30;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap, int i2, int i3) {
        MutableIntSet mutableIntSet = mutableIntObjectMap.get(i2);
        if (mutableIntSet == null) {
            mutableIntSet = new MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i2, mutableIntSet);
        }
        mutableIntSet.add(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = iArr[i3] | 268435456;
    }

    public static final SlotTable asGapBufferSlotTable(SlotStorage slotStorage) {
        SlotTable slotTable = slotStorage instanceof SlotTable ? (SlotTable) slotStorage : null;
        if (slotTable != null) {
            return slotTable;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        int length = iArr.length;
        return i3 >= length ? length : iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 29);
    }

    public static final CompositionGroup compositionGroupOf(SlotTable slotTable, int i2) {
        return new SlotTableGroup(slotTable, i2, slotTable.getVersion$runtime());
    }

    private static final boolean containsAnyMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 201326592) != 0;
    }

    private static final boolean containsMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 67108864) != 0;
    }

    private static final int countOneBits(int i2) {
        return Integer.bitCount(i2);
    }

    private static final int dataAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i2) {
        return slice(iArr, n.t(n.u(4, i2), 5));
    }

    static /* synthetic */ List dataAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return dataAnchors(iArr, i2);
    }

    private static final <T> void fastForEach(T[] tArr, l<? super T, ab> lVar) {
        for (T t : tArr) {
            lVar.invoke(t);
        }
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, l<? super T, Boolean> lVar) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (lVar.invoke(arrayList.get(i2)).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, l<? super T, Boolean> lVar) {
        T t;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            t = arrayList.get(size);
        } while (!lVar.invoke(t).booleanValue());
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GapAnchor find(ArrayList<GapAnchor> arrayList, int i2, int i3) {
        int iSearch = search(arrayList, i2, i3);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        return null;
    }

    private static final int getFirstBitSet(long j2) {
        return Long.numberOfTrailingZeros(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    private static final GapAnchor getOrAdd(ArrayList<GapAnchor> arrayList, int i2, int i3, a<GapAnchor> aVar) {
        int iSearch = search(arrayList, i2, i3);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        GapAnchor gapAnchorInvoke = aVar.invoke();
        arrayList.add(-(iSearch + 1), gapAnchorInvoke);
        return gapAnchorInvoke;
    }

    private static final int groupInfo(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i2) {
        return slice(iArr, n.t(n.u(3, i2), 5));
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return groupSizes(iArr, i2);
    }

    private static final boolean hasAux(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0;
    }

    private static final boolean hasMark(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 134217728) != 0;
    }

    private static final boolean hasObjectKey(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5) {
        int i6 = i2 * 5;
        iArr[i6] = i3;
        iArr[i6 + 1] = ((z ? 1 : 0) << 30) | ((z2 ? 1 : 0) << 29) | ((z3 ? 1 : 0) << 28);
        iArr[i6 + 2] = i4;
        iArr[i6 + 3] = 0;
        iArr[i6 + 4] = i5;
    }

    private static final boolean isNode(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 1073741824) != 0;
    }

    private static final int key(int[] iArr, int i2) {
        return iArr[i2 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i2) {
        return slice(iArr, n.t(n.u(0, i2), 5));
    }

    static /* synthetic */ List keys$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return keys(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<GapAnchor> arrayList, int i2, int i3) {
        int iSearch = search(arrayList, i2, i3);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    private static final int nodeCount(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1] & NodeCount_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i2) {
        List<Integer> listSlice = slice(iArr, n.t(n.u(1, i2), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(Integer.valueOf(listSlice.get(i3).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return nodeCounts(iArr, i2);
    }

    private static final int nodeIndex(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 30);
    }

    private static final int parentAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i2) {
        return slice(iArr, n.t(n.u(2, i2), 5));
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return parentAnchors(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<GapAnchor> arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int location$runtime = arrayList.get(i5).getLocation$runtime();
            if (location$runtime < 0) {
                location$runtime += i3;
            }
            int iA = x.a(location$runtime, i2);
            if (iA < 0) {
                i4 = i5 + 1;
            } else {
                if (iA <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(String str, int i2) {
        String strAc = o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(o.ac(str, "androidx.", "a."), "compose.", "c."), "runtime.", "r."), "internal.", "ι."), "ui.", "u."), "Modifier", "μ"), "material.", "m."), "Function", "λ"), "OpaqueKey", "κ"), "MutableState", "σ");
        String strSubstring = strAc.substring(0, Math.min(i2, strAc.length()));
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }

    private static final int toBit(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i2, boolean z) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = ((z ? 1 : 0) << 26) | (iArr[i3] & (-67108865));
    }

    private static final void updateDataAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupKey(int[] iArr, int i2, int i3) {
        iArr[i2 * 5] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 3] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i2, boolean z) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = ((z ? 1 : 0) << 27) | (iArr[i3] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i2, int i3) {
        int i4 = (i2 * 5) + 1;
        iArr[i4] = i3 | (iArr[i4] & (-67108864));
    }

    private static final void updateParentAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 2] = i3;
    }
}
