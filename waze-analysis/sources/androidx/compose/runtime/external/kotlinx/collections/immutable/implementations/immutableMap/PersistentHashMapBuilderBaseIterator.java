package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import h.g.b.a.a;
import h.g.b.au;
import h.g.b.x;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, a {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime(), trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime();
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void resetPath(int i2, TrieNode<?, ?> trieNode, K k2, int i3) {
        int i4 = i3 * 5;
        if (i4 > 30) {
            getPath()[i3].reset(trieNode.getBuffer$runtime(), trieNode.getBuffer$runtime().length, 0);
            while (!x.n(getPath()[i3].currentKey(), k2)) {
                getPath()[i3].moveToNextKey();
            }
            setPathLastIndex(i3);
            return;
        }
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i4);
        if (trieNode.hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = trieNode.entryKeyIndex$runtime(iIndexSegment);
            TrieNodeBaseIterator<K, V, T> trieNodeBaseIterator = getPath()[i3];
            Object[] buffer$runtime = trieNode.getBuffer$runtime();
            int iEntryCount$runtime = trieNode.entryCount$runtime();
            trieNodeBaseIterator.reset(buffer$runtime, iEntryCount$runtime + iEntryCount$runtime, iEntryKeyIndex$runtime);
            setPathLastIndex(i3);
            return;
        }
        int iNodeIndex$runtime = trieNode.nodeIndex$runtime(iIndexSegment);
        TrieNode<?, ?> trieNodeNodeAtIndex$runtime = trieNode.nodeAtIndex$runtime(iNodeIndex$runtime);
        TrieNodeBaseIterator<K, V, T> trieNodeBaseIterator2 = getPath()[i3];
        Object[] buffer$runtime2 = trieNode.getBuffer$runtime();
        int iEntryCount$runtime2 = trieNode.entryCount$runtime();
        trieNodeBaseIterator2.reset(buffer$runtime2, iEntryCount$runtime2 + iEntryCount$runtime2, iNodeIndex$runtime);
        resetPath(i2, trieNodeNodeAtIndex$runtime, k2, i3 + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            K kCurrentKey = currentKey();
            au.c(this.builder).remove(this.lastIteratedKey);
            resetPath(kCurrentKey != null ? kCurrentKey.hashCode() : 0, this.builder.getNode$runtime(), kCurrentKey, 0);
        } else {
            au.c(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime();
    }

    public final void setValue(K k2, V v) {
        if (this.builder.containsKey(k2)) {
            if (hasNext()) {
                K kCurrentKey = currentKey();
                this.builder.put(k2, v);
                resetPath(kCurrentKey != null ? kCurrentKey.hashCode() : 0, this.builder.getNode$runtime(), kCurrentKey, 0);
            } else {
                this.builder.put(k2, v);
            }
            this.expectedModCount = this.builder.getModCount$runtime();
        }
    }
}
