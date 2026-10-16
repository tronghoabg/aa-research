package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.g.b.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, a {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int i2) {
        this.size = i2;
    }

    protected abstract T elementAt(int i2);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tElementAt = elementAt(this.index);
        this.index++;
        this.canRemove = true;
        return tElementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            RuntimeHelpersKt.throwIllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.index - 1;
        this.index = i2;
        removeAt(i2);
        this.size--;
        this.canRemove = false;
    }

    protected abstract void removeAt(int i2);
}
