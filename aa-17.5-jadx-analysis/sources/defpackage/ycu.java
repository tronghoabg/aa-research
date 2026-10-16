package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class ycu extends AbstractSet {
    final /* synthetic */ ycx a;

    public ycu(ycx ycxVar) {
        this.a = ycxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ycx ycxVar = this.a;
        Map mapN = ycxVar.n();
        return mapN != null ? mapN.keySet().iterator() : new ycp(ycxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ycx ycxVar = this.a;
        Map mapN = ycxVar.n();
        return mapN != null ? mapN.keySet().remove(obj) : ycxVar.h(obj) != ycx.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
