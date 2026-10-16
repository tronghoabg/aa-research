package com.google.d.f.c;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g<T> extends AbstractSet<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f7802a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f7803b;

    g(h hVar, int i2) {
        Objects.requireNonNull(hVar);
        this.f7803b = hVar;
        this.f7802a = i2;
    }

    final int a() {
        return this.f7803b.f7806c[this.f7802a + 1];
    }

    final int b() {
        int i2 = this.f7802a;
        if (i2 == -1) {
            return 0;
        }
        return this.f7803b.f7806c[i2];
    }

    final Object c(int i2) {
        return this.f7803b.f7805b[b() + i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f7803b.f7805b, b(), a(), obj, this.f7802a == -1 ? h.f7804a : j.f7815a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        return new f(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
