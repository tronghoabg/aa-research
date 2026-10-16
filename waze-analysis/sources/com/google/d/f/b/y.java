package com.google.d.f.b;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class y<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f7787a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.d.f.aa f7788b;

    /* renamed from: c, reason: collision with root package name */
    private int f7789c;

    /* renamed from: d, reason: collision with root package name */
    private int f7790d;

    /* synthetic */ y(z zVar, com.google.d.f.aa aaVar, int i2) {
        Objects.requireNonNull(zVar);
        this.f7787a = zVar;
        this.f7788b = aaVar;
        int i3 = i2 & 31;
        this.f7789c = i3;
        this.f7790d = i2 >>> (i3 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7789c >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.f7788b.e(this.f7787a.j(this.f7789c));
        int i2 = this.f7790d;
        if (i2 == 0) {
            this.f7789c = -1;
            return t;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.f7790d >>>= iNumberOfTrailingZeros;
        this.f7789c += iNumberOfTrailingZeros;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
