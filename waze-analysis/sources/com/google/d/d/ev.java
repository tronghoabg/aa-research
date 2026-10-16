package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ev extends ci {

    /* renamed from: a, reason: collision with root package name */
    private final transient bs f7589a;

    /* renamed from: b, reason: collision with root package name */
    private final transient bn f7590b;

    ev(bs bsVar, bn bnVar) {
        this.f7589a = bsVar;
        this.f7590b = bnVar;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7589a.get(obj) != null;
    }

    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        return this.f7590b.d(objArr, i2);
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    public final bn g() {
        return this.f7590b;
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return this.f7590b.iterator();
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7589a.size();
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
