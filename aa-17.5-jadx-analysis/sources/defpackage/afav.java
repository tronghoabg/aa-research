package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class afav<K, V> extends AbstractMap<K, V> implements Map<K, V>, afgg {
    protected afav() {
    }

    public /* bridge */ int a() {
        throw null;
    }

    public /* bridge */ Collection c() {
        throw null;
    }

    public abstract Set d();

    public /* bridge */ Set e() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return c();
    }
}
