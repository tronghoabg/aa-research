package androidx.compose.runtime.snapshots;

import h.e;
import h.g.b.a.a;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StateListIterator<T> implements ListIterator<T>, a {
    public static final int $stable = 8;
    private int index;
    private int lastRequested = -1;
    private final SnapshotStateList<T> list;
    private int structure;

    public StateListIterator(SnapshotStateList<T> snapshotStateList, int i2) {
        this.list = snapshotStateList;
        this.index = i2 - 1;
        this.structure = SnapshotStateListKt.getStructure(snapshotStateList);
    }

    private final void validateModification() {
        if (SnapshotStateListKt.getStructure(this.list) != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        validateModification();
        this.list.add(this.index + 1, t);
        this.lastRequested = -1;
        this.index++;
        this.structure = SnapshotStateListKt.getStructure(this.list);
    }

    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() + (-1);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i2 = this.index + 1;
        this.lastRequested = i2;
        SnapshotStateListKt.validateRange(i2, this.list.size());
        T t = this.list.get(i2);
        this.index = i2;
        return t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        int i2 = this.index;
        this.lastRequested = i2;
        this.index--;
        return this.list.get(i2);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.lastRequested);
        this.index--;
        this.lastRequested = -1;
        this.structure = SnapshotStateListKt.getStructure(this.list);
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        validateModification();
        int i2 = this.lastRequested;
        if (i2 < 0) {
            SnapshotStateListKt.invalidIteratorSet();
            throw new e();
        }
        this.list.set(i2, t);
        this.structure = SnapshotStateListKt.getStructure(this.list);
    }
}
