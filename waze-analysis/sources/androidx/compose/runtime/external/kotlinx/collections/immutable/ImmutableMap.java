package androidx.compose.runtime.external.kotlinx.collections.immutable;

import h.g.b.a.a;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, a {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
