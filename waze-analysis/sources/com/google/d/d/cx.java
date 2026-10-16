package com.google.d.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cx implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f7518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f7519b;

    /* renamed from: c, reason: collision with root package name */
    private int f7520c;

    cx(int i2, Iterator it) {
        this.f7518a = i2;
        this.f7519b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7520c < this.f7518a && this.f7519b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7520c++;
        return this.f7519b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7519b.remove();
    }
}
