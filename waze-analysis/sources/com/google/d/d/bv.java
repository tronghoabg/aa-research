package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bv extends fu {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f7471a;

    /* renamed from: b, reason: collision with root package name */
    Object f7472b;

    /* renamed from: c, reason: collision with root package name */
    Iterator f7473c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ca f7474d;

    bv(ca caVar) {
        Objects.requireNonNull(caVar);
        this.f7474d = caVar;
        this.f7471a = caVar.map.entrySet().listIterator();
        this.f7472b = null;
        this.f7473c = cy.f7521a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7473c.hasNext() || this.f7471a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f7473c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f7471a.next();
            this.f7472b = entry.getKey();
            this.f7473c = ((bh) entry.getValue()).listIterator();
        }
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(this.f7472b), this.f7473c.next());
    }
}
