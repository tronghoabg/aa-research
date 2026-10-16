package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import h.g.b.x;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 8;
    private int height;
    private boolean isInRightEdge;
    private Object[] path;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(Object[] objArr, int i2, int i3, int i4) {
        super(i2, i3);
        this.height = i4;
        Object[] objArr2 = new Object[i4];
        this.path = objArr2;
        ?? r5 = i2 == i3 ? 1 : 0;
        this.isInRightEdge = r5;
        objArr2[0] = objArr;
        fillPath(i2 - r5, 1);
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        x.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    private final void fillPath(int i2, int i3) {
        int i4 = (this.height - i3) * 5;
        while (i3 < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[i3 - 1];
            x.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i3] = ((Object[]) obj)[UtilsKt.indexSegment(i2, i4)];
            i4 -= 5;
            i3++;
        }
    }

    private final void fillPathIfNeeded(int i2) {
        int i3 = 0;
        while (UtilsKt.indexSegment(getIndex(), i3) == i2) {
            i3 += 5;
        }
        if (i3 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i3 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eElementAtCurrentIndex = elementAtCurrentIndex();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.isInRightEdge = true;
            return eElementAtCurrentIndex;
        }
        fillPathIfNeeded(0);
        return eElementAtCurrentIndex;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return elementAtCurrentIndex();
        }
        fillPathIfNeeded(31);
        return elementAtCurrentIndex();
    }

    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final void reset$runtime(Object[] objArr, int i2, int i3, int i4) {
        setIndex(i2);
        setSize(i3);
        this.height = i4;
        Object[] objArr2 = this.path;
        if (objArr2.length < i4) {
            objArr2 = new Object[i4];
            this.path = objArr2;
        }
        objArr2[0] = objArr;
        ?? r6 = i2 == i3 ? 1 : 0;
        this.isInRightEdge = r6;
        fillPath(i2 - r6, 1);
    }
}
