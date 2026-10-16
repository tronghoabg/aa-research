package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableReader {
    public static final int $stable = 8;
    private int _current;
    private int[] _groups;
    private int _previousSibling;
    private Object[] _slots;
    private SlotTableAddressSpace addressSpace;
    private int emptyCount;
    private boolean hadNext;
    private boolean isClosed;
    private int parent;
    private final IntStack previousSlotCurrentOffset;
    private int slotCurrent;
    private int slotEnd;
    private final SlotTable table;

    public SlotTableReader(SlotTable slotTable) {
        this.table = slotTable;
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        this.addressSpace = addressSpace;
        this._groups = addressSpace.getGroups();
        this._slots = slotTable.getAddressSpace().getSlots();
        this.parent = -1;
        this._current = slotTable.getRoot();
        this.previousSlotCurrentOffset = new IntStack();
        this._previousSibling = -1;
    }

    public static /* synthetic */ void addFlag$default(SlotTableReader slotTableReader, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = slotTableReader.getParentGroup();
        }
        slotTableReader.addFlag(i2, i3);
    }

    private final int getCurrent() {
        return this._current;
    }

    private final int[] getGroups() {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups;
    }

    private final Object[] getSlots() {
        if (this.emptyCount > 0) {
            this._slots = this.addressSpace.getSlots();
        }
        return this._slots;
    }

    private final void setCurrent(int i2) {
        this._current = i2;
    }

    private final void setPreviousSibling(int i2) {
        this._previousSibling = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void traverseGroupPartially$default(androidx.compose.runtime.composer.linkbuffer.SlotTableReader r3, int r4, boolean r5, h.g.a.l r6, int r7, java.lang.Object r8) {
        /*
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r3 = access$getAddressSpace$p(r3)
            if (r4 < 0) goto L45
            androidx.compose.runtime.IntStack r8 = new androidx.compose.runtime.IntStack
            r8.<init>()
            int[] r3 = r3.getGroups()
            r0 = r4
        L10:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r6.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r0 != r4) goto L2a
            r2 = r7 & 2
            if (r2 == 0) goto L26
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            r2 = r2 & r5
            if (r2 == 0) goto L33
        L2a:
            int r2 = r0 + 1
            r2 = r3[r2]
            if (r2 < 0) goto L33
            r8.push(r2)
        L33:
            int r0 = r0 + 3
            r0 = r3[r0]
            if (r1 == 0) goto L3b
            if (r0 >= 0) goto L10
        L3b:
            int r0 = r8.tos
            if (r0 != 0) goto L40
            goto L45
        L40:
            int r0 = r8.pop()
            goto L10
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTableReader.traverseGroupPartially$default(androidx.compose.runtime.composer.linkbuffer.SlotTableReader, int, boolean, h.g.a.l, int, java.lang.Object):void");
    }

    public final void addFlag(int i2, int i3) {
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.table.getAddressSpace().getGroups();
        int i4 = i2;
        while (i4 > 0) {
            int iPropagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i3);
            int i5 = i4 + 4;
            int i6 = groups[i5];
            if (i4 == i2) {
                iPropagatingFlagsOf = i3;
            }
            if ((iPropagatingFlagsOf & i6) == iPropagatingFlagsOf) {
                return;
            }
            groups[i5] = iPropagatingFlagsOf | i6;
            i4 = groups2[i4 + 2];
        }
        if (i4 == 0) {
            ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
        }
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final int childNodeCountOf(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[i2 + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.table.closeReader(this);
    }

    public final void endEmpty() {
        if (this.emptyCount <= 0) {
            ComposerKt.composeImmediateRuntimeError("Unbalanced begin/end empty");
        }
        int i2 = this.emptyCount - 1;
        this.emptyCount = i2;
        if (i2 == 0) {
            this._slots = this.addressSpace.getSlots();
            int[] groups = this.addressSpace.getGroups();
            this._groups = groups;
            int i3 = this.slotEnd - this.slotCurrent;
            if (this.emptyCount > 0) {
                groups = this.addressSpace.getGroups();
                this._groups = groups;
            }
            int i4 = groups[this.parent + 5];
            if (i4 != -1) {
                SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
                int i5 = i4 & 15;
                int i6 = i4 >> 4;
                int i7 = i5 + 1;
                if (i7 > 15) {
                    i7 = slotTableAddressSpace.getLargeSizes().get(i6);
                }
                int i8 = i6 + i7;
                this.slotCurrent = i8 - i3;
                this.slotEnd = i8;
            }
        }
    }

    public final void endGroup() {
        int i2;
        int i3 = this.parent;
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int[] iArr = this._groups;
        if (i3 + 6 > iArr.length) {
            return;
        }
        int i4 = iArr[i3 + 1];
        int i5 = iArr[i3 + 2];
        this.parent = i5;
        setPreviousSibling(i3);
        setCurrent(i4);
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int i6 = this._groups[i5 + 5];
        int i7 = i6 >> 4;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i6 == -1) {
            i2 = 0;
        } else {
            i2 = (i6 & 15) + 1;
            if (i2 > 15) {
                i2 = slotTableAddressSpace.getLargeSizes().get(i7);
            }
        }
        int i8 = i7 + i2;
        this.slotEnd = i8;
        this.slotCurrent = i8 - this.previousSlotCurrentOffset.popOr(0);
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (!getInEmpty()) {
            int previousSibling = getPreviousSibling();
            if (this.emptyCount > 0) {
                this._groups = this.addressSpace.getGroups();
            }
            int[] iArr = this._groups;
            if (this.emptyCount > 0) {
                this._slots = this.addressSpace.getSlots();
            }
            Object[] objArr = this._slots;
            SlotTable slotTable = this.table;
            int currentGroup = getCurrentGroup();
            int[] groups = slotTable.getAddressSpace().getGroups();
            int i2 = currentGroup;
            int i3 = previousSibling;
            int i4 = 0;
            while (i2 >= 0) {
                int i5 = iArr[i2 + 4];
                int i6 = i5 & 8388608;
                int i7 = iArr[i2 + 5] >> 4;
                int i8 = iArr[i2];
                long j2 = i3;
                int[] iArr2 = iArr;
                Object[] objArr2 = objArr;
                long j3 = i2;
                arrayList.add(new KeyInfo(i8, (i5 & 16777216) == 16777216 ? objArr[i7 + Integer.bitCount(i6)] : null, j3 | (j2 << 32), i6 == 8388608 ? 1 : 8388607 & i5, i4));
                iArr = iArr2;
                i3 = i2;
                i2 = groups[i2 + 1];
                i4++;
                objArr = objArr2;
            }
        }
        return arrayList;
    }

    public final int firstChildOf(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[i2 + 3];
    }

    public final int flagsOf(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[i2 + 4];
    }

    public final Object get(int i2, int i3) {
        if (i3 >= 0) {
            if (this.emptyCount > 0) {
                this._groups = this.addressSpace.getGroups();
            }
            int[] iArr = this._groups;
            if (this.emptyCount > 0) {
                this._slots = this.addressSpace.getSlots();
            }
            Object[] objArr = this._slots;
            int i4 = iArr[i2 + 5];
            if (i4 != -1) {
                int i5 = iArr[i2 + 4];
                SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
                int i6 = i4 & 15;
                int i7 = i4 >> 4;
                int i8 = i6 + 1;
                if (i8 > 15) {
                    i8 = slotTableAddressSpace.getLargeSizes().get(i7);
                }
                int iUtilitySlotsCountForFlags = i3 + GroupFlagsKt.utilitySlotsCountForFlags(i5);
                if (iUtilitySlotsCountForFlags < i8) {
                    return objArr[i7 + iUtilitySlotsCountForFlags];
                }
            }
        }
        return Composer.Companion.getEmpty();
    }

    public final int getCurrentGroup() {
        return getCurrent();
    }

    public final Object getGroupAux() {
        return groupAux(getCurrent());
    }

    public final int getGroupKey() {
        int current = getCurrent();
        if (current != -1) {
            return this.addressSpace.getGroups()[current];
        }
        return 0;
    }

    public final Object getGroupNode() {
        return groupNode(getCurrent());
    }

    public final Object getGroupObjectKey() {
        return groupObjectKey(getCurrent());
    }

    public final int getGroupReferenceSlotStartAddress() {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[this.parent + 5] >> 4;
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        return hasObjectKey(getCurrent());
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNextParentSlotAddress() {
        return this.slotCurrent;
    }

    public final int getNodeCount() {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[getCurrent() + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final Object getOrNull(int i2, int i3) {
        Object obj = get(i2, i3);
        if (obj == null || true == x.n(obj, Composer.Companion.getEmpty())) {
            return null;
        }
        return obj;
    }

    public final LinkAnchor getParentAnchor() {
        return this.addressSpace.anchorOfAddress(getParentGroup());
    }

    public final int getParentCurrentSlotOffset() {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int i2 = this._groups[this.parent + 5];
        if (i2 == -1) {
            return 0;
        }
        return this.slotCurrent - (i2 >> 4);
    }

    public final int getParentGroup() {
        return this.parent;
    }

    public final long getParentHandle() {
        return this.parent & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }

    public final Object getParentNode() {
        return groupNode(this.parent);
    }

    public final int getParentNodeCount() {
        if (this.parent == -1) {
            return 0;
        }
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[this.parent + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final int getPreviousSibling() {
        return this._previousSibling;
    }

    public final int getRemainingSlots() {
        return this.slotEnd - this.slotCurrent;
    }

    public final int getSlotCurrent() {
        return this.slotCurrent;
    }

    public final int getSlotEnd() {
        return this.slotEnd;
    }

    public final int getSlotIndex() {
        if (this.parent < 0) {
            return 0;
        }
        int i2 = this.slotCurrent;
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return i2 - (this._groups[this.parent + 5] >> 4);
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int[] groups = this._groups;
        int i3 = groups[i2 + 4];
        if (this.emptyCount > 0) {
            groups = this.addressSpace.getGroups();
            this._groups = groups;
        }
        int i4 = groups[i2 + 5];
        if ((i3 & GroupFlagsKt.HasAuxSlotFlag) != 33554432) {
            return Composer.Companion.getEmpty();
        }
        if (this.emptyCount > 0) {
            this._slots = this.addressSpace.getSlots();
        }
        return this._slots[(i4 >> 4) + Integer.bitCount(25165824 & i3)];
    }

    public final int groupKey(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[i2];
    }

    public final Object groupNode(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int[] groups = this._groups;
        int i3 = groups[i2 + 4];
        if (this.emptyCount > 0) {
            groups = this.addressSpace.getGroups();
            this._groups = groups;
        }
        int i4 = groups[i2 + 5];
        if ((i3 & 8388608) != 8388608) {
            return null;
        }
        if (this.emptyCount > 0) {
            this._slots = this.addressSpace.getSlots();
        }
        return this._slots[i4 >> 4];
    }

    public final Object groupObjectKey(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int[] groups = this._groups;
        int i3 = groups[i2 + 4];
        if (this.emptyCount > 0) {
            groups = this.addressSpace.getGroups();
            this._groups = groups;
        }
        int i4 = groups[i2 + 5];
        if ((i3 & 16777216) != 16777216) {
            return null;
        }
        if (this.emptyCount > 0) {
            this._slots = this.addressSpace.getSlots();
        }
        return this._slots[(i4 >> 4) + Integer.bitCount(8388608 & i3)];
    }

    public final long handle() {
        return GroupHandleKt.makeGroupHandle(this.parent, getPreviousSibling(), getCurrent());
    }

    public final boolean hasObjectKey(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return (this._groups[i2 + 4] & 16777216) == 16777216;
    }

    public final boolean hasRecomposeRequired(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return (this._groups[i2 + 4] & 201326592) != 0;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final boolean isEmpty() {
        return this.table.isEmpty();
    }

    public final boolean isGroupEnd() {
        return getCurrent() == -1 && !getInEmpty();
    }

    public final boolean isNode() {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return (this._groups[getCurrent() + 4] & 8388608) == 8388608;
    }

    public final Object maybeNode(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        if ((this._groups[i2 + 4] & 8388608) != 8388608) {
            return Composer.Companion.getEmpty();
        }
        if (this.emptyCount > 0) {
            this._slots = this.addressSpace.getSlots();
        }
        Object[] objArr = this._slots;
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return objArr[this._groups[i2 + 5] >> 4];
    }

    public final Object next() {
        if (getInEmpty() || this.slotCurrent >= this.slotEnd) {
            this.hadNext = false;
            return Composer.Companion.getEmpty();
        }
        this.hadNext = true;
        if (this.emptyCount > 0) {
            this._slots = this.addressSpace.getSlots();
        }
        Object[] objArr = this._slots;
        int i2 = this.slotCurrent;
        this.slotCurrent = i2 + 1;
        return objArr[i2];
    }

    public final int nextSiblingOf(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[i2 + 1];
    }

    public final Object node(int i2) {
        if (this.emptyCount > 0) {
            this._slots = this.addressSpace.getSlots();
        }
        Object[] objArr = this._slots;
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return objArr[this._groups[i2 + 5] >> 4];
    }

    public final int nodeCount(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int i3 = this._groups[i2 + 4];
        if ((i3 & 8388608) == 8388608) {
            return 1;
        }
        return i3 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final int parentGroupFlags() {
        return flagsOf(this.parent);
    }

    public final int parentOf(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return this._groups[i2 + 2];
    }

    public final boolean recomposeRequired(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return (this._groups[i2 + 4] & 67108864) == 67108864;
    }

    public final void removeFlag(int i2, int i3) {
        int[] groups = this.addressSpace.getGroups();
        int i4 = i2 + 4;
        int i5 = groups[i4];
        if ((i3 & i5) == i3) {
            int i6 = i5 & (~i3);
            groups[i4] = i6;
            int iPropagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i3);
            if ((i6 & iPropagatingFlagsOf) != 0) {
                return;
            }
            int i7 = i3 | iPropagatingFlagsOf;
            int[] groups2 = this.addressSpace.getGroups();
            int i8 = groups2[i2 + 2];
            while (i8 > 0) {
                int i9 = i8 + 4;
                int i10 = groups[i9];
                if ((i10 & iPropagatingFlagsOf) == 0) {
                    return;
                }
                int[] groups3 = this.addressSpace.getGroups();
                for (int i11 = groups3[i8 + 3]; i11 > 0; i11 = groups3[i11 + 1]) {
                    if ((groups[i11 + 4] & i7) != 0) {
                        return;
                    }
                }
                groups[i9] = i10 & (~iPropagatingFlagsOf);
                i8 = groups2[i8 + 2];
            }
            if (i8 == 0) {
                ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
            }
        }
    }

    public final void reposition(long j2) {
        if (getInEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        setCurrent(GroupHandleKt.getGroup(j2));
        setPreviousSibling(GroupHandleKt.getContext(j2));
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        this.parent = this._groups[getCurrent() + 2];
    }

    public final void restoreParent(int i2) {
        setPreviousSibling(0);
        this.parent = i2;
        this.slotCurrent = 0;
        this.slotEnd = 0;
    }

    public final long rootHandle() {
        return (this.table.getRoot() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (-4294967296L);
    }

    public final void setSlotCurrent(int i2) {
        this.slotCurrent = i2;
    }

    public final void setSlotEnd(int i2) {
        this.slotEnd = i2;
    }

    public final int skipGroup() {
        int current = getCurrent();
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int[] iArr = this._groups;
        if (current + 6 > iArr.length) {
            return 0;
        }
        int i2 = iArr[current + 4];
        int i3 = (i2 & 8388608) == 8388608 ? 1 : i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
        setCurrent(iArr[current + 1]);
        setPreviousSibling(current);
        return i3;
    }

    public final void skipToGroupEnd() {
        setCurrent(-1);
        setPreviousSibling(0);
        this.slotCurrent = 0;
        this.slotEnd = 0;
    }

    public final void startGroup() {
        int i2;
        int current = getCurrent();
        this.parent = current;
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        int[] iArr = this._groups;
        if (current + 6 > iArr.length) {
            return;
        }
        setCurrent(iArr[current + 3]);
        setPreviousSibling(-1);
        this.previousSlotCurrentOffset.push(this.slotEnd - this.slotCurrent);
        int i3 = iArr[current + 5];
        if (i3 == -1) {
            this.slotCurrent = -1;
            this.slotEnd = -1;
            return;
        }
        int i4 = iArr[current + 4];
        int i5 = i3 >> 4;
        this.slotCurrent = GroupFlagsKt.utilitySlotsCountForFlags(i4) + i5;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i3 == -1) {
            i2 = 0;
        } else {
            int i6 = (i3 & 15) + 1;
            i2 = i6 > 15 ? slotTableAddressSpace.getLargeSizes().get(i5) : i6;
        }
        this.slotEnd = i5 + i2;
    }

    public final void startNode() {
        if (!isNode()) {
            ComposerKt.composeImmediateRuntimeError("Expected a node group");
        }
        startGroup();
    }

    public final void traverseChildrenByHandle(int i2, l<? super Long, ab> lVar) {
        long jFirstChildOf = firstChildOf(i2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long group = -4294967296L;
        while (true) {
            long j2 = jFirstChildOf | group;
            if (GroupHandleKt.getGroup(j2) == -1) {
                return;
            }
            lVar.invoke(Long.valueOf(j2));
            group = GroupHandleKt.getGroup(j2) << 32;
            jFirstChildOf = nextSiblingOf(GroupHandleKt.getGroup(j2)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        }
    }

    public final void traverseChildrenConditionally(int i2, l<? super Integer, Boolean> lVar, l<? super Integer, Boolean> lVar2, l<? super Integer, ab> lVar3, l<? super Integer, ab> lVar4) {
        int iFirstChildOf = firstChildOf(i2);
        while (iFirstChildOf != -1) {
            Integer numValueOf = Integer.valueOf(iFirstChildOf);
            boolean zBooleanValue = lVar2.invoke(numValueOf).booleanValue();
            int iFirstChildOf2 = firstChildOf(iFirstChildOf);
            if (zBooleanValue || iFirstChildOf2 == -1 || !lVar.invoke(numValueOf).booleanValue()) {
                if (iFirstChildOf2 == -1 && !zBooleanValue) {
                    lVar4.invoke(numValueOf);
                }
                int iParentOf = iFirstChildOf;
                iFirstChildOf = nextSiblingOf(iFirstChildOf);
                while (iFirstChildOf == -1) {
                    iParentOf = parentOf(iParentOf);
                    if (iParentOf == -1 || iParentOf == i2) {
                        return;
                    }
                    lVar3.invoke(Integer.valueOf(iParentOf));
                    iFirstChildOf = nextSiblingOf(iParentOf);
                }
            } else {
                iFirstChildOf = iFirstChildOf2;
            }
        }
    }

    public final void traverseGroupPartially(int i2, boolean z, l<? super Integer, Boolean> lVar) {
        int i3;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i2 < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = slotTableAddressSpace.getGroups();
        int iPop = i2;
        while (true) {
            boolean zBooleanValue = lVar.invoke(Integer.valueOf(iPop)).booleanValue();
            if ((iPop != i2 || z) && (i3 = groups[iPop + 1]) >= 0) {
                intStack.push(i3);
            }
            iPop = groups[iPop + 3];
            if (!zBooleanValue || iPop < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    iPop = intStack.pop();
                }
            }
        }
    }

    public final boolean isNode(int i2) {
        if (this.emptyCount > 0) {
            this._groups = this.addressSpace.getGroups();
        }
        return (this._groups[i2 + 4] & 8388608) == 8388608;
    }

    public final void reposition(int i2) {
        reposition(i2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final Object get(int i2) {
        return get(getCurrent(), i2);
    }

    public final void removeFlag(int i2) {
        removeFlag(this.parent, i2);
    }
}
