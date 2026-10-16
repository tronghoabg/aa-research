package h.a.a;

import h.a.q;
import h.g.b.x;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o<E> extends q<E> implements Set<E>, Serializable, h.g.b.a.f {

    /* renamed from: a, reason: collision with root package name */
    private static final o f47964a = new o(i.f47946a);

    /* renamed from: b, reason: collision with root package name */
    private final i f47965b;

    public o(i iVar) {
        x.f(iVar, "backing");
        this.f47965b = iVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f47965b.l()) {
            return new m(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public final Set a() {
        this.f47965b.f();
        return size() > 0 ? this : f47964a;
    }

    @Override // h.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        return this.f47965b.c(e2) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        x.f(collection, "elements");
        this.f47965b.i();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47965b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47965b.containsKey(obj);
    }

    @Override // h.a.q
    public final int getSize() {
        return this.f47965b.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47965b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new h(this.f47965b, 1, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f47965b.n(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47965b.i();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47965b.i();
        return super.retainAll(collection);
    }

    public o() {
        this(new i());
    }
}
