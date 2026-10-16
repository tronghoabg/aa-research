package com.google.d.c;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae extends o {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f7267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(bd bdVar) {
        super(bdVar);
        Objects.requireNonNull(bdVar);
        this.f7267b = bdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7267b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ad(this.f7267b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f7267b.remove(obj) != null;
    }
}
