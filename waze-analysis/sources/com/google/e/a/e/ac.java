package com.google.e.a.e;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac<P> implements Iterator<P> {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f8411a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f8412b;

    /* synthetic */ ac(Iterator it, Iterator it2) {
        this.f8411a = it;
        this.f8412b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8411a.hasNext() || this.f8412b.hasNext();
    }

    @Override // java.util.Iterator
    public final P next() {
        Iterator it = this.f8411a;
        return it.hasNext() ? (P) it.next() : (P) this.f8412b.next();
    }
}
