package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import h.g.b.a.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, a {
    public static final int $stable = 8;
    private int index;
    private final Map<E, Links> map;
    private Object nextElement;

    public PersistentOrderedSetIterator(Object obj, Map<E, Links> map) {
        this.nextElement = obj;
        this.map = map;
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex$runtime() {
        return this.index;
    }

    public final Map<E, Links> getMap$runtime() {
        return this.map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    @Override // java.util.Iterator
    public E next() {
        checkHasNext();
        E e2 = (E) this.nextElement;
        this.index++;
        Links links = this.map.get(e2);
        if (links != null) {
            this.nextElement = links.getNext();
            return e2;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e2 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime(int i2) {
        this.index = i2;
    }
}
