package com.google.d.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class s extends q implements List {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t f7656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(t tVar, Object obj, List list, q qVar) {
        super(tVar, obj, list, qVar);
        Objects.requireNonNull(tVar);
        this.f7656f = tVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        b();
        boolean zIsEmpty = this.f7651b.isEmpty();
        d().add(i2, obj);
        this.f7656f.f7658b++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = d().addAll(i2, collection);
        if (zAddAll) {
            int size2 = this.f7651b.size();
            this.f7656f.f7658b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final List d() {
        return (List) this.f7651b;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        b();
        return d().get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new r(this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        b();
        Object objRemove = d().remove(i2);
        t tVar = this.f7656f;
        tVar.f7658b--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        b();
        return d().set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        b();
        List listSubList = d().subList(i2, i3);
        q qVar = this.f7652c;
        if (qVar == null) {
            qVar = this;
        }
        return this.f7656f.n(this.f7650a, listSubList, qVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        b();
        return new r(this, i2);
    }
}
