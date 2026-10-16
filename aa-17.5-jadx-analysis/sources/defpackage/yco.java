package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class yco<F, T> extends AbstractCollection<T> {
    final Collection a;
    final xwx b;

    public yco(Collection collection, xwx xwxVar) {
        collection.getClass();
        this.a = collection;
        this.b = xwxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return yrm.ab(((yfq) this.a).listIterator(0), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((yls) this.a).c;
    }
}
