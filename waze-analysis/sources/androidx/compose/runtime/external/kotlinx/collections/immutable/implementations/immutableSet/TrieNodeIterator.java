package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        trieNodeIterator.reset(objArr, i2);
    }

    public final E currentElement() {
        hasNextElement();
        return (E) this.buffer[this.index];
    }

    public final TrieNode<? extends E> currentNode() {
        hasNextNode();
        Object obj = this.buffer[this.index];
        x.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        return this.index < this.buffer.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.buffer[this.index] instanceof TrieNode);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.buffer[this.index] instanceof TrieNode);
    }

    public final void moveToNextCell() {
        hasNextCell();
        this.index++;
    }

    public final E nextElement() {
        hasNextElement();
        Object[] objArr = this.buffer;
        int i2 = this.index;
        this.index = i2 + 1;
        return (E) objArr[i2];
    }

    public final void reset(Object[] objArr, int i2) {
        this.buffer = objArr;
        this.index = i2;
    }
}
