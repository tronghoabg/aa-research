package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class yko<K, V1, V2> extends ykm<K, V2> {
    final Map a;
    final ykd b;

    public yko(Map map, ykd ykdVar) {
        this.a = map;
        this.b = ykdVar;
    }

    @Override // defpackage.ykm
    public final Iterator a() {
        Iterator it = this.a.entrySet().iterator();
        ykd ykdVar = this.b;
        ykdVar.getClass();
        return yrm.ab(it, new rgf(ykdVar, 16));
    }

    @Override // defpackage.ykm, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V2 get(Object obj) {
        Map map = this.a;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return (V2) this.b.a(obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V2 remove(Object obj) {
        Map map = this.a;
        if (map.containsKey(obj)) {
            return (V2) this.b.a(map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V2> values() {
        return new ykq(this);
    }
}
