package h.a.a;

import h.a.q;
import h.g.b.x;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends q<E> {
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
        x.f(entry, "element");
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
