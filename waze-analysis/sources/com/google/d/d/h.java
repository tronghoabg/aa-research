package com.google.d.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class h<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f7633a;

    /* renamed from: b, reason: collision with root package name */
    Object f7634b;

    /* renamed from: c, reason: collision with root package name */
    Collection f7635c;

    /* renamed from: d, reason: collision with root package name */
    Iterator f7636d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f7637e;

    h(t tVar) {
        Objects.requireNonNull(tVar);
        this.f7637e = tVar;
        this.f7633a = tVar.f7657a.entrySet().iterator();
        this.f7634b = null;
        this.f7635c = null;
        this.f7636d = da.f7527a;
    }

    abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7633a.hasNext() || this.f7636d.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f7636d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f7633a.next();
            this.f7634b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f7635c = collection;
            this.f7636d = collection.iterator();
        }
        return (T) a(this.f7634b, this.f7636d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7636d.remove();
        if (((Collection) Objects.requireNonNull(this.f7635c)).isEmpty()) {
            this.f7633a.remove();
        }
        t tVar = this.f7637e;
        tVar.f7658b--;
    }
}
