package com.google.d.f.b;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f7784a;

    /* renamed from: b, reason: collision with root package name */
    private int f7785b;

    w(x xVar) {
        Objects.requireNonNull(xVar);
        this.f7784a = xVar;
        this.f7785b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7785b < this.f7784a.f7786a.f7794d;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        z zVar = this.f7784a.f7786a;
        int[] iArr = zVar.f7793c;
        int i2 = this.f7785b;
        this.f7785b = i2 + 1;
        return zVar.i(iArr[i2] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
