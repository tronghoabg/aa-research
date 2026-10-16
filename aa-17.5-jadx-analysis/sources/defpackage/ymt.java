package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class ymt<K, V> extends ynb<K, Collection<V>> {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;

    @Override // defpackage.ynb, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.ynb, java.util.Map
    public final Set<Map.Entry<K, Collection<V>>> entrySet() {
        Set<Map.Entry<K, Collection<V>>> set;
        Object obj = this.g;
        synchronized (obj) {
            if (this.a == null) {
                this.a = new ymw(a().entrySet(), obj);
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.ynb, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collectionK;
        Object obj2 = this.g;
        synchronized (obj2) {
            Collection collection = (Collection) super.get(obj);
            collectionK = collection == null ? null : yrm.k(collection, obj2);
        }
        return collectionK;
    }

    @Override // defpackage.ynb, java.util.Map
    public final Collection<Collection<V>> values() {
        Collection<Collection<V>> collection;
        Object obj = this.g;
        synchronized (obj) {
            if (this.b == null) {
                this.b = new ymy(a().values(), obj);
            }
            collection = this.b;
        }
        return collection;
    }
}
