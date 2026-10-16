package com.google.d.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class p implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f7647a;

    /* renamed from: b, reason: collision with root package name */
    final Collection f7648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f7649c;

    p(q qVar) {
        Objects.requireNonNull(qVar);
        this.f7649c = qVar;
        this.f7648b = qVar.f7651b;
        Collection collection = qVar.f7651b;
        this.f7647a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        q qVar = this.f7649c;
        qVar.b();
        if (qVar.f7651b != this.f7648b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f7647a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f7647a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7647a.remove();
        q qVar = this.f7649c;
        t tVar = qVar.f7654e;
        tVar.f7658b--;
        qVar.c();
    }

    p(q qVar, Iterator it) {
        Objects.requireNonNull(qVar);
        this.f7649c = qVar;
        this.f7648b = qVar.f7651b;
        this.f7647a = it;
    }
}
