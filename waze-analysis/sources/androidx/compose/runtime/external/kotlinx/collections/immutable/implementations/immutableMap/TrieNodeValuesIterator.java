package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TrieNodeValuesIterator<K, V> extends TrieNodeBaseIterator<K, V, V> {
    public static final int $stable = 8;

    @Override // java.util.Iterator
    public V next() {
        setIndex(getIndex() + 2);
        return (V) getBuffer()[getIndex() - 1];
    }
}
