package com.google.d.d;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fh extends fl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f7622a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f7623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fh(Set set, Set set2) {
        super(null);
        this.f7622a = set;
        this.f7623b = set2;
    }

    @Override // com.google.d.d.fl
    final int a() {
        return Math.min(d(this.f7622a), d(this.f7623b));
    }

    @Override // com.google.d.d.fl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public final fu iterator() {
        return new fg(this, this.f7622a, this.f7623b);
    }

    @Override // com.google.d.d.fl
    final void c() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7622a.contains(obj) && this.f7623b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f7622a.containsAll(collection) && this.f7623b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f7623b, this.f7622a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f7622a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f7623b.contains(it.next())) {
                i2++;
            }
        }
        return i2;
    }
}
