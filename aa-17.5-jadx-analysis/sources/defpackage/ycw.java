package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ycw extends AbstractCollection {
    final /* synthetic */ ycx a;

    public ycw(ycx ycxVar) {
        this.a = ycxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ycx ycxVar = this.a;
        Map mapN = ycxVar.n();
        return mapN != null ? mapN.values().iterator() : new ycr(ycxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
