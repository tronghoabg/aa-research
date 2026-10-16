package com.google.d.f.c;

import j$.util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f7800a;

    /* renamed from: b, reason: collision with root package name */
    private int f7801b;

    f(g gVar) {
        Objects.requireNonNull(gVar);
        this.f7800a = gVar;
        this.f7801b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7801b < this.f7800a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        g gVar = this.f7800a;
        int i2 = this.f7801b;
        if (i2 >= gVar.size()) {
            throw new NoSuchElementException();
        }
        Object obj = gVar.f7803b.f7805b[gVar.b() + i2];
        this.f7801b = i2 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
