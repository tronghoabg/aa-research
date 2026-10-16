package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import h.a.c;
import h.g.b.a.a;
import h.g.b.au;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, a {
    public static final int $stable = 8;
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime());
        this.builder = persistentHashSetBuilder;
        this.expectedModCount = persistentHashSetBuilder.getModCount$runtime();
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

    private final boolean isCollision(TrieNode<?> trieNode) {
        return trieNode.getBitmap() == 0;
    }

    private final void resetPath(int i2, TrieNode<?> trieNode, E e2, int i3) {
        if (isCollision(trieNode)) {
            getPath().get(i3).reset(trieNode.getBuffer(), c.C(trieNode.getBuffer(), e2));
            setPathLastIndex(i3);
            return;
        }
        int iIndexOfCellAt$runtime = trieNode.indexOfCellAt$runtime(1 << TrieNodeKt.indexSegment(i2, i3 * 5));
        getPath().get(i3).reset(trieNode.getBuffer(), iIndexOfCellAt$runtime);
        Object obj = trieNode.getBuffer()[iIndexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            resetPath(i2, (TrieNode) obj, e2, i3 + 1);
        } else {
            setPathLastIndex(i3);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e2 = (E) super.next();
        this.lastIteratedElement = e2;
        this.nextWasInvoked = true;
        return e2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            E eCurrentElement = currentElement();
            au.b(this.builder).remove(this.lastIteratedElement);
            resetPath(eCurrentElement != null ? eCurrentElement.hashCode() : 0, this.builder.getNode$runtime(), eCurrentElement, 0);
        } else {
            au.b(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime();
    }
}
