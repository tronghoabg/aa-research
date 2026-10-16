package com.google.d.d;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class aa<T> extends fu<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object f7403a;

    protected aa(Object obj) {
        this.f7403a = obj;
    }

    protected abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7403a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.f7403a;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.f7403a = a(t);
        return t;
    }
}
