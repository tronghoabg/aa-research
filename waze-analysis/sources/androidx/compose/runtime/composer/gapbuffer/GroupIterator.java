package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import h.g.b.a.a;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, a {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable, int i2, int i3) {
        this.table = slotTable;
        this.end = i3;
        this.index = i2;
        this.version = slotTable.getVersion$runtime();
        if (slotTable.getWriter$runtime()) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        validateRead();
        SlotTable slotTable = this.table;
        int i2 = this.index;
        this.index = SlotTableKt.groupSize(slotTable.getGroups(), i2) + i2;
        return new SlotTableGroup(this.table, i2, this.version);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
