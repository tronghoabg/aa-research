package com.google.d.d;

import j$.util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class ak<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    int f7415b;

    /* renamed from: c, reason: collision with root package name */
    int f7416c;

    /* renamed from: d, reason: collision with root package name */
    int f7417d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ao f7418e;

    /* synthetic */ ak(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.f7418e = aoVar;
        this.f7415b = aoVar.f7429f;
        this.f7416c = aoVar.e();
        this.f7417d = -1;
    }

    private final void b() {
        if (this.f7418e.f7429f != this.f7415b) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7416c >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f7416c;
        this.f7417d = i2;
        T t = (T) a(i2);
        this.f7416c = this.f7418e.f(this.f7416c);
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        fo.ag(this.f7417d >= 0);
        this.f7415b += 32;
        ao aoVar = this.f7418e;
        aoVar.remove(aoVar.z(this.f7417d));
        this.f7416c--;
        this.f7417d = -1;
    }
}
