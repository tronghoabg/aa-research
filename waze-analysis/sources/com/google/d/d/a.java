package com.google.d.d;

import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class a<T> extends fu<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object f7401a;

    /* renamed from: b, reason: collision with root package name */
    private int f7402b = 2;

    protected a() {
    }

    protected abstract Object a();

    protected final void b() {
        this.f7402b = 3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.d.b.an.u(this.f7402b != 4);
        int i2 = this.f7402b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f7402b = 4;
            this.f7401a = a();
            if (this.f7402b != 3) {
                this.f7402b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7402b = 2;
        T t = (T) this.f7401a;
        this.f7401a = null;
        return t;
    }
}
