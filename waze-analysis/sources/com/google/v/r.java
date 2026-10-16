package com.google.v;

import j$.util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f13047a;

    /* renamed from: b, reason: collision with root package name */
    private int f13048b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13049c;

    r(v vVar) {
        Objects.requireNonNull(vVar);
        this.f13047a = vVar;
        this.f13048b = 0;
        this.f13049c = vVar.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13048b < this.f13049c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i2 = this.f13048b;
        if (i2 >= this.f13049c) {
            throw new NoSuchElementException();
        }
        this.f13048b = i2 + 1;
        return Byte.valueOf(this.f13047a.a(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
