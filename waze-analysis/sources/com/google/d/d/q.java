package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class q extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f7650a;

    /* renamed from: b, reason: collision with root package name */
    Collection f7651b;

    /* renamed from: c, reason: collision with root package name */
    final q f7652c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f7653d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f7654e;

    q(t tVar, Object obj, Collection collection, q qVar) {
        Objects.requireNonNull(tVar);
        this.f7654e = tVar;
        this.f7650a = obj;
        this.f7651b = collection;
        this.f7652c = qVar;
        this.f7653d = qVar == null ? null : qVar.f7651b;
    }

    final void a() {
        q qVar = this.f7652c;
        if (qVar != null) {
            qVar.a();
            return;
        }
        t tVar = this.f7654e;
        tVar.f7657a.put(this.f7650a, this.f7651b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f7651b.isEmpty();
        boolean zAdd = this.f7651b.add(obj);
        if (zAdd) {
            this.f7654e.f7658b++;
            if (zIsEmpty) {
                a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f7651b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f7651b.size();
            this.f7654e.f7658b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final void b() {
        q qVar = this.f7652c;
        if (qVar != null) {
            qVar.b();
            if (qVar.f7651b != this.f7653d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f7651b.isEmpty()) {
            t tVar = this.f7654e;
            Collection collection = (Collection) tVar.f7657a.get(this.f7650a);
            if (collection != null) {
                this.f7651b = collection;
            }
        }
    }

    final void c() {
        q qVar = this.f7652c;
        if (qVar != null) {
            qVar.c();
        } else if (this.f7651b.isEmpty()) {
            t tVar = this.f7654e;
            tVar.f7657a.remove(this.f7650a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f7651b.clear();
        this.f7654e.f7658b -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.f7651b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        b();
        return this.f7651b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f7651b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f7651b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new p(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f7651b.remove(obj);
        if (zRemove) {
            t tVar = this.f7654e;
            tVar.f7658b--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f7651b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f7651b.size();
            this.f7654e.f7658b += size2 - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        com.google.d.b.an.B(collection);
        int size = size();
        boolean zRetainAll = this.f7651b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f7651b.size();
            this.f7654e.f7658b += size2 - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f7651b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f7651b.toString();
    }
}
