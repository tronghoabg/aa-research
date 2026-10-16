package androidx.compose.runtime.snapshots;

import h.g.b.a.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StateSetIterator<T> implements Iterator<T>, a {
    public static final int $stable = 8;
    private T current;
    private final Iterator<T> iterator;
    private int modification;
    private T next;
    private final SnapshotStateSet<T> set;

    /* JADX WARN: Multi-variable type inference failed */
    public StateSetIterator(SnapshotStateSet<T> snapshotStateSet, Iterator<? extends T> it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = SnapshotStateSetKt.getModification(snapshotStateSet);
        advance();
    }

    private final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    private final <T> T modify(h.g.a.a<? extends T> aVar) {
        validateModification();
        SnapshotStateSet<T> snapshotStateSet = this.set;
        T tInvoke = aVar.invoke();
        this.modification = SnapshotStateSetKt.getModification(snapshotStateSet);
        return tInvoke;
    }

    private final void validateModification() {
        if (SnapshotStateSetKt.getModification(this.set) != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    public final T getCurrent() {
        return this.current;
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getModification() {
        return this.modification;
    }

    public final T getNext() {
        return this.next;
    }

    public final SnapshotStateSet<T> getSet() {
        return this.set;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public T next() {
        validateModification();
        advance();
        T t = this.current;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        validateModification();
        T t = this.current;
        if (t == null) {
            throw new IllegalStateException();
        }
        this.set.remove(t);
        this.current = null;
        this.modification = SnapshotStateSetKt.getModification(this.set);
    }

    public final void setCurrent(T t) {
        this.current = t;
    }

    public final void setModification(int i2) {
        this.modification = i2;
    }

    public final void setNext(T t) {
        this.next = t;
    }
}
