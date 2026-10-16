package com.google.d.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    Map.Entry f7638a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f7639b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f7640c;

    i(j jVar, Iterator it) {
        this.f7639b = it;
        Objects.requireNonNull(jVar);
        this.f7640c = jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7639b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f7639b.next();
        this.f7638a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.d.b.an.v(this.f7638a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f7638a.getValue();
        this.f7639b.remove();
        this.f7640c.f7641a.f7658b -= collection.size();
        collection.clear();
        this.f7638a = null;
    }
}
