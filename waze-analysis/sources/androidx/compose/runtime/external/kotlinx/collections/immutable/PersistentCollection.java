package androidx.compose.runtime.external.kotlinx.collections.immutable;

import h.g.a.l;
import h.g.b.a.b;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* compiled from: WazeSource */
    public interface Builder<E> extends Collection<E>, b {
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    PersistentCollection<E> add(E e2);

    @Override // java.util.Collection
    PersistentCollection<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    @Override // java.util.Collection
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    PersistentCollection<E> remove(E e2);

    PersistentCollection<E> removeAll(l<? super E, Boolean> lVar);

    @Override // java.util.Collection
    PersistentCollection<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.Collection
    PersistentCollection<E> retainAll(Collection<? extends E> collection);
}
