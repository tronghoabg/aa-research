package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class cbr extends afaw {
    private final cbw a;

    public cbr(cbw cbwVar) {
        this.a = cbwVar;
    }

    @Override // defpackage.afaw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
                cbw cbwVar = this.a;
                Object obj2 = cbwVar.get(entry.getKey());
                return obj2 != null ? affa.f(obj2, entry.getValue()) : entry.getValue() == null && cbwVar.containsKey(entry.getKey());
            }
        }
        return false;
    }

    @Override // defpackage.afaw
    public final int getSize() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new cby(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
            return this.a.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
