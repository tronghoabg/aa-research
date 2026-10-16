package com.google.v.b;

import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e<E> implements Iterator<E>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f12690a;

    public e(Iterator it) {
        x.f(it, "delegate");
        this.f12690a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12690a.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        return (E) this.f12690a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
