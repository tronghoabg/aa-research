package androidx.compose.runtime.composer.gapbuffer;

import h.g.b.a.a;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, a {
    private final int end;
    private int index;
    private final int start;
    private final SlotTable table;

    public DataIterator(SlotTable slotTable, int i2) {
        this.table = slotTable;
        int i3 = slotTable.getGroups()[(i2 * 5) + 4];
        this.start = i3;
        int i4 = i2 + 1;
        this.end = i4 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i4 * 5) + 4] : slotTable.getSlotsSize();
        this.index = i3;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStart() {
        return this.start;
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
        Object obj = null;
        if (i2 >= 0 && i2 < this.table.m7429getSlots().length) {
            obj = this.table.m7429getSlots()[this.index];
        }
        this.index++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }
}
