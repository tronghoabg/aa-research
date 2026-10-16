package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
final class ykv<K, V> extends ykr<K, Collection<V>> {
    public final yks a;

    public ykv(yks yksVar) {
        this.a = yksVar;
    }

    @Override // defpackage.ykr
    public final Set b() {
        return new yku(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        yif yifVar = (yif) this.a;
        yifVar.a = null;
        yifVar.b = null;
        yifVar.c.clear();
        yifVar.d = 0;
        yifVar.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.s(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return new yhv((yif) this.a, obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.a.A();
    }

    @Override // defpackage.ykr, java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.a.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((yif) this.a).g(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.x().size();
    }
}
