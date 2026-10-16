package com.google.d.c;

import j$.util.Objects;
import java.util.AbstractSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class o extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd f7386a;

    o(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.f7386a = bdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7386a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7386a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7386a.size();
    }
}
