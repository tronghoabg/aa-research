package com.google.d.d;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cb extends fu {

    /* renamed from: a, reason: collision with root package name */
    int f7482a;

    /* renamed from: b, reason: collision with root package name */
    Object f7483b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f7484c;

    cb(cf cfVar, Iterator it) {
        this.f7484c = it;
        Objects.requireNonNull(cfVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7482a > 0 || this.f7484c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iA = this.f7482a;
        if (iA <= 0) {
            el elVar = (el) this.f7484c.next();
            this.f7483b = elVar.b();
            iA = elVar.a();
        }
        this.f7482a = iA - 1;
        return Objects.requireNonNull(this.f7483b);
    }
}
