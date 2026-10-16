package h.a;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class s<E> extends a<E> implements Set<E>, j$.util.Set<E>, h.g.b.a.a {
    public static final r Companion = new r();

    protected s() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        s<E> sVar = this;
        Set set = (Set) obj;
        h.g.b.x.f(sVar, "c");
        h.g.b.x.f(set, "other");
        if (sVar.size() != set.size()) {
            return false;
        }
        return sVar.containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        s<E> sVar = this;
        h.g.b.x.f(sVar, "c");
        Iterator<E> it = sVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // h.a.a, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
