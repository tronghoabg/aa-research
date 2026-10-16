package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class xzl extends xyv {
    final /* synthetic */ yan b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzl(yan yanVar) {
        super(yanVar);
        this.b = yanVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new xzk(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.b.remove(obj) != null;
    }
}
