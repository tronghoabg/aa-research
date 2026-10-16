package androidx.compose.runtime.composer.linkbuffer;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, h.g.b.a.a {
    private final int end;
    private final int group;
    private int index;
    private final SlotTable table;

    public DataIterator(SlotTable slotTable, int i2) {
        int i3;
        this.table = slotTable;
        this.group = i2;
        SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
        int iGroupSlotRange$runtime = slotTable.groupSlotRange$runtime(i2);
        if (iGroupSlotRange$runtime == -1) {
            i3 = 0;
        } else {
            int i4 = (iGroupSlotRange$runtime & 15) + 1;
            i3 = i4 > 15 ? addressSpace.getLargeSizes().get(iGroupSlotRange$runtime >> 4) : i4;
        }
        this.end = i3;
        this.index = GroupFlagsKt.utilitySlotsCountForFlags(slotTable.groupFlags$runtime(i2));
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getIndex() {
        return this.index;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i2 = this.index;
        this.index = i2 + 1;
        return this.table.groupSlotAtIndex$runtime(this.group, i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }
}
