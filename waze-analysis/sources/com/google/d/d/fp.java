package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class fp<F, T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    final Iterator f7625b;

    fp(Iterator it) {
        com.google.d.b.an.B(it);
        this.f7625b = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7625b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) a(this.f7625b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7625b.remove();
    }
}
