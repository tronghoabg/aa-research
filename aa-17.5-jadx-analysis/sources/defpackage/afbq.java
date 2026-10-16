package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* loaded from: classes.dex */
public abstract class afbq<E extends Map.Entry<? extends K, ? extends V>, K, V> extends afaw<E> {
    public abstract boolean a(Map.Entry entry);

    public /* bridge */ boolean b(Map.Entry entry) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return a(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }
}
