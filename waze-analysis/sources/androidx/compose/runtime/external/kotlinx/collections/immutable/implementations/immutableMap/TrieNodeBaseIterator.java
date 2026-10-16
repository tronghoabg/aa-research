package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import h.g.b.a.a;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, a {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime().getBuffer$runtime();
    private int dataSize;
    private int index;

    public final K currentKey() {
        return (K) this.buffer[this.index];
    }

    public final TrieNode<? extends K, ? extends V> currentNode() {
        hasNextNode();
        Object obj = this.buffer[this.index];
        x.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    protected final Object[] getBuffer() {
        return this.buffer;
    }

    protected final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    public final boolean hasNextNode() {
        return this.index < this.buffer.length;
    }

    public final void moveToNextKey() {
        this.index += 2;
    }

    public final void moveToNextNode() {
        hasNextNode();
        this.index++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] objArr, int i2, int i3) {
        this.buffer = objArr;
        this.dataSize = i2;
        this.index = i3;
    }

    protected final void setIndex(int i2) {
        this.index = i2;
    }

    public final void reset(Object[] objArr, int i2) {
        reset(objArr, i2, 0);
    }
}
