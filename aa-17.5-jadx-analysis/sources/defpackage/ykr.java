package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class ykr<K, V> extends AbstractMap<K, V> {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setB = b();
        this.a = setB;
        return setB;
    }

    public Set g() {
        return new ykn(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.b;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.b = setG;
        return setG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        ykq ykqVar = new ykq(this);
        this.c = ykqVar;
        return ykqVar;
    }
}
