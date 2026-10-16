package com.google.d.d;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class db<T> extends fu<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7529a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7530b;

    db(Object obj) {
        this.f7529a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7530b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.f7530b) {
            throw new NoSuchElementException();
        }
        this.f7530b = true;
        return (T) this.f7529a;
    }
}
