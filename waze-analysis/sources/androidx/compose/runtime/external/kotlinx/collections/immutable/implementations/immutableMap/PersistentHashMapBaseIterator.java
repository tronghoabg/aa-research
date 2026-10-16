package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import h.g.b.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, a {
    public static final int $stable = 8;
    private boolean hasNext = true;
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    public PersistentHashMapBaseIterator(TrieNode<K, V> trieNode, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        TrieNodeBaseIterator<K, V, T> trieNodeBaseIterator = trieNodeBaseIteratorArr[0];
        Object[] buffer$runtime = trieNode.getBuffer$runtime();
        int iEntryCount$runtime = trieNode.entryCount$runtime();
        trieNodeBaseIterator.reset(buffer$runtime, iEntryCount$runtime + iEntryCount$runtime);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void ensureNextEntryIsReady() {
        if (this.path[this.pathLastIndex].hasNextKey()) {
            return;
        }
        for (int i2 = this.pathLastIndex; i2 >= 0; i2--) {
            int iMoveToNextNodeWithData = moveToNextNodeWithData(i2);
            if (iMoveToNextNodeWithData == -1) {
                if (this.path[i2].hasNextNode()) {
                    this.path[i2].moveToNextNode();
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
                this.path[i2 - 1].moveToNextNode();
            }
            this.path[i2].reset(TrieNode.Companion.getEMPTY$runtime().getBuffer$runtime(), 0);
        }
        this.hasNext = false;
    }

    private final int moveToNextNodeWithData(int i2) {
        if (this.path[i2].hasNextKey()) {
            return i2;
        }
        if (!this.path[i2].hasNextNode()) {
            return -1;
        }
        TrieNode<? extends K, ? extends V> trieNodeCurrentNode = this.path[i2].currentNode();
        TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr = this.path;
        if (i2 == 6) {
            trieNodeBaseIteratorArr[7].reset(trieNodeCurrentNode.getBuffer$runtime(), trieNodeCurrentNode.getBuffer$runtime().length);
        } else {
            TrieNodeBaseIterator<K, V, T> trieNodeBaseIterator = trieNodeBaseIteratorArr[i2 + 1];
            Object[] buffer$runtime = trieNodeCurrentNode.getBuffer$runtime();
            int iEntryCount$runtime = trieNodeCurrentNode.entryCount$runtime();
            trieNodeBaseIterator.reset(buffer$runtime, iEntryCount$runtime + iEntryCount$runtime);
        }
        return moveToNextNodeWithData(i2 + 1);
    }

    protected final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    protected final TrieNodeBaseIterator<K, V, T>[] getPath() {
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
    public T next() {
        checkHasNext();
        T next = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void setPathLastIndex(int i2) {
        this.pathLastIndex = i2;
    }
}
