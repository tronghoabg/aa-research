package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class P0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final Set f27602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f27603b;

    public P0(Internal.MapAdapter mapAdapter, Set set) {
        this.f27603b = mapAdapter;
        this.f27602a = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new O0(this.f27603b, this.f27602a.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27602a.size();
    }
}
