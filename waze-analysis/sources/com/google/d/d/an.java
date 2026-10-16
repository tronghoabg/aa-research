package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class an extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f7423a;

    /* synthetic */ an(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.f7423a = aoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f7423a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ao aoVar = this.f7423a;
        Map mapM = aoVar.m();
        return mapM != null ? mapM.values().iterator() : new ai(aoVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7423a.size();
    }
}
