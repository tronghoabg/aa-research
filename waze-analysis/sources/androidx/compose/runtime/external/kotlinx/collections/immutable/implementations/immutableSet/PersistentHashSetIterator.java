package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import h.a.i;
import h.g.b.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, a {
    public static final int $stable = 8;
    private boolean hasNext;
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(TrieNode<E> trieNode) {
        List<TrieNodeIterator<E>> listL = i.l(new TrieNodeIterator());
        this.path = listL;
        this.hasNext = true;
        TrieNodeIterator.reset$default(listL.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i2 = this.pathLastIndex; i2 >= 0; i2--) {
            int iMoveToNextNodeWithData = moveToNextNodeWithData(i2);
            if (iMoveToNextNodeWithData == -1) {
                if (this.path.get(i2).hasNextCell()) {
                    this.path.get(i2).moveToNextCell();
                    iMoveToNextNodeWithData = moveToNextNodeWithData(i2);
                } else {
                    iMoveToNextNodeWithData = -1;
                }
            }
            if (iMoveToNextNodeWithData != -1) {
                this.pathLastIndex = iMoveToNextNodeWithData;
                return;
            }
            if (i2 > 0) {
                this.path.get(i2 - 1).moveToNextCell();
            }
            this.path.get(i2).reset(TrieNode.Companion.getEMPTY$runtime().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i2) {
        if (this.path.get(i2).hasNextElement()) {
            return i2;
        }
        if (!this.path.get(i2).hasNextNode()) {
            return -1;
        }
        TrieNode<? extends E> trieNodeCurrentNode = this.path.get(i2).currentNode();
        int i3 = i2 + 1;
        if (i3 == this.path.size()) {
            this.path.add(new TrieNodeIterator<>());
        }
        TrieNodeIterator.reset$default(this.path.get(i3), trieNodeCurrentNode.getBuffer(), 0, 2, null);
        return moveToNextNodeWithData(i3);
    }

    protected final E currentElement() {
        hasNext();
        return this.path.get(this.pathLastIndex).currentElement();
    }

    protected final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        E eNextElement = this.path.get(this.pathLastIndex).nextElement();
        ensureNextElementIsReady();
        return eNextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void setPathLastIndex(int i2) {
        this.pathLastIndex = i2;
    }
}
