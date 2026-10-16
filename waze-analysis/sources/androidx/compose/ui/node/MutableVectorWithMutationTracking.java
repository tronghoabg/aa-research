package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;
    private final a<ab> onVectorMutated;
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(MutableVector<T> mutableVector, a<ab> aVar) {
        this.vector = mutableVector;
        this.onVectorMutated = aVar;
    }

    public final void add(int i2, T t) {
        this.vector.add(i2, t);
        this.onVectorMutated.invoke();
    }

    public final List<T> asList() {
        return getVector().asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(l<? super T, ab> lVar) {
        MutableVector<T> vector = getVector();
        T[] tArr = vector.content;
        int size = vector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(tArr[i2]);
        }
    }

    public final T get(int i2) {
        return getVector().content[i2];
    }

    public final a<ab> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return getVector().getSize();
    }

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int i2) {
        a<ab> aVar = this.onVectorMutated;
        T tRemoveAt = this.vector.removeAt(i2);
        aVar.invoke();
        return tRemoveAt;
    }
}
