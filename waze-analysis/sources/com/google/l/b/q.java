package com.google.l.b;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f12384a;

    q(v vVar) {
        Objects.requireNonNull(vVar);
        this.f12384a = vVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12384a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f12384a.b((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new p(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        v vVar;
        u uVarB;
        if (!(obj instanceof Map.Entry) || (uVarB = (vVar = this.f12384a).b((Map.Entry) obj)) == null) {
            return false;
        }
        vVar.e(uVarB, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12384a.f12401b;
    }
}
