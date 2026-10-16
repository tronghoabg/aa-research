package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import h.a.q;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends q<E> {
    public static final int $stable = 8;

    public final boolean contains(E e2) {
        if ((true != (e2 instanceof Object) ? null : e2) instanceof Map.Entry) {
            return containsEntry(e2);
        }
        return false;
    }

    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> entry);

    public final boolean remove(E e2) {
        if ((true != (e2 instanceof Object) ? null : e2) instanceof Map.Entry) {
            return removeEntry(e2);
        }
        return false;
    }

    public abstract boolean removeEntry(Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }
}
