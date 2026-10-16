package androidx.compose.runtime.composer.linkbuffer;

import androidx.collection.IntSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.LinkComposerKt;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableEditor {
    public static final int $stable = 8;
    private final SlotTableAddressSpace addressSpace;
    private int current;
    private boolean isClosed;
    private int parent = -1;
    private int previousSibling = -1;
    private final SlotTable table;

    /* compiled from: WazeSource */
    public interface VisitSlotsInRememberOrderCallback {
        boolean visit(int i2, int i3, Object obj);
    }

    public SlotTableEditor(SlotTable slotTable) {
        this.table = slotTable;
        this.current = slotTable.getRoot();
        this.addressSpace = slotTable.getAddressSpace();
    }

    private final void forEachSlotInRangeIndexed(Object[] objArr, int i2, p<? super Integer, Object, ab> pVar) {
        if (i2 != -1) {
            SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
            int i3 = i2 & 15;
            int i4 = i2 >> 4;
            int i5 = i3 + 1;
            if (i5 > 15) {
                i5 = slotTableAddressSpace.getLargeSizes().get(i4);
            }
            int i6 = i5 + i4;
            for (int i7 = i4; i7 < i6; i7++) {
                pVar.invoke(Integer.valueOf(i7 - i4), objArr[i7]);
            }
        }
    }

    private final void insertGroup(int i2) {
        int i3 = this.previousSibling;
        int i4 = this.parent;
        int[] groups = this.addressSpace.getGroups();
        if (i3 != -1) {
            groups[i3 + 1] = i2;
        } else if (i4 == -1) {
            this.table.setRoot(i2);
        } else {
            groups[i4 + 3] = i2;
        }
        groups[i2 + 2] = i4;
        groups[i2 + 1] = this.current;
        int i5 = groups[i2 + 4];
        int i6 = (i5 & 8388608) != 8388608 ? i5 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK : 1;
        this.current = i2;
        propagateChanges(i2, i6, 0, GroupFlagsKt.propagatingFlagsOf(i5), false);
    }

    public static /* synthetic */ long moveFrom$default(SlotTableEditor slotTableEditor, SlotTableEditor slotTableEditor2, long j2, long j3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = -1;
        }
        return slotTableEditor.moveFrom(slotTableEditor2, j2, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void propagateChanges(int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r2 = r0.addressSpace
            int[] r3 = r2.getGroups()
            int[] r2 = r2.getGroups()
            int r4 = r1 + 2
            r4 = r2[r4]
            r5 = r19
            r6 = r20
            r7 = r4
            r4 = r18
        L19:
            if (r7 <= 0) goto L77
            int r8 = r7 + 4
            r9 = r3[r8]
            r10 = 0
            if (r4 == 0) goto L34
            r11 = 8388607(0x7fffff, float:1.1754942E-38)
            r11 = r11 & r9
            r12 = -8388608(0xffffffffff800000, float:-Infinity)
            r9 = r9 & r12
            int r11 = r11 + r4
            r9 = r9 | r11
            r3[r8] = r9
            r11 = 8388608(0x800000, float:1.1754944E-38)
            r12 = r9 & r11
            if (r12 != r11) goto L34
            r4 = r10
        L34:
            if (r5 == 0) goto L5c
            int r11 = r5 >> 1
            r12 = r0
            androidx.compose.runtime.composer.linkbuffer.SlotTableEditor r12 = (androidx.compose.runtime.composer.linkbuffer.SlotTableEditor) r12
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r12 = r0.addressSpace
            int r13 = r7 + 3
            int[] r12 = r12.getGroups()
            r13 = r12[r13]
        L45:
            if (r13 <= 0) goto L5a
            if (r21 == 0) goto L4b
            if (r13 == r1) goto L55
        L4b:
            r14 = r5 | r11
            int r15 = r13 + 4
            r15 = r3[r15]
            r14 = r14 & r15
            if (r14 == 0) goto L55
            goto L5c
        L55:
            int r13 = r13 + 1
            r13 = r12[r13]
            goto L45
        L5a:
            r11 = r5
            goto L5d
        L5c:
            r11 = r10
        L5d:
            if (r11 != 0) goto L62
            if (r6 == 0) goto L6b
            r11 = r10
        L62:
            int r12 = ~r11
            r12 = r12 & r9
            r12 = r12 | r6
            if (r12 == r9) goto L6b
            r3[r8] = r12
            r5 = r11
            goto L6c
        L6b:
            r6 = r10
        L6c:
            if (r4 != 0) goto L72
            if (r5 != 0) goto L72
            if (r6 == 0) goto L82
        L72:
            int r7 = r7 + 2
            r7 = r2[r7]
            goto L19
        L77:
            if (r7 != 0) goto L82
            java.lang.String r0 = "Traversing parent of group not in the slot table: "
            java.lang.String r0 = androidx.compose.runtime.composer.linkbuffer.a.a(r1, r0)
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r0)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.propagateChanges(int, int, int, int, boolean):void");
    }

    public static /* synthetic */ void updateNode$default(SlotTableEditor slotTableEditor, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i2 = slotTableEditor.getCurrentGroup();
        }
        slotTableEditor.updateNode(i2, obj);
    }

    public final void addFlagsToAllGroupsIn(IntSet intSet, int i2) {
        int i3;
        int[] iArr = intSet.elements;
        long[] jArr = intSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j2 = jArr[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length;
                int i6 = 0;
                while (true) {
                    i3 = 8 - ((~i5) >>> 31);
                    if (i6 >= i3) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        propagateChanges(iArr[(i4 << 3) + i6], 0, 0, i2, false);
                    }
                    j2 >>= 8;
                    i6++;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void appendSlot(Object obj) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.parent;
        int i3 = groups[i2 + 5];
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (i3 == -1) {
            slotTableAddressSpace.writeSlot(i2, 0, obj);
            return;
        }
        int i4 = i3 & 15;
        int i5 = i3 >> 4;
        int i6 = i4 + 1;
        if (i6 > 15) {
            i6 = slotTableAddressSpace.getLargeSizes().get(i5);
        }
        this.addressSpace.writeSlot(i2, i6, obj);
    }

    public final void bashGroup$runtime(int i2) {
        this.addressSpace.getGroups()[getCurrentGroup()] = i2;
    }

    public final SlotTable buildInsertTable(l<? super SlotTableBuilder, ab> lVar) {
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(getAddressSpace$runtime(), false, false);
        slotTableBuilder.buildStart();
        lVar.invoke(slotTableBuilder);
        return slotTableBuilder.build();
    }

    public final void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.table.closeEditor(this);
    }

    public final boolean containsHandle(long j2) {
        int group = GroupHandleKt.getGroup(j2);
        if (group == -1) {
            group = GroupHandleKt.getContext(j2);
        }
        if (group == -1) {
            return false;
        }
        SlotTable slotTable = this.table;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int root = slotTable.getRoot();
        int[] groups = slotTableAddressSpace.getGroups();
        int[] groups2 = slotTableAddressSpace.getGroups();
        int i2 = group;
        while (i2 > 0) {
            if (i2 == root) {
                return true;
            }
            int i3 = i2 + 2;
            if (groups[i3] == -1) {
                int[] groups3 = this.addressSpace.getGroups();
                for (int i4 = root; i4 >= 0; i4 = groups3[i4 + 1]) {
                    if (i4 == i2) {
                        return true;
                    }
                }
            }
            i2 = groups2[i3];
        }
        if (i2 == 0) {
            ComposerKt.composeImmediateRuntimeError(a.a(group, "Traversing parent of group not in the slot table: "));
        }
        return false;
    }

    public final void endGroup() {
        int i2 = this.parent;
        int i3 = i2 + 6;
        int[] groups = this.addressSpace.getGroups();
        if (i3 > groups.length) {
            return;
        }
        int i4 = groups[i2 + 1];
        this.parent = groups[i2 + 2];
        this.previousSibling = i2;
        this.current = i4;
    }

    public final int firstChildOf(int i2) {
        return this.addressSpace.getGroups()[i2 + 3];
    }

    public final int flagsOf(int i2) {
        return this.addressSpace.getGroups()[i2 + 4];
    }

    public final SlotTableAddressSpace getAddressSpace$runtime() {
        return this.addressSpace;
    }

    public final int getCurrentGroup() {
        return this.current;
    }

    public final int getGroupKey() {
        return this.addressSpace.getGroups()[this.current];
    }

    public final Object getNode() {
        return node(this.current);
    }

    public final Object getObjectKey() {
        return objectKey(this.current);
    }

    public final int getParentGroup() {
        return this.parent;
    }

    public final int getPreviousSibling() {
        return this.previousSibling;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int groupKey(int i2) {
        return this.addressSpace.getGroups()[i2];
    }

    public final long handle() {
        return (this.previousSibling << 32) | (this.current & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final void insertGroupFrom(SlotTable slotTable, long j2) {
        if (!x.n(slotTable.getAddressSpace(), this.table.getAddressSpace())) {
            throw new IllegalArgumentException("Cannot insert a group from an unrelated table");
        }
        SlotTableEditor slotTableEditorOpenEditor = slotTable.openEditor();
        try {
            slotTableEditorOpenEditor.seek(j2);
            slotTableEditorOpenEditor.removeGroup(false);
            slotTableEditorOpenEditor.close();
            insertGroup(GroupHandleKt.getGroup(j2));
        } catch (Throwable th) {
            slotTableEditorOpenEditor.close();
            throw th;
        }
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final boolean isEmpty() {
        return this.table.isEmpty();
    }

    public final boolean isGroupEnd() {
        return this.current == -1;
    }

    public final boolean isNode() {
        return (this.addressSpace.getGroups()[this.current + 4] & 8388608) == 8388608;
    }

    public final boolean isParentGroupANode() {
        return (this.addressSpace.getGroups()[this.parent + 4] & 8388608) == 8388608;
    }

    public final long moveFrom(SlotTableEditor slotTableEditor, long j2, long j3) {
        int group;
        long jHandle;
        slotTableEditor.seek(j2);
        if (x.n(slotTableEditor.addressSpace, this.addressSpace)) {
            group = GroupHandleKt.getGroup(j2);
            slotTableEditor.removeGroup(false);
        } else {
            group = this.addressSpace.copyTreeFrom(slotTableEditor.addressSpace, GroupHandleKt.getGroup(j2));
            slotTableEditor.removeGroup(true);
        }
        if (j3 != -1) {
            jHandle = handle();
            seek(j3);
        } else {
            jHandle = -1;
        }
        int i2 = this.previousSibling;
        insertGroup(group);
        this.previousSibling = i2;
        this.current = group;
        long j4 = i2;
        long j5 = group;
        if (jHandle != -1) {
            seek(jHandle);
        }
        if (this.table.getRecordSourceInformation()) {
            this.addressSpace.recordMovedSourceInformation(group, i2);
        }
        return (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j5) | (j4 << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r8 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        throw new java.lang.IllegalStateException("Could not find the group previous to current(" + r0 + ')');
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034 A[EDGE_INSN: B:25:0x0034->B:17:0x0034 BREAK  A[LOOP:0: B:11:0x0027->B:14:0x002f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void moveGroup(long r8) {
        /*
            r7 = this;
            int r0 = r7.current
            int r1 = r7.previousSibling
            int r2 = androidx.compose.runtime.composer.linkbuffer.GroupHandleKt.getGroup(r8)
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r3 = r7.addressSpace
            int[] r3 = r3.getGroups()
            int r4 = r7.parent
            int r8 = androidx.compose.runtime.composer.linkbuffer.GroupHandleKt.getContext(r8)
            r9 = -1
            if (r8 != r9) goto L1e
            int r8 = r4 + 3
            r8 = r3[r8]
            if (r8 != r2) goto L26
            r8 = r9
        L1e:
            if (r8 == r9) goto L4d
            int r5 = r8 + 1
            r5 = r3[r5]
            if (r5 == r2) goto L4d
        L26:
            r8 = r0
        L27:
            if (r8 == r9) goto L34
            int r5 = r8 + 1
            r5 = r3[r5]
            if (r5 == r2) goto L31
            r8 = r5
            goto L27
        L31:
            if (r8 == r9) goto L34
            goto L4d
        L34:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Could not find the group previous to current("
            r7.<init>(r8)
            r7.append(r0)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r7)
            throw r8
        L4d:
            int r5 = r2 + 1
            r6 = r3[r5]
            int r8 = r8 + 1
            r3[r8] = r6
            r3[r5] = r0
            if (r1 != r9) goto L5e
            int r4 = r4 + 3
            r3[r4] = r2
            goto L62
        L5e:
            int r1 = r1 + 1
            r3[r1] = r2
        L62:
            r7.current = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.moveGroup(long):void");
    }

    public final Object node(int i2) {
        int[] groups = this.addressSpace.getGroups();
        if ((groups[i2 + 4] & 8388608) == 8388608) {
            return this.addressSpace.getSlots()[groups[i2 + 5] >> 4];
        }
        return null;
    }

    public final int nodeCountOf(int i2) {
        int i3 = this.addressSpace.getGroups()[i2 + 4];
        if ((i3 & 8388608) == 8388608) {
            return 1;
        }
        return i3 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final Object objectKey(int i2) {
        int[] groups = this.addressSpace.getGroups();
        int i3 = groups[i2 + 4];
        return (i3 & 16777216) == 16777216 ? this.addressSpace.getSlots()[(groups[i2 + 5] >> 4) + Integer.bitCount(8388608 & i3)] : Composer.Companion.getEmpty();
    }

    public final int parentGroup(int i2) {
        return this.addressSpace.getGroups()[i2 + 2];
    }

    public final int parentOf(int i2) {
        return this.addressSpace.getGroups()[i2 + 2];
    }

    public final void removeAllInstancesOfFlags(int i2) {
        boolean z;
        SlotTable slotTable = this.table;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        int root = slotTable.getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups2 = slotTableAddressSpace.getGroups();
        while (true) {
            int iPropagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(i2) | i2;
            int i3 = root + 4;
            int i4 = groups[i3];
            if ((iPropagatingFlagsOf & i4) == 0) {
                z = false;
            } else {
                groups[i3] = (~iPropagatingFlagsOf) & i4;
                z = true;
            }
            int i5 = groups2[root + 1];
            if (i5 >= 0) {
                intStack.push(i5);
            }
            root = groups2[root + 3];
            if (!z || root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    public final void removeGroup(boolean z) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.current;
        int i3 = groups[i2 + 4];
        propagateChanges(i2, -((i3 & 8388608) == 8388608 ? 1 : 8388607 & i3), GroupFlagsKt.propagatingFlagsOf(i3), 0, true);
        int i4 = groups[i2 + 1];
        int i5 = this.previousSibling;
        if (i5 == -1) {
            int i6 = this.parent;
            if (i6 == -1) {
                this.table.setRoot(i4);
            } else {
                groups[i6 + 3] = i4;
            }
        } else {
            groups[i5 + 1] = i4;
        }
        if (z) {
            this.addressSpace.freeGroupTree(i2);
        }
        this.current = i4;
    }

    public final void reset() {
        this.parent = -1;
        this.previousSibling = -1;
        this.current = this.table.getRoot();
    }

    public final void seek(long j2) {
        if (j2 != -1) {
            containsHandle(j2);
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int group = GroupHandleKt.getGroup(j2);
        int context = GroupHandleKt.getContext(j2);
        int[] groups = slotTableAddressSpace.getGroups();
        int i2 = group == -1 ? context : groups[group + 2];
        if (group == -1) {
            context = -1;
        }
        this.parent = i2;
        this.current = group;
        if (context != -1 ? groups[context + 1] != group : !(i2 != -1 ? groups[i2 + 3] == group : this.table.getRoot() == group)) {
            int[] groups2 = this.addressSpace.getGroups();
            int i3 = -1;
            for (int root = i2 == -1 ? this.table.getRoot() : groups[i2 + 3]; root >= 0 && root != group; root = groups2[root + 1]) {
                i3 = root;
            }
            context = i3;
        }
        if (context != -1) {
            int i4 = groups[context + 1];
        } else if (i2 == -1) {
            this.table.getRoot();
        } else {
            int i5 = groups[i2 + 3];
        }
        this.previousSibling = context;
    }

    public final Object setAbsolute(int i2, Object obj) {
        Object[] slots = this.addressSpace.getSlots();
        if (i2 >= 0) {
            int length = slots.length;
        }
        Object obj2 = slots[i2];
        slots[i2] = obj;
        return obj2;
    }

    public final Object setRelative(int i2, Object obj) {
        return setAbsolute((this.addressSpace.getGroups()[this.parent + 5] >> 4) + i2, obj);
    }

    public final int skipGroup() {
        int i2 = this.current;
        if (i2 == -1) {
            throw new IllegalStateException("Skipping past the end of a group");
        }
        this.previousSibling = i2;
        this.current = this.addressSpace.getGroups()[i2 + 1];
        int i3 = this.addressSpace.getGroups()[i2 + 4];
        if ((i3 & 8388608) == 8388608) {
            return 1;
        }
        return i3 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public final void skipToGroupEnd() {
        int i2 = this.current;
        if (i2 != -1) {
            int i3 = this.previousSibling;
            int[] groups = this.addressSpace.getGroups();
            while (i2 != -1) {
                i3 = i2;
                i2 = groups[i2 + 1];
            }
            this.previousSibling = i3;
            this.current = -1;
        }
    }

    public final void startGroup() {
        int i2 = this.current;
        if (i2 <= 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a group because current does not refer to a child of a group");
        }
        this.parent = i2;
        int i3 = i2 + 6;
        int[] groups = this.addressSpace.getGroups();
        if (i3 > groups.length) {
            return;
        }
        this.current = groups[i2 + 3];
        this.previousSibling = -1;
    }

    public final void trimSlots(int i2) {
        int i3;
        int i4 = this.parent;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        int i5 = groups[i4 + 5];
        if (i5 == -1) {
            i3 = 0;
        } else {
            int i6 = (i5 & 15) + 1;
            i3 = i6 > 15 ? slotTableAddressSpace.getLargeSizes().get(i5 >> 4) : i6;
        }
        int i7 = i3 - i2;
        if (i7 < GroupFlagsKt.utilitySlotsCountForFlags(groups[i4 + 4])) {
            ComposerKt.composeImmediateRuntimeError("Attempted to trim more slots than the group has");
        }
        slotTableAddressSpace.resizeSlotRangeAtGroup(i4, i7);
    }

    public final void updateAux(Object obj) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.current;
        this.addressSpace.getSlots()[(groups[i2 + 5] >> 4) + Integer.bitCount(25165824 & groups[i2 + 4])] = obj;
    }

    public final void updateNode(int i2, Object obj) {
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        int i3 = groups[i2 + 4];
        slots[groups[i2 + 5] >> 4] = obj;
    }

    public final void updateParentNode(Object obj) {
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.parent;
        int i3 = groups[i2 + 4];
        this.addressSpace.getSlots()[groups[i2 + 5] >> 4] = obj;
    }

    public final void visitSlotsInRememberOrder(int i2, VisitSlotsInRememberOrderCallback visitSlotsInRememberOrderCallback) {
        if (i2 < 0) {
            return;
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        int i3 = groups[i2 + 5];
        int i4 = -1;
        if (i3 != -1) {
            SlotTableAddressSpace slotTableAddressSpace2 = this.addressSpace;
            int i5 = (i3 & 15) + 1;
            int i6 = i3 >> 4;
            if (i5 > 15) {
                i5 = slotTableAddressSpace2.getLargeSizes().get(i6);
            }
            int i7 = i5 + i6;
            for (int i8 = i6; i8 < i7; i8++) {
                int i9 = i8 - i6;
                Object obj = slots[i8];
                if (obj instanceof RememberObserverHolder) {
                    int address = LinkComposerKt.asLinkRememberObserverHolder((RememberObserverHolder) obj).getAfter().getAddress();
                    while (i4 != address) {
                        i4 = i4 < 0 ? groups[i2 + 3] : groups[i4 + 1];
                        if (i4 < 0) {
                            ComposerKt.composeImmediateRuntimeError("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                        }
                        visitSlotsInRememberOrder(i4, visitSlotsInRememberOrderCallback);
                    }
                }
                if (visitSlotsInRememberOrderCallback.visit(i2, i9, obj)) {
                    slots[i9 + i6] = Composer.Companion.getEmpty();
                }
            }
        }
        for (int i10 = i4 < 0 ? groups[i2 + 3] : groups[i4 + 1]; i10 >= 0; i10 = groups[i10 + 1]) {
            visitSlotsInRememberOrder(i10, visitSlotsInRememberOrderCallback);
        }
    }

    public final void visitTailSlotsInRememberOrder$runtime(int i2, int i3, int i4, VisitSlotsInRememberOrderCallback visitSlotsInRememberOrderCallback) {
        int i5;
        if (i2 < 0) {
            return;
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        int i6 = groups[i2 + 5];
        int i7 = i6 >> 4;
        SlotTableAddressSpace slotTableAddressSpace2 = this.addressSpace;
        int i8 = -1;
        if (i6 == -1) {
            i5 = 0;
        } else {
            i5 = (i6 & 15) + 1;
            if (i5 > 15) {
                i5 = slotTableAddressSpace2.getLargeSizes().get(i7);
            }
        }
        int i9 = (i5 + i7) - i4;
        int i10 = i9 + i4;
        boolean z = false;
        for (int i11 = i9; i11 < i10; i11++) {
            int i12 = i11 - i9;
            Object obj = slots[i11];
            if (obj instanceof RememberObserverHolder) {
                int address = LinkComposerKt.asLinkRememberObserverHolder((RememberObserverHolder) obj).getAfter().getAddress();
                while (i8 != address) {
                    i8 = i8 < 0 ? groups[i2 + 3] : groups[i8 + 1];
                    if (i8 < 0) {
                        ComposerKt.composeImmediateRuntimeError("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                    }
                    z |= i3 == i8;
                    if (z) {
                        visitSlotsInRememberOrder(i8, visitSlotsInRememberOrderCallback);
                    }
                }
            }
            if (visitSlotsInRememberOrderCallback.visit(i2, i12, obj)) {
                slots[i12 + i7] = Composer.Companion.getEmpty();
            }
        }
        int i13 = i8 < 0 ? groups[i2 + 3] : groups[i8 + 1];
        while (i13 >= 0) {
            z |= i3 == i13;
            if (z) {
                visitSlotsInRememberOrder(i13, visitSlotsInRememberOrderCallback);
            }
            i13 = groups[i13 + 1];
        }
    }

    public static /* synthetic */ void moveFrom$default(SlotTableEditor slotTableEditor, SlotTable slotTable, long j2, long j3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = -1;
        }
        slotTableEditor.moveFrom(slotTable, j2, j3);
    }

    public final boolean isNode(int i2) {
        return (flagsOf(i2) & 8388608) == 8388608;
    }

    private final void forEachSlotInRangeIndexed(Object[] objArr, int i2, int i3, p<? super Integer, Object, ab> pVar) {
        for (int i4 = i2; i4 < i3; i4++) {
            pVar.invoke(Integer.valueOf(i4 - i2), objArr[i4]);
        }
    }

    public final void moveFrom(SlotTable slotTable, long j2, long j3) {
        SlotTableEditor slotTableEditorOpenEditor = slotTable.openEditor();
        try {
            moveFrom(slotTableEditorOpenEditor, j2, j3);
        } finally {
            slotTableEditorOpenEditor.close();
        }
    }

    public final void moveGroup(int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.current;
        int i4 = this.previousSibling;
        int[] groups = this.addressSpace.getGroups();
        int i5 = 0;
        int i6 = i3;
        int i7 = i4;
        while (true) {
            int i8 = i6 + 1;
            if (i5 < i2) {
                int i9 = groups[i8];
                if (i9 == -1) {
                    throw new IllegalStateException("Offset(" + i2 + ") too large");
                }
                i5++;
                i7 = i6;
                i6 = i9;
            } else {
                groups[i7 + 1] = groups[i8];
                groups[i8] = i3;
                if (i4 == -1) {
                    groups[this.parent + 3] = i6;
                } else {
                    groups[i4 + 1] = i6;
                }
                this.current = i6;
                return;
            }
        }
    }

    public final void seek(LinkAnchor linkAnchor) {
        seek(linkAnchor.getAddress() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
