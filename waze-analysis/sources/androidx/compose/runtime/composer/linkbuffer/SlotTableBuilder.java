package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableBuilder {
    public static final int $stable = 8;
    private final SlotTableAddressSpace addressSpace;
    private boolean inReservedRange;
    private boolean isClosed;
    private int nodeCount;
    private int parent;
    private final IntStack parentStack;
    private int previousSibling;
    private final IntStack previousSiblingStack;
    private boolean recordCallByInformation;
    private boolean recordSourceInformation;
    private int slotCurrent;
    private int slotEnd;
    private int slotReserveEnd;
    private int slotReserveStart;
    private int slotReserveUsedUpTo;
    private int slotStart;
    private Object[] slots;
    private final SlotTable table;

    public SlotTableBuilder(SlotTable slotTable, boolean z, boolean z2) {
        int i2;
        this.table = slotTable;
        this.recordSourceInformation = z;
        this.recordCallByInformation = z2;
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        this.addressSpace = addressSpace;
        int i3 = -1;
        this.parent = -1;
        this.parentStack = new IntStack();
        int root = slotTable.getRoot();
        if (root != -1) {
            int[] groups = addressSpace.getGroups();
            while (true) {
                i2 = i3;
                i3 = root;
                if (i3 < 0) {
                    break;
                } else {
                    root = groups[i3 + 1];
                }
            }
            i3 = i2;
        }
        this.previousSibling = i3;
        this.previousSiblingStack = new IntStack();
        this.slots = this.addressSpace.getSlots();
    }

    private final void buildEnd() {
        int i2 = this.parent;
        if (i2 != -1) {
            saveSlotRange(i2);
        }
        returnReservedSlotRegion();
    }

    private final void reserveSlotSlotRegion() {
        long jReserveSlots = this.addressSpace.reserveSlots();
        int i2 = (int) jReserveSlots;
        this.slotReserveStart = i2;
        this.slotReserveUsedUpTo = i2;
        this.slotReserveEnd = (int) (jReserveSlots >>> 32);
    }

    private final void restoreFromSlotRange(int i2) {
        int i3 = this.addressSpace.getGroups()[i2 + 5];
        if (i3 == -1) {
            int i4 = this.slotReserveUsedUpTo;
            this.slotStart = i4;
            this.slotCurrent = i4;
            this.slotEnd = this.slotReserveEnd;
            this.inReservedRange = true;
            return;
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int i5 = (i3 & 15) + 1;
        int i6 = i3 >> 4;
        if (i5 > 15) {
            i5 = slotTableAddressSpace.getLargeSizes().get(i6);
        }
        this.slotStart = i6;
        int i7 = i6 + i5;
        this.slotEnd = i7;
        this.slotCurrent = i7;
        this.inReservedRange = false;
    }

    private final void returnReservedSlotRegion() {
        int i2 = this.slotReserveStart;
        int i3 = this.slotReserveEnd;
        if (i2 != i3) {
            this.addressSpace.restoreSlots(this.slotReserveUsedUpTo, i3);
            this.slotReserveStart = 0;
            this.slotReserveUsedUpTo = 0;
            this.slotReserveEnd = 0;
        }
    }

    private final int saveSlotRange(int i2) {
        if (i2 < 0) {
            return 0;
        }
        int[] groups = this.addressSpace.getGroups();
        int i3 = this.slotCurrent;
        int i4 = this.slotStart;
        if (i3 <= i4) {
            groups[i2 + 5] = -1;
            return 0;
        }
        int i5 = i3 - i4;
        if (!this.inReservedRange) {
            int i6 = this.slotEnd - i4;
            if (i6 != i5) {
                this.addressSpace.resizeSlotRangeAtGroup(i2, i6, i5);
            }
            return i5;
        }
        int i7 = i2 + 5;
        int iSlotRangeFromAddressAndSize = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i4, i5);
        if (i5 > 15) {
            this.addressSpace.recordLargeBlock(i4, i5);
        }
        this.slotReserveUsedUpTo = i3;
        groups[i7] = iSlotRangeFromAddressAndSize;
        return i5;
    }

    private final void slowAppend(Object obj) {
        int i2 = this.parent;
        int iSaveSlotRange = saveSlotRange(i2);
        returnReservedSlotRegion();
        this.addressSpace.writeSlot(i2, iSaveSlotRange, obj);
        this.slots = this.addressSpace.getSlots();
        reserveSlotSlotRegion();
        restoreFromSlotRange(i2);
    }

    public static /* synthetic */ void startGroup$default(SlotTableBuilder slotTableBuilder, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            obj = Composer.Companion.getEmpty();
        }
        Object obj3 = obj;
        slotTableBuilder.startNewGroup(i2, obj3 == Composer.Companion.getEmpty() ? 0 : 16777216, obj3, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNewGroup(int i2, int i3, Object obj, Object obj2, Object obj3) {
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int i4 = this.parent;
        int iGroupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace.getGroups(), i2, i4, i3);
        if (iGroupAllocate < 0) {
            slotTableAddressSpace.growGroups();
            iGroupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace.getGroups(), i2, i4, i3);
        }
        int[] groups = this.addressSpace.getGroups();
        int i5 = this.previousSibling;
        if (i5 != -1) {
            groups[i5 + 1] = iGroupAllocate;
        } else if (i4 == -1) {
            this.table.setRoot(iGroupAllocate);
        } else {
            groups[i4 + 3] = iGroupAllocate;
        }
        this.parentStack.push(i4);
        this.previousSiblingStack.push(i5);
        this.parent = iGroupAllocate;
        this.previousSibling = -1;
        if (i4 != -1) {
            int i6 = i4 + 4;
            groups[i6] = this.nodeCount | (groups[i6] & (-8388608));
        }
        this.nodeCount = 0;
        saveSlotRange(i4);
        int i7 = this.slotReserveUsedUpTo;
        this.slotStart = i7;
        this.slotCurrent = i7;
        this.slotEnd = this.slotReserveEnd;
        this.inReservedRange = true;
        if ((i3 & 8388608) == 8388608) {
            append(obj3);
        }
        if ((i3 & 16777216) == 16777216) {
            append(obj);
        }
        if ((i3 & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
            append(obj2);
        }
        int i8 = this.slotCurrent;
        int i9 = this.slotStart;
        if (i8 > i9) {
            groups[iGroupAllocate + 5] = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i9, i8 - i9);
        }
        if (!this.recordSourceInformation || i4 < 0) {
            return;
        }
        this.addressSpace.recordSourceInformation(i4, null, iGroupAllocate).reportGroup(this.addressSpace.anchorOfAddress(iGroupAllocate));
    }

    public final void addFlags(int i2) {
        int[] groups = this.addressSpace.getGroups();
        int i3 = this.parent;
        int i4 = i3 + 4;
        int i5 = i2 | groups[i4];
        groups[i4] = i5;
        int iPropagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i5);
        if (iPropagatingFlagsOf != 0) {
            int[] groups2 = this.addressSpace.getGroups();
            int i6 = groups2[i3 + 2];
            while (i6 > 0) {
                int i7 = i6 + 4;
                int i8 = groups[i7];
                if ((iPropagatingFlagsOf & i8) == iPropagatingFlagsOf) {
                    return;
                }
                groups[i7] = i8 | iPropagatingFlagsOf;
                i6 = groups2[i6 + 2];
            }
            if (i6 == 0) {
                ComposerKt.composeImmediateRuntimeError(a.a(i3, "Traversing parent of group not in the slot table: "));
            }
        }
    }

    public final void append(Object obj) {
        int i2 = this.slotCurrent;
        if (i2 >= this.slotEnd) {
            slowAppend(obj);
            return;
        }
        Object[] objArr = this.slots;
        this.slotCurrent = i2 + 1;
        objArr[i2] = obj;
    }

    public final SlotTable build() {
        buildEnd();
        close();
        return this.table;
    }

    public final void buildStart() {
        reserveSlotSlotRegion();
    }

    public final void close() {
        this.isClosed = true;
    }

    public final void collectCallByInformation() {
        this.recordCallByInformation = true;
        this.table.setRecordCallByInformation(true);
    }

    public final void collectSourceInformation() {
        this.recordSourceInformation = true;
        this.table.setRecordSourceInformation(true);
    }

    public final int endGroup() {
        int i2 = this.parent;
        int i3 = i2 + 4;
        int[] groups = this.addressSpace.getGroups();
        groups[i3] = this.nodeCount | (groups[i3] & (-8388608));
        saveSlotRange(i2);
        int iPop = this.parentStack.pop();
        this.parent = iPop;
        int iPop2 = this.previousSiblingStack.pop();
        this.previousSibling = iPop2 == -1 ? iPop == -1 ? this.table.getRoot() : groups[iPop + 3] : groups[iPop2 + 1];
        restoreFromSlotRange(this.parent);
        int i4 = groups[i3];
        int i5 = (i4 & 8388608) != 8388608 ? i4 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK : 1;
        this.nodeCount = (groups[this.parent + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK) + i5;
        return i5;
    }

    public final int flagsOf(int i2) {
        return this.addressSpace.getGroups()[i2 + 4];
    }

    public final LinkAnchor getParentAnchor() {
        return this.addressSpace.anchorOfAddress(getParentGroup());
    }

    public final int getParentGroup() {
        return this.parent;
    }

    public final long getParentHandle() {
        return (this.parent & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((this.previousSiblingStack.tos == 0 ? -1 : r0.peek()) << 32);
    }

    public final boolean getRecordCallByInformation() {
        return this.recordCallByInformation;
    }

    public final boolean getRecordSourceInformation() {
        return this.recordSourceInformation;
    }

    public final int getSlotIndex() {
        return this.slotCurrent - this.slotStart;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int i2) {
        int[] groups = this.addressSpace.getGroups();
        int i3 = groups[i2 + 4];
        return (i3 & GroupFlagsKt.HasAuxSlotFlag) == 33554432 ? this.slots[(groups[i2 + 5] >> 4) + Integer.bitCount(25165824 & i3)] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i2) {
        return this.addressSpace.getGroups()[i2];
    }

    public final Object groupObjectKey(int i2) {
        int[] groups = this.addressSpace.getGroups();
        int i3 = groups[i2 + 4];
        if ((i3 & 16777216) == 16777216) {
            return this.slots[(groups[i2 + 5] >> 4) + Integer.bitCount(8388608 & i3)];
        }
        return null;
    }

    public final void insertAux(Object obj) {
        int parentGroup = getParentGroup() + 4;
        int[] groups = this.addressSpace.getGroups();
        int i2 = groups[parentGroup] | GroupFlagsKt.HasAuxSlotFlag;
        groups[parentGroup] = i2;
        append(obj);
        int iBitCount = this.slotStart + Integer.bitCount(25165824 & i2);
        int i3 = iBitCount + 1;
        if (i3 != this.slotCurrent) {
            Object[] slots = this.addressSpace.getSlots();
            c.at(slots, slots, i3, iBitCount, this.slotCurrent - 1);
            slots[iBitCount] = obj;
        }
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final boolean isEmpty() {
        return this.parent == -1;
    }

    public final boolean isNode() {
        int i2 = this.parent;
        if (i2 != -1) {
            return (this.addressSpace.getGroups()[i2 + 4] & 8388608) == 8388608;
        }
        return false;
    }

    public final long lastRoot() {
        int root = this.table.getRoot();
        int i2 = -1;
        if (root != -1) {
            SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
            int root2 = this.table.getRoot() + 1;
            int[] groups = slotTableAddressSpace.getGroups();
            int i3 = groups[root2];
            while (i3 >= 0) {
                int i4 = root;
                root = i3;
                i3 = groups[i3 + 1];
                i2 = i4;
            }
        }
        return (i2 << 32) | (root & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final void moveFrom(SlotTableEditor slotTableEditor, long j2) {
        x.n(slotTableEditor.getAddressSpace$runtime(), this.addressSpace);
        long jHandle = slotTableEditor.handle();
        slotTableEditor.seek(j2);
        slotTableEditor.removeGroup(false);
        slotTableEditor.seek(jHandle);
        int group = GroupHandleKt.getGroup(j2);
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.parent;
        int i3 = this.previousSibling;
        if (i3 != -1) {
            groups[i3 + 1] = group;
        } else if (i2 == -1) {
            this.table.setRoot(group);
        } else {
            groups[i2 + 3] = group;
        }
        groups[group + 2] = i2;
        groups[group + 1] = -1;
        this.previousSibling = group;
        int i4 = this.nodeCount;
        int i5 = groups[group + 4];
        this.nodeCount = i4 + ((i5 & 8388608) != 8388608 ? 8388607 & i5 : 1);
        int iPropagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i5);
        if (iPropagatingFlagsOf != 0) {
            int[] groups2 = this.addressSpace.getGroups();
            int i6 = i2;
            while (i6 > 0) {
                int i7 = i6 + 4;
                int i8 = groups[i7];
                if ((i8 & iPropagatingFlagsOf) == iPropagatingFlagsOf) {
                    return;
                }
                groups[i7] = i8 | iPropagatingFlagsOf;
                i6 = groups2[i6 + 2];
            }
            if (i6 != 0) {
                return;
            }
            ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
        }
    }

    public final int parent(int i2) {
        return this.addressSpace.getGroups()[i2 + 2];
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.recordSourceInformation) {
            this.addressSpace.recordSourceInformation(this.parent, str, -1);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if (this.recordSourceInformation) {
            this.addressSpace.recordSourceInformation(this.parent, null, -1).endGrouplessCall(this.slotCurrent - this.slotStart);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int i2, String str) {
        if (this.recordCallByInformation) {
            this.addressSpace.recordCalledBy(i2, groupKey(this.parent));
        }
        if (this.recordSourceInformation) {
            this.addressSpace.recordSourceInformation(this.parent, null, -1).startGrouplessCall(i2, str, this.slotCurrent - this.slotStart);
        }
    }

    public final void setRecordCallByInformation(boolean z) {
        this.recordCallByInformation = z;
    }

    public final void setRecordSourceInformation(boolean z) {
        this.recordSourceInformation = z;
    }

    public final void startDataGroup(int i2, Object obj, Object obj2) {
        startNewGroup(i2, obj == Composer.Companion.getEmpty() ? GroupFlagsKt.HasAuxSlotFlag : 50331648, obj, obj2, null);
    }

    public final void startGroup(int i2, Object obj) {
        startNewGroup(i2, obj == Composer.Companion.getEmpty() ? 0 : 16777216, obj, null, null);
    }

    public final void startNodeGroup(int i2, Object obj, Object obj2) {
        startNewGroup(i2, obj == Composer.Companion.getEmpty() ? 8388608 : 25165824, obj, null, obj2);
    }

    public SlotTableBuilder(SlotTableAddressSpace slotTableAddressSpace, boolean z, boolean z2) {
        this(new SlotTable(0, slotTableAddressSpace, z, z2, 1, null), z, z2);
    }
}
