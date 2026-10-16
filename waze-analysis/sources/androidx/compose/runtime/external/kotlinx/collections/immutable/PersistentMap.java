package androidx.compose.runtime.external.kotlinx.collections.immutable;

import h.g.b.a.e;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* compiled from: WazeSource */
    public interface Builder<K, V> extends Map<K, V>, e {
        PersistentMap<K, V> build();
    }

    Builder<K, V> builder();

    @Override // java.util.Map
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    PersistentMap<K, V> put(K k2, V v);

    @Override // java.util.Map
    PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k2);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k2, V v);
}
