package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.PreconditionsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack currentSlotStack;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;
    private Object[] slots;
    private final int slotsSize;
    private HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.m7429getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public static /* synthetic */ GapAnchor anchor$default(SlotReader slotReader, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotReader.currentGroup;
        }
        return slotReader.anchor(i2);
    }

    private final Object aux(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0 ? this.slots[SlotTableKt.auxIndex(iArr, i2)] : Composer.Companion.getEmpty();
    }

    private final Object node(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return (iArr[i3 + 1] & 1073741824) != 0 ? this.slots[iArr[i3 + 4]] : Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i2) {
        if ((iArr[(i2 * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i2)];
        }
        return null;
    }

    public final GapAnchor anchor(int i2) {
        int i3 = this.groupsSize;
        ArrayList<GapAnchor> anchors$runtime = this.table.getAnchors$runtime();
        int iSearch = SlotTableKt.search(anchors$runtime, i2, i3);
        if (iSearch >= 0) {
            return anchors$runtime.get(iSearch);
        }
        GapAnchor gapAnchor = new GapAnchor(i2);
        anchors$runtime.add(-(iSearch + 1), gapAnchor);
        return gapAnchor;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime(this, this.sourceInformationMap);
        this.slots = new Object[0];
    }

    public final boolean containsMark(int i2) {
        return (this.groups[(i2 * 5) + 1] & 67108864) != 0;
    }

    public final void endEmpty() {
        if (this.emptyCount <= 0) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (this.currentGroup != this.currentEnd) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i2 = iArr[(this.parent * 5) + 2];
            this.parent = i2;
            this.currentEnd = i2 < 0 ? this.groupsSize : SlotTableKt.groupSize(iArr, i2) + i2;
            int iPop = this.currentSlotStack.pop();
            if (iPop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iPop;
                this.currentSlotEnd = i2 >= this.groupsSize + (-1) ? this.slotsSize : this.groups[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i2 = 0;
            int iGroupSize = this.currentGroup;
            while (true) {
                int i3 = i2;
                if (iGroupSize >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.groups;
                int i4 = iGroupSize * 5;
                int i5 = iArr[i4];
                Object objObjectKey = objectKey(iArr, iGroupSize);
                int i6 = 1;
                int i7 = this.groups[i4 + 1];
                if ((1073741824 & i7) == 0) {
                    i6 = i7 & 67108863;
                }
                i2 = i3 + 1;
                arrayList.add(new KeyInfo(i5, objObjectKey, iGroupSize, i6, i3));
                iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            }
        }
        return arrayList;
    }

    public final Object get(int i2) {
        int i3 = this.currentSlot + i2;
        return i3 < this.currentSlotEnd ? this.slots[i3] : Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return aux(this.groups, i2);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return this.groups[i2 * 5];
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return node(this.groups, i2);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return objectKey(this.groups, i2);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int getGroupSlotCount() {
        int[] iArr = this.groups;
        int i2 = this.currentGroup;
        int iSlotAnchor = SlotTableKt.slotAnchor(iArr, i2);
        int i3 = i2 + 1;
        return (i3 < this.groupsSize ? this.groups[(i3 * 5) + 4] : this.slotsSize) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        int i2 = this.currentGroup;
        return i2 < this.currentEnd && (this.groups[(i2 * 5) + 1] & 536870912) != 0;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return this.groups[(this.currentGroup * 5) + 1] & 67108863;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i2 = this.parent;
        if (i2 >= 0) {
            return this.groups[(i2 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final SlotTable getTable$runtime() {
        return this.table;
    }

    public final Object groupAux(int i2) {
        return aux(this.groups, i2);
    }

    public final int groupEnd(int i2) {
        return i2 + SlotTableKt.groupSize(this.groups, i2);
    }

    public final Object groupGet(int i2, int i3) {
        int i4 = i2 + 1;
        int i5 = this.groupsSize;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2) + i3;
        return iSlotAnchor < (i4 < i5 ? this.groups[(i4 * 5) + 4] : this.slotsSize) ? this.slots[iSlotAnchor] : Composer.Companion.getEmpty();
    }

    public final int groupKey(GapAnchor gapAnchor) {
        if (gapAnchor.getValid()) {
            return this.groups[this.table.anchorIndex(gapAnchor) * 5];
        }
        return 0;
    }

    public final Object groupObjectKey(int i2) {
        return objectKey(this.groups, i2);
    }

    public final int groupSize(int i2) {
        return SlotTableKt.groupSize(this.groups, i2);
    }

    public final boolean hasMark(int i2) {
        return (this.groups[(i2 * 5) + 1] & 134217728) != 0;
    }

    public final boolean hasObjectKey(int i2) {
        return (this.groups[(i2 * 5) + 1] & 536870912) != 0;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return (this.groups[(this.currentGroup * 5) + 1] & 1073741824) != 0;
    }

    public final Object next() {
        int i2;
        if (this.emptyCount > 0 || (i2 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.Companion.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i2 + 1;
        return objArr[i2];
    }

    public final int nodeCount(int i2) {
        return this.groups[(i2 * 5) + 1] & 67108863;
    }

    public final int parent(int i2) {
        return this.groups[(i2 * 5) + 2];
    }

    public final int parentOf(int i2) {
        if (i2 < 0 || i2 >= this.groupsSize) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index " + i2);
        }
        return this.groups[(i2 * 5) + 2];
    }

    public final void reposition(int i2) {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = i2;
        int i3 = this.groupsSize;
        int i4 = i2 < i3 ? this.groups[(i2 * 5) + 2] : -1;
        if (i4 != this.parent) {
            this.parent = i4;
            if (i4 < 0) {
                this.currentEnd = i3;
            } else {
                this.currentEnd = i4 + SlotTableKt.groupSize(this.groups, i4);
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
        }
    }

    public final void restoreParent(int i2) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2) + i2;
        int i3 = this.currentGroup;
        if (i3 < i2 || i3 > iGroupSize) {
            ComposerKt.composeImmediateRuntimeError("Index " + i2 + " is not a parent of " + i3);
        }
        this.parent = i2;
        this.currentEnd = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void setCurrentGroup(int i2) {
        this.currentGroup = i2;
    }

    public final int skipGroup() {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i2 = this.currentGroup;
        int i3 = iArr[(i2 * 5) + 1];
        int i4 = (1073741824 & i3) == 0 ? 67108863 & i3 : 1;
        this.currentGroup = i2 + SlotTableKt.groupSize(iArr, i2);
        return i4;
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int slotSize(int i2) {
        int i3 = i2 + 1;
        int i4 = this.groupsSize;
        return (i3 < i4 ? this.groups[(i3 * 5) + 4] : this.slotsSize) - SlotTableKt.slotAnchor(this.groups, i2);
    }

    public final void startGroup() {
        GapGroupSourceInformation gapGroupSourceInformation;
        if (this.emptyCount <= 0) {
            int i2 = this.parent;
            int i3 = this.currentGroup;
            if (this.groups[(i3 * 5) + 2] != i2) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<GapAnchor, GapGroupSourceInformation> map = this.sourceInformationMap;
            if (map != null && (gapGroupSourceInformation = map.get(anchor(i2))) != null) {
                gapGroupSourceInformation.reportGroup(this.table, i3);
            }
            IntStack intStack = this.currentSlotStack;
            int i4 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            if (i4 != 0) {
                intStack.push(i4);
            } else if (i5 == 0) {
                intStack.push(-1);
            } else {
                i4 = 0;
                intStack.push(i4);
            }
            this.parent = i3;
            this.currentEnd = SlotTableKt.groupSize(this.groups, i3) + i3;
            int i6 = i3 + 1;
            this.currentGroup = i6;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i3);
            this.currentSlotEnd = i3 >= this.groupsSize + (-1) ? this.slotsSize : this.groups[(i6 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if ((this.groups[(this.currentGroup * 5) + 1] & 1073741824) == 0) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    public final boolean isNode(int i2) {
        return (this.groups[(i2 * 5) + 1] & 1073741824) != 0;
    }

    public final int groupKey(int i2) {
        return this.groups[i2 * 5];
    }

    public final Object node(int i2) {
        int[] iArr = this.groups;
        if ((iArr[(i2 * 5) + 1] & 1073741824) != 0) {
            return node(iArr, i2);
        }
        return null;
    }

    public final Object groupGet(int i2) {
        return groupGet(this.currentGroup, i2);
    }
}
