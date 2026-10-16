package com.google.v.b;

import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f12692a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Iterator f12693b;

    g(Iterator it) {
        this.f12692a = it;
        this.f12693b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12693b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new i((Map.Entry) this.f12692a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
