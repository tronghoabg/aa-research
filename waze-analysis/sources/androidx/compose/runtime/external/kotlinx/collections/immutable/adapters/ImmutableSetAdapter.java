package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.Spliterators;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ImmutableSetAdapter<E> extends ImmutableCollectionAdapter<E> implements ImmutableSet<E>, Set<E> {
    public static final int $stable = 8;

    public ImmutableSetAdapter(java.util.Set<? extends E> set) {
        super(set);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
