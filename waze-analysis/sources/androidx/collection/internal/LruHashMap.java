package androidx.collection.internal;

import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LruHashMap<K, V> {
    private final LinkedHashMap<K, V> map;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(LruHashMap<? extends K, V> lruHashMap) {
        this(0, 0.0f, 3, null);
        x.f(lruHashMap, "original");
        for (Map.Entry<? extends K, V> entry : lruHashMap.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final V get(K k2) {
        x.f(k2, "key");
        return this.map.get(k2);
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> setEntrySet = this.map.entrySet();
        x.e(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final V put(K k2, V v) {
        x.f(k2, "key");
        x.f(v, "value");
        return this.map.put(k2, v);
    }

    public final V remove(K k2) {
        x.f(k2, "key");
        return this.map.remove(k2);
    }

    public LruHashMap(int i2, float f2) {
        this.map = new LinkedHashMap<>(i2, f2, true);
    }

    public /* synthetic */ LruHashMap(int i2, float f2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 16 : i2, (i3 & 2) != 0 ? 0.75f : f2);
    }

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }
}
