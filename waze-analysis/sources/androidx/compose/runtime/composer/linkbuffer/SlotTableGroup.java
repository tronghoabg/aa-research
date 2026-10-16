package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.tooling.CompositionGroup;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, h.g.b.a.a {
    private final int group;
    private final SlotTable table;
    private final int version;

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i2, int i3, int i4, o oVar) {
        this(slotTable, i2, (i4 & 4) != 0 ? slotTable.getVersion() : i3);
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup slotTableGroup, LinkAnchor linkAnchor) {
        SlotTableAddressSpace addressSpace = slotTableGroup.table.getAddressSpace();
        if (!addressSpace.ownsAnchor(linkAnchor)) {
            return null;
        }
        int address = linkAnchor.getAddress();
        if (address == slotTableGroup.group) {
            return slotTableGroup;
        }
        int[] groups = addressSpace.getGroups();
        int i2 = groups[address + 2];
        while (i2 > 0) {
            if (i2 == slotTableGroup.group) {
                return new SlotTableGroup(slotTableGroup.table, address, slotTableGroup.version);
            }
            i2 = groups[i2 + 2];
        }
        if (i2 != 0) {
            return null;
        }
        ComposerKt.composeImmediateRuntimeError(a.a(address, "Traversing parent of group not in the slot table: "));
        return null;
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup compositionGroup, int i2) {
        return (CompositionGroup) i.R(i.ab(compositionGroup.getCompositionGroups(), i2));
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SlotTableGroup)) {
            return false;
        }
        SlotTableGroup slotTableGroup = (SlotTableGroup) obj;
        return slotTableGroup.group == this.group && slotTableGroup.version == this.version && x.n(slotTableGroup.table, this.table);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        if (obj instanceof LinkAnchor) {
            return find$findAnchoredGroup(this, (LinkAnchor) obj);
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return null;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        CompositionGroup compositionGroupFind = find(sourceInformationSlotTableGroupIdentity.getParentIdentity());
        if (compositionGroupFind == null) {
            return null;
        }
        return find$findRelativeGroup(compositionGroupFind, sourceInformationSlotTableGroupIdentity.getIndex());
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        LinkGroupSourceInformation linkGroupSourceInformationSourceInformationOf = this.table.getAddressSpace().sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        int i2 = this.group;
        return linkGroupSourceInformationSourceInformationOf != null ? new SourceInformationGroupDataIterator(slotTable, i2, linkGroupSourceInformationSourceInformationOf) : new DataIterator(slotTable, i2);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int i2 = this.group;
        SlotTableAddressSpace addressSpace = this.table.getAddressSpace();
        int i3 = 0;
        if (i2 >= 0) {
            IntStack intStack = new IntStack();
            int[] groups = addressSpace.getGroups();
            int iPop = i2;
            while (true) {
                if (iPop != i2) {
                    int i4 = groups[iPop + 1];
                    if (i4 >= 0) {
                        intStack.push(i4);
                    }
                }
                i3++;
                iPop = groups[iPop + 3];
                if (iPop < 0) {
                    if (intStack.tos == 0) {
                        break;
                    }
                    iPop = intStack.pop();
                }
            }
        }
        return i3;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        return this.table.getAddressSpace().anchorOfAddress(this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        Object objGroupObjectKey$runtime = this.table.groupObjectKey$runtime(this.group);
        return objGroupObjectKey$runtime == null ? Integer.valueOf(this.table.groupKeyOf$runtime(this.group)) : objGroupObjectKey$runtime;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        return this.table.groupNode$runtime(this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int i2;
        int i3;
        int i4 = this.group;
        SlotTableAddressSpace addressSpace = this.table.getAddressSpace();
        if (i4 < 0) {
            return 0;
        }
        IntStack intStack = new IntStack();
        int[] groups = addressSpace.getGroups();
        int iPop = i4;
        int i5 = 0;
        while (true) {
            int i6 = this.table.getAddressSpace().getGroups()[iPop + 5];
            if (i6 != -1) {
                SlotTableAddressSpace addressSpace2 = this.table.getAddressSpace();
                if (i6 == -1) {
                    i3 = 0;
                } else {
                    i3 = (i6 & 15) + 1;
                    if (i3 > 15) {
                        i3 = addressSpace2.getLargeSizes().get(i6 >> 4);
                    }
                }
                i5 += i3;
            }
            if (iPop != i4 && (i2 = groups[iPop + 1]) >= 0) {
                intStack.push(i2);
            }
            iPop = groups[iPop + 3];
            if (iPop < 0) {
                if (intStack.tos == 0) {
                    return i5;
                }
                iPop = intStack.pop();
            }
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        LinkGroupSourceInformation linkGroupSourceInformationSourceInformationOf = this.table.getAddressSpace().sourceInformationOf(this.group);
        if (linkGroupSourceInformationSourceInformationOf != null) {
            return linkGroupSourceInformationSourceInformationOf.getSourceInformation();
        }
        return null;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.group + (this.table.hashCode() * 31);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.table.firstChildOf$runtime(this.group) == -1;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        validateRead();
        LinkGroupSourceInformation linkGroupSourceInformationSourceInformationOf = this.table.getAddressSpace().sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        if (linkGroupSourceInformationSourceInformationOf == null) {
            return new GroupIterator(slotTable, slotTable.firstChildOf$runtime(this.group));
        }
        int i2 = this.group;
        return new SourceInformationGroupIterator(slotTable, i2, linkGroupSourceInformationSourceInformationOf, new AnchoredGroupPath(i2));
    }

    public SlotTableGroup(SlotTable slotTable, int i2, int i3) {
        this.table = slotTable;
        this.group = i2;
        this.version = i3;
    }
}
