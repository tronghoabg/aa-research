package com.google.d.d;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bw extends fu {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f7475a;

    /* renamed from: b, reason: collision with root package name */
    Iterator f7476b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ca f7477c;

    bw(ca caVar) {
        Objects.requireNonNull(caVar);
        this.f7477c = caVar;
        this.f7475a = caVar.map.values().listIterator();
        this.f7476b = cy.f7521a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7476b.hasNext() || this.f7475a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f7476b.hasNext()) {
            this.f7476b = ((bh) this.f7475a.next()).listIterator();
        }
        return this.f7476b.next();
    }
}
