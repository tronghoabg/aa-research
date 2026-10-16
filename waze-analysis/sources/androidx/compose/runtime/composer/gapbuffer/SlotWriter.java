package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberObserverHolder;
import h.a.ac;
import h.a.c;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotWriter {
    private ArrayList<GapAnchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private MutableIntList pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap;
    private final SlotTable table;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.composer.gapbuffer.SlotWriter$groupSlots$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, a {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        AnonymousClass1(int i2, int i3, SlotWriter slotWriter) {
            this.$end = i3;
            this.this$0 = slotWriter;
            this.current = i2;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            SlotWriter slotWriter = this.this$0;
            Object[] objArr = slotWriter.slots;
            int i2 = this.current;
            this.current = i2 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i2)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.m7429getSlots();
        this.anchors = slotTable.getAnchors$runtime();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime();
        this.calledByMap = slotTable.getCalledByMap$runtime();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static /* synthetic */ GapAnchor anchor$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i2);
    }

    private final int auxIndex(int[] iArr, int i2) {
        return dataIndex(iArr, i2) + Integer.bitCount(iArr[(i2 * 5) + 1] >> 29);
    }

    private final boolean childContainsAnyMarks(int i2) {
        int iGroupSize = groupSize(i2) + i2;
        int iGroupSize2 = i2 + 1;
        while (iGroupSize2 < iGroupSize) {
            if ((this.groups[(groupIndexToAddress(iGroupSize2) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iGroupSize2 += groupSize(iGroupSize2);
        }
        return false;
    }

    private final int childGroupAtIndex(int i2, int i3) {
        int iGroupSize = groupSize(i2) + i2;
        int iGroupSize2 = i2 + 1;
        int i4 = 0;
        while (iGroupSize2 < iGroupSize && i4 < i3) {
            int iGroupIndexToAddress = groupIndexToAddress(iGroupSize2);
            iGroupSize2 += SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
            if (iGroupSize2 < iGroupSize && (this.groups[(iGroupIndexToAddress * 5) + 1] & 536870912) == 0) {
                i4++;
            }
        }
        return iGroupSize2;
    }

    private final void clearSlotGap() {
        int i2 = this.slotsGapStart;
        int i3 = this.slotsGapLen + i2;
        Object[] objArr = this.slots;
        x.f(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int i2) {
        return i2 >= 0 && (this.groups[(groupIndexToAddress(i2) * 5) + 1] & 201326592) != 0;
    }

    private final boolean containsGroupMark(int i2) {
        return i2 >= 0 && (this.groups[(groupIndexToAddress(i2) * 5) + 1] & 67108864) != 0;
    }

    private final int dataAnchorToDataIndex(int i2, int i3, int i4) {
        return i2 < 0 ? (i4 - i3) + i2 + 1 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i2) {
        return i2 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i2 * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i2) {
        return i2 + (this.slotsGapLen * (i2 < this.slotsGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int i2, int i3, int i4, int i5) {
        return i2 > i3 ? -(((i5 - i4) - i2) + 1) : i2;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listAf = i.af(i.aj(listDataAnchors$default, n.u(0, this.groupGapStart)), i.aj(listDataAnchors$default, new j(this.groupGapStart + this.groupGapLen, (iArr.length / 5) - 1)));
        ArrayList arrayList = new ArrayList(listAf.size());
        int size = listAf.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listAf.get(i2)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i2, int i3, int i4) {
        int iParentIndexToAnchor = parentIndexToAnchor(i2, this.groupGapStart);
        while (i4 < i3) {
            int[] iArr = this.groups;
            iArr[(groupIndexToAddress(i4) * 5) + 2] = iParentIndexToAnchor;
            int iGroupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress(i4)) + i4;
            fixParentAnchorsFor(i4, iGroupSize, i4 + 1);
            i4 = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int getCurrentGroupSlotIndex() {
        return groupSlotIndex(this.parent);
    }

    private final void groupAsString(StringBuilder sb, int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        sb.append("Group(");
        if (i2 < 10) {
            sb.append(' ');
        }
        if (i2 < 100) {
            sb.append(' ');
        }
        if (i2 < 1000) {
            sb.append(' ');
        }
        sb.append(i2);
        if (iGroupIndexToAddress != i2) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        sb.append('^');
        int i3 = iGroupIndexToAddress * 5;
        int i4 = i3 + 2;
        sb.append(parentAnchorToIndex(this.groups[i4]));
        sb.append(": key=");
        sb.append(this.groups[i3]);
        sb.append(", nodes=");
        int i5 = i3 + 1;
        sb.append(this.groups[i5] & 67108863);
        sb.append(", dataAnchor=");
        sb.append(this.groups[i3 + 4]);
        sb.append(", parentAnchor=");
        sb.append(this.groups[i4]);
        int[] iArr = this.groups;
        if ((iArr[i5] & 1073741824) != 0) {
            sb.append(", node=".concat(String.valueOf(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(iArr, iGroupIndexToAddress))]), 10))));
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2 + 1));
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i6 = iSlotIndex; i6 < iDataIndex; i6++) {
                if (i6 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i6)]), 10));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int i2) {
        return i2 + (this.groupGapLen * (i2 < this.groupGapStart ? 0 : 1));
    }

    private final GapGroupSourceInformation groupSourceInformationFor(int i2, String str) {
        HashMap<GapAnchor, GapGroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            return null;
        }
        HashMap<GapAnchor, GapGroupSourceInformation> map2 = map;
        GapAnchor gapAnchorAnchor = anchor(i2);
        GapGroupSourceInformation gapGroupSourceInformation = map2.get(gapAnchorAnchor);
        if (gapGroupSourceInformation == null) {
            gapGroupSourceInformation = new GapGroupSourceInformation(0, str, 0);
            if (str == null) {
                int i3 = this.currentGroup;
                int iGroupSize = i2 + 1;
                while (iGroupSize < i3) {
                    gapGroupSourceInformation.reportGroup(this, iGroupSize);
                    iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
                }
            }
            map2.put(gapAnchorAnchor, gapGroupSourceInformation);
        }
        return gapGroupSourceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i2) {
        if (i2 > 0) {
            int i3 = this.currentGroup;
            moveGroupGapTo(i3);
            int i4 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i6 = length - i5;
            if (i5 < i2) {
                int iMax = Math.max(Math.max(length + length, i6 + i2), 32);
                int i7 = iMax * 5;
                int i8 = iMax - i6;
                int[] iArr2 = new int[i7];
                c.ar(iArr, iArr2, 0, 0, i4 * 5);
                c.ar(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.groups = iArr2;
                i5 = i8;
            }
            int i9 = this.currentGroupEnd;
            if (i9 >= i4) {
                this.currentGroupEnd = i9 + i2;
            }
            int i10 = i4 + i2;
            this.groupGapStart = i10;
            this.groupGapLen = i5 - i2;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i6 > 0 ? dataIndex(i3 + i2) : 0, this.slotsGapOwner >= i4 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i11 = i4; i11 < i10; i11++) {
                this.groups[(i11 * 5) + 4] = iDataIndexToDataAnchor;
            }
            int i12 = this.slotsGapOwner;
            if (i12 >= i4) {
                this.slotsGapOwner = i12 + i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int i2, int i3) {
        if (i2 > 0) {
            moveSlotGapTo(this.currentSlot, i3);
            int i4 = this.slotsGapStart;
            int i5 = this.slotsGapLen;
            if (i5 < i2) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i6 = length - i5;
                int iMax = Math.max(Math.max(length + length, i6 + i2), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i7 = 0; i7 < iMax; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = iMax - i6;
                int i9 = i5 + i4;
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(objArr, i9, objArr2, i4 + i8, length - i9);
                this.slots = objArr2;
                i5 = i8;
            }
            int i10 = this.currentSlotEnd;
            if (i10 >= i4) {
                this.currentSlotEnd = i10 + i2;
            }
            this.slotsGapStart = i4 + i2;
            this.slotsGapLen = i5 - i2;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listKeys$default.get(i2);
            ((Number) obj).intValue();
            int i3 = this.groupGapStart;
            if (i2 < i3 || i2 >= i3 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.parent;
        }
        slotWriter.markGroup(i2);
    }

    private final void moveAnchors(int i2, int i3, int i4) {
        GapAnchor gapAnchor;
        int iAnchorIndex;
        int size$runtime = getSize$runtime();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i2, size$runtime);
        ArrayList arrayList = new ArrayList();
        while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((gapAnchor = this.anchors.get(iLocationOf)))) >= i2 && iAnchorIndex < i2 + i4) {
            arrayList.add(gapAnchor);
            this.anchors.remove(iLocationOf);
        }
        int i5 = i3 - i2;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            GapAnchor gapAnchor2 = (GapAnchor) arrayList.get(i6);
            int iAnchorIndex2 = anchorIndex(gapAnchor2) + i5;
            if (iAnchorIndex2 >= this.groupGapStart) {
                gapAnchor2.setLocation$runtime(-(size$runtime - iAnchorIndex2));
            } else {
                gapAnchor2.setLocation$runtime(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime), gapAnchor2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i2) {
        int i3 = this.groupGapLen;
        int i4 = this.groupGapStart;
        if (i4 != i2) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i4, i2);
            }
            if (i3 > 0) {
                int[] iArr = this.groups;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                int i8 = i5 + i6;
                if (i2 < i4) {
                    c.ar(iArr, iArr, i8, i5, i7);
                } else {
                    c.ar(iArr, iArr, i7, i6 + i7, i8);
                }
            }
            if (i2 < i4) {
                i4 = i2 + i3;
            }
            int capacity = getCapacity();
            if (i4 >= capacity) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i4 < capacity) {
                int i9 = (i4 * 5) + 2;
                int i10 = this.groups[i9];
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i10), i2);
                if (iParentIndexToAnchor != i10) {
                    this.groups[i9] = iParentIndexToAnchor;
                }
                i4++;
                if (i4 == i2) {
                    i4 += i3;
                }
            }
        }
        this.groupGapStart = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int i2, int i3) {
        int i4 = this.slotsGapLen;
        int i5 = this.slotsGapStart;
        int i6 = this.slotsGapOwner;
        if (i5 != i2) {
            Object[] objArr = this.slots;
            if (i2 < i5) {
                System.arraycopy(objArr, i2, objArr, i2 + i4, i5 - i2);
            } else {
                int i7 = i5 + i4;
                System.arraycopy(objArr, i7, objArr, i5, (i2 + i4) - i7);
            }
        }
        int iMin = Math.min(i3 + 1, getSize$runtime());
        if (i6 != iMin) {
            int length = this.slots.length - i4;
            if (iMin < i6) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i6);
                int i8 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int i9 = (iGroupIndexToAddress * 5) + 4;
                    int i10 = this.groups[i9];
                    if (i10 < 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i9] = -((length - i10) + 1);
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i8) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i6);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int i11 = (iGroupIndexToAddress3 * 5) + 4;
                    int i12 = this.groups[i11];
                    if (i12 >= 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i11] = i12 + length + 1;
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = i2;
    }

    private final int nodeIndex(int[] iArr, int i2) {
        return dataIndex(iArr, i2);
    }

    private final int parentAnchorToIndex(int i2) {
        return i2 > -2 ? i2 : getSize$runtime() + i2 + 2;
    }

    private final int parentIndexToAnchor(int i2, int i3) {
        return i2 < i3 ? i2 : -((getSize$runtime() - i2) + 2);
    }

    private final Object rawUpdate(Object obj) {
        Object objSkip = skip();
        set(obj);
        return objSkip;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m7423isNotEmptyimpl(mutableIntList)) {
                m7430updateContainsMarkNowqrM0pCk(PrioritySet.m7425takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    private final boolean removeAnchors(int i2, int i3, HashMap<GapAnchor, GapGroupSourceInformation> map) {
        int i4 = i3 + i2;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i4, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i5 = iLocationOf + 1;
        int i6 = 0;
        while (iLocationOf >= 0) {
            GapAnchor gapAnchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(gapAnchor);
            if (iAnchorIndex < i2) {
                break;
            }
            if (iAnchorIndex < i4) {
                gapAnchor.setLocation$runtime(Integer.MIN_VALUE);
                if (map != null) {
                    map.remove(gapAnchor);
                }
                if (i6 == 0) {
                    i6 = iLocationOf + 1;
                }
                i5 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z = i5 < i6;
        if (z) {
            this.anchors.subList(i5, i6).clear();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int i2, int i3) {
        if (i3 > 0) {
            ArrayList<GapAnchor> arrayList = this.anchors;
            moveGroupGapTo(i2);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(i2, i3, this.sourceInformationMap);
            this.groupGapStart = i2;
            this.groupGapLen += i3;
            int i4 = this.slotsGapOwner;
            if (i4 > i2) {
                this.slotsGapOwner = Math.max(i2, i4 - i3);
            }
            int i5 = this.currentGroupEnd;
            if (i5 >= this.groupGapStart) {
                this.currentGroupEnd = i5 - i3;
            }
            int i6 = this.parent;
            if (containsGroupMark(i6)) {
                updateContainsMark(i6);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.slotsGapLen;
            int i6 = i2 + i3;
            moveSlotGapTo(i6, i4);
            this.slotsGapStart = i2;
            this.slotsGapLen = i5 + i3;
            Object[] objArr = this.slots;
            x.f(objArr, "<this>");
            Arrays.fill(objArr, i2, i6, (Object) null);
            int i7 = this.currentSlotEnd;
            if (i7 >= i2) {
                this.currentSlotEnd = i7 - i3;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i2) {
        return i2 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i2), this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    private final void startGroup(int i2, Object obj, boolean z, Object obj2) {
        int iGroupSize;
        GapGroupSourceInformation gapGroupSourceInformationSourceInformationOf$runtime;
        IntStack intStack = this.nodeCountStack;
        int i3 = this.parent;
        int i4 = this.insertCount;
        intStack.push(this.nodeCount);
        if (i4 > 0) {
            int i5 = this.currentGroup;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i5));
            insertGroups(1);
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            int iGroupIndexToAddress = groupIndexToAddress(i5);
            ?? r11 = obj != Composer.Companion.getEmpty() ? 1 : 0;
            ?? r12 = (z || obj2 == Composer.Companion.getEmpty()) ? 0 : 1;
            int i6 = this.slotsGapLen;
            int i7 = this.slotsGapStart;
            int length = this.slots.length;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(iDataIndex, i7, i6, length);
            if (iDataIndexToDataAnchor >= 0 && this.slotsGapOwner < i5) {
                iDataIndexToDataAnchor = -(((length - i6) - iDataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, i2, z, r11, r12, this.parent, iDataIndexToDataAnchor);
            int i8 = (z ? 1 : 0) + r11 + r12;
            if (i8 > 0) {
                insertSlots(i8, i5);
                Object[] objArr = this.slots;
                int i9 = this.currentSlot;
                if (z) {
                    objArr[i9] = obj2;
                    i9++;
                }
                if (r11 != 0) {
                    objArr[i9] = obj;
                    i9++;
                }
                if (r12 != 0) {
                    objArr[i9] = obj2;
                    i9++;
                }
                this.currentSlot = i9;
            }
            this.nodeCount = 0;
            iGroupSize = i5 + 1;
            this.parent = i5;
            this.currentGroup = iGroupSize;
            if (i3 >= 0 && (gapGroupSourceInformationSourceInformationOf$runtime = sourceInformationOf$runtime(i3)) != null) {
                gapGroupSourceInformationSourceInformationOf$runtime.reportGroup(this, i5);
            }
        } else {
            this.startStack.push(i3);
            saveCurrentGroupEnd();
            int i10 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i10);
            if (!x.n(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iGroupIndexToAddress2 * 5) + 1] & 67108863;
            this.parent = i10;
            this.currentGroup = i10 + 1;
            iGroupSize = i10 + SlotTableKt.groupSize(iArr, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    private final void updateAnchors(int i2, int i3) {
        GapAnchor gapAnchor;
        int location$runtime;
        GapAnchor gapAnchor2;
        int location$runtime2;
        int i4;
        int capacity = getCapacity() - this.groupGapLen;
        ArrayList<GapAnchor> arrayList = this.anchors;
        if (i2 >= i3) {
            for (int iLocationOf = SlotTableKt.locationOf(arrayList, i3, capacity); iLocationOf < this.anchors.size() && (location$runtime = (gapAnchor = this.anchors.get(iLocationOf)).getLocation$runtime()) >= 0; iLocationOf++) {
                gapAnchor.setLocation$runtime(-(capacity - location$runtime));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(arrayList, i2, capacity); iLocationOf2 < this.anchors.size() && (location$runtime2 = (gapAnchor2 = this.anchors.get(iLocationOf2)).getLocation$runtime()) < 0 && (i4 = location$runtime2 + capacity) < i3; iLocationOf2++) {
            gapAnchor2.setLocation$runtime(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int i2) {
        if (i2 >= 0) {
            MutableIntList mutableIntListM7418constructorimpl$default = this.pendingRecalculateMarks;
            if (mutableIntListM7418constructorimpl$default == null) {
                mutableIntListM7418constructorimpl$default = PrioritySet.m7418constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntListM7418constructorimpl$default;
            }
            PrioritySet.m7415addimpl(mutableIntListM7418constructorimpl$default, i2);
        }
    }

    /* renamed from: updateContainsMarkNow-qrM0pCk, reason: not valid java name */
    private final void m7430updateContainsMarkNowqrM0pCk(int i2, MutableIntList mutableIntList) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(i2);
        int[] iArr = this.groups;
        if (((iArr[(iGroupIndexToAddress * 5) + 1] & 67108864) != 0) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(i2);
            if (iParent >= 0) {
                PrioritySet.m7415addimpl(mutableIntList, iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = dataIndexToDataAnchor(i3, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    private final void updateNodeOfGroup(int i2, Object obj) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int[] iArr = this.groups;
        if (iGroupIndexToAddress >= iArr.length || (iArr[(iGroupIndexToAddress * 5) + 1] & 1073741824) == 0) {
            ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + i2 + " that was not created with as a node group");
        }
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = obj;
    }

    public final void advanceBy(int i2) {
        if (i2 < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (this.insertCount > 0) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.currentGroup + i2;
        if (i3 < this.parent || i3 > this.currentGroupEnd) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i3;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i3));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
    }

    public final GapAnchor anchor(int i2) {
        ArrayList<GapAnchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i2, getSize$runtime());
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        if (i2 > this.groupGapStart) {
            i2 = -(getSize$runtime() - i2);
        }
        GapAnchor gapAnchor = new GapAnchor(i2);
        arrayList.add(-(iSearch + 1), gapAnchor);
        return gapAnchor;
    }

    public final int anchorIndex(GapAnchor gapAnchor) {
        int location$runtime = gapAnchor.getLocation$runtime();
        return location$runtime < 0 ? getSize$runtime() + location$runtime : location$runtime;
    }

    public final void appendSlot(GapAnchor gapAnchor, Object obj) {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        int iAnchorIndex = anchorIndex(gapAnchor);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iAnchorIndex + 1));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        insertSlots(1, iAnchorIndex);
        if (i2 >= iDataIndex) {
            i2++;
            i3++;
        }
        this.slots[iDataIndex] = obj;
        this.currentSlot = i2;
        this.currentSlotEnd = i3;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i2 = this.insertCount;
        this.insertCount = i2 + 1;
        if (i2 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final Object clear(int i2) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(i2);
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = Composer.Companion.getEmpty();
        return obj;
    }

    public final void close(boolean z) {
        this.closed = true;
        if (z && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        int i2 = this.insertCount;
        int i3 = this.currentGroup;
        int i4 = this.currentGroupEnd;
        int i5 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i5);
        int i6 = i3 - i5;
        int i7 = this.nodeCount;
        int i8 = (iGroupIndexToAddress * 5) + 1;
        int i9 = this.groups[i8] & 1073741824;
        if (i2 > 0) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i5)) != null) {
                MutableObjectList<Object> mutableObjectList2 = mutableObjectList;
                Object[] objArr = mutableObjectList2.content;
                int i10 = mutableObjectList2._size;
                for (int i11 = 0; i11 < i10; i11++) {
                    rawUpdate(objArr[i11]);
                }
                mutableIntObjectMap.remove(i5);
            }
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i7);
            this.nodeCount = this.nodeCountStack.pop() + (i9 != 0 ? 1 : i7);
            int iParent = parent(this.groups, i5);
            this.parent = iParent;
            int size$runtime = iParent < 0 ? getSize$runtime() : groupIndexToAddress(iParent + 1);
            iDataIndex = size$runtime >= 0 ? dataIndex(this.groups, size$runtime) : 0;
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return i7;
        }
        if (i3 != i4) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        int[] iArr = this.groups;
        int i12 = iArr[i8] & 67108863;
        SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, i6);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i7);
        int iPop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = iPop;
        int iParent2 = parent(this.groups, i5);
        int iPop2 = this.nodeCountStack.pop();
        this.nodeCount = iPop2;
        if (iParent2 == iPop) {
            this.nodeCount = iPop2 + (i9 == 0 ? i7 - i12 : 0);
            return i7;
        }
        int i13 = i6 - iGroupSize;
        int i14 = i9 != 0 ? 0 : i7 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iParent2 != 0 && iParent2 != iPop) {
                if (i14 == 0) {
                    if (i13 == 0) {
                        break;
                    }
                    i14 = 0;
                }
                int iGroupIndexToAddress2 = groupIndexToAddress(iParent2);
                int i15 = (iGroupIndexToAddress2 * 5) + 1;
                if (i13 != 0) {
                    SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i13);
                }
                if (i14 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress2, (iArr2[i15] & 67108863) + i14);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[i15] & 1073741824) != 0) {
                    i14 = 0;
                }
                iParent2 = parent(iArr3, iParent2);
            }
            iDataIndex = i14;
        }
        this.nodeCount += iDataIndex;
        return i7;
    }

    public final void endInsert() {
        if (this.insertCount <= 0) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i2 = this.insertCount - 1;
        this.insertCount = i2;
        if (i2 == 0) {
            if (this.nodeCountStack.tos != this.startStack.tos) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void ensureStarted(int i2) {
        if (this.insertCount > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i3 = this.parent;
        if (i3 != i2) {
            if (i2 < i3 || i2 >= this.currentGroupEnd) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + i2 + " must be a subgroup of the group at " + i3);
            }
            int i4 = this.currentGroup;
            int i5 = this.currentSlot;
            int i6 = this.currentSlotEnd;
            this.currentGroup = i2;
            startGroup();
            this.currentGroup = i4;
            this.currentSlot = i5;
            this.currentSlotEnd = i6;
        }
    }

    public final void forAllData(int i2, p<? super Integer, Object, ab> pVar) {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i2)); iDataIndex2 < iDataIndex; iDataIndex2++) {
            pVar.invoke(Integer.valueOf(iDataIndex2), this.slots[dataIndexToDataAddress(iDataIndex2)]);
        }
    }

    public final void forAllDataInRememberOrder(int i2, p<? super Integer, Object, ab> pVar) {
        int i3;
        int i4;
        int afterGroupIndex;
        p<? super Integer, Object, ab> pVar2 = pVar;
        int iParent = parent(i2);
        int size$runtime = getSize$runtime();
        int iGroupSize = groupSize(i2) + i2;
        o oVar = null;
        int i5 = i2;
        MutableIntSet mutableIntSetMutableIntSetOf = null;
        MutableIntList mutableIntList = null;
        while (i5 < iGroupSize) {
            int iDataIndex = dataIndex(i5);
            int i6 = i5 + 1;
            int iDataIndex2 = dataIndex(i6);
            while (true) {
                i3 = 0;
                if (iDataIndex >= iDataIndex2) {
                    break;
                }
                Object obj = this.slots[dataIndexToDataAddress(iDataIndex)];
                if (!(obj instanceof RememberObserverHolder) || (afterGroupIndex = GapComposerKt.asGapRememberObserverHolder((RememberObserverHolder) obj).getAfterGroupIndex()) < 0) {
                    pVar2.invoke(Integer.valueOf(iDataIndex), obj);
                } else {
                    int iChildGroupAtIndex = childGroupAtIndex(i5, afterGroupIndex);
                    if (mutableIntSetMutableIntSetOf == null) {
                        mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
                    }
                    if (mutableIntList == null) {
                        mutableIntList = new MutableIntList(i3, 1, oVar);
                    }
                    mutableIntSetMutableIntSetOf.add(iChildGroupAtIndex);
                    mutableIntList.add(iChildGroupAtIndex);
                    mutableIntList.add(iDataIndex);
                }
                iDataIndex++;
            }
            int iParent2 = i6 < size$runtime ? parent(i6) : -1;
            if (iParent2 == i5) {
                i4 = size$runtime;
            } else {
                while (true) {
                    if (mutableIntList == null || mutableIntSetMutableIntSetOf == null || !mutableIntSetMutableIntSetOf.remove(i5)) {
                        i4 = size$runtime;
                    } else {
                        int i7 = mutableIntList._size;
                        int i8 = i7 / 2;
                        int i9 = i3;
                        int i10 = i9;
                        while (i10 < i8) {
                            int i11 = i10 + i10;
                            int i12 = size$runtime;
                            int i13 = mutableIntList.get(i11);
                            if (i13 == i5) {
                                int i14 = mutableIntList.get(i11 + 1);
                                pVar2.invoke(Integer.valueOf(i14), this.slots[dataIndexToDataAddress(i14)]);
                            } else if (i11 != i9) {
                                int i15 = i9 + 1;
                                mutableIntList.set(i9, i13);
                                i9 += 2;
                                mutableIntList.set(i15, mutableIntList.get(i11 + 1));
                            } else {
                                i9 += 2;
                            }
                            i10++;
                            pVar2 = pVar;
                            size$runtime = i12;
                        }
                        i4 = size$runtime;
                        if (i9 != i7) {
                            mutableIntList.removeRange(i9, i7);
                        }
                    }
                    if (i5 == i2 || iParent == iParent2) {
                        break;
                    }
                    i5 = iParent;
                    size$runtime = i4;
                    i3 = 0;
                    iParent = parent(iParent);
                    pVar2 = pVar;
                }
            }
            pVar2 = pVar;
            iParent = iParent2;
            i5 = i6;
            size$runtime = i4;
            oVar = null;
        }
    }

    public final void forEachTailSlot(int i2, int i3, p<? super Integer, Object, ab> pVar) {
        int iSlotsStartIndex$runtime = slotsStartIndex$runtime(i2);
        int iSlotsEndIndex$runtime = slotsEndIndex$runtime(i2);
        for (int iMax = Math.max(iSlotsStartIndex$runtime, iSlotsEndIndex$runtime - i3); iMax < iSlotsEndIndex$runtime; iMax++) {
            pVar.invoke(Integer.valueOf(iMax), this.slots[dataIndexToDataAddress(iMax)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime() {
        return getCapacity() - this.groupGapLen;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    public final SlotTable getTable$runtime() {
        return this.table;
    }

    public final Object groupAux(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int[] iArr = this.groups;
        return (iArr[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, iGroupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i2) {
        return this.groups[groupIndexToAddress(i2) * 5];
    }

    public final Object groupObjectKey(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int i2) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(i2));
    }

    public final int groupSlotIndex(int i2) {
        MutableObjectList<Object> mutableObjectList;
        int iSlotsStartIndex$runtime = this.currentSlot - slotsStartIndex$runtime(i2);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        int size = 0;
        if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i2)) != null) {
            size = mutableObjectList.getSize();
        }
        return iSlotsStartIndex$runtime + size;
    }

    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i2 = this.currentGroup;
        return new AnonymousClass1(iDataIndex, dataIndex(iArr, groupIndexToAddress(i2 + groupSize(i2))), this);
    }

    public final boolean hasObjectKey(int i2) {
        return (this.groups[(groupIndexToAddress(i2) * 5) + 1] & 536870912) != 0;
    }

    public final boolean inGroup(GapAnchor gapAnchor, GapAnchor gapAnchor2) {
        int iAnchorIndex = anchorIndex(gapAnchor);
        int iGroupSize = SlotTableKt.groupSize(this.groups, iAnchorIndex) + iAnchorIndex;
        int location$runtime = gapAnchor2.getLocation$runtime();
        return iAnchorIndex <= location$runtime && location$runtime < iGroupSize;
    }

    public final boolean indexInCurrentGroup(int i2) {
        return indexInGroup(i2, this.currentGroup);
    }

    public final boolean indexInGroup(int i2, int i3) {
        int iIndexOf;
        int capacity;
        if (i3 == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (i3 <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(i3)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(i3);
            capacity = iGroupSize + i3;
        }
        return i2 > i3 && i2 < capacity;
    }

    public final boolean indexInParent(int i2) {
        int i3 = this.parent;
        if (i2 <= i3 || i2 >= this.currentGroupEnd) {
            return i3 == 0 && i2 == 0;
        }
        return true;
    }

    public final void insertAux(Object obj) {
        if (this.insertCount < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i2 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        if ((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i2);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i3 = this.currentSlot;
        if (i3 > iAuxIndex) {
            int i4 = iDataIndexToDataAddress + 1;
            int i5 = i3 - iAuxIndex;
            if (i5 >= 3) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i5 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[i4];
            }
            Object[] objArr2 = this.slots;
            objArr2[i4] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i2 = this.currentGroup;
        return i2 < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i2) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean isValid(int i2) {
        return groupIndexToAddress(i2) * 5 < this.groups.length;
    }

    public final void markGroup(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int[] iArr = this.groups;
        int i3 = (iGroupIndexToAddress * 5) + 1;
        if ((iArr[i3] & 134217728) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, iGroupIndexToAddress, true);
        if ((this.groups[i3] & 67108864) == 0) {
            updateContainsMark(parent(i2));
        }
    }

    public final List<GapAnchor> moveFrom(SlotTable slotTable, int i2, boolean z) {
        SlotTable slotTable2;
        int i3;
        if (this.insertCount <= 0) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (i2 != 0) {
            slotTable2 = slotTable;
            i3 = i2;
        } else {
            if (this.currentGroup == 0 && this.table.getGroupsSize() == 0 && SlotTableKt.groupSize(slotTable.getGroups(), 0) == slotTable.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<GapAnchor> arrayList = this.anchors;
                HashMap<GapAnchor, GapGroupSourceInformation> map = this.sourceInformationMap;
                MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
                int[] groups = slotTable.getGroups();
                int groupsSize = slotTable.getGroupsSize();
                Object[] objArrM7429getSlots = slotTable.m7429getSlots();
                int slotsSize = slotTable.getSlotsSize();
                HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap$runtime = slotTable.getSourceInformationMap$runtime();
                MutableIntObjectMap<MutableIntSet> calledByMap$runtime = slotTable.getCalledByMap$runtime();
                this.groups = groups;
                this.slots = objArrM7429getSlots;
                this.anchors = slotTable.getAnchors$runtime();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = objArrM7429getSlots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap$runtime;
                this.calledByMap = calledByMap$runtime;
                slotTable.setTo$runtime(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
                return this.anchors;
            }
            slotTable2 = slotTable;
            i3 = 0;
        }
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        try {
            List<GapAnchor> listMoveGroup = Companion.moveGroup(slotWriterOpenWriter, i3, this, true, true, z);
            slotWriterOpenWriter.close(true);
            return listMoveGroup;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public final void moveGroup(int i2) {
        int[] iArr;
        int i3;
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (i2 < 0) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.currentGroup;
        int i5 = this.parent;
        int i6 = this.currentGroupEnd;
        int i7 = i2;
        int iGroupSize = i4;
        while (true) {
            iArr = this.groups;
            if (i7 <= 0) {
                break;
            }
            iGroupSize += SlotTableKt.groupSize(iArr, groupIndexToAddress(iGroupSize));
            if (iGroupSize > i6) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
            i7--;
        }
        int iGroupSize2 = SlotTableKt.groupSize(iArr, groupIndexToAddress(iGroupSize));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i8 = iGroupSize + iGroupSize2;
        int iDataIndex3 = dataIndex(this.groups, groupIndexToAddress(i8));
        int i9 = iDataIndex3 - iDataIndex2;
        insertSlots(i9, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr2 = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i8) * 5;
        c.ar(iArr2, iArr2, groupIndexToAddress(i4) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i9 > 0) {
            Object[] objArr = this.slots;
            int iDataIndexToDataAddress = dataIndexToDataAddress(iDataIndex2 + i9);
            System.arraycopy(objArr, iDataIndexToDataAddress, objArr, iDataIndex, dataIndexToDataAddress(iDataIndex3 + i9) - iDataIndexToDataAddress);
        }
        int i10 = iDataIndex2 + i9;
        int i11 = i10 - iDataIndex;
        int i12 = this.slotsGapStart;
        int i13 = this.slotsGapLen;
        int length = this.slots.length;
        int i14 = this.slotsGapOwner;
        int i15 = i4 + iGroupSize2;
        int i16 = i4;
        while (i16 < i15) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i16);
            int i17 = i11;
            int iDataIndex4 = dataIndex(iArr2, iGroupIndexToAddress2) - i17;
            if (i14 < iGroupIndexToAddress2) {
                i3 = i12;
                i12 = 0;
            } else {
                i3 = i12;
            }
            updateDataIndex(iArr2, iGroupIndexToAddress2, dataIndexToDataAnchor(iDataIndex4, i12, i13, length));
            i16++;
            i12 = i3;
            i11 = i17;
        }
        moveAnchors(i8, i4, iGroupSize2);
        if (removeGroups(i8, iGroupSize2)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i5, this.currentGroupEnd, i4);
        if (i9 > 0) {
            removeSlots(i10, i9, i8 - 1);
        }
    }

    public final List<GapAnchor> moveIntoGroupFrom(int i2, SlotTable slotTable, int i3) {
        if (this.insertCount > 0 || groupSize(this.currentGroup + i2) != 1) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i4 = this.currentGroup;
        int i5 = this.currentSlot;
        int i6 = this.currentSlotEnd;
        advanceBy(i2);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            List<GapAnchor> listMoveGroup$default = Companion.moveGroup$default(Companion, slotWriterOpenWriter, i3, this, false, true, false, 32, null);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i4;
            this.currentSlot = i5;
            this.currentSlotEnd = i6;
            return listMoveGroup$default;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.composer.gapbuffer.GapAnchor> moveTo(androidx.compose.runtime.composer.gapbuffer.GapAnchor r16, int r17, androidx.compose.runtime.composer.gapbuffer.SlotWriter r18) {
        /*
            r15 = this;
            r3 = r18
            int r0 = r3.insertCount
            java.lang.String r9 = "Check failed"
            if (r0 > 0) goto Lb
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r9)
        Lb:
            int r0 = r15.insertCount
            if (r0 == 0) goto L12
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r9)
        L12:
            boolean r0 = r16.getValid()
            if (r0 != 0) goto L1b
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r9)
        L1b:
            int r0 = r15.anchorIndex(r16)
            int r2 = r0 + r17
            int r10 = r15.currentGroup
            if (r10 > r2) goto L29
            int r0 = r15.currentGroupEnd
            if (r2 < r0) goto L2c
        L29:
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r9)
        L2c:
            int r11 = r15.parent(r2)
            int r12 = r15.groupSize(r2)
            boolean r0 = r15.isNode(r2)
            r13 = 1
            if (r0 == 0) goto L3d
            r14 = r13
            goto L42
        L3d:
            int r0 = r15.nodeCount(r2)
            r14 = r0
        L42:
            androidx.compose.runtime.composer.gapbuffer.SlotWriter$Companion r0 = androidx.compose.runtime.composer.gapbuffer.SlotWriter.Companion
            r7 = 32
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r15
            java.util.List r0 = androidx.compose.runtime.composer.gapbuffer.SlotWriter.Companion.moveGroup$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r15.updateContainsMark(r11)
            r2 = 0
            if (r14 <= 0) goto L57
            r3 = r13
            goto L58
        L57:
            r3 = r2
        L58:
            if (r11 < r10) goto L87
            int r4 = r15.groupIndexToAddress(r11)
            int[] r5 = r15.groups
            int r6 = androidx.compose.runtime.composer.gapbuffer.SlotTableKt.access$groupSize(r5, r4)
            int r6 = r6 - r12
            androidx.compose.runtime.composer.gapbuffer.SlotTableKt.access$updateGroupSize(r5, r4, r6)
            if (r3 == 0) goto L81
            int[] r3 = r15.groups
            int r5 = r4 * 5
            int r5 = r5 + r13
            r5 = r3[r5]
            r6 = 1073741824(0x40000000, float:2.0)
            r6 = r6 & r5
            if (r6 == 0) goto L77
            goto L81
        L77:
            r6 = 67108863(0x3ffffff, float:1.5046327E-36)
            r5 = r5 & r6
            int r5 = r5 - r14
            androidx.compose.runtime.composer.gapbuffer.SlotTableKt.access$updateNodeCount(r3, r4, r5)
            r3 = r13
            goto L82
        L81:
            r3 = r2
        L82:
            int r11 = r15.parent(r11)
            goto L58
        L87:
            if (r3 == 0) goto L95
            int r2 = r15.nodeCount
            if (r2 >= r14) goto L90
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r9)
        L90:
            int r2 = r15.nodeCount
            int r2 = r2 - r14
            r15.nodeCount = r2
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.gapbuffer.SlotWriter.moveTo(androidx.compose.runtime.composer.gapbuffer.GapAnchor, int, androidx.compose.runtime.composer.gapbuffer.SlotWriter):java.util.List");
    }

    public final Object node(int i2) {
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 1073741824) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i2) {
        return this.groups[(groupIndexToAddress(i2) * 5) + 1] & 67108863;
    }

    public final int parent(GapAnchor gapAnchor) {
        if (gapAnchor.getValid()) {
            return parent(this.groups, anchorIndex(gapAnchor));
        }
        return -1;
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, str);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GapGroupSourceInformation gapGroupSourceInformationGroupSourceInformationFor;
        if (this.insertCount <= 0 || (gapGroupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        gapGroupSourceInformationGroupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    public final void recordGrouplessCallSourceInformationStart(int i2, String str) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.add(mutableIntObjectMap, i2, groupKey(this.parent));
            }
            GapGroupSourceInformation gapGroupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (gapGroupSourceInformationGroupSourceInformationFor != null) {
                gapGroupSourceInformationGroupSourceInformationFor.startGrouplessCall(i2, str, getCurrentGroupSlotIndex());
            }
        }
    }

    public final boolean removeGroup() {
        GapAnchor gapAnchorTryAnchor$runtime;
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i2 = this.currentGroup;
        int i3 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
        int iSkipGroup = skipGroup();
        GapGroupSourceInformation gapGroupSourceInformationSourceInformationOf$runtime = sourceInformationOf$runtime(this.parent);
        if (gapGroupSourceInformationSourceInformationOf$runtime != null && (gapAnchorTryAnchor$runtime = tryAnchor$runtime(i2)) != null) {
            gapGroupSourceInformationSourceInformationOf$runtime.removeAnchor(gapAnchorTryAnchor$runtime);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m7423isNotEmptyimpl(mutableIntList) && PrioritySet.m7424peekimpl(mutableIntList) >= i2) {
                PrioritySet.m7425takeMaximpl(mutableIntList);
            }
        }
        boolean zRemoveGroups = removeGroups(i2, this.currentGroup - i2);
        removeSlots(iDataIndex, this.currentSlot - iDataIndex, i2 - 1);
        this.currentGroup = i2;
        this.currentSlot = i3;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(GapAnchor gapAnchor) {
        advanceBy(gapAnchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object obj) {
        if (this.currentSlot > this.currentSlotEnd) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = obj;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i2 = this.currentSlot;
        this.currentSlot = i2 + 1;
        return objArr[dataIndexToDataAddress(i2)];
    }

    public final int skipGroup() {
        int i2 = this.currentGroup;
        int iGroupIndexToAddress = groupIndexToAddress(i2);
        int iGroupSize = i2 + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i3 = this.groups[(iGroupIndexToAddress * 5) + 1];
        if ((1073741824 & i3) != 0) {
            return 1;
        }
        return i3 & 67108863;
    }

    public final void skipToGroupEnd() {
        int i2 = this.currentGroupEnd;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
    }

    public final Object slot(int i2, int i3) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i2));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2 + 1));
        int i4 = i3 + iSlotIndex;
        if (iSlotIndex > i4 || i4 >= iDataIndex) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i4)];
    }

    public final int slotIndexOfGroupSlotIndex(int i2, int i3) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i2));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2 + 1));
        int i4 = iSlotIndex + i3;
        if (i4 >= iSlotIndex && i4 < iDataIndex) {
            return i4;
        }
        ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + i3 + " for group " + i2);
        return i4;
    }

    public final int slotsEndAllIndex$runtime(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2 + groupSize(i2)));
    }

    public final int slotsEndIndex$runtime(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2 + 1));
    }

    public final int slotsStartIndex$runtime(int i2) {
        return slotIndex(this.groups, groupIndexToAddress(i2));
    }

    public final GapGroupSourceInformation sourceInformationOf$runtime(int i2) {
        GapAnchor gapAnchorTryAnchor$runtime;
        HashMap<GapAnchor, GapGroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (gapAnchorTryAnchor$runtime = tryAnchor$runtime(i2)) == null) {
            return null;
        }
        return map.get(gapAnchorTryAnchor$runtime);
    }

    public final void startData(int i2, Object obj) {
        startGroup(i2, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i2, Object obj) {
        startGroup(i2, obj, true, Composer.Companion.getEmpty());
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        sb.append("  parent:    " + this.parent);
        sb.append('\n');
        sb.append("  current:   " + this.currentGroup);
        sb.append('\n');
        sb.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        sb.append('\n');
        sb.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("  gap owner: ");
        sb2.append(this.slotsGapOwner);
        sb.append(sb2.toString());
        sb.append('\n');
        int size$runtime = getSize$runtime();
        for (int i2 = 0; i2 < size$runtime; i2++) {
            groupAsString(sb, i2);
            sb.append('\n');
        }
        return sb.toString();
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void traverseGroupAndChildren(int i2, l<? super Integer, ab> lVar, l<? super Integer, ab> lVar2) {
        int iParent = parent(i2);
        int size$runtime = getSize$runtime();
        int iGroupSize = groupSize(i2) + i2;
        int i3 = i2;
        while (i3 < iGroupSize) {
            lVar.invoke(Integer.valueOf(i3));
            int i4 = i3 + 1;
            int iParent2 = i4 < size$runtime ? parent(i4) : -1;
            if (iParent2 != i3) {
                while (true) {
                    lVar2.invoke(Integer.valueOf(i3));
                    if (i3 == i2 || iParent == iParent2) {
                        break;
                    }
                    i3 = iParent;
                    iParent = parent(iParent);
                }
            }
            i3 = i4;
            iParent = iParent2;
        }
    }

    public final void trimTailSlots(int i2) {
        if (i2 <= 0) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i3 = this.parent;
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i3));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i3 + 1)) - i2;
        if (iDataIndex < iSlotIndex) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(iDataIndex, i2, i3);
        int i4 = this.currentSlot;
        if (i4 >= iSlotIndex) {
            this.currentSlot = i4 - i2;
        }
    }

    public final GapAnchor tryAnchor$runtime(int i2) {
        if (i2 < 0 || i2 >= getSize$runtime()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, i2, getSize$runtime());
    }

    public final Object update(Object obj) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return rawUpdate(obj);
        }
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        o oVar = null;
        int i2 = 1;
        int i3 = 0;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(i3, i2, oVar);
        }
        this.deferredSlotWrites = mutableIntObjectMap;
        int i4 = this.parent;
        MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i4);
        if (mutableObjectList == null) {
            mutableObjectList = new MutableObjectList<>(i3, i2, oVar);
            mutableIntObjectMap.set(i4, mutableObjectList);
        }
        mutableObjectList.add(obj);
        return Composer.Companion.getEmpty();
    }

    public final void updateAux(Object obj) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if ((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) == 0) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = obj;
    }

    public final void updateNode(GapAnchor gapAnchor, Object obj) {
        updateNodeOfGroup(gapAnchor.toIndexFor(this), obj);
    }

    public final void updateParentNode(Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime();
        this.calledByMap = this.table.getCalledByMap$runtime();
    }

    public final void verifyDataAnchors$runtime() {
        int i2 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime = getSize$runtime();
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < size$runtime) {
            int iGroupIndexToAddress = groupIndexToAddress(i3);
            int[] iArr = this.groups;
            int i5 = iArr[(iGroupIndexToAddress * 5) + 4];
            int iDataIndex = dataIndex(iArr, iGroupIndexToAddress);
            if (iDataIndex < i4) {
                PreconditionsKt.throwIllegalStateException("Data index out of order at " + i3 + ", previous = " + i4 + ", current = " + iDataIndex);
            }
            if (iDataIndex > length) {
                PreconditionsKt.throwIllegalStateException("Data index, " + iDataIndex + ", out of bound at " + i3);
            }
            if (i5 < 0 && !z) {
                if (i2 != i3) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i2 + " found gap at " + i3);
                }
                z = true;
            }
            i3++;
            i4 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime() {
        int i2 = this.groupGapStart;
        int i3 = this.groupGapLen;
        int capacity = getCapacity();
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.groups[(i4 * 5) + 2] <= -2) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i4);
            }
        }
        for (int i5 = i3 + i2; i5 < capacity; i5++) {
            int i6 = this.groups[(i5 * 5) + 2];
            if (parentAnchorToIndex(i6) < i2) {
                if (i6 <= -2) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i5);
                }
            } else if (i6 > -2) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i5);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<GapAnchor> moveGroup(SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            ac acVar;
            boolean zRemoveGroup;
            int iGroupSize = slotWriter.groupSize(i2);
            int i3 = i2 + iGroupSize;
            int iDataIndex = slotWriter.dataIndex(i2);
            int iDataIndex2 = slotWriter.dataIndex(i3);
            int i4 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i2);
            slotWriter2.insertGroups(iGroupSize);
            slotWriter2.insertSlots(i4, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i3) {
                slotWriter.moveGroupGapTo(i3);
            }
            if (slotWriter.slotsGapStart < iDataIndex2) {
                slotWriter.moveSlotGapTo(iDataIndex2, i3);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            int i5 = currentGroup * 5;
            c.ar(slotWriter.groups, iArr, i5, i2 * 5, i3 * 5);
            Object[] objArr = slotWriter2.slots;
            int i6 = slotWriter2.currentSlot;
            System.arraycopy(slotWriter.slots, iDataIndex, objArr, i6, i4);
            int parent = slotWriter2.getParent();
            iArr[i5 + 2] = parent;
            int i7 = currentGroup - i2;
            int i8 = currentGroup + iGroupSize;
            int iDataIndex3 = i6 - slotWriter2.dataIndex(iArr, currentGroup);
            int i9 = slotWriter2.slotsGapOwner;
            int i10 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i11 = i9;
            int i12 = currentGroup;
            while (true) {
                if (i12 >= i8) {
                    break;
                }
                int i13 = i12 * 5;
                if (i12 != currentGroup) {
                    int i14 = i13 + 2;
                    iArr[i14] = iArr[i14] + i7;
                }
                int[] iArr2 = iArr;
                int i15 = currentGroup;
                iArr2[i13 + 4] = slotWriter2.dataIndexToDataAnchor(slotWriter2.dataIndex(iArr, i12) + iDataIndex3, i11 >= i12 ? slotWriter2.slotsGapStart : 0, i10, length);
                if (i12 == i11) {
                    i11++;
                }
                i12++;
                currentGroup = i15;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            slotWriter2.slotsGapOwner = i11;
            int iLocationOf = SlotTableKt.locationOf(slotWriter.anchors, i2, slotWriter.getSize$runtime());
            int iLocationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i3, slotWriter.getSize$runtime());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i16 = iLocationOf; i16 < iLocationOf2; i16++) {
                    GapAnchor gapAnchor = (GapAnchor) arrayList.get(i16);
                    gapAnchor.setLocation$runtime(gapAnchor.getLocation$runtime() + i7);
                    arrayList2.add(gapAnchor);
                }
                slotWriter2.anchors.addAll(SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                acVar = arrayList2;
            } else {
                acVar = ac.f47967a;
            }
            List<GapAnchor> list = acVar;
            if (!list.isEmpty()) {
                HashMap map = slotWriter.sourceInformationMap;
                HashMap map2 = slotWriter2.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        GapAnchor gapAnchor2 = acVar.get(i17);
                        GapGroupSourceInformation gapGroupSourceInformation = (GapGroupSourceInformation) map.get(gapAnchor2);
                        if (gapGroupSourceInformation != null) {
                            map.remove(gapAnchor2);
                            map2.put(gapAnchor2, gapGroupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = slotWriter2.getParent();
            GapGroupSourceInformation gapGroupSourceInformationSourceInformationOf$runtime = slotWriter2.sourceInformationOf$runtime(parent);
            if (gapGroupSourceInformationSourceInformationOf$runtime != null) {
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int iGroupSize2 = parent2 + 1;
                int i18 = -1;
                while (iGroupSize2 < currentGroup2) {
                    i18 = iGroupSize2;
                    iGroupSize2 = SlotTableKt.groupSize(slotWriter2.groups, iGroupSize2) + iGroupSize2;
                }
                gapGroupSourceInformationSourceInformationOf$runtime.addGroupAfter(slotWriter2, i18, currentGroup2);
            }
            int iParent = slotWriter.parent(i2);
            if (z3) {
                if (z) {
                    int i19 = iParent >= 0 ? 1 : 0;
                    if (i19 != 0) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(iParent - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i2 - slotWriter.getCurrentGroup());
                    zRemoveGroup = slotWriter.removeGroup();
                    if (i19 != 0) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                } else {
                    boolean zRemoveGroups = slotWriter.removeGroups(i2, iGroupSize);
                    slotWriter.removeSlots(iDataIndex, i4, i2 - 1);
                    zRemoveGroup = zRemoveGroups;
                }
                if (zRemoveGroup) {
                    ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
                }
            }
            int i20 = slotWriter2.nodeCount;
            int i21 = iArr3[i5 + 1];
            slotWriter2.nodeCount = i20 + ((1073741824 & i21) == 0 ? i21 & 67108863 : 1);
            if (z2) {
                slotWriter2.currentGroup = i8;
                slotWriter2.currentSlot = i6 + i4;
            }
            if (zContainsAnyGroupMarks) {
                slotWriter2.updateContainsMark(parent);
            }
            return acVar;
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i3, Object obj) {
            return companion.moveGroup(slotWriter, i2, slotWriter2, z, z2, z3 | (!((i3 & 32) == 0)));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void startData(int i2, Object obj, Object obj2) {
        startGroup(i2, obj, false, obj2);
    }

    public final void startNode(int i2, Object obj, Object obj2) {
        startGroup(i2, obj, true, obj2);
    }

    public final int parent(int i2) {
        return parent(this.groups, i2);
    }

    private final int parent(int[] iArr, int i2) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i2) * 5) + 2]);
    }

    public final Object set(int i2, Object obj) {
        return set(getCurrentGroup(), i2, obj);
    }

    public final Object set(int i2, int i3, Object obj) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(i2, i3));
        Object[] objArr = this.slots;
        Object obj2 = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = obj;
        return obj2;
    }

    public final boolean isNode(int i2) {
        return (this.groups[(groupIndexToAddress(i2) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2));
    }

    public final Object node(GapAnchor gapAnchor) {
        return node(gapAnchor.toIndexFor(this));
    }

    public final Object slot(GapAnchor gapAnchor, int i2) {
        return slot(anchorIndex(gapAnchor), i2);
    }

    public final void ensureStarted(GapAnchor gapAnchor) {
        ensureStarted(gapAnchor.toIndexFor(this));
    }

    public final void startGroup(int i2) {
        startGroup(i2, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }

    public final void startGroup(int i2, Object obj) {
        startGroup(i2, obj, false, Composer.Companion.getEmpty());
    }

    public final void startGroup() {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        startGroup(0, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }
}
