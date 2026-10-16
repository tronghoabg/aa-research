package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, h.g.b.a.a {
    private int nextGroup;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable, int i2) {
        this.table = slotTable;
        this.nextGroup = i2;
        this.version = slotTable.getVersion();
        if (slotTable.getHasEditor()) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.nextGroup != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        validateRead();
        SlotTable slotTable = this.table;
        int i2 = this.nextGroup;
        this.nextGroup = slotTable.nextSiblingOf$runtime(i2);
        return new SlotTableGroup(this.table, i2, this.version);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
