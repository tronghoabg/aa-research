package com.google.d.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f7601a;

    /* renamed from: b, reason: collision with root package name */
    Collection f7602b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f7603c;

    f(g gVar) {
        Objects.requireNonNull(gVar);
        this.f7603c = gVar;
        this.f7601a = gVar.f7631a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7601a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f7601a.next();
        this.f7602b = (Collection) entry.getValue();
        return this.f7603c.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.d.b.an.v(this.f7602b != null, "no calls to next() since the last call to remove()");
        this.f7601a.remove();
        this.f7603c.f7632b.f7658b -= this.f7602b.size();
        this.f7602b.clear();
        this.f7602b = null;
    }
}
