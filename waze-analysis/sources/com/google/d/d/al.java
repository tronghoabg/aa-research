package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f7419a;

    /* synthetic */ al(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.f7419a = aoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7419a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7419a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ao aoVar = this.f7419a;
        Map mapM = aoVar.m();
        return mapM != null ? mapM.keySet().iterator() : new ag(aoVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ao aoVar = this.f7419a;
        Map mapM = aoVar.m();
        return mapM != null ? mapM.keySet().remove(obj) : aoVar.A(obj) != ao.f7424d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7419a.size();
    }
}
