package com.google.d.d;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fr extends dr {

    /* renamed from: a, reason: collision with root package name */
    final Iterable f7626a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ft f7627b;

    fr(ft ftVar, Iterable iterable) {
        Objects.requireNonNull(ftVar);
        this.f7627b = ftVar;
        this.f7626a = iterable;
    }

    @Override // com.google.d.d.dr
    final Iterator a() {
        return this.f7626a.iterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof er)) {
            return null;
        }
        er erVar = (er) obj;
        fs fsVar = (fs) this.f7627b.f7628a.get(erVar.f7580a);
        if (fsVar == null || !((er) fsVar.getKey()).equals(erVar)) {
            return null;
        }
        return fsVar.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7627b.f7628a.size();
    }
}
