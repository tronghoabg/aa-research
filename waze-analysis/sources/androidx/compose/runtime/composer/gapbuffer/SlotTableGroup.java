package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import h.a.i;
import h.g.b.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, a {
    private final int group;
    private final SlotTable table;
    private final int version;

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i2, int i3, int i4, o oVar) {
        this(slotTable, i2, (i4 & 4) != 0 ? slotTable.getVersion$runtime() : i3);
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup slotTableGroup, GapAnchor gapAnchor) {
        int iAnchorIndex;
        int i2;
        if (!slotTableGroup.table.ownsAnchor(gapAnchor) || (iAnchorIndex = slotTableGroup.table.anchorIndex(gapAnchor)) < (i2 = slotTableGroup.group) || iAnchorIndex - i2 >= SlotTableKt.groupSize(slotTableGroup.table.getGroups(), slotTableGroup.group)) {
            return null;
        }
        return new SlotTableGroup(slotTableGroup.table, iAnchorIndex, slotTableGroup.version);
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup compositionGroup, int i2) {
        return (CompositionGroup) i.R(i.ab(compositionGroup.getCompositionGroups(), i2));
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime() != this.version) {
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
        if (obj instanceof GapAnchor) {
            return find$findAnchoredGroup(this, (GapAnchor) obj);
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
        GapGroupSourceInformation gapGroupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        int i2 = this.group;
        return gapGroupSourceInformationSourceInformationOf != null ? new SourceInformationGroupDataIterator(slotTable, i2, gapGroupSourceInformationSourceInformationOf) : new DataIterator(slotTable, i2);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        SlotReader slotReaderOpenReader = this.table.openReader();
        try {
            return slotReaderOpenReader.anchor(this.group);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        int i2 = this.group;
        int i3 = i2 * 5;
        int i4 = this.table.getGroups()[i3 + 1] & 536870912;
        SlotTable slotTable = this.table;
        if (i4 == 0) {
            return Integer.valueOf(slotTable.getGroups()[i3]);
        }
        Object obj = slotTable.m7429getSlots()[SlotTableKt.objectKeyIndex(slotTable.getGroups(), i2)];
        if (obj != null) {
            return obj;
        }
        x.g();
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        int i2 = this.group * 5;
        if ((this.table.getGroups()[i2 + 1] & 1073741824) == 0) {
            return null;
        }
        SlotTable slotTable = this.table;
        return slotTable.m7429getSlots()[slotTable.getGroups()[i2 + 4]];
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int groupSize = this.group + getGroupSize();
        int groupsSize = this.table.getGroupsSize();
        SlotTable slotTable = this.table;
        if (groupSize < groupsSize) {
            slotsSize = slotTable.getGroups()[(groupSize * 5) + 4];
        } else {
            slotsSize = slotTable.getSlotsSize();
        }
        SlotTable slotTable2 = this.table;
        return slotsSize - slotTable2.getGroups()[(this.group * 5) + 4];
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        GapGroupSourceInformation gapGroupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        if (gapGroupSourceInformationSourceInformationOf != null) {
            return gapGroupSourceInformationSourceInformationOf.getSourceInformation();
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
        return SlotTableKt.groupSize(this.table.getGroups(), this.group) == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        validateRead();
        GapGroupSourceInformation gapGroupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        SlotTable slotTable = this.table;
        int i2 = this.group;
        return gapGroupSourceInformationSourceInformationOf != null ? new SourceInformationGroupIterator(slotTable, i2, gapGroupSourceInformationSourceInformationOf, new AnchoredGroupPath(i2)) : new GroupIterator(slotTable, i2 + 1, i2 + SlotTableKt.groupSize(slotTable.getGroups(), i2));
    }

    public SlotTableGroup(SlotTable slotTable, int i2, int i3) {
        this.table = slotTable;
        this.group = i2;
        this.version = i3;
    }
}
