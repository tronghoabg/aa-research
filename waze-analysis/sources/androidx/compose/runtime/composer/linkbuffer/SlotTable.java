package androidx.compose.runtime.composer.linkbuffer;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.m.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTable extends SlotStorage implements CompositionData, Iterable<CompositionGroup>, h.g.b.a.a {
    private final SlotTableAddressSpace addressSpace;
    private SlotTableEditor currentEditor;
    private int openReaders;
    private boolean recordCallByInformation;
    private boolean recordSourceInformation;
    private int root;
    private int version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    public final class DebugGroup {
        private final int address;

        public DebugGroup(int i2) {
            this.address = i2;
        }

        public final int getAddress() {
            return this.address;
        }

        public final Object getAux() {
            return (getFlags() & GroupFlagsKt.HasAuxSlotFlag) == 33554432 ? SlotTable.this.getSlots()[getSlotRange().getAddress() + Integer.bitCount(getFlags() & 25165824)] : Composer.Companion.getEmpty();
        }

        public final List<DebugGroup> getChildren() {
            return k.j(k.b(new SlotTable$DebugGroup$children$1(SlotTable.this, this, null)));
        }

        public final int getFlags() {
            return SlotTable.this.getGroups()[this.address + 4];
        }

        public final boolean getHasMovableContent() {
            return (getFlags() & 536870912) == 536870912;
        }

        public final boolean getHasRecomposeRequired() {
            return (getFlags() & 134217728) == 134217728;
        }

        public final boolean getHasSubComposition() {
            return (getFlags() & Integer.MIN_VALUE) == Integer.MIN_VALUE;
        }

        public final int getKey() {
            return SlotTable.this.getGroups()[this.address];
        }

        public final Object getNode() {
            if ((getFlags() & 8388608) != 8388608) {
                return Composer.Companion.getEmpty();
            }
            Object[] slots = SlotTable.this.getSlots();
            int address = getSlotRange().getAddress();
            getFlags();
            return slots[address];
        }

        public final Object getObjectKey() {
            return (getFlags() & 16777216) == 16777216 ? SlotTable.this.getSlots()[getSlotRange().getAddress() + Integer.bitCount(getFlags() & 8388608)] : Composer.Companion.getEmpty();
        }

        public final DebugSlotRange getSlotRange() {
            return SlotTable.this.new DebugSlotRange(SlotTable.this.getGroups()[this.address + 5]);
        }

        public final List<Object> getSlots() {
            return k.j(k.b(new SlotTable$DebugGroup$slots$1(this, SlotTable.this, null)));
        }

        public final boolean isMovableContent() {
            return (getFlags() & 268435456) == 268435456;
        }

        public final boolean isNode() {
            return (getFlags() & 8388608) == 8388608;
        }

        public final boolean isRecomposeRequired() {
            return (getFlags() & 67108864) == 67108864;
        }

        public final boolean isSubComposition() {
            return (getFlags() & 67108864) == 67108864;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Group(");
            sb.append(getKey());
            if ((getFlags() & (-67108864)) != 0) {
                sb.append(", flags=");
                if (isMovableContent()) {
                    sb.append('C');
                }
                if (getHasMovableContent()) {
                    sb.append('c');
                }
                if (isSubComposition()) {
                    sb.append('S');
                }
                if (getHasSubComposition()) {
                    sb.append('s');
                }
                if (isRecomposeRequired()) {
                    sb.append('R');
                }
                if (getHasRecomposeRequired()) {
                    sb.append('r');
                }
            }
            if ((getFlags() & 16777216) == 16777216) {
                sb.append(", object key");
            }
            if ((getFlags() & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
                sb.append(", aux");
            }
            if (isNode()) {
                sb.append(", node");
            }
            SlotTable slotTable = SlotTable.this;
            if (slotTable.getGroups()[this.address + 3] != -1) {
                int i2 = this.address;
                int[] groups = slotTable.getAddressSpace().getGroups();
                int i3 = 0;
                for (int i4 = groups[i2 + 3]; i4 > 0; i4 = groups[i4 + 1]) {
                    i3++;
                }
                sb.append(", ");
                sb.append(i3);
                sb.append(i3 == 1 ? " child" : " children");
            }
            if (slotTable.getGroups()[this.address + 5] != -1) {
                sb.append(", ");
                sb.append(getSlotRange().getSize());
                sb.append(" slots");
            }
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: WazeSource */
    public final class DebugSlotRange {
        private final int range;

        public DebugSlotRange(int i2) {
            this.range = i2;
        }

        public final int getAddress() {
            return this.range >> 4;
        }

        public final int getEnd() {
            return getAddress() + getSize();
        }

        public final int getRange() {
            return this.range;
        }

        public final int getSize() {
            int i2 = this.range;
            SlotTableAddressSpace addressSpace = SlotTable.this.getAddressSpace();
            if (i2 == -1) {
                return 0;
            }
            int i3 = (i2 & 15) + 1;
            return i3 > 15 ? addressSpace.getLargeSizes().get(i2 >> 4) : i3;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.composer.linkbuffer.SlotTable$getSlots$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterable<Object>, h.g.b.a.a {
        AnonymousClass1() {
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return k.a(new SlotTable$getSlots$1$iterator$1(SlotTable.this, null));
        }
    }

    public /* synthetic */ SlotTable(int i2, SlotTableAddressSpace slotTableAddressSpace, boolean z, boolean z2, int i3, o oVar) {
        this(1 == (i3 & 1) ? -1 : i2, (i3 & 2) != 0 ? new SlotTableAddressSpace() : slotTableAddressSpace, z & ((i3 & 4) == 0), z2 & ((i3 & 8) == 0));
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i2) {
        int[] groups = getAddressSpace().getGroups();
        int i3 = i2;
        while (i3 > 0) {
            RecomposeScopeImpl recomposeScopeOrNull$runtime = getRecomposeScopeOrNull$runtime(i3);
            if (recomposeScopeOrNull$runtime != null) {
                if (recomposeScopeOrNull$runtime.getUsed() && i3 != i2) {
                    return recomposeScopeOrNull$runtime;
                }
                recomposeScopeOrNull$runtime.setForcedRecompose(true);
            }
            i3 = groups[i3 + 2];
        }
        if (i3 != 0) {
            return null;
        }
        ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] getGroups() {
        return this.addressSpace.getGroups();
    }

    private static final void toDebugString$lambda$0$dumpGroup(StringBuilder sb, SlotTable slotTable, boolean z, int i2, String str) {
        int i3;
        sb.append(str);
        int[] groups = slotTable.addressSpace.getGroups();
        sb.append("Group(" + i2 + ") key: " + groups[i2]);
        Object[] slots = slotTable.addressSpace.getSlots();
        int i4 = groups[i2 + 5];
        int i5 = groups[i2 + 4];
        int i6 = 8388607 & i5;
        if (i6 > 0) {
            sb.append(" Nodes: ");
            sb.append(i6);
        }
        if (((-67108864) & i5) != 0) {
            sb.append(" Marks: ");
            if ((i5 & 268435456) == 268435456) {
                sb.append('C');
            }
            if ((i5 & 536870912) == 536870912) {
                sb.append('c');
            }
            if ((i5 & 1073741824) == 1073741824) {
                sb.append('S');
            }
            if ((i5 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                sb.append('s');
            }
            if ((i5 & 67108864) == 67108864) {
                sb.append('R');
            }
            if ((i5 & 134217728) == 134217728) {
                sb.append('r');
            }
        }
        if (z) {
            int i7 = i4 >> 4;
            if (i4 != -1) {
                SlotTableAddressSpace slotTableAddressSpace = slotTable.addressSpace;
                if (i4 == -1) {
                    i3 = 0;
                } else {
                    i3 = (i4 & 15) + 1;
                    if (i3 > 15) {
                        i3 = slotTableAddressSpace.getLargeSizes().get(i7);
                    }
                }
                int i8 = i3 + i7;
                if ((i5 & 8388608) == 8388608) {
                    sb.append(" Node: ");
                    sb.append(SlotTableKt.summarize(slots[i7], 10));
                    i7++;
                }
                if ((i5 & 16777216) == 16777216) {
                    sb.append(" Key: ");
                    sb.append(SlotTableKt.summarize(slots[i7], 10));
                    i7++;
                }
                if ((i5 & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
                    sb.append(" Aux: ");
                    sb.append(SlotTableKt.summarize(slots[i7], 10));
                    i7++;
                }
                if (i7 < i8) {
                    sb.append(" (" + i7 + '-' + i8 + ")[");
                    while (i7 < i8) {
                        int i9 = i7 + 1;
                        sb.append(SlotTableKt.summarize(slots[i7], 10));
                        if (i9 < i8) {
                            sb.append(", ");
                        }
                        i7 = i9;
                    }
                    sb.append("]");
                }
            }
        }
        sb.append(":\n");
        String strValueOf = String.valueOf(str);
        int[] groups2 = slotTable.getAddressSpace().getGroups();
        for (int i10 = groups2[i2 + 3]; i10 > 0; i10 = groups2[i10 + 1]) {
            toDebugString$lambda$0$dumpGroup(sb, slotTable, z, i10, strValueOf.concat("  "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void traverseGroup$runtime$default(androidx.compose.runtime.composer.linkbuffer.SlotTable r2, int r3, boolean r4, h.g.a.l r5, int r6, java.lang.Object r7) {
        /*
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r2 = r2.getAddressSpace()
            if (r3 < 0) goto L3c
            androidx.compose.runtime.IntStack r7 = new androidx.compose.runtime.IntStack
            r7.<init>()
            int[] r2 = r2.getGroups()
            r0 = r3
        L10:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r5.invoke(r1)
            if (r0 != r3) goto L23
            r1 = r6 & 2
            if (r1 == 0) goto L1f
            r1 = 0
            goto L20
        L1f:
            r1 = 1
        L20:
            r1 = r1 & r4
            if (r1 == 0) goto L2c
        L23:
            int r1 = r0 + 1
            r1 = r2[r1]
            if (r1 < 0) goto L2c
            r7.push(r1)
        L2c:
            int r0 = r0 + 3
            r0 = r2[r0]
            if (r0 >= 0) goto L10
            int r0 = r7.tos
            if (r0 != 0) goto L37
            goto L3c
        L37:
            int r0 = r7.pop()
            goto L10
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTable.traverseGroup$runtime$default(androidx.compose.runtime.composer.linkbuffer.SlotTable, int, boolean, h.g.a.l, int, java.lang.Object):void");
    }

    private static final int verifyWellFormed$validateGroup(MutableIntSet mutableIntSet, int[] iArr, SlotTable slotTable, Object[] objArr, int i2, int i3) {
        if (i3 == -1) {
            return 0;
        }
        if (mutableIntSet.contains(i3)) {
            throw new IllegalStateException(a.a(i3, "Circular group encountered at "));
        }
        mutableIntSet.add(i3);
        if (i3 % 6 != 0) {
            throw new IllegalStateException(a.a(i3, "Invalid group address: "));
        }
        if (iArr[i3 + 2] != i2) {
            throw new IllegalStateException(a.a(i3, "Invalid parent link in group "));
        }
        SlotTable slotTable2 = slotTable;
        Object[] objArr2 = objArr;
        verifyWellFormed$validateSlotRange(slotTable2, objArr2, i3, iArr[i3 + 5]);
        int i4 = i3 + 4;
        int i5 = iArr[i4] & GroupFlagsKt.HasMarkFlags;
        int[] groups = slotTable2.getAddressSpace().getGroups();
        int i6 = groups[i3 + 3];
        int iVerifyWellFormed$validateGroup = 0;
        int i7 = 0;
        while (i6 > 0) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(mutableIntSet, iArr, slotTable2, objArr2, i3, i6);
            int iPropagatingFlagsOf = GroupFlagsKt.propagatingFlagsOf(iArr[i6 + 4]);
            i7 |= iPropagatingFlagsOf;
            if (iPropagatingFlagsOf != 0 && (i5 & iPropagatingFlagsOf) == 0) {
                StringBuilder sb = new StringBuilder("Group ");
                sb.append(i6);
                sb.append(" contains a flag that the parent, ");
                sb.append(i3);
                sb.append(", is not recorded as having, ");
                k.y(16);
                String string = Integer.toString(iPropagatingFlagsOf, 16);
                x.e(string, "toString(...)");
                sb.append(string);
                sb.append(' ');
                sb.append(SlotTableKt.flagsNames(iPropagatingFlagsOf));
                throw new IllegalStateException(sb.toString());
            }
            i6 = groups[i6 + 1];
            slotTable2 = slotTable;
            objArr2 = objArr;
        }
        int i8 = iArr[i4];
        int i9 = 8388607 & i8;
        if (i9 != iVerifyWellFormed$validateGroup) {
            throw new IllegalStateException("Unexpected node count for group " + i3 + ", expected " + iVerifyWellFormed$validateGroup + ", received: " + i9);
        }
        if (i5 == i7) {
            if ((i8 & 8388608) == 8388608) {
                return 1;
            }
            return i9;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected has mark flags for group ");
        sb2.append(i3);
        sb2.append(", expected ");
        k.y(16);
        String string2 = Integer.toString(i7, 16);
        x.e(string2, "toString(...)");
        sb2.append(string2);
        sb2.append(' ');
        sb2.append(SlotTableKt.flagsNames(i7));
        sb2.append(", received ");
        k.y(16);
        String string3 = Integer.toString(i5, 16);
        x.e(string3, "toString(...)");
        sb2.append(string3);
        sb2.append(' ');
        sb2.append(SlotTableKt.flagsNames(i5));
        throw new IllegalStateException(sb2.toString());
    }

    private static final void verifyWellFormed$validateSlotRange(SlotTable slotTable, Object[] objArr, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        SlotTableAddressSpace slotTableAddressSpace = slotTable.addressSpace;
        int i4 = i3 & 15;
        int i5 = i3 >> 4;
        if (i4 + 1 > 15) {
            slotTableAddressSpace.getLargeSizes().get(i5);
        }
        if (i5 < 0 || i5 >= objArr.length) {
            throw new IllegalStateException("Slot index for group " + i2 + " out of bounds: " + i5);
        }
    }

    public final SlotTable buildSubTable(l<? super SlotTableBuilder, ab> lVar) {
        SlotTableBuilder slotTableBuilder = new SlotTableBuilder(getAddressSpace(), false, false);
        slotTableBuilder.buildStart();
        lVar.invoke(slotTableBuilder);
        return slotTableBuilder.build();
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void clear(RememberManager rememberManager) {
        SlotTableEditor slotTableEditorOpenEditor = openEditor();
        try {
            SlotTableKt.removeCurrentGroup(slotTableEditorOpenEditor, rememberManager);
        } finally {
            slotTableEditorOpenEditor.close();
        }
    }

    public final void closeEditor(SlotTableEditor slotTableEditor) {
        if (this.currentEditor != slotTableEditor) {
            ComposerKt.composeImmediateRuntimeError("Attempted to close an editor that was not the current editor");
        }
        this.currentEditor = null;
    }

    public final void closeReader(SlotTableReader slotTableReader) {
        if (slotTableReader.getTable() != this || this.openReaders <= 0) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.openReaders--;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectCalledByInformation() {
        this.recordCallByInformation = true;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectSourceInformation() {
        this.recordSourceInformation = true;
    }

    public final boolean contains(int i2) {
        if (i2 >= 0 && this.addressSpace.contains(i2)) {
            int[] groups = this.addressSpace.getGroups();
            int i3 = groups[i2 + 2];
            while (i3 > 0) {
                if (i3 == this.root) {
                    return true;
                }
                i3 = groups[i3 + 2];
            }
            if (i3 == 0) {
                ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
            }
        }
        return false;
    }

    public final boolean containsFlags(int i2) {
        return !isEmpty() && (this.addressSpace.getGroups()[this.root + 4] & i2) == i2;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void deactivateAll(RememberManager rememberManager) {
        SlotTableEditor slotTableEditorOpenEditor = openEditor();
        try {
            SlotTableKt.deactivateCurrentGroup(slotTableEditorOpenEditor, rememberManager);
        } finally {
            slotTableEditorOpenEditor.close();
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void dispose() {
        int i2 = this.root;
        if (i2 != -1) {
            this.addressSpace.freeGroupTree(i2);
            this.root = -1;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void disposeUnusedMovableContent(RememberManager rememberManager, MovableContentState movableContentState) {
        SlotTableEditor slotTableEditorOpenEditor = openEditor();
        try {
            SlotTableKt.removeCurrentGroup(slotTableEditorOpenEditor, rememberManager);
        } finally {
            slotTableEditorOpenEditor.close();
        }
    }

    public final <T> T edit(l<? super SlotTableEditor, ? extends T> lVar) {
        SlotTableEditor slotTableEditorOpenEditor = openEditor();
        try {
            return lVar.invoke(slotTableEditorOpenEditor);
        } finally {
            slotTableEditorOpenEditor.close();
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates(Applier<?> applier, ObjectList<MovableContentStateReference> objectList) {
        MutableScatterMap mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        SlotTableEditor slotTableEditorOpenEditor = openEditor();
        try {
            Object[] objArr = objectList.content;
            int i2 = objectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i3];
                LinkAnchor linkAnchorAsLinkAnchor = LinkAnchorKt.asLinkAnchor(movableContentStateReference.getAnchor$runtime());
                if (slotTableEditorOpenEditor.getTable().contains(linkAnchorAsLinkAnchor)) {
                    slotTableEditorOpenEditor.seek(linkAnchorAsLinkAnchor);
                    mutableScatterMapMutableScatterMapOf.set(movableContentStateReference, SlotTableKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition$runtime(), movableContentStateReference, slotTableEditorOpenEditor, applier));
                }
            }
            slotTableEditorOpenEditor.close();
            return mutableScatterMapMutableScatterMapOf;
        } catch (Throwable th) {
            slotTableEditorOpenEditor.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return new SlotTableGroup(this, this.root, this.version).find(obj);
    }

    public final int firstChildOf$runtime(int i2) {
        return getGroups()[i2 + 3];
    }

    public final void forEachGroupSlot$runtime(int i2, p<Object, ? super Integer, ab> pVar) {
        int i3 = getGroups()[i2 + 5];
        if (i3 != -1) {
            SlotTableAddressSpace addressSpace = getAddressSpace();
            int i4 = i3 & 15;
            int i5 = i3 >> 4;
            int i6 = i4 + 1;
            if (i6 > 15) {
                i6 = addressSpace.getLargeSizes().get(i5);
            }
            for (int i7 = 0; i7 < i6; i7++) {
                Object obj = getSlots()[i5 + i7];
                if (x.n(obj, Composer.Companion.getEmpty())) {
                    return;
                }
                pVar.invoke(obj, Integer.valueOf(i7));
            }
        }
    }

    public final void forEachSlot$runtime(l<Object, ab> lVar) {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while an editor is pending");
        }
        SlotTableAddressSpace addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        while (true) {
            int i2 = getGroups()[root + 5];
            if (i2 != -1) {
                SlotTableAddressSpace addressSpace2 = getAddressSpace();
                int i3 = (i2 & 15) + 1;
                int i4 = i2 >> 4;
                if (i3 > 15) {
                    i3 = addressSpace2.getLargeSizes().get(i4);
                }
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = getSlots()[i4 + i5];
                    if (x.n(obj, Composer.Companion.getEmpty())) {
                        break;
                    }
                    lVar.invoke(obj);
                }
            }
            int i6 = groups[root + 1];
            if (i6 >= 0) {
                intStack.push(i6);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    public final SlotTableAddressSpace getAddressSpace() {
        return this.addressSpace;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public final boolean getHasEditor() {
        return this.currentEditor != null;
    }

    public final RecomposeScopeImpl getRecomposeScopeOrNull$runtime(int i2) {
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        int i3 = groups[i2 + 5];
        if (i3 == -1) {
            return null;
        }
        int i4 = i3 & 15;
        int i5 = i3 >> 4;
        int i6 = i4 + 1;
        if (i6 > 15) {
            i6 = slotTableAddressSpace.getLargeSizes().get(i5);
        }
        int i7 = i6 + i5;
        int iUtilitySlotsCountForFlags = i5 + GroupFlagsKt.utilitySlotsCountForFlags(groups[i2 + 4]);
        if (iUtilitySlotsCountForFlags > i7) {
            return null;
        }
        Object obj = slots[iUtilitySlotsCountForFlags];
        if (obj instanceof RecomposeScopeImpl) {
            return (RecomposeScopeImpl) obj;
        }
        return null;
    }

    public final boolean getRecordCallByInformation() {
        return this.recordCallByInformation;
    }

    public final boolean getRecordSourceInformation() {
        return this.recordSourceInformation;
    }

    public final int getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.SlotStorage
    /* renamed from: getSlots, reason: collision with other method in class */
    public Iterable<Object> mo7494getSlots() {
        return new AnonymousClass1();
    }

    public final int getVersion() {
        return this.version;
    }

    public final Object groupAux$runtime(int i2) {
        int i3 = getGroups()[i2 + 4];
        if ((i3 & GroupFlagsKt.HasAuxSlotFlag) == 33554432) {
            return groupSlotAtIndex$runtime(i2, Integer.bitCount(i3 & 25165824));
        }
        return null;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean groupContainsAnchor(int i2, Anchor anchor) {
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        LinkAnchor linkAnchorAsLinkAnchor = LinkAnchorKt.asLinkAnchor(anchor);
        return slotTableAddressSpace.ownsAnchor(linkAnchorAsLinkAnchor) && isGroupAChildOf$runtime(linkAnchorAsLinkAnchor.getAddress(), i2);
    }

    public final int groupFlags$runtime(int i2) {
        return getGroups()[i2 + 4];
    }

    public final boolean groupHasAux$runtime(int i2) {
        return (getGroups()[i2 + 4] & GroupFlagsKt.HasAuxSlotFlag) == 33554432;
    }

    public final int groupKeyOf$runtime(int i2) {
        return getGroups()[i2];
    }

    public final Object groupNode$runtime(int i2) {
        if ((getGroups()[i2 + 4] & 8388608) == 8388608) {
            return groupSlotAtIndex$runtime(i2, 0);
        }
        return null;
    }

    public final Object groupObjectKey$runtime(int i2) {
        int i3 = getGroups()[i2 + 4];
        if ((i3 & 16777216) == 16777216) {
            return groupSlotAtIndex$runtime(i2, Integer.bitCount(i3 & 8388608));
        }
        return null;
    }

    public final Object groupSlotAtIndex$runtime(int i2, int i3) {
        int i4 = i2 + 5;
        if (getGroups()[i4] == -1 || i3 < 0) {
            return null;
        }
        int i5 = getGroups()[i4];
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int i6 = i5 & 15;
        int i7 = i5 >> 4;
        int i8 = i6 + 1;
        if (i8 > 15) {
            i8 = slotTableAddressSpace.getLargeSizes().get(i7);
        }
        if (i3 < i8) {
            return getSlots()[i7 + i3];
        }
        return null;
    }

    public final int groupSlotRange$runtime(int i2) {
        return getGroups()[i2 + 5];
    }

    public final boolean hasRecomposeScopes(int i2) {
        int i3;
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        SlotTableAddressSpace addressSpace = getAddressSpace();
        if (i2 < 0) {
            return false;
        }
        IntStack intStack = new IntStack();
        int[] groups2 = addressSpace.getGroups();
        int iPop = i2;
        while (SlotTableKt.recomposeScopeOrNullInRegion(slots, groups[iPop + 5]) == null) {
            if (iPop != i2 && (i3 = groups2[iPop + 1]) >= 0) {
                intStack.push(i3);
            }
            iPop = groups2[iPop + 3];
            if (iPop < 0) {
                if (intStack.tos == 0) {
                    return false;
                }
                iPop = intStack.pop();
            }
        }
        return true;
    }

    public final boolean inGroup(LinkAnchor linkAnchor, LinkAnchor linkAnchor2) {
        if (!linkAnchor.getValid() || !linkAnchor2.getValid()) {
            return false;
        }
        if (x.n(linkAnchor, linkAnchor2)) {
            return true;
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        if (!slotTableAddressSpace.ownsAnchor(linkAnchor2) || !slotTableAddressSpace.ownsAnchor(linkAnchor)) {
            return false;
        }
        int address = linkAnchor.getAddress();
        int address2 = linkAnchor2.getAddress();
        if (!slotTableAddressSpace.contains(address) || !slotTableAddressSpace.contains(address2)) {
            return false;
        }
        int[] groups = slotTableAddressSpace.getGroups();
        int i2 = groups[address2 + 2];
        while (i2 > 0) {
            if (i2 == address) {
                return true;
            }
            if (address <= 0) {
                return false;
            }
            i2 = groups[i2 + 2];
        }
        if (i2 == 0) {
            ComposerKt.composeImmediateRuntimeError(a.a(address2, "Traversing parent of group not in the slot table: "));
        }
        return false;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void invalidateAll() {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while an editor is pending");
        }
        SlotTableAddressSpace addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        while (true) {
            int i2 = getGroups()[root + 5];
            if (i2 != -1) {
                SlotTableAddressSpace addressSpace2 = getAddressSpace();
                int i3 = (i2 & 15) + 1;
                int i4 = i2 >> 4;
                if (i3 > 15) {
                    i3 = addressSpace2.getLargeSizes().get(i4);
                }
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = getSlots()[i4 + i5];
                    if (x.n(obj, Composer.Companion.getEmpty())) {
                        break;
                    }
                    RecomposeScope recomposeScope = obj instanceof RecomposeScope ? (RecomposeScope) obj : null;
                    if (recomposeScope != null) {
                        recomposeScope.invalidate();
                    }
                }
            }
            int i6 = groups[root + 1];
            if (i6 >= 0) {
                intStack.push(i6);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public List<RecomposeScopeImpl> invalidateGroupsWithKey(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        MutableIntSet mutableIntSet;
        int i7 = 0;
        int i8 = 1;
        o oVar = null;
        MutableIntSet mutableIntSet2 = new MutableIntSet(i7, i8, oVar);
        ArrayList arrayList = new ArrayList();
        MutableIntSet mutableIntSet3 = new MutableIntSet(i7, i8, oVar);
        mutableIntSet3.add(i2);
        mutableIntSet3.add(-3);
        MutableIntObjectMap<MutableIntSet> calledByMap$runtime = this.addressSpace.getCalledByMap$runtime();
        if (calledByMap$runtime != null && (mutableIntSet = calledByMap$runtime.get(i2)) != null) {
            mutableIntSet3.addAll(mutableIntSet);
        }
        int i9 = this.root;
        SlotTableAddressSpace addressSpace = getAddressSpace();
        if (i9 >= 0) {
            IntStack intStack = new IntStack();
            int[] groups = addressSpace.getGroups();
            int iPop = i9;
            while (true) {
                int i10 = this.addressSpace.getGroups()[iPop];
                if (mutableIntSet3.contains(i10)) {
                    if (i10 != -3) {
                        mutableIntSet2.plusAssign(iPop);
                    }
                    if (i8 != 0) {
                        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope = findEffectiveRecomposeScope(iPop);
                        if (recomposeScopeImplFindEffectiveRecomposeScope != null) {
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                            Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope.getAnchor();
                            Integer numValueOf = anchor != null ? Integer.valueOf(LinkAnchorKt.asLinkAnchor(anchor).getAddress()) : null;
                            if (numValueOf != null && numValueOf.intValue() == iPop) {
                                RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = findEffectiveRecomposeScope(this.addressSpace.getGroups()[iPop + 2]);
                                if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                                    arrayList2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                                }
                            }
                        } else {
                            arrayList.clear();
                            i8 = 0;
                        }
                    }
                }
                if (iPop != i9 && (i6 = groups[iPop + 1]) >= 0) {
                    intStack.push(i6);
                }
                iPop = groups[iPop + 3];
                if (iPop < 0) {
                    if (intStack.tos == 0) {
                        break;
                    }
                    iPop = intStack.pop();
                }
            }
        }
        SlotTableEditor slotTableEditorOpenEditor = openEditor();
        try {
            MutableIntSet mutableIntSet4 = mutableIntSet2;
            int[] iArr = mutableIntSet4.elements;
            long[] jArr = mutableIntSet4.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j2 = jArr[i11];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = i11 - length;
                        int i13 = i7;
                        while (true) {
                            i4 = 8 - ((~i12) >>> 31);
                            if (i13 >= i4) {
                                break;
                            }
                            if ((j2 & 255) < 128) {
                                i5 = i8;
                                slotTableEditorOpenEditor.seek(iArr[(i11 << 3) + i13] & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                                slotTableEditorOpenEditor.bashGroup$runtime(-3);
                            } else {
                                i5 = i8;
                            }
                            j2 >>= 8;
                            i13++;
                            i8 = i5;
                        }
                        i3 = i8;
                        if (i4 != 8) {
                            break;
                        }
                    } else {
                        i3 = i8;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i8 = i3;
                    i7 = 0;
                }
            } else {
                i3 = i8;
            }
            if (i3 != 0) {
                return arrayList;
            }
            return null;
        } finally {
            slotTableEditorOpenEditor.close();
        }
    }

    @Override // androidx.compose.runtime.SlotStorage, androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.root == -1;
    }

    public final boolean isGroupAChildOf$runtime(int i2, int i3) {
        int[] groups = getAddressSpace().getGroups();
        int i4 = i2;
        while (i4 > 0) {
            if (i4 == i3) {
                return true;
            }
            i4 = groups[i4 + 2];
        }
        if (i4 != 0) {
            return false;
        }
        ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, this.root);
    }

    public final SlotTable newTableInSameAddressSpace() {
        return new SlotTable(0, this.addressSpace, this.recordSourceInformation, this.recordCallByInformation, 1, null);
    }

    public final int nextSiblingOf$runtime(int i2) {
        return getGroups()[i2 + 1];
    }

    public final SlotTableEditor openEditor() {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (this.openReaders > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.version++;
        SlotTableEditor slotTableEditor = new SlotTableEditor(this);
        this.currentEditor = slotTableEditor;
        return slotTableEditor;
    }

    public final SlotTableReader openReader() {
        if (getHasEditor()) {
            ComposerKt.composeImmediateRuntimeError("Cannot read while a writer is pending");
        }
        this.openReaders++;
        return new SlotTableReader(this);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean ownsRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        LinkAnchor linkAnchorAsLinkAnchor = LinkAnchorKt.asLinkAnchor(anchor);
        return slotTableAddressSpace.ownsAnchor(linkAnchorAsLinkAnchor) && isGroupAChildOf$runtime(linkAnchorAsLinkAnchor.getAddress(), this.root);
    }

    public final <T> T read(l<? super SlotTableReader, ? extends T> lVar) {
        SlotTableReader slotTableReaderOpenReader = openReader();
        try {
            return lVar.invoke(slotTableReaderOpenReader);
        } finally {
            slotTableReaderOpenReader.close();
        }
    }

    public final long rootHandle() {
        return (this.root & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (-4294967296L);
    }

    public final void setRecordCallByInformation(boolean z) {
        this.recordCallByInformation = z;
    }

    public final void setRecordSourceInformation(boolean z) {
        this.recordSourceInformation = z;
    }

    public final void setRoot(int i2) {
        this.root = i2;
    }

    public final String toDebugString(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("SlotTable(\n");
        int[] groups = getAddressSpace().getGroups();
        for (int i2 = this.root; i2 >= 0; i2 = groups[i2 + 1]) {
            toDebugString$lambda$0$dumpGroup(sb, this, z, i2, "  ");
        }
        sb.append(")");
        return sb.toString();
    }

    public final Object toDebugTree$runtime() {
        List listJ = k.j(k.b(new SlotTable$toDebugTree$1(this, null)));
        return listJ.size() == 1 ? i.P(listJ) : listJ;
    }

    public final void traverseChildren$runtime(int i2, l<? super Integer, ab> lVar) {
        int[] groups = getAddressSpace().getGroups();
        for (int i3 = groups[i2 + 3]; i3 > 0; i3 = groups[i3 + 1]) {
            lVar.invoke(Integer.valueOf(i3));
        }
    }

    public final void traverseGroup$runtime(int i2, boolean z, l<? super Integer, ab> lVar) {
        int i3;
        SlotTableAddressSpace addressSpace = getAddressSpace();
        if (i2 < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        int iPop = i2;
        while (true) {
            lVar.invoke(Integer.valueOf(iPop));
            if ((iPop != i2 || z) && (i3 = groups[iPop + 1]) >= 0) {
                intStack.push(i3);
            }
            iPop = groups[iPop + 3];
            if (iPop < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    iPop = intStack.pop();
                }
            }
        }
    }

    public final void traverseGroupAndParents$runtime(int i2, l<? super Integer, ab> lVar) {
        int[] groups = getAddressSpace().getGroups();
        int i3 = i2;
        while (i3 > 0) {
            lVar.invoke(Integer.valueOf(i3));
            i3 = groups[i3 + 2];
        }
        if (i3 != 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
    }

    public final void traverseSiblings$runtime(int i2, l<? super Integer, ab> lVar) {
        int[] groups = getAddressSpace().getGroups();
        while (i2 >= 0) {
            lVar.invoke(Integer.valueOf(i2));
            i2 = groups[i2 + 1];
        }
    }

    public final void traverseTable$runtime(l<? super Integer, ab> lVar) {
        SlotTableAddressSpace addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        while (true) {
            lVar.invoke(Integer.valueOf(root));
            int i2 = groups[root + 1];
            if (i2 >= 0) {
                intStack.push(i2);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    root = intStack.pop();
                }
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void verifyWellFormed() {
        this.addressSpace.validate();
        SlotTableAddressSpace slotTableAddressSpace = this.addressSpace;
        int[] groups = slotTableAddressSpace.getGroups();
        Object[] slots = slotTableAddressSpace.getSlots();
        MutableIntSet mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
        int i2 = this.root;
        int[] groups2 = getAddressSpace().getGroups();
        for (int i3 = i2; i3 >= 0; i3 = groups2[i3 + 1]) {
            verifyWellFormed$validateGroup(mutableIntSetMutableIntSetOf, groups, this, slots, -1, i3);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SlotTable build$default(Companion companion, SlotTableAddressSpace slotTableAddressSpace, l lVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                slotTableAddressSpace = new SlotTableAddressSpace();
            }
            SlotTableBuilder slotTableBuilder = new SlotTableBuilder(slotTableAddressSpace, false, false);
            slotTableBuilder.buildStart();
            lVar.invoke(slotTableBuilder);
            return slotTableBuilder.build();
        }

        public final SlotTable build(SlotTableAddressSpace slotTableAddressSpace, l<? super SlotTableBuilder, ab> lVar) {
            SlotTableBuilder slotTableBuilder = new SlotTableBuilder(slotTableAddressSpace, false, false);
            slotTableBuilder.buildStart();
            lVar.invoke(slotTableBuilder);
            return slotTableBuilder.build();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] getSlots() {
        return this.addressSpace.getSlots();
    }

    public SlotTable(int i2, SlotTableAddressSpace slotTableAddressSpace, boolean z, boolean z2) {
        this.root = i2;
        this.addressSpace = slotTableAddressSpace;
        this.recordSourceInformation = z;
        this.recordCallByInformation = z2;
    }

    public SlotTable() {
        this(0, null, false, false, 15, null);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public String toDebugString() {
        return toDebugString(true);
    }

    public final boolean contains(LinkAnchor linkAnchor) {
        return linkAnchor.getValid() && this.addressSpace.ownsAnchor(linkAnchor) && contains(linkAnchor.getAddress());
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean inGroup(Anchor anchor, Anchor anchor2) {
        return inGroup(LinkAnchorKt.asLinkAnchor(anchor), LinkAnchorKt.asLinkAnchor(anchor2));
    }
}
